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
		soapModel.setAmount(model.getAmount());
		soapModel.setPaymentType(model.getPaymentType());
		soapModel.setDetailInfo(model.getDetailInfo());
		soapModel.setNote(model.getNote());
		soapModel.setFileEntryId(model.getFileEntryId());
		soapModel.setIssueDate(model.getIssueDate());
		soapModel.setCheckingDate(model.getCheckingDate());
		soapModel.setCheckingUserId(model.getCheckingUserId());
		soapModel.setCheckingUserName(model.getCheckingUserName());
		soapModel.setCheckingResult(model.getCheckingResult());
		soapModel.setCheckingNote(model.getCheckingNote());
		soapModel.setFeedbackDate(model.getFeedbackDate());

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

	public long getAmount() {
		return _amount;
	}

	public void setAmount(long amount) {
		_amount = amount;
	}

	public int getPaymentType() {
		return _paymentType;
	}

	public void setPaymentType(int paymentType) {
		_paymentType = paymentType;
	}

	public String getDetailInfo() {
		return _detailInfo;
	}

	public void setDetailInfo(String detailInfo) {
		_detailInfo = detailInfo;
	}

	public String getNote() {
		return _note;
	}

	public void setNote(String note) {
		_note = note;
	}

	public long getFileEntryId() {
		return _fileEntryId;
	}

	public void setFileEntryId(long fileEntryId) {
		_fileEntryId = fileEntryId;
	}

	public Date getIssueDate() {
		return _issueDate;
	}

	public void setIssueDate(Date issueDate) {
		_issueDate = issueDate;
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

	public Date getFeedbackDate() {
		return _feedbackDate;
	}

	public void setFeedbackDate(Date feedbackDate) {
		_feedbackDate = feedbackDate;
	}

	private String _uuid;
	private long _paymentFileId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _organizationId;
	private long _amount;
	private int _paymentType;
	private String _detailInfo;
	private String _note;
	private long _fileEntryId;
	private Date _issueDate;
	private Date _checkingDate;
	private long _checkingUserId;
	private String _checkingUserName;
	private int _checkingResult;
	private String _checkingNote;
	private Date _feedbackDate;
}