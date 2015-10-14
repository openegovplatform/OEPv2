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
 * This class is a wrapper for {@link StatisticByAgency}.
 * </p>
 *
 * @author trungdk
 * @see StatisticByAgency
 * @generated
 */
public class StatisticByAgencyWrapper implements StatisticByAgency,
	ModelWrapper<StatisticByAgency> {
	public StatisticByAgencyWrapper(StatisticByAgency statisticByAgency) {
		_statisticByAgency = statisticByAgency;
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

	/**
	* Returns the primary key of this statistic by agency.
	*
	* @return the primary key of this statistic by agency
	*/
	@Override
	public long getPrimaryKey() {
		return _statisticByAgency.getPrimaryKey();
	}

	/**
	* Sets the primary key of this statistic by agency.
	*
	* @param primaryKey the primary key of this statistic by agency
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_statisticByAgency.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the statistic by agency ID of this statistic by agency.
	*
	* @return the statistic by agency ID of this statistic by agency
	*/
	@Override
	public long getStatisticByAgencyId() {
		return _statisticByAgency.getStatisticByAgencyId();
	}

	/**
	* Sets the statistic by agency ID of this statistic by agency.
	*
	* @param statisticByAgencyId the statistic by agency ID of this statistic by agency
	*/
	@Override
	public void setStatisticByAgencyId(long statisticByAgencyId) {
		_statisticByAgency.setStatisticByAgencyId(statisticByAgencyId);
	}

	/**
	* Returns the group ID of this statistic by agency.
	*
	* @return the group ID of this statistic by agency
	*/
	@Override
	public long getGroupId() {
		return _statisticByAgency.getGroupId();
	}

	/**
	* Sets the group ID of this statistic by agency.
	*
	* @param groupId the group ID of this statistic by agency
	*/
	@Override
	public void setGroupId(long groupId) {
		_statisticByAgency.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this statistic by agency.
	*
	* @return the company ID of this statistic by agency
	*/
	@Override
	public long getCompanyId() {
		return _statisticByAgency.getCompanyId();
	}

	/**
	* Sets the company ID of this statistic by agency.
	*
	* @param companyId the company ID of this statistic by agency
	*/
	@Override
	public void setCompanyId(long companyId) {
		_statisticByAgency.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this statistic by agency.
	*
	* @return the create date of this statistic by agency
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _statisticByAgency.getCreateDate();
	}

	/**
	* Sets the create date of this statistic by agency.
	*
	* @param createDate the create date of this statistic by agency
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_statisticByAgency.setCreateDate(createDate);
	}

	/**
	* Returns the month of this statistic by agency.
	*
	* @return the month of this statistic by agency
	*/
	@Override
	public int getMonth() {
		return _statisticByAgency.getMonth();
	}

	/**
	* Sets the month of this statistic by agency.
	*
	* @param month the month of this statistic by agency
	*/
	@Override
	public void setMonth(int month) {
		_statisticByAgency.setMonth(month);
	}

	/**
	* Returns the year of this statistic by agency.
	*
	* @return the year of this statistic by agency
	*/
	@Override
	public int getYear() {
		return _statisticByAgency.getYear();
	}

	/**
	* Sets the year of this statistic by agency.
	*
	* @param year the year of this statistic by agency
	*/
	@Override
	public void setYear(int year) {
		_statisticByAgency.setYear(year);
	}

	/**
	* Returns the gov agency ID of this statistic by agency.
	*
	* @return the gov agency ID of this statistic by agency
	*/
	@Override
	public java.lang.String getGovAgencyId() {
		return _statisticByAgency.getGovAgencyId();
	}

	/**
	* Sets the gov agency ID of this statistic by agency.
	*
	* @param govAgencyId the gov agency ID of this statistic by agency
	*/
	@Override
	public void setGovAgencyId(java.lang.String govAgencyId) {
		_statisticByAgency.setGovAgencyId(govAgencyId);
	}

	/**
	* Returns the submitted number of this statistic by agency.
	*
	* @return the submitted number of this statistic by agency
	*/
	@Override
	public int getSubmittedNumber() {
		return _statisticByAgency.getSubmittedNumber();
	}

	/**
	* Sets the submitted number of this statistic by agency.
	*
	* @param submittedNumber the submitted number of this statistic by agency
	*/
	@Override
	public void setSubmittedNumber(int submittedNumber) {
		_statisticByAgency.setSubmittedNumber(submittedNumber);
	}

	/**
	* Returns the accepted number of this statistic by agency.
	*
	* @return the accepted number of this statistic by agency
	*/
	@Override
	public int getAcceptedNumber() {
		return _statisticByAgency.getAcceptedNumber();
	}

	/**
	* Sets the accepted number of this statistic by agency.
	*
	* @param acceptedNumber the accepted number of this statistic by agency
	*/
	@Override
	public void setAcceptedNumber(int acceptedNumber) {
		_statisticByAgency.setAcceptedNumber(acceptedNumber);
	}

	/**
	* Returns the denied number of this statistic by agency.
	*
	* @return the denied number of this statistic by agency
	*/
	@Override
	public int getDeniedNumber() {
		return _statisticByAgency.getDeniedNumber();
	}

	/**
	* Sets the denied number of this statistic by agency.
	*
	* @param deniedNumber the denied number of this statistic by agency
	*/
	@Override
	public void setDeniedNumber(int deniedNumber) {
		_statisticByAgency.setDeniedNumber(deniedNumber);
	}

	/**
	* Returns the accepted ratio of this statistic by agency.
	*
	* @return the accepted ratio of this statistic by agency
	*/
	@Override
	public double getAcceptedRatio() {
		return _statisticByAgency.getAcceptedRatio();
	}

	/**
	* Sets the accepted ratio of this statistic by agency.
	*
	* @param acceptedRatio the accepted ratio of this statistic by agency
	*/
	@Override
	public void setAcceptedRatio(double acceptedRatio) {
		_statisticByAgency.setAcceptedRatio(acceptedRatio);
	}

	/**
	* Returns the finished number of this statistic by agency.
	*
	* @return the finished number of this statistic by agency
	*/
	@Override
	public int getFinishedNumber() {
		return _statisticByAgency.getFinishedNumber();
	}

	/**
	* Sets the finished number of this statistic by agency.
	*
	* @param finishedNumber the finished number of this statistic by agency
	*/
	@Override
	public void setFinishedNumber(int finishedNumber) {
		_statisticByAgency.setFinishedNumber(finishedNumber);
	}

	/**
	* Returns the ontime number of this statistic by agency.
	*
	* @return the ontime number of this statistic by agency
	*/
	@Override
	public int getOntimeNumber() {
		return _statisticByAgency.getOntimeNumber();
	}

	/**
	* Sets the ontime number of this statistic by agency.
	*
	* @param ontimeNumber the ontime number of this statistic by agency
	*/
	@Override
	public void setOntimeNumber(int ontimeNumber) {
		_statisticByAgency.setOntimeNumber(ontimeNumber);
	}

	/**
	* Returns the delayed number of this statistic by agency.
	*
	* @return the delayed number of this statistic by agency
	*/
	@Override
	public int getDelayedNumber() {
		return _statisticByAgency.getDelayedNumber();
	}

	/**
	* Sets the delayed number of this statistic by agency.
	*
	* @param delayedNumber the delayed number of this statistic by agency
	*/
	@Override
	public void setDelayedNumber(int delayedNumber) {
		_statisticByAgency.setDelayedNumber(delayedNumber);
	}

	/**
	* Returns the ontime ratio of this statistic by agency.
	*
	* @return the ontime ratio of this statistic by agency
	*/
	@Override
	public double getOntimeRatio() {
		return _statisticByAgency.getOntimeRatio();
	}

	/**
	* Sets the ontime ratio of this statistic by agency.
	*
	* @param ontimeRatio the ontime ratio of this statistic by agency
	*/
	@Override
	public void setOntimeRatio(double ontimeRatio) {
		_statisticByAgency.setOntimeRatio(ontimeRatio);
	}

	/**
	* Returns the done number of this statistic by agency.
	*
	* @return the done number of this statistic by agency
	*/
	@Override
	public int getDoneNumber() {
		return _statisticByAgency.getDoneNumber();
	}

	/**
	* Sets the done number of this statistic by agency.
	*
	* @param doneNumber the done number of this statistic by agency
	*/
	@Override
	public void setDoneNumber(int doneNumber) {
		_statisticByAgency.setDoneNumber(doneNumber);
	}

	/**
	* Returns the done ratio of this statistic by agency.
	*
	* @return the done ratio of this statistic by agency
	*/
	@Override
	public double getDoneRatio() {
		return _statisticByAgency.getDoneRatio();
	}

	/**
	* Sets the done ratio of this statistic by agency.
	*
	* @param doneRatio the done ratio of this statistic by agency
	*/
	@Override
	public void setDoneRatio(double doneRatio) {
		_statisticByAgency.setDoneRatio(doneRatio);
	}

	/**
	* Returns the delay days avg of this statistic by agency.
	*
	* @return the delay days avg of this statistic by agency
	*/
	@Override
	public double getDelayDaysAvg() {
		return _statisticByAgency.getDelayDaysAvg();
	}

	/**
	* Sets the delay days avg of this statistic by agency.
	*
	* @param delayDaysAvg the delay days avg of this statistic by agency
	*/
	@Override
	public void setDelayDaysAvg(double delayDaysAvg) {
		_statisticByAgency.setDelayDaysAvg(delayDaysAvg);
	}

	/**
	* Returns the further days avg of this statistic by agency.
	*
	* @return the further days avg of this statistic by agency
	*/
	@Override
	public double getFurtherDaysAvg() {
		return _statisticByAgency.getFurtherDaysAvg();
	}

	/**
	* Sets the further days avg of this statistic by agency.
	*
	* @param furtherDaysAvg the further days avg of this statistic by agency
	*/
	@Override
	public void setFurtherDaysAvg(double furtherDaysAvg) {
		_statisticByAgency.setFurtherDaysAvg(furtherDaysAvg);
	}

	@Override
	public boolean isNew() {
		return _statisticByAgency.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_statisticByAgency.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _statisticByAgency.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_statisticByAgency.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _statisticByAgency.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _statisticByAgency.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_statisticByAgency.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _statisticByAgency.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_statisticByAgency.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_statisticByAgency.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_statisticByAgency.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new StatisticByAgencyWrapper((StatisticByAgency)_statisticByAgency.clone());
	}

	@Override
	public int compareTo(
		org.oep.core.dossiermgt.model.StatisticByAgency statisticByAgency) {
		return _statisticByAgency.compareTo(statisticByAgency);
	}

	@Override
	public int hashCode() {
		return _statisticByAgency.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.core.dossiermgt.model.StatisticByAgency> toCacheModel() {
		return _statisticByAgency.toCacheModel();
	}

	@Override
	public org.oep.core.dossiermgt.model.StatisticByAgency toEscapedModel() {
		return new StatisticByAgencyWrapper(_statisticByAgency.toEscapedModel());
	}

	@Override
	public org.oep.core.dossiermgt.model.StatisticByAgency toUnescapedModel() {
		return new StatisticByAgencyWrapper(_statisticByAgency.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _statisticByAgency.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _statisticByAgency.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_statisticByAgency.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StatisticByAgencyWrapper)) {
			return false;
		}

		StatisticByAgencyWrapper statisticByAgencyWrapper = (StatisticByAgencyWrapper)obj;

		if (Validator.equals(_statisticByAgency,
					statisticByAgencyWrapper._statisticByAgency)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public StatisticByAgency getWrappedStatisticByAgency() {
		return _statisticByAgency;
	}

	@Override
	public StatisticByAgency getWrappedModel() {
		return _statisticByAgency;
	}

	@Override
	public void resetOriginalValues() {
		_statisticByAgency.resetOriginalValues();
	}

	private StatisticByAgency _statisticByAgency;
}