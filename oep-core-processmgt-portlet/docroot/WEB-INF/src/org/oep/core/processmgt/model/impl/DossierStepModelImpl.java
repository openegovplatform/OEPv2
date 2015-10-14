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

import org.oep.core.processmgt.model.DossierStep;
import org.oep.core.processmgt.model.DossierStepModel;
import org.oep.core.processmgt.model.DossierStepSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the DossierStep service. Represents a row in the &quot;oep_processmgt_dossierstep&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.core.processmgt.model.DossierStepModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DossierStepImpl}.
 * </p>
 *
 * @author trungdk
 * @see DossierStepImpl
 * @see org.oep.core.processmgt.model.DossierStep
 * @see org.oep.core.processmgt.model.DossierStepModel
 * @generated
 */
@JSON(strict = true)
public class DossierStepModelImpl extends BaseModelImpl<DossierStep>
	implements DossierStepModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dossier step model instance should use the {@link org.oep.core.processmgt.model.DossierStep} interface instead.
	 */
	public static final String TABLE_NAME = "oep_processmgt_dossierstep";
	public static final Object[][] TABLE_COLUMNS = {
			{ "dossierStepId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "dossierProcessId", Types.BIGINT },
			{ "title", Types.VARCHAR },
			{ "sequenceNo", Types.INTEGER },
			{ "daysDuration", Types.INTEGER },
			{ "doForm", Types.VARCHAR },
			{ "formLabel", Types.VARCHAR },
			{ "rollback", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table oep_processmgt_dossierstep (dossierStepId LONG not null primary key,userId LONG,groupId LONG,companyId LONG,createDate DATE null,modifiedDate DATE null,dossierProcessId LONG,title VARCHAR(75) null,sequenceNo INTEGER,daysDuration INTEGER,doForm VARCHAR(100) null,formLabel VARCHAR(100) null,rollback INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table oep_processmgt_dossierstep";
	public static final String ORDER_BY_JPQL = " ORDER BY dossierStep.dossierStepId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY oep_processmgt_dossierstep.dossierStepId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.core.processmgt.model.DossierStep"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.core.processmgt.model.DossierStep"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static DossierStep toModel(DossierStepSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		DossierStep model = new DossierStepImpl();

		model.setDossierStepId(soapModel.getDossierStepId());
		model.setUserId(soapModel.getUserId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setDossierProcessId(soapModel.getDossierProcessId());
		model.setTitle(soapModel.getTitle());
		model.setSequenceNo(soapModel.getSequenceNo());
		model.setDaysDuration(soapModel.getDaysDuration());
		model.setDoForm(soapModel.getDoForm());
		model.setFormLabel(soapModel.getFormLabel());
		model.setRollback(soapModel.getRollback());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<DossierStep> toModels(DossierStepSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<DossierStep> models = new ArrayList<DossierStep>(soapModels.length);

		for (DossierStepSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.core.processmgt.model.DossierStep"));

	public DossierStepModelImpl() {
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
	public Class<?> getModelClass() {
		return DossierStep.class;
	}

	@Override
	public String getModelClassName() {
		return DossierStep.class.getName();
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
		attributes.put("daysDuration", getDaysDuration());
		attributes.put("doForm", getDoForm());
		attributes.put("formLabel", getFormLabel());
		attributes.put("rollback", getRollback());

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

		Integer daysDuration = (Integer)attributes.get("daysDuration");

		if (daysDuration != null) {
			setDaysDuration(daysDuration);
		}

		String doForm = (String)attributes.get("doForm");

		if (doForm != null) {
			setDoForm(doForm);
		}

		String formLabel = (String)attributes.get("formLabel");

		if (formLabel != null) {
			setFormLabel(formLabel);
		}

		Integer rollback = (Integer)attributes.get("rollback");

		if (rollback != null) {
			setRollback(rollback);
		}
	}

	@JSON
	@Override
	public long getDossierStepId() {
		return _dossierStepId;
	}

	@Override
	public void setDossierStepId(long dossierStepId) {
		_dossierStepId = dossierStepId;
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
	public String getTitle() {
		if (_title == null) {
			return StringPool.BLANK;
		}
		else {
			return _title;
		}
	}

	@Override
	public void setTitle(String title) {
		_title = title;
	}

	@JSON
	@Override
	public int getSequenceNo() {
		return _sequenceNo;
	}

	@Override
	public void setSequenceNo(int sequenceNo) {
		_sequenceNo = sequenceNo;
	}

	@JSON
	@Override
	public int getDaysDuration() {
		return _daysDuration;
	}

	@Override
	public void setDaysDuration(int daysDuration) {
		_daysDuration = daysDuration;
	}

	@JSON
	@Override
	public String getDoForm() {
		if (_doForm == null) {
			return StringPool.BLANK;
		}
		else {
			return _doForm;
		}
	}

	@Override
	public void setDoForm(String doForm) {
		_doForm = doForm;
	}

	@JSON
	@Override
	public String getFormLabel() {
		if (_formLabel == null) {
			return StringPool.BLANK;
		}
		else {
			return _formLabel;
		}
	}

	@Override
	public void setFormLabel(String formLabel) {
		_formLabel = formLabel;
	}

	@JSON
	@Override
	public int getRollback() {
		return _rollback;
	}

	@Override
	public void setRollback(int rollback) {
		_rollback = rollback;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			DossierStep.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public DossierStep toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DossierStep)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DossierStepImpl dossierStepImpl = new DossierStepImpl();

		dossierStepImpl.setDossierStepId(getDossierStepId());
		dossierStepImpl.setUserId(getUserId());
		dossierStepImpl.setGroupId(getGroupId());
		dossierStepImpl.setCompanyId(getCompanyId());
		dossierStepImpl.setCreateDate(getCreateDate());
		dossierStepImpl.setModifiedDate(getModifiedDate());
		dossierStepImpl.setDossierProcessId(getDossierProcessId());
		dossierStepImpl.setTitle(getTitle());
		dossierStepImpl.setSequenceNo(getSequenceNo());
		dossierStepImpl.setDaysDuration(getDaysDuration());
		dossierStepImpl.setDoForm(getDoForm());
		dossierStepImpl.setFormLabel(getFormLabel());
		dossierStepImpl.setRollback(getRollback());

		dossierStepImpl.resetOriginalValues();

		return dossierStepImpl;
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

		if (!(obj instanceof DossierStep)) {
			return false;
		}

		DossierStep dossierStep = (DossierStep)obj;

		long primaryKey = dossierStep.getPrimaryKey();

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
	public CacheModel<DossierStep> toCacheModel() {
		DossierStepCacheModel dossierStepCacheModel = new DossierStepCacheModel();

		dossierStepCacheModel.dossierStepId = getDossierStepId();

		dossierStepCacheModel.userId = getUserId();

		dossierStepCacheModel.groupId = getGroupId();

		dossierStepCacheModel.companyId = getCompanyId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			dossierStepCacheModel.createDate = createDate.getTime();
		}
		else {
			dossierStepCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			dossierStepCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			dossierStepCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		dossierStepCacheModel.dossierProcessId = getDossierProcessId();

		dossierStepCacheModel.title = getTitle();

		String title = dossierStepCacheModel.title;

		if ((title != null) && (title.length() == 0)) {
			dossierStepCacheModel.title = null;
		}

		dossierStepCacheModel.sequenceNo = getSequenceNo();

		dossierStepCacheModel.daysDuration = getDaysDuration();

		dossierStepCacheModel.doForm = getDoForm();

		String doForm = dossierStepCacheModel.doForm;

		if ((doForm != null) && (doForm.length() == 0)) {
			dossierStepCacheModel.doForm = null;
		}

		dossierStepCacheModel.formLabel = getFormLabel();

		String formLabel = dossierStepCacheModel.formLabel;

		if ((formLabel != null) && (formLabel.length() == 0)) {
			dossierStepCacheModel.formLabel = null;
		}

		dossierStepCacheModel.rollback = getRollback();

		return dossierStepCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

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
		sb.append(", daysDuration=");
		sb.append(getDaysDuration());
		sb.append(", doForm=");
		sb.append(getDoForm());
		sb.append(", formLabel=");
		sb.append(getFormLabel());
		sb.append(", rollback=");
		sb.append(getRollback());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

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
			"<column><column-name>daysDuration</column-name><column-value><![CDATA[");
		sb.append(getDaysDuration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>doForm</column-name><column-value><![CDATA[");
		sb.append(getDoForm());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>formLabel</column-name><column-value><![CDATA[");
		sb.append(getFormLabel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rollback</column-name><column-value><![CDATA[");
		sb.append(getRollback());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DossierStep.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DossierStep.class
		};
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
	private int _daysDuration;
	private String _doForm;
	private String _formLabel;
	private int _rollback;
	private DossierStep _escapedModel;
}