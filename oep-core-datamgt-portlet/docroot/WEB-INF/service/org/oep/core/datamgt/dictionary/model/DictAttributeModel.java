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

package org.oep.core.datamgt.dictionary.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the DictAttribute service. Represents a row in the &quot;oep_datamgt_dictattribute&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.core.datamgt.dictionary.model.impl.DictAttributeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.core.datamgt.dictionary.model.impl.DictAttributeImpl}.
 * </p>
 *
 * @author TrungDK
 * @see DictAttribute
 * @see org.oep.core.datamgt.dictionary.model.impl.DictAttributeImpl
 * @see org.oep.core.datamgt.dictionary.model.impl.DictAttributeModelImpl
 * @generated
 */
public interface DictAttributeModel extends BaseModel<DictAttribute> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dictionary attribute model instance should use the {@link DictAttribute} interface instead.
	 */

	/**
	 * Returns the primary key of this dictionary attribute.
	 *
	 * @return the primary key of this dictionary attribute
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this dictionary attribute.
	 *
	 * @param primaryKey the primary key of this dictionary attribute
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the dict attribute ID of this dictionary attribute.
	 *
	 * @return the dict attribute ID of this dictionary attribute
	 */
	public long getDictAttributeId();

	/**
	 * Sets the dict attribute ID of this dictionary attribute.
	 *
	 * @param dictAttributeId the dict attribute ID of this dictionary attribute
	 */
	public void setDictAttributeId(long dictAttributeId);

	/**
	 * Returns the company ID of this dictionary attribute.
	 *
	 * @return the company ID of this dictionary attribute
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this dictionary attribute.
	 *
	 * @param companyId the company ID of this dictionary attribute
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this dictionary attribute.
	 *
	 * @return the user ID of this dictionary attribute
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this dictionary attribute.
	 *
	 * @param userId the user ID of this dictionary attribute
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this dictionary attribute.
	 *
	 * @return the user uuid of this dictionary attribute
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this dictionary attribute.
	 *
	 * @param userUuid the user uuid of this dictionary attribute
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the group ID of this dictionary attribute.
	 *
	 * @return the group ID of this dictionary attribute
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this dictionary attribute.
	 *
	 * @param groupId the group ID of this dictionary attribute
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the create date of this dictionary attribute.
	 *
	 * @return the create date of this dictionary attribute
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this dictionary attribute.
	 *
	 * @param createDate the create date of this dictionary attribute
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this dictionary attribute.
	 *
	 * @return the modified date of this dictionary attribute
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this dictionary attribute.
	 *
	 * @param modifiedDate the modified date of this dictionary attribute
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the collection name of this dictionary attribute.
	 *
	 * @return the collection name of this dictionary attribute
	 */
	@AutoEscape
	public String getCollectionName();

	/**
	 * Sets the collection name of this dictionary attribute.
	 *
	 * @param collectionName the collection name of this dictionary attribute
	 */
	public void setCollectionName(String collectionName);

	/**
	 * Returns the name of this dictionary attribute.
	 *
	 * @return the name of this dictionary attribute
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this dictionary attribute.
	 *
	 * @param name the name of this dictionary attribute
	 */
	public void setName(String name);

	/**
	 * Returns the title of this dictionary attribute.
	 *
	 * @return the title of this dictionary attribute
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this dictionary attribute.
	 *
	 * @param title the title of this dictionary attribute
	 */
	public void setTitle(String title);

	/**
	 * Returns the data type of this dictionary attribute.
	 *
	 * @return the data type of this dictionary attribute
	 */
	@AutoEscape
	public String getDataType();

	/**
	 * Sets the data type of this dictionary attribute.
	 *
	 * @param dataType the data type of this dictionary attribute
	 */
	public void setDataType(String dataType);

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
	public int compareTo(DictAttribute dictAttribute);

	@Override
	public int hashCode();

	@Override
	public CacheModel<DictAttribute> toCacheModel();

	@Override
	public DictAttribute toEscapedModel();

	@Override
	public DictAttribute toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}