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

import org.oep.processmgt.model.StepTransition;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing StepTransition in entity cache.
 *
 * @author trungdk
 * @see StepTransition
 * @generated
 */
public class StepTransitionCacheModel implements CacheModel<StepTransition>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{stepTransitionId=");
		sb.append(stepTransitionId);
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
		sb.append(", preDossierStepId=");
		sb.append(preDossierStepId);
		sb.append(", postDossierStepId=");
		sb.append(postDossierStepId);
		sb.append(", autoCondition=");
		sb.append(autoCondition);
		sb.append(", transitionName=");
		sb.append(transitionName);
		sb.append(", dossierStatus=");
		sb.append(dossierStatus);
		sb.append(", sendResults=");
		sb.append(sendResults);
		sb.append(", userAssignment=");
		sb.append(userAssignment);
		sb.append(", newProcessOrder=");
		sb.append(newProcessOrder);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public StepTransition toEntityModel() {
		StepTransitionImpl stepTransitionImpl = new StepTransitionImpl();

		stepTransitionImpl.setStepTransitionId(stepTransitionId);
		stepTransitionImpl.setUserId(userId);
		stepTransitionImpl.setGroupId(groupId);
		stepTransitionImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			stepTransitionImpl.setCreateDate(null);
		}
		else {
			stepTransitionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			stepTransitionImpl.setModifiedDate(null);
		}
		else {
			stepTransitionImpl.setModifiedDate(new Date(modifiedDate));
		}

		stepTransitionImpl.setDossierProcessId(dossierProcessId);
		stepTransitionImpl.setPreDossierStepId(preDossierStepId);
		stepTransitionImpl.setPostDossierStepId(postDossierStepId);

		if (autoCondition == null) {
			stepTransitionImpl.setAutoCondition(StringPool.BLANK);
		}
		else {
			stepTransitionImpl.setAutoCondition(autoCondition);
		}

		if (transitionName == null) {
			stepTransitionImpl.setTransitionName(StringPool.BLANK);
		}
		else {
			stepTransitionImpl.setTransitionName(transitionName);
		}

		if (dossierStatus == null) {
			stepTransitionImpl.setDossierStatus(StringPool.BLANK);
		}
		else {
			stepTransitionImpl.setDossierStatus(dossierStatus);
		}

		stepTransitionImpl.setSendResults(sendResults);
		stepTransitionImpl.setUserAssignment(userAssignment);
		stepTransitionImpl.setNewProcessOrder(newProcessOrder);

		stepTransitionImpl.resetOriginalValues();

		return stepTransitionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		stepTransitionId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		dossierProcessId = objectInput.readLong();
		preDossierStepId = objectInput.readLong();
		postDossierStepId = objectInput.readLong();
		autoCondition = objectInput.readUTF();
		transitionName = objectInput.readUTF();
		dossierStatus = objectInput.readUTF();
		sendResults = objectInput.readInt();
		userAssignment = objectInput.readInt();
		newProcessOrder = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(stepTransitionId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(dossierProcessId);
		objectOutput.writeLong(preDossierStepId);
		objectOutput.writeLong(postDossierStepId);

		if (autoCondition == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(autoCondition);
		}

		if (transitionName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(transitionName);
		}

		if (dossierStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossierStatus);
		}

		objectOutput.writeInt(sendResults);
		objectOutput.writeInt(userAssignment);
		objectOutput.writeInt(newProcessOrder);
	}

	public long stepTransitionId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public long dossierProcessId;
	public long preDossierStepId;
	public long postDossierStepId;
	public String autoCondition;
	public String transitionName;
	public String dossierStatus;
	public int sendResults;
	public int userAssignment;
	public int newProcessOrder;
}