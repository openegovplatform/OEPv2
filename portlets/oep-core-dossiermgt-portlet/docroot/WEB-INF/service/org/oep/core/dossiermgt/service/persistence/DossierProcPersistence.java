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

import org.oep.core.dossiermgt.model.DossierProc;

/**
 * The persistence interface for the dossier proc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DossierProcPersistenceImpl
 * @see DossierProcUtil
 * @generated
 */
public interface DossierProcPersistence extends BasePersistence<DossierProc> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DossierProcUtil} to access the dossier proc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dossier proc in the entity cache if it is enabled.
	*
	* @param dossierProc the dossier proc
	*/
	public void cacheResult(
		org.oep.core.dossiermgt.model.DossierProc dossierProc);

	/**
	* Caches the dossier procs in the entity cache if it is enabled.
	*
	* @param dossierProcs the dossier procs
	*/
	public void cacheResult(
		java.util.List<org.oep.core.dossiermgt.model.DossierProc> dossierProcs);

	/**
	* Creates a new dossier proc with the primary key. Does not add the dossier proc to the database.
	*
	* @param dossierProcId the primary key for the new dossier proc
	* @return the new dossier proc
	*/
	public org.oep.core.dossiermgt.model.DossierProc create(long dossierProcId);

	/**
	* Removes the dossier proc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProcId the primary key of the dossier proc
	* @return the dossier proc that was removed
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc remove(long dossierProcId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	public org.oep.core.dossiermgt.model.DossierProc updateImpl(
		org.oep.core.dossiermgt.model.DossierProc dossierProc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier proc with the primary key or throws a {@link org.oep.core.dossiermgt.NoSuchDossierProcException} if it could not be found.
	*
	* @param dossierProcId the primary key of the dossier proc
	* @return the dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc findByPrimaryKey(
		long dossierProcId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Returns the dossier proc with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dossierProcId the primary key of the dossier proc
	* @return the dossier proc, or <code>null</code> if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc fetchByPrimaryKey(
		long dossierProcId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dossier procs.
	*
	* @return the dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossier procs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @return the range of dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossier procs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dossier procs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossier procs.
	*
	* @return the number of dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}