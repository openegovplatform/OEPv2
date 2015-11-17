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

package org.oep.processmgt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DossierProc2RoleLocalService}.
 *
 * @author trungdk
 * @see DossierProc2RoleLocalService
 * @generated
 */
public class DossierProc2RoleLocalServiceWrapper
	implements DossierProc2RoleLocalService,
		ServiceWrapper<DossierProc2RoleLocalService> {
	public DossierProc2RoleLocalServiceWrapper(
		DossierProc2RoleLocalService dossierProc2RoleLocalService) {
		_dossierProc2RoleLocalService = dossierProc2RoleLocalService;
	}

	/**
	* Adds the dossier proc2 role to the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProc2Role the dossier proc2 role
	* @return the dossier proc2 role that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.processmgt.model.DossierProc2Role addDossierProc2Role(
		org.oep.processmgt.model.DossierProc2Role dossierProc2Role)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProc2RoleLocalService.addDossierProc2Role(dossierProc2Role);
	}

	/**
	* Creates a new dossier proc2 role with the primary key. Does not add the dossier proc2 role to the database.
	*
	* @param dossierProc2RoleId the primary key for the new dossier proc2 role
	* @return the new dossier proc2 role
	*/
	@Override
	public org.oep.processmgt.model.DossierProc2Role createDossierProc2Role(
		long dossierProc2RoleId) {
		return _dossierProc2RoleLocalService.createDossierProc2Role(dossierProc2RoleId);
	}

	/**
	* Deletes the dossier proc2 role with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProc2RoleId the primary key of the dossier proc2 role
	* @return the dossier proc2 role that was removed
	* @throws PortalException if a dossier proc2 role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.processmgt.model.DossierProc2Role deleteDossierProc2Role(
		long dossierProc2RoleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProc2RoleLocalService.deleteDossierProc2Role(dossierProc2RoleId);
	}

	/**
	* Deletes the dossier proc2 role from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProc2Role the dossier proc2 role
	* @return the dossier proc2 role that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.processmgt.model.DossierProc2Role deleteDossierProc2Role(
		org.oep.processmgt.model.DossierProc2Role dossierProc2Role)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProc2RoleLocalService.deleteDossierProc2Role(dossierProc2Role);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dossierProc2RoleLocalService.dynamicQuery();
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
		return _dossierProc2RoleLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.DossierProc2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dossierProc2RoleLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.DossierProc2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dossierProc2RoleLocalService.dynamicQuery(dynamicQuery, start,
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
		return _dossierProc2RoleLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dossierProc2RoleLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.processmgt.model.DossierProc2Role fetchDossierProc2Role(
		long dossierProc2RoleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProc2RoleLocalService.fetchDossierProc2Role(dossierProc2RoleId);
	}

	/**
	* Returns the dossier proc2 role with the primary key.
	*
	* @param dossierProc2RoleId the primary key of the dossier proc2 role
	* @return the dossier proc2 role
	* @throws PortalException if a dossier proc2 role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.processmgt.model.DossierProc2Role getDossierProc2Role(
		long dossierProc2RoleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProc2RoleLocalService.getDossierProc2Role(dossierProc2RoleId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProc2RoleLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dossier proc2 roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.DossierProc2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier proc2 roles
	* @param end the upper bound of the range of dossier proc2 roles (not inclusive)
	* @return the range of dossier proc2 roles
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.processmgt.model.DossierProc2Role> getDossierProc2Roles(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProc2RoleLocalService.getDossierProc2Roles(start, end);
	}

	/**
	* Returns the number of dossier proc2 roles.
	*
	* @return the number of dossier proc2 roles
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDossierProc2RolesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProc2RoleLocalService.getDossierProc2RolesCount();
	}

	/**
	* Updates the dossier proc2 role in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossierProc2Role the dossier proc2 role
	* @return the dossier proc2 role that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.processmgt.model.DossierProc2Role updateDossierProc2Role(
		org.oep.processmgt.model.DossierProc2Role dossierProc2Role)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProc2RoleLocalService.updateDossierProc2Role(dossierProc2Role);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dossierProc2RoleLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dossierProc2RoleLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dossierProc2RoleLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* ThÃƒÂªm quan hÃ¡Â»â€¡ giÃ¡Â»Â¯a xÃ¡Â»Â­ lÃƒÂ½ thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh tÃ¡ÂºÂ¡i mÃ¡Â»â„¢t cÃ¡Â»Â­a vÃ¡Â»â€ºi vai trÃƒÂ²
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param dossierProcId mÃƒÂ£ thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh
	* @param roleId mÃƒÂ£ vai trÃƒÂ²
	* @return: quan hÃ¡Â»â€¡ giÃ¡Â»Â¯a quan hÃ¡Â»â€¡ thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh vÃ¡Â»â€ºi vai trÃƒÂ²
	*/
	@Override
	public org.oep.processmgt.model.DossierProc2Role addDossierProc2Role(
		long dossierProcId, long roleId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProc2RoleLocalService.addDossierProc2Role(dossierProcId,
			roleId, serviceContext);
	}

	@Override
	public void removeDossierProc2Role(
		org.oep.processmgt.model.DossierProc2Role dossierProc2Role)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dossierProc2RoleLocalService.removeDossierProc2Role(dossierProc2Role);
	}

	@Override
	public void removeDossierProc2Role(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dossierProc2RoleLocalService.removeDossierProc2Role(id);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DossierProc2RoleLocalService getWrappedDossierProc2RoleLocalService() {
		return _dossierProc2RoleLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDossierProc2RoleLocalService(
		DossierProc2RoleLocalService dossierProc2RoleLocalService) {
		_dossierProc2RoleLocalService = dossierProc2RoleLocalService;
	}

	@Override
	public DossierProc2RoleLocalService getWrappedService() {
		return _dossierProc2RoleLocalService;
	}

	@Override
	public void setWrappedService(
		DossierProc2RoleLocalService dossierProc2RoleLocalService) {
		_dossierProc2RoleLocalService = dossierProc2RoleLocalService;
	}

	private DossierProc2RoleLocalService _dossierProc2RoleLocalService;
}