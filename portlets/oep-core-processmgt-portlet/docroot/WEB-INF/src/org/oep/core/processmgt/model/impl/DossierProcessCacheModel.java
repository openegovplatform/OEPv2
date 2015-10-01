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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.oep.core.processmgt.model.DossierProcess;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DossierProcess in entity cache.
 *
 * @author trungdk
 * @see DossierProcess
 * @generated
 */
public class DossierProcessCacheModel implements CacheModel<DossierProcess>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{dossierProcessId=");
		sb.append(dossierProcessId);
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
		sb.append(", govAgentId=");
		sb.append(govAgentId);
		sb.append(", govAgentName=");
		sb.append(govAgentName);
		sb.append(", startDossierStepId=");
		sb.append(startDossierStepId);
		sb.append(", daysDuration=");
		sb.append(daysDuration);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DossierProcess toEntityModel() {
		DossierProcessImpl dossierProcessImpl = new DossierProcessImpl();

		dossierProcessImpl.setDossierProcessId(dossierProcessId);
		dossierProcessImpl.setUserId(userId);
		dossierProcessImpl.setGroupId(groupId);
		dossierProcessImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			dossierProcessImpl.setCreateDate(null);
		}
		else {
			dossierProcessImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			dossierProcessImpl.setModifiedDate(null);
		}
		else {
			dossierProcessImpl.setModifiedDate(new Date(modifiedDate));
		}

		dossierProcessImpl.setDossierProcId(dossierProcId);

		if (govAgentId == null) {
			dossierProcessImpl.setGovAgentId(StringPool.BLANK);
		}
		else {
			dossierProcessImpl.setGovAgentId(govAgentId);
		}

		if (govAgentName == null) {
			dossierProcessImpl.setGovAgentName(StringPool.BLANK);
		}
		else {
			dossierProcessImpl.setGovAgentName(govAgentName);
		}

		dossierProcessImpl.setStartDossierStepId(startDossierStepId);
		dossierProcessImpl.setDaysDuration(daysDuration);

		dossierProcessImpl.resetOriginalValues();

		return dossierProcessImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		dossierProcessId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		dossierProcId = objectInput.readLong();
		govAgentId = objectInput.readUTF();
		govAgentName = objectInput.readUTF();
		startDossierStepId = objectInput.readLong();
		daysDuration = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(dossierProcessId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(dossierProcId);

		if (govAgentId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(govAgentId);
		}

		if (govAgentName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(govAgentName);
		}

		objectOutput.writeLong(startDossierStepId);
		objectOutput.writeInt(daysDuration);
	}

	public long dossierProcessId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public long dossierProcId;
	public String govAgentId;
	public String govAgentName;
	public long startDossierStepId;
	public int daysDuration;
}