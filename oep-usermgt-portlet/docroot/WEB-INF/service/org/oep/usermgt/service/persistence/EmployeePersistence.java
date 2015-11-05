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

import com.liferay.portal.service.persistence.BasePersistence;

import org.oep.usermgt.model.Employee;

/**
 * The persistence interface for the employee service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NQMINH
 * @see EmployeePersistenceImpl
 * @see EmployeeUtil
 * @generated
 */
public interface EmployeePersistence extends BasePersistence<Employee> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmployeeUtil} to access the employee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the employee where mappingUserId = &#63; or throws a {@link org.oep.usermgt.NoSuchEmployeeException} if it could not be found.
	*
	* @param mappingUserId the mapping user ID
	* @return the matching employee
	* @throws org.oep.usermgt.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Employee findByMU(long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchEmployeeException;

	/**
	* Returns the employee where mappingUserId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param mappingUserId the mapping user ID
	* @return the matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Employee fetchByMU(long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee where mappingUserId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param mappingUserId the mapping user ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Employee fetchByMU(long mappingUserId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the employee where mappingUserId = &#63; from the database.
	*
	* @param mappingUserId the mapping user ID
	* @return the employee that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Employee removeByMU(long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchEmployeeException;

	/**
	* Returns the number of employees where mappingUserId = &#63;.
	*
	* @param mappingUserId the mapping user ID
	* @return the number of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public int countByMU(long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employees where workingUnitId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @return the matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Employee> findByWU(
		long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.usermgt.model.Employee> findByWU(
		long workingUnitId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.usermgt.model.Employee> findByWU(
		long workingUnitId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee in the ordered set where workingUnitId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee
	* @throws org.oep.usermgt.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Employee findByWU_First(long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchEmployeeException;

	/**
	* Returns the first employee in the ordered set where workingUnitId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Employee fetchByWU_First(long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee in the ordered set where workingUnitId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee
	* @throws org.oep.usermgt.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Employee findByWU_Last(long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchEmployeeException;

	/**
	* Returns the last employee in the ordered set where workingUnitId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Employee fetchByWU_Last(long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.usermgt.model.Employee[] findByWU_PrevAndNext(
		long employeeId, long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchEmployeeException;

	/**
	* Removes all the employees where workingUnitId = &#63; from the database.
	*
	* @param workingUnitId the working unit ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByWU(long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employees where workingUnitId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @return the number of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public int countByWU(long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employees where workingUnitId = &#63; and mainJobPosId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param mainJobPosId the main job pos ID
	* @return the matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Employee> findByWU_MJ(
		long workingUnitId, long mainJobPosId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.usermgt.model.Employee> findByWU_MJ(
		long workingUnitId, long mainJobPosId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.usermgt.model.Employee> findByWU_MJ(
		long workingUnitId, long mainJobPosId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.usermgt.model.Employee findByWU_MJ_First(
		long workingUnitId, long mainJobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchEmployeeException;

	/**
	* Returns the first employee in the ordered set where workingUnitId = &#63; and mainJobPosId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param mainJobPosId the main job pos ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Employee fetchByWU_MJ_First(
		long workingUnitId, long mainJobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.usermgt.model.Employee findByWU_MJ_Last(long workingUnitId,
		long mainJobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchEmployeeException;

	/**
	* Returns the last employee in the ordered set where workingUnitId = &#63; and mainJobPosId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param mainJobPosId the main job pos ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Employee fetchByWU_MJ_Last(
		long workingUnitId, long mainJobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.usermgt.model.Employee[] findByWU_MJ_PrevAndNext(
		long employeeId, long workingUnitId, long mainJobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchEmployeeException;

	/**
	* Removes all the employees where workingUnitId = &#63; and mainJobPosId = &#63; from the database.
	*
	* @param workingUnitId the working unit ID
	* @param mainJobPosId the main job pos ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByWU_MJ(long workingUnitId, long mainJobPosId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employees where workingUnitId = &#63; and mainJobPosId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param mainJobPosId the main job pos ID
	* @return the number of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public int countByWU_MJ(long workingUnitId, long mainJobPosId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the employee in the entity cache if it is enabled.
	*
	* @param employee the employee
	*/
	public void cacheResult(org.oep.usermgt.model.Employee employee);

	/**
	* Caches the employees in the entity cache if it is enabled.
	*
	* @param employees the employees
	*/
	public void cacheResult(
		java.util.List<org.oep.usermgt.model.Employee> employees);

	/**
	* Creates a new employee with the primary key. Does not add the employee to the database.
	*
	* @param employeeId the primary key for the new employee
	* @return the new employee
	*/
	public org.oep.usermgt.model.Employee create(long employeeId);

	/**
	* Removes the employee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeId the primary key of the employee
	* @return the employee that was removed
	* @throws org.oep.usermgt.NoSuchEmployeeException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Employee remove(long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchEmployeeException;

	public org.oep.usermgt.model.Employee updateImpl(
		org.oep.usermgt.model.Employee employee)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee with the primary key or throws a {@link org.oep.usermgt.NoSuchEmployeeException} if it could not be found.
	*
	* @param employeeId the primary key of the employee
	* @return the employee
	* @throws org.oep.usermgt.NoSuchEmployeeException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Employee findByPrimaryKey(long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchEmployeeException;

	/**
	* Returns the employee with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param employeeId the primary key of the employee
	* @return the employee, or <code>null</code> if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Employee fetchByPrimaryKey(long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employees.
	*
	* @return the employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Employee> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.usermgt.model.Employee> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.usermgt.model.Employee> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employees from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employees.
	*
	* @return the number of employees
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the Job Poses associated with the employee.
	*
	* @param pk the primary key of the employee
	* @return the Job Poses associated with the employee
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.JobPos> getJobPoses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.usermgt.model.JobPos> getJobPoses(long pk,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.usermgt.model.JobPos> getJobPoses(long pk,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of Job Poses associated with the employee.
	*
	* @param pk the primary key of the employee
	* @return the number of Job Poses associated with the employee
	* @throws SystemException if a system exception occurred
	*/
	public int getJobPosesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the Job Pos is associated with the employee.
	*
	* @param pk the primary key of the employee
	* @param jobPosPK the primary key of the Job Pos
	* @return <code>true</code> if the Job Pos is associated with the employee; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsJobPos(long pk, long jobPosPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the employee has any Job Poses associated with it.
	*
	* @param pk the primary key of the employee to check for associations with Job Poses
	* @return <code>true</code> if the employee has any Job Poses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsJobPoses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the employee and the Job Pos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param jobPosPK the primary key of the Job Pos
	* @throws SystemException if a system exception occurred
	*/
	public void addJobPos(long pk, long jobPosPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the employee and the Job Pos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param jobPos the Job Pos
	* @throws SystemException if a system exception occurred
	*/
	public void addJobPos(long pk, org.oep.usermgt.model.JobPos jobPos)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the employee and the Job Poses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param jobPosPKs the primary keys of the Job Poses
	* @throws SystemException if a system exception occurred
	*/
	public void addJobPoses(long pk, long[] jobPosPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the employee and the Job Poses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param jobPoses the Job Poses
	* @throws SystemException if a system exception occurred
	*/
	public void addJobPoses(long pk,
		java.util.List<org.oep.usermgt.model.JobPos> jobPoses)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the employee and its Job Poses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee to clear the associated Job Poses from
	* @throws SystemException if a system exception occurred
	*/
	public void clearJobPoses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the employee and the Job Pos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param jobPosPK the primary key of the Job Pos
	* @throws SystemException if a system exception occurred
	*/
	public void removeJobPos(long pk, long jobPosPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the employee and the Job Pos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param jobPos the Job Pos
	* @throws SystemException if a system exception occurred
	*/
	public void removeJobPos(long pk, org.oep.usermgt.model.JobPos jobPos)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the employee and the Job Poses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param jobPosPKs the primary keys of the Job Poses
	* @throws SystemException if a system exception occurred
	*/
	public void removeJobPoses(long pk, long[] jobPosPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the employee and the Job Poses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param jobPoses the Job Poses
	* @throws SystemException if a system exception occurred
	*/
	public void removeJobPoses(long pk,
		java.util.List<org.oep.usermgt.model.JobPos> jobPoses)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the Job Poses associated with the employee, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param jobPosPKs the primary keys of the Job Poses to be associated with the employee
	* @throws SystemException if a system exception occurred
	*/
	public void setJobPoses(long pk, long[] jobPosPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the Job Poses associated with the employee, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param jobPoses the Job Poses to be associated with the employee
	* @throws SystemException if a system exception occurred
	*/
	public void setJobPoses(long pk,
		java.util.List<org.oep.usermgt.model.JobPos> jobPoses)
		throws com.liferay.portal.kernel.exception.SystemException;
}