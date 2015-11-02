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
 * This class is a wrapper for {@link UserSync}.
 * </p>
 *
 * @author trungdk
 * @see UserSync
 * @generated
 */
public class UserSyncWrapper implements UserSync, ModelWrapper<UserSync> {
	public UserSyncWrapper(UserSync userSync) {
		_userSync = userSync;
	}

	@Override
	public Class<?> getModelClass() {
		return UserSync.class;
	}

	@Override
	public String getModelClassName() {
		return UserSync.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userSyncId", getUserSyncId());
		attributes.put("applicationId", getApplicationId());
		attributes.put("employeeId", getEmployeeId());
		attributes.put("userId", getUserId());
		attributes.put("accessible", getAccessible());
		attributes.put("checkpoint", getCheckpoint());
		attributes.put("syncTime", getSyncTime());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long userSyncId = (Long)attributes.get("userSyncId");

		if (userSyncId != null) {
			setUserSyncId(userSyncId);
		}

		Long applicationId = (Long)attributes.get("applicationId");

		if (applicationId != null) {
			setApplicationId(applicationId);
		}

		Long employeeId = (Long)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Integer accessible = (Integer)attributes.get("accessible");

		if (accessible != null) {
			setAccessible(accessible);
		}

		Date checkpoint = (Date)attributes.get("checkpoint");

		if (checkpoint != null) {
			setCheckpoint(checkpoint);
		}

		Date syncTime = (Date)attributes.get("syncTime");

		if (syncTime != null) {
			setSyncTime(syncTime);
		}
	}

	/**
	* Returns the primary key of this user sync.
	*
	* @return the primary key of this user sync
	*/
	@Override
	public long getPrimaryKey() {
		return _userSync.getPrimaryKey();
	}

	/**
	* Sets the primary key of this user sync.
	*
	* @param primaryKey the primary key of this user sync
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_userSync.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the user sync ID of this user sync.
	*
	* @return the user sync ID of this user sync
	*/
	@Override
	public long getUserSyncId() {
		return _userSync.getUserSyncId();
	}

	/**
	* Sets the user sync ID of this user sync.
	*
	* @param userSyncId the user sync ID of this user sync
	*/
	@Override
	public void setUserSyncId(long userSyncId) {
		_userSync.setUserSyncId(userSyncId);
	}

	/**
	* Returns the application ID of this user sync.
	*
	* @return the application ID of this user sync
	*/
	@Override
	public long getApplicationId() {
		return _userSync.getApplicationId();
	}

	/**
	* Sets the application ID of this user sync.
	*
	* @param applicationId the application ID of this user sync
	*/
	@Override
	public void setApplicationId(long applicationId) {
		_userSync.setApplicationId(applicationId);
	}

	/**
	* Returns the employee ID of this user sync.
	*
	* @return the employee ID of this user sync
	*/
	@Override
	public long getEmployeeId() {
		return _userSync.getEmployeeId();
	}

	/**
	* Sets the employee ID of this user sync.
	*
	* @param employeeId the employee ID of this user sync
	*/
	@Override
	public void setEmployeeId(long employeeId) {
		_userSync.setEmployeeId(employeeId);
	}

	/**
	* Returns the user ID of this user sync.
	*
	* @return the user ID of this user sync
	*/
	@Override
	public long getUserId() {
		return _userSync.getUserId();
	}

	/**
	* Sets the user ID of this user sync.
	*
	* @param userId the user ID of this user sync
	*/
	@Override
	public void setUserId(long userId) {
		_userSync.setUserId(userId);
	}

	/**
	* Returns the user uuid of this user sync.
	*
	* @return the user uuid of this user sync
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userSync.getUserUuid();
	}

	/**
	* Sets the user uuid of this user sync.
	*
	* @param userUuid the user uuid of this user sync
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_userSync.setUserUuid(userUuid);
	}

	/**
	* Returns the accessible of this user sync.
	*
	* @return the accessible of this user sync
	*/
	@Override
	public int getAccessible() {
		return _userSync.getAccessible();
	}

	/**
	* Sets the accessible of this user sync.
	*
	* @param accessible the accessible of this user sync
	*/
	@Override
	public void setAccessible(int accessible) {
		_userSync.setAccessible(accessible);
	}

	/**
	* Returns the checkpoint of this user sync.
	*
	* @return the checkpoint of this user sync
	*/
	@Override
	public java.util.Date getCheckpoint() {
		return _userSync.getCheckpoint();
	}

	/**
	* Sets the checkpoint of this user sync.
	*
	* @param checkpoint the checkpoint of this user sync
	*/
	@Override
	public void setCheckpoint(java.util.Date checkpoint) {
		_userSync.setCheckpoint(checkpoint);
	}

	/**
	* Returns the sync time of this user sync.
	*
	* @return the sync time of this user sync
	*/
	@Override
	public java.util.Date getSyncTime() {
		return _userSync.getSyncTime();
	}

	/**
	* Sets the sync time of this user sync.
	*
	* @param syncTime the sync time of this user sync
	*/
	@Override
	public void setSyncTime(java.util.Date syncTime) {
		_userSync.setSyncTime(syncTime);
	}

	@Override
	public boolean isNew() {
		return _userSync.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_userSync.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _userSync.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_userSync.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _userSync.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _userSync.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_userSync.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _userSync.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_userSync.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_userSync.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_userSync.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new UserSyncWrapper((UserSync)_userSync.clone());
	}

	@Override
	public int compareTo(org.oep.core.ssomgt.model.UserSync userSync) {
		return _userSync.compareTo(userSync);
	}

	@Override
	public int hashCode() {
		return _userSync.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.core.ssomgt.model.UserSync> toCacheModel() {
		return _userSync.toCacheModel();
	}

	@Override
	public org.oep.core.ssomgt.model.UserSync toEscapedModel() {
		return new UserSyncWrapper(_userSync.toEscapedModel());
	}

	@Override
	public org.oep.core.ssomgt.model.UserSync toUnescapedModel() {
		return new UserSyncWrapper(_userSync.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _userSync.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _userSync.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_userSync.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UserSyncWrapper)) {
			return false;
		}

		UserSyncWrapper userSyncWrapper = (UserSyncWrapper)obj;

		if (Validator.equals(_userSync, userSyncWrapper._userSync)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public UserSync getWrappedUserSync() {
		return _userSync;
	}

	@Override
	public UserSync getWrappedModel() {
		return _userSync;
	}

	@Override
	public void resetOriginalValues() {
		_userSync.resetOriginalValues();
	}

	private UserSync _userSync;
}