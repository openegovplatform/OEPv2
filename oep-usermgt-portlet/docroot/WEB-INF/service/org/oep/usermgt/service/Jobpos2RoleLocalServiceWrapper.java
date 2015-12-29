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
 * Provides a wrapper for {@link JobPos2RoleLocalService}.
 *
 * @author NQMINH
 * @see JobPos2RoleLocalService
 * @generated
 */
public class JobPos2RoleLocalServiceWrapper implements JobPos2RoleLocalService,
	ServiceWrapper<JobPos2RoleLocalService> {
	public JobPos2RoleLocalServiceWrapper(
		JobPos2RoleLocalService jobPos2RoleLocalService) {
		_jobPos2RoleLocalService = jobPos2RoleLocalService;
	}

	/**
	* Adds the jobpos to role to the database. Also notifies the appropriate model listeners.
	*
	* @param jobPos2Role the jobpos to role
	* @return the jobpos to role that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.JobPos2Role addJobPos2Role(
		org.oep.usermgt.model.JobPos2Role jobPos2Role)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobPos2RoleLocalService.addJobPos2Role(jobPos2Role);
	}

	/**
	* Creates a new jobpos to role with the primary key. Does not add the jobpos to role to the database.
	*
	* @param jobPos2RolePK the primary key for the new jobpos to role
	* @return the new jobpos to role
	*/
	@Override
	public org.oep.usermgt.model.JobPos2Role createJobPos2Role(
		org.oep.usermgt.service.persistence.JobPos2RolePK jobPos2RolePK) {
		return _jobPos2RoleLocalService.createJobPos2Role(jobPos2RolePK);
	}

	/**
	* Deletes the jobpos to role with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jobPos2RolePK the primary key of the jobpos to role
	* @return the jobpos to role that was removed
	* @throws PortalException if a jobpos to role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.JobPos2Role deleteJobPos2Role(
		org.oep.usermgt.service.persistence.JobPos2RolePK jobPos2RolePK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jobPos2RoleLocalService.deleteJobPos2Role(jobPos2RolePK);
	}

	/**
	* Deletes the jobpos to role from the database. Also notifies the appropriate model listeners.
	*
	* @param jobPos2Role the jobpos to role
	* @return the jobpos to role that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.JobPos2Role deleteJobPos2Role(
		org.oep.usermgt.model.JobPos2Role jobPos2Role)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobPos2RoleLocalService.deleteJobPos2Role(jobPos2Role);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jobPos2RoleLocalService.dynamicQuery();
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
		return _jobPos2RoleLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPos2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _jobPos2RoleLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPos2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _jobPos2RoleLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _jobPos2RoleLocalService.dynamicQueryCount(dynamicQuery);
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
		return _jobPos2RoleLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.usermgt.model.JobPos2Role fetchJobPos2Role(
		org.oep.usermgt.service.persistence.JobPos2RolePK jobPos2RolePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobPos2RoleLocalService.fetchJobPos2Role(jobPos2RolePK);
	}

	/**
	* Returns the jobpos to role with the primary key.
	*
	* @param jobPos2RolePK the primary key of the jobpos to role
	* @return the jobpos to role
	* @throws PortalException if a jobpos to role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.JobPos2Role getJobPos2Role(
		org.oep.usermgt.service.persistence.JobPos2RolePK jobPos2RolePK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jobPos2RoleLocalService.getJobPos2Role(jobPos2RolePK);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jobPos2RoleLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the jobpos to roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPos2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of jobpos to roles
	* @param end the upper bound of the range of jobpos to roles (not inclusive)
	* @return the range of jobpos to roles
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.usermgt.model.JobPos2Role> getJobPos2Roles(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobPos2RoleLocalService.getJobPos2Roles(start, end);
	}

	/**
	* Returns the number of jobpos to roles.
	*
	* @return the number of jobpos to roles
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getJobPos2RolesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobPos2RoleLocalService.getJobPos2RolesCount();
	}

	/**
	* Updates the jobpos to role in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param jobPos2Role the jobpos to role
	* @return the jobpos to role that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.JobPos2Role updateJobPos2Role(
		org.oep.usermgt.model.JobPos2Role jobPos2Role)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobPos2RoleLocalService.updateJobPos2Role(jobPos2Role);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _jobPos2RoleLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_jobPos2RoleLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _jobPos2RoleLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public org.oep.usermgt.model.JobPos2Role addJobPos2Role(long jobPosId,
		long roleId, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jobPos2RoleLocalService.addJobPos2Role(jobPosId, roleId,
			serviceContext);
	}

	@Override
	public org.oep.usermgt.model.JobPos2Role updateJobPos2Role(long jobPosId,
		long roleId, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jobPos2RoleLocalService.updateJobPos2Role(jobPosId, roleId,
			serviceContext);
	}

	@Override
	public org.oep.usermgt.model.JobPos2Role saveJobPos2Role(
		org.oep.usermgt.model.JobPos2Role jobPos2Role,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jobPos2RoleLocalService.saveJobPos2Role(jobPos2Role,
			serviceContext);
	}

	@Override
	public void updateJobPos2RoleResources(
		org.oep.usermgt.model.JobPos2Role jobPos,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_jobPos2RoleLocalService.updateJobPos2RoleResources(jobPos,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void removeJobPos2Role(org.oep.usermgt.model.JobPos2Role jobPos2Role)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_jobPos2RoleLocalService.removeJobPos2Role(jobPos2Role);
	}

	@Override
	public void removeJobPos2Role(long jobPosId, long roleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_jobPos2RoleLocalService.removeJobPos2Role(jobPosId, roleId);
	}

	@Override
	public org.oep.usermgt.model.JobPos getJobPos2Role(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jobPos2RoleLocalService.getJobPos2Role(id);
	}

	@Override
	public void addJobPos2RoleResources(org.oep.usermgt.model.JobPos jobPos,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_jobPos2RoleLocalService.addJobPos2RoleResources(jobPos,
			addGroupPermission, addGuestPermission, serviceContext);
	}

	@Override
	public void addJobPos2RoleResources(org.oep.usermgt.model.JobPos jobPos,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_jobPos2RoleLocalService.addJobPos2RoleResources(jobPos,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void addJobPos2RoleResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_jobPos2RoleLocalService.addJobPos2RoleResources(id, groupPermissions,
			guestPermissions, serviceContext);
	}

	@Override
	public java.util.List<org.oep.usermgt.model.JobPos2Role> getByJobPos(
		long jobPosId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jobPos2RoleLocalService.getByJobPos(jobPosId);
	}

	@Override
	public long[] getRoleIdByJobPosId(long jobPosId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jobPos2RoleLocalService.getRoleIdByJobPosId(jobPosId);
	}

	@Override
	public java.util.ArrayList<com.liferay.portal.model.Role> getRoleIdByJobPosId(
		java.util.ArrayList<com.liferay.portal.model.Role> listRole,
		long jobPosId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jobPos2RoleLocalService.getRoleIdByJobPosId(listRole, jobPosId);
	}

	@Override
	public java.util.List<com.liferay.portal.model.Role> getRoleByJobPosId(
		long jobPosId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jobPos2RoleLocalService.getRoleByJobPosId(jobPosId);
	}

	@Override
	public java.util.List<com.liferay.portal.model.Role> getRoleByNotInJobPosId(
		long jobPosId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jobPos2RoleLocalService.getRoleByNotInJobPosId(jobPosId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public JobPos2RoleLocalService getWrappedJobPos2RoleLocalService() {
		return _jobPos2RoleLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedJobPos2RoleLocalService(
		JobPos2RoleLocalService jobPos2RoleLocalService) {
		_jobPos2RoleLocalService = jobPos2RoleLocalService;
	}

	@Override
	public JobPos2RoleLocalService getWrappedService() {
		return _jobPos2RoleLocalService;
	}

	@Override
	public void setWrappedService(
		JobPos2RoleLocalService jobPos2RoleLocalService) {
		_jobPos2RoleLocalService = jobPos2RoleLocalService;
	}

	private JobPos2RoleLocalService _jobPos2RoleLocalService;
}