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

import org.oep.core.dossiermgt.model.DossierProc;
import org.oep.core.dossiermgt.permission.ActionKeys;
import org.oep.core.dossiermgt.service.DossierProcLocalServiceUtil;
import org.oep.core.dossiermgt.service.base.DossierProcServiceBaseImpl;
import org.oep.core.dossiermgt.service.permission.DossierProcPermission;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.service.ServiceContext;

/**
 * Dịch vụ thao tác thủ tục hành chính từ xa
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.base.DossierProcServiceBaseImpl
 * @see org.oep.core.dossiermgt.service.DossierProcServiceUtil
 */
public class DossierProcServiceImpl extends DossierProcServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.dossiermgt.service.DossierProcServiceUtil} to access the dossier proc remote service.
	 */

	/** 
	 * Thêm mới một thủ tục hành chính công
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới thủ tục hành chính
	 * @param dossierProcNo mã thủ tục hành chính
	 * @param name tên thủ tục hành chính
	 * @param enName tên Tiếng Anh của thủ tục hành chính
	 * @param shortName tên viết tắt
	 * @param processDescription Trình tự thực hiện thủ tục hành chính
	 * @param methodDescription Cách thức thực hiện
	 * @param dossierDescription Thành phần hồ sơ
	 * @param conditionDescription Điều kiện thực hiện
	 * @param durationDescription Thời hạn giải quyết
	 * @param actorsDescription Đối tượng thực hiện thủ tục
	 * @param resultsDescription Mô tả kết quả thủ tục
	 * @param recordsDescription Mô tả căn cứ pháp lý HTML
	 * @param feeDescription Mô tả phí và lệ phí thực hiện
	 * @param instructionsDescription Mô tả hướng dẫn dạng HTML
	 * @param administrationNo Cấp quản lý
	 * @param domainNo Đơn vị quản lý
	 * @param effectDate Ngày bắt đầu có hiệu lực
	 * @param expireDate Ngày hết hiệu lực
	 * @param active Trạng thái hoạt động của thủ tục hành chính
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: đối tượng thủ tục hành chính mới được thêm vào
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public DossierProc addDossierProc(
			long userId,
			String dossierProcNo, 
			String name, 
			String enName,
			String shortName,
			String processDescription,
			String methodDescription,
			String dossierDescription,
			String conditionDescription,
			String durationDescription,
			String actorsDescription,
			String resultsDescription,
			String recordsDescription,
			String feeDescription,
			String instructionsDescription,
			String administrationNo,
			String domainNo,
			Date effectDate,
			Date expireDate,
			int forCitizen,
			int forBusiness,
			int statusActive,
			ServiceContext serviceContext) throws SystemException, PortalException {
		DossierProcPermission.check(getPermissionChecker(), serviceContext.getScopeGroupId(), ActionKeys.ADD_DOSSIERPROC);
		return DossierProcLocalServiceUtil.addDossierProc(userId, dossierProcNo, name, enName, shortName, processDescription, methodDescription, dossierDescription, conditionDescription, durationDescription, actorsDescription, resultsDescription, recordsDescription, feeDescription, instructionsDescription, administrationNo, domainNo, forCitizen, forBusiness, effectDate, expireDate, statusActive, serviceContext);
	}	
}