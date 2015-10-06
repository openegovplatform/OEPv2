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
		StringBundler sb = new StringBundler(49);

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
		sb.append(", paymentType=");
		sb.append(paymentType);
		sb.append(", paymentDescription=");
		sb.append(paymentDescription);
		sb.append(", transactionInfo=");
		sb.append(transactionInfo);
		sb.append(", fileEntryId=");
		sb.append(fileEntryId);
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
		sb.append(", ebMessageId=");
		sb.append(ebMessageId);
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

		if (govAgencyId == null) {
			paymentFileImpl.setGovAgencyId(StringPool.BLANK);
		}
		else {
			paymentFileImpl.setGovAgencyId(govAgencyId);
		}

		if (govAgencyName == null) {
			paymentFileImpl.setGovAgencyName(StringPool.BLANK);
		}
		else {
			paymentFileImpl.setGovAgencyName(govAgencyName);
		}

		if (subjectId == null) {
			paymentFileImpl.setSubjectId(StringPool.BLANK);
		}
		else {
			paymentFileImpl.setSubjectId(subjectId);
		}

		if (subjectType == null) {
			paymentFileImpl.setSubjectType(StringPool.BLANK);
		}
		else {
			paymentFileImpl.setSubjectType(subjectType);
		}

		if (subjectName == null) {
			paymentFileImpl.setSubjectName(StringPool.BLANK);
		}
		else {
			paymentFileImpl.setSubjectName(subjectName);
		}

		paymentFileImpl.setAmount(amount);

		if (paymentType == null) {
			paymentFileImpl.setPaymentType(StringPool.BLANK);
		}
		else {
			paymentFileImpl.setPaymentType(paymentType);
		}

		if (paymentDescription == null) {
			paymentFileImpl.setPaymentDescription(StringPool.BLANK);
		}
		else {
			paymentFileImpl.setPaymentDescription(paymentDescription);
		}

		if (transactionInfo == null) {
			paymentFileImpl.setTransactionInfo(StringPool.BLANK);
		}
		else {
			paymentFileImpl.setTransactionInfo(transactionInfo);
		}

		paymentFileImpl.setFileEntryId(fileEntryId);

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

		paymentFileImpl.setEbMessageId(ebMessageId);

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
		govAgencyId = objectInput.readUTF();
		govAgencyName = objectInput.readUTF();
		subjectId = objectInput.readUTF();
		subjectType = objectInput.readUTF();
		subjectName = objectInput.readUTF();
		amount = objectInput.readLong();
		paymentType = objectInput.readUTF();
		paymentDescription = objectInput.readUTF();
		transactionInfo = objectInput.readUTF();
		fileEntryId = objectInput.readLong();
		checkingDate = objectInput.readLong();
		checkingUserId = objectInput.readLong();
		checkingUserName = objectInput.readUTF();
		checkingResult = objectInput.readInt();
		checkingNote = objectInput.readUTF();
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

		objectOutput.writeLong(paymentFileId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(organizationId);

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

		if (paymentType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(paymentType);
		}

		if (paymentDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(paymentDescription);
		}

		if (transactionInfo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(transactionInfo);
		}

		objectOutput.writeLong(fileEntryId);
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

		objectOutput.writeLong(ebMessageId);
	}

	public String uuid;
	public long paymentFileId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public long organizationId;
	public String govAgencyId;
	public String govAgencyName;
	public String subjectId;
	public String subjectType;
	public String subjectName;
	public long amount;
	public String paymentType;
	public String paymentDescription;
	public String transactionInfo;
	public long fileEntryId;
	public long checkingDate;
	public long checkingUserId;
	public String checkingUserName;
	public int checkingResult;
	public String checkingNote;
	public long ebMessageId;
}