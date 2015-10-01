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

package org.oep.core.processmgt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link UserAssignment}.
 * </p>
 *
 * @author trungdk
 * @see UserAssignment
 * @generated
 */
public class UserAssignmentWrapper implements UserAssignment,
	ModelWrapper<UserAssignment> {
	public UserAssignmentWrapper(UserAssignment userAssignment) {
		_userAssignment = userAssignment;
	}

	@Override
	public Class<?> getModelClass() {
		return UserAssignment.class;
	}

	@Override
	public String getModelClassName() {
		return UserAssignment.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userAssignmentId", getUserAssignmentId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("processOrderId", getProcessOrderId());
		attributes.put("dossierStepId", getDossierStepId());
		attributes.put("assignToUserId", getAssignToUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long userAssignmentId = (Long)attributes.get("userAssignmentId");

		if (userAssignmentId != null) {
			setUserAssignmentId(userAssignmentId);
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

		Long processOrderId = (Long)attributes.get("processOrderId");

		if (processOrderId != null) {
			setProcessOrderId(processOrderId);
		}

		Long dossierStepId = (Long)attributes.get("dossierStepId");

		if (dossierStepId != null) {
			setDossierStepId(dossierStepId);
		}

		Long assignToUserId = (Long)attributes.get("assignToUserId");

		if (assignToUserId != null) {
			setAssignToUserId(assignToUserId);
		}
	}

	/**
	* Returns the primary key of this user assignment.
	*
	* @return the primary key of this user assignment
	*/
	@Override
	public long getPrimaryKey() {
		return _userAssignment.getPrimaryKey();
	}

	/**
	* Sets the primary key of this user assignment.
	*
	* @param primaryKey the primary key of this user assignment
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_userAssignment.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the user assignment ID of this user assignment.
	*
	* @return the user assignment ID of this user assignment
	*/
	@Override
	public long getUserAssignmentId() {
		return _userAssignment.getUserAssignmentId();
	}

	/**
	* Sets the user assignment ID of this user assignment.
	*
	* @param userAssignmentId the user assignment ID of this user assignment
	*/
	@Override
	public void setUserAssignmentId(long userAssignmentId) {
		_userAssignment.setUserAssignmentId(userAssignmentId);
	}

	/**
	* Returns the user ID of this user assignment.
	*
	* @return the user ID of this user assignment
	*/
	@Override
	public long getUserId() {
		return _userAssignment.getUserId();
	}

	/**
	* Sets the user ID of this user assignment.
	*
	* @param userId the user ID of this user assignment
	*/
	@Override
	public void setUserId(long userId) {
		_userAssignment.setUserId(userId);
	}

	/**
	* Returns the user uuid of this user assignment.
	*
	* @return the user uuid of this user assignment
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userAssignment.getUserUuid();
	}

	/**
	* Sets the user uuid of this user assignment.
	*
	* @param userUuid the user uuid of this user assignment
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_userAssignment.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this user assignment.
	*
	* @return the group ID of this user assignment
	*/
	@Override
	public long getGroupId() {
		return _userAssignment.getGroupId();
	}

	/**
	* Sets the group ID of this user assignment.
	*
	* @param groupId the group ID of this user assignment
	*/
	@Override
	public void setGroupId(long groupId) {
		_userAssignment.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this user assignment.
	*
	* @return the company ID of this user assignment
	*/
	@Override
	public long getCompanyId() {
		return _userAssignment.getCompanyId();
	}

	/**
	* Sets the company ID of this user assignment.
	*
	* @param companyId the company ID of this user assignment
	*/
	@Override
	public void setCompanyId(long companyId) {
		_userAssignment.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this user assignment.
	*
	* @return the create date of this user assignment
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _userAssignment.getCreateDate();
	}

	/**
	* Sets the create date of this user assignment.
	*
	* @param createDate the create date of this user assignment
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_userAssignment.setCreateDate(createDate);
	}

	/**
	* Returns the process order ID of this user assignment.
	*
	* @return the process order ID of this user assignment
	*/
	@Override
	public long getProcessOrderId() {
		return _userAssignment.getProcessOrderId();
	}

	/**
	* Sets the process order ID of this user assignment.
	*
	* @param processOrderId the process order ID of this user assignment
	*/
	@Override
	public void setProcessOrderId(long processOrderId) {
		_userAssignment.setProcessOrderId(processOrderId);
	}

	/**
	* Returns the dossier step ID of this user assignment.
	*
	* @return the dossier step ID of this user assignment
	*/
	@Override
	public long getDossierStepId() {
		return _userAssignment.getDossierStepId();
	}

	/**
	* Sets the dossier step ID of this user assignment.
	*
	* @param dossierStepId the dossier step ID of this user assignment
	*/
	@Override
	public void setDossierStepId(long dossierStepId) {
		_userAssignment.setDossierStepId(dossierStepId);
	}

	/**
	* Returns the assign to user ID of this user assignment.
	*
	* @return the assign to user ID of this user assignment
	*/
	@Override
	public long getAssignToUserId() {
		return _userAssignment.getAssignToUserId();
	}

	/**
	* Sets the assign to user ID of this user assignment.
	*
	* @param assignToUserId the assign to user ID of this user assignment
	*/
	@Override
	public void setAssignToUserId(long assignToUserId) {
		_userAssignment.setAssignToUserId(assignToUserId);
	}

	/**
	* Returns the assign to user uuid of this user assignment.
	*
	* @return the assign to user uuid of this user assignment
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getAssignToUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userAssignment.getAssignToUserUuid();
	}

	/**
	* Sets the assign to user uuid of this user assignment.
	*
	* @param assignToUserUuid the assign to user uuid of this user assignment
	*/
	@Override
	public void setAssignToUserUuid(java.lang.String assignToUserUuid) {
		_userAssignment.setAssignToUserUuid(assignToUserUuid);
	}

	@Override
	public boolean isNew() {
		return _userAssignment.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_userAssignment.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _userAssignment.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_userAssignment.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _userAssignment.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _userAssignment.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_userAssignment.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _userAssignment.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_userAssignment.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_userAssignment.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_userAssignment.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new UserAssignmentWrapper((UserAssignment)_userAssignment.clone());
	}

	@Override
	public int compareTo(
		org.oep.core.processmgt.model.UserAssignment userAssignment) {
		return _userAssignment.compareTo(userAssignment);
	}

	@Override
	public int hashCode() {
		return _userAssignment.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.core.processmgt.model.UserAssignment> toCacheModel() {
		return _userAssignment.toCacheModel();
	}

	@Override
	public org.oep.core.processmgt.model.UserAssignment toEscapedModel() {
		return new UserAssignmentWrapper(_userAssignment.toEscapedModel());
	}

	@Override
	public org.oep.core.processmgt.model.UserAssignment toUnescapedModel() {
		return new UserAssignmentWrapper(_userAssignment.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _userAssignment.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _userAssignment.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_userAssignment.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UserAssignmentWrapper)) {
			return false;
		}

		UserAssignmentWrapper userAssignmentWrapper = (UserAssignmentWrapper)obj;

		if (Validator.equals(_userAssignment,
					userAssignmentWrapper._userAssignment)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public UserAssignment getWrappedUserAssignment() {
		return _userAssignment;
	}

	@Override
	public UserAssignment getWrappedModel() {
		return _userAssignment;
	}

	@Override
	public void resetOriginalValues() {
		_userAssignment.resetOriginalValues();
	}

	private UserAssignment _userAssignment;
}