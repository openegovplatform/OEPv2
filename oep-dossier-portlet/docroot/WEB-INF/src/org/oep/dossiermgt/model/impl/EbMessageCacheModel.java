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

package org.oep.dossiermgt.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.oep.dossiermgt.model.EbMessage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EbMessage in entity cache.
 *
 * @author trungdk
 * @see EbMessage
 * @generated
 */
public class EbMessageCacheModel implements CacheModel<EbMessage>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(45);

		sb.append("{ebMessageId=");
		sb.append(ebMessageId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", messageId=");
		sb.append(messageId);
		sb.append(", cpaId=");
		sb.append(cpaId);
		sb.append(", service=");
		sb.append(service);
		sb.append(", action=");
		sb.append(action);
		sb.append(", conversationId=");
		sb.append(conversationId);
		sb.append(", fromPartyId=");
		sb.append(fromPartyId);
		sb.append(", fromPartyType=");
		sb.append(fromPartyType);
		sb.append(", toPartyId=");
		sb.append(toPartyId);
		sb.append(", toPartyType=");
		sb.append(toPartyType);
		sb.append(", refToMessageId=");
		sb.append(refToMessageId);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusDescription=");
		sb.append(statusDescription);
		sb.append(", ackMessageId=");
		sb.append(ackMessageId);
		sb.append(", ackStatus=");
		sb.append(ackStatus);
		sb.append(", ackStatusDescription=");
		sb.append(ackStatusDescription);
		sb.append(", messageDescription=");
		sb.append(messageDescription);
		sb.append(", inbound=");
		sb.append(inbound);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public EbMessage toEntityModel() {
		EbMessageImpl ebMessageImpl = new EbMessageImpl();

		ebMessageImpl.setEbMessageId(ebMessageId);
		ebMessageImpl.setCompanyId(companyId);
		ebMessageImpl.setUserId(userId);
		ebMessageImpl.setGroupId(groupId);

		if (createDate == Long.MIN_VALUE) {
			ebMessageImpl.setCreateDate(null);
		}
		else {
			ebMessageImpl.setCreateDate(new Date(createDate));
		}

		if (messageId == null) {
			ebMessageImpl.setMessageId(StringPool.BLANK);
		}
		else {
			ebMessageImpl.setMessageId(messageId);
		}

		if (cpaId == null) {
			ebMessageImpl.setCpaId(StringPool.BLANK);
		}
		else {
			ebMessageImpl.setCpaId(cpaId);
		}

		if (service == null) {
			ebMessageImpl.setService(StringPool.BLANK);
		}
		else {
			ebMessageImpl.setService(service);
		}

		if (action == null) {
			ebMessageImpl.setAction(StringPool.BLANK);
		}
		else {
			ebMessageImpl.setAction(action);
		}

		if (conversationId == null) {
			ebMessageImpl.setConversationId(StringPool.BLANK);
		}
		else {
			ebMessageImpl.setConversationId(conversationId);
		}

		if (fromPartyId == null) {
			ebMessageImpl.setFromPartyId(StringPool.BLANK);
		}
		else {
			ebMessageImpl.setFromPartyId(fromPartyId);
		}

		if (fromPartyType == null) {
			ebMessageImpl.setFromPartyType(StringPool.BLANK);
		}
		else {
			ebMessageImpl.setFromPartyType(fromPartyType);
		}

		if (toPartyId == null) {
			ebMessageImpl.setToPartyId(StringPool.BLANK);
		}
		else {
			ebMessageImpl.setToPartyId(toPartyId);
		}

		if (toPartyType == null) {
			ebMessageImpl.setToPartyType(StringPool.BLANK);
		}
		else {
			ebMessageImpl.setToPartyType(toPartyType);
		}

		if (refToMessageId == null) {
			ebMessageImpl.setRefToMessageId(StringPool.BLANK);
		}
		else {
			ebMessageImpl.setRefToMessageId(refToMessageId);
		}

		if (status == null) {
			ebMessageImpl.setStatus(StringPool.BLANK);
		}
		else {
			ebMessageImpl.setStatus(status);
		}

		if (statusDescription == null) {
			ebMessageImpl.setStatusDescription(StringPool.BLANK);
		}
		else {
			ebMessageImpl.setStatusDescription(statusDescription);
		}

		if (ackMessageId == null) {
			ebMessageImpl.setAckMessageId(StringPool.BLANK);
		}
		else {
			ebMessageImpl.setAckMessageId(ackMessageId);
		}

		if (ackStatus == null) {
			ebMessageImpl.setAckStatus(StringPool.BLANK);
		}
		else {
			ebMessageImpl.setAckStatus(ackStatus);
		}

		if (ackStatusDescription == null) {
			ebMessageImpl.setAckStatusDescription(StringPool.BLANK);
		}
		else {
			ebMessageImpl.setAckStatusDescription(ackStatusDescription);
		}

		if (messageDescription == null) {
			ebMessageImpl.setMessageDescription(StringPool.BLANK);
		}
		else {
			ebMessageImpl.setMessageDescription(messageDescription);
		}

		ebMessageImpl.setInbound(inbound);

		ebMessageImpl.resetOriginalValues();

		return ebMessageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ebMessageId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		createDate = objectInput.readLong();
		messageId = objectInput.readUTF();
		cpaId = objectInput.readUTF();
		service = objectInput.readUTF();
		action = objectInput.readUTF();
		conversationId = objectInput.readUTF();
		fromPartyId = objectInput.readUTF();
		fromPartyType = objectInput.readUTF();
		toPartyId = objectInput.readUTF();
		toPartyType = objectInput.readUTF();
		refToMessageId = objectInput.readUTF();
		status = objectInput.readUTF();
		statusDescription = objectInput.readUTF();
		ackMessageId = objectInput.readUTF();
		ackStatus = objectInput.readUTF();
		ackStatusDescription = objectInput.readUTF();
		messageDescription = objectInput.readUTF();
		inbound = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(ebMessageId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(createDate);

		if (messageId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(messageId);
		}

		if (cpaId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cpaId);
		}

		if (service == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(service);
		}

		if (action == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(action);
		}

		if (conversationId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(conversationId);
		}

		if (fromPartyId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fromPartyId);
		}

		if (fromPartyType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fromPartyType);
		}

		if (toPartyId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(toPartyId);
		}

		if (toPartyType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(toPartyType);
		}

		if (refToMessageId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(refToMessageId);
		}

		if (status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status);
		}

		if (statusDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(statusDescription);
		}

		if (ackMessageId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ackMessageId);
		}

		if (ackStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ackStatus);
		}

		if (ackStatusDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ackStatusDescription);
		}

		if (messageDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(messageDescription);
		}

		objectOutput.writeInt(inbound);
	}

	public long ebMessageId;
	public long companyId;
	public long userId;
	public long groupId;
	public long createDate;
	public String messageId;
	public String cpaId;
	public String service;
	public String action;
	public String conversationId;
	public String fromPartyId;
	public String fromPartyType;
	public String toPartyId;
	public String toPartyType;
	public String refToMessageId;
	public String status;
	public String statusDescription;
	public String ackMessageId;
	public String ackStatus;
	public String ackStatusDescription;
	public String messageDescription;
	public int inbound;
}