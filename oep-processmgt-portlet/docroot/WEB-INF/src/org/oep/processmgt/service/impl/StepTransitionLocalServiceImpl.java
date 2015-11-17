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

import org.oep.processmgt.model.StepTransition;
import org.oep.processmgt.service.base.StepTransitionLocalServiceBaseImpl;

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
 * API cung cấp thao tác với chuyển dịch trạng thái.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.processmgt.service.StepTransitionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.processmgt.service.base.StepTransitionLocalServiceBaseImpl
 * @see org.oep.processmgt.service.StepTransitionLocalServiceUtil
 */
public class StepTransitionLocalServiceImpl
	extends StepTransitionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.processmgt.service.StepTransitionLocalServiceUtil} to access the step transition local service.
	 */
	
	/** 
	 * Thêm chuyển dịch trạng thái
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param dossierProcessId nằm trong quy trình nào
	 * @param preDossierStepId trạng thái nguồn
	 * @param postDossierStepId trạng thái đích
	 * @param autoCondition mã điều kiện chuyển dịch trạng thái
	 * @param transitionName tên mô tả hành động xử lý hồ sơ
	 * @param dossierStatus kết thúc một bước hồ sơ được phân trạng thái mới
	 * @param sendResults tự động gửi trả kết quả có trong hồ sơ
	 * @param userAssignment đánh dấu bước này phải được phân công cụ thể người xử lý
	 * @param newProcessOrder chuyển dịch có tạo phiếu xử lý con
	 * @return: chuyển dịch trạng thái mới tạo
	 */
	@Indexable(type = IndexableType.REINDEX)	
	@Transactional
	public StepTransition addStepTransition(
			long dossierProcessId,
			long preDossierStepId,
			long postDossierStepId,
			String autoCondition,
			String transitionName,
			String dossierStatus,
			int sendResults,
			int userAssignment,
			int newProcessOrder,

			ServiceContext serviceContext) throws SystemException, PortalException {
		validate();
		long id = counterLocalService.increment();
		StepTransition stepTransition = stepTransitionPersistence.create(id);
		Date now = new Date();
		
		stepTransition.setUserId(serviceContext.getUserId());
		stepTransition.setGroupId(serviceContext.getScopeGroupId());
		stepTransition.setCompanyId(serviceContext.getCompanyId());
		stepTransition.setCreateDate(serviceContext.getCreateDate(now));
		stepTransition.setDossierProcessId(dossierProcessId);
		stepTransition.setPreDossierStepId(preDossierStepId);
		stepTransition.setPostDossierStepId(postDossierStepId);
		stepTransition.setAutoCondition(autoCondition);;
		stepTransition.setTransitionName(transitionName);
		stepTransition.setDossierStatus(dossierStatus);
		stepTransition.setSendResults(sendResults);
		stepTransition.setUserAssignment(userAssignment);
		stepTransition.setNewProcessOrder(newProcessOrder);
		
		stepTransitionPersistence.update(stepTransition);

		if (_log.isInfoEnabled()) {
			_log.info("Create new step transition " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addStepTransitionResources(stepTransition, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addStepTransitionResources(stepTransition, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getStepTransition(id);
	}

	/** 
	 * Cập nhật thông tin chuyển dịch trạng thái
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param id mã chuyển dịch trạng thái
	 * @param dossierProcessId nằm trong quy trình nào
	 * @param preDossierStepId trạng thái nguồn
	 * @param postDossierStepId trạng thái đích
	 * @param autoCondition mã điều kiện chuyển dịch trạng thái
	 * @param transitionName tên mô tả hành động xử lý hồ sơ
	 * @param dossierStatus kết thúc một bước hồ sơ được phân trạng thái mới
	 * @param sendResults tự động gửi trả kết quả có trong hồ sơ
	 * @param userAssignment đánh dấu bước này phải được phân công cụ thể người xử lý
	 * @param newProcessOrder chuyển dịch có tạo phiếu xử lý con
	 * @return: chuyển dịch trạng thái mới được cập nhật
	 */
	@Indexable(type = IndexableType.REINDEX)
	public StepTransition updateStepTransition(
			long id, 
			long dossierProcessId,
			long preDossierStepId,
			long postDossierStepId,
			String autoCondition,
			String transitionName,
			String dossierStatus,
			int sendResults,
			int userAssignment,
			int newProcessOrder,

			ServiceContext serviceContext)
		throws PortalException, SystemException {

		validate();

		StepTransition stepTransition = stepTransitionPersistence.findByPrimaryKey(id);

		stepTransition.setModifiedDate(serviceContext.getModifiedDate(null));
		stepTransition.setDossierProcessId(dossierProcessId);
		stepTransition.setPreDossierStepId(preDossierStepId);
		stepTransition.setPostDossierStepId(postDossierStepId);
		stepTransition.setAutoCondition(autoCondition);;
		stepTransition.setTransitionName(transitionName);
		stepTransition.setDossierStatus(dossierStatus);
		stepTransition.setSendResults(sendResults);
		stepTransition.setUserAssignment(userAssignment);
		stepTransition.setNewProcessOrder(newProcessOrder);
		
		stepTransitionPersistence.update(stepTransition);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateStepTransitionResources(
				stepTransition, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getStepTransition(stepTransition.getStepTransitionId());
	}

	public void updateStepTransitionResources(
			StepTransition stepTransition, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			stepTransition.getCompanyId(), serviceContext.getScopeGroupId(),
			StepTransition.class.getName(), stepTransition.getStepTransitionId(), groupPermissions,
			guestPermissions);
	}
	
	public void removeStepTransition(StepTransition stepTransition) throws PortalException, SystemException {
		stepTransitionPersistence.remove(stepTransition);
		resourceLocalService.deleteResource(stepTransition.getCompanyId(), StepTransition.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, stepTransition.getStepTransitionId());
	}
	
	public void removeStepTransition(long id) throws PortalException, SystemException {
		StepTransition stepTransition = stepTransitionPersistence.findByPrimaryKey(id);
		removeStepTransition(stepTransition);
	}
	
	public StepTransition getStepTransition(long id) throws PortalException, SystemException {
		return stepTransitionPersistence.findByPrimaryKey(id);
	}

	public void addStepTransitionResources(StepTransition stepTransition, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(stepTransition.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), StepTransition.class.getName(), stepTransition.getStepTransitionId(), false, addGroupPermission, addGuestPermission);
	}

	public void addStepTransitionResources(StepTransition stepTransition, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(stepTransition.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), StepTransition.class.getName(), stepTransition.getStepTransitionId(), groupPermissions, guestPermissions);
	}
	
	public void addStepTransitionResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		StepTransition stepTransition = stepTransitionPersistence.findByPrimaryKey(id);
		addStepTransitionResources(stepTransition, groupPermissions, guestPermissions, serviceContext);
	}
	
	protected void validate() throws PortalException {
	}
	
	private static Log _log = LogFactoryUtil.getLog(StepTransitionLocalServiceImpl.class);
	
}