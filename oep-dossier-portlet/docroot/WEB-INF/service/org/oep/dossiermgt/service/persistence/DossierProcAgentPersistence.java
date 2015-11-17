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

package org.oep.dossiermgt.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import org.oep.dossiermgt.model.DossierProcAgent;

/**
 * The persistence interface for the dossier proc agent service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DossierProcAgentPersistenceImpl
 * @see DossierProcAgentUtil
 * @generated
 */
public interface DossierProcAgentPersistence extends BasePersistence<DossierProcAgent> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DossierProcAgentUtil} to access the dossier proc agent persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dossier proc agent in the entity cache if it is enabled.
	*
	* @param dossierProcAgent the dossier proc agent
	*/
	public void cacheResult(
		org.oep.dossiermgt.model.DossierProcAgent dossierProcAgent);

	/**
	* Caches the dossier proc agents in the entity cache if it is enabled.
	*
	* @param dossierProcAgents the dossier proc agents
	*/
	public void cacheResult(
		java.util.List<org.oep.dossiermgt.model.DossierProcAgent> dossierProcAgents);

	/**
	* Creates a new dossier proc agent with the primary key. Does not add the dossier proc agent to the database.
	*
	* @param dossierProcAgentId the primary key for the new dossier proc agent
	* @return the new dossier proc agent
	*/
	public org.oep.dossiermgt.model.DossierProcAgent create(
		long dossierProcAgentId);

	/**
	* Removes the dossier proc agent with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProcAgentId the primary key of the dossier proc agent
	* @return the dossier proc agent that was removed
	* @throws org.oep.dossiermgt.NoSuchDossierProcAgentException if a dossier proc agent with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.DossierProcAgent remove(
		long dossierProcAgentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchDossierProcAgentException;

	public org.oep.dossiermgt.model.DossierProcAgent updateImpl(
		org.oep.dossiermgt.model.DossierProcAgent dossierProcAgent)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier proc agent with the primary key or throws a {@link org.oep.dossiermgt.NoSuchDossierProcAgentException} if it could not be found.
	*
	* @param dossierProcAgentId the primary key of the dossier proc agent
	* @return the dossier proc agent
	* @throws org.oep.dossiermgt.NoSuchDossierProcAgentException if a dossier proc agent with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.DossierProcAgent findByPrimaryKey(
		long dossierProcAgentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchDossierProcAgentException;

	/**
	* Returns the dossier proc agent with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dossierProcAgentId the primary key of the dossier proc agent
	* @return the dossier proc agent, or <code>null</code> if a dossier proc agent with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.DossierProcAgent fetchByPrimaryKey(
		long dossierProcAgentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dossier proc agents.
	*
	* @return the dossier proc agents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.dossiermgt.model.DossierProcAgent> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossier proc agents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.DossierProcAgentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier proc agents
	* @param end the upper bound of the range of dossier proc agents (not inclusive)
	* @return the range of dossier proc agents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.dossiermgt.model.DossierProcAgent> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossier proc agents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.DossierProcAgentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier proc agents
	* @param end the upper bound of the range of dossier proc agents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dossier proc agents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.dossiermgt.model.DossierProcAgent> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dossier proc agents from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossier proc agents.
	*
	* @return the number of dossier proc agents
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}