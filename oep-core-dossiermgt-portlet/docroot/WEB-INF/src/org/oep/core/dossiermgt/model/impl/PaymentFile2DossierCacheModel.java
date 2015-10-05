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
import com.liferay.portal.model.CacheModel;

import org.oep.core.dossiermgt.model.PaymentFile2Dossier;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing PaymentFile2Dossier in entity cache.
 *
 * @author trungdk
 * @see PaymentFile2Dossier
 * @generated
 */
public class PaymentFile2DossierCacheModel implements CacheModel<PaymentFile2Dossier>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(id);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", paymentFileId=");
		sb.append(paymentFileId);
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", amount=");
		sb.append(amount);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PaymentFile2Dossier toEntityModel() {
		PaymentFile2DossierImpl paymentFile2DossierImpl = new PaymentFile2DossierImpl();

		paymentFile2DossierImpl.setId(id);
		paymentFile2DossierImpl.setCompanyId(companyId);
		paymentFile2DossierImpl.setPaymentFileId(paymentFileId);
		paymentFile2DossierImpl.setDossierId(dossierId);
		paymentFile2DossierImpl.setAmount(amount);

		paymentFile2DossierImpl.resetOriginalValues();

		return paymentFile2DossierImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		companyId = objectInput.readLong();
		paymentFileId = objectInput.readLong();
		dossierId = objectInput.readLong();
		amount = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(paymentFileId);
		objectOutput.writeLong(dossierId);
		objectOutput.writeLong(amount);
	}

	public long id;
	public long companyId;
	public long paymentFileId;
	public long dossierId;
	public long amount;
}