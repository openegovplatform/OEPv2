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
		attributes.put("govAgentNo", getGovAgentNo());
		attributes.put("govAgentName", getGovAgentName());
		attributes.put("submitterName", getSubmitterName());
		attributes.put("actorType", getActorType());
		attributes.put("actorNo", getActorNo());
		attributes.put("actorName", getActorName());
		attributes.put("address", getAddress());
		attributes.put("cityNo", getCityNo());
		attributes.put("cityName", getCityName());
		attributes.put("districtNo", getDistrictNo());
		attributes.put("districtName", getDistrictName());
		attributes.put("wardNo", getWardNo());
		attributes.put("wardName", getWardName());
		attributes.put("description", getDescription());
		attributes.put("note", getNote());
		attributes.put("receptionNo", getReceptionNo());
		attributes.put("submissionDate", getSubmissionDate());
		attributes.put("receptionDate", getReceptionDate());
		attributes.put("resubmissionDate", getResubmissionDate());
		attributes.put("appointmentDate", getAppointmentDate());
		attributes.put("releaseDate", getReleaseDate());
		attributes.put("completionDate", getCompletionDate());
		attributes.put("status", getStatus());
		attributes.put("statusName", getStatusName());
		attributes.put("feedbackNote", getFeedbackNote());
		attributes.put("paymentConfirmed", getPaymentConfirmed());

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

		String govAgentNo = (String)attributes.get("govAgentNo");

		if (govAgentNo != null) {
			setGovAgentNo(govAgentNo);
		}

		String govAgentName = (String)attributes.get("govAgentName");

		if (govAgentName != null) {
			setGovAgentName(govAgentName);
		}

		String submitterName = (String)attributes.get("submitterName");

		if (submitterName != null) {
			setSubmitterName(submitterName);
		}

		Integer actorType = (Integer)attributes.get("actorType");

		if (actorType != null) {
			setActorType(actorType);
		}

		String actorNo = (String)attributes.get("actorNo");

		if (actorNo != null) {
			setActorNo(actorNo);
		}

		String actorName = (String)attributes.get("actorName");

		if (actorName != null) {
			setActorName(actorName);
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

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String note = (String)attributes.get("note");

		if (note != null) {
			setNote(note);
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

		String statusName = (String)attributes.get("statusName");

		if (statusName != null) {
			setStatusName(statusName);
		}

		String feedbackNote = (String)attributes.get("feedbackNote");

		if (feedbackNote != null) {
			setFeedbackNote(feedbackNote);
		}

		Integer paymentConfirmed = (Integer)attributes.get("paymentConfirmed");

		if (paymentConfirmed != null) {
			setPaymentConfirmed(paymentConfirmed);
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
	* Returns the gov agent no of this dossier.
	*
	* @return the gov agent no of this dossier
	*/
	@Override
	public java.lang.String getGovAgentNo() {
		return _dossier.getGovAgentNo();
	}

	/**
	* Sets the gov agent no of this dossier.
	*
	* @param govAgentNo the gov agent no of this dossier
	*/
	@Override
	public void setGovAgentNo(java.lang.String govAgentNo) {
		_dossier.setGovAgentNo(govAgentNo);
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
	* Returns the submitter name of this dossier.
	*
	* @return the submitter name of this dossier
	*/
	@Override
	public java.lang.String getSubmitterName() {
		return _dossier.getSubmitterName();
	}

	/**
	* Sets the submitter name of this dossier.
	*
	* @param submitterName the submitter name of this dossier
	*/
	@Override
	public void setSubmitterName(java.lang.String submitterName) {
		_dossier.setSubmitterName(submitterName);
	}

	/**
	* Returns the actor type of this dossier.
	*
	* @return the actor type of this dossier
	*/
	@Override
	public int getActorType() {
		return _dossier.getActorType();
	}

	/**
	* Sets the actor type of this dossier.
	*
	* @param actorType the actor type of this dossier
	*/
	@Override
	public void setActorType(int actorType) {
		_dossier.setActorType(actorType);
	}

	/**
	* Returns the actor no of this dossier.
	*
	* @return the actor no of this dossier
	*/
	@Override
	public java.lang.String getActorNo() {
		return _dossier.getActorNo();
	}

	/**
	* Sets the actor no of this dossier.
	*
	* @param actorNo the actor no of this dossier
	*/
	@Override
	public void setActorNo(java.lang.String actorNo) {
		_dossier.setActorNo(actorNo);
	}

	/**
	* Returns the actor name of this dossier.
	*
	* @return the actor name of this dossier
	*/
	@Override
	public java.lang.String getActorName() {
		return _dossier.getActorName();
	}

	/**
	* Sets the actor name of this dossier.
	*
	* @param actorName the actor name of this dossier
	*/
	@Override
	public void setActorName(java.lang.String actorName) {
		_dossier.setActorName(actorName);
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
	* Returns the description of this dossier.
	*
	* @return the description of this dossier
	*/
	@Override
	public java.lang.String getDescription() {
		return _dossier.getDescription();
	}

	/**
	* Sets the description of this dossier.
	*
	* @param description the description of this dossier
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_dossier.setDescription(description);
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
	* Returns the status name of this dossier.
	*
	* @return the status name of this dossier
	*/
	@Override
	public java.lang.String getStatusName() {
		return _dossier.getStatusName();
	}

	/**
	* Sets the status name of this dossier.
	*
	* @param statusName the status name of this dossier
	*/
	@Override
	public void setStatusName(java.lang.String statusName) {
		_dossier.setStatusName(statusName);
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
	* Returns the payment confirmed of this dossier.
	*
	* @return the payment confirmed of this dossier
	*/
	@Override
	public int getPaymentConfirmed() {
		return _dossier.getPaymentConfirmed();
	}

	/**
	* Sets the payment confirmed of this dossier.
	*
	* @param paymentConfirmed the payment confirmed of this dossier
	*/
	@Override
	public void setPaymentConfirmed(int paymentConfirmed) {
		_dossier.setPaymentConfirmed(paymentConfirmed);
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
	public int compareTo(Dossier dossier) {
		return _dossier.compareTo(dossier);
	}

	@Override
	public int hashCode() {
		return _dossier.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<Dossier> toCacheModel() {
		return _dossier.toCacheModel();
	}

	@Override
	public Dossier toEscapedModel() {
		return new DossierWrapper(_dossier.toEscapedModel());
	}

	@Override
	public Dossier toUnescapedModel() {
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