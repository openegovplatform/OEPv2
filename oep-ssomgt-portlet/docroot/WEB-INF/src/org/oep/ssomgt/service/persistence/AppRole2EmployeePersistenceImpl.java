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
import com.liferay.portal.kernel.util.ArrayUtil;
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

import org.oep.ssomgt.NoSuchAppRole2EmployeeException;
import org.oep.ssomgt.model.AppRole2Employee;
import org.oep.ssomgt.model.impl.AppRole2EmployeeImpl;
import org.oep.ssomgt.model.impl.AppRole2EmployeeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the app role2 employee service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see AppRole2EmployeePersistence
 * @see AppRole2EmployeeUtil
 * @generated
 */
public class AppRole2EmployeePersistenceImpl extends BasePersistenceImpl<AppRole2Employee>
	implements AppRole2EmployeePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AppRole2EmployeeUtil} to access the app role2 employee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AppRole2EmployeeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AppRole2EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2EmployeeModelImpl.FINDER_CACHE_ENABLED,
			AppRole2EmployeeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AppRole2EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2EmployeeModelImpl.FINDER_CACHE_ENABLED,
			AppRole2EmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AppRole2EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2EmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C = new FinderPath(AppRole2EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2EmployeeModelImpl.FINDER_CACHE_ENABLED,
			AppRole2EmployeeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByC",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C = new FinderPath(AppRole2EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2EmployeeModelImpl.FINDER_CACHE_ENABLED,
			AppRole2EmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC",
			new String[] { Long.class.getName() },
			AppRole2EmployeeModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C = new FinderPath(AppRole2EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2EmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the app role2 employees where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching app role2 employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2Employee> findByC(long companyId)
		throws SystemException {
		return findByC(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the app role2 employees where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of app role2 employees
	 * @param end the upper bound of the range of app role2 employees (not inclusive)
	 * @return the range of matching app role2 employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2Employee> findByC(long companyId, int start, int end)
		throws SystemException {
		return findByC(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the app role2 employees where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of app role2 employees
	 * @param end the upper bound of the range of app role2 employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching app role2 employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2Employee> findByC(long companyId, int start, int end,
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

		List<AppRole2Employee> list = (List<AppRole2Employee>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AppRole2Employee appRole2Employee : list) {
				if ((companyId != appRole2Employee.getCompanyId())) {
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

			query.append(_SQL_SELECT_APPROLE2EMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AppRole2EmployeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<AppRole2Employee>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AppRole2Employee>(list);
				}
				else {
					list = (List<AppRole2Employee>)QueryUtil.list(q,
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
	 * Returns the first app role2 employee in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app role2 employee
	 * @throws org.oep.ssomgt.NoSuchAppRole2EmployeeException if a matching app role2 employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee findByC_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchAppRole2EmployeeException, SystemException {
		AppRole2Employee appRole2Employee = fetchByC_First(companyId,
				orderByComparator);

		if (appRole2Employee != null) {
			return appRole2Employee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAppRole2EmployeeException(msg.toString());
	}

	/**
	 * Returns the first app role2 employee in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app role2 employee, or <code>null</code> if a matching app role2 employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee fetchByC_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<AppRole2Employee> list = findByC(companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last app role2 employee in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app role2 employee
	 * @throws org.oep.ssomgt.NoSuchAppRole2EmployeeException if a matching app role2 employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee findByC_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchAppRole2EmployeeException, SystemException {
		AppRole2Employee appRole2Employee = fetchByC_Last(companyId,
				orderByComparator);

		if (appRole2Employee != null) {
			return appRole2Employee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAppRole2EmployeeException(msg.toString());
	}

	/**
	 * Returns the last app role2 employee in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app role2 employee, or <code>null</code> if a matching app role2 employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee fetchByC_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC(companyId);

		if (count == 0) {
			return null;
		}

		List<AppRole2Employee> list = findByC(companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the app role2 employees before and after the current app role2 employee in the ordered set where companyId = &#63;.
	 *
	 * @param appRole2EmployeeId the primary key of the current app role2 employee
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next app role2 employee
	 * @throws org.oep.ssomgt.NoSuchAppRole2EmployeeException if a app role2 employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee[] findByC_PrevAndNext(long appRole2EmployeeId,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchAppRole2EmployeeException, SystemException {
		AppRole2Employee appRole2Employee = findByPrimaryKey(appRole2EmployeeId);

		Session session = null;

		try {
			session = openSession();

			AppRole2Employee[] array = new AppRole2EmployeeImpl[3];

			array[0] = getByC_PrevAndNext(session, appRole2Employee, companyId,
					orderByComparator, true);

			array[1] = appRole2Employee;

			array[2] = getByC_PrevAndNext(session, appRole2Employee, companyId,
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

	protected AppRole2Employee getByC_PrevAndNext(Session session,
		AppRole2Employee appRole2Employee, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_APPROLE2EMPLOYEE_WHERE);

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
			query.append(AppRole2EmployeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(appRole2Employee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AppRole2Employee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the app role2 employees where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC(long companyId) throws SystemException {
		for (AppRole2Employee appRole2Employee : findByC(companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(appRole2Employee);
		}
	}

	/**
	 * Returns the number of app role2 employees where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching app role2 employees
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

			query.append(_SQL_COUNT_APPROLE2EMPLOYEE_WHERE);

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

	private static final String _FINDER_COLUMN_C_COMPANYID_2 = "appRole2Employee.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G = new FinderPath(AppRole2EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2EmployeeModelImpl.FINDER_CACHE_ENABLED,
			AppRole2EmployeeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByC_G",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G = new FinderPath(AppRole2EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2EmployeeModelImpl.FINDER_CACHE_ENABLED,
			AppRole2EmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_G",
			new String[] { Long.class.getName(), Long.class.getName() },
			AppRole2EmployeeModelImpl.COMPANYID_COLUMN_BITMASK |
			AppRole2EmployeeModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_G = new FinderPath(AppRole2EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2EmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_G",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the app role2 employees where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the matching app role2 employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2Employee> findByC_G(long companyId, long groupId)
		throws SystemException {
		return findByC_G(companyId, groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the app role2 employees where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of app role2 employees
	 * @param end the upper bound of the range of app role2 employees (not inclusive)
	 * @return the range of matching app role2 employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2Employee> findByC_G(long companyId, long groupId,
		int start, int end) throws SystemException {
		return findByC_G(companyId, groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the app role2 employees where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of app role2 employees
	 * @param end the upper bound of the range of app role2 employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching app role2 employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2Employee> findByC_G(long companyId, long groupId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G;
			finderArgs = new Object[] { companyId, groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G;
			finderArgs = new Object[] {
					companyId, groupId,
					
					start, end, orderByComparator
				};
		}

		List<AppRole2Employee> list = (List<AppRole2Employee>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AppRole2Employee appRole2Employee : list) {
				if ((companyId != appRole2Employee.getCompanyId()) ||
						(groupId != appRole2Employee.getGroupId())) {
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

			query.append(_SQL_SELECT_APPROLE2EMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_C_G_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AppRole2EmployeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<AppRole2Employee>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AppRole2Employee>(list);
				}
				else {
					list = (List<AppRole2Employee>)QueryUtil.list(q,
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
	 * Returns the first app role2 employee in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app role2 employee
	 * @throws org.oep.ssomgt.NoSuchAppRole2EmployeeException if a matching app role2 employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee findByC_G_First(long companyId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchAppRole2EmployeeException, SystemException {
		AppRole2Employee appRole2Employee = fetchByC_G_First(companyId,
				groupId, orderByComparator);

		if (appRole2Employee != null) {
			return appRole2Employee;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAppRole2EmployeeException(msg.toString());
	}

	/**
	 * Returns the first app role2 employee in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app role2 employee, or <code>null</code> if a matching app role2 employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee fetchByC_G_First(long companyId, long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<AppRole2Employee> list = findByC_G(companyId, groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last app role2 employee in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app role2 employee
	 * @throws org.oep.ssomgt.NoSuchAppRole2EmployeeException if a matching app role2 employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee findByC_G_Last(long companyId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchAppRole2EmployeeException, SystemException {
		AppRole2Employee appRole2Employee = fetchByC_G_Last(companyId, groupId,
				orderByComparator);

		if (appRole2Employee != null) {
			return appRole2Employee;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAppRole2EmployeeException(msg.toString());
	}

	/**
	 * Returns the last app role2 employee in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app role2 employee, or <code>null</code> if a matching app role2 employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee fetchByC_G_Last(long companyId, long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC_G(companyId, groupId);

		if (count == 0) {
			return null;
		}

		List<AppRole2Employee> list = findByC_G(companyId, groupId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the app role2 employees before and after the current app role2 employee in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param appRole2EmployeeId the primary key of the current app role2 employee
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next app role2 employee
	 * @throws org.oep.ssomgt.NoSuchAppRole2EmployeeException if a app role2 employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee[] findByC_G_PrevAndNext(long appRole2EmployeeId,
		long companyId, long groupId, OrderByComparator orderByComparator)
		throws NoSuchAppRole2EmployeeException, SystemException {
		AppRole2Employee appRole2Employee = findByPrimaryKey(appRole2EmployeeId);

		Session session = null;

		try {
			session = openSession();

			AppRole2Employee[] array = new AppRole2EmployeeImpl[3];

			array[0] = getByC_G_PrevAndNext(session, appRole2Employee,
					companyId, groupId, orderByComparator, true);

			array[1] = appRole2Employee;

			array[2] = getByC_G_PrevAndNext(session, appRole2Employee,
					companyId, groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AppRole2Employee getByC_G_PrevAndNext(Session session,
		AppRole2Employee appRole2Employee, long companyId, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_APPROLE2EMPLOYEE_WHERE);

		query.append(_FINDER_COLUMN_C_G_COMPANYID_2);

		query.append(_FINDER_COLUMN_C_G_GROUPID_2);

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
			query.append(AppRole2EmployeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(appRole2Employee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AppRole2Employee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the app role2 employees where companyId = &#63; and groupId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_G(long companyId, long groupId)
		throws SystemException {
		for (AppRole2Employee appRole2Employee : findByC_G(companyId, groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(appRole2Employee);
		}
	}

	/**
	 * Returns the number of app role2 employees where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the number of matching app role2 employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_G(long companyId, long groupId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_G;

		Object[] finderArgs = new Object[] { companyId, groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_APPROLE2EMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_C_G_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

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

	private static final String _FINDER_COLUMN_C_G_COMPANYID_2 = "appRole2Employee.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_GROUPID_2 = "appRole2Employee.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G_AR = new FinderPath(AppRole2EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2EmployeeModelImpl.FINDER_CACHE_ENABLED,
			AppRole2EmployeeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByC_G_AR",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_AR =
		new FinderPath(AppRole2EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2EmployeeModelImpl.FINDER_CACHE_ENABLED,
			AppRole2EmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_G_AR",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			AppRole2EmployeeModelImpl.COMPANYID_COLUMN_BITMASK |
			AppRole2EmployeeModelImpl.GROUPID_COLUMN_BITMASK |
			AppRole2EmployeeModelImpl.APPROLEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_G_AR = new FinderPath(AppRole2EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2EmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_G_AR",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns all the app role2 employees where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param appRoleId the app role ID
	 * @return the matching app role2 employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2Employee> findByC_G_AR(long companyId, long groupId,
		long appRoleId) throws SystemException {
		return findByC_G_AR(companyId, groupId, appRoleId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the app role2 employees where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param appRoleId the app role ID
	 * @param start the lower bound of the range of app role2 employees
	 * @param end the upper bound of the range of app role2 employees (not inclusive)
	 * @return the range of matching app role2 employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2Employee> findByC_G_AR(long companyId, long groupId,
		long appRoleId, int start, int end) throws SystemException {
		return findByC_G_AR(companyId, groupId, appRoleId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the app role2 employees where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param appRoleId the app role ID
	 * @param start the lower bound of the range of app role2 employees
	 * @param end the upper bound of the range of app role2 employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching app role2 employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2Employee> findByC_G_AR(long companyId, long groupId,
		long appRoleId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_AR;
			finderArgs = new Object[] { companyId, groupId, appRoleId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G_AR;
			finderArgs = new Object[] {
					companyId, groupId, appRoleId,
					
					start, end, orderByComparator
				};
		}

		List<AppRole2Employee> list = (List<AppRole2Employee>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AppRole2Employee appRole2Employee : list) {
				if ((companyId != appRole2Employee.getCompanyId()) ||
						(groupId != appRole2Employee.getGroupId()) ||
						(appRoleId != appRole2Employee.getAppRoleId())) {
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

			query.append(_SQL_SELECT_APPROLE2EMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_C_G_AR_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_AR_GROUPID_2);

			query.append(_FINDER_COLUMN_C_G_AR_APPROLEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AppRole2EmployeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(appRoleId);

				if (!pagination) {
					list = (List<AppRole2Employee>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AppRole2Employee>(list);
				}
				else {
					list = (List<AppRole2Employee>)QueryUtil.list(q,
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
	 * Returns the first app role2 employee in the ordered set where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param appRoleId the app role ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app role2 employee
	 * @throws org.oep.ssomgt.NoSuchAppRole2EmployeeException if a matching app role2 employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee findByC_G_AR_First(long companyId, long groupId,
		long appRoleId, OrderByComparator orderByComparator)
		throws NoSuchAppRole2EmployeeException, SystemException {
		AppRole2Employee appRole2Employee = fetchByC_G_AR_First(companyId,
				groupId, appRoleId, orderByComparator);

		if (appRole2Employee != null) {
			return appRole2Employee;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", appRoleId=");
		msg.append(appRoleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAppRole2EmployeeException(msg.toString());
	}

	/**
	 * Returns the first app role2 employee in the ordered set where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param appRoleId the app role ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app role2 employee, or <code>null</code> if a matching app role2 employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee fetchByC_G_AR_First(long companyId, long groupId,
		long appRoleId, OrderByComparator orderByComparator)
		throws SystemException {
		List<AppRole2Employee> list = findByC_G_AR(companyId, groupId,
				appRoleId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last app role2 employee in the ordered set where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param appRoleId the app role ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app role2 employee
	 * @throws org.oep.ssomgt.NoSuchAppRole2EmployeeException if a matching app role2 employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee findByC_G_AR_Last(long companyId, long groupId,
		long appRoleId, OrderByComparator orderByComparator)
		throws NoSuchAppRole2EmployeeException, SystemException {
		AppRole2Employee appRole2Employee = fetchByC_G_AR_Last(companyId,
				groupId, appRoleId, orderByComparator);

		if (appRole2Employee != null) {
			return appRole2Employee;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", appRoleId=");
		msg.append(appRoleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAppRole2EmployeeException(msg.toString());
	}

	/**
	 * Returns the last app role2 employee in the ordered set where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param appRoleId the app role ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app role2 employee, or <code>null</code> if a matching app role2 employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee fetchByC_G_AR_Last(long companyId, long groupId,
		long appRoleId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByC_G_AR(companyId, groupId, appRoleId);

		if (count == 0) {
			return null;
		}

		List<AppRole2Employee> list = findByC_G_AR(companyId, groupId,
				appRoleId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the app role2 employees before and after the current app role2 employee in the ordered set where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	 *
	 * @param appRole2EmployeeId the primary key of the current app role2 employee
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param appRoleId the app role ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next app role2 employee
	 * @throws org.oep.ssomgt.NoSuchAppRole2EmployeeException if a app role2 employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee[] findByC_G_AR_PrevAndNext(
		long appRole2EmployeeId, long companyId, long groupId, long appRoleId,
		OrderByComparator orderByComparator)
		throws NoSuchAppRole2EmployeeException, SystemException {
		AppRole2Employee appRole2Employee = findByPrimaryKey(appRole2EmployeeId);

		Session session = null;

		try {
			session = openSession();

			AppRole2Employee[] array = new AppRole2EmployeeImpl[3];

			array[0] = getByC_G_AR_PrevAndNext(session, appRole2Employee,
					companyId, groupId, appRoleId, orderByComparator, true);

			array[1] = appRole2Employee;

			array[2] = getByC_G_AR_PrevAndNext(session, appRole2Employee,
					companyId, groupId, appRoleId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AppRole2Employee getByC_G_AR_PrevAndNext(Session session,
		AppRole2Employee appRole2Employee, long companyId, long groupId,
		long appRoleId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_APPROLE2EMPLOYEE_WHERE);

		query.append(_FINDER_COLUMN_C_G_AR_COMPANYID_2);

		query.append(_FINDER_COLUMN_C_G_AR_GROUPID_2);

		query.append(_FINDER_COLUMN_C_G_AR_APPROLEID_2);

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
			query.append(AppRole2EmployeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		qPos.add(appRoleId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(appRole2Employee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AppRole2Employee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the app role2 employees where companyId = &#63; and groupId = &#63; and appRoleId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param appRoleId the app role ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_G_AR(long companyId, long groupId, long appRoleId)
		throws SystemException {
		for (AppRole2Employee appRole2Employee : findByC_G_AR(companyId,
				groupId, appRoleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(appRole2Employee);
		}
	}

	/**
	 * Returns the number of app role2 employees where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param appRoleId the app role ID
	 * @return the number of matching app role2 employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_G_AR(long companyId, long groupId, long appRoleId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_G_AR;

		Object[] finderArgs = new Object[] { companyId, groupId, appRoleId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_APPROLE2EMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_C_G_AR_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_AR_GROUPID_2);

			query.append(_FINDER_COLUMN_C_G_AR_APPROLEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(appRoleId);

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

	private static final String _FINDER_COLUMN_C_G_AR_COMPANYID_2 = "appRole2Employee.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_AR_GROUPID_2 = "appRole2Employee.groupId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_AR_APPROLEID_2 = "appRole2Employee.appRoleId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_E = new FinderPath(AppRole2EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2EmployeeModelImpl.FINDER_CACHE_ENABLED,
			AppRole2EmployeeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByE",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_E = new FinderPath(AppRole2EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2EmployeeModelImpl.FINDER_CACHE_ENABLED,
			AppRole2EmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByE",
			new String[] { Long.class.getName() },
			AppRole2EmployeeModelImpl.EMPLOYEEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_E = new FinderPath(AppRole2EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2EmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByE",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the app role2 employees where employeeId = &#63;.
	 *
	 * @param employeeId the employee ID
	 * @return the matching app role2 employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2Employee> findByE(long employeeId)
		throws SystemException {
		return findByE(employeeId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the app role2 employees where employeeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param employeeId the employee ID
	 * @param start the lower bound of the range of app role2 employees
	 * @param end the upper bound of the range of app role2 employees (not inclusive)
	 * @return the range of matching app role2 employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2Employee> findByE(long employeeId, int start, int end)
		throws SystemException {
		return findByE(employeeId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the app role2 employees where employeeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param employeeId the employee ID
	 * @param start the lower bound of the range of app role2 employees
	 * @param end the upper bound of the range of app role2 employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching app role2 employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2Employee> findByE(long employeeId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_E;
			finderArgs = new Object[] { employeeId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_E;
			finderArgs = new Object[] { employeeId, start, end, orderByComparator };
		}

		List<AppRole2Employee> list = (List<AppRole2Employee>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AppRole2Employee appRole2Employee : list) {
				if ((employeeId != appRole2Employee.getEmployeeId())) {
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

			query.append(_SQL_SELECT_APPROLE2EMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_E_EMPLOYEEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AppRole2EmployeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(employeeId);

				if (!pagination) {
					list = (List<AppRole2Employee>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AppRole2Employee>(list);
				}
				else {
					list = (List<AppRole2Employee>)QueryUtil.list(q,
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
	 * Returns the first app role2 employee in the ordered set where employeeId = &#63;.
	 *
	 * @param employeeId the employee ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app role2 employee
	 * @throws org.oep.ssomgt.NoSuchAppRole2EmployeeException if a matching app role2 employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee findByE_First(long employeeId,
		OrderByComparator orderByComparator)
		throws NoSuchAppRole2EmployeeException, SystemException {
		AppRole2Employee appRole2Employee = fetchByE_First(employeeId,
				orderByComparator);

		if (appRole2Employee != null) {
			return appRole2Employee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("employeeId=");
		msg.append(employeeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAppRole2EmployeeException(msg.toString());
	}

	/**
	 * Returns the first app role2 employee in the ordered set where employeeId = &#63;.
	 *
	 * @param employeeId the employee ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app role2 employee, or <code>null</code> if a matching app role2 employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee fetchByE_First(long employeeId,
		OrderByComparator orderByComparator) throws SystemException {
		List<AppRole2Employee> list = findByE(employeeId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last app role2 employee in the ordered set where employeeId = &#63;.
	 *
	 * @param employeeId the employee ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app role2 employee
	 * @throws org.oep.ssomgt.NoSuchAppRole2EmployeeException if a matching app role2 employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee findByE_Last(long employeeId,
		OrderByComparator orderByComparator)
		throws NoSuchAppRole2EmployeeException, SystemException {
		AppRole2Employee appRole2Employee = fetchByE_Last(employeeId,
				orderByComparator);

		if (appRole2Employee != null) {
			return appRole2Employee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("employeeId=");
		msg.append(employeeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAppRole2EmployeeException(msg.toString());
	}

	/**
	 * Returns the last app role2 employee in the ordered set where employeeId = &#63;.
	 *
	 * @param employeeId the employee ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app role2 employee, or <code>null</code> if a matching app role2 employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee fetchByE_Last(long employeeId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByE(employeeId);

		if (count == 0) {
			return null;
		}

		List<AppRole2Employee> list = findByE(employeeId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the app role2 employees before and after the current app role2 employee in the ordered set where employeeId = &#63;.
	 *
	 * @param appRole2EmployeeId the primary key of the current app role2 employee
	 * @param employeeId the employee ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next app role2 employee
	 * @throws org.oep.ssomgt.NoSuchAppRole2EmployeeException if a app role2 employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee[] findByE_PrevAndNext(long appRole2EmployeeId,
		long employeeId, OrderByComparator orderByComparator)
		throws NoSuchAppRole2EmployeeException, SystemException {
		AppRole2Employee appRole2Employee = findByPrimaryKey(appRole2EmployeeId);

		Session session = null;

		try {
			session = openSession();

			AppRole2Employee[] array = new AppRole2EmployeeImpl[3];

			array[0] = getByE_PrevAndNext(session, appRole2Employee,
					employeeId, orderByComparator, true);

			array[1] = appRole2Employee;

			array[2] = getByE_PrevAndNext(session, appRole2Employee,
					employeeId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AppRole2Employee getByE_PrevAndNext(Session session,
		AppRole2Employee appRole2Employee, long employeeId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_APPROLE2EMPLOYEE_WHERE);

		query.append(_FINDER_COLUMN_E_EMPLOYEEID_2);

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
			query.append(AppRole2EmployeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(employeeId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(appRole2Employee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AppRole2Employee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the app role2 employees where employeeId = &#63; from the database.
	 *
	 * @param employeeId the employee ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByE(long employeeId) throws SystemException {
		for (AppRole2Employee appRole2Employee : findByE(employeeId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(appRole2Employee);
		}
	}

	/**
	 * Returns the number of app role2 employees where employeeId = &#63;.
	 *
	 * @param employeeId the employee ID
	 * @return the number of matching app role2 employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByE(long employeeId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_E;

		Object[] finderArgs = new Object[] { employeeId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_APPROLE2EMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_E_EMPLOYEEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(employeeId);

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

	private static final String _FINDER_COLUMN_E_EMPLOYEEID_2 = "appRole2Employee.employeeId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_INE = new FinderPath(AppRole2EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2EmployeeModelImpl.FINDER_CACHE_ENABLED,
			AppRole2EmployeeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByC_InE",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_INE = new FinderPath(AppRole2EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2EmployeeModelImpl.FINDER_CACHE_ENABLED,
			AppRole2EmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_InE",
			new String[] { Long.class.getName(), Long.class.getName() },
			AppRole2EmployeeModelImpl.COMPANYID_COLUMN_BITMASK |
			AppRole2EmployeeModelImpl.EMPLOYEEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_INE = new FinderPath(AppRole2EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2EmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_InE",
			new String[] { Long.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_C_INE = new FinderPath(AppRole2EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2EmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByC_InE",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the app role2 employees where companyId = &#63; and employeeId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param employeeId the employee ID
	 * @return the matching app role2 employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2Employee> findByC_InE(long companyId, long employeeId)
		throws SystemException {
		return findByC_InE(companyId, employeeId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the app role2 employees where companyId = &#63; and employeeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param employeeId the employee ID
	 * @param start the lower bound of the range of app role2 employees
	 * @param end the upper bound of the range of app role2 employees (not inclusive)
	 * @return the range of matching app role2 employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2Employee> findByC_InE(long companyId, long employeeId,
		int start, int end) throws SystemException {
		return findByC_InE(companyId, employeeId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the app role2 employees where companyId = &#63; and employeeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param employeeId the employee ID
	 * @param start the lower bound of the range of app role2 employees
	 * @param end the upper bound of the range of app role2 employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching app role2 employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2Employee> findByC_InE(long companyId, long employeeId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_INE;
			finderArgs = new Object[] { companyId, employeeId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_INE;
			finderArgs = new Object[] {
					companyId, employeeId,
					
					start, end, orderByComparator
				};
		}

		List<AppRole2Employee> list = (List<AppRole2Employee>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AppRole2Employee appRole2Employee : list) {
				if ((companyId != appRole2Employee.getCompanyId()) ||
						(employeeId != appRole2Employee.getEmployeeId())) {
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

			query.append(_SQL_SELECT_APPROLE2EMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_C_INE_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_INE_EMPLOYEEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AppRole2EmployeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(employeeId);

				if (!pagination) {
					list = (List<AppRole2Employee>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AppRole2Employee>(list);
				}
				else {
					list = (List<AppRole2Employee>)QueryUtil.list(q,
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
	 * Returns the first app role2 employee in the ordered set where companyId = &#63; and employeeId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param employeeId the employee ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app role2 employee
	 * @throws org.oep.ssomgt.NoSuchAppRole2EmployeeException if a matching app role2 employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee findByC_InE_First(long companyId, long employeeId,
		OrderByComparator orderByComparator)
		throws NoSuchAppRole2EmployeeException, SystemException {
		AppRole2Employee appRole2Employee = fetchByC_InE_First(companyId,
				employeeId, orderByComparator);

		if (appRole2Employee != null) {
			return appRole2Employee;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", employeeId=");
		msg.append(employeeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAppRole2EmployeeException(msg.toString());
	}

	/**
	 * Returns the first app role2 employee in the ordered set where companyId = &#63; and employeeId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param employeeId the employee ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app role2 employee, or <code>null</code> if a matching app role2 employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee fetchByC_InE_First(long companyId, long employeeId,
		OrderByComparator orderByComparator) throws SystemException {
		List<AppRole2Employee> list = findByC_InE(companyId, employeeId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last app role2 employee in the ordered set where companyId = &#63; and employeeId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param employeeId the employee ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app role2 employee
	 * @throws org.oep.ssomgt.NoSuchAppRole2EmployeeException if a matching app role2 employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee findByC_InE_Last(long companyId, long employeeId,
		OrderByComparator orderByComparator)
		throws NoSuchAppRole2EmployeeException, SystemException {
		AppRole2Employee appRole2Employee = fetchByC_InE_Last(companyId,
				employeeId, orderByComparator);

		if (appRole2Employee != null) {
			return appRole2Employee;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", employeeId=");
		msg.append(employeeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAppRole2EmployeeException(msg.toString());
	}

	/**
	 * Returns the last app role2 employee in the ordered set where companyId = &#63; and employeeId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param employeeId the employee ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app role2 employee, or <code>null</code> if a matching app role2 employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee fetchByC_InE_Last(long companyId, long employeeId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC_InE(companyId, employeeId);

		if (count == 0) {
			return null;
		}

		List<AppRole2Employee> list = findByC_InE(companyId, employeeId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the app role2 employees before and after the current app role2 employee in the ordered set where companyId = &#63; and employeeId = &#63;.
	 *
	 * @param appRole2EmployeeId the primary key of the current app role2 employee
	 * @param companyId the company ID
	 * @param employeeId the employee ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next app role2 employee
	 * @throws org.oep.ssomgt.NoSuchAppRole2EmployeeException if a app role2 employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee[] findByC_InE_PrevAndNext(long appRole2EmployeeId,
		long companyId, long employeeId, OrderByComparator orderByComparator)
		throws NoSuchAppRole2EmployeeException, SystemException {
		AppRole2Employee appRole2Employee = findByPrimaryKey(appRole2EmployeeId);

		Session session = null;

		try {
			session = openSession();

			AppRole2Employee[] array = new AppRole2EmployeeImpl[3];

			array[0] = getByC_InE_PrevAndNext(session, appRole2Employee,
					companyId, employeeId, orderByComparator, true);

			array[1] = appRole2Employee;

			array[2] = getByC_InE_PrevAndNext(session, appRole2Employee,
					companyId, employeeId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AppRole2Employee getByC_InE_PrevAndNext(Session session,
		AppRole2Employee appRole2Employee, long companyId, long employeeId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_APPROLE2EMPLOYEE_WHERE);

		query.append(_FINDER_COLUMN_C_INE_COMPANYID_2);

		query.append(_FINDER_COLUMN_C_INE_EMPLOYEEID_2);

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
			query.append(AppRole2EmployeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(employeeId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(appRole2Employee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AppRole2Employee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the app role2 employees where companyId = &#63; and employeeId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param employeeIds the employee IDs
	 * @return the matching app role2 employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2Employee> findByC_InE(long companyId, long[] employeeIds)
		throws SystemException {
		return findByC_InE(companyId, employeeIds, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the app role2 employees where companyId = &#63; and employeeId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param employeeIds the employee IDs
	 * @param start the lower bound of the range of app role2 employees
	 * @param end the upper bound of the range of app role2 employees (not inclusive)
	 * @return the range of matching app role2 employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2Employee> findByC_InE(long companyId,
		long[] employeeIds, int start, int end) throws SystemException {
		return findByC_InE(companyId, employeeIds, start, end, null);
	}

	/**
	 * Returns an ordered range of all the app role2 employees where companyId = &#63; and employeeId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param employeeIds the employee IDs
	 * @param start the lower bound of the range of app role2 employees
	 * @param end the upper bound of the range of app role2 employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching app role2 employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2Employee> findByC_InE(long companyId,
		long[] employeeIds, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		if ((employeeIds != null) && (employeeIds.length == 1)) {
			return findByC_InE(companyId, employeeIds[0], start, end,
				orderByComparator);
		}

		boolean pagination = true;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderArgs = new Object[] { companyId, StringUtil.merge(employeeIds) };
		}
		else {
			finderArgs = new Object[] {
					companyId, StringUtil.merge(employeeIds),
					
					start, end, orderByComparator
				};
		}

		List<AppRole2Employee> list = (List<AppRole2Employee>)FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_C_INE,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AppRole2Employee appRole2Employee : list) {
				if ((companyId != appRole2Employee.getCompanyId()) ||
						!ArrayUtil.contains(employeeIds,
							appRole2Employee.getEmployeeId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_SELECT_APPROLE2EMPLOYEE_WHERE);

			boolean conjunctionable = false;

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			query.append(_FINDER_COLUMN_C_INE_COMPANYID_5);

			conjunctionable = true;

			if ((employeeIds == null) || (employeeIds.length > 0)) {
				if (conjunctionable) {
					query.append(WHERE_AND);
				}

				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < employeeIds.length; i++) {
					query.append(_FINDER_COLUMN_C_INE_EMPLOYEEID_5);

					if ((i + 1) < employeeIds.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);

				conjunctionable = true;
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AppRole2EmployeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (employeeIds != null) {
					qPos.add(employeeIds);
				}

				if (!pagination) {
					list = (List<AppRole2Employee>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AppRole2Employee>(list);
				}
				else {
					list = (List<AppRole2Employee>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_C_INE,
					finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_C_INE,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the app role2 employees where companyId = &#63; and employeeId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param employeeId the employee ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_InE(long companyId, long employeeId)
		throws SystemException {
		for (AppRole2Employee appRole2Employee : findByC_InE(companyId,
				employeeId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(appRole2Employee);
		}
	}

	/**
	 * Returns the number of app role2 employees where companyId = &#63; and employeeId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param employeeId the employee ID
	 * @return the number of matching app role2 employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_InE(long companyId, long employeeId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_INE;

		Object[] finderArgs = new Object[] { companyId, employeeId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_APPROLE2EMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_C_INE_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_INE_EMPLOYEEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(employeeId);

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

	/**
	 * Returns the number of app role2 employees where companyId = &#63; and employeeId = any &#63;.
	 *
	 * @param companyId the company ID
	 * @param employeeIds the employee IDs
	 * @return the number of matching app role2 employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_InE(long companyId, long[] employeeIds)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				companyId, StringUtil.merge(employeeIds)
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_C_INE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_COUNT_APPROLE2EMPLOYEE_WHERE);

			boolean conjunctionable = false;

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			query.append(_FINDER_COLUMN_C_INE_COMPANYID_5);

			conjunctionable = true;

			if ((employeeIds == null) || (employeeIds.length > 0)) {
				if (conjunctionable) {
					query.append(WHERE_AND);
				}

				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < employeeIds.length; i++) {
					query.append(_FINDER_COLUMN_C_INE_EMPLOYEEID_5);

					if ((i + 1) < employeeIds.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);

				conjunctionable = true;
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (employeeIds != null) {
					qPos.add(employeeIds);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_C_INE,
					finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_C_INE,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_C_INE_COMPANYID_2 = "appRole2Employee.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_INE_COMPANYID_5 = "(" +
		removeConjunction(_FINDER_COLUMN_C_INE_COMPANYID_2) + ")";
	private static final String _FINDER_COLUMN_C_INE_EMPLOYEEID_2 = "appRole2Employee.employeeId = ?";
	private static final String _FINDER_COLUMN_C_INE_EMPLOYEEID_5 = "(" +
		removeConjunction(_FINDER_COLUMN_C_INE_EMPLOYEEID_2) + ")";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G_INE = new FinderPath(AppRole2EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2EmployeeModelImpl.FINDER_CACHE_ENABLED,
			AppRole2EmployeeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByC_G_InE",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_INE =
		new FinderPath(AppRole2EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2EmployeeModelImpl.FINDER_CACHE_ENABLED,
			AppRole2EmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_G_InE",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			AppRole2EmployeeModelImpl.COMPANYID_COLUMN_BITMASK |
			AppRole2EmployeeModelImpl.GROUPID_COLUMN_BITMASK |
			AppRole2EmployeeModelImpl.EMPLOYEEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_G_INE = new FinderPath(AppRole2EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2EmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_G_InE",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_C_G_INE = new FinderPath(AppRole2EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2EmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByC_G_InE",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns all the app role2 employees where companyId = &#63; and groupId = &#63; and employeeId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param employeeId the employee ID
	 * @return the matching app role2 employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2Employee> findByC_G_InE(long companyId, long groupId,
		long employeeId) throws SystemException {
		return findByC_G_InE(companyId, groupId, employeeId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the app role2 employees where companyId = &#63; and groupId = &#63; and employeeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param employeeId the employee ID
	 * @param start the lower bound of the range of app role2 employees
	 * @param end the upper bound of the range of app role2 employees (not inclusive)
	 * @return the range of matching app role2 employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2Employee> findByC_G_InE(long companyId, long groupId,
		long employeeId, int start, int end) throws SystemException {
		return findByC_G_InE(companyId, groupId, employeeId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the app role2 employees where companyId = &#63; and groupId = &#63; and employeeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param employeeId the employee ID
	 * @param start the lower bound of the range of app role2 employees
	 * @param end the upper bound of the range of app role2 employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching app role2 employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2Employee> findByC_G_InE(long companyId, long groupId,
		long employeeId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_INE;
			finderArgs = new Object[] { companyId, groupId, employeeId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G_INE;
			finderArgs = new Object[] {
					companyId, groupId, employeeId,
					
					start, end, orderByComparator
				};
		}

		List<AppRole2Employee> list = (List<AppRole2Employee>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AppRole2Employee appRole2Employee : list) {
				if ((companyId != appRole2Employee.getCompanyId()) ||
						(groupId != appRole2Employee.getGroupId()) ||
						(employeeId != appRole2Employee.getEmployeeId())) {
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

			query.append(_SQL_SELECT_APPROLE2EMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_C_G_INE_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_INE_GROUPID_2);

			query.append(_FINDER_COLUMN_C_G_INE_EMPLOYEEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AppRole2EmployeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(employeeId);

				if (!pagination) {
					list = (List<AppRole2Employee>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AppRole2Employee>(list);
				}
				else {
					list = (List<AppRole2Employee>)QueryUtil.list(q,
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
	 * Returns the first app role2 employee in the ordered set where companyId = &#63; and groupId = &#63; and employeeId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param employeeId the employee ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app role2 employee
	 * @throws org.oep.ssomgt.NoSuchAppRole2EmployeeException if a matching app role2 employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee findByC_G_InE_First(long companyId, long groupId,
		long employeeId, OrderByComparator orderByComparator)
		throws NoSuchAppRole2EmployeeException, SystemException {
		AppRole2Employee appRole2Employee = fetchByC_G_InE_First(companyId,
				groupId, employeeId, orderByComparator);

		if (appRole2Employee != null) {
			return appRole2Employee;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", employeeId=");
		msg.append(employeeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAppRole2EmployeeException(msg.toString());
	}

	/**
	 * Returns the first app role2 employee in the ordered set where companyId = &#63; and groupId = &#63; and employeeId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param employeeId the employee ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app role2 employee, or <code>null</code> if a matching app role2 employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee fetchByC_G_InE_First(long companyId, long groupId,
		long employeeId, OrderByComparator orderByComparator)
		throws SystemException {
		List<AppRole2Employee> list = findByC_G_InE(companyId, groupId,
				employeeId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last app role2 employee in the ordered set where companyId = &#63; and groupId = &#63; and employeeId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param employeeId the employee ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app role2 employee
	 * @throws org.oep.ssomgt.NoSuchAppRole2EmployeeException if a matching app role2 employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee findByC_G_InE_Last(long companyId, long groupId,
		long employeeId, OrderByComparator orderByComparator)
		throws NoSuchAppRole2EmployeeException, SystemException {
		AppRole2Employee appRole2Employee = fetchByC_G_InE_Last(companyId,
				groupId, employeeId, orderByComparator);

		if (appRole2Employee != null) {
			return appRole2Employee;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", employeeId=");
		msg.append(employeeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAppRole2EmployeeException(msg.toString());
	}

	/**
	 * Returns the last app role2 employee in the ordered set where companyId = &#63; and groupId = &#63; and employeeId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param employeeId the employee ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app role2 employee, or <code>null</code> if a matching app role2 employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee fetchByC_G_InE_Last(long companyId, long groupId,
		long employeeId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByC_G_InE(companyId, groupId, employeeId);

		if (count == 0) {
			return null;
		}

		List<AppRole2Employee> list = findByC_G_InE(companyId, groupId,
				employeeId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the app role2 employees before and after the current app role2 employee in the ordered set where companyId = &#63; and groupId = &#63; and employeeId = &#63;.
	 *
	 * @param appRole2EmployeeId the primary key of the current app role2 employee
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param employeeId the employee ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next app role2 employee
	 * @throws org.oep.ssomgt.NoSuchAppRole2EmployeeException if a app role2 employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee[] findByC_G_InE_PrevAndNext(
		long appRole2EmployeeId, long companyId, long groupId, long employeeId,
		OrderByComparator orderByComparator)
		throws NoSuchAppRole2EmployeeException, SystemException {
		AppRole2Employee appRole2Employee = findByPrimaryKey(appRole2EmployeeId);

		Session session = null;

		try {
			session = openSession();

			AppRole2Employee[] array = new AppRole2EmployeeImpl[3];

			array[0] = getByC_G_InE_PrevAndNext(session, appRole2Employee,
					companyId, groupId, employeeId, orderByComparator, true);

			array[1] = appRole2Employee;

			array[2] = getByC_G_InE_PrevAndNext(session, appRole2Employee,
					companyId, groupId, employeeId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AppRole2Employee getByC_G_InE_PrevAndNext(Session session,
		AppRole2Employee appRole2Employee, long companyId, long groupId,
		long employeeId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_APPROLE2EMPLOYEE_WHERE);

		query.append(_FINDER_COLUMN_C_G_INE_COMPANYID_2);

		query.append(_FINDER_COLUMN_C_G_INE_GROUPID_2);

		query.append(_FINDER_COLUMN_C_G_INE_EMPLOYEEID_2);

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
			query.append(AppRole2EmployeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		qPos.add(employeeId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(appRole2Employee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AppRole2Employee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the app role2 employees where companyId = &#63; and groupId = &#63; and employeeId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param employeeIds the employee IDs
	 * @return the matching app role2 employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2Employee> findByC_G_InE(long companyId, long groupId,
		long[] employeeIds) throws SystemException {
		return findByC_G_InE(companyId, groupId, employeeIds,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the app role2 employees where companyId = &#63; and groupId = &#63; and employeeId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param employeeIds the employee IDs
	 * @param start the lower bound of the range of app role2 employees
	 * @param end the upper bound of the range of app role2 employees (not inclusive)
	 * @return the range of matching app role2 employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2Employee> findByC_G_InE(long companyId, long groupId,
		long[] employeeIds, int start, int end) throws SystemException {
		return findByC_G_InE(companyId, groupId, employeeIds, start, end, null);
	}

	/**
	 * Returns an ordered range of all the app role2 employees where companyId = &#63; and groupId = &#63; and employeeId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param employeeIds the employee IDs
	 * @param start the lower bound of the range of app role2 employees
	 * @param end the upper bound of the range of app role2 employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching app role2 employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2Employee> findByC_G_InE(long companyId, long groupId,
		long[] employeeIds, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		if ((employeeIds != null) && (employeeIds.length == 1)) {
			return findByC_G_InE(companyId, groupId, employeeIds[0], start,
				end, orderByComparator);
		}

		boolean pagination = true;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderArgs = new Object[] {
					companyId, groupId, StringUtil.merge(employeeIds)
				};
		}
		else {
			finderArgs = new Object[] {
					companyId, groupId, StringUtil.merge(employeeIds),
					
					start, end, orderByComparator
				};
		}

		List<AppRole2Employee> list = (List<AppRole2Employee>)FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G_INE,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AppRole2Employee appRole2Employee : list) {
				if ((companyId != appRole2Employee.getCompanyId()) ||
						(groupId != appRole2Employee.getGroupId()) ||
						!ArrayUtil.contains(employeeIds,
							appRole2Employee.getEmployeeId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_SELECT_APPROLE2EMPLOYEE_WHERE);

			boolean conjunctionable = false;

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			query.append(_FINDER_COLUMN_C_G_INE_COMPANYID_5);

			conjunctionable = true;

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			query.append(_FINDER_COLUMN_C_G_INE_GROUPID_5);

			conjunctionable = true;

			if ((employeeIds == null) || (employeeIds.length > 0)) {
				if (conjunctionable) {
					query.append(WHERE_AND);
				}

				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < employeeIds.length; i++) {
					query.append(_FINDER_COLUMN_C_G_INE_EMPLOYEEID_5);

					if ((i + 1) < employeeIds.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);

				conjunctionable = true;
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AppRole2EmployeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				if (employeeIds != null) {
					qPos.add(employeeIds);
				}

				if (!pagination) {
					list = (List<AppRole2Employee>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AppRole2Employee>(list);
				}
				else {
					list = (List<AppRole2Employee>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G_INE,
					finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G_INE,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the app role2 employees where companyId = &#63; and groupId = &#63; and employeeId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param employeeId the employee ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_G_InE(long companyId, long groupId, long employeeId)
		throws SystemException {
		for (AppRole2Employee appRole2Employee : findByC_G_InE(companyId,
				groupId, employeeId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(appRole2Employee);
		}
	}

	/**
	 * Returns the number of app role2 employees where companyId = &#63; and groupId = &#63; and employeeId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param employeeId the employee ID
	 * @return the number of matching app role2 employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_G_InE(long companyId, long groupId, long employeeId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_G_INE;

		Object[] finderArgs = new Object[] { companyId, groupId, employeeId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_APPROLE2EMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_C_G_INE_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_INE_GROUPID_2);

			query.append(_FINDER_COLUMN_C_G_INE_EMPLOYEEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(employeeId);

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

	/**
	 * Returns the number of app role2 employees where companyId = &#63; and groupId = &#63; and employeeId = any &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param employeeIds the employee IDs
	 * @return the number of matching app role2 employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_G_InE(long companyId, long groupId, long[] employeeIds)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				companyId, groupId, StringUtil.merge(employeeIds)
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_C_G_INE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_COUNT_APPROLE2EMPLOYEE_WHERE);

			boolean conjunctionable = false;

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			query.append(_FINDER_COLUMN_C_G_INE_COMPANYID_5);

			conjunctionable = true;

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			query.append(_FINDER_COLUMN_C_G_INE_GROUPID_5);

			conjunctionable = true;

			if ((employeeIds == null) || (employeeIds.length > 0)) {
				if (conjunctionable) {
					query.append(WHERE_AND);
				}

				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < employeeIds.length; i++) {
					query.append(_FINDER_COLUMN_C_G_INE_EMPLOYEEID_5);

					if ((i + 1) < employeeIds.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);

				conjunctionable = true;
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				if (employeeIds != null) {
					qPos.add(employeeIds);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_C_G_INE,
					finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_C_G_INE,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_C_G_INE_COMPANYID_2 = "appRole2Employee.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_INE_COMPANYID_5 = "(" +
		removeConjunction(_FINDER_COLUMN_C_G_INE_COMPANYID_2) + ")";
	private static final String _FINDER_COLUMN_C_G_INE_GROUPID_2 = "appRole2Employee.groupId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_INE_GROUPID_5 = "(" +
		removeConjunction(_FINDER_COLUMN_C_G_INE_GROUPID_2) + ")";
	private static final String _FINDER_COLUMN_C_G_INE_EMPLOYEEID_2 = "appRole2Employee.employeeId = ?";
	private static final String _FINDER_COLUMN_C_G_INE_EMPLOYEEID_5 = "(" +
		removeConjunction(_FINDER_COLUMN_C_G_INE_EMPLOYEEID_2) + ")";

	public AppRole2EmployeePersistenceImpl() {
		setModelClass(AppRole2Employee.class);
	}

	/**
	 * Caches the app role2 employee in the entity cache if it is enabled.
	 *
	 * @param appRole2Employee the app role2 employee
	 */
	@Override
	public void cacheResult(AppRole2Employee appRole2Employee) {
		EntityCacheUtil.putResult(AppRole2EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2EmployeeImpl.class, appRole2Employee.getPrimaryKey(),
			appRole2Employee);

		appRole2Employee.resetOriginalValues();
	}

	/**
	 * Caches the app role2 employees in the entity cache if it is enabled.
	 *
	 * @param appRole2Employees the app role2 employees
	 */
	@Override
	public void cacheResult(List<AppRole2Employee> appRole2Employees) {
		for (AppRole2Employee appRole2Employee : appRole2Employees) {
			if (EntityCacheUtil.getResult(
						AppRole2EmployeeModelImpl.ENTITY_CACHE_ENABLED,
						AppRole2EmployeeImpl.class,
						appRole2Employee.getPrimaryKey()) == null) {
				cacheResult(appRole2Employee);
			}
			else {
				appRole2Employee.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all app role2 employees.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AppRole2EmployeeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AppRole2EmployeeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the app role2 employee.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AppRole2Employee appRole2Employee) {
		EntityCacheUtil.removeResult(AppRole2EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2EmployeeImpl.class, appRole2Employee.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AppRole2Employee> appRole2Employees) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AppRole2Employee appRole2Employee : appRole2Employees) {
			EntityCacheUtil.removeResult(AppRole2EmployeeModelImpl.ENTITY_CACHE_ENABLED,
				AppRole2EmployeeImpl.class, appRole2Employee.getPrimaryKey());
		}
	}

	/**
	 * Creates a new app role2 employee with the primary key. Does not add the app role2 employee to the database.
	 *
	 * @param appRole2EmployeeId the primary key for the new app role2 employee
	 * @return the new app role2 employee
	 */
	@Override
	public AppRole2Employee create(long appRole2EmployeeId) {
		AppRole2Employee appRole2Employee = new AppRole2EmployeeImpl();

		appRole2Employee.setNew(true);
		appRole2Employee.setPrimaryKey(appRole2EmployeeId);

		return appRole2Employee;
	}

	/**
	 * Removes the app role2 employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param appRole2EmployeeId the primary key of the app role2 employee
	 * @return the app role2 employee that was removed
	 * @throws org.oep.ssomgt.NoSuchAppRole2EmployeeException if a app role2 employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee remove(long appRole2EmployeeId)
		throws NoSuchAppRole2EmployeeException, SystemException {
		return remove((Serializable)appRole2EmployeeId);
	}

	/**
	 * Removes the app role2 employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the app role2 employee
	 * @return the app role2 employee that was removed
	 * @throws org.oep.ssomgt.NoSuchAppRole2EmployeeException if a app role2 employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee remove(Serializable primaryKey)
		throws NoSuchAppRole2EmployeeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AppRole2Employee appRole2Employee = (AppRole2Employee)session.get(AppRole2EmployeeImpl.class,
					primaryKey);

			if (appRole2Employee == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAppRole2EmployeeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(appRole2Employee);
		}
		catch (NoSuchAppRole2EmployeeException nsee) {
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
	protected AppRole2Employee removeImpl(AppRole2Employee appRole2Employee)
		throws SystemException {
		appRole2Employee = toUnwrappedModel(appRole2Employee);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(appRole2Employee)) {
				appRole2Employee = (AppRole2Employee)session.get(AppRole2EmployeeImpl.class,
						appRole2Employee.getPrimaryKeyObj());
			}

			if (appRole2Employee != null) {
				session.delete(appRole2Employee);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (appRole2Employee != null) {
			clearCache(appRole2Employee);
		}

		return appRole2Employee;
	}

	@Override
	public AppRole2Employee updateImpl(
		org.oep.ssomgt.model.AppRole2Employee appRole2Employee)
		throws SystemException {
		appRole2Employee = toUnwrappedModel(appRole2Employee);

		boolean isNew = appRole2Employee.isNew();

		AppRole2EmployeeModelImpl appRole2EmployeeModelImpl = (AppRole2EmployeeModelImpl)appRole2Employee;

		Session session = null;

		try {
			session = openSession();

			if (appRole2Employee.isNew()) {
				session.save(appRole2Employee);

				appRole2Employee.setNew(false);
			}
			else {
				session.merge(appRole2Employee);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !AppRole2EmployeeModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((appRole2EmployeeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						appRole2EmployeeModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C,
					args);

				args = new Object[] { appRole2EmployeeModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C,
					args);
			}

			if ((appRole2EmployeeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						appRole2EmployeeModelImpl.getOriginalCompanyId(),
						appRole2EmployeeModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G,
					args);

				args = new Object[] {
						appRole2EmployeeModelImpl.getCompanyId(),
						appRole2EmployeeModelImpl.getGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G,
					args);
			}

			if ((appRole2EmployeeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_AR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						appRole2EmployeeModelImpl.getOriginalCompanyId(),
						appRole2EmployeeModelImpl.getOriginalGroupId(),
						appRole2EmployeeModelImpl.getOriginalAppRoleId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G_AR, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_AR,
					args);

				args = new Object[] {
						appRole2EmployeeModelImpl.getCompanyId(),
						appRole2EmployeeModelImpl.getGroupId(),
						appRole2EmployeeModelImpl.getAppRoleId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G_AR, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_AR,
					args);
			}

			if ((appRole2EmployeeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_E.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						appRole2EmployeeModelImpl.getOriginalEmployeeId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_E, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_E,
					args);

				args = new Object[] { appRole2EmployeeModelImpl.getEmployeeId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_E, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_E,
					args);
			}

			if ((appRole2EmployeeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_INE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						appRole2EmployeeModelImpl.getOriginalCompanyId(),
						appRole2EmployeeModelImpl.getOriginalEmployeeId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_INE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_INE,
					args);

				args = new Object[] {
						appRole2EmployeeModelImpl.getCompanyId(),
						appRole2EmployeeModelImpl.getEmployeeId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_INE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_INE,
					args);
			}

			if ((appRole2EmployeeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_INE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						appRole2EmployeeModelImpl.getOriginalCompanyId(),
						appRole2EmployeeModelImpl.getOriginalGroupId(),
						appRole2EmployeeModelImpl.getOriginalEmployeeId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G_INE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_INE,
					args);

				args = new Object[] {
						appRole2EmployeeModelImpl.getCompanyId(),
						appRole2EmployeeModelImpl.getGroupId(),
						appRole2EmployeeModelImpl.getEmployeeId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G_INE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_INE,
					args);
			}
		}

		EntityCacheUtil.putResult(AppRole2EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2EmployeeImpl.class, appRole2Employee.getPrimaryKey(),
			appRole2Employee);

		return appRole2Employee;
	}

	protected AppRole2Employee toUnwrappedModel(
		AppRole2Employee appRole2Employee) {
		if (appRole2Employee instanceof AppRole2EmployeeImpl) {
			return appRole2Employee;
		}

		AppRole2EmployeeImpl appRole2EmployeeImpl = new AppRole2EmployeeImpl();

		appRole2EmployeeImpl.setNew(appRole2Employee.isNew());
		appRole2EmployeeImpl.setPrimaryKey(appRole2Employee.getPrimaryKey());

		appRole2EmployeeImpl.setAppRole2EmployeeId(appRole2Employee.getAppRole2EmployeeId());
		appRole2EmployeeImpl.setUserId(appRole2Employee.getUserId());
		appRole2EmployeeImpl.setGroupId(appRole2Employee.getGroupId());
		appRole2EmployeeImpl.setCompanyId(appRole2Employee.getCompanyId());
		appRole2EmployeeImpl.setCreateDate(appRole2Employee.getCreateDate());
		appRole2EmployeeImpl.setAppRoleId(appRole2Employee.getAppRoleId());
		appRole2EmployeeImpl.setEmployeeId(appRole2Employee.getEmployeeId());

		return appRole2EmployeeImpl;
	}

	/**
	 * Returns the app role2 employee with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the app role2 employee
	 * @return the app role2 employee
	 * @throws org.oep.ssomgt.NoSuchAppRole2EmployeeException if a app role2 employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAppRole2EmployeeException, SystemException {
		AppRole2Employee appRole2Employee = fetchByPrimaryKey(primaryKey);

		if (appRole2Employee == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAppRole2EmployeeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return appRole2Employee;
	}

	/**
	 * Returns the app role2 employee with the primary key or throws a {@link org.oep.ssomgt.NoSuchAppRole2EmployeeException} if it could not be found.
	 *
	 * @param appRole2EmployeeId the primary key of the app role2 employee
	 * @return the app role2 employee
	 * @throws org.oep.ssomgt.NoSuchAppRole2EmployeeException if a app role2 employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee findByPrimaryKey(long appRole2EmployeeId)
		throws NoSuchAppRole2EmployeeException, SystemException {
		return findByPrimaryKey((Serializable)appRole2EmployeeId);
	}

	/**
	 * Returns the app role2 employee with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the app role2 employee
	 * @return the app role2 employee, or <code>null</code> if a app role2 employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		AppRole2Employee appRole2Employee = (AppRole2Employee)EntityCacheUtil.getResult(AppRole2EmployeeModelImpl.ENTITY_CACHE_ENABLED,
				AppRole2EmployeeImpl.class, primaryKey);

		if (appRole2Employee == _nullAppRole2Employee) {
			return null;
		}

		if (appRole2Employee == null) {
			Session session = null;

			try {
				session = openSession();

				appRole2Employee = (AppRole2Employee)session.get(AppRole2EmployeeImpl.class,
						primaryKey);

				if (appRole2Employee != null) {
					cacheResult(appRole2Employee);
				}
				else {
					EntityCacheUtil.putResult(AppRole2EmployeeModelImpl.ENTITY_CACHE_ENABLED,
						AppRole2EmployeeImpl.class, primaryKey,
						_nullAppRole2Employee);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AppRole2EmployeeModelImpl.ENTITY_CACHE_ENABLED,
					AppRole2EmployeeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return appRole2Employee;
	}

	/**
	 * Returns the app role2 employee with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param appRole2EmployeeId the primary key of the app role2 employee
	 * @return the app role2 employee, or <code>null</code> if a app role2 employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2Employee fetchByPrimaryKey(long appRole2EmployeeId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)appRole2EmployeeId);
	}

	/**
	 * Returns all the app role2 employees.
	 *
	 * @return the app role2 employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2Employee> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the app role2 employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of app role2 employees
	 * @param end the upper bound of the range of app role2 employees (not inclusive)
	 * @return the range of app role2 employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2Employee> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the app role2 employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of app role2 employees
	 * @param end the upper bound of the range of app role2 employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of app role2 employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2Employee> findAll(int start, int end,
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

		List<AppRole2Employee> list = (List<AppRole2Employee>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_APPROLE2EMPLOYEE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_APPROLE2EMPLOYEE;

				if (pagination) {
					sql = sql.concat(AppRole2EmployeeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AppRole2Employee>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AppRole2Employee>(list);
				}
				else {
					list = (List<AppRole2Employee>)QueryUtil.list(q,
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
	 * Removes all the app role2 employees from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (AppRole2Employee appRole2Employee : findAll()) {
			remove(appRole2Employee);
		}
	}

	/**
	 * Returns the number of app role2 employees.
	 *
	 * @return the number of app role2 employees
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

				Query q = session.createQuery(_SQL_COUNT_APPROLE2EMPLOYEE);

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
	 * Initializes the app role2 employee persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.ssomgt.model.AppRole2Employee")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AppRole2Employee>> listenersList = new ArrayList<ModelListener<AppRole2Employee>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AppRole2Employee>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AppRole2EmployeeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_APPROLE2EMPLOYEE = "SELECT appRole2Employee FROM AppRole2Employee appRole2Employee";
	private static final String _SQL_SELECT_APPROLE2EMPLOYEE_WHERE = "SELECT appRole2Employee FROM AppRole2Employee appRole2Employee WHERE ";
	private static final String _SQL_COUNT_APPROLE2EMPLOYEE = "SELECT COUNT(appRole2Employee) FROM AppRole2Employee appRole2Employee";
	private static final String _SQL_COUNT_APPROLE2EMPLOYEE_WHERE = "SELECT COUNT(appRole2Employee) FROM AppRole2Employee appRole2Employee WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "appRole2Employee.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AppRole2Employee exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AppRole2Employee exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AppRole2EmployeePersistenceImpl.class);
	private static AppRole2Employee _nullAppRole2Employee = new AppRole2EmployeeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<AppRole2Employee> toCacheModel() {
				return _nullAppRole2EmployeeCacheModel;
			}
		};

	private static CacheModel<AppRole2Employee> _nullAppRole2EmployeeCacheModel = new CacheModel<AppRole2Employee>() {
			@Override
			public AppRole2Employee toEntityModel() {
				return _nullAppRole2Employee;
			}
		};
}