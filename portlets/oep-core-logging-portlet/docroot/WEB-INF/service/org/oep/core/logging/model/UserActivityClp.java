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

package org.oep.core.logging.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import org.oep.core.logging.service.ClpSerializer;
import org.oep.core.logging.service.UserActivityLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Brian Wing Shun Chan
 */
public class UserActivityClp extends BaseModelImpl<UserActivity>
	implements UserActivity {
	public UserActivityClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return UserActivity.class;
	}

	@Override
	public String getModelClassName() {
		return UserActivity.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("userName", getUserName());
		attributes.put("email", getEmail());
		attributes.put("site", getSite());
		attributes.put("page", getPage());
		attributes.put("action", getAction());
		attributes.put("description", getDescription());
		attributes.put("url", getUrl());
		attributes.put("sessionId", getSessionId());
		attributes.put("ip", getIp());
		attributes.put("userAgent", getUserAgent());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
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

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String site = (String)attributes.get("site");

		if (site != null) {
			setSite(site);
		}

		String page = (String)attributes.get("page");

		if (page != null) {
			setPage(page);
		}

		String action = (String)attributes.get("action");

		if (action != null) {
			setAction(action);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}

		String sessionId = (String)attributes.get("sessionId");

		if (sessionId != null) {
			setSessionId(sessionId);
		}

		String ip = (String)attributes.get("ip");

		if (ip != null) {
			setIp(ip);
		}

		String userAgent = (String)attributes.get("userAgent");

		if (userAgent != null) {
			setUserAgent(userAgent);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_userActivityRemoteModel != null) {
			try {
				Class<?> clazz = _userActivityRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_userActivityRemoteModel, id);
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

		if (_userActivityRemoteModel != null) {
			try {
				Class<?> clazz = _userActivityRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_userActivityRemoteModel, userId);
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

		if (_userActivityRemoteModel != null) {
			try {
				Class<?> clazz = _userActivityRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_userActivityRemoteModel, groupId);
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

		if (_userActivityRemoteModel != null) {
			try {
				Class<?> clazz = _userActivityRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_userActivityRemoteModel, companyId);
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

		if (_userActivityRemoteModel != null) {
			try {
				Class<?> clazz = _userActivityRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_userActivityRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_userActivityRemoteModel != null) {
			try {
				Class<?> clazz = _userActivityRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_userActivityRemoteModel, userName);
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

		if (_userActivityRemoteModel != null) {
			try {
				Class<?> clazz = _userActivityRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_userActivityRemoteModel, email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSite() {
		return _site;
	}

	@Override
	public void setSite(String site) {
		_site = site;

		if (_userActivityRemoteModel != null) {
			try {
				Class<?> clazz = _userActivityRemoteModel.getClass();

				Method method = clazz.getMethod("setSite", String.class);

				method.invoke(_userActivityRemoteModel, site);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPage() {
		return _page;
	}

	@Override
	public void setPage(String page) {
		_page = page;

		if (_userActivityRemoteModel != null) {
			try {
				Class<?> clazz = _userActivityRemoteModel.getClass();

				Method method = clazz.getMethod("setPage", String.class);

				method.invoke(_userActivityRemoteModel, page);
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

		if (_userActivityRemoteModel != null) {
			try {
				Class<?> clazz = _userActivityRemoteModel.getClass();

				Method method = clazz.getMethod("setAction", String.class);

				method.invoke(_userActivityRemoteModel, action);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_userActivityRemoteModel != null) {
			try {
				Class<?> clazz = _userActivityRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_userActivityRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUrl() {
		return _url;
	}

	@Override
	public void setUrl(String url) {
		_url = url;

		if (_userActivityRemoteModel != null) {
			try {
				Class<?> clazz = _userActivityRemoteModel.getClass();

				Method method = clazz.getMethod("setUrl", String.class);

				method.invoke(_userActivityRemoteModel, url);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSessionId() {
		return _sessionId;
	}

	@Override
	public void setSessionId(String sessionId) {
		_sessionId = sessionId;

		if (_userActivityRemoteModel != null) {
			try {
				Class<?> clazz = _userActivityRemoteModel.getClass();

				Method method = clazz.getMethod("setSessionId", String.class);

				method.invoke(_userActivityRemoteModel, sessionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIp() {
		return _ip;
	}

	@Override
	public void setIp(String ip) {
		_ip = ip;

		if (_userActivityRemoteModel != null) {
			try {
				Class<?> clazz = _userActivityRemoteModel.getClass();

				Method method = clazz.getMethod("setIp", String.class);

				method.invoke(_userActivityRemoteModel, ip);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserAgent() {
		return _userAgent;
	}

	@Override
	public void setUserAgent(String userAgent) {
		_userAgent = userAgent;

		if (_userActivityRemoteModel != null) {
			try {
				Class<?> clazz = _userActivityRemoteModel.getClass();

				Method method = clazz.getMethod("setUserAgent", String.class);

				method.invoke(_userActivityRemoteModel, userAgent);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getUserActivityRemoteModel() {
		return _userActivityRemoteModel;
	}

	public void setUserActivityRemoteModel(BaseModel<?> userActivityRemoteModel) {
		_userActivityRemoteModel = userActivityRemoteModel;
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

		Class<?> remoteModelClass = _userActivityRemoteModel.getClass();

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

		Object returnValue = method.invoke(_userActivityRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			UserActivityLocalServiceUtil.addUserActivity(this);
		}
		else {
			UserActivityLocalServiceUtil.updateUserActivity(this);
		}
	}

	@Override
	public UserActivity toEscapedModel() {
		return (UserActivity)ProxyUtil.newProxyInstance(UserActivity.class.getClassLoader(),
			new Class[] { UserActivity.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		UserActivityClp clone = new UserActivityClp();

		clone.setId(getId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setUserName(getUserName());
		clone.setEmail(getEmail());
		clone.setSite(getSite());
		clone.setPage(getPage());
		clone.setAction(getAction());
		clone.setDescription(getDescription());
		clone.setUrl(getUrl());
		clone.setSessionId(getSessionId());
		clone.setIp(getIp());
		clone.setUserAgent(getUserAgent());

		return clone;
	}

	@Override
	public int compareTo(UserActivity userActivity) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), userActivity.getCreateDate());

		value = value * -1;

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

		if (!(obj instanceof UserActivityClp)) {
			return false;
		}

		UserActivityClp userActivity = (UserActivityClp)obj;

		long primaryKey = userActivity.getPrimaryKey();

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
		StringBundler sb = new StringBundler(31);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", site=");
		sb.append(getSite());
		sb.append(", page=");
		sb.append(getPage());
		sb.append(", action=");
		sb.append(getAction());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", url=");
		sb.append(getUrl());
		sb.append(", sessionId=");
		sb.append(getSessionId());
		sb.append(", ip=");
		sb.append(getIp());
		sb.append(", userAgent=");
		sb.append(getUserAgent());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.logging.model.UserActivity");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
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
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>site</column-name><column-value><![CDATA[");
		sb.append(getSite());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>page</column-name><column-value><![CDATA[");
		sb.append(getPage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>action</column-name><column-value><![CDATA[");
		sb.append(getAction());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>url</column-name><column-value><![CDATA[");
		sb.append(getUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sessionId</column-name><column-value><![CDATA[");
		sb.append(getSessionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ip</column-name><column-value><![CDATA[");
		sb.append(getIp());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userAgent</column-name><column-value><![CDATA[");
		sb.append(getUserAgent());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private String _userName;
	private String _email;
	private String _site;
	private String _page;
	private String _action;
	private String _description;
	private String _url;
	private String _sessionId;
	private String _ip;
	private String _userAgent;
	private BaseModel<?> _userActivityRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.logging.service.ClpSerializer.class;
}