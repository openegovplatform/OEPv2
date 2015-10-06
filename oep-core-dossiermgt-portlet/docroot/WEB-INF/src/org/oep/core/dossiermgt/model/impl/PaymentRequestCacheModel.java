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

import org.oep.core.dossiermgt.model.PaymentRequest;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PaymentRequest in entity cache.
 *
 * @author trungdk
 * @see PaymentRequest
 * @generated
 */
public class PaymentRequestCacheModel implements CacheModel<PaymentRequest>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", paymentRequestId=");
		sb.append(paymentRequestId);
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
		sb.append(", dossierId=");
		sb.append(dossierId);
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
		sb.append(", amount=");
		sb.append(amount);
		sb.append(", requestNote=");
		sb.append(requestNote);
		sb.append(", paymentFileId=");
		sb.append(paymentFileId);
		sb.append(", confirmOK=");
		sb.append(confirmOK);
		sb.append(", ebMessageId=");
		sb.append(ebMessageId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PaymentRequest toEntityModel() {
		PaymentRequestImpl paymentRequestImpl = new PaymentRequestImpl();

		if (uuid == null) {
			paymentRequestImpl.setUuid(StringPool.BLANK);
		}
		else {
			paymentRequestImpl.setUuid(uuid);
		}

		paymentRequestImpl.setPaymentRequestId(paymentRequestId);
		paymentRequestImpl.setUserId(userId);
		paymentRequestImpl.setGroupId(groupId);
		paymentRequestImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			paymentRequestImpl.setCreateDate(null);
		}
		else {
			paymentRequestImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			paymentRequestImpl.setModifiedDate(null);
		}
		else {
			paymentRequestImpl.setModifiedDate(new Date(modifiedDate));
		}

		paymentRequestImpl.setOrganizationId(organizationId);
		paymentRequestImpl.setDossierId(dossierId);

		if (govAgencyId == null) {
			paymentRequestImpl.setGovAgencyId(StringPool.BLANK);
		}
		else {
			paymentRequestImpl.setGovAgencyId(govAgencyId);
		}

		if (govAgencyName == null) {
			paymentRequestImpl.setGovAgencyName(StringPool.BLANK);
		}
		else {
			paymentRequestImpl.setGovAgencyName(govAgencyName);
		}

		if (subjectId == null) {
			paymentRequestImpl.setSubjectId(StringPool.BLANK);
		}
		else {
			paymentRequestImpl.setSubjectId(subjectId);
		}

		if (subjectType == null) {
			paymentRequestImpl.setSubjectType(StringPool.BLANK);
		}
		else {
			paymentRequestImpl.setSubjectType(subjectType);
		}

		if (subjectName == null) {
			paymentRequestImpl.setSubjectName(StringPool.BLANK);
		}
		else {
			paymentRequestImpl.setSubjectName(subjectName);
		}

		paymentRequestImpl.setAmount(amount);

		if (requestNote == null) {
			paymentRequestImpl.setRequestNote(StringPool.BLANK);
		}
		else {
			paymentRequestImpl.setRequestNote(requestNote);
		}

		paymentRequestImpl.setPaymentFileId(paymentFileId);
		paymentRequestImpl.setConfirmOK(confirmOK);
		paymentRequestImpl.setEbMessageId(ebMessageId);

		paymentRequestImpl.resetOriginalValues();

		return paymentRequestImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		paymentRequestId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		organizationId = objectInput.readLong();
		dossierId = objectInput.readLong();
		govAgencyId = objectInput.readUTF();
		govAgencyName = objectInput.readUTF();
		subjectId = objectInput.readUTF();
		subjectType = objectInput.readUTF();
		subjectName = objectInput.readUTF();
		amount = objectInput.readLong();
		requestNote = objectInput.readUTF();
		paymentFileId = objectInput.readLong();
		confirmOK = objectInput.readInt();
		ebMessageId = objectInput.readLong();
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

		objectOutput.writeLong(paymentRequestId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(organizationId);
		objectOutput.writeLong(dossierId);

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

		objectOutput.writeLong(amount);

		if (requestNote == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(requestNote);
		}

		objectOutput.writeLong(paymentFileId);
		objectOutput.writeInt(confirmOK);
		objectOutput.writeLong(ebMessageId);
	}

	public String uuid;
	public long paymentRequestId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public long organizationId;
	public long dossierId;
	public String govAgencyId;
	public String govAgencyName;
	public String subjectId;
	public String subjectType;
	public String subjectName;
	public long amount;
	public String requestNote;
	public long paymentFileId;
	public int confirmOK;
	public long ebMessageId;
}