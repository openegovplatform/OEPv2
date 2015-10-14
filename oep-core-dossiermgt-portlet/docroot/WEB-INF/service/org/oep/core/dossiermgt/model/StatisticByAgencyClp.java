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
		attributes.put("submittedNumber", getSubmittedNumber());
		attributes.put("acceptedNumber", getAcceptedNumber());
		attributes.put("deniedNumber", getDeniedNumber());
		attributes.put("acceptedRatio", getAcceptedRatio());
		attributes.put("finishedNumber", getFinishedNumber());
		attributes.put("ontimeNumber", getOntimeNumber());
		attributes.put("delayedNumber", getDelayedNumber());
		attributes.put("ontimeRatio", getOntimeRatio());
		attributes.put("doneNumber", getDoneNumber());
		attributes.put("doneRatio", getDoneRatio());
		attributes.put("delayDaysAvg", getDelayDaysAvg());
		attributes.put("furtherDaysAvg", getFurtherDaysAvg());

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

		Integer submittedNumber = (Integer)attributes.get("submittedNumber");

		if (submittedNumber != null) {
			setSubmittedNumber(submittedNumber);
		}

		Integer acceptedNumber = (Integer)attributes.get("acceptedNumber");

		if (acceptedNumber != null) {
			setAcceptedNumber(acceptedNumber);
		}

		Integer deniedNumber = (Integer)attributes.get("deniedNumber");

		if (deniedNumber != null) {
			setDeniedNumber(deniedNumber);
		}

		Double acceptedRatio = (Double)attributes.get("acceptedRatio");

		if (acceptedRatio != null) {
			setAcceptedRatio(acceptedRatio);
		}

		Integer finishedNumber = (Integer)attributes.get("finishedNumber");

		if (finishedNumber != null) {
			setFinishedNumber(finishedNumber);
		}

		Integer ontimeNumber = (Integer)attributes.get("ontimeNumber");

		if (ontimeNumber != null) {
			setOntimeNumber(ontimeNumber);
		}

		Integer delayedNumber = (Integer)attributes.get("delayedNumber");

		if (delayedNumber != null) {
			setDelayedNumber(delayedNumber);
		}

		Double ontimeRatio = (Double)attributes.get("ontimeRatio");

		if (ontimeRatio != null) {
			setOntimeRatio(ontimeRatio);
		}

		Integer doneNumber = (Integer)attributes.get("doneNumber");

		if (doneNumber != null) {
			setDoneNumber(doneNumber);
		}

		Double doneRatio = (Double)attributes.get("doneRatio");

		if (doneRatio != null) {
			setDoneRatio(doneRatio);
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
	public int getSubmittedNumber() {
		return _submittedNumber;
	}

	@Override
	public void setSubmittedNumber(int submittedNumber) {
		_submittedNumber = submittedNumber;

		if (_statisticByAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setSubmittedNumber", int.class);

				method.invoke(_statisticByAgencyRemoteModel, submittedNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getAcceptedNumber() {
		return _acceptedNumber;
	}

	@Override
	public void setAcceptedNumber(int acceptedNumber) {
		_acceptedNumber = acceptedNumber;

		if (_statisticByAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setAcceptedNumber", int.class);

				method.invoke(_statisticByAgencyRemoteModel, acceptedNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDeniedNumber() {
		return _deniedNumber;
	}

	@Override
	public void setDeniedNumber(int deniedNumber) {
		_deniedNumber = deniedNumber;

		if (_statisticByAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setDeniedNumber", int.class);

				method.invoke(_statisticByAgencyRemoteModel, deniedNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getAcceptedRatio() {
		return _acceptedRatio;
	}

	@Override
	public void setAcceptedRatio(double acceptedRatio) {
		_acceptedRatio = acceptedRatio;

		if (_statisticByAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setAcceptedRatio", double.class);

				method.invoke(_statisticByAgencyRemoteModel, acceptedRatio);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getFinishedNumber() {
		return _finishedNumber;
	}

	@Override
	public void setFinishedNumber(int finishedNumber) {
		_finishedNumber = finishedNumber;

		if (_statisticByAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setFinishedNumber", int.class);

				method.invoke(_statisticByAgencyRemoteModel, finishedNumber);
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
	public int getDelayedNumber() {
		return _delayedNumber;
	}

	@Override
	public void setDelayedNumber(int delayedNumber) {
		_delayedNumber = delayedNumber;

		if (_statisticByAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setDelayedNumber", int.class);

				method.invoke(_statisticByAgencyRemoteModel, delayedNumber);
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
	public int getDoneNumber() {
		return _doneNumber;
	}

	@Override
	public void setDoneNumber(int doneNumber) {
		_doneNumber = doneNumber;

		if (_statisticByAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setDoneNumber", int.class);

				method.invoke(_statisticByAgencyRemoteModel, doneNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getDoneRatio() {
		return _doneRatio;
	}

	@Override
	public void setDoneRatio(double doneRatio) {
		_doneRatio = doneRatio;

		if (_statisticByAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setDoneRatio", double.class);

				method.invoke(_statisticByAgencyRemoteModel, doneRatio);
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

	@Override
	public double getFurtherDaysAvg() {
		return _furtherDaysAvg;
	}

	@Override
	public void setFurtherDaysAvg(double furtherDaysAvg) {
		_furtherDaysAvg = furtherDaysAvg;

		if (_statisticByAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _statisticByAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setFurtherDaysAvg",
						double.class);

				method.invoke(_statisticByAgencyRemoteModel, furtherDaysAvg);
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
		clone.setSubmittedNumber(getSubmittedNumber());
		clone.setAcceptedNumber(getAcceptedNumber());
		clone.setDeniedNumber(getDeniedNumber());
		clone.setAcceptedRatio(getAcceptedRatio());
		clone.setFinishedNumber(getFinishedNumber());
		clone.setOntimeNumber(getOntimeNumber());
		clone.setDelayedNumber(getDelayedNumber());
		clone.setOntimeRatio(getOntimeRatio());
		clone.setDoneNumber(getDoneNumber());
		clone.setDoneRatio(getDoneRatio());
		clone.setDelayDaysAvg(getDelayDaysAvg());
		clone.setFurtherDaysAvg(getFurtherDaysAvg());

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
		StringBundler sb = new StringBundler(39);

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
		sb.append(", submittedNumber=");
		sb.append(getSubmittedNumber());
		sb.append(", acceptedNumber=");
		sb.append(getAcceptedNumber());
		sb.append(", deniedNumber=");
		sb.append(getDeniedNumber());
		sb.append(", acceptedRatio=");
		sb.append(getAcceptedRatio());
		sb.append(", finishedNumber=");
		sb.append(getFinishedNumber());
		sb.append(", ontimeNumber=");
		sb.append(getOntimeNumber());
		sb.append(", delayedNumber=");
		sb.append(getDelayedNumber());
		sb.append(", ontimeRatio=");
		sb.append(getOntimeRatio());
		sb.append(", doneNumber=");
		sb.append(getDoneNumber());
		sb.append(", doneRatio=");
		sb.append(getDoneRatio());
		sb.append(", delayDaysAvg=");
		sb.append(getDelayDaysAvg());
		sb.append(", furtherDaysAvg=");
		sb.append(getFurtherDaysAvg());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(61);

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
			"<column><column-name>submittedNumber</column-name><column-value><![CDATA[");
		sb.append(getSubmittedNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>acceptedNumber</column-name><column-value><![CDATA[");
		sb.append(getAcceptedNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>deniedNumber</column-name><column-value><![CDATA[");
		sb.append(getDeniedNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>acceptedRatio</column-name><column-value><![CDATA[");
		sb.append(getAcceptedRatio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>finishedNumber</column-name><column-value><![CDATA[");
		sb.append(getFinishedNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ontimeNumber</column-name><column-value><![CDATA[");
		sb.append(getOntimeNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>delayedNumber</column-name><column-value><![CDATA[");
		sb.append(getDelayedNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ontimeRatio</column-name><column-value><![CDATA[");
		sb.append(getOntimeRatio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>doneNumber</column-name><column-value><![CDATA[");
		sb.append(getDoneNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>doneRatio</column-name><column-value><![CDATA[");
		sb.append(getDoneRatio());
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

	private long _statisticByAgencyId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private int _month;
	private int _year;
	private String _govAgencyId;
	private int _submittedNumber;
	private int _acceptedNumber;
	private int _deniedNumber;
	private double _acceptedRatio;
	private int _finishedNumber;
	private int _ontimeNumber;
	private int _delayedNumber;
	private double _ontimeRatio;
	private int _doneNumber;
	private double _doneRatio;
	private double _delayDaysAvg;
	private double _furtherDaysAvg;
	private BaseModel<?> _statisticByAgencyRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.dossiermgt.service.ClpSerializer.class;
}