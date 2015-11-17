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

package org.oep.ssomgt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.oep.ssomgt.service.http.AppRoleServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.ssomgt.service.http.AppRoleServiceSoap
 * @generated
 */
public class AppRoleSoap implements Serializable {
	public static AppRoleSoap toSoapModel(AppRole model) {
		AppRoleSoap soapModel = new AppRoleSoap();

		soapModel.setAppRoleId(model.getAppRoleId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setApplicationId(model.getApplicationId());
		soapModel.setRoleCode(model.getRoleCode());
		soapModel.setRoleName(model.getRoleName());

		return soapModel;
	}

	public static AppRoleSoap[] toSoapModels(AppRole[] models) {
		AppRoleSoap[] soapModels = new AppRoleSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AppRoleSoap[][] toSoapModels(AppRole[][] models) {
		AppRoleSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AppRoleSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AppRoleSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AppRoleSoap[] toSoapModels(List<AppRole> models) {
		List<AppRoleSoap> soapModels = new ArrayList<AppRoleSoap>(models.size());

		for (AppRole model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AppRoleSoap[soapModels.size()]);
	}

	public AppRoleSoap() {
	}

	public long getPrimaryKey() {
		return _appRoleId;
	}

	public void setPrimaryKey(long pk) {
		setAppRoleId(pk);
	}

	public long getAppRoleId() {
		return _appRoleId;
	}

	public void setAppRoleId(long appRoleId) {
		_appRoleId = appRoleId;
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

	public long getApplicationId() {
		return _applicationId;
	}

	public void setApplicationId(long applicationId) {
		_applicationId = applicationId;
	}

	public String getRoleCode() {
		return _roleCode;
	}

	public void setRoleCode(String roleCode) {
		_roleCode = roleCode;
	}

	public String getRoleName() {
		return _roleName;
	}

	public void setRoleName(String roleName) {
		_roleName = roleName;
	}

	private long _appRoleId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private long _applicationId;
	private String _roleCode;
	private String _roleName;
}