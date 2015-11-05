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

import com.liferay.portal.kernel.bean.BeanReference;
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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.service.persistence.impl.TableMapper;
import com.liferay.portal.service.persistence.impl.TableMapperFactory;

import org.oep.usermgt.NoSuchEmployeeException;
import org.oep.usermgt.model.Employee;
import org.oep.usermgt.model.impl.EmployeeImpl;
import org.oep.usermgt.model.impl.EmployeeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the employee service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NQMINH
 * @see EmployeePersistence
 * @see EmployeeUtil
 * @generated
 */
public class EmployeePersistenceImpl extends BasePersistenceImpl<Employee>
	implements EmployeePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EmployeeUtil} to access the employee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EmployeeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_MU = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByMU",
			new String[] { Long.class.getName() },
			EmployeeModelImpl.MAPPINGUSERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MU = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMU",
			new String[] { Long.class.getName() });

	/**
	 * Returns the employee where mappingUserId = &#63; or throws a {@link org.oep.usermgt.NoSuchEmployeeException} if it could not be found.
	 *
	 * @param mappingUserId the mapping user ID
	 * @return the matching employee
	 * @throws org.oep.usermgt.NoSuchEmployeeException if a matching employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Employee findByMU(long mappingUserId)
		throws NoSuchEmployeeException, SystemException {
		Employee employee = fetchByMU(mappingUserId);

		if (employee == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("mappingUserId=");
			msg.append(mappingUserId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchEmployeeException(msg.toString());
		}

		return employee;
	}

	/**
	 * Returns the employee where mappingUserId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param mappingUserId the mapping user ID
	 * @return the matching employee, or <code>null</code> if a matching employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Employee fetchByMU(long mappingUserId) throws SystemException {
		return fetchByMU(mappingUserId, true);
	}

	/**
	 * Returns the employee where mappingUserId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param mappingUserId the mapping user ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching employee, or <code>null</code> if a matching employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Employee fetchByMU(long mappingUserId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { mappingUserId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_MU,
					finderArgs, this);
		}

		if (result instanceof Employee) {
			Employee employee = (Employee)result;

			if ((mappingUserId != employee.getMappingUserId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_EMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_MU_MAPPINGUSERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mappingUserId);

				List<Employee> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MU,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"EmployeePersistenceImpl.fetchByMU(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					Employee employee = list.get(0);

					result = employee;

					cacheResult(employee);

					if ((employee.getMappingUserId() != mappingUserId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MU,
							finderArgs, employee);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MU, finderArgs);

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
			return (Employee)result;
		}
	}

	/**
	 * Removes the employee where mappingUserId = &#63; from the database.
	 *
	 * @param mappingUserId the mapping user ID
	 * @return the employee that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Employee removeByMU(long mappingUserId)
		throws NoSuchEmployeeException, SystemException {
		Employee employee = findByMU(mappingUserId);

		return remove(employee);
	}

	/**
	 * Returns the number of employees where mappingUserId = &#63;.
	 *
	 * @param mappingUserId the mapping user ID
	 * @return the number of matching employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByMU(long mappingUserId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MU;

		Object[] finderArgs = new Object[] { mappingUserId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_MU_MAPPINGUSERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mappingUserId);

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

	private static final String _FINDER_COLUMN_MU_MAPPINGUSERID_2 = "employee.mappingUserId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_WU = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByWU",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WU = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByWU",
			new String[] { Long.class.getName() },
			EmployeeModelImpl.WORKINGUNITID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_WU = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByWU",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the employees where workingUnitId = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @return the matching employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Employee> findByWU(long workingUnitId)
		throws SystemException {
		return findByWU(workingUnitId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the employees where workingUnitId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param workingUnitId the working unit ID
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @return the range of matching employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Employee> findByWU(long workingUnitId, int start, int end)
		throws SystemException {
		return findByWU(workingUnitId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the employees where workingUnitId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param workingUnitId the working unit ID
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Employee> findByWU(long workingUnitId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WU;
			finderArgs = new Object[] { workingUnitId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_WU;
			finderArgs = new Object[] {
					workingUnitId,
					
					start, end, orderByComparator
				};
		}

		List<Employee> list = (List<Employee>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Employee employee : list) {
				if ((workingUnitId != employee.getWorkingUnitId())) {
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

			query.append(_SQL_SELECT_EMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_WU_WORKINGUNITID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(EmployeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(workingUnitId);

				if (!pagination) {
					list = (List<Employee>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Employee>(list);
				}
				else {
					list = (List<Employee>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first employee in the ordered set where workingUnitId = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee
	 * @throws org.oep.usermgt.NoSuchEmployeeException if a matching employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Employee findByWU_First(long workingUnitId,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeException, SystemException {
		Employee employee = fetchByWU_First(workingUnitId, orderByComparator);

		if (employee != null) {
			return employee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("workingUnitId=");
		msg.append(workingUnitId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEmployeeException(msg.toString());
	}

	/**
	 * Returns the first employee in the ordered set where workingUnitId = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee, or <code>null</code> if a matching employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Employee fetchByWU_First(long workingUnitId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Employee> list = findByWU(workingUnitId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last employee in the ordered set where workingUnitId = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee
	 * @throws org.oep.usermgt.NoSuchEmployeeException if a matching employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Employee findByWU_Last(long workingUnitId,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeException, SystemException {
		Employee employee = fetchByWU_Last(workingUnitId, orderByComparator);

		if (employee != null) {
			return employee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("workingUnitId=");
		msg.append(workingUnitId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEmployeeException(msg.toString());
	}

	/**
	 * Returns the last employee in the ordered set where workingUnitId = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee, or <code>null</code> if a matching employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Employee fetchByWU_Last(long workingUnitId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByWU(workingUnitId);

		if (count == 0) {
			return null;
		}

		List<Employee> list = findByWU(workingUnitId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the employees before and after the current employee in the ordered set where workingUnitId = &#63;.
	 *
	 * @param employeeId the primary key of the current employee
	 * @param workingUnitId the working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next employee
	 * @throws org.oep.usermgt.NoSuchEmployeeException if a employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Employee[] findByWU_PrevAndNext(long employeeId, long workingUnitId,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeException, SystemException {
		Employee employee = findByPrimaryKey(employeeId);

		Session session = null;

		try {
			session = openSession();

			Employee[] array = new EmployeeImpl[3];

			array[0] = getByWU_PrevAndNext(session, employee, workingUnitId,
					orderByComparator, true);

			array[1] = employee;

			array[2] = getByWU_PrevAndNext(session, employee, workingUnitId,
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

	protected Employee getByWU_PrevAndNext(Session session, Employee employee,
		long workingUnitId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EMPLOYEE_WHERE);

		query.append(_FINDER_COLUMN_WU_WORKINGUNITID_2);

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
			query.append(EmployeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(workingUnitId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(employee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Employee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the employees where workingUnitId = &#63; from the database.
	 *
	 * @param workingUnitId the working unit ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByWU(long workingUnitId) throws SystemException {
		for (Employee employee : findByWU(workingUnitId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(employee);
		}
	}

	/**
	 * Returns the number of employees where workingUnitId = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @return the number of matching employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByWU(long workingUnitId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_WU;

		Object[] finderArgs = new Object[] { workingUnitId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_WU_WORKINGUNITID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(workingUnitId);

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

	private static final String _FINDER_COLUMN_WU_WORKINGUNITID_2 = "employee.workingUnitId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_WU_MJ = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByWU_MJ",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WU_MJ = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByWU_MJ",
			new String[] { Long.class.getName(), Long.class.getName() },
			EmployeeModelImpl.WORKINGUNITID_COLUMN_BITMASK |
			EmployeeModelImpl.MAINJOBPOSID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_WU_MJ = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByWU_MJ",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the employees where workingUnitId = &#63; and mainJobPosId = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param mainJobPosId the main job pos ID
	 * @return the matching employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Employee> findByWU_MJ(long workingUnitId, long mainJobPosId)
		throws SystemException {
		return findByWU_MJ(workingUnitId, mainJobPosId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the employees where workingUnitId = &#63; and mainJobPosId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param workingUnitId the working unit ID
	 * @param mainJobPosId the main job pos ID
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @return the range of matching employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Employee> findByWU_MJ(long workingUnitId, long mainJobPosId,
		int start, int end) throws SystemException {
		return findByWU_MJ(workingUnitId, mainJobPosId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the employees where workingUnitId = &#63; and mainJobPosId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param workingUnitId the working unit ID
	 * @param mainJobPosId the main job pos ID
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Employee> findByWU_MJ(long workingUnitId, long mainJobPosId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WU_MJ;
			finderArgs = new Object[] { workingUnitId, mainJobPosId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_WU_MJ;
			finderArgs = new Object[] {
					workingUnitId, mainJobPosId,
					
					start, end, orderByComparator
				};
		}

		List<Employee> list = (List<Employee>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Employee employee : list) {
				if ((workingUnitId != employee.getWorkingUnitId()) ||
						(mainJobPosId != employee.getMainJobPosId())) {
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

			query.append(_SQL_SELECT_EMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_WU_MJ_WORKINGUNITID_2);

			query.append(_FINDER_COLUMN_WU_MJ_MAINJOBPOSID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(EmployeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(workingUnitId);

				qPos.add(mainJobPosId);

				if (!pagination) {
					list = (List<Employee>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Employee>(list);
				}
				else {
					list = (List<Employee>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first employee in the ordered set where workingUnitId = &#63; and mainJobPosId = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param mainJobPosId the main job pos ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee
	 * @throws org.oep.usermgt.NoSuchEmployeeException if a matching employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Employee findByWU_MJ_First(long workingUnitId, long mainJobPosId,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeException, SystemException {
		Employee employee = fetchByWU_MJ_First(workingUnitId, mainJobPosId,
				orderByComparator);

		if (employee != null) {
			return employee;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("workingUnitId=");
		msg.append(workingUnitId);

		msg.append(", mainJobPosId=");
		msg.append(mainJobPosId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEmployeeException(msg.toString());
	}

	/**
	 * Returns the first employee in the ordered set where workingUnitId = &#63; and mainJobPosId = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param mainJobPosId the main job pos ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee, or <code>null</code> if a matching employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Employee fetchByWU_MJ_First(long workingUnitId, long mainJobPosId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Employee> list = findByWU_MJ(workingUnitId, mainJobPosId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last employee in the ordered set where workingUnitId = &#63; and mainJobPosId = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param mainJobPosId the main job pos ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee
	 * @throws org.oep.usermgt.NoSuchEmployeeException if a matching employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Employee findByWU_MJ_Last(long workingUnitId, long mainJobPosId,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeException, SystemException {
		Employee employee = fetchByWU_MJ_Last(workingUnitId, mainJobPosId,
				orderByComparator);

		if (employee != null) {
			return employee;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("workingUnitId=");
		msg.append(workingUnitId);

		msg.append(", mainJobPosId=");
		msg.append(mainJobPosId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEmployeeException(msg.toString());
	}

	/**
	 * Returns the last employee in the ordered set where workingUnitId = &#63; and mainJobPosId = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param mainJobPosId the main job pos ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee, or <code>null</code> if a matching employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Employee fetchByWU_MJ_Last(long workingUnitId, long mainJobPosId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByWU_MJ(workingUnitId, mainJobPosId);

		if (count == 0) {
			return null;
		}

		List<Employee> list = findByWU_MJ(workingUnitId, mainJobPosId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the employees before and after the current employee in the ordered set where workingUnitId = &#63; and mainJobPosId = &#63;.
	 *
	 * @param employeeId the primary key of the current employee
	 * @param workingUnitId the working unit ID
	 * @param mainJobPosId the main job pos ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next employee
	 * @throws org.oep.usermgt.NoSuchEmployeeException if a employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Employee[] findByWU_MJ_PrevAndNext(long employeeId,
		long workingUnitId, long mainJobPosId,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeException, SystemException {
		Employee employee = findByPrimaryKey(employeeId);

		Session session = null;

		try {
			session = openSession();

			Employee[] array = new EmployeeImpl[3];

			array[0] = getByWU_MJ_PrevAndNext(session, employee, workingUnitId,
					mainJobPosId, orderByComparator, true);

			array[1] = employee;

			array[2] = getByWU_MJ_PrevAndNext(session, employee, workingUnitId,
					mainJobPosId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Employee getByWU_MJ_PrevAndNext(Session session,
		Employee employee, long workingUnitId, long mainJobPosId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EMPLOYEE_WHERE);

		query.append(_FINDER_COLUMN_WU_MJ_WORKINGUNITID_2);

		query.append(_FINDER_COLUMN_WU_MJ_MAINJOBPOSID_2);

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
			query.append(EmployeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(workingUnitId);

		qPos.add(mainJobPosId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(employee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Employee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the employees where workingUnitId = &#63; and mainJobPosId = &#63; from the database.
	 *
	 * @param workingUnitId the working unit ID
	 * @param mainJobPosId the main job pos ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByWU_MJ(long workingUnitId, long mainJobPosId)
		throws SystemException {
		for (Employee employee : findByWU_MJ(workingUnitId, mainJobPosId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(employee);
		}
	}

	/**
	 * Returns the number of employees where workingUnitId = &#63; and mainJobPosId = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param mainJobPosId the main job pos ID
	 * @return the number of matching employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByWU_MJ(long workingUnitId, long mainJobPosId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_WU_MJ;

		Object[] finderArgs = new Object[] { workingUnitId, mainJobPosId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_EMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_WU_MJ_WORKINGUNITID_2);

			query.append(_FINDER_COLUMN_WU_MJ_MAINJOBPOSID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(workingUnitId);

				qPos.add(mainJobPosId);

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

	private static final String _FINDER_COLUMN_WU_MJ_WORKINGUNITID_2 = "employee.workingUnitId = ? AND ";
	private static final String _FINDER_COLUMN_WU_MJ_MAINJOBPOSID_2 = "employee.mainJobPosId = ?";

	public EmployeePersistenceImpl() {
		setModelClass(Employee.class);
	}

	/**
	 * Caches the employee in the entity cache if it is enabled.
	 *
	 * @param employee the employee
	 */
	@Override
	public void cacheResult(Employee employee) {
		EntityCacheUtil.putResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeImpl.class, employee.getPrimaryKey(), employee);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MU,
			new Object[] { employee.getMappingUserId() }, employee);

		employee.resetOriginalValues();
	}

	/**
	 * Caches the employees in the entity cache if it is enabled.
	 *
	 * @param employees the employees
	 */
	@Override
	public void cacheResult(List<Employee> employees) {
		for (Employee employee : employees) {
			if (EntityCacheUtil.getResult(
						EmployeeModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeImpl.class, employee.getPrimaryKey()) == null) {
				cacheResult(employee);
			}
			else {
				employee.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all employees.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EmployeeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EmployeeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the employee.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Employee employee) {
		EntityCacheUtil.removeResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeImpl.class, employee.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(employee);
	}

	@Override
	public void clearCache(List<Employee> employees) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Employee employee : employees) {
			EntityCacheUtil.removeResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeImpl.class, employee.getPrimaryKey());

			clearUniqueFindersCache(employee);
		}
	}

	protected void cacheUniqueFindersCache(Employee employee) {
		if (employee.isNew()) {
			Object[] args = new Object[] { employee.getMappingUserId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MU, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MU, args, employee);
		}
		else {
			EmployeeModelImpl employeeModelImpl = (EmployeeModelImpl)employee;

			if ((employeeModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_MU.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { employee.getMappingUserId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MU, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MU, args,
					employee);
			}
		}
	}

	protected void clearUniqueFindersCache(Employee employee) {
		EmployeeModelImpl employeeModelImpl = (EmployeeModelImpl)employee;

		Object[] args = new Object[] { employee.getMappingUserId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MU, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MU, args);

		if ((employeeModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_MU.getColumnBitmask()) != 0) {
			args = new Object[] { employeeModelImpl.getOriginalMappingUserId() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MU, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MU, args);
		}
	}

	/**
	 * Creates a new employee with the primary key. Does not add the employee to the database.
	 *
	 * @param employeeId the primary key for the new employee
	 * @return the new employee
	 */
	@Override
	public Employee create(long employeeId) {
		Employee employee = new EmployeeImpl();

		employee.setNew(true);
		employee.setPrimaryKey(employeeId);

		return employee;
	}

	/**
	 * Removes the employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param employeeId the primary key of the employee
	 * @return the employee that was removed
	 * @throws org.oep.usermgt.NoSuchEmployeeException if a employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Employee remove(long employeeId)
		throws NoSuchEmployeeException, SystemException {
		return remove((Serializable)employeeId);
	}

	/**
	 * Removes the employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the employee
	 * @return the employee that was removed
	 * @throws org.oep.usermgt.NoSuchEmployeeException if a employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Employee remove(Serializable primaryKey)
		throws NoSuchEmployeeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Employee employee = (Employee)session.get(EmployeeImpl.class,
					primaryKey);

			if (employee == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEmployeeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(employee);
		}
		catch (NoSuchEmployeeException nsee) {
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
	protected Employee removeImpl(Employee employee) throws SystemException {
		employee = toUnwrappedModel(employee);

		employeeToJobPosTableMapper.deleteLeftPrimaryKeyTableMappings(employee.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(employee)) {
				employee = (Employee)session.get(EmployeeImpl.class,
						employee.getPrimaryKeyObj());
			}

			if (employee != null) {
				session.delete(employee);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (employee != null) {
			clearCache(employee);
		}

		return employee;
	}

	@Override
	public Employee updateImpl(org.oep.usermgt.model.Employee employee)
		throws SystemException {
		employee = toUnwrappedModel(employee);

		boolean isNew = employee.isNew();

		EmployeeModelImpl employeeModelImpl = (EmployeeModelImpl)employee;

		Session session = null;

		try {
			session = openSession();

			if (employee.isNew()) {
				session.save(employee);

				employee.setNew(false);
			}
			else {
				session.merge(employee);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !EmployeeModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((employeeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WU.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						employeeModelImpl.getOriginalWorkingUnitId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WU, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WU,
					args);

				args = new Object[] { employeeModelImpl.getWorkingUnitId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WU, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WU,
					args);
			}

			if ((employeeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WU_MJ.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						employeeModelImpl.getOriginalWorkingUnitId(),
						employeeModelImpl.getOriginalMainJobPosId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WU_MJ, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WU_MJ,
					args);

				args = new Object[] {
						employeeModelImpl.getWorkingUnitId(),
						employeeModelImpl.getMainJobPosId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WU_MJ, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WU_MJ,
					args);
			}
		}

		EntityCacheUtil.putResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeImpl.class, employee.getPrimaryKey(), employee);

		clearUniqueFindersCache(employee);
		cacheUniqueFindersCache(employee);

		return employee;
	}

	protected Employee toUnwrappedModel(Employee employee) {
		if (employee instanceof EmployeeImpl) {
			return employee;
		}

		EmployeeImpl employeeImpl = new EmployeeImpl();

		employeeImpl.setNew(employee.isNew());
		employeeImpl.setPrimaryKey(employee.getPrimaryKey());

		employeeImpl.setEmployeeId(employee.getEmployeeId());
		employeeImpl.setCompanyId(employee.getCompanyId());
		employeeImpl.setGroupId(employee.getGroupId());
		employeeImpl.setUserId(employee.getUserId());
		employeeImpl.setCreateDate(employee.getCreateDate());
		employeeImpl.setModifiedDate(employee.getModifiedDate());
		employeeImpl.setMappingUserId(employee.getMappingUserId());
		employeeImpl.setWorkingUnitId(employee.getWorkingUnitId());
		employeeImpl.setMainJobPosId(employee.getMainJobPosId());
		employeeImpl.setEmployeeNo(employee.getEmployeeNo());
		employeeImpl.setFullName(employee.getFullName());
		employeeImpl.setOfficeTel(employee.getOfficeTel());
		employeeImpl.setHomeTel(employee.getHomeTel());
		employeeImpl.setMobile(employee.getMobile());
		employeeImpl.setEmail(employee.getEmail());
		employeeImpl.setShortName(employee.getShortName());
		employeeImpl.setPersonelDocNo(employee.getPersonelDocNo());
		employeeImpl.setGender(employee.getGender());
		employeeImpl.setBirthdate(employee.getBirthdate());

		return employeeImpl;
	}

	/**
	 * Returns the employee with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee
	 * @return the employee
	 * @throws org.oep.usermgt.NoSuchEmployeeException if a employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Employee findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEmployeeException, SystemException {
		Employee employee = fetchByPrimaryKey(primaryKey);

		if (employee == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEmployeeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return employee;
	}

	/**
	 * Returns the employee with the primary key or throws a {@link org.oep.usermgt.NoSuchEmployeeException} if it could not be found.
	 *
	 * @param employeeId the primary key of the employee
	 * @return the employee
	 * @throws org.oep.usermgt.NoSuchEmployeeException if a employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Employee findByPrimaryKey(long employeeId)
		throws NoSuchEmployeeException, SystemException {
		return findByPrimaryKey((Serializable)employeeId);
	}

	/**
	 * Returns the employee with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee
	 * @return the employee, or <code>null</code> if a employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Employee fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Employee employee = (Employee)EntityCacheUtil.getResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeImpl.class, primaryKey);

		if (employee == _nullEmployee) {
			return null;
		}

		if (employee == null) {
			Session session = null;

			try {
				session = openSession();

				employee = (Employee)session.get(EmployeeImpl.class, primaryKey);

				if (employee != null) {
					cacheResult(employee);
				}
				else {
					EntityCacheUtil.putResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeImpl.class, primaryKey, _nullEmployee);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
					EmployeeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return employee;
	}

	/**
	 * Returns the employee with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param employeeId the primary key of the employee
	 * @return the employee, or <code>null</code> if a employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Employee fetchByPrimaryKey(long employeeId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)employeeId);
	}

	/**
	 * Returns all the employees.
	 *
	 * @return the employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Employee> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @return the range of employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Employee> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Employee> findAll(int start, int end,
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

		List<Employee> list = (List<Employee>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EMPLOYEE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EMPLOYEE;

				if (pagination) {
					sql = sql.concat(EmployeeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Employee>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Employee>(list);
				}
				else {
					list = (List<Employee>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the employees from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Employee employee : findAll()) {
			remove(employee);
		}
	}

	/**
	 * Returns the number of employees.
	 *
	 * @return the number of employees
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

				Query q = session.createQuery(_SQL_COUNT_EMPLOYEE);

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
	 * Returns all the Job Poses associated with the employee.
	 *
	 * @param pk the primary key of the employee
	 * @return the Job Poses associated with the employee
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<org.oep.usermgt.model.JobPos> getJobPoses(long pk)
		throws SystemException {
		return getJobPoses(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the Job Poses associated with the employee.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the employee
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @return the range of Job Poses associated with the employee
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<org.oep.usermgt.model.JobPos> getJobPoses(long pk, int start,
		int end) throws SystemException {
		return getJobPoses(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the Job Poses associated with the employee.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the employee
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of Job Poses associated with the employee
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<org.oep.usermgt.model.JobPos> getJobPoses(long pk, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		return employeeToJobPosTableMapper.getRightBaseModels(pk, start, end,
			orderByComparator);
	}

	/**
	 * Returns the number of Job Poses associated with the employee.
	 *
	 * @param pk the primary key of the employee
	 * @return the number of Job Poses associated with the employee
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getJobPosesSize(long pk) throws SystemException {
		long[] pks = employeeToJobPosTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the Job Pos is associated with the employee.
	 *
	 * @param pk the primary key of the employee
	 * @param jobPosPK the primary key of the Job Pos
	 * @return <code>true</code> if the Job Pos is associated with the employee; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsJobPos(long pk, long jobPosPK)
		throws SystemException {
		return employeeToJobPosTableMapper.containsTableMapping(pk, jobPosPK);
	}

	/**
	 * Returns <code>true</code> if the employee has any Job Poses associated with it.
	 *
	 * @param pk the primary key of the employee to check for associations with Job Poses
	 * @return <code>true</code> if the employee has any Job Poses associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsJobPoses(long pk) throws SystemException {
		if (getJobPosesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the employee and the Job Pos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the employee
	 * @param jobPosPK the primary key of the Job Pos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addJobPos(long pk, long jobPosPK) throws SystemException {
		employeeToJobPosTableMapper.addTableMapping(pk, jobPosPK);
	}

	/**
	 * Adds an association between the employee and the Job Pos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the employee
	 * @param jobPos the Job Pos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addJobPos(long pk, org.oep.usermgt.model.JobPos jobPos)
		throws SystemException {
		employeeToJobPosTableMapper.addTableMapping(pk, jobPos.getPrimaryKey());
	}

	/**
	 * Adds an association between the employee and the Job Poses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the employee
	 * @param jobPosPKs the primary keys of the Job Poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addJobPoses(long pk, long[] jobPosPKs)
		throws SystemException {
		for (long jobPosPK : jobPosPKs) {
			employeeToJobPosTableMapper.addTableMapping(pk, jobPosPK);
		}
	}

	/**
	 * Adds an association between the employee and the Job Poses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the employee
	 * @param jobPoses the Job Poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addJobPoses(long pk, List<org.oep.usermgt.model.JobPos> jobPoses)
		throws SystemException {
		for (org.oep.usermgt.model.JobPos jobPos : jobPoses) {
			employeeToJobPosTableMapper.addTableMapping(pk,
				jobPos.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the employee and its Job Poses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the employee to clear the associated Job Poses from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearJobPoses(long pk) throws SystemException {
		employeeToJobPosTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the employee and the Job Pos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the employee
	 * @param jobPosPK the primary key of the Job Pos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeJobPos(long pk, long jobPosPK) throws SystemException {
		employeeToJobPosTableMapper.deleteTableMapping(pk, jobPosPK);
	}

	/**
	 * Removes the association between the employee and the Job Pos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the employee
	 * @param jobPos the Job Pos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeJobPos(long pk, org.oep.usermgt.model.JobPos jobPos)
		throws SystemException {
		employeeToJobPosTableMapper.deleteTableMapping(pk,
			jobPos.getPrimaryKey());
	}

	/**
	 * Removes the association between the employee and the Job Poses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the employee
	 * @param jobPosPKs the primary keys of the Job Poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeJobPoses(long pk, long[] jobPosPKs)
		throws SystemException {
		for (long jobPosPK : jobPosPKs) {
			employeeToJobPosTableMapper.deleteTableMapping(pk, jobPosPK);
		}
	}

	/**
	 * Removes the association between the employee and the Job Poses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the employee
	 * @param jobPoses the Job Poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeJobPoses(long pk,
		List<org.oep.usermgt.model.JobPos> jobPoses) throws SystemException {
		for (org.oep.usermgt.model.JobPos jobPos : jobPoses) {
			employeeToJobPosTableMapper.deleteTableMapping(pk,
				jobPos.getPrimaryKey());
		}
	}

	/**
	 * Sets the Job Poses associated with the employee, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the employee
	 * @param jobPosPKs the primary keys of the Job Poses to be associated with the employee
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setJobPoses(long pk, long[] jobPosPKs)
		throws SystemException {
		Set<Long> newJobPosPKsSet = SetUtil.fromArray(jobPosPKs);
		Set<Long> oldJobPosPKsSet = SetUtil.fromArray(employeeToJobPosTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeJobPosPKsSet = new HashSet<Long>(oldJobPosPKsSet);

		removeJobPosPKsSet.removeAll(newJobPosPKsSet);

		for (long removeJobPosPK : removeJobPosPKsSet) {
			employeeToJobPosTableMapper.deleteTableMapping(pk, removeJobPosPK);
		}

		newJobPosPKsSet.removeAll(oldJobPosPKsSet);

		for (long newJobPosPK : newJobPosPKsSet) {
			employeeToJobPosTableMapper.addTableMapping(pk, newJobPosPK);
		}
	}

	/**
	 * Sets the Job Poses associated with the employee, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the employee
	 * @param jobPoses the Job Poses to be associated with the employee
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setJobPoses(long pk, List<org.oep.usermgt.model.JobPos> jobPoses)
		throws SystemException {
		try {
			long[] jobPosPKs = new long[jobPoses.size()];

			for (int i = 0; i < jobPoses.size(); i++) {
				org.oep.usermgt.model.JobPos jobPos = jobPoses.get(i);

				jobPosPKs[i] = jobPos.getPrimaryKey();
			}

			setJobPoses(pk, jobPosPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(EmployeeModelImpl.MAPPING_TABLE_OEP_USERMGT_EMPLOYEE2JOBPOS_NAME);
		}
	}

	/**
	 * Initializes the employee persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.usermgt.model.Employee")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Employee>> listenersList = new ArrayList<ModelListener<Employee>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Employee>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		employeeToJobPosTableMapper = TableMapperFactory.getTableMapper("oep_usermgt_employee2jobpos",
				"employeeId", "jobPosId", this, jobPosPersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(EmployeeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = JobPosPersistence.class)
	protected JobPosPersistence jobPosPersistence;
	protected TableMapper<Employee, org.oep.usermgt.model.JobPos> employeeToJobPosTableMapper;
	private static final String _SQL_SELECT_EMPLOYEE = "SELECT employee FROM Employee employee";
	private static final String _SQL_SELECT_EMPLOYEE_WHERE = "SELECT employee FROM Employee employee WHERE ";
	private static final String _SQL_COUNT_EMPLOYEE = "SELECT COUNT(employee) FROM Employee employee";
	private static final String _SQL_COUNT_EMPLOYEE_WHERE = "SELECT COUNT(employee) FROM Employee employee WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "employee.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Employee exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Employee exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EmployeePersistenceImpl.class);
	private static Employee _nullEmployee = new EmployeeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Employee> toCacheModel() {
				return _nullEmployeeCacheModel;
			}
		};

	private static CacheModel<Employee> _nullEmployeeCacheModel = new CacheModel<Employee>() {
			@Override
			public Employee toEntityModel() {
				return _nullEmployee;
			}
		};
}