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

package org.oep.ssomgt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.oep.ssomgt.service.http.AppMessageServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.ssomgt.service.http.AppMessageServiceSoap
 * @generated
 */
public class AppMessageSoap implements Serializable {
	public static AppMessageSoap toSoapModel(AppMessage model) {
		AppMessageSoap soapModel = new AppMessageSoap();

		soapModel.setAppMessageId(model.getAppMessageId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setFromApplication(model.getFromApplication());
		soapModel.setToUser(model.getToUser());
		soapModel.setMessageType(model.getMessageType());
		soapModel.setMessageCode(model.getMessageCode());
		soapModel.setMessageText(model.getMessageText());
		soapModel.setMessageValue(model.getMessageValue());
		soapModel.setMessageUrl(model.getMessageUrl());
		soapModel.setVisitDate(model.getVisitDate());

		return soapModel;
	}

	public static AppMessageSoap[] toSoapModels(AppMessage[] models) {
		AppMessageSoap[] soapModels = new AppMessageSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AppMessageSoap[][] toSoapModels(AppMessage[][] models) {
		AppMessageSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AppMessageSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AppMessageSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AppMessageSoap[] toSoapModels(List<AppMessage> models) {
		List<AppMessageSoap> soapModels = new ArrayList<AppMessageSoap>(models.size());

		for (AppMessage model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AppMessageSoap[soapModels.size()]);
	}

	public AppMessageSoap() {
	}

	public long getPrimaryKey() {
		return _appMessageId;
	}

	public void setPrimaryKey(long pk) {
		setAppMessageId(pk);
	}

	public long getAppMessageId() {
		return _appMessageId;
	}

	public void setAppMessageId(long appMessageId) {
		_appMessageId = appMessageId;
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

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public String getFromApplication() {
		return _fromApplication;
	}

	public void setFromApplication(String fromApplication) {
		_fromApplication = fromApplication;
	}

	public String getToUser() {
		return _toUser;
	}

	public void setToUser(String toUser) {
		_toUser = toUser;
	}

	public String getMessageType() {
		return _messageType;
	}

	public void setMessageType(String messageType) {
		_messageType = messageType;
	}

	public String getMessageCode() {
		return _messageCode;
	}

	public void setMessageCode(String messageCode) {
		_messageCode = messageCode;
	}

	public String getMessageText() {
		return _messageText;
	}

	public void setMessageText(String messageText) {
		_messageText = messageText;
	}

	public String getMessageValue() {
		return _messageValue;
	}

	public void setMessageValue(String messageValue) {
		_messageValue = messageValue;
	}

	public String getMessageUrl() {
		return _messageUrl;
	}

	public void setMessageUrl(String messageUrl) {
		_messageUrl = messageUrl;
	}

	public Date getVisitDate() {
		return _visitDate;
	}

	public void setVisitDate(Date visitDate) {
		_visitDate = visitDate;
	}

	private long _appMessageId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private String _fromApplication;
	private String _toUser;
	private String _messageType;
	private String _messageCode;
	private String _messageText;
	private String _messageValue;
	private String _messageUrl;
	private Date _visitDate;
}