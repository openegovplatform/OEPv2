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

import org.oep.core.processmgt.model.StatisticByUser;
import org.oep.core.processmgt.model.StatisticByUserModel;
import org.oep.core.processmgt.model.StatisticByUserSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the StatisticByUser service. Represents a row in the &quot;oep_processmgt_statisticbyuser&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.core.processmgt.model.StatisticByUserModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link StatisticByUserImpl}.
 * </p>
 *
 * @author trungdk
 * @see StatisticByUserImpl
 * @see org.oep.core.processmgt.model.StatisticByUser
 * @see org.oep.core.processmgt.model.StatisticByUserModel
 * @generated
 */
@JSON(strict = true)
public class StatisticByUserModelImpl extends BaseModelImpl<StatisticByUser>
	implements StatisticByUserModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a statistic by user model instance should use the {@link org.oep.core.processmgt.model.StatisticByUser} interface instead.
	 */
	public static final String TABLE_NAME = "oep_processmgt_statisticbyuser";
	public static final Object[][] TABLE_COLUMNS = {
			{ "statisticByUserId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "month", Types.INTEGER },
			{ "year", Types.INTEGER },
			{ "dossierStatus", Types.VARCHAR },
			{ "totalNumber", Types.INTEGER },
			{ "delayedNumber", Types.INTEGER },
			{ "ontimeNumber", Types.INTEGER },
			{ "ontimeRatio", Types.DOUBLE },
			{ "delayDaysAvg", Types.DOUBLE },
			{ "furtherDaysAvg", Types.DOUBLE }
		};
	public static final String TABLE_SQL_CREATE = "create table oep_processmgt_statisticbyuser (statisticByUserId LONG not null primary key,userId LONG,groupId LONG,companyId LONG,createDate DATE null,month INTEGER,year INTEGER,dossierStatus VARCHAR(75) null,totalNumber INTEGER,delayedNumber INTEGER,ontimeNumber INTEGER,ontimeRatio DOUBLE,delayDaysAvg DOUBLE,furtherDaysAvg DOUBLE)";
	public static final String TABLE_SQL_DROP = "drop table oep_processmgt_statisticbyuser";
	public static final String ORDER_BY_JPQL = " ORDER BY statisticByUser.statisticByUserId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY oep_processmgt_statisticbyuser.statisticByUserId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.core.processmgt.model.StatisticByUser"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.core.processmgt.model.StatisticByUser"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static StatisticByUser toModel(StatisticByUserSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		StatisticByUser model = new StatisticByUserImpl();

		model.setStatisticByUserId(soapModel.getStatisticByUserId());
		model.setUserId(soapModel.getUserId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setMonth(soapModel.getMonth());
		model.setYear(soapModel.getYear());
		model.setDossierStatus(soapModel.getDossierStatus());
		model.setTotalNumber(soapModel.getTotalNumber());
		model.setDelayedNumber(soapModel.getDelayedNumber());
		model.setOntimeNumber(soapModel.getOntimeNumber());
		model.setOntimeRatio(soapModel.getOntimeRatio());
		model.setDelayDaysAvg(soapModel.getDelayDaysAvg());
		model.setFurtherDaysAvg(soapModel.getFurtherDaysAvg());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<StatisticByUser> toModels(
		StatisticByUserSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<StatisticByUser> models = new ArrayList<StatisticByUser>(soapModels.length);

		for (StatisticByUserSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.core.processmgt.model.StatisticByUser"));

	public StatisticByUserModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _statisticByUserId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setStatisticByUserId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _statisticByUserId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return StatisticByUser.class;
	}

	@Override
	public String getModelClassName() {
		return StatisticByUser.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("statisticByUserId", getStatisticByUserId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("month", getMonth());
		attributes.put("year", getYear());
		attributes.put("dossierStatus", getDossierStatus());
		attributes.put("totalNumber", getTotalNumber());
		attributes.put("delayedNumber", getDelayedNumber());
		attributes.put("ontimeNumber", getOntimeNumber());
		attributes.put("ontimeRatio", getOntimeRatio());
		attributes.put("delayDaysAvg", getDelayDaysAvg());
		attributes.put("furtherDaysAvg", getFurtherDaysAvg());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long statisticByUserId = (Long)attributes.get("statisticByUserId");

		if (statisticByUserId != null) {
			setStatisticByUserId(statisticByUserId);
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

		Integer month = (Integer)attributes.get("month");

		if (month != null) {
			setMonth(month);
		}

		Integer year = (Integer)attributes.get("year");

		if (year != null) {
			setYear(year);
		}

		String dossierStatus = (String)attributes.get("dossierStatus");

		if (dossierStatus != null) {
			setDossierStatus(dossierStatus);
		}

		Integer totalNumber = (Integer)attributes.get("totalNumber");

		if (totalNumber != null) {
			setTotalNumber(totalNumber);
		}

		Integer delayedNumber = (Integer)attributes.get("delayedNumber");

		if (delayedNumber != null) {
			setDelayedNumber(delayedNumber);
		}

		Integer ontimeNumber = (Integer)attributes.get("ontimeNumber");

		if (ontimeNumber != null) {
			setOntimeNumber(ontimeNumber);
		}

		Double ontimeRatio = (Double)attributes.get("ontimeRatio");

		if (ontimeRatio != null) {
			setOntimeRatio(ontimeRatio);
		}

		Double delayDaysAvg = (Double)attributes.get("delayDaysAvg");

		if (delayDaysAvg != null) {
			setDelayDaysAvg(delayDaysAvg);
		}

		Double furtherDaysAvg = (Double)attributes.get("furtherDaysAvg");

		if (furtherDaysAvg != null) {
			setFurtherDaysAvg(furtherDaysAvg);
		}
	}

	@JSON
	@Override
	public long getStatisticByUserId() {
		return _statisticByUserId;
	}

	@Override
	public void setStatisticByUserId(long statisticByUserId) {
		_statisticByUserId = statisticByUserId;
	}

	@Override
	public String getStatisticByUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getStatisticByUserId(), "uuid",
			_statisticByUserUuid);
	}

	@Override
	public void setStatisticByUserUuid(String statisticByUserUuid) {
		_statisticByUserUuid = statisticByUserUuid;
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
	public int getMonth() {
		return _month;
	}

	@Override
	public void setMonth(int month) {
		_month = month;
	}

	@JSON
	@Override
	public int getYear() {
		return _year;
	}

	@Override
	public void setYear(int year) {
		_year = year;
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
	public int getTotalNumber() {
		return _totalNumber;
	}

	@Override
	public void setTotalNumber(int totalNumber) {
		_totalNumber = totalNumber;
	}

	@JSON
	@Override
	public int getDelayedNumber() {
		return _delayedNumber;
	}

	@Override
	public void setDelayedNumber(int delayedNumber) {
		_delayedNumber = delayedNumber;
	}

	@JSON
	@Override
	public int getOntimeNumber() {
		return _ontimeNumber;
	}

	@Override
	public void setOntimeNumber(int ontimeNumber) {
		_ontimeNumber = ontimeNumber;
	}

	@JSON
	@Override
	public double getOntimeRatio() {
		return _ontimeRatio;
	}

	@Override
	public void setOntimeRatio(double ontimeRatio) {
		_ontimeRatio = ontimeRatio;
	}

	@JSON
	@Override
	public double getDelayDaysAvg() {
		return _delayDaysAvg;
	}

	@Override
	public void setDelayDaysAvg(double delayDaysAvg) {
		_delayDaysAvg = delayDaysAvg;
	}

	@JSON
	@Override
	public double getFurtherDaysAvg() {
		return _furtherDaysAvg;
	}

	@Override
	public void setFurtherDaysAvg(double furtherDaysAvg) {
		_furtherDaysAvg = furtherDaysAvg;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			StatisticByUser.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public StatisticByUser toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (StatisticByUser)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		StatisticByUserImpl statisticByUserImpl = new StatisticByUserImpl();

		statisticByUserImpl.setStatisticByUserId(getStatisticByUserId());
		statisticByUserImpl.setUserId(getUserId());
		statisticByUserImpl.setGroupId(getGroupId());
		statisticByUserImpl.setCompanyId(getCompanyId());
		statisticByUserImpl.setCreateDate(getCreateDate());
		statisticByUserImpl.setMonth(getMonth());
		statisticByUserImpl.setYear(getYear());
		statisticByUserImpl.setDossierStatus(getDossierStatus());
		statisticByUserImpl.setTotalNumber(getTotalNumber());
		statisticByUserImpl.setDelayedNumber(getDelayedNumber());
		statisticByUserImpl.setOntimeNumber(getOntimeNumber());
		statisticByUserImpl.setOntimeRatio(getOntimeRatio());
		statisticByUserImpl.setDelayDaysAvg(getDelayDaysAvg());
		statisticByUserImpl.setFurtherDaysAvg(getFurtherDaysAvg());

		statisticByUserImpl.resetOriginalValues();

		return statisticByUserImpl;
	}

	@Override
	public int compareTo(StatisticByUser statisticByUser) {
		long primaryKey = statisticByUser.getPrimaryKey();

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

		if (!(obj instanceof StatisticByUser)) {
			return false;
		}

		StatisticByUser statisticByUser = (StatisticByUser)obj;

		long primaryKey = statisticByUser.getPrimaryKey();

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
	public CacheModel<StatisticByUser> toCacheModel() {
		StatisticByUserCacheModel statisticByUserCacheModel = new StatisticByUserCacheModel();

		statisticByUserCacheModel.statisticByUserId = getStatisticByUserId();

		statisticByUserCacheModel.userId = getUserId();

		statisticByUserCacheModel.groupId = getGroupId();

		statisticByUserCacheModel.companyId = getCompanyId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			statisticByUserCacheModel.createDate = createDate.getTime();
		}
		else {
			statisticByUserCacheModel.createDate = Long.MIN_VALUE;
		}

		statisticByUserCacheModel.month = getMonth();

		statisticByUserCacheModel.year = getYear();

		statisticByUserCacheModel.dossierStatus = getDossierStatus();

		String dossierStatus = statisticByUserCacheModel.dossierStatus;

		if ((dossierStatus != null) && (dossierStatus.length() == 0)) {
			statisticByUserCacheModel.dossierStatus = null;
		}

		statisticByUserCacheModel.totalNumber = getTotalNumber();

		statisticByUserCacheModel.delayedNumber = getDelayedNumber();

		statisticByUserCacheModel.ontimeNumber = getOntimeNumber();

		statisticByUserCacheModel.ontimeRatio = getOntimeRatio();

		statisticByUserCacheModel.delayDaysAvg = getDelayDaysAvg();

		statisticByUserCacheModel.furtherDaysAvg = getFurtherDaysAvg();

		return statisticByUserCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{statisticByUserId=");
		sb.append(getStatisticByUserId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", month=");
		sb.append(getMonth());
		sb.append(", year=");
		sb.append(getYear());
		sb.append(", dossierStatus=");
		sb.append(getDossierStatus());
		sb.append(", totalNumber=");
		sb.append(getTotalNumber());
		sb.append(", delayedNumber=");
		sb.append(getDelayedNumber());
		sb.append(", ontimeNumber=");
		sb.append(getOntimeNumber());
		sb.append(", ontimeRatio=");
		sb.append(getOntimeRatio());
		sb.append(", delayDaysAvg=");
		sb.append(getDelayDaysAvg());
		sb.append(", furtherDaysAvg=");
		sb.append(getFurtherDaysAvg());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.processmgt.model.StatisticByUser");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>statisticByUserId</column-name><column-value><![CDATA[");
		sb.append(getStatisticByUserId());
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
			"<column><column-name>month</column-name><column-value><![CDATA[");
		sb.append(getMonth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>year</column-name><column-value><![CDATA[");
		sb.append(getYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierStatus</column-name><column-value><![CDATA[");
		sb.append(getDossierStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>totalNumber</column-name><column-value><![CDATA[");
		sb.append(getTotalNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>delayedNumber</column-name><column-value><![CDATA[");
		sb.append(getDelayedNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ontimeNumber</column-name><column-value><![CDATA[");
		sb.append(getOntimeNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ontimeRatio</column-name><column-value><![CDATA[");
		sb.append(getOntimeRatio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>delayDaysAvg</column-name><column-value><![CDATA[");
		sb.append(getDelayDaysAvg());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>furtherDaysAvg</column-name><column-value><![CDATA[");
		sb.append(getFurtherDaysAvg());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = StatisticByUser.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			StatisticByUser.class
		};
	private long _statisticByUserId;
	private String _statisticByUserUuid;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private int _month;
	private int _year;
	private String _dossierStatus;
	private int _totalNumber;
	private int _delayedNumber;
	private int _ontimeNumber;
	private double _ontimeRatio;
	private double _delayDaysAvg;
	private double _furtherDaysAvg;
	private StatisticByUser _escapedModel;
}