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

package org.oep.core.ssomgt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.oep.core.ssomgt.service.http.AppRole2EmployeeServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.core.ssomgt.service.http.AppRole2EmployeeServiceSoap
 * @generated
 */
public class AppRole2EmployeeSoap implements Serializable {
	public static AppRole2EmployeeSoap toSoapModel(AppRole2Employee model) {
		AppRole2EmployeeSoap soapModel = new AppRole2EmployeeSoap();

		soapModel.setAppRole2EmployeeId(model.getAppRole2EmployeeId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setAppRoleId(model.getAppRoleId());
		soapModel.setEmployeeId(model.getEmployeeId());

		return soapModel;
	}

	public static AppRole2EmployeeSoap[] toSoapModels(AppRole2Employee[] models) {
		AppRole2EmployeeSoap[] soapModels = new AppRole2EmployeeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AppRole2EmployeeSoap[][] toSoapModels(
		AppRole2Employee[][] models) {
		AppRole2EmployeeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AppRole2EmployeeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AppRole2EmployeeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AppRole2EmployeeSoap[] toSoapModels(
		List<AppRole2Employee> models) {
		List<AppRole2EmployeeSoap> soapModels = new ArrayList<AppRole2EmployeeSoap>(models.size());

		for (AppRole2Employee model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AppRole2EmployeeSoap[soapModels.size()]);
	}

	public AppRole2EmployeeSoap() {
	}

	public long getPrimaryKey() {
		return _appRole2EmployeeId;
	}

	public void setPrimaryKey(long pk) {
		setAppRole2EmployeeId(pk);
	}

	public long getAppRole2EmployeeId() {
		return _appRole2EmployeeId;
	}

	public void setAppRole2EmployeeId(long appRole2EmployeeId) {
		_appRole2EmployeeId = appRole2EmployeeId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public long getAppRoleId() {
		return _appRoleId;
	}

	public void setAppRoleId(long appRoleId) {
		_appRoleId = appRoleId;
	}

	public long getEmployeeId() {
		return _employeeId;
	}

	public void setEmployeeId(long employeeId) {
		_employeeId = employeeId;
	}

	private long _appRole2EmployeeId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private long _appRoleId;
	private long _employeeId;
}