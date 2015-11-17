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

package org.oep.processmgt.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.oep.processmgt.model.DossierStep;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DossierStep in entity cache.
 *
 * @author trungdk
 * @see DossierStep
 * @generated
 */
public class DossierStepCacheModel implements CacheModel<DossierStep>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{dossierStepId=");
		sb.append(dossierStepId);
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
		sb.append(", dossierProcessId=");
		sb.append(dossierProcessId);
		sb.append(", title=");
		sb.append(title);
		sb.append(", sequenceNo=");
		sb.append(sequenceNo);
		sb.append(", daysDuration=");
		sb.append(daysDuration);
		sb.append(", doForm=");
		sb.append(doForm);
		sb.append(", formLabel=");
		sb.append(formLabel);
		sb.append(", rollback=");
		sb.append(rollback);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DossierStep toEntityModel() {
		DossierStepImpl dossierStepImpl = new DossierStepImpl();

		dossierStepImpl.setDossierStepId(dossierStepId);
		dossierStepImpl.setUserId(userId);
		dossierStepImpl.setGroupId(groupId);
		dossierStepImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			dossierStepImpl.setCreateDate(null);
		}
		else {
			dossierStepImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			dossierStepImpl.setModifiedDate(null);
		}
		else {
			dossierStepImpl.setModifiedDate(new Date(modifiedDate));
		}

		dossierStepImpl.setDossierProcessId(dossierProcessId);

		if (title == null) {
			dossierStepImpl.setTitle(StringPool.BLANK);
		}
		else {
			dossierStepImpl.setTitle(title);
		}

		dossierStepImpl.setSequenceNo(sequenceNo);
		dossierStepImpl.setDaysDuration(daysDuration);

		if (doForm == null) {
			dossierStepImpl.setDoForm(StringPool.BLANK);
		}
		else {
			dossierStepImpl.setDoForm(doForm);
		}

		if (formLabel == null) {
			dossierStepImpl.setFormLabel(StringPool.BLANK);
		}
		else {
			dossierStepImpl.setFormLabel(formLabel);
		}

		dossierStepImpl.setRollback(rollback);

		dossierStepImpl.resetOriginalValues();

		return dossierStepImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		dossierStepId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		dossierProcessId = objectInput.readLong();
		title = objectInput.readUTF();
		sequenceNo = objectInput.readInt();
		daysDuration = objectInput.readInt();
		doForm = objectInput.readUTF();
		formLabel = objectInput.readUTF();
		rollback = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(dossierStepId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(dossierProcessId);

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		objectOutput.writeInt(sequenceNo);
		objectOutput.writeInt(daysDuration);

		if (doForm == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(doForm);
		}

		if (formLabel == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(formLabel);
		}

		objectOutput.writeInt(rollback);
	}

	public long dossierStepId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public long dossierProcessId;
	public String title;
	public int sequenceNo;
	public int daysDuration;
	public String doForm;
	public String formLabel;
	public int rollback;
}