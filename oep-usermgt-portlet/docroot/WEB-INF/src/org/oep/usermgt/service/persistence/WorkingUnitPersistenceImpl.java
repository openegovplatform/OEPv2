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

package org.oep.usermgt.service.persistence;

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

import org.oep.usermgt.NoSuchWorkingUnitException;
import org.oep.usermgt.model.WorkingUnit;
import org.oep.usermgt.model.impl.WorkingUnitImpl;
import org.oep.usermgt.model.impl.WorkingUnitModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the Working Unit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NQMINH
 * @see WorkingUnitPersistence
 * @see WorkingUnitUtil
 * @generated
 */
public class WorkingUnitPersistenceImpl extends BasePersistenceImpl<WorkingUnit>
	implements WorkingUnitPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link WorkingUnitUtil} to access the Working Unit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = WorkingUnitImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, WorkingUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, WorkingUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, WorkingUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, WorkingUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC",
			new String[] { Long.class.getName() },
			WorkingUnitModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the Working Units where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByC(long companyId) throws SystemException {
		return findByC(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Working Units where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of Working Units
	 * @param end the upper bound of the range of Working Units (not inclusive)
	 * @return the range of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByC(long companyId, int start, int end)
		throws SystemException {
		return findByC(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the Working Units where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of Working Units
	 * @param end the upper bound of the range of Working Units (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByC(long companyId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C;
			finderArgs = new Object[] { companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C;
			finderArgs = new Object[] { companyId, start, end, orderByComparator };
		}

		List<WorkingUnit> list = (List<WorkingUnit>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (WorkingUnit workingUnit : list) {
				if ((companyId != workingUnit.getCompanyId())) {
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

			query.append(_SQL_SELECT_WORKINGUNIT_WHERE);

			query.append(_FINDER_COLUMN_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(WorkingUnitModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<WorkingUnit>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<WorkingUnit>(list);
				}
				else {
					list = (List<WorkingUnit>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first Working Unit in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit findByC_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = fetchByC_First(companyId, orderByComparator);

		if (workingUnit != null) {
			return workingUnit;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWorkingUnitException(msg.toString());
	}

	/**
	 * Returns the first Working Unit in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit fetchByC_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<WorkingUnit> list = findByC(companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last Working Unit in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit findByC_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = fetchByC_Last(companyId, orderByComparator);

		if (workingUnit != null) {
			return workingUnit;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWorkingUnitException(msg.toString());
	}

	/**
	 * Returns the last Working Unit in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit fetchByC_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC(companyId);

		if (count == 0) {
			return null;
		}

		List<WorkingUnit> list = findByC(companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the Working Units before and after the current Working Unit in the ordered set where companyId = &#63;.
	 *
	 * @param workingUnitId the primary key of the current Working Unit
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a Working Unit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit[] findByC_PrevAndNext(long workingUnitId,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = findByPrimaryKey(workingUnitId);

		Session session = null;

		try {
			session = openSession();

			WorkingUnit[] array = new WorkingUnitImpl[3];

			array[0] = getByC_PrevAndNext(session, workingUnit, companyId,
					orderByComparator, true);

			array[1] = workingUnit;

			array[2] = getByC_PrevAndNext(session, workingUnit, companyId,
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

	protected WorkingUnit getByC_PrevAndNext(Session session,
		WorkingUnit workingUnit, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_WORKINGUNIT_WHERE);

		query.append(_FINDER_COLUMN_C_COMPANYID_2);

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
			query.append(WorkingUnitModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(workingUnit);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<WorkingUnit> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the Working Units where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC(long companyId) throws SystemException {
		for (WorkingUnit workingUnit : findByC(companyId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(workingUnit);
		}
	}

	/**
	 * Returns the number of Working Units where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC(long companyId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C;

		Object[] finderArgs = new Object[] { companyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_WORKINGUNIT_WHERE);

			query.append(_FINDER_COLUMN_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_C_COMPANYID_2 = "workingUnit.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, WorkingUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, WorkingUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG",
			new String[] { Long.class.getName() },
			WorkingUnitModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the Working Units where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByG(long groupId) throws SystemException {
		return findByG(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Working Units where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of Working Units
	 * @param end the upper bound of the range of Working Units (not inclusive)
	 * @return the range of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByG(long groupId, int start, int end)
		throws SystemException {
		return findByG(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the Working Units where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of Working Units
	 * @param end the upper bound of the range of Working Units (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByG(long groupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G;
			finderArgs = new Object[] { groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G;
			finderArgs = new Object[] { groupId, start, end, orderByComparator };
		}

		List<WorkingUnit> list = (List<WorkingUnit>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (WorkingUnit workingUnit : list) {
				if ((groupId != workingUnit.getGroupId())) {
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

			query.append(_SQL_SELECT_WORKINGUNIT_WHERE);

			query.append(_FINDER_COLUMN_G_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(WorkingUnitModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<WorkingUnit>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<WorkingUnit>(list);
				}
				else {
					list = (List<WorkingUnit>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first Working Unit in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit findByG_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = fetchByG_First(groupId, orderByComparator);

		if (workingUnit != null) {
			return workingUnit;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWorkingUnitException(msg.toString());
	}

	/**
	 * Returns the first Working Unit in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit fetchByG_First(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<WorkingUnit> list = findByG(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last Working Unit in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit findByG_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = fetchByG_Last(groupId, orderByComparator);

		if (workingUnit != null) {
			return workingUnit;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWorkingUnitException(msg.toString());
	}

	/**
	 * Returns the last Working Unit in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit fetchByG_Last(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByG(groupId);

		if (count == 0) {
			return null;
		}

		List<WorkingUnit> list = findByG(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the Working Units before and after the current Working Unit in the ordered set where groupId = &#63;.
	 *
	 * @param workingUnitId the primary key of the current Working Unit
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a Working Unit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit[] findByG_PrevAndNext(long workingUnitId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = findByPrimaryKey(workingUnitId);

		Session session = null;

		try {
			session = openSession();

			WorkingUnit[] array = new WorkingUnitImpl[3];

			array[0] = getByG_PrevAndNext(session, workingUnit, groupId,
					orderByComparator, true);

			array[1] = workingUnit;

			array[2] = getByG_PrevAndNext(session, workingUnit, groupId,
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

	protected WorkingUnit getByG_PrevAndNext(Session session,
		WorkingUnit workingUnit, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_WORKINGUNIT_WHERE);

		query.append(_FINDER_COLUMN_G_GROUPID_2);

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
			query.append(WorkingUnitModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(workingUnit);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<WorkingUnit> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the Working Units where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByG(long groupId) throws SystemException {
		for (WorkingUnit workingUnit : findByG(groupId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(workingUnit);
		}
	}

	/**
	 * Returns the number of Working Units where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByG(long groupId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_WORKINGUNIT_WHERE);

			query.append(_FINDER_COLUMN_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_G_GROUPID_2 = "workingUnit.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_O = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, WorkingUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByO",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, WorkingUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByO",
			new String[] { Long.class.getName() },
			WorkingUnitModelImpl.ORGANIZATIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_O = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByO",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the Working Units where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByO(long organizationId)
		throws SystemException {
		return findByO(organizationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the Working Units where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of Working Units
	 * @param end the upper bound of the range of Working Units (not inclusive)
	 * @return the range of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByO(long organizationId, int start, int end)
		throws SystemException {
		return findByO(organizationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the Working Units where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of Working Units
	 * @param end the upper bound of the range of Working Units (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByO(long organizationId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O;
			finderArgs = new Object[] { organizationId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_O;
			finderArgs = new Object[] {
					organizationId,
					
					start, end, orderByComparator
				};
		}

		List<WorkingUnit> list = (List<WorkingUnit>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (WorkingUnit workingUnit : list) {
				if ((organizationId != workingUnit.getOrganizationId())) {
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

			query.append(_SQL_SELECT_WORKINGUNIT_WHERE);

			query.append(_FINDER_COLUMN_O_ORGANIZATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(WorkingUnitModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(organizationId);

				if (!pagination) {
					list = (List<WorkingUnit>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<WorkingUnit>(list);
				}
				else {
					list = (List<WorkingUnit>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first Working Unit in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit findByO_First(long organizationId,
		OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = fetchByO_First(organizationId,
				orderByComparator);

		if (workingUnit != null) {
			return workingUnit;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationId=");
		msg.append(organizationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWorkingUnitException(msg.toString());
	}

	/**
	 * Returns the first Working Unit in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit fetchByO_First(long organizationId,
		OrderByComparator orderByComparator) throws SystemException {
		List<WorkingUnit> list = findByO(organizationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last Working Unit in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit findByO_Last(long organizationId,
		OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = fetchByO_Last(organizationId,
				orderByComparator);

		if (workingUnit != null) {
			return workingUnit;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationId=");
		msg.append(organizationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWorkingUnitException(msg.toString());
	}

	/**
	 * Returns the last Working Unit in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit fetchByO_Last(long organizationId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByO(organizationId);

		if (count == 0) {
			return null;
		}

		List<WorkingUnit> list = findByO(organizationId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the Working Units before and after the current Working Unit in the ordered set where organizationId = &#63;.
	 *
	 * @param workingUnitId the primary key of the current Working Unit
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a Working Unit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit[] findByO_PrevAndNext(long workingUnitId,
		long organizationId, OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = findByPrimaryKey(workingUnitId);

		Session session = null;

		try {
			session = openSession();

			WorkingUnit[] array = new WorkingUnitImpl[3];

			array[0] = getByO_PrevAndNext(session, workingUnit, organizationId,
					orderByComparator, true);

			array[1] = workingUnit;

			array[2] = getByO_PrevAndNext(session, workingUnit, organizationId,
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

	protected WorkingUnit getByO_PrevAndNext(Session session,
		WorkingUnit workingUnit, long organizationId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_WORKINGUNIT_WHERE);

		query.append(_FINDER_COLUMN_O_ORGANIZATIONID_2);

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
			query.append(WorkingUnitModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(organizationId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(workingUnit);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<WorkingUnit> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the Working Units where organizationId = &#63; from the database.
	 *
	 * @param organizationId the organization ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByO(long organizationId) throws SystemException {
		for (WorkingUnit workingUnit : findByO(organizationId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(workingUnit);
		}
	}

	/**
	 * Returns the number of Working Units where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the number of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByO(long organizationId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_O;

		Object[] finderArgs = new Object[] { organizationId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_WORKINGUNIT_WHERE);

			query.append(_FINDER_COLUMN_O_ORGANIZATIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(organizationId);

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

	private static final String _FINDER_COLUMN_O_ORGANIZATIONID_2 = "workingUnit.organizationId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GA = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, WorkingUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGA",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GA = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, WorkingUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGA",
			new String[] { String.class.getName() },
			WorkingUnitModelImpl.GOVAGENCYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GA = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGA",
			new String[] { String.class.getName() });

	/**
	 * Returns all the Working Units where govAgencyId = &#63;.
	 *
	 * @param govAgencyId the gov agency ID
	 * @return the matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByGA(String govAgencyId)
		throws SystemException {
		return findByGA(govAgencyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Working Units where govAgencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param govAgencyId the gov agency ID
	 * @param start the lower bound of the range of Working Units
	 * @param end the upper bound of the range of Working Units (not inclusive)
	 * @return the range of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByGA(String govAgencyId, int start, int end)
		throws SystemException {
		return findByGA(govAgencyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the Working Units where govAgencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param govAgencyId the gov agency ID
	 * @param start the lower bound of the range of Working Units
	 * @param end the upper bound of the range of Working Units (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByGA(String govAgencyId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GA;
			finderArgs = new Object[] { govAgencyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GA;
			finderArgs = new Object[] { govAgencyId, start, end, orderByComparator };
		}

		List<WorkingUnit> list = (List<WorkingUnit>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (WorkingUnit workingUnit : list) {
				if (!Validator.equals(govAgencyId, workingUnit.getGovAgencyId())) {
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

			query.append(_SQL_SELECT_WORKINGUNIT_WHERE);

			boolean bindGovAgencyId = false;

			if (govAgencyId == null) {
				query.append(_FINDER_COLUMN_GA_GOVAGENCYID_1);
			}
			else if (govAgencyId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GA_GOVAGENCYID_3);
			}
			else {
				bindGovAgencyId = true;

				query.append(_FINDER_COLUMN_GA_GOVAGENCYID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(WorkingUnitModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindGovAgencyId) {
					qPos.add(govAgencyId);
				}

				if (!pagination) {
					list = (List<WorkingUnit>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<WorkingUnit>(list);
				}
				else {
					list = (List<WorkingUnit>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first Working Unit in the ordered set where govAgencyId = &#63;.
	 *
	 * @param govAgencyId the gov agency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit findByGA_First(String govAgencyId,
		OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = fetchByGA_First(govAgencyId, orderByComparator);

		if (workingUnit != null) {
			return workingUnit;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("govAgencyId=");
		msg.append(govAgencyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWorkingUnitException(msg.toString());
	}

	/**
	 * Returns the first Working Unit in the ordered set where govAgencyId = &#63;.
	 *
	 * @param govAgencyId the gov agency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit fetchByGA_First(String govAgencyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<WorkingUnit> list = findByGA(govAgencyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last Working Unit in the ordered set where govAgencyId = &#63;.
	 *
	 * @param govAgencyId the gov agency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit findByGA_Last(String govAgencyId,
		OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = fetchByGA_Last(govAgencyId, orderByComparator);

		if (workingUnit != null) {
			return workingUnit;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("govAgencyId=");
		msg.append(govAgencyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWorkingUnitException(msg.toString());
	}

	/**
	 * Returns the last Working Unit in the ordered set where govAgencyId = &#63;.
	 *
	 * @param govAgencyId the gov agency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit fetchByGA_Last(String govAgencyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByGA(govAgencyId);

		if (count == 0) {
			return null;
		}

		List<WorkingUnit> list = findByGA(govAgencyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the Working Units before and after the current Working Unit in the ordered set where govAgencyId = &#63;.
	 *
	 * @param workingUnitId the primary key of the current Working Unit
	 * @param govAgencyId the gov agency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a Working Unit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit[] findByGA_PrevAndNext(long workingUnitId,
		String govAgencyId, OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = findByPrimaryKey(workingUnitId);

		Session session = null;

		try {
			session = openSession();

			WorkingUnit[] array = new WorkingUnitImpl[3];

			array[0] = getByGA_PrevAndNext(session, workingUnit, govAgencyId,
					orderByComparator, true);

			array[1] = workingUnit;

			array[2] = getByGA_PrevAndNext(session, workingUnit, govAgencyId,
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

	protected WorkingUnit getByGA_PrevAndNext(Session session,
		WorkingUnit workingUnit, String govAgencyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_WORKINGUNIT_WHERE);

		boolean bindGovAgencyId = false;

		if (govAgencyId == null) {
			query.append(_FINDER_COLUMN_GA_GOVAGENCYID_1);
		}
		else if (govAgencyId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_GA_GOVAGENCYID_3);
		}
		else {
			bindGovAgencyId = true;

			query.append(_FINDER_COLUMN_GA_GOVAGENCYID_2);
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
			query.append(WorkingUnitModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindGovAgencyId) {
			qPos.add(govAgencyId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(workingUnit);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<WorkingUnit> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the Working Units where govAgencyId = &#63; from the database.
	 *
	 * @param govAgencyId the gov agency ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGA(String govAgencyId) throws SystemException {
		for (WorkingUnit workingUnit : findByGA(govAgencyId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(workingUnit);
		}
	}

	/**
	 * Returns the number of Working Units where govAgencyId = &#63;.
	 *
	 * @param govAgencyId the gov agency ID
	 * @return the number of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByGA(String govAgencyId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GA;

		Object[] finderArgs = new Object[] { govAgencyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_WORKINGUNIT_WHERE);

			boolean bindGovAgencyId = false;

			if (govAgencyId == null) {
				query.append(_FINDER_COLUMN_GA_GOVAGENCYID_1);
			}
			else if (govAgencyId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GA_GOVAGENCYID_3);
			}
			else {
				bindGovAgencyId = true;

				query.append(_FINDER_COLUMN_GA_GOVAGENCYID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindGovAgencyId) {
					qPos.add(govAgencyId);
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

	private static final String _FINDER_COLUMN_GA_GOVAGENCYID_1 = "workingUnit.govAgencyId IS NULL";
	private static final String _FINDER_COLUMN_GA_GOVAGENCYID_2 = "workingUnit.govAgencyId = ?";
	private static final String _FINDER_COLUMN_GA_GOVAGENCYID_3 = "(workingUnit.govAgencyId IS NULL OR workingUnit.govAgencyId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CN = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, WorkingUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCN",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CN = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, WorkingUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCN",
			new String[] { String.class.getName() },
			WorkingUnitModelImpl.CITYNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CN = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCN",
			new String[] { String.class.getName() });

	/**
	 * Returns all the Working Units where cityNo = &#63;.
	 *
	 * @param cityNo the city no
	 * @return the matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByCN(String cityNo) throws SystemException {
		return findByCN(cityNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Working Units where cityNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param cityNo the city no
	 * @param start the lower bound of the range of Working Units
	 * @param end the upper bound of the range of Working Units (not inclusive)
	 * @return the range of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByCN(String cityNo, int start, int end)
		throws SystemException {
		return findByCN(cityNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the Working Units where cityNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param cityNo the city no
	 * @param start the lower bound of the range of Working Units
	 * @param end the upper bound of the range of Working Units (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByCN(String cityNo, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CN;
			finderArgs = new Object[] { cityNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CN;
			finderArgs = new Object[] { cityNo, start, end, orderByComparator };
		}

		List<WorkingUnit> list = (List<WorkingUnit>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (WorkingUnit workingUnit : list) {
				if (!Validator.equals(cityNo, workingUnit.getCityNo())) {
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

			query.append(_SQL_SELECT_WORKINGUNIT_WHERE);

			boolean bindCityNo = false;

			if (cityNo == null) {
				query.append(_FINDER_COLUMN_CN_CITYNO_1);
			}
			else if (cityNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CN_CITYNO_3);
			}
			else {
				bindCityNo = true;

				query.append(_FINDER_COLUMN_CN_CITYNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(WorkingUnitModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCityNo) {
					qPos.add(cityNo);
				}

				if (!pagination) {
					list = (List<WorkingUnit>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<WorkingUnit>(list);
				}
				else {
					list = (List<WorkingUnit>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first Working Unit in the ordered set where cityNo = &#63;.
	 *
	 * @param cityNo the city no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit findByCN_First(String cityNo,
		OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = fetchByCN_First(cityNo, orderByComparator);

		if (workingUnit != null) {
			return workingUnit;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("cityNo=");
		msg.append(cityNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWorkingUnitException(msg.toString());
	}

	/**
	 * Returns the first Working Unit in the ordered set where cityNo = &#63;.
	 *
	 * @param cityNo the city no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit fetchByCN_First(String cityNo,
		OrderByComparator orderByComparator) throws SystemException {
		List<WorkingUnit> list = findByCN(cityNo, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last Working Unit in the ordered set where cityNo = &#63;.
	 *
	 * @param cityNo the city no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit findByCN_Last(String cityNo,
		OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = fetchByCN_Last(cityNo, orderByComparator);

		if (workingUnit != null) {
			return workingUnit;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("cityNo=");
		msg.append(cityNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWorkingUnitException(msg.toString());
	}

	/**
	 * Returns the last Working Unit in the ordered set where cityNo = &#63;.
	 *
	 * @param cityNo the city no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit fetchByCN_Last(String cityNo,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCN(cityNo);

		if (count == 0) {
			return null;
		}

		List<WorkingUnit> list = findByCN(cityNo, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the Working Units before and after the current Working Unit in the ordered set where cityNo = &#63;.
	 *
	 * @param workingUnitId the primary key of the current Working Unit
	 * @param cityNo the city no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a Working Unit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit[] findByCN_PrevAndNext(long workingUnitId,
		String cityNo, OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = findByPrimaryKey(workingUnitId);

		Session session = null;

		try {
			session = openSession();

			WorkingUnit[] array = new WorkingUnitImpl[3];

			array[0] = getByCN_PrevAndNext(session, workingUnit, cityNo,
					orderByComparator, true);

			array[1] = workingUnit;

			array[2] = getByCN_PrevAndNext(session, workingUnit, cityNo,
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

	protected WorkingUnit getByCN_PrevAndNext(Session session,
		WorkingUnit workingUnit, String cityNo,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_WORKINGUNIT_WHERE);

		boolean bindCityNo = false;

		if (cityNo == null) {
			query.append(_FINDER_COLUMN_CN_CITYNO_1);
		}
		else if (cityNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CN_CITYNO_3);
		}
		else {
			bindCityNo = true;

			query.append(_FINDER_COLUMN_CN_CITYNO_2);
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
			query.append(WorkingUnitModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCityNo) {
			qPos.add(cityNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(workingUnit);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<WorkingUnit> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the Working Units where cityNo = &#63; from the database.
	 *
	 * @param cityNo the city no
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCN(String cityNo) throws SystemException {
		for (WorkingUnit workingUnit : findByCN(cityNo, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(workingUnit);
		}
	}

	/**
	 * Returns the number of Working Units where cityNo = &#63;.
	 *
	 * @param cityNo the city no
	 * @return the number of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCN(String cityNo) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CN;

		Object[] finderArgs = new Object[] { cityNo };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_WORKINGUNIT_WHERE);

			boolean bindCityNo = false;

			if (cityNo == null) {
				query.append(_FINDER_COLUMN_CN_CITYNO_1);
			}
			else if (cityNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CN_CITYNO_3);
			}
			else {
				bindCityNo = true;

				query.append(_FINDER_COLUMN_CN_CITYNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCityNo) {
					qPos.add(cityNo);
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

	private static final String _FINDER_COLUMN_CN_CITYNO_1 = "workingUnit.cityNo IS NULL";
	private static final String _FINDER_COLUMN_CN_CITYNO_2 = "workingUnit.cityNo = ?";
	private static final String _FINDER_COLUMN_CN_CITYNO_3 = "(workingUnit.cityNo IS NULL OR workingUnit.cityNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DN = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, WorkingUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDN",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DN = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, WorkingUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDN",
			new String[] { String.class.getName() },
			WorkingUnitModelImpl.DISTRICTNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DN = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDN",
			new String[] { String.class.getName() });

	/**
	 * Returns all the Working Units where districtNo = &#63;.
	 *
	 * @param districtNo the district no
	 * @return the matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByDN(String districtNo)
		throws SystemException {
		return findByDN(districtNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Working Units where districtNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param districtNo the district no
	 * @param start the lower bound of the range of Working Units
	 * @param end the upper bound of the range of Working Units (not inclusive)
	 * @return the range of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByDN(String districtNo, int start, int end)
		throws SystemException {
		return findByDN(districtNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the Working Units where districtNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param districtNo the district no
	 * @param start the lower bound of the range of Working Units
	 * @param end the upper bound of the range of Working Units (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByDN(String districtNo, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DN;
			finderArgs = new Object[] { districtNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DN;
			finderArgs = new Object[] { districtNo, start, end, orderByComparator };
		}

		List<WorkingUnit> list = (List<WorkingUnit>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (WorkingUnit workingUnit : list) {
				if (!Validator.equals(districtNo, workingUnit.getDistrictNo())) {
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

			query.append(_SQL_SELECT_WORKINGUNIT_WHERE);

			boolean bindDistrictNo = false;

			if (districtNo == null) {
				query.append(_FINDER_COLUMN_DN_DISTRICTNO_1);
			}
			else if (districtNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DN_DISTRICTNO_3);
			}
			else {
				bindDistrictNo = true;

				query.append(_FINDER_COLUMN_DN_DISTRICTNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(WorkingUnitModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDistrictNo) {
					qPos.add(districtNo);
				}

				if (!pagination) {
					list = (List<WorkingUnit>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<WorkingUnit>(list);
				}
				else {
					list = (List<WorkingUnit>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first Working Unit in the ordered set where districtNo = &#63;.
	 *
	 * @param districtNo the district no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit findByDN_First(String districtNo,
		OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = fetchByDN_First(districtNo, orderByComparator);

		if (workingUnit != null) {
			return workingUnit;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("districtNo=");
		msg.append(districtNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWorkingUnitException(msg.toString());
	}

	/**
	 * Returns the first Working Unit in the ordered set where districtNo = &#63;.
	 *
	 * @param districtNo the district no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit fetchByDN_First(String districtNo,
		OrderByComparator orderByComparator) throws SystemException {
		List<WorkingUnit> list = findByDN(districtNo, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last Working Unit in the ordered set where districtNo = &#63;.
	 *
	 * @param districtNo the district no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit findByDN_Last(String districtNo,
		OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = fetchByDN_Last(districtNo, orderByComparator);

		if (workingUnit != null) {
			return workingUnit;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("districtNo=");
		msg.append(districtNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWorkingUnitException(msg.toString());
	}

	/**
	 * Returns the last Working Unit in the ordered set where districtNo = &#63;.
	 *
	 * @param districtNo the district no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit fetchByDN_Last(String districtNo,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByDN(districtNo);

		if (count == 0) {
			return null;
		}

		List<WorkingUnit> list = findByDN(districtNo, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the Working Units before and after the current Working Unit in the ordered set where districtNo = &#63;.
	 *
	 * @param workingUnitId the primary key of the current Working Unit
	 * @param districtNo the district no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a Working Unit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit[] findByDN_PrevAndNext(long workingUnitId,
		String districtNo, OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = findByPrimaryKey(workingUnitId);

		Session session = null;

		try {
			session = openSession();

			WorkingUnit[] array = new WorkingUnitImpl[3];

			array[0] = getByDN_PrevAndNext(session, workingUnit, districtNo,
					orderByComparator, true);

			array[1] = workingUnit;

			array[2] = getByDN_PrevAndNext(session, workingUnit, districtNo,
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

	protected WorkingUnit getByDN_PrevAndNext(Session session,
		WorkingUnit workingUnit, String districtNo,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_WORKINGUNIT_WHERE);

		boolean bindDistrictNo = false;

		if (districtNo == null) {
			query.append(_FINDER_COLUMN_DN_DISTRICTNO_1);
		}
		else if (districtNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DN_DISTRICTNO_3);
		}
		else {
			bindDistrictNo = true;

			query.append(_FINDER_COLUMN_DN_DISTRICTNO_2);
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
			query.append(WorkingUnitModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDistrictNo) {
			qPos.add(districtNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(workingUnit);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<WorkingUnit> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the Working Units where districtNo = &#63; from the database.
	 *
	 * @param districtNo the district no
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDN(String districtNo) throws SystemException {
		for (WorkingUnit workingUnit : findByDN(districtNo, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(workingUnit);
		}
	}

	/**
	 * Returns the number of Working Units where districtNo = &#63;.
	 *
	 * @param districtNo the district no
	 * @return the number of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDN(String districtNo) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DN;

		Object[] finderArgs = new Object[] { districtNo };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_WORKINGUNIT_WHERE);

			boolean bindDistrictNo = false;

			if (districtNo == null) {
				query.append(_FINDER_COLUMN_DN_DISTRICTNO_1);
			}
			else if (districtNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DN_DISTRICTNO_3);
			}
			else {
				bindDistrictNo = true;

				query.append(_FINDER_COLUMN_DN_DISTRICTNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDistrictNo) {
					qPos.add(districtNo);
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

	private static final String _FINDER_COLUMN_DN_DISTRICTNO_1 = "workingUnit.districtNo IS NULL";
	private static final String _FINDER_COLUMN_DN_DISTRICTNO_2 = "workingUnit.districtNo = ?";
	private static final String _FINDER_COLUMN_DN_DISTRICTNO_3 = "(workingUnit.districtNo IS NULL OR workingUnit.districtNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_WA = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, WorkingUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByWA",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WA = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, WorkingUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByWA",
			new String[] { String.class.getName() },
			WorkingUnitModelImpl.WARDNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_WA = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByWA",
			new String[] { String.class.getName() });

	/**
	 * Returns all the Working Units where wardNo = &#63;.
	 *
	 * @param wardNo the ward no
	 * @return the matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByWA(String wardNo) throws SystemException {
		return findByWA(wardNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Working Units where wardNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param wardNo the ward no
	 * @param start the lower bound of the range of Working Units
	 * @param end the upper bound of the range of Working Units (not inclusive)
	 * @return the range of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByWA(String wardNo, int start, int end)
		throws SystemException {
		return findByWA(wardNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the Working Units where wardNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param wardNo the ward no
	 * @param start the lower bound of the range of Working Units
	 * @param end the upper bound of the range of Working Units (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByWA(String wardNo, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WA;
			finderArgs = new Object[] { wardNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_WA;
			finderArgs = new Object[] { wardNo, start, end, orderByComparator };
		}

		List<WorkingUnit> list = (List<WorkingUnit>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (WorkingUnit workingUnit : list) {
				if (!Validator.equals(wardNo, workingUnit.getWardNo())) {
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

			query.append(_SQL_SELECT_WORKINGUNIT_WHERE);

			boolean bindWardNo = false;

			if (wardNo == null) {
				query.append(_FINDER_COLUMN_WA_WARDNO_1);
			}
			else if (wardNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_WA_WARDNO_3);
			}
			else {
				bindWardNo = true;

				query.append(_FINDER_COLUMN_WA_WARDNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(WorkingUnitModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindWardNo) {
					qPos.add(wardNo);
				}

				if (!pagination) {
					list = (List<WorkingUnit>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<WorkingUnit>(list);
				}
				else {
					list = (List<WorkingUnit>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first Working Unit in the ordered set where wardNo = &#63;.
	 *
	 * @param wardNo the ward no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit findByWA_First(String wardNo,
		OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = fetchByWA_First(wardNo, orderByComparator);

		if (workingUnit != null) {
			return workingUnit;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("wardNo=");
		msg.append(wardNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWorkingUnitException(msg.toString());
	}

	/**
	 * Returns the first Working Unit in the ordered set where wardNo = &#63;.
	 *
	 * @param wardNo the ward no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit fetchByWA_First(String wardNo,
		OrderByComparator orderByComparator) throws SystemException {
		List<WorkingUnit> list = findByWA(wardNo, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last Working Unit in the ordered set where wardNo = &#63;.
	 *
	 * @param wardNo the ward no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit findByWA_Last(String wardNo,
		OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = fetchByWA_Last(wardNo, orderByComparator);

		if (workingUnit != null) {
			return workingUnit;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("wardNo=");
		msg.append(wardNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWorkingUnitException(msg.toString());
	}

	/**
	 * Returns the last Working Unit in the ordered set where wardNo = &#63;.
	 *
	 * @param wardNo the ward no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit fetchByWA_Last(String wardNo,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByWA(wardNo);

		if (count == 0) {
			return null;
		}

		List<WorkingUnit> list = findByWA(wardNo, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the Working Units before and after the current Working Unit in the ordered set where wardNo = &#63;.
	 *
	 * @param workingUnitId the primary key of the current Working Unit
	 * @param wardNo the ward no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a Working Unit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit[] findByWA_PrevAndNext(long workingUnitId,
		String wardNo, OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = findByPrimaryKey(workingUnitId);

		Session session = null;

		try {
			session = openSession();

			WorkingUnit[] array = new WorkingUnitImpl[3];

			array[0] = getByWA_PrevAndNext(session, workingUnit, wardNo,
					orderByComparator, true);

			array[1] = workingUnit;

			array[2] = getByWA_PrevAndNext(session, workingUnit, wardNo,
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

	protected WorkingUnit getByWA_PrevAndNext(Session session,
		WorkingUnit workingUnit, String wardNo,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_WORKINGUNIT_WHERE);

		boolean bindWardNo = false;

		if (wardNo == null) {
			query.append(_FINDER_COLUMN_WA_WARDNO_1);
		}
		else if (wardNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_WA_WARDNO_3);
		}
		else {
			bindWardNo = true;

			query.append(_FINDER_COLUMN_WA_WARDNO_2);
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
			query.append(WorkingUnitModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindWardNo) {
			qPos.add(wardNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(workingUnit);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<WorkingUnit> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the Working Units where wardNo = &#63; from the database.
	 *
	 * @param wardNo the ward no
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByWA(String wardNo) throws SystemException {
		for (WorkingUnit workingUnit : findByWA(wardNo, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(workingUnit);
		}
	}

	/**
	 * Returns the number of Working Units where wardNo = &#63;.
	 *
	 * @param wardNo the ward no
	 * @return the number of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByWA(String wardNo) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_WA;

		Object[] finderArgs = new Object[] { wardNo };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_WORKINGUNIT_WHERE);

			boolean bindWardNo = false;

			if (wardNo == null) {
				query.append(_FINDER_COLUMN_WA_WARDNO_1);
			}
			else if (wardNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_WA_WARDNO_3);
			}
			else {
				bindWardNo = true;

				query.append(_FINDER_COLUMN_WA_WARDNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindWardNo) {
					qPos.add(wardNo);
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

	private static final String _FINDER_COLUMN_WA_WARDNO_1 = "workingUnit.wardNo IS NULL";
	private static final String _FINDER_COLUMN_WA_WARDNO_2 = "workingUnit.wardNo = ?";
	private static final String _FINDER_COLUMN_WA_WARDNO_3 = "(workingUnit.wardNo IS NULL OR workingUnit.wardNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PW = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, WorkingUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPW",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PW = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, WorkingUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPW",
			new String[] { Long.class.getName() },
			WorkingUnitModelImpl.PARENTWORKINGUNITID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PW = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPW",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the Working Units where parentWorkingUnitId = &#63;.
	 *
	 * @param parentWorkingUnitId the parent working unit ID
	 * @return the matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByPW(long parentWorkingUnitId)
		throws SystemException {
		return findByPW(parentWorkingUnitId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Working Units where parentWorkingUnitId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param parentWorkingUnitId the parent working unit ID
	 * @param start the lower bound of the range of Working Units
	 * @param end the upper bound of the range of Working Units (not inclusive)
	 * @return the range of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByPW(long parentWorkingUnitId, int start,
		int end) throws SystemException {
		return findByPW(parentWorkingUnitId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the Working Units where parentWorkingUnitId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param parentWorkingUnitId the parent working unit ID
	 * @param start the lower bound of the range of Working Units
	 * @param end the upper bound of the range of Working Units (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByPW(long parentWorkingUnitId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PW;
			finderArgs = new Object[] { parentWorkingUnitId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PW;
			finderArgs = new Object[] {
					parentWorkingUnitId,
					
					start, end, orderByComparator
				};
		}

		List<WorkingUnit> list = (List<WorkingUnit>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (WorkingUnit workingUnit : list) {
				if ((parentWorkingUnitId != workingUnit.getParentWorkingUnitId())) {
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

			query.append(_SQL_SELECT_WORKINGUNIT_WHERE);

			query.append(_FINDER_COLUMN_PW_PARENTWORKINGUNITID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(WorkingUnitModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(parentWorkingUnitId);

				if (!pagination) {
					list = (List<WorkingUnit>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<WorkingUnit>(list);
				}
				else {
					list = (List<WorkingUnit>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first Working Unit in the ordered set where parentWorkingUnitId = &#63;.
	 *
	 * @param parentWorkingUnitId the parent working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit findByPW_First(long parentWorkingUnitId,
		OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = fetchByPW_First(parentWorkingUnitId,
				orderByComparator);

		if (workingUnit != null) {
			return workingUnit;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("parentWorkingUnitId=");
		msg.append(parentWorkingUnitId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWorkingUnitException(msg.toString());
	}

	/**
	 * Returns the first Working Unit in the ordered set where parentWorkingUnitId = &#63;.
	 *
	 * @param parentWorkingUnitId the parent working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit fetchByPW_First(long parentWorkingUnitId,
		OrderByComparator orderByComparator) throws SystemException {
		List<WorkingUnit> list = findByPW(parentWorkingUnitId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last Working Unit in the ordered set where parentWorkingUnitId = &#63;.
	 *
	 * @param parentWorkingUnitId the parent working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit findByPW_Last(long parentWorkingUnitId,
		OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = fetchByPW_Last(parentWorkingUnitId,
				orderByComparator);

		if (workingUnit != null) {
			return workingUnit;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("parentWorkingUnitId=");
		msg.append(parentWorkingUnitId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWorkingUnitException(msg.toString());
	}

	/**
	 * Returns the last Working Unit in the ordered set where parentWorkingUnitId = &#63;.
	 *
	 * @param parentWorkingUnitId the parent working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit fetchByPW_Last(long parentWorkingUnitId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByPW(parentWorkingUnitId);

		if (count == 0) {
			return null;
		}

		List<WorkingUnit> list = findByPW(parentWorkingUnitId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the Working Units before and after the current Working Unit in the ordered set where parentWorkingUnitId = &#63;.
	 *
	 * @param workingUnitId the primary key of the current Working Unit
	 * @param parentWorkingUnitId the parent working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a Working Unit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit[] findByPW_PrevAndNext(long workingUnitId,
		long parentWorkingUnitId, OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = findByPrimaryKey(workingUnitId);

		Session session = null;

		try {
			session = openSession();

			WorkingUnit[] array = new WorkingUnitImpl[3];

			array[0] = getByPW_PrevAndNext(session, workingUnit,
					parentWorkingUnitId, orderByComparator, true);

			array[1] = workingUnit;

			array[2] = getByPW_PrevAndNext(session, workingUnit,
					parentWorkingUnitId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected WorkingUnit getByPW_PrevAndNext(Session session,
		WorkingUnit workingUnit, long parentWorkingUnitId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_WORKINGUNIT_WHERE);

		query.append(_FINDER_COLUMN_PW_PARENTWORKINGUNITID_2);

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
			query.append(WorkingUnitModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(parentWorkingUnitId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(workingUnit);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<WorkingUnit> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the Working Units where parentWorkingUnitId = &#63; from the database.
	 *
	 * @param parentWorkingUnitId the parent working unit ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPW(long parentWorkingUnitId) throws SystemException {
		for (WorkingUnit workingUnit : findByPW(parentWorkingUnitId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(workingUnit);
		}
	}

	/**
	 * Returns the number of Working Units where parentWorkingUnitId = &#63;.
	 *
	 * @param parentWorkingUnitId the parent working unit ID
	 * @return the number of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPW(long parentWorkingUnitId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PW;

		Object[] finderArgs = new Object[] { parentWorkingUnitId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_WORKINGUNIT_WHERE);

			query.append(_FINDER_COLUMN_PW_PARENTWORKINGUNITID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(parentWorkingUnitId);

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

	private static final String _FINDER_COLUMN_PW_PARENTWORKINGUNITID_2 = "workingUnit.parentWorkingUnitId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_PW = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, WorkingUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_PW",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_PW = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, WorkingUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_PW",
			new String[] { Long.class.getName(), Long.class.getName() },
			WorkingUnitModelImpl.COMPANYID_COLUMN_BITMASK |
			WorkingUnitModelImpl.PARENTWORKINGUNITID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_PW = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_PW",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the Working Units where companyId = &#63; and parentWorkingUnitId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param parentWorkingUnitId the parent working unit ID
	 * @return the matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByC_PW(long companyId, long parentWorkingUnitId)
		throws SystemException {
		return findByC_PW(companyId, parentWorkingUnitId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Working Units where companyId = &#63; and parentWorkingUnitId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param parentWorkingUnitId the parent working unit ID
	 * @param start the lower bound of the range of Working Units
	 * @param end the upper bound of the range of Working Units (not inclusive)
	 * @return the range of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByC_PW(long companyId,
		long parentWorkingUnitId, int start, int end) throws SystemException {
		return findByC_PW(companyId, parentWorkingUnitId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the Working Units where companyId = &#63; and parentWorkingUnitId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param parentWorkingUnitId the parent working unit ID
	 * @param start the lower bound of the range of Working Units
	 * @param end the upper bound of the range of Working Units (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByC_PW(long companyId,
		long parentWorkingUnitId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_PW;
			finderArgs = new Object[] { companyId, parentWorkingUnitId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_PW;
			finderArgs = new Object[] {
					companyId, parentWorkingUnitId,
					
					start, end, orderByComparator
				};
		}

		List<WorkingUnit> list = (List<WorkingUnit>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (WorkingUnit workingUnit : list) {
				if ((companyId != workingUnit.getCompanyId()) ||
						(parentWorkingUnitId != workingUnit.getParentWorkingUnitId())) {
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

			query.append(_SQL_SELECT_WORKINGUNIT_WHERE);

			query.append(_FINDER_COLUMN_C_PW_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_PW_PARENTWORKINGUNITID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(WorkingUnitModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(parentWorkingUnitId);

				if (!pagination) {
					list = (List<WorkingUnit>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<WorkingUnit>(list);
				}
				else {
					list = (List<WorkingUnit>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first Working Unit in the ordered set where companyId = &#63; and parentWorkingUnitId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param parentWorkingUnitId the parent working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit findByC_PW_First(long companyId,
		long parentWorkingUnitId, OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = fetchByC_PW_First(companyId,
				parentWorkingUnitId, orderByComparator);

		if (workingUnit != null) {
			return workingUnit;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", parentWorkingUnitId=");
		msg.append(parentWorkingUnitId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWorkingUnitException(msg.toString());
	}

	/**
	 * Returns the first Working Unit in the ordered set where companyId = &#63; and parentWorkingUnitId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param parentWorkingUnitId the parent working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit fetchByC_PW_First(long companyId,
		long parentWorkingUnitId, OrderByComparator orderByComparator)
		throws SystemException {
		List<WorkingUnit> list = findByC_PW(companyId, parentWorkingUnitId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last Working Unit in the ordered set where companyId = &#63; and parentWorkingUnitId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param parentWorkingUnitId the parent working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit findByC_PW_Last(long companyId,
		long parentWorkingUnitId, OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = fetchByC_PW_Last(companyId,
				parentWorkingUnitId, orderByComparator);

		if (workingUnit != null) {
			return workingUnit;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", parentWorkingUnitId=");
		msg.append(parentWorkingUnitId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWorkingUnitException(msg.toString());
	}

	/**
	 * Returns the last Working Unit in the ordered set where companyId = &#63; and parentWorkingUnitId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param parentWorkingUnitId the parent working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit fetchByC_PW_Last(long companyId,
		long parentWorkingUnitId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByC_PW(companyId, parentWorkingUnitId);

		if (count == 0) {
			return null;
		}

		List<WorkingUnit> list = findByC_PW(companyId, parentWorkingUnitId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the Working Units before and after the current Working Unit in the ordered set where companyId = &#63; and parentWorkingUnitId = &#63;.
	 *
	 * @param workingUnitId the primary key of the current Working Unit
	 * @param companyId the company ID
	 * @param parentWorkingUnitId the parent working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a Working Unit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit[] findByC_PW_PrevAndNext(long workingUnitId,
		long companyId, long parentWorkingUnitId,
		OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = findByPrimaryKey(workingUnitId);

		Session session = null;

		try {
			session = openSession();

			WorkingUnit[] array = new WorkingUnitImpl[3];

			array[0] = getByC_PW_PrevAndNext(session, workingUnit, companyId,
					parentWorkingUnitId, orderByComparator, true);

			array[1] = workingUnit;

			array[2] = getByC_PW_PrevAndNext(session, workingUnit, companyId,
					parentWorkingUnitId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected WorkingUnit getByC_PW_PrevAndNext(Session session,
		WorkingUnit workingUnit, long companyId, long parentWorkingUnitId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_WORKINGUNIT_WHERE);

		query.append(_FINDER_COLUMN_C_PW_COMPANYID_2);

		query.append(_FINDER_COLUMN_C_PW_PARENTWORKINGUNITID_2);

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
			query.append(WorkingUnitModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(parentWorkingUnitId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(workingUnit);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<WorkingUnit> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the Working Units where companyId = &#63; and parentWorkingUnitId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param parentWorkingUnitId the parent working unit ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_PW(long companyId, long parentWorkingUnitId)
		throws SystemException {
		for (WorkingUnit workingUnit : findByC_PW(companyId,
				parentWorkingUnitId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(workingUnit);
		}
	}

	/**
	 * Returns the number of Working Units where companyId = &#63; and parentWorkingUnitId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param parentWorkingUnitId the parent working unit ID
	 * @return the number of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_PW(long companyId, long parentWorkingUnitId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_PW;

		Object[] finderArgs = new Object[] { companyId, parentWorkingUnitId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_WORKINGUNIT_WHERE);

			query.append(_FINDER_COLUMN_C_PW_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_PW_PARENTWORKINGUNITID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(parentWorkingUnitId);

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

	private static final String _FINDER_COLUMN_C_PW_COMPANYID_2 = "workingUnit.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_PW_PARENTWORKINGUNITID_2 = "workingUnit.parentWorkingUnitId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_PW = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, WorkingUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_PW",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_PW = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, WorkingUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_PW",
			new String[] { Long.class.getName(), Long.class.getName() },
			WorkingUnitModelImpl.GROUPID_COLUMN_BITMASK |
			WorkingUnitModelImpl.PARENTWORKINGUNITID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_PW = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_PW",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the Working Units where groupId = &#63; and parentWorkingUnitId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param parentWorkingUnitId the parent working unit ID
	 * @return the matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByG_PW(long groupId, long parentWorkingUnitId)
		throws SystemException {
		return findByG_PW(groupId, parentWorkingUnitId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Working Units where groupId = &#63; and parentWorkingUnitId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param parentWorkingUnitId the parent working unit ID
	 * @param start the lower bound of the range of Working Units
	 * @param end the upper bound of the range of Working Units (not inclusive)
	 * @return the range of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByG_PW(long groupId, long parentWorkingUnitId,
		int start, int end) throws SystemException {
		return findByG_PW(groupId, parentWorkingUnitId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the Working Units where groupId = &#63; and parentWorkingUnitId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param parentWorkingUnitId the parent working unit ID
	 * @param start the lower bound of the range of Working Units
	 * @param end the upper bound of the range of Working Units (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByG_PW(long groupId, long parentWorkingUnitId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_PW;
			finderArgs = new Object[] { groupId, parentWorkingUnitId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_PW;
			finderArgs = new Object[] {
					groupId, parentWorkingUnitId,
					
					start, end, orderByComparator
				};
		}

		List<WorkingUnit> list = (List<WorkingUnit>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (WorkingUnit workingUnit : list) {
				if ((groupId != workingUnit.getGroupId()) ||
						(parentWorkingUnitId != workingUnit.getParentWorkingUnitId())) {
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

			query.append(_SQL_SELECT_WORKINGUNIT_WHERE);

			query.append(_FINDER_COLUMN_G_PW_GROUPID_2);

			query.append(_FINDER_COLUMN_G_PW_PARENTWORKINGUNITID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(WorkingUnitModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(parentWorkingUnitId);

				if (!pagination) {
					list = (List<WorkingUnit>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<WorkingUnit>(list);
				}
				else {
					list = (List<WorkingUnit>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first Working Unit in the ordered set where groupId = &#63; and parentWorkingUnitId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param parentWorkingUnitId the parent working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit findByG_PW_First(long groupId, long parentWorkingUnitId,
		OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = fetchByG_PW_First(groupId,
				parentWorkingUnitId, orderByComparator);

		if (workingUnit != null) {
			return workingUnit;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", parentWorkingUnitId=");
		msg.append(parentWorkingUnitId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWorkingUnitException(msg.toString());
	}

	/**
	 * Returns the first Working Unit in the ordered set where groupId = &#63; and parentWorkingUnitId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param parentWorkingUnitId the parent working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit fetchByG_PW_First(long groupId,
		long parentWorkingUnitId, OrderByComparator orderByComparator)
		throws SystemException {
		List<WorkingUnit> list = findByG_PW(groupId, parentWorkingUnitId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last Working Unit in the ordered set where groupId = &#63; and parentWorkingUnitId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param parentWorkingUnitId the parent working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit findByG_PW_Last(long groupId, long parentWorkingUnitId,
		OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = fetchByG_PW_Last(groupId,
				parentWorkingUnitId, orderByComparator);

		if (workingUnit != null) {
			return workingUnit;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", parentWorkingUnitId=");
		msg.append(parentWorkingUnitId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWorkingUnitException(msg.toString());
	}

	/**
	 * Returns the last Working Unit in the ordered set where groupId = &#63; and parentWorkingUnitId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param parentWorkingUnitId the parent working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit fetchByG_PW_Last(long groupId, long parentWorkingUnitId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByG_PW(groupId, parentWorkingUnitId);

		if (count == 0) {
			return null;
		}

		List<WorkingUnit> list = findByG_PW(groupId, parentWorkingUnitId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the Working Units before and after the current Working Unit in the ordered set where groupId = &#63; and parentWorkingUnitId = &#63;.
	 *
	 * @param workingUnitId the primary key of the current Working Unit
	 * @param groupId the group ID
	 * @param parentWorkingUnitId the parent working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a Working Unit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit[] findByG_PW_PrevAndNext(long workingUnitId,
		long groupId, long parentWorkingUnitId,
		OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = findByPrimaryKey(workingUnitId);

		Session session = null;

		try {
			session = openSession();

			WorkingUnit[] array = new WorkingUnitImpl[3];

			array[0] = getByG_PW_PrevAndNext(session, workingUnit, groupId,
					parentWorkingUnitId, orderByComparator, true);

			array[1] = workingUnit;

			array[2] = getByG_PW_PrevAndNext(session, workingUnit, groupId,
					parentWorkingUnitId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected WorkingUnit getByG_PW_PrevAndNext(Session session,
		WorkingUnit workingUnit, long groupId, long parentWorkingUnitId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_WORKINGUNIT_WHERE);

		query.append(_FINDER_COLUMN_G_PW_GROUPID_2);

		query.append(_FINDER_COLUMN_G_PW_PARENTWORKINGUNITID_2);

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
			query.append(WorkingUnitModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(parentWorkingUnitId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(workingUnit);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<WorkingUnit> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the Working Units where groupId = &#63; and parentWorkingUnitId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param parentWorkingUnitId the parent working unit ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByG_PW(long groupId, long parentWorkingUnitId)
		throws SystemException {
		for (WorkingUnit workingUnit : findByG_PW(groupId, parentWorkingUnitId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(workingUnit);
		}
	}

	/**
	 * Returns the number of Working Units where groupId = &#63; and parentWorkingUnitId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param parentWorkingUnitId the parent working unit ID
	 * @return the number of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByG_PW(long groupId, long parentWorkingUnitId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_PW;

		Object[] finderArgs = new Object[] { groupId, parentWorkingUnitId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_WORKINGUNIT_WHERE);

			query.append(_FINDER_COLUMN_G_PW_GROUPID_2);

			query.append(_FINDER_COLUMN_G_PW_PARENTWORKINGUNITID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(parentWorkingUnitId);

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

	private static final String _FINDER_COLUMN_G_PW_GROUPID_2 = "workingUnit.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_PW_PARENTWORKINGUNITID_2 = "workingUnit.parentWorkingUnitId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LS = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, WorkingUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByLS",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LS = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, WorkingUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByLS",
			new String[] { Long.class.getName() },
			WorkingUnitModelImpl.LOCALSITEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LS = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByLS",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the Working Units where localSiteId = &#63;.
	 *
	 * @param localSiteId the local site ID
	 * @return the matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByLS(long localSiteId)
		throws SystemException {
		return findByLS(localSiteId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Working Units where localSiteId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param localSiteId the local site ID
	 * @param start the lower bound of the range of Working Units
	 * @param end the upper bound of the range of Working Units (not inclusive)
	 * @return the range of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByLS(long localSiteId, int start, int end)
		throws SystemException {
		return findByLS(localSiteId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the Working Units where localSiteId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param localSiteId the local site ID
	 * @param start the lower bound of the range of Working Units
	 * @param end the upper bound of the range of Working Units (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByLS(long localSiteId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LS;
			finderArgs = new Object[] { localSiteId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LS;
			finderArgs = new Object[] { localSiteId, start, end, orderByComparator };
		}

		List<WorkingUnit> list = (List<WorkingUnit>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (WorkingUnit workingUnit : list) {
				if ((localSiteId != workingUnit.getLocalSiteId())) {
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

			query.append(_SQL_SELECT_WORKINGUNIT_WHERE);

			query.append(_FINDER_COLUMN_LS_LOCALSITEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(WorkingUnitModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(localSiteId);

				if (!pagination) {
					list = (List<WorkingUnit>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<WorkingUnit>(list);
				}
				else {
					list = (List<WorkingUnit>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first Working Unit in the ordered set where localSiteId = &#63;.
	 *
	 * @param localSiteId the local site ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit findByLS_First(long localSiteId,
		OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = fetchByLS_First(localSiteId, orderByComparator);

		if (workingUnit != null) {
			return workingUnit;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("localSiteId=");
		msg.append(localSiteId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWorkingUnitException(msg.toString());
	}

	/**
	 * Returns the first Working Unit in the ordered set where localSiteId = &#63;.
	 *
	 * @param localSiteId the local site ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit fetchByLS_First(long localSiteId,
		OrderByComparator orderByComparator) throws SystemException {
		List<WorkingUnit> list = findByLS(localSiteId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last Working Unit in the ordered set where localSiteId = &#63;.
	 *
	 * @param localSiteId the local site ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit findByLS_Last(long localSiteId,
		OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = fetchByLS_Last(localSiteId, orderByComparator);

		if (workingUnit != null) {
			return workingUnit;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("localSiteId=");
		msg.append(localSiteId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWorkingUnitException(msg.toString());
	}

	/**
	 * Returns the last Working Unit in the ordered set where localSiteId = &#63;.
	 *
	 * @param localSiteId the local site ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit fetchByLS_Last(long localSiteId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByLS(localSiteId);

		if (count == 0) {
			return null;
		}

		List<WorkingUnit> list = findByLS(localSiteId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the Working Units before and after the current Working Unit in the ordered set where localSiteId = &#63;.
	 *
	 * @param workingUnitId the primary key of the current Working Unit
	 * @param localSiteId the local site ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a Working Unit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit[] findByLS_PrevAndNext(long workingUnitId,
		long localSiteId, OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = findByPrimaryKey(workingUnitId);

		Session session = null;

		try {
			session = openSession();

			WorkingUnit[] array = new WorkingUnitImpl[3];

			array[0] = getByLS_PrevAndNext(session, workingUnit, localSiteId,
					orderByComparator, true);

			array[1] = workingUnit;

			array[2] = getByLS_PrevAndNext(session, workingUnit, localSiteId,
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

	protected WorkingUnit getByLS_PrevAndNext(Session session,
		WorkingUnit workingUnit, long localSiteId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_WORKINGUNIT_WHERE);

		query.append(_FINDER_COLUMN_LS_LOCALSITEID_2);

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
			query.append(WorkingUnitModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(localSiteId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(workingUnit);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<WorkingUnit> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the Working Units where localSiteId = &#63; from the database.
	 *
	 * @param localSiteId the local site ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByLS(long localSiteId) throws SystemException {
		for (WorkingUnit workingUnit : findByLS(localSiteId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(workingUnit);
		}
	}

	/**
	 * Returns the number of Working Units where localSiteId = &#63;.
	 *
	 * @param localSiteId the local site ID
	 * @return the number of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByLS(long localSiteId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LS;

		Object[] finderArgs = new Object[] { localSiteId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_WORKINGUNIT_WHERE);

			query.append(_FINDER_COLUMN_LS_LOCALSITEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(localSiteId);

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

	private static final String _FINDER_COLUMN_LS_LOCALSITEID_2 = "workingUnit.localSiteId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_ISE = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, WorkingUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_IsE",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_ISE = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, WorkingUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_IsE",
			new String[] { Long.class.getName(), Integer.class.getName() },
			WorkingUnitModelImpl.COMPANYID_COLUMN_BITMASK |
			WorkingUnitModelImpl.ISEMPLOYER_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_ISE = new FinderPath(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_IsE",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the Working Units where companyId = &#63; and isEmployer = &#63;.
	 *
	 * @param companyId the company ID
	 * @param isEmployer the is employer
	 * @return the matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByC_IsE(long companyId, int isEmployer)
		throws SystemException {
		return findByC_IsE(companyId, isEmployer, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Working Units where companyId = &#63; and isEmployer = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param isEmployer the is employer
	 * @param start the lower bound of the range of Working Units
	 * @param end the upper bound of the range of Working Units (not inclusive)
	 * @return the range of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByC_IsE(long companyId, int isEmployer,
		int start, int end) throws SystemException {
		return findByC_IsE(companyId, isEmployer, start, end, null);
	}

	/**
	 * Returns an ordered range of all the Working Units where companyId = &#63; and isEmployer = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param isEmployer the is employer
	 * @param start the lower bound of the range of Working Units
	 * @param end the upper bound of the range of Working Units (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findByC_IsE(long companyId, int isEmployer,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_ISE;
			finderArgs = new Object[] { companyId, isEmployer };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_ISE;
			finderArgs = new Object[] {
					companyId, isEmployer,
					
					start, end, orderByComparator
				};
		}

		List<WorkingUnit> list = (List<WorkingUnit>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (WorkingUnit workingUnit : list) {
				if ((companyId != workingUnit.getCompanyId()) ||
						(isEmployer != workingUnit.getIsEmployer())) {
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

			query.append(_SQL_SELECT_WORKINGUNIT_WHERE);

			query.append(_FINDER_COLUMN_C_ISE_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_ISE_ISEMPLOYER_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(WorkingUnitModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(isEmployer);

				if (!pagination) {
					list = (List<WorkingUnit>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<WorkingUnit>(list);
				}
				else {
					list = (List<WorkingUnit>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first Working Unit in the ordered set where companyId = &#63; and isEmployer = &#63;.
	 *
	 * @param companyId the company ID
	 * @param isEmployer the is employer
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit findByC_IsE_First(long companyId, int isEmployer,
		OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = fetchByC_IsE_First(companyId, isEmployer,
				orderByComparator);

		if (workingUnit != null) {
			return workingUnit;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", isEmployer=");
		msg.append(isEmployer);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWorkingUnitException(msg.toString());
	}

	/**
	 * Returns the first Working Unit in the ordered set where companyId = &#63; and isEmployer = &#63;.
	 *
	 * @param companyId the company ID
	 * @param isEmployer the is employer
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit fetchByC_IsE_First(long companyId, int isEmployer,
		OrderByComparator orderByComparator) throws SystemException {
		List<WorkingUnit> list = findByC_IsE(companyId, isEmployer, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last Working Unit in the ordered set where companyId = &#63; and isEmployer = &#63;.
	 *
	 * @param companyId the company ID
	 * @param isEmployer the is employer
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit findByC_IsE_Last(long companyId, int isEmployer,
		OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = fetchByC_IsE_Last(companyId, isEmployer,
				orderByComparator);

		if (workingUnit != null) {
			return workingUnit;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", isEmployer=");
		msg.append(isEmployer);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWorkingUnitException(msg.toString());
	}

	/**
	 * Returns the last Working Unit in the ordered set where companyId = &#63; and isEmployer = &#63;.
	 *
	 * @param companyId the company ID
	 * @param isEmployer the is employer
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit fetchByC_IsE_Last(long companyId, int isEmployer,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC_IsE(companyId, isEmployer);

		if (count == 0) {
			return null;
		}

		List<WorkingUnit> list = findByC_IsE(companyId, isEmployer, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the Working Units before and after the current Working Unit in the ordered set where companyId = &#63; and isEmployer = &#63;.
	 *
	 * @param workingUnitId the primary key of the current Working Unit
	 * @param companyId the company ID
	 * @param isEmployer the is employer
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a Working Unit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit[] findByC_IsE_PrevAndNext(long workingUnitId,
		long companyId, int isEmployer, OrderByComparator orderByComparator)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = findByPrimaryKey(workingUnitId);

		Session session = null;

		try {
			session = openSession();

			WorkingUnit[] array = new WorkingUnitImpl[3];

			array[0] = getByC_IsE_PrevAndNext(session, workingUnit, companyId,
					isEmployer, orderByComparator, true);

			array[1] = workingUnit;

			array[2] = getByC_IsE_PrevAndNext(session, workingUnit, companyId,
					isEmployer, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected WorkingUnit getByC_IsE_PrevAndNext(Session session,
		WorkingUnit workingUnit, long companyId, int isEmployer,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_WORKINGUNIT_WHERE);

		query.append(_FINDER_COLUMN_C_ISE_COMPANYID_2);

		query.append(_FINDER_COLUMN_C_ISE_ISEMPLOYER_2);

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
			query.append(WorkingUnitModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(isEmployer);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(workingUnit);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<WorkingUnit> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the Working Units where companyId = &#63; and isEmployer = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param isEmployer the is employer
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_IsE(long companyId, int isEmployer)
		throws SystemException {
		for (WorkingUnit workingUnit : findByC_IsE(companyId, isEmployer,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(workingUnit);
		}
	}

	/**
	 * Returns the number of Working Units where companyId = &#63; and isEmployer = &#63;.
	 *
	 * @param companyId the company ID
	 * @param isEmployer the is employer
	 * @return the number of matching Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_IsE(long companyId, int isEmployer)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_ISE;

		Object[] finderArgs = new Object[] { companyId, isEmployer };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_WORKINGUNIT_WHERE);

			query.append(_FINDER_COLUMN_C_ISE_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_ISE_ISEMPLOYER_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(isEmployer);

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

	private static final String _FINDER_COLUMN_C_ISE_COMPANYID_2 = "workingUnit.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_ISE_ISEMPLOYER_2 = "workingUnit.isEmployer = ?";

	public WorkingUnitPersistenceImpl() {
		setModelClass(WorkingUnit.class);
	}

	/**
	 * Caches the Working Unit in the entity cache if it is enabled.
	 *
	 * @param workingUnit the Working Unit
	 */
	@Override
	public void cacheResult(WorkingUnit workingUnit) {
		EntityCacheUtil.putResult(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitImpl.class, workingUnit.getPrimaryKey(), workingUnit);

		workingUnit.resetOriginalValues();
	}

	/**
	 * Caches the Working Units in the entity cache if it is enabled.
	 *
	 * @param workingUnits the Working Units
	 */
	@Override
	public void cacheResult(List<WorkingUnit> workingUnits) {
		for (WorkingUnit workingUnit : workingUnits) {
			if (EntityCacheUtil.getResult(
						WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
						WorkingUnitImpl.class, workingUnit.getPrimaryKey()) == null) {
				cacheResult(workingUnit);
			}
			else {
				workingUnit.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all Working Units.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(WorkingUnitImpl.class.getName());
		}

		EntityCacheUtil.clearCache(WorkingUnitImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the Working Unit.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(WorkingUnit workingUnit) {
		EntityCacheUtil.removeResult(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitImpl.class, workingUnit.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<WorkingUnit> workingUnits) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (WorkingUnit workingUnit : workingUnits) {
			EntityCacheUtil.removeResult(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
				WorkingUnitImpl.class, workingUnit.getPrimaryKey());
		}
	}

	/**
	 * Creates a new Working Unit with the primary key. Does not add the Working Unit to the database.
	 *
	 * @param workingUnitId the primary key for the new Working Unit
	 * @return the new Working Unit
	 */
	@Override
	public WorkingUnit create(long workingUnitId) {
		WorkingUnit workingUnit = new WorkingUnitImpl();

		workingUnit.setNew(true);
		workingUnit.setPrimaryKey(workingUnitId);

		return workingUnit;
	}

	/**
	 * Removes the Working Unit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param workingUnitId the primary key of the Working Unit
	 * @return the Working Unit that was removed
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a Working Unit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit remove(long workingUnitId)
		throws NoSuchWorkingUnitException, SystemException {
		return remove((Serializable)workingUnitId);
	}

	/**
	 * Removes the Working Unit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the Working Unit
	 * @return the Working Unit that was removed
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a Working Unit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit remove(Serializable primaryKey)
		throws NoSuchWorkingUnitException, SystemException {
		Session session = null;

		try {
			session = openSession();

			WorkingUnit workingUnit = (WorkingUnit)session.get(WorkingUnitImpl.class,
					primaryKey);

			if (workingUnit == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchWorkingUnitException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(workingUnit);
		}
		catch (NoSuchWorkingUnitException nsee) {
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
	protected WorkingUnit removeImpl(WorkingUnit workingUnit)
		throws SystemException {
		workingUnit = toUnwrappedModel(workingUnit);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(workingUnit)) {
				workingUnit = (WorkingUnit)session.get(WorkingUnitImpl.class,
						workingUnit.getPrimaryKeyObj());
			}

			if (workingUnit != null) {
				session.delete(workingUnit);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (workingUnit != null) {
			clearCache(workingUnit);
		}

		return workingUnit;
	}

	@Override
	public WorkingUnit updateImpl(org.oep.usermgt.model.WorkingUnit workingUnit)
		throws SystemException {
		workingUnit = toUnwrappedModel(workingUnit);

		boolean isNew = workingUnit.isNew();

		WorkingUnitModelImpl workingUnitModelImpl = (WorkingUnitModelImpl)workingUnit;

		Session session = null;

		try {
			session = openSession();

			if (workingUnit.isNew()) {
				session.save(workingUnit);

				workingUnit.setNew(false);
			}
			else {
				session.merge(workingUnit);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !WorkingUnitModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((workingUnitModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						workingUnitModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C,
					args);

				args = new Object[] { workingUnitModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C,
					args);
			}

			if ((workingUnitModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						workingUnitModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G,
					args);

				args = new Object[] { workingUnitModelImpl.getGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G,
					args);
			}

			if ((workingUnitModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						workingUnitModelImpl.getOriginalOrganizationId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_O, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O,
					args);

				args = new Object[] { workingUnitModelImpl.getOrganizationId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_O, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O,
					args);
			}

			if ((workingUnitModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GA.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						workingUnitModelImpl.getOriginalGovAgencyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GA, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GA,
					args);

				args = new Object[] { workingUnitModelImpl.getGovAgencyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GA, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GA,
					args);
			}

			if ((workingUnitModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						workingUnitModelImpl.getOriginalCityNo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CN,
					args);

				args = new Object[] { workingUnitModelImpl.getCityNo() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CN,
					args);
			}

			if ((workingUnitModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						workingUnitModelImpl.getOriginalDistrictNo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DN,
					args);

				args = new Object[] { workingUnitModelImpl.getDistrictNo() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DN,
					args);
			}

			if ((workingUnitModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WA.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						workingUnitModelImpl.getOriginalWardNo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WA, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WA,
					args);

				args = new Object[] { workingUnitModelImpl.getWardNo() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WA, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WA,
					args);
			}

			if ((workingUnitModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PW.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						workingUnitModelImpl.getOriginalParentWorkingUnitId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PW, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PW,
					args);

				args = new Object[] {
						workingUnitModelImpl.getParentWorkingUnitId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PW, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PW,
					args);
			}

			if ((workingUnitModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_PW.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						workingUnitModelImpl.getOriginalCompanyId(),
						workingUnitModelImpl.getOriginalParentWorkingUnitId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_PW, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_PW,
					args);

				args = new Object[] {
						workingUnitModelImpl.getCompanyId(),
						workingUnitModelImpl.getParentWorkingUnitId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_PW, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_PW,
					args);
			}

			if ((workingUnitModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_PW.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						workingUnitModelImpl.getOriginalGroupId(),
						workingUnitModelImpl.getOriginalParentWorkingUnitId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_PW, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_PW,
					args);

				args = new Object[] {
						workingUnitModelImpl.getGroupId(),
						workingUnitModelImpl.getParentWorkingUnitId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_PW, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_PW,
					args);
			}

			if ((workingUnitModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						workingUnitModelImpl.getOriginalLocalSiteId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LS, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LS,
					args);

				args = new Object[] { workingUnitModelImpl.getLocalSiteId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LS, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LS,
					args);
			}

			if ((workingUnitModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_ISE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						workingUnitModelImpl.getOriginalCompanyId(),
						workingUnitModelImpl.getOriginalIsEmployer()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_ISE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_ISE,
					args);

				args = new Object[] {
						workingUnitModelImpl.getCompanyId(),
						workingUnitModelImpl.getIsEmployer()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_ISE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_ISE,
					args);
			}
		}

		EntityCacheUtil.putResult(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
			WorkingUnitImpl.class, workingUnit.getPrimaryKey(), workingUnit);

		return workingUnit;
	}

	protected WorkingUnit toUnwrappedModel(WorkingUnit workingUnit) {
		if (workingUnit instanceof WorkingUnitImpl) {
			return workingUnit;
		}

		WorkingUnitImpl workingUnitImpl = new WorkingUnitImpl();

		workingUnitImpl.setNew(workingUnit.isNew());
		workingUnitImpl.setPrimaryKey(workingUnit.getPrimaryKey());

		workingUnitImpl.setWorkingUnitId(workingUnit.getWorkingUnitId());
		workingUnitImpl.setCompanyId(workingUnit.getCompanyId());
		workingUnitImpl.setGroupId(workingUnit.getGroupId());
		workingUnitImpl.setUserId(workingUnit.getUserId());
		workingUnitImpl.setCreateDate(workingUnit.getCreateDate());
		workingUnitImpl.setModifiedDate(workingUnit.getModifiedDate());
		workingUnitImpl.setOrganizationId(workingUnit.getOrganizationId());
		workingUnitImpl.setGovAgencyId(workingUnit.getGovAgencyId());
		workingUnitImpl.setName(workingUnit.getName());
		workingUnitImpl.setEnName(workingUnit.getEnName());
		workingUnitImpl.setParentWorkingUnitId(workingUnit.getParentWorkingUnitId());
		workingUnitImpl.setAddress(workingUnit.getAddress());
		workingUnitImpl.setCityNo(workingUnit.getCityNo());
		workingUnitImpl.setCityName(workingUnit.getCityName());
		workingUnitImpl.setDistrictNo(workingUnit.getDistrictNo());
		workingUnitImpl.setDistrictName(workingUnit.getDistrictName());
		workingUnitImpl.setWardNo(workingUnit.getWardNo());
		workingUnitImpl.setWardName(workingUnit.getWardName());
		workingUnitImpl.setGpsPosition(workingUnit.getGpsPosition());
		workingUnitImpl.setTelNo(workingUnit.getTelNo());
		workingUnitImpl.setFax(workingUnit.getFax());
		workingUnitImpl.setEmail(workingUnit.getEmail());
		workingUnitImpl.setWebsite(workingUnit.getWebsite());
		workingUnitImpl.setAaa(workingUnit.getAaa());
		workingUnitImpl.setShortName(workingUnit.getShortName());
		workingUnitImpl.setLocalSiteId(workingUnit.getLocalSiteId());
		workingUnitImpl.setIsEmployer(workingUnit.getIsEmployer());

		return workingUnitImpl;
	}

	/**
	 * Returns the Working Unit with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the Working Unit
	 * @return the Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a Working Unit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit findByPrimaryKey(Serializable primaryKey)
		throws NoSuchWorkingUnitException, SystemException {
		WorkingUnit workingUnit = fetchByPrimaryKey(primaryKey);

		if (workingUnit == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchWorkingUnitException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return workingUnit;
	}

	/**
	 * Returns the Working Unit with the primary key or throws a {@link org.oep.usermgt.NoSuchWorkingUnitException} if it could not be found.
	 *
	 * @param workingUnitId the primary key of the Working Unit
	 * @return the Working Unit
	 * @throws org.oep.usermgt.NoSuchWorkingUnitException if a Working Unit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit findByPrimaryKey(long workingUnitId)
		throws NoSuchWorkingUnitException, SystemException {
		return findByPrimaryKey((Serializable)workingUnitId);
	}

	/**
	 * Returns the Working Unit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the Working Unit
	 * @return the Working Unit, or <code>null</code> if a Working Unit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		WorkingUnit workingUnit = (WorkingUnit)EntityCacheUtil.getResult(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
				WorkingUnitImpl.class, primaryKey);

		if (workingUnit == _nullWorkingUnit) {
			return null;
		}

		if (workingUnit == null) {
			Session session = null;

			try {
				session = openSession();

				workingUnit = (WorkingUnit)session.get(WorkingUnitImpl.class,
						primaryKey);

				if (workingUnit != null) {
					cacheResult(workingUnit);
				}
				else {
					EntityCacheUtil.putResult(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
						WorkingUnitImpl.class, primaryKey, _nullWorkingUnit);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(WorkingUnitModelImpl.ENTITY_CACHE_ENABLED,
					WorkingUnitImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return workingUnit;
	}

	/**
	 * Returns the Working Unit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param workingUnitId the primary key of the Working Unit
	 * @return the Working Unit, or <code>null</code> if a Working Unit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkingUnit fetchByPrimaryKey(long workingUnitId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)workingUnitId);
	}

	/**
	 * Returns all the Working Units.
	 *
	 * @return the Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Working Units.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Working Units
	 * @param end the upper bound of the range of Working Units (not inclusive)
	 * @return the range of Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the Working Units.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Working Units
	 * @param end the upper bound of the range of Working Units (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of Working Units
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkingUnit> findAll(int start, int end,
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

		List<WorkingUnit> list = (List<WorkingUnit>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_WORKINGUNIT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_WORKINGUNIT;

				if (pagination) {
					sql = sql.concat(WorkingUnitModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<WorkingUnit>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<WorkingUnit>(list);
				}
				else {
					list = (List<WorkingUnit>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the Working Units from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (WorkingUnit workingUnit : findAll()) {
			remove(workingUnit);
		}
	}

	/**
	 * Returns the number of Working Units.
	 *
	 * @return the number of Working Units
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

				Query q = session.createQuery(_SQL_COUNT_WORKINGUNIT);

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
	 * Initializes the Working Unit persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.usermgt.model.WorkingUnit")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<WorkingUnit>> listenersList = new ArrayList<ModelListener<WorkingUnit>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<WorkingUnit>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(WorkingUnitImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_WORKINGUNIT = "SELECT workingUnit FROM WorkingUnit workingUnit";
	private static final String _SQL_SELECT_WORKINGUNIT_WHERE = "SELECT workingUnit FROM WorkingUnit workingUnit WHERE ";
	private static final String _SQL_COUNT_WORKINGUNIT = "SELECT COUNT(workingUnit) FROM WorkingUnit workingUnit";
	private static final String _SQL_COUNT_WORKINGUNIT_WHERE = "SELECT COUNT(workingUnit) FROM WorkingUnit workingUnit WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "workingUnit.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No WorkingUnit exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No WorkingUnit exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(WorkingUnitPersistenceImpl.class);
	private static WorkingUnit _nullWorkingUnit = new WorkingUnitImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<WorkingUnit> toCacheModel() {
				return _nullWorkingUnitCacheModel;
			}
		};

	private static CacheModel<WorkingUnit> _nullWorkingUnitCacheModel = new CacheModel<WorkingUnit>() {
			@Override
			public WorkingUnit toEntityModel() {
				return _nullWorkingUnit;
			}
		};
}