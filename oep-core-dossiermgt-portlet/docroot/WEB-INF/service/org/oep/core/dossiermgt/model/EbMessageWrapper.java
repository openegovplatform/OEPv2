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

package org.oep.core.dossiermgt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EbMessage}.
 * </p>
 *
 * @author trungdk
 * @see EbMessage
 * @generated
 */
public class EbMessageWrapper implements EbMessage, ModelWrapper<EbMessage> {
	public EbMessageWrapper(EbMessage ebMessage) {
		_ebMessage = ebMessage;
	}

	@Override
	public Class<?> getModelClass() {
		return EbMessage.class;
	}

	@Override
	public String getModelClassName() {
		return EbMessage.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ebMessageId", getEbMessageId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("createDate", getCreateDate());
		attributes.put("messageId", getMessageId());
		attributes.put("cpaId", getCpaId());
		attributes.put("service", getService());
		attributes.put("action", getAction());
		attributes.put("conversationId", getConversationId());
		attributes.put("fromPartyId", getFromPartyId());
		attributes.put("fromPartyType", getFromPartyType());
		attributes.put("toPartyId", getToPartyId());
		attributes.put("toPartyType", getToPartyType());
		attributes.put("refToMessageId", getRefToMessageId());
		attributes.put("status", getStatus());
		attributes.put("statusDescription", getStatusDescription());
		attributes.put("ackMessageId", getAckMessageId());
		attributes.put("ackStatus", getAckStatus());
		attributes.put("ackStatusDescription", getAckStatusDescription());
		attributes.put("messageDescription", getMessageDescription());
		attributes.put("inbound", getInbound());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ebMessageId = (Long)attributes.get("ebMessageId");

		if (ebMessageId != null) {
			setEbMessageId(ebMessageId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		String messageId = (String)attributes.get("messageId");

		if (messageId != null) {
			setMessageId(messageId);
		}

		String cpaId = (String)attributes.get("cpaId");

		if (cpaId != null) {
			setCpaId(cpaId);
		}

		String service = (String)attributes.get("service");

		if (service != null) {
			setService(service);
		}

		String action = (String)attributes.get("action");

		if (action != null) {
			setAction(action);
		}

		String conversationId = (String)attributes.get("conversationId");

		if (conversationId != null) {
			setConversationId(conversationId);
		}

		String fromPartyId = (String)attributes.get("fromPartyId");

		if (fromPartyId != null) {
			setFromPartyId(fromPartyId);
		}

		String fromPartyType = (String)attributes.get("fromPartyType");

		if (fromPartyType != null) {
			setFromPartyType(fromPartyType);
		}

		String toPartyId = (String)attributes.get("toPartyId");

		if (toPartyId != null) {
			setToPartyId(toPartyId);
		}

		String toPartyType = (String)attributes.get("toPartyType");

		if (toPartyType != null) {
			setToPartyType(toPartyType);
		}

		String refToMessageId = (String)attributes.get("refToMessageId");

		if (refToMessageId != null) {
			setRefToMessageId(refToMessageId);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String statusDescription = (String)attributes.get("statusDescription");

		if (statusDescription != null) {
			setStatusDescription(statusDescription);
		}

		String ackMessageId = (String)attributes.get("ackMessageId");

		if (ackMessageId != null) {
			setAckMessageId(ackMessageId);
		}

		String ackStatus = (String)attributes.get("ackStatus");

		if (ackStatus != null) {
			setAckStatus(ackStatus);
		}

		String ackStatusDescription = (String)attributes.get(
				"ackStatusDescription");

		if (ackStatusDescription != null) {
			setAckStatusDescription(ackStatusDescription);
		}

		String messageDescription = (String)attributes.get("messageDescription");

		if (messageDescription != null) {
			setMessageDescription(messageDescription);
		}

		Integer inbound = (Integer)attributes.get("inbound");

		if (inbound != null) {
			setInbound(inbound);
		}
	}

	/**
	* Returns the primary key of this eb message.
	*
	* @return the primary key of this eb message
	*/
	@Override
	public long getPrimaryKey() {
		return _ebMessage.getPrimaryKey();
	}

	/**
	* Sets the primary key of this eb message.
	*
	* @param primaryKey the primary key of this eb message
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_ebMessage.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the eb message ID of this eb message.
	*
	* @return the eb message ID of this eb message
	*/
	@Override
	public long getEbMessageId() {
		return _ebMessage.getEbMessageId();
	}

	/**
	* Sets the eb message ID of this eb message.
	*
	* @param ebMessageId the eb message ID of this eb message
	*/
	@Override
	public void setEbMessageId(long ebMessageId) {
		_ebMessage.setEbMessageId(ebMessageId);
	}

	/**
	* Returns the company ID of this eb message.
	*
	* @return the company ID of this eb message
	*/
	@Override
	public long getCompanyId() {
		return _ebMessage.getCompanyId();
	}

	/**
	* Sets the company ID of this eb message.
	*
	* @param companyId the company ID of this eb message
	*/
	@Override
	public void setCompanyId(long companyId) {
		_ebMessage.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this eb message.
	*
	* @return the user ID of this eb message
	*/
	@Override
	public long getUserId() {
		return _ebMessage.getUserId();
	}

	/**
	* Sets the user ID of this eb message.
	*
	* @param userId the user ID of this eb message
	*/
	@Override
	public void setUserId(long userId) {
		_ebMessage.setUserId(userId);
	}

	/**
	* Returns the user uuid of this eb message.
	*
	* @return the user uuid of this eb message
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ebMessage.getUserUuid();
	}

	/**
	* Sets the user uuid of this eb message.
	*
	* @param userUuid the user uuid of this eb message
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_ebMessage.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this eb message.
	*
	* @return the group ID of this eb message
	*/
	@Override
	public long getGroupId() {
		return _ebMessage.getGroupId();
	}

	/**
	* Sets the group ID of this eb message.
	*
	* @param groupId the group ID of this eb message
	*/
	@Override
	public void setGroupId(long groupId) {
		_ebMessage.setGroupId(groupId);
	}

	/**
	* Returns the create date of this eb message.
	*
	* @return the create date of this eb message
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _ebMessage.getCreateDate();
	}

	/**
	* Sets the create date of this eb message.
	*
	* @param createDate the create date of this eb message
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_ebMessage.setCreateDate(createDate);
	}

	/**
	* Returns the message ID of this eb message.
	*
	* @return the message ID of this eb message
	*/
	@Override
	public java.lang.String getMessageId() {
		return _ebMessage.getMessageId();
	}

	/**
	* Sets the message ID of this eb message.
	*
	* @param messageId the message ID of this eb message
	*/
	@Override
	public void setMessageId(java.lang.String messageId) {
		_ebMessage.setMessageId(messageId);
	}

	/**
	* Returns the cpa ID of this eb message.
	*
	* @return the cpa ID of this eb message
	*/
	@Override
	public java.lang.String getCpaId() {
		return _ebMessage.getCpaId();
	}

	/**
	* Sets the cpa ID of this eb message.
	*
	* @param cpaId the cpa ID of this eb message
	*/
	@Override
	public void setCpaId(java.lang.String cpaId) {
		_ebMessage.setCpaId(cpaId);
	}

	/**
	* Returns the service of this eb message.
	*
	* @return the service of this eb message
	*/
	@Override
	public java.lang.String getService() {
		return _ebMessage.getService();
	}

	/**
	* Sets the service of this eb message.
	*
	* @param service the service of this eb message
	*/
	@Override
	public void setService(java.lang.String service) {
		_ebMessage.setService(service);
	}

	/**
	* Returns the action of this eb message.
	*
	* @return the action of this eb message
	*/
	@Override
	public java.lang.String getAction() {
		return _ebMessage.getAction();
	}

	/**
	* Sets the action of this eb message.
	*
	* @param action the action of this eb message
	*/
	@Override
	public void setAction(java.lang.String action) {
		_ebMessage.setAction(action);
	}

	/**
	* Returns the conversation ID of this eb message.
	*
	* @return the conversation ID of this eb message
	*/
	@Override
	public java.lang.String getConversationId() {
		return _ebMessage.getConversationId();
	}

	/**
	* Sets the conversation ID of this eb message.
	*
	* @param conversationId the conversation ID of this eb message
	*/
	@Override
	public void setConversationId(java.lang.String conversationId) {
		_ebMessage.setConversationId(conversationId);
	}

	/**
	* Returns the from party ID of this eb message.
	*
	* @return the from party ID of this eb message
	*/
	@Override
	public java.lang.String getFromPartyId() {
		return _ebMessage.getFromPartyId();
	}

	/**
	* Sets the from party ID of this eb message.
	*
	* @param fromPartyId the from party ID of this eb message
	*/
	@Override
	public void setFromPartyId(java.lang.String fromPartyId) {
		_ebMessage.setFromPartyId(fromPartyId);
	}

	/**
	* Returns the from party type of this eb message.
	*
	* @return the from party type of this eb message
	*/
	@Override
	public java.lang.String getFromPartyType() {
		return _ebMessage.getFromPartyType();
	}

	/**
	* Sets the from party type of this eb message.
	*
	* @param fromPartyType the from party type of this eb message
	*/
	@Override
	public void setFromPartyType(java.lang.String fromPartyType) {
		_ebMessage.setFromPartyType(fromPartyType);
	}

	/**
	* Returns the to party ID of this eb message.
	*
	* @return the to party ID of this eb message
	*/
	@Override
	public java.lang.String getToPartyId() {
		return _ebMessage.getToPartyId();
	}

	/**
	* Sets the to party ID of this eb message.
	*
	* @param toPartyId the to party ID of this eb message
	*/
	@Override
	public void setToPartyId(java.lang.String toPartyId) {
		_ebMessage.setToPartyId(toPartyId);
	}

	/**
	* Returns the to party type of this eb message.
	*
	* @return the to party type of this eb message
	*/
	@Override
	public java.lang.String getToPartyType() {
		return _ebMessage.getToPartyType();
	}

	/**
	* Sets the to party type of this eb message.
	*
	* @param toPartyType the to party type of this eb message
	*/
	@Override
	public void setToPartyType(java.lang.String toPartyType) {
		_ebMessage.setToPartyType(toPartyType);
	}

	/**
	* Returns the ref to message ID of this eb message.
	*
	* @return the ref to message ID of this eb message
	*/
	@Override
	public java.lang.String getRefToMessageId() {
		return _ebMessage.getRefToMessageId();
	}

	/**
	* Sets the ref to message ID of this eb message.
	*
	* @param refToMessageId the ref to message ID of this eb message
	*/
	@Override
	public void setRefToMessageId(java.lang.String refToMessageId) {
		_ebMessage.setRefToMessageId(refToMessageId);
	}

	/**
	* Returns the status of this eb message.
	*
	* @return the status of this eb message
	*/
	@Override
	public java.lang.String getStatus() {
		return _ebMessage.getStatus();
	}

	/**
	* Sets the status of this eb message.
	*
	* @param status the status of this eb message
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_ebMessage.setStatus(status);
	}

	/**
	* Returns the status description of this eb message.
	*
	* @return the status description of this eb message
	*/
	@Override
	public java.lang.String getStatusDescription() {
		return _ebMessage.getStatusDescription();
	}

	/**
	* Sets the status description of this eb message.
	*
	* @param statusDescription the status description of this eb message
	*/
	@Override
	public void setStatusDescription(java.lang.String statusDescription) {
		_ebMessage.setStatusDescription(statusDescription);
	}

	/**
	* Returns the ack message ID of this eb message.
	*
	* @return the ack message ID of this eb message
	*/
	@Override
	public java.lang.String getAckMessageId() {
		return _ebMessage.getAckMessageId();
	}

	/**
	* Sets the ack message ID of this eb message.
	*
	* @param ackMessageId the ack message ID of this eb message
	*/
	@Override
	public void setAckMessageId(java.lang.String ackMessageId) {
		_ebMessage.setAckMessageId(ackMessageId);
	}

	/**
	* Returns the ack status of this eb message.
	*
	* @return the ack status of this eb message
	*/
	@Override
	public java.lang.String getAckStatus() {
		return _ebMessage.getAckStatus();
	}

	/**
	* Sets the ack status of this eb message.
	*
	* @param ackStatus the ack status of this eb message
	*/
	@Override
	public void setAckStatus(java.lang.String ackStatus) {
		_ebMessage.setAckStatus(ackStatus);
	}

	/**
	* Returns the ack status description of this eb message.
	*
	* @return the ack status description of this eb message
	*/
	@Override
	public java.lang.String getAckStatusDescription() {
		return _ebMessage.getAckStatusDescription();
	}

	/**
	* Sets the ack status description of this eb message.
	*
	* @param ackStatusDescription the ack status description of this eb message
	*/
	@Override
	public void setAckStatusDescription(java.lang.String ackStatusDescription) {
		_ebMessage.setAckStatusDescription(ackStatusDescription);
	}

	/**
	* Returns the message description of this eb message.
	*
	* @return the message description of this eb message
	*/
	@Override
	public java.lang.String getMessageDescription() {
		return _ebMessage.getMessageDescription();
	}

	/**
	* Sets the message description of this eb message.
	*
	* @param messageDescription the message description of this eb message
	*/
	@Override
	public void setMessageDescription(java.lang.String messageDescription) {
		_ebMessage.setMessageDescription(messageDescription);
	}

	/**
	* Returns the inbound of this eb message.
	*
	* @return the inbound of this eb message
	*/
	@Override
	public int getInbound() {
		return _ebMessage.getInbound();
	}

	/**
	* Sets the inbound of this eb message.
	*
	* @param inbound the inbound of this eb message
	*/
	@Override
	public void setInbound(int inbound) {
		_ebMessage.setInbound(inbound);
	}

	@Override
	public boolean isNew() {
		return _ebMessage.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_ebMessage.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _ebMessage.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_ebMessage.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _ebMessage.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _ebMessage.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_ebMessage.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _ebMessage.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_ebMessage.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_ebMessage.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_ebMessage.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EbMessageWrapper((EbMessage)_ebMessage.clone());
	}

	@Override
	public int compareTo(org.oep.core.dossiermgt.model.EbMessage ebMessage) {
		return _ebMessage.compareTo(ebMessage);
	}

	@Override
	public int hashCode() {
		return _ebMessage.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.core.dossiermgt.model.EbMessage> toCacheModel() {
		return _ebMessage.toCacheModel();
	}

	@Override
	public org.oep.core.dossiermgt.model.EbMessage toEscapedModel() {
		return new EbMessageWrapper(_ebMessage.toEscapedModel());
	}

	@Override
	public org.oep.core.dossiermgt.model.EbMessage toUnescapedModel() {
		return new EbMessageWrapper(_ebMessage.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _ebMessage.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _ebMessage.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_ebMessage.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EbMessageWrapper)) {
			return false;
		}

		EbMessageWrapper ebMessageWrapper = (EbMessageWrapper)obj;

		if (Validator.equals(_ebMessage, ebMessageWrapper._ebMessage)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public EbMessage getWrappedEbMessage() {
		return _ebMessage;
	}

	@Override
	public EbMessage getWrappedModel() {
		return _ebMessage;
	}

	@Override
	public void resetOriginalValues() {
		_ebMessage.resetOriginalValues();
	}

	private EbMessage _ebMessage;
}