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

package org.oep.core.logging.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link UserActivity}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserActivity
 * @generated
 */
public class UserActivityWrapper implements UserActivity,
	ModelWrapper<UserActivity> {
	public UserActivityWrapper(UserActivity userActivity) {
		_userActivity = userActivity;
	}

	@Override
	public Class<?> getModelClass() {
		return UserActivity.class;
	}

	@Override
	public String getModelClassName() {
		return UserActivity.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("userName", getUserName());
		attributes.put("email", getEmail());
		attributes.put("site", getSite());
		attributes.put("page", getPage());
		attributes.put("action", getAction());
		attributes.put("description", getDescription());
		attributes.put("url", getUrl());
		attributes.put("sessionId", getSessionId());
		attributes.put("ip", getIp());
		attributes.put("userAgent", getUserAgent());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
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

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String site = (String)attributes.get("site");

		if (site != null) {
			setSite(site);
		}

		String page = (String)attributes.get("page");

		if (page != null) {
			setPage(page);
		}

		String action = (String)attributes.get("action");

		if (action != null) {
			setAction(action);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}

		String sessionId = (String)attributes.get("sessionId");

		if (sessionId != null) {
			setSessionId(sessionId);
		}

		String ip = (String)attributes.get("ip");

		if (ip != null) {
			setIp(ip);
		}

		String userAgent = (String)attributes.get("userAgent");

		if (userAgent != null) {
			setUserAgent(userAgent);
		}
	}

	/**
	* Returns the primary key of this user activity.
	*
	* @return the primary key of this user activity
	*/
	@Override
	public long getPrimaryKey() {
		return _userActivity.getPrimaryKey();
	}

	/**
	* Sets the primary key of this user activity.
	*
	* @param primaryKey the primary key of this user activity
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_userActivity.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this user activity.
	*
	* @return the ID of this user activity
	*/
	@Override
	public long getId() {
		return _userActivity.getId();
	}

	/**
	* Sets the ID of this user activity.
	*
	* @param id the ID of this user activity
	*/
	@Override
	public void setId(long id) {
		_userActivity.setId(id);
	}

	/**
	* Returns the user ID of this user activity.
	*
	* @return the user ID of this user activity
	*/
	@Override
	public long getUserId() {
		return _userActivity.getUserId();
	}

	/**
	* Sets the user ID of this user activity.
	*
	* @param userId the user ID of this user activity
	*/
	@Override
	public void setUserId(long userId) {
		_userActivity.setUserId(userId);
	}

	/**
	* Returns the user uuid of this user activity.
	*
	* @return the user uuid of this user activity
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userActivity.getUserUuid();
	}

	/**
	* Sets the user uuid of this user activity.
	*
	* @param userUuid the user uuid of this user activity
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_userActivity.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this user activity.
	*
	* @return the group ID of this user activity
	*/
	@Override
	public long getGroupId() {
		return _userActivity.getGroupId();
	}

	/**
	* Sets the group ID of this user activity.
	*
	* @param groupId the group ID of this user activity
	*/
	@Override
	public void setGroupId(long groupId) {
		_userActivity.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this user activity.
	*
	* @return the company ID of this user activity
	*/
	@Override
	public long getCompanyId() {
		return _userActivity.getCompanyId();
	}

	/**
	* Sets the company ID of this user activity.
	*
	* @param companyId the company ID of this user activity
	*/
	@Override
	public void setCompanyId(long companyId) {
		_userActivity.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this user activity.
	*
	* @return the create date of this user activity
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _userActivity.getCreateDate();
	}

	/**
	* Sets the create date of this user activity.
	*
	* @param createDate the create date of this user activity
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_userActivity.setCreateDate(createDate);
	}

	/**
	* Returns the user name of this user activity.
	*
	* @return the user name of this user activity
	*/
	@Override
	public java.lang.String getUserName() {
		return _userActivity.getUserName();
	}

	/**
	* Sets the user name of this user activity.
	*
	* @param userName the user name of this user activity
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_userActivity.setUserName(userName);
	}

	/**
	* Returns the email of this user activity.
	*
	* @return the email of this user activity
	*/
	@Override
	public java.lang.String getEmail() {
		return _userActivity.getEmail();
	}

	/**
	* Sets the email of this user activity.
	*
	* @param email the email of this user activity
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_userActivity.setEmail(email);
	}

	/**
	* Returns the site of this user activity.
	*
	* @return the site of this user activity
	*/
	@Override
	public java.lang.String getSite() {
		return _userActivity.getSite();
	}

	/**
	* Sets the site of this user activity.
	*
	* @param site the site of this user activity
	*/
	@Override
	public void setSite(java.lang.String site) {
		_userActivity.setSite(site);
	}

	/**
	* Returns the page of this user activity.
	*
	* @return the page of this user activity
	*/
	@Override
	public java.lang.String getPage() {
		return _userActivity.getPage();
	}

	/**
	* Sets the page of this user activity.
	*
	* @param page the page of this user activity
	*/
	@Override
	public void setPage(java.lang.String page) {
		_userActivity.setPage(page);
	}

	/**
	* Returns the action of this user activity.
	*
	* @return the action of this user activity
	*/
	@Override
	public java.lang.String getAction() {
		return _userActivity.getAction();
	}

	/**
	* Sets the action of this user activity.
	*
	* @param action the action of this user activity
	*/
	@Override
	public void setAction(java.lang.String action) {
		_userActivity.setAction(action);
	}

	/**
	* Returns the description of this user activity.
	*
	* @return the description of this user activity
	*/
	@Override
	public java.lang.String getDescription() {
		return _userActivity.getDescription();
	}

	/**
	* Sets the description of this user activity.
	*
	* @param description the description of this user activity
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_userActivity.setDescription(description);
	}

	/**
	* Returns the url of this user activity.
	*
	* @return the url of this user activity
	*/
	@Override
	public java.lang.String getUrl() {
		return _userActivity.getUrl();
	}

	/**
	* Sets the url of this user activity.
	*
	* @param url the url of this user activity
	*/
	@Override
	public void setUrl(java.lang.String url) {
		_userActivity.setUrl(url);
	}

	/**
	* Returns the session ID of this user activity.
	*
	* @return the session ID of this user activity
	*/
	@Override
	public java.lang.String getSessionId() {
		return _userActivity.getSessionId();
	}

	/**
	* Sets the session ID of this user activity.
	*
	* @param sessionId the session ID of this user activity
	*/
	@Override
	public void setSessionId(java.lang.String sessionId) {
		_userActivity.setSessionId(sessionId);
	}

	/**
	* Returns the ip of this user activity.
	*
	* @return the ip of this user activity
	*/
	@Override
	public java.lang.String getIp() {
		return _userActivity.getIp();
	}

	/**
	* Sets the ip of this user activity.
	*
	* @param ip the ip of this user activity
	*/
	@Override
	public void setIp(java.lang.String ip) {
		_userActivity.setIp(ip);
	}

	/**
	* Returns the user agent of this user activity.
	*
	* @return the user agent of this user activity
	*/
	@Override
	public java.lang.String getUserAgent() {
		return _userActivity.getUserAgent();
	}

	/**
	* Sets the user agent of this user activity.
	*
	* @param userAgent the user agent of this user activity
	*/
	@Override
	public void setUserAgent(java.lang.String userAgent) {
		_userActivity.setUserAgent(userAgent);
	}

	@Override
	public boolean isNew() {
		return _userActivity.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_userActivity.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _userActivity.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_userActivity.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _userActivity.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _userActivity.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_userActivity.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _userActivity.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_userActivity.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_userActivity.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_userActivity.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new UserActivityWrapper((UserActivity)_userActivity.clone());
	}

	@Override
	public int compareTo(org.oep.core.logging.model.UserActivity userActivity) {
		return _userActivity.compareTo(userActivity);
	}

	@Override
	public int hashCode() {
		return _userActivity.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.core.logging.model.UserActivity> toCacheModel() {
		return _userActivity.toCacheModel();
	}

	@Override
	public org.oep.core.logging.model.UserActivity toEscapedModel() {
		return new UserActivityWrapper(_userActivity.toEscapedModel());
	}

	@Override
	public org.oep.core.logging.model.UserActivity toUnescapedModel() {
		return new UserActivityWrapper(_userActivity.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _userActivity.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _userActivity.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_userActivity.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UserActivityWrapper)) {
			return false;
		}

		UserActivityWrapper userActivityWrapper = (UserActivityWrapper)obj;

		if (Validator.equals(_userActivity, userActivityWrapper._userActivity)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public UserActivity getWrappedUserActivity() {
		return _userActivity;
	}

	@Override
	public UserActivity getWrappedModel() {
		return _userActivity;
	}

	@Override
	public void resetOriginalValues() {
		_userActivity.resetOriginalValues();
	}

	private UserActivity _userActivity;
}