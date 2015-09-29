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
 * This class is a wrapper for {@link NewUserLog}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NewUserLog
 * @generated
 */
public class NewUserLogWrapper implements NewUserLog, ModelWrapper<NewUserLog> {
	public NewUserLogWrapper(NewUserLog newUserLog) {
		_newUserLog = newUserLog;
	}

	@Override
	public Class<?> getModelClass() {
		return NewUserLog.class;
	}

	@Override
	public String getModelClassName() {
		return NewUserLog.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("userActivityId", getUserActivityId());
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

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long userActivityId = (Long)attributes.get("userActivityId");

		if (userActivityId != null) {
			setUserActivityId(userActivityId);
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
	}

	/**
	* Returns the primary key of this new user log.
	*
	* @return the primary key of this new user log
	*/
	@Override
	public long getPrimaryKey() {
		return _newUserLog.getPrimaryKey();
	}

	/**
	* Sets the primary key of this new user log.
	*
	* @param primaryKey the primary key of this new user log
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_newUserLog.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this new user log.
	*
	* @return the ID of this new user log
	*/
	@Override
	public long getId() {
		return _newUserLog.getId();
	}

	/**
	* Sets the ID of this new user log.
	*
	* @param id the ID of this new user log
	*/
	@Override
	public void setId(long id) {
		_newUserLog.setId(id);
	}

	/**
	* Returns the user activity ID of this new user log.
	*
	* @return the user activity ID of this new user log
	*/
	@Override
	public long getUserActivityId() {
		return _newUserLog.getUserActivityId();
	}

	/**
	* Sets the user activity ID of this new user log.
	*
	* @param userActivityId the user activity ID of this new user log
	*/
	@Override
	public void setUserActivityId(long userActivityId) {
		_newUserLog.setUserActivityId(userActivityId);
	}

	/**
	* Returns the user ID of this new user log.
	*
	* @return the user ID of this new user log
	*/
	@Override
	public long getUserId() {
		return _newUserLog.getUserId();
	}

	/**
	* Sets the user ID of this new user log.
	*
	* @param userId the user ID of this new user log
	*/
	@Override
	public void setUserId(long userId) {
		_newUserLog.setUserId(userId);
	}

	/**
	* Returns the user uuid of this new user log.
	*
	* @return the user uuid of this new user log
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _newUserLog.getUserUuid();
	}

	/**
	* Sets the user uuid of this new user log.
	*
	* @param userUuid the user uuid of this new user log
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_newUserLog.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this new user log.
	*
	* @return the group ID of this new user log
	*/
	@Override
	public long getGroupId() {
		return _newUserLog.getGroupId();
	}

	/**
	* Sets the group ID of this new user log.
	*
	* @param groupId the group ID of this new user log
	*/
	@Override
	public void setGroupId(long groupId) {
		_newUserLog.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this new user log.
	*
	* @return the company ID of this new user log
	*/
	@Override
	public long getCompanyId() {
		return _newUserLog.getCompanyId();
	}

	/**
	* Sets the company ID of this new user log.
	*
	* @param companyId the company ID of this new user log
	*/
	@Override
	public void setCompanyId(long companyId) {
		_newUserLog.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this new user log.
	*
	* @return the create date of this new user log
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _newUserLog.getCreateDate();
	}

	/**
	* Sets the create date of this new user log.
	*
	* @param createDate the create date of this new user log
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_newUserLog.setCreateDate(createDate);
	}

	/**
	* Returns the user name of this new user log.
	*
	* @return the user name of this new user log
	*/
	@Override
	public java.lang.String getUserName() {
		return _newUserLog.getUserName();
	}

	/**
	* Sets the user name of this new user log.
	*
	* @param userName the user name of this new user log
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_newUserLog.setUserName(userName);
	}

	/**
	* Returns the email of this new user log.
	*
	* @return the email of this new user log
	*/
	@Override
	public java.lang.String getEmail() {
		return _newUserLog.getEmail();
	}

	/**
	* Sets the email of this new user log.
	*
	* @param email the email of this new user log
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_newUserLog.setEmail(email);
	}

	/**
	* Returns the site of this new user log.
	*
	* @return the site of this new user log
	*/
	@Override
	public java.lang.String getSite() {
		return _newUserLog.getSite();
	}

	/**
	* Sets the site of this new user log.
	*
	* @param site the site of this new user log
	*/
	@Override
	public void setSite(java.lang.String site) {
		_newUserLog.setSite(site);
	}

	/**
	* Returns the page of this new user log.
	*
	* @return the page of this new user log
	*/
	@Override
	public java.lang.String getPage() {
		return _newUserLog.getPage();
	}

	/**
	* Sets the page of this new user log.
	*
	* @param page the page of this new user log
	*/
	@Override
	public void setPage(java.lang.String page) {
		_newUserLog.setPage(page);
	}

	/**
	* Returns the action of this new user log.
	*
	* @return the action of this new user log
	*/
	@Override
	public java.lang.String getAction() {
		return _newUserLog.getAction();
	}

	/**
	* Sets the action of this new user log.
	*
	* @param action the action of this new user log
	*/
	@Override
	public void setAction(java.lang.String action) {
		_newUserLog.setAction(action);
	}

	/**
	* Returns the description of this new user log.
	*
	* @return the description of this new user log
	*/
	@Override
	public java.lang.String getDescription() {
		return _newUserLog.getDescription();
	}

	/**
	* Sets the description of this new user log.
	*
	* @param description the description of this new user log
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_newUserLog.setDescription(description);
	}

	@Override
	public boolean isNew() {
		return _newUserLog.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_newUserLog.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _newUserLog.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_newUserLog.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _newUserLog.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _newUserLog.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_newUserLog.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _newUserLog.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_newUserLog.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_newUserLog.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_newUserLog.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new NewUserLogWrapper((NewUserLog)_newUserLog.clone());
	}

	@Override
	public int compareTo(org.oep.core.logging.model.NewUserLog newUserLog) {
		return _newUserLog.compareTo(newUserLog);
	}

	@Override
	public int hashCode() {
		return _newUserLog.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.core.logging.model.NewUserLog> toCacheModel() {
		return _newUserLog.toCacheModel();
	}

	@Override
	public org.oep.core.logging.model.NewUserLog toEscapedModel() {
		return new NewUserLogWrapper(_newUserLog.toEscapedModel());
	}

	@Override
	public org.oep.core.logging.model.NewUserLog toUnescapedModel() {
		return new NewUserLogWrapper(_newUserLog.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _newUserLog.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _newUserLog.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_newUserLog.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NewUserLogWrapper)) {
			return false;
		}

		NewUserLogWrapper newUserLogWrapper = (NewUserLogWrapper)obj;

		if (Validator.equals(_newUserLog, newUserLogWrapper._newUserLog)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public NewUserLog getWrappedNewUserLog() {
		return _newUserLog;
	}

	@Override
	public NewUserLog getWrappedModel() {
		return _newUserLog;
	}

	@Override
	public void resetOriginalValues() {
		_newUserLog.resetOriginalValues();
	}

	private NewUserLog _newUserLog;
}