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
		StringBundler sb = new StringBundler(19);

		sb.append("{paymentConfigId=");
		sb.append(paymentConfigId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", govAgentId=");
		sb.append(govAgentId);
		sb.append(", govAgentName=");
		sb.append(govAgentName);
		sb.append(", bankTransfer=");
		sb.append(bankTransfer);
		sb.append(", keypay=");
		sb.append(keypay);
		sb.append(", ebPartnerShipId=");
		sb.append(ebPartnerShipId);
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

		if (govAgentId == null) {
			paymentConfigImpl.setGovAgentId(StringPool.BLANK);
		}
		else {
			paymentConfigImpl.setGovAgentId(govAgentId);
		}

		if (govAgentName == null) {
			paymentConfigImpl.setGovAgentName(StringPool.BLANK);
		}
		else {
			paymentConfigImpl.setGovAgentName(govAgentName);
		}

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

		paymentConfigImpl.setEbPartnerShipId(ebPartnerShipId);

		paymentConfigImpl.resetOriginalValues();

		return paymentConfigImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		paymentConfigId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		govAgentId = objectInput.readUTF();
		govAgentName = objectInput.readUTF();
		bankTransfer = objectInput.readUTF();
		keypay = objectInput.readUTF();
		ebPartnerShipId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(paymentConfigId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

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

		objectOutput.writeLong(ebPartnerShipId);
	}

	public long paymentConfigId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public String govAgentId;
	public String govAgentName;
	public String bankTransfer;
	public String keypay;
	public long ebPartnerShipId;
}