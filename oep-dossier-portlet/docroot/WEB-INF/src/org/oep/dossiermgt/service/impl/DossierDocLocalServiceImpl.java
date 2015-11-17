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

package org.oep.dossiermgt.service.impl;

import java.util.Date;

import org.oep.dossiermgt.model.DossierDoc;
import org.oep.dossiermgt.service.base.DossierDocLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * API cung cấp thao tác với dữ liệu thành phần hồ sơ.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.dossiermgt.service.DossierDocLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.dossiermgt.service.base.DossierDocLocalServiceBaseImpl
 * @see org.oep.dossiermgt.service.DossierDocLocalServiceUtil
 */
public class DossierDocLocalServiceImpl extends DossierDocLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.dossiermgt.service.DossierDocLocalServiceUtil} to access the dossier doc local service.
	 */
	
	/** 
	 * Thêm mới thành phần hồ sơ
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param dossierProcId mã thủ tục hành chính
	 * @param dossierDocNo mã định danh thành phần hồ sơ
	 * @param dossierDocName tên thành phần hồ sơ
	 * @param note ghi chú
	 * @param sequenceNo số thứ tự thành phần hồ sơ
	 * @param defaultDocTemplateId biểu mẫu ngầm định của hồ sơ
	 * @param dossierDocType loại thành phần hồ sơ
	 * @param numberOfFile số lượng tài liệu tối đa
	 * @param splitSubDossier cờ đánh dấu phân thành hồ sơ con
	 * @param onlineForm thành phần khai trực tuyến
	 * @return: thành phần hồ sơ mới tạo
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public DossierDoc addDossierDoc(
			long dossierProcId,
			String dossierDocNo,
			String dossierDocName,
			String note,
			int sequenceNo,
			long defaultDocTemplateId,
			int dossierDocType,
			int numberOfFile,
			String onlineForm,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate();
		long id = counterLocalService.increment();
		DossierDoc dossierDoc = dossierDocPersistence.create(id);
		Date now = new Date();
				
		dossierDoc.setCompanyId(serviceContext.getCompanyId());
		dossierDoc.setGroupId(serviceContext.getScopeGroupId());
		dossierDoc.setUserId(serviceContext.getUserId());
		dossierDoc.setCreateDate(serviceContext.getCreateDate(now));
		dossierDoc.setDossierProcId(dossierProcId);
		dossierDoc.setDossierDocNo(dossierDocNo);
		dossierDoc.setDossierDocName(dossierDocName);
		dossierDoc.setNote(note);
		dossierDoc.setSequenceNo(sequenceNo);
		dossierDoc.setDefaultDocTemplateId(defaultDocTemplateId);
		dossierDoc.setDossierDocType(dossierDocType);
		dossierDoc.setNumberOfFile(numberOfFile);
		dossierDoc.setOnlineForm(onlineForm);
		
		dossierDocPersistence.update(dossierDoc);

		if (_log.isInfoEnabled()) {
			_log.info("Create new dossier doc " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addDossierDocResources(dossierDoc, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addDossierDocResources(dossierDoc, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getDossierDoc(id);
	}

	/** 
	 * Chỉnh sửa thành phần hồ sơ
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param id mã thành phần hồ sơ
	 * @param dossierProcId mã thủ tục hành chính
	 * @param dossierDocNo mã định danh thành phần hồ sơ
	 * @param dossierDocName tên thành phần hồ sơ
	 * @param note ghi chú
	 * @param sequenceNo số thứ tự thành phần hồ sơ
	 * @param defaultDocTemplateId biểu mẫu ngầm định của hồ sơ
	 * @param dossierDocType loại thành phần hồ sơ
	 * @param numberOfFile số lượng tài liệu tối đa
	 * @param splitSubDossier cờ đánh dấu phân thành hồ sơ con
	 * @param onlineForm thành phần khai trực tuyến
	 * @return: thành phần hồ sơ mới tạo
	 */
	@Indexable(type = IndexableType.REINDEX)
	public DossierDoc updateDossierDoc(
			long id, 
			long dossierProcId,
			String dossierDocNo,
			String dossierDocName,
			String note,
			int sequenceNo,
			long defaultDocTemplateId,
			int dossierDocType,
			int numberOfFile,
			String onlineForm,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		validate();

		DossierDoc dossierDoc = dossierDocPersistence.findByPrimaryKey(id);

		dossierDoc.setModifiedDate(serviceContext.getModifiedDate(null));
		dossierDoc.setDossierProcId(dossierProcId);
		dossierDoc.setDossierDocNo(dossierDocNo);
		dossierDoc.setDossierDocName(dossierDocName);
		dossierDoc.setNote(note);
		dossierDoc.setSequenceNo(sequenceNo);
		dossierDoc.setDefaultDocTemplateId(defaultDocTemplateId);
		dossierDoc.setDossierDocType(dossierDocType);
		dossierDoc.setNumberOfFile(numberOfFile);
		dossierDoc.setOnlineForm(onlineForm);

		dossierDocPersistence.update(dossierDoc);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateDossierDocResources(
				dossierDoc, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getDossierDoc(dossierDoc.getDossierDocId());
	}
	
	public void updateDossierDocResources(
			DossierDoc dossierDoc, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			dossierDoc.getCompanyId(), serviceContext.getScopeGroupId(),
			DossierDoc.class.getName(), dossierDoc.getDossierDocId(), groupPermissions,
			guestPermissions);
	}
	
	public void removeDossierDoc(DossierDoc dossierDoc) throws PortalException, SystemException {
		dossierDocPersistence.remove(dossierDoc);
		resourceLocalService.deleteResource(dossierDoc.getCompanyId(), DossierDoc.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, dossierDoc.getDossierDocId());
	}
	
	public void removeDossierDoc(long id) throws PortalException, SystemException {
		DossierDoc dossierDoc = dossierDocPersistence.findByPrimaryKey(id);
		removeDossierDoc(dossierDoc);
	}
	
	public DossierDoc getDossierDoc(long id) throws PortalException, SystemException {
		return dossierDocPersistence.findByPrimaryKey(id);
	}

	public void addDossierDocResources(DossierDoc dossierDoc, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(dossierDoc.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DossierDoc.class.getName(), dossierDoc.getDossierDocId(), false, addGroupPermission, addGuestPermission);
	}

	public void addDossierDocResources(DossierDoc dossierDoc, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(dossierDoc.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DossierDoc.class.getName(), dossierDoc.getDossierDocId(), groupPermissions, guestPermissions);
	}
	
	public void addDossierDocResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		DossierDoc dossierDoc = dossierDocPersistence.findByPrimaryKey(id);
		addDossierDocResources(dossierDoc, groupPermissions, guestPermissions, serviceContext);
	}
	
	protected void validate() throws PortalException {
	}
	
	private static Log _log = LogFactoryUtil.getLog(DossierDocLocalServiceImpl.class);
	
}