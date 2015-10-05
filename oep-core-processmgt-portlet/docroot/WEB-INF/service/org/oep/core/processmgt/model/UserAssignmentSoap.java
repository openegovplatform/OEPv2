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

package org.oep.core.processmgt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.oep.core.processmgt.service.http.UserAssignmentServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.core.processmgt.service.http.UserAssignmentServiceSoap
 * @generated
 */
public class UserAssignmentSoap implements Serializable {
	public static UserAssignmentSoap toSoapModel(UserAssignment model) {
		UserAssignmentSoap soapModel = new UserAssignmentSoap();

		soapModel.setUserAssignmentId(model.getUserAssignmentId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setProcessOrderId(model.getProcessOrderId());
		soapModel.setDossierStepId(model.getDossierStepId());
		soapModel.setAssignToUserId(model.getAssignToUserId());

		return soapModel;
	}

	public static UserAssignmentSoap[] toSoapModels(UserAssignment[] models) {
		UserAssignmentSoap[] soapModels = new UserAssignmentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UserAssignmentSoap[][] toSoapModels(UserAssignment[][] models) {
		UserAssignmentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UserAssignmentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UserAssignmentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UserAssignmentSoap[] toSoapModels(List<UserAssignment> models) {
		List<UserAssignmentSoap> soapModels = new ArrayList<UserAssignmentSoap>(models.size());

		for (UserAssignment model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UserAssignmentSoap[soapModels.size()]);
	}

	public UserAssignmentSoap() {
	}

	public long getPrimaryKey() {
		return _userAssignmentId;
	}

	public void setPrimaryKey(long pk) {
		setUserAssignmentId(pk);
	}

	public long getUserAssignmentId() {
		return _userAssignmentId;
	}

	public void setUserAssignmentId(long userAssignmentId) {
		_userAssignmentId = userAssignmentId;
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

	public long getProcessOrderId() {
		return _processOrderId;
	}

	public void setProcessOrderId(long processOrderId) {
		_processOrderId = processOrderId;
	}

	public long getDossierStepId() {
		return _dossierStepId;
	}

	public void setDossierStepId(long dossierStepId) {
		_dossierStepId = dossierStepId;
	}

	public long getAssignToUserId() {
		return _assignToUserId;
	}

	public void setAssignToUserId(long assignToUserId) {
		_assignToUserId = assignToUserId;
	}

	private long _userAssignmentId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private long _processOrderId;
	private long _dossierStepId;
	private long _assignToUserId;
}