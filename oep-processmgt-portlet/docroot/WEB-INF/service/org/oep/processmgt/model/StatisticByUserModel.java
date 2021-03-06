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

package org.oep.processmgt.model;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the StatisticByUser service. Represents a row in the &quot;oep_processmgt_statisticbyuser&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.processmgt.model.impl.StatisticByUserModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.processmgt.model.impl.StatisticByUserImpl}.
 * </p>
 *
 * @author trungdk
 * @see StatisticByUser
 * @see org.oep.processmgt.model.impl.StatisticByUserImpl
 * @see org.oep.processmgt.model.impl.StatisticByUserModelImpl
 * @generated
 */
public interface StatisticByUserModel extends BaseModel<StatisticByUser> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a statistic by user model instance should use the {@link StatisticByUser} interface instead.
	 */

	/**
	 * Returns the primary key of this statistic by user.
	 *
	 * @return the primary key of this statistic by user
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this statistic by user.
	 *
	 * @param primaryKey the primary key of this statistic by user
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the statistic by user ID of this statistic by user.
	 *
	 * @return the statistic by user ID of this statistic by user
	 */
	public long getStatisticByUserId();

	/**
	 * Sets the statistic by user ID of this statistic by user.
	 *
	 * @param statisticByUserId the statistic by user ID of this statistic by user
	 */
	public void setStatisticByUserId(long statisticByUserId);

	/**
	 * Returns the statistic by user uuid of this statistic by user.
	 *
	 * @return the statistic by user uuid of this statistic by user
	 * @throws SystemException if a system exception occurred
	 */
	public String getStatisticByUserUuid() throws SystemException;

	/**
	 * Sets the statistic by user uuid of this statistic by user.
	 *
	 * @param statisticByUserUuid the statistic by user uuid of this statistic by user
	 */
	public void setStatisticByUserUuid(String statisticByUserUuid);

	/**
	 * Returns the user ID of this statistic by user.
	 *
	 * @return the user ID of this statistic by user
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this statistic by user.
	 *
	 * @param userId the user ID of this statistic by user
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this statistic by user.
	 *
	 * @return the user uuid of this statistic by user
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this statistic by user.
	 *
	 * @param userUuid the user uuid of this statistic by user
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the group ID of this statistic by user.
	 *
	 * @return the group ID of this statistic by user
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this statistic by user.
	 *
	 * @param groupId the group ID of this statistic by user
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this statistic by user.
	 *
	 * @return the company ID of this statistic by user
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this statistic by user.
	 *
	 * @param companyId the company ID of this statistic by user
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the create date of this statistic by user.
	 *
	 * @return the create date of this statistic by user
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this statistic by user.
	 *
	 * @param createDate the create date of this statistic by user
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the month of this statistic by user.
	 *
	 * @return the month of this statistic by user
	 */
	public int getMonth();

	/**
	 * Sets the month of this statistic by user.
	 *
	 * @param month the month of this statistic by user
	 */
	public void setMonth(int month);

	/**
	 * Returns the year of this statistic by user.
	 *
	 * @return the year of this statistic by user
	 */
	public int getYear();

	/**
	 * Sets the year of this statistic by user.
	 *
	 * @param year the year of this statistic by user
	 */
	public void setYear(int year);

	/**
	 * Returns the total number of this statistic by user.
	 *
	 * @return the total number of this statistic by user
	 */
	public int getTotalNumber();

	/**
	 * Sets the total number of this statistic by user.
	 *
	 * @param totalNumber the total number of this statistic by user
	 */
	public void setTotalNumber(int totalNumber);

	/**
	 * Returns the ontime number of this statistic by user.
	 *
	 * @return the ontime number of this statistic by user
	 */
	public int getOntimeNumber();

	/**
	 * Sets the ontime number of this statistic by user.
	 *
	 * @param ontimeNumber the ontime number of this statistic by user
	 */
	public void setOntimeNumber(int ontimeNumber);

	/**
	 * Returns the ontime ratio of this statistic by user.
	 *
	 * @return the ontime ratio of this statistic by user
	 */
	public double getOntimeRatio();

	/**
	 * Sets the ontime ratio of this statistic by user.
	 *
	 * @param ontimeRatio the ontime ratio of this statistic by user
	 */
	public void setOntimeRatio(double ontimeRatio);

	/**
	 * Returns the delay days avg of this statistic by user.
	 *
	 * @return the delay days avg of this statistic by user
	 */
	public double getDelayDaysAvg();

	/**
	 * Sets the delay days avg of this statistic by user.
	 *
	 * @param delayDaysAvg the delay days avg of this statistic by user
	 */
	public void setDelayDaysAvg(double delayDaysAvg);

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
	public int compareTo(StatisticByUser statisticByUser);

	@Override
	public int hashCode();

	@Override
	public CacheModel<StatisticByUser> toCacheModel();

	@Override
	public StatisticByUser toEscapedModel();

	@Override
	public StatisticByUser toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}