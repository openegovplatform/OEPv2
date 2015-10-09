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
 * This class is a wrapper for {@link DictMetaData}.
 * </p>
 *
 * @author TrungDK
 * @see DictMetaData
 * @generated
 */
public class DictMetaDataWrapper implements DictMetaData,
	ModelWrapper<DictMetaData> {
	public DictMetaDataWrapper(DictMetaData dictMetaData) {
		_dictMetaData = dictMetaData;
	}

	@Override
	public Class<?> getModelClass() {
		return DictMetaData.class;
	}

	@Override
	public String getModelClassName() {
		return DictMetaData.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dictMetaDataId", getDictMetaDataId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dictDataId", getDictDataId());
		attributes.put("attributeName", getAttributeName());
		attributes.put("attributeValue", getAttributeValue());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dictMetaDataId = (Long)attributes.get("dictMetaDataId");

		if (dictMetaDataId != null) {
			setDictMetaDataId(dictMetaDataId);
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

		Long dictDataId = (Long)attributes.get("dictDataId");

		if (dictDataId != null) {
			setDictDataId(dictDataId);
		}

		String attributeName = (String)attributes.get("attributeName");

		if (attributeName != null) {
			setAttributeName(attributeName);
		}

		String attributeValue = (String)attributes.get("attributeValue");

		if (attributeValue != null) {
			setAttributeValue(attributeValue);
		}
	}

	/**
	* Returns the primary key of this dictionary meta data.
	*
	* @return the primary key of this dictionary meta data
	*/
	@Override
	public long getPrimaryKey() {
		return _dictMetaData.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dictionary meta data.
	*
	* @param primaryKey the primary key of this dictionary meta data
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dictMetaData.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the dict meta data ID of this dictionary meta data.
	*
	* @return the dict meta data ID of this dictionary meta data
	*/
	@Override
	public long getDictMetaDataId() {
		return _dictMetaData.getDictMetaDataId();
	}

	/**
	* Sets the dict meta data ID of this dictionary meta data.
	*
	* @param dictMetaDataId the dict meta data ID of this dictionary meta data
	*/
	@Override
	public void setDictMetaDataId(long dictMetaDataId) {
		_dictMetaData.setDictMetaDataId(dictMetaDataId);
	}

	/**
	* Returns the company ID of this dictionary meta data.
	*
	* @return the company ID of this dictionary meta data
	*/
	@Override
	public long getCompanyId() {
		return _dictMetaData.getCompanyId();
	}

	/**
	* Sets the company ID of this dictionary meta data.
	*
	* @param companyId the company ID of this dictionary meta data
	*/
	@Override
	public void setCompanyId(long companyId) {
		_dictMetaData.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this dictionary meta data.
	*
	* @return the create date of this dictionary meta data
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _dictMetaData.getCreateDate();
	}

	/**
	* Sets the create date of this dictionary meta data.
	*
	* @param createDate the create date of this dictionary meta data
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_dictMetaData.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this dictionary meta data.
	*
	* @return the modified date of this dictionary meta data
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dictMetaData.getModifiedDate();
	}

	/**
	* Sets the modified date of this dictionary meta data.
	*
	* @param modifiedDate the modified date of this dictionary meta data
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dictMetaData.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the dict data ID of this dictionary meta data.
	*
	* @return the dict data ID of this dictionary meta data
	*/
	@Override
	public long getDictDataId() {
		return _dictMetaData.getDictDataId();
	}

	/**
	* Sets the dict data ID of this dictionary meta data.
	*
	* @param dictDataId the dict data ID of this dictionary meta data
	*/
	@Override
	public void setDictDataId(long dictDataId) {
		_dictMetaData.setDictDataId(dictDataId);
	}

	/**
	* Returns the attribute name of this dictionary meta data.
	*
	* @return the attribute name of this dictionary meta data
	*/
	@Override
	public java.lang.String getAttributeName() {
		return _dictMetaData.getAttributeName();
	}

	/**
	* Sets the attribute name of this dictionary meta data.
	*
	* @param attributeName the attribute name of this dictionary meta data
	*/
	@Override
	public void setAttributeName(java.lang.String attributeName) {
		_dictMetaData.setAttributeName(attributeName);
	}

	/**
	* Returns the attribute value of this dictionary meta data.
	*
	* @return the attribute value of this dictionary meta data
	*/
	@Override
	public java.lang.String getAttributeValue() {
		return _dictMetaData.getAttributeValue();
	}

	/**
	* Sets the attribute value of this dictionary meta data.
	*
	* @param attributeValue the attribute value of this dictionary meta data
	*/
	@Override
	public void setAttributeValue(java.lang.String attributeValue) {
		_dictMetaData.setAttributeValue(attributeValue);
	}

	@Override
	public boolean isNew() {
		return _dictMetaData.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dictMetaData.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dictMetaData.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dictMetaData.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dictMetaData.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dictMetaData.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dictMetaData.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dictMetaData.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dictMetaData.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dictMetaData.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dictMetaData.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DictMetaDataWrapper((DictMetaData)_dictMetaData.clone());
	}

	@Override
	public int compareTo(
		org.oep.core.datamgt.dictionary.model.DictMetaData dictMetaData) {
		return _dictMetaData.compareTo(dictMetaData);
	}

	@Override
	public int hashCode() {
		return _dictMetaData.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.core.datamgt.dictionary.model.DictMetaData> toCacheModel() {
		return _dictMetaData.toCacheModel();
	}

	@Override
	public org.oep.core.datamgt.dictionary.model.DictMetaData toEscapedModel() {
		return new DictMetaDataWrapper(_dictMetaData.toEscapedModel());
	}

	@Override
	public org.oep.core.datamgt.dictionary.model.DictMetaData toUnescapedModel() {
		return new DictMetaDataWrapper(_dictMetaData.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dictMetaData.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dictMetaData.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dictMetaData.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DictMetaDataWrapper)) {
			return false;
		}

		DictMetaDataWrapper dictMetaDataWrapper = (DictMetaDataWrapper)obj;

		if (Validator.equals(_dictMetaData, dictMetaDataWrapper._dictMetaData)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DictMetaData getWrappedDictMetaData() {
		return _dictMetaData;
	}

	@Override
	public DictMetaData getWrappedModel() {
		return _dictMetaData;
	}

	@Override
	public void resetOriginalValues() {
		_dictMetaData.resetOriginalValues();
	}

	private DictMetaData _dictMetaData;
}