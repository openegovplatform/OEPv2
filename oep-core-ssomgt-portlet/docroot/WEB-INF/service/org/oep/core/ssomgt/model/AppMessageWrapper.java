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

package org.oep.core.ssomgt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AppMessage}.
 * </p>
 *
 * @author trungdk
 * @see AppMessage
 * @generated
 */
public class AppMessageWrapper implements AppMessage, ModelWrapper<AppMessage> {
	public AppMessageWrapper(AppMessage appMessage) {
		_appMessage = appMessage;
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

	/**
	* Returns the primary key of this app message.
	*
	* @return the primary key of this app message
	*/
	@Override
	public long getPrimaryKey() {
		return _appMessage.getPrimaryKey();
	}

	/**
	* Sets the primary key of this app message.
	*
	* @param primaryKey the primary key of this app message
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_appMessage.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the app message ID of this app message.
	*
	* @return the app message ID of this app message
	*/
	@Override
	public long getAppMessageId() {
		return _appMessage.getAppMessageId();
	}

	/**
	* Sets the app message ID of this app message.
	*
	* @param appMessageId the app message ID of this app message
	*/
	@Override
	public void setAppMessageId(long appMessageId) {
		_appMessage.setAppMessageId(appMessageId);
	}

	/**
	* Returns the user ID of this app message.
	*
	* @return the user ID of this app message
	*/
	@Override
	public long getUserId() {
		return _appMessage.getUserId();
	}

	/**
	* Sets the user ID of this app message.
	*
	* @param userId the user ID of this app message
	*/
	@Override
	public void setUserId(long userId) {
		_appMessage.setUserId(userId);
	}

	/**
	* Returns the user uuid of this app message.
	*
	* @return the user uuid of this app message
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appMessage.getUserUuid();
	}

	/**
	* Sets the user uuid of this app message.
	*
	* @param userUuid the user uuid of this app message
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_appMessage.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this app message.
	*
	* @return the group ID of this app message
	*/
	@Override
	public long getGroupId() {
		return _appMessage.getGroupId();
	}

	/**
	* Sets the group ID of this app message.
	*
	* @param groupId the group ID of this app message
	*/
	@Override
	public void setGroupId(long groupId) {
		_appMessage.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this app message.
	*
	* @return the company ID of this app message
	*/
	@Override
	public long getCompanyId() {
		return _appMessage.getCompanyId();
	}

	/**
	* Sets the company ID of this app message.
	*
	* @param companyId the company ID of this app message
	*/
	@Override
	public void setCompanyId(long companyId) {
		_appMessage.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this app message.
	*
	* @return the create date of this app message
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _appMessage.getCreateDate();
	}

	/**
	* Sets the create date of this app message.
	*
	* @param createDate the create date of this app message
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_appMessage.setCreateDate(createDate);
	}

	/**
	* Returns the from application of this app message.
	*
	* @return the from application of this app message
	*/
	@Override
	public java.lang.String getFromApplication() {
		return _appMessage.getFromApplication();
	}

	/**
	* Sets the from application of this app message.
	*
	* @param fromApplication the from application of this app message
	*/
	@Override
	public void setFromApplication(java.lang.String fromApplication) {
		_appMessage.setFromApplication(fromApplication);
	}

	/**
	* Returns the to user of this app message.
	*
	* @return the to user of this app message
	*/
	@Override
	public java.lang.String getToUser() {
		return _appMessage.getToUser();
	}

	/**
	* Sets the to user of this app message.
	*
	* @param toUser the to user of this app message
	*/
	@Override
	public void setToUser(java.lang.String toUser) {
		_appMessage.setToUser(toUser);
	}

	/**
	* Returns the message type of this app message.
	*
	* @return the message type of this app message
	*/
	@Override
	public java.lang.String getMessageType() {
		return _appMessage.getMessageType();
	}

	/**
	* Sets the message type of this app message.
	*
	* @param messageType the message type of this app message
	*/
	@Override
	public void setMessageType(java.lang.String messageType) {
		_appMessage.setMessageType(messageType);
	}

	/**
	* Returns the message code of this app message.
	*
	* @return the message code of this app message
	*/
	@Override
	public java.lang.String getMessageCode() {
		return _appMessage.getMessageCode();
	}

	/**
	* Sets the message code of this app message.
	*
	* @param messageCode the message code of this app message
	*/
	@Override
	public void setMessageCode(java.lang.String messageCode) {
		_appMessage.setMessageCode(messageCode);
	}

	/**
	* Returns the message text of this app message.
	*
	* @return the message text of this app message
	*/
	@Override
	public java.lang.String getMessageText() {
		return _appMessage.getMessageText();
	}

	/**
	* Sets the message text of this app message.
	*
	* @param messageText the message text of this app message
	*/
	@Override
	public void setMessageText(java.lang.String messageText) {
		_appMessage.setMessageText(messageText);
	}

	/**
	* Returns the message value of this app message.
	*
	* @return the message value of this app message
	*/
	@Override
	public java.lang.String getMessageValue() {
		return _appMessage.getMessageValue();
	}

	/**
	* Sets the message value of this app message.
	*
	* @param messageValue the message value of this app message
	*/
	@Override
	public void setMessageValue(java.lang.String messageValue) {
		_appMessage.setMessageValue(messageValue);
	}

	/**
	* Returns the message url of this app message.
	*
	* @return the message url of this app message
	*/
	@Override
	public java.lang.String getMessageUrl() {
		return _appMessage.getMessageUrl();
	}

	/**
	* Sets the message url of this app message.
	*
	* @param messageUrl the message url of this app message
	*/
	@Override
	public void setMessageUrl(java.lang.String messageUrl) {
		_appMessage.setMessageUrl(messageUrl);
	}

	/**
	* Returns the visit date of this app message.
	*
	* @return the visit date of this app message
	*/
	@Override
	public java.util.Date getVisitDate() {
		return _appMessage.getVisitDate();
	}

	/**
	* Sets the visit date of this app message.
	*
	* @param visitDate the visit date of this app message
	*/
	@Override
	public void setVisitDate(java.util.Date visitDate) {
		_appMessage.setVisitDate(visitDate);
	}

	@Override
	public boolean isNew() {
		return _appMessage.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_appMessage.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _appMessage.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_appMessage.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _appMessage.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _appMessage.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_appMessage.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _appMessage.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_appMessage.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_appMessage.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_appMessage.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AppMessageWrapper((AppMessage)_appMessage.clone());
	}

	@Override
	public int compareTo(org.oep.core.ssomgt.model.AppMessage appMessage) {
		return _appMessage.compareTo(appMessage);
	}

	@Override
	public int hashCode() {
		return _appMessage.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.core.ssomgt.model.AppMessage> toCacheModel() {
		return _appMessage.toCacheModel();
	}

	@Override
	public org.oep.core.ssomgt.model.AppMessage toEscapedModel() {
		return new AppMessageWrapper(_appMessage.toEscapedModel());
	}

	@Override
	public org.oep.core.ssomgt.model.AppMessage toUnescapedModel() {
		return new AppMessageWrapper(_appMessage.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _appMessage.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _appMessage.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_appMessage.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AppMessageWrapper)) {
			return false;
		}

		AppMessageWrapper appMessageWrapper = (AppMessageWrapper)obj;

		if (Validator.equals(_appMessage, appMessageWrapper._appMessage)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public AppMessage getWrappedAppMessage() {
		return _appMessage;
	}

	@Override
	public AppMessage getWrappedModel() {
		return _appMessage;
	}

	@Override
	public void resetOriginalValues() {
		_appMessage.resetOriginalValues();
	}

	private AppMessage _appMessage;
}