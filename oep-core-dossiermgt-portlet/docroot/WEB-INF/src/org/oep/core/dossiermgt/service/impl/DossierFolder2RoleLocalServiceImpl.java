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

import org.oep.core.dossiermgt.model.DossierFolder2Role;
import org.oep.core.dossiermgt.service.base.DossierFolder2RoleLocalServiceBaseImpl;
import org.oep.core.dossiermgt.service.persistence.DossierFolder2RolePK;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.service.ServiceContext;

/**
 * API cung cấp thao tác với quyền của vai trò trên UI xem danh sách hồ sơ.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.dossiermgt.service.DossierFolder2RoleLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.base.DossierFolder2RoleLocalServiceBaseImpl
 * @see org.oep.core.dossiermgt.service.DossierFolder2RoleLocalServiceUtil
 */
public class DossierFolder2RoleLocalServiceImpl
	extends DossierFolder2RoleLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.dossiermgt.service.DossierFolder2RoleLocalServiceUtil} to access the dossier folder2 role local service.
	 */
	
	/** 
	 * Thêm quan hệ giữa UI xem danh sách hồ sơ với vai trò
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param dossierFolderId UI xem danh sách hồ sơ
	 * @param roleId mã vai trò
	 * @return: quan hệ giữa UI xem danh sách hồ sơ với vai trò
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public DossierFolder2Role addDossierFolder2Role(
			long dossierFolderId,
			long roleId,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate();
		DossierFolder2Role dossierFolder2Role = dossierFolder2RolePersistence.create(new DossierFolder2RolePK(dossierFolderId, roleId));
				
		
		dossierFolder2RolePersistence.update(dossierFolder2Role);

		if (_log.isInfoEnabled()) {
			_log.info("Create new dossierfolder2role");
		}
		
		return getDossierFolder2Role(dossierFolderId, roleId);
	}
			
	public void removeDossierFolder2Role(DossierFolder2Role dossierFolder2Role) throws PortalException, SystemException {
		dossierFolder2RolePersistence.remove(dossierFolder2Role);
	}
	
	public void removeDossierFolder2Role(long dossierFolderId, long roleId) throws PortalException, SystemException {
		DossierFolder2Role dossierFolder2Role = dossierFolder2RolePersistence.fetchByPrimaryKey(new DossierFolder2RolePK(dossierFolderId, roleId));
		removeDossierFolder2Role(dossierFolder2Role);
	}
	
	public DossierFolder2Role getDossierFolder2Role(long dossierFolderId, long roleId) throws PortalException, SystemException {
		return dossierFolder2RolePersistence.findByPrimaryKey(new DossierFolder2RolePK(dossierFolderId, roleId));
	}
	
	protected void validate() throws PortalException {
	}
	
	private static Log _log = LogFactoryUtil.getLog(DossierFolder2RoleLocalServiceImpl.class);
	
}