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

package org.oep.processmgt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.oep.processmgt.service.http.CreateFileServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.processmgt.service.http.CreateFileServiceSoap
 * @generated
 */
public class CreateFileSoap implements Serializable {
	public static CreateFileSoap toSoapModel(CreateFile model) {
		CreateFileSoap soapModel = new CreateFileSoap();

		soapModel.setCreateFileId(model.getCreateFileId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setProcessOrderId(model.getProcessOrderId());
		soapModel.setDossierStepId(model.getDossierStepId());
		soapModel.setStepDate(model.getStepDate());
		soapModel.setDocFileId(model.getDocFileId());

		return soapModel;
	}

	public static CreateFileSoap[] toSoapModels(CreateFile[] models) {
		CreateFileSoap[] soapModels = new CreateFileSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CreateFileSoap[][] toSoapModels(CreateFile[][] models) {
		CreateFileSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CreateFileSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CreateFileSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CreateFileSoap[] toSoapModels(List<CreateFile> models) {
		List<CreateFileSoap> soapModels = new ArrayList<CreateFileSoap>(models.size());

		for (CreateFile model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CreateFileSoap[soapModels.size()]);
	}

	public CreateFileSoap() {
	}

	public long getPrimaryKey() {
		return _createFileId;
	}

	public void setPrimaryKey(long pk) {
		setCreateFileId(pk);
	}

	public long getCreateFileId() {
		return _createFileId;
	}

	public void setCreateFileId(long createFileId) {
		_createFileId = createFileId;
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

	public Date getStepDate() {
		return _stepDate;
	}

	public void setStepDate(Date stepDate) {
		_stepDate = stepDate;
	}

	public long getDocFileId() {
		return _docFileId;
	}

	public void setDocFileId(long docFileId) {
		_docFileId = docFileId;
	}

	private long _createFileId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private long _processOrderId;
	private long _dossierStepId;
	private Date _stepDate;
	private long _docFileId;
}