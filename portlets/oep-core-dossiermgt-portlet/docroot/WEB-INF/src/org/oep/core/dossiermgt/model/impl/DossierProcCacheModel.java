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

import org.oep.core.dossiermgt.model.DossierProc;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DossierProc in entity cache.
 *
 * @author trungdk
 * @see DossierProc
 * @generated
 */
public class DossierProcCacheModel implements CacheModel<DossierProc>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(53);

		sb.append("{dossierProcId=");
		sb.append(dossierProcId);
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
		sb.append(", dossierProcNo=");
		sb.append(dossierProcNo);
		sb.append(", name=");
		sb.append(name);
		sb.append(", enName=");
		sb.append(enName);
		sb.append(", shortName=");
		sb.append(shortName);
		sb.append(", processDescription=");
		sb.append(processDescription);
		sb.append(", methodDescription=");
		sb.append(methodDescription);
		sb.append(", dossierDescription=");
		sb.append(dossierDescription);
		sb.append(", conditionDescription=");
		sb.append(conditionDescription);
		sb.append(", durationDescription=");
		sb.append(durationDescription);
		sb.append(", actorsDescription=");
		sb.append(actorsDescription);
		sb.append(", resultsDescription=");
		sb.append(resultsDescription);
		sb.append(", feeDescription=");
		sb.append(feeDescription);
		sb.append(", instructionsDescription=");
		sb.append(instructionsDescription);
		sb.append(", administrationNo=");
		sb.append(administrationNo);
		sb.append(", administrationName=");
		sb.append(administrationName);
		sb.append(", domainNo=");
		sb.append(domainNo);
		sb.append(", domainName=");
		sb.append(domainName);
		sb.append(", effectDate=");
		sb.append(effectDate);
		sb.append(", expireDate=");
		sb.append(expireDate);
		sb.append(", active=");
		sb.append(active);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DossierProc toEntityModel() {
		DossierProcImpl dossierProcImpl = new DossierProcImpl();

		dossierProcImpl.setDossierProcId(dossierProcId);
		dossierProcImpl.setUserId(userId);
		dossierProcImpl.setGroupId(groupId);
		dossierProcImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			dossierProcImpl.setCreateDate(null);
		}
		else {
			dossierProcImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			dossierProcImpl.setModifiedDate(null);
		}
		else {
			dossierProcImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (dossierProcNo == null) {
			dossierProcImpl.setDossierProcNo(StringPool.BLANK);
		}
		else {
			dossierProcImpl.setDossierProcNo(dossierProcNo);
		}

		if (name == null) {
			dossierProcImpl.setName(StringPool.BLANK);
		}
		else {
			dossierProcImpl.setName(name);
		}

		if (enName == null) {
			dossierProcImpl.setEnName(StringPool.BLANK);
		}
		else {
			dossierProcImpl.setEnName(enName);
		}

		if (shortName == null) {
			dossierProcImpl.setShortName(StringPool.BLANK);
		}
		else {
			dossierProcImpl.setShortName(shortName);
		}

		if (processDescription == null) {
			dossierProcImpl.setProcessDescription(StringPool.BLANK);
		}
		else {
			dossierProcImpl.setProcessDescription(processDescription);
		}

		if (methodDescription == null) {
			dossierProcImpl.setMethodDescription(StringPool.BLANK);
		}
		else {
			dossierProcImpl.setMethodDescription(methodDescription);
		}

		if (dossierDescription == null) {
			dossierProcImpl.setDossierDescription(StringPool.BLANK);
		}
		else {
			dossierProcImpl.setDossierDescription(dossierDescription);
		}

		if (conditionDescription == null) {
			dossierProcImpl.setConditionDescription(StringPool.BLANK);
		}
		else {
			dossierProcImpl.setConditionDescription(conditionDescription);
		}

		if (durationDescription == null) {
			dossierProcImpl.setDurationDescription(StringPool.BLANK);
		}
		else {
			dossierProcImpl.setDurationDescription(durationDescription);
		}

		if (actorsDescription == null) {
			dossierProcImpl.setActorsDescription(StringPool.BLANK);
		}
		else {
			dossierProcImpl.setActorsDescription(actorsDescription);
		}

		if (resultsDescription == null) {
			dossierProcImpl.setResultsDescription(StringPool.BLANK);
		}
		else {
			dossierProcImpl.setResultsDescription(resultsDescription);
		}

		if (feeDescription == null) {
			dossierProcImpl.setFeeDescription(StringPool.BLANK);
		}
		else {
			dossierProcImpl.setFeeDescription(feeDescription);
		}

		if (instructionsDescription == null) {
			dossierProcImpl.setInstructionsDescription(StringPool.BLANK);
		}
		else {
			dossierProcImpl.setInstructionsDescription(instructionsDescription);
		}

		if (administrationNo == null) {
			dossierProcImpl.setAdministrationNo(StringPool.BLANK);
		}
		else {
			dossierProcImpl.setAdministrationNo(administrationNo);
		}

		if (administrationName == null) {
			dossierProcImpl.setAdministrationName(StringPool.BLANK);
		}
		else {
			dossierProcImpl.setAdministrationName(administrationName);
		}

		if (domainNo == null) {
			dossierProcImpl.setDomainNo(StringPool.BLANK);
		}
		else {
			dossierProcImpl.setDomainNo(domainNo);
		}

		if (domainName == null) {
			dossierProcImpl.setDomainName(StringPool.BLANK);
		}
		else {
			dossierProcImpl.setDomainName(domainName);
		}

		if (effectDate == Long.MIN_VALUE) {
			dossierProcImpl.setEffectDate(null);
		}
		else {
			dossierProcImpl.setEffectDate(new Date(effectDate));
		}

		if (expireDate == Long.MIN_VALUE) {
			dossierProcImpl.setExpireDate(null);
		}
		else {
			dossierProcImpl.setExpireDate(new Date(expireDate));
		}

		dossierProcImpl.setActive(active);

		dossierProcImpl.resetOriginalValues();

		return dossierProcImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		dossierProcId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		dossierProcNo = objectInput.readUTF();
		name = objectInput.readUTF();
		enName = objectInput.readUTF();
		shortName = objectInput.readUTF();
		processDescription = objectInput.readUTF();
		methodDescription = objectInput.readUTF();
		dossierDescription = objectInput.readUTF();
		conditionDescription = objectInput.readUTF();
		durationDescription = objectInput.readUTF();
		actorsDescription = objectInput.readUTF();
		resultsDescription = objectInput.readUTF();
		feeDescription = objectInput.readUTF();
		instructionsDescription = objectInput.readUTF();
		administrationNo = objectInput.readUTF();
		administrationName = objectInput.readUTF();
		domainNo = objectInput.readUTF();
		domainName = objectInput.readUTF();
		effectDate = objectInput.readLong();
		expireDate = objectInput.readLong();
		active = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(dossierProcId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (dossierProcNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossierProcNo);
		}

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (enName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(enName);
		}

		if (shortName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shortName);
		}

		if (processDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(processDescription);
		}

		if (methodDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(methodDescription);
		}

		if (dossierDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossierDescription);
		}

		if (conditionDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(conditionDescription);
		}

		if (durationDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(durationDescription);
		}

		if (actorsDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(actorsDescription);
		}

		if (resultsDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(resultsDescription);
		}

		if (feeDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(feeDescription);
		}

		if (instructionsDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(instructionsDescription);
		}

		if (administrationNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(administrationNo);
		}

		if (administrationName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(administrationName);
		}

		if (domainNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(domainNo);
		}

		if (domainName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(domainName);
		}

		objectOutput.writeLong(effectDate);
		objectOutput.writeLong(expireDate);
		objectOutput.writeInt(active);
	}

	public long dossierProcId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public String dossierProcNo;
	public String name;
	public String enName;
	public String shortName;
	public String processDescription;
	public String methodDescription;
	public String dossierDescription;
	public String conditionDescription;
	public String durationDescription;
	public String actorsDescription;
	public String resultsDescription;
	public String feeDescription;
	public String instructionsDescription;
	public String administrationNo;
	public String administrationName;
	public String domainNo;
	public String domainName;
	public long effectDate;
	public long expireDate;
	public int active;
}