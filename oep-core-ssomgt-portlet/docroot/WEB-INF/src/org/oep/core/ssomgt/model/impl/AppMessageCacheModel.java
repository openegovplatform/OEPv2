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

package org.oep.core.ssomgt.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.oep.core.ssomgt.model.AppMessage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AppMessage in entity cache.
 *
 * @author trungdk
 * @see AppMessage
 * @generated
 */
public class AppMessageCacheModel implements CacheModel<AppMessage>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{appMessageId=");
		sb.append(appMessageId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", fromApplication=");
		sb.append(fromApplication);
		sb.append(", toUser=");
		sb.append(toUser);
		sb.append(", messageType=");
		sb.append(messageType);
		sb.append(", messageCode=");
		sb.append(messageCode);
		sb.append(", messageText=");
		sb.append(messageText);
		sb.append(", messageValue=");
		sb.append(messageValue);
		sb.append(", messageUrl=");
		sb.append(messageUrl);
		sb.append(", visitDate=");
		sb.append(visitDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AppMessage toEntityModel() {
		AppMessageImpl appMessageImpl = new AppMessageImpl();

		appMessageImpl.setAppMessageId(appMessageId);
		appMessageImpl.setUserId(userId);
		appMessageImpl.setGroupId(groupId);
		appMessageImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			appMessageImpl.setCreateDate(null);
		}
		else {
			appMessageImpl.setCreateDate(new Date(createDate));
		}

		if (fromApplication == null) {
			appMessageImpl.setFromApplication(StringPool.BLANK);
		}
		else {
			appMessageImpl.setFromApplication(fromApplication);
		}

		if (toUser == null) {
			appMessageImpl.setToUser(StringPool.BLANK);
		}
		else {
			appMessageImpl.setToUser(toUser);
		}

		if (messageType == null) {
			appMessageImpl.setMessageType(StringPool.BLANK);
		}
		else {
			appMessageImpl.setMessageType(messageType);
		}

		if (messageCode == null) {
			appMessageImpl.setMessageCode(StringPool.BLANK);
		}
		else {
			appMessageImpl.setMessageCode(messageCode);
		}

		if (messageText == null) {
			appMessageImpl.setMessageText(StringPool.BLANK);
		}
		else {
			appMessageImpl.setMessageText(messageText);
		}

		if (messageValue == null) {
			appMessageImpl.setMessageValue(StringPool.BLANK);
		}
		else {
			appMessageImpl.setMessageValue(messageValue);
		}

		if (messageUrl == null) {
			appMessageImpl.setMessageUrl(StringPool.BLANK);
		}
		else {
			appMessageImpl.setMessageUrl(messageUrl);
		}

		if (visitDate == Long.MIN_VALUE) {
			appMessageImpl.setVisitDate(null);
		}
		else {
			appMessageImpl.setVisitDate(new Date(visitDate));
		}

		appMessageImpl.resetOriginalValues();

		return appMessageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		appMessageId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		fromApplication = objectInput.readUTF();
		toUser = objectInput.readUTF();
		messageType = objectInput.readUTF();
		messageCode = objectInput.readUTF();
		messageText = objectInput.readUTF();
		messageValue = objectInput.readUTF();
		messageUrl = objectInput.readUTF();
		visitDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(appMessageId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);

		if (fromApplication == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fromApplication);
		}

		if (toUser == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(toUser);
		}

		if (messageType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(messageType);
		}

		if (messageCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(messageCode);
		}

		if (messageText == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(messageText);
		}

		if (messageValue == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(messageValue);
		}

		if (messageUrl == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(messageUrl);
		}

		objectOutput.writeLong(visitDate);
	}

	public long appMessageId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public String fromApplication;
	public String toUser;
	public String messageType;
	public String messageCode;
	public String messageText;
	public String messageValue;
	public String messageUrl;
	public long visitDate;
}