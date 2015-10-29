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

import org.oep.core.processmgt.model.DocFile2ProcessOrder;
import org.oep.core.processmgt.service.base.DocFile2ProcessOrderLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.service.ServiceContext;

/**
 * API cung cấp các thao tác với quan hệ tài liệu trong hồ sơ với thông tin xử lý hồ sơ.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.processmgt.service.DocFile2ProcessOrderLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.core.processmgt.service.base.DocFile2ProcessOrderLocalServiceBaseImpl
 * @see org.oep.core.processmgt.service.DocFile2ProcessOrderLocalServiceUtil
 */
public class DocFile2ProcessOrderLocalServiceImpl
	extends DocFile2ProcessOrderLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.processmgt.service.DocFile2ProcessOrderLocalServiceUtil} to access the doc file2 process order local service.
	 */
	
	/** 
	 * Thêm quan hệ tài liệu hồ sơ với thông tin xử lý hồ sơ
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param docFileId mã tài liệu
	 * @param processOrderId mã thông tin xử lý hồ sơ
	 * @return: quan hệ giữa quan hệ thủ tục hành chính với vai trò
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public DocFile2ProcessOrder addDocFile2ProcessOrder(
			long docFileId,
			long processOrderId,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate();
		long id = counterLocalService.increment();
		DocFile2ProcessOrder docFile2ProcessOrder = docFile2ProcessOrderPersistence.create(id);
		docFile2ProcessOrder.setDocFileId(docFileId);
		docFile2ProcessOrder.setProcessOrderId(processOrderId);
		
		docFile2ProcessOrderPersistence.update(docFile2ProcessOrder);

		if (_log.isInfoEnabled()) {
			_log.info("Create new docfile2processorder");
		}
		
		return getDocFile2ProcessOrder(id);
	}
			
	public void removeDocFile2ProcessOrder(DocFile2ProcessOrder docFile2ProcessOrder) throws PortalException, SystemException {
		docFile2ProcessOrderPersistence.remove(docFile2ProcessOrder);
	}
	
	public void removeDocFile2ProcessOrder(long id) throws PortalException, SystemException {
		DocFile2ProcessOrder docFile2ProcessOrder = docFile2ProcessOrderPersistence.fetchByPrimaryKey(id);
		removeDocFile2ProcessOrder(docFile2ProcessOrder);
	}
	
	public DocFile2ProcessOrder getDocFile2ProcessOrder(long id) throws PortalException, SystemException {
		return docFile2ProcessOrderPersistence.findByPrimaryKey(id);
	}
	
	protected void validate() throws PortalException {
	}
	
	private static Log _log = LogFactoryUtil.getLog(DocFile2ProcessOrderLocalServiceImpl.class);
		
}