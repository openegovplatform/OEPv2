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
 * Provides a wrapper for {@link DossierProcAgencyLocalService}.
 *
 * @author trungdk
 * @see DossierProcAgencyLocalService
 * @generated
 */
public class DossierProcAgencyLocalServiceWrapper
	implements DossierProcAgencyLocalService,
		ServiceWrapper<DossierProcAgencyLocalService> {
	public DossierProcAgencyLocalServiceWrapper(
		DossierProcAgencyLocalService dossierProcAgencyLocalService) {
		_dossierProcAgencyLocalService = dossierProcAgencyLocalService;
	}

	/**
	* Adds the dossier proc agency to the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProcAgency the dossier proc agency
	* @return the dossier proc agency that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierProcAgency addDossierProcAgency(
		org.oep.core.dossiermgt.model.DossierProcAgency dossierProcAgency)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcAgencyLocalService.addDossierProcAgency(dossierProcAgency);
	}

	/**
	* Creates a new dossier proc agency with the primary key. Does not add the dossier proc agency to the database.
	*
	* @param dossierProcAgencyId the primary key for the new dossier proc agency
	* @return the new dossier proc agency
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierProcAgency createDossierProcAgency(
		long dossierProcAgencyId) {
		return _dossierProcAgencyLocalService.createDossierProcAgency(dossierProcAgencyId);
	}

	/**
	* Deletes the dossier proc agency with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProcAgencyId the primary key of the dossier proc agency
	* @return the dossier proc agency that was removed
	* @throws PortalException if a dossier proc agency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierProcAgency deleteDossierProcAgency(
		long dossierProcAgencyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcAgencyLocalService.deleteDossierProcAgency(dossierProcAgencyId);
	}

	/**
	* Deletes the dossier proc agency from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProcAgency the dossier proc agency
	* @return the dossier proc agency that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierProcAgency deleteDossierProcAgency(
		org.oep.core.dossiermgt.model.DossierProcAgency dossierProcAgency)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcAgencyLocalService.deleteDossierProcAgency(dossierProcAgency);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dossierProcAgencyLocalService.dynamicQuery();
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
		return _dossierProcAgencyLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcAgencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dossierProcAgencyLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcAgencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dossierProcAgencyLocalService.dynamicQuery(dynamicQuery, start,
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
		return _dossierProcAgencyLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dossierProcAgencyLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.core.dossiermgt.model.DossierProcAgency fetchDossierProcAgency(
		long dossierProcAgencyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcAgencyLocalService.fetchDossierProcAgency(dossierProcAgencyId);
	}

	/**
	* Returns the dossier proc agency with the primary key.
	*
	* @param dossierProcAgencyId the primary key of the dossier proc agency
	* @return the dossier proc agency
	* @throws PortalException if a dossier proc agency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierProcAgency getDossierProcAgency(
		long dossierProcAgencyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcAgencyLocalService.getDossierProcAgency(dossierProcAgencyId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcAgencyLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dossier proc agencies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcAgencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier proc agencies
	* @param end the upper bound of the range of dossier proc agencies (not inclusive)
	* @return the range of dossier proc agencies
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.dossiermgt.model.DossierProcAgency> getDossierProcAgencies(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcAgencyLocalService.getDossierProcAgencies(start, end);
	}

	/**
	* Returns the number of dossier proc agencies.
	*
	* @return the number of dossier proc agencies
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDossierProcAgenciesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcAgencyLocalService.getDossierProcAgenciesCount();
	}

	/**
	* Updates the dossier proc agency in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossierProcAgency the dossier proc agency
	* @return the dossier proc agency that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierProcAgency updateDossierProcAgency(
		org.oep.core.dossiermgt.model.DossierProcAgency dossierProcAgency)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcAgencyLocalService.updateDossierProcAgency(dossierProcAgency);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dossierProcAgencyLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dossierProcAgencyLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dossierProcAgencyLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DossierProcAgencyLocalService getWrappedDossierProcAgencyLocalService() {
		return _dossierProcAgencyLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDossierProcAgencyLocalService(
		DossierProcAgencyLocalService dossierProcAgencyLocalService) {
		_dossierProcAgencyLocalService = dossierProcAgencyLocalService;
	}

	@Override
	public DossierProcAgencyLocalService getWrappedService() {
		return _dossierProcAgencyLocalService;
	}

	@Override
	public void setWrappedService(
		DossierProcAgencyLocalService dossierProcAgencyLocalService) {
		_dossierProcAgencyLocalService = dossierProcAgencyLocalService;
	}

	private DossierProcAgencyLocalService _dossierProcAgencyLocalService;
}