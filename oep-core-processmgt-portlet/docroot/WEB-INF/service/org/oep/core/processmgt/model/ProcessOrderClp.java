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
import org.oep.core.processmgt.service.ProcessOrderLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class ProcessOrderClp extends BaseModelImpl<ProcessOrder>
	implements ProcessOrder {
	public ProcessOrderClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ProcessOrder.class;
	}

	@Override
	public String getModelClassName() {
		return ProcessOrder.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _processOrderId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setProcessOrderId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _processOrderId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("processOrderId", getProcessOrderId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("organizationId", getOrganizationId());
		attributes.put("parentProcessOrderId", getParentProcessOrderId());
		attributes.put("dossierId", getDossierId());
		attributes.put("dossierProcessId", getDossierProcessId());
		attributes.put("dossierStepId", getDossierStepId());
		attributes.put("dossierStatus", getDossierStatus());
		attributes.put("dossierResume", getDossierResume());
		attributes.put("stepDate", getStepDate());
		attributes.put("stepNote", getStepNote());
		attributes.put("assignToUserId", getAssignToUserId());
		attributes.put("currentCondition", getCurrentCondition());
		attributes.put("endState", getEndState());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long processOrderId = (Long)attributes.get("processOrderId");

		if (processOrderId != null) {
			setProcessOrderId(processOrderId);
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

		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}

		Long parentProcessOrderId = (Long)attributes.get("parentProcessOrderId");

		if (parentProcessOrderId != null) {
			setParentProcessOrderId(parentProcessOrderId);
		}

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		Long dossierProcessId = (Long)attributes.get("dossierProcessId");

		if (dossierProcessId != null) {
			setDossierProcessId(dossierProcessId);
		}

		Long dossierStepId = (Long)attributes.get("dossierStepId");

		if (dossierStepId != null) {
			setDossierStepId(dossierStepId);
		}

		String dossierStatus = (String)attributes.get("dossierStatus");

		if (dossierStatus != null) {
			setDossierStatus(dossierStatus);
		}

		String dossierResume = (String)attributes.get("dossierResume");

		if (dossierResume != null) {
			setDossierResume(dossierResume);
		}

		Date stepDate = (Date)attributes.get("stepDate");

		if (stepDate != null) {
			setStepDate(stepDate);
		}

		String stepNote = (String)attributes.get("stepNote");

		if (stepNote != null) {
			setStepNote(stepNote);
		}

		Long assignToUserId = (Long)attributes.get("assignToUserId");

		if (assignToUserId != null) {
			setAssignToUserId(assignToUserId);
		}

		String currentCondition = (String)attributes.get("currentCondition");

		if (currentCondition != null) {
			setCurrentCondition(currentCondition);
		}

		Integer endState = (Integer)attributes.get("endState");

		if (endState != null) {
			setEndState(endState);
		}
	}

	@Override
	public long getProcessOrderId() {
		return _processOrderId;
	}

	@Override
	public void setProcessOrderId(long processOrderId) {
		_processOrderId = processOrderId;

		if (_processOrderRemoteModel != null) {
			try {
				Class<?> clazz = _processOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setProcessOrderId", long.class);

				method.invoke(_processOrderRemoteModel, processOrderId);
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

		if (_processOrderRemoteModel != null) {
			try {
				Class<?> clazz = _processOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_processOrderRemoteModel, userId);
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

		if (_processOrderRemoteModel != null) {
			try {
				Class<?> clazz = _processOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_processOrderRemoteModel, groupId);
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

		if (_processOrderRemoteModel != null) {
			try {
				Class<?> clazz = _processOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_processOrderRemoteModel, companyId);
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

		if (_processOrderRemoteModel != null) {
			try {
				Class<?> clazz = _processOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_processOrderRemoteModel, createDate);
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

		if (_processOrderRemoteModel != null) {
			try {
				Class<?> clazz = _processOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_processOrderRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getOrganizationId() {
		return _organizationId;
	}

	@Override
	public void setOrganizationId(long organizationId) {
		_organizationId = organizationId;

		if (_processOrderRemoteModel != null) {
			try {
				Class<?> clazz = _processOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setOrganizationId", long.class);

				method.invoke(_processOrderRemoteModel, organizationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getParentProcessOrderId() {
		return _parentProcessOrderId;
	}

	@Override
	public void setParentProcessOrderId(long parentProcessOrderId) {
		_parentProcessOrderId = parentProcessOrderId;

		if (_processOrderRemoteModel != null) {
			try {
				Class<?> clazz = _processOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setParentProcessOrderId",
						long.class);

				method.invoke(_processOrderRemoteModel, parentProcessOrderId);
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

		if (_processOrderRemoteModel != null) {
			try {
				Class<?> clazz = _processOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierId", long.class);

				method.invoke(_processOrderRemoteModel, dossierId);
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

		if (_processOrderRemoteModel != null) {
			try {
				Class<?> clazz = _processOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierProcessId",
						long.class);

				method.invoke(_processOrderRemoteModel, dossierProcessId);
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

		if (_processOrderRemoteModel != null) {
			try {
				Class<?> clazz = _processOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierStepId", long.class);

				method.invoke(_processOrderRemoteModel, dossierStepId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDossierStatus() {
		return _dossierStatus;
	}

	@Override
	public void setDossierStatus(String dossierStatus) {
		_dossierStatus = dossierStatus;

		if (_processOrderRemoteModel != null) {
			try {
				Class<?> clazz = _processOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierStatus", String.class);

				method.invoke(_processOrderRemoteModel, dossierStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDossierResume() {
		return _dossierResume;
	}

	@Override
	public void setDossierResume(String dossierResume) {
		_dossierResume = dossierResume;

		if (_processOrderRemoteModel != null) {
			try {
				Class<?> clazz = _processOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierResume", String.class);

				method.invoke(_processOrderRemoteModel, dossierResume);
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

		if (_processOrderRemoteModel != null) {
			try {
				Class<?> clazz = _processOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setStepDate", Date.class);

				method.invoke(_processOrderRemoteModel, stepDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStepNote() {
		return _stepNote;
	}

	@Override
	public void setStepNote(String stepNote) {
		_stepNote = stepNote;

		if (_processOrderRemoteModel != null) {
			try {
				Class<?> clazz = _processOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setStepNote", String.class);

				method.invoke(_processOrderRemoteModel, stepNote);
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

		if (_processOrderRemoteModel != null) {
			try {
				Class<?> clazz = _processOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setAssignToUserId", long.class);

				method.invoke(_processOrderRemoteModel, assignToUserId);
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

	@Override
	public String getCurrentCondition() {
		return _currentCondition;
	}

	@Override
	public void setCurrentCondition(String currentCondition) {
		_currentCondition = currentCondition;

		if (_processOrderRemoteModel != null) {
			try {
				Class<?> clazz = _processOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrentCondition",
						String.class);

				method.invoke(_processOrderRemoteModel, currentCondition);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getEndState() {
		return _endState;
	}

	@Override
	public void setEndState(int endState) {
		_endState = endState;

		if (_processOrderRemoteModel != null) {
			try {
				Class<?> clazz = _processOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setEndState", int.class);

				method.invoke(_processOrderRemoteModel, endState);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getProcessOrderRemoteModel() {
		return _processOrderRemoteModel;
	}

	public void setProcessOrderRemoteModel(BaseModel<?> processOrderRemoteModel) {
		_processOrderRemoteModel = processOrderRemoteModel;
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

		Class<?> remoteModelClass = _processOrderRemoteModel.getClass();

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

		Object returnValue = method.invoke(_processOrderRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ProcessOrderLocalServiceUtil.addProcessOrder(this);
		}
		else {
			ProcessOrderLocalServiceUtil.updateProcessOrder(this);
		}
	}

	@Override
	public ProcessOrder toEscapedModel() {
		return (ProcessOrder)ProxyUtil.newProxyInstance(ProcessOrder.class.getClassLoader(),
			new Class[] { ProcessOrder.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ProcessOrderClp clone = new ProcessOrderClp();

		clone.setProcessOrderId(getProcessOrderId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setOrganizationId(getOrganizationId());
		clone.setParentProcessOrderId(getParentProcessOrderId());
		clone.setDossierId(getDossierId());
		clone.setDossierProcessId(getDossierProcessId());
		clone.setDossierStepId(getDossierStepId());
		clone.setDossierStatus(getDossierStatus());
		clone.setDossierResume(getDossierResume());
		clone.setStepDate(getStepDate());
		clone.setStepNote(getStepNote());
		clone.setAssignToUserId(getAssignToUserId());
		clone.setCurrentCondition(getCurrentCondition());
		clone.setEndState(getEndState());

		return clone;
	}

	@Override
	public int compareTo(ProcessOrder processOrder) {
		long primaryKey = processOrder.getPrimaryKey();

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

		if (!(obj instanceof ProcessOrderClp)) {
			return false;
		}

		ProcessOrderClp processOrder = (ProcessOrderClp)obj;

		long primaryKey = processOrder.getPrimaryKey();

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

		sb.append("{processOrderId=");
		sb.append(getProcessOrderId());
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
		sb.append(", organizationId=");
		sb.append(getOrganizationId());
		sb.append(", parentProcessOrderId=");
		sb.append(getParentProcessOrderId());
		sb.append(", dossierId=");
		sb.append(getDossierId());
		sb.append(", dossierProcessId=");
		sb.append(getDossierProcessId());
		sb.append(", dossierStepId=");
		sb.append(getDossierStepId());
		sb.append(", dossierStatus=");
		sb.append(getDossierStatus());
		sb.append(", dossierResume=");
		sb.append(getDossierResume());
		sb.append(", stepDate=");
		sb.append(getStepDate());
		sb.append(", stepNote=");
		sb.append(getStepNote());
		sb.append(", assignToUserId=");
		sb.append(getAssignToUserId());
		sb.append(", currentCondition=");
		sb.append(getCurrentCondition());
		sb.append(", endState=");
		sb.append(getEndState());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(58);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.processmgt.model.ProcessOrder");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>processOrderId</column-name><column-value><![CDATA[");
		sb.append(getProcessOrderId());
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
			"<column><column-name>organizationId</column-name><column-value><![CDATA[");
		sb.append(getOrganizationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parentProcessOrderId</column-name><column-value><![CDATA[");
		sb.append(getParentProcessOrderId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierId</column-name><column-value><![CDATA[");
		sb.append(getDossierId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierProcessId</column-name><column-value><![CDATA[");
		sb.append(getDossierProcessId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierStepId</column-name><column-value><![CDATA[");
		sb.append(getDossierStepId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierStatus</column-name><column-value><![CDATA[");
		sb.append(getDossierStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierResume</column-name><column-value><![CDATA[");
		sb.append(getDossierResume());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stepDate</column-name><column-value><![CDATA[");
		sb.append(getStepDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stepNote</column-name><column-value><![CDATA[");
		sb.append(getStepNote());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assignToUserId</column-name><column-value><![CDATA[");
		sb.append(getAssignToUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currentCondition</column-name><column-value><![CDATA[");
		sb.append(getCurrentCondition());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>endState</column-name><column-value><![CDATA[");
		sb.append(getEndState());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _processOrderId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _organizationId;
	private long _parentProcessOrderId;
	private long _dossierId;
	private long _dossierProcessId;
	private long _dossierStepId;
	private String _dossierStatus;
	private String _dossierResume;
	private Date _stepDate;
	private String _stepNote;
	private long _assignToUserId;
	private String _assignToUserUuid;
	private String _currentCondition;
	private int _endState;
	private BaseModel<?> _processOrderRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.processmgt.service.ClpSerializer.class;
}