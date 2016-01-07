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
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.oep.ssomgt.NoSuchAppMessageException;
import org.oep.ssomgt.model.AppMessage;
import org.oep.ssomgt.model.impl.AppMessageImpl;
import org.oep.ssomgt.model.impl.AppMessageModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the app message service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see AppMessagePersistence
 * @see AppMessageUtil
 * @generated
 */
public class AppMessagePersistenceImpl extends BasePersistenceImpl<AppMessage>
	implements AppMessagePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AppMessageUtil} to access the app message persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AppMessageImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AppMessageModelImpl.ENTITY_CACHE_ENABLED,
			AppMessageModelImpl.FINDER_CACHE_ENABLED, AppMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AppMessageModelImpl.ENTITY_CACHE_ENABLED,
			AppMessageModelImpl.FINDER_CACHE_ENABLED, AppMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AppMessageModelImpl.ENTITY_CACHE_ENABLED,
			AppMessageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TU = new FinderPath(AppMessageModelImpl.ENTITY_CACHE_ENABLED,
			AppMessageModelImpl.FINDER_CACHE_ENABLED, AppMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTU",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TU = new FinderPath(AppMessageModelImpl.ENTITY_CACHE_ENABLED,
			AppMessageModelImpl.FINDER_CACHE_ENABLED, AppMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTU",
			new String[] { String.class.getName() },
			AppMessageModelImpl.TOUSER_COLUMN_BITMASK |
			AppMessageModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TU = new FinderPath(AppMessageModelImpl.ENTITY_CACHE_ENABLED,
			AppMessageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTU",
			new String[] { String.class.getName() });

	/**
	 * Returns all the app messages where toUser = &#63;.
	 *
	 * @param toUser the to user
	 * @return the matching app messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppMessage> findByTU(String toUser) throws SystemException {
		return findByTU(toUser, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the app messages where toUser = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param toUser the to user
	 * @param start the lower bound of the range of app messages
	 * @param end the upper bound of the range of app messages (not inclusive)
	 * @return the range of matching app messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppMessage> findByTU(String toUser, int start, int end)
		throws SystemException {
		return findByTU(toUser, start, end, null);
	}

	/**
	 * Returns an ordered range of all the app messages where toUser = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param toUser the to user
	 * @param start the lower bound of the range of app messages
	 * @param end the upper bound of the range of app messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching app messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppMessage> findByTU(String toUser, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TU;
			finderArgs = new Object[] { toUser };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TU;
			finderArgs = new Object[] { toUser, start, end, orderByComparator };
		}

		List<AppMessage> list = (List<AppMessage>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AppMessage appMessage : list) {
				if (!Validator.equals(toUser, appMessage.getToUser())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_APPMESSAGE_WHERE);

			boolean bindToUser = false;

			if (toUser == null) {
				query.append(_FINDER_COLUMN_TU_TOUSER_1);
			}
			else if (toUser.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TU_TOUSER_3);
			}
			else {
				bindToUser = true;

				query.append(_FINDER_COLUMN_TU_TOUSER_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AppMessageModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindToUser) {
					qPos.add(toUser);
				}

				if (!pagination) {
					list = (List<AppMessage>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AppMessage>(list);
				}
				else {
					list = (List<AppMessage>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first app message in the ordered set where toUser = &#63;.
	 *
	 * @param toUser the to user
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app message
	 * @throws org.oep.ssomgt.NoSuchAppMessageException if a matching app message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppMessage findByTU_First(String toUser,
		OrderByComparator orderByComparator)
		throws NoSuchAppMessageException, SystemException {
		AppMessage appMessage = fetchByTU_First(toUser, orderByComparator);

		if (appMessage != null) {
			return appMessage;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("toUser=");
		msg.append(toUser);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAppMessageException(msg.toString());
	}

	/**
	 * Returns the first app message in the ordered set where toUser = &#63;.
	 *
	 * @param toUser the to user
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app message, or <code>null</code> if a matching app message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppMessage fetchByTU_First(String toUser,
		OrderByComparator orderByComparator) throws SystemException {
		List<AppMessage> list = findByTU(toUser, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last app message in the ordered set where toUser = &#63;.
	 *
	 * @param toUser the to user
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app message
	 * @throws org.oep.ssomgt.NoSuchAppMessageException if a matching app message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppMessage findByTU_Last(String toUser,
		OrderByComparator orderByComparator)
		throws NoSuchAppMessageException, SystemException {
		AppMessage appMessage = fetchByTU_Last(toUser, orderByComparator);

		if (appMessage != null) {
			return appMessage;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("toUser=");
		msg.append(toUser);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAppMessageException(msg.toString());
	}

	/**
	 * Returns the last app message in the ordered set where toUser = &#63;.
	 *
	 * @param toUser the to user
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app message, or <code>null</code> if a matching app message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppMessage fetchByTU_Last(String toUser,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTU(toUser);

		if (count == 0) {
			return null;
		}

		List<AppMessage> list = findByTU(toUser, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the app messages before and after the current app message in the ordered set where toUser = &#63;.
	 *
	 * @param appMessageId the primary key of the current app message
	 * @param toUser the to user
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next app message
	 * @throws org.oep.ssomgt.NoSuchAppMessageException if a app message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppMessage[] findByTU_PrevAndNext(long appMessageId, String toUser,
		OrderByComparator orderByComparator)
		throws NoSuchAppMessageException, SystemException {
		AppMessage appMessage = findByPrimaryKey(appMessageId);

		Session session = null;

		try {
			session = openSession();

			AppMessage[] array = new AppMessageImpl[3];

			array[0] = getByTU_PrevAndNext(session, appMessage, toUser,
					orderByComparator, true);

			array[1] = appMessage;

			array[2] = getByTU_PrevAndNext(session, appMessage, toUser,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AppMessage getByTU_PrevAndNext(Session session,
		AppMessage appMessage, String toUser,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_APPMESSAGE_WHERE);

		boolean bindToUser = false;

		if (toUser == null) {
			query.append(_FINDER_COLUMN_TU_TOUSER_1);
		}
		else if (toUser.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TU_TOUSER_3);
		}
		else {
			bindToUser = true;

			query.append(_FINDER_COLUMN_TU_TOUSER_2);
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
			query.append(AppMessageModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindToUser) {
			qPos.add(toUser);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(appMessage);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AppMessage> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the app messages where toUser = &#63; from the database.
	 *
	 * @param toUser the to user
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTU(String toUser) throws SystemException {
		for (AppMessage appMessage : findByTU(toUser, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(appMessage);
		}
	}

	/**
	 * Returns the number of app messages where toUser = &#63;.
	 *
	 * @param toUser the to user
	 * @return the number of matching app messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTU(String toUser) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TU;

		Object[] finderArgs = new Object[] { toUser };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_APPMESSAGE_WHERE);

			boolean bindToUser = false;

			if (toUser == null) {
				query.append(_FINDER_COLUMN_TU_TOUSER_1);
			}
			else if (toUser.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TU_TOUSER_3);
			}
			else {
				bindToUser = true;

				query.append(_FINDER_COLUMN_TU_TOUSER_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindToUser) {
					qPos.add(toUser);
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

	private static final String _FINDER_COLUMN_TU_TOUSER_1 = "appMessage.toUser IS NULL";
	private static final String _FINDER_COLUMN_TU_TOUSER_2 = "appMessage.toUser = ?";
	private static final String _FINDER_COLUMN_TU_TOUSER_3 = "(appMessage.toUser IS NULL OR appMessage.toUser = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FA_TU = new FinderPath(AppMessageModelImpl.ENTITY_CACHE_ENABLED,
			AppMessageModelImpl.FINDER_CACHE_ENABLED, AppMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByFA_TU",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FA_TU = new FinderPath(AppMessageModelImpl.ENTITY_CACHE_ENABLED,
			AppMessageModelImpl.FINDER_CACHE_ENABLED, AppMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByFA_TU",
			new String[] { String.class.getName(), String.class.getName() },
			AppMessageModelImpl.FROMAPPLICATION_COLUMN_BITMASK |
			AppMessageModelImpl.TOUSER_COLUMN_BITMASK |
			AppMessageModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FA_TU = new FinderPath(AppMessageModelImpl.ENTITY_CACHE_ENABLED,
			AppMessageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByFA_TU",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the app messages where fromApplication = &#63; and toUser = &#63;.
	 *
	 * @param fromApplication the from application
	 * @param toUser the to user
	 * @return the matching app messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppMessage> findByFA_TU(String fromApplication, String toUser)
		throws SystemException {
		return findByFA_TU(fromApplication, toUser, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the app messages where fromApplication = &#63; and toUser = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param fromApplication the from application
	 * @param toUser the to user
	 * @param start the lower bound of the range of app messages
	 * @param end the upper bound of the range of app messages (not inclusive)
	 * @return the range of matching app messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppMessage> findByFA_TU(String fromApplication, String toUser,
		int start, int end) throws SystemException {
		return findByFA_TU(fromApplication, toUser, start, end, null);
	}

	/**
	 * Returns an ordered range of all the app messages where fromApplication = &#63; and toUser = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param fromApplication the from application
	 * @param toUser the to user
	 * @param start the lower bound of the range of app messages
	 * @param end the upper bound of the range of app messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching app messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppMessage> findByFA_TU(String fromApplication, String toUser,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FA_TU;
			finderArgs = new Object[] { fromApplication, toUser };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FA_TU;
			finderArgs = new Object[] {
					fromApplication, toUser,
					
					start, end, orderByComparator
				};
		}

		List<AppMessage> list = (List<AppMessage>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AppMessage appMessage : list) {
				if (!Validator.equals(fromApplication,
							appMessage.getFromApplication()) ||
						!Validator.equals(toUser, appMessage.getToUser())) {
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

			query.append(_SQL_SELECT_APPMESSAGE_WHERE);

			boolean bindFromApplication = false;

			if (fromApplication == null) {
				query.append(_FINDER_COLUMN_FA_TU_FROMAPPLICATION_1);
			}
			else if (fromApplication.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FA_TU_FROMAPPLICATION_3);
			}
			else {
				bindFromApplication = true;

				query.append(_FINDER_COLUMN_FA_TU_FROMAPPLICATION_2);
			}

			boolean bindToUser = false;

			if (toUser == null) {
				query.append(_FINDER_COLUMN_FA_TU_TOUSER_1);
			}
			else if (toUser.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FA_TU_TOUSER_3);
			}
			else {
				bindToUser = true;

				query.append(_FINDER_COLUMN_FA_TU_TOUSER_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AppMessageModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFromApplication) {
					qPos.add(fromApplication);
				}

				if (bindToUser) {
					qPos.add(toUser);
				}

				if (!pagination) {
					list = (List<AppMessage>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AppMessage>(list);
				}
				else {
					list = (List<AppMessage>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first app message in the ordered set where fromApplication = &#63; and toUser = &#63;.
	 *
	 * @param fromApplication the from application
	 * @param toUser the to user
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app message
	 * @throws org.oep.ssomgt.NoSuchAppMessageException if a matching app message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppMessage findByFA_TU_First(String fromApplication, String toUser,
		OrderByComparator orderByComparator)
		throws NoSuchAppMessageException, SystemException {
		AppMessage appMessage = fetchByFA_TU_First(fromApplication, toUser,
				orderByComparator);

		if (appMessage != null) {
			return appMessage;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("fromApplication=");
		msg.append(fromApplication);

		msg.append(", toUser=");
		msg.append(toUser);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAppMessageException(msg.toString());
	}

	/**
	 * Returns the first app message in the ordered set where fromApplication = &#63; and toUser = &#63;.
	 *
	 * @param fromApplication the from application
	 * @param toUser the to user
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app message, or <code>null</code> if a matching app message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppMessage fetchByFA_TU_First(String fromApplication, String toUser,
		OrderByComparator orderByComparator) throws SystemException {
		List<AppMessage> list = findByFA_TU(fromApplication, toUser, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last app message in the ordered set where fromApplication = &#63; and toUser = &#63;.
	 *
	 * @param fromApplication the from application
	 * @param toUser the to user
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app message
	 * @throws org.oep.ssomgt.NoSuchAppMessageException if a matching app message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppMessage findByFA_TU_Last(String fromApplication, String toUser,
		OrderByComparator orderByComparator)
		throws NoSuchAppMessageException, SystemException {
		AppMessage appMessage = fetchByFA_TU_Last(fromApplication, toUser,
				orderByComparator);

		if (appMessage != null) {
			return appMessage;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("fromApplication=");
		msg.append(fromApplication);

		msg.append(", toUser=");
		msg.append(toUser);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAppMessageException(msg.toString());
	}

	/**
	 * Returns the last app message in the ordered set where fromApplication = &#63; and toUser = &#63;.
	 *
	 * @param fromApplication the from application
	 * @param toUser the to user
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app message, or <code>null</code> if a matching app message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppMessage fetchByFA_TU_Last(String fromApplication, String toUser,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByFA_TU(fromApplication, toUser);

		if (count == 0) {
			return null;
		}

		List<AppMessage> list = findByFA_TU(fromApplication, toUser, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the app messages before and after the current app message in the ordered set where fromApplication = &#63; and toUser = &#63;.
	 *
	 * @param appMessageId the primary key of the current app message
	 * @param fromApplication the from application
	 * @param toUser the to user
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next app message
	 * @throws org.oep.ssomgt.NoSuchAppMessageException if a app message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppMessage[] findByFA_TU_PrevAndNext(long appMessageId,
		String fromApplication, String toUser,
		OrderByComparator orderByComparator)
		throws NoSuchAppMessageException, SystemException {
		AppMessage appMessage = findByPrimaryKey(appMessageId);

		Session session = null;

		try {
			session = openSession();

			AppMessage[] array = new AppMessageImpl[3];

			array[0] = getByFA_TU_PrevAndNext(session, appMessage,
					fromApplication, toUser, orderByComparator, true);

			array[1] = appMessage;

			array[2] = getByFA_TU_PrevAndNext(session, appMessage,
					fromApplication, toUser, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AppMessage getByFA_TU_PrevAndNext(Session session,
		AppMessage appMessage, String fromApplication, String toUser,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_APPMESSAGE_WHERE);

		boolean bindFromApplication = false;

		if (fromApplication == null) {
			query.append(_FINDER_COLUMN_FA_TU_FROMAPPLICATION_1);
		}
		else if (fromApplication.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_FA_TU_FROMAPPLICATION_3);
		}
		else {
			bindFromApplication = true;

			query.append(_FINDER_COLUMN_FA_TU_FROMAPPLICATION_2);
		}

		boolean bindToUser = false;

		if (toUser == null) {
			query.append(_FINDER_COLUMN_FA_TU_TOUSER_1);
		}
		else if (toUser.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_FA_TU_TOUSER_3);
		}
		else {
			bindToUser = true;

			query.append(_FINDER_COLUMN_FA_TU_TOUSER_2);
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
			query.append(AppMessageModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindFromApplication) {
			qPos.add(fromApplication);
		}

		if (bindToUser) {
			qPos.add(toUser);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(appMessage);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AppMessage> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the app messages where fromApplication = &#63; and toUser = &#63; from the database.
	 *
	 * @param fromApplication the from application
	 * @param toUser the to user
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByFA_TU(String fromApplication, String toUser)
		throws SystemException {
		for (AppMessage appMessage : findByFA_TU(fromApplication, toUser,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(appMessage);
		}
	}

	/**
	 * Returns the number of app messages where fromApplication = &#63; and toUser = &#63;.
	 *
	 * @param fromApplication the from application
	 * @param toUser the to user
	 * @return the number of matching app messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByFA_TU(String fromApplication, String toUser)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FA_TU;

		Object[] finderArgs = new Object[] { fromApplication, toUser };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_APPMESSAGE_WHERE);

			boolean bindFromApplication = false;

			if (fromApplication == null) {
				query.append(_FINDER_COLUMN_FA_TU_FROMAPPLICATION_1);
			}
			else if (fromApplication.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FA_TU_FROMAPPLICATION_3);
			}
			else {
				bindFromApplication = true;

				query.append(_FINDER_COLUMN_FA_TU_FROMAPPLICATION_2);
			}

			boolean bindToUser = false;

			if (toUser == null) {
				query.append(_FINDER_COLUMN_FA_TU_TOUSER_1);
			}
			else if (toUser.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FA_TU_TOUSER_3);
			}
			else {
				bindToUser = true;

				query.append(_FINDER_COLUMN_FA_TU_TOUSER_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFromApplication) {
					qPos.add(fromApplication);
				}

				if (bindToUser) {
					qPos.add(toUser);
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

	private static final String _FINDER_COLUMN_FA_TU_FROMAPPLICATION_1 = "appMessage.fromApplication IS NULL AND ";
	private static final String _FINDER_COLUMN_FA_TU_FROMAPPLICATION_2 = "appMessage.fromApplication = ? AND ";
	private static final String _FINDER_COLUMN_FA_TU_FROMAPPLICATION_3 = "(appMessage.fromApplication IS NULL OR appMessage.fromApplication = '') AND ";
	private static final String _FINDER_COLUMN_FA_TU_TOUSER_1 = "appMessage.toUser IS NULL";
	private static final String _FINDER_COLUMN_FA_TU_TOUSER_2 = "appMessage.toUser = ?";
	private static final String _FINDER_COLUMN_FA_TU_TOUSER_3 = "(appMessage.toUser IS NULL OR appMessage.toUser = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FA_TU_MT = new FinderPath(AppMessageModelImpl.ENTITY_CACHE_ENABLED,
			AppMessageModelImpl.FINDER_CACHE_ENABLED, AppMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByFA_TU_MT",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FA_TU_MT =
		new FinderPath(AppMessageModelImpl.ENTITY_CACHE_ENABLED,
			AppMessageModelImpl.FINDER_CACHE_ENABLED, AppMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByFA_TU_MT",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			AppMessageModelImpl.FROMAPPLICATION_COLUMN_BITMASK |
			AppMessageModelImpl.TOUSER_COLUMN_BITMASK |
			AppMessageModelImpl.MESSAGETYPE_COLUMN_BITMASK |
			AppMessageModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FA_TU_MT = new FinderPath(AppMessageModelImpl.ENTITY_CACHE_ENABLED,
			AppMessageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByFA_TU_MT",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the app messages where fromApplication = &#63; and toUser = &#63; and messageType = &#63;.
	 *
	 * @param fromApplication the from application
	 * @param toUser the to user
	 * @param messageType the message type
	 * @return the matching app messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppMessage> findByFA_TU_MT(String fromApplication,
		String toUser, String messageType) throws SystemException {
		return findByFA_TU_MT(fromApplication, toUser, messageType,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the app messages where fromApplication = &#63; and toUser = &#63; and messageType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param fromApplication the from application
	 * @param toUser the to user
	 * @param messageType the message type
	 * @param start the lower bound of the range of app messages
	 * @param end the upper bound of the range of app messages (not inclusive)
	 * @return the range of matching app messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppMessage> findByFA_TU_MT(String fromApplication,
		String toUser, String messageType, int start, int end)
		throws SystemException {
		return findByFA_TU_MT(fromApplication, toUser, messageType, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the app messages where fromApplication = &#63; and toUser = &#63; and messageType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param fromApplication the from application
	 * @param toUser the to user
	 * @param messageType the message type
	 * @param start the lower bound of the range of app messages
	 * @param end the upper bound of the range of app messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching app messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppMessage> findByFA_TU_MT(String fromApplication,
		String toUser, String messageType, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FA_TU_MT;
			finderArgs = new Object[] { fromApplication, toUser, messageType };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FA_TU_MT;
			finderArgs = new Object[] {
					fromApplication, toUser, messageType,
					
					start, end, orderByComparator
				};
		}

		List<AppMessage> list = (List<AppMessage>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AppMessage appMessage : list) {
				if (!Validator.equals(fromApplication,
							appMessage.getFromApplication()) ||
						!Validator.equals(toUser, appMessage.getToUser()) ||
						!Validator.equals(messageType,
							appMessage.getMessageType())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_APPMESSAGE_WHERE);

			boolean bindFromApplication = false;

			if (fromApplication == null) {
				query.append(_FINDER_COLUMN_FA_TU_MT_FROMAPPLICATION_1);
			}
			else if (fromApplication.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FA_TU_MT_FROMAPPLICATION_3);
			}
			else {
				bindFromApplication = true;

				query.append(_FINDER_COLUMN_FA_TU_MT_FROMAPPLICATION_2);
			}

			boolean bindToUser = false;

			if (toUser == null) {
				query.append(_FINDER_COLUMN_FA_TU_MT_TOUSER_1);
			}
			else if (toUser.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FA_TU_MT_TOUSER_3);
			}
			else {
				bindToUser = true;

				query.append(_FINDER_COLUMN_FA_TU_MT_TOUSER_2);
			}

			boolean bindMessageType = false;

			if (messageType == null) {
				query.append(_FINDER_COLUMN_FA_TU_MT_MESSAGETYPE_1);
			}
			else if (messageType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FA_TU_MT_MESSAGETYPE_3);
			}
			else {
				bindMessageType = true;

				query.append(_FINDER_COLUMN_FA_TU_MT_MESSAGETYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AppMessageModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFromApplication) {
					qPos.add(fromApplication);
				}

				if (bindToUser) {
					qPos.add(toUser);
				}

				if (bindMessageType) {
					qPos.add(messageType);
				}

				if (!pagination) {
					list = (List<AppMessage>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AppMessage>(list);
				}
				else {
					list = (List<AppMessage>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first app message in the ordered set where fromApplication = &#63; and toUser = &#63; and messageType = &#63;.
	 *
	 * @param fromApplication the from application
	 * @param toUser the to user
	 * @param messageType the message type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app message
	 * @throws org.oep.ssomgt.NoSuchAppMessageException if a matching app message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppMessage findByFA_TU_MT_First(String fromApplication,
		String toUser, String messageType, OrderByComparator orderByComparator)
		throws NoSuchAppMessageException, SystemException {
		AppMessage appMessage = fetchByFA_TU_MT_First(fromApplication, toUser,
				messageType, orderByComparator);

		if (appMessage != null) {
			return appMessage;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("fromApplication=");
		msg.append(fromApplication);

		msg.append(", toUser=");
		msg.append(toUser);

		msg.append(", messageType=");
		msg.append(messageType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAppMessageException(msg.toString());
	}

	/**
	 * Returns the first app message in the ordered set where fromApplication = &#63; and toUser = &#63; and messageType = &#63;.
	 *
	 * @param fromApplication the from application
	 * @param toUser the to user
	 * @param messageType the message type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app message, or <code>null</code> if a matching app message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppMessage fetchByFA_TU_MT_First(String fromApplication,
		String toUser, String messageType, OrderByComparator orderByComparator)
		throws SystemException {
		List<AppMessage> list = findByFA_TU_MT(fromApplication, toUser,
				messageType, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last app message in the ordered set where fromApplication = &#63; and toUser = &#63; and messageType = &#63;.
	 *
	 * @param fromApplication the from application
	 * @param toUser the to user
	 * @param messageType the message type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app message
	 * @throws org.oep.ssomgt.NoSuchAppMessageException if a matching app message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppMessage findByFA_TU_MT_Last(String fromApplication,
		String toUser, String messageType, OrderByComparator orderByComparator)
		throws NoSuchAppMessageException, SystemException {
		AppMessage appMessage = fetchByFA_TU_MT_Last(fromApplication, toUser,
				messageType, orderByComparator);

		if (appMessage != null) {
			return appMessage;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("fromApplication=");
		msg.append(fromApplication);

		msg.append(", toUser=");
		msg.append(toUser);

		msg.append(", messageType=");
		msg.append(messageType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAppMessageException(msg.toString());
	}

	/**
	 * Returns the last app message in the ordered set where fromApplication = &#63; and toUser = &#63; and messageType = &#63;.
	 *
	 * @param fromApplication the from application
	 * @param toUser the to user
	 * @param messageType the message type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app message, or <code>null</code> if a matching app message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppMessage fetchByFA_TU_MT_Last(String fromApplication,
		String toUser, String messageType, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByFA_TU_MT(fromApplication, toUser, messageType);

		if (count == 0) {
			return null;
		}

		List<AppMessage> list = findByFA_TU_MT(fromApplication, toUser,
				messageType, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the app messages before and after the current app message in the ordered set where fromApplication = &#63; and toUser = &#63; and messageType = &#63;.
	 *
	 * @param appMessageId the primary key of the current app message
	 * @param fromApplication the from application
	 * @param toUser the to user
	 * @param messageType the message type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next app message
	 * @throws org.oep.ssomgt.NoSuchAppMessageException if a app message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppMessage[] findByFA_TU_MT_PrevAndNext(long appMessageId,
		String fromApplication, String toUser, String messageType,
		OrderByComparator orderByComparator)
		throws NoSuchAppMessageException, SystemException {
		AppMessage appMessage = findByPrimaryKey(appMessageId);

		Session session = null;

		try {
			session = openSession();

			AppMessage[] array = new AppMessageImpl[3];

			array[0] = getByFA_TU_MT_PrevAndNext(session, appMessage,
					fromApplication, toUser, messageType, orderByComparator,
					true);

			array[1] = appMessage;

			array[2] = getByFA_TU_MT_PrevAndNext(session, appMessage,
					fromApplication, toUser, messageType, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AppMessage getByFA_TU_MT_PrevAndNext(Session session,
		AppMessage appMessage, String fromApplication, String toUser,
		String messageType, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_APPMESSAGE_WHERE);

		boolean bindFromApplication = false;

		if (fromApplication == null) {
			query.append(_FINDER_COLUMN_FA_TU_MT_FROMAPPLICATION_1);
		}
		else if (fromApplication.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_FA_TU_MT_FROMAPPLICATION_3);
		}
		else {
			bindFromApplication = true;

			query.append(_FINDER_COLUMN_FA_TU_MT_FROMAPPLICATION_2);
		}

		boolean bindToUser = false;

		if (toUser == null) {
			query.append(_FINDER_COLUMN_FA_TU_MT_TOUSER_1);
		}
		else if (toUser.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_FA_TU_MT_TOUSER_3);
		}
		else {
			bindToUser = true;

			query.append(_FINDER_COLUMN_FA_TU_MT_TOUSER_2);
		}

		boolean bindMessageType = false;

		if (messageType == null) {
			query.append(_FINDER_COLUMN_FA_TU_MT_MESSAGETYPE_1);
		}
		else if (messageType.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_FA_TU_MT_MESSAGETYPE_3);
		}
		else {
			bindMessageType = true;

			query.append(_FINDER_COLUMN_FA_TU_MT_MESSAGETYPE_2);
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
			query.append(AppMessageModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindFromApplication) {
			qPos.add(fromApplication);
		}

		if (bindToUser) {
			qPos.add(toUser);
		}

		if (bindMessageType) {
			qPos.add(messageType);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(appMessage);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AppMessage> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the app messages where fromApplication = &#63; and toUser = &#63; and messageType = &#63; from the database.
	 *
	 * @param fromApplication the from application
	 * @param toUser the to user
	 * @param messageType the message type
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByFA_TU_MT(String fromApplication, String toUser,
		String messageType) throws SystemException {
		for (AppMessage appMessage : findByFA_TU_MT(fromApplication, toUser,
				messageType, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(appMessage);
		}
	}

	/**
	 * Returns the number of app messages where fromApplication = &#63; and toUser = &#63; and messageType = &#63;.
	 *
	 * @param fromApplication the from application
	 * @param toUser the to user
	 * @param messageType the message type
	 * @return the number of matching app messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByFA_TU_MT(String fromApplication, String toUser,
		String messageType) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FA_TU_MT;

		Object[] finderArgs = new Object[] { fromApplication, toUser, messageType };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_APPMESSAGE_WHERE);

			boolean bindFromApplication = false;

			if (fromApplication == null) {
				query.append(_FINDER_COLUMN_FA_TU_MT_FROMAPPLICATION_1);
			}
			else if (fromApplication.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FA_TU_MT_FROMAPPLICATION_3);
			}
			else {
				bindFromApplication = true;

				query.append(_FINDER_COLUMN_FA_TU_MT_FROMAPPLICATION_2);
			}

			boolean bindToUser = false;

			if (toUser == null) {
				query.append(_FINDER_COLUMN_FA_TU_MT_TOUSER_1);
			}
			else if (toUser.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FA_TU_MT_TOUSER_3);
			}
			else {
				bindToUser = true;

				query.append(_FINDER_COLUMN_FA_TU_MT_TOUSER_2);
			}

			boolean bindMessageType = false;

			if (messageType == null) {
				query.append(_FINDER_COLUMN_FA_TU_MT_MESSAGETYPE_1);
			}
			else if (messageType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FA_TU_MT_MESSAGETYPE_3);
			}
			else {
				bindMessageType = true;

				query.append(_FINDER_COLUMN_FA_TU_MT_MESSAGETYPE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFromApplication) {
					qPos.add(fromApplication);
				}

				if (bindToUser) {
					qPos.add(toUser);
				}

				if (bindMessageType) {
					qPos.add(messageType);
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

	private static final String _FINDER_COLUMN_FA_TU_MT_FROMAPPLICATION_1 = "appMessage.fromApplication IS NULL AND ";
	private static final String _FINDER_COLUMN_FA_TU_MT_FROMAPPLICATION_2 = "appMessage.fromApplication = ? AND ";
	private static final String _FINDER_COLUMN_FA_TU_MT_FROMAPPLICATION_3 = "(appMessage.fromApplication IS NULL OR appMessage.fromApplication = '') AND ";
	private static final String _FINDER_COLUMN_FA_TU_MT_TOUSER_1 = "appMessage.toUser IS NULL AND ";
	private static final String _FINDER_COLUMN_FA_TU_MT_TOUSER_2 = "appMessage.toUser = ? AND ";
	private static final String _FINDER_COLUMN_FA_TU_MT_TOUSER_3 = "(appMessage.toUser IS NULL OR appMessage.toUser = '') AND ";
	private static final String _FINDER_COLUMN_FA_TU_MT_MESSAGETYPE_1 = "appMessage.messageType IS NULL";
	private static final String _FINDER_COLUMN_FA_TU_MT_MESSAGETYPE_2 = "appMessage.messageType = ?";
	private static final String _FINDER_COLUMN_FA_TU_MT_MESSAGETYPE_3 = "(appMessage.messageType IS NULL OR appMessage.messageType = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FA_TU_NOTMT =
		new FinderPath(AppMessageModelImpl.ENTITY_CACHE_ENABLED,
			AppMessageModelImpl.FINDER_CACHE_ENABLED, AppMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByFA_TU_NotMT",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_FA_TU_NOTMT =
		new FinderPath(AppMessageModelImpl.ENTITY_CACHE_ENABLED,
			AppMessageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByFA_TU_NotMT",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the app messages where fromApplication = &#63; and toUser = &#63; and messageType &ne; &#63;.
	 *
	 * @param fromApplication the from application
	 * @param toUser the to user
	 * @param messageType the message type
	 * @return the matching app messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppMessage> findByFA_TU_NotMT(String fromApplication,
		String toUser, String messageType) throws SystemException {
		return findByFA_TU_NotMT(fromApplication, toUser, messageType,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the app messages where fromApplication = &#63; and toUser = &#63; and messageType &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param fromApplication the from application
	 * @param toUser the to user
	 * @param messageType the message type
	 * @param start the lower bound of the range of app messages
	 * @param end the upper bound of the range of app messages (not inclusive)
	 * @return the range of matching app messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppMessage> findByFA_TU_NotMT(String fromApplication,
		String toUser, String messageType, int start, int end)
		throws SystemException {
		return findByFA_TU_NotMT(fromApplication, toUser, messageType, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the app messages where fromApplication = &#63; and toUser = &#63; and messageType &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param fromApplication the from application
	 * @param toUser the to user
	 * @param messageType the message type
	 * @param start the lower bound of the range of app messages
	 * @param end the upper bound of the range of app messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching app messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppMessage> findByFA_TU_NotMT(String fromApplication,
		String toUser, String messageType, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FA_TU_NOTMT;
		finderArgs = new Object[] {
				fromApplication, toUser, messageType,
				
				start, end, orderByComparator
			};

		List<AppMessage> list = (List<AppMessage>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AppMessage appMessage : list) {
				if (!Validator.equals(fromApplication,
							appMessage.getFromApplication()) ||
						!Validator.equals(toUser, appMessage.getToUser()) ||
						Validator.equals(messageType,
							appMessage.getMessageType())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_APPMESSAGE_WHERE);

			boolean bindFromApplication = false;

			if (fromApplication == null) {
				query.append(_FINDER_COLUMN_FA_TU_NOTMT_FROMAPPLICATION_1);
			}
			else if (fromApplication.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FA_TU_NOTMT_FROMAPPLICATION_3);
			}
			else {
				bindFromApplication = true;

				query.append(_FINDER_COLUMN_FA_TU_NOTMT_FROMAPPLICATION_2);
			}

			boolean bindToUser = false;

			if (toUser == null) {
				query.append(_FINDER_COLUMN_FA_TU_NOTMT_TOUSER_1);
			}
			else if (toUser.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FA_TU_NOTMT_TOUSER_3);
			}
			else {
				bindToUser = true;

				query.append(_FINDER_COLUMN_FA_TU_NOTMT_TOUSER_2);
			}

			boolean bindMessageType = false;

			if (messageType == null) {
				query.append(_FINDER_COLUMN_FA_TU_NOTMT_MESSAGETYPE_1);
			}
			else if (messageType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FA_TU_NOTMT_MESSAGETYPE_3);
			}
			else {
				bindMessageType = true;

				query.append(_FINDER_COLUMN_FA_TU_NOTMT_MESSAGETYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AppMessageModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFromApplication) {
					qPos.add(fromApplication);
				}

				if (bindToUser) {
					qPos.add(toUser);
				}

				if (bindMessageType) {
					qPos.add(messageType);
				}

				if (!pagination) {
					list = (List<AppMessage>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AppMessage>(list);
				}
				else {
					list = (List<AppMessage>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first app message in the ordered set where fromApplication = &#63; and toUser = &#63; and messageType &ne; &#63;.
	 *
	 * @param fromApplication the from application
	 * @param toUser the to user
	 * @param messageType the message type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app message
	 * @throws org.oep.ssomgt.NoSuchAppMessageException if a matching app message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppMessage findByFA_TU_NotMT_First(String fromApplication,
		String toUser, String messageType, OrderByComparator orderByComparator)
		throws NoSuchAppMessageException, SystemException {
		AppMessage appMessage = fetchByFA_TU_NotMT_First(fromApplication,
				toUser, messageType, orderByComparator);

		if (appMessage != null) {
			return appMessage;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("fromApplication=");
		msg.append(fromApplication);

		msg.append(", toUser=");
		msg.append(toUser);

		msg.append(", messageType=");
		msg.append(messageType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAppMessageException(msg.toString());
	}

	/**
	 * Returns the first app message in the ordered set where fromApplication = &#63; and toUser = &#63; and messageType &ne; &#63;.
	 *
	 * @param fromApplication the from application
	 * @param toUser the to user
	 * @param messageType the message type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app message, or <code>null</code> if a matching app message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppMessage fetchByFA_TU_NotMT_First(String fromApplication,
		String toUser, String messageType, OrderByComparator orderByComparator)
		throws SystemException {
		List<AppMessage> list = findByFA_TU_NotMT(fromApplication, toUser,
				messageType, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last app message in the ordered set where fromApplication = &#63; and toUser = &#63; and messageType &ne; &#63;.
	 *
	 * @param fromApplication the from application
	 * @param toUser the to user
	 * @param messageType the message type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app message
	 * @throws org.oep.ssomgt.NoSuchAppMessageException if a matching app message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppMessage findByFA_TU_NotMT_Last(String fromApplication,
		String toUser, String messageType, OrderByComparator orderByComparator)
		throws NoSuchAppMessageException, SystemException {
		AppMessage appMessage = fetchByFA_TU_NotMT_Last(fromApplication,
				toUser, messageType, orderByComparator);

		if (appMessage != null) {
			return appMessage;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("fromApplication=");
		msg.append(fromApplication);

		msg.append(", toUser=");
		msg.append(toUser);

		msg.append(", messageType=");
		msg.append(messageType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAppMessageException(msg.toString());
	}

	/**
	 * Returns the last app message in the ordered set where fromApplication = &#63; and toUser = &#63; and messageType &ne; &#63;.
	 *
	 * @param fromApplication the from application
	 * @param toUser the to user
	 * @param messageType the message type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app message, or <code>null</code> if a matching app message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppMessage fetchByFA_TU_NotMT_Last(String fromApplication,
		String toUser, String messageType, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByFA_TU_NotMT(fromApplication, toUser, messageType);

		if (count == 0) {
			return null;
		}

		List<AppMessage> list = findByFA_TU_NotMT(fromApplication, toUser,
				messageType, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the app messages before and after the current app message in the ordered set where fromApplication = &#63; and toUser = &#63; and messageType &ne; &#63;.
	 *
	 * @param appMessageId the primary key of the current app message
	 * @param fromApplication the from application
	 * @param toUser the to user
	 * @param messageType the message type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next app message
	 * @throws org.oep.ssomgt.NoSuchAppMessageException if a app message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppMessage[] findByFA_TU_NotMT_PrevAndNext(long appMessageId,
		String fromApplication, String toUser, String messageType,
		OrderByComparator orderByComparator)
		throws NoSuchAppMessageException, SystemException {
		AppMessage appMessage = findByPrimaryKey(appMessageId);

		Session session = null;

		try {
			session = openSession();

			AppMessage[] array = new AppMessageImpl[3];

			array[0] = getByFA_TU_NotMT_PrevAndNext(session, appMessage,
					fromApplication, toUser, messageType, orderByComparator,
					true);

			array[1] = appMessage;

			array[2] = getByFA_TU_NotMT_PrevAndNext(session, appMessage,
					fromApplication, toUser, messageType, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AppMessage getByFA_TU_NotMT_PrevAndNext(Session session,
		AppMessage appMessage, String fromApplication, String toUser,
		String messageType, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_APPMESSAGE_WHERE);

		boolean bindFromApplication = false;

		if (fromApplication == null) {
			query.append(_FINDER_COLUMN_FA_TU_NOTMT_FROMAPPLICATION_1);
		}
		else if (fromApplication.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_FA_TU_NOTMT_FROMAPPLICATION_3);
		}
		else {
			bindFromApplication = true;

			query.append(_FINDER_COLUMN_FA_TU_NOTMT_FROMAPPLICATION_2);
		}

		boolean bindToUser = false;

		if (toUser == null) {
			query.append(_FINDER_COLUMN_FA_TU_NOTMT_TOUSER_1);
		}
		else if (toUser.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_FA_TU_NOTMT_TOUSER_3);
		}
		else {
			bindToUser = true;

			query.append(_FINDER_COLUMN_FA_TU_NOTMT_TOUSER_2);
		}

		boolean bindMessageType = false;

		if (messageType == null) {
			query.append(_FINDER_COLUMN_FA_TU_NOTMT_MESSAGETYPE_1);
		}
		else if (messageType.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_FA_TU_NOTMT_MESSAGETYPE_3);
		}
		else {
			bindMessageType = true;

			query.append(_FINDER_COLUMN_FA_TU_NOTMT_MESSAGETYPE_2);
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
			query.append(AppMessageModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindFromApplication) {
			qPos.add(fromApplication);
		}

		if (bindToUser) {
			qPos.add(toUser);
		}

		if (bindMessageType) {
			qPos.add(messageType);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(appMessage);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AppMessage> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the app messages where fromApplication = &#63; and toUser = &#63; and messageType &ne; &#63; from the database.
	 *
	 * @param fromApplication the from application
	 * @param toUser the to user
	 * @param messageType the message type
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByFA_TU_NotMT(String fromApplication, String toUser,
		String messageType) throws SystemException {
		for (AppMessage appMessage : findByFA_TU_NotMT(fromApplication, toUser,
				messageType, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(appMessage);
		}
	}

	/**
	 * Returns the number of app messages where fromApplication = &#63; and toUser = &#63; and messageType &ne; &#63;.
	 *
	 * @param fromApplication the from application
	 * @param toUser the to user
	 * @param messageType the message type
	 * @return the number of matching app messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByFA_TU_NotMT(String fromApplication, String toUser,
		String messageType) throws SystemException {
		FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_FA_TU_NOTMT;

		Object[] finderArgs = new Object[] { fromApplication, toUser, messageType };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_APPMESSAGE_WHERE);

			boolean bindFromApplication = false;

			if (fromApplication == null) {
				query.append(_FINDER_COLUMN_FA_TU_NOTMT_FROMAPPLICATION_1);
			}
			else if (fromApplication.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FA_TU_NOTMT_FROMAPPLICATION_3);
			}
			else {
				bindFromApplication = true;

				query.append(_FINDER_COLUMN_FA_TU_NOTMT_FROMAPPLICATION_2);
			}

			boolean bindToUser = false;

			if (toUser == null) {
				query.append(_FINDER_COLUMN_FA_TU_NOTMT_TOUSER_1);
			}
			else if (toUser.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FA_TU_NOTMT_TOUSER_3);
			}
			else {
				bindToUser = true;

				query.append(_FINDER_COLUMN_FA_TU_NOTMT_TOUSER_2);
			}

			boolean bindMessageType = false;

			if (messageType == null) {
				query.append(_FINDER_COLUMN_FA_TU_NOTMT_MESSAGETYPE_1);
			}
			else if (messageType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FA_TU_NOTMT_MESSAGETYPE_3);
			}
			else {
				bindMessageType = true;

				query.append(_FINDER_COLUMN_FA_TU_NOTMT_MESSAGETYPE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFromApplication) {
					qPos.add(fromApplication);
				}

				if (bindToUser) {
					qPos.add(toUser);
				}

				if (bindMessageType) {
					qPos.add(messageType);
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

	private static final String _FINDER_COLUMN_FA_TU_NOTMT_FROMAPPLICATION_1 = "appMessage.fromApplication IS NULL AND ";
	private static final String _FINDER_COLUMN_FA_TU_NOTMT_FROMAPPLICATION_2 = "appMessage.fromApplication = ? AND ";
	private static final String _FINDER_COLUMN_FA_TU_NOTMT_FROMAPPLICATION_3 = "(appMessage.fromApplication IS NULL OR appMessage.fromApplication = '') AND ";
	private static final String _FINDER_COLUMN_FA_TU_NOTMT_TOUSER_1 = "appMessage.toUser IS NULL AND ";
	private static final String _FINDER_COLUMN_FA_TU_NOTMT_TOUSER_2 = "appMessage.toUser = ? AND ";
	private static final String _FINDER_COLUMN_FA_TU_NOTMT_TOUSER_3 = "(appMessage.toUser IS NULL OR appMessage.toUser = '') AND ";
	private static final String _FINDER_COLUMN_FA_TU_NOTMT_MESSAGETYPE_1 = "appMessage.messageType IS NOT NULL";
	private static final String _FINDER_COLUMN_FA_TU_NOTMT_MESSAGETYPE_2 = "appMessage.messageType != ?";
	private static final String _FINDER_COLUMN_FA_TU_NOTMT_MESSAGETYPE_3 = "(appMessage.messageType IS NULL OR appMessage.messageType != '')";

	public AppMessagePersistenceImpl() {
		setModelClass(AppMessage.class);
	}

	/**
	 * Caches the app message in the entity cache if it is enabled.
	 *
	 * @param appMessage the app message
	 */
	@Override
	public void cacheResult(AppMessage appMessage) {
		EntityCacheUtil.putResult(AppMessageModelImpl.ENTITY_CACHE_ENABLED,
			AppMessageImpl.class, appMessage.getPrimaryKey(), appMessage);

		appMessage.resetOriginalValues();
	}

	/**
	 * Caches the app messages in the entity cache if it is enabled.
	 *
	 * @param appMessages the app messages
	 */
	@Override
	public void cacheResult(List<AppMessage> appMessages) {
		for (AppMessage appMessage : appMessages) {
			if (EntityCacheUtil.getResult(
						AppMessageModelImpl.ENTITY_CACHE_ENABLED,
						AppMessageImpl.class, appMessage.getPrimaryKey()) == null) {
				cacheResult(appMessage);
			}
			else {
				appMessage.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all app messages.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AppMessageImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AppMessageImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the app message.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AppMessage appMessage) {
		EntityCacheUtil.removeResult(AppMessageModelImpl.ENTITY_CACHE_ENABLED,
			AppMessageImpl.class, appMessage.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AppMessage> appMessages) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AppMessage appMessage : appMessages) {
			EntityCacheUtil.removeResult(AppMessageModelImpl.ENTITY_CACHE_ENABLED,
				AppMessageImpl.class, appMessage.getPrimaryKey());
		}
	}

	/**
	 * Creates a new app message with the primary key. Does not add the app message to the database.
	 *
	 * @param appMessageId the primary key for the new app message
	 * @return the new app message
	 */
	@Override
	public AppMessage create(long appMessageId) {
		AppMessage appMessage = new AppMessageImpl();

		appMessage.setNew(true);
		appMessage.setPrimaryKey(appMessageId);

		return appMessage;
	}

	/**
	 * Removes the app message with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param appMessageId the primary key of the app message
	 * @return the app message that was removed
	 * @throws org.oep.ssomgt.NoSuchAppMessageException if a app message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppMessage remove(long appMessageId)
		throws NoSuchAppMessageException, SystemException {
		return remove((Serializable)appMessageId);
	}

	/**
	 * Removes the app message with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the app message
	 * @return the app message that was removed
	 * @throws org.oep.ssomgt.NoSuchAppMessageException if a app message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppMessage remove(Serializable primaryKey)
		throws NoSuchAppMessageException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AppMessage appMessage = (AppMessage)session.get(AppMessageImpl.class,
					primaryKey);

			if (appMessage == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAppMessageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(appMessage);
		}
		catch (NoSuchAppMessageException nsee) {
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
	protected AppMessage removeImpl(AppMessage appMessage)
		throws SystemException {
		appMessage = toUnwrappedModel(appMessage);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(appMessage)) {
				appMessage = (AppMessage)session.get(AppMessageImpl.class,
						appMessage.getPrimaryKeyObj());
			}

			if (appMessage != null) {
				session.delete(appMessage);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (appMessage != null) {
			clearCache(appMessage);
		}

		return appMessage;
	}

	@Override
	public AppMessage updateImpl(org.oep.ssomgt.model.AppMessage appMessage)
		throws SystemException {
		appMessage = toUnwrappedModel(appMessage);

		boolean isNew = appMessage.isNew();

		AppMessageModelImpl appMessageModelImpl = (AppMessageModelImpl)appMessage;

		Session session = null;

		try {
			session = openSession();

			if (appMessage.isNew()) {
				session.save(appMessage);

				appMessage.setNew(false);
			}
			else {
				session.merge(appMessage);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !AppMessageModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((appMessageModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TU.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						appMessageModelImpl.getOriginalToUser()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TU, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TU,
					args);

				args = new Object[] { appMessageModelImpl.getToUser() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TU, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TU,
					args);
			}

			if ((appMessageModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FA_TU.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						appMessageModelImpl.getOriginalFromApplication(),
						appMessageModelImpl.getOriginalToUser()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FA_TU, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FA_TU,
					args);

				args = new Object[] {
						appMessageModelImpl.getFromApplication(),
						appMessageModelImpl.getToUser()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FA_TU, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FA_TU,
					args);
			}

			if ((appMessageModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FA_TU_MT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						appMessageModelImpl.getOriginalFromApplication(),
						appMessageModelImpl.getOriginalToUser(),
						appMessageModelImpl.getOriginalMessageType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FA_TU_MT, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FA_TU_MT,
					args);

				args = new Object[] {
						appMessageModelImpl.getFromApplication(),
						appMessageModelImpl.getToUser(),
						appMessageModelImpl.getMessageType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FA_TU_MT, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FA_TU_MT,
					args);
			}
		}

		EntityCacheUtil.putResult(AppMessageModelImpl.ENTITY_CACHE_ENABLED,
			AppMessageImpl.class, appMessage.getPrimaryKey(), appMessage);

		return appMessage;
	}

	protected AppMessage toUnwrappedModel(AppMessage appMessage) {
		if (appMessage instanceof AppMessageImpl) {
			return appMessage;
		}

		AppMessageImpl appMessageImpl = new AppMessageImpl();

		appMessageImpl.setNew(appMessage.isNew());
		appMessageImpl.setPrimaryKey(appMessage.getPrimaryKey());

		appMessageImpl.setAppMessageId(appMessage.getAppMessageId());
		appMessageImpl.setUserId(appMessage.getUserId());
		appMessageImpl.setGroupId(appMessage.getGroupId());
		appMessageImpl.setCompanyId(appMessage.getCompanyId());
		appMessageImpl.setCreateDate(appMessage.getCreateDate());
		appMessageImpl.setFromApplication(appMessage.getFromApplication());
		appMessageImpl.setToUser(appMessage.getToUser());
		appMessageImpl.setMessageType(appMessage.getMessageType());
		appMessageImpl.setMessageCode(appMessage.getMessageCode());
		appMessageImpl.setMessageText(appMessage.getMessageText());
		appMessageImpl.setMessageValue(appMessage.getMessageValue());
		appMessageImpl.setMessageUrl(appMessage.getMessageUrl());
		appMessageImpl.setVisitDate(appMessage.getVisitDate());

		return appMessageImpl;
	}

	/**
	 * Returns the app message with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the app message
	 * @return the app message
	 * @throws org.oep.ssomgt.NoSuchAppMessageException if a app message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppMessage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAppMessageException, SystemException {
		AppMessage appMessage = fetchByPrimaryKey(primaryKey);

		if (appMessage == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAppMessageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return appMessage;
	}

	/**
	 * Returns the app message with the primary key or throws a {@link org.oep.ssomgt.NoSuchAppMessageException} if it could not be found.
	 *
	 * @param appMessageId the primary key of the app message
	 * @return the app message
	 * @throws org.oep.ssomgt.NoSuchAppMessageException if a app message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppMessage findByPrimaryKey(long appMessageId)
		throws NoSuchAppMessageException, SystemException {
		return findByPrimaryKey((Serializable)appMessageId);
	}

	/**
	 * Returns the app message with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the app message
	 * @return the app message, or <code>null</code> if a app message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppMessage fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		AppMessage appMessage = (AppMessage)EntityCacheUtil.getResult(AppMessageModelImpl.ENTITY_CACHE_ENABLED,
				AppMessageImpl.class, primaryKey);

		if (appMessage == _nullAppMessage) {
			return null;
		}

		if (appMessage == null) {
			Session session = null;

			try {
				session = openSession();

				appMessage = (AppMessage)session.get(AppMessageImpl.class,
						primaryKey);

				if (appMessage != null) {
					cacheResult(appMessage);
				}
				else {
					EntityCacheUtil.putResult(AppMessageModelImpl.ENTITY_CACHE_ENABLED,
						AppMessageImpl.class, primaryKey, _nullAppMessage);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AppMessageModelImpl.ENTITY_CACHE_ENABLED,
					AppMessageImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return appMessage;
	}

	/**
	 * Returns the app message with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param appMessageId the primary key of the app message
	 * @return the app message, or <code>null</code> if a app message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppMessage fetchByPrimaryKey(long appMessageId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)appMessageId);
	}

	/**
	 * Returns all the app messages.
	 *
	 * @return the app messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppMessage> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the app messages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of app messages
	 * @param end the upper bound of the range of app messages (not inclusive)
	 * @return the range of app messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppMessage> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the app messages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of app messages
	 * @param end the upper bound of the range of app messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of app messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppMessage> findAll(int start, int end,
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

		List<AppMessage> list = (List<AppMessage>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_APPMESSAGE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_APPMESSAGE;

				if (pagination) {
					sql = sql.concat(AppMessageModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AppMessage>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AppMessage>(list);
				}
				else {
					list = (List<AppMessage>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the app messages from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (AppMessage appMessage : findAll()) {
			remove(appMessage);
		}
	}

	/**
	 * Returns the number of app messages.
	 *
	 * @return the number of app messages
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

				Query q = session.createQuery(_SQL_COUNT_APPMESSAGE);

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

	/**
	 * Initializes the app message persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.ssomgt.model.AppMessage")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AppMessage>> listenersList = new ArrayList<ModelListener<AppMessage>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AppMessage>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AppMessageImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_APPMESSAGE = "SELECT appMessage FROM AppMessage appMessage";
	private static final String _SQL_SELECT_APPMESSAGE_WHERE = "SELECT appMessage FROM AppMessage appMessage WHERE ";
	private static final String _SQL_COUNT_APPMESSAGE = "SELECT COUNT(appMessage) FROM AppMessage appMessage";
	private static final String _SQL_COUNT_APPMESSAGE_WHERE = "SELECT COUNT(appMessage) FROM AppMessage appMessage WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "appMessage.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AppMessage exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AppMessage exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AppMessagePersistenceImpl.class);
	private static AppMessage _nullAppMessage = new AppMessageImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<AppMessage> toCacheModel() {
				return _nullAppMessageCacheModel;
			}
		};

	private static CacheModel<AppMessage> _nullAppMessageCacheModel = new CacheModel<AppMessage>() {
			@Override
			public AppMessage toEntityModel() {
				return _nullAppMessage;
			}
		};
}