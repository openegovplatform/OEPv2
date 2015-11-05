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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.oep.usermgt.model.Employee;

import java.util.List;

/**
 * The persistence utility for the employee service. This utility wraps {@link EmployeePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NQMINH
 * @see EmployeePersistence
 * @see EmployeePersistenceImpl
 * @generated
 */
public class EmployeeUtil {
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
	public static void clearCache(Employee employee) {
		getPersistence().clearCache(employee);
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
	public static List<Employee> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Employee> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Employee> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Employee update(Employee employee) throws SystemException {
		return getPersistence().update(employee);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Employee update(Employee employee,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(employee, serviceContext);
	}

	/**
	* Returns the employee where mappingUserId = &#63; or throws a {@link org.oep.usermgt.NoSuchEmployeeException} if it could not be found.
	*
	* @param mappingUserId the mapping user ID
	* @return the matching employee
	* @throws org.oep.usermgt.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Employee findByMU(long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchEmployeeException {
		return getPersistence().findByMU(mappingUserId);
	}

	/**
	* Returns the employee where mappingUserId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param mappingUserId the mapping user ID
	* @return the matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Employee fetchByMU(long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByMU(mappingUserId);
	}

	/**
	* Returns the employee where mappingUserId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param mappingUserId the mapping user ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Employee fetchByMU(long mappingUserId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByMU(mappingUserId, retrieveFromCache);
	}

	/**
	* Removes the employee where mappingUserId = &#63; from the database.
	*
	* @param mappingUserId the mapping user ID
	* @return the employee that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Employee removeByMU(long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchEmployeeException {
		return getPersistence().removeByMU(mappingUserId);
	}

	/**
	* Returns the number of employees where mappingUserId = &#63;.
	*
	* @param mappingUserId the mapping user ID
	* @return the number of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public static int countByMU(long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByMU(mappingUserId);
	}

	/**
	* Returns all the employees where workingUnitId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @return the matching employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.Employee> findByWU(
		long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByWU(workingUnitId);
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
	public static java.util.List<org.oep.usermgt.model.Employee> findByWU(
		long workingUnitId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByWU(workingUnitId, start, end);
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
	public static java.util.List<org.oep.usermgt.model.Employee> findByWU(
		long workingUnitId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByWU(workingUnitId, start, end, orderByComparator);
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
	public static org.oep.usermgt.model.Employee findByWU_First(
		long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchEmployeeException {
		return getPersistence().findByWU_First(workingUnitId, orderByComparator);
	}

	/**
	* Returns the first employee in the ordered set where workingUnitId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Employee fetchByWU_First(
		long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByWU_First(workingUnitId, orderByComparator);
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
	public static org.oep.usermgt.model.Employee findByWU_Last(
		long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchEmployeeException {
		return getPersistence().findByWU_Last(workingUnitId, orderByComparator);
	}

	/**
	* Returns the last employee in the ordered set where workingUnitId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Employee fetchByWU_Last(
		long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByWU_Last(workingUnitId, orderByComparator);
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
	public static org.oep.usermgt.model.Employee[] findByWU_PrevAndNext(
		long employeeId, long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchEmployeeException {
		return getPersistence()
				   .findByWU_PrevAndNext(employeeId, workingUnitId,
			orderByComparator);
	}

	/**
	* Removes all the employees where workingUnitId = &#63; from the database.
	*
	* @param workingUnitId the working unit ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByWU(long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByWU(workingUnitId);
	}

	/**
	* Returns the number of employees where workingUnitId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @return the number of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public static int countByWU(long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByWU(workingUnitId);
	}

	/**
	* Returns all the employees where workingUnitId = &#63; and mainJobPosId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param mainJobPosId the main job pos ID
	* @return the matching employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.Employee> findByWU_MJ(
		long workingUnitId, long mainJobPosId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByWU_MJ(workingUnitId, mainJobPosId);
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
	public static java.util.List<org.oep.usermgt.model.Employee> findByWU_MJ(
		long workingUnitId, long mainJobPosId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByWU_MJ(workingUnitId, mainJobPosId, start, end);
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
	public static java.util.List<org.oep.usermgt.model.Employee> findByWU_MJ(
		long workingUnitId, long mainJobPosId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByWU_MJ(workingUnitId, mainJobPosId, start, end,
			orderByComparator);
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
	public static org.oep.usermgt.model.Employee findByWU_MJ_First(
		long workingUnitId, long mainJobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchEmployeeException {
		return getPersistence()
				   .findByWU_MJ_First(workingUnitId, mainJobPosId,
			orderByComparator);
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
	public static org.oep.usermgt.model.Employee fetchByWU_MJ_First(
		long workingUnitId, long mainJobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByWU_MJ_First(workingUnitId, mainJobPosId,
			orderByComparator);
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
	public static org.oep.usermgt.model.Employee findByWU_MJ_Last(
		long workingUnitId, long mainJobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchEmployeeException {
		return getPersistence()
				   .findByWU_MJ_Last(workingUnitId, mainJobPosId,
			orderByComparator);
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
	public static org.oep.usermgt.model.Employee fetchByWU_MJ_Last(
		long workingUnitId, long mainJobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByWU_MJ_Last(workingUnitId, mainJobPosId,
			orderByComparator);
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
	public static org.oep.usermgt.model.Employee[] findByWU_MJ_PrevAndNext(
		long employeeId, long workingUnitId, long mainJobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchEmployeeException {
		return getPersistence()
				   .findByWU_MJ_PrevAndNext(employeeId, workingUnitId,
			mainJobPosId, orderByComparator);
	}

	/**
	* Removes all the employees where workingUnitId = &#63; and mainJobPosId = &#63; from the database.
	*
	* @param workingUnitId the working unit ID
	* @param mainJobPosId the main job pos ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByWU_MJ(long workingUnitId, long mainJobPosId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByWU_MJ(workingUnitId, mainJobPosId);
	}

	/**
	* Returns the number of employees where workingUnitId = &#63; and mainJobPosId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param mainJobPosId the main job pos ID
	* @return the number of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public static int countByWU_MJ(long workingUnitId, long mainJobPosId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByWU_MJ(workingUnitId, mainJobPosId);
	}

	/**
	* Caches the employee in the entity cache if it is enabled.
	*
	* @param employee the employee
	*/
	public static void cacheResult(org.oep.usermgt.model.Employee employee) {
		getPersistence().cacheResult(employee);
	}

	/**
	* Caches the employees in the entity cache if it is enabled.
	*
	* @param employees the employees
	*/
	public static void cacheResult(
		java.util.List<org.oep.usermgt.model.Employee> employees) {
		getPersistence().cacheResult(employees);
	}

	/**
	* Creates a new employee with the primary key. Does not add the employee to the database.
	*
	* @param employeeId the primary key for the new employee
	* @return the new employee
	*/
	public static org.oep.usermgt.model.Employee create(long employeeId) {
		return getPersistence().create(employeeId);
	}

	/**
	* Removes the employee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeId the primary key of the employee
	* @return the employee that was removed
	* @throws org.oep.usermgt.NoSuchEmployeeException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Employee remove(long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchEmployeeException {
		return getPersistence().remove(employeeId);
	}

	public static org.oep.usermgt.model.Employee updateImpl(
		org.oep.usermgt.model.Employee employee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(employee);
	}

	/**
	* Returns the employee with the primary key or throws a {@link org.oep.usermgt.NoSuchEmployeeException} if it could not be found.
	*
	* @param employeeId the primary key of the employee
	* @return the employee
	* @throws org.oep.usermgt.NoSuchEmployeeException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Employee findByPrimaryKey(
		long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchEmployeeException {
		return getPersistence().findByPrimaryKey(employeeId);
	}

	/**
	* Returns the employee with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param employeeId the primary key of the employee
	* @return the employee, or <code>null</code> if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Employee fetchByPrimaryKey(
		long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(employeeId);
	}

	/**
	* Returns all the employees.
	*
	* @return the employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.Employee> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<org.oep.usermgt.model.Employee> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<org.oep.usermgt.model.Employee> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the employees from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of employees.
	*
	* @return the number of employees
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the Job Poses associated with the employee.
	*
	* @param pk the primary key of the employee
	* @return the Job Poses associated with the employee
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.JobPos> getJobPoses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getJobPoses(pk);
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
	public static java.util.List<org.oep.usermgt.model.JobPos> getJobPoses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getJobPoses(pk, start, end);
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
	public static java.util.List<org.oep.usermgt.model.JobPos> getJobPoses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getJobPoses(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of Job Poses associated with the employee.
	*
	* @param pk the primary key of the employee
	* @return the number of Job Poses associated with the employee
	* @throws SystemException if a system exception occurred
	*/
	public static int getJobPosesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getJobPosesSize(pk);
	}

	/**
	* Returns <code>true</code> if the Job Pos is associated with the employee.
	*
	* @param pk the primary key of the employee
	* @param jobPosPK the primary key of the Job Pos
	* @return <code>true</code> if the Job Pos is associated with the employee; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsJobPos(long pk, long jobPosPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsJobPos(pk, jobPosPK);
	}

	/**
	* Returns <code>true</code> if the employee has any Job Poses associated with it.
	*
	* @param pk the primary key of the employee to check for associations with Job Poses
	* @return <code>true</code> if the employee has any Job Poses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsJobPoses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsJobPoses(pk);
	}

	/**
	* Adds an association between the employee and the Job Pos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param jobPosPK the primary key of the Job Pos
	* @throws SystemException if a system exception occurred
	*/
	public static void addJobPos(long pk, long jobPosPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addJobPos(pk, jobPosPK);
	}

	/**
	* Adds an association between the employee and the Job Pos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param jobPos the Job Pos
	* @throws SystemException if a system exception occurred
	*/
	public static void addJobPos(long pk, org.oep.usermgt.model.JobPos jobPos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addJobPos(pk, jobPos);
	}

	/**
	* Adds an association between the employee and the Job Poses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param jobPosPKs the primary keys of the Job Poses
	* @throws SystemException if a system exception occurred
	*/
	public static void addJobPoses(long pk, long[] jobPosPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addJobPoses(pk, jobPosPKs);
	}

	/**
	* Adds an association between the employee and the Job Poses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param jobPoses the Job Poses
	* @throws SystemException if a system exception occurred
	*/
	public static void addJobPoses(long pk,
		java.util.List<org.oep.usermgt.model.JobPos> jobPoses)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addJobPoses(pk, jobPoses);
	}

	/**
	* Clears all associations between the employee and its Job Poses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee to clear the associated Job Poses from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearJobPoses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearJobPoses(pk);
	}

	/**
	* Removes the association between the employee and the Job Pos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param jobPosPK the primary key of the Job Pos
	* @throws SystemException if a system exception occurred
	*/
	public static void removeJobPos(long pk, long jobPosPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeJobPos(pk, jobPosPK);
	}

	/**
	* Removes the association between the employee and the Job Pos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param jobPos the Job Pos
	* @throws SystemException if a system exception occurred
	*/
	public static void removeJobPos(long pk, org.oep.usermgt.model.JobPos jobPos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeJobPos(pk, jobPos);
	}

	/**
	* Removes the association between the employee and the Job Poses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param jobPosPKs the primary keys of the Job Poses
	* @throws SystemException if a system exception occurred
	*/
	public static void removeJobPoses(long pk, long[] jobPosPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeJobPoses(pk, jobPosPKs);
	}

	/**
	* Removes the association between the employee and the Job Poses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param jobPoses the Job Poses
	* @throws SystemException if a system exception occurred
	*/
	public static void removeJobPoses(long pk,
		java.util.List<org.oep.usermgt.model.JobPos> jobPoses)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeJobPoses(pk, jobPoses);
	}

	/**
	* Sets the Job Poses associated with the employee, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param jobPosPKs the primary keys of the Job Poses to be associated with the employee
	* @throws SystemException if a system exception occurred
	*/
	public static void setJobPoses(long pk, long[] jobPosPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setJobPoses(pk, jobPosPKs);
	}

	/**
	* Sets the Job Poses associated with the employee, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param jobPoses the Job Poses to be associated with the employee
	* @throws SystemException if a system exception occurred
	*/
	public static void setJobPoses(long pk,
		java.util.List<org.oep.usermgt.model.JobPos> jobPoses)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setJobPoses(pk, jobPoses);
	}

	public static EmployeePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (EmployeePersistence)PortletBeanLocatorUtil.locate(org.oep.usermgt.service.ClpSerializer.getServletContextName(),
					EmployeePersistence.class.getName());

			ReferenceRegistry.registerReference(EmployeeUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(EmployeePersistence persistence) {
	}

	private static EmployeePersistence _persistence;
}