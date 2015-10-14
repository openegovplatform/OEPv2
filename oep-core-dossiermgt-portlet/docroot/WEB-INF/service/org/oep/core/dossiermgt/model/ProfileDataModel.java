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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the ProfileData service. Represents a row in the &quot;oep_dossiermgt_profiledata&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.core.dossiermgt.model.impl.ProfileDataModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.core.dossiermgt.model.impl.ProfileDataImpl}.
 * </p>
 *
 * @author trungdk
 * @see ProfileData
 * @see org.oep.core.dossiermgt.model.impl.ProfileDataImpl
 * @see org.oep.core.dossiermgt.model.impl.ProfileDataModelImpl
 * @generated
 */
public interface ProfileDataModel extends BaseModel<ProfileData> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a profile data model instance should use the {@link ProfileData} interface instead.
	 */

	/**
	 * Returns the primary key of this profile data.
	 *
	 * @return the primary key of this profile data
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this profile data.
	 *
	 * @param primaryKey the primary key of this profile data
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the profile data ID of this profile data.
	 *
	 * @return the profile data ID of this profile data
	 */
	public long getProfileDataId();

	/**
	 * Sets the profile data ID of this profile data.
	 *
	 * @param profileDataId the profile data ID of this profile data
	 */
	public void setProfileDataId(long profileDataId);

	/**
	 * Returns the user ID of this profile data.
	 *
	 * @return the user ID of this profile data
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this profile data.
	 *
	 * @param userId the user ID of this profile data
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this profile data.
	 *
	 * @return the user uuid of this profile data
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this profile data.
	 *
	 * @param userUuid the user uuid of this profile data
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the group ID of this profile data.
	 *
	 * @return the group ID of this profile data
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this profile data.
	 *
	 * @param groupId the group ID of this profile data
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this profile data.
	 *
	 * @return the company ID of this profile data
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this profile data.
	 *
	 * @param companyId the company ID of this profile data
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the create date of this profile data.
	 *
	 * @return the create date of this profile data
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this profile data.
	 *
	 * @param createDate the create date of this profile data
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this profile data.
	 *
	 * @return the modified date of this profile data
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this profile data.
	 *
	 * @param modifiedDate the modified date of this profile data
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the field name of this profile data.
	 *
	 * @return the field name of this profile data
	 */
	@AutoEscape
	public String getFieldName();

	/**
	 * Sets the field name of this profile data.
	 *
	 * @param fieldName the field name of this profile data
	 */
	public void setFieldName(String fieldName);

	/**
	 * Returns the field value of this profile data.
	 *
	 * @return the field value of this profile data
	 */
	@AutoEscape
	public String getFieldValue();

	/**
	 * Sets the field value of this profile data.
	 *
	 * @param fieldValue the field value of this profile data
	 */
	public void setFieldValue(String fieldValue);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(ProfileData profileData);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ProfileData> toCacheModel();

	@Override
	public ProfileData toEscapedModel();

	@Override
	public ProfileData toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}