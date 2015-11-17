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

import org.oep.ssomgt.model.AppRole;
import org.oep.ssomgt.model.AppRole2Employee;
import org.oep.ssomgt.service.base.AppRole2EmployeeLocalServiceBaseImpl;

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
 * API cung cấp thao tác với dữ liệu quyền truy cập ứng dụng cho cán bộ.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.ssomgt.service.AppRole2EmployeeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.ssomgt.service.base.AppRole2EmployeeLocalServiceBaseImpl
 * @see org.oep.ssomgt.service.AppRole2EmployeeLocalServiceUtil
 */
public class AppRole2EmployeeLocalServiceImpl
	extends AppRole2EmployeeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.ssomgt.service.AppRole2EmployeeLocalServiceUtil} to access the app role2 employee local service.
	 */

	/** 
	 * Thêm mới một vai trò truy cập ứng dụng theo cán bộ
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param appRoleId mã vai trò ứng dụng
	 * @param employeeId mã cán bộ viên chức
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: đối tượng vai trò truy cập cho cán bộ mới được thêm vào
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public AppRole2Employee addAppRole2Employee(
			long appRoleId,
			long employeeId,
			ServiceContext serviceContext) throws SystemException, PortalException {
		long id = counterLocalService.increment();
		AppRole2Employee appRole2Employee = appRole2EmployeePersistence.create(id);
		Date now = new Date();
						
		appRole2Employee.setCompanyId(serviceContext.getCompanyId());
		appRole2Employee.setGroupId(serviceContext.getScopeGroupId());
		appRole2Employee.setUserId(serviceContext.getUserId());
		appRole2Employee.setCreateDate(serviceContext.getCreateDate(now));
		
		appRole2Employee.setAppRoleId(appRoleId);
		appRole2Employee.setEmployeeId(employeeId);
		
		appRole2EmployeePersistence.update(appRole2Employee);

		if (_log.isInfoEnabled()) {
			_log.info("Create new app role 2 employee " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addAppRole2EmployeeResources(appRole2Employee, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addAppRole2EmployeeResources(appRole2Employee, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getAppRole2Employee(id);
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
	 * @param employeeId mã cán bộ viên chức
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: đối tượng vai trò truy cập theo cán bộ mới được cập nhật
	 */
	@Indexable(type = IndexableType.REINDEX)
	public AppRole2Employee updateAppRole2Employee(
			long id, 
			long appRoleId,
			long employeeId,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		AppRole2Employee appRole2Employee = appRole2EmployeePersistence.findByPrimaryKey(id);

		appRole2Employee.setAppRoleId(appRoleId);
		appRole2Employee.setEmployeeId(employeeId);

		appRole2EmployeePersistence.update(appRole2Employee);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateAppRole2EmployeeResources(
				appRole2Employee, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getAppRole2Employee(appRole2Employee.getAppRole2EmployeeId());
	}

	/** 
	 * Cập nhật thông tin một vai trò truy cập ứng dụng cho cán bộ
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param appRole2Employee vai trò truy cập ứng dụng cho cán bộ cần cập nhật thông tin
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: đối tượng vai trò truy cập ứng dụng cho cán bộ mới được cập nhật thông tin
	 */
	@Indexable(type = IndexableType.REINDEX)
	public AppRole2Employee updateAppRole2Employee(
		AppRole2Employee appRole2Employee,
		ServiceContext serviceContext
		) throws PortalException, SystemException {
		return updateAppRole2Employee(appRole2Employee.getAppRole2EmployeeId(), appRole2Employee.getAppRoleId(), appRole2Employee.getEmployeeId(), serviceContext);
	}
	
	private void updateAppRole2EmployeeResources(
			AppRole2Employee appRole2Employee, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			appRole2Employee.getCompanyId(), serviceContext.getScopeGroupId(),
			AppRole2Employee.class.getName(), appRole2Employee.getAppRole2EmployeeId(), groupPermissions,
			guestPermissions);
	}
	
	/** 
	 * Xóa bỏ thông tin một vai trò truy cập ứng dụng cho cán bộ được tích hợp trong cổng
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param appRole2Employee vai trò truy cập ứng dụng cho cán bộ sẽ bị xóa
	 * @return
	 */
	public void removeAppRole2Employee(AppRole2Employee appRole2Employee) throws PortalException, SystemException {
		appRole2EmployeePersistence.remove(appRole2Employee);
		Indexer indexer = IndexerRegistryUtil.nullSafeGetIndexer(AppRole2Employee.class);
		indexer.delete(appRole2Employee);
		resourceLocalService.deleteResource(appRole2Employee.getCompanyId(), AppRole2Employee.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, appRole2Employee.getAppRole2EmployeeId());
	}
	
	/** 
	 * Xóa bỏ thông tin một vai trò truy cập ứng dụng cho cán bộ được tích hợp trong cổng
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param id mã phân biệt vai trò truy cập ứng dụng cho cán bộ
	 * @return
	 */
	public void removeAppRole2Employee(long id) throws PortalException, SystemException {
		AppRole2Employee appRole2Employee = appRole2EmployeePersistence.findByPrimaryKey(id);
		appRole2EmployeeLocalService.removeAppRole2Employee(appRole2Employee);
	}
	
	public AppRole2Employee getAppRole2Employee(long id) throws PortalException, SystemException {
		return appRole2EmployeePersistence.findByPrimaryKey(id);
	}

	private void addAppRole2EmployeeResources(AppRole2Employee appRole2Employee, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(appRole2Employee.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), AppRole2Employee.class.getName(), appRole2Employee.getAppRole2EmployeeId(), false, addGroupPermission, addGuestPermission);
	}

	private void addAppRole2EmployeeResources(AppRole2Employee appRole2Employee, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(appRole2Employee.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), AppRole2Employee.class.getName(), appRole2Employee.getAppRole2EmployeeId(), groupPermissions, guestPermissions);
	}
	
	protected void addAppRole2EmployeeResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		AppRole2Employee appRole2Employee = appRole2EmployeePersistence.findByPrimaryKey(id);
		addAppRole2EmployeeResources(appRole2Employee, groupPermissions, guestPermissions, serviceContext);
	}

	public int countByWorkingUnit(long workingUnitId, ServiceContext serviceContext) throws SystemException {
		return appRole2EmployeeFinder.countByWorkingUnit(workingUnitId, serviceContext);
	}
	
	public List<AppRole2Employee> findByWorkingUnit(long workingUnitId, int startIndex, int endIndex, ServiceContext serviceContext) throws SystemException {
		return appRole2EmployeeFinder.findByWorkingUnit(workingUnitId, startIndex, endIndex, serviceContext);
	}
	
	public int countByAppRoleWorkingUnit(long appRoleId, long workingUnitId, ServiceContext serviceContext) throws SystemException {
		return appRole2EmployeeFinder.countByAppRoleWorkingUnit(appRoleId, workingUnitId, serviceContext);
	}
	
	public List<AppRole2Employee> findByAppRoleWorkingUnit(long appRoleId, long workingUnitId, int startIndex, int endIndex, ServiceContext serviceContext) throws SystemException {
		return appRole2EmployeeFinder.findByAppRoleWorkingUnit(appRoleId, workingUnitId, startIndex, endIndex, serviceContext);
	}
	
	public List<AppRole> findRoleByEmployee(long employeeId, long companyId) throws SystemException {
		return appRole2EmployeeFinder.findRoleByEmployee(employeeId, companyId);
	}
	private static Log _log = LogFactoryUtil.getLog(AppRole2EmployeeLocalServiceImpl.class);	

}