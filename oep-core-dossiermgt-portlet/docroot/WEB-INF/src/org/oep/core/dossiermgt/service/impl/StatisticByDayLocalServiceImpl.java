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

import org.oep.core.dossiermgt.model.StatisticByDay;
import org.oep.core.dossiermgt.service.base.StatisticByDayLocalServiceBaseImpl;

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
 * API cung cấp các thao tác lưu trữ thông tin thống kê theo ngày của hồ sơ.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.dossiermgt.service.StatisticByDayLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.base.StatisticByDayLocalServiceBaseImpl
 * @see org.oep.core.dossiermgt.service.StatisticByDayLocalServiceUtil
 */
public class StatisticByDayLocalServiceImpl
	extends StatisticByDayLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.dossiermgt.service.StatisticByDayLocalServiceUtil} to access the statistic by day local service.
	 */
	
	/** 
	 * Thêm mới một thống kê hồ sơ theo ngày
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param statisticDate ngày thống kê
	 * @param statisticWeek tuần thống kê
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
	public StatisticByDay addStatisticByDay(
			Date statisticDate,
			int statisticWeek,
			int receiveNumber,
			int onlineNumber,
			double onlineRatio,
			int finishNumber,
			int ontimeNumber,
			double ontimeRatio,
			double delayDaysAvg,
			ServiceContext serviceContext) throws SystemException, PortalException {
		long id = counterLocalService.increment();
		StatisticByDay statisticByDay = statisticByDayPersistence.create(id);
		Date now = new Date();
		
		statisticByDay.setCompanyId(serviceContext.getCompanyId());
		statisticByDay.setGroupId(serviceContext.getScopeGroupId());
		statisticByDay.setCreateDate(serviceContext.getCreateDate(now));
		statisticByDay.setStatisticDate(statisticDate);
		statisticByDay.setStatisticWeek(statisticWeek);
		statisticByDay.setReceiveNumber(receiveNumber);
		statisticByDay.setOnlineNumber(onlineNumber);
		statisticByDay.setOnlineRatio(onlineRatio);
		statisticByDay.setFinishNumber(finishNumber);
		statisticByDay.setOntimeNumber(ontimeNumber);
		statisticByDay.setOnlineRatio(onlineRatio);
		statisticByDay.setDelayDaysAvg(delayDaysAvg);
		
		statisticByDayPersistence.update(statisticByDay);

		if (_log.isInfoEnabled()) {
			_log.info("Create new statistic by day " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addStatisticByDayResources(statisticByDay, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addStatisticByDayResources(statisticByDay, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getStatisticByDay(id);
	}
	
	/** 
	 * Cập nhật thông tin thống kê theo ngày
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Cập nhật thông tin thống kê theo ngày
	 * @param id mã phân biệt của thống kê theo ngày
	 * @param statisticDate ngày thống kê
	 * @param statisticWeek tuần thống kê
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
	public StatisticByDay updateStatisticByDay(
			long id, 
			Date statisticDate,
			int statisticWeek,
			long receiveNumber,
			long onlineNumber,
			double onlineRatio,
			int finishNumber,
			int ontimeNumber,
			double ontimeRatio,
			double delayDaysAvg,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		StatisticByDay statisticByDay = statisticByDayPersistence.findByPrimaryKey(id);
		statisticByDay.setStatisticDate(statisticDate);
		statisticByDay.setStatisticWeek(statisticWeek);
		statisticByDay.setReceiveNumber(receiveNumber);
		statisticByDay.setOnlineNumber(onlineNumber);
		statisticByDay.setOnlineRatio(onlineRatio);
		statisticByDay.setFinishNumber(finishNumber);
		statisticByDay.setOntimeNumber(ontimeNumber);
		statisticByDay.setOnlineRatio(onlineRatio);
		statisticByDay.setDelayDaysAvg(delayDaysAvg);

		statisticByDayPersistence.update(statisticByDay);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateStatisticByDayResources(
				statisticByDay, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getStatisticByDay(statisticByDay.getStatisticByDayId());
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
	 * @param statisticByDay thống kê hồ sơ theo ngày
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: đối tượng thống kê hồ sơ theo ngày mới được cập nhật thông tin
	 */
	@Indexable(type = IndexableType.REINDEX)
	public StatisticByDay updateStatisticByDay(
		StatisticByDay statisticByDay,
		ServiceContext serviceContext
		) throws PortalException, SystemException {
		return updateStatisticByDay(statisticByDay.getStatisticByDayId(), statisticByDay.getStatisticDate(), statisticByDay.getStatisticWeek(), statisticByDay.getReceiveNumber(), statisticByDay.getOnlineNumber(), statisticByDay.getOnlineRatio(), statisticByDay.getFinishNumber(), statisticByDay.getOntimeNumber(), statisticByDay.getOntimeRatio(), statisticByDay.getDelayDaysAvg(), serviceContext);
	}
	
	private void updateStatisticByDayResources(
			StatisticByDay statisticByDay, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			statisticByDay.getCompanyId(), serviceContext.getScopeGroupId(),
			StatisticByDay.class.getName(), statisticByDay.getStatisticByDayId(), groupPermissions,
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
	 * @param statisticByDay thống kê theo ngày được xóa
	 * @return
	 */
	public void removeStatisticByDay(StatisticByDay statisticByDay) throws PortalException, SystemException {
		statisticByDayPersistence.remove(statisticByDay);
		Indexer indexer = IndexerRegistryUtil.nullSafeGetIndexer(StatisticByDay.class);
		indexer.delete(statisticByDay);
		resourceLocalService.deleteResource(statisticByDay.getCompanyId(), StatisticByDay.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, statisticByDay.getStatisticByDayId());
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
	public void removeStatisticByDay(long id) throws PortalException, SystemException {
		StatisticByDay statisticByDay = statisticByDayPersistence.findByPrimaryKey(id);
		statisticByDayLocalService.removeStatisticByDay(statisticByDay);
	}
	
	public StatisticByDay getStatisticByDay(long id) throws PortalException, SystemException {
		return statisticByDayPersistence.findByPrimaryKey(id);
	}

	private void addStatisticByDayResources(StatisticByDay statisticByDay, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(statisticByDay.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), StatisticByDay.class.getName(), statisticByDay.getStatisticByDayId(), false, addGroupPermission, addGuestPermission);
	}

	private void addStatisticByDayResources(StatisticByDay statisticByDay, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(statisticByDay.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), StatisticByDay.class.getName(), statisticByDay.getStatisticByDayId(), groupPermissions, guestPermissions);
	}
	
	protected void addStatisticByDayResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		StatisticByDay statisticByDay = statisticByDayPersistence.findByPrimaryKey(id);
		addStatisticByDayResources(statisticByDay, groupPermissions, guestPermissions, serviceContext);
	}
					
	private static Log _log = LogFactoryUtil.getLog(StatisticByDayLocalServiceImpl.class);	
	
}