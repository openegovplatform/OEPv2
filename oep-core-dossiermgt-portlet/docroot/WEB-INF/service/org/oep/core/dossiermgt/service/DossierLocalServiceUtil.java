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

package org.oep.core.dossiermgt.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Dossier. This utility wraps
 * {@link org.oep.core.dossiermgt.service.impl.DossierLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author trungdk
 * @see DossierLocalService
 * @see org.oep.core.dossiermgt.service.base.DossierLocalServiceBaseImpl
 * @see org.oep.core.dossiermgt.service.impl.DossierLocalServiceImpl
 * @generated
 */
public class DossierLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.core.dossiermgt.service.impl.DossierLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dossier to the database. Also notifies the appropriate model listeners.
	*
	* @param dossier the dossier
	* @return the dossier that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.Dossier addDossier(
		org.oep.core.dossiermgt.model.Dossier dossier)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDossier(dossier);
	}

	/**
	* Creates a new dossier with the primary key. Does not add the dossier to the database.
	*
	* @param dossierId the primary key for the new dossier
	* @return the new dossier
	*/
	public static org.oep.core.dossiermgt.model.Dossier createDossier(
		long dossierId) {
		return getService().createDossier(dossierId);
	}

	/**
	* Deletes the dossier with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierId the primary key of the dossier
	* @return the dossier that was removed
	* @throws PortalException if a dossier with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.Dossier deleteDossier(
		long dossierId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDossier(dossierId);
	}

	/**
	* Deletes the dossier from the database. Also notifies the appropriate model listeners.
	*
	* @param dossier the dossier
	* @return the dossier that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.Dossier deleteDossier(
		org.oep.core.dossiermgt.model.Dossier dossier)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDossier(dossier);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.oep.core.dossiermgt.model.Dossier fetchDossier(
		long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDossier(dossierId);
	}

	/**
	* Returns the dossier with the matching UUID and company.
	*
	* @param uuid the dossier's UUID
	* @param companyId the primary key of the company
	* @return the matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.Dossier fetchDossierByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDossierByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the dossier matching the UUID and group.
	*
	* @param uuid the dossier's UUID
	* @param groupId the primary key of the group
	* @return the matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.Dossier fetchDossierByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDossierByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the dossier with the primary key.
	*
	* @param dossierId the primary key of the dossier
	* @return the dossier
	* @throws PortalException if a dossier with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.Dossier getDossier(
		long dossierId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossier(dossierId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the dossier with the matching UUID and company.
	*
	* @param uuid the dossier's UUID
	* @param companyId the primary key of the company
	* @return the matching dossier
	* @throws PortalException if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.Dossier getDossierByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the dossier matching the UUID and group.
	*
	* @param uuid the dossier's UUID
	* @param groupId the primary key of the group
	* @return the matching dossier
	* @throws PortalException if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.Dossier getDossierByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the dossiers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @return the range of dossiers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.Dossier> getDossiers(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossiers(start, end);
	}

	/**
	* Returns the number of dossiers.
	*
	* @return the number of dossiers
	* @throws SystemException if a system exception occurred
	*/
	public static int getDossiersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossiersCount();
	}

	/**
	* Updates the dossier in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossier the dossier
	* @return the dossier that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.Dossier updateDossier(
		org.oep.core.dossiermgt.model.Dossier dossier)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDossier(dossier);
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
	* Add dossier
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Create new
	*
	* @param
	* @return: new dossier
	*/
	public static org.oep.core.dossiermgt.model.Dossier addDossier(
		long organizationId, long dossierProcId, java.lang.String govAgencyId,
		java.lang.String govAgencyName, java.lang.String subjectId,
		java.lang.String subjectType, java.lang.String subjectName,
		java.lang.String address, java.lang.String cityNo,
		java.lang.String cityName, java.lang.String districtNo,
		java.lang.String districtName, java.lang.String wardNo,
		java.lang.String wardName, java.lang.String telNo,
		java.lang.String contactPersonName, java.lang.String contactPersonTel,
		java.lang.String note, java.lang.String resumeDescription,
		java.lang.String receptionNo, java.util.Date submitDate,
		java.util.Date receiveDate, java.util.Date renewDate,
		java.util.Date estimateDate, java.util.Date returnDate,
		java.util.Date closeDate, java.lang.String status,
		java.util.Date statusDate, java.lang.String statusDescription,
		java.lang.String feedbackNote, int dirty,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addDossier(organizationId, dossierProcId, govAgencyId,
			govAgencyName, subjectId, subjectType, subjectName, address,
			cityNo, cityName, districtNo, districtName, wardNo, wardName,
			telNo, contactPersonName, contactPersonTel, note,
			resumeDescription, receptionNo, submitDate, receiveDate, renewDate,
			estimateDate, returnDate, closeDate, status, statusDate,
			statusDescription, feedbackNote, dirty, serviceContext);
	}

	public static org.oep.core.dossiermgt.model.Dossier updateDossier(long id,
		long organizationId, long dossierProcId, java.lang.String govAgencyId,
		java.lang.String govAgencyName, java.lang.String subjectId,
		java.lang.String subjectType, java.lang.String subjectName,
		java.lang.String address, java.lang.String cityNo,
		java.lang.String cityName, java.lang.String districtNo,
		java.lang.String districtName, java.lang.String wardNo,
		java.lang.String wardName, java.lang.String telNo,
		java.lang.String contactPersonName, java.lang.String contactPersonTel,
		java.lang.String note, java.lang.String resumeDescription,
		java.lang.String receptionNo, java.util.Date submitDate,
		java.util.Date receiveDate, java.util.Date renewDate,
		java.util.Date estimateDate, java.util.Date returnDate,
		java.util.Date closeDate, java.lang.String status,
		java.util.Date statusDate, java.lang.String statusDescription,
		java.lang.String feedbackNote, int dirty,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateDossier(id, organizationId, dossierProcId,
			govAgencyId, govAgencyName, subjectId, subjectType, subjectName,
			address, cityNo, cityName, districtNo, districtName, wardNo,
			wardName, telNo, contactPersonName, contactPersonTel, note,
			resumeDescription, receptionNo, submitDate, receiveDate, renewDate,
			estimateDate, returnDate, closeDate, status, statusDate,
			statusDescription, feedbackNote, dirty, serviceContext);
	}

	public static void updateDossierResources(
		org.oep.core.dossiermgt.model.Dossier dossier,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.updateDossierResources(dossier, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void removeDossier(
		org.oep.core.dossiermgt.model.Dossier dossier)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeDossier(dossier);
	}

	public static void removeDossier(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeDossier(id);
	}

	public static void addDossierResources(
		org.oep.core.dossiermgt.model.Dossier dossier,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDossierResources(dossier, addGroupPermission,
			addGuestPermission, serviceContext);
	}

	public static void addDossierResources(
		org.oep.core.dossiermgt.model.Dossier dossier,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDossierResources(dossier, groupPermissions, guestPermissions,
			serviceContext);
	}

	public static void addDossierResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDossierResources(id, groupPermissions, guestPermissions,
			serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static DossierLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DossierLocalService.class.getName());

			if (invokableLocalService instanceof DossierLocalService) {
				_service = (DossierLocalService)invokableLocalService;
			}
			else {
				_service = new DossierLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(DossierLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DossierLocalService service) {
	}

	private static DossierLocalService _service;
}