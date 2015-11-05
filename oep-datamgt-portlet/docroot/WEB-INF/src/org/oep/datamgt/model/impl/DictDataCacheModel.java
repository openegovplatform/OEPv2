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

package org.oep.datamgt.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.oep.datamgt.model.DictData;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DictData in entity cache.
 *
 * @author NQMINH
 * @see DictData
 * @generated
 */
public class DictDataCacheModel implements CacheModel<DictData>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{dictDataId=");
		sb.append(dictDataId);
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
		sb.append(", dataCode=");
		sb.append(dataCode);
		sb.append(", node_1=");
		sb.append(node_1);
		sb.append(", node_2=");
		sb.append(node_2);
		sb.append(", node_3=");
		sb.append(node_3);
		sb.append(", node_4=");
		sb.append(node_4);
		sb.append(", node_5=");
		sb.append(node_5);
		sb.append(", dataLevel=");
		sb.append(dataLevel);
		sb.append(", title=");
		sb.append(title);
		sb.append(", description=");
		sb.append(description);
		sb.append(", validatedFrom=");
		sb.append(validatedFrom);
		sb.append(", validatedTo=");
		sb.append(validatedTo);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DictData toEntityModel() {
		DictDataImpl dictDataImpl = new DictDataImpl();

		dictDataImpl.setDictDataId(dictDataId);
		dictDataImpl.setCompanyId(companyId);
		dictDataImpl.setGroupId(groupId);
		dictDataImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			dictDataImpl.setCreateDate(null);
		}
		else {
			dictDataImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			dictDataImpl.setModifiedDate(null);
		}
		else {
			dictDataImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (collectionName == null) {
			dictDataImpl.setCollectionName(StringPool.BLANK);
		}
		else {
			dictDataImpl.setCollectionName(collectionName);
		}

		if (dataCode == null) {
			dictDataImpl.setDataCode(StringPool.BLANK);
		}
		else {
			dictDataImpl.setDataCode(dataCode);
		}

		if (node_1 == null) {
			dictDataImpl.setNode_1(StringPool.BLANK);
		}
		else {
			dictDataImpl.setNode_1(node_1);
		}

		if (node_2 == null) {
			dictDataImpl.setNode_2(StringPool.BLANK);
		}
		else {
			dictDataImpl.setNode_2(node_2);
		}

		if (node_3 == null) {
			dictDataImpl.setNode_3(StringPool.BLANK);
		}
		else {
			dictDataImpl.setNode_3(node_3);
		}

		if (node_4 == null) {
			dictDataImpl.setNode_4(StringPool.BLANK);
		}
		else {
			dictDataImpl.setNode_4(node_4);
		}

		if (node_5 == null) {
			dictDataImpl.setNode_5(StringPool.BLANK);
		}
		else {
			dictDataImpl.setNode_5(node_5);
		}

		dictDataImpl.setDataLevel(dataLevel);

		if (title == null) {
			dictDataImpl.setTitle(StringPool.BLANK);
		}
		else {
			dictDataImpl.setTitle(title);
		}

		if (description == null) {
			dictDataImpl.setDescription(StringPool.BLANK);
		}
		else {
			dictDataImpl.setDescription(description);
		}

		if (validatedFrom == Long.MIN_VALUE) {
			dictDataImpl.setValidatedFrom(null);
		}
		else {
			dictDataImpl.setValidatedFrom(new Date(validatedFrom));
		}

		if (validatedTo == Long.MIN_VALUE) {
			dictDataImpl.setValidatedTo(null);
		}
		else {
			dictDataImpl.setValidatedTo(new Date(validatedTo));
		}

		dictDataImpl.setStatus(status);

		dictDataImpl.resetOriginalValues();

		return dictDataImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		dictDataId = objectInput.readLong();
		companyId = objectInput.readLong();
		groupId = objectInput.readLong();
		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		collectionName = objectInput.readUTF();
		dataCode = objectInput.readUTF();
		node_1 = objectInput.readUTF();
		node_2 = objectInput.readUTF();
		node_3 = objectInput.readUTF();
		node_4 = objectInput.readUTF();
		node_5 = objectInput.readUTF();
		dataLevel = objectInput.readInt();
		title = objectInput.readUTF();
		description = objectInput.readUTF();
		validatedFrom = objectInput.readLong();
		validatedTo = objectInput.readLong();
		status = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(dictDataId);
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

		if (dataCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dataCode);
		}

		if (node_1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(node_1);
		}

		if (node_2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(node_2);
		}

		if (node_3 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(node_3);
		}

		if (node_4 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(node_4);
		}

		if (node_5 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(node_5);
		}

		objectOutput.writeInt(dataLevel);

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeLong(validatedFrom);
		objectOutput.writeLong(validatedTo);
		objectOutput.writeInt(status);
	}

	public long dictDataId;
	public long companyId;
	public long groupId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public String collectionName;
	public String dataCode;
	public String node_1;
	public String node_2;
	public String node_3;
	public String node_4;
	public String node_5;
	public int dataLevel;
	public String title;
	public String description;
	public long validatedFrom;
	public long validatedTo;
	public int status;
}