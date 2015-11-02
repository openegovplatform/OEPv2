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

import org.oep.core.ssomgt.service.ApplicationLocalServiceUtil;
import org.oep.core.ssomgt.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.sql.Blob;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class ApplicationClp extends BaseModelImpl<Application>
	implements Application {
	public ApplicationClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Application.class;
	}

	@Override
	public String getModelClassName() {
		return Application.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _applicationId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setApplicationId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _applicationId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("applicationId", getApplicationId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("appCode", getAppCode());
		attributes.put("appName", getAppName());
		attributes.put("appPin", getAppPin());
		attributes.put("appUrl", getAppUrl());
		attributes.put("appBigIcon", getAppBigIcon());
		attributes.put("appSmallIcon", getAppSmallIcon());
		attributes.put("pingTime", getPingTime());
		attributes.put("sequenceNo", getSequenceNo());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long applicationId = (Long)attributes.get("applicationId");

		if (applicationId != null) {
			setApplicationId(applicationId);
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

		String appCode = (String)attributes.get("appCode");

		if (appCode != null) {
			setAppCode(appCode);
		}

		String appName = (String)attributes.get("appName");

		if (appName != null) {
			setAppName(appName);
		}

		String appPin = (String)attributes.get("appPin");

		if (appPin != null) {
			setAppPin(appPin);
		}

		String appUrl = (String)attributes.get("appUrl");

		if (appUrl != null) {
			setAppUrl(appUrl);
		}

		Blob appBigIcon = (Blob)attributes.get("appBigIcon");

		if (appBigIcon != null) {
			setAppBigIcon(appBigIcon);
		}

		Blob appSmallIcon = (Blob)attributes.get("appSmallIcon");

		if (appSmallIcon != null) {
			setAppSmallIcon(appSmallIcon);
		}

		Date pingTime = (Date)attributes.get("pingTime");

		if (pingTime != null) {
			setPingTime(pingTime);
		}

		Integer sequenceNo = (Integer)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}
	}

	@Override
	public long getApplicationId() {
		return _applicationId;
	}

	@Override
	public void setApplicationId(long applicationId) {
		_applicationId = applicationId;

		if (_applicationRemoteModel != null) {
			try {
				Class<?> clazz = _applicationRemoteModel.getClass();

				Method method = clazz.getMethod("setApplicationId", long.class);

				method.invoke(_applicationRemoteModel, applicationId);
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

		if (_applicationRemoteModel != null) {
			try {
				Class<?> clazz = _applicationRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_applicationRemoteModel, userId);
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

		if (_applicationRemoteModel != null) {
			try {
				Class<?> clazz = _applicationRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_applicationRemoteModel, groupId);
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

		if (_applicationRemoteModel != null) {
			try {
				Class<?> clazz = _applicationRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_applicationRemoteModel, companyId);
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

		if (_applicationRemoteModel != null) {
			try {
				Class<?> clazz = _applicationRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_applicationRemoteModel, createDate);
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

		if (_applicationRemoteModel != null) {
			try {
				Class<?> clazz = _applicationRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_applicationRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAppCode() {
		return _appCode;
	}

	@Override
	public void setAppCode(String appCode) {
		_appCode = appCode;

		if (_applicationRemoteModel != null) {
			try {
				Class<?> clazz = _applicationRemoteModel.getClass();

				Method method = clazz.getMethod("setAppCode", String.class);

				method.invoke(_applicationRemoteModel, appCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAppName() {
		return _appName;
	}

	@Override
	public void setAppName(String appName) {
		_appName = appName;

		if (_applicationRemoteModel != null) {
			try {
				Class<?> clazz = _applicationRemoteModel.getClass();

				Method method = clazz.getMethod("setAppName", String.class);

				method.invoke(_applicationRemoteModel, appName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAppPin() {
		return _appPin;
	}

	@Override
	public void setAppPin(String appPin) {
		_appPin = appPin;

		if (_applicationRemoteModel != null) {
			try {
				Class<?> clazz = _applicationRemoteModel.getClass();

				Method method = clazz.getMethod("setAppPin", String.class);

				method.invoke(_applicationRemoteModel, appPin);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAppUrl() {
		return _appUrl;
	}

	@Override
	public void setAppUrl(String appUrl) {
		_appUrl = appUrl;

		if (_applicationRemoteModel != null) {
			try {
				Class<?> clazz = _applicationRemoteModel.getClass();

				Method method = clazz.getMethod("setAppUrl", String.class);

				method.invoke(_applicationRemoteModel, appUrl);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Blob getAppBigIcon() {
		return _appBigIcon;
	}

	@Override
	public void setAppBigIcon(Blob appBigIcon) {
		_appBigIcon = appBigIcon;

		if (_applicationRemoteModel != null) {
			try {
				Class<?> clazz = _applicationRemoteModel.getClass();

				Method method = clazz.getMethod("setAppBigIcon", Blob.class);

				method.invoke(_applicationRemoteModel, appBigIcon);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Blob getAppSmallIcon() {
		return _appSmallIcon;
	}

	@Override
	public void setAppSmallIcon(Blob appSmallIcon) {
		_appSmallIcon = appSmallIcon;

		if (_applicationRemoteModel != null) {
			try {
				Class<?> clazz = _applicationRemoteModel.getClass();

				Method method = clazz.getMethod("setAppSmallIcon", Blob.class);

				method.invoke(_applicationRemoteModel, appSmallIcon);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getPingTime() {
		return _pingTime;
	}

	@Override
	public void setPingTime(Date pingTime) {
		_pingTime = pingTime;

		if (_applicationRemoteModel != null) {
			try {
				Class<?> clazz = _applicationRemoteModel.getClass();

				Method method = clazz.getMethod("setPingTime", Date.class);

				method.invoke(_applicationRemoteModel, pingTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSequenceNo() {
		return _sequenceNo;
	}

	@Override
	public void setSequenceNo(int sequenceNo) {
		_sequenceNo = sequenceNo;

		if (_applicationRemoteModel != null) {
			try {
				Class<?> clazz = _applicationRemoteModel.getClass();

				Method method = clazz.getMethod("setSequenceNo", int.class);

				method.invoke(_applicationRemoteModel, sequenceNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getApplicationRemoteModel() {
		return _applicationRemoteModel;
	}

	public void setApplicationRemoteModel(BaseModel<?> applicationRemoteModel) {
		_applicationRemoteModel = applicationRemoteModel;
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

		Class<?> remoteModelClass = _applicationRemoteModel.getClass();

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

		Object returnValue = method.invoke(_applicationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ApplicationLocalServiceUtil.addApplication(this);
		}
		else {
			ApplicationLocalServiceUtil.updateApplication(this);
		}
	}

	@Override
	public Application toEscapedModel() {
		return (Application)ProxyUtil.newProxyInstance(Application.class.getClassLoader(),
			new Class[] { Application.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ApplicationClp clone = new ApplicationClp();

		clone.setApplicationId(getApplicationId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setAppCode(getAppCode());
		clone.setAppName(getAppName());
		clone.setAppPin(getAppPin());
		clone.setAppUrl(getAppUrl());
		clone.setAppBigIcon(getAppBigIcon());
		clone.setAppSmallIcon(getAppSmallIcon());
		clone.setPingTime(getPingTime());
		clone.setSequenceNo(getSequenceNo());

		return clone;
	}

	@Override
	public int compareTo(Application application) {
		int value = 0;

		if (getSequenceNo() < application.getSequenceNo()) {
			value = -1;
		}
		else if (getSequenceNo() > application.getSequenceNo()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ApplicationClp)) {
			return false;
		}

		ApplicationClp application = (ApplicationClp)obj;

		long primaryKey = application.getPrimaryKey();

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
		StringBundler sb = new StringBundler(29);

		sb.append("{applicationId=");
		sb.append(getApplicationId());
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
		sb.append(", appCode=");
		sb.append(getAppCode());
		sb.append(", appName=");
		sb.append(getAppName());
		sb.append(", appPin=");
		sb.append(getAppPin());
		sb.append(", appUrl=");
		sb.append(getAppUrl());
		sb.append(", appBigIcon=");
		sb.append(getAppBigIcon());
		sb.append(", appSmallIcon=");
		sb.append(getAppSmallIcon());
		sb.append(", pingTime=");
		sb.append(getPingTime());
		sb.append(", sequenceNo=");
		sb.append(getSequenceNo());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.ssomgt.model.Application");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>applicationId</column-name><column-value><![CDATA[");
		sb.append(getApplicationId());
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
			"<column><column-name>appCode</column-name><column-value><![CDATA[");
		sb.append(getAppCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>appName</column-name><column-value><![CDATA[");
		sb.append(getAppName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>appPin</column-name><column-value><![CDATA[");
		sb.append(getAppPin());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>appUrl</column-name><column-value><![CDATA[");
		sb.append(getAppUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>appBigIcon</column-name><column-value><![CDATA[");
		sb.append(getAppBigIcon());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>appSmallIcon</column-name><column-value><![CDATA[");
		sb.append(getAppSmallIcon());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>pingTime</column-name><column-value><![CDATA[");
		sb.append(getPingTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sequenceNo</column-name><column-value><![CDATA[");
		sb.append(getSequenceNo());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _applicationId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _appCode;
	private String _appName;
	private String _appPin;
	private String _appUrl;
	private Blob _appBigIcon;
	private Blob _appSmallIcon;
	private Date _pingTime;
	private int _sequenceNo;
	private BaseModel<?> _applicationRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.ssomgt.service.ClpSerializer.class;
}