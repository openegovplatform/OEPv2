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
import java.util.List;

import org.oep.core.dossiermgt.TemplateNoException;
import org.oep.core.dossiermgt.model.DocTemplate;
import org.oep.core.dossiermgt.service.base.DocTemplateLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * API dịch vụ cục bộ quản lý biểu mẫu của mỗi tài liệu.
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.base.DocTemplateLocalServiceBaseImpl
 * @see org.oep.core.dossiermgt.service.DocTemplateLocalServiceUtil
 */
public class DocTemplateLocalServiceImpl extends DocTemplateLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.dossiermgt.service.DocTemplateLocalServiceUtil} to access the doc template local service.
	 */
	
	/** 
	 * Thêm một biểu mẫu tài liệu
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param templateNo mã biểu mẫu
	 * @param title Tiêu đề biểu mẫu
	 * @param enTitle Tiêu đề Tiếng Anh của biểu mẫu
	 * @param fileEntryId Mã tài liệu mẫu bằng module quản lý phương tiện
	 * @return: biểu mẫu tài liệu mới tạo
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public DocTemplate addDocTemplate(
			String templateNo, 
			String title,
			String enTitle,
			long fileEntryId,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate(templateNo);
		long id = counterLocalService.increment();
		DocTemplate docTemplate = docTemplatePersistence.create(id);
		Date now = new Date();
		
		docTemplate.setCompanyId(serviceContext.getCompanyId());
		docTemplate.setGroupId(serviceContext.getScopeGroupId());
		docTemplate.setUserId(serviceContext.getUserId());
		docTemplate.setCreateDate(serviceContext.getCreateDate(now));
		docTemplate.setTemplateNo(templateNo);
		docTemplate.setTitle(title);
		docTemplate.setEnTitle(enTitle);
		docTemplate.setFileEntryId(fileEntryId);
		
		docTemplatePersistence.update(docTemplate);

		if (_log.isInfoEnabled()) {
			_log.info("Tạo mới biểu mẫu với mã " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addDocTemplateResources(docTemplate, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addDocTemplateResources(docTemplate, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getDocTemplate(id);
	}

	/** 
	 * Sửa thông tin một biểu mẫu tài liệu
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param id mã tự tăng biểu mẫu
	 * @param templateNo mã biểu mẫu
	 * @param title Tiêu đề biểu mẫu
	 * @param enTitle Tiêu đề Tiếng Anh của biểu mẫu
	 * @param fileEntryId Mã tài liệu mẫu bằng module quản lý phương tiện
	 * @return: biểu mẫu tài liệu được sửa
	 */
	@Indexable(type = IndexableType.REINDEX)
	public DocTemplate updateDocTemplate(
			long id, 
			String templateNo, 
			String title,
			String enTitle,
			long fileEntryId,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		validate(templateNo);

		DocTemplate docTemplate = docTemplatePersistence.findByPrimaryKey(id);

		docTemplate.setModifiedDate(serviceContext.getModifiedDate(null));
		docTemplate.setCompanyId(serviceContext.getCompanyId());
		docTemplate.setGroupId(serviceContext.getScopeGroupId());
		docTemplate.setUserId(serviceContext.getUserId());
		docTemplate.setTemplateNo(templateNo);
		docTemplate.setTitle(title);
		docTemplate.setEnTitle(enTitle);
		docTemplate.setFileEntryId(fileEntryId);

		docTemplatePersistence.update(docTemplate);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateDocTemplateResources(
				docTemplate, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getDocTemplate(docTemplate.getDocTemplateId());
	}
	
	public void updateDocTemplateResources(
			DocTemplate docTemplate, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			docTemplate.getCompanyId(), serviceContext.getScopeGroupId(),
			DocTemplate.class.getName(), docTemplate.getDocTemplateId(), groupPermissions,
			guestPermissions);
	}
	

	/** 
	 * Xóa thông tin biểu mẫu tài liệu
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param docTemplate đối tượng biểu mẫu cần xóa
	 * @return
	 */
	public void removeDocTemplate(DocTemplate docTemplate) throws PortalException, SystemException {
		docTemplatePersistence.remove(docTemplate);
		resourceLocalService.deleteResource(docTemplate.getCompanyId(), DocTemplate.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, docTemplate.getDocTemplateId());
	}
	
	/** 
	 * Xóa thông tin biểu mẫu tài liệu
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param id mã tự tăng biểu mẫu cần xóa
	 * @return
	 */
	public void removeDocTemplate(long id) throws PortalException, SystemException {
		DocTemplate docTemplate = docTemplatePersistence.findByPrimaryKey(id);
		removeDocTemplate(docTemplate);
	}
	
	/** 
	 * Thông tin biểu mẫu tài liệu
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param id mã biểu mẫu tài liệu
	 * @return
	 */
	public DocTemplate getDocTemplate(long id) throws PortalException, SystemException {
		return docTemplatePersistence.findByPrimaryKey(id);
	}

	public void addDocTemplateResources(DocTemplate docTemplate, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(docTemplate.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DocTemplate.class.getName(), docTemplate.getDocTemplateId(), false, addGroupPermission, addGuestPermission);
	}

	public void addDocTemplateResources(DocTemplate docTemplate, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(docTemplate.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DocTemplate.class.getName(), docTemplate.getDocTemplateId(), groupPermissions, guestPermissions);
	}
	
	public void addDocTemplateResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		DocTemplate docTemplate = docTemplatePersistence.findByPrimaryKey(id);
		addDocTemplateResources(docTemplate, groupPermissions, guestPermissions, serviceContext);
	}
	
	protected void validate(String templateNo) throws PortalException {
		if (Validator.isNull(templateNo)) {
			throw new TemplateNoException();
		}
	}
	
	/** 
	 * Tìm kiếm biểu mẫu tài liệu có tiêu đề gần giống
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param title tiêu đề biểu mẫu
	 * @param startIndex chỉ số bắt đầu
	 * @param endIndex chỉ số kết thúc
	 * @param serviceContext ngữ cảnh dữ liệu
	 * @return danh sách biểu mẫu tài liệu
	 */
	public List<DocTemplate> findByLikeTitle(String title, int startIndex, int endIndex, ServiceContext serviceContext) throws SystemException {
		return docTemplateFinder.findByLikeTitle(title, startIndex, endIndex, serviceContext);
	}
	
	public int countByLikeTitle(String title, ServiceContext serviceContext) throws SystemException {
		return docTemplateFinder.countByLikeTitle(title, serviceContext);
	}
	
	/** 
	 * Tìm kiếm biểu mẫu tài liệu có tiêu đề gần giống trong một nhóm nào đó
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param title tiêu đề biểu mẫu
	 * @param startIndex chỉ số bắt đầu
	 * @param endIndex chỉ số kết thúc
	 * @param serviceContext ngữ cảnh dữ liệu
	 * @return danh sách biểu mẫu tài liệu
	 */
	public List<DocTemplate> findByGroupLikeTitle(String title, int startIndex, int endIndex, ServiceContext serviceContext) throws SystemException {
		return docTemplateFinder.findByGroupLikeTitle(title, startIndex, endIndex, serviceContext);
	}
	
	public int countByGroupLikeTitle(String title, ServiceContext serviceContext) throws SystemException {
		return docTemplateFinder.countByGroupLikeTitle(title, serviceContext);
	}
	private static Log _log = LogFactoryUtil.getLog(DocTemplateLocalServiceImpl.class);
	
}