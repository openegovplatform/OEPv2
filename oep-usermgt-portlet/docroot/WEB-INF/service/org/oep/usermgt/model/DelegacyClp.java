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

package org.oep.usermgt.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import org.oep.usermgt.service.ClpSerializer;
import org.oep.usermgt.service.DelegacyLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author NQMINH
 */
public class DelegacyClp extends BaseModelImpl<Delegacy> implements Delegacy {
	public DelegacyClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Delegacy.class;
	}

	@Override
	public String getModelClassName() {
		return Delegacy.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _delegacyId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDelegacyId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _delegacyId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("delegacyId", getDelegacyId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("fromEmployeeId", getFromEmployeeId());
		attributes.put("toEmployeeId", getToEmployeeId());
		attributes.put("roleId", getRoleId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long delegacyId = (Long)attributes.get("delegacyId");

		if (delegacyId != null) {
			setDelegacyId(delegacyId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Long fromEmployeeId = (Long)attributes.get("fromEmployeeId");

		if (fromEmployeeId != null) {
			setFromEmployeeId(fromEmployeeId);
		}

		Long toEmployeeId = (Long)attributes.get("toEmployeeId");

		if (toEmployeeId != null) {
			setToEmployeeId(toEmployeeId);
		}

		Long roleId = (Long)attributes.get("roleId");

		if (roleId != null) {
			setRoleId(roleId);
		}
	}

	@Override
	public long getDelegacyId() {
		return _delegacyId;
	}

	@Override
	public void setDelegacyId(long delegacyId) {
		_delegacyId = delegacyId;

		if (_delegacyRemoteModel != null) {
			try {
				Class<?> clazz = _delegacyRemoteModel.getClass();

				Method method = clazz.getMethod("setDelegacyId", long.class);

				method.invoke(_delegacyRemoteModel, delegacyId);
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

		if (_delegacyRemoteModel != null) {
			try {
				Class<?> clazz = _delegacyRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_delegacyRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_delegacyRemoteModel != null) {
			try {
				Class<?> clazz = _delegacyRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_delegacyRemoteModel, groupId);
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

		if (_delegacyRemoteModel != null) {
			try {
				Class<?> clazz = _delegacyRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_delegacyRemoteModel, userId);
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
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_delegacyRemoteModel != null) {
			try {
				Class<?> clazz = _delegacyRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_delegacyRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getFromEmployeeId() {
		return _fromEmployeeId;
	}

	@Override
	public void setFromEmployeeId(long fromEmployeeId) {
		_fromEmployeeId = fromEmployeeId;

		if (_delegacyRemoteModel != null) {
			try {
				Class<?> clazz = _delegacyRemoteModel.getClass();

				Method method = clazz.getMethod("setFromEmployeeId", long.class);

				method.invoke(_delegacyRemoteModel, fromEmployeeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getToEmployeeId() {
		return _toEmployeeId;
	}

	@Override
	public void setToEmployeeId(long toEmployeeId) {
		_toEmployeeId = toEmployeeId;

		if (_delegacyRemoteModel != null) {
			try {
				Class<?> clazz = _delegacyRemoteModel.getClass();

				Method method = clazz.getMethod("setToEmployeeId", long.class);

				method.invoke(_delegacyRemoteModel, toEmployeeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getRoleId() {
		return _roleId;
	}

	@Override
	public void setRoleId(long roleId) {
		_roleId = roleId;

		if (_delegacyRemoteModel != null) {
			try {
				Class<?> clazz = _delegacyRemoteModel.getClass();

				Method method = clazz.getMethod("setRoleId", long.class);

				method.invoke(_delegacyRemoteModel, roleId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDelegacyRemoteModel() {
		return _delegacyRemoteModel;
	}

	public void setDelegacyRemoteModel(BaseModel<?> delegacyRemoteModel) {
		_delegacyRemoteModel = delegacyRemoteModel;
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

		Class<?> remoteModelClass = _delegacyRemoteModel.getClass();

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

		Object returnValue = method.invoke(_delegacyRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DelegacyLocalServiceUtil.addDelegacy(this);
		}
		else {
			DelegacyLocalServiceUtil.updateDelegacy(this);
		}
	}

	@Override
	public Delegacy toEscapedModel() {
		return (Delegacy)ProxyUtil.newProxyInstance(Delegacy.class.getClassLoader(),
			new Class[] { Delegacy.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DelegacyClp clone = new DelegacyClp();

		clone.setDelegacyId(getDelegacyId());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());
		clone.setUserId(getUserId());
		clone.setCreateDate(getCreateDate());
		clone.setFromEmployeeId(getFromEmployeeId());
		clone.setToEmployeeId(getToEmployeeId());
		clone.setRoleId(getRoleId());

		return clone;
	}

	@Override
	public int compareTo(Delegacy delegacy) {
		long primaryKey = delegacy.getPrimaryKey();

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

		if (!(obj instanceof DelegacyClp)) {
			return false;
		}

		DelegacyClp delegacy = (DelegacyClp)obj;

		long primaryKey = delegacy.getPrimaryKey();

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

		sb.append("{delegacyId=");
		sb.append(getDelegacyId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", fromEmployeeId=");
		sb.append(getFromEmployeeId());
		sb.append(", toEmployeeId=");
		sb.append(getToEmployeeId());
		sb.append(", roleId=");
		sb.append(getRoleId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("org.oep.usermgt.model.Delegacy");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>delegacyId</column-name><column-value><![CDATA[");
		sb.append(getDelegacyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fromEmployeeId</column-name><column-value><![CDATA[");
		sb.append(getFromEmployeeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toEmployeeId</column-name><column-value><![CDATA[");
		sb.append(getToEmployeeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roleId</column-name><column-value><![CDATA[");
		sb.append(getRoleId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _delegacyId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private String _userUuid;
	private Date _createDate;
	private long _fromEmployeeId;
	private long _toEmployeeId;
	private long _roleId;
	private BaseModel<?> _delegacyRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.usermgt.service.ClpSerializer.class;
}