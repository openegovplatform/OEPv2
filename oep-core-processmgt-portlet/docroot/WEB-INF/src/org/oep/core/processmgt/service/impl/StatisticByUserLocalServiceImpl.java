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

package org.oep.core.processmgt.service.impl;

import java.util.Date;

import org.oep.core.processmgt.model.StatisticByUser;
import org.oep.core.processmgt.service.base.StatisticByUserLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * API cung cấp thao tác với dữ liệu thống kê xử lý bởi mỗi cán bộ.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.processmgt.service.StatisticByUserLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.core.processmgt.service.base.StatisticByUserLocalServiceBaseImpl
 * @see org.oep.core.processmgt.service.StatisticByUserLocalServiceUtil
 */
public class StatisticByUserLocalServiceImpl
	extends StatisticByUserLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.processmgt.service.StatisticByUserLocalServiceUtil} to access the statistic by user local service.
	 */
	
	/** 
	 * Thêm thông tin thống kê theo người dùng xử lý hồ sơ
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param month tháng trong năm
	 * @param year năm
	 * @param totalNumber số hồ sơ xử lý
	 * @param ontimeNumber số đúng hẹn
	 * @param ontimeRatio tỉ lệ đúng hẹn
	 * @param delayDaysAvg số ngày trễ hẹn trung bình
	 * @return: thông tin thống kê người dùng xử lý hồ sơ mới
	 */
	@Indexable(type = IndexableType.REINDEX)	
	@Transactional
	public StatisticByUser addStatisticByUser(
			int month,
			int year,
			int totalNumber,
			int ontimeNumber,
			double ontimeRatio,
			double delayDaysAvg,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate();
		long id = counterLocalService.increment();
		StatisticByUser statisticByUser = statisticByUserPersistence.create(id);
		Date now = new Date();
		
		statisticByUser.setUserId(serviceContext.getUserId());
		statisticByUser.setGroupId(serviceContext.getScopeGroupId());
		statisticByUser.setCompanyId(serviceContext.getCompanyId());
		statisticByUser.setCreateDate(serviceContext.getCreateDate(now));
		statisticByUser.setMonth(month);
		statisticByUser.setYear(year);
		statisticByUser.setTotalNumber(totalNumber);
		statisticByUser.setOntimeNumber(ontimeNumber);
		statisticByUser.setOntimeRatio(ontimeRatio);
		statisticByUser.setDelayDaysAvg(delayDaysAvg);
		
		statisticByUserPersistence.update(statisticByUser);

		if (_log.isInfoEnabled()) {
			_log.info("Create new statistic by user " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addStatisticByUserResources(statisticByUser, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addStatisticByUserResources(statisticByUser, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getStatisticByUser(id);
	}

	/** 
	 * Cập nhật thông tin thống kê theo người dùng xử lý hồ sơ
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param id mã thông tin thống kê người dùng xử lý hồ sơ
	 * @param month tháng trong năm
	 * @param year năm
	 * @param totalNumber số hồ sơ xử lý
	 * @param ontimeNumber số đúng hẹn
	 * @param ontimeRatio tỉ lệ đúng hẹn
	 * @param delayDaysAvg số ngày trễ hẹn trung bình
	 * @return: cập nhật thông tin thống kê người dùng xử lý hồ sơ mới
	 */
	@Indexable(type = IndexableType.REINDEX)
	public StatisticByUser updateStatisticByUser(
			long id, 
			int month,
			int year,
			int totalNumber,
			int ontimeNumber,
			double ontimeRatio,
			double delayDaysAvg,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		validate();

		StatisticByUser statisticByUser = statisticByUserPersistence.findByPrimaryKey(id);
		statisticByUser.setMonth(month);
		statisticByUser.setYear(year);
		statisticByUser.setTotalNumber(totalNumber);
		statisticByUser.setOntimeNumber(ontimeNumber);
		statisticByUser.setOntimeRatio(ontimeRatio);
		statisticByUser.setDelayDaysAvg(delayDaysAvg);
		
		statisticByUserPersistence.update(statisticByUser);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateStatisticByUserResources(
				statisticByUser, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getStatisticByUser(statisticByUser.getStatisticByUserId());
	}

	public void updateStatisticByUserResources(
			StatisticByUser statisticByUser, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			statisticByUser.getCompanyId(), serviceContext.getScopeGroupId(),
			StatisticByUser.class.getName(), statisticByUser.getStatisticByUserId(), groupPermissions,
			guestPermissions);
	}
	
	public void removeStatisticByUser(StatisticByUser statisticByUser) throws PortalException, SystemException {
		statisticByUserPersistence.remove(statisticByUser);
		resourceLocalService.deleteResource(statisticByUser.getCompanyId(), StatisticByUser.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, statisticByUser.getStatisticByUserId());
	}
	
	public void removeStatisticByUser(long id) throws PortalException, SystemException {
		StatisticByUser statisticByUser = statisticByUserPersistence.findByPrimaryKey(id);
		removeStatisticByUser(statisticByUser);
	}
	
	public StatisticByUser getStatisticByUser(long id) throws PortalException, SystemException {
		return statisticByUserPersistence.findByPrimaryKey(id);
	}

	public void addStatisticByUserResources(StatisticByUser statisticByUser, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(statisticByUser.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), StatisticByUser.class.getName(), statisticByUser.getStatisticByUserId(), false, addGroupPermission, addGuestPermission);
	}

	public void addStatisticByUserResources(StatisticByUser statisticByUser, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(statisticByUser.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), StatisticByUser.class.getName(), statisticByUser.getStatisticByUserId(), groupPermissions, guestPermissions);
	}
	
	public void addStatisticByUserResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		StatisticByUser statisticByUser = statisticByUserPersistence.findByPrimaryKey(id);
		addStatisticByUserResources(statisticByUser, groupPermissions, guestPermissions, serviceContext);
	}
	
	protected void validate() throws PortalException {
	}
	
	private static Log _log = LogFactoryUtil.getLog(StatisticByUserLocalServiceImpl.class);	
}