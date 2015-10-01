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
import org.oep.core.dossiermgt.service.DossierDocLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class DossierDocClp extends BaseModelImpl<DossierDoc>
	implements DossierDoc {
	public DossierDocClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DossierDoc.class;
	}

	@Override
	public String getModelClassName() {
		return DossierDoc.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _dossierDocId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDossierDocId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dossierDocId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dossierDocId", getDossierDocId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dossierProcId", getDossierProcId());
		attributes.put("dossierDocNo", getDossierDocNo());
		attributes.put("dossierDocName", getDossierDocName());
		attributes.put("note", getNote());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("defaultDocTemplateId", getDefaultDocTemplateId());
		attributes.put("validationType", getValidationType());
		attributes.put("numberOfFile", getNumberOfFile());
		attributes.put("onlineForm", getOnlineForm());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dossierDocId = (Long)attributes.get("dossierDocId");

		if (dossierDocId != null) {
			setDossierDocId(dossierDocId);
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

		Long dossierProcId = (Long)attributes.get("dossierProcId");

		if (dossierProcId != null) {
			setDossierProcId(dossierProcId);
		}

		String dossierDocNo = (String)attributes.get("dossierDocNo");

		if (dossierDocNo != null) {
			setDossierDocNo(dossierDocNo);
		}

		String dossierDocName = (String)attributes.get("dossierDocName");

		if (dossierDocName != null) {
			setDossierDocName(dossierDocName);
		}

		String note = (String)attributes.get("note");

		if (note != null) {
			setNote(note);
		}

		Integer sequenceNo = (Integer)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		Long defaultDocTemplateId = (Long)attributes.get("defaultDocTemplateId");

		if (defaultDocTemplateId != null) {
			setDefaultDocTemplateId(defaultDocTemplateId);
		}

		Integer validationType = (Integer)attributes.get("validationType");

		if (validationType != null) {
			setValidationType(validationType);
		}

		Integer numberOfFile = (Integer)attributes.get("numberOfFile");

		if (numberOfFile != null) {
			setNumberOfFile(numberOfFile);
		}

		String onlineForm = (String)attributes.get("onlineForm");

		if (onlineForm != null) {
			setOnlineForm(onlineForm);
		}
	}

	@Override
	public long getDossierDocId() {
		return _dossierDocId;
	}

	@Override
	public void setDossierDocId(long dossierDocId) {
		_dossierDocId = dossierDocId;

		if (_dossierDocRemoteModel != null) {
			try {
				Class<?> clazz = _dossierDocRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierDocId", long.class);

				method.invoke(_dossierDocRemoteModel, dossierDocId);
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

		if (_dossierDocRemoteModel != null) {
			try {
				Class<?> clazz = _dossierDocRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_dossierDocRemoteModel, userId);
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

		if (_dossierDocRemoteModel != null) {
			try {
				Class<?> clazz = _dossierDocRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_dossierDocRemoteModel, groupId);
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

		if (_dossierDocRemoteModel != null) {
			try {
				Class<?> clazz = _dossierDocRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_dossierDocRemoteModel, companyId);
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

		if (_dossierDocRemoteModel != null) {
			try {
				Class<?> clazz = _dossierDocRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_dossierDocRemoteModel, createDate);
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

		if (_dossierDocRemoteModel != null) {
			try {
				Class<?> clazz = _dossierDocRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dossierDocRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDossierProcId() {
		return _dossierProcId;
	}

	@Override
	public void setDossierProcId(long dossierProcId) {
		_dossierProcId = dossierProcId;

		if (_dossierDocRemoteModel != null) {
			try {
				Class<?> clazz = _dossierDocRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierProcId", long.class);

				method.invoke(_dossierDocRemoteModel, dossierProcId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDossierDocNo() {
		return _dossierDocNo;
	}

	@Override
	public void setDossierDocNo(String dossierDocNo) {
		_dossierDocNo = dossierDocNo;

		if (_dossierDocRemoteModel != null) {
			try {
				Class<?> clazz = _dossierDocRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierDocNo", String.class);

				method.invoke(_dossierDocRemoteModel, dossierDocNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDossierDocName() {
		return _dossierDocName;
	}

	@Override
	public void setDossierDocName(String dossierDocName) {
		_dossierDocName = dossierDocName;

		if (_dossierDocRemoteModel != null) {
			try {
				Class<?> clazz = _dossierDocRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierDocName",
						String.class);

				method.invoke(_dossierDocRemoteModel, dossierDocName);
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

		if (_dossierDocRemoteModel != null) {
			try {
				Class<?> clazz = _dossierDocRemoteModel.getClass();

				Method method = clazz.getMethod("setNote", String.class);

				method.invoke(_dossierDocRemoteModel, note);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSequenceNo() {
		return _sequenceNo;
	}

	@Override
	public void setSequenceNo(int sequenceNo) {
		_sequenceNo = sequenceNo;

		if (_dossierDocRemoteModel != null) {
			try {
				Class<?> clazz = _dossierDocRemoteModel.getClass();

				Method method = clazz.getMethod("setSequenceNo", int.class);

				method.invoke(_dossierDocRemoteModel, sequenceNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDefaultDocTemplateId() {
		return _defaultDocTemplateId;
	}

	@Override
	public void setDefaultDocTemplateId(long defaultDocTemplateId) {
		_defaultDocTemplateId = defaultDocTemplateId;

		if (_dossierDocRemoteModel != null) {
			try {
				Class<?> clazz = _dossierDocRemoteModel.getClass();

				Method method = clazz.getMethod("setDefaultDocTemplateId",
						long.class);

				method.invoke(_dossierDocRemoteModel, defaultDocTemplateId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getValidationType() {
		return _validationType;
	}

	@Override
	public void setValidationType(int validationType) {
		_validationType = validationType;

		if (_dossierDocRemoteModel != null) {
			try {
				Class<?> clazz = _dossierDocRemoteModel.getClass();

				Method method = clazz.getMethod("setValidationType", int.class);

				method.invoke(_dossierDocRemoteModel, validationType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNumberOfFile() {
		return _numberOfFile;
	}

	@Override
	public void setNumberOfFile(int numberOfFile) {
		_numberOfFile = numberOfFile;

		if (_dossierDocRemoteModel != null) {
			try {
				Class<?> clazz = _dossierDocRemoteModel.getClass();

				Method method = clazz.getMethod("setNumberOfFile", int.class);

				method.invoke(_dossierDocRemoteModel, numberOfFile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOnlineForm() {
		return _onlineForm;
	}

	@Override
	public void setOnlineForm(String onlineForm) {
		_onlineForm = onlineForm;

		if (_dossierDocRemoteModel != null) {
			try {
				Class<?> clazz = _dossierDocRemoteModel.getClass();

				Method method = clazz.getMethod("setOnlineForm", String.class);

				method.invoke(_dossierDocRemoteModel, onlineForm);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDossierDocRemoteModel() {
		return _dossierDocRemoteModel;
	}

	public void setDossierDocRemoteModel(BaseModel<?> dossierDocRemoteModel) {
		_dossierDocRemoteModel = dossierDocRemoteModel;
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

		Class<?> remoteModelClass = _dossierDocRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dossierDocRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DossierDocLocalServiceUtil.addDossierDoc(this);
		}
		else {
			DossierDocLocalServiceUtil.updateDossierDoc(this);
		}
	}

	@Override
	public DossierDoc toEscapedModel() {
		return (DossierDoc)ProxyUtil.newProxyInstance(DossierDoc.class.getClassLoader(),
			new Class[] { DossierDoc.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DossierDocClp clone = new DossierDocClp();

		clone.setDossierDocId(getDossierDocId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setDossierProcId(getDossierProcId());
		clone.setDossierDocNo(getDossierDocNo());
		clone.setDossierDocName(getDossierDocName());
		clone.setNote(getNote());
		clone.setSequenceNo(getSequenceNo());
		clone.setDefaultDocTemplateId(getDefaultDocTemplateId());
		clone.setValidationType(getValidationType());
		clone.setNumberOfFile(getNumberOfFile());
		clone.setOnlineForm(getOnlineForm());

		return clone;
	}

	@Override
	public int compareTo(DossierDoc dossierDoc) {
		long primaryKey = dossierDoc.getPrimaryKey();

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

		if (!(obj instanceof DossierDocClp)) {
			return false;
		}

		DossierDocClp dossierDoc = (DossierDocClp)obj;

		long primaryKey = dossierDoc.getPrimaryKey();

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

		sb.append("{dossierDocId=");
		sb.append(getDossierDocId());
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
		sb.append(", dossierProcId=");
		sb.append(getDossierProcId());
		sb.append(", dossierDocNo=");
		sb.append(getDossierDocNo());
		sb.append(", dossierDocName=");
		sb.append(getDossierDocName());
		sb.append(", note=");
		sb.append(getNote());
		sb.append(", sequenceNo=");
		sb.append(getSequenceNo());
		sb.append(", defaultDocTemplateId=");
		sb.append(getDefaultDocTemplateId());
		sb.append(", validationType=");
		sb.append(getValidationType());
		sb.append(", numberOfFile=");
		sb.append(getNumberOfFile());
		sb.append(", onlineForm=");
		sb.append(getOnlineForm());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.dossiermgt.model.DossierDoc");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>dossierDocId</column-name><column-value><![CDATA[");
		sb.append(getDossierDocId());
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
			"<column><column-name>dossierProcId</column-name><column-value><![CDATA[");
		sb.append(getDossierProcId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierDocNo</column-name><column-value><![CDATA[");
		sb.append(getDossierDocNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierDocName</column-name><column-value><![CDATA[");
		sb.append(getDossierDocName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>note</column-name><column-value><![CDATA[");
		sb.append(getNote());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sequenceNo</column-name><column-value><![CDATA[");
		sb.append(getSequenceNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>defaultDocTemplateId</column-name><column-value><![CDATA[");
		sb.append(getDefaultDocTemplateId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>validationType</column-name><column-value><![CDATA[");
		sb.append(getValidationType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberOfFile</column-name><column-value><![CDATA[");
		sb.append(getNumberOfFile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>onlineForm</column-name><column-value><![CDATA[");
		sb.append(getOnlineForm());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _dossierDocId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _dossierProcId;
	private String _dossierDocNo;
	private String _dossierDocName;
	private String _note;
	private int _sequenceNo;
	private long _defaultDocTemplateId;
	private int _validationType;
	private int _numberOfFile;
	private String _onlineForm;
	private BaseModel<?> _dossierDocRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.dossiermgt.service.ClpSerializer.class;
}