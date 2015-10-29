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
 * Provides a wrapper for {@link DocFileLocalService}.
 *
 * @author trungdk
 * @see DocFileLocalService
 * @generated
 */
public class DocFileLocalServiceWrapper implements DocFileLocalService,
	ServiceWrapper<DocFileLocalService> {
	public DocFileLocalServiceWrapper(DocFileLocalService docFileLocalService) {
		_docFileLocalService = docFileLocalService;
	}

	/**
	* Adds the doc file to the database. Also notifies the appropriate model listeners.
	*
	* @param docFile the doc file
	* @return the doc file that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DocFile addDocFile(
		org.oep.core.dossiermgt.model.DocFile docFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docFileLocalService.addDocFile(docFile);
	}

	/**
	* Creates a new doc file with the primary key. Does not add the doc file to the database.
	*
	* @param docFileId the primary key for the new doc file
	* @return the new doc file
	*/
	@Override
	public org.oep.core.dossiermgt.model.DocFile createDocFile(long docFileId) {
		return _docFileLocalService.createDocFile(docFileId);
	}

	/**
	* Deletes the doc file with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param docFileId the primary key of the doc file
	* @return the doc file that was removed
	* @throws PortalException if a doc file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DocFile deleteDocFile(long docFileId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _docFileLocalService.deleteDocFile(docFileId);
	}

	/**
	* Deletes the doc file from the database. Also notifies the appropriate model listeners.
	*
	* @param docFile the doc file
	* @return the doc file that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DocFile deleteDocFile(
		org.oep.core.dossiermgt.model.DocFile docFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docFileLocalService.deleteDocFile(docFile);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _docFileLocalService.dynamicQuery();
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
		return _docFileLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DocFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _docFileLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DocFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _docFileLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _docFileLocalService.dynamicQueryCount(dynamicQuery);
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
		return _docFileLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public org.oep.core.dossiermgt.model.DocFile fetchDocFile(long docFileId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docFileLocalService.fetchDocFile(docFileId);
	}

	/**
	* Returns the doc file with the matching UUID and company.
	*
	* @param uuid the doc file's UUID
	* @param companyId the primary key of the company
	* @return the matching doc file, or <code>null</code> if a matching doc file could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DocFile fetchDocFileByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docFileLocalService.fetchDocFileByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the doc file matching the UUID and group.
	*
	* @param uuid the doc file's UUID
	* @param groupId the primary key of the group
	* @return the matching doc file, or <code>null</code> if a matching doc file could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DocFile fetchDocFileByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docFileLocalService.fetchDocFileByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the doc file with the primary key.
	*
	* @param docFileId the primary key of the doc file
	* @return the doc file
	* @throws PortalException if a doc file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DocFile getDocFile(long docFileId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _docFileLocalService.getDocFile(docFileId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _docFileLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the doc file with the matching UUID and company.
	*
	* @param uuid the doc file's UUID
	* @param companyId the primary key of the company
	* @return the matching doc file
	* @throws PortalException if a matching doc file could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DocFile getDocFileByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _docFileLocalService.getDocFileByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the doc file matching the UUID and group.
	*
	* @param uuid the doc file's UUID
	* @param groupId the primary key of the group
	* @return the matching doc file
	* @throws PortalException if a matching doc file could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DocFile getDocFileByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _docFileLocalService.getDocFileByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the doc files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DocFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of doc files
	* @param end the upper bound of the range of doc files (not inclusive)
	* @return the range of doc files
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.dossiermgt.model.DocFile> getDocFiles(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docFileLocalService.getDocFiles(start, end);
	}

	/**
	* Returns the number of doc files.
	*
	* @return the number of doc files
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDocFilesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docFileLocalService.getDocFilesCount();
	}

	/**
	* Updates the doc file in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param docFile the doc file
	* @return the doc file that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DocFile updateDocFile(
		org.oep.core.dossiermgt.model.DocFile docFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docFileLocalService.updateDocFile(docFile);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _docFileLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_docFileLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _docFileLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* ThÃƒÂªm mÃ¡Â»â„¢t tÃƒÂ i liÃ¡Â»â€¡u cho hÃ¡Â»â€œ sÃ†Â¡
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param dossierId hÃ¡Â»â€œ sÃ†Â¡
	* @param dossierDocId thÃƒÂ nh phÃ¡ÂºÂ§n hÃ¡Â»â€œ sÃ†Â¡
	* @param docTemplateId mÃ¡ÂºÂ«u thÃƒÂ nh phÃ¡ÂºÂ§n hÃ¡Â»â€œ sÃ†Â¡ mÃ¡ÂºÂ·c Ã„â€˜Ã¡Â»â€¹nh
	* @param docFileVersionId phiÃƒÂªn bÃ¡ÂºÂ£n tÃ¡Â»â€¡p thÃƒÂ nh phÃ¡ÂºÂ§n hÃ¡Â»â€œ sÃ†Â¡
	* @param docFileName tÃƒÂªn tÃ¡Â»â€¡p thÃƒÂ nh phÃ¡ÂºÂ§n hÃ¡Â»â€œ sÃ†Â¡
	* @param docFileType loÃ¡ÂºÂ¡i tÃƒÂ i liÃ¡Â»â€¡u
	* @param verifyStatus CÃ¡Â»ï¿½ Ã„â€˜ÃƒÂ¡nh dÃ¡ÂºÂ¥u tÃƒÂ i liÃ¡Â»â€¡u Ã„â€˜ÃƒÂ£ Ã„â€˜Ã†Â°Ã¡Â»Â£c Ã„â€˜Ã¡Â»â€˜i chiÃ¡ÂºÂ¿u
	* @param note ghi chÃƒÂº
	* @param approveBy TÃƒÂªn ngÃ†Â°Ã¡Â»ï¿½i phÃƒÂª duyÃ¡Â»â€¡t tÃƒÂ i liÃ¡Â»â€¡u
	* @param approveDate NgÃƒÂ y Ã„â€˜Ã†Â°Ã¡Â»Â£c phÃƒÂª duyÃ¡Â»â€¡t
	* @param premier CÃ¡Â»ï¿½ Ã„â€˜ÃƒÂ¡nh dÃ¡ÂºÂ¥u bÃ¡ÂºÂ£n gÃ¡Â»â€˜c tÃƒÂ i liÃ¡Â»â€¡u
	* @return: tÃƒÂ i liÃ¡Â»â€¡u trong bÃ¡Â»â„¢ hÃ¡Â»â€œ sÃ†Â¡ mÃ¡Â»â€ºi
	*/
	@Override
	public org.oep.core.dossiermgt.model.DocFile addDocFile(long dossierId,
		long dossierDocId, long docTemplateId, long docFileVersionId,
		java.lang.String docFileName, int docFileType, int verifyStatus,
		java.lang.String note, java.lang.String approveBy,
		java.util.Date approveDate, int premier,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _docFileLocalService.addDocFile(dossierId, dossierDocId,
			docTemplateId, docFileVersionId, docFileName, docFileType,
			verifyStatus, note, approveBy, approveDate, premier, serviceContext);
	}

	/**
	* ChÃ¡Â»â€°nh sÃ¡Â»Â­a mÃ¡Â»â„¢t tÃƒÂ i liÃ¡Â»â€¡u trong bÃ¡Â»â„¢ hÃ¡Â»â€œ sÃ†Â¡
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param dossierId hÃ¡Â»â€œ sÃ†Â¡
	* @param dossierDocId thÃƒÂ nh phÃ¡ÂºÂ§n hÃ¡Â»â€œ sÃ†Â¡
	* @param docTemplateId mÃ¡ÂºÂ«u thÃƒÂ nh phÃ¡ÂºÂ§n hÃ¡Â»â€œ sÃ†Â¡ mÃ¡ÂºÂ·c Ã„â€˜Ã¡Â»â€¹nh
	* @param docFileVersionId phiÃƒÂªn bÃ¡ÂºÂ£n tÃ¡Â»â€¡p thÃƒÂ nh phÃ¡ÂºÂ§n hÃ¡Â»â€œ sÃ†Â¡
	* @param docFileName tÃƒÂªn tÃ¡Â»â€¡p thÃƒÂ nh phÃ¡ÂºÂ§n hÃ¡Â»â€œ sÃ†Â¡
	* @param docFileType loÃ¡ÂºÂ¡i tÃƒÂ i liÃ¡Â»â€¡u
	* @param verifyStatus CÃ¡Â»ï¿½ Ã„â€˜ÃƒÂ¡nh dÃ¡ÂºÂ¥u tÃƒÂ i liÃ¡Â»â€¡u Ã„â€˜ÃƒÂ£ Ã„â€˜Ã†Â°Ã¡Â»Â£c Ã„â€˜Ã¡Â»â€˜i chiÃ¡ÂºÂ¿u
	* @param note ghi chÃƒÂº
	* @param approveBy TÃƒÂªn ngÃ†Â°Ã¡Â»ï¿½i phÃƒÂª duyÃ¡Â»â€¡t tÃƒÂ i liÃ¡Â»â€¡u
	* @param approveDate NgÃƒÂ y Ã„â€˜Ã†Â°Ã¡Â»Â£c phÃƒÂª duyÃ¡Â»â€¡t
	* @param premier CÃ¡Â»ï¿½ Ã„â€˜ÃƒÂ¡nh dÃ¡ÂºÂ¥u bÃ¡ÂºÂ£n gÃ¡Â»â€˜c tÃƒÂ i liÃ¡Â»â€¡u
	* @return: tÃƒÂ i liÃ¡Â»â€¡u hÃ¡Â»â€œ sÃ†Â¡ vÃ¡Â»Â«a Ã„â€˜Ã†Â°Ã¡Â»Â£c cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t
	*/
	@Override
	public org.oep.core.dossiermgt.model.DocFile updateDocFile(long id,
		long dossierId, long dossierDocId, long docTemplateId,
		long docFileVersionId, java.lang.String docFileName, int docFileType,
		int verifyStatus, java.lang.String note, java.lang.String approveBy,
		java.util.Date approveDate, int premier,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _docFileLocalService.updateDocFile(id, dossierId, dossierDocId,
			docTemplateId, docFileVersionId, docFileName, docFileType,
			verifyStatus, note, approveBy, approveDate, premier, serviceContext);
	}

	@Override
	public void updateDocFileResources(
		org.oep.core.dossiermgt.model.DocFile docFile,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_docFileLocalService.updateDocFileResources(docFile, groupPermissions,
			guestPermissions, serviceContext);
	}

	@Override
	public void removeDocFile(org.oep.core.dossiermgt.model.DocFile docFile)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_docFileLocalService.removeDocFile(docFile);
	}

	@Override
	public void removeDocFile(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_docFileLocalService.removeDocFile(id);
	}

	@Override
	public void addDocFileResources(
		org.oep.core.dossiermgt.model.DocFile docFile,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_docFileLocalService.addDocFileResources(docFile, addGroupPermission,
			addGuestPermission, serviceContext);
	}

	@Override
	public void addDocFileResources(
		org.oep.core.dossiermgt.model.DocFile docFile,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_docFileLocalService.addDocFileResources(docFile, groupPermissions,
			guestPermissions, serviceContext);
	}

	@Override
	public void addDocFileResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_docFileLocalService.addDocFileResources(id, groupPermissions,
			guestPermissions, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DocFileLocalService getWrappedDocFileLocalService() {
		return _docFileLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDocFileLocalService(
		DocFileLocalService docFileLocalService) {
		_docFileLocalService = docFileLocalService;
	}

	@Override
	public DocFileLocalService getWrappedService() {
		return _docFileLocalService;
	}

	@Override
	public void setWrappedService(DocFileLocalService docFileLocalService) {
		_docFileLocalService = docFileLocalService;
	}

	private DocFileLocalService _docFileLocalService;
}