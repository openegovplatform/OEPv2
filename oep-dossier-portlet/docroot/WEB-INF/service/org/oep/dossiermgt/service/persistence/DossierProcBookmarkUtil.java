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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.oep.dossiermgt.model.DossierProcBookmark;

import java.util.List;

/**
 * The persistence utility for the dossier proc bookmark service. This utility wraps {@link DossierProcBookmarkPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DossierProcBookmarkPersistence
 * @see DossierProcBookmarkPersistenceImpl
 * @generated
 */
public class DossierProcBookmarkUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(DossierProcBookmark dossierProcBookmark) {
		getPersistence().clearCache(dossierProcBookmark);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DossierProcBookmark> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DossierProcBookmark> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DossierProcBookmark> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DossierProcBookmark update(
		DossierProcBookmark dossierProcBookmark) throws SystemException {
		return getPersistence().update(dossierProcBookmark);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DossierProcBookmark update(
		DossierProcBookmark dossierProcBookmark, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(dossierProcBookmark, serviceContext);
	}

	/**
	* Caches the dossier proc bookmark in the entity cache if it is enabled.
	*
	* @param dossierProcBookmark the dossier proc bookmark
	*/
	public static void cacheResult(
		org.oep.dossiermgt.model.DossierProcBookmark dossierProcBookmark) {
		getPersistence().cacheResult(dossierProcBookmark);
	}

	/**
	* Caches the dossier proc bookmarks in the entity cache if it is enabled.
	*
	* @param dossierProcBookmarks the dossier proc bookmarks
	*/
	public static void cacheResult(
		java.util.List<org.oep.dossiermgt.model.DossierProcBookmark> dossierProcBookmarks) {
		getPersistence().cacheResult(dossierProcBookmarks);
	}

	/**
	* Creates a new dossier proc bookmark with the primary key. Does not add the dossier proc bookmark to the database.
	*
	* @param dossierProcBookmarkId the primary key for the new dossier proc bookmark
	* @return the new dossier proc bookmark
	*/
	public static org.oep.dossiermgt.model.DossierProcBookmark create(
		long dossierProcBookmarkId) {
		return getPersistence().create(dossierProcBookmarkId);
	}

	/**
	* Removes the dossier proc bookmark with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProcBookmarkId the primary key of the dossier proc bookmark
	* @return the dossier proc bookmark that was removed
	* @throws org.oep.dossiermgt.NoSuchDossierProcBookmarkException if a dossier proc bookmark with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.DossierProcBookmark remove(
		long dossierProcBookmarkId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchDossierProcBookmarkException {
		return getPersistence().remove(dossierProcBookmarkId);
	}

	public static org.oep.dossiermgt.model.DossierProcBookmark updateImpl(
		org.oep.dossiermgt.model.DossierProcBookmark dossierProcBookmark)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dossierProcBookmark);
	}

	/**
	* Returns the dossier proc bookmark with the primary key or throws a {@link org.oep.dossiermgt.NoSuchDossierProcBookmarkException} if it could not be found.
	*
	* @param dossierProcBookmarkId the primary key of the dossier proc bookmark
	* @return the dossier proc bookmark
	* @throws org.oep.dossiermgt.NoSuchDossierProcBookmarkException if a dossier proc bookmark with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.DossierProcBookmark findByPrimaryKey(
		long dossierProcBookmarkId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchDossierProcBookmarkException {
		return getPersistence().findByPrimaryKey(dossierProcBookmarkId);
	}

	/**
	* Returns the dossier proc bookmark with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dossierProcBookmarkId the primary key of the dossier proc bookmark
	* @return the dossier proc bookmark, or <code>null</code> if a dossier proc bookmark with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.DossierProcBookmark fetchByPrimaryKey(
		long dossierProcBookmarkId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(dossierProcBookmarkId);
	}

	/**
	* Returns all the dossier proc bookmarks.
	*
	* @return the dossier proc bookmarks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.dossiermgt.model.DossierProcBookmark> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<org.oep.dossiermgt.model.DossierProcBookmark> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<org.oep.dossiermgt.model.DossierProcBookmark> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dossier proc bookmarks from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dossier proc bookmarks.
	*
	* @return the number of dossier proc bookmarks
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DossierProcBookmarkPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DossierProcBookmarkPersistence)PortletBeanLocatorUtil.locate(org.oep.dossiermgt.service.ClpSerializer.getServletContextName(),
					DossierProcBookmarkPersistence.class.getName());

			ReferenceRegistry.registerReference(DossierProcBookmarkUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DossierProcBookmarkPersistence persistence) {
	}

	private static DossierProcBookmarkPersistence _persistence;
}