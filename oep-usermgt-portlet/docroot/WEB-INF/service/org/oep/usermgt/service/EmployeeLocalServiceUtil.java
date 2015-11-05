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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Employee. This utility wraps
 * {@link org.oep.usermgt.service.impl.EmployeeLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author NQMINH
 * @see EmployeeLocalService
 * @see org.oep.usermgt.service.base.EmployeeLocalServiceBaseImpl
 * @see org.oep.usermgt.service.impl.EmployeeLocalServiceImpl
 * @generated
 */
public class EmployeeLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.usermgt.service.impl.EmployeeLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the employee to the database. Also notifies the appropriate model listeners.
	*
	* @param employee the employee
	* @return the employee that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Employee addEmployee(
		org.oep.usermgt.model.Employee employee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addEmployee(employee);
	}

	/**
	* Creates a new employee with the primary key. Does not add the employee to the database.
	*
	* @param employeeId the primary key for the new employee
	* @return the new employee
	*/
	public static org.oep.usermgt.model.Employee createEmployee(long employeeId) {
		return getService().createEmployee(employeeId);
	}

	/**
	* Deletes the employee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeId the primary key of the employee
	* @return the employee that was removed
	* @throws PortalException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Employee deleteEmployee(long employeeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteEmployee(employeeId);
	}

	/**
	* Deletes the employee from the database. Also notifies the appropriate model listeners.
	*
	* @param employee the employee
	* @return the employee that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Employee deleteEmployee(
		org.oep.usermgt.model.Employee employee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteEmployee(employee);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static org.oep.usermgt.model.Employee fetchEmployee(long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchEmployee(employeeId);
	}

	/**
	* Returns the employee with the primary key.
	*
	* @param employeeId the primary key of the employee
	* @return the employee
	* @throws PortalException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Employee getEmployee(long employeeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployee(employeeId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<org.oep.usermgt.model.Employee> getEmployees(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployees(start, end);
	}

	/**
	* Returns the number of employees.
	*
	* @return the number of employees
	* @throws SystemException if a system exception occurred
	*/
	public static int getEmployeesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployeesCount();
	}

	/**
	* Updates the employee in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param employee the employee
	* @return the employee that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Employee updateEmployee(
		org.oep.usermgt.model.Employee employee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateEmployee(employee);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addJobPosEmployee(long jobPosId, long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addJobPosEmployee(jobPosId, employeeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addJobPosEmployee(long jobPosId,
		org.oep.usermgt.model.Employee employee)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addJobPosEmployee(jobPosId, employee);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addJobPosEmployees(long jobPosId, long[] employeeIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addJobPosEmployees(jobPosId, employeeIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addJobPosEmployees(long jobPosId,
		java.util.List<org.oep.usermgt.model.Employee> Employees)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addJobPosEmployees(jobPosId, Employees);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearJobPosEmployees(long jobPosId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearJobPosEmployees(jobPosId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteJobPosEmployee(long jobPosId, long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteJobPosEmployee(jobPosId, employeeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteJobPosEmployee(long jobPosId,
		org.oep.usermgt.model.Employee employee)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteJobPosEmployee(jobPosId, employee);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteJobPosEmployees(long jobPosId, long[] employeeIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteJobPosEmployees(jobPosId, employeeIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteJobPosEmployees(long jobPosId,
		java.util.List<org.oep.usermgt.model.Employee> Employees)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteJobPosEmployees(jobPosId, Employees);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.Employee> getJobPosEmployees(
		long jobPosId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getJobPosEmployees(jobPosId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.Employee> getJobPosEmployees(
		long jobPosId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getJobPosEmployees(jobPosId, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.Employee> getJobPosEmployees(
		long jobPosId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getJobPosEmployees(jobPosId, start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getJobPosEmployeesCount(long jobPosId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getJobPosEmployeesCount(jobPosId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasJobPosEmployee(long jobPosId, long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasJobPosEmployee(jobPosId, employeeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasJobPosEmployees(long jobPosId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasJobPosEmployees(jobPosId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setJobPosEmployees(long jobPosId, long[] employeeIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().setJobPosEmployees(jobPosId, employeeIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static org.oep.usermgt.model.Employee addEmployee(
		long mappingUserId, long workingUnitId, long mainJobPosId,
		java.lang.String employeeNo, java.lang.String fullName,
		java.lang.String officeTel, java.lang.String homeTel,
		java.lang.String mobile, java.lang.String email,
		java.lang.String personelDocNo, int gender, java.util.Date birthdate,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addEmployee(mappingUserId, workingUnitId, mainJobPosId,
			employeeNo, fullName, officeTel, homeTel, mobile, email,
			personelDocNo, gender, birthdate, serviceContext);
	}

	public static org.oep.usermgt.model.Employee updateEmployee(
		long employeeId, long mappingUserId, long workingUnitId,
		long mainJobPosId, java.lang.String employeeNo,
		java.lang.String fullName, java.lang.String officeTel,
		java.lang.String homeTel, java.lang.String mobile,
		java.lang.String email, java.lang.String personelDocNo, int gender,
		java.util.Date birthdate,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateEmployee(employeeId, mappingUserId, workingUnitId,
			mainJobPosId, employeeNo, fullName, officeTel, homeTel, mobile,
			email, personelDocNo, gender, birthdate, serviceContext);
	}

	public static org.oep.usermgt.model.Employee saveEmployee(
		org.oep.usermgt.model.Employee employee,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().saveEmployee(employee, serviceContext);
	}

	public static void updateEmployeeResources(
		org.oep.usermgt.model.Employee employee,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.updateEmployeeResources(employee, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void removeEmployee(org.oep.usermgt.model.Employee employee)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeEmployee(employee);
	}

	public static void removeEmployee(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeEmployee(id);
	}

	public static void addEmployeeResources(
		org.oep.usermgt.model.Employee employee, boolean addGroupPermission,
		boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addEmployeeResources(employee, addGroupPermission,
			addGuestPermission, serviceContext);
	}

	public static void addEmployeeResources(
		org.oep.usermgt.model.Employee employee,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addEmployeeResources(employee, groupPermissions, guestPermissions,
			serviceContext);
	}

	public static void addEmployeeResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addEmployeeResources(id, groupPermissions, guestPermissions,
			serviceContext);
	}

	public static int countEmployeeByWorkingUnit(long workingUnitId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countEmployeeByWorkingUnit(workingUnitId);
	}

	public static java.util.List<org.oep.usermgt.model.Employee> getByWorkingUnit(
		long workingUnitId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByWorkingUnit(workingUnitId);
	}

	public static java.util.List<org.oep.usermgt.model.Employee> getByWorkingUnit(
		long workingUnitId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByWorkingUnit(workingUnitId, start, end);
	}

	public static int countJobPosByWorkingUniMainJobPos(long workingUnitId,
		int mainJobPosId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countJobPosByWorkingUniMainJobPos(workingUnitId,
			mainJobPosId);
	}

	public static java.util.List<org.oep.usermgt.model.Employee> getByWorkingUnitMainJobPos(
		long workingUnitId, int mainJobPosId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getByWorkingUnitMainJobPos(workingUnitId, mainJobPosId);
	}

	public static java.util.List<org.oep.usermgt.model.Employee> getByWorkingUnitMainJobPos(
		long workingUnitId, int mainJobPosId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getByWorkingUnitMainJobPos(workingUnitId, mainJobPosId,
			start, end);
	}

	public static int countJobPosByLikeNameWorkingUnit(
		java.lang.String textSearch, long workingUnitId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countJobPosByLikeNameWorkingUnit(textSearch, workingUnitId);
	}

	public static java.util.List<org.oep.usermgt.model.Employee> finnderByLikeNameWorkingUnit(
		java.lang.String textSearch, long workingUnitId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .finnderByLikeNameWorkingUnit(textSearch, workingUnitId);
	}

	public static java.util.List<org.oep.usermgt.model.Employee> finderLikeNameWorkingUnit(
		java.lang.String textSearch, long workingUnitId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .finderLikeNameWorkingUnit(textSearch, workingUnitId, start,
			end);
	}

	public static void clearService() {
		_service = null;
	}

	public static EmployeeLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					EmployeeLocalService.class.getName());

			if (invokableLocalService instanceof EmployeeLocalService) {
				_service = (EmployeeLocalService)invokableLocalService;
			}
			else {
				_service = new EmployeeLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(EmployeeLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(EmployeeLocalService service) {
	}

	private static EmployeeLocalService _service;
}