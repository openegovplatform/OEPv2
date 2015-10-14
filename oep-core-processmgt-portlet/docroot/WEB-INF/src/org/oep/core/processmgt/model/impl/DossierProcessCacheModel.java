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
		StringBundler sb = new StringBundler(25);

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
		sb.append(", govAgencyId=");
		sb.append(govAgencyId);
		sb.append(", govAgencyName=");
		sb.append(govAgencyName);
		sb.append(", startStepTransitionId=");
		sb.append(startStepTransitionId);
		sb.append(", daysDuration=");
		sb.append(daysDuration);
		sb.append(", fee=");
		sb.append(fee);
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

		if (govAgencyId == null) {
			dossierProcessImpl.setGovAgencyId(StringPool.BLANK);
		}
		else {
			dossierProcessImpl.setGovAgencyId(govAgencyId);
		}

		if (govAgencyName == null) {
			dossierProcessImpl.setGovAgencyName(StringPool.BLANK);
		}
		else {
			dossierProcessImpl.setGovAgencyName(govAgencyName);
		}

		dossierProcessImpl.setStartStepTransitionId(startStepTransitionId);
		dossierProcessImpl.setDaysDuration(daysDuration);
		dossierProcessImpl.setFee(fee);

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
		govAgencyId = objectInput.readUTF();
		govAgencyName = objectInput.readUTF();
		startStepTransitionId = objectInput.readLong();
		daysDuration = objectInput.readInt();
		fee = objectInput.readInt();
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

		if (govAgencyId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(govAgencyId);
		}

		if (govAgencyName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(govAgencyName);
		}

		objectOutput.writeLong(startStepTransitionId);
		objectOutput.writeInt(daysDuration);
		objectOutput.writeInt(fee);
	}

	public long dossierProcessId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public long dossierProcId;
	public String govAgencyId;
	public String govAgencyName;
	public long startStepTransitionId;
	public int daysDuration;
	public int fee;
}