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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for DocFile. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author trungdk
 * @see DocFileLocalServiceUtil
 * @see org.oep.dossiermgt.service.base.DocFileLocalServiceBaseImpl
 * @see org.oep.dossiermgt.service.impl.DocFileLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface DocFileLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DocFileLocalServiceUtil} to access the doc file local service. Add custom service methods to {@link org.oep.dossiermgt.service.impl.DocFileLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the doc file to the database. Also notifies the appropriate model listeners.
	*
	* @param docFile the doc file
	* @return the doc file that was added
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.dossiermgt.model.DocFile addDocFile(
		org.oep.dossiermgt.model.DocFile docFile)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new doc file with the primary key. Does not add the doc file to the database.
	*
	* @param docFileId the primary key for the new doc file
	* @return the new doc file
	*/
	public org.oep.dossiermgt.model.DocFile createDocFile(long docFileId);

	/**
	* Deletes the doc file with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param docFileId the primary key of the doc file
	* @return the doc file that was removed
	* @throws PortalException if a doc file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public org.oep.dossiermgt.model.DocFile deleteDocFile(long docFileId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the doc file from the database. Also notifies the appropriate model listeners.
	*
	* @param docFile the doc file
	* @return the doc file that was removed
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public org.oep.dossiermgt.model.DocFile deleteDocFile(
		org.oep.dossiermgt.model.DocFile docFile)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.DocFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.DocFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.oep.dossiermgt.model.DocFile fetchDocFile(long docFileId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the doc file with the matching UUID and company.
	*
	* @param uuid the doc file's UUID
	* @param companyId the primary key of the company
	* @return the matching doc file, or <code>null</code> if a matching doc file could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.oep.dossiermgt.model.DocFile fetchDocFileByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the doc file matching the UUID and group.
	*
	* @param uuid the doc file's UUID
	* @param groupId the primary key of the group
	* @return the matching doc file, or <code>null</code> if a matching doc file could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.oep.dossiermgt.model.DocFile fetchDocFileByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the doc file with the primary key.
	*
	* @param docFileId the primary key of the doc file
	* @return the doc file
	* @throws PortalException if a doc file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.oep.dossiermgt.model.DocFile getDocFile(long docFileId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the doc file with the matching UUID and company.
	*
	* @param uuid the doc file's UUID
	* @param companyId the primary key of the company
	* @return the matching doc file
	* @throws PortalException if a matching doc file could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.oep.dossiermgt.model.DocFile getDocFileByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the doc file matching the UUID and group.
	*
	* @param uuid the doc file's UUID
	* @param groupId the primary key of the group
	* @return the matching doc file
	* @throws PortalException if a matching doc file could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.oep.dossiermgt.model.DocFile getDocFileByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the doc files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.DocFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of doc files
	* @param end the upper bound of the range of doc files (not inclusive)
	* @return the range of doc files
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.oep.dossiermgt.model.DocFile> getDocFiles(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of doc files.
	*
	* @return the number of doc files
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getDocFilesCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the doc file in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param docFile the doc file
	* @return the doc file that was updated
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.dossiermgt.model.DocFile updateDocFile(
		org.oep.dossiermgt.model.DocFile docFile)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	/**
	* ThÃªm má»™t tÃ i liá»‡u cho há»“ sÆ¡
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Táº¡o má»›i
	*
	* @param dossierId há»“ sÆ¡
	* @param dossierDocId thÃ nh pháº§n há»“ sÆ¡
	* @param docTemplateId máº«u thÃ nh pháº§n há»“ sÆ¡ máº·c Ä‘á»‹nh
	* @param docFileVersionId phiÃªn báº£n tá»‡p thÃ nh pháº§n há»“ sÆ¡
	* @param docFileName tÃªn tá»‡p thÃ nh pháº§n há»“ sÆ¡
	* @param docFileType loáº¡i tÃ i liá»‡u
	* @param verifyStatus Cá»� Ä‘Ã¡nh dáº¥u tÃ i liá»‡u Ä‘Ã£ Ä‘Æ°á»£c Ä‘á»‘i chiáº¿u
	* @param note ghi chÃº
	* @param approveBy TÃªn ngÆ°á»�i phÃª duyá»‡t tÃ i liá»‡u
	* @param approveDate NgÃ y Ä‘Æ°á»£c phÃª duyá»‡t
	* @param premier Cá»� Ä‘Ã¡nh dáº¥u báº£n gá»‘c tÃ i liá»‡u
	* @return: tÃ i liá»‡u trong bá»™ há»“ sÆ¡ má»›i
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.dossiermgt.model.DocFile addDocFile(long dossierId,
		long dossierDocId, long docTemplateId, long docFileVersionId,
		java.lang.String docFileName, int docFileType, int verifyStatus,
		java.lang.String note, java.lang.String approveBy,
		java.util.Date approveDate, int premier,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Chá»‰nh sá»­a má»™t tÃ i liá»‡u trong bá»™ há»“ sÆ¡
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Táº¡o má»›i
	*
	* @param dossierId há»“ sÆ¡
	* @param dossierDocId thÃ nh pháº§n há»“ sÆ¡
	* @param docTemplateId máº«u thÃ nh pháº§n há»“ sÆ¡ máº·c Ä‘á»‹nh
	* @param docFileVersionId phiÃªn báº£n tá»‡p thÃ nh pháº§n há»“ sÆ¡
	* @param docFileName tÃªn tá»‡p thÃ nh pháº§n há»“ sÆ¡
	* @param docFileType loáº¡i tÃ i liá»‡u
	* @param verifyStatus Cá»� Ä‘Ã¡nh dáº¥u tÃ i liá»‡u Ä‘Ã£ Ä‘Æ°á»£c Ä‘á»‘i chiáº¿u
	* @param note ghi chÃº
	* @param approveBy TÃªn ngÆ°á»�i phÃª duyá»‡t tÃ i liá»‡u
	* @param approveDate NgÃ y Ä‘Æ°á»£c phÃª duyá»‡t
	* @param premier Cá»� Ä‘Ã¡nh dáº¥u báº£n gá»‘c tÃ i liá»‡u
	* @return: tÃ i liá»‡u há»“ sÆ¡ vá»«a Ä‘Æ°á»£c cáº­p nháº­t
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.dossiermgt.model.DocFile updateDocFile(long id,
		long dossierId, long dossierDocId, long docTemplateId,
		long docFileVersionId, java.lang.String docFileName, int docFileType,
		int verifyStatus, java.lang.String note, java.lang.String approveBy,
		java.util.Date approveDate, int premier,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void updateDocFileResources(
		org.oep.dossiermgt.model.DocFile docFile,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void removeDocFile(org.oep.dossiermgt.model.DocFile docFile)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void removeDocFile(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void addDocFileResources(org.oep.dossiermgt.model.DocFile docFile,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void addDocFileResources(org.oep.dossiermgt.model.DocFile docFile,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void addDocFileResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;
}