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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PaymentConfig}.
 * </p>
 *
 * @author trungdk
 * @see PaymentConfig
 * @generated
 */
public class PaymentConfigWrapper implements PaymentConfig,
	ModelWrapper<PaymentConfig> {
	public PaymentConfigWrapper(PaymentConfig paymentConfig) {
		_paymentConfig = paymentConfig;
	}

	@Override
	public Class<?> getModelClass() {
		return PaymentConfig.class;
	}

	@Override
	public String getModelClassName() {
		return PaymentConfig.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("paymentConfigId", getPaymentConfigId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("govAgencyId", getGovAgencyId());
		attributes.put("govAgencyName", getGovAgencyName());
		attributes.put("bankTransfer", getBankTransfer());
		attributes.put("keypay", getKeypay());
		attributes.put("ebPartnerShipId", getEbPartnerShipId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long paymentConfigId = (Long)attributes.get("paymentConfigId");

		if (paymentConfigId != null) {
			setPaymentConfigId(paymentConfigId);
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

		String govAgencyId = (String)attributes.get("govAgencyId");

		if (govAgencyId != null) {
			setGovAgencyId(govAgencyId);
		}

		String govAgencyName = (String)attributes.get("govAgencyName");

		if (govAgencyName != null) {
			setGovAgencyName(govAgencyName);
		}

		String bankTransfer = (String)attributes.get("bankTransfer");

		if (bankTransfer != null) {
			setBankTransfer(bankTransfer);
		}

		String keypay = (String)attributes.get("keypay");

		if (keypay != null) {
			setKeypay(keypay);
		}

		Long ebPartnerShipId = (Long)attributes.get("ebPartnerShipId");

		if (ebPartnerShipId != null) {
			setEbPartnerShipId(ebPartnerShipId);
		}
	}

	/**
	* Returns the primary key of this payment config.
	*
	* @return the primary key of this payment config
	*/
	@Override
	public long getPrimaryKey() {
		return _paymentConfig.getPrimaryKey();
	}

	/**
	* Sets the primary key of this payment config.
	*
	* @param primaryKey the primary key of this payment config
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_paymentConfig.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the payment config ID of this payment config.
	*
	* @return the payment config ID of this payment config
	*/
	@Override
	public long getPaymentConfigId() {
		return _paymentConfig.getPaymentConfigId();
	}

	/**
	* Sets the payment config ID of this payment config.
	*
	* @param paymentConfigId the payment config ID of this payment config
	*/
	@Override
	public void setPaymentConfigId(long paymentConfigId) {
		_paymentConfig.setPaymentConfigId(paymentConfigId);
	}

	/**
	* Returns the company ID of this payment config.
	*
	* @return the company ID of this payment config
	*/
	@Override
	public long getCompanyId() {
		return _paymentConfig.getCompanyId();
	}

	/**
	* Sets the company ID of this payment config.
	*
	* @param companyId the company ID of this payment config
	*/
	@Override
	public void setCompanyId(long companyId) {
		_paymentConfig.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this payment config.
	*
	* @return the create date of this payment config
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _paymentConfig.getCreateDate();
	}

	/**
	* Sets the create date of this payment config.
	*
	* @param createDate the create date of this payment config
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_paymentConfig.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this payment config.
	*
	* @return the modified date of this payment config
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _paymentConfig.getModifiedDate();
	}

	/**
	* Sets the modified date of this payment config.
	*
	* @param modifiedDate the modified date of this payment config
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_paymentConfig.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the gov agency ID of this payment config.
	*
	* @return the gov agency ID of this payment config
	*/
	@Override
	public java.lang.String getGovAgencyId() {
		return _paymentConfig.getGovAgencyId();
	}

	/**
	* Sets the gov agency ID of this payment config.
	*
	* @param govAgencyId the gov agency ID of this payment config
	*/
	@Override
	public void setGovAgencyId(java.lang.String govAgencyId) {
		_paymentConfig.setGovAgencyId(govAgencyId);
	}

	/**
	* Returns the gov agency name of this payment config.
	*
	* @return the gov agency name of this payment config
	*/
	@Override
	public java.lang.String getGovAgencyName() {
		return _paymentConfig.getGovAgencyName();
	}

	/**
	* Sets the gov agency name of this payment config.
	*
	* @param govAgencyName the gov agency name of this payment config
	*/
	@Override
	public void setGovAgencyName(java.lang.String govAgencyName) {
		_paymentConfig.setGovAgencyName(govAgencyName);
	}

	/**
	* Returns the bank transfer of this payment config.
	*
	* @return the bank transfer of this payment config
	*/
	@Override
	public java.lang.String getBankTransfer() {
		return _paymentConfig.getBankTransfer();
	}

	/**
	* Sets the bank transfer of this payment config.
	*
	* @param bankTransfer the bank transfer of this payment config
	*/
	@Override
	public void setBankTransfer(java.lang.String bankTransfer) {
		_paymentConfig.setBankTransfer(bankTransfer);
	}

	/**
	* Returns the keypay of this payment config.
	*
	* @return the keypay of this payment config
	*/
	@Override
	public java.lang.String getKeypay() {
		return _paymentConfig.getKeypay();
	}

	/**
	* Sets the keypay of this payment config.
	*
	* @param keypay the keypay of this payment config
	*/
	@Override
	public void setKeypay(java.lang.String keypay) {
		_paymentConfig.setKeypay(keypay);
	}

	/**
	* Returns the eb partner ship ID of this payment config.
	*
	* @return the eb partner ship ID of this payment config
	*/
	@Override
	public long getEbPartnerShipId() {
		return _paymentConfig.getEbPartnerShipId();
	}

	/**
	* Sets the eb partner ship ID of this payment config.
	*
	* @param ebPartnerShipId the eb partner ship ID of this payment config
	*/
	@Override
	public void setEbPartnerShipId(long ebPartnerShipId) {
		_paymentConfig.setEbPartnerShipId(ebPartnerShipId);
	}

	@Override
	public boolean isNew() {
		return _paymentConfig.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_paymentConfig.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _paymentConfig.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_paymentConfig.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _paymentConfig.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _paymentConfig.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_paymentConfig.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _paymentConfig.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_paymentConfig.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_paymentConfig.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_paymentConfig.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PaymentConfigWrapper((PaymentConfig)_paymentConfig.clone());
	}

	@Override
	public int compareTo(
		org.oep.core.dossiermgt.model.PaymentConfig paymentConfig) {
		return _paymentConfig.compareTo(paymentConfig);
	}

	@Override
	public int hashCode() {
		return _paymentConfig.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.core.dossiermgt.model.PaymentConfig> toCacheModel() {
		return _paymentConfig.toCacheModel();
	}

	@Override
	public org.oep.core.dossiermgt.model.PaymentConfig toEscapedModel() {
		return new PaymentConfigWrapper(_paymentConfig.toEscapedModel());
	}

	@Override
	public org.oep.core.dossiermgt.model.PaymentConfig toUnescapedModel() {
		return new PaymentConfigWrapper(_paymentConfig.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _paymentConfig.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _paymentConfig.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_paymentConfig.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PaymentConfigWrapper)) {
			return false;
		}

		PaymentConfigWrapper paymentConfigWrapper = (PaymentConfigWrapper)obj;

		if (Validator.equals(_paymentConfig, paymentConfigWrapper._paymentConfig)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PaymentConfig getWrappedPaymentConfig() {
		return _paymentConfig;
	}

	@Override
	public PaymentConfig getWrappedModel() {
		return _paymentConfig;
	}

	@Override
	public void resetOriginalValues() {
		_paymentConfig.resetOriginalValues();
	}

	private PaymentConfig _paymentConfig;
}