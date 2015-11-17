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

package org.oep.processmgt.service.impl;

import java.util.Date;

import org.oep.processmgt.model.CreateFile;
import org.oep.processmgt.service.base.CreateFileLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * API cung cấp thao tác với dữ liệu vết hồ sơ.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.processmgt.service.CreateFileLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.processmgt.service.base.CreateFileLocalServiceBaseImpl
 * @see org.oep.processmgt.service.CreateFileLocalServiceUtil
 */
public class CreateFileLocalServiceImpl extends CreateFileLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.processmgt.service.CreateFileLocalServiceUtil} to access the create file local service.
	 */
	
	/** 
	 * Thêm vết hồ sơ được tạo ra tại các bước trong quy trình xử lý
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param dossierProcessId nằm trong quy trình nào
	 * @param dossierStepId nằm tại bước xử lý nào
	 * @param stepDate thời gian bắt đầu của bước
	 * @param docFileId file hồ sơ được tạo ra bởi form xử lý
	 * @return: vết hồ sơ của quy trình mới được tạo
	 */
	@Indexable(type = IndexableType.REINDEX)	
	@Transactional
	public CreateFile addCreateFile(
			long processOrderId,
			long dossierStepId,
			Date stepDate,
			long docFileId,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate();
		long id = counterLocalService.increment();
		CreateFile createFile = createFilePersistence.create(id);
		Date now = new Date();
		
		createFile.setUserId(serviceContext.getUserId());
		createFile.setGroupId(serviceContext.getScopeGroupId());
		createFile.setCompanyId(serviceContext.getCompanyId());
		createFile.setCreateDate(serviceContext.getCreateDate(now));
		createFile.setProcessOrderId(processOrderId);
		createFile.setDossierStepId(dossierStepId);
		createFile.setCreateDate(stepDate);
		createFile.setDocFileId(docFileId);
		
		createFilePersistence.update(createFile);

		if (_log.isInfoEnabled()) {
			_log.info("Create new create file " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addCreateFileResources(createFile, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addCreateFileResources(createFile, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getCreateFile(id);
	}

	/** 
	 * Cập nhật thông tin vết hồ sơ được tạo ra tại các bước trong quy trình xử lý
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param id mã vết hồ sơ tại các bước trong quy trình
	 * @param dossierProcessId nằm trong quy trình nào
	 * @param dossierStepId nằm tại bước xử lý nào
	 * @param stepDate thời gian bắt đầu của bước
	 * @param docFileId file hồ sơ được tạo ra bởi form xử lý
	 * @return: vết hồ sơ của quy trình mới được cập nhật
	 */
	@Indexable(type = IndexableType.REINDEX)
	public CreateFile updateCreateFile(
			long id, 
			long processOrderId,
			long dossierStepId,
			Date stepDate,
			long docFileId,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		validate();

		CreateFile createFile = createFilePersistence.findByPrimaryKey(id);
		createFile.setProcessOrderId(processOrderId);
		createFile.setDossierStepId(dossierStepId);
		createFile.setCreateDate(stepDate);
		createFile.setDocFileId(docFileId);
		
		createFilePersistence.update(createFile);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateCreateFileResources(
				createFile, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getCreateFile(createFile.getCreateFileId());
	}

	public void updateCreateFileResources(
			CreateFile createFile, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			createFile.getCompanyId(), serviceContext.getScopeGroupId(),
			CreateFile.class.getName(), createFile.getCreateFileId(), groupPermissions,
			guestPermissions);
	}
	
	public void removeCreateFile(CreateFile createFile) throws PortalException, SystemException {
		createFilePersistence.remove(createFile);
		resourceLocalService.deleteResource(createFile.getCompanyId(), CreateFile.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, createFile.getCreateFileId());
	}
	
	public void removeCreateFile(long id) throws PortalException, SystemException {
		CreateFile createFile = createFilePersistence.findByPrimaryKey(id);
		removeCreateFile(createFile);
	}
	
	public CreateFile getCreateFile(long id) throws PortalException, SystemException {
		return createFilePersistence.findByPrimaryKey(id);
	}

	public void addCreateFileResources(CreateFile createFile, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(createFile.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), CreateFile.class.getName(), createFile.getCreateFileId(), false, addGroupPermission, addGuestPermission);
	}

	public void addCreateFileResources(CreateFile createFile, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(createFile.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), CreateFile.class.getName(), createFile.getCreateFileId(), groupPermissions, guestPermissions);
	}
	
	public void addCreateFileResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		CreateFile createFile = createFilePersistence.findByPrimaryKey(id);
		addCreateFileResources(createFile, groupPermissions, guestPermissions, serviceContext);
	}
	
	protected void validate() throws PortalException {
	}
	
	private static Log _log = LogFactoryUtil.getLog(CreateFileLocalServiceImpl.class);
	
}