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

package org.oep.usermgt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Delegacy}.
 * </p>
 *
 * @author NQMINH
 * @see Delegacy
 * @generated
 */
public class DelegacyWrapper implements Delegacy, ModelWrapper<Delegacy> {
	public DelegacyWrapper(Delegacy delegacy) {
		_delegacy = delegacy;
	}

	@Override
	public Class<?> getModelClass() {
		return Delegacy.class;
	}

	@Override
	public String getModelClassName() {
		return Delegacy.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("delegacyId", getDelegacyId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("fromEmployeeId", getFromEmployeeId());
		attributes.put("toEmployeeId", getToEmployeeId());
		attributes.put("roleId", getRoleId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long delegacyId = (Long)attributes.get("delegacyId");

		if (delegacyId != null) {
			setDelegacyId(delegacyId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Long fromEmployeeId = (Long)attributes.get("fromEmployeeId");

		if (fromEmployeeId != null) {
			setFromEmployeeId(fromEmployeeId);
		}

		Long toEmployeeId = (Long)attributes.get("toEmployeeId");

		if (toEmployeeId != null) {
			setToEmployeeId(toEmployeeId);
		}

		Long roleId = (Long)attributes.get("roleId");

		if (roleId != null) {
			setRoleId(roleId);
		}
	}

	/**
	* Returns the primary key of this delegacy.
	*
	* @return the primary key of this delegacy
	*/
	@Override
	public long getPrimaryKey() {
		return _delegacy.getPrimaryKey();
	}

	/**
	* Sets the primary key of this delegacy.
	*
	* @param primaryKey the primary key of this delegacy
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_delegacy.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the delegacy ID of this delegacy.
	*
	* @return the delegacy ID of this delegacy
	*/
	@Override
	public long getDelegacyId() {
		return _delegacy.getDelegacyId();
	}

	/**
	* Sets the delegacy ID of this delegacy.
	*
	* @param delegacyId the delegacy ID of this delegacy
	*/
	@Override
	public void setDelegacyId(long delegacyId) {
		_delegacy.setDelegacyId(delegacyId);
	}

	/**
	* Returns the company ID of this delegacy.
	*
	* @return the company ID of this delegacy
	*/
	@Override
	public long getCompanyId() {
		return _delegacy.getCompanyId();
	}

	/**
	* Sets the company ID of this delegacy.
	*
	* @param companyId the company ID of this delegacy
	*/
	@Override
	public void setCompanyId(long companyId) {
		_delegacy.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this delegacy.
	*
	* @return the group ID of this delegacy
	*/
	@Override
	public long getGroupId() {
		return _delegacy.getGroupId();
	}

	/**
	* Sets the group ID of this delegacy.
	*
	* @param groupId the group ID of this delegacy
	*/
	@Override
	public void setGroupId(long groupId) {
		_delegacy.setGroupId(groupId);
	}

	/**
	* Returns the user ID of this delegacy.
	*
	* @return the user ID of this delegacy
	*/
	@Override
	public long getUserId() {
		return _delegacy.getUserId();
	}

	/**
	* Sets the user ID of this delegacy.
	*
	* @param userId the user ID of this delegacy
	*/
	@Override
	public void setUserId(long userId) {
		_delegacy.setUserId(userId);
	}

	/**
	* Returns the user uuid of this delegacy.
	*
	* @return the user uuid of this delegacy
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _delegacy.getUserUuid();
	}

	/**
	* Sets the user uuid of this delegacy.
	*
	* @param userUuid the user uuid of this delegacy
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_delegacy.setUserUuid(userUuid);
	}

	/**
	* Returns the create date of this delegacy.
	*
	* @return the create date of this delegacy
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _delegacy.getCreateDate();
	}

	/**
	* Sets the create date of this delegacy.
	*
	* @param createDate the create date of this delegacy
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_delegacy.setCreateDate(createDate);
	}

	/**
	* Returns the from employee ID of this delegacy.
	*
	* @return the from employee ID of this delegacy
	*/
	@Override
	public long getFromEmployeeId() {
		return _delegacy.getFromEmployeeId();
	}

	/**
	* Sets the from employee ID of this delegacy.
	*
	* @param fromEmployeeId the from employee ID of this delegacy
	*/
	@Override
	public void setFromEmployeeId(long fromEmployeeId) {
		_delegacy.setFromEmployeeId(fromEmployeeId);
	}

	/**
	* Returns the to employee ID of this delegacy.
	*
	* @return the to employee ID of this delegacy
	*/
	@Override
	public long getToEmployeeId() {
		return _delegacy.getToEmployeeId();
	}

	/**
	* Sets the to employee ID of this delegacy.
	*
	* @param toEmployeeId the to employee ID of this delegacy
	*/
	@Override
	public void setToEmployeeId(long toEmployeeId) {
		_delegacy.setToEmployeeId(toEmployeeId);
	}

	/**
	* Returns the role ID of this delegacy.
	*
	* @return the role ID of this delegacy
	*/
	@Override
	public long getRoleId() {
		return _delegacy.getRoleId();
	}

	/**
	* Sets the role ID of this delegacy.
	*
	* @param roleId the role ID of this delegacy
	*/
	@Override
	public void setRoleId(long roleId) {
		_delegacy.setRoleId(roleId);
	}

	@Override
	public boolean isNew() {
		return _delegacy.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_delegacy.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _delegacy.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_delegacy.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _delegacy.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _delegacy.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_delegacy.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _delegacy.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_delegacy.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_delegacy.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_delegacy.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DelegacyWrapper((Delegacy)_delegacy.clone());
	}

	@Override
	public int compareTo(org.oep.usermgt.model.Delegacy delegacy) {
		return _delegacy.compareTo(delegacy);
	}

	@Override
	public int hashCode() {
		return _delegacy.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.usermgt.model.Delegacy> toCacheModel() {
		return _delegacy.toCacheModel();
	}

	@Override
	public org.oep.usermgt.model.Delegacy toEscapedModel() {
		return new DelegacyWrapper(_delegacy.toEscapedModel());
	}

	@Override
	public org.oep.usermgt.model.Delegacy toUnescapedModel() {
		return new DelegacyWrapper(_delegacy.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _delegacy.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _delegacy.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_delegacy.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DelegacyWrapper)) {
			return false;
		}

		DelegacyWrapper delegacyWrapper = (DelegacyWrapper)obj;

		if (Validator.equals(_delegacy, delegacyWrapper._delegacy)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Delegacy getWrappedDelegacy() {
		return _delegacy;
	}

	@Override
	public Delegacy getWrappedModel() {
		return _delegacy;
	}

	@Override
	public void resetOriginalValues() {
		_delegacy.resetOriginalValues();
	}

	private Delegacy _delegacy;
}