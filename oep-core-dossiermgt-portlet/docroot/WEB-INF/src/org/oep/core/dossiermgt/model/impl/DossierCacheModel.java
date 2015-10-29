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
		StringBundler sb = new StringBundler(103);

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
		sb.append(", email=");
		sb.append(email);
		sb.append(", subjectAsContactPerson=");
		sb.append(subjectAsContactPerson);
		sb.append(", contactPersonName=");
		sb.append(contactPersonName);
		sb.append(", contactPersonId=");
		sb.append(contactPersonId);
		sb.append(", contactPersonSex=");
		sb.append(contactPersonSex);
		sb.append(", contactPersonTel=");
		sb.append(contactPersonTel);
		sb.append(", note=");
		sb.append(note);
		sb.append(", resumeDescription=");
		sb.append(resumeDescription);
		sb.append(", receptionNo=");
		sb.append(receptionNo);
		sb.append(", onegate=");
		sb.append(onegate);
		sb.append(", submitDate=");
		sb.append(submitDate);
		sb.append(", receiveDate=");
		sb.append(receiveDate);
		sb.append(", processDate=");
		sb.append(processDate);
		sb.append(", renewDate=");
		sb.append(renewDate);
		sb.append(", estimateDate=");
		sb.append(estimateDate);
		sb.append(", finishDate=");
		sb.append(finishDate);
		sb.append(", handoverDate=");
		sb.append(handoverDate);
		sb.append(", returnDate=");
		sb.append(returnDate);
		sb.append(", archiveDate=");
		sb.append(archiveDate);
		sb.append(", mainStatus=");
		sb.append(mainStatus);
		sb.append(", subStatus=");
		sb.append(subStatus);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append(", statusDescription=");
		sb.append(statusDescription);
		sb.append(", feedbackNote=");
		sb.append(feedbackNote);
		sb.append(", daysDelay=");
		sb.append(daysDelay);
		sb.append(", errorStatus=");
		sb.append(errorStatus);
		sb.append(", errorCode=");
		sb.append(errorCode);
		sb.append(", pendingStatus=");
		sb.append(pendingStatus);
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

		if (email == null) {
			dossierImpl.setEmail(StringPool.BLANK);
		}
		else {
			dossierImpl.setEmail(email);
		}

		dossierImpl.setSubjectAsContactPerson(subjectAsContactPerson);

		if (contactPersonName == null) {
			dossierImpl.setContactPersonName(StringPool.BLANK);
		}
		else {
			dossierImpl.setContactPersonName(contactPersonName);
		}

		if (contactPersonId == null) {
			dossierImpl.setContactPersonId(StringPool.BLANK);
		}
		else {
			dossierImpl.setContactPersonId(contactPersonId);
		}

		dossierImpl.setContactPersonSex(contactPersonSex);

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

		dossierImpl.setOnegate(onegate);

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

		if (processDate == Long.MIN_VALUE) {
			dossierImpl.setProcessDate(null);
		}
		else {
			dossierImpl.setProcessDate(new Date(processDate));
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

		if (handoverDate == Long.MIN_VALUE) {
			dossierImpl.setHandoverDate(null);
		}
		else {
			dossierImpl.setHandoverDate(new Date(handoverDate));
		}

		if (returnDate == Long.MIN_VALUE) {
			dossierImpl.setReturnDate(null);
		}
		else {
			dossierImpl.setReturnDate(new Date(returnDate));
		}

		if (archiveDate == Long.MIN_VALUE) {
			dossierImpl.setArchiveDate(null);
		}
		else {
			dossierImpl.setArchiveDate(new Date(archiveDate));
		}

		if (mainStatus == null) {
			dossierImpl.setMainStatus(StringPool.BLANK);
		}
		else {
			dossierImpl.setMainStatus(mainStatus);
		}

		if (subStatus == null) {
			dossierImpl.setSubStatus(StringPool.BLANK);
		}
		else {
			dossierImpl.setSubStatus(subStatus);
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

		if (errorStatus == null) {
			dossierImpl.setErrorStatus(StringPool.BLANK);
		}
		else {
			dossierImpl.setErrorStatus(errorStatus);
		}

		if (errorCode == null) {
			dossierImpl.setErrorCode(StringPool.BLANK);
		}
		else {
			dossierImpl.setErrorCode(errorCode);
		}

		dossierImpl.setPendingStatus(pendingStatus);
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
		email = objectInput.readUTF();
		subjectAsContactPerson = objectInput.readInt();
		contactPersonName = objectInput.readUTF();
		contactPersonId = objectInput.readUTF();
		contactPersonSex = objectInput.readInt();
		contactPersonTel = objectInput.readUTF();
		note = objectInput.readUTF();
		resumeDescription = objectInput.readUTF();
		receptionNo = objectInput.readUTF();
		onegate = objectInput.readInt();
		submitDate = objectInput.readLong();
		receiveDate = objectInput.readLong();
		processDate = objectInput.readLong();
		renewDate = objectInput.readLong();
		estimateDate = objectInput.readLong();
		finishDate = objectInput.readLong();
		handoverDate = objectInput.readLong();
		returnDate = objectInput.readLong();
		archiveDate = objectInput.readLong();
		mainStatus = objectInput.readUTF();
		subStatus = objectInput.readUTF();
		statusDate = objectInput.readLong();
		statusDescription = objectInput.readUTF();
		feedbackNote = objectInput.readUTF();
		daysDelay = objectInput.readInt();
		errorStatus = objectInput.readUTF();
		errorCode = objectInput.readUTF();
		pendingStatus = objectInput.readInt();
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

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		objectOutput.writeInt(subjectAsContactPerson);

		if (contactPersonName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contactPersonName);
		}

		if (contactPersonId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contactPersonId);
		}

		objectOutput.writeInt(contactPersonSex);

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

		objectOutput.writeInt(onegate);
		objectOutput.writeLong(submitDate);
		objectOutput.writeLong(receiveDate);
		objectOutput.writeLong(processDate);
		objectOutput.writeLong(renewDate);
		objectOutput.writeLong(estimateDate);
		objectOutput.writeLong(finishDate);
		objectOutput.writeLong(handoverDate);
		objectOutput.writeLong(returnDate);
		objectOutput.writeLong(archiveDate);

		if (mainStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mainStatus);
		}

		if (subStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(subStatus);
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

		if (errorStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(errorStatus);
		}

		if (errorCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(errorCode);
		}

		objectOutput.writeInt(pendingStatus);
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
	public String email;
	public int subjectAsContactPerson;
	public String contactPersonName;
	public String contactPersonId;
	public int contactPersonSex;
	public String contactPersonTel;
	public String note;
	public String resumeDescription;
	public String receptionNo;
	public int onegate;
	public long submitDate;
	public long receiveDate;
	public long processDate;
	public long renewDate;
	public long estimateDate;
	public long finishDate;
	public long handoverDate;
	public long returnDate;
	public long archiveDate;
	public String mainStatus;
	public String subStatus;
	public long statusDate;
	public String statusDescription;
	public String feedbackNote;
	public int daysDelay;
	public String errorStatus;
	public String errorCode;
	public int pendingStatus;
	public int dirty;
}