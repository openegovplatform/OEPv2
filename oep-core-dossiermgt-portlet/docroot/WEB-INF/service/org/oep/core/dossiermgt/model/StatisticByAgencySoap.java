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
 * This class is used by SOAP remote services, specifically {@link org.oep.core.dossiermgt.service.http.StatisticByAgencyServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.http.StatisticByAgencyServiceSoap
 * @generated
 */
public class StatisticByAgencySoap implements Serializable {
	public static StatisticByAgencySoap toSoapModel(StatisticByAgency model) {
		StatisticByAgencySoap soapModel = new StatisticByAgencySoap();

		soapModel.setStatisticByAgencyId(model.getStatisticByAgencyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setMonth(model.getMonth());
		soapModel.setYear(model.getYear());
		soapModel.setGovAgencyId(model.getGovAgencyId());
		soapModel.setSubmittedNumber(model.getSubmittedNumber());
		soapModel.setAcceptedNumber(model.getAcceptedNumber());
		soapModel.setDeniedNumber(model.getDeniedNumber());
		soapModel.setAcceptedRatio(model.getAcceptedRatio());
		soapModel.setFinishedNumber(model.getFinishedNumber());
		soapModel.setOntimeNumber(model.getOntimeNumber());
		soapModel.setDelayedNumber(model.getDelayedNumber());
		soapModel.setOntimeRatio(model.getOntimeRatio());
		soapModel.setDoneNumber(model.getDoneNumber());
		soapModel.setDoneRatio(model.getDoneRatio());
		soapModel.setDelayDaysAvg(model.getDelayDaysAvg());
		soapModel.setFurtherDaysAvg(model.getFurtherDaysAvg());

		return soapModel;
	}

	public static StatisticByAgencySoap[] toSoapModels(
		StatisticByAgency[] models) {
		StatisticByAgencySoap[] soapModels = new StatisticByAgencySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static StatisticByAgencySoap[][] toSoapModels(
		StatisticByAgency[][] models) {
		StatisticByAgencySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new StatisticByAgencySoap[models.length][models[0].length];
		}
		else {
			soapModels = new StatisticByAgencySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static StatisticByAgencySoap[] toSoapModels(
		List<StatisticByAgency> models) {
		List<StatisticByAgencySoap> soapModels = new ArrayList<StatisticByAgencySoap>(models.size());

		for (StatisticByAgency model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new StatisticByAgencySoap[soapModels.size()]);
	}

	public StatisticByAgencySoap() {
	}

	public long getPrimaryKey() {
		return _statisticByAgencyId;
	}

	public void setPrimaryKey(long pk) {
		setStatisticByAgencyId(pk);
	}

	public long getStatisticByAgencyId() {
		return _statisticByAgencyId;
	}

	public void setStatisticByAgencyId(long statisticByAgencyId) {
		_statisticByAgencyId = statisticByAgencyId;
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

	public String getGovAgencyId() {
		return _govAgencyId;
	}

	public void setGovAgencyId(String govAgencyId) {
		_govAgencyId = govAgencyId;
	}

	public int getSubmittedNumber() {
		return _submittedNumber;
	}

	public void setSubmittedNumber(int submittedNumber) {
		_submittedNumber = submittedNumber;
	}

	public int getAcceptedNumber() {
		return _acceptedNumber;
	}

	public void setAcceptedNumber(int acceptedNumber) {
		_acceptedNumber = acceptedNumber;
	}

	public int getDeniedNumber() {
		return _deniedNumber;
	}

	public void setDeniedNumber(int deniedNumber) {
		_deniedNumber = deniedNumber;
	}

	public double getAcceptedRatio() {
		return _acceptedRatio;
	}

	public void setAcceptedRatio(double acceptedRatio) {
		_acceptedRatio = acceptedRatio;
	}

	public int getFinishedNumber() {
		return _finishedNumber;
	}

	public void setFinishedNumber(int finishedNumber) {
		_finishedNumber = finishedNumber;
	}

	public int getOntimeNumber() {
		return _ontimeNumber;
	}

	public void setOntimeNumber(int ontimeNumber) {
		_ontimeNumber = ontimeNumber;
	}

	public int getDelayedNumber() {
		return _delayedNumber;
	}

	public void setDelayedNumber(int delayedNumber) {
		_delayedNumber = delayedNumber;
	}

	public double getOntimeRatio() {
		return _ontimeRatio;
	}

	public void setOntimeRatio(double ontimeRatio) {
		_ontimeRatio = ontimeRatio;
	}

	public int getDoneNumber() {
		return _doneNumber;
	}

	public void setDoneNumber(int doneNumber) {
		_doneNumber = doneNumber;
	}

	public double getDoneRatio() {
		return _doneRatio;
	}

	public void setDoneRatio(double doneRatio) {
		_doneRatio = doneRatio;
	}

	public double getDelayDaysAvg() {
		return _delayDaysAvg;
	}

	public void setDelayDaysAvg(double delayDaysAvg) {
		_delayDaysAvg = delayDaysAvg;
	}

	public double getFurtherDaysAvg() {
		return _furtherDaysAvg;
	}

	public void setFurtherDaysAvg(double furtherDaysAvg) {
		_furtherDaysAvg = furtherDaysAvg;
	}

	private long _statisticByAgencyId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private int _month;
	private int _year;
	private String _govAgencyId;
	private int _submittedNumber;
	private int _acceptedNumber;
	private int _deniedNumber;
	private double _acceptedRatio;
	private int _finishedNumber;
	private int _ontimeNumber;
	private int _delayedNumber;
	private double _ontimeRatio;
	private int _doneNumber;
	private double _doneRatio;
	private double _delayDaysAvg;
	private double _furtherDaysAvg;
}