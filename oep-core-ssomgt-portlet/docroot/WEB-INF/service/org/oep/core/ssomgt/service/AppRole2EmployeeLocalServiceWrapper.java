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

package org.oep.core.ssomgt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AppRole2EmployeeLocalService}.
 *
 * @author trungdk
 * @see AppRole2EmployeeLocalService
 * @generated
 */
public class AppRole2EmployeeLocalServiceWrapper
	implements AppRole2EmployeeLocalService,
		ServiceWrapper<AppRole2EmployeeLocalService> {
	public AppRole2EmployeeLocalServiceWrapper(
		AppRole2EmployeeLocalService appRole2EmployeeLocalService) {
		_appRole2EmployeeLocalService = appRole2EmployeeLocalService;
	}

	/**
	* Adds the app role2 employee to the database. Also notifies the appropriate model listeners.
	*
	* @param appRole2Employee the app role2 employee
	* @return the app role2 employee that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.ssomgt.model.AppRole2Employee addAppRole2Employee(
		org.oep.core.ssomgt.model.AppRole2Employee appRole2Employee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appRole2EmployeeLocalService.addAppRole2Employee(appRole2Employee);
	}

	/**
	* Creates a new app role2 employee with the primary key. Does not add the app role2 employee to the database.
	*
	* @param appRole2EmployeeId the primary key for the new app role2 employee
	* @return the new app role2 employee
	*/
	@Override
	public org.oep.core.ssomgt.model.AppRole2Employee createAppRole2Employee(
		long appRole2EmployeeId) {
		return _appRole2EmployeeLocalService.createAppRole2Employee(appRole2EmployeeId);
	}

	/**
	* Deletes the app role2 employee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param appRole2EmployeeId the primary key of the app role2 employee
	* @return the app role2 employee that was removed
	* @throws PortalException if a app role2 employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.ssomgt.model.AppRole2Employee deleteAppRole2Employee(
		long appRole2EmployeeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _appRole2EmployeeLocalService.deleteAppRole2Employee(appRole2EmployeeId);
	}

	/**
	* Deletes the app role2 employee from the database. Also notifies the appropriate model listeners.
	*
	* @param appRole2Employee the app role2 employee
	* @return the app role2 employee that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.ssomgt.model.AppRole2Employee deleteAppRole2Employee(
		org.oep.core.ssomgt.model.AppRole2Employee appRole2Employee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appRole2EmployeeLocalService.deleteAppRole2Employee(appRole2Employee);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _appRole2EmployeeLocalService.dynamicQuery();
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
		return _appRole2EmployeeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRole2EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _appRole2EmployeeLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRole2EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _appRole2EmployeeLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _appRole2EmployeeLocalService.dynamicQueryCount(dynamicQuery);
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
		return _appRole2EmployeeLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.core.ssomgt.model.AppRole2Employee fetchAppRole2Employee(
		long appRole2EmployeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appRole2EmployeeLocalService.fetchAppRole2Employee(appRole2EmployeeId);
	}

	/**
	* Returns the app role2 employee with the primary key.
	*
	* @param appRole2EmployeeId the primary key of the app role2 employee
	* @return the app role2 employee
	* @throws PortalException if a app role2 employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.ssomgt.model.AppRole2Employee getAppRole2Employee(
		long appRole2EmployeeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _appRole2EmployeeLocalService.getAppRole2Employee(appRole2EmployeeId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _appRole2EmployeeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the app role2 employees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRole2EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of app role2 employees
	* @param end the upper bound of the range of app role2 employees (not inclusive)
	* @return the range of app role2 employees
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.ssomgt.model.AppRole2Employee> getAppRole2Employees(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appRole2EmployeeLocalService.getAppRole2Employees(start, end);
	}

	/**
	* Returns the number of app role2 employees.
	*
	* @return the number of app role2 employees
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getAppRole2EmployeesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appRole2EmployeeLocalService.getAppRole2EmployeesCount();
	}

	/**
	* Updates the app role2 employee in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param appRole2Employee the app role2 employee
	* @return the app role2 employee that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.ssomgt.model.AppRole2Employee updateAppRole2Employee(
		org.oep.core.ssomgt.model.AppRole2Employee appRole2Employee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appRole2EmployeeLocalService.updateAppRole2Employee(appRole2Employee);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _appRole2EmployeeLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_appRole2EmployeeLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _appRole2EmployeeLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AppRole2EmployeeLocalService getWrappedAppRole2EmployeeLocalService() {
		return _appRole2EmployeeLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAppRole2EmployeeLocalService(
		AppRole2EmployeeLocalService appRole2EmployeeLocalService) {
		_appRole2EmployeeLocalService = appRole2EmployeeLocalService;
	}

	@Override
	public AppRole2EmployeeLocalService getWrappedService() {
		return _appRole2EmployeeLocalService;
	}

	@Override
	public void setWrappedService(
		AppRole2EmployeeLocalService appRole2EmployeeLocalService) {
		_appRole2EmployeeLocalService = appRole2EmployeeLocalService;
	}

	private AppRole2EmployeeLocalService _appRole2EmployeeLocalService;
}