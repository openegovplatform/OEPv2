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

package org.oep.core.dossiermgt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ProfileData}.
 * </p>
 *
 * @author trungdk
 * @see ProfileData
 * @generated
 */
public class ProfileDataWrapper implements ProfileData,
	ModelWrapper<ProfileData> {
	public ProfileDataWrapper(ProfileData profileData) {
		_profileData = profileData;
	}

	@Override
	public Class<?> getModelClass() {
		return ProfileData.class;
	}

	@Override
	public String getModelClassName() {
		return ProfileData.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("profileDataId", getProfileDataId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("fieldName", getFieldName());
		attributes.put("fieldValue", getFieldValue());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long profileDataId = (Long)attributes.get("profileDataId");

		if (profileDataId != null) {
			setProfileDataId(profileDataId);
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

		String fieldName = (String)attributes.get("fieldName");

		if (fieldName != null) {
			setFieldName(fieldName);
		}

		String fieldValue = (String)attributes.get("fieldValue");

		if (fieldValue != null) {
			setFieldValue(fieldValue);
		}
	}

	/**
	* Returns the primary key of this profile data.
	*
	* @return the primary key of this profile data
	*/
	@Override
	public long getPrimaryKey() {
		return _profileData.getPrimaryKey();
	}

	/**
	* Sets the primary key of this profile data.
	*
	* @param primaryKey the primary key of this profile data
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_profileData.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the profile data ID of this profile data.
	*
	* @return the profile data ID of this profile data
	*/
	@Override
	public long getProfileDataId() {
		return _profileData.getProfileDataId();
	}

	/**
	* Sets the profile data ID of this profile data.
	*
	* @param profileDataId the profile data ID of this profile data
	*/
	@Override
	public void setProfileDataId(long profileDataId) {
		_profileData.setProfileDataId(profileDataId);
	}

	/**
	* Returns the user ID of this profile data.
	*
	* @return the user ID of this profile data
	*/
	@Override
	public long getUserId() {
		return _profileData.getUserId();
	}

	/**
	* Sets the user ID of this profile data.
	*
	* @param userId the user ID of this profile data
	*/
	@Override
	public void setUserId(long userId) {
		_profileData.setUserId(userId);
	}

	/**
	* Returns the user uuid of this profile data.
	*
	* @return the user uuid of this profile data
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _profileData.getUserUuid();
	}

	/**
	* Sets the user uuid of this profile data.
	*
	* @param userUuid the user uuid of this profile data
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_profileData.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this profile data.
	*
	* @return the group ID of this profile data
	*/
	@Override
	public long getGroupId() {
		return _profileData.getGroupId();
	}

	/**
	* Sets the group ID of this profile data.
	*
	* @param groupId the group ID of this profile data
	*/
	@Override
	public void setGroupId(long groupId) {
		_profileData.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this profile data.
	*
	* @return the company ID of this profile data
	*/
	@Override
	public long getCompanyId() {
		return _profileData.getCompanyId();
	}

	/**
	* Sets the company ID of this profile data.
	*
	* @param companyId the company ID of this profile data
	*/
	@Override
	public void setCompanyId(long companyId) {
		_profileData.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this profile data.
	*
	* @return the create date of this profile data
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _profileData.getCreateDate();
	}

	/**
	* Sets the create date of this profile data.
	*
	* @param createDate the create date of this profile data
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_profileData.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this profile data.
	*
	* @return the modified date of this profile data
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _profileData.getModifiedDate();
	}

	/**
	* Sets the modified date of this profile data.
	*
	* @param modifiedDate the modified date of this profile data
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_profileData.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the field name of this profile data.
	*
	* @return the field name of this profile data
	*/
	@Override
	public java.lang.String getFieldName() {
		return _profileData.getFieldName();
	}

	/**
	* Sets the field name of this profile data.
	*
	* @param fieldName the field name of this profile data
	*/
	@Override
	public void setFieldName(java.lang.String fieldName) {
		_profileData.setFieldName(fieldName);
	}

	/**
	* Returns the field value of this profile data.
	*
	* @return the field value of this profile data
	*/
	@Override
	public java.lang.String getFieldValue() {
		return _profileData.getFieldValue();
	}

	/**
	* Sets the field value of this profile data.
	*
	* @param fieldValue the field value of this profile data
	*/
	@Override
	public void setFieldValue(java.lang.String fieldValue) {
		_profileData.setFieldValue(fieldValue);
	}

	@Override
	public boolean isNew() {
		return _profileData.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_profileData.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _profileData.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_profileData.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _profileData.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _profileData.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_profileData.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _profileData.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_profileData.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_profileData.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_profileData.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ProfileDataWrapper((ProfileData)_profileData.clone());
	}

	@Override
	public int compareTo(org.oep.core.dossiermgt.model.ProfileData profileData) {
		return _profileData.compareTo(profileData);
	}

	@Override
	public int hashCode() {
		return _profileData.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.core.dossiermgt.model.ProfileData> toCacheModel() {
		return _profileData.toCacheModel();
	}

	@Override
	public org.oep.core.dossiermgt.model.ProfileData toEscapedModel() {
		return new ProfileDataWrapper(_profileData.toEscapedModel());
	}

	@Override
	public org.oep.core.dossiermgt.model.ProfileData toUnescapedModel() {
		return new ProfileDataWrapper(_profileData.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _profileData.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _profileData.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_profileData.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProfileDataWrapper)) {
			return false;
		}

		ProfileDataWrapper profileDataWrapper = (ProfileDataWrapper)obj;

		if (Validator.equals(_profileData, profileDataWrapper._profileData)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ProfileData getWrappedProfileData() {
		return _profileData;
	}

	@Override
	public ProfileData getWrappedModel() {
		return _profileData;
	}

	@Override
	public void resetOriginalValues() {
		_profileData.resetOriginalValues();
	}

	private ProfileData _profileData;
}