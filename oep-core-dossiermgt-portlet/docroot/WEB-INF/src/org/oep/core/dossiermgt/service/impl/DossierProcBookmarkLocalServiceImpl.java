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

import org.oep.core.dossiermgt.model.DossierProcBookmark;
import org.oep.core.dossiermgt.service.base.DossierProcBookmarkLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

/**
 * API thao tác với các bookmark các thủ tục quan tâm bởi người dùng.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.dossiermgt.service.DossierProcBookmarkLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.base.DossierProcBookmarkLocalServiceBaseImpl
 * @see org.oep.core.dossiermgt.service.DossierProcBookmarkLocalServiceUtil
 */
public class DossierProcBookmarkLocalServiceImpl
	extends DossierProcBookmarkLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.dossiermgt.service.DossierProcBookmarkLocalServiceUtil} to access the dossier proc bookmark local service.
	 */
	
	/** 
	 * Thêm mới bookmark thủ tục quan tâm
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: đối tượng thủ tục quan tâm mới
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public DossierProcBookmark addDossierProcBookmark(
			long userId,
			long dossierProcAgentId,
			ServiceContext serviceContext) throws SystemException, PortalException {
		long id = counterLocalService.increment();
		DossierProcBookmark dossierProcBookmark = dossierProcBookmarkPersistence.create(id);
		Date now = new Date();
		
		User user = userPersistence.findByPrimaryKey(userId);
				
		dossierProcBookmark.setCompanyId(user.getCompanyId());
		dossierProcBookmark.setCreateDate(serviceContext.getCreateDate(now));
		dossierProcBookmark.setGroupId(serviceContext.getScopeGroupId());
		dossierProcBookmarkPersistence.update(dossierProcBookmark);

		if (_log.isInfoEnabled()) {
			_log.info("Create new dossier proc bookmark " + id);
		}
		
		return getDossierProcBookmark(id);
	}
		
	private static Log _log = LogFactoryUtil.getLog(DossierProcBookmarkLocalServiceImpl.class);
	
}