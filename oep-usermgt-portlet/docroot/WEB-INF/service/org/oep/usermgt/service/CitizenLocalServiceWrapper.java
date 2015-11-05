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
 * Provides a wrapper for {@link CitizenLocalService}.
 *
 * @author NQMINH
 * @see CitizenLocalService
 * @generated
 */
public class CitizenLocalServiceWrapper implements CitizenLocalService,
	ServiceWrapper<CitizenLocalService> {
	public CitizenLocalServiceWrapper(CitizenLocalService citizenLocalService) {
		_citizenLocalService = citizenLocalService;
	}

	/**
	* Adds the citizen to the database. Also notifies the appropriate model listeners.
	*
	* @param citizen the citizen
	* @return the citizen that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.Citizen addCitizen(
		org.oep.usermgt.model.Citizen citizen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _citizenLocalService.addCitizen(citizen);
	}

	/**
	* Creates a new citizen with the primary key. Does not add the citizen to the database.
	*
	* @param citizenId the primary key for the new citizen
	* @return the new citizen
	*/
	@Override
	public org.oep.usermgt.model.Citizen createCitizen(long citizenId) {
		return _citizenLocalService.createCitizen(citizenId);
	}

	/**
	* Deletes the citizen with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param citizenId the primary key of the citizen
	* @return the citizen that was removed
	* @throws PortalException if a citizen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.Citizen deleteCitizen(long citizenId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _citizenLocalService.deleteCitizen(citizenId);
	}

	/**
	* Deletes the citizen from the database. Also notifies the appropriate model listeners.
	*
	* @param citizen the citizen
	* @return the citizen that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.Citizen deleteCitizen(
		org.oep.usermgt.model.Citizen citizen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _citizenLocalService.deleteCitizen(citizen);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _citizenLocalService.dynamicQuery();
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
		return _citizenLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.CitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _citizenLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.CitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _citizenLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _citizenLocalService.dynamicQueryCount(dynamicQuery);
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
		return _citizenLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public org.oep.usermgt.model.Citizen fetchCitizen(long citizenId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _citizenLocalService.fetchCitizen(citizenId);
	}

	/**
	* Returns the citizen with the primary key.
	*
	* @param citizenId the primary key of the citizen
	* @return the citizen
	* @throws PortalException if a citizen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.Citizen getCitizen(long citizenId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _citizenLocalService.getCitizen(citizenId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _citizenLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the citizens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.CitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of citizens
	* @param end the upper bound of the range of citizens (not inclusive)
	* @return the range of citizens
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.usermgt.model.Citizen> getCitizens(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _citizenLocalService.getCitizens(start, end);
	}

	/**
	* Returns the number of citizens.
	*
	* @return the number of citizens
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCitizensCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _citizenLocalService.getCitizensCount();
	}

	/**
	* Updates the citizen in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param citizen the citizen
	* @return the citizen that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.Citizen updateCitizen(
		org.oep.usermgt.model.Citizen citizen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _citizenLocalService.updateCitizen(citizen);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _citizenLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_citizenLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _citizenLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public org.oep.usermgt.model.Citizen addCitizen(long mappingUserId,
		java.lang.String citizenNo, java.lang.String fullName, int gender,
		java.lang.String identificationNo, java.lang.String address,
		java.lang.String cityNo, java.lang.String cityName,
		java.lang.String districtNo, java.lang.String districtName,
		java.lang.String wardNo, java.lang.String wardName,
		java.lang.String homeAddress, java.lang.String homeTel,
		java.lang.String mobile, java.lang.String email,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _citizenLocalService.addCitizen(mappingUserId, citizenNo,
			fullName, gender, identificationNo, address, cityNo, cityName,
			districtNo, districtName, wardNo, wardName, homeAddress, homeTel,
			mobile, email, serviceContext);
	}

	@Override
	public org.oep.usermgt.model.Citizen updateCitizen(long citizenId,
		long mappingUserId, java.lang.String citizenNo,
		java.lang.String fullName, int gender,
		java.lang.String identificationNo, java.lang.String address,
		java.lang.String cityNo, java.lang.String cityName,
		java.lang.String districtNo, java.lang.String districtName,
		java.lang.String wardNo, java.lang.String wardName,
		java.lang.String homeAddress, java.lang.String homeTel,
		java.lang.String mobile, java.lang.String email,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _citizenLocalService.updateCitizen(citizenId, mappingUserId,
			citizenNo, fullName, gender, identificationNo, address, cityNo,
			cityName, districtNo, districtName, wardNo, wardName, homeAddress,
			homeTel, mobile, email, serviceContext);
	}

	@Override
	public org.oep.usermgt.model.Citizen saveCitizen(
		org.oep.usermgt.model.Citizen citizen,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _citizenLocalService.saveCitizen(citizen, serviceContext);
	}

	@Override
	public void updateCitizenResources(org.oep.usermgt.model.Citizen citizen,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_citizenLocalService.updateCitizenResources(citizen, groupPermissions,
			guestPermissions, serviceContext);
	}

	@Override
	public void removeCitizen(org.oep.usermgt.model.Citizen citizen)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_citizenLocalService.removeCitizen(citizen);
	}

	@Override
	public void removeCitizen(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_citizenLocalService.removeCitizen(id);
	}

	@Override
	public void addCitizenResources(org.oep.usermgt.model.Citizen citizen,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_citizenLocalService.addCitizenResources(citizen, addGroupPermission,
			addGuestPermission, serviceContext);
	}

	@Override
	public void addCitizenResources(org.oep.usermgt.model.Citizen citizen,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_citizenLocalService.addCitizenResources(citizen, groupPermissions,
			guestPermissions, serviceContext);
	}

	@Override
	public void addCitizenResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_citizenLocalService.addCitizenResources(id, groupPermissions,
			guestPermissions, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CitizenLocalService getWrappedCitizenLocalService() {
		return _citizenLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCitizenLocalService(
		CitizenLocalService citizenLocalService) {
		_citizenLocalService = citizenLocalService;
	}

	@Override
	public CitizenLocalService getWrappedService() {
		return _citizenLocalService;
	}

	@Override
	public void setWrappedService(CitizenLocalService citizenLocalService) {
		_citizenLocalService = citizenLocalService;
	}

	private CitizenLocalService _citizenLocalService;
}