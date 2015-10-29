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
 * Provides the local service utility for DossierProcAgent. This utility wraps
 * {@link org.oep.core.dossiermgt.service.impl.DossierProcAgentLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author trungdk
 * @see DossierProcAgentLocalService
 * @see org.oep.core.dossiermgt.service.base.DossierProcAgentLocalServiceBaseImpl
 * @see org.oep.core.dossiermgt.service.impl.DossierProcAgentLocalServiceImpl
 * @generated
 */
public class DossierProcAgentLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.core.dossiermgt.service.impl.DossierProcAgentLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dossier proc agent to the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProcAgent the dossier proc agent
	* @return the dossier proc agent that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProcAgent addDossierProcAgent(
		org.oep.core.dossiermgt.model.DossierProcAgent dossierProcAgent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDossierProcAgent(dossierProcAgent);
	}

	/**
	* Creates a new dossier proc agent with the primary key. Does not add the dossier proc agent to the database.
	*
	* @param dossierProcAgentId the primary key for the new dossier proc agent
	* @return the new dossier proc agent
	*/
	public static org.oep.core.dossiermgt.model.DossierProcAgent createDossierProcAgent(
		long dossierProcAgentId) {
		return getService().createDossierProcAgent(dossierProcAgentId);
	}

	/**
	* Deletes the dossier proc agent with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProcAgentId the primary key of the dossier proc agent
	* @return the dossier proc agent that was removed
	* @throws PortalException if a dossier proc agent with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProcAgent deleteDossierProcAgent(
		long dossierProcAgentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDossierProcAgent(dossierProcAgentId);
	}

	/**
	* Deletes the dossier proc agent from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProcAgent the dossier proc agent
	* @return the dossier proc agent that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProcAgent deleteDossierProcAgent(
		org.oep.core.dossiermgt.model.DossierProcAgent dossierProcAgent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDossierProcAgent(dossierProcAgent);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcAgentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcAgentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.oep.core.dossiermgt.model.DossierProcAgent fetchDossierProcAgent(
		long dossierProcAgentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDossierProcAgent(dossierProcAgentId);
	}

	/**
	* Returns the dossier proc agent with the primary key.
	*
	* @param dossierProcAgentId the primary key of the dossier proc agent
	* @return the dossier proc agent
	* @throws PortalException if a dossier proc agent with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProcAgent getDossierProcAgent(
		long dossierProcAgentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierProcAgent(dossierProcAgentId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dossier proc agents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcAgentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier proc agents
	* @param end the upper bound of the range of dossier proc agents (not inclusive)
	* @return the range of dossier proc agents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProcAgent> getDossierProcAgents(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierProcAgents(start, end);
	}

	/**
	* Returns the number of dossier proc agents.
	*
	* @return the number of dossier proc agents
	* @throws SystemException if a system exception occurred
	*/
	public static int getDossierProcAgentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierProcAgentsCount();
	}

	/**
	* Updates the dossier proc agent in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossierProcAgent the dossier proc agent
	* @return the dossier proc agent that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProcAgent updateDossierProcAgent(
		org.oep.core.dossiermgt.model.DossierProcAgent dossierProcAgent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDossierProcAgent(dossierProcAgent);
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
	* Add dossier proc agent
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Create new
	*
	* @param
	* @return: new dossier proc agent
	*/
	public static org.oep.core.dossiermgt.model.DossierProcAgent addDossierProcAgent(
		long dossierProcId, java.lang.String govAgencyId,
		java.lang.String govAgencyName, java.lang.String bankTransfer,
		java.lang.String keypay, long ebPartnerShipId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addDossierProcAgent(dossierProcId, govAgencyId,
			govAgencyName, bankTransfer, keypay, ebPartnerShipId, serviceContext);
	}

	public static org.oep.core.dossiermgt.model.DossierProcAgent updateDossierProcAgent(
		long id, long dossierProcId, java.lang.String govAgencyId,
		java.lang.String govAgencyName, java.lang.String bankTransfer,
		java.lang.String keypay, long ebPartnerShipId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateDossierProcAgent(id, dossierProcId, govAgencyId,
			govAgencyName, bankTransfer, keypay, ebPartnerShipId, serviceContext);
	}

	public static void updateDossierProcAgentResources(
		org.oep.core.dossiermgt.model.DossierProcAgent dossierProcAgent,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.updateDossierProcAgentResources(dossierProcAgent,
			groupPermissions, guestPermissions, serviceContext);
	}

	public static void removeDossierProcAgent(
		org.oep.core.dossiermgt.model.DossierProcAgent dossierProcAgent)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeDossierProcAgent(dossierProcAgent);
	}

	public static void removeDossierProcAgent(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeDossierProcAgent(id);
	}

	public static void addDossierProcAgentResources(
		org.oep.core.dossiermgt.model.DossierProcAgent dossierProcAgent,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDossierProcAgentResources(dossierProcAgent, addGroupPermission,
			addGuestPermission, serviceContext);
	}

	public static void addDossierProcAgentResources(
		org.oep.core.dossiermgt.model.DossierProcAgent dossierProcAgent,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDossierProcAgentResources(dossierProcAgent, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void addDossierProcAgentResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDossierProcAgentResources(id, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static DossierProcAgentLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DossierProcAgentLocalService.class.getName());

			if (invokableLocalService instanceof DossierProcAgentLocalService) {
				_service = (DossierProcAgentLocalService)invokableLocalService;
			}
			else {
				_service = new DossierProcAgentLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(DossierProcAgentLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DossierProcAgentLocalService service) {
	}

	private static DossierProcAgentLocalService _service;
}