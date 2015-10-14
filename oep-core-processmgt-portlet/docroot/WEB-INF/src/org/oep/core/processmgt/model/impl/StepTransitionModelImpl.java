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

package org.oep.core.processmgt.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import org.oep.core.processmgt.model.StepTransition;
import org.oep.core.processmgt.model.StepTransitionModel;
import org.oep.core.processmgt.model.StepTransitionSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the StepTransition service. Represents a row in the &quot;oep_processmgt_steptransition&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.core.processmgt.model.StepTransitionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link StepTransitionImpl}.
 * </p>
 *
 * @author trungdk
 * @see StepTransitionImpl
 * @see org.oep.core.processmgt.model.StepTransition
 * @see org.oep.core.processmgt.model.StepTransitionModel
 * @generated
 */
@JSON(strict = true)
public class StepTransitionModelImpl extends BaseModelImpl<StepTransition>
	implements StepTransitionModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a step transition model instance should use the {@link org.oep.core.processmgt.model.StepTransition} interface instead.
	 */
	public static final String TABLE_NAME = "oep_processmgt_steptransition";
	public static final Object[][] TABLE_COLUMNS = {
			{ "stepTransitionId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "dossierProcessId", Types.BIGINT },
			{ "preDossierStepId", Types.BIGINT },
			{ "postDossierStepId", Types.BIGINT },
			{ "precondition", Types.VARCHAR },
			{ "autoCondition", Types.VARCHAR },
			{ "transitionName", Types.VARCHAR },
			{ "dossierStatus", Types.VARCHAR },
			{ "notifyStatus", Types.INTEGER },
			{ "sendResults", Types.INTEGER },
			{ "requestPayment", Types.INTEGER },
			{ "userAssignment", Types.INTEGER },
			{ "newProcessOrder", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table oep_processmgt_steptransition (stepTransitionId LONG not null primary key,userId LONG,groupId LONG,companyId LONG,createDate DATE null,modifiedDate DATE null,dossierProcessId LONG,preDossierStepId LONG,postDossierStepId LONG,precondition VARCHAR(75) null,autoCondition VARCHAR(30) null,transitionName VARCHAR(100) null,dossierStatus VARCHAR(75) null,notifyStatus INTEGER,sendResults INTEGER,requestPayment INTEGER,userAssignment INTEGER,newProcessOrder INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table oep_processmgt_steptransition";
	public static final String ORDER_BY_JPQL = " ORDER BY stepTransition.stepTransitionId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY oep_processmgt_steptransition.stepTransitionId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.core.processmgt.model.StepTransition"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.core.processmgt.model.StepTransition"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static StepTransition toModel(StepTransitionSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		StepTransition model = new StepTransitionImpl();

		model.setStepTransitionId(soapModel.getStepTransitionId());
		model.setUserId(soapModel.getUserId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setDossierProcessId(soapModel.getDossierProcessId());
		model.setPreDossierStepId(soapModel.getPreDossierStepId());
		model.setPostDossierStepId(soapModel.getPostDossierStepId());
		model.setPrecondition(soapModel.getPrecondition());
		model.setAutoCondition(soapModel.getAutoCondition());
		model.setTransitionName(soapModel.getTransitionName());
		model.setDossierStatus(soapModel.getDossierStatus());
		model.setNotifyStatus(soapModel.getNotifyStatus());
		model.setSendResults(soapModel.getSendResults());
		model.setRequestPayment(soapModel.getRequestPayment());
		model.setUserAssignment(soapModel.getUserAssignment());
		model.setNewProcessOrder(soapModel.getNewProcessOrder());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<StepTransition> toModels(StepTransitionSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<StepTransition> models = new ArrayList<StepTransition>(soapModels.length);

		for (StepTransitionSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.core.processmgt.model.StepTransition"));

	public StepTransitionModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _stepTransitionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setStepTransitionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _stepTransitionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return StepTransition.class;
	}

	@Override
	public String getModelClassName() {
		return StepTransition.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("stepTransitionId", getStepTransitionId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dossierProcessId", getDossierProcessId());
		attributes.put("preDossierStepId", getPreDossierStepId());
		attributes.put("postDossierStepId", getPostDossierStepId());
		attributes.put("precondition", getPrecondition());
		attributes.put("autoCondition", getAutoCondition());
		attributes.put("transitionName", getTransitionName());
		attributes.put("dossierStatus", getDossierStatus());
		attributes.put("notifyStatus", getNotifyStatus());
		attributes.put("sendResults", getSendResults());
		attributes.put("requestPayment", getRequestPayment());
		attributes.put("userAssignment", getUserAssignment());
		attributes.put("newProcessOrder", getNewProcessOrder());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long stepTransitionId = (Long)attributes.get("stepTransitionId");

		if (stepTransitionId != null) {
			setStepTransitionId(stepTransitionId);
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

		Long preDossierStepId = (Long)attributes.get("preDossierStepId");

		if (preDossierStepId != null) {
			setPreDossierStepId(preDossierStepId);
		}

		Long postDossierStepId = (Long)attributes.get("postDossierStepId");

		if (postDossierStepId != null) {
			setPostDossierStepId(postDossierStepId);
		}

		String precondition = (String)attributes.get("precondition");

		if (precondition != null) {
			setPrecondition(precondition);
		}

		String autoCondition = (String)attributes.get("autoCondition");

		if (autoCondition != null) {
			setAutoCondition(autoCondition);
		}

		String transitionName = (String)attributes.get("transitionName");

		if (transitionName != null) {
			setTransitionName(transitionName);
		}

		String dossierStatus = (String)attributes.get("dossierStatus");

		if (dossierStatus != null) {
			setDossierStatus(dossierStatus);
		}

		Integer notifyStatus = (Integer)attributes.get("notifyStatus");

		if (notifyStatus != null) {
			setNotifyStatus(notifyStatus);
		}

		Integer sendResults = (Integer)attributes.get("sendResults");

		if (sendResults != null) {
			setSendResults(sendResults);
		}

		Integer requestPayment = (Integer)attributes.get("requestPayment");

		if (requestPayment != null) {
			setRequestPayment(requestPayment);
		}

		Integer userAssignment = (Integer)attributes.get("userAssignment");

		if (userAssignment != null) {
			setUserAssignment(userAssignment);
		}

		Integer newProcessOrder = (Integer)attributes.get("newProcessOrder");

		if (newProcessOrder != null) {
			setNewProcessOrder(newProcessOrder);
		}
	}

	@JSON
	@Override
	public long getStepTransitionId() {
		return _stepTransitionId;
	}

	@Override
	public void setStepTransitionId(long stepTransitionId) {
		_stepTransitionId = stepTransitionId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public long getDossierProcessId() {
		return _dossierProcessId;
	}

	@Override
	public void setDossierProcessId(long dossierProcessId) {
		_dossierProcessId = dossierProcessId;
	}

	@JSON
	@Override
	public long getPreDossierStepId() {
		return _preDossierStepId;
	}

	@Override
	public void setPreDossierStepId(long preDossierStepId) {
		_preDossierStepId = preDossierStepId;
	}

	@JSON
	@Override
	public long getPostDossierStepId() {
		return _postDossierStepId;
	}

	@Override
	public void setPostDossierStepId(long postDossierStepId) {
		_postDossierStepId = postDossierStepId;
	}

	@JSON
	@Override
	public String getPrecondition() {
		if (_precondition == null) {
			return StringPool.BLANK;
		}
		else {
			return _precondition;
		}
	}

	@Override
	public void setPrecondition(String precondition) {
		_precondition = precondition;
	}

	@JSON
	@Override
	public String getAutoCondition() {
		if (_autoCondition == null) {
			return StringPool.BLANK;
		}
		else {
			return _autoCondition;
		}
	}

	@Override
	public void setAutoCondition(String autoCondition) {
		_autoCondition = autoCondition;
	}

	@JSON
	@Override
	public String getTransitionName() {
		if (_transitionName == null) {
			return StringPool.BLANK;
		}
		else {
			return _transitionName;
		}
	}

	@Override
	public void setTransitionName(String transitionName) {
		_transitionName = transitionName;
	}

	@JSON
	@Override
	public String getDossierStatus() {
		if (_dossierStatus == null) {
			return StringPool.BLANK;
		}
		else {
			return _dossierStatus;
		}
	}

	@Override
	public void setDossierStatus(String dossierStatus) {
		_dossierStatus = dossierStatus;
	}

	@JSON
	@Override
	public int getNotifyStatus() {
		return _notifyStatus;
	}

	@Override
	public void setNotifyStatus(int notifyStatus) {
		_notifyStatus = notifyStatus;
	}

	@JSON
	@Override
	public int getSendResults() {
		return _sendResults;
	}

	@Override
	public void setSendResults(int sendResults) {
		_sendResults = sendResults;
	}

	@JSON
	@Override
	public int getRequestPayment() {
		return _requestPayment;
	}

	@Override
	public void setRequestPayment(int requestPayment) {
		_requestPayment = requestPayment;
	}

	@JSON
	@Override
	public int getUserAssignment() {
		return _userAssignment;
	}

	@Override
	public void setUserAssignment(int userAssignment) {
		_userAssignment = userAssignment;
	}

	@JSON
	@Override
	public int getNewProcessOrder() {
		return _newProcessOrder;
	}

	@Override
	public void setNewProcessOrder(int newProcessOrder) {
		_newProcessOrder = newProcessOrder;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			StepTransition.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public StepTransition toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (StepTransition)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		StepTransitionImpl stepTransitionImpl = new StepTransitionImpl();

		stepTransitionImpl.setStepTransitionId(getStepTransitionId());
		stepTransitionImpl.setUserId(getUserId());
		stepTransitionImpl.setGroupId(getGroupId());
		stepTransitionImpl.setCompanyId(getCompanyId());
		stepTransitionImpl.setCreateDate(getCreateDate());
		stepTransitionImpl.setModifiedDate(getModifiedDate());
		stepTransitionImpl.setDossierProcessId(getDossierProcessId());
		stepTransitionImpl.setPreDossierStepId(getPreDossierStepId());
		stepTransitionImpl.setPostDossierStepId(getPostDossierStepId());
		stepTransitionImpl.setPrecondition(getPrecondition());
		stepTransitionImpl.setAutoCondition(getAutoCondition());
		stepTransitionImpl.setTransitionName(getTransitionName());
		stepTransitionImpl.setDossierStatus(getDossierStatus());
		stepTransitionImpl.setNotifyStatus(getNotifyStatus());
		stepTransitionImpl.setSendResults(getSendResults());
		stepTransitionImpl.setRequestPayment(getRequestPayment());
		stepTransitionImpl.setUserAssignment(getUserAssignment());
		stepTransitionImpl.setNewProcessOrder(getNewProcessOrder());

		stepTransitionImpl.resetOriginalValues();

		return stepTransitionImpl;
	}

	@Override
	public int compareTo(StepTransition stepTransition) {
		long primaryKey = stepTransition.getPrimaryKey();

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

		if (!(obj instanceof StepTransition)) {
			return false;
		}

		StepTransition stepTransition = (StepTransition)obj;

		long primaryKey = stepTransition.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<StepTransition> toCacheModel() {
		StepTransitionCacheModel stepTransitionCacheModel = new StepTransitionCacheModel();

		stepTransitionCacheModel.stepTransitionId = getStepTransitionId();

		stepTransitionCacheModel.userId = getUserId();

		stepTransitionCacheModel.groupId = getGroupId();

		stepTransitionCacheModel.companyId = getCompanyId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			stepTransitionCacheModel.createDate = createDate.getTime();
		}
		else {
			stepTransitionCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			stepTransitionCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			stepTransitionCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		stepTransitionCacheModel.dossierProcessId = getDossierProcessId();

		stepTransitionCacheModel.preDossierStepId = getPreDossierStepId();

		stepTransitionCacheModel.postDossierStepId = getPostDossierStepId();

		stepTransitionCacheModel.precondition = getPrecondition();

		String precondition = stepTransitionCacheModel.precondition;

		if ((precondition != null) && (precondition.length() == 0)) {
			stepTransitionCacheModel.precondition = null;
		}

		stepTransitionCacheModel.autoCondition = getAutoCondition();

		String autoCondition = stepTransitionCacheModel.autoCondition;

		if ((autoCondition != null) && (autoCondition.length() == 0)) {
			stepTransitionCacheModel.autoCondition = null;
		}

		stepTransitionCacheModel.transitionName = getTransitionName();

		String transitionName = stepTransitionCacheModel.transitionName;

		if ((transitionName != null) && (transitionName.length() == 0)) {
			stepTransitionCacheModel.transitionName = null;
		}

		stepTransitionCacheModel.dossierStatus = getDossierStatus();

		String dossierStatus = stepTransitionCacheModel.dossierStatus;

		if ((dossierStatus != null) && (dossierStatus.length() == 0)) {
			stepTransitionCacheModel.dossierStatus = null;
		}

		stepTransitionCacheModel.notifyStatus = getNotifyStatus();

		stepTransitionCacheModel.sendResults = getSendResults();

		stepTransitionCacheModel.requestPayment = getRequestPayment();

		stepTransitionCacheModel.userAssignment = getUserAssignment();

		stepTransitionCacheModel.newProcessOrder = getNewProcessOrder();

		return stepTransitionCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{stepTransitionId=");
		sb.append(getStepTransitionId());
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
		sb.append(", preDossierStepId=");
		sb.append(getPreDossierStepId());
		sb.append(", postDossierStepId=");
		sb.append(getPostDossierStepId());
		sb.append(", precondition=");
		sb.append(getPrecondition());
		sb.append(", autoCondition=");
		sb.append(getAutoCondition());
		sb.append(", transitionName=");
		sb.append(getTransitionName());
		sb.append(", dossierStatus=");
		sb.append(getDossierStatus());
		sb.append(", notifyStatus=");
		sb.append(getNotifyStatus());
		sb.append(", sendResults=");
		sb.append(getSendResults());
		sb.append(", requestPayment=");
		sb.append(getRequestPayment());
		sb.append(", userAssignment=");
		sb.append(getUserAssignment());
		sb.append(", newProcessOrder=");
		sb.append(getNewProcessOrder());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(58);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.processmgt.model.StepTransition");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>stepTransitionId</column-name><column-value><![CDATA[");
		sb.append(getStepTransitionId());
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
			"<column><column-name>preDossierStepId</column-name><column-value><![CDATA[");
		sb.append(getPreDossierStepId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>postDossierStepId</column-name><column-value><![CDATA[");
		sb.append(getPostDossierStepId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>precondition</column-name><column-value><![CDATA[");
		sb.append(getPrecondition());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>autoCondition</column-name><column-value><![CDATA[");
		sb.append(getAutoCondition());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>transitionName</column-name><column-value><![CDATA[");
		sb.append(getTransitionName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierStatus</column-name><column-value><![CDATA[");
		sb.append(getDossierStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>notifyStatus</column-name><column-value><![CDATA[");
		sb.append(getNotifyStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sendResults</column-name><column-value><![CDATA[");
		sb.append(getSendResults());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestPayment</column-name><column-value><![CDATA[");
		sb.append(getRequestPayment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userAssignment</column-name><column-value><![CDATA[");
		sb.append(getUserAssignment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>newProcessOrder</column-name><column-value><![CDATA[");
		sb.append(getNewProcessOrder());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = StepTransition.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			StepTransition.class
		};
	private long _stepTransitionId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _dossierProcessId;
	private long _preDossierStepId;
	private long _postDossierStepId;
	private String _precondition;
	private String _autoCondition;
	private String _transitionName;
	private String _dossierStatus;
	private int _notifyStatus;
	private int _sendResults;
	private int _requestPayment;
	private int _userAssignment;
	private int _newProcessOrder;
	private StepTransition _escapedModel;
}