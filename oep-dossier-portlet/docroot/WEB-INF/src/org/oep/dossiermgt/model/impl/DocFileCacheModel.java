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

import org.oep.dossiermgt.model.DocFile;

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
		StringBundler sb = new StringBundler(37);

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
		sb.append(", docFileName=");
		sb.append(docFileName);
		sb.append(", docFileType=");
		sb.append(docFileType);
		sb.append(", verifyStatus=");
		sb.append(verifyStatus);
		sb.append(", note=");
		sb.append(note);
		sb.append(", approveBy=");
		sb.append(approveBy);
		sb.append(", approveDate=");
		sb.append(approveDate);
		sb.append(", premier=");
		sb.append(premier);
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

		if (docFileName == null) {
			docFileImpl.setDocFileName(StringPool.BLANK);
		}
		else {
			docFileImpl.setDocFileName(docFileName);
		}

		docFileImpl.setDocFileType(docFileType);
		docFileImpl.setVerifyStatus(verifyStatus);

		if (note == null) {
			docFileImpl.setNote(StringPool.BLANK);
		}
		else {
			docFileImpl.setNote(note);
		}

		if (approveBy == null) {
			docFileImpl.setApproveBy(StringPool.BLANK);
		}
		else {
			docFileImpl.setApproveBy(approveBy);
		}

		if (approveDate == Long.MIN_VALUE) {
			docFileImpl.setApproveDate(null);
		}
		else {
			docFileImpl.setApproveDate(new Date(approveDate));
		}

		docFileImpl.setPremier(premier);

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
		docFileName = objectInput.readUTF();
		docFileType = objectInput.readLong();
		verifyStatus = objectInput.readInt();
		note = objectInput.readUTF();
		approveBy = objectInput.readUTF();
		approveDate = objectInput.readLong();
		premier = objectInput.readInt();
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

		if (docFileName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(docFileName);
		}

		objectOutput.writeLong(docFileType);
		objectOutput.writeInt(verifyStatus);

		if (note == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(note);
		}

		if (approveBy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(approveBy);
		}

		objectOutput.writeLong(approveDate);
		objectOutput.writeInt(premier);
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
	public String docFileName;
	public long docFileType;
	public int verifyStatus;
	public String note;
	public String approveBy;
	public long approveDate;
	public int premier;
}