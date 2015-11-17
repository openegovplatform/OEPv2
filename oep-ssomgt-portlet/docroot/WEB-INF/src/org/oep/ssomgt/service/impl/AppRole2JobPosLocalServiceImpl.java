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

package org.oep.ssomgt.service.impl;

import java.util.Date;
import java.util.List;

import org.oep.ssomgt.model.AppRole2JobPos;
import org.oep.ssomgt.service.base.AppRole2JobPosLocalServiceBaseImpl;

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
 * API cung cấp các thao tác với dữ liệu vai trò theo vị trí công tác.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.ssomgt.service.AppRole2JobPos2JobPosLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.ssomgt.service.base.AppRole2JobPos2JobPosLocalServiceBaseImpl
 * @see org.oep.ssomgt.service.AppRole2JobPos2JobPosLocalServiceUtil
 */
public class AppRole2JobPosLocalServiceImpl
	extends AppRole2JobPosLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.ssomgt.service.AppRole2JobPos2JobPosLocalServiceUtil} to access the app role2 job pos local service.
	 */
	
	/** 
	 * Thêm mới một vai trò truy cập cho vị trí công tác
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param appRoleId mã vai trò ứng dụng
	 * @param jobPosId mã vị trí công tác
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: đối tượng vai trò truy cập vị trí công tác mới được thêm vào
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public AppRole2JobPos addAppRole2JobPos(
			long appRoleId,
			long jobPosId,
			ServiceContext serviceContext) throws SystemException, PortalException {
		long id = counterLocalService.increment();
		AppRole2JobPos appRole2JobPos = appRole2JobPosPersistence.create(id);
		Date now = new Date();
						
		appRole2JobPos.setCompanyId(serviceContext.getCompanyId());
		appRole2JobPos.setGroupId(serviceContext.getScopeGroupId());
		appRole2JobPos.setUserId(serviceContext.getUserId());
		appRole2JobPos.setCreateDate(serviceContext.getCreateDate(now));
		
		appRole2JobPos.setAppRoleId(appRoleId);
		appRole2JobPos.setJobPosId(jobPosId);
		
		appRole2JobPosPersistence.update(appRole2JobPos);

		if (_log.isInfoEnabled()) {
			_log.info("Create new app role 2 job pos " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addAppRole2JobPosResources(appRole2JobPos, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addAppRole2JobPosResources(appRole2JobPos, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getAppRole2JobPos(id);
	}
	
	/** 
	 * Cập nhật thông tin một vai trò truy cập ứng dụng theo vị trí công tác
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param id mã phân biệt vai trò truy cập ứng dụng theo vị trí công tác
	 * @param appRoleId mã vai trò ứng dụng
	 * @param jobPosId mã vị trí công tác
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: đối tượng vai trò truy cập ứng dụng theo vị trí công tác mới được cập nhật
	 */
	@Indexable(type = IndexableType.REINDEX)
	public AppRole2JobPos updateAppRole2JobPos(
			long id, 
			long appRoleId,
			long jobPosId,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		AppRole2JobPos appRole2JobPos = appRole2JobPosPersistence.findByPrimaryKey(id);

		appRole2JobPos.setAppRoleId(appRoleId);
		appRole2JobPos.setJobPosId(jobPosId);

		appRole2JobPosPersistence.update(appRole2JobPos);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateAppRole2JobPosResources(
				appRole2JobPos, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getAppRole2JobPos(appRole2JobPos.getAppRole2JobPosId());
	}

	/** 
	 * Cập nhật thông tin một vai trò truy cập ứng dụng theo vị trí công tác
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param appRole2JobPos vai trò truy cập ứng dụng theo vị trí công tác cần cập nhật thông tin
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: đối tượng vai trò truy cập ứng dụng theo vị trí công tác mới được cập nhật thông tin
	 */
	@Indexable(type = IndexableType.REINDEX)
	public AppRole2JobPos updateAppRole2JobPos(
		AppRole2JobPos appRole2JobPos,
		ServiceContext serviceContext
		) throws PortalException, SystemException {
		return updateAppRole2JobPos(appRole2JobPos.getAppRole2JobPosId(), appRole2JobPos.getAppRoleId(), appRole2JobPos.getJobPosId(), serviceContext);
	}
	
	private void updateAppRole2JobPosResources(
			AppRole2JobPos appRole2JobPos, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			appRole2JobPos.getCompanyId(), serviceContext.getScopeGroupId(),
			AppRole2JobPos.class.getName(), appRole2JobPos.getAppRole2JobPosId(), groupPermissions,
			guestPermissions);
	}
	
	/** 
	 * Xóa bỏ thông tin một vai trò truy cập ứng dụng theo vị trí công tác được tích hợp trong cổng
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param appRole2JobPos vai trò truy cập ứng dụng theo vị trí công tác sẽ bị xóa
	 * @return
	 */
	public void removeAppRole2JobPos(AppRole2JobPos appRole2JobPos) throws PortalException, SystemException {
		appRole2JobPosPersistence.remove(appRole2JobPos);
		Indexer indexer = IndexerRegistryUtil.nullSafeGetIndexer(AppRole2JobPos.class);
		indexer.delete(appRole2JobPos);
		resourceLocalService.deleteResource(appRole2JobPos.getCompanyId(), AppRole2JobPos.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, appRole2JobPos.getAppRole2JobPosId());
	}
	
	/** 
	 * Xóa bỏ thông tin một vai trò truy cập ứng dụng được tích hợp trong cổng
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param id mã phân biệt vai trò truy cập ứng dụng theo vị trí công tác
	 * @return
	 */
	public void removeAppRole2JobPos(long id) throws PortalException, SystemException {
		AppRole2JobPos appRole2JobPos = appRole2JobPosPersistence.findByPrimaryKey(id);
		appRole2JobPosLocalService.removeAppRole2JobPos(appRole2JobPos);
	}
	
	public AppRole2JobPos getAppRole2JobPos(long id) throws PortalException, SystemException {
		return appRole2JobPosPersistence.findByPrimaryKey(id);
	}

	private void addAppRole2JobPosResources(AppRole2JobPos appRole2JobPos, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(appRole2JobPos.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), AppRole2JobPos.class.getName(), appRole2JobPos.getAppRole2JobPosId(), false, addGroupPermission, addGuestPermission);
	}

	private void addAppRole2JobPosResources(AppRole2JobPos appRole2JobPos, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(appRole2JobPos.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), AppRole2JobPos.class.getName(), appRole2JobPos.getAppRole2JobPosId(), groupPermissions, guestPermissions);
	}
	
	protected void addAppRole2JobPosResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		AppRole2JobPos appRole2JobPos = appRole2JobPosPersistence.findByPrimaryKey(id);
		addAppRole2JobPosResources(appRole2JobPos, groupPermissions, guestPermissions, serviceContext);
	}
	
	public int countAppRoleByJobPos(long companyId, long[] jobPosIds) throws SystemException {
		return appRole2JobPosPersistence.countByC_InJobPos(companyId, jobPosIds);
	}
	
	public int countAppRoleByJobPos(long[] jobPosIds, ServiceContext serviceContext) throws SystemException {
		return appRole2JobPosPersistence.countByC_InJobPos(serviceContext.getCompanyId(), jobPosIds);
	}
	
	public List<AppRole2JobPos> findAppRoleByJobPos(long companyId, long[] jobPosIds) throws SystemException {
		return appRole2JobPosPersistence.findByC_InJobPos(companyId, jobPosIds);
	}
	public List<AppRole2JobPos> findAppRoleByJobPos(ServiceContext serviceContext, long[] jobPosIds) throws SystemException {
		return appRole2JobPosPersistence.findByC_InJobPos(serviceContext.getCompanyId(), jobPosIds);
	}

	public int countAppRoleCGByJobPos(long companyId, long groupId, long[] jobPosIds) throws SystemException {
		return appRole2JobPosPersistence.countByC_G_InJobPos(companyId, groupId, jobPosIds);
	}
	
	public int countAppRoleCGByJobPos(long[] jobPosIds, ServiceContext serviceContext) throws SystemException {
		return appRole2JobPosPersistence.countByC_G_InJobPos(serviceContext.getCompanyId(), serviceContext.getScopeGroupId(), jobPosIds);
	}
	
	public List<AppRole2JobPos> findAppRoleCGByJobPos(long companyId, long groupId, long[] jobPosIds) throws SystemException {
		return appRole2JobPosPersistence.findByC_G_InJobPos(companyId, groupId, jobPosIds);
	}
	public List<AppRole2JobPos> findAppRoleCGByJobPos(ServiceContext serviceContext, long[] jobPosIds) throws SystemException {
		return appRole2JobPosPersistence.findByC_G_InJobPos(serviceContext.getCompanyId(), serviceContext.getScopeGroupId(), jobPosIds);
	}
	
	public int countByWorkingUnit(long workingUnitId, ServiceContext serviceContext) throws SystemException {
		return appRole2JobPosFinder.countByWorkingUnit(workingUnitId, serviceContext);
	}
	
	public List<AppRole2JobPos> findByWorkingUnit(long workingUnitId, int startIndex, int endIndex, ServiceContext serviceContext) throws SystemException {
		return appRole2JobPosFinder.findByWorkingUnit(workingUnitId, startIndex, endIndex, serviceContext);
	}
	
	public int countByAppRoleWorkingUnit(long appRoleId, long workingUnitId, ServiceContext serviceContext) throws SystemException {
		return appRole2JobPosFinder.countByAppRoleWorkingUnit(appRoleId, workingUnitId, serviceContext);
	}
	
	public List<AppRole2JobPos> findByAppRoleWorkingUnit(long appRoleId, long workingUnitId, int startIndex, int endIndex, ServiceContext serviceContext) throws SystemException {
		return appRole2JobPosFinder.findByAppRoleWorkingUnit(appRoleId, workingUnitId, startIndex, endIndex, serviceContext);
	}
	private static Log _log = LogFactoryUtil.getLog(AppRole2JobPosLocalServiceImpl.class);	
	
}