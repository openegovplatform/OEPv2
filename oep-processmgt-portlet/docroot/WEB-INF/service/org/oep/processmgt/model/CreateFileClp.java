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

package org.oep.processmgt.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import org.oep.processmgt.service.ClpSerializer;
import org.oep.processmgt.service.CreateFileLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class CreateFileClp extends BaseModelImpl<CreateFile>
	implements CreateFile {
	public CreateFileClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return CreateFile.class;
	}

	@Override
	public String getModelClassName() {
		return CreateFile.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _createFileId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCreateFileId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _createFileId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("createFileId", getCreateFileId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("processOrderId", getProcessOrderId());
		attributes.put("dossierStepId", getDossierStepId());
		attributes.put("stepDate", getStepDate());
		attributes.put("docFileId", getDocFileId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long createFileId = (Long)attributes.get("createFileId");

		if (createFileId != null) {
			setCreateFileId(createFileId);
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

		Date stepDate = (Date)attributes.get("stepDate");

		if (stepDate != null) {
			setStepDate(stepDate);
		}

		Long docFileId = (Long)attributes.get("docFileId");

		if (docFileId != null) {
			setDocFileId(docFileId);
		}
	}

	@Override
	public long getCreateFileId() {
		return _createFileId;
	}

	@Override
	public void setCreateFileId(long createFileId) {
		_createFileId = createFileId;

		if (_createFileRemoteModel != null) {
			try {
				Class<?> clazz = _createFileRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateFileId", long.class);

				method.invoke(_createFileRemoteModel, createFileId);
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

		if (_createFileRemoteModel != null) {
			try {
				Class<?> clazz = _createFileRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_createFileRemoteModel, userId);
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

		if (_createFileRemoteModel != null) {
			try {
				Class<?> clazz = _createFileRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_createFileRemoteModel, groupId);
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

		if (_createFileRemoteModel != null) {
			try {
				Class<?> clazz = _createFileRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_createFileRemoteModel, companyId);
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

		if (_createFileRemoteModel != null) {
			try {
				Class<?> clazz = _createFileRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_createFileRemoteModel, createDate);
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

		if (_createFileRemoteModel != null) {
			try {
				Class<?> clazz = _createFileRemoteModel.getClass();

				Method method = clazz.getMethod("setProcessOrderId", long.class);

				method.invoke(_createFileRemoteModel, processOrderId);
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

		if (_createFileRemoteModel != null) {
			try {
				Class<?> clazz = _createFileRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierStepId", long.class);

				method.invoke(_createFileRemoteModel, dossierStepId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getStepDate() {
		return _stepDate;
	}

	@Override
	public void setStepDate(Date stepDate) {
		_stepDate = stepDate;

		if (_createFileRemoteModel != null) {
			try {
				Class<?> clazz = _createFileRemoteModel.getClass();

				Method method = clazz.getMethod("setStepDate", Date.class);

				method.invoke(_createFileRemoteModel, stepDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDocFileId() {
		return _docFileId;
	}

	@Override
	public void setDocFileId(long docFileId) {
		_docFileId = docFileId;

		if (_createFileRemoteModel != null) {
			try {
				Class<?> clazz = _createFileRemoteModel.getClass();

				Method method = clazz.getMethod("setDocFileId", long.class);

				method.invoke(_createFileRemoteModel, docFileId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCreateFileRemoteModel() {
		return _createFileRemoteModel;
	}

	public void setCreateFileRemoteModel(BaseModel<?> createFileRemoteModel) {
		_createFileRemoteModel = createFileRemoteModel;
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

		Class<?> remoteModelClass = _createFileRemoteModel.getClass();

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

		Object returnValue = method.invoke(_createFileRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CreateFileLocalServiceUtil.addCreateFile(this);
		}
		else {
			CreateFileLocalServiceUtil.updateCreateFile(this);
		}
	}

	@Override
	public CreateFile toEscapedModel() {
		return (CreateFile)ProxyUtil.newProxyInstance(CreateFile.class.getClassLoader(),
			new Class[] { CreateFile.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CreateFileClp clone = new CreateFileClp();

		clone.setCreateFileId(getCreateFileId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setProcessOrderId(getProcessOrderId());
		clone.setDossierStepId(getDossierStepId());
		clone.setStepDate(getStepDate());
		clone.setDocFileId(getDocFileId());

		return clone;
	}

	@Override
	public int compareTo(CreateFile createFile) {
		long primaryKey = createFile.getPrimaryKey();

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

		if (!(obj instanceof CreateFileClp)) {
			return false;
		}

		CreateFileClp createFile = (CreateFileClp)obj;

		long primaryKey = createFile.getPrimaryKey();

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
		StringBundler sb = new StringBundler(19);

		sb.append("{createFileId=");
		sb.append(getCreateFileId());
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
		sb.append(", stepDate=");
		sb.append(getStepDate());
		sb.append(", docFileId=");
		sb.append(getDocFileId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("org.oep.processmgt.model.CreateFile");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>createFileId</column-name><column-value><![CDATA[");
		sb.append(getCreateFileId());
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
			"<column><column-name>stepDate</column-name><column-value><![CDATA[");
		sb.append(getStepDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>docFileId</column-name><column-value><![CDATA[");
		sb.append(getDocFileId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _createFileId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private long _processOrderId;
	private long _dossierStepId;
	private Date _stepDate;
	private long _docFileId;
	private BaseModel<?> _createFileRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.processmgt.service.ClpSerializer.class;
}