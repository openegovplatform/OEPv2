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
import org.oep.core.dossiermgt.service.DocFileVersionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class DocFileVersionClp extends BaseModelImpl<DocFileVersion>
	implements DocFileVersion {
	public DocFileVersionClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DocFileVersion.class;
	}

	@Override
	public String getModelClassName() {
		return DocFileVersion.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _docFileVersionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDocFileVersionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _docFileVersionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("docFileVersionId", getDocFileVersionId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("docFileId", getDocFileId());
		attributes.put("fileEntryId", getFileEntryId());
		attributes.put("xmlContent", getXmlContent());
		attributes.put("issueDate", getIssueDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long docFileVersionId = (Long)attributes.get("docFileVersionId");

		if (docFileVersionId != null) {
			setDocFileVersionId(docFileVersionId);
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

		Long docFileId = (Long)attributes.get("docFileId");

		if (docFileId != null) {
			setDocFileId(docFileId);
		}

		Long fileEntryId = (Long)attributes.get("fileEntryId");

		if (fileEntryId != null) {
			setFileEntryId(fileEntryId);
		}

		String xmlContent = (String)attributes.get("xmlContent");

		if (xmlContent != null) {
			setXmlContent(xmlContent);
		}

		Date issueDate = (Date)attributes.get("issueDate");

		if (issueDate != null) {
			setIssueDate(issueDate);
		}
	}

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_docFileVersionRemoteModel != null) {
			try {
				Class<?> clazz = _docFileVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_docFileVersionRemoteModel, uuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDocFileVersionId() {
		return _docFileVersionId;
	}

	@Override
	public void setDocFileVersionId(long docFileVersionId) {
		_docFileVersionId = docFileVersionId;

		if (_docFileVersionRemoteModel != null) {
			try {
				Class<?> clazz = _docFileVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setDocFileVersionId",
						long.class);

				method.invoke(_docFileVersionRemoteModel, docFileVersionId);
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

		if (_docFileVersionRemoteModel != null) {
			try {
				Class<?> clazz = _docFileVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_docFileVersionRemoteModel, userId);
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

		if (_docFileVersionRemoteModel != null) {
			try {
				Class<?> clazz = _docFileVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_docFileVersionRemoteModel, groupId);
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

		if (_docFileVersionRemoteModel != null) {
			try {
				Class<?> clazz = _docFileVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_docFileVersionRemoteModel, companyId);
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

		if (_docFileVersionRemoteModel != null) {
			try {
				Class<?> clazz = _docFileVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_docFileVersionRemoteModel, createDate);
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

		if (_docFileVersionRemoteModel != null) {
			try {
				Class<?> clazz = _docFileVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setDocFileId", long.class);

				method.invoke(_docFileVersionRemoteModel, docFileId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getFileEntryId() {
		return _fileEntryId;
	}

	@Override
	public void setFileEntryId(long fileEntryId) {
		_fileEntryId = fileEntryId;

		if (_docFileVersionRemoteModel != null) {
			try {
				Class<?> clazz = _docFileVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setFileEntryId", long.class);

				method.invoke(_docFileVersionRemoteModel, fileEntryId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXmlContent() {
		return _xmlContent;
	}

	@Override
	public void setXmlContent(String xmlContent) {
		_xmlContent = xmlContent;

		if (_docFileVersionRemoteModel != null) {
			try {
				Class<?> clazz = _docFileVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setXmlContent", String.class);

				method.invoke(_docFileVersionRemoteModel, xmlContent);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getIssueDate() {
		return _issueDate;
	}

	@Override
	public void setIssueDate(Date issueDate) {
		_issueDate = issueDate;

		if (_docFileVersionRemoteModel != null) {
			try {
				Class<?> clazz = _docFileVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setIssueDate", Date.class);

				method.invoke(_docFileVersionRemoteModel, issueDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDocFileVersionRemoteModel() {
		return _docFileVersionRemoteModel;
	}

	public void setDocFileVersionRemoteModel(
		BaseModel<?> docFileVersionRemoteModel) {
		_docFileVersionRemoteModel = docFileVersionRemoteModel;
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

		Class<?> remoteModelClass = _docFileVersionRemoteModel.getClass();

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

		Object returnValue = method.invoke(_docFileVersionRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DocFileVersionLocalServiceUtil.addDocFileVersion(this);
		}
		else {
			DocFileVersionLocalServiceUtil.updateDocFileVersion(this);
		}
	}

	@Override
	public DocFileVersion toEscapedModel() {
		return (DocFileVersion)ProxyUtil.newProxyInstance(DocFileVersion.class.getClassLoader(),
			new Class[] { DocFileVersion.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DocFileVersionClp clone = new DocFileVersionClp();

		clone.setUuid(getUuid());
		clone.setDocFileVersionId(getDocFileVersionId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setDocFileId(getDocFileId());
		clone.setFileEntryId(getFileEntryId());
		clone.setXmlContent(getXmlContent());
		clone.setIssueDate(getIssueDate());

		return clone;
	}

	@Override
	public int compareTo(DocFileVersion docFileVersion) {
		long primaryKey = docFileVersion.getPrimaryKey();

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

		if (!(obj instanceof DocFileVersionClp)) {
			return false;
		}

		DocFileVersionClp docFileVersion = (DocFileVersionClp)obj;

		long primaryKey = docFileVersion.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", docFileVersionId=");
		sb.append(getDocFileVersionId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", docFileId=");
		sb.append(getDocFileId());
		sb.append(", fileEntryId=");
		sb.append(getFileEntryId());
		sb.append(", xmlContent=");
		sb.append(getXmlContent());
		sb.append(", issueDate=");
		sb.append(getIssueDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.dossiermgt.model.DocFileVersion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>docFileVersionId</column-name><column-value><![CDATA[");
		sb.append(getDocFileVersionId());
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
			"<column><column-name>docFileId</column-name><column-value><![CDATA[");
		sb.append(getDocFileId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileEntryId</column-name><column-value><![CDATA[");
		sb.append(getFileEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>xmlContent</column-name><column-value><![CDATA[");
		sb.append(getXmlContent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>issueDate</column-name><column-value><![CDATA[");
		sb.append(getIssueDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _docFileVersionId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private long _docFileId;
	private long _fileEntryId;
	private String _xmlContent;
	private Date _issueDate;
	private BaseModel<?> _docFileVersionRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.dossiermgt.service.ClpSerializer.class;
}