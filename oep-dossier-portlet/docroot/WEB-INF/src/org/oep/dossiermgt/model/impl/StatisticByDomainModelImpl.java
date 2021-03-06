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

package org.oep.dossiermgt.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import org.oep.dossiermgt.model.StatisticByDomain;
import org.oep.dossiermgt.model.StatisticByDomainModel;
import org.oep.dossiermgt.model.StatisticByDomainSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the StatisticByDomain service. Represents a row in the &quot;oep_dossiermgt_statisticbydomain&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.dossiermgt.model.StatisticByDomainModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link StatisticByDomainImpl}.
 * </p>
 *
 * @author trungdk
 * @see StatisticByDomainImpl
 * @see org.oep.dossiermgt.model.StatisticByDomain
 * @see org.oep.dossiermgt.model.StatisticByDomainModel
 * @generated
 */
@JSON(strict = true)
public class StatisticByDomainModelImpl extends BaseModelImpl<StatisticByDomain>
	implements StatisticByDomainModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a statistic by domain model instance should use the {@link org.oep.dossiermgt.model.StatisticByDomain} interface instead.
	 */
	public static final String TABLE_NAME = "oep_dossiermgt_statisticbydomain";
	public static final Object[][] TABLE_COLUMNS = {
			{ "statisticByDomainId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "month", Types.INTEGER },
			{ "year", Types.INTEGER },
			{ "dossierDomain", Types.VARCHAR },
			{ "receiveNumber", Types.BIGINT },
			{ "onlineNumber", Types.BIGINT },
			{ "onlineRatio", Types.DOUBLE },
			{ "finishNumber", Types.INTEGER },
			{ "ontimeNumber", Types.INTEGER },
			{ "ontimeRatio", Types.DOUBLE },
			{ "delayDaysAvg", Types.DOUBLE }
		};
	public static final String TABLE_SQL_CREATE = "create table oep_dossiermgt_statisticbydomain (statisticByDomainId LONG not null primary key,groupId LONG,companyId LONG,createDate DATE null,month INTEGER,year INTEGER,dossierDomain VARCHAR(30) null,receiveNumber LONG,onlineNumber LONG,onlineRatio DOUBLE,finishNumber INTEGER,ontimeNumber INTEGER,ontimeRatio DOUBLE,delayDaysAvg DOUBLE)";
	public static final String TABLE_SQL_DROP = "drop table oep_dossiermgt_statisticbydomain";
	public static final String ORDER_BY_JPQL = " ORDER BY statisticByDomain.statisticByDomainId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY oep_dossiermgt_statisticbydomain.statisticByDomainId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.dossiermgt.model.StatisticByDomain"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.dossiermgt.model.StatisticByDomain"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static StatisticByDomain toModel(StatisticByDomainSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		StatisticByDomain model = new StatisticByDomainImpl();

		model.setStatisticByDomainId(soapModel.getStatisticByDomainId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setMonth(soapModel.getMonth());
		model.setYear(soapModel.getYear());
		model.setDossierDomain(soapModel.getDossierDomain());
		model.setReceiveNumber(soapModel.getReceiveNumber());
		model.setOnlineNumber(soapModel.getOnlineNumber());
		model.setOnlineRatio(soapModel.getOnlineRatio());
		model.setFinishNumber(soapModel.getFinishNumber());
		model.setOntimeNumber(soapModel.getOntimeNumber());
		model.setOntimeRatio(soapModel.getOntimeRatio());
		model.setDelayDaysAvg(soapModel.getDelayDaysAvg());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<StatisticByDomain> toModels(
		StatisticByDomainSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<StatisticByDomain> models = new ArrayList<StatisticByDomain>(soapModels.length);

		for (StatisticByDomainSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.dossiermgt.model.StatisticByDomain"));

	public StatisticByDomainModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _statisticByDomainId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setStatisticByDomainId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _statisticByDomainId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return StatisticByDomain.class;
	}

	@Override
	public String getModelClassName() {
		return StatisticByDomain.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("statisticByDomainId", getStatisticByDomainId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("month", getMonth());
		attributes.put("year", getYear());
		attributes.put("dossierDomain", getDossierDomain());
		attributes.put("receiveNumber", getReceiveNumber());
		attributes.put("onlineNumber", getOnlineNumber());
		attributes.put("onlineRatio", getOnlineRatio());
		attributes.put("finishNumber", getFinishNumber());
		attributes.put("ontimeNumber", getOntimeNumber());
		attributes.put("ontimeRatio", getOntimeRatio());
		attributes.put("delayDaysAvg", getDelayDaysAvg());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long statisticByDomainId = (Long)attributes.get("statisticByDomainId");

		if (statisticByDomainId != null) {
			setStatisticByDomainId(statisticByDomainId);
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

		String dossierDomain = (String)attributes.get("dossierDomain");

		if (dossierDomain != null) {
			setDossierDomain(dossierDomain);
		}

		Long receiveNumber = (Long)attributes.get("receiveNumber");

		if (receiveNumber != null) {
			setReceiveNumber(receiveNumber);
		}

		Long onlineNumber = (Long)attributes.get("onlineNumber");

		if (onlineNumber != null) {
			setOnlineNumber(onlineNumber);
		}

		Double onlineRatio = (Double)attributes.get("onlineRatio");

		if (onlineRatio != null) {
			setOnlineRatio(onlineRatio);
		}

		Integer finishNumber = (Integer)attributes.get("finishNumber");

		if (finishNumber != null) {
			setFinishNumber(finishNumber);
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
	}

	@JSON
	@Override
	public long getStatisticByDomainId() {
		return _statisticByDomainId;
	}

	@Override
	public void setStatisticByDomainId(long statisticByDomainId) {
		_statisticByDomainId = statisticByDomainId;
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
	public String getDossierDomain() {
		if (_dossierDomain == null) {
			return StringPool.BLANK;
		}
		else {
			return _dossierDomain;
		}
	}

	@Override
	public void setDossierDomain(String dossierDomain) {
		_dossierDomain = dossierDomain;
	}

	@JSON
	@Override
	public long getReceiveNumber() {
		return _receiveNumber;
	}

	@Override
	public void setReceiveNumber(long receiveNumber) {
		_receiveNumber = receiveNumber;
	}

	@JSON
	@Override
	public long getOnlineNumber() {
		return _onlineNumber;
	}

	@Override
	public void setOnlineNumber(long onlineNumber) {
		_onlineNumber = onlineNumber;
	}

	@JSON
	@Override
	public double getOnlineRatio() {
		return _onlineRatio;
	}

	@Override
	public void setOnlineRatio(double onlineRatio) {
		_onlineRatio = onlineRatio;
	}

	@JSON
	@Override
	public int getFinishNumber() {
		return _finishNumber;
	}

	@Override
	public void setFinishNumber(int finishNumber) {
		_finishNumber = finishNumber;
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

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			StatisticByDomain.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public StatisticByDomain toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (StatisticByDomain)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		StatisticByDomainImpl statisticByDomainImpl = new StatisticByDomainImpl();

		statisticByDomainImpl.setStatisticByDomainId(getStatisticByDomainId());
		statisticByDomainImpl.setGroupId(getGroupId());
		statisticByDomainImpl.setCompanyId(getCompanyId());
		statisticByDomainImpl.setCreateDate(getCreateDate());
		statisticByDomainImpl.setMonth(getMonth());
		statisticByDomainImpl.setYear(getYear());
		statisticByDomainImpl.setDossierDomain(getDossierDomain());
		statisticByDomainImpl.setReceiveNumber(getReceiveNumber());
		statisticByDomainImpl.setOnlineNumber(getOnlineNumber());
		statisticByDomainImpl.setOnlineRatio(getOnlineRatio());
		statisticByDomainImpl.setFinishNumber(getFinishNumber());
		statisticByDomainImpl.setOntimeNumber(getOntimeNumber());
		statisticByDomainImpl.setOntimeRatio(getOntimeRatio());
		statisticByDomainImpl.setDelayDaysAvg(getDelayDaysAvg());

		statisticByDomainImpl.resetOriginalValues();

		return statisticByDomainImpl;
	}

	@Override
	public int compareTo(StatisticByDomain statisticByDomain) {
		long primaryKey = statisticByDomain.getPrimaryKey();

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

		if (!(obj instanceof StatisticByDomain)) {
			return false;
		}

		StatisticByDomain statisticByDomain = (StatisticByDomain)obj;

		long primaryKey = statisticByDomain.getPrimaryKey();

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
	public CacheModel<StatisticByDomain> toCacheModel() {
		StatisticByDomainCacheModel statisticByDomainCacheModel = new StatisticByDomainCacheModel();

		statisticByDomainCacheModel.statisticByDomainId = getStatisticByDomainId();

		statisticByDomainCacheModel.groupId = getGroupId();

		statisticByDomainCacheModel.companyId = getCompanyId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			statisticByDomainCacheModel.createDate = createDate.getTime();
		}
		else {
			statisticByDomainCacheModel.createDate = Long.MIN_VALUE;
		}

		statisticByDomainCacheModel.month = getMonth();

		statisticByDomainCacheModel.year = getYear();

		statisticByDomainCacheModel.dossierDomain = getDossierDomain();

		String dossierDomain = statisticByDomainCacheModel.dossierDomain;

		if ((dossierDomain != null) && (dossierDomain.length() == 0)) {
			statisticByDomainCacheModel.dossierDomain = null;
		}

		statisticByDomainCacheModel.receiveNumber = getReceiveNumber();

		statisticByDomainCacheModel.onlineNumber = getOnlineNumber();

		statisticByDomainCacheModel.onlineRatio = getOnlineRatio();

		statisticByDomainCacheModel.finishNumber = getFinishNumber();

		statisticByDomainCacheModel.ontimeNumber = getOntimeNumber();

		statisticByDomainCacheModel.ontimeRatio = getOntimeRatio();

		statisticByDomainCacheModel.delayDaysAvg = getDelayDaysAvg();

		return statisticByDomainCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{statisticByDomainId=");
		sb.append(getStatisticByDomainId());
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
		sb.append(", dossierDomain=");
		sb.append(getDossierDomain());
		sb.append(", receiveNumber=");
		sb.append(getReceiveNumber());
		sb.append(", onlineNumber=");
		sb.append(getOnlineNumber());
		sb.append(", onlineRatio=");
		sb.append(getOnlineRatio());
		sb.append(", finishNumber=");
		sb.append(getFinishNumber());
		sb.append(", ontimeNumber=");
		sb.append(getOntimeNumber());
		sb.append(", ontimeRatio=");
		sb.append(getOntimeRatio());
		sb.append(", delayDaysAvg=");
		sb.append(getDelayDaysAvg());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("org.oep.dossiermgt.model.StatisticByDomain");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>statisticByDomainId</column-name><column-value><![CDATA[");
		sb.append(getStatisticByDomainId());
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
			"<column><column-name>dossierDomain</column-name><column-value><![CDATA[");
		sb.append(getDossierDomain());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>receiveNumber</column-name><column-value><![CDATA[");
		sb.append(getReceiveNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>onlineNumber</column-name><column-value><![CDATA[");
		sb.append(getOnlineNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>onlineRatio</column-name><column-value><![CDATA[");
		sb.append(getOnlineRatio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>finishNumber</column-name><column-value><![CDATA[");
		sb.append(getFinishNumber());
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

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = StatisticByDomain.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			StatisticByDomain.class
		};
	private long _statisticByDomainId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private int _month;
	private int _year;
	private String _dossierDomain;
	private long _receiveNumber;
	private long _onlineNumber;
	private double _onlineRatio;
	private int _finishNumber;
	private int _ontimeNumber;
	private double _ontimeRatio;
	private double _delayDaysAvg;
	private StatisticByDomain _escapedModel;
}