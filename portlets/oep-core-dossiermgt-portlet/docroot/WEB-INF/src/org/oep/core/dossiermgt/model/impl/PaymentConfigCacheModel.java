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

import org.oep.core.dossiermgt.model.PaymentConfig;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PaymentConfig in entity cache.
 *
 * @author trungdk
 * @see PaymentConfig
 * @generated
 */
public class PaymentConfigCacheModel implements CacheModel<PaymentConfig>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{paymentConfigId=");
		sb.append(paymentConfigId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", dossierProcId=");
		sb.append(dossierProcId);
		sb.append(", govAgentNo=");
		sb.append(govAgentNo);
		sb.append(", govAgentName=");
		sb.append(govAgentName);
		sb.append(", prePaidFee=");
		sb.append(prePaidFee);
		sb.append(", bankTransfer=");
		sb.append(bankTransfer);
		sb.append(", keypay=");
		sb.append(keypay);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PaymentConfig toEntityModel() {
		PaymentConfigImpl paymentConfigImpl = new PaymentConfigImpl();

		paymentConfigImpl.setPaymentConfigId(paymentConfigId);
		paymentConfigImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			paymentConfigImpl.setCreateDate(null);
		}
		else {
			paymentConfigImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			paymentConfigImpl.setModifiedDate(null);
		}
		else {
			paymentConfigImpl.setModifiedDate(new Date(modifiedDate));
		}

		paymentConfigImpl.setDossierProcId(dossierProcId);

		if (govAgentNo == null) {
			paymentConfigImpl.setGovAgentNo(StringPool.BLANK);
		}
		else {
			paymentConfigImpl.setGovAgentNo(govAgentNo);
		}

		if (govAgentName == null) {
			paymentConfigImpl.setGovAgentName(StringPool.BLANK);
		}
		else {
			paymentConfigImpl.setGovAgentName(govAgentName);
		}

		paymentConfigImpl.setPrePaidFee(prePaidFee);

		if (bankTransfer == null) {
			paymentConfigImpl.setBankTransfer(StringPool.BLANK);
		}
		else {
			paymentConfigImpl.setBankTransfer(bankTransfer);
		}

		if (keypay == null) {
			paymentConfigImpl.setKeypay(StringPool.BLANK);
		}
		else {
			paymentConfigImpl.setKeypay(keypay);
		}

		paymentConfigImpl.resetOriginalValues();

		return paymentConfigImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		paymentConfigId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		dossierProcId = objectInput.readLong();
		govAgentNo = objectInput.readUTF();
		govAgentName = objectInput.readUTF();
		prePaidFee = objectInput.readLong();
		bankTransfer = objectInput.readUTF();
		keypay = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(paymentConfigId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(dossierProcId);

		if (govAgentNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(govAgentNo);
		}

		if (govAgentName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(govAgentName);
		}

		objectOutput.writeLong(prePaidFee);

		if (bankTransfer == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(bankTransfer);
		}

		if (keypay == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(keypay);
		}
	}

	public long paymentConfigId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public long dossierProcId;
	public String govAgentNo;
	public String govAgentName;
	public long prePaidFee;
	public String bankTransfer;
	public String keypay;
}