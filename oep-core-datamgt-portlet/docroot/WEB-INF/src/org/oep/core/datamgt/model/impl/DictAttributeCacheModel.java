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

package org.oep.core.datamgt.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.oep.core.datamgt.model.DictAttribute;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DictAttribute in entity cache.
 *
 * @author NQMINH
 * @see DictAttribute
 * @generated
 */
public class DictAttributeCacheModel implements CacheModel<DictAttribute>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{dictAttributeId=");
		sb.append(dictAttributeId);
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
		sb.append(", collectionName=");
		sb.append(collectionName);
		sb.append(", name=");
		sb.append(name);
		sb.append(", title=");
		sb.append(title);
		sb.append(", dataType=");
		sb.append(dataType);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DictAttribute toEntityModel() {
		DictAttributeImpl dictAttributeImpl = new DictAttributeImpl();

		dictAttributeImpl.setDictAttributeId(dictAttributeId);
		dictAttributeImpl.setCompanyId(companyId);
		dictAttributeImpl.setGroupId(groupId);
		dictAttributeImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			dictAttributeImpl.setCreateDate(null);
		}
		else {
			dictAttributeImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			dictAttributeImpl.setModifiedDate(null);
		}
		else {
			dictAttributeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (collectionName == null) {
			dictAttributeImpl.setCollectionName(StringPool.BLANK);
		}
		else {
			dictAttributeImpl.setCollectionName(collectionName);
		}

		if (name == null) {
			dictAttributeImpl.setName(StringPool.BLANK);
		}
		else {
			dictAttributeImpl.setName(name);
		}

		if (title == null) {
			dictAttributeImpl.setTitle(StringPool.BLANK);
		}
		else {
			dictAttributeImpl.setTitle(title);
		}

		if (dataType == null) {
			dictAttributeImpl.setDataType(StringPool.BLANK);
		}
		else {
			dictAttributeImpl.setDataType(dataType);
		}

		dictAttributeImpl.resetOriginalValues();

		return dictAttributeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		dictAttributeId = objectInput.readLong();
		companyId = objectInput.readLong();
		groupId = objectInput.readLong();
		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		collectionName = objectInput.readUTF();
		name = objectInput.readUTF();
		title = objectInput.readUTF();
		dataType = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(dictAttributeId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (collectionName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(collectionName);
		}

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (dataType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dataType);
		}
	}

	public long dictAttributeId;
	public long companyId;
	public long groupId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public String collectionName;
	public String name;
	public String title;
	public String dataType;
}