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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.oep.core.processmgt.service.http.StatisticByUserServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.core.processmgt.service.http.StatisticByUserServiceSoap
 * @generated
 */
public class StatisticByUserSoap implements Serializable {
	public static StatisticByUserSoap toSoapModel(StatisticByUser model) {
		StatisticByUserSoap soapModel = new StatisticByUserSoap();

		soapModel.setStatisticByUserId(model.getStatisticByUserId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setMonth(model.getMonth());
		soapModel.setYear(model.getYear());
		soapModel.setTotalNumber(model.getTotalNumber());
		soapModel.setOntimeNumber(model.getOntimeNumber());
		soapModel.setOntimeRatio(model.getOntimeRatio());
		soapModel.setDelayDaysAvg(model.getDelayDaysAvg());

		return soapModel;
	}

	public static StatisticByUserSoap[] toSoapModels(StatisticByUser[] models) {
		StatisticByUserSoap[] soapModels = new StatisticByUserSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static StatisticByUserSoap[][] toSoapModels(
		StatisticByUser[][] models) {
		StatisticByUserSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new StatisticByUserSoap[models.length][models[0].length];
		}
		else {
			soapModels = new StatisticByUserSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static StatisticByUserSoap[] toSoapModels(
		List<StatisticByUser> models) {
		List<StatisticByUserSoap> soapModels = new ArrayList<StatisticByUserSoap>(models.size());

		for (StatisticByUser model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new StatisticByUserSoap[soapModels.size()]);
	}

	public StatisticByUserSoap() {
	}

	public long getPrimaryKey() {
		return _statisticByUserId;
	}

	public void setPrimaryKey(long pk) {
		setStatisticByUserId(pk);
	}

	public long getStatisticByUserId() {
		return _statisticByUserId;
	}

	public void setStatisticByUserId(long statisticByUserId) {
		_statisticByUserId = statisticByUserId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
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

	public int getTotalNumber() {
		return _totalNumber;
	}

	public void setTotalNumber(int totalNumber) {
		_totalNumber = totalNumber;
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

	private long _statisticByUserId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private int _month;
	private int _year;
	private int _totalNumber;
	private int _ontimeNumber;
	private double _ontimeRatio;
	private double _delayDaysAvg;
}