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

import org.oep.processmgt.model.DossierProc2Role;
import org.oep.processmgt.service.base.DossierProc2RoleLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.service.ServiceContext;

/**
 * API thao tác với dữ liệu quan hệ giữa xử lý thủ tục tại bộ phận một cửa với các vai trò khác nhau.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.processmgt.service.DossierProc2RoleLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.processmgt.service.base.DossierProc2RoleLocalServiceBaseImpl
 * @see org.oep.processmgt.service.DossierProc2RoleLocalServiceUtil
 */
public class DossierProc2RoleLocalServiceImpl
	extends DossierProc2RoleLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.processmgt.service.DossierProc2RoleLocalServiceUtil} to access the dossier proc2 role local service.
	 */
	
	/** 
	 * Thêm quan hệ giữa xử lý thủ tục hành chính tại một cửa với vai trò
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param dossierProcId mã thủ tục hành chính
	 * @param roleId mã vai trò
	 * @return: quan hệ giữa quan hệ thủ tục hành chính với vai trò
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public DossierProc2Role addDossierProc2Role(
			long dossierProcId,
			long roleId,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate();
		long id = counterLocalService.increment();
		DossierProc2Role dossierProc2Role = dossierProc2RolePersistence.create(id);
		dossierProc2Role.setDossierProcId(dossierProcId);
		dossierProc2Role.setRoleId(roleId);
		
		dossierProc2RolePersistence.update(dossierProc2Role);

		if (_log.isInfoEnabled()) {
			_log.info("Create new dossierproc2role");
		}
		
		return getDossierProc2Role(id);
	}
			
	public void removeDossierProc2Role(DossierProc2Role dossierProc2Role) throws PortalException, SystemException {
		dossierProc2RolePersistence.remove(dossierProc2Role);
	}
	
	public void removeDossierProc2Role(long id) throws PortalException, SystemException {
		DossierProc2Role dossierProc2Role = dossierProc2RolePersistence.fetchByPrimaryKey(id);
		removeDossierProc2Role(dossierProc2Role);
	}
	
	public DossierProc2Role getDossierProc2Role(long id) throws PortalException, SystemException {
		return dossierProc2RolePersistence.findByPrimaryKey(id);
	}
	
	protected void validate() throws PortalException {
	}
	
	private static Log _log = LogFactoryUtil.getLog(DossierProc2RoleLocalServiceImpl.class);
	
}