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

import org.oep.processmgt.model.ProcessOrder;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ProcessOrder in entity cache.
 *
 * @author trungdk
 * @see ProcessOrder
 * @generated
 */
public class ProcessOrderCacheModel implements CacheModel<ProcessOrder>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", processOrderId=");
		sb.append(processOrderId);
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
		sb.append(", organizationId=");
		sb.append(organizationId);
		sb.append(", parentProcessOrderId=");
		sb.append(parentProcessOrderId);
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", dossierProcessId=");
		sb.append(dossierProcessId);
		sb.append(", dossierStepId=");
		sb.append(dossierStepId);
		sb.append(", orderStatus=");
		sb.append(orderStatus);
		sb.append(", orderResume=");
		sb.append(orderResume);
		sb.append(", stepDate=");
		sb.append(stepDate);
		sb.append(", stepNote=");
		sb.append(stepNote);
		sb.append(", assignToUserId=");
		sb.append(assignToUserId);
		sb.append(", currentCondition=");
		sb.append(currentCondition);
		sb.append(", lastStepTransitionId=");
		sb.append(lastStepTransitionId);
		sb.append(", stopRollback=");
		sb.append(stopRollback);
		sb.append(", ebPartnerShipId=");
		sb.append(ebPartnerShipId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ProcessOrder toEntityModel() {
		ProcessOrderImpl processOrderImpl = new ProcessOrderImpl();

		if (uuid == null) {
			processOrderImpl.setUuid(StringPool.BLANK);
		}
		else {
			processOrderImpl.setUuid(uuid);
		}

		processOrderImpl.setProcessOrderId(processOrderId);
		processOrderImpl.setUserId(userId);
		processOrderImpl.setGroupId(groupId);
		processOrderImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			processOrderImpl.setCreateDate(null);
		}
		else {
			processOrderImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			processOrderImpl.setModifiedDate(null);
		}
		else {
			processOrderImpl.setModifiedDate(new Date(modifiedDate));
		}

		processOrderImpl.setOrganizationId(organizationId);
		processOrderImpl.setParentProcessOrderId(parentProcessOrderId);
		processOrderImpl.setDossierId(dossierId);
		processOrderImpl.setDossierProcessId(dossierProcessId);
		processOrderImpl.setDossierStepId(dossierStepId);

		if (orderStatus == null) {
			processOrderImpl.setOrderStatus(StringPool.BLANK);
		}
		else {
			processOrderImpl.setOrderStatus(orderStatus);
		}

		if (orderResume == null) {
			processOrderImpl.setOrderResume(StringPool.BLANK);
		}
		else {
			processOrderImpl.setOrderResume(orderResume);
		}

		if (stepDate == Long.MIN_VALUE) {
			processOrderImpl.setStepDate(null);
		}
		else {
			processOrderImpl.setStepDate(new Date(stepDate));
		}

		if (stepNote == null) {
			processOrderImpl.setStepNote(StringPool.BLANK);
		}
		else {
			processOrderImpl.setStepNote(stepNote);
		}

		processOrderImpl.setAssignToUserId(assignToUserId);

		if (currentCondition == null) {
			processOrderImpl.setCurrentCondition(StringPool.BLANK);
		}
		else {
			processOrderImpl.setCurrentCondition(currentCondition);
		}

		processOrderImpl.setLastStepTransitionId(lastStepTransitionId);
		processOrderImpl.setStopRollback(stopRollback);
		processOrderImpl.setEbPartnerShipId(ebPartnerShipId);

		processOrderImpl.resetOriginalValues();

		return processOrderImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		processOrderId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		organizationId = objectInput.readLong();
		parentProcessOrderId = objectInput.readLong();
		dossierId = objectInput.readLong();
		dossierProcessId = objectInput.readLong();
		dossierStepId = objectInput.readLong();
		orderStatus = objectInput.readUTF();
		orderResume = objectInput.readUTF();
		stepDate = objectInput.readLong();
		stepNote = objectInput.readUTF();
		assignToUserId = objectInput.readLong();
		currentCondition = objectInput.readUTF();
		lastStepTransitionId = objectInput.readLong();
		stopRollback = objectInput.readInt();
		ebPartnerShipId = objectInput.readLong();
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

		objectOutput.writeLong(processOrderId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(organizationId);
		objectOutput.writeLong(parentProcessOrderId);
		objectOutput.writeLong(dossierId);
		objectOutput.writeLong(dossierProcessId);
		objectOutput.writeLong(dossierStepId);

		if (orderStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(orderStatus);
		}

		if (orderResume == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(orderResume);
		}

		objectOutput.writeLong(stepDate);

		if (stepNote == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(stepNote);
		}

		objectOutput.writeLong(assignToUserId);

		if (currentCondition == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(currentCondition);
		}

		objectOutput.writeLong(lastStepTransitionId);
		objectOutput.writeInt(stopRollback);
		objectOutput.writeLong(ebPartnerShipId);
	}

	public String uuid;
	public long processOrderId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public long organizationId;
	public long parentProcessOrderId;
	public long dossierId;
	public long dossierProcessId;
	public long dossierStepId;
	public String orderStatus;
	public String orderResume;
	public long stepDate;
	public String stepNote;
	public long assignToUserId;
	public String currentCondition;
	public long lastStepTransitionId;
	public int stopRollback;
	public long ebPartnerShipId;
}