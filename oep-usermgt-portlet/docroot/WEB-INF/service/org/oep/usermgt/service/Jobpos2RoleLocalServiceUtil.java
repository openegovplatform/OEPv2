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
 * Provides the local service utility for JobPos2Role. This utility wraps
 * {@link org.oep.usermgt.service.impl.JobPos2RoleLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author NQMINH
 * @see JobPos2RoleLocalService
 * @see org.oep.usermgt.service.base.JobPos2RoleLocalServiceBaseImpl
 * @see org.oep.usermgt.service.impl.JobPos2RoleLocalServiceImpl
 * @generated
 */
public class JobPos2RoleLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.usermgt.service.impl.JobPos2RoleLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the jobpos to role to the database. Also notifies the appropriate model listeners.
	*
	* @param jobPos2Role the jobpos to role
	* @return the jobpos to role that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos2Role addJobPos2Role(
		org.oep.usermgt.model.JobPos2Role jobPos2Role)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addJobPos2Role(jobPos2Role);
	}

	/**
	* Creates a new jobpos to role with the primary key. Does not add the jobpos to role to the database.
	*
	* @param jobPos2RolePK the primary key for the new jobpos to role
	* @return the new jobpos to role
	*/
	public static org.oep.usermgt.model.JobPos2Role createJobPos2Role(
		org.oep.usermgt.service.persistence.JobPos2RolePK jobPos2RolePK) {
		return getService().createJobPos2Role(jobPos2RolePK);
	}

	/**
	* Deletes the jobpos to role with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jobPos2RolePK the primary key of the jobpos to role
	* @return the jobpos to role that was removed
	* @throws PortalException if a jobpos to role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos2Role deleteJobPos2Role(
		org.oep.usermgt.service.persistence.JobPos2RolePK jobPos2RolePK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteJobPos2Role(jobPos2RolePK);
	}

	/**
	* Deletes the jobpos to role from the database. Also notifies the appropriate model listeners.
	*
	* @param jobPos2Role the jobpos to role
	* @return the jobpos to role that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos2Role deleteJobPos2Role(
		org.oep.usermgt.model.JobPos2Role jobPos2Role)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteJobPos2Role(jobPos2Role);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPos2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.oep.usermgt.model.JobPos2Role fetchJobPos2Role(
		org.oep.usermgt.service.persistence.JobPos2RolePK jobPos2RolePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchJobPos2Role(jobPos2RolePK);
	}

	/**
	* Returns the jobpos to role with the primary key.
	*
	* @param jobPos2RolePK the primary key of the jobpos to role
	* @return the jobpos to role
	* @throws PortalException if a jobpos to role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos2Role getJobPos2Role(
		org.oep.usermgt.service.persistence.JobPos2RolePK jobPos2RolePK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getJobPos2Role(jobPos2RolePK);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<org.oep.usermgt.model.JobPos2Role> getJobPos2Roles(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getJobPos2Roles(start, end);
	}

	/**
	* Returns the number of jobpos to roles.
	*
	* @return the number of jobpos to roles
	* @throws SystemException if a system exception occurred
	*/
	public static int getJobPos2RolesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getJobPos2RolesCount();
	}

	/**
	* Updates the jobpos to role in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param jobPos2Role the jobpos to role
	* @return the jobpos to role that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos2Role updateJobPos2Role(
		org.oep.usermgt.model.JobPos2Role jobPos2Role)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateJobPos2Role(jobPos2Role);
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

	public static org.oep.usermgt.model.JobPos2Role addJobPos2Role(
		long jobPosId, long roleId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().addJobPos2Role(jobPosId, roleId, serviceContext);
	}

	public static org.oep.usermgt.model.JobPos2Role updateJobPos2Role(
		long jobPosId, long roleId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateJobPos2Role(jobPosId, roleId, serviceContext);
	}

	public static org.oep.usermgt.model.JobPos2Role saveJobPos2Role(
		org.oep.usermgt.model.JobPos2Role jobPos2Role,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().saveJobPos2Role(jobPos2Role, serviceContext);
	}

	public static void updateJobPos2RoleResources(
		org.oep.usermgt.model.JobPos2Role jobPos,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.updateJobPos2RoleResources(jobPos, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void removeJobPos2Role(
		org.oep.usermgt.model.JobPos2Role jobPos2Role)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeJobPos2Role(jobPos2Role);
	}

	public static void removeJobPos2Role(long jobPosId, long roleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeJobPos2Role(jobPosId, roleId);
	}

	public static org.oep.usermgt.model.JobPos getJobPos2Role(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getJobPos2Role(id);
	}

	public static void addJobPos2RoleResources(
		org.oep.usermgt.model.JobPos jobPos, boolean addGroupPermission,
		boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addJobPos2RoleResources(jobPos, addGroupPermission,
			addGuestPermission, serviceContext);
	}

	public static void addJobPos2RoleResources(
		org.oep.usermgt.model.JobPos jobPos,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addJobPos2RoleResources(jobPos, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void addJobPos2RoleResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addJobPos2RoleResources(id, groupPermissions, guestPermissions,
			serviceContext);
	}

	public static java.util.List<org.oep.usermgt.model.JobPos2Role> getByJobPos(
		long jobPosId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByJobPos(jobPosId);
	}

	public static long[] getRoleIdByJobPosId(long jobPosId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getRoleIdByJobPosId(jobPosId);
	}

	public static java.util.ArrayList<com.liferay.portal.model.Role> getRoleIdByJobPosId(
		java.util.ArrayList<com.liferay.portal.model.Role> listRole,
		long jobPosId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getRoleIdByJobPosId(listRole, jobPosId);
	}

	public static java.util.List<com.liferay.portal.model.Role> getRoleByJobPosId(
		long jobPosId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getRoleByJobPosId(jobPosId);
	}

	public static java.util.List<com.liferay.portal.model.Role> getRoleByNotInJobPosId(
		long jobPosId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getRoleByNotInJobPosId(jobPosId);
	}

	public static void clearService() {
		_service = null;
	}

	public static JobPos2RoleLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					JobPos2RoleLocalService.class.getName());

			if (invokableLocalService instanceof JobPos2RoleLocalService) {
				_service = (JobPos2RoleLocalService)invokableLocalService;
			}
			else {
				_service = new JobPos2RoleLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(JobPos2RoleLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(JobPos2RoleLocalService service) {
	}

	private static JobPos2RoleLocalService _service;
}