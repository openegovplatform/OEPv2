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

package org.oep.core.dossiermgt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.oep.core.dossiermgt.service.http.PaymentFile2DossierServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.http.PaymentFile2DossierServiceSoap
 * @generated
 */
public class PaymentFile2DossierSoap implements Serializable {
	public static PaymentFile2DossierSoap toSoapModel(PaymentFile2Dossier model) {
		PaymentFile2DossierSoap soapModel = new PaymentFile2DossierSoap();

		soapModel.setId(model.getId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setPaymentFileId(model.getPaymentFileId());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setAmount(model.getAmount());

		return soapModel;
	}

	public static PaymentFile2DossierSoap[] toSoapModels(
		PaymentFile2Dossier[] models) {
		PaymentFile2DossierSoap[] soapModels = new PaymentFile2DossierSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PaymentFile2DossierSoap[][] toSoapModels(
		PaymentFile2Dossier[][] models) {
		PaymentFile2DossierSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PaymentFile2DossierSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PaymentFile2DossierSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PaymentFile2DossierSoap[] toSoapModels(
		List<PaymentFile2Dossier> models) {
		List<PaymentFile2DossierSoap> soapModels = new ArrayList<PaymentFile2DossierSoap>(models.size());

		for (PaymentFile2Dossier model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PaymentFile2DossierSoap[soapModels.size()]);
	}

	public PaymentFile2DossierSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getPaymentFileId() {
		return _paymentFileId;
	}

	public void setPaymentFileId(long paymentFileId) {
		_paymentFileId = paymentFileId;
	}

	public long getDossierId() {
		return _dossierId;
	}

	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
	}

	public long getAmount() {
		return _amount;
	}

	public void setAmount(long amount) {
		_amount = amount;
	}

	private long _id;
	private long _companyId;
	private long _paymentFileId;
	private long _dossierId;
	private long _amount;
}