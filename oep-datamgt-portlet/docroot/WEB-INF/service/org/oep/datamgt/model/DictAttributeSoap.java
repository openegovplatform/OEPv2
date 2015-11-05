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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.oep.datamgt.service.http.DictAttributeServiceSoap}.
 *
 * @author NQMINH
 * @see org.oep.datamgt.service.http.DictAttributeServiceSoap
 * @generated
 */
public class DictAttributeSoap implements Serializable {
	public static DictAttributeSoap toSoapModel(DictAttribute model) {
		DictAttributeSoap soapModel = new DictAttributeSoap();

		soapModel.setDictAttributeId(model.getDictAttributeId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCollectionName(model.getCollectionName());
		soapModel.setName(model.getName());
		soapModel.setTitle(model.getTitle());
		soapModel.setDataType(model.getDataType());

		return soapModel;
	}

	public static DictAttributeSoap[] toSoapModels(DictAttribute[] models) {
		DictAttributeSoap[] soapModels = new DictAttributeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DictAttributeSoap[][] toSoapModels(DictAttribute[][] models) {
		DictAttributeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DictAttributeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DictAttributeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DictAttributeSoap[] toSoapModels(List<DictAttribute> models) {
		List<DictAttributeSoap> soapModels = new ArrayList<DictAttributeSoap>(models.size());

		for (DictAttribute model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DictAttributeSoap[soapModels.size()]);
	}

	public DictAttributeSoap() {
	}

	public long getPrimaryKey() {
		return _dictAttributeId;
	}

	public void setPrimaryKey(long pk) {
		setDictAttributeId(pk);
	}

	public long getDictAttributeId() {
		return _dictAttributeId;
	}

	public void setDictAttributeId(long dictAttributeId) {
		_dictAttributeId = dictAttributeId;
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

	public String getCollectionName() {
		return _collectionName;
	}

	public void setCollectionName(String collectionName) {
		_collectionName = collectionName;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getDataType() {
		return _dataType;
	}

	public void setDataType(String dataType) {
		_dataType = dataType;
	}

	private long _dictAttributeId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _collectionName;
	private String _name;
	private String _title;
	private String _dataType;
}