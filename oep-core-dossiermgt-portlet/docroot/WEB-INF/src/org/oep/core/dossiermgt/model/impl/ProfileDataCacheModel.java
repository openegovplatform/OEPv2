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

import org.oep.core.dossiermgt.model.ProfileData;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ProfileData in entity cache.
 *
 * @author trungdk
 * @see ProfileData
 * @generated
 */
public class ProfileDataCacheModel implements CacheModel<ProfileData>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{profileDataId=");
		sb.append(profileDataId);
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
		sb.append(", fieldName=");
		sb.append(fieldName);
		sb.append(", fieldValue=");
		sb.append(fieldValue);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ProfileData toEntityModel() {
		ProfileDataImpl profileDataImpl = new ProfileDataImpl();

		profileDataImpl.setProfileDataId(profileDataId);
		profileDataImpl.setUserId(userId);
		profileDataImpl.setGroupId(groupId);
		profileDataImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			profileDataImpl.setCreateDate(null);
		}
		else {
			profileDataImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			profileDataImpl.setModifiedDate(null);
		}
		else {
			profileDataImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (fieldName == null) {
			profileDataImpl.setFieldName(StringPool.BLANK);
		}
		else {
			profileDataImpl.setFieldName(fieldName);
		}

		if (fieldValue == null) {
			profileDataImpl.setFieldValue(StringPool.BLANK);
		}
		else {
			profileDataImpl.setFieldValue(fieldValue);
		}

		profileDataImpl.resetOriginalValues();

		return profileDataImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		profileDataId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		fieldName = objectInput.readUTF();
		fieldValue = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(profileDataId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (fieldName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fieldName);
		}

		if (fieldValue == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fieldValue);
		}
	}

	public long profileDataId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public String fieldName;
	public String fieldValue;
}