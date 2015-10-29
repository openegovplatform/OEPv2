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
 * Provides a wrapper for {@link DossierProcessLocalService}.
 *
 * @author trungdk
 * @see DossierProcessLocalService
 * @generated
 */
public class DossierProcessLocalServiceWrapper
	implements DossierProcessLocalService,
		ServiceWrapper<DossierProcessLocalService> {
	public DossierProcessLocalServiceWrapper(
		DossierProcessLocalService dossierProcessLocalService) {
		_dossierProcessLocalService = dossierProcessLocalService;
	}

	/**
	* Adds the dossier process to the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProcess the dossier process
	* @return the dossier process that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.DossierProcess addDossierProcess(
		org.oep.core.processmgt.model.DossierProcess dossierProcess)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcessLocalService.addDossierProcess(dossierProcess);
	}

	/**
	* Creates a new dossier process with the primary key. Does not add the dossier process to the database.
	*
	* @param dossierProcessId the primary key for the new dossier process
	* @return the new dossier process
	*/
	@Override
	public org.oep.core.processmgt.model.DossierProcess createDossierProcess(
		long dossierProcessId) {
		return _dossierProcessLocalService.createDossierProcess(dossierProcessId);
	}

	/**
	* Deletes the dossier process with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProcessId the primary key of the dossier process
	* @return the dossier process that was removed
	* @throws PortalException if a dossier process with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.DossierProcess deleteDossierProcess(
		long dossierProcessId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcessLocalService.deleteDossierProcess(dossierProcessId);
	}

	/**
	* Deletes the dossier process from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProcess the dossier process
	* @return the dossier process that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.DossierProcess deleteDossierProcess(
		org.oep.core.processmgt.model.DossierProcess dossierProcess)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcessLocalService.deleteDossierProcess(dossierProcess);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dossierProcessLocalService.dynamicQuery();
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
		return _dossierProcessLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DossierProcessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dossierProcessLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DossierProcessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dossierProcessLocalService.dynamicQuery(dynamicQuery, start,
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
		return _dossierProcessLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dossierProcessLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.core.processmgt.model.DossierProcess fetchDossierProcess(
		long dossierProcessId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcessLocalService.fetchDossierProcess(dossierProcessId);
	}

	/**
	* Returns the dossier process with the primary key.
	*
	* @param dossierProcessId the primary key of the dossier process
	* @return the dossier process
	* @throws PortalException if a dossier process with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.DossierProcess getDossierProcess(
		long dossierProcessId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcessLocalService.getDossierProcess(dossierProcessId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcessLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dossier processes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DossierProcessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier processes
	* @param end the upper bound of the range of dossier processes (not inclusive)
	* @return the range of dossier processes
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.processmgt.model.DossierProcess> getDossierProcesses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcessLocalService.getDossierProcesses(start, end);
	}

	/**
	* Returns the number of dossier processes.
	*
	* @return the number of dossier processes
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDossierProcessesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcessLocalService.getDossierProcessesCount();
	}

	/**
	* Updates the dossier process in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossierProcess the dossier process
	* @return the dossier process that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.DossierProcess updateDossierProcess(
		org.oep.core.processmgt.model.DossierProcess dossierProcess)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcessLocalService.updateDossierProcess(dossierProcess);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dossierProcessLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dossierProcessLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dossierProcessLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Add dossier process
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
	public org.oep.core.processmgt.model.DossierProcess addDossierProcess(
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcessLocalService.addDossierProcess(serviceContext);
	}

	@Override
	public org.oep.core.processmgt.model.DossierProcess updateDossierProcess(
		long id, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcessLocalService.updateDossierProcess(id,
			serviceContext);
	}

	@Override
	public void updateDossierProcessResources(
		org.oep.core.processmgt.model.DossierProcess dossierProcess,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dossierProcessLocalService.updateDossierProcessResources(dossierProcess,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void removeDossierProcess(
		org.oep.core.processmgt.model.DossierProcess dossierProcess)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dossierProcessLocalService.removeDossierProcess(dossierProcess);
	}

	@Override
	public void removeDossierProcess(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dossierProcessLocalService.removeDossierProcess(id);
	}

	@Override
	public void addDossierProcessResources(
		org.oep.core.processmgt.model.DossierProcess dossierProcess,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dossierProcessLocalService.addDossierProcessResources(dossierProcess,
			addGroupPermission, addGuestPermission, serviceContext);
	}

	@Override
	public void addDossierProcessResources(
		org.oep.core.processmgt.model.DossierProcess dossierProcess,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dossierProcessLocalService.addDossierProcessResources(dossierProcess,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void addDossierProcessResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dossierProcessLocalService.addDossierProcessResources(id,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public java.util.List<org.oep.core.processmgt.model.DossierProcess> getByCompany(
		long companyId, int startIndex, int endIndex)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcessLocalService.getByCompany(companyId, startIndex,
			endIndex);
	}

	@Override
	public java.util.List<org.oep.core.processmgt.model.DossierProcess> getByCompany(
		int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcessLocalService.getByCompany(startIndex, endIndex,
			serviceContext);
	}

	@Override
	public int countByCompany(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcessLocalService.countByCompany(companyId);
	}

	@Override
	public int countByCompany(
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcessLocalService.countByCompany(serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DossierProcessLocalService getWrappedDossierProcessLocalService() {
		return _dossierProcessLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDossierProcessLocalService(
		DossierProcessLocalService dossierProcessLocalService) {
		_dossierProcessLocalService = dossierProcessLocalService;
	}

	@Override
	public DossierProcessLocalService getWrappedService() {
		return _dossierProcessLocalService;
	}

	@Override
	public void setWrappedService(
		DossierProcessLocalService dossierProcessLocalService) {
		_dossierProcessLocalService = dossierProcessLocalService;
	}

	private DossierProcessLocalService _dossierProcessLocalService;
}