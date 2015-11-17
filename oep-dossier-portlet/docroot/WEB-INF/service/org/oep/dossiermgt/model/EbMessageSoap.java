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

package org.oep.dossiermgt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.oep.dossiermgt.service.http.EbMessageServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.dossiermgt.service.http.EbMessageServiceSoap
 * @generated
 */
public class EbMessageSoap implements Serializable {
	public static EbMessageSoap toSoapModel(EbMessage model) {
		EbMessageSoap soapModel = new EbMessageSoap();

		soapModel.setEbMessageId(model.getEbMessageId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setMessageId(model.getMessageId());
		soapModel.setCpaId(model.getCpaId());
		soapModel.setService(model.getService());
		soapModel.setAction(model.getAction());
		soapModel.setConversationId(model.getConversationId());
		soapModel.setFromPartyId(model.getFromPartyId());
		soapModel.setFromPartyType(model.getFromPartyType());
		soapModel.setToPartyId(model.getToPartyId());
		soapModel.setToPartyType(model.getToPartyType());
		soapModel.setRefToMessageId(model.getRefToMessageId());
		soapModel.setStatus(model.getStatus());
		soapModel.setStatusDescription(model.getStatusDescription());
		soapModel.setAckMessageId(model.getAckMessageId());
		soapModel.setAckStatus(model.getAckStatus());
		soapModel.setAckStatusDescription(model.getAckStatusDescription());
		soapModel.setMessageDescription(model.getMessageDescription());
		soapModel.setInbound(model.getInbound());

		return soapModel;
	}

	public static EbMessageSoap[] toSoapModels(EbMessage[] models) {
		EbMessageSoap[] soapModels = new EbMessageSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EbMessageSoap[][] toSoapModels(EbMessage[][] models) {
		EbMessageSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EbMessageSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EbMessageSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EbMessageSoap[] toSoapModels(List<EbMessage> models) {
		List<EbMessageSoap> soapModels = new ArrayList<EbMessageSoap>(models.size());

		for (EbMessage model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EbMessageSoap[soapModels.size()]);
	}

	public EbMessageSoap() {
	}

	public long getPrimaryKey() {
		return _ebMessageId;
	}

	public void setPrimaryKey(long pk) {
		setEbMessageId(pk);
	}

	public long getEbMessageId() {
		return _ebMessageId;
	}

	public void setEbMessageId(long ebMessageId) {
		_ebMessageId = ebMessageId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public String getMessageId() {
		return _messageId;
	}

	public void setMessageId(String messageId) {
		_messageId = messageId;
	}

	public String getCpaId() {
		return _cpaId;
	}

	public void setCpaId(String cpaId) {
		_cpaId = cpaId;
	}

	public String getService() {
		return _service;
	}

	public void setService(String service) {
		_service = service;
	}

	public String getAction() {
		return _action;
	}

	public void setAction(String action) {
		_action = action;
	}

	public String getConversationId() {
		return _conversationId;
	}

	public void setConversationId(String conversationId) {
		_conversationId = conversationId;
	}

	public String getFromPartyId() {
		return _fromPartyId;
	}

	public void setFromPartyId(String fromPartyId) {
		_fromPartyId = fromPartyId;
	}

	public String getFromPartyType() {
		return _fromPartyType;
	}

	public void setFromPartyType(String fromPartyType) {
		_fromPartyType = fromPartyType;
	}

	public String getToPartyId() {
		return _toPartyId;
	}

	public void setToPartyId(String toPartyId) {
		_toPartyId = toPartyId;
	}

	public String getToPartyType() {
		return _toPartyType;
	}

	public void setToPartyType(String toPartyType) {
		_toPartyType = toPartyType;
	}

	public String getRefToMessageId() {
		return _refToMessageId;
	}

	public void setRefToMessageId(String refToMessageId) {
		_refToMessageId = refToMessageId;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	public String getStatusDescription() {
		return _statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		_statusDescription = statusDescription;
	}

	public String getAckMessageId() {
		return _ackMessageId;
	}

	public void setAckMessageId(String ackMessageId) {
		_ackMessageId = ackMessageId;
	}

	public String getAckStatus() {
		return _ackStatus;
	}

	public void setAckStatus(String ackStatus) {
		_ackStatus = ackStatus;
	}

	public String getAckStatusDescription() {
		return _ackStatusDescription;
	}

	public void setAckStatusDescription(String ackStatusDescription) {
		_ackStatusDescription = ackStatusDescription;
	}

	public String getMessageDescription() {
		return _messageDescription;
	}

	public void setMessageDescription(String messageDescription) {
		_messageDescription = messageDescription;
	}

	public int getInbound() {
		return _inbound;
	}

	public void setInbound(int inbound) {
		_inbound = inbound;
	}

	private long _ebMessageId;
	private long _companyId;
	private long _userId;
	private long _groupId;
	private Date _createDate;
	private String _messageId;
	private String _cpaId;
	private String _service;
	private String _action;
	private String _conversationId;
	private String _fromPartyId;
	private String _fromPartyType;
	private String _toPartyId;
	private String _toPartyType;
	private String _refToMessageId;
	private String _status;
	private String _statusDescription;
	private String _ackMessageId;
	private String _ackStatus;
	private String _ackStatusDescription;
	private String _messageDescription;
	private int _inbound;
}