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

import org.oep.core.dossiermgt.model.PaymentFile;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PaymentFile in entity cache.
 *
 * @author trungdk
 * @see PaymentFile
 * @generated
 */
public class PaymentFileCacheModel implements CacheModel<PaymentFile>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", paymentFileId=");
		sb.append(paymentFileId);
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
		sb.append(", amount=");
		sb.append(amount);
		sb.append(", paymentType=");
		sb.append(paymentType);
		sb.append(", detailInfo=");
		sb.append(detailInfo);
		sb.append(", note=");
		sb.append(note);
		sb.append(", fileEntryId=");
		sb.append(fileEntryId);
		sb.append(", issueDate=");
		sb.append(issueDate);
		sb.append(", checkingDate=");
		sb.append(checkingDate);
		sb.append(", checkingUserId=");
		sb.append(checkingUserId);
		sb.append(", checkingUserName=");
		sb.append(checkingUserName);
		sb.append(", checkingResult=");
		sb.append(checkingResult);
		sb.append(", checkingNote=");
		sb.append(checkingNote);
		sb.append(", feedbackDate=");
		sb.append(feedbackDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PaymentFile toEntityModel() {
		PaymentFileImpl paymentFileImpl = new PaymentFileImpl();

		if (uuid == null) {
			paymentFileImpl.setUuid(StringPool.BLANK);
		}
		else {
			paymentFileImpl.setUuid(uuid);
		}

		paymentFileImpl.setPaymentFileId(paymentFileId);
		paymentFileImpl.setUserId(userId);
		paymentFileImpl.setGroupId(groupId);
		paymentFileImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			paymentFileImpl.setCreateDate(null);
		}
		else {
			paymentFileImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			paymentFileImpl.setModifiedDate(null);
		}
		else {
			paymentFileImpl.setModifiedDate(new Date(modifiedDate));
		}

		paymentFileImpl.setOrganizationId(organizationId);
		paymentFileImpl.setAmount(amount);
		paymentFileImpl.setPaymentType(paymentType);

		if (detailInfo == null) {
			paymentFileImpl.setDetailInfo(StringPool.BLANK);
		}
		else {
			paymentFileImpl.setDetailInfo(detailInfo);
		}

		if (note == null) {
			paymentFileImpl.setNote(StringPool.BLANK);
		}
		else {
			paymentFileImpl.setNote(note);
		}

		paymentFileImpl.setFileEntryId(fileEntryId);

		if (issueDate == Long.MIN_VALUE) {
			paymentFileImpl.setIssueDate(null);
		}
		else {
			paymentFileImpl.setIssueDate(new Date(issueDate));
		}

		if (checkingDate == Long.MIN_VALUE) {
			paymentFileImpl.setCheckingDate(null);
		}
		else {
			paymentFileImpl.setCheckingDate(new Date(checkingDate));
		}

		paymentFileImpl.setCheckingUserId(checkingUserId);

		if (checkingUserName == null) {
			paymentFileImpl.setCheckingUserName(StringPool.BLANK);
		}
		else {
			paymentFileImpl.setCheckingUserName(checkingUserName);
		}

		paymentFileImpl.setCheckingResult(checkingResult);

		if (checkingNote == null) {
			paymentFileImpl.setCheckingNote(StringPool.BLANK);
		}
		else {
			paymentFileImpl.setCheckingNote(checkingNote);
		}

		if (feedbackDate == Long.MIN_VALUE) {
			paymentFileImpl.setFeedbackDate(null);
		}
		else {
			paymentFileImpl.setFeedbackDate(new Date(feedbackDate));
		}

		paymentFileImpl.resetOriginalValues();

		return paymentFileImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		paymentFileId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		organizationId = objectInput.readLong();
		amount = objectInput.readLong();
		paymentType = objectInput.readInt();
		detailInfo = objectInput.readUTF();
		note = objectInput.readUTF();
		fileEntryId = objectInput.readLong();
		issueDate = objectInput.readLong();
		checkingDate = objectInput.readLong();
		checkingUserId = objectInput.readLong();
		checkingUserName = objectInput.readUTF();
		checkingResult = objectInput.readInt();
		checkingNote = objectInput.readUTF();
		feedbackDate = objectInput.readLong();
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

		objectOutput.writeLong(paymentFileId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(organizationId);
		objectOutput.writeLong(amount);
		objectOutput.writeInt(paymentType);

		if (detailInfo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(detailInfo);
		}

		if (note == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(note);
		}

		objectOutput.writeLong(fileEntryId);
		objectOutput.writeLong(issueDate);
		objectOutput.writeLong(checkingDate);
		objectOutput.writeLong(checkingUserId);

		if (checkingUserName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(checkingUserName);
		}

		objectOutput.writeInt(checkingResult);

		if (checkingNote == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(checkingNote);
		}

		objectOutput.writeLong(feedbackDate);
	}

	public String uuid;
	public long paymentFileId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public long organizationId;
	public long amount;
	public int paymentType;
	public String detailInfo;
	public String note;
	public long fileEntryId;
	public long issueDate;
	public long checkingDate;
	public long checkingUserId;
	public String checkingUserName;
	public int checkingResult;
	public String checkingNote;
	public long feedbackDate;
}