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

package org.oep.core.processmgt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UserAssignmentLocalService}.
 *
 * @author trungdk
 * @see UserAssignmentLocalService
 * @generated
 */
public class UserAssignmentLocalServiceWrapper
	implements UserAssignmentLocalService,
		ServiceWrapper<UserAssignmentLocalService> {
	public UserAssignmentLocalServiceWrapper(
		UserAssignmentLocalService userAssignmentLocalService) {
		_userAssignmentLocalService = userAssignmentLocalService;
	}

	/**
	* Adds the user assignment to the database. Also notifies the appropriate model listeners.
	*
	* @param userAssignment the user assignment
	* @return the user assignment that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.UserAssignment addUserAssignment(
		org.oep.core.processmgt.model.UserAssignment userAssignment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userAssignmentLocalService.addUserAssignment(userAssignment);
	}

	/**
	* Creates a new user assignment with the primary key. Does not add the user assignment to the database.
	*
	* @param userAssignmentId the primary key for the new user assignment
	* @return the new user assignment
	*/
	@Override
	public org.oep.core.processmgt.model.UserAssignment createUserAssignment(
		long userAssignmentId) {
		return _userAssignmentLocalService.createUserAssignment(userAssignmentId);
	}

	/**
	* Deletes the user assignment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userAssignmentId the primary key of the user assignment
	* @return the user assignment that was removed
	* @throws PortalException if a user assignment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.UserAssignment deleteUserAssignment(
		long userAssignmentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userAssignmentLocalService.deleteUserAssignment(userAssignmentId);
	}

	/**
	* Deletes the user assignment from the database. Also notifies the appropriate model listeners.
	*
	* @param userAssignment the user assignment
	* @return the user assignment that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.UserAssignment deleteUserAssignment(
		org.oep.core.processmgt.model.UserAssignment userAssignment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userAssignmentLocalService.deleteUserAssignment(userAssignment);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _userAssignmentLocalService.dynamicQuery();
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
		return _userAssignmentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.UserAssignmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _userAssignmentLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.UserAssignmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _userAssignmentLocalService.dynamicQuery(dynamicQuery, start,
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
		return _userAssignmentLocalService.dynamicQueryCount(dynamicQuery);
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
		return _userAssignmentLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.core.processmgt.model.UserAssignment fetchUserAssignment(
		long userAssignmentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userAssignmentLocalService.fetchUserAssignment(userAssignmentId);
	}

	/**
	* Returns the user assignment with the primary key.
	*
	* @param userAssignmentId the primary key of the user assignment
	* @return the user assignment
	* @throws PortalException if a user assignment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.UserAssignment getUserAssignment(
		long userAssignmentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userAssignmentLocalService.getUserAssignment(userAssignmentId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userAssignmentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the user assignments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.UserAssignmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user assignments
	* @param end the upper bound of the range of user assignments (not inclusive)
	* @return the range of user assignments
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.processmgt.model.UserAssignment> getUserAssignments(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userAssignmentLocalService.getUserAssignments(start, end);
	}

	/**
	* Returns the number of user assignments.
	*
	* @return the number of user assignments
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getUserAssignmentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userAssignmentLocalService.getUserAssignmentsCount();
	}

	/**
	* Updates the user assignment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param userAssignment the user assignment
	* @return the user assignment that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.UserAssignment updateUserAssignment(
		org.oep.core.processmgt.model.UserAssignment userAssignment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userAssignmentLocalService.updateUserAssignment(userAssignment);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _userAssignmentLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_userAssignmentLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _userAssignmentLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Add user assignment
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Create new
	*
	* @param
	* @return: new user assignment
	*/
	@Override
	public org.oep.core.processmgt.model.UserAssignment addUserAssignment(
		long processOrderId, long dossierStepId, long assignToUserId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userAssignmentLocalService.addUserAssignment(processOrderId,
			dossierStepId, assignToUserId, serviceContext);
	}

	@Override
	public org.oep.core.processmgt.model.UserAssignment updateUserAssignment(
		long id, long processOrderId, long dossierStepId, long assignToUserId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userAssignmentLocalService.updateUserAssignment(id,
			processOrderId, dossierStepId, assignToUserId, serviceContext);
	}

	@Override
	public void updateUserAssignmentResources(
		org.oep.core.processmgt.model.UserAssignment userAssignment,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_userAssignmentLocalService.updateUserAssignmentResources(userAssignment,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void removeUserAssignment(
		org.oep.core.processmgt.model.UserAssignment userAssignment)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_userAssignmentLocalService.removeUserAssignment(userAssignment);
	}

	@Override
	public void removeUserAssignment(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_userAssignmentLocalService.removeUserAssignment(id);
	}

	@Override
	public void addUserAssignmentResources(
		org.oep.core.processmgt.model.UserAssignment userAssignment,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_userAssignmentLocalService.addUserAssignmentResources(userAssignment,
			addGroupPermission, addGuestPermission, serviceContext);
	}

	@Override
	public void addUserAssignmentResources(
		org.oep.core.processmgt.model.UserAssignment userAssignment,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_userAssignmentLocalService.addUserAssignmentResources(userAssignment,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void addUserAssignmentResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_userAssignmentLocalService.addUserAssignmentResources(id,
			groupPermissions, guestPermissions, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public UserAssignmentLocalService getWrappedUserAssignmentLocalService() {
		return _userAssignmentLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedUserAssignmentLocalService(
		UserAssignmentLocalService userAssignmentLocalService) {
		_userAssignmentLocalService = userAssignmentLocalService;
	}

	@Override
	public UserAssignmentLocalService getWrappedService() {
		return _userAssignmentLocalService;
	}

	@Override
	public void setWrappedService(
		UserAssignmentLocalService userAssignmentLocalService) {
		_userAssignmentLocalService = userAssignmentLocalService;
	}

	private UserAssignmentLocalService _userAssignmentLocalService;
}