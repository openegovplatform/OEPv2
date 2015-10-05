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
 * This class is used by SOAP remote services, specifically {@link org.oep.core.dossiermgt.service.http.PaymentFileServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.http.PaymentFileServiceSoap
 * @generated
 */
public class PaymentFileSoap implements Serializable {
	public static PaymentFileSoap toSoapModel(PaymentFile model) {
		PaymentFileSoap soapModel = new PaymentFileSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setPaymentFileId(model.getPaymentFileId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setOrganizationId(model.getOrganizationId());
		soapModel.setGovAgentId(model.getGovAgentId());
		soapModel.setGovAgentName(model.getGovAgentName());
		soapModel.setSubjectId(model.getSubjectId());
		soapModel.setSubjectType(model.getSubjectType());
		soapModel.setSubjectName(model.getSubjectName());
		soapModel.setAmount(model.getAmount());
		soapModel.setPaymentType(model.getPaymentType());
		soapModel.setPaymentDescription(model.getPaymentDescription());
		soapModel.setTransactionInfo(model.getTransactionInfo());
		soapModel.setFileEntryId(model.getFileEntryId());
		soapModel.setCheckingDate(model.getCheckingDate());
		soapModel.setCheckingUserId(model.getCheckingUserId());
		soapModel.setCheckingUserName(model.getCheckingUserName());
		soapModel.setCheckingResult(model.getCheckingResult());
		soapModel.setCheckingNote(model.getCheckingNote());
		soapModel.setEbMessageId(model.getEbMessageId());

		return soapModel;
	}

	public static PaymentFileSoap[] toSoapModels(PaymentFile[] models) {
		PaymentFileSoap[] soapModels = new PaymentFileSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PaymentFileSoap[][] toSoapModels(PaymentFile[][] models) {
		PaymentFileSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PaymentFileSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PaymentFileSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PaymentFileSoap[] toSoapModels(List<PaymentFile> models) {
		List<PaymentFileSoap> soapModels = new ArrayList<PaymentFileSoap>(models.size());

		for (PaymentFile model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PaymentFileSoap[soapModels.size()]);
	}

	public PaymentFileSoap() {
	}

	public long getPrimaryKey() {
		return _paymentFileId;
	}

	public void setPrimaryKey(long pk) {
		setPaymentFileId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getPaymentFileId() {
		return _paymentFileId;
	}

	public void setPaymentFileId(long paymentFileId) {
		_paymentFileId = paymentFileId;
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

	public String getGovAgentId() {
		return _govAgentId;
	}

	public void setGovAgentId(String govAgentId) {
		_govAgentId = govAgentId;
	}

	public String getGovAgentName() {
		return _govAgentName;
	}

	public void setGovAgentName(String govAgentName) {
		_govAgentName = govAgentName;
	}

	public String getSubjectId() {
		return _subjectId;
	}

	public void setSubjectId(String subjectId) {
		_subjectId = subjectId;
	}

	public String getSubjectType() {
		return _subjectType;
	}

	public void setSubjectType(String subjectType) {
		_subjectType = subjectType;
	}

	public String getSubjectName() {
		return _subjectName;
	}

	public void setSubjectName(String subjectName) {
		_subjectName = subjectName;
	}

	public long getAmount() {
		return _amount;
	}

	public void setAmount(long amount) {
		_amount = amount;
	}

	public String getPaymentType() {
		return _paymentType;
	}

	public void setPaymentType(String paymentType) {
		_paymentType = paymentType;
	}

	public String getPaymentDescription() {
		return _paymentDescription;
	}

	public void setPaymentDescription(String paymentDescription) {
		_paymentDescription = paymentDescription;
	}

	public String getTransactionInfo() {
		return _transactionInfo;
	}

	public void setTransactionInfo(String transactionInfo) {
		_transactionInfo = transactionInfo;
	}

	public long getFileEntryId() {
		return _fileEntryId;
	}

	public void setFileEntryId(long fileEntryId) {
		_fileEntryId = fileEntryId;
	}

	public Date getCheckingDate() {
		return _checkingDate;
	}

	public void setCheckingDate(Date checkingDate) {
		_checkingDate = checkingDate;
	}

	public long getCheckingUserId() {
		return _checkingUserId;
	}

	public void setCheckingUserId(long checkingUserId) {
		_checkingUserId = checkingUserId;
	}

	public String getCheckingUserName() {
		return _checkingUserName;
	}

	public void setCheckingUserName(String checkingUserName) {
		_checkingUserName = checkingUserName;
	}

	public int getCheckingResult() {
		return _checkingResult;
	}

	public void setCheckingResult(int checkingResult) {
		_checkingResult = checkingResult;
	}

	public String getCheckingNote() {
		return _checkingNote;
	}

	public void setCheckingNote(String checkingNote) {
		_checkingNote = checkingNote;
	}

	public long getEbMessageId() {
		return _ebMessageId;
	}

	public void setEbMessageId(long ebMessageId) {
		_ebMessageId = ebMessageId;
	}

	private String _uuid;
	private long _paymentFileId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _organizationId;
	private String _govAgentId;
	private String _govAgentName;
	private String _subjectId;
	private String _subjectType;
	private String _subjectName;
	private long _amount;
	private String _paymentType;
	private String _paymentDescription;
	private String _transactionInfo;
	private long _fileEntryId;
	private Date _checkingDate;
	private long _checkingUserId;
	private String _checkingUserName;
	private int _checkingResult;
	private String _checkingNote;
	private long _ebMessageId;
}