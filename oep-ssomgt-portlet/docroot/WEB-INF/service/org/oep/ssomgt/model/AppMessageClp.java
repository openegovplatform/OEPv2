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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import org.oep.ssomgt.service.AppMessageLocalServiceUtil;
import org.oep.ssomgt.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class AppMessageClp extends BaseModelImpl<AppMessage>
	implements AppMessage {
	public AppMessageClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return AppMessage.class;
	}

	@Override
	public String getModelClassName() {
		return AppMessage.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _appMessageId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAppMessageId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _appMessageId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("appMessageId", getAppMessageId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("fromApplication", getFromApplication());
		attributes.put("toUser", getToUser());
		attributes.put("messageType", getMessageType());
		attributes.put("messageCode", getMessageCode());
		attributes.put("messageText", getMessageText());
		attributes.put("messageValue", getMessageValue());
		attributes.put("messageUrl", getMessageUrl());
		attributes.put("visitDate", getVisitDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long appMessageId = (Long)attributes.get("appMessageId");

		if (appMessageId != null) {
			setAppMessageId(appMessageId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		String fromApplication = (String)attributes.get("fromApplication");

		if (fromApplication != null) {
			setFromApplication(fromApplication);
		}

		String toUser = (String)attributes.get("toUser");

		if (toUser != null) {
			setToUser(toUser);
		}

		String messageType = (String)attributes.get("messageType");

		if (messageType != null) {
			setMessageType(messageType);
		}

		String messageCode = (String)attributes.get("messageCode");

		if (messageCode != null) {
			setMessageCode(messageCode);
		}

		String messageText = (String)attributes.get("messageText");

		if (messageText != null) {
			setMessageText(messageText);
		}

		String messageValue = (String)attributes.get("messageValue");

		if (messageValue != null) {
			setMessageValue(messageValue);
		}

		String messageUrl = (String)attributes.get("messageUrl");

		if (messageUrl != null) {
			setMessageUrl(messageUrl);
		}

		Date visitDate = (Date)attributes.get("visitDate");

		if (visitDate != null) {
			setVisitDate(visitDate);
		}
	}

	@Override
	public long getAppMessageId() {
		return _appMessageId;
	}

	@Override
	public void setAppMessageId(long appMessageId) {
		_appMessageId = appMessageId;

		if (_appMessageRemoteModel != null) {
			try {
				Class<?> clazz = _appMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setAppMessageId", long.class);

				method.invoke(_appMessageRemoteModel, appMessageId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_appMessageRemoteModel != null) {
			try {
				Class<?> clazz = _appMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_appMessageRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_appMessageRemoteModel != null) {
			try {
				Class<?> clazz = _appMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_appMessageRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_appMessageRemoteModel != null) {
			try {
				Class<?> clazz = _appMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_appMessageRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_appMessageRemoteModel != null) {
			try {
				Class<?> clazz = _appMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_appMessageRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFromApplication() {
		return _fromApplication;
	}

	@Override
	public void setFromApplication(String fromApplication) {
		_fromApplication = fromApplication;

		if (_appMessageRemoteModel != null) {
			try {
				Class<?> clazz = _appMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setFromApplication",
						String.class);

				method.invoke(_appMessageRemoteModel, fromApplication);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getToUser() {
		return _toUser;
	}

	@Override
	public void setToUser(String toUser) {
		_toUser = toUser;

		if (_appMessageRemoteModel != null) {
			try {
				Class<?> clazz = _appMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setToUser", String.class);

				method.invoke(_appMessageRemoteModel, toUser);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMessageType() {
		return _messageType;
	}

	@Override
	public void setMessageType(String messageType) {
		_messageType = messageType;

		if (_appMessageRemoteModel != null) {
			try {
				Class<?> clazz = _appMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setMessageType", String.class);

				method.invoke(_appMessageRemoteModel, messageType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMessageCode() {
		return _messageCode;
	}

	@Override
	public void setMessageCode(String messageCode) {
		_messageCode = messageCode;

		if (_appMessageRemoteModel != null) {
			try {
				Class<?> clazz = _appMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setMessageCode", String.class);

				method.invoke(_appMessageRemoteModel, messageCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMessageText() {
		return _messageText;
	}

	@Override
	public void setMessageText(String messageText) {
		_messageText = messageText;

		if (_appMessageRemoteModel != null) {
			try {
				Class<?> clazz = _appMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setMessageText", String.class);

				method.invoke(_appMessageRemoteModel, messageText);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMessageValue() {
		return _messageValue;
	}

	@Override
	public void setMessageValue(String messageValue) {
		_messageValue = messageValue;

		if (_appMessageRemoteModel != null) {
			try {
				Class<?> clazz = _appMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setMessageValue", String.class);

				method.invoke(_appMessageRemoteModel, messageValue);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMessageUrl() {
		return _messageUrl;
	}

	@Override
	public void setMessageUrl(String messageUrl) {
		_messageUrl = messageUrl;

		if (_appMessageRemoteModel != null) {
			try {
				Class<?> clazz = _appMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setMessageUrl", String.class);

				method.invoke(_appMessageRemoteModel, messageUrl);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getVisitDate() {
		return _visitDate;
	}

	@Override
	public void setVisitDate(Date visitDate) {
		_visitDate = visitDate;

		if (_appMessageRemoteModel != null) {
			try {
				Class<?> clazz = _appMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setVisitDate", Date.class);

				method.invoke(_appMessageRemoteModel, visitDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getAppMessageRemoteModel() {
		return _appMessageRemoteModel;
	}

	public void setAppMessageRemoteModel(BaseModel<?> appMessageRemoteModel) {
		_appMessageRemoteModel = appMessageRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _appMessageRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_appMessageRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AppMessageLocalServiceUtil.addAppMessage(this);
		}
		else {
			AppMessageLocalServiceUtil.updateAppMessage(this);
		}
	}

	@Override
	public AppMessage toEscapedModel() {
		return (AppMessage)ProxyUtil.newProxyInstance(AppMessage.class.getClassLoader(),
			new Class[] { AppMessage.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AppMessageClp clone = new AppMessageClp();

		clone.setAppMessageId(getAppMessageId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setFromApplication(getFromApplication());
		clone.setToUser(getToUser());
		clone.setMessageType(getMessageType());
		clone.setMessageCode(getMessageCode());
		clone.setMessageText(getMessageText());
		clone.setMessageValue(getMessageValue());
		clone.setMessageUrl(getMessageUrl());
		clone.setVisitDate(getVisitDate());

		return clone;
	}

	@Override
	public int compareTo(AppMessage appMessage) {
		long primaryKey = appMessage.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AppMessageClp)) {
			return false;
		}

		AppMessageClp appMessage = (AppMessageClp)obj;

		long primaryKey = appMessage.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{appMessageId=");
		sb.append(getAppMessageId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", fromApplication=");
		sb.append(getFromApplication());
		sb.append(", toUser=");
		sb.append(getToUser());
		sb.append(", messageType=");
		sb.append(getMessageType());
		sb.append(", messageCode=");
		sb.append(getMessageCode());
		sb.append(", messageText=");
		sb.append(getMessageText());
		sb.append(", messageValue=");
		sb.append(getMessageValue());
		sb.append(", messageUrl=");
		sb.append(getMessageUrl());
		sb.append(", visitDate=");
		sb.append(getVisitDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("org.oep.ssomgt.model.AppMessage");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>appMessageId</column-name><column-value><![CDATA[");
		sb.append(getAppMessageId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fromApplication</column-name><column-value><![CDATA[");
		sb.append(getFromApplication());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toUser</column-name><column-value><![CDATA[");
		sb.append(getToUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>messageType</column-name><column-value><![CDATA[");
		sb.append(getMessageType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>messageCode</column-name><column-value><![CDATA[");
		sb.append(getMessageCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>messageText</column-name><column-value><![CDATA[");
		sb.append(getMessageText());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>messageValue</column-name><column-value><![CDATA[");
		sb.append(getMessageValue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>messageUrl</column-name><column-value><![CDATA[");
		sb.append(getMessageUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>visitDate</column-name><column-value><![CDATA[");
		sb.append(getVisitDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _appMessageId;
	private long _userId;
	private String _userUuid;
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
	private BaseModel<?> _appMessageRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.ssomgt.service.ClpSerializer.class;
}