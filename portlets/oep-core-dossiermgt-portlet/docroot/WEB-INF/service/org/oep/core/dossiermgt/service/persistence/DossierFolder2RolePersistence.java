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

import org.oep.core.dossiermgt.model.DossierFolder2Role;

/**
 * The persistence interface for the dossier folder2 role service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DossierFolder2RolePersistenceImpl
 * @see DossierFolder2RoleUtil
 * @generated
 */
public interface DossierFolder2RolePersistence extends BasePersistence<DossierFolder2Role> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DossierFolder2RoleUtil} to access the dossier folder2 role persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dossier folder2 role in the entity cache if it is enabled.
	*
	* @param dossierFolder2Role the dossier folder2 role
	*/
	public void cacheResult(
		org.oep.core.dossiermgt.model.DossierFolder2Role dossierFolder2Role);

	/**
	* Caches the dossier folder2 roles in the entity cache if it is enabled.
	*
	* @param dossierFolder2Roles the dossier folder2 roles
	*/
	public void cacheResult(
		java.util.List<org.oep.core.dossiermgt.model.DossierFolder2Role> dossierFolder2Roles);

	/**
	* Creates a new dossier folder2 role with the primary key. Does not add the dossier folder2 role to the database.
	*
	* @param dossierFolder2RolePK the primary key for the new dossier folder2 role
	* @return the new dossier folder2 role
	*/
	public org.oep.core.dossiermgt.model.DossierFolder2Role create(
		org.oep.core.dossiermgt.service.persistence.DossierFolder2RolePK dossierFolder2RolePK);

	/**
	* Removes the dossier folder2 role with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierFolder2RolePK the primary key of the dossier folder2 role
	* @return the dossier folder2 role that was removed
	* @throws org.oep.core.dossiermgt.NoSuchDossierFolder2RoleException if a dossier folder2 role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierFolder2Role remove(
		org.oep.core.dossiermgt.service.persistence.DossierFolder2RolePK dossierFolder2RolePK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierFolder2RoleException;

	public org.oep.core.dossiermgt.model.DossierFolder2Role updateImpl(
		org.oep.core.dossiermgt.model.DossierFolder2Role dossierFolder2Role)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier folder2 role with the primary key or throws a {@link org.oep.core.dossiermgt.NoSuchDossierFolder2RoleException} if it could not be found.
	*
	* @param dossierFolder2RolePK the primary key of the dossier folder2 role
	* @return the dossier folder2 role
	* @throws org.oep.core.dossiermgt.NoSuchDossierFolder2RoleException if a dossier folder2 role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierFolder2Role findByPrimaryKey(
		org.oep.core.dossiermgt.service.persistence.DossierFolder2RolePK dossierFolder2RolePK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierFolder2RoleException;

	/**
	* Returns the dossier folder2 role with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dossierFolder2RolePK the primary key of the dossier folder2 role
	* @return the dossier folder2 role, or <code>null</code> if a dossier folder2 role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierFolder2Role fetchByPrimaryKey(
		org.oep.core.dossiermgt.service.persistence.DossierFolder2RolePK dossierFolder2RolePK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dossier folder2 roles.
	*
	* @return the dossier folder2 roles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierFolder2Role> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.core.dossiermgt.model.DossierFolder2Role> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossier folder2 roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierFolder2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier folder2 roles
	* @param end the upper bound of the range of dossier folder2 roles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dossier folder2 roles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierFolder2Role> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dossier folder2 roles from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossier folder2 roles.
	*
	* @return the number of dossier folder2 roles
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}