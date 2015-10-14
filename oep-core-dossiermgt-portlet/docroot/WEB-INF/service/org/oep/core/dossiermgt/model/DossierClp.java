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
		attributes.put("govAgencyId", getGovAgencyId());
		attributes.put("govAgencyName", getGovAgencyName());
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
		attributes.put("submitDate", getSubmitDate());
		attributes.put("receiveDate", getReceiveDate());
		attributes.put("renewDate", getRenewDate());
		attributes.put("estimateDate", getEstimateDate());
		attributes.put("finishDate", getFinishDate());
		attributes.put("returnDate", getReturnDate());
		attributes.put("status", getStatus());
		attributes.put("statusDate", getStatusDate());
		attributes.put("statusDescription", getStatusDescription());
		attributes.put("feedbackNote", getFeedbackNote());
		attributes.put("daysDelay", getDaysDelay());
		attributes.put("closeDate", getCloseDate());
		attributes.put("errorStatus", getErrorStatus());
		attributes.put("pendingStatus", getPendingStatus());
		attributes.put("errorCode", getErrorCode());
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

		String govAgencyId = (String)attributes.get("govAgencyId");

		if (govAgencyId != null) {
			setGovAgencyId(govAgencyId);
		}

		String govAgencyName = (String)attributes.get("govAgencyName");

		if (govAgencyName != null) {
			setGovAgencyName(govAgencyName);
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

		Date submitDate = (Date)attributes.get("submitDate");

		if (submitDate != null) {
			setSubmitDate(submitDate);
		}

		Date receiveDate = (Date)attributes.get("receiveDate");

		if (receiveDate != null) {
			setReceiveDate(receiveDate);
		}

		Date renewDate = (Date)attributes.get("renewDate");

		if (renewDate != null) {
			setRenewDate(renewDate);
		}

		Date estimateDate = (Date)attributes.get("estimateDate");

		if (estimateDate != null) {
			setEstimateDate(estimateDate);
		}

		Date finishDate = (Date)attributes.get("finishDate");

		if (finishDate != null) {
			setFinishDate(finishDate);
		}

		Date returnDate = (Date)attributes.get("returnDate");

		if (returnDate != null) {
			setReturnDate(returnDate);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}

		String statusDescription = (String)attributes.get("statusDescription");

		if (statusDescription != null) {
			setStatusDescription(statusDescription);
		}

		String feedbackNote = (String)attributes.get("feedbackNote");

		if (feedbackNote != null) {
			setFeedbackNote(feedbackNote);
		}

		Integer daysDelay = (Integer)attributes.get("daysDelay");

		if (daysDelay != null) {
			setDaysDelay(daysDelay);
		}

		Date closeDate = (Date)attributes.get("closeDate");

		if (closeDate != null) {
			setCloseDate(closeDate);
		}

		String errorStatus = (String)attributes.get("errorStatus");

		if (errorStatus != null) {
			setErrorStatus(errorStatus);
		}

		Integer pendingStatus = (Integer)attributes.get("pendingStatus");

		if (pendingStatus != null) {
			setPendingStatus(pendingStatus);
		}

		String errorCode = (String)attributes.get("errorCode");

		if (errorCode != null) {
			setErrorCode(errorCode);
		}

		Integer dirty = (Integer)attributes.get("dirty");

		if (dirty != null) {
			setDirty(dirty);
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
	public String getGovAgencyId() {
		return _govAgencyId;
	}

	@Override
	public void setGovAgencyId(String govAgencyId) {
		_govAgencyId = govAgencyId;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setGovAgencyId", String.class);

				method.invoke(_dossierRemoteModel, govAgencyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGovAgencyName() {
		return _govAgencyName;
	}

	@Override
	public void setGovAgencyName(String govAgencyName) {
		_govAgencyName = govAgencyName;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setGovAgencyName", String.class);

				method.invoke(_dossierRemoteModel, govAgencyName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSubjectId() {
		return _subjectId;
	}

	@Override
	public void setSubjectId(String subjectId) {
		_subjectId = subjectId;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setSubjectId", String.class);

				method.invoke(_dossierRemoteModel, subjectId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSubjectType() {
		return _subjectType;
	}

	@Override
	public void setSubjectType(String subjectType) {
		_subjectType = subjectType;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setSubjectType", String.class);

				method.invoke(_dossierRemoteModel, subjectType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSubjectName() {
		return _subjectName;
	}

	@Override
	public void setSubjectName(String subjectName) {
		_subjectName = subjectName;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setSubjectName", String.class);

				method.invoke(_dossierRemoteModel, subjectName);
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
	public String getTelNo() {
		return _telNo;
	}

	@Override
	public void setTelNo(String telNo) {
		_telNo = telNo;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setTelNo", String.class);

				method.invoke(_dossierRemoteModel, telNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContactPersonName() {
		return _contactPersonName;
	}

	@Override
	public void setContactPersonName(String contactPersonName) {
		_contactPersonName = contactPersonName;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setContactPersonName",
						String.class);

				method.invoke(_dossierRemoteModel, contactPersonName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContactPersonTel() {
		return _contactPersonTel;
	}

	@Override
	public void setContactPersonTel(String contactPersonTel) {
		_contactPersonTel = contactPersonTel;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setContactPersonTel",
						String.class);

				method.invoke(_dossierRemoteModel, contactPersonTel);
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
	public String getResumeDescription() {
		return _resumeDescription;
	}

	@Override
	public void setResumeDescription(String resumeDescription) {
		_resumeDescription = resumeDescription;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setResumeDescription",
						String.class);

				method.invoke(_dossierRemoteModel, resumeDescription);
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
	public Date getSubmitDate() {
		return _submitDate;
	}

	@Override
	public void setSubmitDate(Date submitDate) {
		_submitDate = submitDate;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setSubmitDate", Date.class);

				method.invoke(_dossierRemoteModel, submitDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getReceiveDate() {
		return _receiveDate;
	}

	@Override
	public void setReceiveDate(Date receiveDate) {
		_receiveDate = receiveDate;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setReceiveDate", Date.class);

				method.invoke(_dossierRemoteModel, receiveDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getRenewDate() {
		return _renewDate;
	}

	@Override
	public void setRenewDate(Date renewDate) {
		_renewDate = renewDate;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setRenewDate", Date.class);

				method.invoke(_dossierRemoteModel, renewDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getEstimateDate() {
		return _estimateDate;
	}

	@Override
	public void setEstimateDate(Date estimateDate) {
		_estimateDate = estimateDate;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setEstimateDate", Date.class);

				method.invoke(_dossierRemoteModel, estimateDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFinishDate() {
		return _finishDate;
	}

	@Override
	public void setFinishDate(Date finishDate) {
		_finishDate = finishDate;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setFinishDate", Date.class);

				method.invoke(_dossierRemoteModel, finishDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getReturnDate() {
		return _returnDate;
	}

	@Override
	public void setReturnDate(Date returnDate) {
		_returnDate = returnDate;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setReturnDate", Date.class);

				method.invoke(_dossierRemoteModel, returnDate);
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
	public Date getStatusDate() {
		return _statusDate;
	}

	@Override
	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setStatusDate", Date.class);

				method.invoke(_dossierRemoteModel, statusDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatusDescription() {
		return _statusDescription;
	}

	@Override
	public void setStatusDescription(String statusDescription) {
		_statusDescription = statusDescription;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setStatusDescription",
						String.class);

				method.invoke(_dossierRemoteModel, statusDescription);
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
	public int getDaysDelay() {
		return _daysDelay;
	}

	@Override
	public void setDaysDelay(int daysDelay) {
		_daysDelay = daysDelay;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setDaysDelay", int.class);

				method.invoke(_dossierRemoteModel, daysDelay);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCloseDate() {
		return _closeDate;
	}

	@Override
	public void setCloseDate(Date closeDate) {
		_closeDate = closeDate;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setCloseDate", Date.class);

				method.invoke(_dossierRemoteModel, closeDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getErrorStatus() {
		return _errorStatus;
	}

	@Override
	public void setErrorStatus(String errorStatus) {
		_errorStatus = errorStatus;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setErrorStatus", String.class);

				method.invoke(_dossierRemoteModel, errorStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPendingStatus() {
		return _pendingStatus;
	}

	@Override
	public void setPendingStatus(int pendingStatus) {
		_pendingStatus = pendingStatus;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setPendingStatus", int.class);

				method.invoke(_dossierRemoteModel, pendingStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getErrorCode() {
		return _errorCode;
	}

	@Override
	public void setErrorCode(String errorCode) {
		_errorCode = errorCode;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setErrorCode", String.class);

				method.invoke(_dossierRemoteModel, errorCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDirty() {
		return _dirty;
	}

	@Override
	public void setDirty(int dirty) {
		_dirty = dirty;

		if (_dossierRemoteModel != null) {
			try {
				Class<?> clazz = _dossierRemoteModel.getClass();

				Method method = clazz.getMethod("setDirty", int.class);

				method.invoke(_dossierRemoteModel, dirty);
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
		clone.setGovAgencyId(getGovAgencyId());
		clone.setGovAgencyName(getGovAgencyName());
		clone.setSubjectId(getSubjectId());
		clone.setSubjectType(getSubjectType());
		clone.setSubjectName(getSubjectName());
		clone.setAddress(getAddress());
		clone.setCityNo(getCityNo());
		clone.setCityName(getCityName());
		clone.setDistrictNo(getDistrictNo());
		clone.setDistrictName(getDistrictName());
		clone.setWardNo(getWardNo());
		clone.setWardName(getWardName());
		clone.setTelNo(getTelNo());
		clone.setContactPersonName(getContactPersonName());
		clone.setContactPersonTel(getContactPersonTel());
		clone.setNote(getNote());
		clone.setResumeDescription(getResumeDescription());
		clone.setReceptionNo(getReceptionNo());
		clone.setSubmitDate(getSubmitDate());
		clone.setReceiveDate(getReceiveDate());
		clone.setRenewDate(getRenewDate());
		clone.setEstimateDate(getEstimateDate());
		clone.setFinishDate(getFinishDate());
		clone.setReturnDate(getReturnDate());
		clone.setStatus(getStatus());
		clone.setStatusDate(getStatusDate());
		clone.setStatusDescription(getStatusDescription());
		clone.setFeedbackNote(getFeedbackNote());
		clone.setDaysDelay(getDaysDelay());
		clone.setCloseDate(getCloseDate());
		clone.setErrorStatus(getErrorStatus());
		clone.setPendingStatus(getPendingStatus());
		clone.setErrorCode(getErrorCode());
		clone.setDirty(getDirty());

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
		StringBundler sb = new StringBundler(87);

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
		sb.append(", govAgencyId=");
		sb.append(getGovAgencyId());
		sb.append(", govAgencyName=");
		sb.append(getGovAgencyName());
		sb.append(", subjectId=");
		sb.append(getSubjectId());
		sb.append(", subjectType=");
		sb.append(getSubjectType());
		sb.append(", subjectName=");
		sb.append(getSubjectName());
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
		sb.append(", telNo=");
		sb.append(getTelNo());
		sb.append(", contactPersonName=");
		sb.append(getContactPersonName());
		sb.append(", contactPersonTel=");
		sb.append(getContactPersonTel());
		sb.append(", note=");
		sb.append(getNote());
		sb.append(", resumeDescription=");
		sb.append(getResumeDescription());
		sb.append(", receptionNo=");
		sb.append(getReceptionNo());
		sb.append(", submitDate=");
		sb.append(getSubmitDate());
		sb.append(", receiveDate=");
		sb.append(getReceiveDate());
		sb.append(", renewDate=");
		sb.append(getRenewDate());
		sb.append(", estimateDate=");
		sb.append(getEstimateDate());
		sb.append(", finishDate=");
		sb.append(getFinishDate());
		sb.append(", returnDate=");
		sb.append(getReturnDate());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", statusDate=");
		sb.append(getStatusDate());
		sb.append(", statusDescription=");
		sb.append(getStatusDescription());
		sb.append(", feedbackNote=");
		sb.append(getFeedbackNote());
		sb.append(", daysDelay=");
		sb.append(getDaysDelay());
		sb.append(", closeDate=");
		sb.append(getCloseDate());
		sb.append(", errorStatus=");
		sb.append(getErrorStatus());
		sb.append(", pendingStatus=");
		sb.append(getPendingStatus());
		sb.append(", errorCode=");
		sb.append(getErrorCode());
		sb.append(", dirty=");
		sb.append(getDirty());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(133);

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
			"<column><column-name>govAgencyId</column-name><column-value><![CDATA[");
		sb.append(getGovAgencyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>govAgencyName</column-name><column-value><![CDATA[");
		sb.append(getGovAgencyName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subjectId</column-name><column-value><![CDATA[");
		sb.append(getSubjectId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subjectType</column-name><column-value><![CDATA[");
		sb.append(getSubjectType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subjectName</column-name><column-value><![CDATA[");
		sb.append(getSubjectName());
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
			"<column><column-name>telNo</column-name><column-value><![CDATA[");
		sb.append(getTelNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactPersonName</column-name><column-value><![CDATA[");
		sb.append(getContactPersonName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactPersonTel</column-name><column-value><![CDATA[");
		sb.append(getContactPersonTel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>note</column-name><column-value><![CDATA[");
		sb.append(getNote());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>resumeDescription</column-name><column-value><![CDATA[");
		sb.append(getResumeDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>receptionNo</column-name><column-value><![CDATA[");
		sb.append(getReceptionNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>submitDate</column-name><column-value><![CDATA[");
		sb.append(getSubmitDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>receiveDate</column-name><column-value><![CDATA[");
		sb.append(getReceiveDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>renewDate</column-name><column-value><![CDATA[");
		sb.append(getRenewDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>estimateDate</column-name><column-value><![CDATA[");
		sb.append(getEstimateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>finishDate</column-name><column-value><![CDATA[");
		sb.append(getFinishDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>returnDate</column-name><column-value><![CDATA[");
		sb.append(getReturnDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusDate</column-name><column-value><![CDATA[");
		sb.append(getStatusDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusDescription</column-name><column-value><![CDATA[");
		sb.append(getStatusDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>feedbackNote</column-name><column-value><![CDATA[");
		sb.append(getFeedbackNote());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>daysDelay</column-name><column-value><![CDATA[");
		sb.append(getDaysDelay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>closeDate</column-name><column-value><![CDATA[");
		sb.append(getCloseDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>errorStatus</column-name><column-value><![CDATA[");
		sb.append(getErrorStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>pendingStatus</column-name><column-value><![CDATA[");
		sb.append(getPendingStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>errorCode</column-name><column-value><![CDATA[");
		sb.append(getErrorCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dirty</column-name><column-value><![CDATA[");
		sb.append(getDirty());
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
	private int _pendingStatus;
	private String _errorCode;
	private int _dirty;
	private BaseModel<?> _dossierRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.dossiermgt.service.ClpSerializer.class;
}