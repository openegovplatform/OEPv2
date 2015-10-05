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
 * This class is used by SOAP remote services, specifically {@link org.oep.core.processmgt.service.http.TransitionHistoryServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.core.processmgt.service.http.TransitionHistoryServiceSoap
 * @generated
 */
public class TransitionHistorySoap implements Serializable {
	public static TransitionHistorySoap toSoapModel(TransitionHistory model) {
		TransitionHistorySoap soapModel = new TransitionHistorySoap();

		soapModel.setTransitionHistoryId(model.getTransitionHistoryId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setProcessOrderId(model.getProcessOrderId());
		soapModel.setDaysDoing(model.getDaysDoing());
		soapModel.setDaysDelay(model.getDaysDelay());
		soapModel.setStartDate(model.getStartDate());
		soapModel.setStepTransitionId(model.getStepTransitionId());
		soapModel.setPreDossierStepId(model.getPreDossierStepId());
		soapModel.setPostDossierStepId(model.getPostDossierStepId());
		soapModel.setTransitionName(model.getTransitionName());
		soapModel.setNote(model.getNote());

		return soapModel;
	}

	public static TransitionHistorySoap[] toSoapModels(
		TransitionHistory[] models) {
		TransitionHistorySoap[] soapModels = new TransitionHistorySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TransitionHistorySoap[][] toSoapModels(
		TransitionHistory[][] models) {
		TransitionHistorySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TransitionHistorySoap[models.length][models[0].length];
		}
		else {
			soapModels = new TransitionHistorySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TransitionHistorySoap[] toSoapModels(
		List<TransitionHistory> models) {
		List<TransitionHistorySoap> soapModels = new ArrayList<TransitionHistorySoap>(models.size());

		for (TransitionHistory model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TransitionHistorySoap[soapModels.size()]);
	}

	public TransitionHistorySoap() {
	}

	public long getPrimaryKey() {
		return _transitionHistoryId;
	}

	public void setPrimaryKey(long pk) {
		setTransitionHistoryId(pk);
	}

	public long getTransitionHistoryId() {
		return _transitionHistoryId;
	}

	public void setTransitionHistoryId(long transitionHistoryId) {
		_transitionHistoryId = transitionHistoryId;
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

	public long getDossierId() {
		return _dossierId;
	}

	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
	}

	public long getProcessOrderId() {
		return _processOrderId;
	}

	public void setProcessOrderId(long processOrderId) {
		_processOrderId = processOrderId;
	}

	public int getDaysDoing() {
		return _daysDoing;
	}

	public void setDaysDoing(int daysDoing) {
		_daysDoing = daysDoing;
	}

	public int getDaysDelay() {
		return _daysDelay;
	}

	public void setDaysDelay(int daysDelay) {
		_daysDelay = daysDelay;
	}

	public Date getStartDate() {
		return _startDate;
	}

	public void setStartDate(Date startDate) {
		_startDate = startDate;
	}

	public long getStepTransitionId() {
		return _stepTransitionId;
	}

	public void setStepTransitionId(long stepTransitionId) {
		_stepTransitionId = stepTransitionId;
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

	public String getTransitionName() {
		return _transitionName;
	}

	public void setTransitionName(String transitionName) {
		_transitionName = transitionName;
	}

	public String getNote() {
		return _note;
	}

	public void setNote(String note) {
		_note = note;
	}

	private long _transitionHistoryId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private long _dossierId;
	private long _processOrderId;
	private int _daysDoing;
	private int _daysDelay;
	private Date _startDate;
	private long _stepTransitionId;
	private long _preDossierStepId;
	private long _postDossierStepId;
	private String _transitionName;
	private String _note;
}