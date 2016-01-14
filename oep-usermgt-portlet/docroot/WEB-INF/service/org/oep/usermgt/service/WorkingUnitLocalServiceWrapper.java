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
 * Provides a wrapper for {@link WorkingUnitLocalService}.
 *
 * @author NQMINH
 * @see WorkingUnitLocalService
 * @generated
 */
public class WorkingUnitLocalServiceWrapper implements WorkingUnitLocalService,
	ServiceWrapper<WorkingUnitLocalService> {
	public WorkingUnitLocalServiceWrapper(
		WorkingUnitLocalService workingUnitLocalService) {
		_workingUnitLocalService = workingUnitLocalService;
	}

	/**
	* Adds the Working Unit to the database. Also notifies the appropriate model listeners.
	*
	* @param workingUnit the Working Unit
	* @return the Working Unit that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.WorkingUnit addWorkingUnit(
		org.oep.usermgt.model.WorkingUnit workingUnit)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _workingUnitLocalService.addWorkingUnit(workingUnit);
	}

	/**
	* Creates a new Working Unit with the primary key. Does not add the Working Unit to the database.
	*
	* @param workingUnitId the primary key for the new Working Unit
	* @return the new Working Unit
	*/
	@Override
	public org.oep.usermgt.model.WorkingUnit createWorkingUnit(
		long workingUnitId) {
		return _workingUnitLocalService.createWorkingUnit(workingUnitId);
	}

	/**
	* Deletes the Working Unit with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param workingUnitId the primary key of the Working Unit
	* @return the Working Unit that was removed
	* @throws PortalException if a Working Unit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.WorkingUnit deleteWorkingUnit(
		long workingUnitId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _workingUnitLocalService.deleteWorkingUnit(workingUnitId);
	}

	/**
	* Deletes the Working Unit from the database. Also notifies the appropriate model listeners.
	*
	* @param workingUnit the Working Unit
	* @return the Working Unit that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.WorkingUnit deleteWorkingUnit(
		org.oep.usermgt.model.WorkingUnit workingUnit)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _workingUnitLocalService.deleteWorkingUnit(workingUnit);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _workingUnitLocalService.dynamicQuery();
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
		return _workingUnitLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _workingUnitLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _workingUnitLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _workingUnitLocalService.dynamicQueryCount(dynamicQuery);
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
		return _workingUnitLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.usermgt.model.WorkingUnit fetchWorkingUnit(
		long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _workingUnitLocalService.fetchWorkingUnit(workingUnitId);
	}

	/**
	* Returns the Working Unit with the primary key.
	*
	* @param workingUnitId the primary key of the Working Unit
	* @return the Working Unit
	* @throws PortalException if a Working Unit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.WorkingUnit getWorkingUnit(long workingUnitId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _workingUnitLocalService.getWorkingUnit(workingUnitId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _workingUnitLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the Working Units.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Working Units
	* @param end the upper bound of the range of Working Units (not inclusive)
	* @return the range of Working Units
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.usermgt.model.WorkingUnit> getWorkingUnits(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _workingUnitLocalService.getWorkingUnits(start, end);
	}

	/**
	* Returns the number of Working Units.
	*
	* @return the number of Working Units
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getWorkingUnitsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _workingUnitLocalService.getWorkingUnitsCount();
	}

	/**
	* Updates the Working Unit in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param workingUnit the Working Unit
	* @return the Working Unit that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.WorkingUnit updateWorkingUnit(
		org.oep.usermgt.model.WorkingUnit workingUnit)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _workingUnitLocalService.updateWorkingUnit(workingUnit);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _workingUnitLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_workingUnitLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _workingUnitLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* ThÃƒÂªm mÃ¡Â»â€ºi mÃ¡Â»â€ºi Ã„â€˜Ã†Â¡n vÃ¡Â»â€¹
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  nqminh    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param userId:
	* @param groupId:
	* @param companyId:
	* @param createDate:NgÃƒÂ y tÃ¡ÂºÂ¡o
	* @param modifiedDate:Ngay sÃ¡Â»Â­a
	* @param organizationId:TÃ¡Â»â€¢ chÃ¡Â»Â©c trong cÃ¡Â»â€¢ng
	* @param govAgencyId:CÃ†Â¡ quan Ã„â€˜Ã¡Â»â€¹nh danh
	* @param name:TÃƒÂªn cÃ†Â¡ Ã„â€˜Ã†Â¡n vÃ¡Â»â€¹
	* @param enName:TÃƒÂªn Ã„â€˜Ã†Â¡n vÃ¡Â»â€¹ tiÃ¡ÂºÂ¿ng anh
	* @param parentWorkingUnitId:Ã„ï¿½Ã†Â¡n vÃ¡Â»â€¹ cÃ¡ÂºÂ¥p trÃƒÂªn
	* @param address:Ã„ï¿½Ã¡Â»â€¹a chÃ¡Â»â€°
	* @param cityNo:
	* @param cityName:TÃ¡Â»â€°nh/ThÃƒÂ nh phÃ¡Â»â€˜
	* @param districtNo:
	* @param districtName:QuÃ¡ÂºÂ­n/HuyÃ¡Â»â€¡n
	* @param wardNo:
	* @param wardName:XÃƒÂ£/PhÃ†Â°Ã¡Â»ï¿½ng
	* @param gpsPosition:TÃ¡Â»ï¿½a Ã„â€˜Ã¡Â»â„¢
	* @param telNo:Ã„ï¿½iÃ¡Â»â€¡n thoÃ¡ÂºÂ¡i
	* @param fax:Fax
	* @param email:Email
	* @param website:Website
	*/
	@Override
	public org.oep.usermgt.model.WorkingUnit addWorkingUnit(
		long organizationId, java.lang.String govAgencyId,
		java.lang.String name, java.lang.String enName,
		long parentWorkingUnitId, java.lang.String address,
		java.lang.String cityNo, java.lang.String cityName,
		java.lang.String districtNo, java.lang.String districtName,
		java.lang.String wardNo, java.lang.String wardName,
		java.lang.String gpsPosition, java.lang.String telNo,
		java.lang.String fax, java.lang.String email, java.lang.String website,
		long localSiteId, int isEmployer,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _workingUnitLocalService.addWorkingUnit(organizationId,
			govAgencyId, name, enName, parentWorkingUnitId, address, cityNo,
			cityName, districtNo, districtName, wardNo, wardName, gpsPosition,
			telNo, fax, email, website, localSiteId, isEmployer, serviceContext);
	}

	@Override
	public org.oep.usermgt.model.WorkingUnit updateWorkingUnit(
		long workingUnitId, long organizationId, java.lang.String govAgencyId,
		java.lang.String name, java.lang.String enName,
		long parentWorkingUnitId, java.lang.String address,
		java.lang.String cityNo, java.lang.String cityName,
		java.lang.String districtNo, java.lang.String districtName,
		java.lang.String wardNo, java.lang.String wardName,
		java.lang.String gpsPosition, java.lang.String telNo,
		java.lang.String fax, java.lang.String email, java.lang.String website,
		long localSiteId, int isEmployer,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _workingUnitLocalService.updateWorkingUnit(workingUnitId,
			organizationId, govAgencyId, name, enName, parentWorkingUnitId,
			address, cityNo, cityName, districtNo, districtName, wardNo,
			wardName, gpsPosition, telNo, fax, email, website, localSiteId,
			isEmployer, serviceContext);
	}

	@Override
	public org.oep.usermgt.model.WorkingUnit saveWorkingUnit(
		org.oep.usermgt.model.WorkingUnit workingUnit,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _workingUnitLocalService.saveWorkingUnit(workingUnit,
			serviceContext);
	}

	@Override
	public void updateWorkingUnitResources(
		org.oep.usermgt.model.WorkingUnit workingUnit,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_workingUnitLocalService.updateWorkingUnitResources(workingUnit,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void removeWorkingUnit(org.oep.usermgt.model.WorkingUnit workingUnit)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_workingUnitLocalService.removeWorkingUnit(workingUnit);
	}

	@Override
	public void removeWorkingUnit(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_workingUnitLocalService.removeWorkingUnit(id);
	}

	@Override
	public void addWorkingUnitResources(
		org.oep.usermgt.model.WorkingUnit workingUnit,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_workingUnitLocalService.addWorkingUnitResources(workingUnit,
			addGroupPermission, addGuestPermission, serviceContext);
	}

	@Override
	public void addWorkingUnitResources(
		org.oep.usermgt.model.WorkingUnit workingUnit,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_workingUnitLocalService.addWorkingUnitResources(workingUnit,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void addWorkingUnitResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_workingUnitLocalService.addWorkingUnitResources(id, groupPermissions,
			guestPermissions, serviceContext);
	}

	@Override
	public int countWorkingUnitByCompany(
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _workingUnitLocalService.countWorkingUnitByCompany(serviceContext);
	}

	@Override
	public java.util.List<org.oep.usermgt.model.WorkingUnit> getByCompany(
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _workingUnitLocalService.getByCompany(serviceContext);
	}

	@Override
	public java.util.List<org.oep.usermgt.model.WorkingUnit> getByCompany(
		int start, int end,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _workingUnitLocalService.getByCompany(start, end, serviceContext);
	}

	@Override
	public int countWorkingUnitByCompanyParentWorkingUnit(
		long parentWorkingUnitId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _workingUnitLocalService.countWorkingUnitByCompanyParentWorkingUnit(parentWorkingUnitId,
			serviceContext);
	}

	@Override
	public java.util.List<org.oep.usermgt.model.WorkingUnit> getByCompanyParentWorkingUnit(
		long parentWorkingUnitId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _workingUnitLocalService.getByCompanyParentWorkingUnit(parentWorkingUnitId,
			serviceContext);
	}

	@Override
	public java.util.List<org.oep.usermgt.model.WorkingUnit> getByCompanyParentWorkingUnit(
		long parentWorkingUnitId, int start, int end,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _workingUnitLocalService.getByCompanyParentWorkingUnit(parentWorkingUnitId,
			start, end, serviceContext);
	}

	@Override
	public int countWorkingUnitByGroup(
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _workingUnitLocalService.countWorkingUnitByGroup(serviceContext);
	}

	@Override
	public java.util.List<org.oep.usermgt.model.WorkingUnit> getByGroup(
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _workingUnitLocalService.getByGroup(serviceContext);
	}

	@Override
	public java.util.List<org.oep.usermgt.model.WorkingUnit> getByGroup(
		int start, int end,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _workingUnitLocalService.getByGroup(start, end, serviceContext);
	}

	@Override
	public int countWorkingUnitByGroupParentWorkingUnit(
		long parentWorkingUnitId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _workingUnitLocalService.countWorkingUnitByGroupParentWorkingUnit(parentWorkingUnitId,
			serviceContext);
	}

	@Override
	public java.util.List<org.oep.usermgt.model.WorkingUnit> getByGroupParentWorkingUnit(
		long parentWorkingUnitId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _workingUnitLocalService.getByGroupParentWorkingUnit(parentWorkingUnitId,
			serviceContext);
	}

	@Override
	public java.util.List<org.oep.usermgt.model.WorkingUnit> getByGroupParentWorkingUnit(
		long parentWorkingUnitId, int start, int end,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _workingUnitLocalService.getByGroupParentWorkingUnit(parentWorkingUnitId,
			start, end, serviceContext);
	}

	@Override
	public int countWorkingUnitByLikeName(java.lang.String textSearch,
		long parentWorkingUnitId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _workingUnitLocalService.countWorkingUnitByLikeName(textSearch,
			parentWorkingUnitId, serviceContext);
	}

	@Override
	public java.util.List<org.oep.usermgt.model.WorkingUnit> finderByLikeName(
		java.lang.String textSearch, long parentWorkingUnitId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _workingUnitLocalService.finderByLikeName(textSearch,
			parentWorkingUnitId, serviceContext);
	}

	@Override
	public java.util.List<java.lang.Object[]> finderByLikeNameShort(
		java.lang.String textSearch, long parentWorkingUnitId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _workingUnitLocalService.finderByLikeNameShort(textSearch,
			parentWorkingUnitId, serviceContext);
	}

	@Override
	public java.util.List<org.oep.usermgt.model.WorkingUnit> finderByLikeName(
		java.lang.String textSearch, long parentWorkingUnitId, int startIndex,
		int endIndex, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _workingUnitLocalService.finderByLikeName(textSearch,
			parentWorkingUnitId, startIndex, endIndex, serviceContext);
	}

	@Override
	public java.util.List<java.lang.Object[]> finderByLikeNameShort(
		java.lang.String textSearch, long parentWorkingUnitId, int startIndex,
		int endIndex, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _workingUnitLocalService.finderByLikeNameShort(textSearch,
			parentWorkingUnitId, startIndex, endIndex, serviceContext);
	}

	@Override
	public java.util.List<org.oep.usermgt.model.WorkingUnit> getByCompanyTree(
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _workingUnitLocalService.getByCompanyTree(serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public WorkingUnitLocalService getWrappedWorkingUnitLocalService() {
		return _workingUnitLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedWorkingUnitLocalService(
		WorkingUnitLocalService workingUnitLocalService) {
		_workingUnitLocalService = workingUnitLocalService;
	}

	@Override
	public WorkingUnitLocalService getWrappedService() {
		return _workingUnitLocalService;
	}

	@Override
	public void setWrappedService(
		WorkingUnitLocalService workingUnitLocalService) {
		_workingUnitLocalService = workingUnitLocalService;
	}

	private WorkingUnitLocalService _workingUnitLocalService;
}