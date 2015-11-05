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
 * Provides a wrapper for {@link DelegacyLocalService}.
 *
 * @author NQMINH
 * @see DelegacyLocalService
 * @generated
 */
public class DelegacyLocalServiceWrapper implements DelegacyLocalService,
	ServiceWrapper<DelegacyLocalService> {
	public DelegacyLocalServiceWrapper(
		DelegacyLocalService delegacyLocalService) {
		_delegacyLocalService = delegacyLocalService;
	}

	/**
	* Adds the delegacy to the database. Also notifies the appropriate model listeners.
	*
	* @param delegacy the delegacy
	* @return the delegacy that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.Delegacy addDelegacy(
		org.oep.usermgt.model.Delegacy delegacy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _delegacyLocalService.addDelegacy(delegacy);
	}

	/**
	* Creates a new delegacy with the primary key. Does not add the delegacy to the database.
	*
	* @param delegacyId the primary key for the new delegacy
	* @return the new delegacy
	*/
	@Override
	public org.oep.usermgt.model.Delegacy createDelegacy(long delegacyId) {
		return _delegacyLocalService.createDelegacy(delegacyId);
	}

	/**
	* Deletes the delegacy with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param delegacyId the primary key of the delegacy
	* @return the delegacy that was removed
	* @throws PortalException if a delegacy with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.Delegacy deleteDelegacy(long delegacyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _delegacyLocalService.deleteDelegacy(delegacyId);
	}

	/**
	* Deletes the delegacy from the database. Also notifies the appropriate model listeners.
	*
	* @param delegacy the delegacy
	* @return the delegacy that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.Delegacy deleteDelegacy(
		org.oep.usermgt.model.Delegacy delegacy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _delegacyLocalService.deleteDelegacy(delegacy);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _delegacyLocalService.dynamicQuery();
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
		return _delegacyLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.DelegacyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _delegacyLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.DelegacyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _delegacyLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _delegacyLocalService.dynamicQueryCount(dynamicQuery);
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
		return _delegacyLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public org.oep.usermgt.model.Delegacy fetchDelegacy(long delegacyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _delegacyLocalService.fetchDelegacy(delegacyId);
	}

	/**
	* Returns the delegacy with the primary key.
	*
	* @param delegacyId the primary key of the delegacy
	* @return the delegacy
	* @throws PortalException if a delegacy with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.Delegacy getDelegacy(long delegacyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _delegacyLocalService.getDelegacy(delegacyId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _delegacyLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the delegacies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.DelegacyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of delegacies
	* @param end the upper bound of the range of delegacies (not inclusive)
	* @return the range of delegacies
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.usermgt.model.Delegacy> getDelegacies(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _delegacyLocalService.getDelegacies(start, end);
	}

	/**
	* Returns the number of delegacies.
	*
	* @return the number of delegacies
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDelegaciesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _delegacyLocalService.getDelegaciesCount();
	}

	/**
	* Updates the delegacy in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param delegacy the delegacy
	* @return the delegacy that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.Delegacy updateDelegacy(
		org.oep.usermgt.model.Delegacy delegacy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _delegacyLocalService.updateDelegacy(delegacy);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _delegacyLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_delegacyLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _delegacyLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public org.oep.usermgt.model.Delegacy addDelegacy(long fromEmployeeId,
		long toEmployeeId, long roleId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _delegacyLocalService.addDelegacy(fromEmployeeId, toEmployeeId,
			roleId, serviceContext);
	}

	@Override
	public org.oep.usermgt.model.Delegacy updateDelegacy(long delegacyId,
		long fromEmployeeId, long toEmployeeId, long roleId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _delegacyLocalService.updateDelegacy(delegacyId, fromEmployeeId,
			toEmployeeId, roleId, serviceContext);
	}

	@Override
	public org.oep.usermgt.model.Delegacy saveDelegacy(
		org.oep.usermgt.model.Delegacy delegacy,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _delegacyLocalService.saveDelegacy(delegacy, serviceContext);
	}

	@Override
	public void updateDelegacyResources(
		org.oep.usermgt.model.Delegacy delegacy,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_delegacyLocalService.updateDelegacyResources(delegacy,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void removeDelegacy(org.oep.usermgt.model.Delegacy delegacy)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_delegacyLocalService.removeDelegacy(delegacy);
	}

	@Override
	public void removeDelegacy(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_delegacyLocalService.removeDelegacy(id);
	}

	@Override
	public void addDelegacyResources(org.oep.usermgt.model.Delegacy delegacy,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_delegacyLocalService.addDelegacyResources(delegacy,
			addGroupPermission, addGuestPermission, serviceContext);
	}

	@Override
	public void addDelegacyResources(org.oep.usermgt.model.Delegacy delegacy,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_delegacyLocalService.addDelegacyResources(delegacy, groupPermissions,
			guestPermissions, serviceContext);
	}

	@Override
	public void addDelegacyResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_delegacyLocalService.addDelegacyResources(id, groupPermissions,
			guestPermissions, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DelegacyLocalService getWrappedDelegacyLocalService() {
		return _delegacyLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDelegacyLocalService(
		DelegacyLocalService delegacyLocalService) {
		_delegacyLocalService = delegacyLocalService;
	}

	@Override
	public DelegacyLocalService getWrappedService() {
		return _delegacyLocalService;
	}

	@Override
	public void setWrappedService(DelegacyLocalService delegacyLocalService) {
		_delegacyLocalService = delegacyLocalService;
	}

	private DelegacyLocalService _delegacyLocalService;
}