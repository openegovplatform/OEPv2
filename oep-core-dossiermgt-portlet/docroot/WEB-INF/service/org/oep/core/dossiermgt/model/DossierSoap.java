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
		soapModel.setGovAgencyId(model.getGovAgencyId());
		soapModel.setGovAgencyName(model.getGovAgencyName());
		soapModel.setSubjectId(model.getSubjectId());
		soapModel.setSubjectType(model.getSubjectType());
		soapModel.setSubjectName(model.getSubjectName());
		soapModel.setAddress(model.getAddress());
		soapModel.setCityNo(model.getCityNo());
		soapModel.setCityName(model.getCityName());
		soapModel.setDistrictNo(model.getDistrictNo());
		soapModel.setDistrictName(model.getDistrictName());
		soapModel.setWardNo(model.getWardNo());
		soapModel.setWardName(model.getWardName());
		soapModel.setTelNo(model.getTelNo());
		soapModel.setContactPersonName(model.getContactPersonName());
		soapModel.setContactPersonTel(model.getContactPersonTel());
		soapModel.setNote(model.getNote());
		soapModel.setResumeDescription(model.getResumeDescription());
		soapModel.setReceptionNo(model.getReceptionNo());
		soapModel.setSubmitDate(model.getSubmitDate());
		soapModel.setReceiveDate(model.getReceiveDate());
		soapModel.setRenewDate(model.getRenewDate());
		soapModel.setEstimateDate(model.getEstimateDate());
		soapModel.setFinishDate(model.getFinishDate());
		soapModel.setReturnDate(model.getReturnDate());
		soapModel.setStatus(model.getStatus());
		soapModel.setStatusDate(model.getStatusDate());
		soapModel.setStatusDescription(model.getStatusDescription());
		soapModel.setFeedbackNote(model.getFeedbackNote());
		soapModel.setDaysDelay(model.getDaysDelay());
		soapModel.setCloseDate(model.getCloseDate());
		soapModel.setErrorStatus(model.getErrorStatus());
		soapModel.setErrorCode(model.getErrorCode());
		soapModel.setDirty(model.getDirty());

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

	public String getSubjectId() {
		return _subjectId;
	}

	public void setSubjectId(String subjectId) {
		_subjectId = subjectId;
	}

	public String getSubjectType() {
		return _subjectType;
	}

	public void setSubjectType(String subjectType) {
		_subjectType = subjectType;
	}

	public String getSubjectName() {
		return _subjectName;
	}

	public void setSubjectName(String subjectName) {
		_subjectName = subjectName;
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

	public String getTelNo() {
		return _telNo;
	}

	public void setTelNo(String telNo) {
		_telNo = telNo;
	}

	public String getContactPersonName() {
		return _contactPersonName;
	}

	public void setContactPersonName(String contactPersonName) {
		_contactPersonName = contactPersonName;
	}

	public String getContactPersonTel() {
		return _contactPersonTel;
	}

	public void setContactPersonTel(String contactPersonTel) {
		_contactPersonTel = contactPersonTel;
	}

	public String getNote() {
		return _note;
	}

	public void setNote(String note) {
		_note = note;
	}

	public String getResumeDescription() {
		return _resumeDescription;
	}

	public void setResumeDescription(String resumeDescription) {
		_resumeDescription = resumeDescription;
	}

	public String getReceptionNo() {
		return _receptionNo;
	}

	public void setReceptionNo(String receptionNo) {
		_receptionNo = receptionNo;
	}

	public Date getSubmitDate() {
		return _submitDate;
	}

	public void setSubmitDate(Date submitDate) {
		_submitDate = submitDate;
	}

	public Date getReceiveDate() {
		return _receiveDate;
	}

	public void setReceiveDate(Date receiveDate) {
		_receiveDate = receiveDate;
	}

	public Date getRenewDate() {
		return _renewDate;
	}

	public void setRenewDate(Date renewDate) {
		_renewDate = renewDate;
	}

	public Date getEstimateDate() {
		return _estimateDate;
	}

	public void setEstimateDate(Date estimateDate) {
		_estimateDate = estimateDate;
	}

	public Date getFinishDate() {
		return _finishDate;
	}

	public void setFinishDate(Date finishDate) {
		_finishDate = finishDate;
	}

	public Date getReturnDate() {
		return _returnDate;
	}

	public void setReturnDate(Date returnDate) {
		_returnDate = returnDate;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	public Date getStatusDate() {
		return _statusDate;
	}

	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	public String getStatusDescription() {
		return _statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		_statusDescription = statusDescription;
	}

	public String getFeedbackNote() {
		return _feedbackNote;
	}

	public void setFeedbackNote(String feedbackNote) {
		_feedbackNote = feedbackNote;
	}

	public int getDaysDelay() {
		return _daysDelay;
	}

	public void setDaysDelay(int daysDelay) {
		_daysDelay = daysDelay;
	}

	public Date getCloseDate() {
		return _closeDate;
	}

	public void setCloseDate(Date closeDate) {
		_closeDate = closeDate;
	}

	public String getErrorStatus() {
		return _errorStatus;
	}

	public void setErrorStatus(String errorStatus) {
		_errorStatus = errorStatus;
	}

	public String getErrorCode() {
		return _errorCode;
	}

	public void setErrorCode(String errorCode) {
		_errorCode = errorCode;
	}

	public int getDirty() {
		return _dirty;
	}

	public void setDirty(int dirty) {
		_dirty = dirty;
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
	private String _govAgencyId;
	private String _govAgencyName;
	private String _subjectId;
	private String _subjectType;
	private String _subjectName;
	private String _address;
	private String _cityNo;
	private String _cityName;
	private String _districtNo;
	private String _districtName;
	private String _wardNo;
	private String _wardName;
	private String _telNo;
	private String _contactPersonName;
	private String _contactPersonTel;
	private String _note;
	private String _resumeDescription;
	private String _receptionNo;
	private Date _submitDate;
	private Date _receiveDate;
	private Date _renewDate;
	private Date _estimateDate;
	private Date _finishDate;
	private Date _returnDate;
	private String _status;
	private Date _statusDate;
	private String _statusDescription;
	private String _feedbackNote;
	private int _daysDelay;
	private Date _closeDate;
	private String _errorStatus;
	private String _errorCode;
	private int _dirty;
}