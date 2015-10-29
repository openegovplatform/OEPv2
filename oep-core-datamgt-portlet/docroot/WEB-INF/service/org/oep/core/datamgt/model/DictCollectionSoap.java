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
 * This class is used by SOAP remote services, specifically {@link org.oep.core.datamgt.service.http.DictCollectionServiceSoap}.
 *
 * @author NQMINH
 * @see org.oep.core.datamgt.service.http.DictCollectionServiceSoap
 * @generated
 */
public class DictCollectionSoap implements Serializable {
	public static DictCollectionSoap toSoapModel(DictCollection model) {
		DictCollectionSoap soapModel = new DictCollectionSoap();

		soapModel.setDictCollectionId(model.getDictCollectionId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setVersion(model.getVersion());
		soapModel.setTitle(model.getTitle());
		soapModel.setValidatedFrom(model.getValidatedFrom());
		soapModel.setValidatedTo(model.getValidatedTo());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static DictCollectionSoap[] toSoapModels(DictCollection[] models) {
		DictCollectionSoap[] soapModels = new DictCollectionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DictCollectionSoap[][] toSoapModels(DictCollection[][] models) {
		DictCollectionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DictCollectionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DictCollectionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DictCollectionSoap[] toSoapModels(List<DictCollection> models) {
		List<DictCollectionSoap> soapModels = new ArrayList<DictCollectionSoap>(models.size());

		for (DictCollection model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DictCollectionSoap[soapModels.size()]);
	}

	public DictCollectionSoap() {
	}

	public long getPrimaryKey() {
		return _dictCollectionId;
	}

	public void setPrimaryKey(long pk) {
		setDictCollectionId(pk);
	}

	public long getDictCollectionId() {
		return _dictCollectionId;
	}

	public void setDictCollectionId(long dictCollectionId) {
		_dictCollectionId = dictCollectionId;
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

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getVersion() {
		return _version;
	}

	public void setVersion(String version) {
		_version = version;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
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

	private long _dictCollectionId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _version;
	private String _title;
	private Date _validatedFrom;
	private Date _validatedTo;
	private int _status;
}