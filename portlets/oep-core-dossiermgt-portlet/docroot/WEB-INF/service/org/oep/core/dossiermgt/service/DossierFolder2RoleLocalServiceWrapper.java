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
 * Provides a wrapper for {@link DossierFolder2RoleLocalService}.
 *
 * @author trungdk
 * @see DossierFolder2RoleLocalService
 * @generated
 */
public class DossierFolder2RoleLocalServiceWrapper
	implements DossierFolder2RoleLocalService,
		ServiceWrapper<DossierFolder2RoleLocalService> {
	public DossierFolder2RoleLocalServiceWrapper(
		DossierFolder2RoleLocalService dossierFolder2RoleLocalService) {
		_dossierFolder2RoleLocalService = dossierFolder2RoleLocalService;
	}

	/**
	* Adds the dossier folder2 role to the database. Also notifies the appropriate model listeners.
	*
	* @param dossierFolder2Role the dossier folder2 role
	* @return the dossier folder2 role that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierFolder2Role addDossierFolder2Role(
		org.oep.core.dossiermgt.model.DossierFolder2Role dossierFolder2Role)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierFolder2RoleLocalService.addDossierFolder2Role(dossierFolder2Role);
	}

	/**
	* Creates a new dossier folder2 role with the primary key. Does not add the dossier folder2 role to the database.
	*
	* @param dossierFolder2RolePK the primary key for the new dossier folder2 role
	* @return the new dossier folder2 role
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierFolder2Role createDossierFolder2Role(
		org.oep.core.dossiermgt.service.persistence.DossierFolder2RolePK dossierFolder2RolePK) {
		return _dossierFolder2RoleLocalService.createDossierFolder2Role(dossierFolder2RolePK);
	}

	/**
	* Deletes the dossier folder2 role with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierFolder2RolePK the primary key of the dossier folder2 role
	* @return the dossier folder2 role that was removed
	* @throws PortalException if a dossier folder2 role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierFolder2Role deleteDossierFolder2Role(
		org.oep.core.dossiermgt.service.persistence.DossierFolder2RolePK dossierFolder2RolePK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierFolder2RoleLocalService.deleteDossierFolder2Role(dossierFolder2RolePK);
	}

	/**
	* Deletes the dossier folder2 role from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierFolder2Role the dossier folder2 role
	* @return the dossier folder2 role that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierFolder2Role deleteDossierFolder2Role(
		org.oep.core.dossiermgt.model.DossierFolder2Role dossierFolder2Role)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierFolder2RoleLocalService.deleteDossierFolder2Role(dossierFolder2Role);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dossierFolder2RoleLocalService.dynamicQuery();
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
		return _dossierFolder2RoleLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierFolder2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dossierFolder2RoleLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierFolder2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dossierFolder2RoleLocalService.dynamicQuery(dynamicQuery,
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
		return _dossierFolder2RoleLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dossierFolder2RoleLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.core.dossiermgt.model.DossierFolder2Role fetchDossierFolder2Role(
		org.oep.core.dossiermgt.service.persistence.DossierFolder2RolePK dossierFolder2RolePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierFolder2RoleLocalService.fetchDossierFolder2Role(dossierFolder2RolePK);
	}

	/**
	* Returns the dossier folder2 role with the primary key.
	*
	* @param dossierFolder2RolePK the primary key of the dossier folder2 role
	* @return the dossier folder2 role
	* @throws PortalException if a dossier folder2 role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierFolder2Role getDossierFolder2Role(
		org.oep.core.dossiermgt.service.persistence.DossierFolder2RolePK dossierFolder2RolePK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierFolder2RoleLocalService.getDossierFolder2Role(dossierFolder2RolePK);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierFolder2RoleLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dossier folder2 roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierFolder2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier folder2 roles
	* @param end the upper bound of the range of dossier folder2 roles (not inclusive)
	* @return the range of dossier folder2 roles
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.dossiermgt.model.DossierFolder2Role> getDossierFolder2Roles(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierFolder2RoleLocalService.getDossierFolder2Roles(start, end);
	}

	/**
	* Returns the number of dossier folder2 roles.
	*
	* @return the number of dossier folder2 roles
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDossierFolder2RolesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierFolder2RoleLocalService.getDossierFolder2RolesCount();
	}

	/**
	* Updates the dossier folder2 role in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossierFolder2Role the dossier folder2 role
	* @return the dossier folder2 role that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierFolder2Role updateDossierFolder2Role(
		org.oep.core.dossiermgt.model.DossierFolder2Role dossierFolder2Role)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierFolder2RoleLocalService.updateDossierFolder2Role(dossierFolder2Role);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dossierFolder2RoleLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dossierFolder2RoleLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dossierFolder2RoleLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DossierFolder2RoleLocalService getWrappedDossierFolder2RoleLocalService() {
		return _dossierFolder2RoleLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDossierFolder2RoleLocalService(
		DossierFolder2RoleLocalService dossierFolder2RoleLocalService) {
		_dossierFolder2RoleLocalService = dossierFolder2RoleLocalService;
	}

	@Override
	public DossierFolder2RoleLocalService getWrappedService() {
		return _dossierFolder2RoleLocalService;
	}

	@Override
	public void setWrappedService(
		DossierFolder2RoleLocalService dossierFolder2RoleLocalService) {
		_dossierFolder2RoleLocalService = dossierFolder2RoleLocalService;
	}

	private DossierFolder2RoleLocalService _dossierFolder2RoleLocalService;
}