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

import org.oep.processmgt.model.DossierStep;
import org.oep.processmgt.service.base.DossierStepLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * API cung cấp thao tác với dữ liệu bước trong quy trình xử lý hồ sơ.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.processmgt.service.DossierStepLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.processmgt.service.base.DossierStepLocalServiceBaseImpl
 * @see org.oep.processmgt.service.DossierStepLocalServiceUtil
 */
public class DossierStepLocalServiceImpl extends DossierStepLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.processmgt.service.DossierStepLocalServiceUtil} to access the dossier step local service.
	 */

	/** 
	 * Thêm bước trong quy trình mới
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param dossierProcessId mã quy trình xử lý thủ tục hành chính
	 * @param title tiêu đề bước xử lý
	 * @param sequenceNo số thứ tự bước xử lý
	 * @param daysDuration số ngày cần thiết để xử lý quy trình
	 * @param doForm Form xử lý riêng cho quy trình
	 * @param formLabel Tên hiển thị nút xử lý hồ sơ
	 * @param rollback cờ đánh dấu cho việc roolback trong quy trình
	 * @return: bước trong quy trình mới
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public DossierStep addDossierStep(
			long dossierProcessId, 
			String title, 
			int sequenceNo,
			int daysDuration,
			String doForm,
			String formLabel,
			int rollback,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate(dossierProcessId, title, sequenceNo);
		long id = counterLocalService.increment();
		DossierStep dossierStep = dossierStepPersistence.create(id);
		Date now = new Date();
		
		dossierStep.setUserId(serviceContext.getUserId());
		dossierStep.setGroupId(serviceContext.getScopeGroupId());
		dossierStep.setCompanyId(serviceContext.getCompanyId());
		dossierStep.setDossierProcessId(dossierProcessId);
		dossierStep.setTitle(title);
		dossierStep.setSequenceNo(sequenceNo);
		dossierStep.setDaysDuration(daysDuration);
		dossierStep.setDoForm(doForm);
		dossierStep.setFormLabel(formLabel);
		dossierStep.setRollback(rollback);
		dossierStep.setCreateDate(serviceContext.getCreateDate(now));
		
		dossierStepPersistence.update(dossierStep);

		if (_log.isInfoEnabled()) {
			_log.info("Create new dossier step " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addDossierStepResources(dossierStep, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addDossierStepResources(dossierStep, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getDossierStep(id);
	}

	/** 
	 * Cập nhật thông tin bước trong quy trình mới
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param id mã bước cần cập nhật thông tin
	 * @param dossierProcessId mã quy trình xử lý thủ tục hành chính
	 * @param title tiêu đề bước xử lý
	 * @param sequenceNo số thứ tự bước xử lý
	 * @param daysDuration số ngày cần thiết để xử lý quy trình
	 * @param doForm Form xử lý riêng cho quy trình
	 * @param formLabel Tên hiển thị nút xử lý hồ sơ
	 * @param rollback cờ đánh dấu cho việc roolback trong quy trình
	 * @return: bước trong quy trình mới được cập nhật
	 */
	@Indexable(type = IndexableType.REINDEX)
	public DossierStep updateDossierStep(
			long id, 
			long dossierProcessId, 
			String title, 
			int sequenceNo, 
			int daysDuration, 
			String doForm,
			String formLabel,
			int rollback,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		validate(dossierProcessId, title, sequenceNo);

		DossierStep dossierStep = dossierStepPersistence.findByPrimaryKey(id);

		dossierStep.setModifiedDate(serviceContext.getModifiedDate(null));
		dossierStep.setDossierProcessId(dossierProcessId);
		dossierStep.setTitle(title);
		dossierStep.setSequenceNo(sequenceNo);
		dossierStep.setDaysDuration(daysDuration);
		dossierStep.setDoForm(doForm);
		dossierStep.setFormLabel(formLabel);
		dossierStep.setRollback(rollback);
		
		dossierStepPersistence.update(dossierStep);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateDossierStepResources(
				dossierStep, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getDossierStep(dossierStep.getDossierStepId());
	}

	public void updateDossierStepResources(
			DossierStep dossierStep, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			dossierStep.getCompanyId(), serviceContext.getScopeGroupId(),
			DossierStep.class.getName(), dossierStep.getDossierProcessId(), groupPermissions,
			guestPermissions);
	}
	
	public void removeDossierStep(DossierStep dossierStep) throws PortalException, SystemException {
		dossierStepPersistence.remove(dossierStep);
		resourceLocalService.deleteResource(dossierStep.getCompanyId(), DossierStep.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, dossierStep.getDossierStepId());
	}
	
	public void removeDossierStep(long id) throws PortalException, SystemException {
		DossierStep dossierStep = dossierStepPersistence.findByPrimaryKey(id);
		removeDossierStep(dossierStep);
	}
	
	public DossierStep getDossierStep(long id) throws PortalException, SystemException {
		return dossierStepPersistence.findByPrimaryKey(id);
	}

	public void addDossierStepResources(DossierStep dossierStep, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(dossierStep.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DossierStep.class.getName(), dossierStep.getDossierStepId(), false, addGroupPermission, addGuestPermission);
	}

	public void addDossierStepResources(DossierStep dossierStep, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(dossierStep.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DossierStep.class.getName(), dossierStep.getDossierStepId(), groupPermissions, guestPermissions);
	}
	
	public void addDossierStepResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		DossierStep dossierStep = dossierStepPersistence.findByPrimaryKey(id);
		addDossierStepResources(dossierStep, groupPermissions, guestPermissions, serviceContext);
	}
	
	protected void validate(long dossierProcessid, String title, int sequenceNo) throws PortalException {
	}
	
	private static Log _log = LogFactoryUtil.getLog(DossierStepLocalServiceImpl.class);
	
}