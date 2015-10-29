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

import org.oep.core.dossiermgt.model.DossierFolder;
import org.oep.core.dossiermgt.service.base.DossierFolderLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * API cung cấp các thao tác với UI xem danh sách hồ sơ.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.dossiermgt.service.DossierFolderLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.base.DossierFolderLocalServiceBaseImpl
 * @see org.oep.core.dossiermgt.service.DossierFolderLocalServiceUtil
 */
public class DossierFolderLocalServiceImpl
	extends DossierFolderLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.dossiermgt.service.DossierFolderLocalServiceUtil} to access the dossier folder local service.
	 */
	
	/** 
	 * Thêm UI xem danh sách hồ sơ
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param folderName tên UI xem danh sách hồ sơ
	 * @param parentDossierFolderId mã của UI xem danh sách hồ sơ cha
	 * @param sequenceNo số thứ tự UI xem danh sách hồ sơ
	 * @param procedureFilter điều kiện lọc theo thủ tục hành chính, các mã cách nhau bởi dấu ;
	 * @param statusFilter điều kiện lọc theo trạng thái
	 * @param tagFilter điều kiện lọc theo tag
	 * @param filterByOrganization lọc hồ sơ theo tổ chức mà người dùng thuộc về
	 * @param filterByUser lọc hồ sơ chỉ do người dùng tạo ra
	 * @param orderBy điều kiện sắp xếp của các hồ sơ
	 * @param counting cờ đánh dấu đếm số hồ sơ trên menu
	 * @return: new dossier folder
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public DossierFolder addDossierFolder(
			String folderName,
			long parentDossierFolderId,
			int sequenceNo,
			String procedureFilter,
			String statusFilter,
			String tagFilter,
			int filterByOrganization,
			int filterByUser,
			String orderBy,
			int counting,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate();
		long id = counterLocalService.increment();
		DossierFolder dossierFolder = dossierFolderPersistence.create(id);
		Date now = new Date();
				
		dossierFolder.setCompanyId(serviceContext.getCompanyId());
		dossierFolder.setCreateDate(serviceContext.getCreateDate(now));
		dossierFolder.setFolderName(folderName);
		dossierFolder.setParentDossierFolderId(parentDossierFolderId);
		dossierFolder.setSequenceNo(sequenceNo);
		dossierFolder.setProcedureFilter(procedureFilter);
		dossierFolder.setStatusFilter(statusFilter);
		dossierFolder.setTagFilter(tagFilter);
		dossierFolder.setFilterByOrganization(filterByOrganization);
		dossierFolder.setFilterByUser(filterByUser);
		dossierFolder.setOrderBy(orderBy);
		dossierFolder.setCounting(counting);
		
		dossierFolderPersistence.update(dossierFolder);

		if (_log.isInfoEnabled()) {
			_log.info("Create new dossier proc " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addDossierFolderResources(dossierFolder, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addDossierFolderResources(dossierFolder, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getDossierFolder(id);
	}

	@Indexable(type = IndexableType.REINDEX)
	public DossierFolder updateDossierFolder(
			long id, 
			String folderName,
			long parentDossierFolderId,
			int sequenceNo,
			String procedureFilter,
			String statusFilter,
			String tagFilter,
			int filterByOrganization,
			int filterByUser,
			String orderBy,
			int counting,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		validate();

		DossierFolder dossierFolder = dossierFolderPersistence.findByPrimaryKey(id);

		dossierFolder.setModifiedDate(serviceContext.getModifiedDate(null));
		dossierFolder.setFolderName(folderName);
		dossierFolder.setParentDossierFolderId(parentDossierFolderId);
		dossierFolder.setSequenceNo(sequenceNo);
		dossierFolder.setProcedureFilter(procedureFilter);
		dossierFolder.setStatusFilter(statusFilter);
		dossierFolder.setTagFilter(tagFilter);
		dossierFolder.setFilterByOrganization(filterByOrganization);
		dossierFolder.setFilterByUser(filterByUser);
		dossierFolder.setOrderBy(orderBy);
		dossierFolder.setCounting(counting);

		dossierFolderPersistence.update(dossierFolder);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateDossierFolderResources(
				dossierFolder, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getDossierFolder(dossierFolder.getDossierFolderId());
	}
	
	public void updateDossierFolderResources(
			DossierFolder dossierFolder, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			dossierFolder.getCompanyId(), serviceContext.getScopeGroupId(),
			DossierFolder.class.getName(), dossierFolder.getDossierFolderId(), groupPermissions,
			guestPermissions);
	}
	
	public void removeDossierFolder(DossierFolder dossierFolder) throws PortalException, SystemException {
		dossierFolderPersistence.remove(dossierFolder);
		resourceLocalService.deleteResource(dossierFolder.getCompanyId(), DossierFolder.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, dossierFolder.getDossierFolderId());
	}
	
	public void removeDossierFolder(long id) throws PortalException, SystemException {
		DossierFolder dossierFolder = dossierFolderPersistence.findByPrimaryKey(id);
		removeDossierFolder(dossierFolder);
	}
	
	public DossierFolder getDossierFolder(long id) throws PortalException, SystemException {
		return dossierFolderPersistence.findByPrimaryKey(id);
	}

	public void addDossierFolderResources(DossierFolder dossierFolder, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(dossierFolder.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DossierFolder.class.getName(), dossierFolder.getDossierFolderId(), false, addGroupPermission, addGuestPermission);
	}

	public void addDossierFolderResources(DossierFolder dossierFolder, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(dossierFolder.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DossierFolder.class.getName(), dossierFolder.getDossierFolderId(), groupPermissions, guestPermissions);
	}
	
	public void addDossierFolderResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		DossierFolder dossierFolder = dossierFolderPersistence.findByPrimaryKey(id);
		addDossierFolderResources(dossierFolder, groupPermissions, guestPermissions, serviceContext);
	}
	
	protected void validate() throws PortalException {
	}
	
	private static Log _log = LogFactoryUtil.getLog(DossierFolderLocalServiceImpl.class);
	
}