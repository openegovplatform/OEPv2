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
 * This class is used by SOAP remote services, specifically {@link org.oep.processmgt.service.http.StepTransitionServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.processmgt.service.http.StepTransitionServiceSoap
 * @generated
 */
public class StepTransitionSoap implements Serializable {
	public static StepTransitionSoap toSoapModel(StepTransition model) {
		StepTransitionSoap soapModel = new StepTransitionSoap();

		soapModel.setStepTransitionId(model.getStepTransitionId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDossierProcessId(model.getDossierProcessId());
		soapModel.setPreDossierStepId(model.getPreDossierStepId());
		soapModel.setPostDossierStepId(model.getPostDossierStepId());
		soapModel.setAutoCondition(model.getAutoCondition());
		soapModel.setTransitionName(model.getTransitionName());
		soapModel.setDossierStatus(model.getDossierStatus());
		soapModel.setSendResults(model.getSendResults());
		soapModel.setUserAssignment(model.getUserAssignment());
		soapModel.setNewProcessOrder(model.getNewProcessOrder());

		return soapModel;
	}

	public static StepTransitionSoap[] toSoapModels(StepTransition[] models) {
		StepTransitionSoap[] soapModels = new StepTransitionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static StepTransitionSoap[][] toSoapModels(StepTransition[][] models) {
		StepTransitionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new StepTransitionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new StepTransitionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static StepTransitionSoap[] toSoapModels(List<StepTransition> models) {
		List<StepTransitionSoap> soapModels = new ArrayList<StepTransitionSoap>(models.size());

		for (StepTransition model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new StepTransitionSoap[soapModels.size()]);
	}

	public StepTransitionSoap() {
	}

	public long getPrimaryKey() {
		return _stepTransitionId;
	}

	public void setPrimaryKey(long pk) {
		setStepTransitionId(pk);
	}

	public long getStepTransitionId() {
		return _stepTransitionId;
	}

	public void setStepTransitionId(long stepTransitionId) {
		_stepTransitionId = stepTransitionId;
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

	public long getPreDossierStepId() {
		return _preDossierStepId;
	}

	public void setPreDossierStepId(long preDossierStepId) {
		_preDossierStepId = preDossierStepId;
	}

	public long getPostDossierStepId() {
		return _postDossierStepId;
	}

	public void setPostDossierStepId(long postDossierStepId) {
		_postDossierStepId = postDossierStepId;
	}

	public String getAutoCondition() {
		return _autoCondition;
	}

	public void setAutoCondition(String autoCondition) {
		_autoCondition = autoCondition;
	}

	public String getTransitionName() {
		return _transitionName;
	}

	public void setTransitionName(String transitionName) {
		_transitionName = transitionName;
	}

	public String getDossierStatus() {
		return _dossierStatus;
	}

	public void setDossierStatus(String dossierStatus) {
		_dossierStatus = dossierStatus;
	}

	public int getSendResults() {
		return _sendResults;
	}

	public void setSendResults(int sendResults) {
		_sendResults = sendResults;
	}

	public int getUserAssignment() {
		return _userAssignment;
	}

	public void setUserAssignment(int userAssignment) {
		_userAssignment = userAssignment;
	}

	public int getNewProcessOrder() {
		return _newProcessOrder;
	}

	public void setNewProcessOrder(int newProcessOrder) {
		_newProcessOrder = newProcessOrder;
	}

	private long _stepTransitionId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _dossierProcessId;
	private long _preDossierStepId;
	private long _postDossierStepId;
	private String _autoCondition;
	private String _transitionName;
	private String _dossierStatus;
	private int _sendResults;
	private int _userAssignment;
	private int _newProcessOrder;
}