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
import com.liferay.portal.util.PortalUtil;

import org.oep.core.processmgt.service.ClpSerializer;
import org.oep.core.processmgt.service.ProcessOrder2UserLocalServiceUtil;
import org.oep.core.processmgt.service.persistence.ProcessOrder2UserPK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class ProcessOrder2UserClp extends BaseModelImpl<ProcessOrder2User>
	implements ProcessOrder2User {
	public ProcessOrder2UserClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ProcessOrder2User.class;
	}

	@Override
	public String getModelClassName() {
		return ProcessOrder2User.class.getName();
	}

	@Override
	public ProcessOrder2UserPK getPrimaryKey() {
		return new ProcessOrder2UserPK(_processOrderId, _userId);
	}

	@Override
	public void setPrimaryKey(ProcessOrder2UserPK primaryKey) {
		setProcessOrderId(primaryKey.processOrderId);
		setUserId(primaryKey.userId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new ProcessOrder2UserPK(_processOrderId, _userId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((ProcessOrder2UserPK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("processOrderId", getProcessOrderId());
		attributes.put("userId", getUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long processOrderId = (Long)attributes.get("processOrderId");

		if (processOrderId != null) {
			setProcessOrderId(processOrderId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}
	}

	@Override
	public long getProcessOrderId() {
		return _processOrderId;
	}

	@Override
	public void setProcessOrderId(long processOrderId) {
		_processOrderId = processOrderId;

		if (_processOrder2UserRemoteModel != null) {
			try {
				Class<?> clazz = _processOrder2UserRemoteModel.getClass();

				Method method = clazz.getMethod("setProcessOrderId", long.class);

				method.invoke(_processOrder2UserRemoteModel, processOrderId);
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

		if (_processOrder2UserRemoteModel != null) {
			try {
				Class<?> clazz = _processOrder2UserRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_processOrder2UserRemoteModel, userId);
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

	public BaseModel<?> getProcessOrder2UserRemoteModel() {
		return _processOrder2UserRemoteModel;
	}

	public void setProcessOrder2UserRemoteModel(
		BaseModel<?> processOrder2UserRemoteModel) {
		_processOrder2UserRemoteModel = processOrder2UserRemoteModel;
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

		Class<?> remoteModelClass = _processOrder2UserRemoteModel.getClass();

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

		Object returnValue = method.invoke(_processOrder2UserRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ProcessOrder2UserLocalServiceUtil.addProcessOrder2User(this);
		}
		else {
			ProcessOrder2UserLocalServiceUtil.updateProcessOrder2User(this);
		}
	}

	@Override
	public ProcessOrder2User toEscapedModel() {
		return (ProcessOrder2User)ProxyUtil.newProxyInstance(ProcessOrder2User.class.getClassLoader(),
			new Class[] { ProcessOrder2User.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ProcessOrder2UserClp clone = new ProcessOrder2UserClp();

		clone.setProcessOrderId(getProcessOrderId());
		clone.setUserId(getUserId());

		return clone;
	}

	@Override
	public int compareTo(ProcessOrder2User processOrder2User) {
		ProcessOrder2UserPK primaryKey = processOrder2User.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProcessOrder2UserClp)) {
			return false;
		}

		ProcessOrder2UserClp processOrder2User = (ProcessOrder2UserClp)obj;

		ProcessOrder2UserPK primaryKey = processOrder2User.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
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
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{processOrderId=");
		sb.append(getProcessOrderId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.processmgt.model.ProcessOrder2User");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>processOrderId</column-name><column-value><![CDATA[");
		sb.append(getProcessOrderId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _processOrderId;
	private long _userId;
	private String _userUuid;
	private BaseModel<?> _processOrder2UserRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.processmgt.service.ClpSerializer.class;
}