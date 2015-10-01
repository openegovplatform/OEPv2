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

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PaymentRequest}.
 * </p>
 *
 * @author trungdk
 * @see PaymentRequest
 * @generated
 */
public class PaymentRequestWrapper implements PaymentRequest,
	ModelWrapper<PaymentRequest> {
	public PaymentRequestWrapper(PaymentRequest paymentRequest) {
		_paymentRequest = paymentRequest;
	}

	@Override
	public Class<?> getModelClass() {
		return PaymentRequest.class;
	}

	@Override
	public String getModelClassName() {
		return PaymentRequest.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("paymentRequestId", getPaymentRequestId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("organizationId", getOrganizationId());
		attributes.put("dossierId", getDossierId());
		attributes.put("govAgentId", getGovAgentId());
		attributes.put("govAgentName", getGovAgentName());
		attributes.put("subjectId", getSubjectId());
		attributes.put("subjectType", getSubjectType());
		attributes.put("subjectName", getSubjectName());
		attributes.put("amount", getAmount());
		attributes.put("requestNote", getRequestNote());
		attributes.put("paymentFileId", getPaymentFileId());
		attributes.put("confirmOK", getConfirmOK());
		attributes.put("ebMessageId", getEbMessageId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long paymentRequestId = (Long)attributes.get("paymentRequestId");

		if (paymentRequestId != null) {
			setPaymentRequestId(paymentRequestId);
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

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		String govAgentId = (String)attributes.get("govAgentId");

		if (govAgentId != null) {
			setGovAgentId(govAgentId);
		}

		String govAgentName = (String)attributes.get("govAgentName");

		if (govAgentName != null) {
			setGovAgentName(govAgentName);
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

		String requestNote = (String)attributes.get("requestNote");

		if (requestNote != null) {
			setRequestNote(requestNote);
		}

		Long paymentFileId = (Long)attributes.get("paymentFileId");

		if (paymentFileId != null) {
			setPaymentFileId(paymentFileId);
		}

		Integer confirmOK = (Integer)attributes.get("confirmOK");

		if (confirmOK != null) {
			setConfirmOK(confirmOK);
		}

		Long ebMessageId = (Long)attributes.get("ebMessageId");

		if (ebMessageId != null) {
			setEbMessageId(ebMessageId);
		}
	}

	/**
	* Returns the primary key of this payment request.
	*
	* @return the primary key of this payment request
	*/
	@Override
	public long getPrimaryKey() {
		return _paymentRequest.getPrimaryKey();
	}

	/**
	* Sets the primary key of this payment request.
	*
	* @param primaryKey the primary key of this payment request
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_paymentRequest.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this payment request.
	*
	* @return the uuid of this payment request
	*/
	@Override
	public java.lang.String getUuid() {
		return _paymentRequest.getUuid();
	}

	/**
	* Sets the uuid of this payment request.
	*
	* @param uuid the uuid of this payment request
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_paymentRequest.setUuid(uuid);
	}

	/**
	* Returns the payment request ID of this payment request.
	*
	* @return the payment request ID of this payment request
	*/
	@Override
	public long getPaymentRequestId() {
		return _paymentRequest.getPaymentRequestId();
	}

	/**
	* Sets the payment request ID of this payment request.
	*
	* @param paymentRequestId the payment request ID of this payment request
	*/
	@Override
	public void setPaymentRequestId(long paymentRequestId) {
		_paymentRequest.setPaymentRequestId(paymentRequestId);
	}

	/**
	* Returns the user ID of this payment request.
	*
	* @return the user ID of this payment request
	*/
	@Override
	public long getUserId() {
		return _paymentRequest.getUserId();
	}

	/**
	* Sets the user ID of this payment request.
	*
	* @param userId the user ID of this payment request
	*/
	@Override
	public void setUserId(long userId) {
		_paymentRequest.setUserId(userId);
	}

	/**
	* Returns the user uuid of this payment request.
	*
	* @return the user uuid of this payment request
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentRequest.getUserUuid();
	}

	/**
	* Sets the user uuid of this payment request.
	*
	* @param userUuid the user uuid of this payment request
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_paymentRequest.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this payment request.
	*
	* @return the group ID of this payment request
	*/
	@Override
	public long getGroupId() {
		return _paymentRequest.getGroupId();
	}

	/**
	* Sets the group ID of this payment request.
	*
	* @param groupId the group ID of this payment request
	*/
	@Override
	public void setGroupId(long groupId) {
		_paymentRequest.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this payment request.
	*
	* @return the company ID of this payment request
	*/
	@Override
	public long getCompanyId() {
		return _paymentRequest.getCompanyId();
	}

	/**
	* Sets the company ID of this payment request.
	*
	* @param companyId the company ID of this payment request
	*/
	@Override
	public void setCompanyId(long companyId) {
		_paymentRequest.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this payment request.
	*
	* @return the create date of this payment request
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _paymentRequest.getCreateDate();
	}

	/**
	* Sets the create date of this payment request.
	*
	* @param createDate the create date of this payment request
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_paymentRequest.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this payment request.
	*
	* @return the modified date of this payment request
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _paymentRequest.getModifiedDate();
	}

	/**
	* Sets the modified date of this payment request.
	*
	* @param modifiedDate the modified date of this payment request
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_paymentRequest.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the organization ID of this payment request.
	*
	* @return the organization ID of this payment request
	*/
	@Override
	public long getOrganizationId() {
		return _paymentRequest.getOrganizationId();
	}

	/**
	* Sets the organization ID of this payment request.
	*
	* @param organizationId the organization ID of this payment request
	*/
	@Override
	public void setOrganizationId(long organizationId) {
		_paymentRequest.setOrganizationId(organizationId);
	}

	/**
	* Returns the dossier ID of this payment request.
	*
	* @return the dossier ID of this payment request
	*/
	@Override
	public long getDossierId() {
		return _paymentRequest.getDossierId();
	}

	/**
	* Sets the dossier ID of this payment request.
	*
	* @param dossierId the dossier ID of this payment request
	*/
	@Override
	public void setDossierId(long dossierId) {
		_paymentRequest.setDossierId(dossierId);
	}

	/**
	* Returns the gov agent ID of this payment request.
	*
	* @return the gov agent ID of this payment request
	*/
	@Override
	public java.lang.String getGovAgentId() {
		return _paymentRequest.getGovAgentId();
	}

	/**
	* Sets the gov agent ID of this payment request.
	*
	* @param govAgentId the gov agent ID of this payment request
	*/
	@Override
	public void setGovAgentId(java.lang.String govAgentId) {
		_paymentRequest.setGovAgentId(govAgentId);
	}

	/**
	* Returns the gov agent name of this payment request.
	*
	* @return the gov agent name of this payment request
	*/
	@Override
	public java.lang.String getGovAgentName() {
		return _paymentRequest.getGovAgentName();
	}

	/**
	* Sets the gov agent name of this payment request.
	*
	* @param govAgentName the gov agent name of this payment request
	*/
	@Override
	public void setGovAgentName(java.lang.String govAgentName) {
		_paymentRequest.setGovAgentName(govAgentName);
	}

	/**
	* Returns the subject ID of this payment request.
	*
	* @return the subject ID of this payment request
	*/
	@Override
	public java.lang.String getSubjectId() {
		return _paymentRequest.getSubjectId();
	}

	/**
	* Sets the subject ID of this payment request.
	*
	* @param subjectId the subject ID of this payment request
	*/
	@Override
	public void setSubjectId(java.lang.String subjectId) {
		_paymentRequest.setSubjectId(subjectId);
	}

	/**
	* Returns the subject type of this payment request.
	*
	* @return the subject type of this payment request
	*/
	@Override
	public java.lang.String getSubjectType() {
		return _paymentRequest.getSubjectType();
	}

	/**
	* Sets the subject type of this payment request.
	*
	* @param subjectType the subject type of this payment request
	*/
	@Override
	public void setSubjectType(java.lang.String subjectType) {
		_paymentRequest.setSubjectType(subjectType);
	}

	/**
	* Returns the subject name of this payment request.
	*
	* @return the subject name of this payment request
	*/
	@Override
	public java.lang.String getSubjectName() {
		return _paymentRequest.getSubjectName();
	}

	/**
	* Sets the subject name of this payment request.
	*
	* @param subjectName the subject name of this payment request
	*/
	@Override
	public void setSubjectName(java.lang.String subjectName) {
		_paymentRequest.setSubjectName(subjectName);
	}

	/**
	* Returns the amount of this payment request.
	*
	* @return the amount of this payment request
	*/
	@Override
	public long getAmount() {
		return _paymentRequest.getAmount();
	}

	/**
	* Sets the amount of this payment request.
	*
	* @param amount the amount of this payment request
	*/
	@Override
	public void setAmount(long amount) {
		_paymentRequest.setAmount(amount);
	}

	/**
	* Returns the request note of this payment request.
	*
	* @return the request note of this payment request
	*/
	@Override
	public java.lang.String getRequestNote() {
		return _paymentRequest.getRequestNote();
	}

	/**
	* Sets the request note of this payment request.
	*
	* @param requestNote the request note of this payment request
	*/
	@Override
	public void setRequestNote(java.lang.String requestNote) {
		_paymentRequest.setRequestNote(requestNote);
	}

	/**
	* Returns the payment file ID of this payment request.
	*
	* @return the payment file ID of this payment request
	*/
	@Override
	public long getPaymentFileId() {
		return _paymentRequest.getPaymentFileId();
	}

	/**
	* Sets the payment file ID of this payment request.
	*
	* @param paymentFileId the payment file ID of this payment request
	*/
	@Override
	public void setPaymentFileId(long paymentFileId) {
		_paymentRequest.setPaymentFileId(paymentFileId);
	}

	/**
	* Returns the confirm o k of this payment request.
	*
	* @return the confirm o k of this payment request
	*/
	@Override
	public int getConfirmOK() {
		return _paymentRequest.getConfirmOK();
	}

	/**
	* Sets the confirm o k of this payment request.
	*
	* @param confirmOK the confirm o k of this payment request
	*/
	@Override
	public void setConfirmOK(int confirmOK) {
		_paymentRequest.setConfirmOK(confirmOK);
	}

	/**
	* Returns the eb message ID of this payment request.
	*
	* @return the eb message ID of this payment request
	*/
	@Override
	public long getEbMessageId() {
		return _paymentRequest.getEbMessageId();
	}

	/**
	* Sets the eb message ID of this payment request.
	*
	* @param ebMessageId the eb message ID of this payment request
	*/
	@Override
	public void setEbMessageId(long ebMessageId) {
		_paymentRequest.setEbMessageId(ebMessageId);
	}

	@Override
	public boolean isNew() {
		return _paymentRequest.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_paymentRequest.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _paymentRequest.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_paymentRequest.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _paymentRequest.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _paymentRequest.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_paymentRequest.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _paymentRequest.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_paymentRequest.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_paymentRequest.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_paymentRequest.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PaymentRequestWrapper((PaymentRequest)_paymentRequest.clone());
	}

	@Override
	public int compareTo(
		org.oep.core.dossiermgt.model.PaymentRequest paymentRequest) {
		return _paymentRequest.compareTo(paymentRequest);
	}

	@Override
	public int hashCode() {
		return _paymentRequest.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.core.dossiermgt.model.PaymentRequest> toCacheModel() {
		return _paymentRequest.toCacheModel();
	}

	@Override
	public org.oep.core.dossiermgt.model.PaymentRequest toEscapedModel() {
		return new PaymentRequestWrapper(_paymentRequest.toEscapedModel());
	}

	@Override
	public org.oep.core.dossiermgt.model.PaymentRequest toUnescapedModel() {
		return new PaymentRequestWrapper(_paymentRequest.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _paymentRequest.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _paymentRequest.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_paymentRequest.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PaymentRequestWrapper)) {
			return false;
		}

		PaymentRequestWrapper paymentRequestWrapper = (PaymentRequestWrapper)obj;

		if (Validator.equals(_paymentRequest,
					paymentRequestWrapper._paymentRequest)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _paymentRequest.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PaymentRequest getWrappedPaymentRequest() {
		return _paymentRequest;
	}

	@Override
	public PaymentRequest getWrappedModel() {
		return _paymentRequest;
	}

	@Override
	public void resetOriginalValues() {
		_paymentRequest.resetOriginalValues();
	}

	private PaymentRequest _paymentRequest;
}