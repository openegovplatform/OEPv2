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
 * Provides a wrapper for {@link DocTemplateLocalService}.
 *
 * @author trungdk
 * @see DocTemplateLocalService
 * @generated
 */
public class DocTemplateLocalServiceWrapper implements DocTemplateLocalService,
	ServiceWrapper<DocTemplateLocalService> {
	public DocTemplateLocalServiceWrapper(
		DocTemplateLocalService docTemplateLocalService) {
		_docTemplateLocalService = docTemplateLocalService;
	}

	/**
	* Adds the doc template to the database. Also notifies the appropriate model listeners.
	*
	* @param docTemplate the doc template
	* @return the doc template that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DocTemplate addDocTemplate(
		org.oep.core.dossiermgt.model.DocTemplate docTemplate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docTemplateLocalService.addDocTemplate(docTemplate);
	}

	/**
	* Creates a new doc template with the primary key. Does not add the doc template to the database.
	*
	* @param docTemplateId the primary key for the new doc template
	* @return the new doc template
	*/
	@Override
	public org.oep.core.dossiermgt.model.DocTemplate createDocTemplate(
		long docTemplateId) {
		return _docTemplateLocalService.createDocTemplate(docTemplateId);
	}

	/**
	* Deletes the doc template with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param docTemplateId the primary key of the doc template
	* @return the doc template that was removed
	* @throws PortalException if a doc template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DocTemplate deleteDocTemplate(
		long docTemplateId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _docTemplateLocalService.deleteDocTemplate(docTemplateId);
	}

	/**
	* Deletes the doc template from the database. Also notifies the appropriate model listeners.
	*
	* @param docTemplate the doc template
	* @return the doc template that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DocTemplate deleteDocTemplate(
		org.oep.core.dossiermgt.model.DocTemplate docTemplate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docTemplateLocalService.deleteDocTemplate(docTemplate);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _docTemplateLocalService.dynamicQuery();
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
		return _docTemplateLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DocTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _docTemplateLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DocTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _docTemplateLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _docTemplateLocalService.dynamicQueryCount(dynamicQuery);
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
		return _docTemplateLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.core.dossiermgt.model.DocTemplate fetchDocTemplate(
		long docTemplateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docTemplateLocalService.fetchDocTemplate(docTemplateId);
	}

	/**
	* Returns the doc template with the primary key.
	*
	* @param docTemplateId the primary key of the doc template
	* @return the doc template
	* @throws PortalException if a doc template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DocTemplate getDocTemplate(
		long docTemplateId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _docTemplateLocalService.getDocTemplate(docTemplateId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _docTemplateLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the doc templates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DocTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of doc templates
	* @param end the upper bound of the range of doc templates (not inclusive)
	* @return the range of doc templates
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.dossiermgt.model.DocTemplate> getDocTemplates(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docTemplateLocalService.getDocTemplates(start, end);
	}

	/**
	* Returns the number of doc templates.
	*
	* @return the number of doc templates
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDocTemplatesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docTemplateLocalService.getDocTemplatesCount();
	}

	/**
	* Updates the doc template in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param docTemplate the doc template
	* @return the doc template that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DocTemplate updateDocTemplate(
		org.oep.core.dossiermgt.model.DocTemplate docTemplate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docTemplateLocalService.updateDocTemplate(docTemplate);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _docTemplateLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_docTemplateLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _docTemplateLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Add doc template
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Create new
	*
	* @param
	* @return: new doc template
	*/
	@Override
	public org.oep.core.dossiermgt.model.DocTemplate addDocTemplate(
		java.lang.String templateNo, java.lang.String title,
		java.lang.String enTitle, long fileEntryId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _docTemplateLocalService.addDocTemplate(templateNo, title,
			enTitle, fileEntryId, serviceContext);
	}

	@Override
	public org.oep.core.dossiermgt.model.DocTemplate updateDocTemplate(
		long id, java.lang.String templateNo, java.lang.String title,
		java.lang.String enTitle, long fileEntryId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _docTemplateLocalService.updateDocTemplate(id, templateNo,
			title, enTitle, fileEntryId, serviceContext);
	}

	@Override
	public void updateDocTemplateResources(
		org.oep.core.dossiermgt.model.DocTemplate docTemplate,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_docTemplateLocalService.updateDocTemplateResources(docTemplate,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void removeDocTemplate(
		org.oep.core.dossiermgt.model.DocTemplate docTemplate)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_docTemplateLocalService.removeDocTemplate(docTemplate);
	}

	@Override
	public void removeDocTemplate(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_docTemplateLocalService.removeDocTemplate(id);
	}

	@Override
	public void addDocTemplateResources(
		org.oep.core.dossiermgt.model.DocTemplate docTemplate,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_docTemplateLocalService.addDocTemplateResources(docTemplate,
			addGroupPermission, addGuestPermission, serviceContext);
	}

	@Override
	public void addDocTemplateResources(
		org.oep.core.dossiermgt.model.DocTemplate docTemplate,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_docTemplateLocalService.addDocTemplateResources(docTemplate,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void addDocTemplateResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_docTemplateLocalService.addDocTemplateResources(id, groupPermissions,
			guestPermissions, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DocTemplateLocalService getWrappedDocTemplateLocalService() {
		return _docTemplateLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDocTemplateLocalService(
		DocTemplateLocalService docTemplateLocalService) {
		_docTemplateLocalService = docTemplateLocalService;
	}

	@Override
	public DocTemplateLocalService getWrappedService() {
		return _docTemplateLocalService;
	}

	@Override
	public void setWrappedService(
		DocTemplateLocalService docTemplateLocalService) {
		_docTemplateLocalService = docTemplateLocalService;
	}

	private DocTemplateLocalService _docTemplateLocalService;
}