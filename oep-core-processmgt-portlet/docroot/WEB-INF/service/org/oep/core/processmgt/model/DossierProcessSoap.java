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
 * This class is used by SOAP remote services, specifically {@link org.oep.core.processmgt.service.http.DossierProcessServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.core.processmgt.service.http.DossierProcessServiceSoap
 * @generated
 */
public class DossierProcessSoap implements Serializable {
	public static DossierProcessSoap toSoapModel(DossierProcess model) {
		DossierProcessSoap soapModel = new DossierProcessSoap();

		soapModel.setDossierProcessId(model.getDossierProcessId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDossierProcId(model.getDossierProcId());
		soapModel.setGovAgencyId(model.getGovAgencyId());
		soapModel.setGovAgencyName(model.getGovAgencyName());
		soapModel.setStartStepTransitionId(model.getStartStepTransitionId());
		soapModel.setDaysDuration(model.getDaysDuration());
		soapModel.setFee(model.getFee());

		return soapModel;
	}

	public static DossierProcessSoap[] toSoapModels(DossierProcess[] models) {
		DossierProcessSoap[] soapModels = new DossierProcessSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DossierProcessSoap[][] toSoapModels(DossierProcess[][] models) {
		DossierProcessSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DossierProcessSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DossierProcessSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DossierProcessSoap[] toSoapModels(List<DossierProcess> models) {
		List<DossierProcessSoap> soapModels = new ArrayList<DossierProcessSoap>(models.size());

		for (DossierProcess model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DossierProcessSoap[soapModels.size()]);
	}

	public DossierProcessSoap() {
	}

	public long getPrimaryKey() {
		return _dossierProcessId;
	}

	public void setPrimaryKey(long pk) {
		setDossierProcessId(pk);
	}

	public long getDossierProcessId() {
		return _dossierProcessId;
	}

	public void setDossierProcessId(long dossierProcessId) {
		_dossierProcessId = dossierProcessId;
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

	public long getDossierProcId() {
		return _dossierProcId;
	}

	public void setDossierProcId(long dossierProcId) {
		_dossierProcId = dossierProcId;
	}

	public String getGovAgencyId() {
		return _govAgencyId;
	}

	public void setGovAgencyId(String govAgencyId) {
		_govAgencyId = govAgencyId;
	}

	public String getGovAgencyName() {
		return _govAgencyName;
	}

	public void setGovAgencyName(String govAgencyName) {
		_govAgencyName = govAgencyName;
	}

	public long getStartStepTransitionId() {
		return _startStepTransitionId;
	}

	public void setStartStepTransitionId(long startStepTransitionId) {
		_startStepTransitionId = startStepTransitionId;
	}

	public int getDaysDuration() {
		return _daysDuration;
	}

	public void setDaysDuration(int daysDuration) {
		_daysDuration = daysDuration;
	}

	public int getFee() {
		return _fee;
	}

	public void setFee(int fee) {
		_fee = fee;
	}

	private long _dossierProcessId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _dossierProcId;
	private String _govAgencyId;
	private String _govAgencyName;
	private long _startStepTransitionId;
	private int _daysDuration;
	private int _fee;
}