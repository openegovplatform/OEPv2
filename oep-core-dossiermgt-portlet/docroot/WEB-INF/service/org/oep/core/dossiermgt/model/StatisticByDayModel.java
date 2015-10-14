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

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the StatisticByDay service. Represents a row in the &quot;oep_dossiermgt_statisticbyday&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.core.dossiermgt.model.impl.StatisticByDayModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.core.dossiermgt.model.impl.StatisticByDayImpl}.
 * </p>
 *
 * @author trungdk
 * @see StatisticByDay
 * @see org.oep.core.dossiermgt.model.impl.StatisticByDayImpl
 * @see org.oep.core.dossiermgt.model.impl.StatisticByDayModelImpl
 * @generated
 */
public interface StatisticByDayModel extends BaseModel<StatisticByDay> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a statistic by day model instance should use the {@link StatisticByDay} interface instead.
	 */

	/**
	 * Returns the primary key of this statistic by day.
	 *
	 * @return the primary key of this statistic by day
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this statistic by day.
	 *
	 * @param primaryKey the primary key of this statistic by day
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the statistic by day ID of this statistic by day.
	 *
	 * @return the statistic by day ID of this statistic by day
	 */
	public long getStatisticByDayId();

	/**
	 * Sets the statistic by day ID of this statistic by day.
	 *
	 * @param statisticByDayId the statistic by day ID of this statistic by day
	 */
	public void setStatisticByDayId(long statisticByDayId);

	/**
	 * Returns the group ID of this statistic by day.
	 *
	 * @return the group ID of this statistic by day
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this statistic by day.
	 *
	 * @param groupId the group ID of this statistic by day
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this statistic by day.
	 *
	 * @return the company ID of this statistic by day
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this statistic by day.
	 *
	 * @param companyId the company ID of this statistic by day
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the create date of this statistic by day.
	 *
	 * @return the create date of this statistic by day
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this statistic by day.
	 *
	 * @param createDate the create date of this statistic by day
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the statistic date of this statistic by day.
	 *
	 * @return the statistic date of this statistic by day
	 */
	public Date getStatisticDate();

	/**
	 * Sets the statistic date of this statistic by day.
	 *
	 * @param statisticDate the statistic date of this statistic by day
	 */
	public void setStatisticDate(Date statisticDate);

	/**
	 * Returns the statistic week of this statistic by day.
	 *
	 * @return the statistic week of this statistic by day
	 */
	public int getStatisticWeek();

	/**
	 * Sets the statistic week of this statistic by day.
	 *
	 * @param statisticWeek the statistic week of this statistic by day
	 */
	public void setStatisticWeek(int statisticWeek);

	/**
	 * Returns the submitted number of this statistic by day.
	 *
	 * @return the submitted number of this statistic by day
	 */
	public int getSubmittedNumber();

	/**
	 * Sets the submitted number of this statistic by day.
	 *
	 * @param submittedNumber the submitted number of this statistic by day
	 */
	public void setSubmittedNumber(int submittedNumber);

	/**
	 * Returns the accepted number of this statistic by day.
	 *
	 * @return the accepted number of this statistic by day
	 */
	public int getAcceptedNumber();

	/**
	 * Sets the accepted number of this statistic by day.
	 *
	 * @param acceptedNumber the accepted number of this statistic by day
	 */
	public void setAcceptedNumber(int acceptedNumber);

	/**
	 * Returns the denied number of this statistic by day.
	 *
	 * @return the denied number of this statistic by day
	 */
	public int getDeniedNumber();

	/**
	 * Sets the denied number of this statistic by day.
	 *
	 * @param deniedNumber the denied number of this statistic by day
	 */
	public void setDeniedNumber(int deniedNumber);

	/**
	 * Returns the accepted ratio of this statistic by day.
	 *
	 * @return the accepted ratio of this statistic by day
	 */
	public double getAcceptedRatio();

	/**
	 * Sets the accepted ratio of this statistic by day.
	 *
	 * @param acceptedRatio the accepted ratio of this statistic by day
	 */
	public void setAcceptedRatio(double acceptedRatio);

	/**
	 * Returns the finished number of this statistic by day.
	 *
	 * @return the finished number of this statistic by day
	 */
	public int getFinishedNumber();

	/**
	 * Sets the finished number of this statistic by day.
	 *
	 * @param finishedNumber the finished number of this statistic by day
	 */
	public void setFinishedNumber(int finishedNumber);

	/**
	 * Returns the ontime number of this statistic by day.
	 *
	 * @return the ontime number of this statistic by day
	 */
	public int getOntimeNumber();

	/**
	 * Sets the ontime number of this statistic by day.
	 *
	 * @param ontimeNumber the ontime number of this statistic by day
	 */
	public void setOntimeNumber(int ontimeNumber);

	/**
	 * Returns the delayed number of this statistic by day.
	 *
	 * @return the delayed number of this statistic by day
	 */
	public int getDelayedNumber();

	/**
	 * Sets the delayed number of this statistic by day.
	 *
	 * @param delayedNumber the delayed number of this statistic by day
	 */
	public void setDelayedNumber(int delayedNumber);

	/**
	 * Returns the ontime ratio of this statistic by day.
	 *
	 * @return the ontime ratio of this statistic by day
	 */
	public double getOntimeRatio();

	/**
	 * Sets the ontime ratio of this statistic by day.
	 *
	 * @param ontimeRatio the ontime ratio of this statistic by day
	 */
	public void setOntimeRatio(double ontimeRatio);

	/**
	 * Returns the done number of this statistic by day.
	 *
	 * @return the done number of this statistic by day
	 */
	public int getDoneNumber();

	/**
	 * Sets the done number of this statistic by day.
	 *
	 * @param doneNumber the done number of this statistic by day
	 */
	public void setDoneNumber(int doneNumber);

	/**
	 * Returns the done ratio of this statistic by day.
	 *
	 * @return the done ratio of this statistic by day
	 */
	public double getDoneRatio();

	/**
	 * Sets the done ratio of this statistic by day.
	 *
	 * @param doneRatio the done ratio of this statistic by day
	 */
	public void setDoneRatio(double doneRatio);

	/**
	 * Returns the delay days avg of this statistic by day.
	 *
	 * @return the delay days avg of this statistic by day
	 */
	public double getDelayDaysAvg();

	/**
	 * Sets the delay days avg of this statistic by day.
	 *
	 * @param delayDaysAvg the delay days avg of this statistic by day
	 */
	public void setDelayDaysAvg(double delayDaysAvg);

	/**
	 * Returns the further days avg of this statistic by day.
	 *
	 * @return the further days avg of this statistic by day
	 */
	public double getFurtherDaysAvg();

	/**
	 * Sets the further days avg of this statistic by day.
	 *
	 * @param furtherDaysAvg the further days avg of this statistic by day
	 */
	public void setFurtherDaysAvg(double furtherDaysAvg);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(StatisticByDay statisticByDay);

	@Override
	public int hashCode();

	@Override
	public CacheModel<StatisticByDay> toCacheModel();

	@Override
	public StatisticByDay toEscapedModel();

	@Override
	public StatisticByDay toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}