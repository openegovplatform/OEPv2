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

package org.oep.core.logging.service.persistence;

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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.oep.core.logging.NoSuchUserActivityException;
import org.oep.core.logging.model.UserActivity;
import org.oep.core.logging.model.impl.UserActivityImpl;
import org.oep.core.logging.model.impl.UserActivityModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * The persistence implementation for the user activity service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserActivityPersistence
 * @see UserActivityUtil
 * @generated
 */
public class UserActivityPersistenceImpl extends BasePersistenceImpl<UserActivity>
	implements UserActivityPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UserActivityUtil} to access the user activity persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UserActivityImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UserActivityModelImpl.ENTITY_CACHE_ENABLED,
			UserActivityModelImpl.FINDER_CACHE_ENABLED, UserActivityImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UserActivityModelImpl.ENTITY_CACHE_ENABLED,
			UserActivityModelImpl.FINDER_CACHE_ENABLED, UserActivityImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UserActivityModelImpl.ENTITY_CACHE_ENABLED,
			UserActivityModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_A = new FinderPath(UserActivityModelImpl.ENTITY_CACHE_ENABLED,
			UserActivityModelImpl.FINDER_CACHE_ENABLED, UserActivityImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByA",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A = new FinderPath(UserActivityModelImpl.ENTITY_CACHE_ENABLED,
			UserActivityModelImpl.FINDER_CACHE_ENABLED, UserActivityImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByA",
			new String[] { String.class.getName() },
			UserActivityModelImpl.ACTION_COLUMN_BITMASK |
			UserActivityModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_A = new FinderPath(UserActivityModelImpl.ENTITY_CACHE_ENABLED,
			UserActivityModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByA",
			new String[] { String.class.getName() });

	/**
	 * Returns all the user activities where action = &#63;.
	 *
	 * @param action the action
	 * @return the matching user activities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserActivity> findByA(String action) throws SystemException {
		return findByA(action, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user activities where action = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.logging.model.impl.UserActivityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param action the action
	 * @param start the lower bound of the range of user activities
	 * @param end the upper bound of the range of user activities (not inclusive)
	 * @return the range of matching user activities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserActivity> findByA(String action, int start, int end)
		throws SystemException {
		return findByA(action, start, end, null);
	}

	/**
	 * Returns an ordered range of all the user activities where action = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.logging.model.impl.UserActivityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param action the action
	 * @param start the lower bound of the range of user activities
	 * @param end the upper bound of the range of user activities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user activities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserActivity> findByA(String action, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A;
			finderArgs = new Object[] { action };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_A;
			finderArgs = new Object[] { action, start, end, orderByComparator };
		}

		List<UserActivity> list = (List<UserActivity>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (UserActivity userActivity : list) {
				if (!Validator.equals(action, userActivity.getAction())) {
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

			query.append(_SQL_SELECT_USERACTIVITY_WHERE);

			boolean bindAction = false;

			if (action == null) {
				query.append(_FINDER_COLUMN_A_ACTION_1);
			}
			else if (action.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_A_ACTION_3);
			}
			else {
				bindAction = true;

				query.append(_FINDER_COLUMN_A_ACTION_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(UserActivityModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindAction) {
					qPos.add(action);
				}

				if (!pagination) {
					list = (List<UserActivity>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserActivity>(list);
				}
				else {
					list = (List<UserActivity>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first user activity in the ordered set where action = &#63;.
	 *
	 * @param action the action
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user activity
	 * @throws org.oep.core.logging.NoSuchUserActivityException if a matching user activity could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserActivity findByA_First(String action,
		OrderByComparator orderByComparator)
		throws NoSuchUserActivityException, SystemException {
		UserActivity userActivity = fetchByA_First(action, orderByComparator);

		if (userActivity != null) {
			return userActivity;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("action=");
		msg.append(action);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserActivityException(msg.toString());
	}

	/**
	 * Returns the first user activity in the ordered set where action = &#63;.
	 *
	 * @param action the action
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user activity, or <code>null</code> if a matching user activity could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserActivity fetchByA_First(String action,
		OrderByComparator orderByComparator) throws SystemException {
		List<UserActivity> list = findByA(action, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last user activity in the ordered set where action = &#63;.
	 *
	 * @param action the action
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user activity
	 * @throws org.oep.core.logging.NoSuchUserActivityException if a matching user activity could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserActivity findByA_Last(String action,
		OrderByComparator orderByComparator)
		throws NoSuchUserActivityException, SystemException {
		UserActivity userActivity = fetchByA_Last(action, orderByComparator);

		if (userActivity != null) {
			return userActivity;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("action=");
		msg.append(action);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserActivityException(msg.toString());
	}

	/**
	 * Returns the last user activity in the ordered set where action = &#63;.
	 *
	 * @param action the action
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user activity, or <code>null</code> if a matching user activity could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserActivity fetchByA_Last(String action,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByA(action);

		if (count == 0) {
			return null;
		}

		List<UserActivity> list = findByA(action, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the user activities before and after the current user activity in the ordered set where action = &#63;.
	 *
	 * @param id the primary key of the current user activity
	 * @param action the action
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user activity
	 * @throws org.oep.core.logging.NoSuchUserActivityException if a user activity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserActivity[] findByA_PrevAndNext(long id, String action,
		OrderByComparator orderByComparator)
		throws NoSuchUserActivityException, SystemException {
		UserActivity userActivity = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			UserActivity[] array = new UserActivityImpl[3];

			array[0] = getByA_PrevAndNext(session, userActivity, action,
					orderByComparator, true);

			array[1] = userActivity;

			array[2] = getByA_PrevAndNext(session, userActivity, action,
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

	protected UserActivity getByA_PrevAndNext(Session session,
		UserActivity userActivity, String action,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_USERACTIVITY_WHERE);

		boolean bindAction = false;

		if (action == null) {
			query.append(_FINDER_COLUMN_A_ACTION_1);
		}
		else if (action.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_A_ACTION_3);
		}
		else {
			bindAction = true;

			query.append(_FINDER_COLUMN_A_ACTION_2);
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
			query.append(UserActivityModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindAction) {
			qPos.add(action);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(userActivity);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UserActivity> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the user activities where action = &#63; from the database.
	 *
	 * @param action the action
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByA(String action) throws SystemException {
		for (UserActivity userActivity : findByA(action, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(userActivity);
		}
	}

	/**
	 * Returns the number of user activities where action = &#63;.
	 *
	 * @param action the action
	 * @return the number of matching user activities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByA(String action) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_A;

		Object[] finderArgs = new Object[] { action };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_USERACTIVITY_WHERE);

			boolean bindAction = false;

			if (action == null) {
				query.append(_FINDER_COLUMN_A_ACTION_1);
			}
			else if (action.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_A_ACTION_3);
			}
			else {
				bindAction = true;

				query.append(_FINDER_COLUMN_A_ACTION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindAction) {
					qPos.add(action);
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

	private static final String _FINDER_COLUMN_A_ACTION_1 = "userActivity.action IS NULL";
	private static final String _FINDER_COLUMN_A_ACTION_2 = "userActivity.action = ?";
	private static final String _FINDER_COLUMN_A_ACTION_3 = "(userActivity.action IS NULL OR userActivity.action = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_U = new FinderPath(UserActivityModelImpl.ENTITY_CACHE_ENABLED,
			UserActivityModelImpl.FINDER_CACHE_ENABLED, UserActivityImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByU",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U = new FinderPath(UserActivityModelImpl.ENTITY_CACHE_ENABLED,
			UserActivityModelImpl.FINDER_CACHE_ENABLED, UserActivityImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByU",
			new String[] { Long.class.getName() },
			UserActivityModelImpl.USERID_COLUMN_BITMASK |
			UserActivityModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_U = new FinderPath(UserActivityModelImpl.ENTITY_CACHE_ENABLED,
			UserActivityModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByU",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the user activities where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching user activities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserActivity> findByU(long userId) throws SystemException {
		return findByU(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user activities where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.logging.model.impl.UserActivityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of user activities
	 * @param end the upper bound of the range of user activities (not inclusive)
	 * @return the range of matching user activities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserActivity> findByU(long userId, int start, int end)
		throws SystemException {
		return findByU(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the user activities where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.logging.model.impl.UserActivityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of user activities
	 * @param end the upper bound of the range of user activities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user activities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserActivity> findByU(long userId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U;
			finderArgs = new Object[] { userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_U;
			finderArgs = new Object[] { userId, start, end, orderByComparator };
		}

		List<UserActivity> list = (List<UserActivity>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (UserActivity userActivity : list) {
				if ((userId != userActivity.getUserId())) {
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

			query.append(_SQL_SELECT_USERACTIVITY_WHERE);

			query.append(_FINDER_COLUMN_U_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(UserActivityModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<UserActivity>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserActivity>(list);
				}
				else {
					list = (List<UserActivity>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first user activity in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user activity
	 * @throws org.oep.core.logging.NoSuchUserActivityException if a matching user activity could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserActivity findByU_First(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchUserActivityException, SystemException {
		UserActivity userActivity = fetchByU_First(userId, orderByComparator);

		if (userActivity != null) {
			return userActivity;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserActivityException(msg.toString());
	}

	/**
	 * Returns the first user activity in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user activity, or <code>null</code> if a matching user activity could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserActivity fetchByU_First(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		List<UserActivity> list = findByU(userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last user activity in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user activity
	 * @throws org.oep.core.logging.NoSuchUserActivityException if a matching user activity could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserActivity findByU_Last(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchUserActivityException, SystemException {
		UserActivity userActivity = fetchByU_Last(userId, orderByComparator);

		if (userActivity != null) {
			return userActivity;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserActivityException(msg.toString());
	}

	/**
	 * Returns the last user activity in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user activity, or <code>null</code> if a matching user activity could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserActivity fetchByU_Last(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByU(userId);

		if (count == 0) {
			return null;
		}

		List<UserActivity> list = findByU(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the user activities before and after the current user activity in the ordered set where userId = &#63;.
	 *
	 * @param id the primary key of the current user activity
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user activity
	 * @throws org.oep.core.logging.NoSuchUserActivityException if a user activity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserActivity[] findByU_PrevAndNext(long id, long userId,
		OrderByComparator orderByComparator)
		throws NoSuchUserActivityException, SystemException {
		UserActivity userActivity = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			UserActivity[] array = new UserActivityImpl[3];

			array[0] = getByU_PrevAndNext(session, userActivity, userId,
					orderByComparator, true);

			array[1] = userActivity;

			array[2] = getByU_PrevAndNext(session, userActivity, userId,
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

	protected UserActivity getByU_PrevAndNext(Session session,
		UserActivity userActivity, long userId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_USERACTIVITY_WHERE);

		query.append(_FINDER_COLUMN_U_USERID_2);

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
			query.append(UserActivityModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(userActivity);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UserActivity> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the user activities where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByU(long userId) throws SystemException {
		for (UserActivity userActivity : findByU(userId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(userActivity);
		}
	}

	/**
	 * Returns the number of user activities where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching user activities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByU(long userId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_U;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_USERACTIVITY_WHERE);

			query.append(_FINDER_COLUMN_U_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

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

	private static final String _FINDER_COLUMN_U_USERID_2 = "userActivity.userId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_A_C = new FinderPath(UserActivityModelImpl.ENTITY_CACHE_ENABLED,
			UserActivityModelImpl.FINDER_CACHE_ENABLED, UserActivityImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByA_C",
			new String[] {
				String.class.getName(), Date.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_C = new FinderPath(UserActivityModelImpl.ENTITY_CACHE_ENABLED,
			UserActivityModelImpl.FINDER_CACHE_ENABLED, UserActivityImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByA_C",
			new String[] { String.class.getName(), Date.class.getName() },
			UserActivityModelImpl.ACTION_COLUMN_BITMASK |
			UserActivityModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_A_C = new FinderPath(UserActivityModelImpl.ENTITY_CACHE_ENABLED,
			UserActivityModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByA_C",
			new String[] { String.class.getName(), Date.class.getName() });

	/**
	 * Returns all the user activities where action = &#63; and createDate = &#63;.
	 *
	 * @param action the action
	 * @param createDate the create date
	 * @return the matching user activities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserActivity> findByA_C(String action, Date createDate)
		throws SystemException {
		return findByA_C(action, createDate, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user activities where action = &#63; and createDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.logging.model.impl.UserActivityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param action the action
	 * @param createDate the create date
	 * @param start the lower bound of the range of user activities
	 * @param end the upper bound of the range of user activities (not inclusive)
	 * @return the range of matching user activities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserActivity> findByA_C(String action, Date createDate,
		int start, int end) throws SystemException {
		return findByA_C(action, createDate, start, end, null);
	}

	/**
	 * Returns an ordered range of all the user activities where action = &#63; and createDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.logging.model.impl.UserActivityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param action the action
	 * @param createDate the create date
	 * @param start the lower bound of the range of user activities
	 * @param end the upper bound of the range of user activities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user activities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserActivity> findByA_C(String action, Date createDate,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_C;
			finderArgs = new Object[] { action, createDate };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_A_C;
			finderArgs = new Object[] {
					action, createDate,
					
					start, end, orderByComparator
				};
		}

		List<UserActivity> list = (List<UserActivity>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (UserActivity userActivity : list) {
				if (!Validator.equals(action, userActivity.getAction()) ||
						!Validator.equals(createDate,
							userActivity.getCreateDate())) {
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

			query.append(_SQL_SELECT_USERACTIVITY_WHERE);

			boolean bindAction = false;

			if (action == null) {
				query.append(_FINDER_COLUMN_A_C_ACTION_1);
			}
			else if (action.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_A_C_ACTION_3);
			}
			else {
				bindAction = true;

				query.append(_FINDER_COLUMN_A_C_ACTION_2);
			}

			boolean bindCreateDate = false;

			if (createDate == null) {
				query.append(_FINDER_COLUMN_A_C_CREATEDATE_1);
			}
			else {
				bindCreateDate = true;

				query.append(_FINDER_COLUMN_A_C_CREATEDATE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(UserActivityModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindAction) {
					qPos.add(action);
				}

				if (bindCreateDate) {
					qPos.add(CalendarUtil.getTimestamp(createDate));
				}

				if (!pagination) {
					list = (List<UserActivity>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserActivity>(list);
				}
				else {
					list = (List<UserActivity>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first user activity in the ordered set where action = &#63; and createDate = &#63;.
	 *
	 * @param action the action
	 * @param createDate the create date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user activity
	 * @throws org.oep.core.logging.NoSuchUserActivityException if a matching user activity could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserActivity findByA_C_First(String action, Date createDate,
		OrderByComparator orderByComparator)
		throws NoSuchUserActivityException, SystemException {
		UserActivity userActivity = fetchByA_C_First(action, createDate,
				orderByComparator);

		if (userActivity != null) {
			return userActivity;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("action=");
		msg.append(action);

		msg.append(", createDate=");
		msg.append(createDate);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserActivityException(msg.toString());
	}

	/**
	 * Returns the first user activity in the ordered set where action = &#63; and createDate = &#63;.
	 *
	 * @param action the action
	 * @param createDate the create date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user activity, or <code>null</code> if a matching user activity could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserActivity fetchByA_C_First(String action, Date createDate,
		OrderByComparator orderByComparator) throws SystemException {
		List<UserActivity> list = findByA_C(action, createDate, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last user activity in the ordered set where action = &#63; and createDate = &#63;.
	 *
	 * @param action the action
	 * @param createDate the create date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user activity
	 * @throws org.oep.core.logging.NoSuchUserActivityException if a matching user activity could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserActivity findByA_C_Last(String action, Date createDate,
		OrderByComparator orderByComparator)
		throws NoSuchUserActivityException, SystemException {
		UserActivity userActivity = fetchByA_C_Last(action, createDate,
				orderByComparator);

		if (userActivity != null) {
			return userActivity;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("action=");
		msg.append(action);

		msg.append(", createDate=");
		msg.append(createDate);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserActivityException(msg.toString());
	}

	/**
	 * Returns the last user activity in the ordered set where action = &#63; and createDate = &#63;.
	 *
	 * @param action the action
	 * @param createDate the create date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user activity, or <code>null</code> if a matching user activity could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserActivity fetchByA_C_Last(String action, Date createDate,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByA_C(action, createDate);

		if (count == 0) {
			return null;
		}

		List<UserActivity> list = findByA_C(action, createDate, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the user activities before and after the current user activity in the ordered set where action = &#63; and createDate = &#63;.
	 *
	 * @param id the primary key of the current user activity
	 * @param action the action
	 * @param createDate the create date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user activity
	 * @throws org.oep.core.logging.NoSuchUserActivityException if a user activity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserActivity[] findByA_C_PrevAndNext(long id, String action,
		Date createDate, OrderByComparator orderByComparator)
		throws NoSuchUserActivityException, SystemException {
		UserActivity userActivity = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			UserActivity[] array = new UserActivityImpl[3];

			array[0] = getByA_C_PrevAndNext(session, userActivity, action,
					createDate, orderByComparator, true);

			array[1] = userActivity;

			array[2] = getByA_C_PrevAndNext(session, userActivity, action,
					createDate, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected UserActivity getByA_C_PrevAndNext(Session session,
		UserActivity userActivity, String action, Date createDate,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_USERACTIVITY_WHERE);

		boolean bindAction = false;

		if (action == null) {
			query.append(_FINDER_COLUMN_A_C_ACTION_1);
		}
		else if (action.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_A_C_ACTION_3);
		}
		else {
			bindAction = true;

			query.append(_FINDER_COLUMN_A_C_ACTION_2);
		}

		boolean bindCreateDate = false;

		if (createDate == null) {
			query.append(_FINDER_COLUMN_A_C_CREATEDATE_1);
		}
		else {
			bindCreateDate = true;

			query.append(_FINDER_COLUMN_A_C_CREATEDATE_2);
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
			query.append(UserActivityModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindAction) {
			qPos.add(action);
		}

		if (bindCreateDate) {
			qPos.add(CalendarUtil.getTimestamp(createDate));
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(userActivity);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UserActivity> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the user activities where action = &#63; and createDate = &#63; from the database.
	 *
	 * @param action the action
	 * @param createDate the create date
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByA_C(String action, Date createDate)
		throws SystemException {
		for (UserActivity userActivity : findByA_C(action, createDate,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(userActivity);
		}
	}

	/**
	 * Returns the number of user activities where action = &#63; and createDate = &#63;.
	 *
	 * @param action the action
	 * @param createDate the create date
	 * @return the number of matching user activities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByA_C(String action, Date createDate)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_A_C;

		Object[] finderArgs = new Object[] { action, createDate };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_USERACTIVITY_WHERE);

			boolean bindAction = false;

			if (action == null) {
				query.append(_FINDER_COLUMN_A_C_ACTION_1);
			}
			else if (action.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_A_C_ACTION_3);
			}
			else {
				bindAction = true;

				query.append(_FINDER_COLUMN_A_C_ACTION_2);
			}

			boolean bindCreateDate = false;

			if (createDate == null) {
				query.append(_FINDER_COLUMN_A_C_CREATEDATE_1);
			}
			else {
				bindCreateDate = true;

				query.append(_FINDER_COLUMN_A_C_CREATEDATE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindAction) {
					qPos.add(action);
				}

				if (bindCreateDate) {
					qPos.add(CalendarUtil.getTimestamp(createDate));
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

	private static final String _FINDER_COLUMN_A_C_ACTION_1 = "userActivity.action IS NULL AND ";
	private static final String _FINDER_COLUMN_A_C_ACTION_2 = "userActivity.action = ? AND ";
	private static final String _FINDER_COLUMN_A_C_ACTION_3 = "(userActivity.action IS NULL OR userActivity.action = '') AND ";
	private static final String _FINDER_COLUMN_A_C_CREATEDATE_1 = "userActivity.createDate IS NULL";
	private static final String _FINDER_COLUMN_A_C_CREATEDATE_2 = "userActivity.createDate = ?";

	public UserActivityPersistenceImpl() {
		setModelClass(UserActivity.class);
	}

	/**
	 * Caches the user activity in the entity cache if it is enabled.
	 *
	 * @param userActivity the user activity
	 */
	@Override
	public void cacheResult(UserActivity userActivity) {
		EntityCacheUtil.putResult(UserActivityModelImpl.ENTITY_CACHE_ENABLED,
			UserActivityImpl.class, userActivity.getPrimaryKey(), userActivity);

		userActivity.resetOriginalValues();
	}

	/**
	 * Caches the user activities in the entity cache if it is enabled.
	 *
	 * @param userActivities the user activities
	 */
	@Override
	public void cacheResult(List<UserActivity> userActivities) {
		for (UserActivity userActivity : userActivities) {
			if (EntityCacheUtil.getResult(
						UserActivityModelImpl.ENTITY_CACHE_ENABLED,
						UserActivityImpl.class, userActivity.getPrimaryKey()) == null) {
				cacheResult(userActivity);
			}
			else {
				userActivity.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all user activities.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(UserActivityImpl.class.getName());
		}

		EntityCacheUtil.clearCache(UserActivityImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the user activity.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UserActivity userActivity) {
		EntityCacheUtil.removeResult(UserActivityModelImpl.ENTITY_CACHE_ENABLED,
			UserActivityImpl.class, userActivity.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<UserActivity> userActivities) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UserActivity userActivity : userActivities) {
			EntityCacheUtil.removeResult(UserActivityModelImpl.ENTITY_CACHE_ENABLED,
				UserActivityImpl.class, userActivity.getPrimaryKey());
		}
	}

	/**
	 * Creates a new user activity with the primary key. Does not add the user activity to the database.
	 *
	 * @param id the primary key for the new user activity
	 * @return the new user activity
	 */
	@Override
	public UserActivity create(long id) {
		UserActivity userActivity = new UserActivityImpl();

		userActivity.setNew(true);
		userActivity.setPrimaryKey(id);

		return userActivity;
	}

	/**
	 * Removes the user activity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the user activity
	 * @return the user activity that was removed
	 * @throws org.oep.core.logging.NoSuchUserActivityException if a user activity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserActivity remove(long id)
		throws NoSuchUserActivityException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the user activity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the user activity
	 * @return the user activity that was removed
	 * @throws org.oep.core.logging.NoSuchUserActivityException if a user activity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserActivity remove(Serializable primaryKey)
		throws NoSuchUserActivityException, SystemException {
		Session session = null;

		try {
			session = openSession();

			UserActivity userActivity = (UserActivity)session.get(UserActivityImpl.class,
					primaryKey);

			if (userActivity == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUserActivityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(userActivity);
		}
		catch (NoSuchUserActivityException nsee) {
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
	protected UserActivity removeImpl(UserActivity userActivity)
		throws SystemException {
		userActivity = toUnwrappedModel(userActivity);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(userActivity)) {
				userActivity = (UserActivity)session.get(UserActivityImpl.class,
						userActivity.getPrimaryKeyObj());
			}

			if (userActivity != null) {
				session.delete(userActivity);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (userActivity != null) {
			clearCache(userActivity);
		}

		return userActivity;
	}

	@Override
	public UserActivity updateImpl(
		org.oep.core.logging.model.UserActivity userActivity)
		throws SystemException {
		userActivity = toUnwrappedModel(userActivity);

		boolean isNew = userActivity.isNew();

		UserActivityModelImpl userActivityModelImpl = (UserActivityModelImpl)userActivity;

		Session session = null;

		try {
			session = openSession();

			if (userActivity.isNew()) {
				session.save(userActivity);

				userActivity.setNew(false);
			}
			else {
				session.merge(userActivity);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !UserActivityModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((userActivityModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						userActivityModelImpl.getOriginalAction()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_A, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A,
					args);

				args = new Object[] { userActivityModelImpl.getAction() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_A, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A,
					args);
			}

			if ((userActivityModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						userActivityModelImpl.getOriginalUserId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_U, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U,
					args);

				args = new Object[] { userActivityModelImpl.getUserId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_U, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U,
					args);
			}

			if ((userActivityModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						userActivityModelImpl.getOriginalAction(),
						userActivityModelImpl.getOriginalCreateDate()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_A_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_C,
					args);

				args = new Object[] {
						userActivityModelImpl.getAction(),
						userActivityModelImpl.getCreateDate()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_A_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_C,
					args);
			}
		}

		EntityCacheUtil.putResult(UserActivityModelImpl.ENTITY_CACHE_ENABLED,
			UserActivityImpl.class, userActivity.getPrimaryKey(), userActivity);

		return userActivity;
	}

	protected UserActivity toUnwrappedModel(UserActivity userActivity) {
		if (userActivity instanceof UserActivityImpl) {
			return userActivity;
		}

		UserActivityImpl userActivityImpl = new UserActivityImpl();

		userActivityImpl.setNew(userActivity.isNew());
		userActivityImpl.setPrimaryKey(userActivity.getPrimaryKey());

		userActivityImpl.setId(userActivity.getId());
		userActivityImpl.setUserId(userActivity.getUserId());
		userActivityImpl.setGroupId(userActivity.getGroupId());
		userActivityImpl.setCompanyId(userActivity.getCompanyId());
		userActivityImpl.setCreateDate(userActivity.getCreateDate());
		userActivityImpl.setUserName(userActivity.getUserName());
		userActivityImpl.setEmail(userActivity.getEmail());
		userActivityImpl.setSite(userActivity.getSite());
		userActivityImpl.setPage(userActivity.getPage());
		userActivityImpl.setAction(userActivity.getAction());
		userActivityImpl.setDescription(userActivity.getDescription());
		userActivityImpl.setUrl(userActivity.getUrl());
		userActivityImpl.setSessionId(userActivity.getSessionId());
		userActivityImpl.setIp(userActivity.getIp());
		userActivityImpl.setUserAgent(userActivity.getUserAgent());

		return userActivityImpl;
	}

	/**
	 * Returns the user activity with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the user activity
	 * @return the user activity
	 * @throws org.oep.core.logging.NoSuchUserActivityException if a user activity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserActivity findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUserActivityException, SystemException {
		UserActivity userActivity = fetchByPrimaryKey(primaryKey);

		if (userActivity == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUserActivityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return userActivity;
	}

	/**
	 * Returns the user activity with the primary key or throws a {@link org.oep.core.logging.NoSuchUserActivityException} if it could not be found.
	 *
	 * @param id the primary key of the user activity
	 * @return the user activity
	 * @throws org.oep.core.logging.NoSuchUserActivityException if a user activity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserActivity findByPrimaryKey(long id)
		throws NoSuchUserActivityException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the user activity with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the user activity
	 * @return the user activity, or <code>null</code> if a user activity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserActivity fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		UserActivity userActivity = (UserActivity)EntityCacheUtil.getResult(UserActivityModelImpl.ENTITY_CACHE_ENABLED,
				UserActivityImpl.class, primaryKey);

		if (userActivity == _nullUserActivity) {
			return null;
		}

		if (userActivity == null) {
			Session session = null;

			try {
				session = openSession();

				userActivity = (UserActivity)session.get(UserActivityImpl.class,
						primaryKey);

				if (userActivity != null) {
					cacheResult(userActivity);
				}
				else {
					EntityCacheUtil.putResult(UserActivityModelImpl.ENTITY_CACHE_ENABLED,
						UserActivityImpl.class, primaryKey, _nullUserActivity);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(UserActivityModelImpl.ENTITY_CACHE_ENABLED,
					UserActivityImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return userActivity;
	}

	/**
	 * Returns the user activity with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the user activity
	 * @return the user activity, or <code>null</code> if a user activity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserActivity fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the user activities.
	 *
	 * @return the user activities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserActivity> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user activities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.logging.model.impl.UserActivityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user activities
	 * @param end the upper bound of the range of user activities (not inclusive)
	 * @return the range of user activities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserActivity> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the user activities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.logging.model.impl.UserActivityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user activities
	 * @param end the upper bound of the range of user activities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of user activities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserActivity> findAll(int start, int end,
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

		List<UserActivity> list = (List<UserActivity>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_USERACTIVITY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USERACTIVITY;

				if (pagination) {
					sql = sql.concat(UserActivityModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<UserActivity>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserActivity>(list);
				}
				else {
					list = (List<UserActivity>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the user activities from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (UserActivity userActivity : findAll()) {
			remove(userActivity);
		}
	}

	/**
	 * Returns the number of user activities.
	 *
	 * @return the number of user activities
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

				Query q = session.createQuery(_SQL_COUNT_USERACTIVITY);

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
	 * Initializes the user activity persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.logging.model.UserActivity")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<UserActivity>> listenersList = new ArrayList<ModelListener<UserActivity>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<UserActivity>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(UserActivityImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_USERACTIVITY = "SELECT userActivity FROM UserActivity userActivity";
	private static final String _SQL_SELECT_USERACTIVITY_WHERE = "SELECT userActivity FROM UserActivity userActivity WHERE ";
	private static final String _SQL_COUNT_USERACTIVITY = "SELECT COUNT(userActivity) FROM UserActivity userActivity";
	private static final String _SQL_COUNT_USERACTIVITY_WHERE = "SELECT COUNT(userActivity) FROM UserActivity userActivity WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "userActivity.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UserActivity exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No UserActivity exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(UserActivityPersistenceImpl.class);
	private static UserActivity _nullUserActivity = new UserActivityImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<UserActivity> toCacheModel() {
				return _nullUserActivityCacheModel;
			}
		};

	private static CacheModel<UserActivity> _nullUserActivityCacheModel = new CacheModel<UserActivity>() {
			@Override
			public UserActivity toEntityModel() {
				return _nullUserActivity;
			}
		};
}