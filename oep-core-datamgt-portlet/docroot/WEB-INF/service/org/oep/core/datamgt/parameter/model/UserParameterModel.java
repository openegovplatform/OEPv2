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

package org.oep.core.datamgt.parameter.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the UserParameter service. Represents a row in the &quot;oep_datamgt_UserParameter&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.core.datamgt.parameter.model.impl.UserParameterModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.core.datamgt.parameter.model.impl.UserParameterImpl}.
 * </p>
 *
 * @author TrungDK
 * @see UserParameter
 * @see org.oep.core.datamgt.parameter.model.impl.UserParameterImpl
 * @see org.oep.core.datamgt.parameter.model.impl.UserParameterModelImpl
 * @generated
 */
public interface UserParameterModel extends BaseModel<UserParameter> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a user parameter model instance should use the {@link UserParameter} interface instead.
	 */

	/**
	 * Returns the primary key of this user parameter.
	 *
	 * @return the primary key of this user parameter
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this user parameter.
	 *
	 * @param primaryKey the primary key of this user parameter
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the user parameter ID of this user parameter.
	 *
	 * @return the user parameter ID of this user parameter
	 */
	public long getUserParameterId();

	/**
	 * Sets the user parameter ID of this user parameter.
	 *
	 * @param userParameterId the user parameter ID of this user parameter
	 */
	public void setUserParameterId(long userParameterId);

	/**
	 * Returns the user ID of this user parameter.
	 *
	 * @return the user ID of this user parameter
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this user parameter.
	 *
	 * @param userId the user ID of this user parameter
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this user parameter.
	 *
	 * @return the user uuid of this user parameter
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this user parameter.
	 *
	 * @param userUuid the user uuid of this user parameter
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the group ID of this user parameter.
	 *
	 * @return the group ID of this user parameter
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this user parameter.
	 *
	 * @param groupId the group ID of this user parameter
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this user parameter.
	 *
	 * @return the company ID of this user parameter
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this user parameter.
	 *
	 * @param companyId the company ID of this user parameter
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the create date of this user parameter.
	 *
	 * @return the create date of this user parameter
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this user parameter.
	 *
	 * @param createDate the create date of this user parameter
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this user parameter.
	 *
	 * @return the modified date of this user parameter
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this user parameter.
	 *
	 * @param modifiedDate the modified date of this user parameter
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the application name of this user parameter.
	 *
	 * @return the application name of this user parameter
	 */
	@AutoEscape
	public String getApplicationName();

	/**
	 * Sets the application name of this user parameter.
	 *
	 * @param applicationName the application name of this user parameter
	 */
	public void setApplicationName(String applicationName);

	/**
	 * Returns the parameter name of this user parameter.
	 *
	 * @return the parameter name of this user parameter
	 */
	@AutoEscape
	public String getParameterName();

	/**
	 * Sets the parameter name of this user parameter.
	 *
	 * @param parameterName the parameter name of this user parameter
	 */
	public void setParameterName(String parameterName);

	/**
	 * Returns the title of this user parameter.
	 *
	 * @return the title of this user parameter
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this user parameter.
	 *
	 * @param title the title of this user parameter
	 */
	public void setTitle(String title);

	/**
	 * Returns the parameter value of this user parameter.
	 *
	 * @return the parameter value of this user parameter
	 */
	@AutoEscape
	public String getParameterValue();

	/**
	 * Sets the parameter value of this user parameter.
	 *
	 * @param parameterValue the parameter value of this user parameter
	 */
	public void setParameterValue(String parameterValue);

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
	public int compareTo(UserParameter userParameter);

	@Override
	public int hashCode();

	@Override
	public CacheModel<UserParameter> toCacheModel();

	@Override
	public UserParameter toEscapedModel();

	@Override
	public UserParameter toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}