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

package org.oep.core.ssomgt.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import org.oep.core.ssomgt.service.AppRole2EmployeeLocalServiceUtil;
import org.oep.core.ssomgt.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class AppRole2EmployeeClp extends BaseModelImpl<AppRole2Employee>
	implements AppRole2Employee {
	public AppRole2EmployeeClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return AppRole2Employee.class;
	}

	@Override
	public String getModelClassName() {
		return AppRole2Employee.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _appRole2EmployeeId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAppRole2EmployeeId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _appRole2EmployeeId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("appRole2EmployeeId", getAppRole2EmployeeId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("appRoleId", getAppRoleId());
		attributes.put("employeeId", getEmployeeId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long appRole2EmployeeId = (Long)attributes.get("appRole2EmployeeId");

		if (appRole2EmployeeId != null) {
			setAppRole2EmployeeId(appRole2EmployeeId);
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

		Long appRoleId = (Long)attributes.get("appRoleId");

		if (appRoleId != null) {
			setAppRoleId(appRoleId);
		}

		Long employeeId = (Long)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}
	}

	@Override
	public long getAppRole2EmployeeId() {
		return _appRole2EmployeeId;
	}

	@Override
	public void setAppRole2EmployeeId(long appRole2EmployeeId) {
		_appRole2EmployeeId = appRole2EmployeeId;

		if (_appRole2EmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _appRole2EmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setAppRole2EmployeeId",
						long.class);

				method.invoke(_appRole2EmployeeRemoteModel, appRole2EmployeeId);
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

		if (_appRole2EmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _appRole2EmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_appRole2EmployeeRemoteModel, userId);
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

		if (_appRole2EmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _appRole2EmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_appRole2EmployeeRemoteModel, groupId);
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

		if (_appRole2EmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _appRole2EmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_appRole2EmployeeRemoteModel, companyId);
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

		if (_appRole2EmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _appRole2EmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_appRole2EmployeeRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAppRoleId() {
		return _appRoleId;
	}

	@Override
	public void setAppRoleId(long appRoleId) {
		_appRoleId = appRoleId;

		if (_appRole2EmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _appRole2EmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setAppRoleId", long.class);

				method.invoke(_appRole2EmployeeRemoteModel, appRoleId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getEmployeeId() {
		return _employeeId;
	}

	@Override
	public void setEmployeeId(long employeeId) {
		_employeeId = employeeId;

		if (_appRole2EmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _appRole2EmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeId", long.class);

				method.invoke(_appRole2EmployeeRemoteModel, employeeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getAppRole2EmployeeRemoteModel() {
		return _appRole2EmployeeRemoteModel;
	}

	public void setAppRole2EmployeeRemoteModel(
		BaseModel<?> appRole2EmployeeRemoteModel) {
		_appRole2EmployeeRemoteModel = appRole2EmployeeRemoteModel;
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

		Class<?> remoteModelClass = _appRole2EmployeeRemoteModel.getClass();

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

		Object returnValue = method.invoke(_appRole2EmployeeRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AppRole2EmployeeLocalServiceUtil.addAppRole2Employee(this);
		}
		else {
			AppRole2EmployeeLocalServiceUtil.updateAppRole2Employee(this);
		}
	}

	@Override
	public AppRole2Employee toEscapedModel() {
		return (AppRole2Employee)ProxyUtil.newProxyInstance(AppRole2Employee.class.getClassLoader(),
			new Class[] { AppRole2Employee.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AppRole2EmployeeClp clone = new AppRole2EmployeeClp();

		clone.setAppRole2EmployeeId(getAppRole2EmployeeId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setAppRoleId(getAppRoleId());
		clone.setEmployeeId(getEmployeeId());

		return clone;
	}

	@Override
	public int compareTo(AppRole2Employee appRole2Employee) {
		long primaryKey = appRole2Employee.getPrimaryKey();

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

		if (!(obj instanceof AppRole2EmployeeClp)) {
			return false;
		}

		AppRole2EmployeeClp appRole2Employee = (AppRole2EmployeeClp)obj;

		long primaryKey = appRole2Employee.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{appRole2EmployeeId=");
		sb.append(getAppRole2EmployeeId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", appRoleId=");
		sb.append(getAppRoleId());
		sb.append(", employeeId=");
		sb.append(getEmployeeId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.ssomgt.model.AppRole2Employee");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>appRole2EmployeeId</column-name><column-value><![CDATA[");
		sb.append(getAppRole2EmployeeId());
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
			"<column><column-name>appRoleId</column-name><column-value><![CDATA[");
		sb.append(getAppRoleId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _appRole2EmployeeId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private long _appRoleId;
	private long _employeeId;
	private BaseModel<?> _appRole2EmployeeRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.ssomgt.service.ClpSerializer.class;
}