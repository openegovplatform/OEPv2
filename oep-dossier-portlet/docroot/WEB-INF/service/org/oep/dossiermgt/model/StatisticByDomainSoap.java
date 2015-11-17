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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.oep.dossiermgt.service.http.StatisticByDomainServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.dossiermgt.service.http.StatisticByDomainServiceSoap
 * @generated
 */
public class StatisticByDomainSoap implements Serializable {
	public static StatisticByDomainSoap toSoapModel(StatisticByDomain model) {
		StatisticByDomainSoap soapModel = new StatisticByDomainSoap();

		soapModel.setStatisticByDomainId(model.getStatisticByDomainId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setMonth(model.getMonth());
		soapModel.setYear(model.getYear());
		soapModel.setDossierDomain(model.getDossierDomain());
		soapModel.setReceiveNumber(model.getReceiveNumber());
		soapModel.setOnlineNumber(model.getOnlineNumber());
		soapModel.setOnlineRatio(model.getOnlineRatio());
		soapModel.setFinishNumber(model.getFinishNumber());
		soapModel.setOntimeNumber(model.getOntimeNumber());
		soapModel.setOntimeRatio(model.getOntimeRatio());
		soapModel.setDelayDaysAvg(model.getDelayDaysAvg());

		return soapModel;
	}

	public static StatisticByDomainSoap[] toSoapModels(
		StatisticByDomain[] models) {
		StatisticByDomainSoap[] soapModels = new StatisticByDomainSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static StatisticByDomainSoap[][] toSoapModels(
		StatisticByDomain[][] models) {
		StatisticByDomainSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new StatisticByDomainSoap[models.length][models[0].length];
		}
		else {
			soapModels = new StatisticByDomainSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static StatisticByDomainSoap[] toSoapModels(
		List<StatisticByDomain> models) {
		List<StatisticByDomainSoap> soapModels = new ArrayList<StatisticByDomainSoap>(models.size());

		for (StatisticByDomain model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new StatisticByDomainSoap[soapModels.size()]);
	}

	public StatisticByDomainSoap() {
	}

	public long getPrimaryKey() {
		return _statisticByDomainId;
	}

	public void setPrimaryKey(long pk) {
		setStatisticByDomainId(pk);
	}

	public long getStatisticByDomainId() {
		return _statisticByDomainId;
	}

	public void setStatisticByDomainId(long statisticByDomainId) {
		_statisticByDomainId = statisticByDomainId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public int getMonth() {
		return _month;
	}

	public void setMonth(int month) {
		_month = month;
	}

	public int getYear() {
		return _year;
	}

	public void setYear(int year) {
		_year = year;
	}

	public String getDossierDomain() {
		return _dossierDomain;
	}

	public void setDossierDomain(String dossierDomain) {
		_dossierDomain = dossierDomain;
	}

	public long getReceiveNumber() {
		return _receiveNumber;
	}

	public void setReceiveNumber(long receiveNumber) {
		_receiveNumber = receiveNumber;
	}

	public long getOnlineNumber() {
		return _onlineNumber;
	}

	public void setOnlineNumber(long onlineNumber) {
		_onlineNumber = onlineNumber;
	}

	public double getOnlineRatio() {
		return _onlineRatio;
	}

	public void setOnlineRatio(double onlineRatio) {
		_onlineRatio = onlineRatio;
	}

	public int getFinishNumber() {
		return _finishNumber;
	}

	public void setFinishNumber(int finishNumber) {
		_finishNumber = finishNumber;
	}

	public int getOntimeNumber() {
		return _ontimeNumber;
	}

	public void setOntimeNumber(int ontimeNumber) {
		_ontimeNumber = ontimeNumber;
	}

	public double getOntimeRatio() {
		return _ontimeRatio;
	}

	public void setOntimeRatio(double ontimeRatio) {
		_ontimeRatio = ontimeRatio;
	}

	public double getDelayDaysAvg() {
		return _delayDaysAvg;
	}

	public void setDelayDaysAvg(double delayDaysAvg) {
		_delayDaysAvg = delayDaysAvg;
	}

	private long _statisticByDomainId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private int _month;
	private int _year;
	private String _dossierDomain;
	private long _receiveNumber;
	private long _onlineNumber;
	private double _onlineRatio;
	private int _finishNumber;
	private int _ontimeNumber;
	private double _ontimeRatio;
	private double _delayDaysAvg;
}