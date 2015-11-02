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

import org.oep.core.ssomgt.service.AppRole2JobPosLocalServiceUtil;
import org.oep.core.ssomgt.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class AppRole2JobPosClp extends BaseModelImpl<AppRole2JobPos>
	implements AppRole2JobPos {
	public AppRole2JobPosClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return AppRole2JobPos.class;
	}

	@Override
	public String getModelClassName() {
		return AppRole2JobPos.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _appRole2JobPosId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAppRole2JobPosId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _appRole2JobPosId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("appRole2JobPosId", getAppRole2JobPosId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("appRoleId", getAppRoleId());
		attributes.put("jobPostId", getJobPostId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long appRole2JobPosId = (Long)attributes.get("appRole2JobPosId");

		if (appRole2JobPosId != null) {
			setAppRole2JobPosId(appRole2JobPosId);
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

		Long jobPostId = (Long)attributes.get("jobPostId");

		if (jobPostId != null) {
			setJobPostId(jobPostId);
		}
	}

	@Override
	public long getAppRole2JobPosId() {
		return _appRole2JobPosId;
	}

	@Override
	public void setAppRole2JobPosId(long appRole2JobPosId) {
		_appRole2JobPosId = appRole2JobPosId;

		if (_appRole2JobPosRemoteModel != null) {
			try {
				Class<?> clazz = _appRole2JobPosRemoteModel.getClass();

				Method method = clazz.getMethod("setAppRole2JobPosId",
						long.class);

				method.invoke(_appRole2JobPosRemoteModel, appRole2JobPosId);
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

		if (_appRole2JobPosRemoteModel != null) {
			try {
				Class<?> clazz = _appRole2JobPosRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_appRole2JobPosRemoteModel, userId);
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

		if (_appRole2JobPosRemoteModel != null) {
			try {
				Class<?> clazz = _appRole2JobPosRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_appRole2JobPosRemoteModel, groupId);
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

		if (_appRole2JobPosRemoteModel != null) {
			try {
				Class<?> clazz = _appRole2JobPosRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_appRole2JobPosRemoteModel, companyId);
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

		if (_appRole2JobPosRemoteModel != null) {
			try {
				Class<?> clazz = _appRole2JobPosRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_appRole2JobPosRemoteModel, createDate);
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

		if (_appRole2JobPosRemoteModel != null) {
			try {
				Class<?> clazz = _appRole2JobPosRemoteModel.getClass();

				Method method = clazz.getMethod("setAppRoleId", long.class);

				method.invoke(_appRole2JobPosRemoteModel, appRoleId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getJobPostId() {
		return _jobPostId;
	}

	@Override
	public void setJobPostId(long jobPostId) {
		_jobPostId = jobPostId;

		if (_appRole2JobPosRemoteModel != null) {
			try {
				Class<?> clazz = _appRole2JobPosRemoteModel.getClass();

				Method method = clazz.getMethod("setJobPostId", long.class);

				method.invoke(_appRole2JobPosRemoteModel, jobPostId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getAppRole2JobPosRemoteModel() {
		return _appRole2JobPosRemoteModel;
	}

	public void setAppRole2JobPosRemoteModel(
		BaseModel<?> appRole2JobPosRemoteModel) {
		_appRole2JobPosRemoteModel = appRole2JobPosRemoteModel;
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

		Class<?> remoteModelClass = _appRole2JobPosRemoteModel.getClass();

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

		Object returnValue = method.invoke(_appRole2JobPosRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AppRole2JobPosLocalServiceUtil.addAppRole2JobPos(this);
		}
		else {
			AppRole2JobPosLocalServiceUtil.updateAppRole2JobPos(this);
		}
	}

	@Override
	public AppRole2JobPos toEscapedModel() {
		return (AppRole2JobPos)ProxyUtil.newProxyInstance(AppRole2JobPos.class.getClassLoader(),
			new Class[] { AppRole2JobPos.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AppRole2JobPosClp clone = new AppRole2JobPosClp();

		clone.setAppRole2JobPosId(getAppRole2JobPosId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setAppRoleId(getAppRoleId());
		clone.setJobPostId(getJobPostId());

		return clone;
	}

	@Override
	public int compareTo(AppRole2JobPos appRole2JobPos) {
		long primaryKey = appRole2JobPos.getPrimaryKey();

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

		if (!(obj instanceof AppRole2JobPosClp)) {
			return false;
		}

		AppRole2JobPosClp appRole2JobPos = (AppRole2JobPosClp)obj;

		long primaryKey = appRole2JobPos.getPrimaryKey();

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

		sb.append("{appRole2JobPosId=");
		sb.append(getAppRole2JobPosId());
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
		sb.append(", jobPostId=");
		sb.append(getJobPostId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.ssomgt.model.AppRole2JobPos");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>appRole2JobPosId</column-name><column-value><![CDATA[");
		sb.append(getAppRole2JobPosId());
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
			"<column><column-name>jobPostId</column-name><column-value><![CDATA[");
		sb.append(getJobPostId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _appRole2JobPosId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private long _appRoleId;
	private long _jobPostId;
	private BaseModel<?> _appRole2JobPosRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.ssomgt.service.ClpSerializer.class;
}