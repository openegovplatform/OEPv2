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

package org.oep.core.dossiermgt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.oep.core.dossiermgt.service.http.DossierProcServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.http.DossierProcServiceSoap
 * @generated
 */
public class DossierProcSoap implements Serializable {
	public static DossierProcSoap toSoapModel(DossierProc model) {
		DossierProcSoap soapModel = new DossierProcSoap();

		soapModel.setDossierProcId(model.getDossierProcId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDossierProcNo(model.getDossierProcNo());
		soapModel.setName(model.getName());
		soapModel.setEnName(model.getEnName());
		soapModel.setShortName(model.getShortName());
		soapModel.setProcessDescription(model.getProcessDescription());
		soapModel.setMethodDescription(model.getMethodDescription());
		soapModel.setDossierDescription(model.getDossierDescription());
		soapModel.setConditionDescription(model.getConditionDescription());
		soapModel.setDurationDescription(model.getDurationDescription());
		soapModel.setActorsDescription(model.getActorsDescription());
		soapModel.setResultsDescription(model.getResultsDescription());
		soapModel.setRecordsDescription(model.getRecordsDescription());
		soapModel.setFeeDescription(model.getFeeDescription());
		soapModel.setInstructionsDescription(model.getInstructionsDescription());
		soapModel.setAdministrationNo(model.getAdministrationNo());
		soapModel.setAdministrationName(model.getAdministrationName());
		soapModel.setDomainNo(model.getDomainNo());
		soapModel.setDomainName(model.getDomainName());
		soapModel.setEffectDate(model.getEffectDate());
		soapModel.setExpireDate(model.getExpireDate());
		soapModel.setActive(model.getActive());

		return soapModel;
	}

	public static DossierProcSoap[] toSoapModels(DossierProc[] models) {
		DossierProcSoap[] soapModels = new DossierProcSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DossierProcSoap[][] toSoapModels(DossierProc[][] models) {
		DossierProcSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DossierProcSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DossierProcSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DossierProcSoap[] toSoapModels(List<DossierProc> models) {
		List<DossierProcSoap> soapModels = new ArrayList<DossierProcSoap>(models.size());

		for (DossierProc model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DossierProcSoap[soapModels.size()]);
	}

	public DossierProcSoap() {
	}

	public long getPrimaryKey() {
		return _dossierProcId;
	}

	public void setPrimaryKey(long pk) {
		setDossierProcId(pk);
	}

	public long getDossierProcId() {
		return _dossierProcId;
	}

	public void setDossierProcId(long dossierProcId) {
		_dossierProcId = dossierProcId;
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

	public String getDossierProcNo() {
		return _dossierProcNo;
	}

	public void setDossierProcNo(String dossierProcNo) {
		_dossierProcNo = dossierProcNo;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getEnName() {
		return _enName;
	}

	public void setEnName(String enName) {
		_enName = enName;
	}

	public String getShortName() {
		return _shortName;
	}

	public void setShortName(String shortName) {
		_shortName = shortName;
	}

	public String getProcessDescription() {
		return _processDescription;
	}

	public void setProcessDescription(String processDescription) {
		_processDescription = processDescription;
	}

	public String getMethodDescription() {
		return _methodDescription;
	}

	public void setMethodDescription(String methodDescription) {
		_methodDescription = methodDescription;
	}

	public String getDossierDescription() {
		return _dossierDescription;
	}

	public void setDossierDescription(String dossierDescription) {
		_dossierDescription = dossierDescription;
	}

	public String getConditionDescription() {
		return _conditionDescription;
	}

	public void setConditionDescription(String conditionDescription) {
		_conditionDescription = conditionDescription;
	}

	public String getDurationDescription() {
		return _durationDescription;
	}

	public void setDurationDescription(String durationDescription) {
		_durationDescription = durationDescription;
	}

	public String getActorsDescription() {
		return _actorsDescription;
	}

	public void setActorsDescription(String actorsDescription) {
		_actorsDescription = actorsDescription;
	}

	public String getResultsDescription() {
		return _resultsDescription;
	}

	public void setResultsDescription(String resultsDescription) {
		_resultsDescription = resultsDescription;
	}

	public String getRecordsDescription() {
		return _recordsDescription;
	}

	public void setRecordsDescription(String recordsDescription) {
		_recordsDescription = recordsDescription;
	}

	public String getFeeDescription() {
		return _feeDescription;
	}

	public void setFeeDescription(String feeDescription) {
		_feeDescription = feeDescription;
	}

	public String getInstructionsDescription() {
		return _instructionsDescription;
	}

	public void setInstructionsDescription(String instructionsDescription) {
		_instructionsDescription = instructionsDescription;
	}

	public String getAdministrationNo() {
		return _administrationNo;
	}

	public void setAdministrationNo(String administrationNo) {
		_administrationNo = administrationNo;
	}

	public String getAdministrationName() {
		return _administrationName;
	}

	public void setAdministrationName(String administrationName) {
		_administrationName = administrationName;
	}

	public String getDomainNo() {
		return _domainNo;
	}

	public void setDomainNo(String domainNo) {
		_domainNo = domainNo;
	}

	public String getDomainName() {
		return _domainName;
	}

	public void setDomainName(String domainName) {
		_domainName = domainName;
	}

	public Date getEffectDate() {
		return _effectDate;
	}

	public void setEffectDate(Date effectDate) {
		_effectDate = effectDate;
	}

	public Date getExpireDate() {
		return _expireDate;
	}

	public void setExpireDate(Date expireDate) {
		_expireDate = expireDate;
	}

	public int getActive() {
		return _active;
	}

	public void setActive(int active) {
		_active = active;
	}

	private long _dossierProcId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _dossierProcNo;
	private String _name;
	private String _enName;
	private String _shortName;
	private String _processDescription;
	private String _methodDescription;
	private String _dossierDescription;
	private String _conditionDescription;
	private String _durationDescription;
	private String _actorsDescription;
	private String _resultsDescription;
	private String _recordsDescription;
	private String _feeDescription;
	private String _instructionsDescription;
	private String _administrationNo;
	private String _administrationName;
	private String _domainNo;
	private String _domainName;
	private Date _effectDate;
	private Date _expireDate;
	private int _active;
}