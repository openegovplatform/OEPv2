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

package org.oep.core.dossiermgt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DocFileVersionLocalService}.
 *
 * @author trungdk
 * @see DocFileVersionLocalService
 * @generated
 */
public class DocFileVersionLocalServiceWrapper
	implements DocFileVersionLocalService,
		ServiceWrapper<DocFileVersionLocalService> {
	public DocFileVersionLocalServiceWrapper(
		DocFileVersionLocalService docFileVersionLocalService) {
		_docFileVersionLocalService = docFileVersionLocalService;
	}

	/**
	* Adds the doc file version to the database. Also notifies the appropriate model listeners.
	*
	* @param docFileVersion the doc file version
	* @return the doc file version that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DocFileVersion addDocFileVersion(
		org.oep.core.dossiermgt.model.DocFileVersion docFileVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docFileVersionLocalService.addDocFileVersion(docFileVersion);
	}

	/**
	* Creates a new doc file version with the primary key. Does not add the doc file version to the database.
	*
	* @param docFileVersionId the primary key for the new doc file version
	* @return the new doc file version
	*/
	@Override
	public org.oep.core.dossiermgt.model.DocFileVersion createDocFileVersion(
		long docFileVersionId) {
		return _docFileVersionLocalService.createDocFileVersion(docFileVersionId);
	}

	/**
	* Deletes the doc file version with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param docFileVersionId the primary key of the doc file version
	* @return the doc file version that was removed
	* @throws PortalException if a doc file version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DocFileVersion deleteDocFileVersion(
		long docFileVersionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _docFileVersionLocalService.deleteDocFileVersion(docFileVersionId);
	}

	/**
	* Deletes the doc file version from the database. Also notifies the appropriate model listeners.
	*
	* @param docFileVersion the doc file version
	* @return the doc file version that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DocFileVersion deleteDocFileVersion(
		org.oep.core.dossiermgt.model.DocFileVersion docFileVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docFileVersionLocalService.deleteDocFileVersion(docFileVersion);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _docFileVersionLocalService.dynamicQuery();
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
		return _docFileVersionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DocFileVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _docFileVersionLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DocFileVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _docFileVersionLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _docFileVersionLocalService.dynamicQueryCount(dynamicQuery);
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
		return _docFileVersionLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.core.dossiermgt.model.DocFileVersion fetchDocFileVersion(
		long docFileVersionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docFileVersionLocalService.fetchDocFileVersion(docFileVersionId);
	}

	/**
	* Returns the doc file version with the matching UUID and company.
	*
	* @param uuid the doc file version's UUID
	* @param companyId the primary key of the company
	* @return the matching doc file version, or <code>null</code> if a matching doc file version could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DocFileVersion fetchDocFileVersionByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docFileVersionLocalService.fetchDocFileVersionByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the doc file version matching the UUID and group.
	*
	* @param uuid the doc file version's UUID
	* @param groupId the primary key of the group
	* @return the matching doc file version, or <code>null</code> if a matching doc file version could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DocFileVersion fetchDocFileVersionByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docFileVersionLocalService.fetchDocFileVersionByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the doc file version with the primary key.
	*
	* @param docFileVersionId the primary key of the doc file version
	* @return the doc file version
	* @throws PortalException if a doc file version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DocFileVersion getDocFileVersion(
		long docFileVersionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _docFileVersionLocalService.getDocFileVersion(docFileVersionId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _docFileVersionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the doc file version with the matching UUID and company.
	*
	* @param uuid the doc file version's UUID
	* @param companyId the primary key of the company
	* @return the matching doc file version
	* @throws PortalException if a matching doc file version could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DocFileVersion getDocFileVersionByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _docFileVersionLocalService.getDocFileVersionByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the doc file version matching the UUID and group.
	*
	* @param uuid the doc file version's UUID
	* @param groupId the primary key of the group
	* @return the matching doc file version
	* @throws PortalException if a matching doc file version could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DocFileVersion getDocFileVersionByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _docFileVersionLocalService.getDocFileVersionByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns a range of all the doc file versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DocFileVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of doc file versions
	* @param end the upper bound of the range of doc file versions (not inclusive)
	* @return the range of doc file versions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.dossiermgt.model.DocFileVersion> getDocFileVersions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docFileVersionLocalService.getDocFileVersions(start, end);
	}

	/**
	* Returns the number of doc file versions.
	*
	* @return the number of doc file versions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDocFileVersionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docFileVersionLocalService.getDocFileVersionsCount();
	}

	/**
	* Updates the doc file version in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param docFileVersion the doc file version
	* @return the doc file version that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DocFileVersion updateDocFileVersion(
		org.oep.core.dossiermgt.model.DocFileVersion docFileVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docFileVersionLocalService.updateDocFileVersion(docFileVersion);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _docFileVersionLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_docFileVersionLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _docFileVersionLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* ThÃƒÂªm mÃ¡Â»â„¢t phiÃƒÂªn bÃ¡ÂºÂ£n tÃƒÂ i liÃ¡Â»â€¡u mÃ¡Â»â€ºi
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param docFileId mÃƒÂ£ tÃƒÂ i liÃ¡Â»â€¡u
	* @param fileEntryId mÃƒÂ£ tÃ¡Â»â€¡p tÃƒÂ i liÃ¡Â»â€¡u lÃ†Â°u trÃ¡Â»Â¯ trÃƒÂªn liferay
	* @param xmlContent nÃ¡Â»â„¢i dung cÃ¡Â»Â§a tÃ¡Â»â€¡p tÃƒÂ i liÃ¡Â»â€¡u phiÃƒÂªn bÃ¡ÂºÂ£n mÃ¡Â»â€ºi
	* @param ebMessageId Ã„â€˜ÃƒÂ¡nh dÃ¡ÂºÂ¥u Ã„â€˜ÃƒÂ£ submit dÃ¡Â»Â¯ liÃ¡Â»â€¡u nÃƒÂ y
	* @return: phiÃƒÂªn bÃ¡ÂºÂ£n mÃ¡Â»â€ºi cÃ¡Â»Â§a tÃƒÂ i liÃ¡Â»â€¡u
	*/
	@Override
	public org.oep.core.dossiermgt.model.DocFileVersion addDocFileVersion(
		long docFileId, long fileEntryId, java.lang.String xmlContent,
		long ebMessageId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _docFileVersionLocalService.addDocFileVersion(docFileId,
			fileEntryId, xmlContent, ebMessageId, serviceContext);
	}

	/**
	* ChÃ¡Â»â€°nh sÃ¡Â»Â­a mÃ¡Â»â„¢t phiÃƒÂªn bÃ¡ÂºÂ£n tÃƒÂ i liÃ¡Â»â€¡u mÃ¡Â»â€ºi
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param docFileId mÃƒÂ£ tÃƒÂ i liÃ¡Â»â€¡u
	* @param fileEntryId mÃƒÂ£ tÃ¡Â»â€¡p tÃƒÂ i liÃ¡Â»â€¡u lÃ†Â°u trÃ¡Â»Â¯ trÃƒÂªn liferay
	* @param xmlContent nÃ¡Â»â„¢i dung cÃ¡Â»Â§a tÃ¡Â»â€¡p tÃƒÂ i liÃ¡Â»â€¡u phiÃƒÂªn bÃ¡ÂºÂ£n mÃ¡Â»â€ºi
	* @param ebMessageId Ã„â€˜ÃƒÂ¡nh dÃ¡ÂºÂ¥u Ã„â€˜ÃƒÂ£ submit dÃ¡Â»Â¯ liÃ¡Â»â€¡u nÃƒÂ y
	* @return: phiÃƒÂªn bÃ¡ÂºÂ£n tÃƒÂ i liÃ¡Â»â€¡u vÃ¡Â»Â«a Ã„â€˜Ã†Â°Ã¡Â»Â£c chÃ¡Â»â€°nh sÃ¡Â»Â­a
	*/
	@Override
	public org.oep.core.dossiermgt.model.DocFileVersion updateDocFileVersion(
		long id, long docFileId, long fileEntryId, java.lang.String xmlContent,
		long ebMessageId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _docFileVersionLocalService.updateDocFileVersion(id, docFileId,
			fileEntryId, xmlContent, ebMessageId, serviceContext);
	}

	@Override
	public void updateDocFileVersionResources(
		org.oep.core.dossiermgt.model.DocFileVersion docFileVersion,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_docFileVersionLocalService.updateDocFileVersionResources(docFileVersion,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void removeDocFileVersion(
		org.oep.core.dossiermgt.model.DocFileVersion docFileVersion)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_docFileVersionLocalService.removeDocFileVersion(docFileVersion);
	}

	@Override
	public void removeDocFileVersion(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_docFileVersionLocalService.removeDocFileVersion(id);
	}

	@Override
	public void addDocFileVersionResources(
		org.oep.core.dossiermgt.model.DocFileVersion docFileVersion,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_docFileVersionLocalService.addDocFileVersionResources(docFileVersion,
			addGroupPermission, addGuestPermission, serviceContext);
	}

	@Override
	public void addDocFileVersionResources(
		org.oep.core.dossiermgt.model.DocFileVersion docFileVersion,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_docFileVersionLocalService.addDocFileVersionResources(docFileVersion,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void addDocFileVersionResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_docFileVersionLocalService.addDocFileVersionResources(id,
			groupPermissions, guestPermissions, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DocFileVersionLocalService getWrappedDocFileVersionLocalService() {
		return _docFileVersionLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDocFileVersionLocalService(
		DocFileVersionLocalService docFileVersionLocalService) {
		_docFileVersionLocalService = docFileVersionLocalService;
	}

	@Override
	public DocFileVersionLocalService getWrappedService() {
		return _docFileVersionLocalService;
	}

	@Override
	public void setWrappedService(
		DocFileVersionLocalService docFileVersionLocalService) {
		_docFileVersionLocalService = docFileVersionLocalService;
	}

	private DocFileVersionLocalService _docFileVersionLocalService;
}