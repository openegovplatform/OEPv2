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
 * Provides a wrapper for {@link BusinessLocalService}.
 *
 * @author NQMINH
 * @see BusinessLocalService
 * @generated
 */
public class BusinessLocalServiceWrapper implements BusinessLocalService,
	ServiceWrapper<BusinessLocalService> {
	public BusinessLocalServiceWrapper(
		BusinessLocalService businessLocalService) {
		_businessLocalService = businessLocalService;
	}

	/**
	* Adds the business to the database. Also notifies the appropriate model listeners.
	*
	* @param business the business
	* @return the business that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.Business addBusiness(
		org.oep.usermgt.model.Business business)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _businessLocalService.addBusiness(business);
	}

	/**
	* Creates a new business with the primary key. Does not add the business to the database.
	*
	* @param businessId the primary key for the new business
	* @return the new business
	*/
	@Override
	public org.oep.usermgt.model.Business createBusiness(long businessId) {
		return _businessLocalService.createBusiness(businessId);
	}

	/**
	* Deletes the business with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param businessId the primary key of the business
	* @return the business that was removed
	* @throws PortalException if a business with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.Business deleteBusiness(long businessId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _businessLocalService.deleteBusiness(businessId);
	}

	/**
	* Deletes the business from the database. Also notifies the appropriate model listeners.
	*
	* @param business the business
	* @return the business that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.Business deleteBusiness(
		org.oep.usermgt.model.Business business)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _businessLocalService.deleteBusiness(business);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _businessLocalService.dynamicQuery();
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
		return _businessLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.BusinessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _businessLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.BusinessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _businessLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _businessLocalService.dynamicQueryCount(dynamicQuery);
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
		return _businessLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public org.oep.usermgt.model.Business fetchBusiness(long businessId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _businessLocalService.fetchBusiness(businessId);
	}

	/**
	* Returns the business with the primary key.
	*
	* @param businessId the primary key of the business
	* @return the business
	* @throws PortalException if a business with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.Business getBusiness(long businessId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _businessLocalService.getBusiness(businessId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _businessLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the businesses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.BusinessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businesses
	* @param end the upper bound of the range of businesses (not inclusive)
	* @return the range of businesses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.usermgt.model.Business> getBusinesses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _businessLocalService.getBusinesses(start, end);
	}

	/**
	* Returns the number of businesses.
	*
	* @return the number of businesses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getBusinessesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _businessLocalService.getBusinessesCount();
	}

	/**
	* Updates the business in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param business the business
	* @return the business that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.Business updateBusiness(
		org.oep.usermgt.model.Business business)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _businessLocalService.updateBusiness(business);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _businessLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_businessLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _businessLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public org.oep.usermgt.model.Business addBusiness(long organizationId,
		long masterUserId, java.lang.String name, java.lang.String enName,
		java.lang.String shortName, java.lang.String address,
		java.lang.String cityNo, java.lang.String cityName,
		java.lang.String districtNo, java.lang.String districtName,
		java.lang.String wardNo, java.lang.String wardName,
		java.lang.String gpsPosition, java.lang.String telNo,
		java.lang.String fax, java.lang.String email,
		java.lang.String businessNo, java.lang.String businessType,
		java.lang.String registerAgent, java.util.Date registerDate,
		java.lang.String representative, java.lang.String representativeRole,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _businessLocalService.addBusiness(organizationId, masterUserId,
			name, enName, shortName, address, cityNo, cityName, districtNo,
			districtName, wardNo, wardName, gpsPosition, telNo, fax, email,
			businessNo, businessType, registerAgent, registerDate,
			representative, representativeRole, serviceContext);
	}

	@Override
	public org.oep.usermgt.model.Business updateBusiness(long businessId,
		long organizationId, long masterUserId, java.lang.String name,
		java.lang.String enName, java.lang.String shortName,
		java.lang.String address, java.lang.String cityNo,
		java.lang.String cityName, java.lang.String districtNo,
		java.lang.String districtName, java.lang.String wardNo,
		java.lang.String wardName, java.lang.String gpsPosition,
		java.lang.String telNo, java.lang.String fax, java.lang.String email,
		java.lang.String businessNo, java.lang.String businessType,
		java.lang.String registerAgent, java.util.Date registerDate,
		java.lang.String representative, java.lang.String representativeRole,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _businessLocalService.updateBusiness(businessId, organizationId,
			masterUserId, name, enName, shortName, address, cityNo, cityName,
			districtNo, districtName, wardNo, wardName, gpsPosition, telNo,
			fax, email, businessNo, businessType, registerAgent, registerDate,
			representative, representativeRole, serviceContext);
	}

	@Override
	public org.oep.usermgt.model.Business saveBusiness(
		org.oep.usermgt.model.Business business,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _businessLocalService.saveBusiness(business, serviceContext);
	}

	@Override
	public void updateBusinessResources(
		org.oep.usermgt.model.Business business,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_businessLocalService.updateBusinessResources(business,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void removeBusiness(org.oep.usermgt.model.Business business)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_businessLocalService.removeBusiness(business);
	}

	@Override
	public void removeBusiness(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_businessLocalService.removeBusiness(id);
	}

	@Override
	public void addBusinessResources(org.oep.usermgt.model.Business business,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_businessLocalService.addBusinessResources(business,
			addGroupPermission, addGuestPermission, serviceContext);
	}

	@Override
	public void addBusinessResources(org.oep.usermgt.model.Business business,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_businessLocalService.addBusinessResources(business, groupPermissions,
			guestPermissions, serviceContext);
	}

	@Override
	public void addBusinessResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_businessLocalService.addBusinessResources(id, groupPermissions,
			guestPermissions, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public BusinessLocalService getWrappedBusinessLocalService() {
		return _businessLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedBusinessLocalService(
		BusinessLocalService businessLocalService) {
		_businessLocalService = businessLocalService;
	}

	@Override
	public BusinessLocalService getWrappedService() {
		return _businessLocalService;
	}

	@Override
	public void setWrappedService(BusinessLocalService businessLocalService) {
		_businessLocalService = businessLocalService;
	}

	private BusinessLocalService _businessLocalService;
}