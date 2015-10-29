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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.oep.core.dossiermgt.service.http.StatisticByDayServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.http.StatisticByDayServiceSoap
 * @generated
 */
public class StatisticByDaySoap implements Serializable {
	public static StatisticByDaySoap toSoapModel(StatisticByDay model) {
		StatisticByDaySoap soapModel = new StatisticByDaySoap();

		soapModel.setStatisticByDayId(model.getStatisticByDayId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setStatisticDate(model.getStatisticDate());
		soapModel.setStatisticWeek(model.getStatisticWeek());
		soapModel.setReceiveNumber(model.getReceiveNumber());
		soapModel.setOnlineNumber(model.getOnlineNumber());
		soapModel.setOnlineRatio(model.getOnlineRatio());
		soapModel.setFinishNumber(model.getFinishNumber());
		soapModel.setOntimeNumber(model.getOntimeNumber());
		soapModel.setOntimeRatio(model.getOntimeRatio());
		soapModel.setDelayDaysAvg(model.getDelayDaysAvg());

		return soapModel;
	}

	public static StatisticByDaySoap[] toSoapModels(StatisticByDay[] models) {
		StatisticByDaySoap[] soapModels = new StatisticByDaySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static StatisticByDaySoap[][] toSoapModels(StatisticByDay[][] models) {
		StatisticByDaySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new StatisticByDaySoap[models.length][models[0].length];
		}
		else {
			soapModels = new StatisticByDaySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static StatisticByDaySoap[] toSoapModels(List<StatisticByDay> models) {
		List<StatisticByDaySoap> soapModels = new ArrayList<StatisticByDaySoap>(models.size());

		for (StatisticByDay model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new StatisticByDaySoap[soapModels.size()]);
	}

	public StatisticByDaySoap() {
	}

	public long getPrimaryKey() {
		return _statisticByDayId;
	}

	public void setPrimaryKey(long pk) {
		setStatisticByDayId(pk);
	}

	public long getStatisticByDayId() {
		return _statisticByDayId;
	}

	public void setStatisticByDayId(long statisticByDayId) {
		_statisticByDayId = statisticByDayId;
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

	public Date getStatisticDate() {
		return _statisticDate;
	}

	public void setStatisticDate(Date statisticDate) {
		_statisticDate = statisticDate;
	}

	public int getStatisticWeek() {
		return _statisticWeek;
	}

	public void setStatisticWeek(int statisticWeek) {
		_statisticWeek = statisticWeek;
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

	private long _statisticByDayId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _statisticDate;
	private int _statisticWeek;
	private long _receiveNumber;
	private long _onlineNumber;
	private double _onlineRatio;
	private int _finishNumber;
	private int _ontimeNumber;
	private double _ontimeRatio;
	private double _delayDaysAvg;
}