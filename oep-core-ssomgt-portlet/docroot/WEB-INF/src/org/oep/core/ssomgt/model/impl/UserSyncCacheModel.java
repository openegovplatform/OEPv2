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
import com.liferay.portal.model.CacheModel;

import org.oep.core.ssomgt.model.UserSync;

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
		StringBundler sb = new StringBundler(15);

		sb.append("{userSyncId=");
		sb.append(userSyncId);
		sb.append(", applicationId=");
		sb.append(applicationId);
		sb.append(", employeeId=");
		sb.append(employeeId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", accessible=");
		sb.append(accessible);
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
		userSyncImpl.setAccessible(accessible);

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
		accessible = objectInput.readInt();
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
		objectOutput.writeInt(accessible);
		objectOutput.writeLong(checkpoint);
		objectOutput.writeLong(syncTime);
	}

	public long userSyncId;
	public long applicationId;
	public long employeeId;
	public long userId;
	public int accessible;
	public long checkpoint;
	public long syncTime;
}