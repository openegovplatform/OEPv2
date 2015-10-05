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
import org.oep.core.logging.service.NewUserLogLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Brian Wing Shun Chan
 */
public class NewUserLogClp extends BaseModelImpl<NewUserLog>
	implements NewUserLog {
	public NewUserLogClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return NewUserLog.class;
	}

	@Override
	public String getModelClassName() {
		return NewUserLog.class.getName();
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
		attributes.put("userActivityId", getUserActivityId());
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

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long userActivityId = (Long)attributes.get("userActivityId");

		if (userActivityId != null) {
			setUserActivityId(userActivityId);
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
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_newUserLogRemoteModel != null) {
			try {
				Class<?> clazz = _newUserLogRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_newUserLogRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserActivityId() {
		return _userActivityId;
	}

	@Override
	public void setUserActivityId(long userActivityId) {
		_userActivityId = userActivityId;

		if (_newUserLogRemoteModel != null) {
			try {
				Class<?> clazz = _newUserLogRemoteModel.getClass();

				Method method = clazz.getMethod("setUserActivityId", long.class);

				method.invoke(_newUserLogRemoteModel, userActivityId);
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

		if (_newUserLogRemoteModel != null) {
			try {
				Class<?> clazz = _newUserLogRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_newUserLogRemoteModel, userId);
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

		if (_newUserLogRemoteModel != null) {
			try {
				Class<?> clazz = _newUserLogRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_newUserLogRemoteModel, groupId);
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

		if (_newUserLogRemoteModel != null) {
			try {
				Class<?> clazz = _newUserLogRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_newUserLogRemoteModel, companyId);
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

		if (_newUserLogRemoteModel != null) {
			try {
				Class<?> clazz = _newUserLogRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_newUserLogRemoteModel, createDate);
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

		if (_newUserLogRemoteModel != null) {
			try {
				Class<?> clazz = _newUserLogRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_newUserLogRemoteModel, userName);
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

		if (_newUserLogRemoteModel != null) {
			try {
				Class<?> clazz = _newUserLogRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_newUserLogRemoteModel, email);
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

		if (_newUserLogRemoteModel != null) {
			try {
				Class<?> clazz = _newUserLogRemoteModel.getClass();

				Method method = clazz.getMethod("setSite", String.class);

				method.invoke(_newUserLogRemoteModel, site);
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

		if (_newUserLogRemoteModel != null) {
			try {
				Class<?> clazz = _newUserLogRemoteModel.getClass();

				Method method = clazz.getMethod("setPage", String.class);

				method.invoke(_newUserLogRemoteModel, page);
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

		if (_newUserLogRemoteModel != null) {
			try {
				Class<?> clazz = _newUserLogRemoteModel.getClass();

				Method method = clazz.getMethod("setAction", String.class);

				method.invoke(_newUserLogRemoteModel, action);
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

		if (_newUserLogRemoteModel != null) {
			try {
				Class<?> clazz = _newUserLogRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_newUserLogRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getNewUserLogRemoteModel() {
		return _newUserLogRemoteModel;
	}

	public void setNewUserLogRemoteModel(BaseModel<?> newUserLogRemoteModel) {
		_newUserLogRemoteModel = newUserLogRemoteModel;
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

		Class<?> remoteModelClass = _newUserLogRemoteModel.getClass();

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

		Object returnValue = method.invoke(_newUserLogRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			NewUserLogLocalServiceUtil.addNewUserLog(this);
		}
		else {
			NewUserLogLocalServiceUtil.updateNewUserLog(this);
		}
	}

	@Override
	public NewUserLog toEscapedModel() {
		return (NewUserLog)ProxyUtil.newProxyInstance(NewUserLog.class.getClassLoader(),
			new Class[] { NewUserLog.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		NewUserLogClp clone = new NewUserLogClp();

		clone.setId(getId());
		clone.setUserActivityId(getUserActivityId());
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

		return clone;
	}

	@Override
	public int compareTo(NewUserLog newUserLog) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), newUserLog.getCreateDate());

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

		if (!(obj instanceof NewUserLogClp)) {
			return false;
		}

		NewUserLogClp newUserLog = (NewUserLogClp)obj;

		long primaryKey = newUserLog.getPrimaryKey();

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
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", userActivityId=");
		sb.append(getUserActivityId());
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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.logging.model.NewUserLog");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userActivityId</column-name><column-value><![CDATA[");
		sb.append(getUserActivityId());
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

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _userActivityId;
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
	private BaseModel<?> _newUserLogRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.logging.service.ClpSerializer.class;
}