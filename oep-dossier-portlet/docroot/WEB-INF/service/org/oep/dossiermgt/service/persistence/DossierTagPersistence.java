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

import org.oep.dossiermgt.model.DossierTag;

/**
 * The persistence interface for the dossier tag service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DossierTagPersistenceImpl
 * @see DossierTagUtil
 * @generated
 */
public interface DossierTagPersistence extends BasePersistence<DossierTag> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DossierTagUtil} to access the dossier tag persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dossier tag in the entity cache if it is enabled.
	*
	* @param dossierTag the dossier tag
	*/
	public void cacheResult(org.oep.dossiermgt.model.DossierTag dossierTag);

	/**
	* Caches the dossier tags in the entity cache if it is enabled.
	*
	* @param dossierTags the dossier tags
	*/
	public void cacheResult(
		java.util.List<org.oep.dossiermgt.model.DossierTag> dossierTags);

	/**
	* Creates a new dossier tag with the primary key. Does not add the dossier tag to the database.
	*
	* @param dossierTagId the primary key for the new dossier tag
	* @return the new dossier tag
	*/
	public org.oep.dossiermgt.model.DossierTag create(long dossierTagId);

	/**
	* Removes the dossier tag with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierTagId the primary key of the dossier tag
	* @return the dossier tag that was removed
	* @throws org.oep.dossiermgt.NoSuchDossierTagException if a dossier tag with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.DossierTag remove(long dossierTagId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchDossierTagException;

	public org.oep.dossiermgt.model.DossierTag updateImpl(
		org.oep.dossiermgt.model.DossierTag dossierTag)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier tag with the primary key or throws a {@link org.oep.dossiermgt.NoSuchDossierTagException} if it could not be found.
	*
	* @param dossierTagId the primary key of the dossier tag
	* @return the dossier tag
	* @throws org.oep.dossiermgt.NoSuchDossierTagException if a dossier tag with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.DossierTag findByPrimaryKey(
		long dossierTagId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchDossierTagException;

	/**
	* Returns the dossier tag with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dossierTagId the primary key of the dossier tag
	* @return the dossier tag, or <code>null</code> if a dossier tag with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.DossierTag fetchByPrimaryKey(
		long dossierTagId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dossier tags.
	*
	* @return the dossier tags
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.dossiermgt.model.DossierTag> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossier tags.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.DossierTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier tags
	* @param end the upper bound of the range of dossier tags (not inclusive)
	* @return the range of dossier tags
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.dossiermgt.model.DossierTag> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossier tags.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.DossierTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier tags
	* @param end the upper bound of the range of dossier tags (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dossier tags
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.dossiermgt.model.DossierTag> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dossier tags from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossier tags.
	*
	* @return the number of dossier tags
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}