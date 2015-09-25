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
import org.oep.core.processmgt.service.UserAssignmentLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class UserAssignmentClp extends BaseModelImpl<UserAssignment>
	implements UserAssignment {
	public UserAssignmentClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return UserAssignment.class;
	}

	@Override
	public String getModelClassName() {
		return UserAssignment.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _userAssignmentId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setUserAssignmentId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _userAssignmentId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userAssignmentId", getUserAssignmentId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("processOrderId", getProcessOrderId());
		attributes.put("dossierStepId", getDossierStepId());
		attributes.put("assignToUserId", getAssignToUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long userAssignmentId = (Long)attributes.get("userAssignmentId");

		if (userAssignmentId != null) {
			setUserAssignmentId(userAssignmentId);
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

		Long processOrderId = (Long)attributes.get("processOrderId");

		if (processOrderId != null) {
			setProcessOrderId(processOrderId);
		}

		Long dossierStepId = (Long)attributes.get("dossierStepId");

		if (dossierStepId != null) {
			setDossierStepId(dossierStepId);
		}

		Long assignToUserId = (Long)attributes.get("assignToUserId");

		if (assignToUserId != null) {
			setAssignToUserId(assignToUserId);
		}
	}

	@Override
	public long getUserAssignmentId() {
		return _userAssignmentId;
	}

	@Override
	public void setUserAssignmentId(long userAssignmentId) {
		_userAssignmentId = userAssignmentId;

		if (_userAssignmentRemoteModel != null) {
			try {
				Class<?> clazz = _userAssignmentRemoteModel.getClass();

				Method method = clazz.getMethod("setUserAssignmentId",
						long.class);

				method.invoke(_userAssignmentRemoteModel, userAssignmentId);
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

		if (_userAssignmentRemoteModel != null) {
			try {
				Class<?> clazz = _userAssignmentRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_userAssignmentRemoteModel, userId);
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

		if (_userAssignmentRemoteModel != null) {
			try {
				Class<?> clazz = _userAssignmentRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_userAssignmentRemoteModel, groupId);
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

		if (_userAssignmentRemoteModel != null) {
			try {
				Class<?> clazz = _userAssignmentRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_userAssignmentRemoteModel, companyId);
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

		if (_userAssignmentRemoteModel != null) {
			try {
				Class<?> clazz = _userAssignmentRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_userAssignmentRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getProcessOrderId() {
		return _processOrderId;
	}

	@Override
	public void setProcessOrderId(long processOrderId) {
		_processOrderId = processOrderId;

		if (_userAssignmentRemoteModel != null) {
			try {
				Class<?> clazz = _userAssignmentRemoteModel.getClass();

				Method method = clazz.getMethod("setProcessOrderId", long.class);

				method.invoke(_userAssignmentRemoteModel, processOrderId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDossierStepId() {
		return _dossierStepId;
	}

	@Override
	public void setDossierStepId(long dossierStepId) {
		_dossierStepId = dossierStepId;

		if (_userAssignmentRemoteModel != null) {
			try {
				Class<?> clazz = _userAssignmentRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierStepId", long.class);

				method.invoke(_userAssignmentRemoteModel, dossierStepId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAssignToUserId() {
		return _assignToUserId;
	}

	@Override
	public void setAssignToUserId(long assignToUserId) {
		_assignToUserId = assignToUserId;

		if (_userAssignmentRemoteModel != null) {
			try {
				Class<?> clazz = _userAssignmentRemoteModel.getClass();

				Method method = clazz.getMethod("setAssignToUserId", long.class);

				method.invoke(_userAssignmentRemoteModel, assignToUserId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAssignToUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getAssignToUserId(), "uuid",
			_assignToUserUuid);
	}

	@Override
	public void setAssignToUserUuid(String assignToUserUuid) {
		_assignToUserUuid = assignToUserUuid;
	}

	public BaseModel<?> getUserAssignmentRemoteModel() {
		return _userAssignmentRemoteModel;
	}

	public void setUserAssignmentRemoteModel(
		BaseModel<?> userAssignmentRemoteModel) {
		_userAssignmentRemoteModel = userAssignmentRemoteModel;
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

		Class<?> remoteModelClass = _userAssignmentRemoteModel.getClass();

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

		Object returnValue = method.invoke(_userAssignmentRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			UserAssignmentLocalServiceUtil.addUserAssignment(this);
		}
		else {
			UserAssignmentLocalServiceUtil.updateUserAssignment(this);
		}
	}

	@Override
	public UserAssignment toEscapedModel() {
		return (UserAssignment)ProxyUtil.newProxyInstance(UserAssignment.class.getClassLoader(),
			new Class[] { UserAssignment.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		UserAssignmentClp clone = new UserAssignmentClp();

		clone.setUserAssignmentId(getUserAssignmentId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setProcessOrderId(getProcessOrderId());
		clone.setDossierStepId(getDossierStepId());
		clone.setAssignToUserId(getAssignToUserId());

		return clone;
	}

	@Override
	public int compareTo(UserAssignment userAssignment) {
		long primaryKey = userAssignment.getPrimaryKey();

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

		if (!(obj instanceof UserAssignmentClp)) {
			return false;
		}

		UserAssignmentClp userAssignment = (UserAssignmentClp)obj;

		long primaryKey = userAssignment.getPrimaryKey();

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

		sb.append("{userAssignmentId=");
		sb.append(getUserAssignmentId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", processOrderId=");
		sb.append(getProcessOrderId());
		sb.append(", dossierStepId=");
		sb.append(getDossierStepId());
		sb.append(", assignToUserId=");
		sb.append(getAssignToUserId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.processmgt.model.UserAssignment");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>userAssignmentId</column-name><column-value><![CDATA[");
		sb.append(getUserAssignmentId());
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
			"<column><column-name>processOrderId</column-name><column-value><![CDATA[");
		sb.append(getProcessOrderId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierStepId</column-name><column-value><![CDATA[");
		sb.append(getDossierStepId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assignToUserId</column-name><column-value><![CDATA[");
		sb.append(getAssignToUserId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _userAssignmentId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private long _processOrderId;
	private long _dossierStepId;
	private long _assignToUserId;
	private String _assignToUserUuid;
	private BaseModel<?> _userAssignmentRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.processmgt.service.ClpSerializer.class;
}