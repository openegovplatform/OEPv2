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
 * This class is a wrapper for {@link AppRole2JobPos}.
 * </p>
 *
 * @author trungdk
 * @see AppRole2JobPos
 * @generated
 */
public class AppRole2JobPosWrapper implements AppRole2JobPos,
	ModelWrapper<AppRole2JobPos> {
	public AppRole2JobPosWrapper(AppRole2JobPos appRole2JobPos) {
		_appRole2JobPos = appRole2JobPos;
	}

	@Override
	public Class<?> getModelClass() {
		return AppRole2JobPos.class;
	}

	@Override
	public String getModelClassName() {
		return AppRole2JobPos.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("appRole2JobPosId", getAppRole2JobPosId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("appRoleId", getAppRoleId());
		attributes.put("jobPostId", getJobPostId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long appRole2JobPosId = (Long)attributes.get("appRole2JobPosId");

		if (appRole2JobPosId != null) {
			setAppRole2JobPosId(appRole2JobPosId);
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

		Long appRoleId = (Long)attributes.get("appRoleId");

		if (appRoleId != null) {
			setAppRoleId(appRoleId);
		}

		Long jobPostId = (Long)attributes.get("jobPostId");

		if (jobPostId != null) {
			setJobPostId(jobPostId);
		}
	}

	/**
	* Returns the primary key of this app role2 job pos.
	*
	* @return the primary key of this app role2 job pos
	*/
	@Override
	public long getPrimaryKey() {
		return _appRole2JobPos.getPrimaryKey();
	}

	/**
	* Sets the primary key of this app role2 job pos.
	*
	* @param primaryKey the primary key of this app role2 job pos
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_appRole2JobPos.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the app role2 job pos ID of this app role2 job pos.
	*
	* @return the app role2 job pos ID of this app role2 job pos
	*/
	@Override
	public long getAppRole2JobPosId() {
		return _appRole2JobPos.getAppRole2JobPosId();
	}

	/**
	* Sets the app role2 job pos ID of this app role2 job pos.
	*
	* @param appRole2JobPosId the app role2 job pos ID of this app role2 job pos
	*/
	@Override
	public void setAppRole2JobPosId(long appRole2JobPosId) {
		_appRole2JobPos.setAppRole2JobPosId(appRole2JobPosId);
	}

	/**
	* Returns the user ID of this app role2 job pos.
	*
	* @return the user ID of this app role2 job pos
	*/
	@Override
	public long getUserId() {
		return _appRole2JobPos.getUserId();
	}

	/**
	* Sets the user ID of this app role2 job pos.
	*
	* @param userId the user ID of this app role2 job pos
	*/
	@Override
	public void setUserId(long userId) {
		_appRole2JobPos.setUserId(userId);
	}

	/**
	* Returns the user uuid of this app role2 job pos.
	*
	* @return the user uuid of this app role2 job pos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appRole2JobPos.getUserUuid();
	}

	/**
	* Sets the user uuid of this app role2 job pos.
	*
	* @param userUuid the user uuid of this app role2 job pos
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_appRole2JobPos.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this app role2 job pos.
	*
	* @return the group ID of this app role2 job pos
	*/
	@Override
	public long getGroupId() {
		return _appRole2JobPos.getGroupId();
	}

	/**
	* Sets the group ID of this app role2 job pos.
	*
	* @param groupId the group ID of this app role2 job pos
	*/
	@Override
	public void setGroupId(long groupId) {
		_appRole2JobPos.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this app role2 job pos.
	*
	* @return the company ID of this app role2 job pos
	*/
	@Override
	public long getCompanyId() {
		return _appRole2JobPos.getCompanyId();
	}

	/**
	* Sets the company ID of this app role2 job pos.
	*
	* @param companyId the company ID of this app role2 job pos
	*/
	@Override
	public void setCompanyId(long companyId) {
		_appRole2JobPos.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this app role2 job pos.
	*
	* @return the create date of this app role2 job pos
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _appRole2JobPos.getCreateDate();
	}

	/**
	* Sets the create date of this app role2 job pos.
	*
	* @param createDate the create date of this app role2 job pos
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_appRole2JobPos.setCreateDate(createDate);
	}

	/**
	* Returns the app role ID of this app role2 job pos.
	*
	* @return the app role ID of this app role2 job pos
	*/
	@Override
	public long getAppRoleId() {
		return _appRole2JobPos.getAppRoleId();
	}

	/**
	* Sets the app role ID of this app role2 job pos.
	*
	* @param appRoleId the app role ID of this app role2 job pos
	*/
	@Override
	public void setAppRoleId(long appRoleId) {
		_appRole2JobPos.setAppRoleId(appRoleId);
	}

	/**
	* Returns the job post ID of this app role2 job pos.
	*
	* @return the job post ID of this app role2 job pos
	*/
	@Override
	public long getJobPostId() {
		return _appRole2JobPos.getJobPostId();
	}

	/**
	* Sets the job post ID of this app role2 job pos.
	*
	* @param jobPostId the job post ID of this app role2 job pos
	*/
	@Override
	public void setJobPostId(long jobPostId) {
		_appRole2JobPos.setJobPostId(jobPostId);
	}

	@Override
	public boolean isNew() {
		return _appRole2JobPos.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_appRole2JobPos.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _appRole2JobPos.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_appRole2JobPos.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _appRole2JobPos.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _appRole2JobPos.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_appRole2JobPos.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _appRole2JobPos.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_appRole2JobPos.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_appRole2JobPos.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_appRole2JobPos.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AppRole2JobPosWrapper((AppRole2JobPos)_appRole2JobPos.clone());
	}

	@Override
	public int compareTo(
		org.oep.core.ssomgt.model.AppRole2JobPos appRole2JobPos) {
		return _appRole2JobPos.compareTo(appRole2JobPos);
	}

	@Override
	public int hashCode() {
		return _appRole2JobPos.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.core.ssomgt.model.AppRole2JobPos> toCacheModel() {
		return _appRole2JobPos.toCacheModel();
	}

	@Override
	public org.oep.core.ssomgt.model.AppRole2JobPos toEscapedModel() {
		return new AppRole2JobPosWrapper(_appRole2JobPos.toEscapedModel());
	}

	@Override
	public org.oep.core.ssomgt.model.AppRole2JobPos toUnescapedModel() {
		return new AppRole2JobPosWrapper(_appRole2JobPos.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _appRole2JobPos.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _appRole2JobPos.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_appRole2JobPos.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AppRole2JobPosWrapper)) {
			return false;
		}

		AppRole2JobPosWrapper appRole2JobPosWrapper = (AppRole2JobPosWrapper)obj;

		if (Validator.equals(_appRole2JobPos,
					appRole2JobPosWrapper._appRole2JobPos)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public AppRole2JobPos getWrappedAppRole2JobPos() {
		return _appRole2JobPos;
	}

	@Override
	public AppRole2JobPos getWrappedModel() {
		return _appRole2JobPos;
	}

	@Override
	public void resetOriginalValues() {
		_appRole2JobPos.resetOriginalValues();
	}

	private AppRole2JobPos _appRole2JobPos;
}