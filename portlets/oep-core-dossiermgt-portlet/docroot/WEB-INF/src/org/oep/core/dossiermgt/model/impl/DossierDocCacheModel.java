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

import org.oep.core.dossiermgt.model.DossierDoc;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DossierDoc in entity cache.
 *
 * @author trungdk
 * @see DossierDoc
 * @generated
 */
public class DossierDocCacheModel implements CacheModel<DossierDoc>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{dossierDocId=");
		sb.append(dossierDocId);
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
		sb.append(", dossierProcId=");
		sb.append(dossierProcId);
		sb.append(", dossierDocNo=");
		sb.append(dossierDocNo);
		sb.append(", dossierDocName=");
		sb.append(dossierDocName);
		sb.append(", note=");
		sb.append(note);
		sb.append(", sequenceNo=");
		sb.append(sequenceNo);
		sb.append(", defaultDocTemplateId=");
		sb.append(defaultDocTemplateId);
		sb.append(", validationType=");
		sb.append(validationType);
		sb.append(", numberOfFile=");
		sb.append(numberOfFile);
		sb.append(", onlineForm=");
		sb.append(onlineForm);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DossierDoc toEntityModel() {
		DossierDocImpl dossierDocImpl = new DossierDocImpl();

		dossierDocImpl.setDossierDocId(dossierDocId);
		dossierDocImpl.setUserId(userId);
		dossierDocImpl.setGroupId(groupId);
		dossierDocImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			dossierDocImpl.setCreateDate(null);
		}
		else {
			dossierDocImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			dossierDocImpl.setModifiedDate(null);
		}
		else {
			dossierDocImpl.setModifiedDate(new Date(modifiedDate));
		}

		dossierDocImpl.setDossierProcId(dossierProcId);

		if (dossierDocNo == null) {
			dossierDocImpl.setDossierDocNo(StringPool.BLANK);
		}
		else {
			dossierDocImpl.setDossierDocNo(dossierDocNo);
		}

		if (dossierDocName == null) {
			dossierDocImpl.setDossierDocName(StringPool.BLANK);
		}
		else {
			dossierDocImpl.setDossierDocName(dossierDocName);
		}

		if (note == null) {
			dossierDocImpl.setNote(StringPool.BLANK);
		}
		else {
			dossierDocImpl.setNote(note);
		}

		dossierDocImpl.setSequenceNo(sequenceNo);
		dossierDocImpl.setDefaultDocTemplateId(defaultDocTemplateId);
		dossierDocImpl.setValidationType(validationType);
		dossierDocImpl.setNumberOfFile(numberOfFile);

		if (onlineForm == null) {
			dossierDocImpl.setOnlineForm(StringPool.BLANK);
		}
		else {
			dossierDocImpl.setOnlineForm(onlineForm);
		}

		dossierDocImpl.resetOriginalValues();

		return dossierDocImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		dossierDocId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		dossierProcId = objectInput.readLong();
		dossierDocNo = objectInput.readUTF();
		dossierDocName = objectInput.readUTF();
		note = objectInput.readUTF();
		sequenceNo = objectInput.readInt();
		defaultDocTemplateId = objectInput.readLong();
		validationType = objectInput.readInt();
		numberOfFile = objectInput.readInt();
		onlineForm = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(dossierDocId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(dossierProcId);

		if (dossierDocNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossierDocNo);
		}

		if (dossierDocName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossierDocName);
		}

		if (note == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(note);
		}

		objectOutput.writeInt(sequenceNo);
		objectOutput.writeLong(defaultDocTemplateId);
		objectOutput.writeInt(validationType);
		objectOutput.writeInt(numberOfFile);

		if (onlineForm == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(onlineForm);
		}
	}

	public long dossierDocId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public long dossierProcId;
	public String dossierDocNo;
	public String dossierDocName;
	public String note;
	public int sequenceNo;
	public long defaultDocTemplateId;
	public int validationType;
	public int numberOfFile;
	public String onlineForm;
}