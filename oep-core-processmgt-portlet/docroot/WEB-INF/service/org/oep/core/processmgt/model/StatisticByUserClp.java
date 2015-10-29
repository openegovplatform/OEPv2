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
import org.oep.core.processmgt.service.StatisticByUserLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class StatisticByUserClp extends BaseModelImpl<StatisticByUser>
	implements StatisticByUser {
	public StatisticByUserClp() {
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
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("statisticByUserId", getStatisticByUserId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("month", getMonth());
		attributes.put("year", getYear());
		attributes.put("totalNumber", getTotalNumber());
		attributes.put("ontimeNumber", getOntimeNumber());
		attributes.put("ontimeRatio", getOntimeRatio());
		attributes.put("delayDaysAvg", getDelayDaysAvg());

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

		Integer totalNumber = (Integer)attributes.get("totalNumber");

		if (totalNumber != null) {
			setTotalNumber(totalNumber);
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
	public long getStatisticByUserId() {
		return _statisticByUserId;
	}

	@Override
	public void setStatisticByUserId(long statisticByUserId) {
		_statisticByUserId = statisticByUserId;

		if (_statisticByUserRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByUserRemoteModel.getClass();

				Method method = clazz.getMethod("setStatisticByUserId",
						long.class);

				method.invoke(_statisticByUserRemoteModel, statisticByUserId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
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

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_statisticByUserRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByUserRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_statisticByUserRemoteModel, userId);
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

		if (_statisticByUserRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByUserRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_statisticByUserRemoteModel, groupId);
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

		if (_statisticByUserRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByUserRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_statisticByUserRemoteModel, companyId);
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

		if (_statisticByUserRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByUserRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_statisticByUserRemoteModel, createDate);
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

		if (_statisticByUserRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByUserRemoteModel.getClass();

				Method method = clazz.getMethod("setMonth", int.class);

				method.invoke(_statisticByUserRemoteModel, month);
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

		if (_statisticByUserRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByUserRemoteModel.getClass();

				Method method = clazz.getMethod("setYear", int.class);

				method.invoke(_statisticByUserRemoteModel, year);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTotalNumber() {
		return _totalNumber;
	}

	@Override
	public void setTotalNumber(int totalNumber) {
		_totalNumber = totalNumber;

		if (_statisticByUserRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByUserRemoteModel.getClass();

				Method method = clazz.getMethod("setTotalNumber", int.class);

				method.invoke(_statisticByUserRemoteModel, totalNumber);
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

		if (_statisticByUserRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByUserRemoteModel.getClass();

				Method method = clazz.getMethod("setOntimeNumber", int.class);

				method.invoke(_statisticByUserRemoteModel, ontimeNumber);
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

		if (_statisticByUserRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByUserRemoteModel.getClass();

				Method method = clazz.getMethod("setOntimeRatio", double.class);

				method.invoke(_statisticByUserRemoteModel, ontimeRatio);
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

		if (_statisticByUserRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByUserRemoteModel.getClass();

				Method method = clazz.getMethod("setDelayDaysAvg", double.class);

				method.invoke(_statisticByUserRemoteModel, delayDaysAvg);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getStatisticByUserRemoteModel() {
		return _statisticByUserRemoteModel;
	}

	public void setStatisticByUserRemoteModel(
		BaseModel<?> statisticByUserRemoteModel) {
		_statisticByUserRemoteModel = statisticByUserRemoteModel;
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

		Class<?> remoteModelClass = _statisticByUserRemoteModel.getClass();

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

		Object returnValue = method.invoke(_statisticByUserRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			StatisticByUserLocalServiceUtil.addStatisticByUser(this);
		}
		else {
			StatisticByUserLocalServiceUtil.updateStatisticByUser(this);
		}
	}

	@Override
	public StatisticByUser toEscapedModel() {
		return (StatisticByUser)ProxyUtil.newProxyInstance(StatisticByUser.class.getClassLoader(),
			new Class[] { StatisticByUser.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		StatisticByUserClp clone = new StatisticByUserClp();

		clone.setStatisticByUserId(getStatisticByUserId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setMonth(getMonth());
		clone.setYear(getYear());
		clone.setTotalNumber(getTotalNumber());
		clone.setOntimeNumber(getOntimeNumber());
		clone.setOntimeRatio(getOntimeRatio());
		clone.setDelayDaysAvg(getDelayDaysAvg());

		return clone;
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

		if (!(obj instanceof StatisticByUserClp)) {
			return false;
		}

		StatisticByUserClp statisticByUser = (StatisticByUserClp)obj;

		long primaryKey = statisticByUser.getPrimaryKey();

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
		StringBundler sb = new StringBundler(23);

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
		sb.append(", totalNumber=");
		sb.append(getTotalNumber());
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
		StringBundler sb = new StringBundler(37);

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
			"<column><column-name>totalNumber</column-name><column-value><![CDATA[");
		sb.append(getTotalNumber());
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

	private long _statisticByUserId;
	private String _statisticByUserUuid;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private int _month;
	private int _year;
	private int _totalNumber;
	private int _ontimeNumber;
	private double _ontimeRatio;
	private double _delayDaysAvg;
	private BaseModel<?> _statisticByUserRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.processmgt.service.ClpSerializer.class;
}