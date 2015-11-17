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
import com.liferay.portal.model.CacheModel;

import org.oep.ssomgt.model.AppRole2JobPos;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AppRole2JobPos in entity cache.
 *
 * @author trungdk
 * @see AppRole2JobPos
 * @generated
 */
public class AppRole2JobPosCacheModel implements CacheModel<AppRole2JobPos>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{appRole2JobPosId=");
		sb.append(appRole2JobPosId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", appRoleId=");
		sb.append(appRoleId);
		sb.append(", jobPosId=");
		sb.append(jobPosId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AppRole2JobPos toEntityModel() {
		AppRole2JobPosImpl appRole2JobPosImpl = new AppRole2JobPosImpl();

		appRole2JobPosImpl.setAppRole2JobPosId(appRole2JobPosId);
		appRole2JobPosImpl.setUserId(userId);
		appRole2JobPosImpl.setGroupId(groupId);
		appRole2JobPosImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			appRole2JobPosImpl.setCreateDate(null);
		}
		else {
			appRole2JobPosImpl.setCreateDate(new Date(createDate));
		}

		appRole2JobPosImpl.setAppRoleId(appRoleId);
		appRole2JobPosImpl.setJobPosId(jobPosId);

		appRole2JobPosImpl.resetOriginalValues();

		return appRole2JobPosImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		appRole2JobPosId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		appRoleId = objectInput.readLong();
		jobPosId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(appRole2JobPosId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(appRoleId);
		objectOutput.writeLong(jobPosId);
	}

	public long appRole2JobPosId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long appRoleId;
	public long jobPosId;
}