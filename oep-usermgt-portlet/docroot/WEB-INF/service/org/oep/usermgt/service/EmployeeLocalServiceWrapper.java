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

package org.oep.usermgt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EmployeeLocalService}.
 *
 * @author NQMINH
 * @see EmployeeLocalService
 * @generated
 */
public class EmployeeLocalServiceWrapper implements EmployeeLocalService,
	ServiceWrapper<EmployeeLocalService> {
	public EmployeeLocalServiceWrapper(
		EmployeeLocalService employeeLocalService) {
		_employeeLocalService = employeeLocalService;
	}

	/**
	* Adds the employee to the database. Also notifies the appropriate model listeners.
	*
	* @param employee the employee
	* @return the employee that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.Employee addEmployee(
		org.oep.usermgt.model.Employee employee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeLocalService.addEmployee(employee);
	}

	/**
	* Creates a new employee with the primary key. Does not add the employee to the database.
	*
	* @param employeeId the primary key for the new employee
	* @return the new employee
	*/
	@Override
	public org.oep.usermgt.model.Employee createEmployee(long employeeId) {
		return _employeeLocalService.createEmployee(employeeId);
	}

	/**
	* Deletes the employee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeId the primary key of the employee
	* @return the employee that was removed
	* @throws PortalException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.Employee deleteEmployee(long employeeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employeeLocalService.deleteEmployee(employeeId);
	}

	/**
	* Deletes the employee from the database. Also notifies the appropriate model listeners.
	*
	* @param employee the employee
	* @return the employee that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.Employee deleteEmployee(
		org.oep.usermgt.model.Employee employee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeLocalService.deleteEmployee(employee);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _employeeLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public org.oep.usermgt.model.Employee fetchEmployee(long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeLocalService.fetchEmployee(employeeId);
	}

	/**
	* Returns the employee with the primary key.
	*
	* @param employeeId the primary key of the employee
	* @return the employee
	* @throws PortalException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.Employee getEmployee(long employeeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employeeLocalService.getEmployee(employeeId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employeeLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<org.oep.usermgt.model.Employee> getEmployees(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeLocalService.getEmployees(start, end);
	}

	/**
	* Returns the number of employees.
	*
	* @return the number of employees
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getEmployeesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeLocalService.getEmployeesCount();
	}

	/**
	* Updates the employee in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param employee the employee
	* @return the employee that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.Employee updateEmployee(
		org.oep.usermgt.model.Employee employee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeLocalService.updateEmployee(employee);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addJobPosEmployee(long jobPosId, long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_employeeLocalService.addJobPosEmployee(jobPosId, employeeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addJobPosEmployee(long jobPosId,
		org.oep.usermgt.model.Employee employee)
		throws com.liferay.portal.kernel.exception.SystemException {
		_employeeLocalService.addJobPosEmployee(jobPosId, employee);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addJobPosEmployees(long jobPosId, long[] employeeIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_employeeLocalService.addJobPosEmployees(jobPosId, employeeIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addJobPosEmployees(long jobPosId,
		java.util.List<org.oep.usermgt.model.Employee> Employees)
		throws com.liferay.portal.kernel.exception.SystemException {
		_employeeLocalService.addJobPosEmployees(jobPosId, Employees);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearJobPosEmployees(long jobPosId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_employeeLocalService.clearJobPosEmployees(jobPosId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteJobPosEmployee(long jobPosId, long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_employeeLocalService.deleteJobPosEmployee(jobPosId, employeeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteJobPosEmployee(long jobPosId,
		org.oep.usermgt.model.Employee employee)
		throws com.liferay.portal.kernel.exception.SystemException {
		_employeeLocalService.deleteJobPosEmployee(jobPosId, employee);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteJobPosEmployees(long jobPosId, long[] employeeIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_employeeLocalService.deleteJobPosEmployees(jobPosId, employeeIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteJobPosEmployees(long jobPosId,
		java.util.List<org.oep.usermgt.model.Employee> Employees)
		throws com.liferay.portal.kernel.exception.SystemException {
		_employeeLocalService.deleteJobPosEmployees(jobPosId, Employees);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.usermgt.model.Employee> getJobPosEmployees(
		long jobPosId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeLocalService.getJobPosEmployees(jobPosId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.usermgt.model.Employee> getJobPosEmployees(
		long jobPosId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeLocalService.getJobPosEmployees(jobPosId, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.usermgt.model.Employee> getJobPosEmployees(
		long jobPosId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeLocalService.getJobPosEmployees(jobPosId, start, end,
			orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getJobPosEmployeesCount(long jobPosId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeLocalService.getJobPosEmployeesCount(jobPosId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasJobPosEmployee(long jobPosId, long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeLocalService.hasJobPosEmployee(jobPosId, employeeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasJobPosEmployees(long jobPosId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeLocalService.hasJobPosEmployees(jobPosId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setJobPosEmployees(long jobPosId, long[] employeeIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_employeeLocalService.setJobPosEmployees(jobPosId, employeeIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _employeeLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_employeeLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _employeeLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public org.oep.usermgt.model.Employee addEmployee(long mappingUserId,
		long workingUnitId, long mainJobPosId, java.lang.String employeeNo,
		java.lang.String fullName, java.lang.String officeTel,
		java.lang.String homeTel, java.lang.String mobile,
		java.lang.String email, java.lang.String personelDocNo, int gender,
		java.util.Date birthdate,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employeeLocalService.addEmployee(mappingUserId, workingUnitId,
			mainJobPosId, employeeNo, fullName, officeTel, homeTel, mobile,
			email, personelDocNo, gender, birthdate, serviceContext);
	}

	@Override
	public org.oep.usermgt.model.Employee updateEmployee(long employeeId,
		long mappingUserId, long workingUnitId, long mainJobPosId,
		java.lang.String employeeNo, java.lang.String fullName,
		java.lang.String officeTel, java.lang.String homeTel,
		java.lang.String mobile, java.lang.String email,
		java.lang.String personelDocNo, int gender, java.util.Date birthdate,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employeeLocalService.updateEmployee(employeeId, mappingUserId,
			workingUnitId, mainJobPosId, employeeNo, fullName, officeTel,
			homeTel, mobile, email, personelDocNo, gender, birthdate,
			serviceContext);
	}

	@Override
	public org.oep.usermgt.model.Employee saveEmployee(
		org.oep.usermgt.model.Employee employee,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employeeLocalService.saveEmployee(employee, serviceContext);
	}

	@Override
	public void updateEmployeeResources(
		org.oep.usermgt.model.Employee employee,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_employeeLocalService.updateEmployeeResources(employee,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void removeEmployee(org.oep.usermgt.model.Employee employee)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_employeeLocalService.removeEmployee(employee);
	}

	@Override
	public void removeEmployee(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_employeeLocalService.removeEmployee(id);
	}

	@Override
	public void addEmployeeResources(org.oep.usermgt.model.Employee employee,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_employeeLocalService.addEmployeeResources(employee,
			addGroupPermission, addGuestPermission, serviceContext);
	}

	@Override
	public void addEmployeeResources(org.oep.usermgt.model.Employee employee,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_employeeLocalService.addEmployeeResources(employee, groupPermissions,
			guestPermissions, serviceContext);
	}

	@Override
	public void addEmployeeResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_employeeLocalService.addEmployeeResources(id, groupPermissions,
			guestPermissions, serviceContext);
	}

	@Override
	public int countEmployeeByWorkingUnit(long workingUnitId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employeeLocalService.countEmployeeByWorkingUnit(workingUnitId);
	}

	@Override
	public java.util.List<org.oep.usermgt.model.Employee> getByWorkingUnit(
		long workingUnitId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employeeLocalService.getByWorkingUnit(workingUnitId);
	}

	@Override
	public java.util.List<org.oep.usermgt.model.Employee> getByWorkingUnit(
		long workingUnitId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employeeLocalService.getByWorkingUnit(workingUnitId, start, end);
	}

	@Override
	public int countJobPosByWorkingUniMainJobPos(long workingUnitId,
		int mainJobPosId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employeeLocalService.countJobPosByWorkingUniMainJobPos(workingUnitId,
			mainJobPosId);
	}

	@Override
	public java.util.List<org.oep.usermgt.model.Employee> getByWorkingUnitMainJobPos(
		long workingUnitId, int mainJobPosId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employeeLocalService.getByWorkingUnitMainJobPos(workingUnitId,
			mainJobPosId);
	}

	@Override
	public java.util.List<org.oep.usermgt.model.Employee> getByWorkingUnitMainJobPos(
		long workingUnitId, int mainJobPosId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employeeLocalService.getByWorkingUnitMainJobPos(workingUnitId,
			mainJobPosId, start, end);
	}

	@Override
	public int countJobPosByLikeNameWorkingUnit(java.lang.String textSearch,
		long workingUnitId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employeeLocalService.countJobPosByLikeNameWorkingUnit(textSearch,
			workingUnitId);
	}

	@Override
	public java.util.List<org.oep.usermgt.model.Employee> finnderByLikeNameWorkingUnit(
		java.lang.String textSearch, long workingUnitId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employeeLocalService.finnderByLikeNameWorkingUnit(textSearch,
			workingUnitId);
	}

	@Override
	public java.util.List<org.oep.usermgt.model.Employee> finderLikeNameWorkingUnit(
		java.lang.String textSearch, long workingUnitId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employeeLocalService.finderLikeNameWorkingUnit(textSearch,
			workingUnitId, start, end);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public EmployeeLocalService getWrappedEmployeeLocalService() {
		return _employeeLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedEmployeeLocalService(
		EmployeeLocalService employeeLocalService) {
		_employeeLocalService = employeeLocalService;
	}

	@Override
	public EmployeeLocalService getWrappedService() {
		return _employeeLocalService;
	}

	@Override
	public void setWrappedService(EmployeeLocalService employeeLocalService) {
		_employeeLocalService = employeeLocalService;
	}

	private EmployeeLocalService _employeeLocalService;
}