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

import org.oep.ssomgt.model.UserSync;
import org.oep.ssomgt.service.base.UserSyncLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.service.ServiceContext;

/**
 * API cung cấp thao tác đồng bộ dữ liệu người dùng.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.ssomgt.service.UserSyncLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.ssomgt.service.base.UserSyncLocalServiceBaseImpl
 * @see org.oep.ssomgt.service.UserSyncLocalServiceUtil
 */
public class UserSyncLocalServiceImpl extends UserSyncLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.ssomgt.service.UserSyncLocalServiceUtil} to access the user sync local service.
	 */
	
	/** 
	 * Thêm mới một thông tin đồng bộ người dùng
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param applicationId mã phân biệt ứng dụng tích hợp
	 * @param employeeId mã cán bộ
	 * @param userId mã người sử dụng
	 * @param isAccessible trạng thái có quyền truy cập ứng dụng
	 * @param checkpoint điểm cập nhật mới nhất thông tin người dùng
	 * @param syncTime thời điểm được đồng bộ cuối
	 * @return: thông tin đồng bộ người dùng mới được thêm vào
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public UserSync addUserSync(
			long applicationId,
			long employeeId,
			long userId,
			String ssoUserName,
			String appUserName,
			String fullName,
			String email,
			String password,
			int accessibleStatus,
			String roles,
			Date checkpoint,
			Date syncTime) throws SystemException, PortalException {
		long id = counterLocalService.increment();
		UserSync userSync = userSyncPersistence.create(id);
		
		userSync.setApplicationId(applicationId);
		userSync.setEmployeeId(employeeId);
		userSync.setUserId(userId);
		userSync.setSsoUserName(ssoUserName);
		userSync.setAppUserName(appUserName);
		userSync.setFullName(fullName);
		userSync.setEmail(email);
		userSync.setPassword(password);
		userSync.setAccessibleStatus(accessibleStatus);
		userSync.setRoles(roles);
		userSync.setCheckpoint(checkpoint);
		userSync.setSyncTime(syncTime);
		
		userSyncPersistence.update(userSync);

		if (_log.isInfoEnabled()) {
			_log.info("Create new user sync " + id);
		}
		
		return getUserSync(id);
	}
	
	
	/** 
	 * Cập nhật thông tin đồng bộ người dùng
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param id mã phân biệt của thông tin đồng bộ
	 * @param applicationId mã phân biệt ứng dụng tích hợp
	 * @param employeeId mã cán bộ
	 * @param userId mã người sử dụng
	 * @param accessible trạng thái có quyền truy cập ứng dụng
	 * @param checkpoint điểm cập nhật mới nhất thông tin người dùng
	 * @param syncTime thời điểm được đồng bộ cuối
	 * @return: đối tượng thông tin đồng bộ mới được cập nhật
	 */
	@Indexable(type = IndexableType.REINDEX)
	public UserSync updateUserSync(
			long id, 
			long applicationId,
			long employeeId,
			long userId,
			String ssoUserName,
			String appUserName,
			String fullName,
			String email,
			String password,
			int accessibleStatus,
			String roles,
			Date checkpoint,
			Date syncTime)
		throws PortalException, SystemException {

		UserSync userSync = userSyncPersistence.findByPrimaryKey(id);

		userSync.setApplicationId(applicationId);
		userSync.setEmployeeId(employeeId);
		userSync.setUserId(userId);
		userSync.setSsoUserName(ssoUserName);
		userSync.setAppUserName(appUserName);
		userSync.setFullName(fullName);
		userSync.setEmail(email);
		userSync.setPassword(password);
		userSync.setAccessibleStatus(accessibleStatus);
		userSync.setRoles(roles);
		userSync.setCheckpoint(checkpoint);
		userSync.setSyncTime(syncTime);

		userSyncPersistence.update(userSync);

		return getUserSync(userSync.getUserSyncId());
	}

	/** 
	 * Cập nhật thông tin đồng bộ người dùng
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param userSync thông tin đồng bộ cần cập nhật thông tin
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: thông tin đồng bộ người dùng mới được cập nhật thông tin
	 */
	@Indexable(type = IndexableType.REINDEX)
	public UserSync updateUserSync(
		UserSync userSync,
		ServiceContext serviceContext
		) throws PortalException, SystemException {
		return updateUserSync(userSync.getUserSyncId(), userSync.getApplicationId(), userSync.getEmployeeId(), userSync.getUserId(), userSync.getSsoUserName(), userSync.getAppUserName(), userSync.getFullName(), userSync.getEmail(), userSync.getPassword(), userSync.getAccessibleStatus(), userSync.getRoles(), userSync.getCheckpoint(), userSync.getSyncTime());
	}	
	
	/** 
	 * Xóa bỏ thông tin một thông tin đồng bộ người dùng
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param userSync thông tin đồng bộ sẽ bị xóa
	 * @return
	 */
	public void removeUserSync(UserSync userSync) throws PortalException, SystemException {
		userSyncPersistence.remove(userSync);
		Indexer indexer = IndexerRegistryUtil.nullSafeGetIndexer(UserSync.class);
		indexer.delete(userSync);
	}
	
	/** 
	 * Xóa bỏ thông tin một thông điệp gửi tới người dùng
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param id mã phân biệt thông điệp
	 * @return
	 */
	public void removeUserSync(long id) throws PortalException, SystemException {
		UserSync userSync = userSyncPersistence.findByPrimaryKey(id);
		userSyncLocalService.removeUserSync(userSync);
	}
	
	public UserSync getUserSync(long id) throws PortalException, SystemException {
		return userSyncPersistence.findByPrimaryKey(id);
	}
	
	public List<UserSync> findByApplicationCheckPoint(long applicationId, Date checkpoint) throws SystemException {
		return userSyncPersistence.findByA_GtCP(applicationId, checkpoint);
	}
	
	public int countByApplicationSync(long applicationId, boolean isSync, ServiceContext serviceContext) throws SystemException {
		return userSyncFinder.countByApplicationSync(applicationId, isSync, serviceContext);
	}
	
	public List<UserSync> findByApplicationSync(long applicationId, boolean isSync, int startIndex, int endIndex, ServiceContext serviceContext) throws SystemException {
		return userSyncFinder.findByApplicationSync(applicationId, isSync, startIndex, endIndex, serviceContext);
	}
	private static Log _log = LogFactoryUtil.getLog(UserSyncLocalServiceImpl.class);	
	
}