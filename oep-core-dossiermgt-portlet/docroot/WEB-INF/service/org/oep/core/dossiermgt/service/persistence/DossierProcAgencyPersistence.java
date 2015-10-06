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

package org.oep.core.dossiermgt.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import org.oep.core.dossiermgt.model.DossierProcAgency;

/**
 * The persistence interface for the dossier proc agency service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DossierProcAgencyPersistenceImpl
 * @see DossierProcAgencyUtil
 * @generated
 */
public interface DossierProcAgencyPersistence extends BasePersistence<DossierProcAgency> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DossierProcAgencyUtil} to access the dossier proc agency persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dossier proc agency in the entity cache if it is enabled.
	*
	* @param dossierProcAgency the dossier proc agency
	*/
	public void cacheResult(
		org.oep.core.dossiermgt.model.DossierProcAgency dossierProcAgency);

	/**
	* Caches the dossier proc agencies in the entity cache if it is enabled.
	*
	* @param dossierProcAgencies the dossier proc agencies
	*/
	public void cacheResult(
		java.util.List<org.oep.core.dossiermgt.model.DossierProcAgency> dossierProcAgencies);

	/**
	* Creates a new dossier proc agency with the primary key. Does not add the dossier proc agency to the database.
	*
	* @param dossierProcAgencyId the primary key for the new dossier proc agency
	* @return the new dossier proc agency
	*/
	public org.oep.core.dossiermgt.model.DossierProcAgency create(
		long dossierProcAgencyId);

	/**
	* Removes the dossier proc agency with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProcAgencyId the primary key of the dossier proc agency
	* @return the dossier proc agency that was removed
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcAgencyException if a dossier proc agency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProcAgency remove(
		long dossierProcAgencyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcAgencyException;

	public org.oep.core.dossiermgt.model.DossierProcAgency updateImpl(
		org.oep.core.dossiermgt.model.DossierProcAgency dossierProcAgency)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier proc agency with the primary key or throws a {@link org.oep.core.dossiermgt.NoSuchDossierProcAgencyException} if it could not be found.
	*
	* @param dossierProcAgencyId the primary key of the dossier proc agency
	* @return the dossier proc agency
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcAgencyException if a dossier proc agency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProcAgency findByPrimaryKey(
		long dossierProcAgencyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcAgencyException;

	/**
	* Returns the dossier proc agency with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dossierProcAgencyId the primary key of the dossier proc agency
	* @return the dossier proc agency, or <code>null</code> if a dossier proc agency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProcAgency fetchByPrimaryKey(
		long dossierProcAgencyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dossier proc agencies.
	*
	* @return the dossier proc agencies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProcAgency> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.core.dossiermgt.model.DossierProcAgency> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossier proc agencies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcAgencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier proc agencies
	* @param end the upper bound of the range of dossier proc agencies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dossier proc agencies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProcAgency> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dossier proc agencies from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossier proc agencies.
	*
	* @return the number of dossier proc agencies
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}