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
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import org.oep.dossiermgt.service.ClpSerializer;
import org.oep.dossiermgt.service.DocFileLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class DocFileClp extends BaseModelImpl<DocFile> implements DocFile {
	public DocFileClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DocFile.class;
	}

	@Override
	public String getModelClassName() {
		return DocFile.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _docFileId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDocFileId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _docFileId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("docFileId", getDocFileId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dossierId", getDossierId());
		attributes.put("dossierDocId", getDossierDocId());
		attributes.put("docTemplateId", getDocTemplateId());
		attributes.put("docFileVersionId", getDocFileVersionId());
		attributes.put("docFileName", getDocFileName());
		attributes.put("docFileType", getDocFileType());
		attributes.put("verifyStatus", getVerifyStatus());
		attributes.put("note", getNote());
		attributes.put("approveBy", getApproveBy());
		attributes.put("approveDate", getApproveDate());
		attributes.put("premier", getPremier());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long docFileId = (Long)attributes.get("docFileId");

		if (docFileId != null) {
			setDocFileId(docFileId);
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

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		Long dossierDocId = (Long)attributes.get("dossierDocId");

		if (dossierDocId != null) {
			setDossierDocId(dossierDocId);
		}

		Long docTemplateId = (Long)attributes.get("docTemplateId");

		if (docTemplateId != null) {
			setDocTemplateId(docTemplateId);
		}

		Long docFileVersionId = (Long)attributes.get("docFileVersionId");

		if (docFileVersionId != null) {
			setDocFileVersionId(docFileVersionId);
		}

		String docFileName = (String)attributes.get("docFileName");

		if (docFileName != null) {
			setDocFileName(docFileName);
		}

		Long docFileType = (Long)attributes.get("docFileType");

		if (docFileType != null) {
			setDocFileType(docFileType);
		}

		Integer verifyStatus = (Integer)attributes.get("verifyStatus");

		if (verifyStatus != null) {
			setVerifyStatus(verifyStatus);
		}

		String note = (String)attributes.get("note");

		if (note != null) {
			setNote(note);
		}

		String approveBy = (String)attributes.get("approveBy");

		if (approveBy != null) {
			setApproveBy(approveBy);
		}

		Date approveDate = (Date)attributes.get("approveDate");

		if (approveDate != null) {
			setApproveDate(approveDate);
		}

		Integer premier = (Integer)attributes.get("premier");

		if (premier != null) {
			setPremier(premier);
		}
	}

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_docFileRemoteModel != null) {
			try {
				Class<?> clazz = _docFileRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_docFileRemoteModel, uuid);
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

		if (_docFileRemoteModel != null) {
			try {
				Class<?> clazz = _docFileRemoteModel.getClass();

				Method method = clazz.getMethod("setDocFileId", long.class);

				method.invoke(_docFileRemoteModel, docFileId);
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

		if (_docFileRemoteModel != null) {
			try {
				Class<?> clazz = _docFileRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_docFileRemoteModel, userId);
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

		if (_docFileRemoteModel != null) {
			try {
				Class<?> clazz = _docFileRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_docFileRemoteModel, groupId);
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

		if (_docFileRemoteModel != null) {
			try {
				Class<?> clazz = _docFileRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_docFileRemoteModel, companyId);
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

		if (_docFileRemoteModel != null) {
			try {
				Class<?> clazz = _docFileRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_docFileRemoteModel, createDate);
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

		if (_docFileRemoteModel != null) {
			try {
				Class<?> clazz = _docFileRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_docFileRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDossierId() {
		return _dossierId;
	}

	@Override
	public void setDossierId(long dossierId) {
		_dossierId = dossierId;

		if (_docFileRemoteModel != null) {
			try {
				Class<?> clazz = _docFileRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierId", long.class);

				method.invoke(_docFileRemoteModel, dossierId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDossierDocId() {
		return _dossierDocId;
	}

	@Override
	public void setDossierDocId(long dossierDocId) {
		_dossierDocId = dossierDocId;

		if (_docFileRemoteModel != null) {
			try {
				Class<?> clazz = _docFileRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierDocId", long.class);

				method.invoke(_docFileRemoteModel, dossierDocId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDocTemplateId() {
		return _docTemplateId;
	}

	@Override
	public void setDocTemplateId(long docTemplateId) {
		_docTemplateId = docTemplateId;

		if (_docFileRemoteModel != null) {
			try {
				Class<?> clazz = _docFileRemoteModel.getClass();

				Method method = clazz.getMethod("setDocTemplateId", long.class);

				method.invoke(_docFileRemoteModel, docTemplateId);
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

		if (_docFileRemoteModel != null) {
			try {
				Class<?> clazz = _docFileRemoteModel.getClass();

				Method method = clazz.getMethod("setDocFileVersionId",
						long.class);

				method.invoke(_docFileRemoteModel, docFileVersionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDocFileName() {
		return _docFileName;
	}

	@Override
	public void setDocFileName(String docFileName) {
		_docFileName = docFileName;

		if (_docFileRemoteModel != null) {
			try {
				Class<?> clazz = _docFileRemoteModel.getClass();

				Method method = clazz.getMethod("setDocFileName", String.class);

				method.invoke(_docFileRemoteModel, docFileName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDocFileType() {
		return _docFileType;
	}

	@Override
	public void setDocFileType(long docFileType) {
		_docFileType = docFileType;

		if (_docFileRemoteModel != null) {
			try {
				Class<?> clazz = _docFileRemoteModel.getClass();

				Method method = clazz.getMethod("setDocFileType", long.class);

				method.invoke(_docFileRemoteModel, docFileType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getVerifyStatus() {
		return _verifyStatus;
	}

	@Override
	public void setVerifyStatus(int verifyStatus) {
		_verifyStatus = verifyStatus;

		if (_docFileRemoteModel != null) {
			try {
				Class<?> clazz = _docFileRemoteModel.getClass();

				Method method = clazz.getMethod("setVerifyStatus", int.class);

				method.invoke(_docFileRemoteModel, verifyStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNote() {
		return _note;
	}

	@Override
	public void setNote(String note) {
		_note = note;

		if (_docFileRemoteModel != null) {
			try {
				Class<?> clazz = _docFileRemoteModel.getClass();

				Method method = clazz.getMethod("setNote", String.class);

				method.invoke(_docFileRemoteModel, note);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getApproveBy() {
		return _approveBy;
	}

	@Override
	public void setApproveBy(String approveBy) {
		_approveBy = approveBy;

		if (_docFileRemoteModel != null) {
			try {
				Class<?> clazz = _docFileRemoteModel.getClass();

				Method method = clazz.getMethod("setApproveBy", String.class);

				method.invoke(_docFileRemoteModel, approveBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getApproveDate() {
		return _approveDate;
	}

	@Override
	public void setApproveDate(Date approveDate) {
		_approveDate = approveDate;

		if (_docFileRemoteModel != null) {
			try {
				Class<?> clazz = _docFileRemoteModel.getClass();

				Method method = clazz.getMethod("setApproveDate", Date.class);

				method.invoke(_docFileRemoteModel, approveDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPremier() {
		return _premier;
	}

	@Override
	public void setPremier(int premier) {
		_premier = premier;

		if (_docFileRemoteModel != null) {
			try {
				Class<?> clazz = _docFileRemoteModel.getClass();

				Method method = clazz.getMethod("setPremier", int.class);

				method.invoke(_docFileRemoteModel, premier);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				DocFile.class.getName()));
	}

	public BaseModel<?> getDocFileRemoteModel() {
		return _docFileRemoteModel;
	}

	public void setDocFileRemoteModel(BaseModel<?> docFileRemoteModel) {
		_docFileRemoteModel = docFileRemoteModel;
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

		Class<?> remoteModelClass = _docFileRemoteModel.getClass();

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

		Object returnValue = method.invoke(_docFileRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DocFileLocalServiceUtil.addDocFile(this);
		}
		else {
			DocFileLocalServiceUtil.updateDocFile(this);
		}
	}

	@Override
	public DocFile toEscapedModel() {
		return (DocFile)ProxyUtil.newProxyInstance(DocFile.class.getClassLoader(),
			new Class[] { DocFile.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DocFileClp clone = new DocFileClp();

		clone.setUuid(getUuid());
		clone.setDocFileId(getDocFileId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setDossierId(getDossierId());
		clone.setDossierDocId(getDossierDocId());
		clone.setDocTemplateId(getDocTemplateId());
		clone.setDocFileVersionId(getDocFileVersionId());
		clone.setDocFileName(getDocFileName());
		clone.setDocFileType(getDocFileType());
		clone.setVerifyStatus(getVerifyStatus());
		clone.setNote(getNote());
		clone.setApproveBy(getApproveBy());
		clone.setApproveDate(getApproveDate());
		clone.setPremier(getPremier());

		return clone;
	}

	@Override
	public int compareTo(DocFile docFile) {
		long primaryKey = docFile.getPrimaryKey();

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

		if (!(obj instanceof DocFileClp)) {
			return false;
		}

		DocFileClp docFile = (DocFileClp)obj;

		long primaryKey = docFile.getPrimaryKey();

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
		StringBundler sb = new StringBundler(37);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", docFileId=");
		sb.append(getDocFileId());
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
		sb.append(", dossierId=");
		sb.append(getDossierId());
		sb.append(", dossierDocId=");
		sb.append(getDossierDocId());
		sb.append(", docTemplateId=");
		sb.append(getDocTemplateId());
		sb.append(", docFileVersionId=");
		sb.append(getDocFileVersionId());
		sb.append(", docFileName=");
		sb.append(getDocFileName());
		sb.append(", docFileType=");
		sb.append(getDocFileType());
		sb.append(", verifyStatus=");
		sb.append(getVerifyStatus());
		sb.append(", note=");
		sb.append(getNote());
		sb.append(", approveBy=");
		sb.append(getApproveBy());
		sb.append(", approveDate=");
		sb.append(getApproveDate());
		sb.append(", premier=");
		sb.append(getPremier());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(58);

		sb.append("<model><model-name>");
		sb.append("org.oep.dossiermgt.model.DocFile");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>docFileId</column-name><column-value><![CDATA[");
		sb.append(getDocFileId());
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
			"<column><column-name>dossierId</column-name><column-value><![CDATA[");
		sb.append(getDossierId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierDocId</column-name><column-value><![CDATA[");
		sb.append(getDossierDocId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>docTemplateId</column-name><column-value><![CDATA[");
		sb.append(getDocTemplateId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>docFileVersionId</column-name><column-value><![CDATA[");
		sb.append(getDocFileVersionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>docFileName</column-name><column-value><![CDATA[");
		sb.append(getDocFileName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>docFileType</column-name><column-value><![CDATA[");
		sb.append(getDocFileType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>verifyStatus</column-name><column-value><![CDATA[");
		sb.append(getVerifyStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>note</column-name><column-value><![CDATA[");
		sb.append(getNote());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approveBy</column-name><column-value><![CDATA[");
		sb.append(getApproveBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approveDate</column-name><column-value><![CDATA[");
		sb.append(getApproveDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>premier</column-name><column-value><![CDATA[");
		sb.append(getPremier());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _docFileId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _dossierId;
	private long _dossierDocId;
	private long _docTemplateId;
	private long _docFileVersionId;
	private String _docFileName;
	private long _docFileType;
	private int _verifyStatus;
	private String _note;
	private String _approveBy;
	private Date _approveDate;
	private int _premier;
	private BaseModel<?> _docFileRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.dossiermgt.service.ClpSerializer.class;
}