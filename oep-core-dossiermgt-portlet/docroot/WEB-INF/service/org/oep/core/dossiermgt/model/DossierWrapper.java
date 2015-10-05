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

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Dossier}.
 * </p>
 *
 * @author trungdk
 * @see Dossier
 * @generated
 */
public class DossierWrapper implements Dossier, ModelWrapper<Dossier> {
	public DossierWrapper(Dossier dossier) {
		_dossier = dossier;
	}

	@Override
	public Class<?> getModelClass() {
		return Dossier.class;
	}

	@Override
	public String getModelClassName() {
		return Dossier.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("dossierId", getDossierId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("organizationId", getOrganizationId());
		attributes.put("dossierProcId", getDossierProcId());
		attributes.put("govAgentId", getGovAgentId());
		attributes.put("govAgentName", getGovAgentName());
		attributes.put("subjectId", getSubjectId());
		attributes.put("subjectType", getSubjectType());
		attributes.put("subjectName", getSubjectName());
		attributes.put("address", getAddress());
		attributes.put("cityNo", getCityNo());
		attributes.put("cityName", getCityName());
		attributes.put("districtNo", getDistrictNo());
		attributes.put("districtName", getDistrictName());
		attributes.put("wardNo", getWardNo());
		attributes.put("wardName", getWardName());
		attributes.put("telNo", getTelNo());
		attributes.put("contactPersonName", getContactPersonName());
		attributes.put("contactPersonTel", getContactPersonTel());
		attributes.put("note", getNote());
		attributes.put("resumeDescription", getResumeDescription());
		attributes.put("receptionNo", getReceptionNo());
		attributes.put("submissionDate", getSubmissionDate());
		attributes.put("receptionDate", getReceptionDate());
		attributes.put("resubmissionDate", getResubmissionDate());
		attributes.put("appointmentDate", getAppointmentDate());
		attributes.put("releaseDate", getReleaseDate());
		attributes.put("completionDate", getCompletionDate());
		attributes.put("status", getStatus());
		attributes.put("statusDescription", getStatusDescription());
		attributes.put("feedbackNote", getFeedbackNote());
		attributes.put("dirty", getDirty());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}

		Long dossierProcId = (Long)attributes.get("dossierProcId");

		if (dossierProcId != null) {
			setDossierProcId(dossierProcId);
		}

		String govAgentId = (String)attributes.get("govAgentId");

		if (govAgentId != null) {
			setGovAgentId(govAgentId);
		}

		String govAgentName = (String)attributes.get("govAgentName");

		if (govAgentName != null) {
			setGovAgentName(govAgentName);
		}

		String subjectId = (String)attributes.get("subjectId");

		if (subjectId != null) {
			setSubjectId(subjectId);
		}

		String subjectType = (String)attributes.get("subjectType");

		if (subjectType != null) {
			setSubjectType(subjectType);
		}

		String subjectName = (String)attributes.get("subjectName");

		if (subjectName != null) {
			setSubjectName(subjectName);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String cityNo = (String)attributes.get("cityNo");

		if (cityNo != null) {
			setCityNo(cityNo);
		}

		String cityName = (String)attributes.get("cityName");

		if (cityName != null) {
			setCityName(cityName);
		}

		String districtNo = (String)attributes.get("districtNo");

		if (districtNo != null) {
			setDistrictNo(districtNo);
		}

		String districtName = (String)attributes.get("districtName");

		if (districtName != null) {
			setDistrictName(districtName);
		}

		String wardNo = (String)attributes.get("wardNo");

		if (wardNo != null) {
			setWardNo(wardNo);
		}

		String wardName = (String)attributes.get("wardName");

		if (wardName != null) {
			setWardName(wardName);
		}

		String telNo = (String)attributes.get("telNo");

		if (telNo != null) {
			setTelNo(telNo);
		}

		String contactPersonName = (String)attributes.get("contactPersonName");

		if (contactPersonName != null) {
			setContactPersonName(contactPersonName);
		}

		String contactPersonTel = (String)attributes.get("contactPersonTel");

		if (contactPersonTel != null) {
			setContactPersonTel(contactPersonTel);
		}

		String note = (String)attributes.get("note");

		if (note != null) {
			setNote(note);
		}

		String resumeDescription = (String)attributes.get("resumeDescription");

		if (resumeDescription != null) {
			setResumeDescription(resumeDescription);
		}

		String receptionNo = (String)attributes.get("receptionNo");

		if (receptionNo != null) {
			setReceptionNo(receptionNo);
		}

		Date submissionDate = (Date)attributes.get("submissionDate");

		if (submissionDate != null) {
			setSubmissionDate(submissionDate);
		}

		Date receptionDate = (Date)attributes.get("receptionDate");

		if (receptionDate != null) {
			setReceptionDate(receptionDate);
		}

		Date resubmissionDate = (Date)attributes.get("resubmissionDate");

		if (resubmissionDate != null) {
			setResubmissionDate(resubmissionDate);
		}

		Date appointmentDate = (Date)attributes.get("appointmentDate");

		if (appointmentDate != null) {
			setAppointmentDate(appointmentDate);
		}

		Date releaseDate = (Date)attributes.get("releaseDate");

		if (releaseDate != null) {
			setReleaseDate(releaseDate);
		}

		Date completionDate = (Date)attributes.get("completionDate");

		if (completionDate != null) {
			setCompletionDate(completionDate);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String statusDescription = (String)attributes.get("statusDescription");

		if (statusDescription != null) {
			setStatusDescription(statusDescription);
		}

		String feedbackNote = (String)attributes.get("feedbackNote");

		if (feedbackNote != null) {
			setFeedbackNote(feedbackNote);
		}

		Integer dirty = (Integer)attributes.get("dirty");

		if (dirty != null) {
			setDirty(dirty);
		}
	}

	/**
	* Returns the primary key of this dossier.
	*
	* @return the primary key of this dossier
	*/
	@Override
	public long getPrimaryKey() {
		return _dossier.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dossier.
	*
	* @param primaryKey the primary key of this dossier
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dossier.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this dossier.
	*
	* @return the uuid of this dossier
	*/
	@Override
	public java.lang.String getUuid() {
		return _dossier.getUuid();
	}

	/**
	* Sets the uuid of this dossier.
	*
	* @param uuid the uuid of this dossier
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_dossier.setUuid(uuid);
	}

	/**
	* Returns the dossier ID of this dossier.
	*
	* @return the dossier ID of this dossier
	*/
	@Override
	public long getDossierId() {
		return _dossier.getDossierId();
	}

	/**
	* Sets the dossier ID of this dossier.
	*
	* @param dossierId the dossier ID of this dossier
	*/
	@Override
	public void setDossierId(long dossierId) {
		_dossier.setDossierId(dossierId);
	}

	/**
	* Returns the user ID of this dossier.
	*
	* @return the user ID of this dossier
	*/
	@Override
	public long getUserId() {
		return _dossier.getUserId();
	}

	/**
	* Sets the user ID of this dossier.
	*
	* @param userId the user ID of this dossier
	*/
	@Override
	public void setUserId(long userId) {
		_dossier.setUserId(userId);
	}

	/**
	* Returns the user uuid of this dossier.
	*
	* @return the user uuid of this dossier
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossier.getUserUuid();
	}

	/**
	* Sets the user uuid of this dossier.
	*
	* @param userUuid the user uuid of this dossier
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_dossier.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this dossier.
	*
	* @return the group ID of this dossier
	*/
	@Override
	public long getGroupId() {
		return _dossier.getGroupId();
	}

	/**
	* Sets the group ID of this dossier.
	*
	* @param groupId the group ID of this dossier
	*/
	@Override
	public void setGroupId(long groupId) {
		_dossier.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this dossier.
	*
	* @return the company ID of this dossier
	*/
	@Override
	public long getCompanyId() {
		return _dossier.getCompanyId();
	}

	/**
	* Sets the company ID of this dossier.
	*
	* @param companyId the company ID of this dossier
	*/
	@Override
	public void setCompanyId(long companyId) {
		_dossier.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this dossier.
	*
	* @return the create date of this dossier
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _dossier.getCreateDate();
	}

	/**
	* Sets the create date of this dossier.
	*
	* @param createDate the create date of this dossier
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_dossier.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this dossier.
	*
	* @return the modified date of this dossier
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dossier.getModifiedDate();
	}

	/**
	* Sets the modified date of this dossier.
	*
	* @param modifiedDate the modified date of this dossier
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dossier.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the organization ID of this dossier.
	*
	* @return the organization ID of this dossier
	*/
	@Override
	public long getOrganizationId() {
		return _dossier.getOrganizationId();
	}

	/**
	* Sets the organization ID of this dossier.
	*
	* @param organizationId the organization ID of this dossier
	*/
	@Override
	public void setOrganizationId(long organizationId) {
		_dossier.setOrganizationId(organizationId);
	}

	/**
	* Returns the dossier proc ID of this dossier.
	*
	* @return the dossier proc ID of this dossier
	*/
	@Override
	public long getDossierProcId() {
		return _dossier.getDossierProcId();
	}

	/**
	* Sets the dossier proc ID of this dossier.
	*
	* @param dossierProcId the dossier proc ID of this dossier
	*/
	@Override
	public void setDossierProcId(long dossierProcId) {
		_dossier.setDossierProcId(dossierProcId);
	}

	/**
	* Returns the gov agent ID of this dossier.
	*
	* @return the gov agent ID of this dossier
	*/
	@Override
	public java.lang.String getGovAgentId() {
		return _dossier.getGovAgentId();
	}

	/**
	* Sets the gov agent ID of this dossier.
	*
	* @param govAgentId the gov agent ID of this dossier
	*/
	@Override
	public void setGovAgentId(java.lang.String govAgentId) {
		_dossier.setGovAgentId(govAgentId);
	}

	/**
	* Returns the gov agent name of this dossier.
	*
	* @return the gov agent name of this dossier
	*/
	@Override
	public java.lang.String getGovAgentName() {
		return _dossier.getGovAgentName();
	}

	/**
	* Sets the gov agent name of this dossier.
	*
	* @param govAgentName the gov agent name of this dossier
	*/
	@Override
	public void setGovAgentName(java.lang.String govAgentName) {
		_dossier.setGovAgentName(govAgentName);
	}

	/**
	* Returns the subject ID of this dossier.
	*
	* @return the subject ID of this dossier
	*/
	@Override
	public java.lang.String getSubjectId() {
		return _dossier.getSubjectId();
	}

	/**
	* Sets the subject ID of this dossier.
	*
	* @param subjectId the subject ID of this dossier
	*/
	@Override
	public void setSubjectId(java.lang.String subjectId) {
		_dossier.setSubjectId(subjectId);
	}

	/**
	* Returns the subject type of this dossier.
	*
	* @return the subject type of this dossier
	*/
	@Override
	public java.lang.String getSubjectType() {
		return _dossier.getSubjectType();
	}

	/**
	* Sets the subject type of this dossier.
	*
	* @param subjectType the subject type of this dossier
	*/
	@Override
	public void setSubjectType(java.lang.String subjectType) {
		_dossier.setSubjectType(subjectType);
	}

	/**
	* Returns the subject name of this dossier.
	*
	* @return the subject name of this dossier
	*/
	@Override
	public java.lang.String getSubjectName() {
		return _dossier.getSubjectName();
	}

	/**
	* Sets the subject name of this dossier.
	*
	* @param subjectName the subject name of this dossier
	*/
	@Override
	public void setSubjectName(java.lang.String subjectName) {
		_dossier.setSubjectName(subjectName);
	}

	/**
	* Returns the address of this dossier.
	*
	* @return the address of this dossier
	*/
	@Override
	public java.lang.String getAddress() {
		return _dossier.getAddress();
	}

	/**
	* Sets the address of this dossier.
	*
	* @param address the address of this dossier
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_dossier.setAddress(address);
	}

	/**
	* Returns the city no of this dossier.
	*
	* @return the city no of this dossier
	*/
	@Override
	public java.lang.String getCityNo() {
		return _dossier.getCityNo();
	}

	/**
	* Sets the city no of this dossier.
	*
	* @param cityNo the city no of this dossier
	*/
	@Override
	public void setCityNo(java.lang.String cityNo) {
		_dossier.setCityNo(cityNo);
	}

	/**
	* Returns the city name of this dossier.
	*
	* @return the city name of this dossier
	*/
	@Override
	public java.lang.String getCityName() {
		return _dossier.getCityName();
	}

	/**
	* Sets the city name of this dossier.
	*
	* @param cityName the city name of this dossier
	*/
	@Override
	public void setCityName(java.lang.String cityName) {
		_dossier.setCityName(cityName);
	}

	/**
	* Returns the district no of this dossier.
	*
	* @return the district no of this dossier
	*/
	@Override
	public java.lang.String getDistrictNo() {
		return _dossier.getDistrictNo();
	}

	/**
	* Sets the district no of this dossier.
	*
	* @param districtNo the district no of this dossier
	*/
	@Override
	public void setDistrictNo(java.lang.String districtNo) {
		_dossier.setDistrictNo(districtNo);
	}

	/**
	* Returns the district name of this dossier.
	*
	* @return the district name of this dossier
	*/
	@Override
	public java.lang.String getDistrictName() {
		return _dossier.getDistrictName();
	}

	/**
	* Sets the district name of this dossier.
	*
	* @param districtName the district name of this dossier
	*/
	@Override
	public void setDistrictName(java.lang.String districtName) {
		_dossier.setDistrictName(districtName);
	}

	/**
	* Returns the ward no of this dossier.
	*
	* @return the ward no of this dossier
	*/
	@Override
	public java.lang.String getWardNo() {
		return _dossier.getWardNo();
	}

	/**
	* Sets the ward no of this dossier.
	*
	* @param wardNo the ward no of this dossier
	*/
	@Override
	public void setWardNo(java.lang.String wardNo) {
		_dossier.setWardNo(wardNo);
	}

	/**
	* Returns the ward name of this dossier.
	*
	* @return the ward name of this dossier
	*/
	@Override
	public java.lang.String getWardName() {
		return _dossier.getWardName();
	}

	/**
	* Sets the ward name of this dossier.
	*
	* @param wardName the ward name of this dossier
	*/
	@Override
	public void setWardName(java.lang.String wardName) {
		_dossier.setWardName(wardName);
	}

	/**
	* Returns the tel no of this dossier.
	*
	* @return the tel no of this dossier
	*/
	@Override
	public java.lang.String getTelNo() {
		return _dossier.getTelNo();
	}

	/**
	* Sets the tel no of this dossier.
	*
	* @param telNo the tel no of this dossier
	*/
	@Override
	public void setTelNo(java.lang.String telNo) {
		_dossier.setTelNo(telNo);
	}

	/**
	* Returns the contact person name of this dossier.
	*
	* @return the contact person name of this dossier
	*/
	@Override
	public java.lang.String getContactPersonName() {
		return _dossier.getContactPersonName();
	}

	/**
	* Sets the contact person name of this dossier.
	*
	* @param contactPersonName the contact person name of this dossier
	*/
	@Override
	public void setContactPersonName(java.lang.String contactPersonName) {
		_dossier.setContactPersonName(contactPersonName);
	}

	/**
	* Returns the contact person tel of this dossier.
	*
	* @return the contact person tel of this dossier
	*/
	@Override
	public java.lang.String getContactPersonTel() {
		return _dossier.getContactPersonTel();
	}

	/**
	* Sets the contact person tel of this dossier.
	*
	* @param contactPersonTel the contact person tel of this dossier
	*/
	@Override
	public void setContactPersonTel(java.lang.String contactPersonTel) {
		_dossier.setContactPersonTel(contactPersonTel);
	}

	/**
	* Returns the note of this dossier.
	*
	* @return the note of this dossier
	*/
	@Override
	public java.lang.String getNote() {
		return _dossier.getNote();
	}

	/**
	* Sets the note of this dossier.
	*
	* @param note the note of this dossier
	*/
	@Override
	public void setNote(java.lang.String note) {
		_dossier.setNote(note);
	}

	/**
	* Returns the resume description of this dossier.
	*
	* @return the resume description of this dossier
	*/
	@Override
	public java.lang.String getResumeDescription() {
		return _dossier.getResumeDescription();
	}

	/**
	* Sets the resume description of this dossier.
	*
	* @param resumeDescription the resume description of this dossier
	*/
	@Override
	public void setResumeDescription(java.lang.String resumeDescription) {
		_dossier.setResumeDescription(resumeDescription);
	}

	/**
	* Returns the reception no of this dossier.
	*
	* @return the reception no of this dossier
	*/
	@Override
	public java.lang.String getReceptionNo() {
		return _dossier.getReceptionNo();
	}

	/**
	* Sets the reception no of this dossier.
	*
	* @param receptionNo the reception no of this dossier
	*/
	@Override
	public void setReceptionNo(java.lang.String receptionNo) {
		_dossier.setReceptionNo(receptionNo);
	}

	/**
	* Returns the submission date of this dossier.
	*
	* @return the submission date of this dossier
	*/
	@Override
	public java.util.Date getSubmissionDate() {
		return _dossier.getSubmissionDate();
	}

	/**
	* Sets the submission date of this dossier.
	*
	* @param submissionDate the submission date of this dossier
	*/
	@Override
	public void setSubmissionDate(java.util.Date submissionDate) {
		_dossier.setSubmissionDate(submissionDate);
	}

	/**
	* Returns the reception date of this dossier.
	*
	* @return the reception date of this dossier
	*/
	@Override
	public java.util.Date getReceptionDate() {
		return _dossier.getReceptionDate();
	}

	/**
	* Sets the reception date of this dossier.
	*
	* @param receptionDate the reception date of this dossier
	*/
	@Override
	public void setReceptionDate(java.util.Date receptionDate) {
		_dossier.setReceptionDate(receptionDate);
	}

	/**
	* Returns the resubmission date of this dossier.
	*
	* @return the resubmission date of this dossier
	*/
	@Override
	public java.util.Date getResubmissionDate() {
		return _dossier.getResubmissionDate();
	}

	/**
	* Sets the resubmission date of this dossier.
	*
	* @param resubmissionDate the resubmission date of this dossier
	*/
	@Override
	public void setResubmissionDate(java.util.Date resubmissionDate) {
		_dossier.setResubmissionDate(resubmissionDate);
	}

	/**
	* Returns the appointment date of this dossier.
	*
	* @return the appointment date of this dossier
	*/
	@Override
	public java.util.Date getAppointmentDate() {
		return _dossier.getAppointmentDate();
	}

	/**
	* Sets the appointment date of this dossier.
	*
	* @param appointmentDate the appointment date of this dossier
	*/
	@Override
	public void setAppointmentDate(java.util.Date appointmentDate) {
		_dossier.setAppointmentDate(appointmentDate);
	}

	/**
	* Returns the release date of this dossier.
	*
	* @return the release date of this dossier
	*/
	@Override
	public java.util.Date getReleaseDate() {
		return _dossier.getReleaseDate();
	}

	/**
	* Sets the release date of this dossier.
	*
	* @param releaseDate the release date of this dossier
	*/
	@Override
	public void setReleaseDate(java.util.Date releaseDate) {
		_dossier.setReleaseDate(releaseDate);
	}

	/**
	* Returns the completion date of this dossier.
	*
	* @return the completion date of this dossier
	*/
	@Override
	public java.util.Date getCompletionDate() {
		return _dossier.getCompletionDate();
	}

	/**
	* Sets the completion date of this dossier.
	*
	* @param completionDate the completion date of this dossier
	*/
	@Override
	public void setCompletionDate(java.util.Date completionDate) {
		_dossier.setCompletionDate(completionDate);
	}

	/**
	* Returns the status of this dossier.
	*
	* @return the status of this dossier
	*/
	@Override
	public java.lang.String getStatus() {
		return _dossier.getStatus();
	}

	/**
	* Sets the status of this dossier.
	*
	* @param status the status of this dossier
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_dossier.setStatus(status);
	}

	/**
	* Returns the status description of this dossier.
	*
	* @return the status description of this dossier
	*/
	@Override
	public java.lang.String getStatusDescription() {
		return _dossier.getStatusDescription();
	}

	/**
	* Sets the status description of this dossier.
	*
	* @param statusDescription the status description of this dossier
	*/
	@Override
	public void setStatusDescription(java.lang.String statusDescription) {
		_dossier.setStatusDescription(statusDescription);
	}

	/**
	* Returns the feedback note of this dossier.
	*
	* @return the feedback note of this dossier
	*/
	@Override
	public java.lang.String getFeedbackNote() {
		return _dossier.getFeedbackNote();
	}

	/**
	* Sets the feedback note of this dossier.
	*
	* @param feedbackNote the feedback note of this dossier
	*/
	@Override
	public void setFeedbackNote(java.lang.String feedbackNote) {
		_dossier.setFeedbackNote(feedbackNote);
	}

	/**
	* Returns the dirty of this dossier.
	*
	* @return the dirty of this dossier
	*/
	@Override
	public int getDirty() {
		return _dossier.getDirty();
	}

	/**
	* Sets the dirty of this dossier.
	*
	* @param dirty the dirty of this dossier
	*/
	@Override
	public void setDirty(int dirty) {
		_dossier.setDirty(dirty);
	}

	@Override
	public boolean isNew() {
		return _dossier.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dossier.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dossier.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dossier.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dossier.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dossier.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dossier.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dossier.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dossier.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dossier.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dossier.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DossierWrapper((Dossier)_dossier.clone());
	}

	@Override
	public int compareTo(org.oep.core.dossiermgt.model.Dossier dossier) {
		return _dossier.compareTo(dossier);
	}

	@Override
	public int hashCode() {
		return _dossier.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.core.dossiermgt.model.Dossier> toCacheModel() {
		return _dossier.toCacheModel();
	}

	@Override
	public org.oep.core.dossiermgt.model.Dossier toEscapedModel() {
		return new DossierWrapper(_dossier.toEscapedModel());
	}

	@Override
	public org.oep.core.dossiermgt.model.Dossier toUnescapedModel() {
		return new DossierWrapper(_dossier.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dossier.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dossier.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dossier.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DossierWrapper)) {
			return false;
		}

		DossierWrapper dossierWrapper = (DossierWrapper)obj;

		if (Validator.equals(_dossier, dossierWrapper._dossier)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _dossier.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Dossier getWrappedDossier() {
		return _dossier;
	}

	@Override
	public Dossier getWrappedModel() {
		return _dossier;
	}

	@Override
	public void resetOriginalValues() {
		_dossier.resetOriginalValues();
	}

	private Dossier _dossier;
}