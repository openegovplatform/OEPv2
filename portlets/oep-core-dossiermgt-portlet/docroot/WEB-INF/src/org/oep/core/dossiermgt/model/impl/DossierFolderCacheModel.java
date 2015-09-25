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

import org.oep.core.dossiermgt.model.DossierFolder;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DossierFolder in entity cache.
 *
 * @author trungdk
 * @see DossierFolder
 * @generated
 */
public class DossierFolderCacheModel implements CacheModel<DossierFolder>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", dossierFolderId=");
		sb.append(dossierFolderId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", folderName=");
		sb.append(folderName);
		sb.append(", parentFolderId=");
		sb.append(parentFolderId);
		sb.append(", sequenceNo=");
		sb.append(sequenceNo);
		sb.append(", procedureFilter=");
		sb.append(procedureFilter);
		sb.append(", statusFilter=");
		sb.append(statusFilter);
		sb.append(", filterByOrganization=");
		sb.append(filterByOrganization);
		sb.append(", filterByUser=");
		sb.append(filterByUser);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DossierFolder toEntityModel() {
		DossierFolderImpl dossierFolderImpl = new DossierFolderImpl();

		if (uuid == null) {
			dossierFolderImpl.setUuid(StringPool.BLANK);
		}
		else {
			dossierFolderImpl.setUuid(uuid);
		}

		dossierFolderImpl.setDossierFolderId(dossierFolderId);
		dossierFolderImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			dossierFolderImpl.setCreateDate(null);
		}
		else {
			dossierFolderImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			dossierFolderImpl.setModifiedDate(null);
		}
		else {
			dossierFolderImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (folderName == null) {
			dossierFolderImpl.setFolderName(StringPool.BLANK);
		}
		else {
			dossierFolderImpl.setFolderName(folderName);
		}

		dossierFolderImpl.setParentFolderId(parentFolderId);
		dossierFolderImpl.setSequenceNo(sequenceNo);

		if (procedureFilter == null) {
			dossierFolderImpl.setProcedureFilter(StringPool.BLANK);
		}
		else {
			dossierFolderImpl.setProcedureFilter(procedureFilter);
		}

		if (statusFilter == null) {
			dossierFolderImpl.setStatusFilter(StringPool.BLANK);
		}
		else {
			dossierFolderImpl.setStatusFilter(statusFilter);
		}

		dossierFolderImpl.setFilterByOrganization(filterByOrganization);
		dossierFolderImpl.setFilterByUser(filterByUser);

		dossierFolderImpl.resetOriginalValues();

		return dossierFolderImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		dossierFolderId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		folderName = objectInput.readUTF();
		parentFolderId = objectInput.readLong();
		sequenceNo = objectInput.readInt();
		procedureFilter = objectInput.readUTF();
		statusFilter = objectInput.readUTF();
		filterByOrganization = objectInput.readInt();
		filterByUser = objectInput.readInt();
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

		objectOutput.writeLong(dossierFolderId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (folderName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(folderName);
		}

		objectOutput.writeLong(parentFolderId);
		objectOutput.writeInt(sequenceNo);

		if (procedureFilter == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(procedureFilter);
		}

		if (statusFilter == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(statusFilter);
		}

		objectOutput.writeInt(filterByOrganization);
		objectOutput.writeInt(filterByUser);
	}

	public String uuid;
	public long dossierFolderId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public String folderName;
	public long parentFolderId;
	public int sequenceNo;
	public String procedureFilter;
	public String statusFilter;
	public int filterByOrganization;
	public int filterByUser;
}