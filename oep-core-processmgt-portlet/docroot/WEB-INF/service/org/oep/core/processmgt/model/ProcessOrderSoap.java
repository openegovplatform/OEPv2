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
 * This class is used by SOAP remote services, specifically {@link org.oep.core.processmgt.service.http.ProcessOrderServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.core.processmgt.service.http.ProcessOrderServiceSoap
 * @generated
 */
public class ProcessOrderSoap implements Serializable {
	public static ProcessOrderSoap toSoapModel(ProcessOrder model) {
		ProcessOrderSoap soapModel = new ProcessOrderSoap();

		soapModel.setProcessOrderId(model.getProcessOrderId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setOrganizationId(model.getOrganizationId());
		soapModel.setParentProcessOrderId(model.getParentProcessOrderId());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setDossierProcessId(model.getDossierProcessId());
		soapModel.setDossierStepId(model.getDossierStepId());
		soapModel.setDossierStatus(model.getDossierStatus());
		soapModel.setDossierResume(model.getDossierResume());
		soapModel.setStepDate(model.getStepDate());
		soapModel.setStepNote(model.getStepNote());
		soapModel.setAssignToUserId(model.getAssignToUserId());
		soapModel.setCurrentCondition(model.getCurrentCondition());
		soapModel.setEndState(model.getEndState());

		return soapModel;
	}

	public static ProcessOrderSoap[] toSoapModels(ProcessOrder[] models) {
		ProcessOrderSoap[] soapModels = new ProcessOrderSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ProcessOrderSoap[][] toSoapModels(ProcessOrder[][] models) {
		ProcessOrderSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ProcessOrderSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ProcessOrderSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ProcessOrderSoap[] toSoapModels(List<ProcessOrder> models) {
		List<ProcessOrderSoap> soapModels = new ArrayList<ProcessOrderSoap>(models.size());

		for (ProcessOrder model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ProcessOrderSoap[soapModels.size()]);
	}

	public ProcessOrderSoap() {
	}

	public long getPrimaryKey() {
		return _processOrderId;
	}

	public void setPrimaryKey(long pk) {
		setProcessOrderId(pk);
	}

	public long getProcessOrderId() {
		return _processOrderId;
	}

	public void setProcessOrderId(long processOrderId) {
		_processOrderId = processOrderId;
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

	public long getOrganizationId() {
		return _organizationId;
	}

	public void setOrganizationId(long organizationId) {
		_organizationId = organizationId;
	}

	public long getParentProcessOrderId() {
		return _parentProcessOrderId;
	}

	public void setParentProcessOrderId(long parentProcessOrderId) {
		_parentProcessOrderId = parentProcessOrderId;
	}

	public long getDossierId() {
		return _dossierId;
	}

	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
	}

	public long getDossierProcessId() {
		return _dossierProcessId;
	}

	public void setDossierProcessId(long dossierProcessId) {
		_dossierProcessId = dossierProcessId;
	}

	public long getDossierStepId() {
		return _dossierStepId;
	}

	public void setDossierStepId(long dossierStepId) {
		_dossierStepId = dossierStepId;
	}

	public String getDossierStatus() {
		return _dossierStatus;
	}

	public void setDossierStatus(String dossierStatus) {
		_dossierStatus = dossierStatus;
	}

	public String getDossierResume() {
		return _dossierResume;
	}

	public void setDossierResume(String dossierResume) {
		_dossierResume = dossierResume;
	}

	public Date getStepDate() {
		return _stepDate;
	}

	public void setStepDate(Date stepDate) {
		_stepDate = stepDate;
	}

	public String getStepNote() {
		return _stepNote;
	}

	public void setStepNote(String stepNote) {
		_stepNote = stepNote;
	}

	public long getAssignToUserId() {
		return _assignToUserId;
	}

	public void setAssignToUserId(long assignToUserId) {
		_assignToUserId = assignToUserId;
	}

	public String getCurrentCondition() {
		return _currentCondition;
	}

	public void setCurrentCondition(String currentCondition) {
		_currentCondition = currentCondition;
	}

	public int getEndState() {
		return _endState;
	}

	public void setEndState(int endState) {
		_endState = endState;
	}

	private long _processOrderId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _organizationId;
	private long _parentProcessOrderId;
	private long _dossierId;
	private long _dossierProcessId;
	private long _dossierStepId;
	private String _dossierStatus;
	private String _dossierResume;
	private Date _stepDate;
	private String _stepNote;
	private long _assignToUserId;
	private String _currentCondition;
	private int _endState;
}