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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.oep.core.logging.NoSuchNewUserLogException;
import org.oep.core.logging.model.NewUserLog;
import org.oep.core.logging.model.impl.NewUserLogImpl;
import org.oep.core.logging.model.impl.NewUserLogModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the new user log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NewUserLogPersistence
 * @see NewUserLogUtil
 * @generated
 */
public class NewUserLogPersistenceImpl extends BasePersistenceImpl<NewUserLog>
	implements NewUserLogPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link NewUserLogUtil} to access the new user log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = NewUserLogImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(NewUserLogModelImpl.ENTITY_CACHE_ENABLED,
			NewUserLogModelImpl.FINDER_CACHE_ENABLED, NewUserLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(NewUserLogModelImpl.ENTITY_CACHE_ENABLED,
			NewUserLogModelImpl.FINDER_CACHE_ENABLED, NewUserLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(NewUserLogModelImpl.ENTITY_CACHE_ENABLED,
			NewUserLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_U = new FinderPath(NewUserLogModelImpl.ENTITY_CACHE_ENABLED,
			NewUserLogModelImpl.FINDER_CACHE_ENABLED, NewUserLogImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByU",
			new String[] { Long.class.getName() },
			NewUserLogModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_U = new FinderPath(NewUserLogModelImpl.ENTITY_CACHE_ENABLED,
			NewUserLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByU",
			new String[] { Long.class.getName() });

	/**
	 * Returns the new user log where userId = &#63; or throws a {@link org.oep.core.logging.NoSuchNewUserLogException} if it could not be found.
	 *
	 * @param userId the user ID
	 * @return the matching new user log
	 * @throws org.oep.core.logging.NoSuchNewUserLogException if a matching new user log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NewUserLog findByU(long userId)
		throws NoSuchNewUserLogException, SystemException {
		NewUserLog newUserLog = fetchByU(userId);

		if (newUserLog == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userId=");
			msg.append(userId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchNewUserLogException(msg.toString());
		}

		return newUserLog;
	}

	/**
	 * Returns the new user log where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param userId the user ID
	 * @return the matching new user log, or <code>null</code> if a matching new user log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NewUserLog fetchByU(long userId) throws SystemException {
		return fetchByU(userId, true);
	}

	/**
	 * Returns the new user log where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param userId the user ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching new user log, or <code>null</code> if a matching new user log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NewUserLog fetchByU(long userId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { userId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_U,
					finderArgs, this);
		}

		if (result instanceof NewUserLog) {
			NewUserLog newUserLog = (NewUserLog)result;

			if ((userId != newUserLog.getUserId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_NEWUSERLOG_WHERE);

			query.append(_FINDER_COLUMN_U_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				List<NewUserLog> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_U,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"NewUserLogPersistenceImpl.fetchByU(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					NewUserLog newUserLog = list.get(0);

					result = newUserLog;

					cacheResult(newUserLog);

					if ((newUserLog.getUserId() != userId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_U,
							finderArgs, newUserLog);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_U, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (NewUserLog)result;
		}
	}

	/**
	 * Removes the new user log where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @return the new user log that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NewUserLog removeByU(long userId)
		throws NoSuchNewUserLogException, SystemException {
		NewUserLog newUserLog = findByU(userId);

		return remove(newUserLog);
	}

	/**
	 * Returns the number of new user logs where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching new user logs
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

			query.append(_SQL_COUNT_NEWUSERLOG_WHERE);

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

	private static final String _FINDER_COLUMN_U_USERID_2 = "newUserLog.userId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_UAI = new FinderPath(NewUserLogModelImpl.ENTITY_CACHE_ENABLED,
			NewUserLogModelImpl.FINDER_CACHE_ENABLED, NewUserLogImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUai",
			new String[] { Long.class.getName() },
			NewUserLogModelImpl.USERACTIVITYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UAI = new FinderPath(NewUserLogModelImpl.ENTITY_CACHE_ENABLED,
			NewUserLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUai",
			new String[] { Long.class.getName() });

	/**
	 * Returns the new user log where userActivityId = &#63; or throws a {@link org.oep.core.logging.NoSuchNewUserLogException} if it could not be found.
	 *
	 * @param userActivityId the user activity ID
	 * @return the matching new user log
	 * @throws org.oep.core.logging.NoSuchNewUserLogException if a matching new user log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NewUserLog findByUai(long userActivityId)
		throws NoSuchNewUserLogException, SystemException {
		NewUserLog newUserLog = fetchByUai(userActivityId);

		if (newUserLog == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userActivityId=");
			msg.append(userActivityId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchNewUserLogException(msg.toString());
		}

		return newUserLog;
	}

	/**
	 * Returns the new user log where userActivityId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param userActivityId the user activity ID
	 * @return the matching new user log, or <code>null</code> if a matching new user log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NewUserLog fetchByUai(long userActivityId) throws SystemException {
		return fetchByUai(userActivityId, true);
	}

	/**
	 * Returns the new user log where userActivityId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param userActivityId the user activity ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching new user log, or <code>null</code> if a matching new user log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NewUserLog fetchByUai(long userActivityId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { userActivityId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UAI,
					finderArgs, this);
		}

		if (result instanceof NewUserLog) {
			NewUserLog newUserLog = (NewUserLog)result;

			if ((userActivityId != newUserLog.getUserActivityId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_NEWUSERLOG_WHERE);

			query.append(_FINDER_COLUMN_UAI_USERACTIVITYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userActivityId);

				List<NewUserLog> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UAI,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"NewUserLogPersistenceImpl.fetchByUai(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					NewUserLog newUserLog = list.get(0);

					result = newUserLog;

					cacheResult(newUserLog);

					if ((newUserLog.getUserActivityId() != userActivityId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UAI,
							finderArgs, newUserLog);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UAI,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (NewUserLog)result;
		}
	}

	/**
	 * Removes the new user log where userActivityId = &#63; from the database.
	 *
	 * @param userActivityId the user activity ID
	 * @return the new user log that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NewUserLog removeByUai(long userActivityId)
		throws NoSuchNewUserLogException, SystemException {
		NewUserLog newUserLog = findByUai(userActivityId);

		return remove(newUserLog);
	}

	/**
	 * Returns the number of new user logs where userActivityId = &#63;.
	 *
	 * @param userActivityId the user activity ID
	 * @return the number of matching new user logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUai(long userActivityId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UAI;

		Object[] finderArgs = new Object[] { userActivityId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_NEWUSERLOG_WHERE);

			query.append(_FINDER_COLUMN_UAI_USERACTIVITYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userActivityId);

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

	private static final String _FINDER_COLUMN_UAI_USERACTIVITYID_2 = "newUserLog.userActivityId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_U_E_C = new FinderPath(NewUserLogModelImpl.ENTITY_CACHE_ENABLED,
			NewUserLogModelImpl.FINDER_CACHE_ENABLED, NewUserLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByU_E_C",
			new String[] {
				String.class.getName(), String.class.getName(),
				Date.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_E_C = new FinderPath(NewUserLogModelImpl.ENTITY_CACHE_ENABLED,
			NewUserLogModelImpl.FINDER_CACHE_ENABLED, NewUserLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByU_E_C",
			new String[] {
				String.class.getName(), String.class.getName(),
				Date.class.getName()
			},
			NewUserLogModelImpl.USERNAME_COLUMN_BITMASK |
			NewUserLogModelImpl.EMAIL_COLUMN_BITMASK |
			NewUserLogModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_U_E_C = new FinderPath(NewUserLogModelImpl.ENTITY_CACHE_ENABLED,
			NewUserLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByU_E_C",
			new String[] {
				String.class.getName(), String.class.getName(),
				Date.class.getName()
			});

	/**
	 * Returns all the new user logs where userName = &#63; and email = &#63; and createDate = &#63;.
	 *
	 * @param userName the user name
	 * @param email the email
	 * @param createDate the create date
	 * @return the matching new user logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NewUserLog> findByU_E_C(String userName, String email,
		Date createDate) throws SystemException {
		return findByU_E_C(userName, email, createDate, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the new user logs where userName = &#63; and email = &#63; and createDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.logging.model.impl.NewUserLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userName the user name
	 * @param email the email
	 * @param createDate the create date
	 * @param start the lower bound of the range of new user logs
	 * @param end the upper bound of the range of new user logs (not inclusive)
	 * @return the range of matching new user logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NewUserLog> findByU_E_C(String userName, String email,
		Date createDate, int start, int end) throws SystemException {
		return findByU_E_C(userName, email, createDate, start, end, null);
	}

	/**
	 * Returns an ordered range of all the new user logs where userName = &#63; and email = &#63; and createDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.logging.model.impl.NewUserLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userName the user name
	 * @param email the email
	 * @param createDate the create date
	 * @param start the lower bound of the range of new user logs
	 * @param end the upper bound of the range of new user logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching new user logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NewUserLog> findByU_E_C(String userName, String email,
		Date createDate, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_E_C;
			finderArgs = new Object[] { userName, email, createDate };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_U_E_C;
			finderArgs = new Object[] {
					userName, email, createDate,
					
					start, end, orderByComparator
				};
		}

		List<NewUserLog> list = (List<NewUserLog>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (NewUserLog newUserLog : list) {
				if (!Validator.equals(userName, newUserLog.getUserName()) ||
						!Validator.equals(email, newUserLog.getEmail()) ||
						!Validator.equals(createDate, newUserLog.getCreateDate())) {
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

			query.append(_SQL_SELECT_NEWUSERLOG_WHERE);

			boolean bindUserName = false;

			if (userName == null) {
				query.append(_FINDER_COLUMN_U_E_C_USERNAME_1);
			}
			else if (userName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_U_E_C_USERNAME_3);
			}
			else {
				bindUserName = true;

				query.append(_FINDER_COLUMN_U_E_C_USERNAME_2);
			}

			boolean bindEmail = false;

			if (email == null) {
				query.append(_FINDER_COLUMN_U_E_C_EMAIL_1);
			}
			else if (email.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_U_E_C_EMAIL_3);
			}
			else {
				bindEmail = true;

				query.append(_FINDER_COLUMN_U_E_C_EMAIL_2);
			}

			boolean bindCreateDate = false;

			if (createDate == null) {
				query.append(_FINDER_COLUMN_U_E_C_CREATEDATE_1);
			}
			else {
				bindCreateDate = true;

				query.append(_FINDER_COLUMN_U_E_C_CREATEDATE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(NewUserLogModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUserName) {
					qPos.add(userName);
				}

				if (bindEmail) {
					qPos.add(email);
				}

				if (bindCreateDate) {
					qPos.add(CalendarUtil.getTimestamp(createDate));
				}

				if (!pagination) {
					list = (List<NewUserLog>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NewUserLog>(list);
				}
				else {
					list = (List<NewUserLog>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first new user log in the ordered set where userName = &#63; and email = &#63; and createDate = &#63;.
	 *
	 * @param userName the user name
	 * @param email the email
	 * @param createDate the create date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching new user log
	 * @throws org.oep.core.logging.NoSuchNewUserLogException if a matching new user log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NewUserLog findByU_E_C_First(String userName, String email,
		Date createDate, OrderByComparator orderByComparator)
		throws NoSuchNewUserLogException, SystemException {
		NewUserLog newUserLog = fetchByU_E_C_First(userName, email, createDate,
				orderByComparator);

		if (newUserLog != null) {
			return newUserLog;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userName=");
		msg.append(userName);

		msg.append(", email=");
		msg.append(email);

		msg.append(", createDate=");
		msg.append(createDate);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNewUserLogException(msg.toString());
	}

	/**
	 * Returns the first new user log in the ordered set where userName = &#63; and email = &#63; and createDate = &#63;.
	 *
	 * @param userName the user name
	 * @param email the email
	 * @param createDate the create date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching new user log, or <code>null</code> if a matching new user log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NewUserLog fetchByU_E_C_First(String userName, String email,
		Date createDate, OrderByComparator orderByComparator)
		throws SystemException {
		List<NewUserLog> list = findByU_E_C(userName, email, createDate, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last new user log in the ordered set where userName = &#63; and email = &#63; and createDate = &#63;.
	 *
	 * @param userName the user name
	 * @param email the email
	 * @param createDate the create date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching new user log
	 * @throws org.oep.core.logging.NoSuchNewUserLogException if a matching new user log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NewUserLog findByU_E_C_Last(String userName, String email,
		Date createDate, OrderByComparator orderByComparator)
		throws NoSuchNewUserLogException, SystemException {
		NewUserLog newUserLog = fetchByU_E_C_Last(userName, email, createDate,
				orderByComparator);

		if (newUserLog != null) {
			return newUserLog;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userName=");
		msg.append(userName);

		msg.append(", email=");
		msg.append(email);

		msg.append(", createDate=");
		msg.append(createDate);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNewUserLogException(msg.toString());
	}

	/**
	 * Returns the last new user log in the ordered set where userName = &#63; and email = &#63; and createDate = &#63;.
	 *
	 * @param userName the user name
	 * @param email the email
	 * @param createDate the create date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching new user log, or <code>null</code> if a matching new user log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NewUserLog fetchByU_E_C_Last(String userName, String email,
		Date createDate, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByU_E_C(userName, email, createDate);

		if (count == 0) {
			return null;
		}

		List<NewUserLog> list = findByU_E_C(userName, email, createDate,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the new user logs before and after the current new user log in the ordered set where userName = &#63; and email = &#63; and createDate = &#63;.
	 *
	 * @param id the primary key of the current new user log
	 * @param userName the user name
	 * @param email the email
	 * @param createDate the create date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next new user log
	 * @throws org.oep.core.logging.NoSuchNewUserLogException if a new user log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NewUserLog[] findByU_E_C_PrevAndNext(long id, String userName,
		String email, Date createDate, OrderByComparator orderByComparator)
		throws NoSuchNewUserLogException, SystemException {
		NewUserLog newUserLog = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			NewUserLog[] array = new NewUserLogImpl[3];

			array[0] = getByU_E_C_PrevAndNext(session, newUserLog, userName,
					email, createDate, orderByComparator, true);

			array[1] = newUserLog;

			array[2] = getByU_E_C_PrevAndNext(session, newUserLog, userName,
					email, createDate, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected NewUserLog getByU_E_C_PrevAndNext(Session session,
		NewUserLog newUserLog, String userName, String email, Date createDate,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_NEWUSERLOG_WHERE);

		boolean bindUserName = false;

		if (userName == null) {
			query.append(_FINDER_COLUMN_U_E_C_USERNAME_1);
		}
		else if (userName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_U_E_C_USERNAME_3);
		}
		else {
			bindUserName = true;

			query.append(_FINDER_COLUMN_U_E_C_USERNAME_2);
		}

		boolean bindEmail = false;

		if (email == null) {
			query.append(_FINDER_COLUMN_U_E_C_EMAIL_1);
		}
		else if (email.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_U_E_C_EMAIL_3);
		}
		else {
			bindEmail = true;

			query.append(_FINDER_COLUMN_U_E_C_EMAIL_2);
		}

		boolean bindCreateDate = false;

		if (createDate == null) {
			query.append(_FINDER_COLUMN_U_E_C_CREATEDATE_1);
		}
		else {
			bindCreateDate = true;

			query.append(_FINDER_COLUMN_U_E_C_CREATEDATE_2);
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
			query.append(NewUserLogModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUserName) {
			qPos.add(userName);
		}

		if (bindEmail) {
			qPos.add(email);
		}

		if (bindCreateDate) {
			qPos.add(CalendarUtil.getTimestamp(createDate));
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(newUserLog);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<NewUserLog> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the new user logs where userName = &#63; and email = &#63; and createDate = &#63; from the database.
	 *
	 * @param userName the user name
	 * @param email the email
	 * @param createDate the create date
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByU_E_C(String userName, String email, Date createDate)
		throws SystemException {
		for (NewUserLog newUserLog : findByU_E_C(userName, email, createDate,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(newUserLog);
		}
	}

	/**
	 * Returns the number of new user logs where userName = &#63; and email = &#63; and createDate = &#63;.
	 *
	 * @param userName the user name
	 * @param email the email
	 * @param createDate the create date
	 * @return the number of matching new user logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByU_E_C(String userName, String email, Date createDate)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_U_E_C;

		Object[] finderArgs = new Object[] { userName, email, createDate };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_NEWUSERLOG_WHERE);

			boolean bindUserName = false;

			if (userName == null) {
				query.append(_FINDER_COLUMN_U_E_C_USERNAME_1);
			}
			else if (userName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_U_E_C_USERNAME_3);
			}
			else {
				bindUserName = true;

				query.append(_FINDER_COLUMN_U_E_C_USERNAME_2);
			}

			boolean bindEmail = false;

			if (email == null) {
				query.append(_FINDER_COLUMN_U_E_C_EMAIL_1);
			}
			else if (email.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_U_E_C_EMAIL_3);
			}
			else {
				bindEmail = true;

				query.append(_FINDER_COLUMN_U_E_C_EMAIL_2);
			}

			boolean bindCreateDate = false;

			if (createDate == null) {
				query.append(_FINDER_COLUMN_U_E_C_CREATEDATE_1);
			}
			else {
				bindCreateDate = true;

				query.append(_FINDER_COLUMN_U_E_C_CREATEDATE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUserName) {
					qPos.add(userName);
				}

				if (bindEmail) {
					qPos.add(email);
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

	private static final String _FINDER_COLUMN_U_E_C_USERNAME_1 = "newUserLog.userName IS NULL AND ";
	private static final String _FINDER_COLUMN_U_E_C_USERNAME_2 = "newUserLog.userName = ? AND ";
	private static final String _FINDER_COLUMN_U_E_C_USERNAME_3 = "(newUserLog.userName IS NULL OR newUserLog.userName = '') AND ";
	private static final String _FINDER_COLUMN_U_E_C_EMAIL_1 = "newUserLog.email IS NULL AND ";
	private static final String _FINDER_COLUMN_U_E_C_EMAIL_2 = "newUserLog.email = ? AND ";
	private static final String _FINDER_COLUMN_U_E_C_EMAIL_3 = "(newUserLog.email IS NULL OR newUserLog.email = '') AND ";
	private static final String _FINDER_COLUMN_U_E_C_CREATEDATE_1 = "newUserLog.createDate IS NULL";
	private static final String _FINDER_COLUMN_U_E_C_CREATEDATE_2 = "newUserLog.createDate = ?";

	public NewUserLogPersistenceImpl() {
		setModelClass(NewUserLog.class);
	}

	/**
	 * Caches the new user log in the entity cache if it is enabled.
	 *
	 * @param newUserLog the new user log
	 */
	@Override
	public void cacheResult(NewUserLog newUserLog) {
		EntityCacheUtil.putResult(NewUserLogModelImpl.ENTITY_CACHE_ENABLED,
			NewUserLogImpl.class, newUserLog.getPrimaryKey(), newUserLog);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_U,
			new Object[] { newUserLog.getUserId() }, newUserLog);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UAI,
			new Object[] { newUserLog.getUserActivityId() }, newUserLog);

		newUserLog.resetOriginalValues();
	}

	/**
	 * Caches the new user logs in the entity cache if it is enabled.
	 *
	 * @param newUserLogs the new user logs
	 */
	@Override
	public void cacheResult(List<NewUserLog> newUserLogs) {
		for (NewUserLog newUserLog : newUserLogs) {
			if (EntityCacheUtil.getResult(
						NewUserLogModelImpl.ENTITY_CACHE_ENABLED,
						NewUserLogImpl.class, newUserLog.getPrimaryKey()) == null) {
				cacheResult(newUserLog);
			}
			else {
				newUserLog.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all new user logs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(NewUserLogImpl.class.getName());
		}

		EntityCacheUtil.clearCache(NewUserLogImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the new user log.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NewUserLog newUserLog) {
		EntityCacheUtil.removeResult(NewUserLogModelImpl.ENTITY_CACHE_ENABLED,
			NewUserLogImpl.class, newUserLog.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(newUserLog);
	}

	@Override
	public void clearCache(List<NewUserLog> newUserLogs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (NewUserLog newUserLog : newUserLogs) {
			EntityCacheUtil.removeResult(NewUserLogModelImpl.ENTITY_CACHE_ENABLED,
				NewUserLogImpl.class, newUserLog.getPrimaryKey());

			clearUniqueFindersCache(newUserLog);
		}
	}

	protected void cacheUniqueFindersCache(NewUserLog newUserLog) {
		if (newUserLog.isNew()) {
			Object[] args = new Object[] { newUserLog.getUserId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_U, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_U, args, newUserLog);

			args = new Object[] { newUserLog.getUserActivityId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UAI, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UAI, args, newUserLog);
		}
		else {
			NewUserLogModelImpl newUserLogModelImpl = (NewUserLogModelImpl)newUserLog;

			if ((newUserLogModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_U.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { newUserLog.getUserId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_U, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_U, args,
					newUserLog);
			}

			if ((newUserLogModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UAI.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { newUserLog.getUserActivityId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UAI, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UAI, args,
					newUserLog);
			}
		}
	}

	protected void clearUniqueFindersCache(NewUserLog newUserLog) {
		NewUserLogModelImpl newUserLogModelImpl = (NewUserLogModelImpl)newUserLog;

		Object[] args = new Object[] { newUserLog.getUserId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_U, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_U, args);

		if ((newUserLogModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_U.getColumnBitmask()) != 0) {
			args = new Object[] { newUserLogModelImpl.getOriginalUserId() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_U, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_U, args);
		}

		args = new Object[] { newUserLog.getUserActivityId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UAI, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UAI, args);

		if ((newUserLogModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UAI.getColumnBitmask()) != 0) {
			args = new Object[] { newUserLogModelImpl.getOriginalUserActivityId() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UAI, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UAI, args);
		}
	}

	/**
	 * Creates a new new user log with the primary key. Does not add the new user log to the database.
	 *
	 * @param id the primary key for the new new user log
	 * @return the new new user log
	 */
	@Override
	public NewUserLog create(long id) {
		NewUserLog newUserLog = new NewUserLogImpl();

		newUserLog.setNew(true);
		newUserLog.setPrimaryKey(id);

		return newUserLog;
	}

	/**
	 * Removes the new user log with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the new user log
	 * @return the new user log that was removed
	 * @throws org.oep.core.logging.NoSuchNewUserLogException if a new user log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NewUserLog remove(long id)
		throws NoSuchNewUserLogException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the new user log with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the new user log
	 * @return the new user log that was removed
	 * @throws org.oep.core.logging.NoSuchNewUserLogException if a new user log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NewUserLog remove(Serializable primaryKey)
		throws NoSuchNewUserLogException, SystemException {
		Session session = null;

		try {
			session = openSession();

			NewUserLog newUserLog = (NewUserLog)session.get(NewUserLogImpl.class,
					primaryKey);

			if (newUserLog == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNewUserLogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(newUserLog);
		}
		catch (NoSuchNewUserLogException nsee) {
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
	protected NewUserLog removeImpl(NewUserLog newUserLog)
		throws SystemException {
		newUserLog = toUnwrappedModel(newUserLog);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(newUserLog)) {
				newUserLog = (NewUserLog)session.get(NewUserLogImpl.class,
						newUserLog.getPrimaryKeyObj());
			}

			if (newUserLog != null) {
				session.delete(newUserLog);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (newUserLog != null) {
			clearCache(newUserLog);
		}

		return newUserLog;
	}

	@Override
	public NewUserLog updateImpl(
		org.oep.core.logging.model.NewUserLog newUserLog)
		throws SystemException {
		newUserLog = toUnwrappedModel(newUserLog);

		boolean isNew = newUserLog.isNew();

		NewUserLogModelImpl newUserLogModelImpl = (NewUserLogModelImpl)newUserLog;

		Session session = null;

		try {
			session = openSession();

			if (newUserLog.isNew()) {
				session.save(newUserLog);

				newUserLog.setNew(false);
			}
			else {
				session.merge(newUserLog);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !NewUserLogModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((newUserLogModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_E_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						newUserLogModelImpl.getOriginalUserName(),
						newUserLogModelImpl.getOriginalEmail(),
						newUserLogModelImpl.getOriginalCreateDate()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_U_E_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_E_C,
					args);

				args = new Object[] {
						newUserLogModelImpl.getUserName(),
						newUserLogModelImpl.getEmail(),
						newUserLogModelImpl.getCreateDate()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_U_E_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_E_C,
					args);
			}
		}

		EntityCacheUtil.putResult(NewUserLogModelImpl.ENTITY_CACHE_ENABLED,
			NewUserLogImpl.class, newUserLog.getPrimaryKey(), newUserLog);

		clearUniqueFindersCache(newUserLog);
		cacheUniqueFindersCache(newUserLog);

		return newUserLog;
	}

	protected NewUserLog toUnwrappedModel(NewUserLog newUserLog) {
		if (newUserLog instanceof NewUserLogImpl) {
			return newUserLog;
		}

		NewUserLogImpl newUserLogImpl = new NewUserLogImpl();

		newUserLogImpl.setNew(newUserLog.isNew());
		newUserLogImpl.setPrimaryKey(newUserLog.getPrimaryKey());

		newUserLogImpl.setId(newUserLog.getId());
		newUserLogImpl.setUserActivityId(newUserLog.getUserActivityId());
		newUserLogImpl.setUserId(newUserLog.getUserId());
		newUserLogImpl.setGroupId(newUserLog.getGroupId());
		newUserLogImpl.setCompanyId(newUserLog.getCompanyId());
		newUserLogImpl.setCreateDate(newUserLog.getCreateDate());
		newUserLogImpl.setUserName(newUserLog.getUserName());
		newUserLogImpl.setEmail(newUserLog.getEmail());
		newUserLogImpl.setSite(newUserLog.getSite());
		newUserLogImpl.setPage(newUserLog.getPage());
		newUserLogImpl.setAction(newUserLog.getAction());
		newUserLogImpl.setDescription(newUserLog.getDescription());

		return newUserLogImpl;
	}

	/**
	 * Returns the new user log with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the new user log
	 * @return the new user log
	 * @throws org.oep.core.logging.NoSuchNewUserLogException if a new user log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NewUserLog findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNewUserLogException, SystemException {
		NewUserLog newUserLog = fetchByPrimaryKey(primaryKey);

		if (newUserLog == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNewUserLogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return newUserLog;
	}

	/**
	 * Returns the new user log with the primary key or throws a {@link org.oep.core.logging.NoSuchNewUserLogException} if it could not be found.
	 *
	 * @param id the primary key of the new user log
	 * @return the new user log
	 * @throws org.oep.core.logging.NoSuchNewUserLogException if a new user log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NewUserLog findByPrimaryKey(long id)
		throws NoSuchNewUserLogException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the new user log with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the new user log
	 * @return the new user log, or <code>null</code> if a new user log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NewUserLog fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		NewUserLog newUserLog = (NewUserLog)EntityCacheUtil.getResult(NewUserLogModelImpl.ENTITY_CACHE_ENABLED,
				NewUserLogImpl.class, primaryKey);

		if (newUserLog == _nullNewUserLog) {
			return null;
		}

		if (newUserLog == null) {
			Session session = null;

			try {
				session = openSession();

				newUserLog = (NewUserLog)session.get(NewUserLogImpl.class,
						primaryKey);

				if (newUserLog != null) {
					cacheResult(newUserLog);
				}
				else {
					EntityCacheUtil.putResult(NewUserLogModelImpl.ENTITY_CACHE_ENABLED,
						NewUserLogImpl.class, primaryKey, _nullNewUserLog);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(NewUserLogModelImpl.ENTITY_CACHE_ENABLED,
					NewUserLogImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return newUserLog;
	}

	/**
	 * Returns the new user log with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the new user log
	 * @return the new user log, or <code>null</code> if a new user log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NewUserLog fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the new user logs.
	 *
	 * @return the new user logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NewUserLog> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the new user logs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.logging.model.impl.NewUserLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of new user logs
	 * @param end the upper bound of the range of new user logs (not inclusive)
	 * @return the range of new user logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NewUserLog> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the new user logs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.logging.model.impl.NewUserLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of new user logs
	 * @param end the upper bound of the range of new user logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of new user logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NewUserLog> findAll(int start, int end,
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

		List<NewUserLog> list = (List<NewUserLog>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_NEWUSERLOG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_NEWUSERLOG;

				if (pagination) {
					sql = sql.concat(NewUserLogModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<NewUserLog>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NewUserLog>(list);
				}
				else {
					list = (List<NewUserLog>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the new user logs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (NewUserLog newUserLog : findAll()) {
			remove(newUserLog);
		}
	}

	/**
	 * Returns the number of new user logs.
	 *
	 * @return the number of new user logs
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

				Query q = session.createQuery(_SQL_COUNT_NEWUSERLOG);

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
	 * Initializes the new user log persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.logging.model.NewUserLog")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<NewUserLog>> listenersList = new ArrayList<ModelListener<NewUserLog>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<NewUserLog>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(NewUserLogImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_NEWUSERLOG = "SELECT newUserLog FROM NewUserLog newUserLog";
	private static final String _SQL_SELECT_NEWUSERLOG_WHERE = "SELECT newUserLog FROM NewUserLog newUserLog WHERE ";
	private static final String _SQL_COUNT_NEWUSERLOG = "SELECT COUNT(newUserLog) FROM NewUserLog newUserLog";
	private static final String _SQL_COUNT_NEWUSERLOG_WHERE = "SELECT COUNT(newUserLog) FROM NewUserLog newUserLog WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "newUserLog.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No NewUserLog exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No NewUserLog exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(NewUserLogPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"userActivityId"
			});
	private static NewUserLog _nullNewUserLog = new NewUserLogImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<NewUserLog> toCacheModel() {
				return _nullNewUserLogCacheModel;
			}
		};

	private static CacheModel<NewUserLog> _nullNewUserLogCacheModel = new CacheModel<NewUserLog>() {
			@Override
			public NewUserLog toEntityModel() {
				return _nullNewUserLog;
			}
		};
}