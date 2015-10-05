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

package org.oep.core.datamgt.parameter.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import org.oep.core.datamgt.parameter.service.ClpSerializer;
import org.oep.core.datamgt.parameter.service.DefaultParameterLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author TrungDK
 */
public class DefaultParameterClp extends BaseModelImpl<DefaultParameter>
	implements DefaultParameter {
	public DefaultParameterClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DefaultParameter.class;
	}

	@Override
	public String getModelClassName() {
		return DefaultParameter.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _defaultParameterId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDefaultParameterId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _defaultParameterId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("defaultParameterId", getDefaultParameterId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("applicationName", getApplicationName());
		attributes.put("parameterName", getParameterName());
		attributes.put("title", getTitle());
		attributes.put("parameterValue", getParameterValue());
		attributes.put("changeable", getChangeable());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long defaultParameterId = (Long)attributes.get("defaultParameterId");

		if (defaultParameterId != null) {
			setDefaultParameterId(defaultParameterId);
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

		String applicationName = (String)attributes.get("applicationName");

		if (applicationName != null) {
			setApplicationName(applicationName);
		}

		String parameterName = (String)attributes.get("parameterName");

		if (parameterName != null) {
			setParameterName(parameterName);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String parameterValue = (String)attributes.get("parameterValue");

		if (parameterValue != null) {
			setParameterValue(parameterValue);
		}

		Integer changeable = (Integer)attributes.get("changeable");

		if (changeable != null) {
			setChangeable(changeable);
		}
	}

	@Override
	public long getDefaultParameterId() {
		return _defaultParameterId;
	}

	@Override
	public void setDefaultParameterId(long defaultParameterId) {
		_defaultParameterId = defaultParameterId;

		if (_defaultParameterRemoteModel != null) {
			try {
				Class<?> clazz = _defaultParameterRemoteModel.getClass();

				Method method = clazz.getMethod("setDefaultParameterId",
						long.class);

				method.invoke(_defaultParameterRemoteModel, defaultParameterId);
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

		if (_defaultParameterRemoteModel != null) {
			try {
				Class<?> clazz = _defaultParameterRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_defaultParameterRemoteModel, companyId);
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

		if (_defaultParameterRemoteModel != null) {
			try {
				Class<?> clazz = _defaultParameterRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_defaultParameterRemoteModel, createDate);
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

		if (_defaultParameterRemoteModel != null) {
			try {
				Class<?> clazz = _defaultParameterRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_defaultParameterRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getApplicationName() {
		return _applicationName;
	}

	@Override
	public void setApplicationName(String applicationName) {
		_applicationName = applicationName;

		if (_defaultParameterRemoteModel != null) {
			try {
				Class<?> clazz = _defaultParameterRemoteModel.getClass();

				Method method = clazz.getMethod("setApplicationName",
						String.class);

				method.invoke(_defaultParameterRemoteModel, applicationName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getParameterName() {
		return _parameterName;
	}

	@Override
	public void setParameterName(String parameterName) {
		_parameterName = parameterName;

		if (_defaultParameterRemoteModel != null) {
			try {
				Class<?> clazz = _defaultParameterRemoteModel.getClass();

				Method method = clazz.getMethod("setParameterName", String.class);

				method.invoke(_defaultParameterRemoteModel, parameterName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTitle() {
		return _title;
	}

	@Override
	public void setTitle(String title) {
		_title = title;

		if (_defaultParameterRemoteModel != null) {
			try {
				Class<?> clazz = _defaultParameterRemoteModel.getClass();

				Method method = clazz.getMethod("setTitle", String.class);

				method.invoke(_defaultParameterRemoteModel, title);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getParameterValue() {
		return _parameterValue;
	}

	@Override
	public void setParameterValue(String parameterValue) {
		_parameterValue = parameterValue;

		if (_defaultParameterRemoteModel != null) {
			try {
				Class<?> clazz = _defaultParameterRemoteModel.getClass();

				Method method = clazz.getMethod("setParameterValue",
						String.class);

				method.invoke(_defaultParameterRemoteModel, parameterValue);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getChangeable() {
		return _changeable;
	}

	@Override
	public void setChangeable(int changeable) {
		_changeable = changeable;

		if (_defaultParameterRemoteModel != null) {
			try {
				Class<?> clazz = _defaultParameterRemoteModel.getClass();

				Method method = clazz.getMethod("setChangeable", int.class);

				method.invoke(_defaultParameterRemoteModel, changeable);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDefaultParameterRemoteModel() {
		return _defaultParameterRemoteModel;
	}

	public void setDefaultParameterRemoteModel(
		BaseModel<?> defaultParameterRemoteModel) {
		_defaultParameterRemoteModel = defaultParameterRemoteModel;
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

		Class<?> remoteModelClass = _defaultParameterRemoteModel.getClass();

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

		Object returnValue = method.invoke(_defaultParameterRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DefaultParameterLocalServiceUtil.addDefaultParameter(this);
		}
		else {
			DefaultParameterLocalServiceUtil.updateDefaultParameter(this);
		}
	}

	@Override
	public DefaultParameter toEscapedModel() {
		return (DefaultParameter)ProxyUtil.newProxyInstance(DefaultParameter.class.getClassLoader(),
			new Class[] { DefaultParameter.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DefaultParameterClp clone = new DefaultParameterClp();

		clone.setDefaultParameterId(getDefaultParameterId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setApplicationName(getApplicationName());
		clone.setParameterName(getParameterName());
		clone.setTitle(getTitle());
		clone.setParameterValue(getParameterValue());
		clone.setChangeable(getChangeable());

		return clone;
	}

	@Override
	public int compareTo(DefaultParameter defaultParameter) {
		long primaryKey = defaultParameter.getPrimaryKey();

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

		if (!(obj instanceof DefaultParameterClp)) {
			return false;
		}

		DefaultParameterClp defaultParameter = (DefaultParameterClp)obj;

		long primaryKey = defaultParameter.getPrimaryKey();

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
		StringBundler sb = new StringBundler(19);

		sb.append("{defaultParameterId=");
		sb.append(getDefaultParameterId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", applicationName=");
		sb.append(getApplicationName());
		sb.append(", parameterName=");
		sb.append(getParameterName());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", parameterValue=");
		sb.append(getParameterValue());
		sb.append(", changeable=");
		sb.append(getChangeable());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.datamgt.parameter.model.DefaultParameter");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>defaultParameterId</column-name><column-value><![CDATA[");
		sb.append(getDefaultParameterId());
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
			"<column><column-name>applicationName</column-name><column-value><![CDATA[");
		sb.append(getApplicationName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parameterName</column-name><column-value><![CDATA[");
		sb.append(getParameterName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parameterValue</column-name><column-value><![CDATA[");
		sb.append(getParameterValue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>changeable</column-name><column-value><![CDATA[");
		sb.append(getChangeable());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _defaultParameterId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _applicationName;
	private String _parameterName;
	private String _title;
	private String _parameterValue;
	private int _changeable;
	private BaseModel<?> _defaultParameterRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.datamgt.parameter.service.ClpSerializer.class;
}