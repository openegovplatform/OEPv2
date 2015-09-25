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

import org.oep.core.dossiermgt.model.DocFile;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DocFile in entity cache.
 *
 * @author trungdk
 * @see DocFile
 * @generated
 */
public class DocFileCacheModel implements CacheModel<DocFile>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", docFileId=");
		sb.append(docFileId);
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
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", dossierDocId=");
		sb.append(dossierDocId);
		sb.append(", docTemplateId=");
		sb.append(docTemplateId);
		sb.append(", docFileVersionId=");
		sb.append(docFileVersionId);
		sb.append(", docName=");
		sb.append(docName);
		sb.append(", issueDate=");
		sb.append(issueDate);
		sb.append(", note=");
		sb.append(note);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DocFile toEntityModel() {
		DocFileImpl docFileImpl = new DocFileImpl();

		if (uuid == null) {
			docFileImpl.setUuid(StringPool.BLANK);
		}
		else {
			docFileImpl.setUuid(uuid);
		}

		docFileImpl.setDocFileId(docFileId);
		docFileImpl.setUserId(userId);
		docFileImpl.setGroupId(groupId);
		docFileImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			docFileImpl.setCreateDate(null);
		}
		else {
			docFileImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			docFileImpl.setModifiedDate(null);
		}
		else {
			docFileImpl.setModifiedDate(new Date(modifiedDate));
		}

		docFileImpl.setDossierId(dossierId);
		docFileImpl.setDossierDocId(dossierDocId);
		docFileImpl.setDocTemplateId(docTemplateId);
		docFileImpl.setDocFileVersionId(docFileVersionId);

		if (docName == null) {
			docFileImpl.setDocName(StringPool.BLANK);
		}
		else {
			docFileImpl.setDocName(docName);
		}

		if (issueDate == Long.MIN_VALUE) {
			docFileImpl.setIssueDate(null);
		}
		else {
			docFileImpl.setIssueDate(new Date(issueDate));
		}

		if (note == null) {
			docFileImpl.setNote(StringPool.BLANK);
		}
		else {
			docFileImpl.setNote(note);
		}

		docFileImpl.resetOriginalValues();

		return docFileImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		docFileId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		dossierId = objectInput.readLong();
		dossierDocId = objectInput.readLong();
		docTemplateId = objectInput.readLong();
		docFileVersionId = objectInput.readLong();
		docName = objectInput.readUTF();
		issueDate = objectInput.readLong();
		note = objectInput.readUTF();
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

		objectOutput.writeLong(docFileId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(dossierId);
		objectOutput.writeLong(dossierDocId);
		objectOutput.writeLong(docTemplateId);
		objectOutput.writeLong(docFileVersionId);

		if (docName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(docName);
		}

		objectOutput.writeLong(issueDate);

		if (note == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(note);
		}
	}

	public String uuid;
	public long docFileId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public long dossierId;
	public long dossierDocId;
	public long docTemplateId;
	public long docFileVersionId;
	public String docName;
	public long issueDate;
	public String note;
}