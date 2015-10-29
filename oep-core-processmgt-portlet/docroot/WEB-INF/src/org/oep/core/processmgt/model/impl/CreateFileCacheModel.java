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

package org.oep.core.processmgt.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import org.oep.core.processmgt.model.CreateFile;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CreateFile in entity cache.
 *
 * @author trungdk
 * @see CreateFile
 * @generated
 */
public class CreateFileCacheModel implements CacheModel<CreateFile>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{createFileId=");
		sb.append(createFileId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", processOrderId=");
		sb.append(processOrderId);
		sb.append(", dossierStepId=");
		sb.append(dossierStepId);
		sb.append(", stepDate=");
		sb.append(stepDate);
		sb.append(", docFileId=");
		sb.append(docFileId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CreateFile toEntityModel() {
		CreateFileImpl createFileImpl = new CreateFileImpl();

		createFileImpl.setCreateFileId(createFileId);
		createFileImpl.setUserId(userId);
		createFileImpl.setGroupId(groupId);
		createFileImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			createFileImpl.setCreateDate(null);
		}
		else {
			createFileImpl.setCreateDate(new Date(createDate));
		}

		createFileImpl.setProcessOrderId(processOrderId);
		createFileImpl.setDossierStepId(dossierStepId);

		if (stepDate == Long.MIN_VALUE) {
			createFileImpl.setStepDate(null);
		}
		else {
			createFileImpl.setStepDate(new Date(stepDate));
		}

		createFileImpl.setDocFileId(docFileId);

		createFileImpl.resetOriginalValues();

		return createFileImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		createFileId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		processOrderId = objectInput.readLong();
		dossierStepId = objectInput.readLong();
		stepDate = objectInput.readLong();
		docFileId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(createFileId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(processOrderId);
		objectOutput.writeLong(dossierStepId);
		objectOutput.writeLong(stepDate);
		objectOutput.writeLong(docFileId);
	}

	public long createFileId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long processOrderId;
	public long dossierStepId;
	public long stepDate;
	public long docFileId;
}