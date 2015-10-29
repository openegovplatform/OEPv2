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

/** 
 * Copyright (c) 2015 by Open eGovPlatform (http://http://openegovplatform.org/).
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.oep.core.dossiermgt.service.impl;

import java.util.Date;

import org.oep.core.dossiermgt.model.DocFile;
import org.oep.core.dossiermgt.service.base.DocFileLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * Hiện thực hóa lớp thao tác với thành phần hồ sơ trong một thủ tục hành chính.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.dossiermgt.service.DocFileLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.base.DocFileLocalServiceBaseImpl
 * @see org.oep.core.dossiermgt.service.DocFileLocalServiceUtil
 */
public class DocFileLocalServiceImpl extends DocFileLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.dossiermgt.service.DocFileLocalServiceUtil} to access the doc file local service.
	 */

	/** 
	 * Thêm một tài liệu cho hồ sơ
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param dossierId hồ sơ
	 * @param dossierDocId thành phần hồ sơ
	 * @param docTemplateId mẫu thành phần hồ sơ mặc định
	 * @param docFileVersionId phiên bản tệp thành phần hồ sơ
	 * @param docFileName tên tệp thành phần hồ sơ
	 * @param docFileType loại tài liệu
	 * @param verifyStatus Cờ đánh dấu tài liệu đã được đối chiếu
	 * @param note ghi chú
	 * @param approveBy Tên người phê duyệt tài liệu
	 * @param approveDate Ngày được phê duyệt
	 * @param premier Cờ đánh dấu bản gốc tài liệu
	 * @return: tài liệu trong bộ hồ sơ mới
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public DocFile addDocFile(
			long dossierId,
			long dossierDocId,
			long docTemplateId,
			long docFileVersionId,
			String docFileName,
			int docFileType,
			int verifyStatus,
			String note,
			String approveBy,
			Date approveDate,
			int premier,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate();
		long id = counterLocalService.increment();
		DocFile docFile = docFilePersistence.create(id);
		Date now = new Date();
				
		docFile.setCompanyId(serviceContext.getCompanyId());
		docFile.setGroupId(serviceContext.getScopeGroupId());
		docFile.setUserId(serviceContext.getUserId());
		docFile.setCreateDate(serviceContext.getCreateDate(now));
		docFile.setDossierId(dossierId);
		docFile.setDossierDocId(dossierDocId);
		docFile.setDocTemplateId(docTemplateId);
		docFile.setDocFileVersionId(docFileVersionId);
		docFile.setDocFileName(docFileName);
		docFile.setDocFileType(docFileType);
		docFile.setVerifyStatus(verifyStatus);
		docFile.setNote(note);
		docFile.setApproveBy(approveBy);
		docFile.setApproveDate(approveDate);
		docFile.setPremier(premier);
		
		docFilePersistence.update(docFile);

		if (_log.isInfoEnabled()) {
			_log.info("Create new doc file " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addDocFileResources(docFile, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addDocFileResources(docFile, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getDocFile(id);
	}
	
	/** 
	 * Chỉnh sửa một tài liệu trong bộ hồ sơ
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param dossierId hồ sơ
	 * @param dossierDocId thành phần hồ sơ
	 * @param docTemplateId mẫu thành phần hồ sơ mặc định
	 * @param docFileVersionId phiên bản tệp thành phần hồ sơ
	 * @param docFileName tên tệp thành phần hồ sơ
	 * @param docFileType loại tài liệu
	 * @param verifyStatus Cờ đánh dấu tài liệu đã được đối chiếu
	 * @param note ghi chú
	 * @param approveBy Tên người phê duyệt tài liệu
	 * @param approveDate Ngày được phê duyệt
	 * @param premier Cờ đánh dấu bản gốc tài liệu
	 * @return: tài liệu hồ sơ vừa được cập nhật
	 */
	@Indexable(type = IndexableType.REINDEX)
	public DocFile updateDocFile(
			long id, 
			long dossierId,
			long dossierDocId,
			long docTemplateId,
			long docFileVersionId,
			String docFileName,
			int docFileType,
			int verifyStatus,
			String note,
			String approveBy,
			Date approveDate,
			int premier,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		validate();

		DocFile docFile = docFilePersistence.findByPrimaryKey(id);

		docFile.setModifiedDate(serviceContext.getModifiedDate(null));
		docFile.setDossierId(dossierId);
		docFile.setDossierDocId(dossierDocId);
		docFile.setDocTemplateId(docTemplateId);
		docFile.setDocFileVersionId(docFileVersionId);
		docFile.setDocFileName(docFileName);
		docFile.setDocFileType(docFileType);
		docFile.setVerifyStatus(verifyStatus);
		docFile.setNote(note);
		docFile.setApproveBy(approveBy);
		docFile.setApproveDate(approveDate);
		docFile.setPremier(premier);

		docFilePersistence.update(docFile);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateDocFileResources(
				docFile, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getDocFile(docFile.getDocFileId());
	}
	
	public void updateDocFileResources(
			DocFile docFile, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			docFile.getCompanyId(), serviceContext.getScopeGroupId(),
			DocFile.class.getName(), docFile.getDocFileId(), groupPermissions,
			guestPermissions);
	}
	
	public void removeDocFile(DocFile docFile) throws PortalException, SystemException {
		docFilePersistence.remove(docFile);
		resourceLocalService.deleteResource(docFile.getCompanyId(), DocFile.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, docFile.getDocFileId());
	}
	
	public void removeDocFile(long id) throws PortalException, SystemException {
		DocFile docFile = docFilePersistence.findByPrimaryKey(id);
		removeDocFile(docFile);
	}
	
	public DocFile getDocFile(long id) throws PortalException, SystemException {
		return docFilePersistence.findByPrimaryKey(id);
	}

	public void addDocFileResources(DocFile docFile, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(docFile.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DocFile.class.getName(), docFile.getDocFileId(), false, addGroupPermission, addGuestPermission);
	}

	public void addDocFileResources(DocFile docFile, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(docFile.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DocFile.class.getName(), docFile.getDocFileId(), groupPermissions, guestPermissions);
	}
	
	public void addDocFileResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		DocFile docFile = docFilePersistence.findByPrimaryKey(id);
		addDocFileResources(docFile, groupPermissions, guestPermissions, serviceContext);
	}
	
	protected void validate() throws PortalException {
	}
	
	private static Log _log = LogFactoryUtil.getLog(DocFileLocalServiceImpl.class);
	
}