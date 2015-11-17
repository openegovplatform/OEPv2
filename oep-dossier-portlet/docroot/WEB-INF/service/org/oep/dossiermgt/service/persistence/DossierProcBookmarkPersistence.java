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

import org.oep.dossiermgt.model.DossierProcBookmark;

/**
 * The persistence interface for the dossier proc bookmark service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DossierProcBookmarkPersistenceImpl
 * @see DossierProcBookmarkUtil
 * @generated
 */
public interface DossierProcBookmarkPersistence extends BasePersistence<DossierProcBookmark> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DossierProcBookmarkUtil} to access the dossier proc bookmark persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dossier proc bookmark in the entity cache if it is enabled.
	*
	* @param dossierProcBookmark the dossier proc bookmark
	*/
	public void cacheResult(
		org.oep.dossiermgt.model.DossierProcBookmark dossierProcBookmark);

	/**
	* Caches the dossier proc bookmarks in the entity cache if it is enabled.
	*
	* @param dossierProcBookmarks the dossier proc bookmarks
	*/
	public void cacheResult(
		java.util.List<org.oep.dossiermgt.model.DossierProcBookmark> dossierProcBookmarks);

	/**
	* Creates a new dossier proc bookmark with the primary key. Does not add the dossier proc bookmark to the database.
	*
	* @param dossierProcBookmarkId the primary key for the new dossier proc bookmark
	* @return the new dossier proc bookmark
	*/
	public org.oep.dossiermgt.model.DossierProcBookmark create(
		long dossierProcBookmarkId);

	/**
	* Removes the dossier proc bookmark with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProcBookmarkId the primary key of the dossier proc bookmark
	* @return the dossier proc bookmark that was removed
	* @throws org.oep.dossiermgt.NoSuchDossierProcBookmarkException if a dossier proc bookmark with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.DossierProcBookmark remove(
		long dossierProcBookmarkId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchDossierProcBookmarkException;

	public org.oep.dossiermgt.model.DossierProcBookmark updateImpl(
		org.oep.dossiermgt.model.DossierProcBookmark dossierProcBookmark)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier proc bookmark with the primary key or throws a {@link org.oep.dossiermgt.NoSuchDossierProcBookmarkException} if it could not be found.
	*
	* @param dossierProcBookmarkId the primary key of the dossier proc bookmark
	* @return the dossier proc bookmark
	* @throws org.oep.dossiermgt.NoSuchDossierProcBookmarkException if a dossier proc bookmark with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.DossierProcBookmark findByPrimaryKey(
		long dossierProcBookmarkId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchDossierProcBookmarkException;

	/**
	* Returns the dossier proc bookmark with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dossierProcBookmarkId the primary key of the dossier proc bookmark
	* @return the dossier proc bookmark, or <code>null</code> if a dossier proc bookmark with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.DossierProcBookmark fetchByPrimaryKey(
		long dossierProcBookmarkId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dossier proc bookmarks.
	*
	* @return the dossier proc bookmarks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.dossiermgt.model.DossierProcBookmark> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossier proc bookmarks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.DossierProcBookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier proc bookmarks
	* @param end the upper bound of the range of dossier proc bookmarks (not inclusive)
	* @return the range of dossier proc bookmarks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.dossiermgt.model.DossierProcBookmark> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossier proc bookmarks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.DossierProcBookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier proc bookmarks
	* @param end the upper bound of the range of dossier proc bookmarks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dossier proc bookmarks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.dossiermgt.model.DossierProcBookmark> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dossier proc bookmarks from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossier proc bookmarks.
	*
	* @return the number of dossier proc bookmarks
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}