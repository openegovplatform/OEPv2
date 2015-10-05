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
 * Provides the local service utility for DossierProc. This utility wraps
 * {@link org.oep.core.dossiermgt.service.impl.DossierProcLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author trungdk
 * @see DossierProcLocalService
 * @see org.oep.core.dossiermgt.service.base.DossierProcLocalServiceBaseImpl
 * @see org.oep.core.dossiermgt.service.impl.DossierProcLocalServiceImpl
 * @generated
 */
public class DossierProcLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.core.dossiermgt.service.impl.DossierProcLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dossier proc to the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProc the dossier proc
	* @return the dossier proc that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc addDossierProc(
		org.oep.core.dossiermgt.model.DossierProc dossierProc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDossierProc(dossierProc);
	}

	/**
	* Creates a new dossier proc with the primary key. Does not add the dossier proc to the database.
	*
	* @param dossierProcId the primary key for the new dossier proc
	* @return the new dossier proc
	*/
	public static org.oep.core.dossiermgt.model.DossierProc createDossierProc(
		long dossierProcId) {
		return getService().createDossierProc(dossierProcId);
	}

	/**
	* Deletes the dossier proc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProcId the primary key of the dossier proc
	* @return the dossier proc that was removed
	* @throws PortalException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc deleteDossierProc(
		long dossierProcId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDossierProc(dossierProcId);
	}

	/**
	* Deletes the dossier proc from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProc the dossier proc
	* @return the dossier proc that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc deleteDossierProc(
		org.oep.core.dossiermgt.model.DossierProc dossierProc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDossierProc(dossierProc);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.oep.core.dossiermgt.model.DossierProc fetchDossierProc(
		long dossierProcId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDossierProc(dossierProcId);
	}

	/**
	* Returns the dossier proc with the primary key.
	*
	* @param dossierProcId the primary key of the dossier proc
	* @return the dossier proc
	* @throws PortalException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc getDossierProc(
		long dossierProcId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierProc(dossierProcId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dossier procs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @return the range of dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> getDossierProcs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierProcs(start, end);
	}

	/**
	* Returns the number of dossier procs.
	*
	* @return the number of dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static int getDossierProcsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierProcsCount();
	}

	/**
	* Updates the dossier proc in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossierProc the dossier proc
	* @return the dossier proc that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc updateDossierProc(
		org.oep.core.dossiermgt.model.DossierProc dossierProc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDossierProc(dossierProc);
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
	* Add dossier proc
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Create new
	*
	* @param
	* @return: new dossier proc
	*/
	public static org.oep.core.dossiermgt.model.DossierProc addDossierProc(
		java.lang.String dossierProcNo, java.lang.String name,
		java.lang.String enName, java.lang.String shortName,
		java.lang.String processDescription,
		java.lang.String methodDescription,
		java.lang.String dossierDescription,
		java.lang.String conditionDescription,
		java.lang.String durationDescription,
		java.lang.String actorsDescription,
		java.lang.String resultsDescription,
		java.lang.String recordsDescription, java.lang.String feeDescription,
		java.lang.String instructionsDescription,
		java.lang.String administrationNo, java.lang.String administrationName,
		java.lang.String domainNo, java.lang.String domainName,
		java.util.Date effectDate, java.util.Date expireDate, int active,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addDossierProc(dossierProcNo, name, enName, shortName,
			processDescription, methodDescription, dossierDescription,
			conditionDescription, durationDescription, actorsDescription,
			resultsDescription, recordsDescription, feeDescription,
			instructionsDescription, administrationNo, administrationName,
			domainNo, domainName, effectDate, expireDate, active, serviceContext);
	}

	public static org.oep.core.dossiermgt.model.DossierProc updateDossierProc(
		long id, java.lang.String dossierProcNo, java.lang.String name,
		java.lang.String enName, java.lang.String shortName,
		java.lang.String processDescription,
		java.lang.String methodDescription,
		java.lang.String dossierDescription,
		java.lang.String conditionDescription,
		java.lang.String durationDescription,
		java.lang.String actorsDescription,
		java.lang.String resultsDescription,
		java.lang.String recordsDescription, java.lang.String feeDescription,
		java.lang.String instructionsDescription,
		java.lang.String administrationNo, java.lang.String administrationName,
		java.lang.String domainNo, java.lang.String domainName,
		java.util.Date effectDate, java.util.Date expireDate, int active,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateDossierProc(id, dossierProcNo, name, enName,
			shortName, processDescription, methodDescription,
			dossierDescription, conditionDescription, durationDescription,
			actorsDescription, resultsDescription, recordsDescription,
			feeDescription, instructionsDescription, administrationNo,
			administrationName, domainNo, domainName, effectDate, expireDate,
			active, serviceContext);
	}

	public static void updateDossierProcResources(
		org.oep.core.dossiermgt.model.DossierProc dossierProc,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.updateDossierProcResources(dossierProc, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void removeDossierProc(
		org.oep.core.dossiermgt.model.DossierProc dossierProc)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeDossierProc(dossierProc);
	}

	public static void removeDossierProc(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeDossierProc(id);
	}

	public static void addDossierProcResources(
		org.oep.core.dossiermgt.model.DossierProc dossierProc,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDossierProcResources(dossierProc, addGroupPermission,
			addGuestPermission, serviceContext);
	}

	public static void addDossierProcResources(
		org.oep.core.dossiermgt.model.DossierProc dossierProc,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDossierProcResources(dossierProc, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void addDossierProcResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDossierProcResources(id, groupPermissions, guestPermissions,
			serviceContext);
	}

	public static org.oep.core.dossiermgt.model.DossierProc getByDossierProcNo(
		java.lang.String dossierProcNo,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByDossierProcNo(dossierProcNo, serviceContext);
	}

	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findAllByAdministrationNo(
		java.lang.String administrationNo,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findAllByAdministrationNo(administrationNo, serviceContext);
	}

	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findAllByDomainNo(
		java.lang.String domainNo,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findAllByDomainNo(domainNo, serviceContext);
	}

	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findAllByAdministrationAndDomain(
		java.lang.String administrationNo, java.lang.String domainNo,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findAllByAdministrationAndDomain(administrationNo,
			domainNo, serviceContext);
	}

	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByGroupAdministrationAndDomain(
		java.lang.String administrationNo, java.lang.String domainNo,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByGroupAdministrationAndDomain(administrationNo,
			domainNo, serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static DossierProcLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DossierProcLocalService.class.getName());

			if (invokableLocalService instanceof DossierProcLocalService) {
				_service = (DossierProcLocalService)invokableLocalService;
			}
			else {
				_service = new DossierProcLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(DossierProcLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DossierProcLocalService service) {
	}

	private static DossierProcLocalService _service;
}