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

import org.oep.core.processmgt.model.TransitionHistory;
import org.oep.core.processmgt.model.TransitionHistoryModel;
import org.oep.core.processmgt.model.TransitionHistorySoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the TransitionHistory service. Represents a row in the &quot;oep_processmgt_TransitionHistory&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.core.processmgt.model.TransitionHistoryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TransitionHistoryImpl}.
 * </p>
 *
 * @author trungdk
 * @see TransitionHistoryImpl
 * @see org.oep.core.processmgt.model.TransitionHistory
 * @see org.oep.core.processmgt.model.TransitionHistoryModel
 * @generated
 */
@JSON(strict = true)
public class TransitionHistoryModelImpl extends BaseModelImpl<TransitionHistory>
	implements TransitionHistoryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a transition history model instance should use the {@link org.oep.core.processmgt.model.TransitionHistory} interface instead.
	 */
	public static final String TABLE_NAME = "oep_processmgt_TransitionHistory";
	public static final Object[][] TABLE_COLUMNS = {
			{ "transitionHistoryId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "dossierId", Types.BIGINT },
			{ "processOrderId", Types.BIGINT },
			{ "daysDoing", Types.INTEGER },
			{ "daysDelay", Types.INTEGER },
			{ "startDate", Types.TIMESTAMP },
			{ "stepTransitionId", Types.BIGINT },
			{ "preDossierStepId", Types.BIGINT },
			{ "postDossierStepId", Types.BIGINT },
			{ "transitionName", Types.VARCHAR },
			{ "note", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table oep_processmgt_TransitionHistory (transitionHistoryId LONG not null primary key,userId LONG,groupId LONG,companyId LONG,createDate DATE null,dossierId LONG,processOrderId LONG,daysDoing INTEGER,daysDelay INTEGER,startDate DATE null,stepTransitionId LONG,preDossierStepId LONG,postDossierStepId LONG,transitionName VARCHAR(75) null,note VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table oep_processmgt_TransitionHistory";
	public static final String ORDER_BY_JPQL = " ORDER BY transitionHistory.transitionHistoryId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY oep_processmgt_TransitionHistory.transitionHistoryId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.core.processmgt.model.TransitionHistory"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.core.processmgt.model.TransitionHistory"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static TransitionHistory toModel(TransitionHistorySoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		TransitionHistory model = new TransitionHistoryImpl();

		model.setTransitionHistoryId(soapModel.getTransitionHistoryId());
		model.setUserId(soapModel.getUserId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setDossierId(soapModel.getDossierId());
		model.setProcessOrderId(soapModel.getProcessOrderId());
		model.setDaysDoing(soapModel.getDaysDoing());
		model.setDaysDelay(soapModel.getDaysDelay());
		model.setStartDate(soapModel.getStartDate());
		model.setStepTransitionId(soapModel.getStepTransitionId());
		model.setPreDossierStepId(soapModel.getPreDossierStepId());
		model.setPostDossierStepId(soapModel.getPostDossierStepId());
		model.setTransitionName(soapModel.getTransitionName());
		model.setNote(soapModel.getNote());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<TransitionHistory> toModels(
		TransitionHistorySoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<TransitionHistory> models = new ArrayList<TransitionHistory>(soapModels.length);

		for (TransitionHistorySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.core.processmgt.model.TransitionHistory"));

	public TransitionHistoryModelImpl() {
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
	public Class<?> getModelClass() {
		return TransitionHistory.class;
	}

	@Override
	public String getModelClassName() {
		return TransitionHistory.class.getName();
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
		attributes.put("stepTransitionId", getStepTransitionId());
		attributes.put("preDossierStepId", getPreDossierStepId());
		attributes.put("postDossierStepId", getPostDossierStepId());
		attributes.put("transitionName", getTransitionName());
		attributes.put("note", getNote());

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
	}

	@JSON
	@Override
	public long getTransitionHistoryId() {
		return _transitionHistoryId;
	}

	@Override
	public void setTransitionHistoryId(long transitionHistoryId) {
		_transitionHistoryId = transitionHistoryId;
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
	public long getDossierId() {
		return _dossierId;
	}

	@Override
	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
	}

	@JSON
	@Override
	public long getProcessOrderId() {
		return _processOrderId;
	}

	@Override
	public void setProcessOrderId(long processOrderId) {
		_processOrderId = processOrderId;
	}

	@JSON
	@Override
	public int getDaysDoing() {
		return _daysDoing;
	}

	@Override
	public void setDaysDoing(int daysDoing) {
		_daysDoing = daysDoing;
	}

	@JSON
	@Override
	public int getDaysDelay() {
		return _daysDelay;
	}

	@Override
	public void setDaysDelay(int daysDelay) {
		_daysDelay = daysDelay;
	}

	@JSON
	@Override
	public Date getStartDate() {
		return _startDate;
	}

	@Override
	public void setStartDate(Date startDate) {
		_startDate = startDate;
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
	public String getNote() {
		if (_note == null) {
			return StringPool.BLANK;
		}
		else {
			return _note;
		}
	}

	@Override
	public void setNote(String note) {
		_note = note;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			TransitionHistory.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TransitionHistory toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TransitionHistory)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TransitionHistoryImpl transitionHistoryImpl = new TransitionHistoryImpl();

		transitionHistoryImpl.setTransitionHistoryId(getTransitionHistoryId());
		transitionHistoryImpl.setUserId(getUserId());
		transitionHistoryImpl.setGroupId(getGroupId());
		transitionHistoryImpl.setCompanyId(getCompanyId());
		transitionHistoryImpl.setCreateDate(getCreateDate());
		transitionHistoryImpl.setDossierId(getDossierId());
		transitionHistoryImpl.setProcessOrderId(getProcessOrderId());
		transitionHistoryImpl.setDaysDoing(getDaysDoing());
		transitionHistoryImpl.setDaysDelay(getDaysDelay());
		transitionHistoryImpl.setStartDate(getStartDate());
		transitionHistoryImpl.setStepTransitionId(getStepTransitionId());
		transitionHistoryImpl.setPreDossierStepId(getPreDossierStepId());
		transitionHistoryImpl.setPostDossierStepId(getPostDossierStepId());
		transitionHistoryImpl.setTransitionName(getTransitionName());
		transitionHistoryImpl.setNote(getNote());

		transitionHistoryImpl.resetOriginalValues();

		return transitionHistoryImpl;
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

		if (!(obj instanceof TransitionHistory)) {
			return false;
		}

		TransitionHistory transitionHistory = (TransitionHistory)obj;

		long primaryKey = transitionHistory.getPrimaryKey();

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
	public CacheModel<TransitionHistory> toCacheModel() {
		TransitionHistoryCacheModel transitionHistoryCacheModel = new TransitionHistoryCacheModel();

		transitionHistoryCacheModel.transitionHistoryId = getTransitionHistoryId();

		transitionHistoryCacheModel.userId = getUserId();

		transitionHistoryCacheModel.groupId = getGroupId();

		transitionHistoryCacheModel.companyId = getCompanyId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			transitionHistoryCacheModel.createDate = createDate.getTime();
		}
		else {
			transitionHistoryCacheModel.createDate = Long.MIN_VALUE;
		}

		transitionHistoryCacheModel.dossierId = getDossierId();

		transitionHistoryCacheModel.processOrderId = getProcessOrderId();

		transitionHistoryCacheModel.daysDoing = getDaysDoing();

		transitionHistoryCacheModel.daysDelay = getDaysDelay();

		Date startDate = getStartDate();

		if (startDate != null) {
			transitionHistoryCacheModel.startDate = startDate.getTime();
		}
		else {
			transitionHistoryCacheModel.startDate = Long.MIN_VALUE;
		}

		transitionHistoryCacheModel.stepTransitionId = getStepTransitionId();

		transitionHistoryCacheModel.preDossierStepId = getPreDossierStepId();

		transitionHistoryCacheModel.postDossierStepId = getPostDossierStepId();

		transitionHistoryCacheModel.transitionName = getTransitionName();

		String transitionName = transitionHistoryCacheModel.transitionName;

		if ((transitionName != null) && (transitionName.length() == 0)) {
			transitionHistoryCacheModel.transitionName = null;
		}

		transitionHistoryCacheModel.note = getNote();

		String note = transitionHistoryCacheModel.note;

		if ((note != null) && (note.length() == 0)) {
			transitionHistoryCacheModel.note = null;
		}

		return transitionHistoryCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.processmgt.model.TransitionHistory");
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

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = TransitionHistory.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			TransitionHistory.class
		};
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
	private long _stepTransitionId;
	private long _preDossierStepId;
	private long _postDossierStepId;
	private String _transitionName;
	private String _note;
	private TransitionHistory _escapedModel;
}