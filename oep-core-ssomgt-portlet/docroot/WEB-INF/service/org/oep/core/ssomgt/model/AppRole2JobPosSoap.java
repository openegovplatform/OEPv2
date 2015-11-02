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
 * This class is used by SOAP remote services, specifically {@link org.oep.core.ssomgt.service.http.AppRole2JobPosServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.core.ssomgt.service.http.AppRole2JobPosServiceSoap
 * @generated
 */
public class AppRole2JobPosSoap implements Serializable {
	public static AppRole2JobPosSoap toSoapModel(AppRole2JobPos model) {
		AppRole2JobPosSoap soapModel = new AppRole2JobPosSoap();

		soapModel.setAppRole2JobPosId(model.getAppRole2JobPosId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setAppRoleId(model.getAppRoleId());
		soapModel.setJobPostId(model.getJobPostId());

		return soapModel;
	}

	public static AppRole2JobPosSoap[] toSoapModels(AppRole2JobPos[] models) {
		AppRole2JobPosSoap[] soapModels = new AppRole2JobPosSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AppRole2JobPosSoap[][] toSoapModels(AppRole2JobPos[][] models) {
		AppRole2JobPosSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AppRole2JobPosSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AppRole2JobPosSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AppRole2JobPosSoap[] toSoapModels(List<AppRole2JobPos> models) {
		List<AppRole2JobPosSoap> soapModels = new ArrayList<AppRole2JobPosSoap>(models.size());

		for (AppRole2JobPos model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AppRole2JobPosSoap[soapModels.size()]);
	}

	public AppRole2JobPosSoap() {
	}

	public long getPrimaryKey() {
		return _appRole2JobPosId;
	}

	public void setPrimaryKey(long pk) {
		setAppRole2JobPosId(pk);
	}

	public long getAppRole2JobPosId() {
		return _appRole2JobPosId;
	}

	public void setAppRole2JobPosId(long appRole2JobPosId) {
		_appRole2JobPosId = appRole2JobPosId;
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

	public long getJobPostId() {
		return _jobPostId;
	}

	public void setJobPostId(long jobPostId) {
		_jobPostId = jobPostId;
	}

	private long _appRole2JobPosId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private long _appRoleId;
	private long _jobPostId;
}