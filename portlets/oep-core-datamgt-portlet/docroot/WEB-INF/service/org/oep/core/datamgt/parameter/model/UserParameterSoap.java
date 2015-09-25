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

package org.oep.core.datamgt.parameter.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.oep.core.datamgt.parameter.service.http.UserParameterServiceSoap}.
 *
 * @author TrungDK
 * @see org.oep.core.datamgt.parameter.service.http.UserParameterServiceSoap
 * @generated
 */
public class UserParameterSoap implements Serializable {
	public static UserParameterSoap toSoapModel(UserParameter model) {
		UserParameterSoap soapModel = new UserParameterSoap();

		soapModel.setUserParameterId(model.getUserParameterId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setApplicationName(model.getApplicationName());
		soapModel.setParameterName(model.getParameterName());
		soapModel.setTitle(model.getTitle());
		soapModel.setParameterValue(model.getParameterValue());

		return soapModel;
	}

	public static UserParameterSoap[] toSoapModels(UserParameter[] models) {
		UserParameterSoap[] soapModels = new UserParameterSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UserParameterSoap[][] toSoapModels(UserParameter[][] models) {
		UserParameterSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UserParameterSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UserParameterSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UserParameterSoap[] toSoapModels(List<UserParameter> models) {
		List<UserParameterSoap> soapModels = new ArrayList<UserParameterSoap>(models.size());

		for (UserParameter model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UserParameterSoap[soapModels.size()]);
	}

	public UserParameterSoap() {
	}

	public long getPrimaryKey() {
		return _userParameterId;
	}

	public void setPrimaryKey(long pk) {
		setUserParameterId(pk);
	}

	public long getUserParameterId() {
		return _userParameterId;
	}

	public void setUserParameterId(long userParameterId) {
		_userParameterId = userParameterId;
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

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getApplicationName() {
		return _applicationName;
	}

	public void setApplicationName(String applicationName) {
		_applicationName = applicationName;
	}

	public String getParameterName() {
		return _parameterName;
	}

	public void setParameterName(String parameterName) {
		_parameterName = parameterName;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getParameterValue() {
		return _parameterValue;
	}

	public void setParameterValue(String parameterValue) {
		_parameterValue = parameterValue;
	}

	private long _userParameterId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _applicationName;
	private String _parameterName;
	private String _title;
	private String _parameterValue;
}