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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DictAttribute}.
 * </p>
 *
 * @author TrungDK
 * @see DictAttribute
 * @generated
 */
public class DictAttributeWrapper implements DictAttribute,
	ModelWrapper<DictAttribute> {
	public DictAttributeWrapper(DictAttribute dictAttribute) {
		_dictAttribute = dictAttribute;
	}

	@Override
	public Class<?> getModelClass() {
		return DictAttribute.class;
	}

	@Override
	public String getModelClassName() {
		return DictAttribute.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dictAttributeId", getDictAttributeId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("collectionName", getCollectionName());
		attributes.put("name", getName());
		attributes.put("title", getTitle());
		attributes.put("dataType", getDataType());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dictAttributeId = (Long)attributes.get("dictAttributeId");

		if (dictAttributeId != null) {
			setDictAttributeId(dictAttributeId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String collectionName = (String)attributes.get("collectionName");

		if (collectionName != null) {
			setCollectionName(collectionName);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String dataType = (String)attributes.get("dataType");

		if (dataType != null) {
			setDataType(dataType);
		}
	}

	/**
	* Returns the primary key of this dictionary attribute.
	*
	* @return the primary key of this dictionary attribute
	*/
	@Override
	public long getPrimaryKey() {
		return _dictAttribute.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dictionary attribute.
	*
	* @param primaryKey the primary key of this dictionary attribute
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dictAttribute.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the dict attribute ID of this dictionary attribute.
	*
	* @return the dict attribute ID of this dictionary attribute
	*/
	@Override
	public long getDictAttributeId() {
		return _dictAttribute.getDictAttributeId();
	}

	/**
	* Sets the dict attribute ID of this dictionary attribute.
	*
	* @param dictAttributeId the dict attribute ID of this dictionary attribute
	*/
	@Override
	public void setDictAttributeId(long dictAttributeId) {
		_dictAttribute.setDictAttributeId(dictAttributeId);
	}

	/**
	* Returns the company ID of this dictionary attribute.
	*
	* @return the company ID of this dictionary attribute
	*/
	@Override
	public long getCompanyId() {
		return _dictAttribute.getCompanyId();
	}

	/**
	* Sets the company ID of this dictionary attribute.
	*
	* @param companyId the company ID of this dictionary attribute
	*/
	@Override
	public void setCompanyId(long companyId) {
		_dictAttribute.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this dictionary attribute.
	*
	* @return the user ID of this dictionary attribute
	*/
	@Override
	public long getUserId() {
		return _dictAttribute.getUserId();
	}

	/**
	* Sets the user ID of this dictionary attribute.
	*
	* @param userId the user ID of this dictionary attribute
	*/
	@Override
	public void setUserId(long userId) {
		_dictAttribute.setUserId(userId);
	}

	/**
	* Returns the user uuid of this dictionary attribute.
	*
	* @return the user uuid of this dictionary attribute
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictAttribute.getUserUuid();
	}

	/**
	* Sets the user uuid of this dictionary attribute.
	*
	* @param userUuid the user uuid of this dictionary attribute
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_dictAttribute.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this dictionary attribute.
	*
	* @return the group ID of this dictionary attribute
	*/
	@Override
	public long getGroupId() {
		return _dictAttribute.getGroupId();
	}

	/**
	* Sets the group ID of this dictionary attribute.
	*
	* @param groupId the group ID of this dictionary attribute
	*/
	@Override
	public void setGroupId(long groupId) {
		_dictAttribute.setGroupId(groupId);
	}

	/**
	* Returns the create date of this dictionary attribute.
	*
	* @return the create date of this dictionary attribute
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _dictAttribute.getCreateDate();
	}

	/**
	* Sets the create date of this dictionary attribute.
	*
	* @param createDate the create date of this dictionary attribute
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_dictAttribute.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this dictionary attribute.
	*
	* @return the modified date of this dictionary attribute
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dictAttribute.getModifiedDate();
	}

	/**
	* Sets the modified date of this dictionary attribute.
	*
	* @param modifiedDate the modified date of this dictionary attribute
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dictAttribute.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the collection name of this dictionary attribute.
	*
	* @return the collection name of this dictionary attribute
	*/
	@Override
	public java.lang.String getCollectionName() {
		return _dictAttribute.getCollectionName();
	}

	/**
	* Sets the collection name of this dictionary attribute.
	*
	* @param collectionName the collection name of this dictionary attribute
	*/
	@Override
	public void setCollectionName(java.lang.String collectionName) {
		_dictAttribute.setCollectionName(collectionName);
	}

	/**
	* Returns the name of this dictionary attribute.
	*
	* @return the name of this dictionary attribute
	*/
	@Override
	public java.lang.String getName() {
		return _dictAttribute.getName();
	}

	/**
	* Sets the name of this dictionary attribute.
	*
	* @param name the name of this dictionary attribute
	*/
	@Override
	public void setName(java.lang.String name) {
		_dictAttribute.setName(name);
	}

	/**
	* Returns the title of this dictionary attribute.
	*
	* @return the title of this dictionary attribute
	*/
	@Override
	public java.lang.String getTitle() {
		return _dictAttribute.getTitle();
	}

	/**
	* Sets the title of this dictionary attribute.
	*
	* @param title the title of this dictionary attribute
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_dictAttribute.setTitle(title);
	}

	/**
	* Returns the data type of this dictionary attribute.
	*
	* @return the data type of this dictionary attribute
	*/
	@Override
	public java.lang.String getDataType() {
		return _dictAttribute.getDataType();
	}

	/**
	* Sets the data type of this dictionary attribute.
	*
	* @param dataType the data type of this dictionary attribute
	*/
	@Override
	public void setDataType(java.lang.String dataType) {
		_dictAttribute.setDataType(dataType);
	}

	@Override
	public boolean isNew() {
		return _dictAttribute.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dictAttribute.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dictAttribute.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dictAttribute.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dictAttribute.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dictAttribute.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dictAttribute.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dictAttribute.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dictAttribute.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dictAttribute.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dictAttribute.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DictAttributeWrapper((DictAttribute)_dictAttribute.clone());
	}

	@Override
	public int compareTo(
		org.oep.core.datamgt.dictionary.model.DictAttribute dictAttribute) {
		return _dictAttribute.compareTo(dictAttribute);
	}

	@Override
	public int hashCode() {
		return _dictAttribute.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.core.datamgt.dictionary.model.DictAttribute> toCacheModel() {
		return _dictAttribute.toCacheModel();
	}

	@Override
	public org.oep.core.datamgt.dictionary.model.DictAttribute toEscapedModel() {
		return new DictAttributeWrapper(_dictAttribute.toEscapedModel());
	}

	@Override
	public org.oep.core.datamgt.dictionary.model.DictAttribute toUnescapedModel() {
		return new DictAttributeWrapper(_dictAttribute.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dictAttribute.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dictAttribute.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dictAttribute.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DictAttributeWrapper)) {
			return false;
		}

		DictAttributeWrapper dictAttributeWrapper = (DictAttributeWrapper)obj;

		if (Validator.equals(_dictAttribute, dictAttributeWrapper._dictAttribute)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DictAttribute getWrappedDictAttribute() {
		return _dictAttribute;
	}

	@Override
	public DictAttribute getWrappedModel() {
		return _dictAttribute;
	}

	@Override
	public void resetOriginalValues() {
		_dictAttribute.resetOriginalValues();
	}

	private DictAttribute _dictAttribute;
}