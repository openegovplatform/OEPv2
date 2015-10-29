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
 * The base model interface for the StatisticByDomain service. Represents a row in the &quot;oep_dossiermgt_statisticbydomain&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.core.dossiermgt.model.impl.StatisticByDomainModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.core.dossiermgt.model.impl.StatisticByDomainImpl}.
 * </p>
 *
 * @author trungdk
 * @see StatisticByDomain
 * @see org.oep.core.dossiermgt.model.impl.StatisticByDomainImpl
 * @see org.oep.core.dossiermgt.model.impl.StatisticByDomainModelImpl
 * @generated
 */
public interface StatisticByDomainModel extends BaseModel<StatisticByDomain> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a statistic by domain model instance should use the {@link StatisticByDomain} interface instead.
	 */

	/**
	 * Returns the primary key of this statistic by domain.
	 *
	 * @return the primary key of this statistic by domain
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this statistic by domain.
	 *
	 * @param primaryKey the primary key of this statistic by domain
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the statistic by domain ID of this statistic by domain.
	 *
	 * @return the statistic by domain ID of this statistic by domain
	 */
	public long getStatisticByDomainId();

	/**
	 * Sets the statistic by domain ID of this statistic by domain.
	 *
	 * @param statisticByDomainId the statistic by domain ID of this statistic by domain
	 */
	public void setStatisticByDomainId(long statisticByDomainId);

	/**
	 * Returns the group ID of this statistic by domain.
	 *
	 * @return the group ID of this statistic by domain
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this statistic by domain.
	 *
	 * @param groupId the group ID of this statistic by domain
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this statistic by domain.
	 *
	 * @return the company ID of this statistic by domain
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this statistic by domain.
	 *
	 * @param companyId the company ID of this statistic by domain
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the create date of this statistic by domain.
	 *
	 * @return the create date of this statistic by domain
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this statistic by domain.
	 *
	 * @param createDate the create date of this statistic by domain
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the month of this statistic by domain.
	 *
	 * @return the month of this statistic by domain
	 */
	public int getMonth();

	/**
	 * Sets the month of this statistic by domain.
	 *
	 * @param month the month of this statistic by domain
	 */
	public void setMonth(int month);

	/**
	 * Returns the year of this statistic by domain.
	 *
	 * @return the year of this statistic by domain
	 */
	public int getYear();

	/**
	 * Sets the year of this statistic by domain.
	 *
	 * @param year the year of this statistic by domain
	 */
	public void setYear(int year);

	/**
	 * Returns the dossier domain of this statistic by domain.
	 *
	 * @return the dossier domain of this statistic by domain
	 */
	@AutoEscape
	public String getDossierDomain();

	/**
	 * Sets the dossier domain of this statistic by domain.
	 *
	 * @param dossierDomain the dossier domain of this statistic by domain
	 */
	public void setDossierDomain(String dossierDomain);

	/**
	 * Returns the receive number of this statistic by domain.
	 *
	 * @return the receive number of this statistic by domain
	 */
	public long getReceiveNumber();

	/**
	 * Sets the receive number of this statistic by domain.
	 *
	 * @param receiveNumber the receive number of this statistic by domain
	 */
	public void setReceiveNumber(long receiveNumber);

	/**
	 * Returns the online number of this statistic by domain.
	 *
	 * @return the online number of this statistic by domain
	 */
	public long getOnlineNumber();

	/**
	 * Sets the online number of this statistic by domain.
	 *
	 * @param onlineNumber the online number of this statistic by domain
	 */
	public void setOnlineNumber(long onlineNumber);

	/**
	 * Returns the online ratio of this statistic by domain.
	 *
	 * @return the online ratio of this statistic by domain
	 */
	public double getOnlineRatio();

	/**
	 * Sets the online ratio of this statistic by domain.
	 *
	 * @param onlineRatio the online ratio of this statistic by domain
	 */
	public void setOnlineRatio(double onlineRatio);

	/**
	 * Returns the finish number of this statistic by domain.
	 *
	 * @return the finish number of this statistic by domain
	 */
	public int getFinishNumber();

	/**
	 * Sets the finish number of this statistic by domain.
	 *
	 * @param finishNumber the finish number of this statistic by domain
	 */
	public void setFinishNumber(int finishNumber);

	/**
	 * Returns the ontime number of this statistic by domain.
	 *
	 * @return the ontime number of this statistic by domain
	 */
	public int getOntimeNumber();

	/**
	 * Sets the ontime number of this statistic by domain.
	 *
	 * @param ontimeNumber the ontime number of this statistic by domain
	 */
	public void setOntimeNumber(int ontimeNumber);

	/**
	 * Returns the ontime ratio of this statistic by domain.
	 *
	 * @return the ontime ratio of this statistic by domain
	 */
	public double getOntimeRatio();

	/**
	 * Sets the ontime ratio of this statistic by domain.
	 *
	 * @param ontimeRatio the ontime ratio of this statistic by domain
	 */
	public void setOntimeRatio(double ontimeRatio);

	/**
	 * Returns the delay days avg of this statistic by domain.
	 *
	 * @return the delay days avg of this statistic by domain
	 */
	public double getDelayDaysAvg();

	/**
	 * Sets the delay days avg of this statistic by domain.
	 *
	 * @param delayDaysAvg the delay days avg of this statistic by domain
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
	public int compareTo(StatisticByDomain statisticByDomain);

	@Override
	public int hashCode();

	@Override
	public CacheModel<StatisticByDomain> toCacheModel();

	@Override
	public StatisticByDomain toEscapedModel();

	@Override
	public StatisticByDomain toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}