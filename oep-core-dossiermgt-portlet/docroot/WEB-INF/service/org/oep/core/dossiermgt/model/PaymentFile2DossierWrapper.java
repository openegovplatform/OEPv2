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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PaymentFile2Dossier}.
 * </p>
 *
 * @author trungdk
 * @see PaymentFile2Dossier
 * @generated
 */
public class PaymentFile2DossierWrapper implements PaymentFile2Dossier,
	ModelWrapper<PaymentFile2Dossier> {
	public PaymentFile2DossierWrapper(PaymentFile2Dossier paymentFile2Dossier) {
		_paymentFile2Dossier = paymentFile2Dossier;
	}

	@Override
	public Class<?> getModelClass() {
		return PaymentFile2Dossier.class;
	}

	@Override
	public String getModelClassName() {
		return PaymentFile2Dossier.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("companyId", getCompanyId());
		attributes.put("paymentFileId", getPaymentFileId());
		attributes.put("dossierId", getDossierId());
		attributes.put("amount", getAmount());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long paymentFileId = (Long)attributes.get("paymentFileId");

		if (paymentFileId != null) {
			setPaymentFileId(paymentFileId);
		}

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		Long amount = (Long)attributes.get("amount");

		if (amount != null) {
			setAmount(amount);
		}
	}

	/**
	* Returns the primary key of this payment file2 dossier.
	*
	* @return the primary key of this payment file2 dossier
	*/
	@Override
	public long getPrimaryKey() {
		return _paymentFile2Dossier.getPrimaryKey();
	}

	/**
	* Sets the primary key of this payment file2 dossier.
	*
	* @param primaryKey the primary key of this payment file2 dossier
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_paymentFile2Dossier.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this payment file2 dossier.
	*
	* @return the ID of this payment file2 dossier
	*/
	@Override
	public long getId() {
		return _paymentFile2Dossier.getId();
	}

	/**
	* Sets the ID of this payment file2 dossier.
	*
	* @param id the ID of this payment file2 dossier
	*/
	@Override
	public void setId(long id) {
		_paymentFile2Dossier.setId(id);
	}

	/**
	* Returns the company ID of this payment file2 dossier.
	*
	* @return the company ID of this payment file2 dossier
	*/
	@Override
	public long getCompanyId() {
		return _paymentFile2Dossier.getCompanyId();
	}

	/**
	* Sets the company ID of this payment file2 dossier.
	*
	* @param companyId the company ID of this payment file2 dossier
	*/
	@Override
	public void setCompanyId(long companyId) {
		_paymentFile2Dossier.setCompanyId(companyId);
	}

	/**
	* Returns the payment file ID of this payment file2 dossier.
	*
	* @return the payment file ID of this payment file2 dossier
	*/
	@Override
	public long getPaymentFileId() {
		return _paymentFile2Dossier.getPaymentFileId();
	}

	/**
	* Sets the payment file ID of this payment file2 dossier.
	*
	* @param paymentFileId the payment file ID of this payment file2 dossier
	*/
	@Override
	public void setPaymentFileId(long paymentFileId) {
		_paymentFile2Dossier.setPaymentFileId(paymentFileId);
	}

	/**
	* Returns the dossier ID of this payment file2 dossier.
	*
	* @return the dossier ID of this payment file2 dossier
	*/
	@Override
	public long getDossierId() {
		return _paymentFile2Dossier.getDossierId();
	}

	/**
	* Sets the dossier ID of this payment file2 dossier.
	*
	* @param dossierId the dossier ID of this payment file2 dossier
	*/
	@Override
	public void setDossierId(long dossierId) {
		_paymentFile2Dossier.setDossierId(dossierId);
	}

	/**
	* Returns the amount of this payment file2 dossier.
	*
	* @return the amount of this payment file2 dossier
	*/
	@Override
	public long getAmount() {
		return _paymentFile2Dossier.getAmount();
	}

	/**
	* Sets the amount of this payment file2 dossier.
	*
	* @param amount the amount of this payment file2 dossier
	*/
	@Override
	public void setAmount(long amount) {
		_paymentFile2Dossier.setAmount(amount);
	}

	@Override
	public boolean isNew() {
		return _paymentFile2Dossier.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_paymentFile2Dossier.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _paymentFile2Dossier.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_paymentFile2Dossier.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _paymentFile2Dossier.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _paymentFile2Dossier.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_paymentFile2Dossier.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _paymentFile2Dossier.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_paymentFile2Dossier.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_paymentFile2Dossier.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_paymentFile2Dossier.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PaymentFile2DossierWrapper((PaymentFile2Dossier)_paymentFile2Dossier.clone());
	}

	@Override
	public int compareTo(PaymentFile2Dossier paymentFile2Dossier) {
		return _paymentFile2Dossier.compareTo(paymentFile2Dossier);
	}

	@Override
	public int hashCode() {
		return _paymentFile2Dossier.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<PaymentFile2Dossier> toCacheModel() {
		return _paymentFile2Dossier.toCacheModel();
	}

	@Override
	public PaymentFile2Dossier toEscapedModel() {
		return new PaymentFile2DossierWrapper(_paymentFile2Dossier.toEscapedModel());
	}

	@Override
	public PaymentFile2Dossier toUnescapedModel() {
		return new PaymentFile2DossierWrapper(_paymentFile2Dossier.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _paymentFile2Dossier.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _paymentFile2Dossier.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_paymentFile2Dossier.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PaymentFile2DossierWrapper)) {
			return false;
		}

		PaymentFile2DossierWrapper paymentFile2DossierWrapper = (PaymentFile2DossierWrapper)obj;

		if (Validator.equals(_paymentFile2Dossier,
					paymentFile2DossierWrapper._paymentFile2Dossier)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PaymentFile2Dossier getWrappedPaymentFile2Dossier() {
		return _paymentFile2Dossier;
	}

	@Override
	public PaymentFile2Dossier getWrappedModel() {
		return _paymentFile2Dossier;
	}

	@Override
	public void resetOriginalValues() {
		_paymentFile2Dossier.resetOriginalValues();
	}

	private PaymentFile2Dossier _paymentFile2Dossier;
}