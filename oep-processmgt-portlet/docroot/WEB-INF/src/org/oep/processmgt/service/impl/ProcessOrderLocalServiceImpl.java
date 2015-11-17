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

package org.oep.processmgt.service.impl;

import java.util.Date;
import java.util.List;

import org.oep.processmgt.model.ProcessOrder;
import org.oep.processmgt.service.base.ProcessOrderLocalServiceBaseImpl;

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
 * API cung cấp các thao tác với dữ liệu thông tin phiếu xử lý hồ sơ theo quy trình.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.processmgt.service.ProcessOrderLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.processmgt.service.base.ProcessOrderLocalServiceBaseImpl
 * @see org.oep.processmgt.service.ProcessOrderLocalServiceUtil
 */
public class ProcessOrderLocalServiceImpl
	extends ProcessOrderLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.processmgt.service.ProcessOrderLocalServiceUtil} to access the process order local service.
	 */
	
	/** 
	 * Thêm phiếu xử lý hồ sơ mới
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param organizationId tổ chức thực hiện xử lý hồ sơ
	 * @param parentProcessOrderId có phải là phiếu xử lý cha
	 * @param dossierId hồ sơ cần xử lý
	 * @param dossierProcessId nằm trong quy trình xử lý hồ sơ nào
	 * @param dossierStepId đang xử lý tại bước nào (0 là đã kết thúc xử lý)
	 * @param orderStatus trạng thái hiện tại của phiếu xử lý
	 * @param orderResume tóm tắt nội dung cần xử lý
	 * @param stepDate thời điểm bắt đầu thực hiện xử lý hồ sơ
	 * @param stepNote ghi lại ghi chú của người xử lý cuối cùng
	 * @param assignToUserId người chịu trách nhiệm xử lý
	 * @param currentCondition điều kiện hiện tại của hồ sơ để xét chuyển dịch
	 * @param lastStepTransitionId chuyển dịch cuối cùng của phiếu xử lý
	 * @param stopRollback cờ đánh dấu tạm dừng việc rollback
	 * @param ebPartnershipId trao đổi hồ sơ hiện tại với hệ thống bên ngoài
	 * @return: thông tin xử lý hồ sơ mới được tạo
	 */
	@Indexable(type = IndexableType.REINDEX)	
	@Transactional
	public ProcessOrder addProcessOrder(
			long organizationId,
			long parentProcessOrderId,
			long dossierId,
			long dossierProcessId,
			long dossierStepId,
			String orderStatus,
			String orderResume,
			Date stepDate,
			String stepNote,
			long assignToUserId,
			String currentCondition,
			long lastStepTransitionId,
			int stopRollback,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate();
		long id = counterLocalService.increment();
		ProcessOrder processOrder = processOrderPersistence.create(id);
		Date now = new Date();
		
		processOrder.setUserId(serviceContext.getUserId());
		processOrder.setGroupId(serviceContext.getScopeGroupId());
		processOrder.setCompanyId(serviceContext.getCompanyId());
		processOrder.setCreateDate(serviceContext.getCreateDate(now));
		processOrder.setOrganizationId(organizationId);
		processOrder.setParentProcessOrderId(parentProcessOrderId);
		processOrder.setDossierId(dossierId);
		processOrder.setDossierProcessId(dossierProcessId);
		processOrder.setDossierStepId(dossierStepId);
		processOrder.setOrderStatus(orderStatus);
		processOrder.setOrderResume(orderResume);
		processOrder.setStepDate(stepDate);
		processOrder.setStepNote(stepNote);
		processOrder.setAssignToUserId(assignToUserId);
		processOrder.setCurrentCondition(currentCondition);
		processOrder.setLastStepTransitionId(lastStepTransitionId);
		processOrder.setStopRollback(stopRollback);
		
		processOrderPersistence.update(processOrder);

		if (_log.isInfoEnabled()) {
			_log.info("Create new process order " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addProcessOrderResources(processOrder, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addProcessOrderResources(processOrder, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getProcessOrder(id);
	}

	/** 
	 * Cập nhật phiếu xử lý hồ sơ mới
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param organizationId tổ chức thực hiện xử lý hồ sơ
	 * @param parentProcessOrderId có phải là phiếu xử lý cha
	 * @param dossierId hồ sơ cần xử lý
	 * @param dossierProcessId nằm trong quy trình xử lý hồ sơ nào
	 * @param dossierStepId đang xử lý tại bước nào (0 là đã kết thúc xử lý)
	 * @param orderStatus trạng thái hiện tại của phiếu xử lý
	 * @param orderResume tóm tắt nội dung cần xử lý
	 * @param stepDate thời điểm bắt đầu thực hiện xử lý hồ sơ
	 * @param stepNote ghi lại ghi chú của người xử lý cuối cùng
	 * @param assignToUserId người chịu trách nhiệm xử lý
	 * @param currentCondition điều kiện hiện tại của hồ sơ để xét chuyển dịch
	 * @param lastStepTransitionId chuyển dịch cuối cùng của phiếu xử lý
	 * @param stopRollback cờ đánh dấu tạm dừng việc rollback
	 * @param ebPartnershipId trao đổi hồ sơ hiện tại với hệ thống bên ngoài
	 * @return: thông tin xử lý hồ sơ mới được cập nhật
	 */
	@Indexable(type = IndexableType.REINDEX)
	public ProcessOrder updateProcessOrder(
			long id, 
			long organizationId,
			long parentProcessOrderId,
			long dossierId,
			long dossierProcessId,
			long dossierStepId,
			String orderStatus,
			String orderResume,
			Date stepDate,
			String stepNote,
			long assignToUserId,
			String currentCondition,
			long lastStepTransitionId,
			int stopRollback,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		validate();

		ProcessOrder processOrder = processOrderPersistence.findByPrimaryKey(id);

		processOrder.setModifiedDate(serviceContext.getModifiedDate(null));
		processOrder.setOrganizationId(organizationId);
		processOrder.setParentProcessOrderId(parentProcessOrderId);
		processOrder.setDossierId(dossierId);
		processOrder.setDossierProcessId(dossierProcessId);
		processOrder.setDossierStepId(dossierStepId);
		processOrder.setOrderStatus(orderStatus);
		processOrder.setOrderResume(orderResume);
		processOrder.setStepDate(stepDate);
		processOrder.setStepNote(stepNote);
		processOrder.setAssignToUserId(assignToUserId);
		processOrder.setCurrentCondition(currentCondition);
		processOrder.setLastStepTransitionId(lastStepTransitionId);
		processOrder.setStopRollback(stopRollback);
		
		processOrderPersistence.update(processOrder);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateProcessOrderResources(
				processOrder, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getProcessOrder(processOrder.getProcessOrderId());
	}

	public void updateProcessOrderResources(
			ProcessOrder processOrder, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			processOrder.getCompanyId(), serviceContext.getScopeGroupId(),
			ProcessOrder.class.getName(), processOrder.getProcessOrderId(), groupPermissions,
			guestPermissions);
	}
	
	public void removeProcessOrder(ProcessOrder processOrder) throws PortalException, SystemException {
		processOrderPersistence.remove(processOrder);
		resourceLocalService.deleteResource(processOrder.getCompanyId(), ProcessOrder.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, processOrder.getProcessOrderId());
	}
	
	public void removeProcessOrder(long id) throws PortalException, SystemException {
		ProcessOrder processOrder = processOrderPersistence.findByPrimaryKey(id);
		removeProcessOrder(processOrder);
	}
	
	public ProcessOrder getProcessOrder(long id) throws PortalException, SystemException {
		return processOrderPersistence.findByPrimaryKey(id);
	}

	public void addProcessOrderResources(ProcessOrder processOrder, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(processOrder.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), ProcessOrder.class.getName(), processOrder.getProcessOrderId(), false, addGroupPermission, addGuestPermission);
	}

	public void addProcessOrderResources(ProcessOrder processOrder, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(processOrder.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), ProcessOrder.class.getName(), processOrder.getProcessOrderId(), groupPermissions, guestPermissions);
	}
	
	public void addProcessOrderResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		ProcessOrder processOrder = processOrderPersistence.findByPrimaryKey(id);
		addProcessOrderResources(processOrder, groupPermissions, guestPermissions, serviceContext);
	}
	
	public List<ProcessOrder> findAllCanAutoCondition(ServiceContext serviceContext) throws PortalException, SystemException {
		return processOrderFinder.findAllCanAutoCondition(serviceContext);
	}
	
	public long countByWaitingProcessed(long userId, ServiceContext serviceContext) throws PortalException, SystemException {
		return processOrderFinder.countByWaitingProcessed(userId, serviceContext);
	}
	
	public List<ProcessOrder> findByWaitingProcessed(long userId, int startIndex, int endIndex, ServiceContext serviceContext) throws PortalException, SystemException {
		return processOrderFinder.findByWaitingProcessed(userId, startIndex, endIndex, serviceContext);
	}
	
	public List<ProcessOrder> findAllCanAutoCondition(long companyId) throws PortalException, SystemException {
		return processOrderFinder.findAllCanAutoCondition(companyId);
	}
	
	protected void validate() throws PortalException {
	}
	
	private static Log _log = LogFactoryUtil.getLog(ProcessOrderLocalServiceImpl.class);
	
}