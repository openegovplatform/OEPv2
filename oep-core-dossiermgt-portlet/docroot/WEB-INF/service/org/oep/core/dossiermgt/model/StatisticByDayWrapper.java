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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link StatisticByDay}.
 * </p>
 *
 * @author trungdk
 * @see StatisticByDay
 * @generated
 */
public class StatisticByDayWrapper implements StatisticByDay,
	ModelWrapper<StatisticByDay> {
	public StatisticByDayWrapper(StatisticByDay statisticByDay) {
		_statisticByDay = statisticByDay;
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

	/**
	* Returns the primary key of this statistic by day.
	*
	* @return the primary key of this statistic by day
	*/
	@Override
	public long getPrimaryKey() {
		return _statisticByDay.getPrimaryKey();
	}

	/**
	* Sets the primary key of this statistic by day.
	*
	* @param primaryKey the primary key of this statistic by day
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_statisticByDay.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the statistic by day ID of this statistic by day.
	*
	* @return the statistic by day ID of this statistic by day
	*/
	@Override
	public long getStatisticByDayId() {
		return _statisticByDay.getStatisticByDayId();
	}

	/**
	* Sets the statistic by day ID of this statistic by day.
	*
	* @param statisticByDayId the statistic by day ID of this statistic by day
	*/
	@Override
	public void setStatisticByDayId(long statisticByDayId) {
		_statisticByDay.setStatisticByDayId(statisticByDayId);
	}

	/**
	* Returns the group ID of this statistic by day.
	*
	* @return the group ID of this statistic by day
	*/
	@Override
	public long getGroupId() {
		return _statisticByDay.getGroupId();
	}

	/**
	* Sets the group ID of this statistic by day.
	*
	* @param groupId the group ID of this statistic by day
	*/
	@Override
	public void setGroupId(long groupId) {
		_statisticByDay.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this statistic by day.
	*
	* @return the company ID of this statistic by day
	*/
	@Override
	public long getCompanyId() {
		return _statisticByDay.getCompanyId();
	}

	/**
	* Sets the company ID of this statistic by day.
	*
	* @param companyId the company ID of this statistic by day
	*/
	@Override
	public void setCompanyId(long companyId) {
		_statisticByDay.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this statistic by day.
	*
	* @return the create date of this statistic by day
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _statisticByDay.getCreateDate();
	}

	/**
	* Sets the create date of this statistic by day.
	*
	* @param createDate the create date of this statistic by day
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_statisticByDay.setCreateDate(createDate);
	}

	/**
	* Returns the statistic date of this statistic by day.
	*
	* @return the statistic date of this statistic by day
	*/
	@Override
	public java.util.Date getStatisticDate() {
		return _statisticByDay.getStatisticDate();
	}

	/**
	* Sets the statistic date of this statistic by day.
	*
	* @param statisticDate the statistic date of this statistic by day
	*/
	@Override
	public void setStatisticDate(java.util.Date statisticDate) {
		_statisticByDay.setStatisticDate(statisticDate);
	}

	/**
	* Returns the statistic week of this statistic by day.
	*
	* @return the statistic week of this statistic by day
	*/
	@Override
	public int getStatisticWeek() {
		return _statisticByDay.getStatisticWeek();
	}

	/**
	* Sets the statistic week of this statistic by day.
	*
	* @param statisticWeek the statistic week of this statistic by day
	*/
	@Override
	public void setStatisticWeek(int statisticWeek) {
		_statisticByDay.setStatisticWeek(statisticWeek);
	}

	/**
	* Returns the receive number of this statistic by day.
	*
	* @return the receive number of this statistic by day
	*/
	@Override
	public long getReceiveNumber() {
		return _statisticByDay.getReceiveNumber();
	}

	/**
	* Sets the receive number of this statistic by day.
	*
	* @param receiveNumber the receive number of this statistic by day
	*/
	@Override
	public void setReceiveNumber(long receiveNumber) {
		_statisticByDay.setReceiveNumber(receiveNumber);
	}

	/**
	* Returns the online number of this statistic by day.
	*
	* @return the online number of this statistic by day
	*/
	@Override
	public long getOnlineNumber() {
		return _statisticByDay.getOnlineNumber();
	}

	/**
	* Sets the online number of this statistic by day.
	*
	* @param onlineNumber the online number of this statistic by day
	*/
	@Override
	public void setOnlineNumber(long onlineNumber) {
		_statisticByDay.setOnlineNumber(onlineNumber);
	}

	/**
	* Returns the online ratio of this statistic by day.
	*
	* @return the online ratio of this statistic by day
	*/
	@Override
	public double getOnlineRatio() {
		return _statisticByDay.getOnlineRatio();
	}

	/**
	* Sets the online ratio of this statistic by day.
	*
	* @param onlineRatio the online ratio of this statistic by day
	*/
	@Override
	public void setOnlineRatio(double onlineRatio) {
		_statisticByDay.setOnlineRatio(onlineRatio);
	}

	/**
	* Returns the finish number of this statistic by day.
	*
	* @return the finish number of this statistic by day
	*/
	@Override
	public int getFinishNumber() {
		return _statisticByDay.getFinishNumber();
	}

	/**
	* Sets the finish number of this statistic by day.
	*
	* @param finishNumber the finish number of this statistic by day
	*/
	@Override
	public void setFinishNumber(int finishNumber) {
		_statisticByDay.setFinishNumber(finishNumber);
	}

	/**
	* Returns the ontime number of this statistic by day.
	*
	* @return the ontime number of this statistic by day
	*/
	@Override
	public int getOntimeNumber() {
		return _statisticByDay.getOntimeNumber();
	}

	/**
	* Sets the ontime number of this statistic by day.
	*
	* @param ontimeNumber the ontime number of this statistic by day
	*/
	@Override
	public void setOntimeNumber(int ontimeNumber) {
		_statisticByDay.setOntimeNumber(ontimeNumber);
	}

	/**
	* Returns the ontime ratio of this statistic by day.
	*
	* @return the ontime ratio of this statistic by day
	*/
	@Override
	public double getOntimeRatio() {
		return _statisticByDay.getOntimeRatio();
	}

	/**
	* Sets the ontime ratio of this statistic by day.
	*
	* @param ontimeRatio the ontime ratio of this statistic by day
	*/
	@Override
	public void setOntimeRatio(double ontimeRatio) {
		_statisticByDay.setOntimeRatio(ontimeRatio);
	}

	/**
	* Returns the delay days avg of this statistic by day.
	*
	* @return the delay days avg of this statistic by day
	*/
	@Override
	public double getDelayDaysAvg() {
		return _statisticByDay.getDelayDaysAvg();
	}

	/**
	* Sets the delay days avg of this statistic by day.
	*
	* @param delayDaysAvg the delay days avg of this statistic by day
	*/
	@Override
	public void setDelayDaysAvg(double delayDaysAvg) {
		_statisticByDay.setDelayDaysAvg(delayDaysAvg);
	}

	@Override
	public boolean isNew() {
		return _statisticByDay.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_statisticByDay.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _statisticByDay.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_statisticByDay.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _statisticByDay.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _statisticByDay.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_statisticByDay.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _statisticByDay.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_statisticByDay.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_statisticByDay.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_statisticByDay.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new StatisticByDayWrapper((StatisticByDay)_statisticByDay.clone());
	}

	@Override
	public int compareTo(
		org.oep.core.dossiermgt.model.StatisticByDay statisticByDay) {
		return _statisticByDay.compareTo(statisticByDay);
	}

	@Override
	public int hashCode() {
		return _statisticByDay.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.core.dossiermgt.model.StatisticByDay> toCacheModel() {
		return _statisticByDay.toCacheModel();
	}

	@Override
	public org.oep.core.dossiermgt.model.StatisticByDay toEscapedModel() {
		return new StatisticByDayWrapper(_statisticByDay.toEscapedModel());
	}

	@Override
	public org.oep.core.dossiermgt.model.StatisticByDay toUnescapedModel() {
		return new StatisticByDayWrapper(_statisticByDay.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _statisticByDay.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _statisticByDay.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_statisticByDay.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StatisticByDayWrapper)) {
			return false;
		}

		StatisticByDayWrapper statisticByDayWrapper = (StatisticByDayWrapper)obj;

		if (Validator.equals(_statisticByDay,
					statisticByDayWrapper._statisticByDay)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public StatisticByDay getWrappedStatisticByDay() {
		return _statisticByDay;
	}

	@Override
	public StatisticByDay getWrappedModel() {
		return _statisticByDay;
	}

	@Override
	public void resetOriginalValues() {
		_statisticByDay.resetOriginalValues();
	}

	private StatisticByDay _statisticByDay;
}