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

import org.oep.core.dossiermgt.service.ClpSerializer;
import org.oep.core.dossiermgt.service.StatisticByAgencyLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class StatisticByAgencyClp extends BaseModelImpl<StatisticByAgency>
	implements StatisticByAgency {
	public StatisticByAgencyClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return StatisticByAgency.class;
	}

	@Override
	public String getModelClassName() {
		return StatisticByAgency.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _statisticByAgencyId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setStatisticByAgencyId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _statisticByAgencyId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("statisticByAgencyId", getStatisticByAgencyId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("month", getMonth());
		attributes.put("year", getYear());
		attributes.put("govAgencyId", getGovAgencyId());
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
		Long statisticByAgencyId = (Long)attributes.get("statisticByAgencyId");

		if (statisticByAgencyId != null) {
			setStatisticByAgencyId(statisticByAgencyId);
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

		String govAgencyId = (String)attributes.get("govAgencyId");

		if (govAgencyId != null) {
			setGovAgencyId(govAgencyId);
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

	@Override
	public long getStatisticByAgencyId() {
		return _statisticByAgencyId;
	}

	@Override
	public void setStatisticByAgencyId(long statisticByAgencyId) {
		_statisticByAgencyId = statisticByAgencyId;

		if (_statisticByAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setStatisticByAgencyId",
						long.class);

				method.invoke(_statisticByAgencyRemoteModel, statisticByAgencyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_statisticByAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_statisticByAgencyRemoteModel, groupId);
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

		if (_statisticByAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_statisticByAgencyRemoteModel, companyId);
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

		if (_statisticByAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_statisticByAgencyRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMonth() {
		return _month;
	}

	@Override
	public void setMonth(int month) {
		_month = month;

		if (_statisticByAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setMonth", int.class);

				method.invoke(_statisticByAgencyRemoteModel, month);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getYear() {
		return _year;
	}

	@Override
	public void setYear(int year) {
		_year = year;

		if (_statisticByAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setYear", int.class);

				method.invoke(_statisticByAgencyRemoteModel, year);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGovAgencyId() {
		return _govAgencyId;
	}

	@Override
	public void setGovAgencyId(String govAgencyId) {
		_govAgencyId = govAgencyId;

		if (_statisticByAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setGovAgencyId", String.class);

				method.invoke(_statisticByAgencyRemoteModel, govAgencyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getReceiveNumber() {
		return _receiveNumber;
	}

	@Override
	public void setReceiveNumber(long receiveNumber) {
		_receiveNumber = receiveNumber;

		if (_statisticByAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setReceiveNumber", long.class);

				method.invoke(_statisticByAgencyRemoteModel, receiveNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getOnlineNumber() {
		return _onlineNumber;
	}

	@Override
	public void setOnlineNumber(long onlineNumber) {
		_onlineNumber = onlineNumber;

		if (_statisticByAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setOnlineNumber", long.class);

				method.invoke(_statisticByAgencyRemoteModel, onlineNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getOnlineRatio() {
		return _onlineRatio;
	}

	@Override
	public void setOnlineRatio(double onlineRatio) {
		_onlineRatio = onlineRatio;

		if (_statisticByAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setOnlineRatio", double.class);

				method.invoke(_statisticByAgencyRemoteModel, onlineRatio);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getFinishNumber() {
		return _finishNumber;
	}

	@Override
	public void setFinishNumber(int finishNumber) {
		_finishNumber = finishNumber;

		if (_statisticByAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setFinishNumber", int.class);

				method.invoke(_statisticByAgencyRemoteModel, finishNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getOntimeNumber() {
		return _ontimeNumber;
	}

	@Override
	public void setOntimeNumber(int ontimeNumber) {
		_ontimeNumber = ontimeNumber;

		if (_statisticByAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setOntimeNumber", int.class);

				method.invoke(_statisticByAgencyRemoteModel, ontimeNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getOntimeRatio() {
		return _ontimeRatio;
	}

	@Override
	public void setOntimeRatio(double ontimeRatio) {
		_ontimeRatio = ontimeRatio;

		if (_statisticByAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setOntimeRatio", double.class);

				method.invoke(_statisticByAgencyRemoteModel, ontimeRatio);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getDelayDaysAvg() {
		return _delayDaysAvg;
	}

	@Override
	public void setDelayDaysAvg(double delayDaysAvg) {
		_delayDaysAvg = delayDaysAvg;

		if (_statisticByAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setDelayDaysAvg", double.class);

				method.invoke(_statisticByAgencyRemoteModel, delayDaysAvg);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getStatisticByAgencyRemoteModel() {
		return _statisticByAgencyRemoteModel;
	}

	public void setStatisticByAgencyRemoteModel(
		BaseModel<?> statisticByAgencyRemoteModel) {
		_statisticByAgencyRemoteModel = statisticByAgencyRemoteModel;
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

		Class<?> remoteModelClass = _statisticByAgencyRemoteModel.getClass();

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

		Object returnValue = method.invoke(_statisticByAgencyRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			StatisticByAgencyLocalServiceUtil.addStatisticByAgency(this);
		}
		else {
			StatisticByAgencyLocalServiceUtil.updateStatisticByAgency(this);
		}
	}

	@Override
	public StatisticByAgency toEscapedModel() {
		return (StatisticByAgency)ProxyUtil.newProxyInstance(StatisticByAgency.class.getClassLoader(),
			new Class[] { StatisticByAgency.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		StatisticByAgencyClp clone = new StatisticByAgencyClp();

		clone.setStatisticByAgencyId(getStatisticByAgencyId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setMonth(getMonth());
		clone.setYear(getYear());
		clone.setGovAgencyId(getGovAgencyId());
		clone.setReceiveNumber(getReceiveNumber());
		clone.setOnlineNumber(getOnlineNumber());
		clone.setOnlineRatio(getOnlineRatio());
		clone.setFinishNumber(getFinishNumber());
		clone.setOntimeNumber(getOntimeNumber());
		clone.setOntimeRatio(getOntimeRatio());
		clone.setDelayDaysAvg(getDelayDaysAvg());

		return clone;
	}

	@Override
	public int compareTo(StatisticByAgency statisticByAgency) {
		long primaryKey = statisticByAgency.getPrimaryKey();

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

		if (!(obj instanceof StatisticByAgencyClp)) {
			return false;
		}

		StatisticByAgencyClp statisticByAgency = (StatisticByAgencyClp)obj;

		long primaryKey = statisticByAgency.getPrimaryKey();

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
		StringBundler sb = new StringBundler(29);

		sb.append("{statisticByAgencyId=");
		sb.append(getStatisticByAgencyId());
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
		sb.append(", govAgencyId=");
		sb.append(getGovAgencyId());
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
		sb.append("org.oep.core.dossiermgt.model.StatisticByAgency");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>statisticByAgencyId</column-name><column-value><![CDATA[");
		sb.append(getStatisticByAgencyId());
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
			"<column><column-name>govAgencyId</column-name><column-value><![CDATA[");
		sb.append(getGovAgencyId());
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

	private long _statisticByAgencyId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private int _month;
	private int _year;
	private String _govAgencyId;
	private long _receiveNumber;
	private long _onlineNumber;
	private double _onlineRatio;
	private int _finishNumber;
	private int _ontimeNumber;
	private double _ontimeRatio;
	private double _delayDaysAvg;
	private BaseModel<?> _statisticByAgencyRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.dossiermgt.service.ClpSerializer.class;
}