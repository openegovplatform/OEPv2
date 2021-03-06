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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.oep.ssomgt.model.AppRole2Employee;

import java.util.List;

/**
 * The persistence utility for the app role2 employee service. This utility wraps {@link AppRole2EmployeePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see AppRole2EmployeePersistence
 * @see AppRole2EmployeePersistenceImpl
 * @generated
 */
public class AppRole2EmployeeUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(AppRole2Employee appRole2Employee) {
		getPersistence().clearCache(appRole2Employee);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AppRole2Employee> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AppRole2Employee> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AppRole2Employee> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static AppRole2Employee update(AppRole2Employee appRole2Employee)
		throws SystemException {
		return getPersistence().update(appRole2Employee);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static AppRole2Employee update(AppRole2Employee appRole2Employee,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(appRole2Employee, serviceContext);
	}

	/**
	* Returns all the app role2 employees where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching app role2 employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByC(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC(companyId);
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
	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByC(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC(companyId, start, end);
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
	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByC(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC(companyId, start, end, orderByComparator);
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
	public static org.oep.ssomgt.model.AppRole2Employee findByC_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2EmployeeException {
		return getPersistence().findByC_First(companyId, orderByComparator);
	}

	/**
	* Returns the first app role2 employee in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app role2 employee, or <code>null</code> if a matching app role2 employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole2Employee fetchByC_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_First(companyId, orderByComparator);
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
	public static org.oep.ssomgt.model.AppRole2Employee findByC_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2EmployeeException {
		return getPersistence().findByC_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last app role2 employee in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app role2 employee, or <code>null</code> if a matching app role2 employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole2Employee fetchByC_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_Last(companyId, orderByComparator);
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
	public static org.oep.ssomgt.model.AppRole2Employee[] findByC_PrevAndNext(
		long appRole2EmployeeId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2EmployeeException {
		return getPersistence()
				   .findByC_PrevAndNext(appRole2EmployeeId, companyId,
			orderByComparator);
	}

	/**
	* Removes all the app role2 employees where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC(companyId);
	}

	/**
	* Returns the number of app role2 employees where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching app role2 employees
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC(companyId);
	}

	/**
	* Returns all the app role2 employees where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching app role2 employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByC_G(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_G(companyId, groupId);
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
	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByC_G(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_G(companyId, groupId, start, end);
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
	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByC_G(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G(companyId, groupId, start, end, orderByComparator);
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
	public static org.oep.ssomgt.model.AppRole2Employee findByC_G_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2EmployeeException {
		return getPersistence()
				   .findByC_G_First(companyId, groupId, orderByComparator);
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
	public static org.oep.ssomgt.model.AppRole2Employee fetchByC_G_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_First(companyId, groupId, orderByComparator);
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
	public static org.oep.ssomgt.model.AppRole2Employee findByC_G_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2EmployeeException {
		return getPersistence()
				   .findByC_G_Last(companyId, groupId, orderByComparator);
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
	public static org.oep.ssomgt.model.AppRole2Employee fetchByC_G_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_Last(companyId, groupId, orderByComparator);
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
	public static org.oep.ssomgt.model.AppRole2Employee[] findByC_G_PrevAndNext(
		long appRole2EmployeeId, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2EmployeeException {
		return getPersistence()
				   .findByC_G_PrevAndNext(appRole2EmployeeId, companyId,
			groupId, orderByComparator);
	}

	/**
	* Removes all the app role2 employees where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_G(companyId, groupId);
	}

	/**
	* Returns the number of app role2 employees where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching app role2 employees
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_G(companyId, groupId);
	}

	/**
	* Returns all the app role2 employees where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param appRoleId the app role ID
	* @return the matching app role2 employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByC_G_AR(
		long companyId, long groupId, long appRoleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_G_AR(companyId, groupId, appRoleId);
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
	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByC_G_AR(
		long companyId, long groupId, long appRoleId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G_AR(companyId, groupId, appRoleId, start, end);
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
	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByC_G_AR(
		long companyId, long groupId, long appRoleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G_AR(companyId, groupId, appRoleId, start, end,
			orderByComparator);
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
	public static org.oep.ssomgt.model.AppRole2Employee findByC_G_AR_First(
		long companyId, long groupId, long appRoleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2EmployeeException {
		return getPersistence()
				   .findByC_G_AR_First(companyId, groupId, appRoleId,
			orderByComparator);
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
	public static org.oep.ssomgt.model.AppRole2Employee fetchByC_G_AR_First(
		long companyId, long groupId, long appRoleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_AR_First(companyId, groupId, appRoleId,
			orderByComparator);
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
	public static org.oep.ssomgt.model.AppRole2Employee findByC_G_AR_Last(
		long companyId, long groupId, long appRoleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2EmployeeException {
		return getPersistence()
				   .findByC_G_AR_Last(companyId, groupId, appRoleId,
			orderByComparator);
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
	public static org.oep.ssomgt.model.AppRole2Employee fetchByC_G_AR_Last(
		long companyId, long groupId, long appRoleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_AR_Last(companyId, groupId, appRoleId,
			orderByComparator);
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
	public static org.oep.ssomgt.model.AppRole2Employee[] findByC_G_AR_PrevAndNext(
		long appRole2EmployeeId, long companyId, long groupId, long appRoleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2EmployeeException {
		return getPersistence()
				   .findByC_G_AR_PrevAndNext(appRole2EmployeeId, companyId,
			groupId, appRoleId, orderByComparator);
	}

	/**
	* Removes all the app role2 employees where companyId = &#63; and groupId = &#63; and appRoleId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param appRoleId the app role ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_G_AR(long companyId, long groupId,
		long appRoleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_G_AR(companyId, groupId, appRoleId);
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
	public static int countByC_G_AR(long companyId, long groupId, long appRoleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_G_AR(companyId, groupId, appRoleId);
	}

	/**
	* Returns all the app role2 employees where employeeId = &#63;.
	*
	* @param employeeId the employee ID
	* @return the matching app role2 employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByE(
		long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByE(employeeId);
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
	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByE(
		long employeeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByE(employeeId, start, end);
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
	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByE(
		long employeeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByE(employeeId, start, end, orderByComparator);
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
	public static org.oep.ssomgt.model.AppRole2Employee findByE_First(
		long employeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2EmployeeException {
		return getPersistence().findByE_First(employeeId, orderByComparator);
	}

	/**
	* Returns the first app role2 employee in the ordered set where employeeId = &#63;.
	*
	* @param employeeId the employee ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app role2 employee, or <code>null</code> if a matching app role2 employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole2Employee fetchByE_First(
		long employeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByE_First(employeeId, orderByComparator);
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
	public static org.oep.ssomgt.model.AppRole2Employee findByE_Last(
		long employeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2EmployeeException {
		return getPersistence().findByE_Last(employeeId, orderByComparator);
	}

	/**
	* Returns the last app role2 employee in the ordered set where employeeId = &#63;.
	*
	* @param employeeId the employee ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app role2 employee, or <code>null</code> if a matching app role2 employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole2Employee fetchByE_Last(
		long employeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByE_Last(employeeId, orderByComparator);
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
	public static org.oep.ssomgt.model.AppRole2Employee[] findByE_PrevAndNext(
		long appRole2EmployeeId, long employeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2EmployeeException {
		return getPersistence()
				   .findByE_PrevAndNext(appRole2EmployeeId, employeeId,
			orderByComparator);
	}

	/**
	* Removes all the app role2 employees where employeeId = &#63; from the database.
	*
	* @param employeeId the employee ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByE(long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByE(employeeId);
	}

	/**
	* Returns the number of app role2 employees where employeeId = &#63;.
	*
	* @param employeeId the employee ID
	* @return the number of matching app role2 employees
	* @throws SystemException if a system exception occurred
	*/
	public static int countByE(long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByE(employeeId);
	}

	/**
	* Returns all the app role2 employees where companyId = &#63; and employeeId = &#63;.
	*
	* @param companyId the company ID
	* @param employeeId the employee ID
	* @return the matching app role2 employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByC_InE(
		long companyId, long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_InE(companyId, employeeId);
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
	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByC_InE(
		long companyId, long employeeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_InE(companyId, employeeId, start, end);
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
	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByC_InE(
		long companyId, long employeeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_InE(companyId, employeeId, start, end,
			orderByComparator);
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
	public static org.oep.ssomgt.model.AppRole2Employee findByC_InE_First(
		long companyId, long employeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2EmployeeException {
		return getPersistence()
				   .findByC_InE_First(companyId, employeeId, orderByComparator);
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
	public static org.oep.ssomgt.model.AppRole2Employee fetchByC_InE_First(
		long companyId, long employeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_InE_First(companyId, employeeId, orderByComparator);
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
	public static org.oep.ssomgt.model.AppRole2Employee findByC_InE_Last(
		long companyId, long employeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2EmployeeException {
		return getPersistence()
				   .findByC_InE_Last(companyId, employeeId, orderByComparator);
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
	public static org.oep.ssomgt.model.AppRole2Employee fetchByC_InE_Last(
		long companyId, long employeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_InE_Last(companyId, employeeId, orderByComparator);
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
	public static org.oep.ssomgt.model.AppRole2Employee[] findByC_InE_PrevAndNext(
		long appRole2EmployeeId, long companyId, long employeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2EmployeeException {
		return getPersistence()
				   .findByC_InE_PrevAndNext(appRole2EmployeeId, companyId,
			employeeId, orderByComparator);
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
	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByC_InE(
		long companyId, long[] employeeIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_InE(companyId, employeeIds);
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
	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByC_InE(
		long companyId, long[] employeeIds, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_InE(companyId, employeeIds, start, end);
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
	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByC_InE(
		long companyId, long[] employeeIds, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_InE(companyId, employeeIds, start, end,
			orderByComparator);
	}

	/**
	* Removes all the app role2 employees where companyId = &#63; and employeeId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param employeeId the employee ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_InE(long companyId, long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_InE(companyId, employeeId);
	}

	/**
	* Returns the number of app role2 employees where companyId = &#63; and employeeId = &#63;.
	*
	* @param companyId the company ID
	* @param employeeId the employee ID
	* @return the number of matching app role2 employees
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_InE(long companyId, long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_InE(companyId, employeeId);
	}

	/**
	* Returns the number of app role2 employees where companyId = &#63; and employeeId = any &#63;.
	*
	* @param companyId the company ID
	* @param employeeIds the employee IDs
	* @return the number of matching app role2 employees
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_InE(long companyId, long[] employeeIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_InE(companyId, employeeIds);
	}

	/**
	* Returns all the app role2 employees where companyId = &#63; and groupId = &#63; and employeeId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param employeeId the employee ID
	* @return the matching app role2 employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByC_G_InE(
		long companyId, long groupId, long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_G_InE(companyId, groupId, employeeId);
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
	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByC_G_InE(
		long companyId, long groupId, long employeeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G_InE(companyId, groupId, employeeId, start, end);
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
	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByC_G_InE(
		long companyId, long groupId, long employeeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G_InE(companyId, groupId, employeeId, start, end,
			orderByComparator);
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
	public static org.oep.ssomgt.model.AppRole2Employee findByC_G_InE_First(
		long companyId, long groupId, long employeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2EmployeeException {
		return getPersistence()
				   .findByC_G_InE_First(companyId, groupId, employeeId,
			orderByComparator);
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
	public static org.oep.ssomgt.model.AppRole2Employee fetchByC_G_InE_First(
		long companyId, long groupId, long employeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_InE_First(companyId, groupId, employeeId,
			orderByComparator);
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
	public static org.oep.ssomgt.model.AppRole2Employee findByC_G_InE_Last(
		long companyId, long groupId, long employeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2EmployeeException {
		return getPersistence()
				   .findByC_G_InE_Last(companyId, groupId, employeeId,
			orderByComparator);
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
	public static org.oep.ssomgt.model.AppRole2Employee fetchByC_G_InE_Last(
		long companyId, long groupId, long employeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_InE_Last(companyId, groupId, employeeId,
			orderByComparator);
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
	public static org.oep.ssomgt.model.AppRole2Employee[] findByC_G_InE_PrevAndNext(
		long appRole2EmployeeId, long companyId, long groupId, long employeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2EmployeeException {
		return getPersistence()
				   .findByC_G_InE_PrevAndNext(appRole2EmployeeId, companyId,
			groupId, employeeId, orderByComparator);
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
	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByC_G_InE(
		long companyId, long groupId, long[] employeeIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_G_InE(companyId, groupId, employeeIds);
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
	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByC_G_InE(
		long companyId, long groupId, long[] employeeIds, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G_InE(companyId, groupId, employeeIds, start, end);
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
	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByC_G_InE(
		long companyId, long groupId, long[] employeeIds, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G_InE(companyId, groupId, employeeIds, start, end,
			orderByComparator);
	}

	/**
	* Removes all the app role2 employees where companyId = &#63; and groupId = &#63; and employeeId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param employeeId the employee ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_G_InE(long companyId, long groupId,
		long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_G_InE(companyId, groupId, employeeId);
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
	public static int countByC_G_InE(long companyId, long groupId,
		long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_G_InE(companyId, groupId, employeeId);
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
	public static int countByC_G_InE(long companyId, long groupId,
		long[] employeeIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_G_InE(companyId, groupId, employeeIds);
	}

	/**
	* Returns all the app role2 employees where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param appRoleId the app role ID
	* @return the matching app role2 employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByC_G_InAR(
		long companyId, long groupId, long appRoleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_G_InAR(companyId, groupId, appRoleId);
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
	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByC_G_InAR(
		long companyId, long groupId, long appRoleId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G_InAR(companyId, groupId, appRoleId, start, end);
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
	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByC_G_InAR(
		long companyId, long groupId, long appRoleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G_InAR(companyId, groupId, appRoleId, start, end,
			orderByComparator);
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
	public static org.oep.ssomgt.model.AppRole2Employee findByC_G_InAR_First(
		long companyId, long groupId, long appRoleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2EmployeeException {
		return getPersistence()
				   .findByC_G_InAR_First(companyId, groupId, appRoleId,
			orderByComparator);
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
	public static org.oep.ssomgt.model.AppRole2Employee fetchByC_G_InAR_First(
		long companyId, long groupId, long appRoleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_InAR_First(companyId, groupId, appRoleId,
			orderByComparator);
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
	public static org.oep.ssomgt.model.AppRole2Employee findByC_G_InAR_Last(
		long companyId, long groupId, long appRoleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2EmployeeException {
		return getPersistence()
				   .findByC_G_InAR_Last(companyId, groupId, appRoleId,
			orderByComparator);
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
	public static org.oep.ssomgt.model.AppRole2Employee fetchByC_G_InAR_Last(
		long companyId, long groupId, long appRoleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_InAR_Last(companyId, groupId, appRoleId,
			orderByComparator);
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
	public static org.oep.ssomgt.model.AppRole2Employee[] findByC_G_InAR_PrevAndNext(
		long appRole2EmployeeId, long companyId, long groupId, long appRoleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2EmployeeException {
		return getPersistence()
				   .findByC_G_InAR_PrevAndNext(appRole2EmployeeId, companyId,
			groupId, appRoleId, orderByComparator);
	}

	/**
	* Returns all the app role2 employees where companyId = &#63; and groupId = &#63; and appRoleId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param appRoleIds the app role IDs
	* @return the matching app role2 employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByC_G_InAR(
		long companyId, long groupId, long[] appRoleIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_G_InAR(companyId, groupId, appRoleIds);
	}

	/**
	* Returns a range of all the app role2 employees where companyId = &#63; and groupId = &#63; and appRoleId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param appRoleIds the app role IDs
	* @param start the lower bound of the range of app role2 employees
	* @param end the upper bound of the range of app role2 employees (not inclusive)
	* @return the range of matching app role2 employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByC_G_InAR(
		long companyId, long groupId, long[] appRoleIds, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G_InAR(companyId, groupId, appRoleIds, start, end);
	}

	/**
	* Returns an ordered range of all the app role2 employees where companyId = &#63; and groupId = &#63; and appRoleId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param appRoleIds the app role IDs
	* @param start the lower bound of the range of app role2 employees
	* @param end the upper bound of the range of app role2 employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching app role2 employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByC_G_InAR(
		long companyId, long groupId, long[] appRoleIds, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G_InAR(companyId, groupId, appRoleIds, start, end,
			orderByComparator);
	}

	/**
	* Removes all the app role2 employees where companyId = &#63; and groupId = &#63; and appRoleId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param appRoleId the app role ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_G_InAR(long companyId, long groupId,
		long appRoleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_G_InAR(companyId, groupId, appRoleId);
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
	public static int countByC_G_InAR(long companyId, long groupId,
		long appRoleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_G_InAR(companyId, groupId, appRoleId);
	}

	/**
	* Returns the number of app role2 employees where companyId = &#63; and groupId = &#63; and appRoleId = any &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param appRoleIds the app role IDs
	* @return the number of matching app role2 employees
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_G_InAR(long companyId, long groupId,
		long[] appRoleIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_G_InAR(companyId, groupId, appRoleIds);
	}

	/**
	* Caches the app role2 employee in the entity cache if it is enabled.
	*
	* @param appRole2Employee the app role2 employee
	*/
	public static void cacheResult(
		org.oep.ssomgt.model.AppRole2Employee appRole2Employee) {
		getPersistence().cacheResult(appRole2Employee);
	}

	/**
	* Caches the app role2 employees in the entity cache if it is enabled.
	*
	* @param appRole2Employees the app role2 employees
	*/
	public static void cacheResult(
		java.util.List<org.oep.ssomgt.model.AppRole2Employee> appRole2Employees) {
		getPersistence().cacheResult(appRole2Employees);
	}

	/**
	* Creates a new app role2 employee with the primary key. Does not add the app role2 employee to the database.
	*
	* @param appRole2EmployeeId the primary key for the new app role2 employee
	* @return the new app role2 employee
	*/
	public static org.oep.ssomgt.model.AppRole2Employee create(
		long appRole2EmployeeId) {
		return getPersistence().create(appRole2EmployeeId);
	}

	/**
	* Removes the app role2 employee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param appRole2EmployeeId the primary key of the app role2 employee
	* @return the app role2 employee that was removed
	* @throws org.oep.ssomgt.NoSuchAppRole2EmployeeException if a app role2 employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole2Employee remove(
		long appRole2EmployeeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2EmployeeException {
		return getPersistence().remove(appRole2EmployeeId);
	}

	public static org.oep.ssomgt.model.AppRole2Employee updateImpl(
		org.oep.ssomgt.model.AppRole2Employee appRole2Employee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(appRole2Employee);
	}

	/**
	* Returns the app role2 employee with the primary key or throws a {@link org.oep.ssomgt.NoSuchAppRole2EmployeeException} if it could not be found.
	*
	* @param appRole2EmployeeId the primary key of the app role2 employee
	* @return the app role2 employee
	* @throws org.oep.ssomgt.NoSuchAppRole2EmployeeException if a app role2 employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole2Employee findByPrimaryKey(
		long appRole2EmployeeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2EmployeeException {
		return getPersistence().findByPrimaryKey(appRole2EmployeeId);
	}

	/**
	* Returns the app role2 employee with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param appRole2EmployeeId the primary key of the app role2 employee
	* @return the app role2 employee, or <code>null</code> if a app role2 employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole2Employee fetchByPrimaryKey(
		long appRole2EmployeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(appRole2EmployeeId);
	}

	/**
	* Returns all the app role2 employees.
	*
	* @return the app role2 employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the app role2 employees from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of app role2 employees.
	*
	* @return the number of app role2 employees
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AppRole2EmployeePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AppRole2EmployeePersistence)PortletBeanLocatorUtil.locate(org.oep.ssomgt.service.ClpSerializer.getServletContextName(),
					AppRole2EmployeePersistence.class.getName());

			ReferenceRegistry.registerReference(AppRole2EmployeeUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(AppRole2EmployeePersistence persistence) {
	}

	private static AppRole2EmployeePersistence _persistence;
}