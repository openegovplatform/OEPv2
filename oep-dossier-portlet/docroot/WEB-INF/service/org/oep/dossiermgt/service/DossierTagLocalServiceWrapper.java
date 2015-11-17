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
 * Provides a wrapper for {@link DossierTagLocalService}.
 *
 * @author trungdk
 * @see DossierTagLocalService
 * @generated
 */
public class DossierTagLocalServiceWrapper implements DossierTagLocalService,
	ServiceWrapper<DossierTagLocalService> {
	public DossierTagLocalServiceWrapper(
		DossierTagLocalService dossierTagLocalService) {
		_dossierTagLocalService = dossierTagLocalService;
	}

	/**
	* Adds the dossier tag to the database. Also notifies the appropriate model listeners.
	*
	* @param dossierTag the dossier tag
	* @return the dossier tag that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.dossiermgt.model.DossierTag addDossierTag(
		org.oep.dossiermgt.model.DossierTag dossierTag)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierTagLocalService.addDossierTag(dossierTag);
	}

	/**
	* Creates a new dossier tag with the primary key. Does not add the dossier tag to the database.
	*
	* @param dossierTagId the primary key for the new dossier tag
	* @return the new dossier tag
	*/
	@Override
	public org.oep.dossiermgt.model.DossierTag createDossierTag(
		long dossierTagId) {
		return _dossierTagLocalService.createDossierTag(dossierTagId);
	}

	/**
	* Deletes the dossier tag with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierTagId the primary key of the dossier tag
	* @return the dossier tag that was removed
	* @throws PortalException if a dossier tag with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.dossiermgt.model.DossierTag deleteDossierTag(
		long dossierTagId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierTagLocalService.deleteDossierTag(dossierTagId);
	}

	/**
	* Deletes the dossier tag from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierTag the dossier tag
	* @return the dossier tag that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.dossiermgt.model.DossierTag deleteDossierTag(
		org.oep.dossiermgt.model.DossierTag dossierTag)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierTagLocalService.deleteDossierTag(dossierTag);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dossierTagLocalService.dynamicQuery();
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
		return _dossierTagLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.DossierTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dossierTagLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.DossierTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dossierTagLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _dossierTagLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dossierTagLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.dossiermgt.model.DossierTag fetchDossierTag(
		long dossierTagId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierTagLocalService.fetchDossierTag(dossierTagId);
	}

	/**
	* Returns the dossier tag with the primary key.
	*
	* @param dossierTagId the primary key of the dossier tag
	* @return the dossier tag
	* @throws PortalException if a dossier tag with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.dossiermgt.model.DossierTag getDossierTag(long dossierTagId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierTagLocalService.getDossierTag(dossierTagId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierTagLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<org.oep.dossiermgt.model.DossierTag> getDossierTags(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierTagLocalService.getDossierTags(start, end);
	}

	/**
	* Returns the number of dossier tags.
	*
	* @return the number of dossier tags
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDossierTagsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierTagLocalService.getDossierTagsCount();
	}

	/**
	* Updates the dossier tag in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossierTag the dossier tag
	* @return the dossier tag that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.dossiermgt.model.DossierTag updateDossierTag(
		org.oep.dossiermgt.model.DossierTag dossierTag)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierTagLocalService.updateDossierTag(dossierTag);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dossierTagLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dossierTagLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dossierTagLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* ThÃƒÂªm mÃ¡Â»â€ºi mÃ¡Â»â„¢t tag cÃ¡Â»Â§a hÃ¡Â»â€œ sÃ†Â¡
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param dossierId mÃƒÂ£ hÃ¡Â»â€œ sÃ†Â¡
	* @param tag tag cÃ¡Â»Â§a hÃ¡Â»â€œ sÃ†Â¡
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: tag hÃ¡Â»â€œ sÃ†Â¡ mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c tÃ¡ÂºÂ¡o
	*/
	@Override
	public org.oep.dossiermgt.model.DossierTag addDossierTag(long dossierId,
		java.lang.String tag,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierTagLocalService.addDossierTag(dossierId, tag,
			serviceContext);
	}

	/**
	* CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin mÃ¡Â»â„¢t tag hÃ¡Â»â€œ sÃ†Â¡
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin tag hÃ¡Â»â€œ sÃ†Â¡
	*
	* @param id mÃƒÂ£ phÃƒÂ¢n biÃ¡Â»â€¡t cÃ¡Â»Â§a tag
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin
	*/
	@Override
	public org.oep.dossiermgt.model.DossierTag updateDossierTag(long id,
		long dossierId, java.lang.String tag,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierTagLocalService.updateDossierTag(id, dossierId, tag,
			serviceContext);
	}

	/**
	* CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin mÃ¡Â»â„¢t tag hÃ¡Â»â€œ sÃ†Â¡
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin tag hÃ¡Â»â€œ sÃ†Â¡
	*
	* @param dossierTag tag hÃ¡Â»â€œ sÃ†Â¡ cÃ¡ÂºÂ§n cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng tag hÃ¡Â»â€œ sÃ†Â¡ mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin
	*/
	@Override
	public org.oep.dossiermgt.model.DossierTag updateDossierTag(
		org.oep.dossiermgt.model.DossierTag dossierTag,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierTagLocalService.updateDossierTag(dossierTag,
			serviceContext);
	}

	/**
	* XÃƒÂ³a bÃ¡Â»ï¿½ thÃƒÂ´ng tin mÃ¡Â»â„¢t tag hÃ¡Â»â€œ sÃ†Â¡
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    XÃƒÂ³a bÃ¡Â»ï¿½ thÃƒÂ´ng tin tag hÃ¡Â»â€œ sÃ†Â¡
	*
	* @param dossierProc tag hÃ¡Â»â€œ sÃ†Â¡ Ã„â€˜Ã†Â°Ã¡Â»Â£c xÃƒÂ³a
	* @return
	*/
	@Override
	public void removeDossierTag(org.oep.dossiermgt.model.DossierTag dossierTag)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dossierTagLocalService.removeDossierTag(dossierTag);
	}

	/**
	* XÃƒÂ³a bÃ¡Â»ï¿½ thÃƒÂ´ng tin mÃ¡Â»â„¢t tag hÃ¡Â»â€œ sÃ†Â¡
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    XÃƒÂ³a bÃ¡Â»ï¿½ thÃƒÂ´ng tin tag hÃ¡Â»â€œ sÃ†Â¡
	*
	* @param id mÃƒÂ£ phÃƒÂ¢n biÃ¡Â»â€¡t tag hÃ¡Â»â€œ sÃ†Â¡
	* @return
	*/
	@Override
	public void removeDossierTag(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dossierTagLocalService.removeDossierTag(id);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DossierTagLocalService getWrappedDossierTagLocalService() {
		return _dossierTagLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDossierTagLocalService(
		DossierTagLocalService dossierTagLocalService) {
		_dossierTagLocalService = dossierTagLocalService;
	}

	@Override
	public DossierTagLocalService getWrappedService() {
		return _dossierTagLocalService;
	}

	@Override
	public void setWrappedService(DossierTagLocalService dossierTagLocalService) {
		_dossierTagLocalService = dossierTagLocalService;
	}

	private DossierTagLocalService _dossierTagLocalService;
}