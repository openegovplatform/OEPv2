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

package org.oep.dossiermgt.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.oep.dossiermgt.model.DocFileVersion;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DocFileVersion in entity cache.
 *
 * @author trungdk
 * @see DocFileVersion
 * @generated
 */
public class DocFileVersionCacheModel implements CacheModel<DocFileVersion>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", docFileVersionId=");
		sb.append(docFileVersionId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", docFileId=");
		sb.append(docFileId);
		sb.append(", fileEntryId=");
		sb.append(fileEntryId);
		sb.append(", xmlContent=");
		sb.append(xmlContent);
		sb.append(", ebMessageId=");
		sb.append(ebMessageId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DocFileVersion toEntityModel() {
		DocFileVersionImpl docFileVersionImpl = new DocFileVersionImpl();

		if (uuid == null) {
			docFileVersionImpl.setUuid(StringPool.BLANK);
		}
		else {
			docFileVersionImpl.setUuid(uuid);
		}

		docFileVersionImpl.setDocFileVersionId(docFileVersionId);
		docFileVersionImpl.setUserId(userId);
		docFileVersionImpl.setGroupId(groupId);
		docFileVersionImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			docFileVersionImpl.setCreateDate(null);
		}
		else {
			docFileVersionImpl.setCreateDate(new Date(createDate));
		}

		docFileVersionImpl.setDocFileId(docFileId);
		docFileVersionImpl.setFileEntryId(fileEntryId);

		if (xmlContent == null) {
			docFileVersionImpl.setXmlContent(StringPool.BLANK);
		}
		else {
			docFileVersionImpl.setXmlContent(xmlContent);
		}

		docFileVersionImpl.setEbMessageId(ebMessageId);

		docFileVersionImpl.resetOriginalValues();

		return docFileVersionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		docFileVersionId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		docFileId = objectInput.readLong();
		fileEntryId = objectInput.readLong();
		xmlContent = objectInput.readUTF();
		ebMessageId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(docFileVersionId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(docFileId);
		objectOutput.writeLong(fileEntryId);

		if (xmlContent == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(xmlContent);
		}

		objectOutput.writeLong(ebMessageId);
	}

	public String uuid;
	public long docFileVersionId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long docFileId;
	public long fileEntryId;
	public String xmlContent;
	public long ebMessageId;
}