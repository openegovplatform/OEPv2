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

package org.oep.dossiermgt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DossierProcAgentLocalService}.
 *
 * @author trungdk
 * @see DossierProcAgentLocalService
 * @generated
 */
public class DossierProcAgentLocalServiceWrapper
	implements DossierProcAgentLocalService,
		ServiceWrapper<DossierProcAgentLocalService> {
	public DossierProcAgentLocalServiceWrapper(
		DossierProcAgentLocalService dossierProcAgentLocalService) {
		_dossierProcAgentLocalService = dossierProcAgentLocalService;
	}

	/**
	* Adds the dossier proc agent to the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProcAgent the dossier proc agent
	* @return the dossier proc agent that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.dossiermgt.model.DossierProcAgent addDossierProcAgent(
		org.oep.dossiermgt.model.DossierProcAgent dossierProcAgent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcAgentLocalService.addDossierProcAgent(dossierProcAgent);
	}

	/**
	* Creates a new dossier proc agent with the primary key. Does not add the dossier proc agent to the database.
	*
	* @param dossierProcAgentId the primary key for the new dossier proc agent
	* @return the new dossier proc agent
	*/
	@Override
	public org.oep.dossiermgt.model.DossierProcAgent createDossierProcAgent(
		long dossierProcAgentId) {
		return _dossierProcAgentLocalService.createDossierProcAgent(dossierProcAgentId);
	}

	/**
	* Deletes the dossier proc agent with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProcAgentId the primary key of the dossier proc agent
	* @return the dossier proc agent that was removed
	* @throws PortalException if a dossier proc agent with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.dossiermgt.model.DossierProcAgent deleteDossierProcAgent(
		long dossierProcAgentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcAgentLocalService.deleteDossierProcAgent(dossierProcAgentId);
	}

	/**
	* Deletes the dossier proc agent from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProcAgent the dossier proc agent
	* @return the dossier proc agent that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.dossiermgt.model.DossierProcAgent deleteDossierProcAgent(
		org.oep.dossiermgt.model.DossierProcAgent dossierProcAgent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcAgentLocalService.deleteDossierProcAgent(dossierProcAgent);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dossierProcAgentLocalService.dynamicQuery();
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
		return _dossierProcAgentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.DossierProcAgentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dossierProcAgentLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.DossierProcAgentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dossierProcAgentLocalService.dynamicQuery(dynamicQuery, start,
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
		return _dossierProcAgentLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dossierProcAgentLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.dossiermgt.model.DossierProcAgent fetchDossierProcAgent(
		long dossierProcAgentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcAgentLocalService.fetchDossierProcAgent(dossierProcAgentId);
	}

	/**
	* Returns the dossier proc agent with the primary key.
	*
	* @param dossierProcAgentId the primary key of the dossier proc agent
	* @return the dossier proc agent
	* @throws PortalException if a dossier proc agent with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.dossiermgt.model.DossierProcAgent getDossierProcAgent(
		long dossierProcAgentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcAgentLocalService.getDossierProcAgent(dossierProcAgentId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcAgentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dossier proc agents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.DossierProcAgentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier proc agents
	* @param end the upper bound of the range of dossier proc agents (not inclusive)
	* @return the range of dossier proc agents
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.dossiermgt.model.DossierProcAgent> getDossierProcAgents(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcAgentLocalService.getDossierProcAgents(start, end);
	}

	/**
	* Returns the number of dossier proc agents.
	*
	* @return the number of dossier proc agents
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDossierProcAgentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcAgentLocalService.getDossierProcAgentsCount();
	}

	/**
	* Updates the dossier proc agent in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossierProcAgent the dossier proc agent
	* @return the dossier proc agent that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.dossiermgt.model.DossierProcAgent updateDossierProcAgent(
		org.oep.dossiermgt.model.DossierProcAgent dossierProcAgent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcAgentLocalService.updateDossierProcAgent(dossierProcAgent);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dossierProcAgentLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dossierProcAgentLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dossierProcAgentLocalService.invokeMethod(name, parameterTypes,
			arguments);
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
	@Override
	public org.oep.dossiermgt.model.DossierProcAgent addDossierProcAgent(
		long dossierProcId, java.lang.String govAgencyId,
		java.lang.String govAgencyName, java.lang.String bankTransfer,
		java.lang.String keypay, long ebPartnerShipId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcAgentLocalService.addDossierProcAgent(dossierProcId,
			govAgencyId, govAgencyName, bankTransfer, keypay, ebPartnerShipId,
			serviceContext);
	}

	@Override
	public org.oep.dossiermgt.model.DossierProcAgent updateDossierProcAgent(
		long id, long dossierProcId, java.lang.String govAgencyId,
		java.lang.String govAgencyName, java.lang.String bankTransfer,
		java.lang.String keypay, long ebPartnerShipId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcAgentLocalService.updateDossierProcAgent(id,
			dossierProcId, govAgencyId, govAgencyName, bankTransfer, keypay,
			ebPartnerShipId, serviceContext);
	}

	@Override
	public void updateDossierProcAgentResources(
		org.oep.dossiermgt.model.DossierProcAgent dossierProcAgent,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dossierProcAgentLocalService.updateDossierProcAgentResources(dossierProcAgent,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void removeDossierProcAgent(
		org.oep.dossiermgt.model.DossierProcAgent dossierProcAgent)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dossierProcAgentLocalService.removeDossierProcAgent(dossierProcAgent);
	}

	@Override
	public void removeDossierProcAgent(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dossierProcAgentLocalService.removeDossierProcAgent(id);
	}

	@Override
	public void addDossierProcAgentResources(
		org.oep.dossiermgt.model.DossierProcAgent dossierProcAgent,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dossierProcAgentLocalService.addDossierProcAgentResources(dossierProcAgent,
			addGroupPermission, addGuestPermission, serviceContext);
	}

	@Override
	public void addDossierProcAgentResources(
		org.oep.dossiermgt.model.DossierProcAgent dossierProcAgent,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dossierProcAgentLocalService.addDossierProcAgentResources(dossierProcAgent,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void addDossierProcAgentResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dossierProcAgentLocalService.addDossierProcAgentResources(id,
			groupPermissions, guestPermissions, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DossierProcAgentLocalService getWrappedDossierProcAgentLocalService() {
		return _dossierProcAgentLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDossierProcAgentLocalService(
		DossierProcAgentLocalService dossierProcAgentLocalService) {
		_dossierProcAgentLocalService = dossierProcAgentLocalService;
	}

	@Override
	public DossierProcAgentLocalService getWrappedService() {
		return _dossierProcAgentLocalService;
	}

	@Override
	public void setWrappedService(
		DossierProcAgentLocalService dossierProcAgentLocalService) {
		_dossierProcAgentLocalService = dossierProcAgentLocalService;
	}

	private DossierProcAgentLocalService _dossierProcAgentLocalService;
}