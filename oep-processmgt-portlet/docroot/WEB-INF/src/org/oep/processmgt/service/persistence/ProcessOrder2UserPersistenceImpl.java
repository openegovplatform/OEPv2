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

package org.oep.processmgt.service.persistence;

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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.oep.processmgt.NoSuchProcessOrder2UserException;
import org.oep.processmgt.model.ProcessOrder2User;
import org.oep.processmgt.model.impl.ProcessOrder2UserImpl;
import org.oep.processmgt.model.impl.ProcessOrder2UserModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the process order2 user service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see ProcessOrder2UserPersistence
 * @see ProcessOrder2UserUtil
 * @generated
 */
public class ProcessOrder2UserPersistenceImpl extends BasePersistenceImpl<ProcessOrder2User>
	implements ProcessOrder2UserPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ProcessOrder2UserUtil} to access the process order2 user persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ProcessOrder2UserImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ProcessOrder2UserModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrder2UserModelImpl.FINDER_CACHE_ENABLED,
			ProcessOrder2UserImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ProcessOrder2UserModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrder2UserModelImpl.FINDER_CACHE_ENABLED,
			ProcessOrder2UserImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ProcessOrder2UserModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrder2UserModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_P = new FinderPath(ProcessOrder2UserModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrder2UserModelImpl.FINDER_CACHE_ENABLED,
			ProcessOrder2UserImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByP",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P = new FinderPath(ProcessOrder2UserModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrder2UserModelImpl.FINDER_CACHE_ENABLED,
			ProcessOrder2UserImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByP",
			new String[] { Long.class.getName() },
			ProcessOrder2UserModelImpl.PROCESSORDERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_P = new FinderPath(ProcessOrder2UserModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrder2UserModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByP",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the process order2 users where processOrderId = &#63;.
	 *
	 * @param processOrderId the process order ID
	 * @return the matching process order2 users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProcessOrder2User> findByP(long processOrderId)
		throws SystemException {
		return findByP(processOrderId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the process order2 users where processOrderId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.ProcessOrder2UserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param processOrderId the process order ID
	 * @param start the lower bound of the range of process order2 users
	 * @param end the upper bound of the range of process order2 users (not inclusive)
	 * @return the range of matching process order2 users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProcessOrder2User> findByP(long processOrderId, int start,
		int end) throws SystemException {
		return findByP(processOrderId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the process order2 users where processOrderId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.ProcessOrder2UserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param processOrderId the process order ID
	 * @param start the lower bound of the range of process order2 users
	 * @param end the upper bound of the range of process order2 users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching process order2 users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProcessOrder2User> findByP(long processOrderId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P;
			finderArgs = new Object[] { processOrderId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_P;
			finderArgs = new Object[] {
					processOrderId,
					
					start, end, orderByComparator
				};
		}

		List<ProcessOrder2User> list = (List<ProcessOrder2User>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ProcessOrder2User processOrder2User : list) {
				if ((processOrderId != processOrder2User.getProcessOrderId())) {
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

			query.append(_SQL_SELECT_PROCESSORDER2USER_WHERE);

			query.append(_FINDER_COLUMN_P_PROCESSORDERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ProcessOrder2UserModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(processOrderId);

				if (!pagination) {
					list = (List<ProcessOrder2User>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ProcessOrder2User>(list);
				}
				else {
					list = (List<ProcessOrder2User>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first process order2 user in the ordered set where processOrderId = &#63;.
	 *
	 * @param processOrderId the process order ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching process order2 user
	 * @throws org.oep.processmgt.NoSuchProcessOrder2UserException if a matching process order2 user could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder2User findByP_First(long processOrderId,
		OrderByComparator orderByComparator)
		throws NoSuchProcessOrder2UserException, SystemException {
		ProcessOrder2User processOrder2User = fetchByP_First(processOrderId,
				orderByComparator);

		if (processOrder2User != null) {
			return processOrder2User;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("processOrderId=");
		msg.append(processOrderId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProcessOrder2UserException(msg.toString());
	}

	/**
	 * Returns the first process order2 user in the ordered set where processOrderId = &#63;.
	 *
	 * @param processOrderId the process order ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching process order2 user, or <code>null</code> if a matching process order2 user could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder2User fetchByP_First(long processOrderId,
		OrderByComparator orderByComparator) throws SystemException {
		List<ProcessOrder2User> list = findByP(processOrderId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last process order2 user in the ordered set where processOrderId = &#63;.
	 *
	 * @param processOrderId the process order ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching process order2 user
	 * @throws org.oep.processmgt.NoSuchProcessOrder2UserException if a matching process order2 user could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder2User findByP_Last(long processOrderId,
		OrderByComparator orderByComparator)
		throws NoSuchProcessOrder2UserException, SystemException {
		ProcessOrder2User processOrder2User = fetchByP_Last(processOrderId,
				orderByComparator);

		if (processOrder2User != null) {
			return processOrder2User;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("processOrderId=");
		msg.append(processOrderId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProcessOrder2UserException(msg.toString());
	}

	/**
	 * Returns the last process order2 user in the ordered set where processOrderId = &#63;.
	 *
	 * @param processOrderId the process order ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching process order2 user, or <code>null</code> if a matching process order2 user could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder2User fetchByP_Last(long processOrderId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByP(processOrderId);

		if (count == 0) {
			return null;
		}

		List<ProcessOrder2User> list = findByP(processOrderId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the process order2 users before and after the current process order2 user in the ordered set where processOrderId = &#63;.
	 *
	 * @param processOrder2UserPK the primary key of the current process order2 user
	 * @param processOrderId the process order ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next process order2 user
	 * @throws org.oep.processmgt.NoSuchProcessOrder2UserException if a process order2 user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder2User[] findByP_PrevAndNext(
		ProcessOrder2UserPK processOrder2UserPK, long processOrderId,
		OrderByComparator orderByComparator)
		throws NoSuchProcessOrder2UserException, SystemException {
		ProcessOrder2User processOrder2User = findByPrimaryKey(processOrder2UserPK);

		Session session = null;

		try {
			session = openSession();

			ProcessOrder2User[] array = new ProcessOrder2UserImpl[3];

			array[0] = getByP_PrevAndNext(session, processOrder2User,
					processOrderId, orderByComparator, true);

			array[1] = processOrder2User;

			array[2] = getByP_PrevAndNext(session, processOrder2User,
					processOrderId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ProcessOrder2User getByP_PrevAndNext(Session session,
		ProcessOrder2User processOrder2User, long processOrderId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PROCESSORDER2USER_WHERE);

		query.append(_FINDER_COLUMN_P_PROCESSORDERID_2);

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
			query.append(ProcessOrder2UserModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(processOrderId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(processOrder2User);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ProcessOrder2User> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the process order2 users where processOrderId = &#63; from the database.
	 *
	 * @param processOrderId the process order ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByP(long processOrderId) throws SystemException {
		for (ProcessOrder2User processOrder2User : findByP(processOrderId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(processOrder2User);
		}
	}

	/**
	 * Returns the number of process order2 users where processOrderId = &#63;.
	 *
	 * @param processOrderId the process order ID
	 * @return the number of matching process order2 users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByP(long processOrderId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_P;

		Object[] finderArgs = new Object[] { processOrderId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PROCESSORDER2USER_WHERE);

			query.append(_FINDER_COLUMN_P_PROCESSORDERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(processOrderId);

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

	private static final String _FINDER_COLUMN_P_PROCESSORDERID_2 = "processOrder2User.id.processOrderId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_U = new FinderPath(ProcessOrder2UserModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrder2UserModelImpl.FINDER_CACHE_ENABLED,
			ProcessOrder2UserImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByU",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U = new FinderPath(ProcessOrder2UserModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrder2UserModelImpl.FINDER_CACHE_ENABLED,
			ProcessOrder2UserImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByU",
			new String[] { Long.class.getName() },
			ProcessOrder2UserModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_U = new FinderPath(ProcessOrder2UserModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrder2UserModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByU",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the process order2 users where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching process order2 users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProcessOrder2User> findByU(long userId)
		throws SystemException {
		return findByU(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the process order2 users where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.ProcessOrder2UserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of process order2 users
	 * @param end the upper bound of the range of process order2 users (not inclusive)
	 * @return the range of matching process order2 users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProcessOrder2User> findByU(long userId, int start, int end)
		throws SystemException {
		return findByU(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the process order2 users where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.ProcessOrder2UserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of process order2 users
	 * @param end the upper bound of the range of process order2 users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching process order2 users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProcessOrder2User> findByU(long userId, int start, int end,
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

		List<ProcessOrder2User> list = (List<ProcessOrder2User>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ProcessOrder2User processOrder2User : list) {
				if ((userId != processOrder2User.getUserId())) {
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

			query.append(_SQL_SELECT_PROCESSORDER2USER_WHERE);

			query.append(_FINDER_COLUMN_U_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ProcessOrder2UserModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<ProcessOrder2User>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ProcessOrder2User>(list);
				}
				else {
					list = (List<ProcessOrder2User>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first process order2 user in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching process order2 user
	 * @throws org.oep.processmgt.NoSuchProcessOrder2UserException if a matching process order2 user could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder2User findByU_First(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchProcessOrder2UserException, SystemException {
		ProcessOrder2User processOrder2User = fetchByU_First(userId,
				orderByComparator);

		if (processOrder2User != null) {
			return processOrder2User;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProcessOrder2UserException(msg.toString());
	}

	/**
	 * Returns the first process order2 user in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching process order2 user, or <code>null</code> if a matching process order2 user could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder2User fetchByU_First(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		List<ProcessOrder2User> list = findByU(userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last process order2 user in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching process order2 user
	 * @throws org.oep.processmgt.NoSuchProcessOrder2UserException if a matching process order2 user could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder2User findByU_Last(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchProcessOrder2UserException, SystemException {
		ProcessOrder2User processOrder2User = fetchByU_Last(userId,
				orderByComparator);

		if (processOrder2User != null) {
			return processOrder2User;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProcessOrder2UserException(msg.toString());
	}

	/**
	 * Returns the last process order2 user in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching process order2 user, or <code>null</code> if a matching process order2 user could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder2User fetchByU_Last(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByU(userId);

		if (count == 0) {
			return null;
		}

		List<ProcessOrder2User> list = findByU(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the process order2 users before and after the current process order2 user in the ordered set where userId = &#63;.
	 *
	 * @param processOrder2UserPK the primary key of the current process order2 user
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next process order2 user
	 * @throws org.oep.processmgt.NoSuchProcessOrder2UserException if a process order2 user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder2User[] findByU_PrevAndNext(
		ProcessOrder2UserPK processOrder2UserPK, long userId,
		OrderByComparator orderByComparator)
		throws NoSuchProcessOrder2UserException, SystemException {
		ProcessOrder2User processOrder2User = findByPrimaryKey(processOrder2UserPK);

		Session session = null;

		try {
			session = openSession();

			ProcessOrder2User[] array = new ProcessOrder2UserImpl[3];

			array[0] = getByU_PrevAndNext(session, processOrder2User, userId,
					orderByComparator, true);

			array[1] = processOrder2User;

			array[2] = getByU_PrevAndNext(session, processOrder2User, userId,
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

	protected ProcessOrder2User getByU_PrevAndNext(Session session,
		ProcessOrder2User processOrder2User, long userId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PROCESSORDER2USER_WHERE);

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
			query.append(ProcessOrder2UserModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(processOrder2User);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ProcessOrder2User> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the process order2 users where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByU(long userId) throws SystemException {
		for (ProcessOrder2User processOrder2User : findByU(userId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(processOrder2User);
		}
	}

	/**
	 * Returns the number of process order2 users where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching process order2 users
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

			query.append(_SQL_COUNT_PROCESSORDER2USER_WHERE);

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

	private static final String _FINDER_COLUMN_U_USERID_2 = "processOrder2User.id.userId = ?";

	public ProcessOrder2UserPersistenceImpl() {
		setModelClass(ProcessOrder2User.class);
	}

	/**
	 * Caches the process order2 user in the entity cache if it is enabled.
	 *
	 * @param processOrder2User the process order2 user
	 */
	@Override
	public void cacheResult(ProcessOrder2User processOrder2User) {
		EntityCacheUtil.putResult(ProcessOrder2UserModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrder2UserImpl.class, processOrder2User.getPrimaryKey(),
			processOrder2User);

		processOrder2User.resetOriginalValues();
	}

	/**
	 * Caches the process order2 users in the entity cache if it is enabled.
	 *
	 * @param processOrder2Users the process order2 users
	 */
	@Override
	public void cacheResult(List<ProcessOrder2User> processOrder2Users) {
		for (ProcessOrder2User processOrder2User : processOrder2Users) {
			if (EntityCacheUtil.getResult(
						ProcessOrder2UserModelImpl.ENTITY_CACHE_ENABLED,
						ProcessOrder2UserImpl.class,
						processOrder2User.getPrimaryKey()) == null) {
				cacheResult(processOrder2User);
			}
			else {
				processOrder2User.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all process order2 users.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ProcessOrder2UserImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ProcessOrder2UserImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the process order2 user.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ProcessOrder2User processOrder2User) {
		EntityCacheUtil.removeResult(ProcessOrder2UserModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrder2UserImpl.class, processOrder2User.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ProcessOrder2User> processOrder2Users) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ProcessOrder2User processOrder2User : processOrder2Users) {
			EntityCacheUtil.removeResult(ProcessOrder2UserModelImpl.ENTITY_CACHE_ENABLED,
				ProcessOrder2UserImpl.class, processOrder2User.getPrimaryKey());
		}
	}

	/**
	 * Creates a new process order2 user with the primary key. Does not add the process order2 user to the database.
	 *
	 * @param processOrder2UserPK the primary key for the new process order2 user
	 * @return the new process order2 user
	 */
	@Override
	public ProcessOrder2User create(ProcessOrder2UserPK processOrder2UserPK) {
		ProcessOrder2User processOrder2User = new ProcessOrder2UserImpl();

		processOrder2User.setNew(true);
		processOrder2User.setPrimaryKey(processOrder2UserPK);

		return processOrder2User;
	}

	/**
	 * Removes the process order2 user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param processOrder2UserPK the primary key of the process order2 user
	 * @return the process order2 user that was removed
	 * @throws org.oep.processmgt.NoSuchProcessOrder2UserException if a process order2 user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder2User remove(ProcessOrder2UserPK processOrder2UserPK)
		throws NoSuchProcessOrder2UserException, SystemException {
		return remove((Serializable)processOrder2UserPK);
	}

	/**
	 * Removes the process order2 user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the process order2 user
	 * @return the process order2 user that was removed
	 * @throws org.oep.processmgt.NoSuchProcessOrder2UserException if a process order2 user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder2User remove(Serializable primaryKey)
		throws NoSuchProcessOrder2UserException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ProcessOrder2User processOrder2User = (ProcessOrder2User)session.get(ProcessOrder2UserImpl.class,
					primaryKey);

			if (processOrder2User == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchProcessOrder2UserException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(processOrder2User);
		}
		catch (NoSuchProcessOrder2UserException nsee) {
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
	protected ProcessOrder2User removeImpl(ProcessOrder2User processOrder2User)
		throws SystemException {
		processOrder2User = toUnwrappedModel(processOrder2User);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(processOrder2User)) {
				processOrder2User = (ProcessOrder2User)session.get(ProcessOrder2UserImpl.class,
						processOrder2User.getPrimaryKeyObj());
			}

			if (processOrder2User != null) {
				session.delete(processOrder2User);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (processOrder2User != null) {
			clearCache(processOrder2User);
		}

		return processOrder2User;
	}

	@Override
	public ProcessOrder2User updateImpl(
		org.oep.processmgt.model.ProcessOrder2User processOrder2User)
		throws SystemException {
		processOrder2User = toUnwrappedModel(processOrder2User);

		boolean isNew = processOrder2User.isNew();

		ProcessOrder2UserModelImpl processOrder2UserModelImpl = (ProcessOrder2UserModelImpl)processOrder2User;

		Session session = null;

		try {
			session = openSession();

			if (processOrder2User.isNew()) {
				session.save(processOrder2User);

				processOrder2User.setNew(false);
			}
			else {
				session.merge(processOrder2User);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ProcessOrder2UserModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((processOrder2UserModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						processOrder2UserModelImpl.getOriginalProcessOrderId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_P, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P,
					args);

				args = new Object[] {
						processOrder2UserModelImpl.getProcessOrderId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_P, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P,
					args);
			}

			if ((processOrder2UserModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						processOrder2UserModelImpl.getOriginalUserId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_U, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U,
					args);

				args = new Object[] { processOrder2UserModelImpl.getUserId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_U, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U,
					args);
			}
		}

		EntityCacheUtil.putResult(ProcessOrder2UserModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrder2UserImpl.class, processOrder2User.getPrimaryKey(),
			processOrder2User);

		return processOrder2User;
	}

	protected ProcessOrder2User toUnwrappedModel(
		ProcessOrder2User processOrder2User) {
		if (processOrder2User instanceof ProcessOrder2UserImpl) {
			return processOrder2User;
		}

		ProcessOrder2UserImpl processOrder2UserImpl = new ProcessOrder2UserImpl();

		processOrder2UserImpl.setNew(processOrder2User.isNew());
		processOrder2UserImpl.setPrimaryKey(processOrder2User.getPrimaryKey());

		processOrder2UserImpl.setProcessOrderId(processOrder2User.getProcessOrderId());
		processOrder2UserImpl.setUserId(processOrder2User.getUserId());

		return processOrder2UserImpl;
	}

	/**
	 * Returns the process order2 user with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the process order2 user
	 * @return the process order2 user
	 * @throws org.oep.processmgt.NoSuchProcessOrder2UserException if a process order2 user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder2User findByPrimaryKey(Serializable primaryKey)
		throws NoSuchProcessOrder2UserException, SystemException {
		ProcessOrder2User processOrder2User = fetchByPrimaryKey(primaryKey);

		if (processOrder2User == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchProcessOrder2UserException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return processOrder2User;
	}

	/**
	 * Returns the process order2 user with the primary key or throws a {@link org.oep.processmgt.NoSuchProcessOrder2UserException} if it could not be found.
	 *
	 * @param processOrder2UserPK the primary key of the process order2 user
	 * @return the process order2 user
	 * @throws org.oep.processmgt.NoSuchProcessOrder2UserException if a process order2 user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder2User findByPrimaryKey(
		ProcessOrder2UserPK processOrder2UserPK)
		throws NoSuchProcessOrder2UserException, SystemException {
		return findByPrimaryKey((Serializable)processOrder2UserPK);
	}

	/**
	 * Returns the process order2 user with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the process order2 user
	 * @return the process order2 user, or <code>null</code> if a process order2 user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder2User fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ProcessOrder2User processOrder2User = (ProcessOrder2User)EntityCacheUtil.getResult(ProcessOrder2UserModelImpl.ENTITY_CACHE_ENABLED,
				ProcessOrder2UserImpl.class, primaryKey);

		if (processOrder2User == _nullProcessOrder2User) {
			return null;
		}

		if (processOrder2User == null) {
			Session session = null;

			try {
				session = openSession();

				processOrder2User = (ProcessOrder2User)session.get(ProcessOrder2UserImpl.class,
						primaryKey);

				if (processOrder2User != null) {
					cacheResult(processOrder2User);
				}
				else {
					EntityCacheUtil.putResult(ProcessOrder2UserModelImpl.ENTITY_CACHE_ENABLED,
						ProcessOrder2UserImpl.class, primaryKey,
						_nullProcessOrder2User);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ProcessOrder2UserModelImpl.ENTITY_CACHE_ENABLED,
					ProcessOrder2UserImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return processOrder2User;
	}

	/**
	 * Returns the process order2 user with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param processOrder2UserPK the primary key of the process order2 user
	 * @return the process order2 user, or <code>null</code> if a process order2 user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder2User fetchByPrimaryKey(
		ProcessOrder2UserPK processOrder2UserPK) throws SystemException {
		return fetchByPrimaryKey((Serializable)processOrder2UserPK);
	}

	/**
	 * Returns all the process order2 users.
	 *
	 * @return the process order2 users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProcessOrder2User> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the process order2 users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.ProcessOrder2UserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of process order2 users
	 * @param end the upper bound of the range of process order2 users (not inclusive)
	 * @return the range of process order2 users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProcessOrder2User> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the process order2 users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.ProcessOrder2UserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of process order2 users
	 * @param end the upper bound of the range of process order2 users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of process order2 users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProcessOrder2User> findAll(int start, int end,
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

		List<ProcessOrder2User> list = (List<ProcessOrder2User>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PROCESSORDER2USER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PROCESSORDER2USER;

				if (pagination) {
					sql = sql.concat(ProcessOrder2UserModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ProcessOrder2User>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ProcessOrder2User>(list);
				}
				else {
					list = (List<ProcessOrder2User>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the process order2 users from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ProcessOrder2User processOrder2User : findAll()) {
			remove(processOrder2User);
		}
	}

	/**
	 * Returns the number of process order2 users.
	 *
	 * @return the number of process order2 users
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

				Query q = session.createQuery(_SQL_COUNT_PROCESSORDER2USER);

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
	 * Initializes the process order2 user persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.processmgt.model.ProcessOrder2User")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ProcessOrder2User>> listenersList = new ArrayList<ModelListener<ProcessOrder2User>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ProcessOrder2User>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ProcessOrder2UserImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PROCESSORDER2USER = "SELECT processOrder2User FROM ProcessOrder2User processOrder2User";
	private static final String _SQL_SELECT_PROCESSORDER2USER_WHERE = "SELECT processOrder2User FROM ProcessOrder2User processOrder2User WHERE ";
	private static final String _SQL_COUNT_PROCESSORDER2USER = "SELECT COUNT(processOrder2User) FROM ProcessOrder2User processOrder2User";
	private static final String _SQL_COUNT_PROCESSORDER2USER_WHERE = "SELECT COUNT(processOrder2User) FROM ProcessOrder2User processOrder2User WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "processOrder2User.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ProcessOrder2User exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ProcessOrder2User exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ProcessOrder2UserPersistenceImpl.class);
	private static ProcessOrder2User _nullProcessOrder2User = new ProcessOrder2UserImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ProcessOrder2User> toCacheModel() {
				return _nullProcessOrder2UserCacheModel;
			}
		};

	private static CacheModel<ProcessOrder2User> _nullProcessOrder2UserCacheModel =
		new CacheModel<ProcessOrder2User>() {
			@Override
			public ProcessOrder2User toEntityModel() {
				return _nullProcessOrder2User;
			}
		};
}