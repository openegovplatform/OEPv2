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
 * This class is used by SOAP remote services, specifically {@link org.oep.datamgt.service.http.DictDataServiceSoap}.
 *
 * @author NQMINH
 * @see org.oep.datamgt.service.http.DictDataServiceSoap
 * @generated
 */
public class DictDataSoap implements Serializable {
	public static DictDataSoap toSoapModel(DictData model) {
		DictDataSoap soapModel = new DictDataSoap();

		soapModel.setDictDataId(model.getDictDataId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCollectionName(model.getCollectionName());
		soapModel.setDataCode(model.getDataCode());
		soapModel.setNode_1(model.getNode_1());
		soapModel.setNode_2(model.getNode_2());
		soapModel.setNode_3(model.getNode_3());
		soapModel.setNode_4(model.getNode_4());
		soapModel.setNode_5(model.getNode_5());
		soapModel.setDataLevel(model.getDataLevel());
		soapModel.setTitle(model.getTitle());
		soapModel.setDescription(model.getDescription());
		soapModel.setValidatedFrom(model.getValidatedFrom());
		soapModel.setValidatedTo(model.getValidatedTo());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static DictDataSoap[] toSoapModels(DictData[] models) {
		DictDataSoap[] soapModels = new DictDataSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DictDataSoap[][] toSoapModels(DictData[][] models) {
		DictDataSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DictDataSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DictDataSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DictDataSoap[] toSoapModels(List<DictData> models) {
		List<DictDataSoap> soapModels = new ArrayList<DictDataSoap>(models.size());

		for (DictData model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DictDataSoap[soapModels.size()]);
	}

	public DictDataSoap() {
	}

	public long getPrimaryKey() {
		return _dictDataId;
	}

	public void setPrimaryKey(long pk) {
		setDictDataId(pk);
	}

	public long getDictDataId() {
		return _dictDataId;
	}

	public void setDictDataId(long dictDataId) {
		_dictDataId = dictDataId;
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

	public String getDataCode() {
		return _dataCode;
	}

	public void setDataCode(String dataCode) {
		_dataCode = dataCode;
	}

	public String getNode_1() {
		return _node_1;
	}

	public void setNode_1(String node_1) {
		_node_1 = node_1;
	}

	public String getNode_2() {
		return _node_2;
	}

	public void setNode_2(String node_2) {
		_node_2 = node_2;
	}

	public String getNode_3() {
		return _node_3;
	}

	public void setNode_3(String node_3) {
		_node_3 = node_3;
	}

	public String getNode_4() {
		return _node_4;
	}

	public void setNode_4(String node_4) {
		_node_4 = node_4;
	}

	public String getNode_5() {
		return _node_5;
	}

	public void setNode_5(String node_5) {
		_node_5 = node_5;
	}

	public int getDataLevel() {
		return _dataLevel;
	}

	public void setDataLevel(int dataLevel) {
		_dataLevel = dataLevel;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public Date getValidatedFrom() {
		return _validatedFrom;
	}

	public void setValidatedFrom(Date validatedFrom) {
		_validatedFrom = validatedFrom;
	}

	public Date getValidatedTo() {
		return _validatedTo;
	}

	public void setValidatedTo(Date validatedTo) {
		_validatedTo = validatedTo;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	private long _dictDataId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _collectionName;
	private String _dataCode;
	private String _node_1;
	private String _node_2;
	private String _node_3;
	private String _node_4;
	private String _node_5;
	private int _dataLevel;
	private String _title;
	private String _description;
	private Date _validatedFrom;
	private Date _validatedTo;
	private int _status;
}