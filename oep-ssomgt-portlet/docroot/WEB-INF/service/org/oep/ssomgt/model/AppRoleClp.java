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

package org.oep.ssomgt.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import org.oep.ssomgt.service.AppRoleLocalServiceUtil;
import org.oep.ssomgt.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class AppRoleClp extends BaseModelImpl<AppRole> implements AppRole {
	public AppRoleClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return AppRole.class;
	}

	@Override
	public String getModelClassName() {
		return AppRole.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _appRoleId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAppRoleId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _appRoleId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("appRoleId", getAppRoleId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("applicationId", getApplicationId());
		attributes.put("roleCode", getRoleCode());
		attributes.put("roleName", getRoleName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long appRoleId = (Long)attributes.get("appRoleId");

		if (appRoleId != null) {
			setAppRoleId(appRoleId);
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

		Long applicationId = (Long)attributes.get("applicationId");

		if (applicationId != null) {
			setApplicationId(applicationId);
		}

		String roleCode = (String)attributes.get("roleCode");

		if (roleCode != null) {
			setRoleCode(roleCode);
		}

		String roleName = (String)attributes.get("roleName");

		if (roleName != null) {
			setRoleName(roleName);
		}
	}

	@Override
	public long getAppRoleId() {
		return _appRoleId;
	}

	@Override
	public void setAppRoleId(long appRoleId) {
		_appRoleId = appRoleId;

		if (_appRoleRemoteModel != null) {
			try {
				Class<?> clazz = _appRoleRemoteModel.getClass();

				Method method = clazz.getMethod("setAppRoleId", long.class);

				method.invoke(_appRoleRemoteModel, appRoleId);
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

		if (_appRoleRemoteModel != null) {
			try {
				Class<?> clazz = _appRoleRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_appRoleRemoteModel, userId);
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

		if (_appRoleRemoteModel != null) {
			try {
				Class<?> clazz = _appRoleRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_appRoleRemoteModel, groupId);
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

		if (_appRoleRemoteModel != null) {
			try {
				Class<?> clazz = _appRoleRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_appRoleRemoteModel, companyId);
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

		if (_appRoleRemoteModel != null) {
			try {
				Class<?> clazz = _appRoleRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_appRoleRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getApplicationId() {
		return _applicationId;
	}

	@Override
	public void setApplicationId(long applicationId) {
		_applicationId = applicationId;

		if (_appRoleRemoteModel != null) {
			try {
				Class<?> clazz = _appRoleRemoteModel.getClass();

				Method method = clazz.getMethod("setApplicationId", long.class);

				method.invoke(_appRoleRemoteModel, applicationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRoleCode() {
		return _roleCode;
	}

	@Override
	public void setRoleCode(String roleCode) {
		_roleCode = roleCode;

		if (_appRoleRemoteModel != null) {
			try {
				Class<?> clazz = _appRoleRemoteModel.getClass();

				Method method = clazz.getMethod("setRoleCode", String.class);

				method.invoke(_appRoleRemoteModel, roleCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRoleName() {
		return _roleName;
	}

	@Override
	public void setRoleName(String roleName) {
		_roleName = roleName;

		if (_appRoleRemoteModel != null) {
			try {
				Class<?> clazz = _appRoleRemoteModel.getClass();

				Method method = clazz.getMethod("setRoleName", String.class);

				method.invoke(_appRoleRemoteModel, roleName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getAppRoleRemoteModel() {
		return _appRoleRemoteModel;
	}

	public void setAppRoleRemoteModel(BaseModel<?> appRoleRemoteModel) {
		_appRoleRemoteModel = appRoleRemoteModel;
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

		Class<?> remoteModelClass = _appRoleRemoteModel.getClass();

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

		Object returnValue = method.invoke(_appRoleRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AppRoleLocalServiceUtil.addAppRole(this);
		}
		else {
			AppRoleLocalServiceUtil.updateAppRole(this);
		}
	}

	@Override
	public AppRole toEscapedModel() {
		return (AppRole)ProxyUtil.newProxyInstance(AppRole.class.getClassLoader(),
			new Class[] { AppRole.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AppRoleClp clone = new AppRoleClp();

		clone.setAppRoleId(getAppRoleId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setApplicationId(getApplicationId());
		clone.setRoleCode(getRoleCode());
		clone.setRoleName(getRoleName());

		return clone;
	}

	@Override
	public int compareTo(AppRole appRole) {
		long primaryKey = appRole.getPrimaryKey();

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

		if (!(obj instanceof AppRoleClp)) {
			return false;
		}

		AppRoleClp appRole = (AppRoleClp)obj;

		long primaryKey = appRole.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{appRoleId=");
		sb.append(getAppRoleId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", applicationId=");
		sb.append(getApplicationId());
		sb.append(", roleCode=");
		sb.append(getRoleCode());
		sb.append(", roleName=");
		sb.append(getRoleName());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("org.oep.ssomgt.model.AppRole");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>appRoleId</column-name><column-value><![CDATA[");
		sb.append(getAppRoleId());
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
			"<column><column-name>applicationId</column-name><column-value><![CDATA[");
		sb.append(getApplicationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roleCode</column-name><column-value><![CDATA[");
		sb.append(getRoleCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roleName</column-name><column-value><![CDATA[");
		sb.append(getRoleName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _appRoleId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private long _applicationId;
	private String _roleCode;
	private String _roleName;
	private BaseModel<?> _appRoleRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.ssomgt.service.ClpSerializer.class;
}