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

package org.oep.core.datamgt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DictCollection}.
 * </p>
 *
 * @author NQMINH
 * @see DictCollection
 * @generated
 */
public class DictCollectionWrapper implements DictCollection,
	ModelWrapper<DictCollection> {
	public DictCollectionWrapper(DictCollection dictCollection) {
		_dictCollection = dictCollection;
	}

	@Override
	public Class<?> getModelClass() {
		return DictCollection.class;
	}

	@Override
	public String getModelClassName() {
		return DictCollection.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dictCollectionId", getDictCollectionId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("version", getVersion());
		attributes.put("title", getTitle());
		attributes.put("validatedFrom", getValidatedFrom());
		attributes.put("validatedTo", getValidatedTo());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dictCollectionId = (Long)attributes.get("dictCollectionId");

		if (dictCollectionId != null) {
			setDictCollectionId(dictCollectionId);
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String version = (String)attributes.get("version");

		if (version != null) {
			setVersion(version);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		Date validatedFrom = (Date)attributes.get("validatedFrom");

		if (validatedFrom != null) {
			setValidatedFrom(validatedFrom);
		}

		Date validatedTo = (Date)attributes.get("validatedTo");

		if (validatedTo != null) {
			setValidatedTo(validatedTo);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	/**
	* Returns the primary key of this dictionary collection.
	*
	* @return the primary key of this dictionary collection
	*/
	@Override
	public long getPrimaryKey() {
		return _dictCollection.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dictionary collection.
	*
	* @param primaryKey the primary key of this dictionary collection
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dictCollection.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the dict collection ID of this dictionary collection.
	*
	* @return the dict collection ID of this dictionary collection
	*/
	@Override
	public long getDictCollectionId() {
		return _dictCollection.getDictCollectionId();
	}

	/**
	* Sets the dict collection ID of this dictionary collection.
	*
	* @param dictCollectionId the dict collection ID of this dictionary collection
	*/
	@Override
	public void setDictCollectionId(long dictCollectionId) {
		_dictCollection.setDictCollectionId(dictCollectionId);
	}

	/**
	* Returns the company ID of this dictionary collection.
	*
	* @return the company ID of this dictionary collection
	*/
	@Override
	public long getCompanyId() {
		return _dictCollection.getCompanyId();
	}

	/**
	* Sets the company ID of this dictionary collection.
	*
	* @param companyId the company ID of this dictionary collection
	*/
	@Override
	public void setCompanyId(long companyId) {
		_dictCollection.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this dictionary collection.
	*
	* @return the group ID of this dictionary collection
	*/
	@Override
	public long getGroupId() {
		return _dictCollection.getGroupId();
	}

	/**
	* Sets the group ID of this dictionary collection.
	*
	* @param groupId the group ID of this dictionary collection
	*/
	@Override
	public void setGroupId(long groupId) {
		_dictCollection.setGroupId(groupId);
	}

	/**
	* Returns the user ID of this dictionary collection.
	*
	* @return the user ID of this dictionary collection
	*/
	@Override
	public long getUserId() {
		return _dictCollection.getUserId();
	}

	/**
	* Sets the user ID of this dictionary collection.
	*
	* @param userId the user ID of this dictionary collection
	*/
	@Override
	public void setUserId(long userId) {
		_dictCollection.setUserId(userId);
	}

	/**
	* Returns the user uuid of this dictionary collection.
	*
	* @return the user uuid of this dictionary collection
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollection.getUserUuid();
	}

	/**
	* Sets the user uuid of this dictionary collection.
	*
	* @param userUuid the user uuid of this dictionary collection
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_dictCollection.setUserUuid(userUuid);
	}

	/**
	* Returns the create date of this dictionary collection.
	*
	* @return the create date of this dictionary collection
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _dictCollection.getCreateDate();
	}

	/**
	* Sets the create date of this dictionary collection.
	*
	* @param createDate the create date of this dictionary collection
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_dictCollection.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this dictionary collection.
	*
	* @return the modified date of this dictionary collection
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dictCollection.getModifiedDate();
	}

	/**
	* Sets the modified date of this dictionary collection.
	*
	* @param modifiedDate the modified date of this dictionary collection
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dictCollection.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the name of this dictionary collection.
	*
	* @return the name of this dictionary collection
	*/
	@Override
	public java.lang.String getName() {
		return _dictCollection.getName();
	}

	/**
	* Sets the name of this dictionary collection.
	*
	* @param name the name of this dictionary collection
	*/
	@Override
	public void setName(java.lang.String name) {
		_dictCollection.setName(name);
	}

	/**
	* Returns the version of this dictionary collection.
	*
	* @return the version of this dictionary collection
	*/
	@Override
	public java.lang.String getVersion() {
		return _dictCollection.getVersion();
	}

	/**
	* Sets the version of this dictionary collection.
	*
	* @param version the version of this dictionary collection
	*/
	@Override
	public void setVersion(java.lang.String version) {
		_dictCollection.setVersion(version);
	}

	/**
	* Returns the title of this dictionary collection.
	*
	* @return the title of this dictionary collection
	*/
	@Override
	public java.lang.String getTitle() {
		return _dictCollection.getTitle();
	}

	/**
	* Sets the title of this dictionary collection.
	*
	* @param title the title of this dictionary collection
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_dictCollection.setTitle(title);
	}

	/**
	* Returns the validated from of this dictionary collection.
	*
	* @return the validated from of this dictionary collection
	*/
	@Override
	public java.util.Date getValidatedFrom() {
		return _dictCollection.getValidatedFrom();
	}

	/**
	* Sets the validated from of this dictionary collection.
	*
	* @param validatedFrom the validated from of this dictionary collection
	*/
	@Override
	public void setValidatedFrom(java.util.Date validatedFrom) {
		_dictCollection.setValidatedFrom(validatedFrom);
	}

	/**
	* Returns the validated to of this dictionary collection.
	*
	* @return the validated to of this dictionary collection
	*/
	@Override
	public java.util.Date getValidatedTo() {
		return _dictCollection.getValidatedTo();
	}

	/**
	* Sets the validated to of this dictionary collection.
	*
	* @param validatedTo the validated to of this dictionary collection
	*/
	@Override
	public void setValidatedTo(java.util.Date validatedTo) {
		_dictCollection.setValidatedTo(validatedTo);
	}

	/**
	* Returns the status of this dictionary collection.
	*
	* @return the status of this dictionary collection
	*/
	@Override
	public int getStatus() {
		return _dictCollection.getStatus();
	}

	/**
	* Sets the status of this dictionary collection.
	*
	* @param status the status of this dictionary collection
	*/
	@Override
	public void setStatus(int status) {
		_dictCollection.setStatus(status);
	}

	@Override
	public boolean isNew() {
		return _dictCollection.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dictCollection.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dictCollection.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dictCollection.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dictCollection.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dictCollection.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dictCollection.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dictCollection.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dictCollection.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dictCollection.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dictCollection.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DictCollectionWrapper((DictCollection)_dictCollection.clone());
	}

	@Override
	public int compareTo(
		org.oep.core.datamgt.model.DictCollection dictCollection) {
		return _dictCollection.compareTo(dictCollection);
	}

	@Override
	public int hashCode() {
		return _dictCollection.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.core.datamgt.model.DictCollection> toCacheModel() {
		return _dictCollection.toCacheModel();
	}

	@Override
	public org.oep.core.datamgt.model.DictCollection toEscapedModel() {
		return new DictCollectionWrapper(_dictCollection.toEscapedModel());
	}

	@Override
	public org.oep.core.datamgt.model.DictCollection toUnescapedModel() {
		return new DictCollectionWrapper(_dictCollection.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dictCollection.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dictCollection.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dictCollection.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DictCollectionWrapper)) {
			return false;
		}

		DictCollectionWrapper dictCollectionWrapper = (DictCollectionWrapper)obj;

		if (Validator.equals(_dictCollection,
					dictCollectionWrapper._dictCollection)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DictCollection getWrappedDictCollection() {
		return _dictCollection;
	}

	@Override
	public DictCollection getWrappedModel() {
		return _dictCollection;
	}

	@Override
	public void resetOriginalValues() {
		_dictCollection.resetOriginalValues();
	}

	private DictCollection _dictCollection;
}