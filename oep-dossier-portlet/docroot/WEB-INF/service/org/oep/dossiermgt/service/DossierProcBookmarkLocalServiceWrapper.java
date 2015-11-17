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

package org.oep.dossiermgt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DossierProcBookmarkLocalService}.
 *
 * @author trungdk
 * @see DossierProcBookmarkLocalService
 * @generated
 */
public class DossierProcBookmarkLocalServiceWrapper
	implements DossierProcBookmarkLocalService,
		ServiceWrapper<DossierProcBookmarkLocalService> {
	public DossierProcBookmarkLocalServiceWrapper(
		DossierProcBookmarkLocalService dossierProcBookmarkLocalService) {
		_dossierProcBookmarkLocalService = dossierProcBookmarkLocalService;
	}

	/**
	* Adds the dossier proc bookmark to the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProcBookmark the dossier proc bookmark
	* @return the dossier proc bookmark that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.dossiermgt.model.DossierProcBookmark addDossierProcBookmark(
		org.oep.dossiermgt.model.DossierProcBookmark dossierProcBookmark)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcBookmarkLocalService.addDossierProcBookmark(dossierProcBookmark);
	}

	/**
	* Creates a new dossier proc bookmark with the primary key. Does not add the dossier proc bookmark to the database.
	*
	* @param dossierProcBookmarkId the primary key for the new dossier proc bookmark
	* @return the new dossier proc bookmark
	*/
	@Override
	public org.oep.dossiermgt.model.DossierProcBookmark createDossierProcBookmark(
		long dossierProcBookmarkId) {
		return _dossierProcBookmarkLocalService.createDossierProcBookmark(dossierProcBookmarkId);
	}

	/**
	* Deletes the dossier proc bookmark with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProcBookmarkId the primary key of the dossier proc bookmark
	* @return the dossier proc bookmark that was removed
	* @throws PortalException if a dossier proc bookmark with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.dossiermgt.model.DossierProcBookmark deleteDossierProcBookmark(
		long dossierProcBookmarkId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcBookmarkLocalService.deleteDossierProcBookmark(dossierProcBookmarkId);
	}

	/**
	* Deletes the dossier proc bookmark from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProcBookmark the dossier proc bookmark
	* @return the dossier proc bookmark that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.dossiermgt.model.DossierProcBookmark deleteDossierProcBookmark(
		org.oep.dossiermgt.model.DossierProcBookmark dossierProcBookmark)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcBookmarkLocalService.deleteDossierProcBookmark(dossierProcBookmark);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dossierProcBookmarkLocalService.dynamicQuery();
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
		return _dossierProcBookmarkLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.DossierProcBookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dossierProcBookmarkLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.DossierProcBookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dossierProcBookmarkLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return _dossierProcBookmarkLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dossierProcBookmarkLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.dossiermgt.model.DossierProcBookmark fetchDossierProcBookmark(
		long dossierProcBookmarkId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcBookmarkLocalService.fetchDossierProcBookmark(dossierProcBookmarkId);
	}

	/**
	* Returns the dossier proc bookmark with the primary key.
	*
	* @param dossierProcBookmarkId the primary key of the dossier proc bookmark
	* @return the dossier proc bookmark
	* @throws PortalException if a dossier proc bookmark with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.dossiermgt.model.DossierProcBookmark getDossierProcBookmark(
		long dossierProcBookmarkId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcBookmarkLocalService.getDossierProcBookmark(dossierProcBookmarkId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcBookmarkLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<org.oep.dossiermgt.model.DossierProcBookmark> getDossierProcBookmarks(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcBookmarkLocalService.getDossierProcBookmarks(start,
			end);
	}

	/**
	* Returns the number of dossier proc bookmarks.
	*
	* @return the number of dossier proc bookmarks
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDossierProcBookmarksCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcBookmarkLocalService.getDossierProcBookmarksCount();
	}

	/**
	* Updates the dossier proc bookmark in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossierProcBookmark the dossier proc bookmark
	* @return the dossier proc bookmark that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.dossiermgt.model.DossierProcBookmark updateDossierProcBookmark(
		org.oep.dossiermgt.model.DossierProcBookmark dossierProcBookmark)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcBookmarkLocalService.updateDossierProcBookmark(dossierProcBookmark);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dossierProcBookmarkLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dossierProcBookmarkLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dossierProcBookmarkLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* ThÃƒÂªm mÃ¡Â»â€ºi bookmark thÃ¡Â»Â§ tÃ¡Â»Â¥c quan tÃƒÂ¢m
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng thÃ¡Â»Â§ tÃ¡Â»Â¥c quan tÃƒÂ¢m mÃ¡Â»â€ºi
	*/
	@Override
	public org.oep.dossiermgt.model.DossierProcBookmark addDossierProcBookmark(
		long userId, long dossierProcAgentId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcBookmarkLocalService.addDossierProcBookmark(userId,
			dossierProcAgentId, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DossierProcBookmarkLocalService getWrappedDossierProcBookmarkLocalService() {
		return _dossierProcBookmarkLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDossierProcBookmarkLocalService(
		DossierProcBookmarkLocalService dossierProcBookmarkLocalService) {
		_dossierProcBookmarkLocalService = dossierProcBookmarkLocalService;
	}

	@Override
	public DossierProcBookmarkLocalService getWrappedService() {
		return _dossierProcBookmarkLocalService;
	}

	@Override
	public void setWrappedService(
		DossierProcBookmarkLocalService dossierProcBookmarkLocalService) {
		_dossierProcBookmarkLocalService = dossierProcBookmarkLocalService;
	}

	private DossierProcBookmarkLocalService _dossierProcBookmarkLocalService;
}