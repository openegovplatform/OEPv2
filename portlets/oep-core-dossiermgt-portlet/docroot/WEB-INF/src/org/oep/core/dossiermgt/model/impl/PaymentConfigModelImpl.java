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

package org.oep.core.dossiermgt.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import org.oep.core.dossiermgt.model.PaymentConfig;
import org.oep.core.dossiermgt.model.PaymentConfigModel;
import org.oep.core.dossiermgt.model.PaymentConfigSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the PaymentConfig service. Represents a row in the &quot;oep_dossiermgt_paymentconfig&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.core.dossiermgt.model.PaymentConfigModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PaymentConfigImpl}.
 * </p>
 *
 * @author trungdk
 * @see PaymentConfigImpl
 * @see org.oep.core.dossiermgt.model.PaymentConfig
 * @see org.oep.core.dossiermgt.model.PaymentConfigModel
 * @generated
 */
@JSON(strict = true)
public class PaymentConfigModelImpl extends BaseModelImpl<PaymentConfig>
	implements PaymentConfigModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a payment config model instance should use the {@link org.oep.core.dossiermgt.model.PaymentConfig} interface instead.
	 */
	public static final String TABLE_NAME = "oep_dossiermgt_paymentconfig";
	public static final Object[][] TABLE_COLUMNS = {
			{ "paymentConfigId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "govAgentId", Types.VARCHAR },
			{ "govAgentName", Types.VARCHAR },
			{ "bankTransfer", Types.VARCHAR },
			{ "keypay", Types.VARCHAR },
			{ "ebPartnerShipId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table oep_dossiermgt_paymentconfig (paymentConfigId LONG not null primary key,companyId LONG,createDate DATE null,modifiedDate DATE null,govAgentId VARCHAR(30) null,govAgentName VARCHAR(200) null,bankTransfer VARCHAR(500) null,keypay VARCHAR(255) null,ebPartnerShipId LONG)";
	public static final String TABLE_SQL_DROP = "drop table oep_dossiermgt_paymentconfig";
	public static final String ORDER_BY_JPQL = " ORDER BY paymentConfig.paymentConfigId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY oep_dossiermgt_paymentconfig.paymentConfigId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.core.dossiermgt.model.PaymentConfig"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.core.dossiermgt.model.PaymentConfig"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static PaymentConfig toModel(PaymentConfigSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		PaymentConfig model = new PaymentConfigImpl();

		model.setPaymentConfigId(soapModel.getPaymentConfigId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setGovAgentId(soapModel.getGovAgentId());
		model.setGovAgentName(soapModel.getGovAgentName());
		model.setBankTransfer(soapModel.getBankTransfer());
		model.setKeypay(soapModel.getKeypay());
		model.setEbPartnerShipId(soapModel.getEbPartnerShipId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<PaymentConfig> toModels(PaymentConfigSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<PaymentConfig> models = new ArrayList<PaymentConfig>(soapModels.length);

		for (PaymentConfigSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.core.dossiermgt.model.PaymentConfig"));

	public PaymentConfigModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _paymentConfigId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPaymentConfigId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _paymentConfigId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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
		attributes.put("govAgentId", getGovAgentId());
		attributes.put("govAgentName", getGovAgentName());
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

		String govAgentId = (String)attributes.get("govAgentId");

		if (govAgentId != null) {
			setGovAgentId(govAgentId);
		}

		String govAgentName = (String)attributes.get("govAgentName");

		if (govAgentName != null) {
			setGovAgentName(govAgentName);
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

	@JSON
	@Override
	public long getPaymentConfigId() {
		return _paymentConfigId;
	}

	@Override
	public void setPaymentConfigId(long paymentConfigId) {
		_paymentConfigId = paymentConfigId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getGovAgentId() {
		if (_govAgentId == null) {
			return StringPool.BLANK;
		}
		else {
			return _govAgentId;
		}
	}

	@Override
	public void setGovAgentId(String govAgentId) {
		_govAgentId = govAgentId;
	}

	@JSON
	@Override
	public String getGovAgentName() {
		if (_govAgentName == null) {
			return StringPool.BLANK;
		}
		else {
			return _govAgentName;
		}
	}

	@Override
	public void setGovAgentName(String govAgentName) {
		_govAgentName = govAgentName;
	}

	@JSON
	@Override
	public String getBankTransfer() {
		if (_bankTransfer == null) {
			return StringPool.BLANK;
		}
		else {
			return _bankTransfer;
		}
	}

	@Override
	public void setBankTransfer(String bankTransfer) {
		_bankTransfer = bankTransfer;
	}

	@JSON
	@Override
	public String getKeypay() {
		if (_keypay == null) {
			return StringPool.BLANK;
		}
		else {
			return _keypay;
		}
	}

	@Override
	public void setKeypay(String keypay) {
		_keypay = keypay;
	}

	@JSON
	@Override
	public long getEbPartnerShipId() {
		return _ebPartnerShipId;
	}

	@Override
	public void setEbPartnerShipId(long ebPartnerShipId) {
		_ebPartnerShipId = ebPartnerShipId;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			PaymentConfig.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public PaymentConfig toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (PaymentConfig)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		PaymentConfigImpl paymentConfigImpl = new PaymentConfigImpl();

		paymentConfigImpl.setPaymentConfigId(getPaymentConfigId());
		paymentConfigImpl.setCompanyId(getCompanyId());
		paymentConfigImpl.setCreateDate(getCreateDate());
		paymentConfigImpl.setModifiedDate(getModifiedDate());
		paymentConfigImpl.setGovAgentId(getGovAgentId());
		paymentConfigImpl.setGovAgentName(getGovAgentName());
		paymentConfigImpl.setBankTransfer(getBankTransfer());
		paymentConfigImpl.setKeypay(getKeypay());
		paymentConfigImpl.setEbPartnerShipId(getEbPartnerShipId());

		paymentConfigImpl.resetOriginalValues();

		return paymentConfigImpl;
	}

	@Override
	public int compareTo(PaymentConfig paymentConfig) {
		long primaryKey = paymentConfig.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PaymentConfig)) {
			return false;
		}

		PaymentConfig paymentConfig = (PaymentConfig)obj;

		long primaryKey = paymentConfig.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<PaymentConfig> toCacheModel() {
		PaymentConfigCacheModel paymentConfigCacheModel = new PaymentConfigCacheModel();

		paymentConfigCacheModel.paymentConfigId = getPaymentConfigId();

		paymentConfigCacheModel.companyId = getCompanyId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			paymentConfigCacheModel.createDate = createDate.getTime();
		}
		else {
			paymentConfigCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			paymentConfigCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			paymentConfigCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		paymentConfigCacheModel.govAgentId = getGovAgentId();

		String govAgentId = paymentConfigCacheModel.govAgentId;

		if ((govAgentId != null) && (govAgentId.length() == 0)) {
			paymentConfigCacheModel.govAgentId = null;
		}

		paymentConfigCacheModel.govAgentName = getGovAgentName();

		String govAgentName = paymentConfigCacheModel.govAgentName;

		if ((govAgentName != null) && (govAgentName.length() == 0)) {
			paymentConfigCacheModel.govAgentName = null;
		}

		paymentConfigCacheModel.bankTransfer = getBankTransfer();

		String bankTransfer = paymentConfigCacheModel.bankTransfer;

		if ((bankTransfer != null) && (bankTransfer.length() == 0)) {
			paymentConfigCacheModel.bankTransfer = null;
		}

		paymentConfigCacheModel.keypay = getKeypay();

		String keypay = paymentConfigCacheModel.keypay;

		if ((keypay != null) && (keypay.length() == 0)) {
			paymentConfigCacheModel.keypay = null;
		}

		paymentConfigCacheModel.ebPartnerShipId = getEbPartnerShipId();

		return paymentConfigCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{paymentConfigId=");
		sb.append(getPaymentConfigId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", govAgentId=");
		sb.append(getGovAgentId());
		sb.append(", govAgentName=");
		sb.append(getGovAgentName());
		sb.append(", bankTransfer=");
		sb.append(getBankTransfer());
		sb.append(", keypay=");
		sb.append(getKeypay());
		sb.append(", ebPartnerShipId=");
		sb.append(getEbPartnerShipId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.dossiermgt.model.PaymentConfig");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>paymentConfigId</column-name><column-value><![CDATA[");
		sb.append(getPaymentConfigId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>govAgentId</column-name><column-value><![CDATA[");
		sb.append(getGovAgentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>govAgentName</column-name><column-value><![CDATA[");
		sb.append(getGovAgentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bankTransfer</column-name><column-value><![CDATA[");
		sb.append(getBankTransfer());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>keypay</column-name><column-value><![CDATA[");
		sb.append(getKeypay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ebPartnerShipId</column-name><column-value><![CDATA[");
		sb.append(getEbPartnerShipId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = PaymentConfig.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			PaymentConfig.class
		};
	private long _paymentConfigId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _govAgentId;
	private String _govAgentName;
	private String _bankTransfer;
	private String _keypay;
	private long _ebPartnerShipId;
	private PaymentConfig _escapedModel;
}