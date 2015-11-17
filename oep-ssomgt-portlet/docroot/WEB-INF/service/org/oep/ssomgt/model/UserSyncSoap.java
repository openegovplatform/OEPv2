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
 * This class is used by SOAP remote services, specifically {@link org.oep.ssomgt.service.http.UserSyncServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.ssomgt.service.http.UserSyncServiceSoap
 * @generated
 */
public class UserSyncSoap implements Serializable {
	public static UserSyncSoap toSoapModel(UserSync model) {
		UserSyncSoap soapModel = new UserSyncSoap();

		soapModel.setUserSyncId(model.getUserSyncId());
		soapModel.setApplicationId(model.getApplicationId());
		soapModel.setEmployeeId(model.getEmployeeId());
		soapModel.setUserId(model.getUserId());
		soapModel.setSsoUserName(model.getSsoUserName());
		soapModel.setAppUserName(model.getAppUserName());
		soapModel.setFullName(model.getFullName());
		soapModel.setEmail(model.getEmail());
		soapModel.setPassword(model.getPassword());
		soapModel.setAccessibleStatus(model.getAccessibleStatus());
		soapModel.setRoles(model.getRoles());
		soapModel.setCheckpoint(model.getCheckpoint());
		soapModel.setSyncTime(model.getSyncTime());

		return soapModel;
	}

	public static UserSyncSoap[] toSoapModels(UserSync[] models) {
		UserSyncSoap[] soapModels = new UserSyncSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UserSyncSoap[][] toSoapModels(UserSync[][] models) {
		UserSyncSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UserSyncSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UserSyncSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UserSyncSoap[] toSoapModels(List<UserSync> models) {
		List<UserSyncSoap> soapModels = new ArrayList<UserSyncSoap>(models.size());

		for (UserSync model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UserSyncSoap[soapModels.size()]);
	}

	public UserSyncSoap() {
	}

	public long getPrimaryKey() {
		return _userSyncId;
	}

	public void setPrimaryKey(long pk) {
		setUserSyncId(pk);
	}

	public long getUserSyncId() {
		return _userSyncId;
	}

	public void setUserSyncId(long userSyncId) {
		_userSyncId = userSyncId;
	}

	public long getApplicationId() {
		return _applicationId;
	}

	public void setApplicationId(long applicationId) {
		_applicationId = applicationId;
	}

	public long getEmployeeId() {
		return _employeeId;
	}

	public void setEmployeeId(long employeeId) {
		_employeeId = employeeId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getSsoUserName() {
		return _ssoUserName;
	}

	public void setSsoUserName(String ssoUserName) {
		_ssoUserName = ssoUserName;
	}

	public String getAppUserName() {
		return _appUserName;
	}

	public void setAppUserName(String appUserName) {
		_appUserName = appUserName;
	}

	public String getFullName() {
		return _fullName;
	}

	public void setFullName(String fullName) {
		_fullName = fullName;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getPassword() {
		return _password;
	}

	public void setPassword(String password) {
		_password = password;
	}

	public int getAccessibleStatus() {
		return _accessibleStatus;
	}

	public void setAccessibleStatus(int accessibleStatus) {
		_accessibleStatus = accessibleStatus;
	}

	public String getRoles() {
		return _roles;
	}

	public void setRoles(String roles) {
		_roles = roles;
	}

	public Date getCheckpoint() {
		return _checkpoint;
	}

	public void setCheckpoint(Date checkpoint) {
		_checkpoint = checkpoint;
	}

	public Date getSyncTime() {
		return _syncTime;
	}

	public void setSyncTime(Date syncTime) {
		_syncTime = syncTime;
	}

	private long _userSyncId;
	private long _applicationId;
	private long _employeeId;
	private long _userId;
	private String _ssoUserName;
	private String _appUserName;
	private String _fullName;
	private String _email;
	private String _password;
	private int _accessibleStatus;
	private String _roles;
	private Date _checkpoint;
	private Date _syncTime;
}