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
import org.oep.core.processmgt.service.DossierStepLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class DossierStepClp extends BaseModelImpl<DossierStep>
	implements DossierStep {
	public DossierStepClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DossierStep.class;
	}

	@Override
	public String getModelClassName() {
		return DossierStep.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _dossierStepId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDossierStepId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dossierStepId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dossierStepId", getDossierStepId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dossierProcessId", getDossierProcessId());
		attributes.put("title", getTitle());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("stepType", getStepType());
		attributes.put("doForm", getDoForm());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dossierStepId = (Long)attributes.get("dossierStepId");

		if (dossierStepId != null) {
			setDossierStepId(dossierStepId);
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

		Long dossierProcessId = (Long)attributes.get("dossierProcessId");

		if (dossierProcessId != null) {
			setDossierProcessId(dossierProcessId);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		Integer sequenceNo = (Integer)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		Integer stepType = (Integer)attributes.get("stepType");

		if (stepType != null) {
			setStepType(stepType);
		}

		String doForm = (String)attributes.get("doForm");

		if (doForm != null) {
			setDoForm(doForm);
		}
	}

	@Override
	public long getDossierStepId() {
		return _dossierStepId;
	}

	@Override
	public void setDossierStepId(long dossierStepId) {
		_dossierStepId = dossierStepId;

		if (_dossierStepRemoteModel != null) {
			try {
				Class<?> clazz = _dossierStepRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierStepId", long.class);

				method.invoke(_dossierStepRemoteModel, dossierStepId);
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

		if (_dossierStepRemoteModel != null) {
			try {
				Class<?> clazz = _dossierStepRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_dossierStepRemoteModel, userId);
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

		if (_dossierStepRemoteModel != null) {
			try {
				Class<?> clazz = _dossierStepRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_dossierStepRemoteModel, groupId);
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

		if (_dossierStepRemoteModel != null) {
			try {
				Class<?> clazz = _dossierStepRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_dossierStepRemoteModel, companyId);
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

		if (_dossierStepRemoteModel != null) {
			try {
				Class<?> clazz = _dossierStepRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_dossierStepRemoteModel, createDate);
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

		if (_dossierStepRemoteModel != null) {
			try {
				Class<?> clazz = _dossierStepRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dossierStepRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDossierProcessId() {
		return _dossierProcessId;
	}

	@Override
	public void setDossierProcessId(long dossierProcessId) {
		_dossierProcessId = dossierProcessId;

		if (_dossierStepRemoteModel != null) {
			try {
				Class<?> clazz = _dossierStepRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierProcessId",
						long.class);

				method.invoke(_dossierStepRemoteModel, dossierProcessId);
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

		if (_dossierStepRemoteModel != null) {
			try {
				Class<?> clazz = _dossierStepRemoteModel.getClass();

				Method method = clazz.getMethod("setTitle", String.class);

				method.invoke(_dossierStepRemoteModel, title);
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

		if (_dossierStepRemoteModel != null) {
			try {
				Class<?> clazz = _dossierStepRemoteModel.getClass();

				Method method = clazz.getMethod("setSequenceNo", int.class);

				method.invoke(_dossierStepRemoteModel, sequenceNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getStepType() {
		return _stepType;
	}

	@Override
	public void setStepType(int stepType) {
		_stepType = stepType;

		if (_dossierStepRemoteModel != null) {
			try {
				Class<?> clazz = _dossierStepRemoteModel.getClass();

				Method method = clazz.getMethod("setStepType", int.class);

				method.invoke(_dossierStepRemoteModel, stepType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDoForm() {
		return _doForm;
	}

	@Override
	public void setDoForm(String doForm) {
		_doForm = doForm;

		if (_dossierStepRemoteModel != null) {
			try {
				Class<?> clazz = _dossierStepRemoteModel.getClass();

				Method method = clazz.getMethod("setDoForm", String.class);

				method.invoke(_dossierStepRemoteModel, doForm);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDossierStepRemoteModel() {
		return _dossierStepRemoteModel;
	}

	public void setDossierStepRemoteModel(BaseModel<?> dossierStepRemoteModel) {
		_dossierStepRemoteModel = dossierStepRemoteModel;
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

		Class<?> remoteModelClass = _dossierStepRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dossierStepRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DossierStepLocalServiceUtil.addDossierStep(this);
		}
		else {
			DossierStepLocalServiceUtil.updateDossierStep(this);
		}
	}

	@Override
	public DossierStep toEscapedModel() {
		return (DossierStep)ProxyUtil.newProxyInstance(DossierStep.class.getClassLoader(),
			new Class[] { DossierStep.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DossierStepClp clone = new DossierStepClp();

		clone.setDossierStepId(getDossierStepId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setDossierProcessId(getDossierProcessId());
		clone.setTitle(getTitle());
		clone.setSequenceNo(getSequenceNo());
		clone.setStepType(getStepType());
		clone.setDoForm(getDoForm());

		return clone;
	}

	@Override
	public int compareTo(DossierStep dossierStep) {
		long primaryKey = dossierStep.getPrimaryKey();

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

		if (!(obj instanceof DossierStepClp)) {
			return false;
		}

		DossierStepClp dossierStep = (DossierStepClp)obj;

		long primaryKey = dossierStep.getPrimaryKey();

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
		StringBundler sb = new StringBundler(23);

		sb.append("{dossierStepId=");
		sb.append(getDossierStepId());
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
		sb.append(", dossierProcessId=");
		sb.append(getDossierProcessId());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", sequenceNo=");
		sb.append(getSequenceNo());
		sb.append(", stepType=");
		sb.append(getStepType());
		sb.append(", doForm=");
		sb.append(getDoForm());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.processmgt.model.DossierStep");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>dossierStepId</column-name><column-value><![CDATA[");
		sb.append(getDossierStepId());
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
			"<column><column-name>dossierProcessId</column-name><column-value><![CDATA[");
		sb.append(getDossierProcessId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sequenceNo</column-name><column-value><![CDATA[");
		sb.append(getSequenceNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stepType</column-name><column-value><![CDATA[");
		sb.append(getStepType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>doForm</column-name><column-value><![CDATA[");
		sb.append(getDoForm());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _dossierStepId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _dossierProcessId;
	private String _title;
	private int _sequenceNo;
	private int _stepType;
	private String _doForm;
	private BaseModel<?> _dossierStepRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.processmgt.service.ClpSerializer.class;
}