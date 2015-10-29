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

import org.oep.core.datamgt.model.DictCollection;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DictCollection in entity cache.
 *
 * @author NQMINH
 * @see DictCollection
 * @generated
 */
public class DictCollectionCacheModel implements CacheModel<DictCollection>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{dictCollectionId=");
		sb.append(dictCollectionId);
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
		sb.append(", name=");
		sb.append(name);
		sb.append(", version=");
		sb.append(version);
		sb.append(", title=");
		sb.append(title);
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
	public DictCollection toEntityModel() {
		DictCollectionImpl dictCollectionImpl = new DictCollectionImpl();

		dictCollectionImpl.setDictCollectionId(dictCollectionId);
		dictCollectionImpl.setCompanyId(companyId);
		dictCollectionImpl.setGroupId(groupId);
		dictCollectionImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			dictCollectionImpl.setCreateDate(null);
		}
		else {
			dictCollectionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			dictCollectionImpl.setModifiedDate(null);
		}
		else {
			dictCollectionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			dictCollectionImpl.setName(StringPool.BLANK);
		}
		else {
			dictCollectionImpl.setName(name);
		}

		if (version == null) {
			dictCollectionImpl.setVersion(StringPool.BLANK);
		}
		else {
			dictCollectionImpl.setVersion(version);
		}

		if (title == null) {
			dictCollectionImpl.setTitle(StringPool.BLANK);
		}
		else {
			dictCollectionImpl.setTitle(title);
		}

		if (validatedFrom == Long.MIN_VALUE) {
			dictCollectionImpl.setValidatedFrom(null);
		}
		else {
			dictCollectionImpl.setValidatedFrom(new Date(validatedFrom));
		}

		if (validatedTo == Long.MIN_VALUE) {
			dictCollectionImpl.setValidatedTo(null);
		}
		else {
			dictCollectionImpl.setValidatedTo(new Date(validatedTo));
		}

		dictCollectionImpl.setStatus(status);

		dictCollectionImpl.resetOriginalValues();

		return dictCollectionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		dictCollectionId = objectInput.readLong();
		companyId = objectInput.readLong();
		groupId = objectInput.readLong();
		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		version = objectInput.readUTF();
		title = objectInput.readUTF();
		validatedFrom = objectInput.readLong();
		validatedTo = objectInput.readLong();
		status = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(dictCollectionId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (version == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(version);
		}

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		objectOutput.writeLong(validatedFrom);
		objectOutput.writeLong(validatedTo);
		objectOutput.writeInt(status);
	}

	public long dictCollectionId;
	public long companyId;
	public long groupId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String version;
	public String title;
	public long validatedFrom;
	public long validatedTo;
	public int status;
}