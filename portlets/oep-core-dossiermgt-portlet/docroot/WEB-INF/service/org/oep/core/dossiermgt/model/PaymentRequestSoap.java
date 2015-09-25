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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.oep.core.dossiermgt.service.http.PaymentRequestServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.http.PaymentRequestServiceSoap
 * @generated
 */
public class PaymentRequestSoap implements Serializable {
	public static PaymentRequestSoap toSoapModel(PaymentRequest model) {
		PaymentRequestSoap soapModel = new PaymentRequestSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setPaymentRequestId(model.getPaymentRequestId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setOrganizationId(model.getOrganizationId());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setAmount(model.getAmount());
		soapModel.setNote(model.getNote());
		soapModel.setIssueDate(model.getIssueDate());
		soapModel.setPaymentFileId(model.getPaymentFileId());

		return soapModel;
	}

	public static PaymentRequestSoap[] toSoapModels(PaymentRequest[] models) {
		PaymentRequestSoap[] soapModels = new PaymentRequestSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PaymentRequestSoap[][] toSoapModels(PaymentRequest[][] models) {
		PaymentRequestSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PaymentRequestSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PaymentRequestSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PaymentRequestSoap[] toSoapModels(List<PaymentRequest> models) {
		List<PaymentRequestSoap> soapModels = new ArrayList<PaymentRequestSoap>(models.size());

		for (PaymentRequest model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PaymentRequestSoap[soapModels.size()]);
	}

	public PaymentRequestSoap() {
	}

	public long getPrimaryKey() {
		return _paymentRequestId;
	}

	public void setPrimaryKey(long pk) {
		setPaymentRequestId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getPaymentRequestId() {
		return _paymentRequestId;
	}

	public void setPaymentRequestId(long paymentRequestId) {
		_paymentRequestId = paymentRequestId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
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

	public long getOrganizationId() {
		return _organizationId;
	}

	public void setOrganizationId(long organizationId) {
		_organizationId = organizationId;
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

	public String getNote() {
		return _note;
	}

	public void setNote(String note) {
		_note = note;
	}

	public Date getIssueDate() {
		return _issueDate;
	}

	public void setIssueDate(Date issueDate) {
		_issueDate = issueDate;
	}

	public long getPaymentFileId() {
		return _paymentFileId;
	}

	public void setPaymentFileId(long paymentFileId) {
		_paymentFileId = paymentFileId;
	}

	private String _uuid;
	private long _paymentRequestId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _organizationId;
	private long _dossierId;
	private long _amount;
	private String _note;
	private Date _issueDate;
	private long _paymentFileId;
}