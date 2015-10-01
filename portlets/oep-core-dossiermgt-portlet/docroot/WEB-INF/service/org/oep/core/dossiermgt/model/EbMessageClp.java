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
import org.oep.core.dossiermgt.service.EbMessageLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class EbMessageClp extends BaseModelImpl<EbMessage> implements EbMessage {
	public EbMessageClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return EbMessage.class;
	}

	@Override
	public String getModelClassName() {
		return EbMessage.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _ebMessageId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEbMessageId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ebMessageId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ebMessageId", getEbMessageId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("messageId", getMessageId());
		attributes.put("cpaId", getCpaId());
		attributes.put("service", getService());
		attributes.put("action", getAction());
		attributes.put("conversationId", getConversationId());
		attributes.put("fromPartyId", getFromPartyId());
		attributes.put("fromPartyType", getFromPartyType());
		attributes.put("toPartyId", getToPartyId());
		attributes.put("toPartyType", getToPartyType());
		attributes.put("refToMessageId", getRefToMessageId());
		attributes.put("status", getStatus());
		attributes.put("statusDescription", getStatusDescription());
		attributes.put("ackMessageId", getAckMessageId());
		attributes.put("ackStatus", getAckStatus());
		attributes.put("ackStatusDescription", getAckStatusDescription());
		attributes.put("messageDescription", getMessageDescription());
		attributes.put("inbound", getInbound());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ebMessageId = (Long)attributes.get("ebMessageId");

		if (ebMessageId != null) {
			setEbMessageId(ebMessageId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		String messageId = (String)attributes.get("messageId");

		if (messageId != null) {
			setMessageId(messageId);
		}

		String cpaId = (String)attributes.get("cpaId");

		if (cpaId != null) {
			setCpaId(cpaId);
		}

		String service = (String)attributes.get("service");

		if (service != null) {
			setService(service);
		}

		String action = (String)attributes.get("action");

		if (action != null) {
			setAction(action);
		}

		String conversationId = (String)attributes.get("conversationId");

		if (conversationId != null) {
			setConversationId(conversationId);
		}

		String fromPartyId = (String)attributes.get("fromPartyId");

		if (fromPartyId != null) {
			setFromPartyId(fromPartyId);
		}

		String fromPartyType = (String)attributes.get("fromPartyType");

		if (fromPartyType != null) {
			setFromPartyType(fromPartyType);
		}

		String toPartyId = (String)attributes.get("toPartyId");

		if (toPartyId != null) {
			setToPartyId(toPartyId);
		}

		String toPartyType = (String)attributes.get("toPartyType");

		if (toPartyType != null) {
			setToPartyType(toPartyType);
		}

		String refToMessageId = (String)attributes.get("refToMessageId");

		if (refToMessageId != null) {
			setRefToMessageId(refToMessageId);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String statusDescription = (String)attributes.get("statusDescription");

		if (statusDescription != null) {
			setStatusDescription(statusDescription);
		}

		String ackMessageId = (String)attributes.get("ackMessageId");

		if (ackMessageId != null) {
			setAckMessageId(ackMessageId);
		}

		String ackStatus = (String)attributes.get("ackStatus");

		if (ackStatus != null) {
			setAckStatus(ackStatus);
		}

		String ackStatusDescription = (String)attributes.get(
				"ackStatusDescription");

		if (ackStatusDescription != null) {
			setAckStatusDescription(ackStatusDescription);
		}

		String messageDescription = (String)attributes.get("messageDescription");

		if (messageDescription != null) {
			setMessageDescription(messageDescription);
		}

		Integer inbound = (Integer)attributes.get("inbound");

		if (inbound != null) {
			setInbound(inbound);
		}
	}

	@Override
	public long getEbMessageId() {
		return _ebMessageId;
	}

	@Override
	public void setEbMessageId(long ebMessageId) {
		_ebMessageId = ebMessageId;

		if (_ebMessageRemoteModel != null) {
			try {
				Class<?> clazz = _ebMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setEbMessageId", long.class);

				method.invoke(_ebMessageRemoteModel, ebMessageId);
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

		if (_ebMessageRemoteModel != null) {
			try {
				Class<?> clazz = _ebMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_ebMessageRemoteModel, companyId);
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

		if (_ebMessageRemoteModel != null) {
			try {
				Class<?> clazz = _ebMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_ebMessageRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMessageId() {
		return _messageId;
	}

	@Override
	public void setMessageId(String messageId) {
		_messageId = messageId;

		if (_ebMessageRemoteModel != null) {
			try {
				Class<?> clazz = _ebMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setMessageId", String.class);

				method.invoke(_ebMessageRemoteModel, messageId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCpaId() {
		return _cpaId;
	}

	@Override
	public void setCpaId(String cpaId) {
		_cpaId = cpaId;

		if (_ebMessageRemoteModel != null) {
			try {
				Class<?> clazz = _ebMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setCpaId", String.class);

				method.invoke(_ebMessageRemoteModel, cpaId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getService() {
		return _service;
	}

	@Override
	public void setService(String service) {
		_service = service;

		if (_ebMessageRemoteModel != null) {
			try {
				Class<?> clazz = _ebMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setService", String.class);

				method.invoke(_ebMessageRemoteModel, service);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAction() {
		return _action;
	}

	@Override
	public void setAction(String action) {
		_action = action;

		if (_ebMessageRemoteModel != null) {
			try {
				Class<?> clazz = _ebMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setAction", String.class);

				method.invoke(_ebMessageRemoteModel, action);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getConversationId() {
		return _conversationId;
	}

	@Override
	public void setConversationId(String conversationId) {
		_conversationId = conversationId;

		if (_ebMessageRemoteModel != null) {
			try {
				Class<?> clazz = _ebMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setConversationId",
						String.class);

				method.invoke(_ebMessageRemoteModel, conversationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFromPartyId() {
		return _fromPartyId;
	}

	@Override
	public void setFromPartyId(String fromPartyId) {
		_fromPartyId = fromPartyId;

		if (_ebMessageRemoteModel != null) {
			try {
				Class<?> clazz = _ebMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setFromPartyId", String.class);

				method.invoke(_ebMessageRemoteModel, fromPartyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFromPartyType() {
		return _fromPartyType;
	}

	@Override
	public void setFromPartyType(String fromPartyType) {
		_fromPartyType = fromPartyType;

		if (_ebMessageRemoteModel != null) {
			try {
				Class<?> clazz = _ebMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setFromPartyType", String.class);

				method.invoke(_ebMessageRemoteModel, fromPartyType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getToPartyId() {
		return _toPartyId;
	}

	@Override
	public void setToPartyId(String toPartyId) {
		_toPartyId = toPartyId;

		if (_ebMessageRemoteModel != null) {
			try {
				Class<?> clazz = _ebMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setToPartyId", String.class);

				method.invoke(_ebMessageRemoteModel, toPartyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getToPartyType() {
		return _toPartyType;
	}

	@Override
	public void setToPartyType(String toPartyType) {
		_toPartyType = toPartyType;

		if (_ebMessageRemoteModel != null) {
			try {
				Class<?> clazz = _ebMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setToPartyType", String.class);

				method.invoke(_ebMessageRemoteModel, toPartyType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRefToMessageId() {
		return _refToMessageId;
	}

	@Override
	public void setRefToMessageId(String refToMessageId) {
		_refToMessageId = refToMessageId;

		if (_ebMessageRemoteModel != null) {
			try {
				Class<?> clazz = _ebMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setRefToMessageId",
						String.class);

				method.invoke(_ebMessageRemoteModel, refToMessageId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatus() {
		return _status;
	}

	@Override
	public void setStatus(String status) {
		_status = status;

		if (_ebMessageRemoteModel != null) {
			try {
				Class<?> clazz = _ebMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", String.class);

				method.invoke(_ebMessageRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatusDescription() {
		return _statusDescription;
	}

	@Override
	public void setStatusDescription(String statusDescription) {
		_statusDescription = statusDescription;

		if (_ebMessageRemoteModel != null) {
			try {
				Class<?> clazz = _ebMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setStatusDescription",
						String.class);

				method.invoke(_ebMessageRemoteModel, statusDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAckMessageId() {
		return _ackMessageId;
	}

	@Override
	public void setAckMessageId(String ackMessageId) {
		_ackMessageId = ackMessageId;

		if (_ebMessageRemoteModel != null) {
			try {
				Class<?> clazz = _ebMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setAckMessageId", String.class);

				method.invoke(_ebMessageRemoteModel, ackMessageId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAckStatus() {
		return _ackStatus;
	}

	@Override
	public void setAckStatus(String ackStatus) {
		_ackStatus = ackStatus;

		if (_ebMessageRemoteModel != null) {
			try {
				Class<?> clazz = _ebMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setAckStatus", String.class);

				method.invoke(_ebMessageRemoteModel, ackStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAckStatusDescription() {
		return _ackStatusDescription;
	}

	@Override
	public void setAckStatusDescription(String ackStatusDescription) {
		_ackStatusDescription = ackStatusDescription;

		if (_ebMessageRemoteModel != null) {
			try {
				Class<?> clazz = _ebMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setAckStatusDescription",
						String.class);

				method.invoke(_ebMessageRemoteModel, ackStatusDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMessageDescription() {
		return _messageDescription;
	}

	@Override
	public void setMessageDescription(String messageDescription) {
		_messageDescription = messageDescription;

		if (_ebMessageRemoteModel != null) {
			try {
				Class<?> clazz = _ebMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setMessageDescription",
						String.class);

				method.invoke(_ebMessageRemoteModel, messageDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getInbound() {
		return _inbound;
	}

	@Override
	public void setInbound(int inbound) {
		_inbound = inbound;

		if (_ebMessageRemoteModel != null) {
			try {
				Class<?> clazz = _ebMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setInbound", int.class);

				method.invoke(_ebMessageRemoteModel, inbound);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getEbMessageRemoteModel() {
		return _ebMessageRemoteModel;
	}

	public void setEbMessageRemoteModel(BaseModel<?> ebMessageRemoteModel) {
		_ebMessageRemoteModel = ebMessageRemoteModel;
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

		Class<?> remoteModelClass = _ebMessageRemoteModel.getClass();

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

		Object returnValue = method.invoke(_ebMessageRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EbMessageLocalServiceUtil.addEbMessage(this);
		}
		else {
			EbMessageLocalServiceUtil.updateEbMessage(this);
		}
	}

	@Override
	public EbMessage toEscapedModel() {
		return (EbMessage)ProxyUtil.newProxyInstance(EbMessage.class.getClassLoader(),
			new Class[] { EbMessage.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EbMessageClp clone = new EbMessageClp();

		clone.setEbMessageId(getEbMessageId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setMessageId(getMessageId());
		clone.setCpaId(getCpaId());
		clone.setService(getService());
		clone.setAction(getAction());
		clone.setConversationId(getConversationId());
		clone.setFromPartyId(getFromPartyId());
		clone.setFromPartyType(getFromPartyType());
		clone.setToPartyId(getToPartyId());
		clone.setToPartyType(getToPartyType());
		clone.setRefToMessageId(getRefToMessageId());
		clone.setStatus(getStatus());
		clone.setStatusDescription(getStatusDescription());
		clone.setAckMessageId(getAckMessageId());
		clone.setAckStatus(getAckStatus());
		clone.setAckStatusDescription(getAckStatusDescription());
		clone.setMessageDescription(getMessageDescription());
		clone.setInbound(getInbound());

		return clone;
	}

	@Override
	public int compareTo(EbMessage ebMessage) {
		long primaryKey = ebMessage.getPrimaryKey();

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

		if (!(obj instanceof EbMessageClp)) {
			return false;
		}

		EbMessageClp ebMessage = (EbMessageClp)obj;

		long primaryKey = ebMessage.getPrimaryKey();

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
		StringBundler sb = new StringBundler(41);

		sb.append("{ebMessageId=");
		sb.append(getEbMessageId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", messageId=");
		sb.append(getMessageId());
		sb.append(", cpaId=");
		sb.append(getCpaId());
		sb.append(", service=");
		sb.append(getService());
		sb.append(", action=");
		sb.append(getAction());
		sb.append(", conversationId=");
		sb.append(getConversationId());
		sb.append(", fromPartyId=");
		sb.append(getFromPartyId());
		sb.append(", fromPartyType=");
		sb.append(getFromPartyType());
		sb.append(", toPartyId=");
		sb.append(getToPartyId());
		sb.append(", toPartyType=");
		sb.append(getToPartyType());
		sb.append(", refToMessageId=");
		sb.append(getRefToMessageId());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", statusDescription=");
		sb.append(getStatusDescription());
		sb.append(", ackMessageId=");
		sb.append(getAckMessageId());
		sb.append(", ackStatus=");
		sb.append(getAckStatus());
		sb.append(", ackStatusDescription=");
		sb.append(getAckStatusDescription());
		sb.append(", messageDescription=");
		sb.append(getMessageDescription());
		sb.append(", inbound=");
		sb.append(getInbound());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(64);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.dossiermgt.model.EbMessage");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ebMessageId</column-name><column-value><![CDATA[");
		sb.append(getEbMessageId());
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
			"<column><column-name>messageId</column-name><column-value><![CDATA[");
		sb.append(getMessageId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cpaId</column-name><column-value><![CDATA[");
		sb.append(getCpaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>service</column-name><column-value><![CDATA[");
		sb.append(getService());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>action</column-name><column-value><![CDATA[");
		sb.append(getAction());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>conversationId</column-name><column-value><![CDATA[");
		sb.append(getConversationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fromPartyId</column-name><column-value><![CDATA[");
		sb.append(getFromPartyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fromPartyType</column-name><column-value><![CDATA[");
		sb.append(getFromPartyType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toPartyId</column-name><column-value><![CDATA[");
		sb.append(getToPartyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toPartyType</column-name><column-value><![CDATA[");
		sb.append(getToPartyType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>refToMessageId</column-name><column-value><![CDATA[");
		sb.append(getRefToMessageId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusDescription</column-name><column-value><![CDATA[");
		sb.append(getStatusDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ackMessageId</column-name><column-value><![CDATA[");
		sb.append(getAckMessageId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ackStatus</column-name><column-value><![CDATA[");
		sb.append(getAckStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ackStatusDescription</column-name><column-value><![CDATA[");
		sb.append(getAckStatusDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>messageDescription</column-name><column-value><![CDATA[");
		sb.append(getMessageDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inbound</column-name><column-value><![CDATA[");
		sb.append(getInbound());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _ebMessageId;
	private long _companyId;
	private Date _createDate;
	private String _messageId;
	private String _cpaId;
	private String _service;
	private String _action;
	private String _conversationId;
	private String _fromPartyId;
	private String _fromPartyType;
	private String _toPartyId;
	private String _toPartyType;
	private String _refToMessageId;
	private String _status;
	private String _statusDescription;
	private String _ackMessageId;
	private String _ackStatus;
	private String _ackStatusDescription;
	private String _messageDescription;
	private int _inbound;
	private BaseModel<?> _ebMessageRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.dossiermgt.service.ClpSerializer.class;
}