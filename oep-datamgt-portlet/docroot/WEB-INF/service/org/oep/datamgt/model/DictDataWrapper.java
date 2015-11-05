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

package org.oep.datamgt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DictData}.
 * </p>
 *
 * @author NQMINH
 * @see DictData
 * @generated
 */
public class DictDataWrapper implements DictData, ModelWrapper<DictData> {
	public DictDataWrapper(DictData dictData) {
		_dictData = dictData;
	}

	@Override
	public Class<?> getModelClass() {
		return DictData.class;
	}

	@Override
	public String getModelClassName() {
		return DictData.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dictDataId", getDictDataId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("collectionName", getCollectionName());
		attributes.put("dataCode", getDataCode());
		attributes.put("node_1", getNode_1());
		attributes.put("node_2", getNode_2());
		attributes.put("node_3", getNode_3());
		attributes.put("node_4", getNode_4());
		attributes.put("node_5", getNode_5());
		attributes.put("dataLevel", getDataLevel());
		attributes.put("title", getTitle());
		attributes.put("description", getDescription());
		attributes.put("validatedFrom", getValidatedFrom());
		attributes.put("validatedTo", getValidatedTo());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dictDataId = (Long)attributes.get("dictDataId");

		if (dictDataId != null) {
			setDictDataId(dictDataId);
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

		String collectionName = (String)attributes.get("collectionName");

		if (collectionName != null) {
			setCollectionName(collectionName);
		}

		String dataCode = (String)attributes.get("dataCode");

		if (dataCode != null) {
			setDataCode(dataCode);
		}

		String node_1 = (String)attributes.get("node_1");

		if (node_1 != null) {
			setNode_1(node_1);
		}

		String node_2 = (String)attributes.get("node_2");

		if (node_2 != null) {
			setNode_2(node_2);
		}

		String node_3 = (String)attributes.get("node_3");

		if (node_3 != null) {
			setNode_3(node_3);
		}

		String node_4 = (String)attributes.get("node_4");

		if (node_4 != null) {
			setNode_4(node_4);
		}

		String node_5 = (String)attributes.get("node_5");

		if (node_5 != null) {
			setNode_5(node_5);
		}

		Integer dataLevel = (Integer)attributes.get("dataLevel");

		if (dataLevel != null) {
			setDataLevel(dataLevel);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
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
	* Returns the primary key of this dictionary data.
	*
	* @return the primary key of this dictionary data
	*/
	@Override
	public long getPrimaryKey() {
		return _dictData.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dictionary data.
	*
	* @param primaryKey the primary key of this dictionary data
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dictData.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the dict data ID of this dictionary data.
	*
	* @return the dict data ID of this dictionary data
	*/
	@Override
	public long getDictDataId() {
		return _dictData.getDictDataId();
	}

	/**
	* Sets the dict data ID of this dictionary data.
	*
	* @param dictDataId the dict data ID of this dictionary data
	*/
	@Override
	public void setDictDataId(long dictDataId) {
		_dictData.setDictDataId(dictDataId);
	}

	/**
	* Returns the company ID of this dictionary data.
	*
	* @return the company ID of this dictionary data
	*/
	@Override
	public long getCompanyId() {
		return _dictData.getCompanyId();
	}

	/**
	* Sets the company ID of this dictionary data.
	*
	* @param companyId the company ID of this dictionary data
	*/
	@Override
	public void setCompanyId(long companyId) {
		_dictData.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this dictionary data.
	*
	* @return the group ID of this dictionary data
	*/
	@Override
	public long getGroupId() {
		return _dictData.getGroupId();
	}

	/**
	* Sets the group ID of this dictionary data.
	*
	* @param groupId the group ID of this dictionary data
	*/
	@Override
	public void setGroupId(long groupId) {
		_dictData.setGroupId(groupId);
	}

	/**
	* Returns the user ID of this dictionary data.
	*
	* @return the user ID of this dictionary data
	*/
	@Override
	public long getUserId() {
		return _dictData.getUserId();
	}

	/**
	* Sets the user ID of this dictionary data.
	*
	* @param userId the user ID of this dictionary data
	*/
	@Override
	public void setUserId(long userId) {
		_dictData.setUserId(userId);
	}

	/**
	* Returns the user uuid of this dictionary data.
	*
	* @return the user uuid of this dictionary data
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictData.getUserUuid();
	}

	/**
	* Sets the user uuid of this dictionary data.
	*
	* @param userUuid the user uuid of this dictionary data
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_dictData.setUserUuid(userUuid);
	}

	/**
	* Returns the create date of this dictionary data.
	*
	* @return the create date of this dictionary data
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _dictData.getCreateDate();
	}

	/**
	* Sets the create date of this dictionary data.
	*
	* @param createDate the create date of this dictionary data
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_dictData.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this dictionary data.
	*
	* @return the modified date of this dictionary data
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dictData.getModifiedDate();
	}

	/**
	* Sets the modified date of this dictionary data.
	*
	* @param modifiedDate the modified date of this dictionary data
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dictData.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the collection name of this dictionary data.
	*
	* @return the collection name of this dictionary data
	*/
	@Override
	public java.lang.String getCollectionName() {
		return _dictData.getCollectionName();
	}

	/**
	* Sets the collection name of this dictionary data.
	*
	* @param collectionName the collection name of this dictionary data
	*/
	@Override
	public void setCollectionName(java.lang.String collectionName) {
		_dictData.setCollectionName(collectionName);
	}

	/**
	* Returns the data code of this dictionary data.
	*
	* @return the data code of this dictionary data
	*/
	@Override
	public java.lang.String getDataCode() {
		return _dictData.getDataCode();
	}

	/**
	* Sets the data code of this dictionary data.
	*
	* @param dataCode the data code of this dictionary data
	*/
	@Override
	public void setDataCode(java.lang.String dataCode) {
		_dictData.setDataCode(dataCode);
	}

	/**
	* Returns the node_1 of this dictionary data.
	*
	* @return the node_1 of this dictionary data
	*/
	@Override
	public java.lang.String getNode_1() {
		return _dictData.getNode_1();
	}

	/**
	* Sets the node_1 of this dictionary data.
	*
	* @param node_1 the node_1 of this dictionary data
	*/
	@Override
	public void setNode_1(java.lang.String node_1) {
		_dictData.setNode_1(node_1);
	}

	/**
	* Returns the node_2 of this dictionary data.
	*
	* @return the node_2 of this dictionary data
	*/
	@Override
	public java.lang.String getNode_2() {
		return _dictData.getNode_2();
	}

	/**
	* Sets the node_2 of this dictionary data.
	*
	* @param node_2 the node_2 of this dictionary data
	*/
	@Override
	public void setNode_2(java.lang.String node_2) {
		_dictData.setNode_2(node_2);
	}

	/**
	* Returns the node_3 of this dictionary data.
	*
	* @return the node_3 of this dictionary data
	*/
	@Override
	public java.lang.String getNode_3() {
		return _dictData.getNode_3();
	}

	/**
	* Sets the node_3 of this dictionary data.
	*
	* @param node_3 the node_3 of this dictionary data
	*/
	@Override
	public void setNode_3(java.lang.String node_3) {
		_dictData.setNode_3(node_3);
	}

	/**
	* Returns the node_4 of this dictionary data.
	*
	* @return the node_4 of this dictionary data
	*/
	@Override
	public java.lang.String getNode_4() {
		return _dictData.getNode_4();
	}

	/**
	* Sets the node_4 of this dictionary data.
	*
	* @param node_4 the node_4 of this dictionary data
	*/
	@Override
	public void setNode_4(java.lang.String node_4) {
		_dictData.setNode_4(node_4);
	}

	/**
	* Returns the node_5 of this dictionary data.
	*
	* @return the node_5 of this dictionary data
	*/
	@Override
	public java.lang.String getNode_5() {
		return _dictData.getNode_5();
	}

	/**
	* Sets the node_5 of this dictionary data.
	*
	* @param node_5 the node_5 of this dictionary data
	*/
	@Override
	public void setNode_5(java.lang.String node_5) {
		_dictData.setNode_5(node_5);
	}

	/**
	* Returns the data level of this dictionary data.
	*
	* @return the data level of this dictionary data
	*/
	@Override
	public int getDataLevel() {
		return _dictData.getDataLevel();
	}

	/**
	* Sets the data level of this dictionary data.
	*
	* @param dataLevel the data level of this dictionary data
	*/
	@Override
	public void setDataLevel(int dataLevel) {
		_dictData.setDataLevel(dataLevel);
	}

	/**
	* Returns the title of this dictionary data.
	*
	* @return the title of this dictionary data
	*/
	@Override
	public java.lang.String getTitle() {
		return _dictData.getTitle();
	}

	/**
	* Sets the title of this dictionary data.
	*
	* @param title the title of this dictionary data
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_dictData.setTitle(title);
	}

	/**
	* Returns the description of this dictionary data.
	*
	* @return the description of this dictionary data
	*/
	@Override
	public java.lang.String getDescription() {
		return _dictData.getDescription();
	}

	/**
	* Sets the description of this dictionary data.
	*
	* @param description the description of this dictionary data
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_dictData.setDescription(description);
	}

	/**
	* Returns the validated from of this dictionary data.
	*
	* @return the validated from of this dictionary data
	*/
	@Override
	public java.util.Date getValidatedFrom() {
		return _dictData.getValidatedFrom();
	}

	/**
	* Sets the validated from of this dictionary data.
	*
	* @param validatedFrom the validated from of this dictionary data
	*/
	@Override
	public void setValidatedFrom(java.util.Date validatedFrom) {
		_dictData.setValidatedFrom(validatedFrom);
	}

	/**
	* Returns the validated to of this dictionary data.
	*
	* @return the validated to of this dictionary data
	*/
	@Override
	public java.util.Date getValidatedTo() {
		return _dictData.getValidatedTo();
	}

	/**
	* Sets the validated to of this dictionary data.
	*
	* @param validatedTo the validated to of this dictionary data
	*/
	@Override
	public void setValidatedTo(java.util.Date validatedTo) {
		_dictData.setValidatedTo(validatedTo);
	}

	/**
	* Returns the status of this dictionary data.
	*
	* @return the status of this dictionary data
	*/
	@Override
	public int getStatus() {
		return _dictData.getStatus();
	}

	/**
	* Sets the status of this dictionary data.
	*
	* @param status the status of this dictionary data
	*/
	@Override
	public void setStatus(int status) {
		_dictData.setStatus(status);
	}

	@Override
	public boolean isNew() {
		return _dictData.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dictData.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dictData.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dictData.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dictData.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dictData.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dictData.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dictData.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dictData.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dictData.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dictData.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DictDataWrapper((DictData)_dictData.clone());
	}

	@Override
	public int compareTo(org.oep.datamgt.model.DictData dictData) {
		return _dictData.compareTo(dictData);
	}

	@Override
	public int hashCode() {
		return _dictData.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.datamgt.model.DictData> toCacheModel() {
		return _dictData.toCacheModel();
	}

	@Override
	public org.oep.datamgt.model.DictData toEscapedModel() {
		return new DictDataWrapper(_dictData.toEscapedModel());
	}

	@Override
	public org.oep.datamgt.model.DictData toUnescapedModel() {
		return new DictDataWrapper(_dictData.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dictData.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dictData.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dictData.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DictDataWrapper)) {
			return false;
		}

		DictDataWrapper dictDataWrapper = (DictDataWrapper)obj;

		if (Validator.equals(_dictData, dictDataWrapper._dictData)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DictData getWrappedDictData() {
		return _dictData;
	}

	@Override
	public DictData getWrappedModel() {
		return _dictData;
	}

	@Override
	public void resetOriginalValues() {
		_dictData.resetOriginalValues();
	}

	private DictData _dictData;
}