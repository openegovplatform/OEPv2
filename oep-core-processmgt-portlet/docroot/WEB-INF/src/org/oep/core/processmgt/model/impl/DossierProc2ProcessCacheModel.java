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

import org.oep.core.processmgt.model.DossierProc2Process;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DossierProc2Process in entity cache.
 *
 * @author trungdk
 * @see DossierProc2Process
 * @generated
 */
public class DossierProc2ProcessCacheModel implements CacheModel<DossierProc2Process>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{dossierProc2ProcessId=");
		sb.append(dossierProc2ProcessId);
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
		sb.append(", dossierProcessId=");
		sb.append(dossierProcessId);
		sb.append(", aaaa=");
		sb.append(aaaa);
		sb.append(", bbb=");
		sb.append(bbb);
		sb.append(", daysDuration=");
		sb.append(daysDuration);
		sb.append(", paymentFee=");
		sb.append(paymentFee);
		sb.append(", paymentOneGate=");
		sb.append(paymentOneGate);
		sb.append(", paymentEservice=");
		sb.append(paymentEservice);
		sb.append(", organizationId=");
		sb.append(organizationId);
		sb.append(", ebPartnershipId=");
		sb.append(ebPartnershipId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DossierProc2Process toEntityModel() {
		DossierProc2ProcessImpl dossierProc2ProcessImpl = new DossierProc2ProcessImpl();

		dossierProc2ProcessImpl.setDossierProc2ProcessId(dossierProc2ProcessId);
		dossierProc2ProcessImpl.setUserId(userId);
		dossierProc2ProcessImpl.setGroupId(groupId);
		dossierProc2ProcessImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			dossierProc2ProcessImpl.setCreateDate(null);
		}
		else {
			dossierProc2ProcessImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			dossierProc2ProcessImpl.setModifiedDate(null);
		}
		else {
			dossierProc2ProcessImpl.setModifiedDate(new Date(modifiedDate));
		}

		dossierProc2ProcessImpl.setDossierProcId(dossierProcId);

		if (govAgencyId == null) {
			dossierProc2ProcessImpl.setGovAgencyId(StringPool.BLANK);
		}
		else {
			dossierProc2ProcessImpl.setGovAgencyId(govAgencyId);
		}

		if (govAgencyName == null) {
			dossierProc2ProcessImpl.setGovAgencyName(StringPool.BLANK);
		}
		else {
			dossierProc2ProcessImpl.setGovAgencyName(govAgencyName);
		}

		dossierProc2ProcessImpl.setDossierProcessId(dossierProcessId);

		if (aaaa == null) {
			dossierProc2ProcessImpl.setAaaa(StringPool.BLANK);
		}
		else {
			dossierProc2ProcessImpl.setAaaa(aaaa);
		}

		if (bbb == null) {
			dossierProc2ProcessImpl.setBbb(StringPool.BLANK);
		}
		else {
			dossierProc2ProcessImpl.setBbb(bbb);
		}

		dossierProc2ProcessImpl.setDaysDuration(daysDuration);
		dossierProc2ProcessImpl.setPaymentFee(paymentFee);
		dossierProc2ProcessImpl.setPaymentOneGate(paymentOneGate);
		dossierProc2ProcessImpl.setPaymentEservice(paymentEservice);
		dossierProc2ProcessImpl.setOrganizationId(organizationId);
		dossierProc2ProcessImpl.setEbPartnershipId(ebPartnershipId);

		dossierProc2ProcessImpl.resetOriginalValues();

		return dossierProc2ProcessImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		dossierProc2ProcessId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		dossierProcId = objectInput.readLong();
		govAgencyId = objectInput.readUTF();
		govAgencyName = objectInput.readUTF();
		dossierProcessId = objectInput.readLong();
		aaaa = objectInput.readUTF();
		bbb = objectInput.readUTF();
		daysDuration = objectInput.readInt();
		paymentFee = objectInput.readInt();
		paymentOneGate = objectInput.readInt();
		paymentEservice = objectInput.readInt();
		organizationId = objectInput.readLong();
		ebPartnershipId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(dossierProc2ProcessId);
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

		objectOutput.writeLong(dossierProcessId);

		if (aaaa == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(aaaa);
		}

		if (bbb == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(bbb);
		}

		objectOutput.writeInt(daysDuration);
		objectOutput.writeInt(paymentFee);
		objectOutput.writeInt(paymentOneGate);
		objectOutput.writeInt(paymentEservice);
		objectOutput.writeLong(organizationId);
		objectOutput.writeLong(ebPartnershipId);
	}

	public long dossierProc2ProcessId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public long dossierProcId;
	public String govAgencyId;
	public String govAgencyName;
	public long dossierProcessId;
	public String aaaa;
	public String bbb;
	public int daysDuration;
	public int paymentFee;
	public int paymentOneGate;
	public int paymentEservice;
	public long organizationId;
	public long ebPartnershipId;
}