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

package org.oep.ssomgt.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.oep.ssomgt.model.Application;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Application in entity cache.
 *
 * @author trungdk
 * @see Application
 * @generated
 */
public class ApplicationCacheModel implements CacheModel<Application>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{applicationId=");
		sb.append(applicationId);
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
		sb.append(", appCode=");
		sb.append(appCode);
		sb.append(", appName=");
		sb.append(appName);
		sb.append(", appPin=");
		sb.append(appPin);
		sb.append(", appUrl=");
		sb.append(appUrl);
		sb.append(", pingTime=");
		sb.append(pingTime);
		sb.append(", sequenceNo=");
		sb.append(sequenceNo);
		sb.append(", publicKey=");
		sb.append(publicKey);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Application toEntityModel() {
		ApplicationImpl applicationImpl = new ApplicationImpl();

		applicationImpl.setApplicationId(applicationId);
		applicationImpl.setUserId(userId);
		applicationImpl.setGroupId(groupId);
		applicationImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			applicationImpl.setCreateDate(null);
		}
		else {
			applicationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			applicationImpl.setModifiedDate(null);
		}
		else {
			applicationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (appCode == null) {
			applicationImpl.setAppCode(StringPool.BLANK);
		}
		else {
			applicationImpl.setAppCode(appCode);
		}

		if (appName == null) {
			applicationImpl.setAppName(StringPool.BLANK);
		}
		else {
			applicationImpl.setAppName(appName);
		}

		if (appPin == null) {
			applicationImpl.setAppPin(StringPool.BLANK);
		}
		else {
			applicationImpl.setAppPin(appPin);
		}

		if (appUrl == null) {
			applicationImpl.setAppUrl(StringPool.BLANK);
		}
		else {
			applicationImpl.setAppUrl(appUrl);
		}

		if (pingTime == Long.MIN_VALUE) {
			applicationImpl.setPingTime(null);
		}
		else {
			applicationImpl.setPingTime(new Date(pingTime));
		}

		applicationImpl.setSequenceNo(sequenceNo);

		if (publicKey == null) {
			applicationImpl.setPublicKey(StringPool.BLANK);
		}
		else {
			applicationImpl.setPublicKey(publicKey);
		}

		applicationImpl.resetOriginalValues();

		return applicationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		applicationId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		appCode = objectInput.readUTF();
		appName = objectInput.readUTF();
		appPin = objectInput.readUTF();
		appUrl = objectInput.readUTF();
		pingTime = objectInput.readLong();
		sequenceNo = objectInput.readInt();
		publicKey = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(applicationId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (appCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(appCode);
		}

		if (appName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(appName);
		}

		if (appPin == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(appPin);
		}

		if (appUrl == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(appUrl);
		}

		objectOutput.writeLong(pingTime);
		objectOutput.writeInt(sequenceNo);

		if (publicKey == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(publicKey);
		}
	}

	public long applicationId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public String appCode;
	public String appName;
	public String appPin;
	public String appUrl;
	public long pingTime;
	public int sequenceNo;
	public String publicKey;
}