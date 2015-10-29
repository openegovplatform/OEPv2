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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.oep.core.datamgt.service.http.DictMetaDataServiceSoap}.
 *
 * @author NQMINH
 * @see org.oep.core.datamgt.service.http.DictMetaDataServiceSoap
 * @generated
 */
public class DictMetaDataSoap implements Serializable {
	public static DictMetaDataSoap toSoapModel(DictMetaData model) {
		DictMetaDataSoap soapModel = new DictMetaDataSoap();

		soapModel.setDictMetaDataId(model.getDictMetaDataId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDictDataId(model.getDictDataId());
		soapModel.setAttributeName(model.getAttributeName());
		soapModel.setAttributeValue(model.getAttributeValue());

		return soapModel;
	}

	public static DictMetaDataSoap[] toSoapModels(DictMetaData[] models) {
		DictMetaDataSoap[] soapModels = new DictMetaDataSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DictMetaDataSoap[][] toSoapModels(DictMetaData[][] models) {
		DictMetaDataSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DictMetaDataSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DictMetaDataSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DictMetaDataSoap[] toSoapModels(List<DictMetaData> models) {
		List<DictMetaDataSoap> soapModels = new ArrayList<DictMetaDataSoap>(models.size());

		for (DictMetaData model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DictMetaDataSoap[soapModels.size()]);
	}

	public DictMetaDataSoap() {
	}

	public long getPrimaryKey() {
		return _dictMetaDataId;
	}

	public void setPrimaryKey(long pk) {
		setDictMetaDataId(pk);
	}

	public long getDictMetaDataId() {
		return _dictMetaDataId;
	}

	public void setDictMetaDataId(long dictMetaDataId) {
		_dictMetaDataId = dictMetaDataId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getDictDataId() {
		return _dictDataId;
	}

	public void setDictDataId(long dictDataId) {
		_dictDataId = dictDataId;
	}

	public String getAttributeName() {
		return _attributeName;
	}

	public void setAttributeName(String attributeName) {
		_attributeName = attributeName;
	}

	public String getAttributeValue() {
		return _attributeValue;
	}

	public void setAttributeValue(String attributeValue) {
		_attributeValue = attributeValue;
	}

	private long _dictMetaDataId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _dictDataId;
	private String _attributeName;
	private String _attributeValue;
}