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

import java.sql.Blob;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.oep.core.ssomgt.service.http.ApplicationServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.core.ssomgt.service.http.ApplicationServiceSoap
 * @generated
 */
public class ApplicationSoap implements Serializable {
	public static ApplicationSoap toSoapModel(Application model) {
		ApplicationSoap soapModel = new ApplicationSoap();

		soapModel.setApplicationId(model.getApplicationId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setAppCode(model.getAppCode());
		soapModel.setAppName(model.getAppName());
		soapModel.setAppPin(model.getAppPin());
		soapModel.setAppUrl(model.getAppUrl());
		soapModel.setAppBigIcon(model.getAppBigIcon());
		soapModel.setAppSmallIcon(model.getAppSmallIcon());
		soapModel.setPingTime(model.getPingTime());
		soapModel.setSequenceNo(model.getSequenceNo());

		return soapModel;
	}

	public static ApplicationSoap[] toSoapModels(Application[] models) {
		ApplicationSoap[] soapModels = new ApplicationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ApplicationSoap[][] toSoapModels(Application[][] models) {
		ApplicationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ApplicationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ApplicationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ApplicationSoap[] toSoapModels(List<Application> models) {
		List<ApplicationSoap> soapModels = new ArrayList<ApplicationSoap>(models.size());

		for (Application model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ApplicationSoap[soapModels.size()]);
	}

	public ApplicationSoap() {
	}

	public long getPrimaryKey() {
		return _applicationId;
	}

	public void setPrimaryKey(long pk) {
		setApplicationId(pk);
	}

	public long getApplicationId() {
		return _applicationId;
	}

	public void setApplicationId(long applicationId) {
		_applicationId = applicationId;
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

	public String getAppCode() {
		return _appCode;
	}

	public void setAppCode(String appCode) {
		_appCode = appCode;
	}

	public String getAppName() {
		return _appName;
	}

	public void setAppName(String appName) {
		_appName = appName;
	}

	public String getAppPin() {
		return _appPin;
	}

	public void setAppPin(String appPin) {
		_appPin = appPin;
	}

	public String getAppUrl() {
		return _appUrl;
	}

	public void setAppUrl(String appUrl) {
		_appUrl = appUrl;
	}

	public Blob getAppBigIcon() {
		return _appBigIcon;
	}

	public void setAppBigIcon(Blob appBigIcon) {
		_appBigIcon = appBigIcon;
	}

	public Blob getAppSmallIcon() {
		return _appSmallIcon;
	}

	public void setAppSmallIcon(Blob appSmallIcon) {
		_appSmallIcon = appSmallIcon;
	}

	public Date getPingTime() {
		return _pingTime;
	}

	public void setPingTime(Date pingTime) {
		_pingTime = pingTime;
	}

	public int getSequenceNo() {
		return _sequenceNo;
	}

	public void setSequenceNo(int sequenceNo) {
		_sequenceNo = sequenceNo;
	}

	private long _applicationId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _appCode;
	private String _appName;
	private String _appPin;
	private String _appUrl;
	private Blob _appBigIcon;
	private Blob _appSmallIcon;
	private Date _pingTime;
	private int _sequenceNo;
}