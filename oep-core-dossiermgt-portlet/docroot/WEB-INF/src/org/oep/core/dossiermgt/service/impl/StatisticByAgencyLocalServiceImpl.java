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

import org.oep.core.dossiermgt.model.StatisticByAgency;
import org.oep.core.dossiermgt.service.base.StatisticByAgencyLocalServiceBaseImpl;

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
 * API cung cấp thao tác với dữ liệu thống kê theo cơ quan xử lý hồ sơ.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.dossiermgt.service.StatisticByAgencyLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.base.StatisticByAgencyLocalServiceBaseImpl
 * @see org.oep.core.dossiermgt.service.StatisticByAgencyLocalServiceUtil
 */
public class StatisticByAgencyLocalServiceImpl
	extends StatisticByAgencyLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.dossiermgt.service.StatisticByAgencyLocalServiceUtil} to access the statistic by agency local service.
	 */
	
	/** 
	 * Thêm mới một thống kê hồ sơ theo cơ quan xử lý
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param month tháng thống kê
	 * @param year năm thống kê
	 * @param govAgencyId mã cơ quan xử lý
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
	public StatisticByAgency addStatisticByAgency(
			int month,
			int year,
			String govAgencyId,
			int receiveNumber,
			int onlineNumber,
			double onlineRatio,
			int finishNumber,
			int ontimeNumber,
			double ontimeRatio,
			double delayDaysAvg,
			ServiceContext serviceContext) throws SystemException, PortalException {
		long id = counterLocalService.increment();
		StatisticByAgency statisticByAgency = statisticByAgencyPersistence.create(id);
		Date now = new Date();
		
		statisticByAgency.setCompanyId(serviceContext.getCompanyId());
		statisticByAgency.setGroupId(serviceContext.getScopeGroupId());
		statisticByAgency.setCreateDate(serviceContext.getCreateDate(now));
		statisticByAgency.setMonth(month);
		statisticByAgency.setYear(year);
		statisticByAgency.setGovAgencyId(govAgencyId);
		statisticByAgency.setReceiveNumber(receiveNumber);
		statisticByAgency.setOnlineNumber(onlineNumber);
		statisticByAgency.setOnlineRatio(onlineRatio);
		statisticByAgency.setFinishNumber(finishNumber);
		statisticByAgency.setOntimeNumber(ontimeNumber);
		statisticByAgency.setOnlineRatio(onlineRatio);
		statisticByAgency.setDelayDaysAvg(delayDaysAvg);
		
		statisticByAgencyPersistence.update(statisticByAgency);

		if (_log.isInfoEnabled()) {
			_log.info("Create new statistic by agency " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addStatisticByAgencyResources(statisticByAgency, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addStatisticByAgencyResources(statisticByAgency, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getStatisticByAgency(id);
	}
	
	/** 
	 * Cập nhật thông tin thống kê theo cơ quan xử lý
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Cập nhật thông tin thống kê theo cơ quan xử lý
	 * @param id mã phân biệt của thống kê theo ngày
	 * @param month tháng thống kê
	 * @param year năm thống kê
	 * @param govAgencyId cơ quan xử lý
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
	public StatisticByAgency updateStatisticByAgency(
			long id, 
			int month,
			int year,
			String govAgencyId,
			long receiveNumber,
			long onlineNumber,
			double onlineRatio,
			int finishNumber,
			int ontimeNumber,
			double ontimeRatio,
			double delayDaysAvg,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		StatisticByAgency statisticByAgency = statisticByAgencyPersistence.findByPrimaryKey(id);
		statisticByAgency.setMonth(month);
		statisticByAgency.setYear(year);
		statisticByAgency.setGovAgencyId(govAgencyId);
		statisticByAgency.setReceiveNumber(receiveNumber);
		statisticByAgency.setOnlineNumber(onlineNumber);
		statisticByAgency.setOnlineRatio(onlineRatio);
		statisticByAgency.setFinishNumber(finishNumber);
		statisticByAgency.setOntimeNumber(ontimeNumber);
		statisticByAgency.setOnlineRatio(onlineRatio);
		statisticByAgency.setDelayDaysAvg(delayDaysAvg);

		statisticByAgencyPersistence.update(statisticByAgency);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateStatisticByAgencyResources(
				statisticByAgency, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getStatisticByAgency(statisticByAgency.getStatisticByAgencyId());
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
	 * @param statisticByAgency thống kê hồ sơ theo cơ quan xử lý
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: đối tượng thống kê hồ sơ theo ngày mới được cập nhật thông tin
	 */
	@Indexable(type = IndexableType.REINDEX)
	public StatisticByAgency updateStatisticByAgency(
		StatisticByAgency statisticByAgency,
		ServiceContext serviceContext
		) throws PortalException, SystemException {
		return updateStatisticByAgency(statisticByAgency.getStatisticByAgencyId(), statisticByAgency.getMonth(), statisticByAgency.getYear(), statisticByAgency.getGovAgencyId(), statisticByAgency.getReceiveNumber(), statisticByAgency.getOnlineNumber(), statisticByAgency.getOnlineRatio(), statisticByAgency.getFinishNumber(), statisticByAgency.getOntimeNumber(), statisticByAgency.getOntimeRatio(), statisticByAgency.getDelayDaysAvg(), serviceContext);
	}
	
	private void updateStatisticByAgencyResources(
			StatisticByAgency statisticByAgency, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			statisticByAgency.getCompanyId(), serviceContext.getScopeGroupId(),
			StatisticByAgency.class.getName(), statisticByAgency.getStatisticByAgencyId(), groupPermissions,
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
	 * @param statisticByAgency thống kê theo ngày được xóa
	 * @return
	 */
	public void removeStatisticByAgency(StatisticByAgency statisticByAgency) throws PortalException, SystemException {
		statisticByAgencyPersistence.remove(statisticByAgency);
		Indexer indexer = IndexerRegistryUtil.nullSafeGetIndexer(StatisticByAgency.class);
		indexer.delete(statisticByAgency);
		resourceLocalService.deleteResource(statisticByAgency.getCompanyId(), StatisticByAgency.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, statisticByAgency.getStatisticByAgencyId());
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
	public void removeStatisticByAgency(long id) throws PortalException, SystemException {
		StatisticByAgency statisticByAgency = statisticByAgencyPersistence.findByPrimaryKey(id);
		statisticByAgencyLocalService.removeStatisticByAgency(statisticByAgency);
	}
	
	public StatisticByAgency getStatisticByAgency(long id) throws PortalException, SystemException {
		return statisticByAgencyPersistence.findByPrimaryKey(id);
	}

	private void addStatisticByAgencyResources(StatisticByAgency statisticByAgency, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(statisticByAgency.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), StatisticByAgency.class.getName(), statisticByAgency.getStatisticByAgencyId(), false, addGroupPermission, addGuestPermission);
	}

	private void addStatisticByAgencyResources(StatisticByAgency statisticByAgency, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(statisticByAgency.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), StatisticByAgency.class.getName(), statisticByAgency.getStatisticByAgencyId(), groupPermissions, guestPermissions);
	}
	
	protected void addStatisticByAgencyResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		StatisticByAgency statisticByAgency = statisticByAgencyPersistence.findByPrimaryKey(id);
		addStatisticByAgencyResources(statisticByAgency, groupPermissions, guestPermissions, serviceContext);
	}
					
	private static Log _log = LogFactoryUtil.getLog(StatisticByAgencyLocalServiceImpl.class);			
}