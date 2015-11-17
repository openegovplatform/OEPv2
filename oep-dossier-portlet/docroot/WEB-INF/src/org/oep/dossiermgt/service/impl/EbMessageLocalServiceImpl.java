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

import org.oep.dossiermgt.model.EbMessage;
import org.oep.dossiermgt.service.base.EbMessageLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * API cung cấp thao tác với thông điệp gửi thông qua ebXML.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.dossiermgt.service.EbMessageLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.dossiermgt.service.base.EbMessageLocalServiceBaseImpl
 * @see org.oep.dossiermgt.service.EbMessageLocalServiceUtil
 */
public class EbMessageLocalServiceImpl extends EbMessageLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.dossiermgt.service.EbMessageLocalServiceUtil} to access the eb message local service.
	 */
	
	/** 
	 * Thêm thông điệp ebXML
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param messageId mã định danh thông điệp
	 * @param cpaId
	 * @param service
	 * @param action
	 * @param conversationId
	 * @param fromPartyId
	 * @param fromPartyType
	 * @param toPartyId
	 * @param toPartyType
	 * @param refToMessageId
	 * @param status
	 * @param statusDescription
	 * @param ackMessageId
	 * @param ackStatusDescription
	 * @param messageDescription
	 * @param inbound
	 * @return: thông điệp mới được tạo
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public EbMessage addEbMessage(
			String messageId,
			String cpaId,
			String service,
			String action,
			String conversationId,
			String fromPartyId,
			String fromPartyType,
			String toPartyId,
			String toPartyType,
			String refToMessageId,
			String status,
			String statusDescription,
			String ackMessageId,
			String ackStatus,
			String ackStatusDescription,
			String messageDescription,
			int inbound,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate();
		long id = counterLocalService.increment();
		EbMessage ebMessage = ebMessagePersistence.create(id);
		Date now = new Date();
				
		ebMessage.setCompanyId(serviceContext.getCompanyId());
		ebMessage.setCreateDate(serviceContext.getCreateDate(now));
		ebMessage.setMessageId(ackMessageId);
		ebMessage.setCpaId(cpaId);
		ebMessage.setService(service);
		ebMessage.setAction(action);
		ebMessage.setConversationId(conversationId);
		ebMessage.setFromPartyId(fromPartyId);
		ebMessage.setFromPartyType(fromPartyType);
		ebMessage.setToPartyId(toPartyId);
		ebMessage.setToPartyType(toPartyType);
		ebMessage.setRefToMessageId(refToMessageId);
		ebMessage.setStatus(status);
		ebMessage.setStatusDescription(statusDescription);
		ebMessage.setAckMessageId(ackMessageId);
		ebMessage.setAckStatus(ackStatus);
		ebMessage.setAckStatusDescription(ackStatusDescription);
		ebMessage.setMessageDescription(messageDescription);
		ebMessage.setInbound(inbound);
		
		ebMessagePersistence.update(ebMessage);

		if (_log.isInfoEnabled()) {
			_log.info("Create new eb message " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addEbMessageResources(ebMessage, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addEbMessageResources(ebMessage, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getEbMessage(id);
	}

	/** 
	 * Cập nhật thông điệp ebXML
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param id mã thông điệp
	 * @param messageId mã định danh thông điệp
	 * @param cpaId
	 * @param service
	 * @param action
	 * @param conversationId
	 * @param fromPartyId
	 * @param fromPartyType
	 * @param toPartyId
	 * @param toPartyType
	 * @param refToMessageId
	 * @param status
	 * @param statusDescription
	 * @param ackMessageId
	 * @param ackStatusDescription
	 * @param messageDescription
	 * @param inbound
	 * @return: thông điệp mới được cập nhật
	 */
	@Indexable(type = IndexableType.REINDEX)
	public EbMessage updateEbMessage(
			long id, 
			String messageId,
			String cpaId,
			String service,
			String action,
			String conversationId,
			String fromPartyId,
			String fromPartyType,
			String toPartyId,
			String toPartyType,
			String refToMessageId,
			String status,
			String statusDescription,
			String ackMessageId,
			String ackStatus,
			String ackStatusDescription,
			String messageDescription,
			int inbound,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		validate();

		EbMessage ebMessage = ebMessagePersistence.findByPrimaryKey(id);

		ebMessage.setMessageId(ackMessageId);
		ebMessage.setCpaId(cpaId);
		ebMessage.setService(service);
		ebMessage.setAction(action);
		ebMessage.setConversationId(conversationId);
		ebMessage.setFromPartyId(fromPartyId);
		ebMessage.setFromPartyType(fromPartyType);
		ebMessage.setToPartyId(toPartyId);
		ebMessage.setToPartyType(toPartyType);
		ebMessage.setRefToMessageId(refToMessageId);
		ebMessage.setStatus(status);
		ebMessage.setStatusDescription(statusDescription);
		ebMessage.setAckMessageId(ackMessageId);
		ebMessage.setAckStatus(ackStatus);
		ebMessage.setAckStatusDescription(ackStatusDescription);
		ebMessage.setMessageDescription(messageDescription);
		ebMessage.setInbound(inbound);

		ebMessagePersistence.update(ebMessage);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateEbMessageResources(
				ebMessage, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getEbMessage(ebMessage.getEbMessageId());
	}
	
	public void updateEbMessageResources(
			EbMessage ebMessage, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			ebMessage.getCompanyId(), serviceContext.getScopeGroupId(),
			EbMessage.class.getName(), ebMessage.getEbMessageId(), groupPermissions,
			guestPermissions);
	}
	
	public void removeEbMessage(EbMessage ebMessage) throws PortalException, SystemException {
		ebMessagePersistence.remove(ebMessage);
		resourceLocalService.deleteResource(ebMessage.getCompanyId(), EbMessage.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, ebMessage.getEbMessageId());
	}
	
	public void removeEbMessage(long id) throws PortalException, SystemException {
		EbMessage ebMessage = ebMessagePersistence.findByPrimaryKey(id);
		removeEbMessage(ebMessage);
	}
	
	public EbMessage getEbMessage(long id) throws PortalException, SystemException {
		return ebMessagePersistence.findByPrimaryKey(id);
	}

	public void addEbMessageResources(EbMessage ebMessage, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(ebMessage.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), EbMessage.class.getName(), ebMessage.getEbMessageId(), false, addGroupPermission, addGuestPermission);
	}

	public void addEbMessageResources(EbMessage ebMessage, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(ebMessage.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), EbMessage.class.getName(), ebMessage.getEbMessageId(), groupPermissions, guestPermissions);
	}
	
	public void addEbMessageResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		EbMessage ebMessage = ebMessagePersistence.findByPrimaryKey(id);
		addEbMessageResources(ebMessage, groupPermissions, guestPermissions, serviceContext);
	}
	
	protected void validate() throws PortalException {
	}
	
	private static Log _log = LogFactoryUtil.getLog(EbMessageLocalServiceImpl.class);
	
}