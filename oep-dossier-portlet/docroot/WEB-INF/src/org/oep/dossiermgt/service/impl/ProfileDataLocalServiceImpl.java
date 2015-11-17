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

import org.oep.dossiermgt.model.ProfileData;
import org.oep.dossiermgt.service.base.ProfileDataLocalServiceBaseImpl;

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
 * API thao tác với dữ liệu đệm để điền form trực tuyến cho người dùng hoặc tổ chức.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.dossiermgt.service.ProfileDataLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.dossiermgt.service.base.ProfileDataLocalServiceBaseImpl
 * @see org.oep.dossiermgt.service.ProfileDataLocalServiceUtil
 */
public class ProfileDataLocalServiceImpl extends ProfileDataLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.dossiermgt.service.ProfileDataLocalServiceUtil} to access the profile data local service.
	 */
	
	/** 
	 * Thêm mới một dữ liệu đệm
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param fieldName tên trường
	 * @param fieldValue giá trị của trường
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: tag hồ sơ mới được tạo
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public ProfileData addProfileData(
			String fieldName,
			String fieldValue,
			ServiceContext serviceContext) throws SystemException, PortalException {
		long id = counterLocalService.increment();
		ProfileData profileData = profileDataPersistence.create(id);
		Date now = new Date();
		
		profileData.setUserId(serviceContext.getUserId());
		profileData.setCompanyId(serviceContext.getCompanyId());
		profileData.setGroupId(serviceContext.getScopeGroupId());
		profileData.setCreateDate(serviceContext.getCreateDate(now));
		profileData.setFieldName(fieldName);
		profileData.setFieldValue(fieldValue);
		
		profileDataPersistence.update(profileData);

		if (_log.isInfoEnabled()) {
			_log.info("Create new profile data " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addProfileDataResources(profileData, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addProfileDataResources(profileData, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getProfileData(id);
	}
	
	/** 
	 * Cập nhật thông tin một dữ liệu đệm
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Cập nhật thông tin dữ liệu đệm
	 * @param id mã phân biệt dữ liệu đệm
	 * @param fieldName tên trường dữ liệu
	 * @param fieldValue giá trị trường dữ liệu
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: dữ liệu đệm mới được cập nhật thông tin
	 */
	@Indexable(type = IndexableType.REINDEX)
	public ProfileData updateProfileData(
			long id, 
			String fieldName,
			String fieldValue,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		ProfileData profileData = profileDataPersistence.findByPrimaryKey(id);
		profileData.setFieldName(fieldName);
		profileData.setFieldValue(fieldValue);
		profileData.setModifiedDate(serviceContext.getModifiedDate());
		
		profileDataPersistence.update(profileData);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateProfileDataResources(
				profileData, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getProfileData(profileData.getProfileDataId());
	}

	/** 
	 * Cập nhật thông tin một dữ liệu đệm
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Cập nhật thông tin dữ liệu đệm
	 * @param profileData dữ liệu đệm
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: đối tượng dữ liệu đệm mới được cập nhật thông tin
	 */
	@Indexable(type = IndexableType.REINDEX)
	public ProfileData updateProfileData(
		ProfileData profileData,
		ServiceContext serviceContext
		) throws PortalException, SystemException {
		return updateProfileData(profileData.getProfileDataId(), profileData.getFieldName(), profileData.getFieldValue(), serviceContext);
	}
	
	private void updateProfileDataResources(
			ProfileData profileData, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			profileData.getCompanyId(), serviceContext.getScopeGroupId(),
			ProfileData.class.getName(), profileData.getProfileDataId(), groupPermissions,
			guestPermissions);
	}
	
	/** 
	 * Xóa bỏ thông tin một dữ liệu đệm
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Xóa bỏ thông tin dữ liệu đệm
	 * @param profileData dữ liệu đệm được xóa
	 * @return
	 */
	public void removeProfileData(ProfileData profileData) throws PortalException, SystemException {
		profileDataPersistence.remove(profileData);
		Indexer indexer = IndexerRegistryUtil.nullSafeGetIndexer(ProfileData.class);
		indexer.delete(profileData);
		resourceLocalService.deleteResource(profileData.getCompanyId(), ProfileData.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, profileData.getProfileDataId());
	}
	
	/** 
	 * Xóa bỏ thông tin một dữ liệu đệm
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Xóa bỏ thông tin dữ liệu đệm
	 * @param id mã phân biệt dữ liệu đệm
	 * @return
	 */
	public void removeProfileData(long id) throws PortalException, SystemException {
		ProfileData profileData = profileDataPersistence.findByPrimaryKey(id);
		profileDataLocalService.removeProfileData(profileData);
	}
	
	public ProfileData getProfileData(long id) throws PortalException, SystemException {
		return profileDataPersistence.findByPrimaryKey(id);
	}

	private void addProfileDataResources(ProfileData profileData, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(profileData.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), ProfileData.class.getName(), profileData.getProfileDataId(), false, addGroupPermission, addGuestPermission);
	}

	private void addProfileDataResources(ProfileData profileData, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(profileData.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), ProfileData.class.getName(), profileData.getProfileDataId(), groupPermissions, guestPermissions);
	}
	
	protected void addProfileDataResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		ProfileData profileData = profileDataPersistence.findByPrimaryKey(id);
		addProfileDataResources(profileData, groupPermissions, guestPermissions, serviceContext);
	}
					
	private static Log _log = LogFactoryUtil.getLog(ProfileDataLocalServiceImpl.class);	
	
}