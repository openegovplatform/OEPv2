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
import java.util.List;

import org.oep.dossiermgt.model.EbPartnerShip;
import org.oep.dossiermgt.service.base.EbPartnerShipLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * API thao tác với dữ liệu service kết nối ứng dụng.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.dossiermgt.service.EbPartnerShipLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.dossiermgt.service.base.EbPartnerShipLocalServiceBaseImpl
 * @see org.oep.dossiermgt.service.EbPartnerShipLocalServiceUtil
 */
public class EbPartnerShipLocalServiceImpl
	extends EbPartnerShipLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.dossiermgt.service.EbPartnerShipLocalServiceUtil} to access the eb partner ship local service.
	 */
	
	/** 
	 * Thêm service kết nối ứng dụng
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param name tên service kết nối
	 * @param cpaId
	 * @param service
	 * @return: service kết nối ứng dụng vừa tạo
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public EbPartnerShip addEbPartnerShip(
			String name,
			String cpaId,
			String service,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate();
		long id = counterLocalService.increment();
		EbPartnerShip ebPartnerShip = ebPartnerShipPersistence.create(id);
		Date now = new Date();
				
		ebPartnerShip.setCompanyId(serviceContext.getCompanyId());
		ebPartnerShip.setGroupId(serviceContext.getScopeGroupId());
		ebPartnerShip.setCreateDate(serviceContext.getCreateDate(now));
		ebPartnerShip.setName(name);
		ebPartnerShip.setCpaId(cpaId);
		ebPartnerShip.setService(service);
		
		ebPartnerShipPersistence.update(ebPartnerShip);

		if (_log.isInfoEnabled()) {
			_log.info("Create new eb partnership " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addEbPartnerShipResources(ebPartnerShip, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addEbPartnerShipResources(ebPartnerShip, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getEbPartnerShip(id);
	}

	/** 
	 * Cập nhật service kết nối ứng dụng
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param name tên service kết nối
	 * @param cpaId
	 * @param service
	 * @return: service kết nối ứng dụng vừa cập nhật
	 */
	@Indexable(type = IndexableType.REINDEX)
	public EbPartnerShip updateEbPartnerShip(
			long id, 
			String name,
			String cpaId,
			String service,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		validate();

		EbPartnerShip ebPartnerShip = ebPartnerShipPersistence.findByPrimaryKey(id);

		ebPartnerShip.setName(name);
		ebPartnerShip.setCpaId(cpaId);
		ebPartnerShip.setService(service);

		ebPartnerShipPersistence.update(ebPartnerShip);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateEbPartnerShipResources(
				ebPartnerShip, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getEbPartnerShip(ebPartnerShip.getEbPartnerShipId());
	}
	
	public void updateEbPartnerShipResources(
			EbPartnerShip ebPartnerShip, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			ebPartnerShip.getCompanyId(), serviceContext.getScopeGroupId(),
			EbPartnerShip.class.getName(), ebPartnerShip.getEbPartnerShipId(), groupPermissions,
			guestPermissions);
	}
	
	public void removeEbPartnerShip(EbPartnerShip ebPartnerShip) throws PortalException, SystemException {
		ebPartnerShipPersistence.remove(ebPartnerShip);
		resourceLocalService.deleteResource(ebPartnerShip.getCompanyId(), EbPartnerShip.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, ebPartnerShip.getEbPartnerShipId());
	}
	
	public void removeEbPartnerShip(long id) throws PortalException, SystemException {
		EbPartnerShip ebPartnerShip = ebPartnerShipPersistence.findByPrimaryKey(id);
		removeEbPartnerShip(ebPartnerShip);
	}
	
	public EbPartnerShip getEbPartnerShip(long id) throws PortalException, SystemException {
		return ebPartnerShipPersistence.findByPrimaryKey(id);
	}

	public void addEbPartnerShipResources(EbPartnerShip ebPartnerShip, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(ebPartnerShip.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), EbPartnerShip.class.getName(), ebPartnerShip.getEbPartnerShipId(), false, addGroupPermission, addGuestPermission);
	}

	public void addEbPartnerShipResources(EbPartnerShip ebPartnerShip, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(ebPartnerShip.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), EbPartnerShip.class.getName(), ebPartnerShip.getEbPartnerShipId(), groupPermissions, guestPermissions);
	}
	
	public void addEbPartnerShipResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		EbPartnerShip ebPartnerShip = ebPartnerShipPersistence.findByPrimaryKey(id);
		addEbPartnerShipResources(ebPartnerShip, groupPermissions, guestPermissions, serviceContext);
	}
	
	protected void validate() throws PortalException {
	}
	
	public List<EbPartnerShip> findByLikeName(String name, int startIndex, int endIndex, ServiceContext serviceContext) throws SystemException {
		return ebPartnerShipFinder.findByLikeName(name, startIndex, endIndex, serviceContext);
	}
	
	public int countByLikeName(String name, ServiceContext serviceContext) throws SystemException {
		return ebPartnerShipFinder.countByLikeName(name, serviceContext);
	}
	
	public List<EbPartnerShip> findByGroupLikeName(String name, int startIndex, int endIndex, ServiceContext serviceContext) throws SystemException {
		return ebPartnerShipFinder.findByGroupLikeName(name, startIndex, endIndex, serviceContext);
	}
	
	public int countByGroupLikeName(String name, ServiceContext serviceContext) throws SystemException {
		return ebPartnerShipFinder.countByGroupLikeName(name, serviceContext);
	}
	
	private static Log _log = LogFactoryUtil.getLog(EbPartnerShipLocalServiceImpl.class);
	
}