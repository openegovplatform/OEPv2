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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import org.oep.core.dossiermgt.service.ClpSerializer;
import org.oep.core.dossiermgt.service.DossierLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class DossierClp extends BaseModelImpl<Dossier> implements Dossier {
	public DossierClp() {
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
	public long getPrimaryKey() {
		return _dossierId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDossierId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dossierId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_dossierRemoteModel, uuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDossierId() {
		return _dossierId;
	}

	@Override
	public void setDossierId(long dossierId) {
		_dossierId = dossierId;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierId", long.class);

				method.invoke(_dossierRemoteModel, dossierId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_dossierRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_dossierRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_dossierRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_dossierRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dossierRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getOrganizationId() {
		return _organizationId;
	}

	@Override
	public void setOrganizationId(long organizationId) {
		_organizationId = organizationId;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setOrganizationId", long.class);

				method.invoke(_dossierRemoteModel, organizationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDossierProcId() {
		return _dossierProcId;
	}

	@Override
	public void setDossierProcId(long dossierProcId) {
		_dossierProcId = dossierProcId;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierProcId", long.class);

				method.invoke(_dossierRemoteModel, dossierProcId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGovAgentNo() {
		return _govAgentNo;
	}

	@Override
	public void setGovAgentNo(String govAgentNo) {
		_govAgentNo = govAgentNo;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setGovAgentNo", String.class);

				method.invoke(_dossierRemoteModel, govAgentNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGovAgentName() {
		return _govAgentName;
	}

	@Override
	public void setGovAgentName(String govAgentName) {
		_govAgentName = govAgentName;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setGovAgentName", String.class);

				method.invoke(_dossierRemoteModel, govAgentName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSubmitterName() {
		return _submitterName;
	}

	@Override
	public void setSubmitterName(String submitterName) {
		_submitterName = submitterName;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setSubmitterName", String.class);

				method.invoke(_dossierRemoteModel, submitterName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getActorType() {
		return _actorType;
	}

	@Override
	public void setActorType(int actorType) {
		_actorType = actorType;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setActorType", int.class);

				method.invoke(_dossierRemoteModel, actorType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getActorNo() {
		return _actorNo;
	}

	@Override
	public void setActorNo(String actorNo) {
		_actorNo = actorNo;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setActorNo", String.class);

				method.invoke(_dossierRemoteModel, actorNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getActorName() {
		return _actorName;
	}

	@Override
	public void setActorName(String actorName) {
		_actorName = actorName;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setActorName", String.class);

				method.invoke(_dossierRemoteModel, actorName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddress() {
		return _address;
	}

	@Override
	public void setAddress(String address) {
		_address = address;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setAddress", String.class);

				method.invoke(_dossierRemoteModel, address);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCityNo() {
		return _cityNo;
	}

	@Override
	public void setCityNo(String cityNo) {
		_cityNo = cityNo;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setCityNo", String.class);

				method.invoke(_dossierRemoteModel, cityNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCityName() {
		return _cityName;
	}

	@Override
	public void setCityName(String cityName) {
		_cityName = cityName;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setCityName", String.class);

				method.invoke(_dossierRemoteModel, cityName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDistrictNo() {
		return _districtNo;
	}

	@Override
	public void setDistrictNo(String districtNo) {
		_districtNo = districtNo;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setDistrictNo", String.class);

				method.invoke(_dossierRemoteModel, districtNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDistrictName() {
		return _districtName;
	}

	@Override
	public void setDistrictName(String districtName) {
		_districtName = districtName;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setDistrictName", String.class);

				method.invoke(_dossierRemoteModel, districtName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getWardNo() {
		return _wardNo;
	}

	@Override
	public void setWardNo(String wardNo) {
		_wardNo = wardNo;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setWardNo", String.class);

				method.invoke(_dossierRemoteModel, wardNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getWardName() {
		return _wardName;
	}

	@Override
	public void setWardName(String wardName) {
		_wardName = wardName;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setWardName", String.class);

				method.invoke(_dossierRemoteModel, wardName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_dossierRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNote() {
		return _note;
	}

	@Override
	public void setNote(String note) {
		_note = note;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setNote", String.class);

				method.invoke(_dossierRemoteModel, note);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReceptionNo() {
		return _receptionNo;
	}

	@Override
	public void setReceptionNo(String receptionNo) {
		_receptionNo = receptionNo;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setReceptionNo", String.class);

				method.invoke(_dossierRemoteModel, receptionNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSubmissionDate() {
		return _submissionDate;
	}

	@Override
	public void setSubmissionDate(Date submissionDate) {
		_submissionDate = submissionDate;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setSubmissionDate", Date.class);

				method.invoke(_dossierRemoteModel, submissionDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getReceptionDate() {
		return _receptionDate;
	}

	@Override
	public void setReceptionDate(Date receptionDate) {
		_receptionDate = receptionDate;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setReceptionDate", Date.class);

				method.invoke(_dossierRemoteModel, receptionDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getResubmissionDate() {
		return _resubmissionDate;
	}

	@Override
	public void setResubmissionDate(Date resubmissionDate) {
		_resubmissionDate = resubmissionDate;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setResubmissionDate",
						Date.class);

				method.invoke(_dossierRemoteModel, resubmissionDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getAppointmentDate() {
		return _appointmentDate;
	}

	@Override
	public void setAppointmentDate(Date appointmentDate) {
		_appointmentDate = appointmentDate;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setAppointmentDate", Date.class);

				method.invoke(_dossierRemoteModel, appointmentDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getReleaseDate() {
		return _releaseDate;
	}

	@Override
	public void setReleaseDate(Date releaseDate) {
		_releaseDate = releaseDate;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setReleaseDate", Date.class);

				method.invoke(_dossierRemoteModel, releaseDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCompletionDate() {
		return _completionDate;
	}

	@Override
	public void setCompletionDate(Date completionDate) {
		_completionDate = completionDate;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setCompletionDate", Date.class);

				method.invoke(_dossierRemoteModel, completionDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatus() {
		return _status;
	}

	@Override
	public void setStatus(String status) {
		_status = status;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", String.class);

				method.invoke(_dossierRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatusName() {
		return _statusName;
	}

	@Override
	public void setStatusName(String statusName) {
		_statusName = statusName;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setStatusName", String.class);

				method.invoke(_dossierRemoteModel, statusName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFeedbackNote() {
		return _feedbackNote;
	}

	@Override
	public void setFeedbackNote(String feedbackNote) {
		_feedbackNote = feedbackNote;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setFeedbackNote", String.class);

				method.invoke(_dossierRemoteModel, feedbackNote);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPaymentConfirmed() {
		return _paymentConfirmed;
	}

	@Override
	public void setPaymentConfirmed(int paymentConfirmed) {
		_paymentConfirmed = paymentConfirmed;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setPaymentConfirmed", int.class);

				method.invoke(_dossierRemoteModel, paymentConfirmed);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				Dossier.class.getName()));
	}

	public BaseModel<?> getDossierRemoteModel() {
		return _dossierRemoteModel;
	}

	public void setDossierRemoteModel(BaseModel<?> dossierRemoteModel) {
		_dossierRemoteModel = dossierRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _dossierRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_dossierRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DossierLocalServiceUtil.addDossier(this);
		}
		else {
			DossierLocalServiceUtil.updateDossier(this);
		}
	}

	@Override
	public Dossier toEscapedModel() {
		return (Dossier)ProxyUtil.newProxyInstance(Dossier.class.getClassLoader(),
			new Class[] { Dossier.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DossierClp clone = new DossierClp();

		clone.setUuid(getUuid());
		clone.setDossierId(getDossierId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setOrganizationId(getOrganizationId());
		clone.setDossierProcId(getDossierProcId());
		clone.setGovAgentNo(getGovAgentNo());
		clone.setGovAgentName(getGovAgentName());
		clone.setSubmitterName(getSubmitterName());
		clone.setActorType(getActorType());
		clone.setActorNo(getActorNo());
		clone.setActorName(getActorName());
		clone.setAddress(getAddress());
		clone.setCityNo(getCityNo());
		clone.setCityName(getCityName());
		clone.setDistrictNo(getDistrictNo());
		clone.setDistrictName(getDistrictName());
		clone.setWardNo(getWardNo());
		clone.setWardName(getWardName());
		clone.setDescription(getDescription());
		clone.setNote(getNote());
		clone.setReceptionNo(getReceptionNo());
		clone.setSubmissionDate(getSubmissionDate());
		clone.setReceptionDate(getReceptionDate());
		clone.setResubmissionDate(getResubmissionDate());
		clone.setAppointmentDate(getAppointmentDate());
		clone.setReleaseDate(getReleaseDate());
		clone.setCompletionDate(getCompletionDate());
		clone.setStatus(getStatus());
		clone.setStatusName(getStatusName());
		clone.setFeedbackNote(getFeedbackNote());
		clone.setPaymentConfirmed(getPaymentConfirmed());

		return clone;
	}

	@Override
	public int compareTo(Dossier dossier) {
		long primaryKey = dossier.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DossierClp)) {
			return false;
		}

		DossierClp dossier = (DossierClp)obj;

		long primaryKey = dossier.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(71);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", dossierId=");
		sb.append(getDossierId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", organizationId=");
		sb.append(getOrganizationId());
		sb.append(", dossierProcId=");
		sb.append(getDossierProcId());
		sb.append(", govAgentNo=");
		sb.append(getGovAgentNo());
		sb.append(", govAgentName=");
		sb.append(getGovAgentName());
		sb.append(", submitterName=");
		sb.append(getSubmitterName());
		sb.append(", actorType=");
		sb.append(getActorType());
		sb.append(", actorNo=");
		sb.append(getActorNo());
		sb.append(", actorName=");
		sb.append(getActorName());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", cityNo=");
		sb.append(getCityNo());
		sb.append(", cityName=");
		sb.append(getCityName());
		sb.append(", districtNo=");
		sb.append(getDistrictNo());
		sb.append(", districtName=");
		sb.append(getDistrictName());
		sb.append(", wardNo=");
		sb.append(getWardNo());
		sb.append(", wardName=");
		sb.append(getWardName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", note=");
		sb.append(getNote());
		sb.append(", receptionNo=");
		sb.append(getReceptionNo());
		sb.append(", submissionDate=");
		sb.append(getSubmissionDate());
		sb.append(", receptionDate=");
		sb.append(getReceptionDate());
		sb.append(", resubmissionDate=");
		sb.append(getResubmissionDate());
		sb.append(", appointmentDate=");
		sb.append(getAppointmentDate());
		sb.append(", releaseDate=");
		sb.append(getReleaseDate());
		sb.append(", completionDate=");
		sb.append(getCompletionDate());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", statusName=");
		sb.append(getStatusName());
		sb.append(", feedbackNote=");
		sb.append(getFeedbackNote());
		sb.append(", paymentConfirmed=");
		sb.append(getPaymentConfirmed());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(109);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.dossiermgt.model.Dossier");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierId</column-name><column-value><![CDATA[");
		sb.append(getDossierId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizationId</column-name><column-value><![CDATA[");
		sb.append(getOrganizationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierProcId</column-name><column-value><![CDATA[");
		sb.append(getDossierProcId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>govAgentNo</column-name><column-value><![CDATA[");
		sb.append(getGovAgentNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>govAgentName</column-name><column-value><![CDATA[");
		sb.append(getGovAgentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>submitterName</column-name><column-value><![CDATA[");
		sb.append(getSubmitterName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actorType</column-name><column-value><![CDATA[");
		sb.append(getActorType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actorNo</column-name><column-value><![CDATA[");
		sb.append(getActorNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actorName</column-name><column-value><![CDATA[");
		sb.append(getActorName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cityNo</column-name><column-value><![CDATA[");
		sb.append(getCityNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cityName</column-name><column-value><![CDATA[");
		sb.append(getCityName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>districtNo</column-name><column-value><![CDATA[");
		sb.append(getDistrictNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>districtName</column-name><column-value><![CDATA[");
		sb.append(getDistrictName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wardNo</column-name><column-value><![CDATA[");
		sb.append(getWardNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wardName</column-name><column-value><![CDATA[");
		sb.append(getWardName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>note</column-name><column-value><![CDATA[");
		sb.append(getNote());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>receptionNo</column-name><column-value><![CDATA[");
		sb.append(getReceptionNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>submissionDate</column-name><column-value><![CDATA[");
		sb.append(getSubmissionDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>receptionDate</column-name><column-value><![CDATA[");
		sb.append(getReceptionDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>resubmissionDate</column-name><column-value><![CDATA[");
		sb.append(getResubmissionDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>appointmentDate</column-name><column-value><![CDATA[");
		sb.append(getAppointmentDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>releaseDate</column-name><column-value><![CDATA[");
		sb.append(getReleaseDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>completionDate</column-name><column-value><![CDATA[");
		sb.append(getCompletionDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusName</column-name><column-value><![CDATA[");
		sb.append(getStatusName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>feedbackNote</column-name><column-value><![CDATA[");
		sb.append(getFeedbackNote());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>paymentConfirmed</column-name><column-value><![CDATA[");
		sb.append(getPaymentConfirmed());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _dossierId;
	private long _userId;
	private String _userUuid;
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
	private BaseModel<?> _dossierRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.dossiermgt.service.ClpSerializer.class;
}