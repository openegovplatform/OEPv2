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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the StatisticByAgency service. Represents a row in the &quot;oep_dossiermgt_statisticbyagency&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.core.dossiermgt.model.impl.StatisticByAgencyModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.core.dossiermgt.model.impl.StatisticByAgencyImpl}.
 * </p>
 *
 * @author trungdk
 * @see StatisticByAgency
 * @see org.oep.core.dossiermgt.model.impl.StatisticByAgencyImpl
 * @see org.oep.core.dossiermgt.model.impl.StatisticByAgencyModelImpl
 * @generated
 */
public interface StatisticByAgencyModel extends BaseModel<StatisticByAgency> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a statistic by agency model instance should use the {@link StatisticByAgency} interface instead.
	 */

	/**
	 * Returns the primary key of this statistic by agency.
	 *
	 * @return the primary key of this statistic by agency
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this statistic by agency.
	 *
	 * @param primaryKey the primary key of this statistic by agency
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the statistic by agency ID of this statistic by agency.
	 *
	 * @return the statistic by agency ID of this statistic by agency
	 */
	public long getStatisticByAgencyId();

	/**
	 * Sets the statistic by agency ID of this statistic by agency.
	 *
	 * @param statisticByAgencyId the statistic by agency ID of this statistic by agency
	 */
	public void setStatisticByAgencyId(long statisticByAgencyId);

	/**
	 * Returns the group ID of this statistic by agency.
	 *
	 * @return the group ID of this statistic by agency
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this statistic by agency.
	 *
	 * @param groupId the group ID of this statistic by agency
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this statistic by agency.
	 *
	 * @return the company ID of this statistic by agency
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this statistic by agency.
	 *
	 * @param companyId the company ID of this statistic by agency
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the create date of this statistic by agency.
	 *
	 * @return the create date of this statistic by agency
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this statistic by agency.
	 *
	 * @param createDate the create date of this statistic by agency
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the month of this statistic by agency.
	 *
	 * @return the month of this statistic by agency
	 */
	public int getMonth();

	/**
	 * Sets the month of this statistic by agency.
	 *
	 * @param month the month of this statistic by agency
	 */
	public void setMonth(int month);

	/**
	 * Returns the year of this statistic by agency.
	 *
	 * @return the year of this statistic by agency
	 */
	public int getYear();

	/**
	 * Sets the year of this statistic by agency.
	 *
	 * @param year the year of this statistic by agency
	 */
	public void setYear(int year);

	/**
	 * Returns the gov agency ID of this statistic by agency.
	 *
	 * @return the gov agency ID of this statistic by agency
	 */
	@AutoEscape
	public String getGovAgencyId();

	/**
	 * Sets the gov agency ID of this statistic by agency.
	 *
	 * @param govAgencyId the gov agency ID of this statistic by agency
	 */
	public void setGovAgencyId(String govAgencyId);

	/**
	 * Returns the submitted number of this statistic by agency.
	 *
	 * @return the submitted number of this statistic by agency
	 */
	public int getSubmittedNumber();

	/**
	 * Sets the submitted number of this statistic by agency.
	 *
	 * @param submittedNumber the submitted number of this statistic by agency
	 */
	public void setSubmittedNumber(int submittedNumber);

	/**
	 * Returns the accepted number of this statistic by agency.
	 *
	 * @return the accepted number of this statistic by agency
	 */
	public int getAcceptedNumber();

	/**
	 * Sets the accepted number of this statistic by agency.
	 *
	 * @param acceptedNumber the accepted number of this statistic by agency
	 */
	public void setAcceptedNumber(int acceptedNumber);

	/**
	 * Returns the denied number of this statistic by agency.
	 *
	 * @return the denied number of this statistic by agency
	 */
	public int getDeniedNumber();

	/**
	 * Sets the denied number of this statistic by agency.
	 *
	 * @param deniedNumber the denied number of this statistic by agency
	 */
	public void setDeniedNumber(int deniedNumber);

	/**
	 * Returns the accepted ratio of this statistic by agency.
	 *
	 * @return the accepted ratio of this statistic by agency
	 */
	public double getAcceptedRatio();

	/**
	 * Sets the accepted ratio of this statistic by agency.
	 *
	 * @param acceptedRatio the accepted ratio of this statistic by agency
	 */
	public void setAcceptedRatio(double acceptedRatio);

	/**
	 * Returns the finished number of this statistic by agency.
	 *
	 * @return the finished number of this statistic by agency
	 */
	public int getFinishedNumber();

	/**
	 * Sets the finished number of this statistic by agency.
	 *
	 * @param finishedNumber the finished number of this statistic by agency
	 */
	public void setFinishedNumber(int finishedNumber);

	/**
	 * Returns the ontime number of this statistic by agency.
	 *
	 * @return the ontime number of this statistic by agency
	 */
	public int getOntimeNumber();

	/**
	 * Sets the ontime number of this statistic by agency.
	 *
	 * @param ontimeNumber the ontime number of this statistic by agency
	 */
	public void setOntimeNumber(int ontimeNumber);

	/**
	 * Returns the delayed number of this statistic by agency.
	 *
	 * @return the delayed number of this statistic by agency
	 */
	public int getDelayedNumber();

	/**
	 * Sets the delayed number of this statistic by agency.
	 *
	 * @param delayedNumber the delayed number of this statistic by agency
	 */
	public void setDelayedNumber(int delayedNumber);

	/**
	 * Returns the ontime ratio of this statistic by agency.
	 *
	 * @return the ontime ratio of this statistic by agency
	 */
	public double getOntimeRatio();

	/**
	 * Sets the ontime ratio of this statistic by agency.
	 *
	 * @param ontimeRatio the ontime ratio of this statistic by agency
	 */
	public void setOntimeRatio(double ontimeRatio);

	/**
	 * Returns the done number of this statistic by agency.
	 *
	 * @return the done number of this statistic by agency
	 */
	public int getDoneNumber();

	/**
	 * Sets the done number of this statistic by agency.
	 *
	 * @param doneNumber the done number of this statistic by agency
	 */
	public void setDoneNumber(int doneNumber);

	/**
	 * Returns the done ratio of this statistic by agency.
	 *
	 * @return the done ratio of this statistic by agency
	 */
	public double getDoneRatio();

	/**
	 * Sets the done ratio of this statistic by agency.
	 *
	 * @param doneRatio the done ratio of this statistic by agency
	 */
	public void setDoneRatio(double doneRatio);

	/**
	 * Returns the delay days avg of this statistic by agency.
	 *
	 * @return the delay days avg of this statistic by agency
	 */
	public double getDelayDaysAvg();

	/**
	 * Sets the delay days avg of this statistic by agency.
	 *
	 * @param delayDaysAvg the delay days avg of this statistic by agency
	 */
	public void setDelayDaysAvg(double delayDaysAvg);

	/**
	 * Returns the further days avg of this statistic by agency.
	 *
	 * @return the further days avg of this statistic by agency
	 */
	public double getFurtherDaysAvg();

	/**
	 * Sets the further days avg of this statistic by agency.
	 *
	 * @param furtherDaysAvg the further days avg of this statistic by agency
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
	public int compareTo(StatisticByAgency statisticByAgency);

	@Override
	public int hashCode();

	@Override
	public CacheModel<StatisticByAgency> toCacheModel();

	@Override
	public StatisticByAgency toEscapedModel();

	@Override
	public StatisticByAgency toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}