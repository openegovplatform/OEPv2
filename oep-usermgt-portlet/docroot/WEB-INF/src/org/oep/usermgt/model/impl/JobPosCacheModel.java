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

package org.oep.usermgt.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.oep.usermgt.model.JobPos;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JobPos in entity cache.
 *
 * @author NQMINH
 * @see JobPos
 * @generated
 */
public class JobPosCacheModel implements CacheModel<JobPos>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{jobPosId=");
		sb.append(jobPosId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", title=");
		sb.append(title);
		sb.append(", positionCatNo=");
		sb.append(positionCatNo);
		sb.append(", workingUnitId=");
		sb.append(workingUnitId);
		sb.append(", subWorkingUnitId=");
		sb.append(subWorkingUnitId);
		sb.append(", leader=");
		sb.append(leader);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JobPos toEntityModel() {
		JobPosImpl jobPosImpl = new JobPosImpl();

		jobPosImpl.setJobPosId(jobPosId);
		jobPosImpl.setCompanyId(companyId);
		jobPosImpl.setGroupId(groupId);
		jobPosImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			jobPosImpl.setCreateDate(null);
		}
		else {
			jobPosImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jobPosImpl.setModifiedDate(null);
		}
		else {
			jobPosImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (title == null) {
			jobPosImpl.setTitle(StringPool.BLANK);
		}
		else {
			jobPosImpl.setTitle(title);
		}

		if (positionCatNo == null) {
			jobPosImpl.setPositionCatNo(StringPool.BLANK);
		}
		else {
			jobPosImpl.setPositionCatNo(positionCatNo);
		}

		jobPosImpl.setWorkingUnitId(workingUnitId);
		jobPosImpl.setSubWorkingUnitId(subWorkingUnitId);
		jobPosImpl.setLeader(leader);

		jobPosImpl.resetOriginalValues();

		return jobPosImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		jobPosId = objectInput.readLong();
		companyId = objectInput.readLong();
		groupId = objectInput.readLong();
		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		title = objectInput.readUTF();
		positionCatNo = objectInput.readUTF();
		workingUnitId = objectInput.readLong();
		subWorkingUnitId = objectInput.readLong();
		leader = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(jobPosId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (positionCatNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(positionCatNo);
		}

		objectOutput.writeLong(workingUnitId);
		objectOutput.writeLong(subWorkingUnitId);
		objectOutput.writeInt(leader);
	}

	public long jobPosId;
	public long companyId;
	public long groupId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public String title;
	public String positionCatNo;
	public long workingUnitId;
	public long subWorkingUnitId;
	public int leader;
}