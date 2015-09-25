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
import com.liferay.portal.util.PortalUtil;

import org.oep.core.datamgt.parameter.service.ClpSerializer;
import org.oep.core.datamgt.parameter.service.UserParameterLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author TrungDK
 */
public class UserParameterClp extends BaseModelImpl<UserParameter>
	implements UserParameter {
	public UserParameterClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return UserParameter.class;
	}

	@Override
	public String getModelClassName() {
		return UserParameter.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _userParameterId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setUserParameterId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _userParameterId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userParameterId", getUserParameterId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("applicationName", getApplicationName());
		attributes.put("parameterName", getParameterName());
		attributes.put("title", getTitle());
		attributes.put("parameterValue", getParameterValue());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long userParameterId = (Long)attributes.get("userParameterId");

		if (userParameterId != null) {
			setUserParameterId(userParameterId);
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
	}

	@Override
	public long getUserParameterId() {
		return _userParameterId;
	}

	@Override
	public void setUserParameterId(long userParameterId) {
		_userParameterId = userParameterId;

		if (_userParameterRemoteModel != null) {
			try {
				Class<?> clazz = _userParameterRemoteModel.getClass();

				Method method = clazz.getMethod("setUserParameterId", long.class);

				method.invoke(_userParameterRemoteModel, userParameterId);
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

		if (_userParameterRemoteModel != null) {
			try {
				Class<?> clazz = _userParameterRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_userParameterRemoteModel, userId);
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

		if (_userParameterRemoteModel != null) {
			try {
				Class<?> clazz = _userParameterRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_userParameterRemoteModel, groupId);
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

		if (_userParameterRemoteModel != null) {
			try {
				Class<?> clazz = _userParameterRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_userParameterRemoteModel, companyId);
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

		if (_userParameterRemoteModel != null) {
			try {
				Class<?> clazz = _userParameterRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_userParameterRemoteModel, createDate);
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

		if (_userParameterRemoteModel != null) {
			try {
				Class<?> clazz = _userParameterRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_userParameterRemoteModel, modifiedDate);
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

		if (_userParameterRemoteModel != null) {
			try {
				Class<?> clazz = _userParameterRemoteModel.getClass();

				Method method = clazz.getMethod("setApplicationName",
						String.class);

				method.invoke(_userParameterRemoteModel, applicationName);
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

		if (_userParameterRemoteModel != null) {
			try {
				Class<?> clazz = _userParameterRemoteModel.getClass();

				Method method = clazz.getMethod("setParameterName", String.class);

				method.invoke(_userParameterRemoteModel, parameterName);
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

		if (_userParameterRemoteModel != null) {
			try {
				Class<?> clazz = _userParameterRemoteModel.getClass();

				Method method = clazz.getMethod("setTitle", String.class);

				method.invoke(_userParameterRemoteModel, title);
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

		if (_userParameterRemoteModel != null) {
			try {
				Class<?> clazz = _userParameterRemoteModel.getClass();

				Method method = clazz.getMethod("setParameterValue",
						String.class);

				method.invoke(_userParameterRemoteModel, parameterValue);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getUserParameterRemoteModel() {
		return _userParameterRemoteModel;
	}

	public void setUserParameterRemoteModel(
		BaseModel<?> userParameterRemoteModel) {
		_userParameterRemoteModel = userParameterRemoteModel;
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

		Class<?> remoteModelClass = _userParameterRemoteModel.getClass();

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

		Object returnValue = method.invoke(_userParameterRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			UserParameterLocalServiceUtil.addUserParameter(this);
		}
		else {
			UserParameterLocalServiceUtil.updateUserParameter(this);
		}
	}

	@Override
	public UserParameter toEscapedModel() {
		return (UserParameter)ProxyUtil.newProxyInstance(UserParameter.class.getClassLoader(),
			new Class[] { UserParameter.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		UserParameterClp clone = new UserParameterClp();

		clone.setUserParameterId(getUserParameterId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setApplicationName(getApplicationName());
		clone.setParameterName(getParameterName());
		clone.setTitle(getTitle());
		clone.setParameterValue(getParameterValue());

		return clone;
	}

	@Override
	public int compareTo(UserParameter userParameter) {
		long primaryKey = userParameter.getPrimaryKey();

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

		if (!(obj instanceof UserParameterClp)) {
			return false;
		}

		UserParameterClp userParameter = (UserParameterClp)obj;

		long primaryKey = userParameter.getPrimaryKey();

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

		sb.append("{userParameterId=");
		sb.append(getUserParameterId());
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
		sb.append(", applicationName=");
		sb.append(getApplicationName());
		sb.append(", parameterName=");
		sb.append(getParameterName());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", parameterValue=");
		sb.append(getParameterValue());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.datamgt.parameter.model.UserParameter");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>userParameterId</column-name><column-value><![CDATA[");
		sb.append(getUserParameterId());
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

		sb.append("</model>");

		return sb.toString();
	}

	private long _userParameterId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _applicationName;
	private String _parameterName;
	private String _title;
	private String _parameterValue;
	private BaseModel<?> _userParameterRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.datamgt.parameter.service.ClpSerializer.class;
}