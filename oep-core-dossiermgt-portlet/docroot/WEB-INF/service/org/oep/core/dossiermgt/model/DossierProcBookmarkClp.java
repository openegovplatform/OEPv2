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

package org.oep.core.dossiermgt.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import org.oep.core.dossiermgt.service.ClpSerializer;
import org.oep.core.dossiermgt.service.DossierProcBookmarkLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class DossierProcBookmarkClp extends BaseModelImpl<DossierProcBookmark>
	implements DossierProcBookmark {
	public DossierProcBookmarkClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DossierProcBookmark.class;
	}

	@Override
	public String getModelClassName() {
		return DossierProcBookmark.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _dossierProcBookmarkId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDossierProcBookmarkId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dossierProcBookmarkId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dossierProcBookmarkId", getDossierProcBookmarkId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("dossierProcAgentId", getDossierProcAgentId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dossierProcBookmarkId = (Long)attributes.get(
				"dossierProcBookmarkId");

		if (dossierProcBookmarkId != null) {
			setDossierProcBookmarkId(dossierProcBookmarkId);
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

		Long dossierProcAgentId = (Long)attributes.get("dossierProcAgentId");

		if (dossierProcAgentId != null) {
			setDossierProcAgentId(dossierProcAgentId);
		}
	}

	@Override
	public long getDossierProcBookmarkId() {
		return _dossierProcBookmarkId;
	}

	@Override
	public void setDossierProcBookmarkId(long dossierProcBookmarkId) {
		_dossierProcBookmarkId = dossierProcBookmarkId;

		if (_dossierProcBookmarkRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcBookmarkRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierProcBookmarkId",
						long.class);

				method.invoke(_dossierProcBookmarkRemoteModel,
					dossierProcBookmarkId);
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

		if (_dossierProcBookmarkRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcBookmarkRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_dossierProcBookmarkRemoteModel, userId);
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

		if (_dossierProcBookmarkRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcBookmarkRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_dossierProcBookmarkRemoteModel, groupId);
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

		if (_dossierProcBookmarkRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcBookmarkRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_dossierProcBookmarkRemoteModel, companyId);
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

		if (_dossierProcBookmarkRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcBookmarkRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_dossierProcBookmarkRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDossierProcAgentId() {
		return _dossierProcAgentId;
	}

	@Override
	public void setDossierProcAgentId(long dossierProcAgentId) {
		_dossierProcAgentId = dossierProcAgentId;

		if (_dossierProcBookmarkRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcBookmarkRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierProcAgentId",
						long.class);

				method.invoke(_dossierProcBookmarkRemoteModel,
					dossierProcAgentId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDossierProcBookmarkRemoteModel() {
		return _dossierProcBookmarkRemoteModel;
	}

	public void setDossierProcBookmarkRemoteModel(
		BaseModel<?> dossierProcBookmarkRemoteModel) {
		_dossierProcBookmarkRemoteModel = dossierProcBookmarkRemoteModel;
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

		Class<?> remoteModelClass = _dossierProcBookmarkRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dossierProcBookmarkRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DossierProcBookmarkLocalServiceUtil.addDossierProcBookmark(this);
		}
		else {
			DossierProcBookmarkLocalServiceUtil.updateDossierProcBookmark(this);
		}
	}

	@Override
	public DossierProcBookmark toEscapedModel() {
		return (DossierProcBookmark)ProxyUtil.newProxyInstance(DossierProcBookmark.class.getClassLoader(),
			new Class[] { DossierProcBookmark.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DossierProcBookmarkClp clone = new DossierProcBookmarkClp();

		clone.setDossierProcBookmarkId(getDossierProcBookmarkId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setDossierProcAgentId(getDossierProcAgentId());

		return clone;
	}

	@Override
	public int compareTo(DossierProcBookmark dossierProcBookmark) {
		long primaryKey = dossierProcBookmark.getPrimaryKey();

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

		if (!(obj instanceof DossierProcBookmarkClp)) {
			return false;
		}

		DossierProcBookmarkClp dossierProcBookmark = (DossierProcBookmarkClp)obj;

		long primaryKey = dossierProcBookmark.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{dossierProcBookmarkId=");
		sb.append(getDossierProcBookmarkId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", dossierProcAgentId=");
		sb.append(getDossierProcAgentId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.dossiermgt.model.DossierProcBookmark");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>dossierProcBookmarkId</column-name><column-value><![CDATA[");
		sb.append(getDossierProcBookmarkId());
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
			"<column><column-name>dossierProcAgentId</column-name><column-value><![CDATA[");
		sb.append(getDossierProcAgentId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _dossierProcBookmarkId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private long _dossierProcAgentId;
	private BaseModel<?> _dossierProcBookmarkRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.dossiermgt.service.ClpSerializer.class;
}