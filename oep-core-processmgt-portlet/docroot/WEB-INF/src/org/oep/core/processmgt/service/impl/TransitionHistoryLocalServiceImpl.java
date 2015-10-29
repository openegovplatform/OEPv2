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

import org.oep.core.processmgt.model.TransitionHistory;
import org.oep.core.processmgt.service.base.TransitionHistoryLocalServiceBaseImpl;

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
 * API cung cấp thao tác với dữ liệu lịch sử chuyển dịch trạng thái.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.processmgt.service.TransitionHistoryLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.core.processmgt.service.base.TransitionHistoryLocalServiceBaseImpl
 * @see org.oep.core.processmgt.service.TransitionHistoryLocalServiceUtil
 */
public class TransitionHistoryLocalServiceImpl
	extends TransitionHistoryLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.processmgt.service.TransitionHistoryLocalServiceUtil} to access the transition history local service.
	 */

	/** 
	 * Thêm lịch sử chuyển dịch trạng thái
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Create new
	 * @param dossierId hồ sơ thủ tục của diễn biến
	 * @param processOrderId ghi diễn biến cho phiếu xử lý chính hoặc phụ
	 * @param dossierProcId tham chiếu thủ tục hành chính
	 * @param daysDoing số ngày thực hiện xử lý hồ sơ
	 * @param daysDelay số ngày hồ sơ bị quá hạn (dấu - thể hiện trước hạn)
	 * @param startDate thời điểm bắt đầu thực hiện
	 * @param preDossierStatus trạng thái hồ sơ khi xử lý
	 * @param postDossierStatus trạng thái hồ sơ sau xử lý
	 * @param stepTransitionId chuyển dịch trạng thái
	 * @param preDossierStepId trạng thái trước
	 * @param postDossierStepId bước chuyển dịch sau
	 * @param transitionName tên mô tả hành động xử lý liên quan đến hồ sơ
	 * @param note ghi chú được ghi lại của người xử lý hồ sơ
	 * @param assignToUserId người thực hiện bước xử lý
	 * @return: lịch sử chuyển dịch trạng thái mới
	 */
	@Indexable(type = IndexableType.REINDEX)	
	@Transactional
	public TransitionHistory addTransitionHistory(
			long dossierId,
			long processOrderId,
			int daysDoing,
			int daysDelay,
			Date startDate,
			long stepTransitionId,
			long preDossierStepId,
			long postDossierStepId,
			String transitionName,
			String note,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate();
		long id = counterLocalService.increment();
		TransitionHistory transitionHistory = transitionHistoryPersistence.create(id);
		Date now = new Date();
		
		transitionHistory.setUserId(serviceContext.getUserId());
		transitionHistory.setGroupId(serviceContext.getScopeGroupId());
		transitionHistory.setCompanyId(serviceContext.getCompanyId());
		transitionHistory.setCreateDate(serviceContext.getCreateDate(now));
		transitionHistory.setDossierId(dossierId);
		transitionHistory.setProcessOrderId(processOrderId);
		transitionHistory.setDaysDelay(daysDelay);
		transitionHistory.setDaysDoing(daysDoing);
		transitionHistory.setStartDate(startDate);
		transitionHistory.setStepTransitionId(stepTransitionId);
		transitionHistory.setPreDossierStepId(preDossierStepId);
		transitionHistory.setPostDossierStepId(postDossierStepId);
		transitionHistory.setTransitionName(transitionName);
		transitionHistory.setNote(note);
		
		transitionHistoryPersistence.update(transitionHistory);

		if (_log.isInfoEnabled()) {
			_log.info("Create new transition history " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addTransitionHistoryResources(transitionHistory, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addTransitionHistoryResources(transitionHistory, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getTransitionHistory(id);
	}

	/** 
	 * Cập nhật diễn biến chuyển dịch trạng thái
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Create new
	 * @param id mã diễn biến chuyển dịch trạng thái
	 * @param dossierId hồ sơ thủ tục của diễn biến
	 * @param processOrderId ghi diễn biến cho phiếu xử lý chính hoặc phụ
	 * @param dossierProcId tham chiếu thủ tục hành chính
	 * @param daysDoing số ngày thực hiện xử lý hồ sơ
	 * @param daysDelay số ngày hồ sơ bị quá hạn (dấu - thể hiện trước hạn)
	 * @param startDate thời điểm bắt đầu thực hiện
	 * @param preDossierStatus trạng thái hồ sơ khi xử lý
	 * @param postDossierStatus trạng thái hồ sơ sau xử lý
	 * @param stepTransitionId chuyển dịch trạng thái
	 * @param preDossierStepId trạng thái trước
	 * @param postDossierStepId bước chuyển dịch sau
	 * @param transitionName tên mô tả hành động xử lý liên quan đến hồ sơ
	 * @param note ghi chú được ghi lại của người xử lý hồ sơ
	 * @param assignToUserId người thực hiện bước xử lý
	 * @return: lịch sử chuyển dịch trạng thái mới được cập nhật
	 */
	@Indexable(type = IndexableType.REINDEX)
	public TransitionHistory updateTransitionHistory(
			long id, 
			long dossierId,
			long processOrderId,
			int daysDoing,
			int daysDelay,
			Date startDate,
			long stepTransitionId,
			long preDossierStepId,
			long postDossierStepId,
			String transitionName,
			String note,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		validate();

		TransitionHistory transitionHistory = transitionHistoryPersistence.findByPrimaryKey(id);

		transitionHistory.setDossierId(dossierId);
		transitionHistory.setProcessOrderId(processOrderId);
		transitionHistory.setDaysDelay(daysDelay);
		transitionHistory.setDaysDoing(daysDoing);
		transitionHistory.setStartDate(startDate);
		transitionHistory.setStepTransitionId(stepTransitionId);
		transitionHistory.setPreDossierStepId(preDossierStepId);
		transitionHistory.setPostDossierStepId(postDossierStepId);
		transitionHistory.setTransitionName(transitionName);
		transitionHistory.setNote(note);
		
		transitionHistoryPersistence.update(transitionHistory);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateTransitionHistoryResources(
				transitionHistory, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getTransitionHistory(transitionHistory.getTransitionHistoryId());
	}

	public void updateTransitionHistoryResources(
			TransitionHistory transitionHistory, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			transitionHistory.getCompanyId(), serviceContext.getScopeGroupId(),
			TransitionHistory.class.getName(), transitionHistory.getTransitionHistoryId(), groupPermissions,
			guestPermissions);
	}
	
	public void removeTransitionHistory(TransitionHistory transitionHistory) throws PortalException, SystemException {
		transitionHistoryPersistence.remove(transitionHistory);
		resourceLocalService.deleteResource(transitionHistory.getCompanyId(), TransitionHistory.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, transitionHistory.getTransitionHistoryId());
	}
	
	public void removeTransitionHistory(long id) throws PortalException, SystemException {
		TransitionHistory transitionHistory = transitionHistoryPersistence.findByPrimaryKey(id);
		removeTransitionHistory(transitionHistory);
	}
	
	public TransitionHistory getTransitionHistory(long id) throws PortalException, SystemException {
		return transitionHistoryPersistence.findByPrimaryKey(id);
	}

	public void addTransitionHistoryResources(TransitionHistory transitionHistory, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(transitionHistory.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), TransitionHistory.class.getName(), transitionHistory.getTransitionHistoryId(), false, addGroupPermission, addGuestPermission);
	}

	public void addTransitionHistoryResources(TransitionHistory transitionHistory, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(transitionHistory.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), TransitionHistory.class.getName(), transitionHistory.getTransitionHistoryId(), groupPermissions, guestPermissions);
	}
	
	public void addTransitionHistoryResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		TransitionHistory transitionHistory = transitionHistoryPersistence.findByPrimaryKey(id);
		addTransitionHistoryResources(transitionHistory, groupPermissions, guestPermissions, serviceContext);
	}
	
	protected void validate() throws PortalException {
	}
	
	private static Log _log = LogFactoryUtil.getLog(TransitionHistoryLocalServiceImpl.class);

}