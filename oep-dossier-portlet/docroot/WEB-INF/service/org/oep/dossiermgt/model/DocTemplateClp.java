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

package org.oep.dossiermgt.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import org.oep.dossiermgt.service.ClpSerializer;
import org.oep.dossiermgt.service.DocTemplateLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class DocTemplateClp extends BaseModelImpl<DocTemplate>
	implements DocTemplate {
	public DocTemplateClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DocTemplate.class;
	}

	@Override
	public String getModelClassName() {
		return DocTemplate.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _docTemplateId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDocTemplateId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _docTemplateId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("docTemplateId", getDocTemplateId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("templateNo", getTemplateNo());
		attributes.put("title", getTitle());
		attributes.put("enTitle", getEnTitle());
		attributes.put("fileEntryId", getFileEntryId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long docTemplateId = (Long)attributes.get("docTemplateId");

		if (docTemplateId != null) {
			setDocTemplateId(docTemplateId);
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

		String templateNo = (String)attributes.get("templateNo");

		if (templateNo != null) {
			setTemplateNo(templateNo);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String enTitle = (String)attributes.get("enTitle");

		if (enTitle != null) {
			setEnTitle(enTitle);
		}

		Long fileEntryId = (Long)attributes.get("fileEntryId");

		if (fileEntryId != null) {
			setFileEntryId(fileEntryId);
		}
	}

	@Override
	public long getDocTemplateId() {
		return _docTemplateId;
	}

	@Override
	public void setDocTemplateId(long docTemplateId) {
		_docTemplateId = docTemplateId;

		if (_docTemplateRemoteModel != null) {
			try {
				Class<?> clazz = _docTemplateRemoteModel.getClass();

				Method method = clazz.getMethod("setDocTemplateId", long.class);

				method.invoke(_docTemplateRemoteModel, docTemplateId);
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

		if (_docTemplateRemoteModel != null) {
			try {
				Class<?> clazz = _docTemplateRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_docTemplateRemoteModel, userId);
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

		if (_docTemplateRemoteModel != null) {
			try {
				Class<?> clazz = _docTemplateRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_docTemplateRemoteModel, groupId);
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

		if (_docTemplateRemoteModel != null) {
			try {
				Class<?> clazz = _docTemplateRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_docTemplateRemoteModel, companyId);
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

		if (_docTemplateRemoteModel != null) {
			try {
				Class<?> clazz = _docTemplateRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_docTemplateRemoteModel, createDate);
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

		if (_docTemplateRemoteModel != null) {
			try {
				Class<?> clazz = _docTemplateRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_docTemplateRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTemplateNo() {
		return _templateNo;
	}

	@Override
	public void setTemplateNo(String templateNo) {
		_templateNo = templateNo;

		if (_docTemplateRemoteModel != null) {
			try {
				Class<?> clazz = _docTemplateRemoteModel.getClass();

				Method method = clazz.getMethod("setTemplateNo", String.class);

				method.invoke(_docTemplateRemoteModel, templateNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTitle() {
		return _title;
	}

	@Override
	public void setTitle(String title) {
		_title = title;

		if (_docTemplateRemoteModel != null) {
			try {
				Class<?> clazz = _docTemplateRemoteModel.getClass();

				Method method = clazz.getMethod("setTitle", String.class);

				method.invoke(_docTemplateRemoteModel, title);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEnTitle() {
		return _enTitle;
	}

	@Override
	public void setEnTitle(String enTitle) {
		_enTitle = enTitle;

		if (_docTemplateRemoteModel != null) {
			try {
				Class<?> clazz = _docTemplateRemoteModel.getClass();

				Method method = clazz.getMethod("setEnTitle", String.class);

				method.invoke(_docTemplateRemoteModel, enTitle);
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

		if (_docTemplateRemoteModel != null) {
			try {
				Class<?> clazz = _docTemplateRemoteModel.getClass();

				Method method = clazz.getMethod("setFileEntryId", long.class);

				method.invoke(_docTemplateRemoteModel, fileEntryId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDocTemplateRemoteModel() {
		return _docTemplateRemoteModel;
	}

	public void setDocTemplateRemoteModel(BaseModel<?> docTemplateRemoteModel) {
		_docTemplateRemoteModel = docTemplateRemoteModel;
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

		Class<?> remoteModelClass = _docTemplateRemoteModel.getClass();

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

		Object returnValue = method.invoke(_docTemplateRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DocTemplateLocalServiceUtil.addDocTemplate(this);
		}
		else {
			DocTemplateLocalServiceUtil.updateDocTemplate(this);
		}
	}

	@Override
	public DocTemplate toEscapedModel() {
		return (DocTemplate)ProxyUtil.newProxyInstance(DocTemplate.class.getClassLoader(),
			new Class[] { DocTemplate.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DocTemplateClp clone = new DocTemplateClp();

		clone.setDocTemplateId(getDocTemplateId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setTemplateNo(getTemplateNo());
		clone.setTitle(getTitle());
		clone.setEnTitle(getEnTitle());
		clone.setFileEntryId(getFileEntryId());

		return clone;
	}

	@Override
	public int compareTo(DocTemplate docTemplate) {
		long primaryKey = docTemplate.getPrimaryKey();

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

		if (!(obj instanceof DocTemplateClp)) {
			return false;
		}

		DocTemplateClp docTemplate = (DocTemplateClp)obj;

		long primaryKey = docTemplate.getPrimaryKey();

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

		sb.append("{docTemplateId=");
		sb.append(getDocTemplateId());
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
		sb.append(", templateNo=");
		sb.append(getTemplateNo());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", enTitle=");
		sb.append(getEnTitle());
		sb.append(", fileEntryId=");
		sb.append(getFileEntryId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("org.oep.dossiermgt.model.DocTemplate");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>docTemplateId</column-name><column-value><![CDATA[");
		sb.append(getDocTemplateId());
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
			"<column><column-name>templateNo</column-name><column-value><![CDATA[");
		sb.append(getTemplateNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enTitle</column-name><column-value><![CDATA[");
		sb.append(getEnTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileEntryId</column-name><column-value><![CDATA[");
		sb.append(getFileEntryId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _docTemplateId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _templateNo;
	private String _title;
	private String _enTitle;
	private long _fileEntryId;
	private BaseModel<?> _docTemplateRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.dossiermgt.service.ClpSerializer.class;
}