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
 * This class is used by SOAP remote services, specifically {@link org.oep.core.dossiermgt.service.http.DossierServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.http.DossierServiceSoap
 * @generated
 */
public class DossierSoap implements Serializable {
	public static DossierSoap toSoapModel(Dossier model) {
		DossierSoap soapModel = new DossierSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setOrganizationId(model.getOrganizationId());
		soapModel.setDossierProcId(model.getDossierProcId());
		soapModel.setGovAgentNo(model.getGovAgentNo());
		soapModel.setGovAgentName(model.getGovAgentName());
		soapModel.setSubmitterName(model.getSubmitterName());
		soapModel.setActorType(model.getActorType());
		soapModel.setActorNo(model.getActorNo());
		soapModel.setActorName(model.getActorName());
		soapModel.setAddress(model.getAddress());
		soapModel.setCityNo(model.getCityNo());
		soapModel.setCityName(model.getCityName());
		soapModel.setDistrictNo(model.getDistrictNo());
		soapModel.setDistrictName(model.getDistrictName());
		soapModel.setWardNo(model.getWardNo());
		soapModel.setWardName(model.getWardName());
		soapModel.setDescription(model.getDescription());
		soapModel.setNote(model.getNote());
		soapModel.setReceptionNo(model.getReceptionNo());
		soapModel.setSubmissionDate(model.getSubmissionDate());
		soapModel.setReceptionDate(model.getReceptionDate());
		soapModel.setResubmissionDate(model.getResubmissionDate());
		soapModel.setAppointmentDate(model.getAppointmentDate());
		soapModel.setReleaseDate(model.getReleaseDate());
		soapModel.setCompletionDate(model.getCompletionDate());
		soapModel.setStatus(model.getStatus());
		soapModel.setStatusName(model.getStatusName());
		soapModel.setFeedbackNote(model.getFeedbackNote());
		soapModel.setPaymentConfirmed(model.getPaymentConfirmed());

		return soapModel;
	}

	public static DossierSoap[] toSoapModels(Dossier[] models) {
		DossierSoap[] soapModels = new DossierSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DossierSoap[][] toSoapModels(Dossier[][] models) {
		DossierSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DossierSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DossierSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DossierSoap[] toSoapModels(List<Dossier> models) {
		List<DossierSoap> soapModels = new ArrayList<DossierSoap>(models.size());

		for (Dossier model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DossierSoap[soapModels.size()]);
	}

	public DossierSoap() {
	}

	public long getPrimaryKey() {
		return _dossierId;
	}

	public void setPrimaryKey(long pk) {
		setDossierId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getDossierId() {
		return _dossierId;
	}

	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
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

	public long getDossierProcId() {
		return _dossierProcId;
	}

	public void setDossierProcId(long dossierProcId) {
		_dossierProcId = dossierProcId;
	}

	public String getGovAgentNo() {
		return _govAgentNo;
	}

	public void setGovAgentNo(String govAgentNo) {
		_govAgentNo = govAgentNo;
	}

	public String getGovAgentName() {
		return _govAgentName;
	}

	public void setGovAgentName(String govAgentName) {
		_govAgentName = govAgentName;
	}

	public String getSubmitterName() {
		return _submitterName;
	}

	public void setSubmitterName(String submitterName) {
		_submitterName = submitterName;
	}

	public int getActorType() {
		return _actorType;
	}

	public void setActorType(int actorType) {
		_actorType = actorType;
	}

	public String getActorNo() {
		return _actorNo;
	}

	public void setActorNo(String actorNo) {
		_actorNo = actorNo;
	}

	public String getActorName() {
		return _actorName;
	}

	public void setActorName(String actorName) {
		_actorName = actorName;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public String getCityNo() {
		return _cityNo;
	}

	public void setCityNo(String cityNo) {
		_cityNo = cityNo;
	}

	public String getCityName() {
		return _cityName;
	}

	public void setCityName(String cityName) {
		_cityName = cityName;
	}

	public String getDistrictNo() {
		return _districtNo;
	}

	public void setDistrictNo(String districtNo) {
		_districtNo = districtNo;
	}

	public String getDistrictName() {
		return _districtName;
	}

	public void setDistrictName(String districtName) {
		_districtName = districtName;
	}

	public String getWardNo() {
		return _wardNo;
	}

	public void setWardNo(String wardNo) {
		_wardNo = wardNo;
	}

	public String getWardName() {
		return _wardName;
	}

	public void setWardName(String wardName) {
		_wardName = wardName;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getNote() {
		return _note;
	}

	public void setNote(String note) {
		_note = note;
	}

	public String getReceptionNo() {
		return _receptionNo;
	}

	public void setReceptionNo(String receptionNo) {
		_receptionNo = receptionNo;
	}

	public Date getSubmissionDate() {
		return _submissionDate;
	}

	public void setSubmissionDate(Date submissionDate) {
		_submissionDate = submissionDate;
	}

	public Date getReceptionDate() {
		return _receptionDate;
	}

	public void setReceptionDate(Date receptionDate) {
		_receptionDate = receptionDate;
	}

	public Date getResubmissionDate() {
		return _resubmissionDate;
	}

	public void setResubmissionDate(Date resubmissionDate) {
		_resubmissionDate = resubmissionDate;
	}

	public Date getAppointmentDate() {
		return _appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		_appointmentDate = appointmentDate;
	}

	public Date getReleaseDate() {
		return _releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		_releaseDate = releaseDate;
	}

	public Date getCompletionDate() {
		return _completionDate;
	}

	public void setCompletionDate(Date completionDate) {
		_completionDate = completionDate;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	public String getStatusName() {
		return _statusName;
	}

	public void setStatusName(String statusName) {
		_statusName = statusName;
	}

	public String getFeedbackNote() {
		return _feedbackNote;
	}

	public void setFeedbackNote(String feedbackNote) {
		_feedbackNote = feedbackNote;
	}

	public int getPaymentConfirmed() {
		return _paymentConfirmed;
	}

	public void setPaymentConfirmed(int paymentConfirmed) {
		_paymentConfirmed = paymentConfirmed;
	}

	private String _uuid;
	private long _dossierId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _organizationId;
	private long _dossierProcId;
	private String _govAgentNo;
	private String _govAgentName;
	private String _submitterName;
	private int _actorType;
	private String _actorNo;
	private String _actorName;
	private String _address;
	private String _cityNo;
	private String _cityName;
	private String _districtNo;
	private String _districtName;
	private String _wardNo;
	private String _wardName;
	private String _description;
	private String _note;
	private String _receptionNo;
	private Date _submissionDate;
	private Date _receptionDate;
	private Date _resubmissionDate;
	private Date _appointmentDate;
	private Date _releaseDate;
	private Date _completionDate;
	private String _status;
	private String _statusName;
	private String _feedbackNote;
	private int _paymentConfirmed;
}