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

package org.oep.core.processmgt.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import org.oep.core.processmgt.model.DossierStep;

/**
 * The persistence interface for the dossier step service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DossierStepPersistenceImpl
 * @see DossierStepUtil
 * @generated
 */
public interface DossierStepPersistence extends BasePersistence<DossierStep> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DossierStepUtil} to access the dossier step persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dossier step in the entity cache if it is enabled.
	*
	* @param dossierStep the dossier step
	*/
	public void cacheResult(
		org.oep.core.processmgt.model.DossierStep dossierStep);

	/**
	* Caches the dossier steps in the entity cache if it is enabled.
	*
	* @param dossierSteps the dossier steps
	*/
	public void cacheResult(
		java.util.List<org.oep.core.processmgt.model.DossierStep> dossierSteps);

	/**
	* Creates a new dossier step with the primary key. Does not add the dossier step to the database.
	*
	* @param dossierStepId the primary key for the new dossier step
	* @return the new dossier step
	*/
	public org.oep.core.processmgt.model.DossierStep create(long dossierStepId);

	/**
	* Removes the dossier step with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierStepId the primary key of the dossier step
	* @return the dossier step that was removed
	* @throws org.oep.core.processmgt.NoSuchDossierStepException if a dossier step with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.processmgt.model.DossierStep remove(long dossierStepId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.processmgt.NoSuchDossierStepException;

	public org.oep.core.processmgt.model.DossierStep updateImpl(
		org.oep.core.processmgt.model.DossierStep dossierStep)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier step with the primary key or throws a {@link org.oep.core.processmgt.NoSuchDossierStepException} if it could not be found.
	*
	* @param dossierStepId the primary key of the dossier step
	* @return the dossier step
	* @throws org.oep.core.processmgt.NoSuchDossierStepException if a dossier step with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.processmgt.model.DossierStep findByPrimaryKey(
		long dossierStepId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.processmgt.NoSuchDossierStepException;

	/**
	* Returns the dossier step with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dossierStepId the primary key of the dossier step
	* @return the dossier step, or <code>null</code> if a dossier step with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.processmgt.model.DossierStep fetchByPrimaryKey(
		long dossierStepId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dossier steps.
	*
	* @return the dossier steps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.processmgt.model.DossierStep> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.core.processmgt.model.DossierStep> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossier steps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DossierStepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier steps
	* @param end the upper bound of the range of dossier steps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dossier steps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.processmgt.model.DossierStep> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dossier steps from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossier steps.
	*
	* @return the number of dossier steps
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}