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

package org.oep.usermgt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.oep.usermgt.service.http.DelegacyServiceSoap}.
 *
 * @author NQMINH
 * @see org.oep.usermgt.service.http.DelegacyServiceSoap
 * @generated
 */
public class DelegacySoap implements Serializable {
	public static DelegacySoap toSoapModel(Delegacy model) {
		DelegacySoap soapModel = new DelegacySoap();

		soapModel.setDelegacyId(model.getDelegacyId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setFromEmployeeId(model.getFromEmployeeId());
		soapModel.setToEmployeeId(model.getToEmployeeId());
		soapModel.setRoleId(model.getRoleId());

		return soapModel;
	}

	public static DelegacySoap[] toSoapModels(Delegacy[] models) {
		DelegacySoap[] soapModels = new DelegacySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DelegacySoap[][] toSoapModels(Delegacy[][] models) {
		DelegacySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DelegacySoap[models.length][models[0].length];
		}
		else {
			soapModels = new DelegacySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DelegacySoap[] toSoapModels(List<Delegacy> models) {
		List<DelegacySoap> soapModels = new ArrayList<DelegacySoap>(models.size());

		for (Delegacy model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DelegacySoap[soapModels.size()]);
	}

	public DelegacySoap() {
	}

	public long getPrimaryKey() {
		return _delegacyId;
	}

	public void setPrimaryKey(long pk) {
		setDelegacyId(pk);
	}

	public long getDelegacyId() {
		return _delegacyId;
	}

	public void setDelegacyId(long delegacyId) {
		_delegacyId = delegacyId;
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

	public long getFromEmployeeId() {
		return _fromEmployeeId;
	}

	public void setFromEmployeeId(long fromEmployeeId) {
		_fromEmployeeId = fromEmployeeId;
	}

	public long getToEmployeeId() {
		return _toEmployeeId;
	}

	public void setToEmployeeId(long toEmployeeId) {
		_toEmployeeId = toEmployeeId;
	}

	public long getRoleId() {
		return _roleId;
	}

	public void setRoleId(long roleId) {
		_roleId = roleId;
	}

	private long _delegacyId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private Date _createDate;
	private long _fromEmployeeId;
	private long _toEmployeeId;
	private long _roleId;
}