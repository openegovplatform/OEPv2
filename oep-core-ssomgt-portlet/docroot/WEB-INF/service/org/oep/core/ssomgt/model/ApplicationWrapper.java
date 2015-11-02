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

import java.sql.Blob;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Application}.
 * </p>
 *
 * @author trungdk
 * @see Application
 * @generated
 */
public class ApplicationWrapper implements Application,
	ModelWrapper<Application> {
	public ApplicationWrapper(Application application) {
		_application = application;
	}

	@Override
	public Class<?> getModelClass() {
		return Application.class;
	}

	@Override
	public String getModelClassName() {
		return Application.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("applicationId", getApplicationId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("appCode", getAppCode());
		attributes.put("appName", getAppName());
		attributes.put("appPin", getAppPin());
		attributes.put("appUrl", getAppUrl());
		attributes.put("appBigIcon", getAppBigIcon());
		attributes.put("appSmallIcon", getAppSmallIcon());
		attributes.put("pingTime", getPingTime());
		attributes.put("sequenceNo", getSequenceNo());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long applicationId = (Long)attributes.get("applicationId");

		if (applicationId != null) {
			setApplicationId(applicationId);
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

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String appCode = (String)attributes.get("appCode");

		if (appCode != null) {
			setAppCode(appCode);
		}

		String appName = (String)attributes.get("appName");

		if (appName != null) {
			setAppName(appName);
		}

		String appPin = (String)attributes.get("appPin");

		if (appPin != null) {
			setAppPin(appPin);
		}

		String appUrl = (String)attributes.get("appUrl");

		if (appUrl != null) {
			setAppUrl(appUrl);
		}

		Blob appBigIcon = (Blob)attributes.get("appBigIcon");

		if (appBigIcon != null) {
			setAppBigIcon(appBigIcon);
		}

		Blob appSmallIcon = (Blob)attributes.get("appSmallIcon");

		if (appSmallIcon != null) {
			setAppSmallIcon(appSmallIcon);
		}

		Date pingTime = (Date)attributes.get("pingTime");

		if (pingTime != null) {
			setPingTime(pingTime);
		}

		Integer sequenceNo = (Integer)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}
	}

	/**
	* Returns the primary key of this application.
	*
	* @return the primary key of this application
	*/
	@Override
	public long getPrimaryKey() {
		return _application.getPrimaryKey();
	}

	/**
	* Sets the primary key of this application.
	*
	* @param primaryKey the primary key of this application
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_application.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the application ID of this application.
	*
	* @return the application ID of this application
	*/
	@Override
	public long getApplicationId() {
		return _application.getApplicationId();
	}

	/**
	* Sets the application ID of this application.
	*
	* @param applicationId the application ID of this application
	*/
	@Override
	public void setApplicationId(long applicationId) {
		_application.setApplicationId(applicationId);
	}

	/**
	* Returns the user ID of this application.
	*
	* @return the user ID of this application
	*/
	@Override
	public long getUserId() {
		return _application.getUserId();
	}

	/**
	* Sets the user ID of this application.
	*
	* @param userId the user ID of this application
	*/
	@Override
	public void setUserId(long userId) {
		_application.setUserId(userId);
	}

	/**
	* Returns the user uuid of this application.
	*
	* @return the user uuid of this application
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _application.getUserUuid();
	}

	/**
	* Sets the user uuid of this application.
	*
	* @param userUuid the user uuid of this application
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_application.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this application.
	*
	* @return the group ID of this application
	*/
	@Override
	public long getGroupId() {
		return _application.getGroupId();
	}

	/**
	* Sets the group ID of this application.
	*
	* @param groupId the group ID of this application
	*/
	@Override
	public void setGroupId(long groupId) {
		_application.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this application.
	*
	* @return the company ID of this application
	*/
	@Override
	public long getCompanyId() {
		return _application.getCompanyId();
	}

	/**
	* Sets the company ID of this application.
	*
	* @param companyId the company ID of this application
	*/
	@Override
	public void setCompanyId(long companyId) {
		_application.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this application.
	*
	* @return the create date of this application
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _application.getCreateDate();
	}

	/**
	* Sets the create date of this application.
	*
	* @param createDate the create date of this application
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_application.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this application.
	*
	* @return the modified date of this application
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _application.getModifiedDate();
	}

	/**
	* Sets the modified date of this application.
	*
	* @param modifiedDate the modified date of this application
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_application.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the app code of this application.
	*
	* @return the app code of this application
	*/
	@Override
	public java.lang.String getAppCode() {
		return _application.getAppCode();
	}

	/**
	* Sets the app code of this application.
	*
	* @param appCode the app code of this application
	*/
	@Override
	public void setAppCode(java.lang.String appCode) {
		_application.setAppCode(appCode);
	}

	/**
	* Returns the app name of this application.
	*
	* @return the app name of this application
	*/
	@Override
	public java.lang.String getAppName() {
		return _application.getAppName();
	}

	/**
	* Sets the app name of this application.
	*
	* @param appName the app name of this application
	*/
	@Override
	public void setAppName(java.lang.String appName) {
		_application.setAppName(appName);
	}

	/**
	* Returns the app pin of this application.
	*
	* @return the app pin of this application
	*/
	@Override
	public java.lang.String getAppPin() {
		return _application.getAppPin();
	}

	/**
	* Sets the app pin of this application.
	*
	* @param appPin the app pin of this application
	*/
	@Override
	public void setAppPin(java.lang.String appPin) {
		_application.setAppPin(appPin);
	}

	/**
	* Returns the app url of this application.
	*
	* @return the app url of this application
	*/
	@Override
	public java.lang.String getAppUrl() {
		return _application.getAppUrl();
	}

	/**
	* Sets the app url of this application.
	*
	* @param appUrl the app url of this application
	*/
	@Override
	public void setAppUrl(java.lang.String appUrl) {
		_application.setAppUrl(appUrl);
	}

	/**
	* Returns the app big icon of this application.
	*
	* @return the app big icon of this application
	*/
	@Override
	public java.sql.Blob getAppBigIcon() {
		return _application.getAppBigIcon();
	}

	/**
	* Sets the app big icon of this application.
	*
	* @param appBigIcon the app big icon of this application
	*/
	@Override
	public void setAppBigIcon(java.sql.Blob appBigIcon) {
		_application.setAppBigIcon(appBigIcon);
	}

	/**
	* Returns the app small icon of this application.
	*
	* @return the app small icon of this application
	*/
	@Override
	public java.sql.Blob getAppSmallIcon() {
		return _application.getAppSmallIcon();
	}

	/**
	* Sets the app small icon of this application.
	*
	* @param appSmallIcon the app small icon of this application
	*/
	@Override
	public void setAppSmallIcon(java.sql.Blob appSmallIcon) {
		_application.setAppSmallIcon(appSmallIcon);
	}

	/**
	* Returns the ping time of this application.
	*
	* @return the ping time of this application
	*/
	@Override
	public java.util.Date getPingTime() {
		return _application.getPingTime();
	}

	/**
	* Sets the ping time of this application.
	*
	* @param pingTime the ping time of this application
	*/
	@Override
	public void setPingTime(java.util.Date pingTime) {
		_application.setPingTime(pingTime);
	}

	/**
	* Returns the sequence no of this application.
	*
	* @return the sequence no of this application
	*/
	@Override
	public int getSequenceNo() {
		return _application.getSequenceNo();
	}

	/**
	* Sets the sequence no of this application.
	*
	* @param sequenceNo the sequence no of this application
	*/
	@Override
	public void setSequenceNo(int sequenceNo) {
		_application.setSequenceNo(sequenceNo);
	}

	@Override
	public boolean isNew() {
		return _application.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_application.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _application.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_application.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _application.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _application.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_application.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _application.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_application.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_application.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_application.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ApplicationWrapper((Application)_application.clone());
	}

	@Override
	public int compareTo(org.oep.core.ssomgt.model.Application application) {
		return _application.compareTo(application);
	}

	@Override
	public int hashCode() {
		return _application.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.core.ssomgt.model.Application> toCacheModel() {
		return _application.toCacheModel();
	}

	@Override
	public org.oep.core.ssomgt.model.Application toEscapedModel() {
		return new ApplicationWrapper(_application.toEscapedModel());
	}

	@Override
	public org.oep.core.ssomgt.model.Application toUnescapedModel() {
		return new ApplicationWrapper(_application.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _application.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _application.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_application.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ApplicationWrapper)) {
			return false;
		}

		ApplicationWrapper applicationWrapper = (ApplicationWrapper)obj;

		if (Validator.equals(_application, applicationWrapper._application)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Application getWrappedApplication() {
		return _application;
	}

	@Override
	public Application getWrappedModel() {
		return _application;
	}

	@Override
	public void resetOriginalValues() {
		_application.resetOriginalValues();
	}

	private Application _application;
}