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

package org.oep.core.processmgt.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import org.oep.core.processmgt.service.ClpSerializer;
import org.oep.core.processmgt.service.DocFile2ProcessOrderLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class DocFile2ProcessOrderClp extends BaseModelImpl<DocFile2ProcessOrder>
	implements DocFile2ProcessOrder {
	public DocFile2ProcessOrderClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DocFile2ProcessOrder.class;
	}

	@Override
	public String getModelClassName() {
		return DocFile2ProcessOrder.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _docFileId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDocFileId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _docFileId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("docFileId", getDocFileId());
		attributes.put("processOrderId", getProcessOrderId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long docFileId = (Long)attributes.get("docFileId");

		if (docFileId != null) {
			setDocFileId(docFileId);
		}

		Long processOrderId = (Long)attributes.get("processOrderId");

		if (processOrderId != null) {
			setProcessOrderId(processOrderId);
		}
	}

	@Override
	public long getDocFileId() {
		return _docFileId;
	}

	@Override
	public void setDocFileId(long docFileId) {
		_docFileId = docFileId;

		if (_docFile2ProcessOrderRemoteModel != null) {
			try {
				Class<?> clazz = _docFile2ProcessOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setDocFileId", long.class);

				method.invoke(_docFile2ProcessOrderRemoteModel, docFileId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getProcessOrderId() {
		return _processOrderId;
	}

	@Override
	public void setProcessOrderId(long processOrderId) {
		_processOrderId = processOrderId;

		if (_docFile2ProcessOrderRemoteModel != null) {
			try {
				Class<?> clazz = _docFile2ProcessOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setProcessOrderId", long.class);

				method.invoke(_docFile2ProcessOrderRemoteModel, processOrderId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDocFile2ProcessOrderRemoteModel() {
		return _docFile2ProcessOrderRemoteModel;
	}

	public void setDocFile2ProcessOrderRemoteModel(
		BaseModel<?> docFile2ProcessOrderRemoteModel) {
		_docFile2ProcessOrderRemoteModel = docFile2ProcessOrderRemoteModel;
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

		Class<?> remoteModelClass = _docFile2ProcessOrderRemoteModel.getClass();

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

		Object returnValue = method.invoke(_docFile2ProcessOrderRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DocFile2ProcessOrderLocalServiceUtil.addDocFile2ProcessOrder(this);
		}
		else {
			DocFile2ProcessOrderLocalServiceUtil.updateDocFile2ProcessOrder(this);
		}
	}

	@Override
	public DocFile2ProcessOrder toEscapedModel() {
		return (DocFile2ProcessOrder)ProxyUtil.newProxyInstance(DocFile2ProcessOrder.class.getClassLoader(),
			new Class[] { DocFile2ProcessOrder.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DocFile2ProcessOrderClp clone = new DocFile2ProcessOrderClp();

		clone.setDocFileId(getDocFileId());
		clone.setProcessOrderId(getProcessOrderId());

		return clone;
	}

	@Override
	public int compareTo(DocFile2ProcessOrder docFile2ProcessOrder) {
		long primaryKey = docFile2ProcessOrder.getPrimaryKey();

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

		if (!(obj instanceof DocFile2ProcessOrderClp)) {
			return false;
		}

		DocFile2ProcessOrderClp docFile2ProcessOrder = (DocFile2ProcessOrderClp)obj;

		long primaryKey = docFile2ProcessOrder.getPrimaryKey();

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
		StringBundler sb = new StringBundler(5);

		sb.append("{docFileId=");
		sb.append(getDocFileId());
		sb.append(", processOrderId=");
		sb.append(getProcessOrderId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.processmgt.model.DocFile2ProcessOrder");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>docFileId</column-name><column-value><![CDATA[");
		sb.append(getDocFileId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>processOrderId</column-name><column-value><![CDATA[");
		sb.append(getProcessOrderId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _docFileId;
	private long _processOrderId;
	private BaseModel<?> _docFile2ProcessOrderRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.processmgt.service.ClpSerializer.class;
}