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

package org.oep.core.datamgt.parameter.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.oep.core.datamgt.parameter.model.UserParameter;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing UserParameter in entity cache.
 *
 * @author TrungDK
 * @see UserParameter
 * @generated
 */
public class UserParameterCacheModel implements CacheModel<UserParameter>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{userParameterId=");
		sb.append(userParameterId);
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
		sb.append(", applicationName=");
		sb.append(applicationName);
		sb.append(", parameterName=");
		sb.append(parameterName);
		sb.append(", title=");
		sb.append(title);
		sb.append(", parameterValue=");
		sb.append(parameterValue);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UserParameter toEntityModel() {
		UserParameterImpl userParameterImpl = new UserParameterImpl();

		userParameterImpl.setUserParameterId(userParameterId);
		userParameterImpl.setUserId(userId);
		userParameterImpl.setGroupId(groupId);
		userParameterImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			userParameterImpl.setCreateDate(null);
		}
		else {
			userParameterImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			userParameterImpl.setModifiedDate(null);
		}
		else {
			userParameterImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (applicationName == null) {
			userParameterImpl.setApplicationName(StringPool.BLANK);
		}
		else {
			userParameterImpl.setApplicationName(applicationName);
		}

		if (parameterName == null) {
			userParameterImpl.setParameterName(StringPool.BLANK);
		}
		else {
			userParameterImpl.setParameterName(parameterName);
		}

		if (title == null) {
			userParameterImpl.setTitle(StringPool.BLANK);
		}
		else {
			userParameterImpl.setTitle(title);
		}

		if (parameterValue == null) {
			userParameterImpl.setParameterValue(StringPool.BLANK);
		}
		else {
			userParameterImpl.setParameterValue(parameterValue);
		}

		userParameterImpl.resetOriginalValues();

		return userParameterImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		userParameterId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		applicationName = objectInput.readUTF();
		parameterName = objectInput.readUTF();
		title = objectInput.readUTF();
		parameterValue = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(userParameterId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (applicationName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicationName);
		}

		if (parameterName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(parameterName);
		}

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (parameterValue == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(parameterValue);
		}
	}

	public long userParameterId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public String applicationName;
	public String parameterName;
	public String title;
	public String parameterValue;
}