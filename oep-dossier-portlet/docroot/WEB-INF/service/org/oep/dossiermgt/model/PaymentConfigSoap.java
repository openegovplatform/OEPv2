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

package org.oep.dossiermgt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.oep.dossiermgt.service.http.PaymentConfigServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.dossiermgt.service.http.PaymentConfigServiceSoap
 * @generated
 */
public class PaymentConfigSoap implements Serializable {
	public static PaymentConfigSoap toSoapModel(PaymentConfig model) {
		PaymentConfigSoap soapModel = new PaymentConfigSoap();

		soapModel.setPaymentConfigId(model.getPaymentConfigId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setGovAgencyId(model.getGovAgencyId());
		soapModel.setGovAgencyName(model.getGovAgencyName());
		soapModel.setBankTransfer(model.getBankTransfer());
		soapModel.setKeypay(model.getKeypay());
		soapModel.setEbPartnerShipId(model.getEbPartnerShipId());

		return soapModel;
	}

	public static PaymentConfigSoap[] toSoapModels(PaymentConfig[] models) {
		PaymentConfigSoap[] soapModels = new PaymentConfigSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PaymentConfigSoap[][] toSoapModels(PaymentConfig[][] models) {
		PaymentConfigSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PaymentConfigSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PaymentConfigSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PaymentConfigSoap[] toSoapModels(List<PaymentConfig> models) {
		List<PaymentConfigSoap> soapModels = new ArrayList<PaymentConfigSoap>(models.size());

		for (PaymentConfig model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PaymentConfigSoap[soapModels.size()]);
	}

	public PaymentConfigSoap() {
	}

	public long getPrimaryKey() {
		return _paymentConfigId;
	}

	public void setPrimaryKey(long pk) {
		setPaymentConfigId(pk);
	}

	public long getPaymentConfigId() {
		return _paymentConfigId;
	}

	public void setPaymentConfigId(long paymentConfigId) {
		_paymentConfigId = paymentConfigId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getGovAgencyId() {
		return _govAgencyId;
	}

	public void setGovAgencyId(String govAgencyId) {
		_govAgencyId = govAgencyId;
	}

	public String getGovAgencyName() {
		return _govAgencyName;
	}

	public void setGovAgencyName(String govAgencyName) {
		_govAgencyName = govAgencyName;
	}

	public String getBankTransfer() {
		return _bankTransfer;
	}

	public void setBankTransfer(String bankTransfer) {
		_bankTransfer = bankTransfer;
	}

	public String getKeypay() {
		return _keypay;
	}

	public void setKeypay(String keypay) {
		_keypay = keypay;
	}

	public long getEbPartnerShipId() {
		return _ebPartnerShipId;
	}

	public void setEbPartnerShipId(long ebPartnerShipId) {
		_ebPartnerShipId = ebPartnerShipId;
	}

	private long _paymentConfigId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _govAgencyId;
	private String _govAgencyName;
	private String _bankTransfer;
	private String _keypay;
	private long _ebPartnerShipId;
}