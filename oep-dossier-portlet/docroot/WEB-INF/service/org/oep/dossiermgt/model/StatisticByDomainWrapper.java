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

package org.oep.dossiermgt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link StatisticByDomain}.
 * </p>
 *
 * @author trungdk
 * @see StatisticByDomain
 * @generated
 */
public class StatisticByDomainWrapper implements StatisticByDomain,
	ModelWrapper<StatisticByDomain> {
	public StatisticByDomainWrapper(StatisticByDomain statisticByDomain) {
		_statisticByDomain = statisticByDomain;
	}

	@Override
	public Class<?> getModelClass() {
		return StatisticByDomain.class;
	}

	@Override
	public String getModelClassName() {
		return StatisticByDomain.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("statisticByDomainId", getStatisticByDomainId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("month", getMonth());
		attributes.put("year", getYear());
		attributes.put("dossierDomain", getDossierDomain());
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
		Long statisticByDomainId = (Long)attributes.get("statisticByDomainId");

		if (statisticByDomainId != null) {
			setStatisticByDomainId(statisticByDomainId);
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

		String dossierDomain = (String)attributes.get("dossierDomain");

		if (dossierDomain != null) {
			setDossierDomain(dossierDomain);
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
	* Returns the primary key of this statistic by domain.
	*
	* @return the primary key of this statistic by domain
	*/
	@Override
	public long getPrimaryKey() {
		return _statisticByDomain.getPrimaryKey();
	}

	/**
	* Sets the primary key of this statistic by domain.
	*
	* @param primaryKey the primary key of this statistic by domain
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_statisticByDomain.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the statistic by domain ID of this statistic by domain.
	*
	* @return the statistic by domain ID of this statistic by domain
	*/
	@Override
	public long getStatisticByDomainId() {
		return _statisticByDomain.getStatisticByDomainId();
	}

	/**
	* Sets the statistic by domain ID of this statistic by domain.
	*
	* @param statisticByDomainId the statistic by domain ID of this statistic by domain
	*/
	@Override
	public void setStatisticByDomainId(long statisticByDomainId) {
		_statisticByDomain.setStatisticByDomainId(statisticByDomainId);
	}

	/**
	* Returns the group ID of this statistic by domain.
	*
	* @return the group ID of this statistic by domain
	*/
	@Override
	public long getGroupId() {
		return _statisticByDomain.getGroupId();
	}

	/**
	* Sets the group ID of this statistic by domain.
	*
	* @param groupId the group ID of this statistic by domain
	*/
	@Override
	public void setGroupId(long groupId) {
		_statisticByDomain.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this statistic by domain.
	*
	* @return the company ID of this statistic by domain
	*/
	@Override
	public long getCompanyId() {
		return _statisticByDomain.getCompanyId();
	}

	/**
	* Sets the company ID of this statistic by domain.
	*
	* @param companyId the company ID of this statistic by domain
	*/
	@Override
	public void setCompanyId(long companyId) {
		_statisticByDomain.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this statistic by domain.
	*
	* @return the create date of this statistic by domain
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _statisticByDomain.getCreateDate();
	}

	/**
	* Sets the create date of this statistic by domain.
	*
	* @param createDate the create date of this statistic by domain
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_statisticByDomain.setCreateDate(createDate);
	}

	/**
	* Returns the month of this statistic by domain.
	*
	* @return the month of this statistic by domain
	*/
	@Override
	public int getMonth() {
		return _statisticByDomain.getMonth();
	}

	/**
	* Sets the month of this statistic by domain.
	*
	* @param month the month of this statistic by domain
	*/
	@Override
	public void setMonth(int month) {
		_statisticByDomain.setMonth(month);
	}

	/**
	* Returns the year of this statistic by domain.
	*
	* @return the year of this statistic by domain
	*/
	@Override
	public int getYear() {
		return _statisticByDomain.getYear();
	}

	/**
	* Sets the year of this statistic by domain.
	*
	* @param year the year of this statistic by domain
	*/
	@Override
	public void setYear(int year) {
		_statisticByDomain.setYear(year);
	}

	/**
	* Returns the dossier domain of this statistic by domain.
	*
	* @return the dossier domain of this statistic by domain
	*/
	@Override
	public java.lang.String getDossierDomain() {
		return _statisticByDomain.getDossierDomain();
	}

	/**
	* Sets the dossier domain of this statistic by domain.
	*
	* @param dossierDomain the dossier domain of this statistic by domain
	*/
	@Override
	public void setDossierDomain(java.lang.String dossierDomain) {
		_statisticByDomain.setDossierDomain(dossierDomain);
	}

	/**
	* Returns the receive number of this statistic by domain.
	*
	* @return the receive number of this statistic by domain
	*/
	@Override
	public long getReceiveNumber() {
		return _statisticByDomain.getReceiveNumber();
	}

	/**
	* Sets the receive number of this statistic by domain.
	*
	* @param receiveNumber the receive number of this statistic by domain
	*/
	@Override
	public void setReceiveNumber(long receiveNumber) {
		_statisticByDomain.setReceiveNumber(receiveNumber);
	}

	/**
	* Returns the online number of this statistic by domain.
	*
	* @return the online number of this statistic by domain
	*/
	@Override
	public long getOnlineNumber() {
		return _statisticByDomain.getOnlineNumber();
	}

	/**
	* Sets the online number of this statistic by domain.
	*
	* @param onlineNumber the online number of this statistic by domain
	*/
	@Override
	public void setOnlineNumber(long onlineNumber) {
		_statisticByDomain.setOnlineNumber(onlineNumber);
	}

	/**
	* Returns the online ratio of this statistic by domain.
	*
	* @return the online ratio of this statistic by domain
	*/
	@Override
	public double getOnlineRatio() {
		return _statisticByDomain.getOnlineRatio();
	}

	/**
	* Sets the online ratio of this statistic by domain.
	*
	* @param onlineRatio the online ratio of this statistic by domain
	*/
	@Override
	public void setOnlineRatio(double onlineRatio) {
		_statisticByDomain.setOnlineRatio(onlineRatio);
	}

	/**
	* Returns the finish number of this statistic by domain.
	*
	* @return the finish number of this statistic by domain
	*/
	@Override
	public int getFinishNumber() {
		return _statisticByDomain.getFinishNumber();
	}

	/**
	* Sets the finish number of this statistic by domain.
	*
	* @param finishNumber the finish number of this statistic by domain
	*/
	@Override
	public void setFinishNumber(int finishNumber) {
		_statisticByDomain.setFinishNumber(finishNumber);
	}

	/**
	* Returns the ontime number of this statistic by domain.
	*
	* @return the ontime number of this statistic by domain
	*/
	@Override
	public int getOntimeNumber() {
		return _statisticByDomain.getOntimeNumber();
	}

	/**
	* Sets the ontime number of this statistic by domain.
	*
	* @param ontimeNumber the ontime number of this statistic by domain
	*/
	@Override
	public void setOntimeNumber(int ontimeNumber) {
		_statisticByDomain.setOntimeNumber(ontimeNumber);
	}

	/**
	* Returns the ontime ratio of this statistic by domain.
	*
	* @return the ontime ratio of this statistic by domain
	*/
	@Override
	public double getOntimeRatio() {
		return _statisticByDomain.getOntimeRatio();
	}

	/**
	* Sets the ontime ratio of this statistic by domain.
	*
	* @param ontimeRatio the ontime ratio of this statistic by domain
	*/
	@Override
	public void setOntimeRatio(double ontimeRatio) {
		_statisticByDomain.setOntimeRatio(ontimeRatio);
	}

	/**
	* Returns the delay days avg of this statistic by domain.
	*
	* @return the delay days avg of this statistic by domain
	*/
	@Override
	public double getDelayDaysAvg() {
		return _statisticByDomain.getDelayDaysAvg();
	}

	/**
	* Sets the delay days avg of this statistic by domain.
	*
	* @param delayDaysAvg the delay days avg of this statistic by domain
	*/
	@Override
	public void setDelayDaysAvg(double delayDaysAvg) {
		_statisticByDomain.setDelayDaysAvg(delayDaysAvg);
	}

	@Override
	public boolean isNew() {
		return _statisticByDomain.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_statisticByDomain.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _statisticByDomain.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_statisticByDomain.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _statisticByDomain.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _statisticByDomain.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_statisticByDomain.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _statisticByDomain.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_statisticByDomain.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_statisticByDomain.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_statisticByDomain.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new StatisticByDomainWrapper((StatisticByDomain)_statisticByDomain.clone());
	}

	@Override
	public int compareTo(
		org.oep.dossiermgt.model.StatisticByDomain statisticByDomain) {
		return _statisticByDomain.compareTo(statisticByDomain);
	}

	@Override
	public int hashCode() {
		return _statisticByDomain.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.dossiermgt.model.StatisticByDomain> toCacheModel() {
		return _statisticByDomain.toCacheModel();
	}

	@Override
	public org.oep.dossiermgt.model.StatisticByDomain toEscapedModel() {
		return new StatisticByDomainWrapper(_statisticByDomain.toEscapedModel());
	}

	@Override
	public org.oep.dossiermgt.model.StatisticByDomain toUnescapedModel() {
		return new StatisticByDomainWrapper(_statisticByDomain.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _statisticByDomain.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _statisticByDomain.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_statisticByDomain.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StatisticByDomainWrapper)) {
			return false;
		}

		StatisticByDomainWrapper statisticByDomainWrapper = (StatisticByDomainWrapper)obj;

		if (Validator.equals(_statisticByDomain,
					statisticByDomainWrapper._statisticByDomain)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public StatisticByDomain getWrappedStatisticByDomain() {
		return _statisticByDomain;
	}

	@Override
	public StatisticByDomain getWrappedModel() {
		return _statisticByDomain;
	}

	@Override
	public void resetOriginalValues() {
		_statisticByDomain.resetOriginalValues();
	}

	private StatisticByDomain _statisticByDomain;
}