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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import org.oep.core.dossiermgt.service.ClpSerializer;
import org.oep.core.dossiermgt.service.PaymentConfigLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class PaymentConfigClp extends BaseModelImpl<PaymentConfig>
	implements PaymentConfig {
	public PaymentConfigClp() {
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
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("paymentConfigId", getPaymentConfigId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dossierProcId", getDossierProcId());
		attributes.put("govAgentNo", getGovAgentNo());
		attributes.put("govAgentName", getGovAgentName());
		attributes.put("prePaidFee", getPrePaidFee());
		attributes.put("bankTransfer", getBankTransfer());
		attributes.put("keypay", getKeypay());

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

		Long dossierProcId = (Long)attributes.get("dossierProcId");

		if (dossierProcId != null) {
			setDossierProcId(dossierProcId);
		}

		String govAgentNo = (String)attributes.get("govAgentNo");

		if (govAgentNo != null) {
			setGovAgentNo(govAgentNo);
		}

		String govAgentName = (String)attributes.get("govAgentName");

		if (govAgentName != null) {
			setGovAgentName(govAgentName);
		}

		Long prePaidFee = (Long)attributes.get("prePaidFee");

		if (prePaidFee != null) {
			setPrePaidFee(prePaidFee);
		}

		String bankTransfer = (String)attributes.get("bankTransfer");

		if (bankTransfer != null) {
			setBankTransfer(bankTransfer);
		}

		String keypay = (String)attributes.get("keypay");

		if (keypay != null) {
			setKeypay(keypay);
		}
	}

	@Override
	public long getPaymentConfigId() {
		return _paymentConfigId;
	}

	@Override
	public void setPaymentConfigId(long paymentConfigId) {
		_paymentConfigId = paymentConfigId;

		if (_paymentConfigRemoteModel != null) {
			try {
				Class<?> clazz = _paymentConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setPaymentConfigId", long.class);

				method.invoke(_paymentConfigRemoteModel, paymentConfigId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_paymentConfigRemoteModel != null) {
			try {
				Class<?> clazz = _paymentConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_paymentConfigRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_paymentConfigRemoteModel != null) {
			try {
				Class<?> clazz = _paymentConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_paymentConfigRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_paymentConfigRemoteModel != null) {
			try {
				Class<?> clazz = _paymentConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_paymentConfigRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDossierProcId() {
		return _dossierProcId;
	}

	@Override
	public void setDossierProcId(long dossierProcId) {
		_dossierProcId = dossierProcId;

		if (_paymentConfigRemoteModel != null) {
			try {
				Class<?> clazz = _paymentConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierProcId", long.class);

				method.invoke(_paymentConfigRemoteModel, dossierProcId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGovAgentNo() {
		return _govAgentNo;
	}

	@Override
	public void setGovAgentNo(String govAgentNo) {
		_govAgentNo = govAgentNo;

		if (_paymentConfigRemoteModel != null) {
			try {
				Class<?> clazz = _paymentConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setGovAgentNo", String.class);

				method.invoke(_paymentConfigRemoteModel, govAgentNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGovAgentName() {
		return _govAgentName;
	}

	@Override
	public void setGovAgentName(String govAgentName) {
		_govAgentName = govAgentName;

		if (_paymentConfigRemoteModel != null) {
			try {
				Class<?> clazz = _paymentConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setGovAgentName", String.class);

				method.invoke(_paymentConfigRemoteModel, govAgentName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPrePaidFee() {
		return _prePaidFee;
	}

	@Override
	public void setPrePaidFee(long prePaidFee) {
		_prePaidFee = prePaidFee;

		if (_paymentConfigRemoteModel != null) {
			try {
				Class<?> clazz = _paymentConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setPrePaidFee", long.class);

				method.invoke(_paymentConfigRemoteModel, prePaidFee);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBankTransfer() {
		return _bankTransfer;
	}

	@Override
	public void setBankTransfer(String bankTransfer) {
		_bankTransfer = bankTransfer;

		if (_paymentConfigRemoteModel != null) {
			try {
				Class<?> clazz = _paymentConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setBankTransfer", String.class);

				method.invoke(_paymentConfigRemoteModel, bankTransfer);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKeypay() {
		return _keypay;
	}

	@Override
	public void setKeypay(String keypay) {
		_keypay = keypay;

		if (_paymentConfigRemoteModel != null) {
			try {
				Class<?> clazz = _paymentConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setKeypay", String.class);

				method.invoke(_paymentConfigRemoteModel, keypay);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPaymentConfigRemoteModel() {
		return _paymentConfigRemoteModel;
	}

	public void setPaymentConfigRemoteModel(
		BaseModel<?> paymentConfigRemoteModel) {
		_paymentConfigRemoteModel = paymentConfigRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _paymentConfigRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_paymentConfigRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PaymentConfigLocalServiceUtil.addPaymentConfig(this);
		}
		else {
			PaymentConfigLocalServiceUtil.updatePaymentConfig(this);
		}
	}

	@Override
	public PaymentConfig toEscapedModel() {
		return (PaymentConfig)ProxyUtil.newProxyInstance(PaymentConfig.class.getClassLoader(),
			new Class[] { PaymentConfig.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PaymentConfigClp clone = new PaymentConfigClp();

		clone.setPaymentConfigId(getPaymentConfigId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setDossierProcId(getDossierProcId());
		clone.setGovAgentNo(getGovAgentNo());
		clone.setGovAgentName(getGovAgentName());
		clone.setPrePaidFee(getPrePaidFee());
		clone.setBankTransfer(getBankTransfer());
		clone.setKeypay(getKeypay());

		return clone;
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

		if (!(obj instanceof PaymentConfigClp)) {
			return false;
		}

		PaymentConfigClp paymentConfig = (PaymentConfigClp)obj;

		long primaryKey = paymentConfig.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{paymentConfigId=");
		sb.append(getPaymentConfigId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", dossierProcId=");
		sb.append(getDossierProcId());
		sb.append(", govAgentNo=");
		sb.append(getGovAgentNo());
		sb.append(", govAgentName=");
		sb.append(getGovAgentName());
		sb.append(", prePaidFee=");
		sb.append(getPrePaidFee());
		sb.append(", bankTransfer=");
		sb.append(getBankTransfer());
		sb.append(", keypay=");
		sb.append(getKeypay());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

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
			"<column><column-name>dossierProcId</column-name><column-value><![CDATA[");
		sb.append(getDossierProcId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>govAgentNo</column-name><column-value><![CDATA[");
		sb.append(getGovAgentNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>govAgentName</column-name><column-value><![CDATA[");
		sb.append(getGovAgentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>prePaidFee</column-name><column-value><![CDATA[");
		sb.append(getPrePaidFee());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bankTransfer</column-name><column-value><![CDATA[");
		sb.append(getBankTransfer());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>keypay</column-name><column-value><![CDATA[");
		sb.append(getKeypay());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _paymentConfigId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _dossierProcId;
	private String _govAgentNo;
	private String _govAgentName;
	private long _prePaidFee;
	private String _bankTransfer;
	private String _keypay;
	private BaseModel<?> _paymentConfigRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.dossiermgt.service.ClpSerializer.class;
}