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

package org.oep.core.processmgt.service.persistence;

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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.oep.core.processmgt.NoSuchProcessOrderException;
import org.oep.core.processmgt.model.ProcessOrder;
import org.oep.core.processmgt.model.impl.ProcessOrderImpl;
import org.oep.core.processmgt.model.impl.ProcessOrderModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the process order service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see ProcessOrderPersistence
 * @see ProcessOrderUtil
 * @generated
 */
public class ProcessOrderPersistenceImpl extends BasePersistenceImpl<ProcessOrder>
	implements ProcessOrderPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ProcessOrderUtil} to access the process order persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ProcessOrderImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrderModelImpl.FINDER_CACHE_ENABLED, ProcessOrderImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrderModelImpl.FINDER_CACHE_ENABLED, ProcessOrderImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrderModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrderModelImpl.FINDER_CACHE_ENABLED, ProcessOrderImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrderModelImpl.FINDER_CACHE_ENABLED, ProcessOrderImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			ProcessOrderModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrderModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the process orders where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching process orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProcessOrder> findByUuid(String uuid) throws SystemException {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the process orders where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of process orders
	 * @param end the upper bound of the range of process orders (not inclusive)
	 * @return the range of matching process orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProcessOrder> findByUuid(String uuid, int start, int end)
		throws SystemException {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the process orders where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of process orders
	 * @param end the upper bound of the range of process orders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching process orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProcessOrder> findByUuid(String uuid, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<ProcessOrder> list = (List<ProcessOrder>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ProcessOrder processOrder : list) {
				if (!Validator.equals(uuid, processOrder.getUuid())) {
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

			query.append(_SQL_SELECT_PROCESSORDER_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ProcessOrderModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<ProcessOrder>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ProcessOrder>(list);
				}
				else {
					list = (List<ProcessOrder>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first process order in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching process order
	 * @throws org.oep.core.processmgt.NoSuchProcessOrderException if a matching process order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder findByUuid_First(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchProcessOrderException, SystemException {
		ProcessOrder processOrder = fetchByUuid_First(uuid, orderByComparator);

		if (processOrder != null) {
			return processOrder;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProcessOrderException(msg.toString());
	}

	/**
	 * Returns the first process order in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching process order, or <code>null</code> if a matching process order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder fetchByUuid_First(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		List<ProcessOrder> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last process order in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching process order
	 * @throws org.oep.core.processmgt.NoSuchProcessOrderException if a matching process order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder findByUuid_Last(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchProcessOrderException, SystemException {
		ProcessOrder processOrder = fetchByUuid_Last(uuid, orderByComparator);

		if (processOrder != null) {
			return processOrder;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProcessOrderException(msg.toString());
	}

	/**
	 * Returns the last process order in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching process order, or <code>null</code> if a matching process order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder fetchByUuid_Last(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<ProcessOrder> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the process orders before and after the current process order in the ordered set where uuid = &#63;.
	 *
	 * @param processOrderId the primary key of the current process order
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next process order
	 * @throws org.oep.core.processmgt.NoSuchProcessOrderException if a process order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder[] findByUuid_PrevAndNext(long processOrderId,
		String uuid, OrderByComparator orderByComparator)
		throws NoSuchProcessOrderException, SystemException {
		ProcessOrder processOrder = findByPrimaryKey(processOrderId);

		Session session = null;

		try {
			session = openSession();

			ProcessOrder[] array = new ProcessOrderImpl[3];

			array[0] = getByUuid_PrevAndNext(session, processOrder, uuid,
					orderByComparator, true);

			array[1] = processOrder;

			array[2] = getByUuid_PrevAndNext(session, processOrder, uuid,
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

	protected ProcessOrder getByUuid_PrevAndNext(Session session,
		ProcessOrder processOrder, String uuid,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PROCESSORDER_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
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
			query.append(ProcessOrderModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(processOrder);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ProcessOrder> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the process orders where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid(String uuid) throws SystemException {
		for (ProcessOrder processOrder : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(processOrder);
		}
	}

	/**
	 * Returns the number of process orders where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching process orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUuid(String uuid) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PROCESSORDER_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "processOrder.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "processOrder.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(processOrder.uuid IS NULL OR processOrder.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrderModelImpl.FINDER_CACHE_ENABLED, ProcessOrderImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			ProcessOrderModelImpl.UUID_COLUMN_BITMASK |
			ProcessOrderModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrderModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the process order where uuid = &#63; and groupId = &#63; or throws a {@link org.oep.core.processmgt.NoSuchProcessOrderException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching process order
	 * @throws org.oep.core.processmgt.NoSuchProcessOrderException if a matching process order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder findByUUID_G(String uuid, long groupId)
		throws NoSuchProcessOrderException, SystemException {
		ProcessOrder processOrder = fetchByUUID_G(uuid, groupId);

		if (processOrder == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchProcessOrderException(msg.toString());
		}

		return processOrder;
	}

	/**
	 * Returns the process order where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching process order, or <code>null</code> if a matching process order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder fetchByUUID_G(String uuid, long groupId)
		throws SystemException {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the process order where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching process order, or <code>null</code> if a matching process order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof ProcessOrder) {
			ProcessOrder processOrder = (ProcessOrder)result;

			if (!Validator.equals(uuid, processOrder.getUuid()) ||
					(groupId != processOrder.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_PROCESSORDER_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<ProcessOrder> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					ProcessOrder processOrder = list.get(0);

					result = processOrder;

					cacheResult(processOrder);

					if ((processOrder.getUuid() == null) ||
							!processOrder.getUuid().equals(uuid) ||
							(processOrder.getGroupId() != groupId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, processOrder);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
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
			return (ProcessOrder)result;
		}
	}

	/**
	 * Removes the process order where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the process order that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder removeByUUID_G(String uuid, long groupId)
		throws NoSuchProcessOrderException, SystemException {
		ProcessOrder processOrder = findByUUID_G(uuid, groupId);

		return remove(processOrder);
	}

	/**
	 * Returns the number of process orders where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching process orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PROCESSORDER_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "processOrder.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "processOrder.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(processOrder.uuid IS NULL OR processOrder.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "processOrder.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrderModelImpl.FINDER_CACHE_ENABLED, ProcessOrderImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrderModelImpl.FINDER_CACHE_ENABLED, ProcessOrderImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			ProcessOrderModelImpl.UUID_COLUMN_BITMASK |
			ProcessOrderModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrderModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the process orders where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching process orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProcessOrder> findByUuid_C(String uuid, long companyId)
		throws SystemException {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the process orders where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of process orders
	 * @param end the upper bound of the range of process orders (not inclusive)
	 * @return the range of matching process orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProcessOrder> findByUuid_C(String uuid, long companyId,
		int start, int end) throws SystemException {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the process orders where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of process orders
	 * @param end the upper bound of the range of process orders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching process orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProcessOrder> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<ProcessOrder> list = (List<ProcessOrder>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ProcessOrder processOrder : list) {
				if (!Validator.equals(uuid, processOrder.getUuid()) ||
						(companyId != processOrder.getCompanyId())) {
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

			query.append(_SQL_SELECT_PROCESSORDER_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ProcessOrderModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<ProcessOrder>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ProcessOrder>(list);
				}
				else {
					list = (List<ProcessOrder>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first process order in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching process order
	 * @throws org.oep.core.processmgt.NoSuchProcessOrderException if a matching process order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder findByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchProcessOrderException, SystemException {
		ProcessOrder processOrder = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (processOrder != null) {
			return processOrder;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProcessOrderException(msg.toString());
	}

	/**
	 * Returns the first process order in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching process order, or <code>null</code> if a matching process order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<ProcessOrder> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last process order in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching process order
	 * @throws org.oep.core.processmgt.NoSuchProcessOrderException if a matching process order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchProcessOrderException, SystemException {
		ProcessOrder processOrder = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (processOrder != null) {
			return processOrder;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProcessOrderException(msg.toString());
	}

	/**
	 * Returns the last process order in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching process order, or <code>null</code> if a matching process order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<ProcessOrder> list = findByUuid_C(uuid, companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the process orders before and after the current process order in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param processOrderId the primary key of the current process order
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next process order
	 * @throws org.oep.core.processmgt.NoSuchProcessOrderException if a process order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder[] findByUuid_C_PrevAndNext(long processOrderId,
		String uuid, long companyId, OrderByComparator orderByComparator)
		throws NoSuchProcessOrderException, SystemException {
		ProcessOrder processOrder = findByPrimaryKey(processOrderId);

		Session session = null;

		try {
			session = openSession();

			ProcessOrder[] array = new ProcessOrderImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, processOrder, uuid,
					companyId, orderByComparator, true);

			array[1] = processOrder;

			array[2] = getByUuid_C_PrevAndNext(session, processOrder, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ProcessOrder getByUuid_C_PrevAndNext(Session session,
		ProcessOrder processOrder, String uuid, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PROCESSORDER_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

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
			query.append(ProcessOrderModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(processOrder);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ProcessOrder> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the process orders where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId)
		throws SystemException {
		for (ProcessOrder processOrder : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(processOrder);
		}
	}

	/**
	 * Returns the number of process orders where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching process orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PROCESSORDER_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "processOrder.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "processOrder.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(processOrder.uuid IS NULL OR processOrder.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "processOrder.companyId = ?";

	public ProcessOrderPersistenceImpl() {
		setModelClass(ProcessOrder.class);
	}

	/**
	 * Caches the process order in the entity cache if it is enabled.
	 *
	 * @param processOrder the process order
	 */
	@Override
	public void cacheResult(ProcessOrder processOrder) {
		EntityCacheUtil.putResult(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrderImpl.class, processOrder.getPrimaryKey(), processOrder);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { processOrder.getUuid(), processOrder.getGroupId() },
			processOrder);

		processOrder.resetOriginalValues();
	}

	/**
	 * Caches the process orders in the entity cache if it is enabled.
	 *
	 * @param processOrders the process orders
	 */
	@Override
	public void cacheResult(List<ProcessOrder> processOrders) {
		for (ProcessOrder processOrder : processOrders) {
			if (EntityCacheUtil.getResult(
						ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
						ProcessOrderImpl.class, processOrder.getPrimaryKey()) == null) {
				cacheResult(processOrder);
			}
			else {
				processOrder.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all process orders.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ProcessOrderImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ProcessOrderImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the process order.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ProcessOrder processOrder) {
		EntityCacheUtil.removeResult(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrderImpl.class, processOrder.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(processOrder);
	}

	@Override
	public void clearCache(List<ProcessOrder> processOrders) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ProcessOrder processOrder : processOrders) {
			EntityCacheUtil.removeResult(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
				ProcessOrderImpl.class, processOrder.getPrimaryKey());

			clearUniqueFindersCache(processOrder);
		}
	}

	protected void cacheUniqueFindersCache(ProcessOrder processOrder) {
		if (processOrder.isNew()) {
			Object[] args = new Object[] {
					processOrder.getUuid(), processOrder.getGroupId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
				processOrder);
		}
		else {
			ProcessOrderModelImpl processOrderModelImpl = (ProcessOrderModelImpl)processOrder;

			if ((processOrderModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						processOrder.getUuid(), processOrder.getGroupId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
					processOrder);
			}
		}
	}

	protected void clearUniqueFindersCache(ProcessOrder processOrder) {
		ProcessOrderModelImpl processOrderModelImpl = (ProcessOrderModelImpl)processOrder;

		Object[] args = new Object[] {
				processOrder.getUuid(), processOrder.getGroupId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

		if ((processOrderModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			args = new Object[] {
					processOrderModelImpl.getOriginalUuid(),
					processOrderModelImpl.getOriginalGroupId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new process order with the primary key. Does not add the process order to the database.
	 *
	 * @param processOrderId the primary key for the new process order
	 * @return the new process order
	 */
	@Override
	public ProcessOrder create(long processOrderId) {
		ProcessOrder processOrder = new ProcessOrderImpl();

		processOrder.setNew(true);
		processOrder.setPrimaryKey(processOrderId);

		String uuid = PortalUUIDUtil.generate();

		processOrder.setUuid(uuid);

		return processOrder;
	}

	/**
	 * Removes the process order with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param processOrderId the primary key of the process order
	 * @return the process order that was removed
	 * @throws org.oep.core.processmgt.NoSuchProcessOrderException if a process order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder remove(long processOrderId)
		throws NoSuchProcessOrderException, SystemException {
		return remove((Serializable)processOrderId);
	}

	/**
	 * Removes the process order with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the process order
	 * @return the process order that was removed
	 * @throws org.oep.core.processmgt.NoSuchProcessOrderException if a process order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder remove(Serializable primaryKey)
		throws NoSuchProcessOrderException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ProcessOrder processOrder = (ProcessOrder)session.get(ProcessOrderImpl.class,
					primaryKey);

			if (processOrder == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchProcessOrderException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(processOrder);
		}
		catch (NoSuchProcessOrderException nsee) {
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
	protected ProcessOrder removeImpl(ProcessOrder processOrder)
		throws SystemException {
		processOrder = toUnwrappedModel(processOrder);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(processOrder)) {
				processOrder = (ProcessOrder)session.get(ProcessOrderImpl.class,
						processOrder.getPrimaryKeyObj());
			}

			if (processOrder != null) {
				session.delete(processOrder);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (processOrder != null) {
			clearCache(processOrder);
		}

		return processOrder;
	}

	@Override
	public ProcessOrder updateImpl(
		org.oep.core.processmgt.model.ProcessOrder processOrder)
		throws SystemException {
		processOrder = toUnwrappedModel(processOrder);

		boolean isNew = processOrder.isNew();

		ProcessOrderModelImpl processOrderModelImpl = (ProcessOrderModelImpl)processOrder;

		if (Validator.isNull(processOrder.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			processOrder.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (processOrder.isNew()) {
				session.save(processOrder);

				processOrder.setNew(false);
			}
			else {
				session.merge(processOrder);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ProcessOrderModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((processOrderModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						processOrderModelImpl.getOriginalUuid()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { processOrderModelImpl.getUuid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((processOrderModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						processOrderModelImpl.getOriginalUuid(),
						processOrderModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						processOrderModelImpl.getUuid(),
						processOrderModelImpl.getCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}
		}

		EntityCacheUtil.putResult(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrderImpl.class, processOrder.getPrimaryKey(), processOrder);

		clearUniqueFindersCache(processOrder);
		cacheUniqueFindersCache(processOrder);

		return processOrder;
	}

	protected ProcessOrder toUnwrappedModel(ProcessOrder processOrder) {
		if (processOrder instanceof ProcessOrderImpl) {
			return processOrder;
		}

		ProcessOrderImpl processOrderImpl = new ProcessOrderImpl();

		processOrderImpl.setNew(processOrder.isNew());
		processOrderImpl.setPrimaryKey(processOrder.getPrimaryKey());

		processOrderImpl.setUuid(processOrder.getUuid());
		processOrderImpl.setProcessOrderId(processOrder.getProcessOrderId());
		processOrderImpl.setUserId(processOrder.getUserId());
		processOrderImpl.setGroupId(processOrder.getGroupId());
		processOrderImpl.setCompanyId(processOrder.getCompanyId());
		processOrderImpl.setCreateDate(processOrder.getCreateDate());
		processOrderImpl.setModifiedDate(processOrder.getModifiedDate());
		processOrderImpl.setOrganizationId(processOrder.getOrganizationId());
		processOrderImpl.setParentProcessOrderId(processOrder.getParentProcessOrderId());
		processOrderImpl.setDossierId(processOrder.getDossierId());
		processOrderImpl.setDossierProcessId(processOrder.getDossierProcessId());
		processOrderImpl.setDossierStepId(processOrder.getDossierStepId());
		processOrderImpl.setOrderStatus(processOrder.getOrderStatus());
		processOrderImpl.setOrderResume(processOrder.getOrderResume());
		processOrderImpl.setStepDate(processOrder.getStepDate());
		processOrderImpl.setStepNote(processOrder.getStepNote());
		processOrderImpl.setAssignToUserId(processOrder.getAssignToUserId());
		processOrderImpl.setCurrentCondition(processOrder.getCurrentCondition());
		processOrderImpl.setLastStepTransitionId(processOrder.getLastStepTransitionId());
		processOrderImpl.setStopRollback(processOrder.getStopRollback());
		processOrderImpl.setEbPartnerShipId(processOrder.getEbPartnerShipId());

		return processOrderImpl;
	}

	/**
	 * Returns the process order with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the process order
	 * @return the process order
	 * @throws org.oep.core.processmgt.NoSuchProcessOrderException if a process order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder findByPrimaryKey(Serializable primaryKey)
		throws NoSuchProcessOrderException, SystemException {
		ProcessOrder processOrder = fetchByPrimaryKey(primaryKey);

		if (processOrder == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchProcessOrderException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return processOrder;
	}

	/**
	 * Returns the process order with the primary key or throws a {@link org.oep.core.processmgt.NoSuchProcessOrderException} if it could not be found.
	 *
	 * @param processOrderId the primary key of the process order
	 * @return the process order
	 * @throws org.oep.core.processmgt.NoSuchProcessOrderException if a process order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder findByPrimaryKey(long processOrderId)
		throws NoSuchProcessOrderException, SystemException {
		return findByPrimaryKey((Serializable)processOrderId);
	}

	/**
	 * Returns the process order with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the process order
	 * @return the process order, or <code>null</code> if a process order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ProcessOrder processOrder = (ProcessOrder)EntityCacheUtil.getResult(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
				ProcessOrderImpl.class, primaryKey);

		if (processOrder == _nullProcessOrder) {
			return null;
		}

		if (processOrder == null) {
			Session session = null;

			try {
				session = openSession();

				processOrder = (ProcessOrder)session.get(ProcessOrderImpl.class,
						primaryKey);

				if (processOrder != null) {
					cacheResult(processOrder);
				}
				else {
					EntityCacheUtil.putResult(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
						ProcessOrderImpl.class, primaryKey, _nullProcessOrder);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
					ProcessOrderImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return processOrder;
	}

	/**
	 * Returns the process order with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param processOrderId the primary key of the process order
	 * @return the process order, or <code>null</code> if a process order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder fetchByPrimaryKey(long processOrderId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)processOrderId);
	}

	/**
	 * Returns all the process orders.
	 *
	 * @return the process orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProcessOrder> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the process orders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of process orders
	 * @param end the upper bound of the range of process orders (not inclusive)
	 * @return the range of process orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProcessOrder> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the process orders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of process orders
	 * @param end the upper bound of the range of process orders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of process orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProcessOrder> findAll(int start, int end,
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

		List<ProcessOrder> list = (List<ProcessOrder>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PROCESSORDER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PROCESSORDER;

				if (pagination) {
					sql = sql.concat(ProcessOrderModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ProcessOrder>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ProcessOrder>(list);
				}
				else {
					list = (List<ProcessOrder>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the process orders from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ProcessOrder processOrder : findAll()) {
			remove(processOrder);
		}
	}

	/**
	 * Returns the number of process orders.
	 *
	 * @return the number of process orders
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

				Query q = session.createQuery(_SQL_COUNT_PROCESSORDER);

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
	 * Initializes the process order persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.processmgt.model.ProcessOrder")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ProcessOrder>> listenersList = new ArrayList<ModelListener<ProcessOrder>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ProcessOrder>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ProcessOrderImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PROCESSORDER = "SELECT processOrder FROM ProcessOrder processOrder";
	private static final String _SQL_SELECT_PROCESSORDER_WHERE = "SELECT processOrder FROM ProcessOrder processOrder WHERE ";
	private static final String _SQL_COUNT_PROCESSORDER = "SELECT COUNT(processOrder) FROM ProcessOrder processOrder";
	private static final String _SQL_COUNT_PROCESSORDER_WHERE = "SELECT COUNT(processOrder) FROM ProcessOrder processOrder WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "processOrder.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ProcessOrder exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ProcessOrder exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ProcessOrderPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
	private static ProcessOrder _nullProcessOrder = new ProcessOrderImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ProcessOrder> toCacheModel() {
				return _nullProcessOrderCacheModel;
			}
		};

	private static CacheModel<ProcessOrder> _nullProcessOrderCacheModel = new CacheModel<ProcessOrder>() {
			@Override
			public ProcessOrder toEntityModel() {
				return _nullProcessOrder;
			}
		};
}