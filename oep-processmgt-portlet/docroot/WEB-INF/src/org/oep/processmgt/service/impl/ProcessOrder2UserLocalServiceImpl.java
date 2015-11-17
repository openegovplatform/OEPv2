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

import java.util.List;

import org.oep.processmgt.model.ProcessOrder2User;
import org.oep.processmgt.service.impl.ProcessOrder2UserLocalServiceImpl;
import org.oep.processmgt.service.persistence.ProcessOrder2UserPK;
import org.oep.processmgt.service.base.ProcessOrder2UserLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.service.ServiceContext;

/**
 * API cung cấp thao tác với dữ liệu thông tin xử lý hồ sơ với vai trò.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.processmgt.service.ProcessOrder2UserLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.processmgt.service.base.ProcessOrder2UserLocalServiceBaseImpl
 * @see org.oep.processmgt.service.ProcessOrder2UserLocalServiceUtil
 */
public class ProcessOrder2UserLocalServiceImpl
	extends ProcessOrder2UserLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.processmgt.service.ProcessOrder2UserLocalServiceUtil} to access the process order2 user local service.
	 */
	/** 
	 * Thêm quan hệ giữa thông tin xử lý hồ sơ với người xử lý hồ sơ
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param processOrderId mã thông tin xử lý hồ sơ
	 * @param userId mã vai trò
	 * @return: quan hệ giữa thông tin xử lý hồ sơ với cán bộ xử lýủe
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public ProcessOrder2User addProcessOrder2User(
			long processOrderId,
			long userId,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate();
		ProcessOrder2User processOrder2User = processOrder2UserPersistence.create(new ProcessOrder2UserPK(processOrderId, userId));
				
		
		processOrder2UserPersistence.update(processOrder2User);

		if (_log.isInfoEnabled()) {
			_log.info("Create new processorder2user");
		}
		
		return getProcessOrder2User(processOrderId, userId);
	}
			
	public void removeProcessOrder2User(ProcessOrder2User processOrder2User) throws PortalException, SystemException {
		processOrder2UserPersistence.remove(processOrder2User);
	}
	
	public void removeProcessOrder2User(long processOrderId, long userId) throws PortalException, SystemException {
		ProcessOrder2User processOrder2User = processOrder2UserPersistence.fetchByPrimaryKey(new ProcessOrder2UserPK(processOrderId, userId));
		removeProcessOrder2User(processOrder2User);
	}
	
	public ProcessOrder2User getProcessOrder2User(long processOrderId, long userId) throws PortalException, SystemException {
		return processOrder2UserPersistence.findByPrimaryKey(new ProcessOrder2UserPK(processOrderId, userId));
	}
	
	public List<ProcessOrder2User> getAllByProcessOrderId(long processOrderId) throws PortalException, SystemException {
		return processOrder2UserPersistence.findByP(processOrderId);
	}
	
	public List<ProcessOrder2User> getAllByUserId(long userId) throws PortalException, SystemException {
		return processOrder2UserPersistence.findByU(userId);
	}
	protected void validate() throws PortalException {
	}
	
	private static Log _log = LogFactoryUtil.getLog(ProcessOrder2UserLocalServiceImpl.class);
	
}