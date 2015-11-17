/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.oep.ssomgt.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.CalendarUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.oep.ssomgt.NoSuchUserSyncException;
import org.oep.ssomgt.model.UserSync;
import org.oep.ssomgt.model.impl.UserSyncImpl;
import org.oep.ssomgt.model.impl.UserSyncModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the user sync service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see UserSyncPersistence
 * @see UserSyncUtil
 * @generated
 */
public class UserSyncPersistenceImpl extends BasePersistenceImpl<UserSync>
	implements UserSyncPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UserSyncUtil} to access the user sync persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UserSyncImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UserSyncModelImpl.ENTITY_CACHE_ENABLED,
			UserSyncModelImpl.FINDER_CACHE_ENABLED, UserSyncImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UserSyncModelImpl.ENTITY_CACHE_ENABLED,
			UserSyncModelImpl.FINDER_CACHE_ENABLED, UserSyncImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UserSyncModelImpl.ENTITY_CACHE_ENABLED,
			UserSyncModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_A_GTCP = new FinderPath(UserSyncModelImpl.ENTITY_CACHE_ENABLED,
			UserSyncModelImpl.FINDER_CACHE_ENABLED, UserSyncImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByA_GtCP",
			new String[] {
				Long.class.getName(), Date.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_A_GTCP = new FinderPath(UserSyncModelImpl.ENTITY_CACHE_ENABLED,
			UserSyncModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByA_GtCP",
			new String[] { Long.class.getName(), Date.class.getName() });

	/**
	 * Returns all the user syncs where applicationId = &#63; and checkpoint &gt; &#63;.
	 *
	 * @param applicationId the application ID
	 * @param checkpoint the checkpoint
	 * @return the matching user syncs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserSync> findByA_GtCP(long applicationId, Date checkpoint)
		throws SystemException {
		return findByA_GtCP(applicationId, checkpoint, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user syncs where applicationId = &#63; and checkpoint &gt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.UserSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicationId the application ID
	 * @param checkpoint the checkpoint
	 * @param start the lower bound of the range of user syncs
	 * @param end the upper bound of the range of user syncs (not inclusive)
	 * @return the range of matching user syncs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserSync> findByA_GtCP(long applicationId, Date checkpoint,
		int start, int end) throws SystemException {
		return findByA_GtCP(applicationId, checkpoint, start, end, null);
	}

	/**
	 * Returns an ordered range of all the user syncs where applicationId = &#63; and checkpoint &gt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.UserSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicationId the application ID
	 * @param checkpoint the checkpoint
	 * @param start the lower bound of the range of user syncs
	 * @param end the upper bound of the range of user syncs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user syncs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserSync> findByA_GtCP(long applicationId, Date checkpoint,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_A_GTCP;
		finderArgs = new Object[] {
				applicationId, checkpoint,
				
				start, end, orderByComparator
			};

		List<UserSync> list = (List<UserSync>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (UserSync userSync : list) {
				if ((applicationId != userSync.getApplicationId()) ||
						(checkpoint.getTime() >= userSync.getCheckpoint()
															 .getTime())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_USERSYNC_WHERE);

			query.append(_FINDER_COLUMN_A_GTCP_APPLICATIONID_2);

			boolean bindCheckpoint = false;

			if (checkpoint == null) {
				query.append(_FINDER_COLUMN_A_GTCP_CHECKPOINT_1);
			}
			else {
				bindCheckpoint = true;

				query.append(_FINDER_COLUMN_A_GTCP_CHECKPOINT_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(UserSyncModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(applicationId);

				if (bindCheckpoint) {
					qPos.add(CalendarUtil.getTimestamp(checkpoint));
				}

				if (!pagination) {
					list = (List<UserSync>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserSync>(list);
				}
				else {
					list = (List<UserSync>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first user sync in the ordered set where applicationId = &#63; and checkpoint &gt; &#63;.
	 *
	 * @param applicationId the application ID
	 * @param checkpoint the checkpoint
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user sync
	 * @throws org.oep.ssomgt.NoSuchUserSyncException if a matching user sync could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserSync findByA_GtCP_First(long applicationId, Date checkpoint,
		OrderByComparator orderByComparator)
		throws NoSuchUserSyncException, SystemException {
		UserSync userSync = fetchByA_GtCP_First(applicationId, checkpoint,
				orderByComparator);

		if (userSync != null) {
			return userSync;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("applicationId=");
		msg.append(applicationId);

		msg.append(", checkpoint=");
		msg.append(checkpoint);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserSyncException(msg.toString());
	}

	/**
	 * Returns the first user sync in the ordered set where applicationId = &#63; and checkpoint &gt; &#63;.
	 *
	 * @param applicationId the application ID
	 * @param checkpoint the checkpoint
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user sync, or <code>null</code> if a matching user sync could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserSync fetchByA_GtCP_First(long applicationId, Date checkpoint,
		OrderByComparator orderByComparator) throws SystemException {
		List<UserSync> list = findByA_GtCP(applicationId, checkpoint, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last user sync in the ordered set where applicationId = &#63; and checkpoint &gt; &#63;.
	 *
	 * @param applicationId the application ID
	 * @param checkpoint the checkpoint
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user sync
	 * @throws org.oep.ssomgt.NoSuchUserSyncException if a matching user sync could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserSync findByA_GtCP_Last(long applicationId, Date checkpoint,
		OrderByComparator orderByComparator)
		throws NoSuchUserSyncException, SystemException {
		UserSync userSync = fetchByA_GtCP_Last(applicationId, checkpoint,
				orderByComparator);

		if (userSync != null) {
			return userSync;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("applicationId=");
		msg.append(applicationId);

		msg.append(", checkpoint=");
		msg.append(checkpoint);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserSyncException(msg.toString());
	}

	/**
	 * Returns the last user sync in the ordered set where applicationId = &#63; and checkpoint &gt; &#63;.
	 *
	 * @param applicationId the application ID
	 * @param checkpoint the checkpoint
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user sync, or <code>null</code> if a matching user sync could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserSync fetchByA_GtCP_Last(long applicationId, Date checkpoint,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByA_GtCP(applicationId, checkpoint);

		if (count == 0) {
			return null;
		}

		List<UserSync> list = findByA_GtCP(applicationId, checkpoint,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the user syncs before and after the current user sync in the ordered set where applicationId = &#63; and checkpoint &gt; &#63;.
	 *
	 * @param userSyncId the primary key of the current user sync
	 * @param applicationId the application ID
	 * @param checkpoint the checkpoint
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user sync
	 * @throws org.oep.ssomgt.NoSuchUserSyncException if a user sync with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserSync[] findByA_GtCP_PrevAndNext(long userSyncId,
		long applicationId, Date checkpoint, OrderByComparator orderByComparator)
		throws NoSuchUserSyncException, SystemException {
		UserSync userSync = findByPrimaryKey(userSyncId);

		Session session = null;

		try {
			session = openSession();

			UserSync[] array = new UserSyncImpl[3];

			array[0] = getByA_GtCP_PrevAndNext(session, userSync,
					applicationId, checkpoint, orderByComparator, true);

			array[1] = userSync;

			array[2] = getByA_GtCP_PrevAndNext(session, userSync,
					applicationId, checkpoint, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected UserSync getByA_GtCP_PrevAndNext(Session session,
		UserSync userSync, long applicationId, Date checkpoint,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_USERSYNC_WHERE);

		query.append(_FINDER_COLUMN_A_GTCP_APPLICATIONID_2);

		boolean bindCheckpoint = false;

		if (checkpoint == null) {
			query.append(_FINDER_COLUMN_A_GTCP_CHECKPOINT_1);
		}
		else {
			bindCheckpoint = true;

			query.append(_FINDER_COLUMN_A_GTCP_CHECKPOINT_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(UserSyncModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(applicationId);

		if (bindCheckpoint) {
			qPos.add(CalendarUtil.getTimestamp(checkpoint));
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(userSync);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UserSync> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the user syncs where applicationId = &#63; and checkpoint &gt; &#63; from the database.
	 *
	 * @param applicationId the application ID
	 * @param checkpoint the checkpoint
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByA_GtCP(long applicationId, Date checkpoint)
		throws SystemException {
		for (UserSync userSync : findByA_GtCP(applicationId, checkpoint,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(userSync);
		}
	}

	/**
	 * Returns the number of user syncs where applicationId = &#63; and checkpoint &gt; &#63;.
	 *
	 * @param applicationId the application ID
	 * @param checkpoint the checkpoint
	 * @return the number of matching user syncs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByA_GtCP(long applicationId, Date checkpoint)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_A_GTCP;

		Object[] finderArgs = new Object[] { applicationId, checkpoint };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_USERSYNC_WHERE);

			query.append(_FINDER_COLUMN_A_GTCP_APPLICATIONID_2);

			boolean bindCheckpoint = false;

			if (checkpoint == null) {
				query.append(_FINDER_COLUMN_A_GTCP_CHECKPOINT_1);
			}
			else {
				bindCheckpoint = true;

				query.append(_FINDER_COLUMN_A_GTCP_CHECKPOINT_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(applicationId);

				if (bindCheckpoint) {
					qPos.add(CalendarUtil.getTimestamp(checkpoint));
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_A_GTCP_APPLICATIONID_2 = "userSync.applicationId = ? AND ";
	private static final String _FINDER_COLUMN_A_GTCP_CHECKPOINT_1 = "userSync.checkpoint > NULL";
	private static final String _FINDER_COLUMN_A_GTCP_CHECKPOINT_2 = "userSync.checkpoint > ?";

	public UserSyncPersistenceImpl() {
		setModelClass(UserSync.class);
	}

	/**
	 * Caches the user sync in the entity cache if it is enabled.
	 *
	 * @param userSync the user sync
	 */
	@Override
	public void cacheResult(UserSync userSync) {
		EntityCacheUtil.putResult(UserSyncModelImpl.ENTITY_CACHE_ENABLED,
			UserSyncImpl.class, userSync.getPrimaryKey(), userSync);

		userSync.resetOriginalValues();
	}

	/**
	 * Caches the user syncs in the entity cache if it is enabled.
	 *
	 * @param userSyncs the user syncs
	 */
	@Override
	public void cacheResult(List<UserSync> userSyncs) {
		for (UserSync userSync : userSyncs) {
			if (EntityCacheUtil.getResult(
						UserSyncModelImpl.ENTITY_CACHE_ENABLED,
						UserSyncImpl.class, userSync.getPrimaryKey()) == null) {
				cacheResult(userSync);
			}
			else {
				userSync.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all user syncs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(UserSyncImpl.class.getName());
		}

		EntityCacheUtil.clearCache(UserSyncImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the user sync.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UserSync userSync) {
		EntityCacheUtil.removeResult(UserSyncModelImpl.ENTITY_CACHE_ENABLED,
			UserSyncImpl.class, userSync.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<UserSync> userSyncs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UserSync userSync : userSyncs) {
			EntityCacheUtil.removeResult(UserSyncModelImpl.ENTITY_CACHE_ENABLED,
				UserSyncImpl.class, userSync.getPrimaryKey());
		}
	}

	/**
	 * Creates a new user sync with the primary key. Does not add the user sync to the database.
	 *
	 * @param userSyncId the primary key for the new user sync
	 * @return the new user sync
	 */
	@Override
	public UserSync create(long userSyncId) {
		UserSync userSync = new UserSyncImpl();

		userSync.setNew(true);
		userSync.setPrimaryKey(userSyncId);

		return userSync;
	}

	/**
	 * Removes the user sync with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userSyncId the primary key of the user sync
	 * @return the user sync that was removed
	 * @throws org.oep.ssomgt.NoSuchUserSyncException if a user sync with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserSync remove(long userSyncId)
		throws NoSuchUserSyncException, SystemException {
		return remove((Serializable)userSyncId);
	}

	/**
	 * Removes the user sync with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the user sync
	 * @return the user sync that was removed
	 * @throws org.oep.ssomgt.NoSuchUserSyncException if a user sync with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserSync remove(Serializable primaryKey)
		throws NoSuchUserSyncException, SystemException {
		Session session = null;

		try {
			session = openSession();

			UserSync userSync = (UserSync)session.get(UserSyncImpl.class,
					primaryKey);

			if (userSync == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUserSyncException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(userSync);
		}
		catch (NoSuchUserSyncException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected UserSync removeImpl(UserSync userSync) throws SystemException {
		userSync = toUnwrappedModel(userSync);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(userSync)) {
				userSync = (UserSync)session.get(UserSyncImpl.class,
						userSync.getPrimaryKeyObj());
			}

			if (userSync != null) {
				session.delete(userSync);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (userSync != null) {
			clearCache(userSync);
		}

		return userSync;
	}

	@Override
	public UserSync updateImpl(org.oep.ssomgt.model.UserSync userSync)
		throws SystemException {
		userSync = toUnwrappedModel(userSync);

		boolean isNew = userSync.isNew();

		Session session = null;

		try {
			session = openSession();

			if (userSync.isNew()) {
				session.save(userSync);

				userSync.setNew(false);
			}
			else {
				session.merge(userSync);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !UserSyncModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(UserSyncModelImpl.ENTITY_CACHE_ENABLED,
			UserSyncImpl.class, userSync.getPrimaryKey(), userSync);

		return userSync;
	}

	protected UserSync toUnwrappedModel(UserSync userSync) {
		if (userSync instanceof UserSyncImpl) {
			return userSync;
		}

		UserSyncImpl userSyncImpl = new UserSyncImpl();

		userSyncImpl.setNew(userSync.isNew());
		userSyncImpl.setPrimaryKey(userSync.getPrimaryKey());

		userSyncImpl.setUserSyncId(userSync.getUserSyncId());
		userSyncImpl.setApplicationId(userSync.getApplicationId());
		userSyncImpl.setEmployeeId(userSync.getEmployeeId());
		userSyncImpl.setUserId(userSync.getUserId());
		userSyncImpl.setSsoUserName(userSync.getSsoUserName());
		userSyncImpl.setAppUserName(userSync.getAppUserName());
		userSyncImpl.setFullName(userSync.getFullName());
		userSyncImpl.setEmail(userSync.getEmail());
		userSyncImpl.setPassword(userSync.getPassword());
		userSyncImpl.setAccessibleStatus(userSync.getAccessibleStatus());
		userSyncImpl.setRoles(userSync.getRoles());
		userSyncImpl.setCheckpoint(userSync.getCheckpoint());
		userSyncImpl.setSyncTime(userSync.getSyncTime());

		return userSyncImpl;
	}

	/**
	 * Returns the user sync with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the user sync
	 * @return the user sync
	 * @throws org.oep.ssomgt.NoSuchUserSyncException if a user sync with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserSync findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUserSyncException, SystemException {
		UserSync userSync = fetchByPrimaryKey(primaryKey);

		if (userSync == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUserSyncException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return userSync;
	}

	/**
	 * Returns the user sync with the primary key or throws a {@link org.oep.ssomgt.NoSuchUserSyncException} if it could not be found.
	 *
	 * @param userSyncId the primary key of the user sync
	 * @return the user sync
	 * @throws org.oep.ssomgt.NoSuchUserSyncException if a user sync with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserSync findByPrimaryKey(long userSyncId)
		throws NoSuchUserSyncException, SystemException {
		return findByPrimaryKey((Serializable)userSyncId);
	}

	/**
	 * Returns the user sync with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the user sync
	 * @return the user sync, or <code>null</code> if a user sync with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserSync fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		UserSync userSync = (UserSync)EntityCacheUtil.getResult(UserSyncModelImpl.ENTITY_CACHE_ENABLED,
				UserSyncImpl.class, primaryKey);

		if (userSync == _nullUserSync) {
			return null;
		}

		if (userSync == null) {
			Session session = null;

			try {
				session = openSession();

				userSync = (UserSync)session.get(UserSyncImpl.class, primaryKey);

				if (userSync != null) {
					cacheResult(userSync);
				}
				else {
					EntityCacheUtil.putResult(UserSyncModelImpl.ENTITY_CACHE_ENABLED,
						UserSyncImpl.class, primaryKey, _nullUserSync);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(UserSyncModelImpl.ENTITY_CACHE_ENABLED,
					UserSyncImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return userSync;
	}

	/**
	 * Returns the user sync with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userSyncId the primary key of the user sync
	 * @return the user sync, or <code>null</code> if a user sync with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserSync fetchByPrimaryKey(long userSyncId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)userSyncId);
	}

	/**
	 * Returns all the user syncs.
	 *
	 * @return the user syncs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserSync> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user syncs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.UserSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user syncs
	 * @param end the upper bound of the range of user syncs (not inclusive)
	 * @return the range of user syncs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserSync> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the user syncs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.UserSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user syncs
	 * @param end the upper bound of the range of user syncs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of user syncs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserSync> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<UserSync> list = (List<UserSync>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_USERSYNC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USERSYNC;

				if (pagination) {
					sql = sql.concat(UserSyncModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<UserSync>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserSync>(list);
				}
				else {
					list = (List<UserSync>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the user syncs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (UserSync userSync : findAll()) {
			remove(userSync);
		}
	}

	/**
	 * Returns the number of user syncs.
	 *
	 * @return the number of user syncs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_USERSYNC);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the user sync persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.ssomgt.model.UserSync")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<UserSync>> listenersList = new ArrayList<ModelListener<UserSync>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<UserSync>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(UserSyncImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_USERSYNC = "SELECT userSync FROM UserSync userSync";
	private static final String _SQL_SELECT_USERSYNC_WHERE = "SELECT userSync FROM UserSync userSync WHERE ";
	private static final String _SQL_COUNT_USERSYNC = "SELECT COUNT(userSync) FROM UserSync userSync";
	private static final String _SQL_COUNT_USERSYNC_WHERE = "SELECT COUNT(userSync) FROM UserSync userSync WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "userSync.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UserSync exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No UserSync exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(UserSyncPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"password"
			});
	private static UserSync _nullUserSync = new UserSyncImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<UserSync> toCacheModel() {
				return _nullUserSyncCacheModel;
			}
		};

	private static CacheModel<UserSync> _nullUserSyncCacheModel = new CacheModel<UserSync>() {
			@Override
			public UserSync toEntityModel() {
				return _nullUserSync;
			}
		};
}