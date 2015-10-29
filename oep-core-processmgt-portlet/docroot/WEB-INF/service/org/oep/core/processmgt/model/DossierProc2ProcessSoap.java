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
 * This class is used by SOAP remote services, specifically {@link org.oep.core.processmgt.service.http.DossierProc2ProcessServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.core.processmgt.service.http.DossierProc2ProcessServiceSoap
 * @generated
 */
public class DossierProc2ProcessSoap implements Serializable {
	public static DossierProc2ProcessSoap toSoapModel(DossierProc2Process model) {
		DossierProc2ProcessSoap soapModel = new DossierProc2ProcessSoap();

		soapModel.setDossierProc2ProcessId(model.getDossierProc2ProcessId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDossierProcId(model.getDossierProcId());
		soapModel.setGovAgencyId(model.getGovAgencyId());
		soapModel.setGovAgencyName(model.getGovAgencyName());
		soapModel.setDossierProcessId(model.getDossierProcessId());
		soapModel.setAaaa(model.getAaaa());
		soapModel.setBbb(model.getBbb());
		soapModel.setDaysDuration(model.getDaysDuration());
		soapModel.setPaymentFee(model.getPaymentFee());
		soapModel.setPaymentOneGate(model.getPaymentOneGate());
		soapModel.setPaymentEservice(model.getPaymentEservice());
		soapModel.setOrganizationId(model.getOrganizationId());
		soapModel.setEbPartnershipId(model.getEbPartnershipId());

		return soapModel;
	}

	public static DossierProc2ProcessSoap[] toSoapModels(
		DossierProc2Process[] models) {
		DossierProc2ProcessSoap[] soapModels = new DossierProc2ProcessSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DossierProc2ProcessSoap[][] toSoapModels(
		DossierProc2Process[][] models) {
		DossierProc2ProcessSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DossierProc2ProcessSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DossierProc2ProcessSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DossierProc2ProcessSoap[] toSoapModels(
		List<DossierProc2Process> models) {
		List<DossierProc2ProcessSoap> soapModels = new ArrayList<DossierProc2ProcessSoap>(models.size());

		for (DossierProc2Process model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DossierProc2ProcessSoap[soapModels.size()]);
	}

	public DossierProc2ProcessSoap() {
	}

	public long getPrimaryKey() {
		return _dossierProc2ProcessId;
	}

	public void setPrimaryKey(long pk) {
		setDossierProc2ProcessId(pk);
	}

	public long getDossierProc2ProcessId() {
		return _dossierProc2ProcessId;
	}

	public void setDossierProc2ProcessId(long dossierProc2ProcessId) {
		_dossierProc2ProcessId = dossierProc2ProcessId;
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

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getDossierProcId() {
		return _dossierProcId;
	}

	public void setDossierProcId(long dossierProcId) {
		_dossierProcId = dossierProcId;
	}

	public String getGovAgencyId() {
		return _govAgencyId;
	}

	public void setGovAgencyId(String govAgencyId) {
		_govAgencyId = govAgencyId;
	}

	public String getGovAgencyName() {
		return _govAgencyName;
	}

	public void setGovAgencyName(String govAgencyName) {
		_govAgencyName = govAgencyName;
	}

	public long getDossierProcessId() {
		return _dossierProcessId;
	}

	public void setDossierProcessId(long dossierProcessId) {
		_dossierProcessId = dossierProcessId;
	}

	public String getAaaa() {
		return _aaaa;
	}

	public void setAaaa(String aaaa) {
		_aaaa = aaaa;
	}

	public String getBbb() {
		return _bbb;
	}

	public void setBbb(String bbb) {
		_bbb = bbb;
	}

	public int getDaysDuration() {
		return _daysDuration;
	}

	public void setDaysDuration(int daysDuration) {
		_daysDuration = daysDuration;
	}

	public int getPaymentFee() {
		return _paymentFee;
	}

	public void setPaymentFee(int paymentFee) {
		_paymentFee = paymentFee;
	}

	public int getPaymentOneGate() {
		return _paymentOneGate;
	}

	public void setPaymentOneGate(int paymentOneGate) {
		_paymentOneGate = paymentOneGate;
	}

	public int getPaymentEservice() {
		return _paymentEservice;
	}

	public void setPaymentEservice(int paymentEservice) {
		_paymentEservice = paymentEservice;
	}

	public long getOrganizationId() {
		return _organizationId;
	}

	public void setOrganizationId(long organizationId) {
		_organizationId = organizationId;
	}

	public long getEbPartnershipId() {
		return _ebPartnershipId;
	}

	public void setEbPartnershipId(long ebPartnershipId) {
		_ebPartnershipId = ebPartnershipId;
	}

	private long _dossierProc2ProcessId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _dossierProcId;
	private String _govAgencyId;
	private String _govAgencyName;
	private long _dossierProcessId;
	private String _aaaa;
	private String _bbb;
	private int _daysDuration;
	private int _paymentFee;
	private int _paymentOneGate;
	private int _paymentEservice;
	private long _organizationId;
	private long _ebPartnershipId;
}