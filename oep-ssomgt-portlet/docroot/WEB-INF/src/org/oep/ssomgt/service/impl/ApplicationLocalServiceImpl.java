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

import java.sql.Blob;
import java.util.Date;
import java.util.List;

import org.oep.ssomgt.AppCodeRangeLengthException;
import org.oep.ssomgt.AppNameRangeLengthException;
import org.oep.ssomgt.AppPinRangeLengthException;
import org.oep.ssomgt.AppUrlRangeLengthException;
import org.oep.ssomgt.DuplicateAppCodeException;
import org.oep.ssomgt.NoSuchApplicationException;
import org.oep.ssomgt.PublicKeyRangeLengthException;
import org.oep.ssomgt.model.Application;
import org.oep.ssomgt.util.StringUtil;
import org.oep.ssomgt.service.base.ApplicationLocalServiceBaseImpl;

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
 * API thao tác với dữ liệu ứng dụng tích hợp vào cổng thông tin điện tử.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.ssomgt.service.ApplicationLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.ssomgt.service.base.ApplicationLocalServiceBaseImpl
 * @see org.oep.ssomgt.service.ApplicationLocalServiceUtil
 */
public class ApplicationLocalServiceImpl extends ApplicationLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.ssomgt.service.ApplicationLocalServiceUtil} to access the application local service.
	 */
	
	/** 
	 * Thêm mới một ứng dụng tích hợp trong cổng
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param appCode mã duy nhất của ứng dụng
	 * @param appName tên ứng dụng
	 * @param appPin mã pin bảo mật ứng dụng
	 * @param appUrl địa chỉ url gốc để truy xuất vào ứng dụng
	 * @param appBigIcon lưu ảnh icon ứng dụng
	 * @param appSmallIcon lưu ảnh icon ứng dụng
	 * @param pingTime thời điểm ping cuối cùng của ứng dụng với hệ thống
	 * @param sequenceNo thứ tự quan trọng của ứng dụng trong hệ thống
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: đối tượng thủ tục hành chính mới được thêm vào
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public Application addApplication(
			String appCode,
			String appName,
			String appPin,
			String appUrl,
			Blob appBigIcon,
			Blob appSmallIcon,
			Date pingTime,
			int sequenceNo,
			String publicKey,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate(0, appCode, appName, appPin, appUrl, publicKey);
		
		long id = counterLocalService.increment();
		Application application = applicationPersistence.create(id);
		Date now = new Date();
						
		application.setCompanyId(serviceContext.getCompanyId());
		application.setGroupId(serviceContext.getScopeGroupId());
		application.setUserId(serviceContext.getUserId());
		application.setCreateDate(serviceContext.getCreateDate(now));
		application.setModifiedDate(serviceContext.getModifiedDate(now));
		
		application.setAppCode(appCode);
		application.setAppName(appName);
		application.setAppPin(appPin);
		application.setAppUrl(appUrl);
		application.setAppBigIcon(appBigIcon);
		application.setAppSmallIcon(appSmallIcon);
		application.setPingTime(pingTime);
		application.setSequenceNo(sequenceNo);
		application.setPublicKey(publicKey);
		
		applicationPersistence.update(application);

		if (_log.isInfoEnabled()) {
			_log.info("Create new application " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addApplicationResources(application, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addApplicationResources(application, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getApplication(id);
	}

	/** 
	 * Thêm mới một ứng dụng tích hợp trong cổng
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param appCode mã duy nhất của ứng dụng
	 * @param appName tên ứng dụng
	 * @param appPin mã pin bảo mật ứng dụng
	 * @param appUrl địa chỉ url gốc để truy xuất vào ứng dụng
	 * @param appBigIcon lưu ảnh icon ứng dụng
	 * @param appSmallIcon lưu ảnh icon ứng dụng
	 * @param pingTime thời điểm ping cuối cùng của ứng dụng với hệ thống
	 * @param sequenceNo thứ tự quan trọng của ứng dụng trong hệ thống
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: đối tượng thủ tục hành chính mới được thêm vào
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public Application addApplication(
			String appCode,
			String appName,
			String appPin,
			String appUrl,
			Date pingTime,
			String publicKey,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate(0, appCode, appName, appPin, appUrl, publicKey);
		
		long id = counterLocalService.increment();
		Application application = applicationPersistence.create(id);
		Date now = new Date();
						
		application.setCompanyId(serviceContext.getCompanyId());
		application.setGroupId(serviceContext.getScopeGroupId());
		application.setUserId(serviceContext.getUserId());
		application.setCreateDate(serviceContext.getCreateDate(now));
		application.setModifiedDate(serviceContext.getModifiedDate(now));
		
		application.setAppCode(appCode);
		application.setAppName(appName);
		application.setAppPin(appPin);
		application.setAppUrl(appUrl);
		application.setPingTime(pingTime);
		application.setPublicKey(publicKey);

		System.out.println("Get max");
		int sequenceNo = getMaxSequenceNo(serviceContext);
		
		application.setSequenceNo(sequenceNo + 1);
		
		System.out.println("Get max value: " + sequenceNo);
		
		applicationPersistence.update(application);

		if (_log.isInfoEnabled()) {
			_log.info("Create new application " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addApplicationResources(application, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addApplicationResources(application, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getApplication(id);
	}
	
	/** 
	 * Thêm mới một ứng dụng tích hợp trong cổng
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param appCode mã duy nhất của ứng dụng
	 * @param appName tên ứng dụng
	 * @param appPin mã pin bảo mật ứng dụng
	 * @param appUrl địa chỉ url gốc để truy xuất vào ứng dụng
	 * @param appBigIcon lưu ảnh icon ứng dụng
	 * @param appSmallIcon lưu ảnh icon ứng dụng
	 * @param pingTime thời điểm ping cuối cùng của ứng dụng với hệ thống
	 * @param sequenceNo thứ tự quan trọng của ứng dụng trong hệ thống
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: đối tượng thủ tục hành chính mới được thêm vào
	 */
	public Application addApplication(
			String appCode,
			String appName,
			String appPin,
			String appUrl,
			Blob appBigIcon,
			Blob appSmallIcon,
			Date pingTime,
			String publicKey,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate(0, appCode, appName, appPin, appUrl, publicKey);
		long id = counterLocalService.increment();
		Application application = applicationPersistence.create(id);
		Date now = new Date();
						
		application.setCompanyId(serviceContext.getCompanyId());
		application.setGroupId(serviceContext.getScopeGroupId());
		application.setUserId(serviceContext.getUserId());
		application.setCreateDate(serviceContext.getCreateDate(now));
		application.setModifiedDate(serviceContext.getModifiedDate(now));
		
		application.setAppCode(appCode);
		application.setAppName(appName);
		application.setAppPin(appPin);
		application.setAppUrl(appUrl);
		application.setAppBigIcon(appBigIcon);
		application.setAppSmallIcon(appSmallIcon);
		application.setPingTime(pingTime);
		application.setPublicKey(publicKey);
		
		int sequenceNo = getMaxSequenceNo(serviceContext);
		
		application.setSequenceNo(sequenceNo + 1);
		
		applicationPersistence.update(application);

		if (_log.isInfoEnabled()) {
			_log.info("Create new application " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addApplicationResources(application, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addApplicationResources(application, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getApplication(id);
	}
	
	/** 
	 * Cập nhật thông tin một ứng dụng tích hợp vào cổng
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param id mã phân biệt của ứng dụng trong cổng
	 * @param appCode mã duy nhất của ứng dụng
	 * @param appName tên ứng dụng
	 * @param appPin mã pin bảo mật ứng dụng
	 * @param appUrl địa chỉ url gốc để truy xuất vào ứng dụng
	 * @param appBigIcon lưu ảnh icon ứng dụng
	 * @param appSmallIcon lưu ảnh icon ứng dụng
	 * @param pingTime thời điểm ping cuối cùng của ứng dụng với hệ thống
	 * @param sequenceNo thứ tự quan trọng của ứng dụng trong hệ thống
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: đối tượng thủ tục hành chính mới được cập nhật
	 */
	public Application updateApplication(
			long id, 
			String appCode,
			String appName,
			String appPin,
			String appUrl,
			Blob appBigIcon,
			Blob appSmallIcon,
			Date pingTime,
			int sequenceNo,
			String publicKey,
			ServiceContext serviceContext)
		throws PortalException, SystemException {
		validate(id, appCode, appName, appPin, appUrl, publicKey);

		Application application = applicationPersistence.findByPrimaryKey(id);

		application.setModifiedDate(serviceContext.getModifiedDate(null));
		application.setAppCode(appCode);
		application.setAppName(appName);
		application.setAppPin(appPin);
		application.setAppUrl(appUrl);
		application.setAppBigIcon(appBigIcon);
		application.setAppSmallIcon(appSmallIcon);
		application.setPingTime(pingTime);
		application.setSequenceNo(sequenceNo);
		application.setPublicKey(publicKey);
		
		applicationPersistence.update(application);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateApplicationResources(
				application, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getApplication(application.getApplicationId());
	}

	/** 
	 * Cập nhật thông tin một ứng dụng tích hợp vào cổng
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param id mã phân biệt của ứng dụng trong cổng
	 * @param appCode mã duy nhất của ứng dụng
	 * @param appName tên ứng dụng
	 * @param appPin mã pin bảo mật ứng dụng
	 * @param appUrl địa chỉ url gốc để truy xuất vào ứng dụng
	 * @param appBigIcon lưu ảnh icon ứng dụng
	 * @param appSmallIcon lưu ảnh icon ứng dụng
	 * @param pingTime thời điểm ping cuối cùng của ứng dụng với hệ thống
	 * @param sequenceNo thứ tự quan trọng của ứng dụng trong hệ thống
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: đối tượng thủ tục hành chính mới được cập nhật
	 */
	public Application updateApplication(
			long id, 
			String appCode,
			String appName,
			String appPin,
			String appUrl,
			Blob appBigIcon,
			Blob appSmallIcon,
			Date pingTime,
			String publicKey,
			ServiceContext serviceContext)
		throws PortalException, SystemException {
		validate(id, appCode, appName, appPin, appUrl, publicKey);

		Application application = applicationPersistence.findByPrimaryKey(id);

		application.setModifiedDate(serviceContext.getModifiedDate(null));
		application.setAppCode(appCode);
		application.setAppName(appName);
		application.setAppPin(appPin);
		application.setAppUrl(appUrl);
		application.setAppBigIcon(appBigIcon);
		application.setAppSmallIcon(appSmallIcon);
		application.setPingTime(pingTime);
		application.setPublicKey(publicKey);
		
		applicationPersistence.update(application);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateApplicationResources(
				application, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getApplication(application.getApplicationId());
	}
	
	/** 
	 * Cập nhật thông tin một ứng dụng được tích hợp trong cổng
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param application thông tin ứng dụng cần cập nhật thông tin
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: đối tượng thông tin ứng dụng mới được cập nhật thông tin
	 */
	public Application updateApplication(
		Application application,
		ServiceContext serviceContext
		) throws PortalException, SystemException {
		return updateApplication(application.getApplicationId(), application.getAppCode(), application.getAppName(), application.getAppPin(), application.getAppUrl(), application.getAppBigIcon(), application.getAppSmallIcon(), application.getPingTime(), application.getSequenceNo(), application.getPublicKey(), serviceContext);
	}
	
	public Application getUpApplication(Application application, ServiceContext serviceContext) {
		List<Application> lstApps = applicationFinder.getUpApplication(application, serviceContext);
		if (lstApps.size() > 0) {
			return (Application)lstApps.get(0);
		}
		else {
			return null;
		}
	}

	public Application getDownApplication(Application application, ServiceContext serviceContext) {
		return applicationFinder.getDownApplication(application, serviceContext);
	}
	
	public Application up(Application application, ServiceContext serviceContext) throws SystemException, PortalException {
		Application upApp = getUpApplication(application, serviceContext);
		if (upApp == null)
			return application;
		int sequenceUp = upApp.getSequenceNo();
		int sequenceDown = application.getSequenceNo();
		Application upAppSave = getApplication(upApp.getApplicationId());
		
		upAppSave.setSequenceNo(sequenceDown);
		application.setSequenceNo(sequenceUp);
		
		updateApplication(application, serviceContext);
		updateApplication(upAppSave, serviceContext);
		
		return getApplication(application.getApplicationId());
	}

	public Application down(Application application, ServiceContext serviceContext) throws SystemException, PortalException {
		Application downApp = getDownApplication(application, serviceContext);
		if (downApp == null)
			return application;
		int sequenceUp = downApp.getSequenceNo();
		int sequenceDown = application.getSequenceNo();
		Application downAppSave = getApplication(downApp.getApplicationId());
		downAppSave.setSequenceNo(sequenceDown);
		application.setSequenceNo(sequenceUp);
		
		updateApplication(application, serviceContext);

		updateApplication(downAppSave, serviceContext);

		return getApplication(application.getApplicationId());
	}
	
	public Application ping(String appCode, String appPin) throws SystemException {
		Application application = null;
		try {
			application = applicationPersistence.findByAC_P(appCode, appPin);
			application.setPingTime(new Date());
			application = updateApplication(application);
		} catch (NoSuchApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			application = null;
		}
		
		return application;
	}
	
	private void updateApplicationResources(
			Application application, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			application.getCompanyId(), serviceContext.getScopeGroupId(),
			Application.class.getName(), application.getApplicationId(), groupPermissions,
			guestPermissions);
	}
	
	/** 
	 * Xóa bỏ thông tin một ứng dụng được tích hợp trong cổng
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param application ứng dụng tích hợp sẽ bị xóa
	 * @return
	 */
	public void removeApplication(Application application) throws PortalException, SystemException {
		applicationPersistence.remove(application);
		Indexer indexer = IndexerRegistryUtil.nullSafeGetIndexer(Application.class);
		indexer.delete(application);
		resourceLocalService.deleteResource(application.getCompanyId(), Application.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, application.getApplicationId());
	}
	
	/** 
	 * Xóa bỏ thông tin một ứng dụng được tích hợp trong cổng
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param id mã phân biệt ứng dụng được tích hợp
	 * @return
	 */
	public void removeApplication(long id) throws PortalException, SystemException {
		Application application = applicationPersistence.findByPrimaryKey(id);
		applicationLocalService.removeApplication(application);
	}
	
	public Application getApplication(long id) throws PortalException, SystemException {
		return applicationPersistence.findByPrimaryKey(id);
	}

	private void addApplicationResources(Application application, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(application.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), Application.class.getName(), application.getApplicationId(), false, addGroupPermission, addGuestPermission);
	}

	private void addApplicationResources(Application application, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(application.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), Application.class.getName(), application.getApplicationId(), groupPermissions, guestPermissions);
	}
	
	protected void addApplicationResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		Application application = applicationPersistence.findByPrimaryKey(id);
		addApplicationResources(application, groupPermissions, guestPermissions, serviceContext);
	}
	
	public int countByCompany(long companyId) throws SystemException {
		return applicationPersistence.countByC(companyId);
	}
	
	public List<Application> findByCompany(long companyId) throws SystemException {
		return applicationPersistence.findByC(companyId);
	}
	
	public List<Application> findByCompany(long companyId, int startIndex, int endIndex) throws SystemException {
		return applicationPersistence.findByC(companyId, startIndex, endIndex);
	}
	
	public int countByCompany(ServiceContext serviceContext) throws SystemException {
		return applicationPersistence.countByC(serviceContext.getCompanyId());	
	}
	
	public List<Application> findByCompany(ServiceContext serviceContext) throws SystemException {
		return applicationPersistence.findByC(serviceContext.getCompanyId());
	}

	public List<Application> findByCompany(int startIndex, int endIndex, ServiceContext serviceContext) throws SystemException {
		return applicationPersistence.findByC(serviceContext.getCompanyId(), startIndex, endIndex);
	}
	
	public int countByCompanyGroup(long companyId, long groupId) throws SystemException {
		return applicationPersistence.countByC_G(companyId, groupId);
	}
	
	public List<Application> findByCompanyGroup(long companyId, long groupId) throws SystemException {
		return applicationPersistence.findByC_G(companyId, groupId);
	}

	public List<Application> findByCompanyGroup(long companyId, long groupId, int startIndex, int endIndex) throws SystemException {
		return applicationPersistence.findByC_G(companyId, groupId, startIndex, endIndex);
	}
	
	public int countByCompanyGroup(ServiceContext serviceContext) throws SystemException {
		return applicationPersistence.countByC_G(serviceContext.getCompanyId(), serviceContext.getScopeGroupId());		
	}

	public List<Application> findByCompanyGroup(ServiceContext serviceContext) throws SystemException {
		return applicationPersistence.findByC_G(serviceContext.getCompanyId(), serviceContext.getScopeGroupId());
	}

	public List<Application> findByCompanyGroup(int startIndex, int endIndex, ServiceContext serviceContext) throws SystemException {
		return applicationPersistence.findByC_G(serviceContext.getCompanyId(), serviceContext.getScopeGroupId(), startIndex, endIndex);		
	}
	
	public Application getByAppCode(String appCode) throws SystemException, NoSuchApplicationException {
		return applicationPersistence.findByAC(appCode);
	}
	
	public int getMaxSequenceNo(ServiceContext serviceContext) {		
		return applicationFinder.getMaxSequenceNo(serviceContext);
	}
	
	public void validate(long applicationId, String appCode, String appName, String appPin, String appUrl, String publicKey) throws AppCodeRangeLengthException, AppPinRangeLengthException, AppNameRangeLengthException, AppUrlRangeLengthException, DuplicateAppCodeException, PublicKeyRangeLengthException {
		if (applicationId == 0) {
			System.out.println("Validate new application");
			Application app = null;
			try {
				app = applicationPersistence.fetchByAC(appCode);
				System.out.println("App code to fetch: " + appCode);
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			if (app != null) {
				System.out.println("Duplicate app code");
				throw new DuplicateAppCodeException();
			}
		}
		else {
			Application app = null;
			
			try {
				app = applicationPersistence.fetchByAC(appCode);
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (app != null && app.getApplicationId() != applicationId)
				throw new DuplicateAppCodeException();
			
		}
		if (StringUtil.isNullOrEmpty(appCode) || appCode.length() > MAX_APP_CODE_LENGTH) {
			throw new AppCodeRangeLengthException();
		}
		if (StringUtil.isNullOrEmpty(appPin) || (appPin.length() > MAX_APP_PIN_LENGTH)) 
			throw new AppPinRangeLengthException();
		if (StringUtil.isNullOrEmpty(appName) || (appName.length() > MAX_APP_NAME_LENGTH))
			throw new AppNameRangeLengthException();
		if (StringUtil.isNullOrEmpty(appUrl) || (appUrl.length() > MAX_APP_URL_LENGTH))
			throw new AppUrlRangeLengthException();
		if (StringUtil.isNullOrEmpty(publicKey) || (publicKey.length() > MAX_PUBLICKEY_LENGTH))
			throw new PublicKeyRangeLengthException();
	}
	
	private static final int MAX_APP_CODE_LENGTH = 30;
	private static final int MAX_APP_NAME_LENGTH = 100;
	private static final int MAX_APP_PIN_LENGTH = 30;
	private static final int MAX_APP_URL_LENGTH = 100;
	private static final int MAX_PUBLICKEY_LENGTH = 256;
	
	private static Log _log = LogFactoryUtil.getLog(ApplicationLocalServiceImpl.class);	
}