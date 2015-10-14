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
 * Provides a wrapper for {@link DossierDocLocalService}.
 *
 * @author trungdk
 * @see DossierDocLocalService
 * @generated
 */
public class DossierDocLocalServiceWrapper implements DossierDocLocalService,
	ServiceWrapper<DossierDocLocalService> {
	public DossierDocLocalServiceWrapper(
		DossierDocLocalService dossierDocLocalService) {
		_dossierDocLocalService = dossierDocLocalService;
	}

	/**
	* Adds the dossier doc to the database. Also notifies the appropriate model listeners.
	*
	* @param dossierDoc the dossier doc
	* @return the dossier doc that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierDoc addDossierDoc(
		org.oep.core.dossiermgt.model.DossierDoc dossierDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierDocLocalService.addDossierDoc(dossierDoc);
	}

	/**
	* Creates a new dossier doc with the primary key. Does not add the dossier doc to the database.
	*
	* @param dossierDocId the primary key for the new dossier doc
	* @return the new dossier doc
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierDoc createDossierDoc(
		long dossierDocId) {
		return _dossierDocLocalService.createDossierDoc(dossierDocId);
	}

	/**
	* Deletes the dossier doc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierDocId the primary key of the dossier doc
	* @return the dossier doc that was removed
	* @throws PortalException if a dossier doc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierDoc deleteDossierDoc(
		long dossierDocId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierDocLocalService.deleteDossierDoc(dossierDocId);
	}

	/**
	* Deletes the dossier doc from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierDoc the dossier doc
	* @return the dossier doc that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierDoc deleteDossierDoc(
		org.oep.core.dossiermgt.model.DossierDoc dossierDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierDocLocalService.deleteDossierDoc(dossierDoc);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dossierDocLocalService.dynamicQuery();
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
		return _dossierDocLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierDocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dossierDocLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierDocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dossierDocLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _dossierDocLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dossierDocLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.core.dossiermgt.model.DossierDoc fetchDossierDoc(
		long dossierDocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierDocLocalService.fetchDossierDoc(dossierDocId);
	}

	/**
	* Returns the dossier doc with the primary key.
	*
	* @param dossierDocId the primary key of the dossier doc
	* @return the dossier doc
	* @throws PortalException if a dossier doc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierDoc getDossierDoc(
		long dossierDocId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierDocLocalService.getDossierDoc(dossierDocId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierDocLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dossier docs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierDocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier docs
	* @param end the upper bound of the range of dossier docs (not inclusive)
	* @return the range of dossier docs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.dossiermgt.model.DossierDoc> getDossierDocs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierDocLocalService.getDossierDocs(start, end);
	}

	/**
	* Returns the number of dossier docs.
	*
	* @return the number of dossier docs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDossierDocsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierDocLocalService.getDossierDocsCount();
	}

	/**
	* Updates the dossier doc in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossierDoc the dossier doc
	* @return the dossier doc that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierDoc updateDossierDoc(
		org.oep.core.dossiermgt.model.DossierDoc dossierDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierDocLocalService.updateDossierDoc(dossierDoc);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addDocTemplateDossierDoc(long docTemplateId, long dossierDocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dossierDocLocalService.addDocTemplateDossierDoc(docTemplateId,
			dossierDocId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addDocTemplateDossierDoc(long docTemplateId,
		org.oep.core.dossiermgt.model.DossierDoc dossierDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dossierDocLocalService.addDocTemplateDossierDoc(docTemplateId,
			dossierDoc);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addDocTemplateDossierDocs(long docTemplateId,
		long[] dossierDocIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dossierDocLocalService.addDocTemplateDossierDocs(docTemplateId,
			dossierDocIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addDocTemplateDossierDocs(long docTemplateId,
		java.util.List<org.oep.core.dossiermgt.model.DossierDoc> DossierDocs)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dossierDocLocalService.addDocTemplateDossierDocs(docTemplateId,
			DossierDocs);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearDocTemplateDossierDocs(long docTemplateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dossierDocLocalService.clearDocTemplateDossierDocs(docTemplateId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteDocTemplateDossierDoc(long docTemplateId,
		long dossierDocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dossierDocLocalService.deleteDocTemplateDossierDoc(docTemplateId,
			dossierDocId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteDocTemplateDossierDoc(long docTemplateId,
		org.oep.core.dossiermgt.model.DossierDoc dossierDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dossierDocLocalService.deleteDocTemplateDossierDoc(docTemplateId,
			dossierDoc);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteDocTemplateDossierDocs(long docTemplateId,
		long[] dossierDocIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dossierDocLocalService.deleteDocTemplateDossierDocs(docTemplateId,
			dossierDocIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteDocTemplateDossierDocs(long docTemplateId,
		java.util.List<org.oep.core.dossiermgt.model.DossierDoc> DossierDocs)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dossierDocLocalService.deleteDocTemplateDossierDocs(docTemplateId,
			DossierDocs);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.dossiermgt.model.DossierDoc> getDocTemplateDossierDocs(
		long docTemplateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierDocLocalService.getDocTemplateDossierDocs(docTemplateId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.dossiermgt.model.DossierDoc> getDocTemplateDossierDocs(
		long docTemplateId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierDocLocalService.getDocTemplateDossierDocs(docTemplateId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.dossiermgt.model.DossierDoc> getDocTemplateDossierDocs(
		long docTemplateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierDocLocalService.getDocTemplateDossierDocs(docTemplateId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDocTemplateDossierDocsCount(long docTemplateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierDocLocalService.getDocTemplateDossierDocsCount(docTemplateId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasDocTemplateDossierDoc(long docTemplateId,
		long dossierDocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierDocLocalService.hasDocTemplateDossierDoc(docTemplateId,
			dossierDocId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasDocTemplateDossierDocs(long docTemplateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierDocLocalService.hasDocTemplateDossierDocs(docTemplateId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setDocTemplateDossierDocs(long docTemplateId,
		long[] dossierDocIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dossierDocLocalService.setDocTemplateDossierDocs(docTemplateId,
			dossierDocIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dossierDocLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dossierDocLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dossierDocLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Add dossier doc
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Create new
	*
	* @param
	* @return: new dossier doc
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierDoc addDossierDoc(
		long dossierProcId, java.lang.String dossierDocNo,
		java.lang.String dossierDocName, java.lang.String note, int sequenceNo,
		long defaultDocTemplateId, int validationType, int numberOfFile,
		java.lang.String onlineForm,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierDocLocalService.addDossierDoc(dossierProcId,
			dossierDocNo, dossierDocName, note, sequenceNo,
			defaultDocTemplateId, validationType, numberOfFile, onlineForm,
			serviceContext);
	}

	@Override
	public org.oep.core.dossiermgt.model.DossierDoc updateDossierDoc(long id,
		long dossierProcId, java.lang.String dossierDocNo,
		java.lang.String dossierDocName, java.lang.String note, int sequenceNo,
		long defaultDocTemplateId, int validationType, int numberOfFile,
		java.lang.String onlineForm,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierDocLocalService.updateDossierDoc(id, dossierProcId,
			dossierDocNo, dossierDocName, note, sequenceNo,
			defaultDocTemplateId, validationType, numberOfFile, onlineForm,
			serviceContext);
	}

	@Override
	public void updateDossierDocResources(
		org.oep.core.dossiermgt.model.DossierDoc dossierDoc,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dossierDocLocalService.updateDossierDocResources(dossierDoc,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void removeDossierDoc(
		org.oep.core.dossiermgt.model.DossierDoc dossierDoc)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dossierDocLocalService.removeDossierDoc(dossierDoc);
	}

	@Override
	public void removeDossierDoc(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dossierDocLocalService.removeDossierDoc(id);
	}

	@Override
	public void addDossierDocResources(
		org.oep.core.dossiermgt.model.DossierDoc dossierDoc,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dossierDocLocalService.addDossierDocResources(dossierDoc,
			addGroupPermission, addGuestPermission, serviceContext);
	}

	@Override
	public void addDossierDocResources(
		org.oep.core.dossiermgt.model.DossierDoc dossierDoc,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dossierDocLocalService.addDossierDocResources(dossierDoc,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void addDossierDocResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dossierDocLocalService.addDossierDocResources(id, groupPermissions,
			guestPermissions, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DossierDocLocalService getWrappedDossierDocLocalService() {
		return _dossierDocLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDossierDocLocalService(
		DossierDocLocalService dossierDocLocalService) {
		_dossierDocLocalService = dossierDocLocalService;
	}

	@Override
	public DossierDocLocalService getWrappedService() {
		return _dossierDocLocalService;
	}

	@Override
	public void setWrappedService(DossierDocLocalService dossierDocLocalService) {
		_dossierDocLocalService = dossierDocLocalService;
	}

	private DossierDocLocalService _dossierDocLocalService;
}