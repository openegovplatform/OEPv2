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
	* Returns the submitted number of this statistic by day.
	*
	* @return the submitted number of this statistic by day
	*/
	@Override
	public int getSubmittedNumber() {
		return _statisticByDay.getSubmittedNumber();
	}

	/**
	* Sets the submitted number of this statistic by day.
	*
	* @param submittedNumber the submitted number of this statistic by day
	*/
	@Override
	public void setSubmittedNumber(int submittedNumber) {
		_statisticByDay.setSubmittedNumber(submittedNumber);
	}

	/**
	* Returns the accepted number of this statistic by day.
	*
	* @return the accepted number of this statistic by day
	*/
	@Override
	public int getAcceptedNumber() {
		return _statisticByDay.getAcceptedNumber();
	}

	/**
	* Sets the accepted number of this statistic by day.
	*
	* @param acceptedNumber the accepted number of this statistic by day
	*/
	@Override
	public void setAcceptedNumber(int acceptedNumber) {
		_statisticByDay.setAcceptedNumber(acceptedNumber);
	}

	/**
	* Returns the denied number of this statistic by day.
	*
	* @return the denied number of this statistic by day
	*/
	@Override
	public int getDeniedNumber() {
		return _statisticByDay.getDeniedNumber();
	}

	/**
	* Sets the denied number of this statistic by day.
	*
	* @param deniedNumber the denied number of this statistic by day
	*/
	@Override
	public void setDeniedNumber(int deniedNumber) {
		_statisticByDay.setDeniedNumber(deniedNumber);
	}

	/**
	* Returns the accepted ratio of this statistic by day.
	*
	* @return the accepted ratio of this statistic by day
	*/
	@Override
	public double getAcceptedRatio() {
		return _statisticByDay.getAcceptedRatio();
	}

	/**
	* Sets the accepted ratio of this statistic by day.
	*
	* @param acceptedRatio the accepted ratio of this statistic by day
	*/
	@Override
	public void setAcceptedRatio(double acceptedRatio) {
		_statisticByDay.setAcceptedRatio(acceptedRatio);
	}

	/**
	* Returns the finished number of this statistic by day.
	*
	* @return the finished number of this statistic by day
	*/
	@Override
	public int getFinishedNumber() {
		return _statisticByDay.getFinishedNumber();
	}

	/**
	* Sets the finished number of this statistic by day.
	*
	* @param finishedNumber the finished number of this statistic by day
	*/
	@Override
	public void setFinishedNumber(int finishedNumber) {
		_statisticByDay.setFinishedNumber(finishedNumber);
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
	* Returns the delayed number of this statistic by day.
	*
	* @return the delayed number of this statistic by day
	*/
	@Override
	public int getDelayedNumber() {
		return _statisticByDay.getDelayedNumber();
	}

	/**
	* Sets the delayed number of this statistic by day.
	*
	* @param delayedNumber the delayed number of this statistic by day
	*/
	@Override
	public void setDelayedNumber(int delayedNumber) {
		_statisticByDay.setDelayedNumber(delayedNumber);
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
	* Returns the done number of this statistic by day.
	*
	* @return the done number of this statistic by day
	*/
	@Override
	public int getDoneNumber() {
		return _statisticByDay.getDoneNumber();
	}

	/**
	* Sets the done number of this statistic by day.
	*
	* @param doneNumber the done number of this statistic by day
	*/
	@Override
	public void setDoneNumber(int doneNumber) {
		_statisticByDay.setDoneNumber(doneNumber);
	}

	/**
	* Returns the done ratio of this statistic by day.
	*
	* @return the done ratio of this statistic by day
	*/
	@Override
	public double getDoneRatio() {
		return _statisticByDay.getDoneRatio();
	}

	/**
	* Sets the done ratio of this statistic by day.
	*
	* @param doneRatio the done ratio of this statistic by day
	*/
	@Override
	public void setDoneRatio(double doneRatio) {
		_statisticByDay.setDoneRatio(doneRatio);
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

	/**
	* Returns the further days avg of this statistic by day.
	*
	* @return the further days avg of this statistic by day
	*/
	@Override
	public double getFurtherDaysAvg() {
		return _statisticByDay.getFurtherDaysAvg();
	}

	/**
	* Sets the further days avg of this statistic by day.
	*
	* @param furtherDaysAvg the further days avg of this statistic by day
	*/
	@Override
	public void setFurtherDaysAvg(double furtherDaysAvg) {
		_statisticByDay.setFurtherDaysAvg(furtherDaysAvg);
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