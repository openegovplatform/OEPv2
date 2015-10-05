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

package org.oep.core.datamgt.parameter.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link UserParameter}.
 * </p>
 *
 * @author TrungDK
 * @see UserParameter
 * @generated
 */
public class UserParameterWrapper implements UserParameter,
	ModelWrapper<UserParameter> {
	public UserParameterWrapper(UserParameter userParameter) {
		_userParameter = userParameter;
	}

	@Override
	public Class<?> getModelClass() {
		return UserParameter.class;
	}

	@Override
	public String getModelClassName() {
		return UserParameter.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userParameterId", getUserParameterId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("applicationName", getApplicationName());
		attributes.put("parameterName", getParameterName());
		attributes.put("title", getTitle());
		attributes.put("parameterValue", getParameterValue());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long userParameterId = (Long)attributes.get("userParameterId");

		if (userParameterId != null) {
			setUserParameterId(userParameterId);
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

		String applicationName = (String)attributes.get("applicationName");

		if (applicationName != null) {
			setApplicationName(applicationName);
		}

		String parameterName = (String)attributes.get("parameterName");

		if (parameterName != null) {
			setParameterName(parameterName);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String parameterValue = (String)attributes.get("parameterValue");

		if (parameterValue != null) {
			setParameterValue(parameterValue);
		}
	}

	/**
	* Returns the primary key of this user parameter.
	*
	* @return the primary key of this user parameter
	*/
	@Override
	public long getPrimaryKey() {
		return _userParameter.getPrimaryKey();
	}

	/**
	* Sets the primary key of this user parameter.
	*
	* @param primaryKey the primary key of this user parameter
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_userParameter.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the user parameter ID of this user parameter.
	*
	* @return the user parameter ID of this user parameter
	*/
	@Override
	public long getUserParameterId() {
		return _userParameter.getUserParameterId();
	}

	/**
	* Sets the user parameter ID of this user parameter.
	*
	* @param userParameterId the user parameter ID of this user parameter
	*/
	@Override
	public void setUserParameterId(long userParameterId) {
		_userParameter.setUserParameterId(userParameterId);
	}

	/**
	* Returns the user ID of this user parameter.
	*
	* @return the user ID of this user parameter
	*/
	@Override
	public long getUserId() {
		return _userParameter.getUserId();
	}

	/**
	* Sets the user ID of this user parameter.
	*
	* @param userId the user ID of this user parameter
	*/
	@Override
	public void setUserId(long userId) {
		_userParameter.setUserId(userId);
	}

	/**
	* Returns the user uuid of this user parameter.
	*
	* @return the user uuid of this user parameter
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userParameter.getUserUuid();
	}

	/**
	* Sets the user uuid of this user parameter.
	*
	* @param userUuid the user uuid of this user parameter
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_userParameter.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this user parameter.
	*
	* @return the group ID of this user parameter
	*/
	@Override
	public long getGroupId() {
		return _userParameter.getGroupId();
	}

	/**
	* Sets the group ID of this user parameter.
	*
	* @param groupId the group ID of this user parameter
	*/
	@Override
	public void setGroupId(long groupId) {
		_userParameter.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this user parameter.
	*
	* @return the company ID of this user parameter
	*/
	@Override
	public long getCompanyId() {
		return _userParameter.getCompanyId();
	}

	/**
	* Sets the company ID of this user parameter.
	*
	* @param companyId the company ID of this user parameter
	*/
	@Override
	public void setCompanyId(long companyId) {
		_userParameter.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this user parameter.
	*
	* @return the create date of this user parameter
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _userParameter.getCreateDate();
	}

	/**
	* Sets the create date of this user parameter.
	*
	* @param createDate the create date of this user parameter
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_userParameter.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this user parameter.
	*
	* @return the modified date of this user parameter
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _userParameter.getModifiedDate();
	}

	/**
	* Sets the modified date of this user parameter.
	*
	* @param modifiedDate the modified date of this user parameter
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_userParameter.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the application name of this user parameter.
	*
	* @return the application name of this user parameter
	*/
	@Override
	public java.lang.String getApplicationName() {
		return _userParameter.getApplicationName();
	}

	/**
	* Sets the application name of this user parameter.
	*
	* @param applicationName the application name of this user parameter
	*/
	@Override
	public void setApplicationName(java.lang.String applicationName) {
		_userParameter.setApplicationName(applicationName);
	}

	/**
	* Returns the parameter name of this user parameter.
	*
	* @return the parameter name of this user parameter
	*/
	@Override
	public java.lang.String getParameterName() {
		return _userParameter.getParameterName();
	}

	/**
	* Sets the parameter name of this user parameter.
	*
	* @param parameterName the parameter name of this user parameter
	*/
	@Override
	public void setParameterName(java.lang.String parameterName) {
		_userParameter.setParameterName(parameterName);
	}

	/**
	* Returns the title of this user parameter.
	*
	* @return the title of this user parameter
	*/
	@Override
	public java.lang.String getTitle() {
		return _userParameter.getTitle();
	}

	/**
	* Sets the title of this user parameter.
	*
	* @param title the title of this user parameter
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_userParameter.setTitle(title);
	}

	/**
	* Returns the parameter value of this user parameter.
	*
	* @return the parameter value of this user parameter
	*/
	@Override
	public java.lang.String getParameterValue() {
		return _userParameter.getParameterValue();
	}

	/**
	* Sets the parameter value of this user parameter.
	*
	* @param parameterValue the parameter value of this user parameter
	*/
	@Override
	public void setParameterValue(java.lang.String parameterValue) {
		_userParameter.setParameterValue(parameterValue);
	}

	@Override
	public boolean isNew() {
		return _userParameter.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_userParameter.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _userParameter.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_userParameter.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _userParameter.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _userParameter.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_userParameter.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _userParameter.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_userParameter.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_userParameter.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_userParameter.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new UserParameterWrapper((UserParameter)_userParameter.clone());
	}

	@Override
	public int compareTo(
		org.oep.core.datamgt.parameter.model.UserParameter userParameter) {
		return _userParameter.compareTo(userParameter);
	}

	@Override
	public int hashCode() {
		return _userParameter.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.core.datamgt.parameter.model.UserParameter> toCacheModel() {
		return _userParameter.toCacheModel();
	}

	@Override
	public org.oep.core.datamgt.parameter.model.UserParameter toEscapedModel() {
		return new UserParameterWrapper(_userParameter.toEscapedModel());
	}

	@Override
	public org.oep.core.datamgt.parameter.model.UserParameter toUnescapedModel() {
		return new UserParameterWrapper(_userParameter.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _userParameter.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _userParameter.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_userParameter.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UserParameterWrapper)) {
			return false;
		}

		UserParameterWrapper userParameterWrapper = (UserParameterWrapper)obj;

		if (Validator.equals(_userParameter, userParameterWrapper._userParameter)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public UserParameter getWrappedUserParameter() {
		return _userParameter;
	}

	@Override
	public UserParameter getWrappedModel() {
		return _userParameter;
	}

	@Override
	public void resetOriginalValues() {
		_userParameter.resetOriginalValues();
	}

	private UserParameter _userParameter;
}