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

import org.oep.core.processmgt.model.DossierStep2Role;
import org.oep.core.processmgt.service.impl.DossierStep2RoleLocalServiceImpl;
import org.oep.core.processmgt.service.persistence.DossierStep2RolePK;
import org.oep.core.processmgt.service.base.DossierStep2RoleLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.service.ServiceContext;

/**
 * API cung cấp thao tác với dữ liệu quan hệ giữa bước xử lý với vai trò.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.processmgt.service.DossierStep2RoleLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.core.processmgt.service.base.DossierStep2RoleLocalServiceBaseImpl
 * @see org.oep.core.processmgt.service.DossierStep2RoleLocalServiceUtil
 */
public class DossierStep2RoleLocalServiceImpl
	extends DossierStep2RoleLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.processmgt.service.DossierStep2RoleLocalServiceUtil} to access the dossier step2 role local service.
	 */
	
	/** 
	 * Thêm quan hệ giữa bước xử lý với vai trò
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param dossierStepId mã bước xử lý hồ sơ
	 * @param roleId mã vai trò
	 * @return: quan hệ giữa bước xử lý hồ sơ với vai trò
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public DossierStep2Role addDossierStep2Role(
			long dossierStepId,
			long roleId,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate();
		DossierStep2Role dossierStep2Role = dossierStep2RolePersistence.create(new DossierStep2RolePK(dossierStepId, roleId));
				
		
		dossierStep2RolePersistence.update(dossierStep2Role);

		if (_log.isInfoEnabled()) {
			_log.info("Create new dossierstep2role");
		}
		
		return getDossierStep2Role(dossierStepId, roleId);
	}
			
	public void removeDossierStep2Role(DossierStep2Role dossierStep2Role) throws PortalException, SystemException {
		dossierStep2RolePersistence.remove(dossierStep2Role);
	}
	
	public void removeDossierStep2Role(long dossierStepId, long roleId) throws PortalException, SystemException {
		DossierStep2Role dossierStep2Role = dossierStep2RolePersistence.fetchByPrimaryKey(new DossierStep2RolePK(dossierStepId, roleId));
		removeDossierStep2Role(dossierStep2Role);
	}
	
	public DossierStep2Role getDossierStep2Role(long dossierStepId, long roleId) throws PortalException, SystemException {
		return dossierStep2RolePersistence.findByPrimaryKey(new DossierStep2RolePK(dossierStepId, roleId));
	}
	
	protected void validate() throws PortalException {
	}
	
	private static Log _log = LogFactoryUtil.getLog(DossierStep2RoleLocalServiceImpl.class);
		
}