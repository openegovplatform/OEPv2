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
 * This class is used by SOAP remote services, specifically {@link org.oep.core.processmgt.service.http.DossierStepServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.core.processmgt.service.http.DossierStepServiceSoap
 * @generated
 */
public class DossierStepSoap implements Serializable {
	public static DossierStepSoap toSoapModel(DossierStep model) {
		DossierStepSoap soapModel = new DossierStepSoap();

		soapModel.setDossierStepId(model.getDossierStepId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDossierProcessId(model.getDossierProcessId());
		soapModel.setTitle(model.getTitle());
		soapModel.setSequenceNo(model.getSequenceNo());
		soapModel.setStepType(model.getStepType());

		return soapModel;
	}

	public static DossierStepSoap[] toSoapModels(DossierStep[] models) {
		DossierStepSoap[] soapModels = new DossierStepSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DossierStepSoap[][] toSoapModels(DossierStep[][] models) {
		DossierStepSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DossierStepSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DossierStepSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DossierStepSoap[] toSoapModels(List<DossierStep> models) {
		List<DossierStepSoap> soapModels = new ArrayList<DossierStepSoap>(models.size());

		for (DossierStep model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DossierStepSoap[soapModels.size()]);
	}

	public DossierStepSoap() {
	}

	public long getPrimaryKey() {
		return _dossierStepId;
	}

	public void setPrimaryKey(long pk) {
		setDossierStepId(pk);
	}

	public long getDossierStepId() {
		return _dossierStepId;
	}

	public void setDossierStepId(long dossierStepId) {
		_dossierStepId = dossierStepId;
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

	public long getDossierProcessId() {
		return _dossierProcessId;
	}

	public void setDossierProcessId(long dossierProcessId) {
		_dossierProcessId = dossierProcessId;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public int getSequenceNo() {
		return _sequenceNo;
	}

	public void setSequenceNo(int sequenceNo) {
		_sequenceNo = sequenceNo;
	}

	public int getStepType() {
		return _stepType;
	}

	public void setStepType(int stepType) {
		_stepType = stepType;
	}

	private long _dossierStepId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _dossierProcessId;
	private String _title;
	private int _sequenceNo;
	private int _stepType;
}