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
 * Provides the local service utility for WorkingUnit. This utility wraps
 * {@link org.oep.usermgt.service.impl.WorkingUnitLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author NQMINH
 * @see WorkingUnitLocalService
 * @see org.oep.usermgt.service.base.WorkingUnitLocalServiceBaseImpl
 * @see org.oep.usermgt.service.impl.WorkingUnitLocalServiceImpl
 * @generated
 */
public class WorkingUnitLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.usermgt.service.impl.WorkingUnitLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the Working Unit to the database. Also notifies the appropriate model listeners.
	*
	* @param workingUnit the Working Unit
	* @return the Working Unit that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit addWorkingUnit(
		org.oep.usermgt.model.WorkingUnit workingUnit)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addWorkingUnit(workingUnit);
	}

	/**
	* Creates a new Working Unit with the primary key. Does not add the Working Unit to the database.
	*
	* @param workingUnitId the primary key for the new Working Unit
	* @return the new Working Unit
	*/
	public static org.oep.usermgt.model.WorkingUnit createWorkingUnit(
		long workingUnitId) {
		return getService().createWorkingUnit(workingUnitId);
	}

	/**
	* Deletes the Working Unit with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param workingUnitId the primary key of the Working Unit
	* @return the Working Unit that was removed
	* @throws PortalException if a Working Unit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit deleteWorkingUnit(
		long workingUnitId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteWorkingUnit(workingUnitId);
	}

	/**
	* Deletes the Working Unit from the database. Also notifies the appropriate model listeners.
	*
	* @param workingUnit the Working Unit
	* @return the Working Unit that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit deleteWorkingUnit(
		org.oep.usermgt.model.WorkingUnit workingUnit)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteWorkingUnit(workingUnit);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.oep.usermgt.model.WorkingUnit fetchWorkingUnit(
		long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchWorkingUnit(workingUnitId);
	}

	/**
	* Returns the Working Unit with the primary key.
	*
	* @param workingUnitId the primary key of the Working Unit
	* @return the Working Unit
	* @throws PortalException if a Working Unit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit getWorkingUnit(
		long workingUnitId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getWorkingUnit(workingUnitId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> getWorkingUnits(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getWorkingUnits(start, end);
	}

	/**
	* Returns the number of Working Units.
	*
	* @return the number of Working Units
	* @throws SystemException if a system exception occurred
	*/
	public static int getWorkingUnitsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getWorkingUnitsCount();
	}

	/**
	* Updates the Working Unit in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param workingUnit the Working Unit
	* @return the Working Unit that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit updateWorkingUnit(
		org.oep.usermgt.model.WorkingUnit workingUnit)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateWorkingUnit(workingUnit);
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
	public static org.oep.usermgt.model.WorkingUnit addWorkingUnit(
		java.lang.String organizationId, java.lang.String govAgencyId,
		java.lang.String name, java.lang.String enName,
		long parentWorkingUnitId, java.lang.String address,
		java.lang.String cityNo, java.lang.String cityName,
		java.lang.String districtNo, java.lang.String districtName,
		java.lang.String wardNo, java.lang.String wardName,
		java.lang.String gpsPosition, java.lang.String telNo,
		java.lang.String fax, java.lang.String email, java.lang.String website,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addWorkingUnit(organizationId, govAgencyId, name, enName,
			parentWorkingUnitId, address, cityNo, cityName, districtNo,
			districtName, wardNo, wardName, gpsPosition, telNo, fax, email,
			website, serviceContext);
	}

	public static org.oep.usermgt.model.WorkingUnit updateWorkingUnit(
		long workingUnitId, java.lang.String organizationId,
		java.lang.String govAgencyId, java.lang.String name,
		java.lang.String enName, long parentWorkingUnitId,
		java.lang.String address, java.lang.String cityNo,
		java.lang.String cityName, java.lang.String districtNo,
		java.lang.String districtName, java.lang.String wardNo,
		java.lang.String wardName, java.lang.String gpsPosition,
		java.lang.String telNo, java.lang.String fax, java.lang.String email,
		java.lang.String website,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateWorkingUnit(workingUnitId, organizationId,
			govAgencyId, name, enName, parentWorkingUnitId, address, cityNo,
			cityName, districtNo, districtName, wardNo, wardName, gpsPosition,
			telNo, fax, email, website, serviceContext);
	}

	public static org.oep.usermgt.model.WorkingUnit saveWorkingUnit(
		org.oep.usermgt.model.WorkingUnit workingUnit,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().saveWorkingUnit(workingUnit, serviceContext);
	}

	public static void updateWorkingUnitResources(
		org.oep.usermgt.model.WorkingUnit workingUnit,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.updateWorkingUnitResources(workingUnit, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void removeWorkingUnit(
		org.oep.usermgt.model.WorkingUnit workingUnit)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeWorkingUnit(workingUnit);
	}

	public static void removeWorkingUnit(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeWorkingUnit(id);
	}

	public static void addWorkingUnitResources(
		org.oep.usermgt.model.WorkingUnit workingUnit,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addWorkingUnitResources(workingUnit, addGroupPermission,
			addGuestPermission, serviceContext);
	}

	public static void addWorkingUnitResources(
		org.oep.usermgt.model.WorkingUnit workingUnit,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addWorkingUnitResources(workingUnit, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void addWorkingUnitResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addWorkingUnitResources(id, groupPermissions, guestPermissions,
			serviceContext);
	}

	public static int countWorkingUnitByCompany(
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countWorkingUnitByCompany(serviceContext);
	}

	public static java.util.List<org.oep.usermgt.model.WorkingUnit> getByCompany(
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByCompany(serviceContext);
	}

	public static java.util.List<org.oep.usermgt.model.WorkingUnit> getByCompany(
		int start, int end,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByCompany(start, end, serviceContext);
	}

	public static int countWorkingUnitByCompanyParentWorkingUnit(
		long parentWorkingUnitId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countWorkingUnitByCompanyParentWorkingUnit(parentWorkingUnitId,
			serviceContext);
	}

	public static java.util.List<org.oep.usermgt.model.WorkingUnit> getByCompanyParentWorkingUnit(
		long parentWorkingUnitId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getByCompanyParentWorkingUnit(parentWorkingUnitId,
			serviceContext);
	}

	public static java.util.List<org.oep.usermgt.model.WorkingUnit> getByCompanyParentWorkingUnit(
		long parentWorkingUnitId, int start, int end,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getByCompanyParentWorkingUnit(parentWorkingUnitId, start,
			end, serviceContext);
	}

	public static int countWorkingUnitByGroup(
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countWorkingUnitByGroup(serviceContext);
	}

	public static java.util.List<org.oep.usermgt.model.WorkingUnit> getByGroup(
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByGroup(serviceContext);
	}

	public static java.util.List<org.oep.usermgt.model.WorkingUnit> getByGroup(
		int start, int end,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByGroup(start, end, serviceContext);
	}

	public static int countWorkingUnitByGroupParentWorkingUnit(
		long parentWorkingUnitId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countWorkingUnitByGroupParentWorkingUnit(parentWorkingUnitId,
			serviceContext);
	}

	public static java.util.List<org.oep.usermgt.model.WorkingUnit> getByGroupParentWorkingUnit(
		long parentWorkingUnitId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getByGroupParentWorkingUnit(parentWorkingUnitId,
			serviceContext);
	}

	public static java.util.List<org.oep.usermgt.model.WorkingUnit> getByGroupParentWorkingUnit(
		long parentWorkingUnitId, int start, int end,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getByGroupParentWorkingUnit(parentWorkingUnitId, start,
			end, serviceContext);
	}

	public static int countWorkingUnitByLikeName(java.lang.String textSearch,
		long parentWorkingUnitId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countWorkingUnitByLikeName(textSearch, parentWorkingUnitId,
			serviceContext);
	}

	public static java.util.List<org.oep.usermgt.model.WorkingUnit> finderByLikeName(
		java.lang.String textSearch, long parentWorkingUnitId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .finderByLikeName(textSearch, parentWorkingUnitId,
			serviceContext);
	}

	public static java.util.List<org.oep.usermgt.model.WorkingUnit> finderByLikeName(
		java.lang.String textSearch, long parentWorkingUnitId, int startIndex,
		int endIndex, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .finderByLikeName(textSearch, parentWorkingUnitId,
			startIndex, endIndex, serviceContext);
	}

	public static java.util.List<org.oep.usermgt.model.WorkingUnit> getByCompanyTree(
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getByCompanyTree(serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static WorkingUnitLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					WorkingUnitLocalService.class.getName());

			if (invokableLocalService instanceof WorkingUnitLocalService) {
				_service = (WorkingUnitLocalService)invokableLocalService;
			}
			else {
				_service = new WorkingUnitLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(WorkingUnitLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(WorkingUnitLocalService service) {
	}

	private static WorkingUnitLocalService _service;
}