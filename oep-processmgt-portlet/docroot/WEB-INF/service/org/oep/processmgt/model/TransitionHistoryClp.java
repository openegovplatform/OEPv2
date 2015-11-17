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
import org.oep.processmgt.service.TransitionHistoryLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class TransitionHistoryClp extends BaseModelImpl<TransitionHistory>
	implements TransitionHistory {
	public TransitionHistoryClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TransitionHistory.class;
	}

	@Override
	public String getModelClassName() {
		return TransitionHistory.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _transitionHistoryId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTransitionHistoryId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _transitionHistoryId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("transitionHistoryId", getTransitionHistoryId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("dossierId", getDossierId());
		attributes.put("processOrderId", getProcessOrderId());
		attributes.put("daysDoing", getDaysDoing());
		attributes.put("daysDelay", getDaysDelay());
		attributes.put("startDate", getStartDate());
		attributes.put("preDossierStatus", getPreDossierStatus());
		attributes.put("postDossierStatus", getPostDossierStatus());
		attributes.put("stepTransitionId", getStepTransitionId());
		attributes.put("preDossierStepId", getPreDossierStepId());
		attributes.put("postDossierStepId", getPostDossierStepId());
		attributes.put("transitionName", getTransitionName());
		attributes.put("note", getNote());
		attributes.put("assignToUserId", getAssignToUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long transitionHistoryId = (Long)attributes.get("transitionHistoryId");

		if (transitionHistoryId != null) {
			setTransitionHistoryId(transitionHistoryId);
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

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		Long processOrderId = (Long)attributes.get("processOrderId");

		if (processOrderId != null) {
			setProcessOrderId(processOrderId);
		}

		Integer daysDoing = (Integer)attributes.get("daysDoing");

		if (daysDoing != null) {
			setDaysDoing(daysDoing);
		}

		Integer daysDelay = (Integer)attributes.get("daysDelay");

		if (daysDelay != null) {
			setDaysDelay(daysDelay);
		}

		Date startDate = (Date)attributes.get("startDate");

		if (startDate != null) {
			setStartDate(startDate);
		}

		String preDossierStatus = (String)attributes.get("preDossierStatus");

		if (preDossierStatus != null) {
			setPreDossierStatus(preDossierStatus);
		}

		String postDossierStatus = (String)attributes.get("postDossierStatus");

		if (postDossierStatus != null) {
			setPostDossierStatus(postDossierStatus);
		}

		Long stepTransitionId = (Long)attributes.get("stepTransitionId");

		if (stepTransitionId != null) {
			setStepTransitionId(stepTransitionId);
		}

		Long preDossierStepId = (Long)attributes.get("preDossierStepId");

		if (preDossierStepId != null) {
			setPreDossierStepId(preDossierStepId);
		}

		Long postDossierStepId = (Long)attributes.get("postDossierStepId");

		if (postDossierStepId != null) {
			setPostDossierStepId(postDossierStepId);
		}

		String transitionName = (String)attributes.get("transitionName");

		if (transitionName != null) {
			setTransitionName(transitionName);
		}

		String note = (String)attributes.get("note");

		if (note != null) {
			setNote(note);
		}

		Long assignToUserId = (Long)attributes.get("assignToUserId");

		if (assignToUserId != null) {
			setAssignToUserId(assignToUserId);
		}
	}

	@Override
	public long getTransitionHistoryId() {
		return _transitionHistoryId;
	}

	@Override
	public void setTransitionHistoryId(long transitionHistoryId) {
		_transitionHistoryId = transitionHistoryId;

		if (_transitionHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _transitionHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setTransitionHistoryId",
						long.class);

				method.invoke(_transitionHistoryRemoteModel, transitionHistoryId);
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

		if (_transitionHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _transitionHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_transitionHistoryRemoteModel, userId);
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

		if (_transitionHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _transitionHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_transitionHistoryRemoteModel, groupId);
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

		if (_transitionHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _transitionHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_transitionHistoryRemoteModel, companyId);
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

		if (_transitionHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _transitionHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_transitionHistoryRemoteModel, createDate);
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

		if (_transitionHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _transitionHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierId", long.class);

				method.invoke(_transitionHistoryRemoteModel, dossierId);
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

		if (_transitionHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _transitionHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setProcessOrderId", long.class);

				method.invoke(_transitionHistoryRemoteModel, processOrderId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDaysDoing() {
		return _daysDoing;
	}

	@Override
	public void setDaysDoing(int daysDoing) {
		_daysDoing = daysDoing;

		if (_transitionHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _transitionHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setDaysDoing", int.class);

				method.invoke(_transitionHistoryRemoteModel, daysDoing);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDaysDelay() {
		return _daysDelay;
	}

	@Override
	public void setDaysDelay(int daysDelay) {
		_daysDelay = daysDelay;

		if (_transitionHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _transitionHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setDaysDelay", int.class);

				method.invoke(_transitionHistoryRemoteModel, daysDelay);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getStartDate() {
		return _startDate;
	}

	@Override
	public void setStartDate(Date startDate) {
		_startDate = startDate;

		if (_transitionHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _transitionHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setStartDate", Date.class);

				method.invoke(_transitionHistoryRemoteModel, startDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPreDossierStatus() {
		return _preDossierStatus;
	}

	@Override
	public void setPreDossierStatus(String preDossierStatus) {
		_preDossierStatus = preDossierStatus;

		if (_transitionHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _transitionHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setPreDossierStatus",
						String.class);

				method.invoke(_transitionHistoryRemoteModel, preDossierStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPostDossierStatus() {
		return _postDossierStatus;
	}

	@Override
	public void setPostDossierStatus(String postDossierStatus) {
		_postDossierStatus = postDossierStatus;

		if (_transitionHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _transitionHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setPostDossierStatus",
						String.class);

				method.invoke(_transitionHistoryRemoteModel, postDossierStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getStepTransitionId() {
		return _stepTransitionId;
	}

	@Override
	public void setStepTransitionId(long stepTransitionId) {
		_stepTransitionId = stepTransitionId;

		if (_transitionHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _transitionHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setStepTransitionId",
						long.class);

				method.invoke(_transitionHistoryRemoteModel, stepTransitionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPreDossierStepId() {
		return _preDossierStepId;
	}

	@Override
	public void setPreDossierStepId(long preDossierStepId) {
		_preDossierStepId = preDossierStepId;

		if (_transitionHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _transitionHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setPreDossierStepId",
						long.class);

				method.invoke(_transitionHistoryRemoteModel, preDossierStepId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPostDossierStepId() {
		return _postDossierStepId;
	}

	@Override
	public void setPostDossierStepId(long postDossierStepId) {
		_postDossierStepId = postDossierStepId;

		if (_transitionHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _transitionHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setPostDossierStepId",
						long.class);

				method.invoke(_transitionHistoryRemoteModel, postDossierStepId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTransitionName() {
		return _transitionName;
	}

	@Override
	public void setTransitionName(String transitionName) {
		_transitionName = transitionName;

		if (_transitionHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _transitionHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setTransitionName",
						String.class);

				method.invoke(_transitionHistoryRemoteModel, transitionName);
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

		if (_transitionHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _transitionHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setNote", String.class);

				method.invoke(_transitionHistoryRemoteModel, note);
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

		if (_transitionHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _transitionHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setAssignToUserId", long.class);

				method.invoke(_transitionHistoryRemoteModel, assignToUserId);
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

	public BaseModel<?> getTransitionHistoryRemoteModel() {
		return _transitionHistoryRemoteModel;
	}

	public void setTransitionHistoryRemoteModel(
		BaseModel<?> transitionHistoryRemoteModel) {
		_transitionHistoryRemoteModel = transitionHistoryRemoteModel;
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

		Class<?> remoteModelClass = _transitionHistoryRemoteModel.getClass();

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

		Object returnValue = method.invoke(_transitionHistoryRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TransitionHistoryLocalServiceUtil.addTransitionHistory(this);
		}
		else {
			TransitionHistoryLocalServiceUtil.updateTransitionHistory(this);
		}
	}

	@Override
	public TransitionHistory toEscapedModel() {
		return (TransitionHistory)ProxyUtil.newProxyInstance(TransitionHistory.class.getClassLoader(),
			new Class[] { TransitionHistory.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TransitionHistoryClp clone = new TransitionHistoryClp();

		clone.setTransitionHistoryId(getTransitionHistoryId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setDossierId(getDossierId());
		clone.setProcessOrderId(getProcessOrderId());
		clone.setDaysDoing(getDaysDoing());
		clone.setDaysDelay(getDaysDelay());
		clone.setStartDate(getStartDate());
		clone.setPreDossierStatus(getPreDossierStatus());
		clone.setPostDossierStatus(getPostDossierStatus());
		clone.setStepTransitionId(getStepTransitionId());
		clone.setPreDossierStepId(getPreDossierStepId());
		clone.setPostDossierStepId(getPostDossierStepId());
		clone.setTransitionName(getTransitionName());
		clone.setNote(getNote());
		clone.setAssignToUserId(getAssignToUserId());

		return clone;
	}

	@Override
	public int compareTo(TransitionHistory transitionHistory) {
		long primaryKey = transitionHistory.getPrimaryKey();

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

		if (!(obj instanceof TransitionHistoryClp)) {
			return false;
		}

		TransitionHistoryClp transitionHistory = (TransitionHistoryClp)obj;

		long primaryKey = transitionHistory.getPrimaryKey();

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

		sb.append("{transitionHistoryId=");
		sb.append(getTransitionHistoryId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", dossierId=");
		sb.append(getDossierId());
		sb.append(", processOrderId=");
		sb.append(getProcessOrderId());
		sb.append(", daysDoing=");
		sb.append(getDaysDoing());
		sb.append(", daysDelay=");
		sb.append(getDaysDelay());
		sb.append(", startDate=");
		sb.append(getStartDate());
		sb.append(", preDossierStatus=");
		sb.append(getPreDossierStatus());
		sb.append(", postDossierStatus=");
		sb.append(getPostDossierStatus());
		sb.append(", stepTransitionId=");
		sb.append(getStepTransitionId());
		sb.append(", preDossierStepId=");
		sb.append(getPreDossierStepId());
		sb.append(", postDossierStepId=");
		sb.append(getPostDossierStepId());
		sb.append(", transitionName=");
		sb.append(getTransitionName());
		sb.append(", note=");
		sb.append(getNote());
		sb.append(", assignToUserId=");
		sb.append(getAssignToUserId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(58);

		sb.append("<model><model-name>");
		sb.append("org.oep.processmgt.model.TransitionHistory");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>transitionHistoryId</column-name><column-value><![CDATA[");
		sb.append(getTransitionHistoryId());
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
			"<column><column-name>dossierId</column-name><column-value><![CDATA[");
		sb.append(getDossierId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>processOrderId</column-name><column-value><![CDATA[");
		sb.append(getProcessOrderId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>daysDoing</column-name><column-value><![CDATA[");
		sb.append(getDaysDoing());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>daysDelay</column-name><column-value><![CDATA[");
		sb.append(getDaysDelay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>startDate</column-name><column-value><![CDATA[");
		sb.append(getStartDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>preDossierStatus</column-name><column-value><![CDATA[");
		sb.append(getPreDossierStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>postDossierStatus</column-name><column-value><![CDATA[");
		sb.append(getPostDossierStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stepTransitionId</column-name><column-value><![CDATA[");
		sb.append(getStepTransitionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>preDossierStepId</column-name><column-value><![CDATA[");
		sb.append(getPreDossierStepId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>postDossierStepId</column-name><column-value><![CDATA[");
		sb.append(getPostDossierStepId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>transitionName</column-name><column-value><![CDATA[");
		sb.append(getTransitionName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>note</column-name><column-value><![CDATA[");
		sb.append(getNote());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assignToUserId</column-name><column-value><![CDATA[");
		sb.append(getAssignToUserId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _transitionHistoryId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private long _dossierId;
	private long _processOrderId;
	private int _daysDoing;
	private int _daysDelay;
	private Date _startDate;
	private String _preDossierStatus;
	private String _postDossierStatus;
	private long _stepTransitionId;
	private long _preDossierStepId;
	private long _postDossierStepId;
	private String _transitionName;
	private String _note;
	private long _assignToUserId;
	private String _assignToUserUuid;
	private BaseModel<?> _transitionHistoryRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.processmgt.service.ClpSerializer.class;
}