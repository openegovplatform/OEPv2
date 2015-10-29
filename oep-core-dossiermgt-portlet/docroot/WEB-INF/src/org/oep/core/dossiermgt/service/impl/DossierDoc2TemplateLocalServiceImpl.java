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

import org.oep.core.dossiermgt.model.DossierDoc2Template;
import org.oep.core.dossiermgt.service.base.DossierDoc2TemplateLocalServiceBaseImpl;
import org.oep.core.dossiermgt.service.persistence.DossierDoc2TemplatePK;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.service.ServiceContext;

/**
 * API quản lý các biểu mẫu thuộc một thành phần hồ sơ.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.dossiermgt.service.DossierDoc2TemplateLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.base.DossierDoc2TemplateLocalServiceBaseImpl
 * @see org.oep.core.dossiermgt.service.DossierDoc2TemplateLocalServiceUtil
 */
public class DossierDoc2TemplateLocalServiceImpl
	extends DossierDoc2TemplateLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.dossiermgt.service.DossierDoc2TemplateLocalServiceUtil} to access the dossier doc2 template local service.
	 */
	
	/** 
	 * Thêm quan hệ giữa thành phần hồ sơ với biểu mẫu
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param dossierDocId thành phần hồ sơ
	 * @param docTemplateId mẫu thành phần hồ sơ mặc định
	 * @return: quan hệ thành phần hồ sơ với biểu mẫu vừa được tạo
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public DossierDoc2Template addDossierDoc2Template(
			long dossierDocId,
			long docTemplateId,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate();
		DossierDoc2Template dossierDoc2Template = dossierDoc2TemplatePersistence.create(new DossierDoc2TemplatePK(dossierDocId, docTemplateId));
				
		
		dossierDoc2TemplatePersistence.update(dossierDoc2Template);

		if (_log.isInfoEnabled()) {
			_log.info("Create new dossierdoc2template");
		}
		
		return getDossierDoc2Template(dossierDocId, docTemplateId);
	}
			
	public void removeDossierDoc2Template(DossierDoc2Template dossierDoc2Template) throws PortalException, SystemException {
		dossierDoc2TemplatePersistence.remove(dossierDoc2Template);
	}
	
	public void removeDossierDoc2Template(long dossierDocId, long docTemplateId) throws PortalException, SystemException {
		DossierDoc2Template dossierDoc2Template = dossierDoc2TemplatePersistence.fetchByPrimaryKey(new DossierDoc2TemplatePK(dossierDocId, docTemplateId));
		removeDossierDoc2Template(dossierDoc2Template);
	}
	
	public DossierDoc2Template getDossierDoc2Template(long dossierDocId, long docTemplateId) throws PortalException, SystemException {
		return dossierDoc2TemplatePersistence.findByPrimaryKey(new DossierDoc2TemplatePK(dossierDocId, docTemplateId));
	}
	
	protected void validate() throws PortalException {
	}
	
	private static Log _log = LogFactoryUtil.getLog(DossierDoc2TemplateLocalServiceImpl.class);
	
}