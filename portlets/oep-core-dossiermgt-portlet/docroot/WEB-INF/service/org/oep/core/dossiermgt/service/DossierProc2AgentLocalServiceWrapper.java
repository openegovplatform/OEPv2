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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DossierProc2AgentLocalService}.
 *
 * @author trungdk
 * @see DossierProc2AgentLocalService
 * @generated
 */
public class DossierProc2AgentLocalServiceWrapper
	implements DossierProc2AgentLocalService,
		ServiceWrapper<DossierProc2AgentLocalService> {
	public DossierProc2AgentLocalServiceWrapper(
		DossierProc2AgentLocalService dossierProc2AgentLocalService) {
		_dossierProc2AgentLocalService = dossierProc2AgentLocalService;
	}

	/**
	* Adds the dossier proc2 agent to the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProc2Agent the dossier proc2 agent
	* @return the dossier proc2 agent that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierProc2Agent addDossierProc2Agent(
		org.oep.core.dossiermgt.model.DossierProc2Agent dossierProc2Agent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProc2AgentLocalService.addDossierProc2Agent(dossierProc2Agent);
	}

	/**
	* Creates a new dossier proc2 agent with the primary key. Does not add the dossier proc2 agent to the database.
	*
	* @param id the primary key for the new dossier proc2 agent
	* @return the new dossier proc2 agent
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierProc2Agent createDossierProc2Agent(
		long id) {
		return _dossierProc2AgentLocalService.createDossierProc2Agent(id);
	}

	/**
	* Deletes the dossier proc2 agent with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dossier proc2 agent
	* @return the dossier proc2 agent that was removed
	* @throws PortalException if a dossier proc2 agent with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierProc2Agent deleteDossierProc2Agent(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProc2AgentLocalService.deleteDossierProc2Agent(id);
	}

	/**
	* Deletes the dossier proc2 agent from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProc2Agent the dossier proc2 agent
	* @return the dossier proc2 agent that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierProc2Agent deleteDossierProc2Agent(
		org.oep.core.dossiermgt.model.DossierProc2Agent dossierProc2Agent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProc2AgentLocalService.deleteDossierProc2Agent(dossierProc2Agent);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dossierProc2AgentLocalService.dynamicQuery();
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
		return _dossierProc2AgentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProc2AgentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dossierProc2AgentLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProc2AgentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dossierProc2AgentLocalService.dynamicQuery(dynamicQuery, start,
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
		return _dossierProc2AgentLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dossierProc2AgentLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.core.dossiermgt.model.DossierProc2Agent fetchDossierProc2Agent(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProc2AgentLocalService.fetchDossierProc2Agent(id);
	}

	/**
	* Returns the dossier proc2 agent with the primary key.
	*
	* @param id the primary key of the dossier proc2 agent
	* @return the dossier proc2 agent
	* @throws PortalException if a dossier proc2 agent with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierProc2Agent getDossierProc2Agent(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProc2AgentLocalService.getDossierProc2Agent(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProc2AgentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dossier proc2 agents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProc2AgentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier proc2 agents
	* @param end the upper bound of the range of dossier proc2 agents (not inclusive)
	* @return the range of dossier proc2 agents
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc2Agent> getDossierProc2Agents(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProc2AgentLocalService.getDossierProc2Agents(start, end);
	}

	/**
	* Returns the number of dossier proc2 agents.
	*
	* @return the number of dossier proc2 agents
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDossierProc2AgentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProc2AgentLocalService.getDossierProc2AgentsCount();
	}

	/**
	* Updates the dossier proc2 agent in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossierProc2Agent the dossier proc2 agent
	* @return the dossier proc2 agent that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierProc2Agent updateDossierProc2Agent(
		org.oep.core.dossiermgt.model.DossierProc2Agent dossierProc2Agent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProc2AgentLocalService.updateDossierProc2Agent(dossierProc2Agent);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dossierProc2AgentLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dossierProc2AgentLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dossierProc2AgentLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DossierProc2AgentLocalService getWrappedDossierProc2AgentLocalService() {
		return _dossierProc2AgentLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDossierProc2AgentLocalService(
		DossierProc2AgentLocalService dossierProc2AgentLocalService) {
		_dossierProc2AgentLocalService = dossierProc2AgentLocalService;
	}

	@Override
	public DossierProc2AgentLocalService getWrappedService() {
		return _dossierProc2AgentLocalService;
	}

	@Override
	public void setWrappedService(
		DossierProc2AgentLocalService dossierProc2AgentLocalService) {
		_dossierProc2AgentLocalService = dossierProc2AgentLocalService;
	}

	private DossierProc2AgentLocalService _dossierProc2AgentLocalService;
}