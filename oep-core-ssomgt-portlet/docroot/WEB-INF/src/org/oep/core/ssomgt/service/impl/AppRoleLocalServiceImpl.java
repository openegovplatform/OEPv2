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

package org.oep.core.ssomgt.service.impl;

import java.util.Date;
import java.util.List;

import org.oep.core.ssomgt.model.AppRole;
import org.oep.core.ssomgt.service.base.AppRoleLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * API cung cấp các thao tác với dữ liệu quyền truy cập vào ứng dụng.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.ssomgt.service.AppRoleLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.core.ssomgt.service.base.AppRoleLocalServiceBaseImpl
 * @see org.oep.core.ssomgt.service.AppRoleLocalServiceUtil
 */
public class AppRoleLocalServiceImpl extends AppRoleLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.ssomgt.service.AppRoleLocalServiceUtil} to access the app role local service.
	 */
	
	/** 
	 * Thêm mới một quyền truy cập ứng dụng
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param applicationId mã ứng dụng
	 * @param roleCode mã quyền truy cập ứng dụng
	 * @param roleName tên quyền truy cập
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: đối tượng quyền truy cập ứng dụng mới được thêm vào
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public AppRole addAppRole(
			long applicationId,
			String roleCode,
			String roleName,
			ServiceContext serviceContext) throws SystemException, PortalException {
		long id = counterLocalService.increment();
		AppRole appRole = appRolePersistence.create(id);
		Date now = new Date();
						
		appRole.setCompanyId(serviceContext.getCompanyId());
		appRole.setGroupId(serviceContext.getScopeGroupId());
		appRole.setUserId(serviceContext.getUserId());
		appRole.setCreateDate(serviceContext.getCreateDate(now));
		
		appRole.setApplicationId(applicationId);
		appRole.setRoleCode(roleCode);
		appRole.setRoleName(roleName);
		
		appRolePersistence.update(appRole);

		if (_log.isInfoEnabled()) {
			_log.info("Create new app role " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addAppRoleResources(appRole, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addAppRoleResources(appRole, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getAppRole(id);
	}
	
	/** 
	 * Cập nhật thông tin một quyền truy cập ứng dụng
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param id mã phân biệt của quyền truy cập ứng dụng
	 * @param applicationId mã ứng dụng
	 * @param roleCode mã quyền truy cập ứng dụng
	 * @param roleName tên quyền truy cập
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: đối tượng quyền truy cập ứng dụng mới được cập nhật
	 */
	@Indexable(type = IndexableType.REINDEX)
	public AppRole updateAppRole(
			long id, 
			long applicationId,
			String roleCode,
			String roleName,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		AppRole appRole = appRolePersistence.findByPrimaryKey(id);

		appRole.setApplicationId(applicationId);
		appRole.setRoleCode(roleCode);
		appRole.setRoleName(roleName);

		appRolePersistence.update(appRole);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateAppRoleResources(
				appRole, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getAppRole(appRole.getAppRoleId());
	}

	/** 
	 * Cập nhật thông tin một quyền truy cập ứng dụng được tích hợp trong cổng
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param appRole quyền truy cập ứng dụng cần cập nhật thông tin
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: đối tượng quyền truy cập ứng dụng mới được cập nhật thông tin
	 */
	@Indexable(type = IndexableType.REINDEX)
	public AppRole updateAppRole(
		AppRole appRole,
		ServiceContext serviceContext
		) throws PortalException, SystemException {
		return updateAppRole(appRole.getAppRoleId(), appRole.getApplicationId(), appRole.getRoleCode(), appRole.getRoleName(), serviceContext);
	}
	
	private void updateAppRoleResources(
			AppRole appRole, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			appRole.getCompanyId(), serviceContext.getScopeGroupId(),
			AppRole.class.getName(), appRole.getAppRoleId(), groupPermissions,
			guestPermissions);
	}
	
	/** 
	 * Xóa bỏ thông tin một quyền truy cập ứng dụng được tích hợp trong cổng
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param appRole quyền truy cập ứng dụng tích hợp sẽ bị xóa
	 * @return
	 */
	public void removeAppRole(AppRole appRole) throws PortalException, SystemException {
		appRolePersistence.remove(appRole);
		Indexer indexer = IndexerRegistryUtil.nullSafeGetIndexer(AppRole.class);
		indexer.delete(appRole);
		resourceLocalService.deleteResource(appRole.getCompanyId(), AppRole.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, appRole.getAppRoleId());
	}
	
	/** 
	 * Xóa bỏ thông tin một quyền truy cập ứng dụng được tích hợp trong cổng
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param id mã phân biệt quyền truy cập ứng dụng được tích hợp
	 * @return
	 */
	public void removeAppRole(long id) throws PortalException, SystemException {
		AppRole appRole = appRolePersistence.findByPrimaryKey(id);
		appRoleLocalService.removeAppRole(appRole);
	}
	
	public AppRole getAppRole(long id) throws PortalException, SystemException {
		return appRolePersistence.findByPrimaryKey(id);
	}

	private void addAppRoleResources(AppRole appRole, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(appRole.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), AppRole.class.getName(), appRole.getAppRoleId(), false, addGroupPermission, addGuestPermission);
	}

	private void addAppRoleResources(AppRole appRole, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(appRole.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), AppRole.class.getName(), appRole.getAppRoleId(), groupPermissions, guestPermissions);
	}
	
	protected void addAppRoleResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		AppRole appRole = appRolePersistence.findByPrimaryKey(id);
		addAppRoleResources(appRole, groupPermissions, guestPermissions, serviceContext);
	}
	
	public int countByCompany(long companyId) throws SystemException {
		return appRolePersistence.countByC(companyId);
	}
	
	public List<AppRole> findByCompany(long companyId) throws SystemException {
		return appRolePersistence.findByC(companyId);
	}
	
	public List<AppRole> findByCompany(long companyId, int startIndex, int endIndex) throws SystemException {
		return appRolePersistence.findByC(companyId, startIndex, endIndex);
	}
	
	public int countByCompany(ServiceContext serviceContext) throws SystemException {
		return appRolePersistence.countByC(serviceContext.getCompanyId());	
	}
	
	public List<AppRole> findByCompany(ServiceContext serviceContext) throws SystemException {
		return appRolePersistence.findByC(serviceContext.getCompanyId());
	}

	public List<AppRole> findByCompany(int startIndex, int endIndex, ServiceContext serviceContext) throws SystemException {
		return appRolePersistence.findByC(serviceContext.getCompanyId(), startIndex, endIndex);
	}
	
	public int countByCompanyGroup(long companyId, long groupId) throws SystemException {
		return appRolePersistence.countByC_G(companyId, groupId);
	}
	
	public List<AppRole> findByCompanyGroup(long companyId, long groupId) throws SystemException {
		return appRolePersistence.findByC_G(companyId, groupId);
	}

	public List<AppRole> findByCompanyGroup(long companyId, long groupId, int startIndex, int endIndex) throws SystemException {
		return appRolePersistence.findByC_G(companyId, groupId, startIndex, endIndex);
	}
	
	public int countByCompanyGroup(ServiceContext serviceContext) throws SystemException {
		return appRolePersistence.countByC_G(serviceContext.getCompanyId(), serviceContext.getScopeGroupId());		
	}

	public List<AppRole> findByCompanyGroup(ServiceContext serviceContext) throws SystemException {
		return appRolePersistence.findByC_G(serviceContext.getCompanyId(), serviceContext.getScopeGroupId());
	}

	public List<AppRole> findByCompanyGroup(int startIndex, int endIndex, ServiceContext serviceContext) throws SystemException {
		return appRolePersistence.findByC_G(serviceContext.getCompanyId(), serviceContext.getScopeGroupId(), startIndex, endIndex);		
	}
	
	public int countByCompanyGroupApplication(long companyId, long groupId, long applicationId) throws SystemException {
		return appRolePersistence.countByC_G_A(companyId, groupId, applicationId);
	}
	
	public int countByCompanyGroupApplication(long applicationId, ServiceContext serviceContext) throws SystemException {
		return appRolePersistence.countByC_G_A(serviceContext.getCompanyId(), serviceContext.getScopeGroupId(), applicationId);
	}
	
	public List<AppRole> findByCompanyGroupApplication(long companyId, long groupId, long applicationId) throws SystemException {
		return appRolePersistence.findByC_G_A(companyId, groupId, applicationId);
	}
	
	public List<AppRole> findByCompanyGroupApplication(long applicationId, ServiceContext serviceContext) throws SystemException {
		return appRolePersistence.findByC_G_A(serviceContext.getCompanyId(), serviceContext.getScopeGroupId(), applicationId);
	}
	
	public List<AppRole> findByCompanyGroupApplication(long companyId, long groupId, long applicationId, int startIndex, int endIndex) throws SystemException {
		return appRolePersistence.findByC_G_A(companyId, groupId, applicationId, startIndex, endIndex);
	}
	
	public List<AppRole> findByCompanyGroupApplication(long applicationId, int startIndex, int endIndex, ServiceContext serviceContext) throws SystemException {
		return appRolePersistence.findByC_G_A(serviceContext.getCompanyId(), serviceContext.getScopeGroupId(), applicationId, startIndex, endIndex);
	}
	
	private static Log _log = LogFactoryUtil.getLog(AppRoleLocalServiceImpl.class);	
	
}