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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AppRole}.
 * </p>
 *
 * @author trungdk
 * @see AppRole
 * @generated
 */
public class AppRoleWrapper implements AppRole, ModelWrapper<AppRole> {
	public AppRoleWrapper(AppRole appRole) {
		_appRole = appRole;
	}

	@Override
	public Class<?> getModelClass() {
		return AppRole.class;
	}

	@Override
	public String getModelClassName() {
		return AppRole.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("appRoleId", getAppRoleId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("applicationId", getApplicationId());
		attributes.put("roleCode", getRoleCode());
		attributes.put("roleName", getRoleName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long appRoleId = (Long)attributes.get("appRoleId");

		if (appRoleId != null) {
			setAppRoleId(appRoleId);
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

		Long applicationId = (Long)attributes.get("applicationId");

		if (applicationId != null) {
			setApplicationId(applicationId);
		}

		String roleCode = (String)attributes.get("roleCode");

		if (roleCode != null) {
			setRoleCode(roleCode);
		}

		String roleName = (String)attributes.get("roleName");

		if (roleName != null) {
			setRoleName(roleName);
		}
	}

	/**
	* Returns the primary key of this app role.
	*
	* @return the primary key of this app role
	*/
	@Override
	public long getPrimaryKey() {
		return _appRole.getPrimaryKey();
	}

	/**
	* Sets the primary key of this app role.
	*
	* @param primaryKey the primary key of this app role
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_appRole.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the app role ID of this app role.
	*
	* @return the app role ID of this app role
	*/
	@Override
	public long getAppRoleId() {
		return _appRole.getAppRoleId();
	}

	/**
	* Sets the app role ID of this app role.
	*
	* @param appRoleId the app role ID of this app role
	*/
	@Override
	public void setAppRoleId(long appRoleId) {
		_appRole.setAppRoleId(appRoleId);
	}

	/**
	* Returns the user ID of this app role.
	*
	* @return the user ID of this app role
	*/
	@Override
	public long getUserId() {
		return _appRole.getUserId();
	}

	/**
	* Sets the user ID of this app role.
	*
	* @param userId the user ID of this app role
	*/
	@Override
	public void setUserId(long userId) {
		_appRole.setUserId(userId);
	}

	/**
	* Returns the user uuid of this app role.
	*
	* @return the user uuid of this app role
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appRole.getUserUuid();
	}

	/**
	* Sets the user uuid of this app role.
	*
	* @param userUuid the user uuid of this app role
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_appRole.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this app role.
	*
	* @return the group ID of this app role
	*/
	@Override
	public long getGroupId() {
		return _appRole.getGroupId();
	}

	/**
	* Sets the group ID of this app role.
	*
	* @param groupId the group ID of this app role
	*/
	@Override
	public void setGroupId(long groupId) {
		_appRole.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this app role.
	*
	* @return the company ID of this app role
	*/
	@Override
	public long getCompanyId() {
		return _appRole.getCompanyId();
	}

	/**
	* Sets the company ID of this app role.
	*
	* @param companyId the company ID of this app role
	*/
	@Override
	public void setCompanyId(long companyId) {
		_appRole.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this app role.
	*
	* @return the create date of this app role
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _appRole.getCreateDate();
	}

	/**
	* Sets the create date of this app role.
	*
	* @param createDate the create date of this app role
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_appRole.setCreateDate(createDate);
	}

	/**
	* Returns the application ID of this app role.
	*
	* @return the application ID of this app role
	*/
	@Override
	public long getApplicationId() {
		return _appRole.getApplicationId();
	}

	/**
	* Sets the application ID of this app role.
	*
	* @param applicationId the application ID of this app role
	*/
	@Override
	public void setApplicationId(long applicationId) {
		_appRole.setApplicationId(applicationId);
	}

	/**
	* Returns the role code of this app role.
	*
	* @return the role code of this app role
	*/
	@Override
	public java.lang.String getRoleCode() {
		return _appRole.getRoleCode();
	}

	/**
	* Sets the role code of this app role.
	*
	* @param roleCode the role code of this app role
	*/
	@Override
	public void setRoleCode(java.lang.String roleCode) {
		_appRole.setRoleCode(roleCode);
	}

	/**
	* Returns the role name of this app role.
	*
	* @return the role name of this app role
	*/
	@Override
	public java.lang.String getRoleName() {
		return _appRole.getRoleName();
	}

	/**
	* Sets the role name of this app role.
	*
	* @param roleName the role name of this app role
	*/
	@Override
	public void setRoleName(java.lang.String roleName) {
		_appRole.setRoleName(roleName);
	}

	@Override
	public boolean isNew() {
		return _appRole.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_appRole.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _appRole.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_appRole.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _appRole.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _appRole.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_appRole.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _appRole.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_appRole.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_appRole.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_appRole.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AppRoleWrapper((AppRole)_appRole.clone());
	}

	@Override
	public int compareTo(org.oep.ssomgt.model.AppRole appRole) {
		return _appRole.compareTo(appRole);
	}

	@Override
	public int hashCode() {
		return _appRole.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.ssomgt.model.AppRole> toCacheModel() {
		return _appRole.toCacheModel();
	}

	@Override
	public org.oep.ssomgt.model.AppRole toEscapedModel() {
		return new AppRoleWrapper(_appRole.toEscapedModel());
	}

	@Override
	public org.oep.ssomgt.model.AppRole toUnescapedModel() {
		return new AppRoleWrapper(_appRole.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _appRole.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _appRole.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_appRole.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AppRoleWrapper)) {
			return false;
		}

		AppRoleWrapper appRoleWrapper = (AppRoleWrapper)obj;

		if (Validator.equals(_appRole, appRoleWrapper._appRole)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public AppRole getWrappedAppRole() {
		return _appRole;
	}

	@Override
	public AppRole getWrappedModel() {
		return _appRole;
	}

	@Override
	public void resetOriginalValues() {
		_appRole.resetOriginalValues();
	}

	private AppRole _appRole;
}