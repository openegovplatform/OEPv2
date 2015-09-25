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
 * Provides a wrapper for {@link DossierDoc2TemplateLocalService}.
 *
 * @author trungdk
 * @see DossierDoc2TemplateLocalService
 * @generated
 */
public class DossierDoc2TemplateLocalServiceWrapper
	implements DossierDoc2TemplateLocalService,
		ServiceWrapper<DossierDoc2TemplateLocalService> {
	public DossierDoc2TemplateLocalServiceWrapper(
		DossierDoc2TemplateLocalService dossierDoc2TemplateLocalService) {
		_dossierDoc2TemplateLocalService = dossierDoc2TemplateLocalService;
	}

	/**
	* Adds the dossier doc2 template to the database. Also notifies the appropriate model listeners.
	*
	* @param dossierDoc2Template the dossier doc2 template
	* @return the dossier doc2 template that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierDoc2Template addDossierDoc2Template(
		org.oep.core.dossiermgt.model.DossierDoc2Template dossierDoc2Template)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierDoc2TemplateLocalService.addDossierDoc2Template(dossierDoc2Template);
	}

	/**
	* Creates a new dossier doc2 template with the primary key. Does not add the dossier doc2 template to the database.
	*
	* @param id the primary key for the new dossier doc2 template
	* @return the new dossier doc2 template
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierDoc2Template createDossierDoc2Template(
		long id) {
		return _dossierDoc2TemplateLocalService.createDossierDoc2Template(id);
	}

	/**
	* Deletes the dossier doc2 template with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dossier doc2 template
	* @return the dossier doc2 template that was removed
	* @throws PortalException if a dossier doc2 template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierDoc2Template deleteDossierDoc2Template(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierDoc2TemplateLocalService.deleteDossierDoc2Template(id);
	}

	/**
	* Deletes the dossier doc2 template from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierDoc2Template the dossier doc2 template
	* @return the dossier doc2 template that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierDoc2Template deleteDossierDoc2Template(
		org.oep.core.dossiermgt.model.DossierDoc2Template dossierDoc2Template)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierDoc2TemplateLocalService.deleteDossierDoc2Template(dossierDoc2Template);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dossierDoc2TemplateLocalService.dynamicQuery();
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
		return _dossierDoc2TemplateLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierDoc2TemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dossierDoc2TemplateLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierDoc2TemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dossierDoc2TemplateLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return _dossierDoc2TemplateLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dossierDoc2TemplateLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.core.dossiermgt.model.DossierDoc2Template fetchDossierDoc2Template(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierDoc2TemplateLocalService.fetchDossierDoc2Template(id);
	}

	/**
	* Returns the dossier doc2 template with the primary key.
	*
	* @param id the primary key of the dossier doc2 template
	* @return the dossier doc2 template
	* @throws PortalException if a dossier doc2 template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierDoc2Template getDossierDoc2Template(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierDoc2TemplateLocalService.getDossierDoc2Template(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierDoc2TemplateLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dossier doc2 templates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierDoc2TemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier doc2 templates
	* @param end the upper bound of the range of dossier doc2 templates (not inclusive)
	* @return the range of dossier doc2 templates
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.dossiermgt.model.DossierDoc2Template> getDossierDoc2Templates(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierDoc2TemplateLocalService.getDossierDoc2Templates(start,
			end);
	}

	/**
	* Returns the number of dossier doc2 templates.
	*
	* @return the number of dossier doc2 templates
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDossierDoc2TemplatesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierDoc2TemplateLocalService.getDossierDoc2TemplatesCount();
	}

	/**
	* Updates the dossier doc2 template in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossierDoc2Template the dossier doc2 template
	* @return the dossier doc2 template that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierDoc2Template updateDossierDoc2Template(
		org.oep.core.dossiermgt.model.DossierDoc2Template dossierDoc2Template)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierDoc2TemplateLocalService.updateDossierDoc2Template(dossierDoc2Template);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dossierDoc2TemplateLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dossierDoc2TemplateLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dossierDoc2TemplateLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DossierDoc2TemplateLocalService getWrappedDossierDoc2TemplateLocalService() {
		return _dossierDoc2TemplateLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDossierDoc2TemplateLocalService(
		DossierDoc2TemplateLocalService dossierDoc2TemplateLocalService) {
		_dossierDoc2TemplateLocalService = dossierDoc2TemplateLocalService;
	}

	@Override
	public DossierDoc2TemplateLocalService getWrappedService() {
		return _dossierDoc2TemplateLocalService;
	}

	@Override
	public void setWrappedService(
		DossierDoc2TemplateLocalService dossierDoc2TemplateLocalService) {
		_dossierDoc2TemplateLocalService = dossierDoc2TemplateLocalService;
	}

	private DossierDoc2TemplateLocalService _dossierDoc2TemplateLocalService;
}