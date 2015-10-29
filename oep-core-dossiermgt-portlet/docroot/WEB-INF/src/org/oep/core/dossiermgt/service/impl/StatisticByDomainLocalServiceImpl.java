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

import org.oep.core.dossiermgt.model.StatisticByDomain;
import org.oep.core.dossiermgt.service.base.StatisticByDomainLocalServiceBaseImpl;

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
 * API cung cấp các thao tác với dữ liệu thống kê theo lĩnh vực.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.dossiermgt.service.StatisticByDomainLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.base.StatisticByDomainLocalServiceBaseImpl
 * @see org.oep.core.dossiermgt.service.StatisticByDomainLocalServiceUtil
 */
public class StatisticByDomainLocalServiceImpl
	extends StatisticByDomainLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.dossiermgt.service.StatisticByDomainLocalServiceUtil} to access the statistic by domain local service.
	 */
	
	/** 
	 * Thêm mới một thống kê hồ sơ theo lĩnh vực
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param month tháng thống kê
	 * @param year năm thống kê
	 * @param dossierDomain lĩnh vực hồ sơ theo cấp 1
	 * @param receiveNumber số hồ sơ được tiếp nhận
	 * @param onlineNumber số hồ sơ trực tuyến
	 * @param onlineRatio tỉ lệ hồ sơ trực tuyến
	 * @param finishNumber số hồ sơ được hoàn thành
	 * @param ontimeNumber số hồ sơ hoàn thành đúng hẹn
	 * @param ontimeRatio tỉ lệ hồ sơ hoàn thành đúng hẹn
	 * @param delayDaysAvg số ngày trễ hẹn trung bình
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: thống kê hồ sơ mới được tạo
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public StatisticByDomain addStatisticByDomain(
			int month,
			int year,
			String dossierDomain,
			int receiveNumber,
			int onlineNumber,
			double onlineRatio,
			int finishNumber,
			int ontimeNumber,
			double ontimeRatio,
			double delayDaysAvg,
			ServiceContext serviceContext) throws SystemException, PortalException {
		long id = counterLocalService.increment();
		StatisticByDomain statisticByDomain = statisticByDomainPersistence.create(id);
		Date now = new Date();
		
		statisticByDomain.setCompanyId(serviceContext.getCompanyId());
		statisticByDomain.setGroupId(serviceContext.getScopeGroupId());
		statisticByDomain.setCreateDate(serviceContext.getCreateDate(now));
		statisticByDomain.setMonth(month);
		statisticByDomain.setYear(year);
		statisticByDomain.setDossierDomain(dossierDomain);
		statisticByDomain.setReceiveNumber(receiveNumber);
		statisticByDomain.setOnlineNumber(onlineNumber);
		statisticByDomain.setOnlineRatio(onlineRatio);
		statisticByDomain.setFinishNumber(finishNumber);
		statisticByDomain.setOntimeNumber(ontimeNumber);
		statisticByDomain.setOnlineRatio(onlineRatio);
		statisticByDomain.setDelayDaysAvg(delayDaysAvg);
		
		statisticByDomainPersistence.update(statisticByDomain);

		if (_log.isInfoEnabled()) {
			_log.info("Create new statistic by domain " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addStatisticByDomainResources(statisticByDomain, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addStatisticByDomainResources(statisticByDomain, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getStatisticByDomain(id);
	}
	
	/** 
	 * Cập nhật thông tin thống kê theo lĩnh vực
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Cập nhật thông tin thống kê theo lĩnh vực
	 * @param id mã phân biệt của thống kê theo ngày
	 * @param month tháng thống kê
	 * @param year năm thống kê
	 * @param dossierDomain lĩnh vực hồ sơ cấp 1
	 * @param receiveNumber số hồ sơ được tiếp nhận
	 * @param onlineNumber số hồ sơ trực tuyến
	 * @param onlineRatio tỉ lệ hồ sơ trực tuyến
	 * @param finishNumber số hồ sơ được hoàn thành
	 * @param ontimeNumber số hồ sơ hoàn thành đúng hẹn
	 * @param ontimeRatio tỉ lệ hồ sơ hoàn thành đúng hẹn
	 * @param delayDaysAvg số ngày trễ hẹn trung bình
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: đối tượng thống kê theo ngày mới được cập nhật thông tin
	 */
	@Indexable(type = IndexableType.REINDEX)
	public StatisticByDomain updateStatisticByDomain(
			long id, 
			int month,
			int year,
			String dossierDomain,
			long receiveNumber,
			long onlineNumber,
			double onlineRatio,
			int finishNumber,
			int ontimeNumber,
			double ontimeRatio,
			double delayDaysAvg,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		StatisticByDomain statisticByDomain = statisticByDomainPersistence.findByPrimaryKey(id);
		statisticByDomain.setMonth(month);
		statisticByDomain.setYear(year);
		statisticByDomain.setDossierDomain(dossierDomain);
		statisticByDomain.setReceiveNumber(receiveNumber);
		statisticByDomain.setOnlineNumber(onlineNumber);
		statisticByDomain.setOnlineRatio(onlineRatio);
		statisticByDomain.setFinishNumber(finishNumber);
		statisticByDomain.setOntimeNumber(ontimeNumber);
		statisticByDomain.setOnlineRatio(onlineRatio);
		statisticByDomain.setDelayDaysAvg(delayDaysAvg);

		statisticByDomainPersistence.update(statisticByDomain);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateStatisticByDomainResources(
				statisticByDomain, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getStatisticByDomain(statisticByDomain.getStatisticByDomainId());
	}

	/** 
	 * Cập nhật thông tin một thống kê hồ sơ
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Cập nhật thông tin thống kê hồ sơ
	 * @param statisticByDomain thống kê hồ sơ theo lĩnh vực
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: đối tượng thống kê hồ sơ theo ngày mới được cập nhật thông tin
	 */
	@Indexable(type = IndexableType.REINDEX)
	public StatisticByDomain updateStatisticByDomain(
		StatisticByDomain statisticByDomain,
		ServiceContext serviceContext
		) throws PortalException, SystemException {
		return updateStatisticByDomain(statisticByDomain.getStatisticByDomainId(), statisticByDomain.getMonth(), statisticByDomain.getYear(), statisticByDomain.getDossierDomain(), statisticByDomain.getReceiveNumber(), statisticByDomain.getOnlineNumber(), statisticByDomain.getOnlineRatio(), statisticByDomain.getFinishNumber(), statisticByDomain.getOntimeNumber(), statisticByDomain.getOntimeRatio(), statisticByDomain.getDelayDaysAvg(), serviceContext);
	}
	
	private void updateStatisticByDomainResources(
			StatisticByDomain statisticByDomain, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			statisticByDomain.getCompanyId(), serviceContext.getScopeGroupId(),
			StatisticByDomain.class.getName(), statisticByDomain.getStatisticByDomainId(), groupPermissions,
			guestPermissions);
	}
	
	/** 
	 * Xóa bỏ thông tin một thống kê theo ngày
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Xóa bỏ thông tin thống kê theo ngày
	 * @param statisticByDomain thống kê theo ngày được xóa
	 * @return
	 */
	public void removeStatisticByDomain(StatisticByDomain statisticByDomain) throws PortalException, SystemException {
		statisticByDomainPersistence.remove(statisticByDomain);
		Indexer indexer = IndexerRegistryUtil.nullSafeGetIndexer(StatisticByDomain.class);
		indexer.delete(statisticByDomain);
		resourceLocalService.deleteResource(statisticByDomain.getCompanyId(), StatisticByDomain.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, statisticByDomain.getStatisticByDomainId());
	}
	
	/** 
	 * Xóa bỏ thông tin một thống kê theo ngày
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Xóa bỏ thông tin thống kê theo ngày
	 * @param id mã phân biệt thống kê theo ngày
	 * @return
	 */
	public void removeStatisticByDomain(long id) throws PortalException, SystemException {
		StatisticByDomain statisticByDomain = statisticByDomainPersistence.findByPrimaryKey(id);
		statisticByDomainLocalService.removeStatisticByDomain(statisticByDomain);
	}
	
	public StatisticByDomain getStatisticByDomain(long id) throws PortalException, SystemException {
		return statisticByDomainPersistence.findByPrimaryKey(id);
	}

	private void addStatisticByDomainResources(StatisticByDomain statisticByDomain, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(statisticByDomain.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), StatisticByDomain.class.getName(), statisticByDomain.getStatisticByDomainId(), false, addGroupPermission, addGuestPermission);
	}

	private void addStatisticByDomainResources(StatisticByDomain statisticByDomain, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(statisticByDomain.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), StatisticByDomain.class.getName(), statisticByDomain.getStatisticByDomainId(), groupPermissions, guestPermissions);
	}
	
	protected void addStatisticByDomainResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		StatisticByDomain statisticByDomain = statisticByDomainPersistence.findByPrimaryKey(id);
		addStatisticByDomainResources(statisticByDomain, groupPermissions, guestPermissions, serviceContext);
	}
					
	private static Log _log = LogFactoryUtil.getLog(StatisticByDomainLocalServiceImpl.class);		
}