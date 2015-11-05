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
 * Provides a wrapper for {@link Jobpos2RoleLocalService}.
 *
 * @author NQMINH
 * @see Jobpos2RoleLocalService
 * @generated
 */
public class Jobpos2RoleLocalServiceWrapper implements Jobpos2RoleLocalService,
	ServiceWrapper<Jobpos2RoleLocalService> {
	public Jobpos2RoleLocalServiceWrapper(
		Jobpos2RoleLocalService jobpos2RoleLocalService) {
		_jobpos2RoleLocalService = jobpos2RoleLocalService;
	}

	/**
	* Adds the jobpos to role to the database. Also notifies the appropriate model listeners.
	*
	* @param jobpos2Role the jobpos to role
	* @return the jobpos to role that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.Jobpos2Role addJobpos2Role(
		org.oep.usermgt.model.Jobpos2Role jobpos2Role)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobpos2RoleLocalService.addJobpos2Role(jobpos2Role);
	}

	/**
	* Creates a new jobpos to role with the primary key. Does not add the jobpos to role to the database.
	*
	* @param jobpos2RolePK the primary key for the new jobpos to role
	* @return the new jobpos to role
	*/
	@Override
	public org.oep.usermgt.model.Jobpos2Role createJobpos2Role(
		org.oep.usermgt.service.persistence.Jobpos2RolePK jobpos2RolePK) {
		return _jobpos2RoleLocalService.createJobpos2Role(jobpos2RolePK);
	}

	/**
	* Deletes the jobpos to role with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jobpos2RolePK the primary key of the jobpos to role
	* @return the jobpos to role that was removed
	* @throws PortalException if a jobpos to role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.Jobpos2Role deleteJobpos2Role(
		org.oep.usermgt.service.persistence.Jobpos2RolePK jobpos2RolePK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jobpos2RoleLocalService.deleteJobpos2Role(jobpos2RolePK);
	}

	/**
	* Deletes the jobpos to role from the database. Also notifies the appropriate model listeners.
	*
	* @param jobpos2Role the jobpos to role
	* @return the jobpos to role that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.Jobpos2Role deleteJobpos2Role(
		org.oep.usermgt.model.Jobpos2Role jobpos2Role)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobpos2RoleLocalService.deleteJobpos2Role(jobpos2Role);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jobpos2RoleLocalService.dynamicQuery();
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
		return _jobpos2RoleLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.Jobpos2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _jobpos2RoleLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.Jobpos2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _jobpos2RoleLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _jobpos2RoleLocalService.dynamicQueryCount(dynamicQuery);
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
		return _jobpos2RoleLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.usermgt.model.Jobpos2Role fetchJobpos2Role(
		org.oep.usermgt.service.persistence.Jobpos2RolePK jobpos2RolePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobpos2RoleLocalService.fetchJobpos2Role(jobpos2RolePK);
	}

	/**
	* Returns the jobpos to role with the primary key.
	*
	* @param jobpos2RolePK the primary key of the jobpos to role
	* @return the jobpos to role
	* @throws PortalException if a jobpos to role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.Jobpos2Role getJobpos2Role(
		org.oep.usermgt.service.persistence.Jobpos2RolePK jobpos2RolePK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jobpos2RoleLocalService.getJobpos2Role(jobpos2RolePK);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jobpos2RoleLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the jobpos to roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.Jobpos2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of jobpos to roles
	* @param end the upper bound of the range of jobpos to roles (not inclusive)
	* @return the range of jobpos to roles
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.usermgt.model.Jobpos2Role> getJobpos2Roles(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobpos2RoleLocalService.getJobpos2Roles(start, end);
	}

	/**
	* Returns the number of jobpos to roles.
	*
	* @return the number of jobpos to roles
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getJobpos2RolesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobpos2RoleLocalService.getJobpos2RolesCount();
	}

	/**
	* Updates the jobpos to role in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param jobpos2Role the jobpos to role
	* @return the jobpos to role that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.Jobpos2Role updateJobpos2Role(
		org.oep.usermgt.model.Jobpos2Role jobpos2Role)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobpos2RoleLocalService.updateJobpos2Role(jobpos2Role);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _jobpos2RoleLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_jobpos2RoleLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _jobpos2RoleLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public Jobpos2RoleLocalService getWrappedJobpos2RoleLocalService() {
		return _jobpos2RoleLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedJobpos2RoleLocalService(
		Jobpos2RoleLocalService jobpos2RoleLocalService) {
		_jobpos2RoleLocalService = jobpos2RoleLocalService;
	}

	@Override
	public Jobpos2RoleLocalService getWrappedService() {
		return _jobpos2RoleLocalService;
	}

	@Override
	public void setWrappedService(
		Jobpos2RoleLocalService jobpos2RoleLocalService) {
		_jobpos2RoleLocalService = jobpos2RoleLocalService;
	}

	private Jobpos2RoleLocalService _jobpos2RoleLocalService;
}