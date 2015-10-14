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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link StatisticByUser}.
 * </p>
 *
 * @author trungdk
 * @see StatisticByUser
 * @generated
 */
public class StatisticByUserWrapper implements StatisticByUser,
	ModelWrapper<StatisticByUser> {
	public StatisticByUserWrapper(StatisticByUser statisticByUser) {
		_statisticByUser = statisticByUser;
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

	/**
	* Returns the primary key of this statistic by user.
	*
	* @return the primary key of this statistic by user
	*/
	@Override
	public long getPrimaryKey() {
		return _statisticByUser.getPrimaryKey();
	}

	/**
	* Sets the primary key of this statistic by user.
	*
	* @param primaryKey the primary key of this statistic by user
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_statisticByUser.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the statistic by user ID of this statistic by user.
	*
	* @return the statistic by user ID of this statistic by user
	*/
	@Override
	public long getStatisticByUserId() {
		return _statisticByUser.getStatisticByUserId();
	}

	/**
	* Sets the statistic by user ID of this statistic by user.
	*
	* @param statisticByUserId the statistic by user ID of this statistic by user
	*/
	@Override
	public void setStatisticByUserId(long statisticByUserId) {
		_statisticByUser.setStatisticByUserId(statisticByUserId);
	}

	/**
	* Returns the statistic by user uuid of this statistic by user.
	*
	* @return the statistic by user uuid of this statistic by user
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getStatisticByUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _statisticByUser.getStatisticByUserUuid();
	}

	/**
	* Sets the statistic by user uuid of this statistic by user.
	*
	* @param statisticByUserUuid the statistic by user uuid of this statistic by user
	*/
	@Override
	public void setStatisticByUserUuid(java.lang.String statisticByUserUuid) {
		_statisticByUser.setStatisticByUserUuid(statisticByUserUuid);
	}

	/**
	* Returns the user ID of this statistic by user.
	*
	* @return the user ID of this statistic by user
	*/
	@Override
	public long getUserId() {
		return _statisticByUser.getUserId();
	}

	/**
	* Sets the user ID of this statistic by user.
	*
	* @param userId the user ID of this statistic by user
	*/
	@Override
	public void setUserId(long userId) {
		_statisticByUser.setUserId(userId);
	}

	/**
	* Returns the user uuid of this statistic by user.
	*
	* @return the user uuid of this statistic by user
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _statisticByUser.getUserUuid();
	}

	/**
	* Sets the user uuid of this statistic by user.
	*
	* @param userUuid the user uuid of this statistic by user
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_statisticByUser.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this statistic by user.
	*
	* @return the group ID of this statistic by user
	*/
	@Override
	public long getGroupId() {
		return _statisticByUser.getGroupId();
	}

	/**
	* Sets the group ID of this statistic by user.
	*
	* @param groupId the group ID of this statistic by user
	*/
	@Override
	public void setGroupId(long groupId) {
		_statisticByUser.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this statistic by user.
	*
	* @return the company ID of this statistic by user
	*/
	@Override
	public long getCompanyId() {
		return _statisticByUser.getCompanyId();
	}

	/**
	* Sets the company ID of this statistic by user.
	*
	* @param companyId the company ID of this statistic by user
	*/
	@Override
	public void setCompanyId(long companyId) {
		_statisticByUser.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this statistic by user.
	*
	* @return the create date of this statistic by user
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _statisticByUser.getCreateDate();
	}

	/**
	* Sets the create date of this statistic by user.
	*
	* @param createDate the create date of this statistic by user
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_statisticByUser.setCreateDate(createDate);
	}

	/**
	* Returns the month of this statistic by user.
	*
	* @return the month of this statistic by user
	*/
	@Override
	public int getMonth() {
		return _statisticByUser.getMonth();
	}

	/**
	* Sets the month of this statistic by user.
	*
	* @param month the month of this statistic by user
	*/
	@Override
	public void setMonth(int month) {
		_statisticByUser.setMonth(month);
	}

	/**
	* Returns the year of this statistic by user.
	*
	* @return the year of this statistic by user
	*/
	@Override
	public int getYear() {
		return _statisticByUser.getYear();
	}

	/**
	* Sets the year of this statistic by user.
	*
	* @param year the year of this statistic by user
	*/
	@Override
	public void setYear(int year) {
		_statisticByUser.setYear(year);
	}

	/**
	* Returns the dossier status of this statistic by user.
	*
	* @return the dossier status of this statistic by user
	*/
	@Override
	public java.lang.String getDossierStatus() {
		return _statisticByUser.getDossierStatus();
	}

	/**
	* Sets the dossier status of this statistic by user.
	*
	* @param dossierStatus the dossier status of this statistic by user
	*/
	@Override
	public void setDossierStatus(java.lang.String dossierStatus) {
		_statisticByUser.setDossierStatus(dossierStatus);
	}

	/**
	* Returns the total number of this statistic by user.
	*
	* @return the total number of this statistic by user
	*/
	@Override
	public int getTotalNumber() {
		return _statisticByUser.getTotalNumber();
	}

	/**
	* Sets the total number of this statistic by user.
	*
	* @param totalNumber the total number of this statistic by user
	*/
	@Override
	public void setTotalNumber(int totalNumber) {
		_statisticByUser.setTotalNumber(totalNumber);
	}

	/**
	* Returns the delayed number of this statistic by user.
	*
	* @return the delayed number of this statistic by user
	*/
	@Override
	public int getDelayedNumber() {
		return _statisticByUser.getDelayedNumber();
	}

	/**
	* Sets the delayed number of this statistic by user.
	*
	* @param delayedNumber the delayed number of this statistic by user
	*/
	@Override
	public void setDelayedNumber(int delayedNumber) {
		_statisticByUser.setDelayedNumber(delayedNumber);
	}

	/**
	* Returns the ontime number of this statistic by user.
	*
	* @return the ontime number of this statistic by user
	*/
	@Override
	public int getOntimeNumber() {
		return _statisticByUser.getOntimeNumber();
	}

	/**
	* Sets the ontime number of this statistic by user.
	*
	* @param ontimeNumber the ontime number of this statistic by user
	*/
	@Override
	public void setOntimeNumber(int ontimeNumber) {
		_statisticByUser.setOntimeNumber(ontimeNumber);
	}

	/**
	* Returns the ontime ratio of this statistic by user.
	*
	* @return the ontime ratio of this statistic by user
	*/
	@Override
	public double getOntimeRatio() {
		return _statisticByUser.getOntimeRatio();
	}

	/**
	* Sets the ontime ratio of this statistic by user.
	*
	* @param ontimeRatio the ontime ratio of this statistic by user
	*/
	@Override
	public void setOntimeRatio(double ontimeRatio) {
		_statisticByUser.setOntimeRatio(ontimeRatio);
	}

	/**
	* Returns the delay days avg of this statistic by user.
	*
	* @return the delay days avg of this statistic by user
	*/
	@Override
	public double getDelayDaysAvg() {
		return _statisticByUser.getDelayDaysAvg();
	}

	/**
	* Sets the delay days avg of this statistic by user.
	*
	* @param delayDaysAvg the delay days avg of this statistic by user
	*/
	@Override
	public void setDelayDaysAvg(double delayDaysAvg) {
		_statisticByUser.setDelayDaysAvg(delayDaysAvg);
	}

	/**
	* Returns the further days avg of this statistic by user.
	*
	* @return the further days avg of this statistic by user
	*/
	@Override
	public double getFurtherDaysAvg() {
		return _statisticByUser.getFurtherDaysAvg();
	}

	/**
	* Sets the further days avg of this statistic by user.
	*
	* @param furtherDaysAvg the further days avg of this statistic by user
	*/
	@Override
	public void setFurtherDaysAvg(double furtherDaysAvg) {
		_statisticByUser.setFurtherDaysAvg(furtherDaysAvg);
	}

	@Override
	public boolean isNew() {
		return _statisticByUser.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_statisticByUser.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _statisticByUser.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_statisticByUser.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _statisticByUser.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _statisticByUser.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_statisticByUser.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _statisticByUser.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_statisticByUser.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_statisticByUser.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_statisticByUser.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new StatisticByUserWrapper((StatisticByUser)_statisticByUser.clone());
	}

	@Override
	public int compareTo(
		org.oep.core.processmgt.model.StatisticByUser statisticByUser) {
		return _statisticByUser.compareTo(statisticByUser);
	}

	@Override
	public int hashCode() {
		return _statisticByUser.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.core.processmgt.model.StatisticByUser> toCacheModel() {
		return _statisticByUser.toCacheModel();
	}

	@Override
	public org.oep.core.processmgt.model.StatisticByUser toEscapedModel() {
		return new StatisticByUserWrapper(_statisticByUser.toEscapedModel());
	}

	@Override
	public org.oep.core.processmgt.model.StatisticByUser toUnescapedModel() {
		return new StatisticByUserWrapper(_statisticByUser.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _statisticByUser.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _statisticByUser.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StatisticByUserWrapper)) {
			return false;
		}

		StatisticByUserWrapper statisticByUserWrapper = (StatisticByUserWrapper)obj;

		if (Validator.equals(_statisticByUser,
					statisticByUserWrapper._statisticByUser)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public StatisticByUser getWrappedStatisticByUser() {
		return _statisticByUser;
	}

	@Override
	public StatisticByUser getWrappedModel() {
		return _statisticByUser;
	}

	@Override
	public void resetOriginalValues() {
		_statisticByUser.resetOriginalValues();
	}

	private StatisticByUser _statisticByUser;
}