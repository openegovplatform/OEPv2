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

package org.oep.core.processmgt.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import org.oep.core.processmgt.model.UserAssignment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing UserAssignment in entity cache.
 *
 * @author trungdk
 * @see UserAssignment
 * @generated
 */
public class UserAssignmentCacheModel implements CacheModel<UserAssignment>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{userAssignmentId=");
		sb.append(userAssignmentId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", processOrderId=");
		sb.append(processOrderId);
		sb.append(", dossierStepId=");
		sb.append(dossierStepId);
		sb.append(", assignToUserId=");
		sb.append(assignToUserId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UserAssignment toEntityModel() {
		UserAssignmentImpl userAssignmentImpl = new UserAssignmentImpl();

		userAssignmentImpl.setUserAssignmentId(userAssignmentId);
		userAssignmentImpl.setUserId(userId);
		userAssignmentImpl.setGroupId(groupId);
		userAssignmentImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			userAssignmentImpl.setCreateDate(null);
		}
		else {
			userAssignmentImpl.setCreateDate(new Date(createDate));
		}

		userAssignmentImpl.setProcessOrderId(processOrderId);
		userAssignmentImpl.setDossierStepId(dossierStepId);
		userAssignmentImpl.setAssignToUserId(assignToUserId);

		userAssignmentImpl.resetOriginalValues();

		return userAssignmentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		userAssignmentId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		processOrderId = objectInput.readLong();
		dossierStepId = objectInput.readLong();
		assignToUserId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(userAssignmentId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(processOrderId);
		objectOutput.writeLong(dossierStepId);
		objectOutput.writeLong(assignToUserId);
	}

	public long userAssignmentId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long processOrderId;
	public long dossierStepId;
	public long assignToUserId;
}