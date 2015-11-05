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
 * This class is a wrapper for {@link SubAccount}.
 * </p>
 *
 * @author NQMINH
 * @see SubAccount
 * @generated
 */
public class SubAccountWrapper implements SubAccount, ModelWrapper<SubAccount> {
	public SubAccountWrapper(SubAccount subAccount) {
		_subAccount = subAccount;
	}

	@Override
	public Class<?> getModelClass() {
		return SubAccount.class;
	}

	@Override
	public String getModelClassName() {
		return SubAccount.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("subAccountId", getSubAccountId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("businessId", getBusinessId());
		attributes.put("mappingUserId", getMappingUserId());
		attributes.put("fullName", getFullName());
		attributes.put("shortName", getShortName());
		attributes.put("workingRole", getWorkingRole());
		attributes.put("telNo", getTelNo());
		attributes.put("mobile", getMobile());
		attributes.put("email", getEmail());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long subAccountId = (Long)attributes.get("subAccountId");

		if (subAccountId != null) {
			setSubAccountId(subAccountId);
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

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long businessId = (Long)attributes.get("businessId");

		if (businessId != null) {
			setBusinessId(businessId);
		}

		Long mappingUserId = (Long)attributes.get("mappingUserId");

		if (mappingUserId != null) {
			setMappingUserId(mappingUserId);
		}

		String fullName = (String)attributes.get("fullName");

		if (fullName != null) {
			setFullName(fullName);
		}

		String shortName = (String)attributes.get("shortName");

		if (shortName != null) {
			setShortName(shortName);
		}

		String workingRole = (String)attributes.get("workingRole");

		if (workingRole != null) {
			setWorkingRole(workingRole);
		}

		String telNo = (String)attributes.get("telNo");

		if (telNo != null) {
			setTelNo(telNo);
		}

		String mobile = (String)attributes.get("mobile");

		if (mobile != null) {
			setMobile(mobile);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}
	}

	/**
	* Returns the primary key of this sub account.
	*
	* @return the primary key of this sub account
	*/
	@Override
	public long getPrimaryKey() {
		return _subAccount.getPrimaryKey();
	}

	/**
	* Sets the primary key of this sub account.
	*
	* @param primaryKey the primary key of this sub account
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_subAccount.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the sub account ID of this sub account.
	*
	* @return the sub account ID of this sub account
	*/
	@Override
	public long getSubAccountId() {
		return _subAccount.getSubAccountId();
	}

	/**
	* Sets the sub account ID of this sub account.
	*
	* @param subAccountId the sub account ID of this sub account
	*/
	@Override
	public void setSubAccountId(long subAccountId) {
		_subAccount.setSubAccountId(subAccountId);
	}

	/**
	* Returns the company ID of this sub account.
	*
	* @return the company ID of this sub account
	*/
	@Override
	public long getCompanyId() {
		return _subAccount.getCompanyId();
	}

	/**
	* Sets the company ID of this sub account.
	*
	* @param companyId the company ID of this sub account
	*/
	@Override
	public void setCompanyId(long companyId) {
		_subAccount.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this sub account.
	*
	* @return the group ID of this sub account
	*/
	@Override
	public long getGroupId() {
		return _subAccount.getGroupId();
	}

	/**
	* Sets the group ID of this sub account.
	*
	* @param groupId the group ID of this sub account
	*/
	@Override
	public void setGroupId(long groupId) {
		_subAccount.setGroupId(groupId);
	}

	/**
	* Returns the user ID of this sub account.
	*
	* @return the user ID of this sub account
	*/
	@Override
	public long getUserId() {
		return _subAccount.getUserId();
	}

	/**
	* Sets the user ID of this sub account.
	*
	* @param userId the user ID of this sub account
	*/
	@Override
	public void setUserId(long userId) {
		_subAccount.setUserId(userId);
	}

	/**
	* Returns the user uuid of this sub account.
	*
	* @return the user uuid of this sub account
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subAccount.getUserUuid();
	}

	/**
	* Sets the user uuid of this sub account.
	*
	* @param userUuid the user uuid of this sub account
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_subAccount.setUserUuid(userUuid);
	}

	/**
	* Returns the create date of this sub account.
	*
	* @return the create date of this sub account
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _subAccount.getCreateDate();
	}

	/**
	* Sets the create date of this sub account.
	*
	* @param createDate the create date of this sub account
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_subAccount.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this sub account.
	*
	* @return the modified date of this sub account
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _subAccount.getModifiedDate();
	}

	/**
	* Sets the modified date of this sub account.
	*
	* @param modifiedDate the modified date of this sub account
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_subAccount.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the business ID of this sub account.
	*
	* @return the business ID of this sub account
	*/
	@Override
	public long getBusinessId() {
		return _subAccount.getBusinessId();
	}

	/**
	* Sets the business ID of this sub account.
	*
	* @param businessId the business ID of this sub account
	*/
	@Override
	public void setBusinessId(long businessId) {
		_subAccount.setBusinessId(businessId);
	}

	/**
	* Returns the mapping user ID of this sub account.
	*
	* @return the mapping user ID of this sub account
	*/
	@Override
	public long getMappingUserId() {
		return _subAccount.getMappingUserId();
	}

	/**
	* Sets the mapping user ID of this sub account.
	*
	* @param mappingUserId the mapping user ID of this sub account
	*/
	@Override
	public void setMappingUserId(long mappingUserId) {
		_subAccount.setMappingUserId(mappingUserId);
	}

	/**
	* Returns the mapping user uuid of this sub account.
	*
	* @return the mapping user uuid of this sub account
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getMappingUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subAccount.getMappingUserUuid();
	}

	/**
	* Sets the mapping user uuid of this sub account.
	*
	* @param mappingUserUuid the mapping user uuid of this sub account
	*/
	@Override
	public void setMappingUserUuid(java.lang.String mappingUserUuid) {
		_subAccount.setMappingUserUuid(mappingUserUuid);
	}

	/**
	* Returns the full name of this sub account.
	*
	* @return the full name of this sub account
	*/
	@Override
	public java.lang.String getFullName() {
		return _subAccount.getFullName();
	}

	/**
	* Sets the full name of this sub account.
	*
	* @param fullName the full name of this sub account
	*/
	@Override
	public void setFullName(java.lang.String fullName) {
		_subAccount.setFullName(fullName);
	}

	/**
	* Returns the short name of this sub account.
	*
	* @return the short name of this sub account
	*/
	@Override
	public java.lang.String getShortName() {
		return _subAccount.getShortName();
	}

	/**
	* Sets the short name of this sub account.
	*
	* @param shortName the short name of this sub account
	*/
	@Override
	public void setShortName(java.lang.String shortName) {
		_subAccount.setShortName(shortName);
	}

	/**
	* Returns the working role of this sub account.
	*
	* @return the working role of this sub account
	*/
	@Override
	public java.lang.String getWorkingRole() {
		return _subAccount.getWorkingRole();
	}

	/**
	* Sets the working role of this sub account.
	*
	* @param workingRole the working role of this sub account
	*/
	@Override
	public void setWorkingRole(java.lang.String workingRole) {
		_subAccount.setWorkingRole(workingRole);
	}

	/**
	* Returns the tel no of this sub account.
	*
	* @return the tel no of this sub account
	*/
	@Override
	public java.lang.String getTelNo() {
		return _subAccount.getTelNo();
	}

	/**
	* Sets the tel no of this sub account.
	*
	* @param telNo the tel no of this sub account
	*/
	@Override
	public void setTelNo(java.lang.String telNo) {
		_subAccount.setTelNo(telNo);
	}

	/**
	* Returns the mobile of this sub account.
	*
	* @return the mobile of this sub account
	*/
	@Override
	public java.lang.String getMobile() {
		return _subAccount.getMobile();
	}

	/**
	* Sets the mobile of this sub account.
	*
	* @param mobile the mobile of this sub account
	*/
	@Override
	public void setMobile(java.lang.String mobile) {
		_subAccount.setMobile(mobile);
	}

	/**
	* Returns the email of this sub account.
	*
	* @return the email of this sub account
	*/
	@Override
	public java.lang.String getEmail() {
		return _subAccount.getEmail();
	}

	/**
	* Sets the email of this sub account.
	*
	* @param email the email of this sub account
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_subAccount.setEmail(email);
	}

	@Override
	public boolean isNew() {
		return _subAccount.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_subAccount.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _subAccount.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_subAccount.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _subAccount.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _subAccount.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_subAccount.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _subAccount.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_subAccount.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_subAccount.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_subAccount.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SubAccountWrapper((SubAccount)_subAccount.clone());
	}

	@Override
	public int compareTo(org.oep.usermgt.model.SubAccount subAccount) {
		return _subAccount.compareTo(subAccount);
	}

	@Override
	public int hashCode() {
		return _subAccount.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.usermgt.model.SubAccount> toCacheModel() {
		return _subAccount.toCacheModel();
	}

	@Override
	public org.oep.usermgt.model.SubAccount toEscapedModel() {
		return new SubAccountWrapper(_subAccount.toEscapedModel());
	}

	@Override
	public org.oep.usermgt.model.SubAccount toUnescapedModel() {
		return new SubAccountWrapper(_subAccount.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _subAccount.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _subAccount.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_subAccount.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SubAccountWrapper)) {
			return false;
		}

		SubAccountWrapper subAccountWrapper = (SubAccountWrapper)obj;

		if (Validator.equals(_subAccount, subAccountWrapper._subAccount)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public SubAccount getWrappedSubAccount() {
		return _subAccount;
	}

	@Override
	public SubAccount getWrappedModel() {
		return _subAccount;
	}

	@Override
	public void resetOriginalValues() {
		_subAccount.resetOriginalValues();
	}

	private SubAccount _subAccount;
}