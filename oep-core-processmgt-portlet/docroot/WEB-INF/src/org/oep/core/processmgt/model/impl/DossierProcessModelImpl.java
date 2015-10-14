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

import org.oep.core.processmgt.model.DossierProcess;
import org.oep.core.processmgt.model.DossierProcessModel;
import org.oep.core.processmgt.model.DossierProcessSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the DossierProcess service. Represents a row in the &quot;oep_processmgt_dossierprocess&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.core.processmgt.model.DossierProcessModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DossierProcessImpl}.
 * </p>
 *
 * @author trungdk
 * @see DossierProcessImpl
 * @see org.oep.core.processmgt.model.DossierProcess
 * @see org.oep.core.processmgt.model.DossierProcessModel
 * @generated
 */
@JSON(strict = true)
public class DossierProcessModelImpl extends BaseModelImpl<DossierProcess>
	implements DossierProcessModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dossier process model instance should use the {@link org.oep.core.processmgt.model.DossierProcess} interface instead.
	 */
	public static final String TABLE_NAME = "oep_processmgt_dossierprocess";
	public static final Object[][] TABLE_COLUMNS = {
			{ "dossierProcessId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "dossierProcId", Types.BIGINT },
			{ "govAgencyId", Types.VARCHAR },
			{ "govAgencyName", Types.VARCHAR },
			{ "startStepTransitionId", Types.BIGINT },
			{ "daysDuration", Types.INTEGER },
			{ "fee", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table oep_processmgt_dossierprocess (dossierProcessId LONG not null primary key,userId LONG,groupId LONG,companyId LONG,createDate DATE null,modifiedDate DATE null,dossierProcId LONG,govAgencyId VARCHAR(30) null,govAgencyName VARCHAR(200) null,startStepTransitionId LONG,daysDuration INTEGER,fee INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table oep_processmgt_dossierprocess";
	public static final String ORDER_BY_JPQL = " ORDER BY dossierProcess.dossierProcessId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY oep_processmgt_dossierprocess.dossierProcessId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.core.processmgt.model.DossierProcess"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.core.processmgt.model.DossierProcess"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.oep.core.processmgt.model.DossierProcess"),
			true);
	public static long COMPANYID_COLUMN_BITMASK = 1L;
	public static long GROUPID_COLUMN_BITMASK = 2L;
	public static long DOSSIERPROCESSID_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static DossierProcess toModel(DossierProcessSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		DossierProcess model = new DossierProcessImpl();

		model.setDossierProcessId(soapModel.getDossierProcessId());
		model.setUserId(soapModel.getUserId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setDossierProcId(soapModel.getDossierProcId());
		model.setGovAgencyId(soapModel.getGovAgencyId());
		model.setGovAgencyName(soapModel.getGovAgencyName());
		model.setStartStepTransitionId(soapModel.getStartStepTransitionId());
		model.setDaysDuration(soapModel.getDaysDuration());
		model.setFee(soapModel.getFee());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<DossierProcess> toModels(DossierProcessSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<DossierProcess> models = new ArrayList<DossierProcess>(soapModels.length);

		for (DossierProcessSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.core.processmgt.model.DossierProcess"));

	public DossierProcessModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _dossierProcessId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDossierProcessId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dossierProcessId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return DossierProcess.class;
	}

	@Override
	public String getModelClassName() {
		return DossierProcess.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dossierProcessId", getDossierProcessId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dossierProcId", getDossierProcId());
		attributes.put("govAgencyId", getGovAgencyId());
		attributes.put("govAgencyName", getGovAgencyName());
		attributes.put("startStepTransitionId", getStartStepTransitionId());
		attributes.put("daysDuration", getDaysDuration());
		attributes.put("fee", getFee());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dossierProcessId = (Long)attributes.get("dossierProcessId");

		if (dossierProcessId != null) {
			setDossierProcessId(dossierProcessId);
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

		String govAgencyId = (String)attributes.get("govAgencyId");

		if (govAgencyId != null) {
			setGovAgencyId(govAgencyId);
		}

		String govAgencyName = (String)attributes.get("govAgencyName");

		if (govAgencyName != null) {
			setGovAgencyName(govAgencyName);
		}

		Long startStepTransitionId = (Long)attributes.get(
				"startStepTransitionId");

		if (startStepTransitionId != null) {
			setStartStepTransitionId(startStepTransitionId);
		}

		Integer daysDuration = (Integer)attributes.get("daysDuration");

		if (daysDuration != null) {
			setDaysDuration(daysDuration);
		}

		Integer fee = (Integer)attributes.get("fee");

		if (fee != null) {
			setFee(fee);
		}
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
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
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
	public long getDossierProcId() {
		return _dossierProcId;
	}

	@Override
	public void setDossierProcId(long dossierProcId) {
		_dossierProcId = dossierProcId;
	}

	@JSON
	@Override
	public String getGovAgencyId() {
		if (_govAgencyId == null) {
			return StringPool.BLANK;
		}
		else {
			return _govAgencyId;
		}
	}

	@Override
	public void setGovAgencyId(String govAgencyId) {
		_govAgencyId = govAgencyId;
	}

	@JSON
	@Override
	public String getGovAgencyName() {
		if (_govAgencyName == null) {
			return StringPool.BLANK;
		}
		else {
			return _govAgencyName;
		}
	}

	@Override
	public void setGovAgencyName(String govAgencyName) {
		_govAgencyName = govAgencyName;
	}

	@JSON
	@Override
	public long getStartStepTransitionId() {
		return _startStepTransitionId;
	}

	@Override
	public void setStartStepTransitionId(long startStepTransitionId) {
		_startStepTransitionId = startStepTransitionId;
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
	public int getFee() {
		return _fee;
	}

	@Override
	public void setFee(int fee) {
		_fee = fee;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			DossierProcess.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public DossierProcess toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DossierProcess)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DossierProcessImpl dossierProcessImpl = new DossierProcessImpl();

		dossierProcessImpl.setDossierProcessId(getDossierProcessId());
		dossierProcessImpl.setUserId(getUserId());
		dossierProcessImpl.setGroupId(getGroupId());
		dossierProcessImpl.setCompanyId(getCompanyId());
		dossierProcessImpl.setCreateDate(getCreateDate());
		dossierProcessImpl.setModifiedDate(getModifiedDate());
		dossierProcessImpl.setDossierProcId(getDossierProcId());
		dossierProcessImpl.setGovAgencyId(getGovAgencyId());
		dossierProcessImpl.setGovAgencyName(getGovAgencyName());
		dossierProcessImpl.setStartStepTransitionId(getStartStepTransitionId());
		dossierProcessImpl.setDaysDuration(getDaysDuration());
		dossierProcessImpl.setFee(getFee());

		dossierProcessImpl.resetOriginalValues();

		return dossierProcessImpl;
	}

	@Override
	public int compareTo(DossierProcess dossierProcess) {
		long primaryKey = dossierProcess.getPrimaryKey();

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

		if (!(obj instanceof DossierProcess)) {
			return false;
		}

		DossierProcess dossierProcess = (DossierProcess)obj;

		long primaryKey = dossierProcess.getPrimaryKey();

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
		DossierProcessModelImpl dossierProcessModelImpl = this;

		dossierProcessModelImpl._originalGroupId = dossierProcessModelImpl._groupId;

		dossierProcessModelImpl._setOriginalGroupId = false;

		dossierProcessModelImpl._originalCompanyId = dossierProcessModelImpl._companyId;

		dossierProcessModelImpl._setOriginalCompanyId = false;

		dossierProcessModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DossierProcess> toCacheModel() {
		DossierProcessCacheModel dossierProcessCacheModel = new DossierProcessCacheModel();

		dossierProcessCacheModel.dossierProcessId = getDossierProcessId();

		dossierProcessCacheModel.userId = getUserId();

		dossierProcessCacheModel.groupId = getGroupId();

		dossierProcessCacheModel.companyId = getCompanyId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			dossierProcessCacheModel.createDate = createDate.getTime();
		}
		else {
			dossierProcessCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			dossierProcessCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			dossierProcessCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		dossierProcessCacheModel.dossierProcId = getDossierProcId();

		dossierProcessCacheModel.govAgencyId = getGovAgencyId();

		String govAgencyId = dossierProcessCacheModel.govAgencyId;

		if ((govAgencyId != null) && (govAgencyId.length() == 0)) {
			dossierProcessCacheModel.govAgencyId = null;
		}

		dossierProcessCacheModel.govAgencyName = getGovAgencyName();

		String govAgencyName = dossierProcessCacheModel.govAgencyName;

		if ((govAgencyName != null) && (govAgencyName.length() == 0)) {
			dossierProcessCacheModel.govAgencyName = null;
		}

		dossierProcessCacheModel.startStepTransitionId = getStartStepTransitionId();

		dossierProcessCacheModel.daysDuration = getDaysDuration();

		dossierProcessCacheModel.fee = getFee();

		return dossierProcessCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{dossierProcessId=");
		sb.append(getDossierProcessId());
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
		sb.append(", govAgencyId=");
		sb.append(getGovAgencyId());
		sb.append(", govAgencyName=");
		sb.append(getGovAgencyName());
		sb.append(", startStepTransitionId=");
		sb.append(getStartStepTransitionId());
		sb.append(", daysDuration=");
		sb.append(getDaysDuration());
		sb.append(", fee=");
		sb.append(getFee());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.processmgt.model.DossierProcess");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>dossierProcessId</column-name><column-value><![CDATA[");
		sb.append(getDossierProcessId());
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
			"<column><column-name>govAgencyId</column-name><column-value><![CDATA[");
		sb.append(getGovAgencyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>govAgencyName</column-name><column-value><![CDATA[");
		sb.append(getGovAgencyName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>startStepTransitionId</column-name><column-value><![CDATA[");
		sb.append(getStartStepTransitionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>daysDuration</column-name><column-value><![CDATA[");
		sb.append(getDaysDuration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fee</column-name><column-value><![CDATA[");
		sb.append(getFee());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DossierProcess.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DossierProcess.class
		};
	private long _dossierProcessId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _dossierProcId;
	private String _govAgencyId;
	private String _govAgencyName;
	private long _startStepTransitionId;
	private int _daysDuration;
	private int _fee;
	private long _columnBitmask;
	private DossierProcess _escapedModel;
}