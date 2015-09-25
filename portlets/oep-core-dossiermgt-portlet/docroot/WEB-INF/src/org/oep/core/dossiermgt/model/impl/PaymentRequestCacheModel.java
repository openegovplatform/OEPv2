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
		StringBundler sb = new StringBundler(27);

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
		sb.append(", amount=");
		sb.append(amount);
		sb.append(", note=");
		sb.append(note);
		sb.append(", issueDate=");
		sb.append(issueDate);
		sb.append(", paymentFileId=");
		sb.append(paymentFileId);
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
		paymentRequestImpl.setAmount(amount);

		if (note == null) {
			paymentRequestImpl.setNote(StringPool.BLANK);
		}
		else {
			paymentRequestImpl.setNote(note);
		}

		if (issueDate == Long.MIN_VALUE) {
			paymentRequestImpl.setIssueDate(null);
		}
		else {
			paymentRequestImpl.setIssueDate(new Date(issueDate));
		}

		paymentRequestImpl.setPaymentFileId(paymentFileId);

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
		amount = objectInput.readLong();
		note = objectInput.readUTF();
		issueDate = objectInput.readLong();
		paymentFileId = objectInput.readLong();
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
		objectOutput.writeLong(amount);

		if (note == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(note);
		}

		objectOutput.writeLong(issueDate);
		objectOutput.writeLong(paymentFileId);
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
	public long amount;
	public String note;
	public long issueDate;
	public long paymentFileId;
}