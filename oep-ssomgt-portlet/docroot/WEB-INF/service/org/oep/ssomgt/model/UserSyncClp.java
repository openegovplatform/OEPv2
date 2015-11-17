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

import org.oep.ssomgt.service.ClpSerializer;
import org.oep.ssomgt.service.UserSyncLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class UserSyncClp extends BaseModelImpl<UserSync> implements UserSync {
	public UserSyncClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return UserSync.class;
	}

	@Override
	public String getModelClassName() {
		return UserSync.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _userSyncId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setUserSyncId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _userSyncId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userSyncId", getUserSyncId());
		attributes.put("applicationId", getApplicationId());
		attributes.put("employeeId", getEmployeeId());
		attributes.put("userId", getUserId());
		attributes.put("ssoUserName", getSsoUserName());
		attributes.put("appUserName", getAppUserName());
		attributes.put("fullName", getFullName());
		attributes.put("email", getEmail());
		attributes.put("password", getPassword());
		attributes.put("accessibleStatus", getAccessibleStatus());
		attributes.put("roles", getRoles());
		attributes.put("checkpoint", getCheckpoint());
		attributes.put("syncTime", getSyncTime());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long userSyncId = (Long)attributes.get("userSyncId");

		if (userSyncId != null) {
			setUserSyncId(userSyncId);
		}

		Long applicationId = (Long)attributes.get("applicationId");

		if (applicationId != null) {
			setApplicationId(applicationId);
		}

		Long employeeId = (Long)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String ssoUserName = (String)attributes.get("ssoUserName");

		if (ssoUserName != null) {
			setSsoUserName(ssoUserName);
		}

		String appUserName = (String)attributes.get("appUserName");

		if (appUserName != null) {
			setAppUserName(appUserName);
		}

		String fullName = (String)attributes.get("fullName");

		if (fullName != null) {
			setFullName(fullName);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String password = (String)attributes.get("password");

		if (password != null) {
			setPassword(password);
		}

		Integer accessibleStatus = (Integer)attributes.get("accessibleStatus");

		if (accessibleStatus != null) {
			setAccessibleStatus(accessibleStatus);
		}

		String roles = (String)attributes.get("roles");

		if (roles != null) {
			setRoles(roles);
		}

		Date checkpoint = (Date)attributes.get("checkpoint");

		if (checkpoint != null) {
			setCheckpoint(checkpoint);
		}

		Date syncTime = (Date)attributes.get("syncTime");

		if (syncTime != null) {
			setSyncTime(syncTime);
		}
	}

	@Override
	public long getUserSyncId() {
		return _userSyncId;
	}

	@Override
	public void setUserSyncId(long userSyncId) {
		_userSyncId = userSyncId;

		if (_userSyncRemoteModel != null) {
			try {
				Class<?> clazz = _userSyncRemoteModel.getClass();

				Method method = clazz.getMethod("setUserSyncId", long.class);

				method.invoke(_userSyncRemoteModel, userSyncId);
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

		if (_userSyncRemoteModel != null) {
			try {
				Class<?> clazz = _userSyncRemoteModel.getClass();

				Method method = clazz.getMethod("setApplicationId", long.class);

				method.invoke(_userSyncRemoteModel, applicationId);
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

		if (_userSyncRemoteModel != null) {
			try {
				Class<?> clazz = _userSyncRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeId", long.class);

				method.invoke(_userSyncRemoteModel, employeeId);
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

		if (_userSyncRemoteModel != null) {
			try {
				Class<?> clazz = _userSyncRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_userSyncRemoteModel, userId);
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
	public String getSsoUserName() {
		return _ssoUserName;
	}

	@Override
	public void setSsoUserName(String ssoUserName) {
		_ssoUserName = ssoUserName;

		if (_userSyncRemoteModel != null) {
			try {
				Class<?> clazz = _userSyncRemoteModel.getClass();

				Method method = clazz.getMethod("setSsoUserName", String.class);

				method.invoke(_userSyncRemoteModel, ssoUserName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAppUserName() {
		return _appUserName;
	}

	@Override
	public void setAppUserName(String appUserName) {
		_appUserName = appUserName;

		if (_userSyncRemoteModel != null) {
			try {
				Class<?> clazz = _userSyncRemoteModel.getClass();

				Method method = clazz.getMethod("setAppUserName", String.class);

				method.invoke(_userSyncRemoteModel, appUserName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFullName() {
		return _fullName;
	}

	@Override
	public void setFullName(String fullName) {
		_fullName = fullName;

		if (_userSyncRemoteModel != null) {
			try {
				Class<?> clazz = _userSyncRemoteModel.getClass();

				Method method = clazz.getMethod("setFullName", String.class);

				method.invoke(_userSyncRemoteModel, fullName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmail() {
		return _email;
	}

	@Override
	public void setEmail(String email) {
		_email = email;

		if (_userSyncRemoteModel != null) {
			try {
				Class<?> clazz = _userSyncRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_userSyncRemoteModel, email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPassword() {
		return _password;
	}

	@Override
	public void setPassword(String password) {
		_password = password;

		if (_userSyncRemoteModel != null) {
			try {
				Class<?> clazz = _userSyncRemoteModel.getClass();

				Method method = clazz.getMethod("setPassword", String.class);

				method.invoke(_userSyncRemoteModel, password);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getAccessibleStatus() {
		return _accessibleStatus;
	}

	@Override
	public void setAccessibleStatus(int accessibleStatus) {
		_accessibleStatus = accessibleStatus;

		if (_userSyncRemoteModel != null) {
			try {
				Class<?> clazz = _userSyncRemoteModel.getClass();

				Method method = clazz.getMethod("setAccessibleStatus", int.class);

				method.invoke(_userSyncRemoteModel, accessibleStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRoles() {
		return _roles;
	}

	@Override
	public void setRoles(String roles) {
		_roles = roles;

		if (_userSyncRemoteModel != null) {
			try {
				Class<?> clazz = _userSyncRemoteModel.getClass();

				Method method = clazz.getMethod("setRoles", String.class);

				method.invoke(_userSyncRemoteModel, roles);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCheckpoint() {
		return _checkpoint;
	}

	@Override
	public void setCheckpoint(Date checkpoint) {
		_checkpoint = checkpoint;

		if (_userSyncRemoteModel != null) {
			try {
				Class<?> clazz = _userSyncRemoteModel.getClass();

				Method method = clazz.getMethod("setCheckpoint", Date.class);

				method.invoke(_userSyncRemoteModel, checkpoint);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSyncTime() {
		return _syncTime;
	}

	@Override
	public void setSyncTime(Date syncTime) {
		_syncTime = syncTime;

		if (_userSyncRemoteModel != null) {
			try {
				Class<?> clazz = _userSyncRemoteModel.getClass();

				Method method = clazz.getMethod("setSyncTime", Date.class);

				method.invoke(_userSyncRemoteModel, syncTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public org.oep.ssomgt.model.Application getApplication() {
		try {
			String methodName = "getApplication";

			Class<?>[] parameterTypes = new Class<?>[] {  };

			Object[] parameterValues = new Object[] {  };

			org.oep.ssomgt.model.Application returnObj = (org.oep.ssomgt.model.Application)invokeOnRemoteModel(methodName,
					parameterTypes, parameterValues);

			return returnObj;
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	public BaseModel<?> getUserSyncRemoteModel() {
		return _userSyncRemoteModel;
	}

	public void setUserSyncRemoteModel(BaseModel<?> userSyncRemoteModel) {
		_userSyncRemoteModel = userSyncRemoteModel;
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

		Class<?> remoteModelClass = _userSyncRemoteModel.getClass();

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

		Object returnValue = method.invoke(_userSyncRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			UserSyncLocalServiceUtil.addUserSync(this);
		}
		else {
			UserSyncLocalServiceUtil.updateUserSync(this);
		}
	}

	@Override
	public UserSync toEscapedModel() {
		return (UserSync)ProxyUtil.newProxyInstance(UserSync.class.getClassLoader(),
			new Class[] { UserSync.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		UserSyncClp clone = new UserSyncClp();

		clone.setUserSyncId(getUserSyncId());
		clone.setApplicationId(getApplicationId());
		clone.setEmployeeId(getEmployeeId());
		clone.setUserId(getUserId());
		clone.setSsoUserName(getSsoUserName());
		clone.setAppUserName(getAppUserName());
		clone.setFullName(getFullName());
		clone.setEmail(getEmail());
		clone.setPassword(getPassword());
		clone.setAccessibleStatus(getAccessibleStatus());
		clone.setRoles(getRoles());
		clone.setCheckpoint(getCheckpoint());
		clone.setSyncTime(getSyncTime());

		return clone;
	}

	@Override
	public int compareTo(UserSync userSync) {
		long primaryKey = userSync.getPrimaryKey();

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

		if (!(obj instanceof UserSyncClp)) {
			return false;
		}

		UserSyncClp userSync = (UserSyncClp)obj;

		long primaryKey = userSync.getPrimaryKey();

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
		StringBundler sb = new StringBundler(27);

		sb.append("{userSyncId=");
		sb.append(getUserSyncId());
		sb.append(", applicationId=");
		sb.append(getApplicationId());
		sb.append(", employeeId=");
		sb.append(getEmployeeId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", ssoUserName=");
		sb.append(getSsoUserName());
		sb.append(", appUserName=");
		sb.append(getAppUserName());
		sb.append(", fullName=");
		sb.append(getFullName());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", password=");
		sb.append(getPassword());
		sb.append(", accessibleStatus=");
		sb.append(getAccessibleStatus());
		sb.append(", roles=");
		sb.append(getRoles());
		sb.append(", checkpoint=");
		sb.append(getCheckpoint());
		sb.append(", syncTime=");
		sb.append(getSyncTime());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("org.oep.ssomgt.model.UserSync");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>userSyncId</column-name><column-value><![CDATA[");
		sb.append(getUserSyncId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>applicationId</column-name><column-value><![CDATA[");
		sb.append(getApplicationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ssoUserName</column-name><column-value><![CDATA[");
		sb.append(getSsoUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>appUserName</column-name><column-value><![CDATA[");
		sb.append(getAppUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fullName</column-name><column-value><![CDATA[");
		sb.append(getFullName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>password</column-name><column-value><![CDATA[");
		sb.append(getPassword());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>accessibleStatus</column-name><column-value><![CDATA[");
		sb.append(getAccessibleStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roles</column-name><column-value><![CDATA[");
		sb.append(getRoles());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>checkpoint</column-name><column-value><![CDATA[");
		sb.append(getCheckpoint());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>syncTime</column-name><column-value><![CDATA[");
		sb.append(getSyncTime());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _userSyncId;
	private long _applicationId;
	private long _employeeId;
	private long _userId;
	private String _userUuid;
	private String _ssoUserName;
	private String _appUserName;
	private String _fullName;
	private String _email;
	private String _password;
	private int _accessibleStatus;
	private String _roles;
	private Date _checkpoint;
	private Date _syncTime;
	private BaseModel<?> _userSyncRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.ssomgt.service.ClpSerializer.class;
}