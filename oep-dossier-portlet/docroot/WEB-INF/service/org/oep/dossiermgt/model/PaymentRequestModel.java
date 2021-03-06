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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the PaymentRequest service. Represents a row in the &quot;oep_dossiermgt_paymentrequest&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.dossiermgt.model.impl.PaymentRequestModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.dossiermgt.model.impl.PaymentRequestImpl}.
 * </p>
 *
 * @author trungdk
 * @see PaymentRequest
 * @see org.oep.dossiermgt.model.impl.PaymentRequestImpl
 * @see org.oep.dossiermgt.model.impl.PaymentRequestModelImpl
 * @generated
 */
public interface PaymentRequestModel extends BaseModel<PaymentRequest>,
	StagedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a payment request model instance should use the {@link PaymentRequest} interface instead.
	 */

	/**
	 * Returns the primary key of this payment request.
	 *
	 * @return the primary key of this payment request
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this payment request.
	 *
	 * @param primaryKey the primary key of this payment request
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this payment request.
	 *
	 * @return the uuid of this payment request
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this payment request.
	 *
	 * @param uuid the uuid of this payment request
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the payment request ID of this payment request.
	 *
	 * @return the payment request ID of this payment request
	 */
	public long getPaymentRequestId();

	/**
	 * Sets the payment request ID of this payment request.
	 *
	 * @param paymentRequestId the payment request ID of this payment request
	 */
	public void setPaymentRequestId(long paymentRequestId);

	/**
	 * Returns the user ID of this payment request.
	 *
	 * @return the user ID of this payment request
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this payment request.
	 *
	 * @param userId the user ID of this payment request
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this payment request.
	 *
	 * @return the user uuid of this payment request
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this payment request.
	 *
	 * @param userUuid the user uuid of this payment request
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the group ID of this payment request.
	 *
	 * @return the group ID of this payment request
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this payment request.
	 *
	 * @param groupId the group ID of this payment request
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this payment request.
	 *
	 * @return the company ID of this payment request
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this payment request.
	 *
	 * @param companyId the company ID of this payment request
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the create date of this payment request.
	 *
	 * @return the create date of this payment request
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this payment request.
	 *
	 * @param createDate the create date of this payment request
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this payment request.
	 *
	 * @return the modified date of this payment request
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this payment request.
	 *
	 * @param modifiedDate the modified date of this payment request
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the organization ID of this payment request.
	 *
	 * @return the organization ID of this payment request
	 */
	public long getOrganizationId();

	/**
	 * Sets the organization ID of this payment request.
	 *
	 * @param organizationId the organization ID of this payment request
	 */
	public void setOrganizationId(long organizationId);

	/**
	 * Returns the dossier ID of this payment request.
	 *
	 * @return the dossier ID of this payment request
	 */
	public long getDossierId();

	/**
	 * Sets the dossier ID of this payment request.
	 *
	 * @param dossierId the dossier ID of this payment request
	 */
	public void setDossierId(long dossierId);

	/**
	 * Returns the gov agency ID of this payment request.
	 *
	 * @return the gov agency ID of this payment request
	 */
	@AutoEscape
	public String getGovAgencyId();

	/**
	 * Sets the gov agency ID of this payment request.
	 *
	 * @param govAgencyId the gov agency ID of this payment request
	 */
	public void setGovAgencyId(String govAgencyId);

	/**
	 * Returns the gov agency name of this payment request.
	 *
	 * @return the gov agency name of this payment request
	 */
	@AutoEscape
	public String getGovAgencyName();

	/**
	 * Sets the gov agency name of this payment request.
	 *
	 * @param govAgencyName the gov agency name of this payment request
	 */
	public void setGovAgencyName(String govAgencyName);

	/**
	 * Returns the subject ID of this payment request.
	 *
	 * @return the subject ID of this payment request
	 */
	@AutoEscape
	public String getSubjectId();

	/**
	 * Sets the subject ID of this payment request.
	 *
	 * @param subjectId the subject ID of this payment request
	 */
	public void setSubjectId(String subjectId);

	/**
	 * Returns the subject type of this payment request.
	 *
	 * @return the subject type of this payment request
	 */
	@AutoEscape
	public String getSubjectType();

	/**
	 * Sets the subject type of this payment request.
	 *
	 * @param subjectType the subject type of this payment request
	 */
	public void setSubjectType(String subjectType);

	/**
	 * Returns the subject name of this payment request.
	 *
	 * @return the subject name of this payment request
	 */
	@AutoEscape
	public String getSubjectName();

	/**
	 * Sets the subject name of this payment request.
	 *
	 * @param subjectName the subject name of this payment request
	 */
	public void setSubjectName(String subjectName);

	/**
	 * Returns the amount of this payment request.
	 *
	 * @return the amount of this payment request
	 */
	public long getAmount();

	/**
	 * Sets the amount of this payment request.
	 *
	 * @param amount the amount of this payment request
	 */
	public void setAmount(long amount);

	/**
	 * Returns the request note of this payment request.
	 *
	 * @return the request note of this payment request
	 */
	@AutoEscape
	public String getRequestNote();

	/**
	 * Sets the request note of this payment request.
	 *
	 * @param requestNote the request note of this payment request
	 */
	public void setRequestNote(String requestNote);

	/**
	 * Returns the payment file ID of this payment request.
	 *
	 * @return the payment file ID of this payment request
	 */
	public long getPaymentFileId();

	/**
	 * Sets the payment file ID of this payment request.
	 *
	 * @param paymentFileId the payment file ID of this payment request
	 */
	public void setPaymentFileId(long paymentFileId);

	/**
	 * Returns the confirm o k of this payment request.
	 *
	 * @return the confirm o k of this payment request
	 */
	public int getConfirmOK();

	/**
	 * Sets the confirm o k of this payment request.
	 *
	 * @param confirmOK the confirm o k of this payment request
	 */
	public void setConfirmOK(int confirmOK);

	/**
	 * Returns the eb message ID of this payment request.
	 *
	 * @return the eb message ID of this payment request
	 */
	public long getEbMessageId();

	/**
	 * Sets the eb message ID of this payment request.
	 *
	 * @param ebMessageId the eb message ID of this payment request
	 */
	public void setEbMessageId(long ebMessageId);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(PaymentRequest paymentRequest);

	@Override
	public int hashCode();

	@Override
	public CacheModel<PaymentRequest> toCacheModel();

	@Override
	public PaymentRequest toEscapedModel();

	@Override
	public PaymentRequest toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}