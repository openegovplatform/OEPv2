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

import org.oep.ssomgt.model.AppMessage;
import org.oep.ssomgt.permission.SSOPermission;
import org.oep.ssomgt.service.base.AppMessageLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.security.auth.PrincipalThreadLocal;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.security.permission.PermissionCheckerFactoryUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;

/**
 * API cung cấp các thao tác với dữ liệu thông điệp gửi đến người dùng từ ứng dụng.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.ssomgt.service.AppMessageLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.ssomgt.service.base.AppMessageLocalServiceBaseImpl
 * @see org.oep.ssomgt.service.AppMessageLocalServiceUtil
 */
public class AppMessageLocalServiceImpl extends AppMessageLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.ssomgt.service.AppMessageLocalServiceUtil} to access the app message local service.
	 */

	/** 
	 * Thêm mới một thông điệp gửi tới người dùng
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param fromApplication mã của ứng dụng
	 * @param toUser người dùng nhận thông báo
	 * @param messageType kiểu thông điệp
	 * @param messageCode mã thông báo
	 * @param messageText thông điệp
	 * @param messageValue giá trị thông điệp
	 * @param messageUrl địa chỉ URL gửi thông điệp
	 * @param visitDate ngày người dùng xem thông điệp chung
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: thông điệp tới người dùng mới được thêm vào
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public AppMessage addAppMessage(
			String fromApplication,
			String toUser,
			String messageType,
			String messageCode,
			String messageText,
			String messageValue,
			String messageUrl,
			Date visitDate,
			ServiceContext serviceContext) throws SystemException, PortalException {
		long id = counterLocalService.increment();
		AppMessage appMessage = appMessagePersistence.create(id);
		Date now = new Date();
						
		appMessage.setCompanyId(serviceContext.getCompanyId());
		appMessage.setGroupId(serviceContext.getScopeGroupId());
		appMessage.setUserId(serviceContext.getUserId());
		appMessage.setCreateDate(serviceContext.getCreateDate(now));
		
		appMessage.setFromApplication(fromApplication);
		appMessage.setToUser(toUser);
		appMessage.setMessageType(messageType);
		appMessage.setMessageCode(messageCode);
		appMessage.setMessageText(messageText);
		appMessage.setMessageValue(messageValue);
		appMessage.setMessageUrl(messageUrl);
		appMessage.setVisitDate(visitDate);
		
		appMessagePersistence.update(appMessage);

		if (_log.isInfoEnabled()) {
			_log.info("Create new app message " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addAppMessageResources(appMessage, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addAppMessageResources(appMessage, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getAppMessage(id);
	}
	
	/** 
	 * Thêm mới một thông điệp gửi tới người dùng
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param fromApplication mã của ứng dụng
	 * @param toUser người dùng nhận thông báo
	 * @param messageType kiểu thông điệp
	 * @param messageCode mã thông báo
	 * @param messageText thông điệp
	 * @param messageValue giá trị thông điệp
	 * @param messageUrl địa chỉ URL gửi thông điệp
	 * @param visitDate ngày người dùng xem thông điệp chung
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: thông điệp tới người dùng mới được thêm vào
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public AppMessage addAppMessage(
			String fromApplication,
			Date createDate,
			String toUser,
			String messageType,
			String messageCode,
			String messageText,
			String messageValue,
			String messageUrl,
			ServiceContext serviceContext) throws SystemException, PortalException {
		long id = counterLocalService.increment();
		AppMessage appMessage = appMessagePersistence.create(id);
						
		appMessage.setCompanyId(serviceContext.getCompanyId());
		appMessage.setGroupId(serviceContext.getScopeGroupId());
		appMessage.setUserId(serviceContext.getUserId());
		appMessage.setCreateDate(createDate);
		
		appMessage.setFromApplication(fromApplication);
		appMessage.setToUser(toUser);
		appMessage.setMessageType(messageType);
		appMessage.setMessageCode(messageCode);
		appMessage.setMessageText(messageText);
		appMessage.setMessageValue(messageValue);
		appMessage.setMessageUrl(messageUrl);
	
		appMessagePersistence.update(appMessage);

		if (_log.isInfoEnabled()) {
			_log.info("Create new app message " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addAppMessageResources(appMessage, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addAppMessageResources(appMessage, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getAppMessage(id);
	}

	/** 
	 * Thêm mới một thông điệp gửi tới người dùng
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param fromApplication mã của ứng dụng
	 * @param toUser người dùng nhận thông báo
	 * @param messageType kiểu thông điệp
	 * @param messageCode mã thông báo
	 * @param messageText thông điệp
	 * @param messageValue giá trị thông điệp
	 * @param messageUrl địa chỉ URL gửi thông điệp
	 * @param visitDate ngày người dùng xem thông điệp chung
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: thông điệp tới người dùng mới được thêm vào
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public AppMessage addAppMessage(
			long userId,
			String fromApplication,
			Date createDate,
			String toUser,
			String messageType,
			String messageCode,
			String messageText,
			String messageValue,
			String messageUrl) throws SystemException, PortalException {
		long id = counterLocalService.increment();
		AppMessage appMessage = appMessagePersistence.create(id);
		
		User user = UserLocalServiceUtil.getUser(userId);
		
		appMessage.setCompanyId(user.getCompanyId());
		appMessage.setGroupId(user.getGroupId());
		appMessage.setUserId(userId);
		appMessage.setCreateDate(createDate);
		
		appMessage.setFromApplication(fromApplication);
		appMessage.setToUser(toUser);
		appMessage.setMessageType(messageType);
		appMessage.setMessageCode(messageCode);
		appMessage.setMessageText(messageText);
		appMessage.setMessageValue(messageValue);
		appMessage.setMessageUrl(messageUrl);
	
		appMessagePersistence.update(appMessage);

		if (_log.isInfoEnabled()) {
			_log.info("Create new app message " + id);
		}
		
		return getAppMessage(id);
	}

	
	/** 
	 * Cập nhật thông tin một thông điệp gửi tới người dùng
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param id mã phân biệt của thông điệp
	 * @param fromApplication mã của ứng dụng
	 * @param toUser người dùng nhận thông báo
	 * @param messageType kiểu thông điệp
	 * @param messageCode mã thông báo
	 * @param messageText thông điệp
	 * @param messageValue giá trị thông điệp
	 * @param messageUrl địa chỉ URL gửi thông điệp
	 * @param visitDate ngày người dùng xem thông điệp chung
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: đối tượng thông điệp mới được cập nhật
	 */
	@Indexable(type = IndexableType.REINDEX)
	public AppMessage updateAppMessage(
			long id, 
			String fromApplication,
			String toUser,
			String messageType,
			String messageCode,
			String messageText,
			String messageValue,
			String messageUrl,
			Date visitDate,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		AppMessage appMessage = appMessagePersistence.findByPrimaryKey(id);

		appMessage.setFromApplication(fromApplication);
		appMessage.setToUser(toUser);
		appMessage.setMessageType(messageType);
		appMessage.setMessageCode(messageCode);
		appMessage.setMessageText(messageText);
		appMessage.setMessageValue(messageValue);
		appMessage.setMessageUrl(messageUrl);
		appMessage.setVisitDate(visitDate);

		appMessagePersistence.update(appMessage);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateAppMessageResources(
				appMessage, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getAppMessage(appMessage.getAppMessageId());
	}

	/** 
	 * Cập nhật thông tin một thông điệp gửi tới người dùng
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param appMessage thông điệp cần cập nhật thông tin
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: thông điệp mới được cập nhật thông tin
	 */
	@Indexable(type = IndexableType.REINDEX)
	public AppMessage updateAppMessage(
		AppMessage appMessage,
		ServiceContext serviceContext
		) throws PortalException, SystemException {
		return updateAppMessage(appMessage.getAppMessageId(), appMessage.getFromApplication(), appMessage.getToUser(), appMessage.getMessageType(), appMessage.getMessageCode(), appMessage.getMessageText(), appMessage.getMessageValue(), appMessage.getMessageUrl(), appMessage.getVisitDate(), serviceContext);
	}
	
	private void updateAppMessageResources(
			AppMessage appMessage, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			appMessage.getCompanyId(), serviceContext.getScopeGroupId(),
			AppMessage.class.getName(), appMessage.getAppMessageId(), groupPermissions,
			guestPermissions);
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
	 * @param appMessage thông điệp sẽ bị xóa
	 * @return
	 */
	public void removeAppMessage(AppMessage appMessage) throws PortalException, SystemException {
		appMessagePersistence.remove(appMessage);
		Indexer indexer = IndexerRegistryUtil.nullSafeGetIndexer(AppMessage.class);
		indexer.delete(appMessage);
		resourceLocalService.deleteResource(appMessage.getCompanyId(), AppMessage.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, appMessage.getAppMessageId());
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
	public void removeAppMessage(long id) throws PortalException, SystemException {
		AppMessage appMessage = appMessagePersistence.findByPrimaryKey(id);
		appMessageLocalService.removeAppMessage(appMessage);
	}
	
	public AppMessage getAppMessage(long id) throws PortalException, SystemException {
		return appMessagePersistence.findByPrimaryKey(id);
	}

	private void addAppMessageResources(AppMessage appMessage, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(appMessage.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), AppMessage.class.getName(), appMessage.getAppMessageId(), false, addGroupPermission, addGuestPermission);
	}

	private void addAppMessageResources(AppMessage appMessage, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(appMessage.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), AppMessage.class.getName(), appMessage.getAppMessageId(), groupPermissions, guestPermissions);
	}
	
	protected void addAppMessageResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		AppMessage appMessage = appMessagePersistence.findByPrimaryKey(id);
		addAppMessageResources(appMessage, groupPermissions, guestPermissions, serviceContext);
	}
	
	public int countByCustomCondition(String fromApplication, String toUser, Date fromDate, Date toDate, String messageType, ServiceContext serviceContext)  throws SystemException {
		return appMessageFinder.countByCustomCondition(fromApplication, toUser, fromDate, toDate, messageType, serviceContext);
	}
	
	public List<AppMessage> findByCustomCondition(String fromApplication, String toUser, Date fromDate, Date toDate, String messageType, int startIndex, int endIndex, ServiceContext serviceContext) throws SystemException {
		return appMessageFinder.findByCustomCondition(fromApplication, toUser, fromDate, toDate, messageType, startIndex, endIndex, serviceContext);
	}
	
	public List<AppMessage> findByFromApplicationToUser(String fromApplication, String toUser) throws SystemException {
		return appMessagePersistence.findByFA_TU(fromApplication, toUser);
	}
	
	public List<AppMessage> findByFromApplicationToUserMessageType(String fromApplication, String toUser, String messageType) throws SystemException {
		_log.info(fromApplication + "," + toUser + "," + messageType);
		return appMessagePersistence.findByFA_TU_MT(fromApplication, toUser, messageType);
	}
	
	public int countByFromApplicationToUserMessageType(String fromApplication, String toUser, String messageType) throws SystemException {
		return appMessagePersistence.countByFA_TU_MT(fromApplication, toUser, messageType);
	}
	
	public List<AppMessage> findByFromApplicationToUserMessageType(String fromApplication, String toUser, String messageType, int startIndex, int endIndex) throws SystemException {
		return appMessagePersistence.findByFA_TU_MT(fromApplication, toUser, messageType, startIndex, endIndex);
	}
	
	public List<AppMessage> findByFromApplicationToUserNotMessageType(String fromApplication, String toUser, String messageType) throws SystemException {
		return appMessagePersistence.findByFA_TU_NotMT(fromApplication, toUser, messageType);
	}
	
	public int countByFromApplicationToUserNotMessageType(String fromApplication, String toUser, String messageType) throws SystemException {
		return appMessagePersistence.countByFA_TU_NotMT(fromApplication, toUser, messageType);
	}
	
	public List<AppMessage> findByFromApplicationToUserNotMessageType(String fromApplication, String toUser, String messageType, int startIndex, int endIndex) throws SystemException {
		return appMessagePersistence.findByFA_TU_NotMT(fromApplication, toUser, messageType, startIndex, endIndex);
	}
	
	public List<AppMessage> findByApplicationUser(String fromApplication, String toUser, ServiceContext serviceContext) throws SystemException {
		List<AppMessage> lstAppMessages = appMessageFinder.findByApplicationUser(fromApplication, toUser, serviceContext);
		List<AppMessage> lstTemp = appMessageFinder.findByApplicationUser(fromApplication, "everyone", serviceContext);
		for (AppMessage item : lstTemp) {
			boolean flag = true;
			for (AppMessage itemTemp : lstAppMessages) {
				if (itemTemp.getAppMessageId() == item.getAppMessageId()) {
					flag = false;
					break;
				}
			}
			if (flag) lstAppMessages.add(item);
		}
		
		PrincipalThreadLocal.setName(serviceContext.getUserId());
		User user;
		try {
			user = UserLocalServiceUtil.getUserById(serviceContext.getUserId());
			@SuppressWarnings("deprecation")
			PermissionChecker permissionChecker = PermissionCheckerFactoryUtil.create(user, false);
			if (SSOPermission.contains(permissionChecker, serviceContext.getScopeGroupId(), "ADMIN_SSOMGT")) {
				lstTemp = appMessageFinder.findByApplicationUser(fromApplication, "", serviceContext);
				for (AppMessage item : lstTemp) {
					boolean flag = true;
					for (AppMessage itemTemp : lstAppMessages) {
						if (itemTemp.getAppMessageId() == item.getAppMessageId()) {
							flag = false;
							break;
						}
					}
					if (flag) lstAppMessages.add(item);
				}
			}
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lstAppMessages;
	}
	private static Log _log = LogFactoryUtil.getLog(AppMessageLocalServiceImpl.class);	

}