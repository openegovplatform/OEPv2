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
import org.oep.core.dossiermgt.service.StatisticByDayLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class StatisticByDayClp extends BaseModelImpl<StatisticByDay>
	implements StatisticByDay {
	public StatisticByDayClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return StatisticByDay.class;
	}

	@Override
	public String getModelClassName() {
		return StatisticByDay.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _statisticByDayId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setStatisticByDayId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _statisticByDayId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("statisticByDayId", getStatisticByDayId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("statisticDate", getStatisticDate());
		attributes.put("statisticWeek", getStatisticWeek());
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
		Long statisticByDayId = (Long)attributes.get("statisticByDayId");

		if (statisticByDayId != null) {
			setStatisticByDayId(statisticByDayId);
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

		Date statisticDate = (Date)attributes.get("statisticDate");

		if (statisticDate != null) {
			setStatisticDate(statisticDate);
		}

		Integer statisticWeek = (Integer)attributes.get("statisticWeek");

		if (statisticWeek != null) {
			setStatisticWeek(statisticWeek);
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
	public long getStatisticByDayId() {
		return _statisticByDayId;
	}

	@Override
	public void setStatisticByDayId(long statisticByDayId) {
		_statisticByDayId = statisticByDayId;

		if (_statisticByDayRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByDayRemoteModel.getClass();

				Method method = clazz.getMethod("setStatisticByDayId",
						long.class);

				method.invoke(_statisticByDayRemoteModel, statisticByDayId);
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

		if (_statisticByDayRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByDayRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_statisticByDayRemoteModel, groupId);
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

		if (_statisticByDayRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByDayRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_statisticByDayRemoteModel, companyId);
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

		if (_statisticByDayRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByDayRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_statisticByDayRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getStatisticDate() {
		return _statisticDate;
	}

	@Override
	public void setStatisticDate(Date statisticDate) {
		_statisticDate = statisticDate;

		if (_statisticByDayRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByDayRemoteModel.getClass();

				Method method = clazz.getMethod("setStatisticDate", Date.class);

				method.invoke(_statisticByDayRemoteModel, statisticDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getStatisticWeek() {
		return _statisticWeek;
	}

	@Override
	public void setStatisticWeek(int statisticWeek) {
		_statisticWeek = statisticWeek;

		if (_statisticByDayRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByDayRemoteModel.getClass();

				Method method = clazz.getMethod("setStatisticWeek", int.class);

				method.invoke(_statisticByDayRemoteModel, statisticWeek);
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

		if (_statisticByDayRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByDayRemoteModel.getClass();

				Method method = clazz.getMethod("setReceiveNumber", long.class);

				method.invoke(_statisticByDayRemoteModel, receiveNumber);
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

		if (_statisticByDayRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByDayRemoteModel.getClass();

				Method method = clazz.getMethod("setOnlineNumber", long.class);

				method.invoke(_statisticByDayRemoteModel, onlineNumber);
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

		if (_statisticByDayRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByDayRemoteModel.getClass();

				Method method = clazz.getMethod("setOnlineRatio", double.class);

				method.invoke(_statisticByDayRemoteModel, onlineRatio);
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

		if (_statisticByDayRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByDayRemoteModel.getClass();

				Method method = clazz.getMethod("setFinishNumber", int.class);

				method.invoke(_statisticByDayRemoteModel, finishNumber);
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

		if (_statisticByDayRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByDayRemoteModel.getClass();

				Method method = clazz.getMethod("setOntimeNumber", int.class);

				method.invoke(_statisticByDayRemoteModel, ontimeNumber);
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

		if (_statisticByDayRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByDayRemoteModel.getClass();

				Method method = clazz.getMethod("setOntimeRatio", double.class);

				method.invoke(_statisticByDayRemoteModel, ontimeRatio);
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

		if (_statisticByDayRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByDayRemoteModel.getClass();

				Method method = clazz.getMethod("setDelayDaysAvg", double.class);

				method.invoke(_statisticByDayRemoteModel, delayDaysAvg);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getStatisticByDayRemoteModel() {
		return _statisticByDayRemoteModel;
	}

	public void setStatisticByDayRemoteModel(
		BaseModel<?> statisticByDayRemoteModel) {
		_statisticByDayRemoteModel = statisticByDayRemoteModel;
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

		Class<?> remoteModelClass = _statisticByDayRemoteModel.getClass();

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

		Object returnValue = method.invoke(_statisticByDayRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			StatisticByDayLocalServiceUtil.addStatisticByDay(this);
		}
		else {
			StatisticByDayLocalServiceUtil.updateStatisticByDay(this);
		}
	}

	@Override
	public StatisticByDay toEscapedModel() {
		return (StatisticByDay)ProxyUtil.newProxyInstance(StatisticByDay.class.getClassLoader(),
			new Class[] { StatisticByDay.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		StatisticByDayClp clone = new StatisticByDayClp();

		clone.setStatisticByDayId(getStatisticByDayId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setStatisticDate(getStatisticDate());
		clone.setStatisticWeek(getStatisticWeek());
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
	public int compareTo(StatisticByDay statisticByDay) {
		long primaryKey = statisticByDay.getPrimaryKey();

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

		if (!(obj instanceof StatisticByDayClp)) {
			return false;
		}

		StatisticByDayClp statisticByDay = (StatisticByDayClp)obj;

		long primaryKey = statisticByDay.getPrimaryKey();

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
		StringBundler sb = new StringBundler(27);

		sb.append("{statisticByDayId=");
		sb.append(getStatisticByDayId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", statisticDate=");
		sb.append(getStatisticDate());
		sb.append(", statisticWeek=");
		sb.append(getStatisticWeek());
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
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.dossiermgt.model.StatisticByDay");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>statisticByDayId</column-name><column-value><![CDATA[");
		sb.append(getStatisticByDayId());
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
			"<column><column-name>statisticDate</column-name><column-value><![CDATA[");
		sb.append(getStatisticDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statisticWeek</column-name><column-value><![CDATA[");
		sb.append(getStatisticWeek());
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

	private long _statisticByDayId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _statisticDate;
	private int _statisticWeek;
	private long _receiveNumber;
	private long _onlineNumber;
	private double _onlineRatio;
	private int _finishNumber;
	private int _ontimeNumber;
	private double _ontimeRatio;
	private double _delayDaysAvg;
	private BaseModel<?> _statisticByDayRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.dossiermgt.service.ClpSerializer.class;
}