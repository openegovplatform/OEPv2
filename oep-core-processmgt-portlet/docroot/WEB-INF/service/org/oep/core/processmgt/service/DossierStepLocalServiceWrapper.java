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

package org.oep.core.processmgt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DossierStepLocalService}.
 *
 * @author trungdk
 * @see DossierStepLocalService
 * @generated
 */
public class DossierStepLocalServiceWrapper implements DossierStepLocalService,
	ServiceWrapper<DossierStepLocalService> {
	public DossierStepLocalServiceWrapper(
		DossierStepLocalService dossierStepLocalService) {
		_dossierStepLocalService = dossierStepLocalService;
	}

	/**
	* Adds the dossier step to the database. Also notifies the appropriate model listeners.
	*
	* @param dossierStep the dossier step
	* @return the dossier step that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.DossierStep addDossierStep(
		org.oep.core.processmgt.model.DossierStep dossierStep)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierStepLocalService.addDossierStep(dossierStep);
	}

	/**
	* Creates a new dossier step with the primary key. Does not add the dossier step to the database.
	*
	* @param dossierStepId the primary key for the new dossier step
	* @return the new dossier step
	*/
	@Override
	public org.oep.core.processmgt.model.DossierStep createDossierStep(
		long dossierStepId) {
		return _dossierStepLocalService.createDossierStep(dossierStepId);
	}

	/**
	* Deletes the dossier step with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierStepId the primary key of the dossier step
	* @return the dossier step that was removed
	* @throws PortalException if a dossier step with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.DossierStep deleteDossierStep(
		long dossierStepId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierStepLocalService.deleteDossierStep(dossierStepId);
	}

	/**
	* Deletes the dossier step from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierStep the dossier step
	* @return the dossier step that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.DossierStep deleteDossierStep(
		org.oep.core.processmgt.model.DossierStep dossierStep)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierStepLocalService.deleteDossierStep(dossierStep);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dossierStepLocalService.dynamicQuery();
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
		return _dossierStepLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DossierStepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dossierStepLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DossierStepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dossierStepLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _dossierStepLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dossierStepLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.core.processmgt.model.DossierStep fetchDossierStep(
		long dossierStepId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierStepLocalService.fetchDossierStep(dossierStepId);
	}

	/**
	* Returns the dossier step with the primary key.
	*
	* @param dossierStepId the primary key of the dossier step
	* @return the dossier step
	* @throws PortalException if a dossier step with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.DossierStep getDossierStep(
		long dossierStepId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierStepLocalService.getDossierStep(dossierStepId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierStepLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dossier steps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DossierStepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier steps
	* @param end the upper bound of the range of dossier steps (not inclusive)
	* @return the range of dossier steps
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.processmgt.model.DossierStep> getDossierSteps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierStepLocalService.getDossierSteps(start, end);
	}

	/**
	* Returns the number of dossier steps.
	*
	* @return the number of dossier steps
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDossierStepsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierStepLocalService.getDossierStepsCount();
	}

	/**
	* Updates the dossier step in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossierStep the dossier step
	* @return the dossier step that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.DossierStep updateDossierStep(
		org.oep.core.processmgt.model.DossierStep dossierStep)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierStepLocalService.updateDossierStep(dossierStep);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dossierStepLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dossierStepLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dossierStepLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Add dossier step
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Create new
	*
	* @param
	* @return: new dossier process
	*/
	@Override
	public org.oep.core.processmgt.model.DossierStep addDossierStep(
		long dossierProcessId, java.lang.String title, int sequenceNo,
		int stepType, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierStepLocalService.addDossierStep(dossierProcessId, title,
			sequenceNo, stepType, serviceContext);
	}

	@Override
	public org.oep.core.processmgt.model.DossierStep updateDossierStep(
		long id, long dossierProcessId, java.lang.String title, int sequenceNo,
		int stepType, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierStepLocalService.updateDossierStep(id, dossierProcessId,
			title, sequenceNo, stepType, serviceContext);
	}

	@Override
	public void updateDossierStepResources(
		org.oep.core.processmgt.model.DossierStep dossierStep,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dossierStepLocalService.updateDossierStepResources(dossierStep,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void removeDossierStep(
		org.oep.core.processmgt.model.DossierStep dossierStep)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dossierStepLocalService.removeDossierStep(dossierStep);
	}

	@Override
	public void removeDossierStep(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dossierStepLocalService.removeDossierStep(id);
	}

	@Override
	public void addDossierStepResources(
		org.oep.core.processmgt.model.DossierStep dossierStep,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dossierStepLocalService.addDossierStepResources(dossierStep,
			addGroupPermission, addGuestPermission, serviceContext);
	}

	@Override
	public void addDossierStepResources(
		org.oep.core.processmgt.model.DossierStep dossierStep,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dossierStepLocalService.addDossierStepResources(dossierStep,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void addDossierStepResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dossierStepLocalService.addDossierStepResources(id, groupPermissions,
			guestPermissions, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DossierStepLocalService getWrappedDossierStepLocalService() {
		return _dossierStepLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDossierStepLocalService(
		DossierStepLocalService dossierStepLocalService) {
		_dossierStepLocalService = dossierStepLocalService;
	}

	@Override
	public DossierStepLocalService getWrappedService() {
		return _dossierStepLocalService;
	}

	@Override
	public void setWrappedService(
		DossierStepLocalService dossierStepLocalService) {
		_dossierStepLocalService = dossierStepLocalService;
	}

	private DossierStepLocalService _dossierStepLocalService;
}