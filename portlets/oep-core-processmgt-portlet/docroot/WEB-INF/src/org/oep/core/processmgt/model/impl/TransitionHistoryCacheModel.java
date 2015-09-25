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

import org.oep.core.processmgt.model.TransitionHistory;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TransitionHistory in entity cache.
 *
 * @author trungdk
 * @see TransitionHistory
 * @generated
 */
public class TransitionHistoryCacheModel implements CacheModel<TransitionHistory>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{transitionHistoryId=");
		sb.append(transitionHistoryId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", processOrderId=");
		sb.append(processOrderId);
		sb.append(", daysDoing=");
		sb.append(daysDoing);
		sb.append(", daysDelay=");
		sb.append(daysDelay);
		sb.append(", startDate=");
		sb.append(startDate);
		sb.append(", stepTransitionId=");
		sb.append(stepTransitionId);
		sb.append(", preDossierStepId=");
		sb.append(preDossierStepId);
		sb.append(", postDossierStepId=");
		sb.append(postDossierStepId);
		sb.append(", transitionName=");
		sb.append(transitionName);
		sb.append(", note=");
		sb.append(note);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TransitionHistory toEntityModel() {
		TransitionHistoryImpl transitionHistoryImpl = new TransitionHistoryImpl();

		transitionHistoryImpl.setTransitionHistoryId(transitionHistoryId);
		transitionHistoryImpl.setUserId(userId);
		transitionHistoryImpl.setGroupId(groupId);
		transitionHistoryImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			transitionHistoryImpl.setCreateDate(null);
		}
		else {
			transitionHistoryImpl.setCreateDate(new Date(createDate));
		}

		transitionHistoryImpl.setDossierId(dossierId);
		transitionHistoryImpl.setProcessOrderId(processOrderId);
		transitionHistoryImpl.setDaysDoing(daysDoing);
		transitionHistoryImpl.setDaysDelay(daysDelay);

		if (startDate == Long.MIN_VALUE) {
			transitionHistoryImpl.setStartDate(null);
		}
		else {
			transitionHistoryImpl.setStartDate(new Date(startDate));
		}

		transitionHistoryImpl.setStepTransitionId(stepTransitionId);
		transitionHistoryImpl.setPreDossierStepId(preDossierStepId);
		transitionHistoryImpl.setPostDossierStepId(postDossierStepId);

		if (transitionName == null) {
			transitionHistoryImpl.setTransitionName(StringPool.BLANK);
		}
		else {
			transitionHistoryImpl.setTransitionName(transitionName);
		}

		if (note == null) {
			transitionHistoryImpl.setNote(StringPool.BLANK);
		}
		else {
			transitionHistoryImpl.setNote(note);
		}

		transitionHistoryImpl.resetOriginalValues();

		return transitionHistoryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		transitionHistoryId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		dossierId = objectInput.readLong();
		processOrderId = objectInput.readLong();
		daysDoing = objectInput.readInt();
		daysDelay = objectInput.readInt();
		startDate = objectInput.readLong();
		stepTransitionId = objectInput.readLong();
		preDossierStepId = objectInput.readLong();
		postDossierStepId = objectInput.readLong();
		transitionName = objectInput.readUTF();
		note = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(transitionHistoryId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(dossierId);
		objectOutput.writeLong(processOrderId);
		objectOutput.writeInt(daysDoing);
		objectOutput.writeInt(daysDelay);
		objectOutput.writeLong(startDate);
		objectOutput.writeLong(stepTransitionId);
		objectOutput.writeLong(preDossierStepId);
		objectOutput.writeLong(postDossierStepId);

		if (transitionName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(transitionName);
		}

		if (note == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(note);
		}
	}

	public long transitionHistoryId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long dossierId;
	public long processOrderId;
	public int daysDoing;
	public int daysDelay;
	public long startDate;
	public long stepTransitionId;
	public long preDossierStepId;
	public long postDossierStepId;
	public String transitionName;
	public String note;
}