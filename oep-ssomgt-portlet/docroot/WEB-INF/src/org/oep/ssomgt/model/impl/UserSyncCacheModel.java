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

import org.oep.ssomgt.model.UserSync;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing UserSync in entity cache.
 *
 * @author trungdk
 * @see UserSync
 * @generated
 */
public class UserSyncCacheModel implements CacheModel<UserSync>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{userSyncId=");
		sb.append(userSyncId);
		sb.append(", applicationId=");
		sb.append(applicationId);
		sb.append(", employeeId=");
		sb.append(employeeId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", ssoUserName=");
		sb.append(ssoUserName);
		sb.append(", appUserName=");
		sb.append(appUserName);
		sb.append(", fullName=");
		sb.append(fullName);
		sb.append(", email=");
		sb.append(email);
		sb.append(", password=");
		sb.append(password);
		sb.append(", accessibleStatus=");
		sb.append(accessibleStatus);
		sb.append(", roles=");
		sb.append(roles);
		sb.append(", checkpoint=");
		sb.append(checkpoint);
		sb.append(", syncTime=");
		sb.append(syncTime);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UserSync toEntityModel() {
		UserSyncImpl userSyncImpl = new UserSyncImpl();

		userSyncImpl.setUserSyncId(userSyncId);
		userSyncImpl.setApplicationId(applicationId);
		userSyncImpl.setEmployeeId(employeeId);
		userSyncImpl.setUserId(userId);

		if (ssoUserName == null) {
			userSyncImpl.setSsoUserName(StringPool.BLANK);
		}
		else {
			userSyncImpl.setSsoUserName(ssoUserName);
		}

		if (appUserName == null) {
			userSyncImpl.setAppUserName(StringPool.BLANK);
		}
		else {
			userSyncImpl.setAppUserName(appUserName);
		}

		if (fullName == null) {
			userSyncImpl.setFullName(StringPool.BLANK);
		}
		else {
			userSyncImpl.setFullName(fullName);
		}

		if (email == null) {
			userSyncImpl.setEmail(StringPool.BLANK);
		}
		else {
			userSyncImpl.setEmail(email);
		}

		if (password == null) {
			userSyncImpl.setPassword(StringPool.BLANK);
		}
		else {
			userSyncImpl.setPassword(password);
		}

		userSyncImpl.setAccessibleStatus(accessibleStatus);

		if (roles == null) {
			userSyncImpl.setRoles(StringPool.BLANK);
		}
		else {
			userSyncImpl.setRoles(roles);
		}

		if (checkpoint == Long.MIN_VALUE) {
			userSyncImpl.setCheckpoint(null);
		}
		else {
			userSyncImpl.setCheckpoint(new Date(checkpoint));
		}

		if (syncTime == Long.MIN_VALUE) {
			userSyncImpl.setSyncTime(null);
		}
		else {
			userSyncImpl.setSyncTime(new Date(syncTime));
		}

		userSyncImpl.resetOriginalValues();

		return userSyncImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		userSyncId = objectInput.readLong();
		applicationId = objectInput.readLong();
		employeeId = objectInput.readLong();
		userId = objectInput.readLong();
		ssoUserName = objectInput.readUTF();
		appUserName = objectInput.readUTF();
		fullName = objectInput.readUTF();
		email = objectInput.readUTF();
		password = objectInput.readUTF();
		accessibleStatus = objectInput.readInt();
		roles = objectInput.readUTF();
		checkpoint = objectInput.readLong();
		syncTime = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(userSyncId);
		objectOutput.writeLong(applicationId);
		objectOutput.writeLong(employeeId);
		objectOutput.writeLong(userId);

		if (ssoUserName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ssoUserName);
		}

		if (appUserName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(appUserName);
		}

		if (fullName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fullName);
		}

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (password == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(password);
		}

		objectOutput.writeInt(accessibleStatus);

		if (roles == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(roles);
		}

		objectOutput.writeLong(checkpoint);
		objectOutput.writeLong(syncTime);
	}

	public long userSyncId;
	public long applicationId;
	public long employeeId;
	public long userId;
	public String ssoUserName;
	public String appUserName;
	public String fullName;
	public String email;
	public String password;
	public int accessibleStatus;
	public String roles;
	public long checkpoint;
	public long syncTime;
}