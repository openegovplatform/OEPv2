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

package org.oep.core.datamgt.dictionary.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.oep.core.datamgt.dictionary.model.DictMetaData;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DictMetaData in entity cache.
 *
 * @author TrungDK
 * @see DictMetaData
 * @generated
 */
public class DictMetaDataCacheModel implements CacheModel<DictMetaData>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{dictMetaDataId=");
		sb.append(dictMetaDataId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", dictDataId=");
		sb.append(dictDataId);
		sb.append(", attributeName=");
		sb.append(attributeName);
		sb.append(", attributeValue=");
		sb.append(attributeValue);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DictMetaData toEntityModel() {
		DictMetaDataImpl dictMetaDataImpl = new DictMetaDataImpl();

		dictMetaDataImpl.setDictMetaDataId(dictMetaDataId);
		dictMetaDataImpl.setCompanyId(companyId);
		dictMetaDataImpl.setUserId(userId);
		dictMetaDataImpl.setGroupId(groupId);

		if (createDate == Long.MIN_VALUE) {
			dictMetaDataImpl.setCreateDate(null);
		}
		else {
			dictMetaDataImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			dictMetaDataImpl.setModifiedDate(null);
		}
		else {
			dictMetaDataImpl.setModifiedDate(new Date(modifiedDate));
		}

		dictMetaDataImpl.setDictDataId(dictDataId);

		if (attributeName == null) {
			dictMetaDataImpl.setAttributeName(StringPool.BLANK);
		}
		else {
			dictMetaDataImpl.setAttributeName(attributeName);
		}

		if (attributeValue == null) {
			dictMetaDataImpl.setAttributeValue(StringPool.BLANK);
		}
		else {
			dictMetaDataImpl.setAttributeValue(attributeValue);
		}

		dictMetaDataImpl.resetOriginalValues();

		return dictMetaDataImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		dictMetaDataId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		dictDataId = objectInput.readLong();
		attributeName = objectInput.readUTF();
		attributeValue = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(dictMetaDataId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(dictDataId);

		if (attributeName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(attributeName);
		}

		if (attributeValue == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(attributeValue);
		}
	}

	public long dictMetaDataId;
	public long companyId;
	public long userId;
	public long groupId;
	public long createDate;
	public long modifiedDate;
	public long dictDataId;
	public String attributeName;
	public String attributeValue;
}