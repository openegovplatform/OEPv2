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

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PaymentFile}.
 * </p>
 *
 * @author trungdk
 * @see PaymentFile
 * @generated
 */
public class PaymentFileWrapper implements PaymentFile,
	ModelWrapper<PaymentFile> {
	public PaymentFileWrapper(PaymentFile paymentFile) {
		_paymentFile = paymentFile;
	}

	@Override
	public Class<?> getModelClass() {
		return PaymentFile.class;
	}

	@Override
	public String getModelClassName() {
		return PaymentFile.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("paymentFileId", getPaymentFileId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("organizationId", getOrganizationId());
		attributes.put("govAgencyId", getGovAgencyId());
		attributes.put("govAgencyName", getGovAgencyName());
		attributes.put("subjectId", getSubjectId());
		attributes.put("subjectType", getSubjectType());
		attributes.put("subjectName", getSubjectName());
		attributes.put("amount", getAmount());
		attributes.put("paymentType", getPaymentType());
		attributes.put("paymentDescription", getPaymentDescription());
		attributes.put("transactionInfo", getTransactionInfo());
		attributes.put("fileEntryId", getFileEntryId());
		attributes.put("checkingDate", getCheckingDate());
		attributes.put("checkingUserId", getCheckingUserId());
		attributes.put("checkingUserName", getCheckingUserName());
		attributes.put("checkingResult", getCheckingResult());
		attributes.put("checkingNote", getCheckingNote());
		attributes.put("ebMessageId", getEbMessageId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long paymentFileId = (Long)attributes.get("paymentFileId");

		if (paymentFileId != null) {
			setPaymentFileId(paymentFileId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}

		String govAgencyId = (String)attributes.get("govAgencyId");

		if (govAgencyId != null) {
			setGovAgencyId(govAgencyId);
		}

		String govAgencyName = (String)attributes.get("govAgencyName");

		if (govAgencyName != null) {
			setGovAgencyName(govAgencyName);
		}

		String subjectId = (String)attributes.get("subjectId");

		if (subjectId != null) {
			setSubjectId(subjectId);
		}

		String subjectType = (String)attributes.get("subjectType");

		if (subjectType != null) {
			setSubjectType(subjectType);
		}

		String subjectName = (String)attributes.get("subjectName");

		if (subjectName != null) {
			setSubjectName(subjectName);
		}

		Long amount = (Long)attributes.get("amount");

		if (amount != null) {
			setAmount(amount);
		}

		String paymentType = (String)attributes.get("paymentType");

		if (paymentType != null) {
			setPaymentType(paymentType);
		}

		String paymentDescription = (String)attributes.get("paymentDescription");

		if (paymentDescription != null) {
			setPaymentDescription(paymentDescription);
		}

		String transactionInfo = (String)attributes.get("transactionInfo");

		if (transactionInfo != null) {
			setTransactionInfo(transactionInfo);
		}

		Long fileEntryId = (Long)attributes.get("fileEntryId");

		if (fileEntryId != null) {
			setFileEntryId(fileEntryId);
		}

		Date checkingDate = (Date)attributes.get("checkingDate");

		if (checkingDate != null) {
			setCheckingDate(checkingDate);
		}

		Long checkingUserId = (Long)attributes.get("checkingUserId");

		if (checkingUserId != null) {
			setCheckingUserId(checkingUserId);
		}

		String checkingUserName = (String)attributes.get("checkingUserName");

		if (checkingUserName != null) {
			setCheckingUserName(checkingUserName);
		}

		Integer checkingResult = (Integer)attributes.get("checkingResult");

		if (checkingResult != null) {
			setCheckingResult(checkingResult);
		}

		String checkingNote = (String)attributes.get("checkingNote");

		if (checkingNote != null) {
			setCheckingNote(checkingNote);
		}

		Long ebMessageId = (Long)attributes.get("ebMessageId");

		if (ebMessageId != null) {
			setEbMessageId(ebMessageId);
		}
	}

	/**
	* Returns the primary key of this payment file.
	*
	* @return the primary key of this payment file
	*/
	@Override
	public long getPrimaryKey() {
		return _paymentFile.getPrimaryKey();
	}

	/**
	* Sets the primary key of this payment file.
	*
	* @param primaryKey the primary key of this payment file
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_paymentFile.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this payment file.
	*
	* @return the uuid of this payment file
	*/
	@Override
	public java.lang.String getUuid() {
		return _paymentFile.getUuid();
	}

	/**
	* Sets the uuid of this payment file.
	*
	* @param uuid the uuid of this payment file
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_paymentFile.setUuid(uuid);
	}

	/**
	* Returns the payment file ID of this payment file.
	*
	* @return the payment file ID of this payment file
	*/
	@Override
	public long getPaymentFileId() {
		return _paymentFile.getPaymentFileId();
	}

	/**
	* Sets the payment file ID of this payment file.
	*
	* @param paymentFileId the payment file ID of this payment file
	*/
	@Override
	public void setPaymentFileId(long paymentFileId) {
		_paymentFile.setPaymentFileId(paymentFileId);
	}

	/**
	* Returns the user ID of this payment file.
	*
	* @return the user ID of this payment file
	*/
	@Override
	public long getUserId() {
		return _paymentFile.getUserId();
	}

	/**
	* Sets the user ID of this payment file.
	*
	* @param userId the user ID of this payment file
	*/
	@Override
	public void setUserId(long userId) {
		_paymentFile.setUserId(userId);
	}

	/**
	* Returns the user uuid of this payment file.
	*
	* @return the user uuid of this payment file
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentFile.getUserUuid();
	}

	/**
	* Sets the user uuid of this payment file.
	*
	* @param userUuid the user uuid of this payment file
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_paymentFile.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this payment file.
	*
	* @return the group ID of this payment file
	*/
	@Override
	public long getGroupId() {
		return _paymentFile.getGroupId();
	}

	/**
	* Sets the group ID of this payment file.
	*
	* @param groupId the group ID of this payment file
	*/
	@Override
	public void setGroupId(long groupId) {
		_paymentFile.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this payment file.
	*
	* @return the company ID of this payment file
	*/
	@Override
	public long getCompanyId() {
		return _paymentFile.getCompanyId();
	}

	/**
	* Sets the company ID of this payment file.
	*
	* @param companyId the company ID of this payment file
	*/
	@Override
	public void setCompanyId(long companyId) {
		_paymentFile.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this payment file.
	*
	* @return the create date of this payment file
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _paymentFile.getCreateDate();
	}

	/**
	* Sets the create date of this payment file.
	*
	* @param createDate the create date of this payment file
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_paymentFile.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this payment file.
	*
	* @return the modified date of this payment file
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _paymentFile.getModifiedDate();
	}

	/**
	* Sets the modified date of this payment file.
	*
	* @param modifiedDate the modified date of this payment file
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_paymentFile.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the organization ID of this payment file.
	*
	* @return the organization ID of this payment file
	*/
	@Override
	public long getOrganizationId() {
		return _paymentFile.getOrganizationId();
	}

	/**
	* Sets the organization ID of this payment file.
	*
	* @param organizationId the organization ID of this payment file
	*/
	@Override
	public void setOrganizationId(long organizationId) {
		_paymentFile.setOrganizationId(organizationId);
	}

	/**
	* Returns the gov agency ID of this payment file.
	*
	* @return the gov agency ID of this payment file
	*/
	@Override
	public java.lang.String getGovAgencyId() {
		return _paymentFile.getGovAgencyId();
	}

	/**
	* Sets the gov agency ID of this payment file.
	*
	* @param govAgencyId the gov agency ID of this payment file
	*/
	@Override
	public void setGovAgencyId(java.lang.String govAgencyId) {
		_paymentFile.setGovAgencyId(govAgencyId);
	}

	/**
	* Returns the gov agency name of this payment file.
	*
	* @return the gov agency name of this payment file
	*/
	@Override
	public java.lang.String getGovAgencyName() {
		return _paymentFile.getGovAgencyName();
	}

	/**
	* Sets the gov agency name of this payment file.
	*
	* @param govAgencyName the gov agency name of this payment file
	*/
	@Override
	public void setGovAgencyName(java.lang.String govAgencyName) {
		_paymentFile.setGovAgencyName(govAgencyName);
	}

	/**
	* Returns the subject ID of this payment file.
	*
	* @return the subject ID of this payment file
	*/
	@Override
	public java.lang.String getSubjectId() {
		return _paymentFile.getSubjectId();
	}

	/**
	* Sets the subject ID of this payment file.
	*
	* @param subjectId the subject ID of this payment file
	*/
	@Override
	public void setSubjectId(java.lang.String subjectId) {
		_paymentFile.setSubjectId(subjectId);
	}

	/**
	* Returns the subject type of this payment file.
	*
	* @return the subject type of this payment file
	*/
	@Override
	public java.lang.String getSubjectType() {
		return _paymentFile.getSubjectType();
	}

	/**
	* Sets the subject type of this payment file.
	*
	* @param subjectType the subject type of this payment file
	*/
	@Override
	public void setSubjectType(java.lang.String subjectType) {
		_paymentFile.setSubjectType(subjectType);
	}

	/**
	* Returns the subject name of this payment file.
	*
	* @return the subject name of this payment file
	*/
	@Override
	public java.lang.String getSubjectName() {
		return _paymentFile.getSubjectName();
	}

	/**
	* Sets the subject name of this payment file.
	*
	* @param subjectName the subject name of this payment file
	*/
	@Override
	public void setSubjectName(java.lang.String subjectName) {
		_paymentFile.setSubjectName(subjectName);
	}

	/**
	* Returns the amount of this payment file.
	*
	* @return the amount of this payment file
	*/
	@Override
	public long getAmount() {
		return _paymentFile.getAmount();
	}

	/**
	* Sets the amount of this payment file.
	*
	* @param amount the amount of this payment file
	*/
	@Override
	public void setAmount(long amount) {
		_paymentFile.setAmount(amount);
	}

	/**
	* Returns the payment type of this payment file.
	*
	* @return the payment type of this payment file
	*/
	@Override
	public java.lang.String getPaymentType() {
		return _paymentFile.getPaymentType();
	}

	/**
	* Sets the payment type of this payment file.
	*
	* @param paymentType the payment type of this payment file
	*/
	@Override
	public void setPaymentType(java.lang.String paymentType) {
		_paymentFile.setPaymentType(paymentType);
	}

	/**
	* Returns the payment description of this payment file.
	*
	* @return the payment description of this payment file
	*/
	@Override
	public java.lang.String getPaymentDescription() {
		return _paymentFile.getPaymentDescription();
	}

	/**
	* Sets the payment description of this payment file.
	*
	* @param paymentDescription the payment description of this payment file
	*/
	@Override
	public void setPaymentDescription(java.lang.String paymentDescription) {
		_paymentFile.setPaymentDescription(paymentDescription);
	}

	/**
	* Returns the transaction info of this payment file.
	*
	* @return the transaction info of this payment file
	*/
	@Override
	public java.lang.String getTransactionInfo() {
		return _paymentFile.getTransactionInfo();
	}

	/**
	* Sets the transaction info of this payment file.
	*
	* @param transactionInfo the transaction info of this payment file
	*/
	@Override
	public void setTransactionInfo(java.lang.String transactionInfo) {
		_paymentFile.setTransactionInfo(transactionInfo);
	}

	/**
	* Returns the file entry ID of this payment file.
	*
	* @return the file entry ID of this payment file
	*/
	@Override
	public long getFileEntryId() {
		return _paymentFile.getFileEntryId();
	}

	/**
	* Sets the file entry ID of this payment file.
	*
	* @param fileEntryId the file entry ID of this payment file
	*/
	@Override
	public void setFileEntryId(long fileEntryId) {
		_paymentFile.setFileEntryId(fileEntryId);
	}

	/**
	* Returns the checking date of this payment file.
	*
	* @return the checking date of this payment file
	*/
	@Override
	public java.util.Date getCheckingDate() {
		return _paymentFile.getCheckingDate();
	}

	/**
	* Sets the checking date of this payment file.
	*
	* @param checkingDate the checking date of this payment file
	*/
	@Override
	public void setCheckingDate(java.util.Date checkingDate) {
		_paymentFile.setCheckingDate(checkingDate);
	}

	/**
	* Returns the checking user ID of this payment file.
	*
	* @return the checking user ID of this payment file
	*/
	@Override
	public long getCheckingUserId() {
		return _paymentFile.getCheckingUserId();
	}

	/**
	* Sets the checking user ID of this payment file.
	*
	* @param checkingUserId the checking user ID of this payment file
	*/
	@Override
	public void setCheckingUserId(long checkingUserId) {
		_paymentFile.setCheckingUserId(checkingUserId);
	}

	/**
	* Returns the checking user uuid of this payment file.
	*
	* @return the checking user uuid of this payment file
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getCheckingUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentFile.getCheckingUserUuid();
	}

	/**
	* Sets the checking user uuid of this payment file.
	*
	* @param checkingUserUuid the checking user uuid of this payment file
	*/
	@Override
	public void setCheckingUserUuid(java.lang.String checkingUserUuid) {
		_paymentFile.setCheckingUserUuid(checkingUserUuid);
	}

	/**
	* Returns the checking user name of this payment file.
	*
	* @return the checking user name of this payment file
	*/
	@Override
	public java.lang.String getCheckingUserName() {
		return _paymentFile.getCheckingUserName();
	}

	/**
	* Sets the checking user name of this payment file.
	*
	* @param checkingUserName the checking user name of this payment file
	*/
	@Override
	public void setCheckingUserName(java.lang.String checkingUserName) {
		_paymentFile.setCheckingUserName(checkingUserName);
	}

	/**
	* Returns the checking result of this payment file.
	*
	* @return the checking result of this payment file
	*/
	@Override
	public int getCheckingResult() {
		return _paymentFile.getCheckingResult();
	}

	/**
	* Sets the checking result of this payment file.
	*
	* @param checkingResult the checking result of this payment file
	*/
	@Override
	public void setCheckingResult(int checkingResult) {
		_paymentFile.setCheckingResult(checkingResult);
	}

	/**
	* Returns the checking note of this payment file.
	*
	* @return the checking note of this payment file
	*/
	@Override
	public java.lang.String getCheckingNote() {
		return _paymentFile.getCheckingNote();
	}

	/**
	* Sets the checking note of this payment file.
	*
	* @param checkingNote the checking note of this payment file
	*/
	@Override
	public void setCheckingNote(java.lang.String checkingNote) {
		_paymentFile.setCheckingNote(checkingNote);
	}

	/**
	* Returns the eb message ID of this payment file.
	*
	* @return the eb message ID of this payment file
	*/
	@Override
	public long getEbMessageId() {
		return _paymentFile.getEbMessageId();
	}

	/**
	* Sets the eb message ID of this payment file.
	*
	* @param ebMessageId the eb message ID of this payment file
	*/
	@Override
	public void setEbMessageId(long ebMessageId) {
		_paymentFile.setEbMessageId(ebMessageId);
	}

	@Override
	public boolean isNew() {
		return _paymentFile.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_paymentFile.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _paymentFile.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_paymentFile.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _paymentFile.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _paymentFile.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_paymentFile.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _paymentFile.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_paymentFile.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_paymentFile.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_paymentFile.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PaymentFileWrapper((PaymentFile)_paymentFile.clone());
	}

	@Override
	public int compareTo(org.oep.dossiermgt.model.PaymentFile paymentFile) {
		return _paymentFile.compareTo(paymentFile);
	}

	@Override
	public int hashCode() {
		return _paymentFile.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.dossiermgt.model.PaymentFile> toCacheModel() {
		return _paymentFile.toCacheModel();
	}

	@Override
	public org.oep.dossiermgt.model.PaymentFile toEscapedModel() {
		return new PaymentFileWrapper(_paymentFile.toEscapedModel());
	}

	@Override
	public org.oep.dossiermgt.model.PaymentFile toUnescapedModel() {
		return new PaymentFileWrapper(_paymentFile.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _paymentFile.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _paymentFile.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_paymentFile.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PaymentFileWrapper)) {
			return false;
		}

		PaymentFileWrapper paymentFileWrapper = (PaymentFileWrapper)obj;

		if (Validator.equals(_paymentFile, paymentFileWrapper._paymentFile)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _paymentFile.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PaymentFile getWrappedPaymentFile() {
		return _paymentFile;
	}

	@Override
	public PaymentFile getWrappedModel() {
		return _paymentFile;
	}

	@Override
	public void resetOriginalValues() {
		_paymentFile.resetOriginalValues();
	}

	private PaymentFile _paymentFile;
}