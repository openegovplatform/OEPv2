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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import org.oep.dossiermgt.service.ClpSerializer;
import org.oep.dossiermgt.service.PaymentRequestLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class PaymentRequestClp extends BaseModelImpl<PaymentRequest>
	implements PaymentRequest {
	public PaymentRequestClp() {
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
	public long getPrimaryKey() {
		return _paymentRequestId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPaymentRequestId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _paymentRequestId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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
		attributes.put("govAgencyId", getGovAgencyId());
		attributes.put("govAgencyName", getGovAgencyName());
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

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_paymentRequestRemoteModel != null) {
			try {
				Class<?> clazz = _paymentRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_paymentRequestRemoteModel, uuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPaymentRequestId() {
		return _paymentRequestId;
	}

	@Override
	public void setPaymentRequestId(long paymentRequestId) {
		_paymentRequestId = paymentRequestId;

		if (_paymentRequestRemoteModel != null) {
			try {
				Class<?> clazz = _paymentRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setPaymentRequestId",
						long.class);

				method.invoke(_paymentRequestRemoteModel, paymentRequestId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_paymentRequestRemoteModel != null) {
			try {
				Class<?> clazz = _paymentRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_paymentRequestRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_paymentRequestRemoteModel != null) {
			try {
				Class<?> clazz = _paymentRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_paymentRequestRemoteModel, groupId);
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

		if (_paymentRequestRemoteModel != null) {
			try {
				Class<?> clazz = _paymentRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_paymentRequestRemoteModel, companyId);
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

		if (_paymentRequestRemoteModel != null) {
			try {
				Class<?> clazz = _paymentRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_paymentRequestRemoteModel, createDate);
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

		if (_paymentRequestRemoteModel != null) {
			try {
				Class<?> clazz = _paymentRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_paymentRequestRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getOrganizationId() {
		return _organizationId;
	}

	@Override
	public void setOrganizationId(long organizationId) {
		_organizationId = organizationId;

		if (_paymentRequestRemoteModel != null) {
			try {
				Class<?> clazz = _paymentRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setOrganizationId", long.class);

				method.invoke(_paymentRequestRemoteModel, organizationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDossierId() {
		return _dossierId;
	}

	@Override
	public void setDossierId(long dossierId) {
		_dossierId = dossierId;

		if (_paymentRequestRemoteModel != null) {
			try {
				Class<?> clazz = _paymentRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierId", long.class);

				method.invoke(_paymentRequestRemoteModel, dossierId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGovAgencyId() {
		return _govAgencyId;
	}

	@Override
	public void setGovAgencyId(String govAgencyId) {
		_govAgencyId = govAgencyId;

		if (_paymentRequestRemoteModel != null) {
			try {
				Class<?> clazz = _paymentRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setGovAgencyId", String.class);

				method.invoke(_paymentRequestRemoteModel, govAgencyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGovAgencyName() {
		return _govAgencyName;
	}

	@Override
	public void setGovAgencyName(String govAgencyName) {
		_govAgencyName = govAgencyName;

		if (_paymentRequestRemoteModel != null) {
			try {
				Class<?> clazz = _paymentRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setGovAgencyName", String.class);

				method.invoke(_paymentRequestRemoteModel, govAgencyName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSubjectId() {
		return _subjectId;
	}

	@Override
	public void setSubjectId(String subjectId) {
		_subjectId = subjectId;

		if (_paymentRequestRemoteModel != null) {
			try {
				Class<?> clazz = _paymentRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setSubjectId", String.class);

				method.invoke(_paymentRequestRemoteModel, subjectId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSubjectType() {
		return _subjectType;
	}

	@Override
	public void setSubjectType(String subjectType) {
		_subjectType = subjectType;

		if (_paymentRequestRemoteModel != null) {
			try {
				Class<?> clazz = _paymentRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setSubjectType", String.class);

				method.invoke(_paymentRequestRemoteModel, subjectType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSubjectName() {
		return _subjectName;
	}

	@Override
	public void setSubjectName(String subjectName) {
		_subjectName = subjectName;

		if (_paymentRequestRemoteModel != null) {
			try {
				Class<?> clazz = _paymentRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setSubjectName", String.class);

				method.invoke(_paymentRequestRemoteModel, subjectName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAmount() {
		return _amount;
	}

	@Override
	public void setAmount(long amount) {
		_amount = amount;

		if (_paymentRequestRemoteModel != null) {
			try {
				Class<?> clazz = _paymentRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setAmount", long.class);

				method.invoke(_paymentRequestRemoteModel, amount);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRequestNote() {
		return _requestNote;
	}

	@Override
	public void setRequestNote(String requestNote) {
		_requestNote = requestNote;

		if (_paymentRequestRemoteModel != null) {
			try {
				Class<?> clazz = _paymentRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestNote", String.class);

				method.invoke(_paymentRequestRemoteModel, requestNote);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPaymentFileId() {
		return _paymentFileId;
	}

	@Override
	public void setPaymentFileId(long paymentFileId) {
		_paymentFileId = paymentFileId;

		if (_paymentRequestRemoteModel != null) {
			try {
				Class<?> clazz = _paymentRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setPaymentFileId", long.class);

				method.invoke(_paymentRequestRemoteModel, paymentFileId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getConfirmOK() {
		return _confirmOK;
	}

	@Override
	public void setConfirmOK(int confirmOK) {
		_confirmOK = confirmOK;

		if (_paymentRequestRemoteModel != null) {
			try {
				Class<?> clazz = _paymentRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setConfirmOK", int.class);

				method.invoke(_paymentRequestRemoteModel, confirmOK);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getEbMessageId() {
		return _ebMessageId;
	}

	@Override
	public void setEbMessageId(long ebMessageId) {
		_ebMessageId = ebMessageId;

		if (_paymentRequestRemoteModel != null) {
			try {
				Class<?> clazz = _paymentRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setEbMessageId", long.class);

				method.invoke(_paymentRequestRemoteModel, ebMessageId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				PaymentRequest.class.getName()));
	}

	public BaseModel<?> getPaymentRequestRemoteModel() {
		return _paymentRequestRemoteModel;
	}

	public void setPaymentRequestRemoteModel(
		BaseModel<?> paymentRequestRemoteModel) {
		_paymentRequestRemoteModel = paymentRequestRemoteModel;
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

		Class<?> remoteModelClass = _paymentRequestRemoteModel.getClass();

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

		Object returnValue = method.invoke(_paymentRequestRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PaymentRequestLocalServiceUtil.addPaymentRequest(this);
		}
		else {
			PaymentRequestLocalServiceUtil.updatePaymentRequest(this);
		}
	}

	@Override
	public PaymentRequest toEscapedModel() {
		return (PaymentRequest)ProxyUtil.newProxyInstance(PaymentRequest.class.getClassLoader(),
			new Class[] { PaymentRequest.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PaymentRequestClp clone = new PaymentRequestClp();

		clone.setUuid(getUuid());
		clone.setPaymentRequestId(getPaymentRequestId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setOrganizationId(getOrganizationId());
		clone.setDossierId(getDossierId());
		clone.setGovAgencyId(getGovAgencyId());
		clone.setGovAgencyName(getGovAgencyName());
		clone.setSubjectId(getSubjectId());
		clone.setSubjectType(getSubjectType());
		clone.setSubjectName(getSubjectName());
		clone.setAmount(getAmount());
		clone.setRequestNote(getRequestNote());
		clone.setPaymentFileId(getPaymentFileId());
		clone.setConfirmOK(getConfirmOK());
		clone.setEbMessageId(getEbMessageId());

		return clone;
	}

	@Override
	public int compareTo(PaymentRequest paymentRequest) {
		long primaryKey = paymentRequest.getPrimaryKey();

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

		if (!(obj instanceof PaymentRequestClp)) {
			return false;
		}

		PaymentRequestClp paymentRequest = (PaymentRequestClp)obj;

		long primaryKey = paymentRequest.getPrimaryKey();

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
		StringBundler sb = new StringBundler(39);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", paymentRequestId=");
		sb.append(getPaymentRequestId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", organizationId=");
		sb.append(getOrganizationId());
		sb.append(", dossierId=");
		sb.append(getDossierId());
		sb.append(", govAgencyId=");
		sb.append(getGovAgencyId());
		sb.append(", govAgencyName=");
		sb.append(getGovAgencyName());
		sb.append(", subjectId=");
		sb.append(getSubjectId());
		sb.append(", subjectType=");
		sb.append(getSubjectType());
		sb.append(", subjectName=");
		sb.append(getSubjectName());
		sb.append(", amount=");
		sb.append(getAmount());
		sb.append(", requestNote=");
		sb.append(getRequestNote());
		sb.append(", paymentFileId=");
		sb.append(getPaymentFileId());
		sb.append(", confirmOK=");
		sb.append(getConfirmOK());
		sb.append(", ebMessageId=");
		sb.append(getEbMessageId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(61);

		sb.append("<model><model-name>");
		sb.append("org.oep.dossiermgt.model.PaymentRequest");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>paymentRequestId</column-name><column-value><![CDATA[");
		sb.append(getPaymentRequestId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
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
			"<column><column-name>organizationId</column-name><column-value><![CDATA[");
		sb.append(getOrganizationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierId</column-name><column-value><![CDATA[");
		sb.append(getDossierId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>govAgencyId</column-name><column-value><![CDATA[");
		sb.append(getGovAgencyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>govAgencyName</column-name><column-value><![CDATA[");
		sb.append(getGovAgencyName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subjectId</column-name><column-value><![CDATA[");
		sb.append(getSubjectId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subjectType</column-name><column-value><![CDATA[");
		sb.append(getSubjectType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subjectName</column-name><column-value><![CDATA[");
		sb.append(getSubjectName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>amount</column-name><column-value><![CDATA[");
		sb.append(getAmount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestNote</column-name><column-value><![CDATA[");
		sb.append(getRequestNote());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>paymentFileId</column-name><column-value><![CDATA[");
		sb.append(getPaymentFileId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>confirmOK</column-name><column-value><![CDATA[");
		sb.append(getConfirmOK());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ebMessageId</column-name><column-value><![CDATA[");
		sb.append(getEbMessageId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _paymentRequestId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _organizationId;
	private long _dossierId;
	private String _govAgencyId;
	private String _govAgencyName;
	private String _subjectId;
	private String _subjectType;
	private String _subjectName;
	private long _amount;
	private String _requestNote;
	private long _paymentFileId;
	private int _confirmOK;
	private long _ebMessageId;
	private BaseModel<?> _paymentRequestRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.dossiermgt.service.ClpSerializer.class;
}