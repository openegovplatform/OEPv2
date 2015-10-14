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

package org.oep.core.dossiermgt.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.oep.core.dossiermgt.model.Dossier;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Dossier in entity cache.
 *
 * @author trungdk
 * @see Dossier
 * @generated
 */
public class DossierCacheModel implements CacheModel<Dossier>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(87);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", organizationId=");
		sb.append(organizationId);
		sb.append(", dossierProcId=");
		sb.append(dossierProcId);
		sb.append(", govAgencyId=");
		sb.append(govAgencyId);
		sb.append(", govAgencyName=");
		sb.append(govAgencyName);
		sb.append(", subjectId=");
		sb.append(subjectId);
		sb.append(", subjectType=");
		sb.append(subjectType);
		sb.append(", subjectName=");
		sb.append(subjectName);
		sb.append(", address=");
		sb.append(address);
		sb.append(", cityNo=");
		sb.append(cityNo);
		sb.append(", cityName=");
		sb.append(cityName);
		sb.append(", districtNo=");
		sb.append(districtNo);
		sb.append(", districtName=");
		sb.append(districtName);
		sb.append(", wardNo=");
		sb.append(wardNo);
		sb.append(", wardName=");
		sb.append(wardName);
		sb.append(", telNo=");
		sb.append(telNo);
		sb.append(", contactPersonName=");
		sb.append(contactPersonName);
		sb.append(", contactPersonTel=");
		sb.append(contactPersonTel);
		sb.append(", note=");
		sb.append(note);
		sb.append(", resumeDescription=");
		sb.append(resumeDescription);
		sb.append(", receptionNo=");
		sb.append(receptionNo);
		sb.append(", submitDate=");
		sb.append(submitDate);
		sb.append(", receiveDate=");
		sb.append(receiveDate);
		sb.append(", renewDate=");
		sb.append(renewDate);
		sb.append(", estimateDate=");
		sb.append(estimateDate);
		sb.append(", finishDate=");
		sb.append(finishDate);
		sb.append(", returnDate=");
		sb.append(returnDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append(", statusDescription=");
		sb.append(statusDescription);
		sb.append(", feedbackNote=");
		sb.append(feedbackNote);
		sb.append(", daysDelay=");
		sb.append(daysDelay);
		sb.append(", closeDate=");
		sb.append(closeDate);
		sb.append(", errorStatus=");
		sb.append(errorStatus);
		sb.append(", pendingStatus=");
		sb.append(pendingStatus);
		sb.append(", errorCode=");
		sb.append(errorCode);
		sb.append(", dirty=");
		sb.append(dirty);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Dossier toEntityModel() {
		DossierImpl dossierImpl = new DossierImpl();

		if (uuid == null) {
			dossierImpl.setUuid(StringPool.BLANK);
		}
		else {
			dossierImpl.setUuid(uuid);
		}

		dossierImpl.setDossierId(dossierId);
		dossierImpl.setUserId(userId);
		dossierImpl.setGroupId(groupId);
		dossierImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			dossierImpl.setCreateDate(null);
		}
		else {
			dossierImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			dossierImpl.setModifiedDate(null);
		}
		else {
			dossierImpl.setModifiedDate(new Date(modifiedDate));
		}

		dossierImpl.setOrganizationId(organizationId);
		dossierImpl.setDossierProcId(dossierProcId);

		if (govAgencyId == null) {
			dossierImpl.setGovAgencyId(StringPool.BLANK);
		}
		else {
			dossierImpl.setGovAgencyId(govAgencyId);
		}

		if (govAgencyName == null) {
			dossierImpl.setGovAgencyName(StringPool.BLANK);
		}
		else {
			dossierImpl.setGovAgencyName(govAgencyName);
		}

		if (subjectId == null) {
			dossierImpl.setSubjectId(StringPool.BLANK);
		}
		else {
			dossierImpl.setSubjectId(subjectId);
		}

		if (subjectType == null) {
			dossierImpl.setSubjectType(StringPool.BLANK);
		}
		else {
			dossierImpl.setSubjectType(subjectType);
		}

		if (subjectName == null) {
			dossierImpl.setSubjectName(StringPool.BLANK);
		}
		else {
			dossierImpl.setSubjectName(subjectName);
		}

		if (address == null) {
			dossierImpl.setAddress(StringPool.BLANK);
		}
		else {
			dossierImpl.setAddress(address);
		}

		if (cityNo == null) {
			dossierImpl.setCityNo(StringPool.BLANK);
		}
		else {
			dossierImpl.setCityNo(cityNo);
		}

		if (cityName == null) {
			dossierImpl.setCityName(StringPool.BLANK);
		}
		else {
			dossierImpl.setCityName(cityName);
		}

		if (districtNo == null) {
			dossierImpl.setDistrictNo(StringPool.BLANK);
		}
		else {
			dossierImpl.setDistrictNo(districtNo);
		}

		if (districtName == null) {
			dossierImpl.setDistrictName(StringPool.BLANK);
		}
		else {
			dossierImpl.setDistrictName(districtName);
		}

		if (wardNo == null) {
			dossierImpl.setWardNo(StringPool.BLANK);
		}
		else {
			dossierImpl.setWardNo(wardNo);
		}

		if (wardName == null) {
			dossierImpl.setWardName(StringPool.BLANK);
		}
		else {
			dossierImpl.setWardName(wardName);
		}

		if (telNo == null) {
			dossierImpl.setTelNo(StringPool.BLANK);
		}
		else {
			dossierImpl.setTelNo(telNo);
		}

		if (contactPersonName == null) {
			dossierImpl.setContactPersonName(StringPool.BLANK);
		}
		else {
			dossierImpl.setContactPersonName(contactPersonName);
		}

		if (contactPersonTel == null) {
			dossierImpl.setContactPersonTel(StringPool.BLANK);
		}
		else {
			dossierImpl.setContactPersonTel(contactPersonTel);
		}

		if (note == null) {
			dossierImpl.setNote(StringPool.BLANK);
		}
		else {
			dossierImpl.setNote(note);
		}

		if (resumeDescription == null) {
			dossierImpl.setResumeDescription(StringPool.BLANK);
		}
		else {
			dossierImpl.setResumeDescription(resumeDescription);
		}

		if (receptionNo == null) {
			dossierImpl.setReceptionNo(StringPool.BLANK);
		}
		else {
			dossierImpl.setReceptionNo(receptionNo);
		}

		if (submitDate == Long.MIN_VALUE) {
			dossierImpl.setSubmitDate(null);
		}
		else {
			dossierImpl.setSubmitDate(new Date(submitDate));
		}

		if (receiveDate == Long.MIN_VALUE) {
			dossierImpl.setReceiveDate(null);
		}
		else {
			dossierImpl.setReceiveDate(new Date(receiveDate));
		}

		if (renewDate == Long.MIN_VALUE) {
			dossierImpl.setRenewDate(null);
		}
		else {
			dossierImpl.setRenewDate(new Date(renewDate));
		}

		if (estimateDate == Long.MIN_VALUE) {
			dossierImpl.setEstimateDate(null);
		}
		else {
			dossierImpl.setEstimateDate(new Date(estimateDate));
		}

		if (finishDate == Long.MIN_VALUE) {
			dossierImpl.setFinishDate(null);
		}
		else {
			dossierImpl.setFinishDate(new Date(finishDate));
		}

		if (returnDate == Long.MIN_VALUE) {
			dossierImpl.setReturnDate(null);
		}
		else {
			dossierImpl.setReturnDate(new Date(returnDate));
		}

		if (status == null) {
			dossierImpl.setStatus(StringPool.BLANK);
		}
		else {
			dossierImpl.setStatus(status);
		}

		if (statusDate == Long.MIN_VALUE) {
			dossierImpl.setStatusDate(null);
		}
		else {
			dossierImpl.setStatusDate(new Date(statusDate));
		}

		if (statusDescription == null) {
			dossierImpl.setStatusDescription(StringPool.BLANK);
		}
		else {
			dossierImpl.setStatusDescription(statusDescription);
		}

		if (feedbackNote == null) {
			dossierImpl.setFeedbackNote(StringPool.BLANK);
		}
		else {
			dossierImpl.setFeedbackNote(feedbackNote);
		}

		dossierImpl.setDaysDelay(daysDelay);

		if (closeDate == Long.MIN_VALUE) {
			dossierImpl.setCloseDate(null);
		}
		else {
			dossierImpl.setCloseDate(new Date(closeDate));
		}

		if (errorStatus == null) {
			dossierImpl.setErrorStatus(StringPool.BLANK);
		}
		else {
			dossierImpl.setErrorStatus(errorStatus);
		}

		dossierImpl.setPendingStatus(pendingStatus);

		if (errorCode == null) {
			dossierImpl.setErrorCode(StringPool.BLANK);
		}
		else {
			dossierImpl.setErrorCode(errorCode);
		}

		dossierImpl.setDirty(dirty);

		dossierImpl.resetOriginalValues();

		return dossierImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		dossierId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		organizationId = objectInput.readLong();
		dossierProcId = objectInput.readLong();
		govAgencyId = objectInput.readUTF();
		govAgencyName = objectInput.readUTF();
		subjectId = objectInput.readUTF();
		subjectType = objectInput.readUTF();
		subjectName = objectInput.readUTF();
		address = objectInput.readUTF();
		cityNo = objectInput.readUTF();
		cityName = objectInput.readUTF();
		districtNo = objectInput.readUTF();
		districtName = objectInput.readUTF();
		wardNo = objectInput.readUTF();
		wardName = objectInput.readUTF();
		telNo = objectInput.readUTF();
		contactPersonName = objectInput.readUTF();
		contactPersonTel = objectInput.readUTF();
		note = objectInput.readUTF();
		resumeDescription = objectInput.readUTF();
		receptionNo = objectInput.readUTF();
		submitDate = objectInput.readLong();
		receiveDate = objectInput.readLong();
		renewDate = objectInput.readLong();
		estimateDate = objectInput.readLong();
		finishDate = objectInput.readLong();
		returnDate = objectInput.readLong();
		status = objectInput.readUTF();
		statusDate = objectInput.readLong();
		statusDescription = objectInput.readUTF();
		feedbackNote = objectInput.readUTF();
		daysDelay = objectInput.readInt();
		closeDate = objectInput.readLong();
		errorStatus = objectInput.readUTF();
		pendingStatus = objectInput.readInt();
		errorCode = objectInput.readUTF();
		dirty = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(dossierId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(organizationId);
		objectOutput.writeLong(dossierProcId);

		if (govAgencyId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(govAgencyId);
		}

		if (govAgencyName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(govAgencyName);
		}

		if (subjectId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(subjectId);
		}

		if (subjectType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(subjectType);
		}

		if (subjectName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(subjectName);
		}

		if (address == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (cityNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cityNo);
		}

		if (cityName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cityName);
		}

		if (districtNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(districtNo);
		}

		if (districtName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(districtName);
		}

		if (wardNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(wardNo);
		}

		if (wardName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(wardName);
		}

		if (telNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(telNo);
		}

		if (contactPersonName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contactPersonName);
		}

		if (contactPersonTel == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contactPersonTel);
		}

		if (note == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(note);
		}

		if (resumeDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(resumeDescription);
		}

		if (receptionNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(receptionNo);
		}

		objectOutput.writeLong(submitDate);
		objectOutput.writeLong(receiveDate);
		objectOutput.writeLong(renewDate);
		objectOutput.writeLong(estimateDate);
		objectOutput.writeLong(finishDate);
		objectOutput.writeLong(returnDate);

		if (status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status);
		}

		objectOutput.writeLong(statusDate);

		if (statusDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(statusDescription);
		}

		if (feedbackNote == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(feedbackNote);
		}

		objectOutput.writeInt(daysDelay);
		objectOutput.writeLong(closeDate);

		if (errorStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(errorStatus);
		}

		objectOutput.writeInt(pendingStatus);

		if (errorCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(errorCode);
		}

		objectOutput.writeInt(dirty);
	}

	public String uuid;
	public long dossierId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public long organizationId;
	public long dossierProcId;
	public String govAgencyId;
	public String govAgencyName;
	public String subjectId;
	public String subjectType;
	public String subjectName;
	public String address;
	public String cityNo;
	public String cityName;
	public String districtNo;
	public String districtName;
	public String wardNo;
	public String wardName;
	public String telNo;
	public String contactPersonName;
	public String contactPersonTel;
	public String note;
	public String resumeDescription;
	public String receptionNo;
	public long submitDate;
	public long receiveDate;
	public long renewDate;
	public long estimateDate;
	public long finishDate;
	public long returnDate;
	public String status;
	public long statusDate;
	public String statusDescription;
	public String feedbackNote;
	public int daysDelay;
	public long closeDate;
	public String errorStatus;
	public int pendingStatus;
	public String errorCode;
	public int dirty;
}