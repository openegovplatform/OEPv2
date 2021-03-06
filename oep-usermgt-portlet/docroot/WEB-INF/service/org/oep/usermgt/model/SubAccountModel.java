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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the SubAccount service. Represents a row in the &quot;oep_usermgt_subaccount&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.usermgt.model.impl.SubAccountModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.usermgt.model.impl.SubAccountImpl}.
 * </p>
 *
 * @author NQMINH
 * @see SubAccount
 * @see org.oep.usermgt.model.impl.SubAccountImpl
 * @see org.oep.usermgt.model.impl.SubAccountModelImpl
 * @generated
 */
public interface SubAccountModel extends BaseModel<SubAccount> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a sub account model instance should use the {@link SubAccount} interface instead.
	 */

	/**
	 * Returns the primary key of this sub account.
	 *
	 * @return the primary key of this sub account
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this sub account.
	 *
	 * @param primaryKey the primary key of this sub account
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the sub account ID of this sub account.
	 *
	 * @return the sub account ID of this sub account
	 */
	public long getSubAccountId();

	/**
	 * Sets the sub account ID of this sub account.
	 *
	 * @param subAccountId the sub account ID of this sub account
	 */
	public void setSubAccountId(long subAccountId);

	/**
	 * Returns the company ID of this sub account.
	 *
	 * @return the company ID of this sub account
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this sub account.
	 *
	 * @param companyId the company ID of this sub account
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this sub account.
	 *
	 * @return the group ID of this sub account
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this sub account.
	 *
	 * @param groupId the group ID of this sub account
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this sub account.
	 *
	 * @return the user ID of this sub account
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this sub account.
	 *
	 * @param userId the user ID of this sub account
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this sub account.
	 *
	 * @return the user uuid of this sub account
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this sub account.
	 *
	 * @param userUuid the user uuid of this sub account
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the create date of this sub account.
	 *
	 * @return the create date of this sub account
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this sub account.
	 *
	 * @param createDate the create date of this sub account
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this sub account.
	 *
	 * @return the modified date of this sub account
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this sub account.
	 *
	 * @param modifiedDate the modified date of this sub account
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the business ID of this sub account.
	 *
	 * @return the business ID of this sub account
	 */
	public long getBusinessId();

	/**
	 * Sets the business ID of this sub account.
	 *
	 * @param businessId the business ID of this sub account
	 */
	public void setBusinessId(long businessId);

	/**
	 * Returns the mapping user ID of this sub account.
	 *
	 * @return the mapping user ID of this sub account
	 */
	public long getMappingUserId();

	/**
	 * Sets the mapping user ID of this sub account.
	 *
	 * @param mappingUserId the mapping user ID of this sub account
	 */
	public void setMappingUserId(long mappingUserId);

	/**
	 * Returns the mapping user uuid of this sub account.
	 *
	 * @return the mapping user uuid of this sub account
	 * @throws SystemException if a system exception occurred
	 */
	public String getMappingUserUuid() throws SystemException;

	/**
	 * Sets the mapping user uuid of this sub account.
	 *
	 * @param mappingUserUuid the mapping user uuid of this sub account
	 */
	public void setMappingUserUuid(String mappingUserUuid);

	/**
	 * Returns the full name of this sub account.
	 *
	 * @return the full name of this sub account
	 */
	@AutoEscape
	public String getFullName();

	/**
	 * Sets the full name of this sub account.
	 *
	 * @param fullName the full name of this sub account
	 */
	public void setFullName(String fullName);

	/**
	 * Returns the short name of this sub account.
	 *
	 * @return the short name of this sub account
	 */
	@AutoEscape
	public String getShortName();

	/**
	 * Sets the short name of this sub account.
	 *
	 * @param shortName the short name of this sub account
	 */
	public void setShortName(String shortName);

	/**
	 * Returns the working role of this sub account.
	 *
	 * @return the working role of this sub account
	 */
	@AutoEscape
	public String getWorkingRole();

	/**
	 * Sets the working role of this sub account.
	 *
	 * @param workingRole the working role of this sub account
	 */
	public void setWorkingRole(String workingRole);

	/**
	 * Returns the tel no of this sub account.
	 *
	 * @return the tel no of this sub account
	 */
	@AutoEscape
	public String getTelNo();

	/**
	 * Sets the tel no of this sub account.
	 *
	 * @param telNo the tel no of this sub account
	 */
	public void setTelNo(String telNo);

	/**
	 * Returns the mobile of this sub account.
	 *
	 * @return the mobile of this sub account
	 */
	@AutoEscape
	public String getMobile();

	/**
	 * Sets the mobile of this sub account.
	 *
	 * @param mobile the mobile of this sub account
	 */
	public void setMobile(String mobile);

	/**
	 * Returns the email of this sub account.
	 *
	 * @return the email of this sub account
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this sub account.
	 *
	 * @param email the email of this sub account
	 */
	public void setEmail(String email);

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
	public int compareTo(SubAccount subAccount);

	@Override
	public int hashCode();

	@Override
	public CacheModel<SubAccount> toCacheModel();

	@Override
	public SubAccount toEscapedModel();

	@Override
	public SubAccount toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}