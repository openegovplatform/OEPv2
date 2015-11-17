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

import org.oep.dossiermgt.model.DossierTag;
import org.oep.dossiermgt.service.base.DossierTagLocalServiceBaseImpl;

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
 * API cung cấp thao tác với các tag của hồ sơ thủ tục.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.dossiermgt.service.DossierTagLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.dossiermgt.service.base.DossierTagLocalServiceBaseImpl
 * @see org.oep.dossiermgt.service.DossierTagLocalServiceUtil
 */
public class DossierTagLocalServiceImpl extends DossierTagLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.dossiermgt.service.DossierTagLocalServiceUtil} to access the dossier tag local service.
	 */
	
	/** 
	 * Thêm mới một tag của hồ sơ
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param dossierId mã hồ sơ
	 * @param tag tag của hồ sơ
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: tag hồ sơ mới được tạo
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public DossierTag addDossierTag(
			long dossierId,
			String tag,
			ServiceContext serviceContext) throws SystemException, PortalException {
		long id = counterLocalService.increment();
		DossierTag dossierTag = dossierTagPersistence.create(id);
		Date now = new Date();
		
		dossierTag.setUserId(serviceContext.getUserId());
		dossierTag.setCompanyId(serviceContext.getCompanyId());
		dossierTag.setGroupId(serviceContext.getScopeGroupId());
		dossierTag.setCreateDate(serviceContext.getCreateDate(now));
		dossierTag.setDossierId(dossierId);
		dossierTag.setTag(tag);
		
		dossierTagPersistence.update(dossierTag);

		if (_log.isInfoEnabled()) {
			_log.info("Create new dossier tag " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addDossierTagResources(dossierTag, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addDossierTagResources(dossierTag, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getDossierTag(id);
	}
	
	/** 
	 * Cập nhật thông tin một tag hồ sơ
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Cập nhật thông tin tag hồ sơ
	 * @param id mã phân biệt của tag
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: đối tượng thủ tục hành chính mới được cập nhật thông tin
	 */
	@Indexable(type = IndexableType.REINDEX)
	public DossierTag updateDossierTag(
			long id, 
			long dossierId,
			String tag,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		DossierTag dossierTag = dossierTagPersistence.findByPrimaryKey(id);
		dossierTag.setDossierId(dossierId);
		dossierTag.setTag(tag);

		dossierTagPersistence.update(dossierTag);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateDossierTagResources(
				dossierTag, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getDossierTag(dossierTag.getDossierTagId());
	}

	/** 
	 * Cập nhật thông tin một tag hồ sơ
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Cập nhật thông tin tag hồ sơ
	 * @param dossierTag tag hồ sơ cần cập nhật
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: đối tượng tag hồ sơ mới được cập nhật thông tin
	 */
	@Indexable(type = IndexableType.REINDEX)
	public DossierTag updateDossierTag(
		DossierTag dossierTag,
		ServiceContext serviceContext
		) throws PortalException, SystemException {
		return updateDossierTag(dossierTag.getDossierTagId(), dossierTag.getDossierId(), dossierTag.getTag(), serviceContext);
	}
	
	private void updateDossierTagResources(
			DossierTag dossierTag, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			dossierTag.getCompanyId(), serviceContext.getScopeGroupId(),
			DossierTag.class.getName(), dossierTag.getDossierTagId(), groupPermissions,
			guestPermissions);
	}
	
	/** 
	 * Xóa bỏ thông tin một tag hồ sơ
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Xóa bỏ thông tin tag hồ sơ
	 * @param dossierProc tag hồ sơ được xóa
	 * @return
	 */
	public void removeDossierTag(DossierTag dossierTag) throws PortalException, SystemException {
		dossierTagPersistence.remove(dossierTag);
		Indexer indexer = IndexerRegistryUtil.nullSafeGetIndexer(DossierTag.class);
		indexer.delete(dossierTag);
		resourceLocalService.deleteResource(dossierTag.getCompanyId(), DossierTag.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, dossierTag.getDossierTagId());
	}
	
	/** 
	 * Xóa bỏ thông tin một tag hồ sơ
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Xóa bỏ thông tin tag hồ sơ
	 * @param id mã phân biệt tag hồ sơ
	 * @return
	 */
	public void removeDossierTag(long id) throws PortalException, SystemException {
		DossierTag dossierTag = dossierTagPersistence.findByPrimaryKey(id);
		dossierTagLocalService.removeDossierTag(dossierTag);
	}
	
	public DossierTag getDossierTag(long id) throws PortalException, SystemException {
		return dossierTagPersistence.findByPrimaryKey(id);
	}

	private void addDossierTagResources(DossierTag dossierTag, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(dossierTag.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DossierTag.class.getName(), dossierTag.getDossierTagId(), false, addGroupPermission, addGuestPermission);
	}

	private void addDossierTagResources(DossierTag dossierTag, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(dossierTag.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DossierTag.class.getName(), dossierTag.getDossierTagId(), groupPermissions, guestPermissions);
	}
	
	protected void addDossierTagResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		DossierTag dossierTag = dossierTagPersistence.findByPrimaryKey(id);
		addDossierTagResources(dossierTag, groupPermissions, guestPermissions, serviceContext);
	}
					
	private static Log _log = LogFactoryUtil.getLog(DossierProcLocalServiceImpl.class);	
}