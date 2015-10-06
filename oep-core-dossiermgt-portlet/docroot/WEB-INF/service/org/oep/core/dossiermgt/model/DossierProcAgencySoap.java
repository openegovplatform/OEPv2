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
 * This class is used by SOAP remote services, specifically {@link org.oep.core.dossiermgt.service.http.DossierProcAgencyServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.http.DossierProcAgencyServiceSoap
 * @generated
 */
public class DossierProcAgencySoap implements Serializable {
	public static DossierProcAgencySoap toSoapModel(DossierProcAgency model) {
		DossierProcAgencySoap soapModel = new DossierProcAgencySoap();

		soapModel.setDossierProcAgencyId(model.getDossierProcAgencyId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDossierProcId(model.getDossierProcId());
		soapModel.setGovAgencyId(model.getGovAgencyId());
		soapModel.setGovAgencyName(model.getGovAgencyName());
		soapModel.setEbPartnerShipId(model.getEbPartnerShipId());

		return soapModel;
	}

	public static DossierProcAgencySoap[] toSoapModels(
		DossierProcAgency[] models) {
		DossierProcAgencySoap[] soapModels = new DossierProcAgencySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DossierProcAgencySoap[][] toSoapModels(
		DossierProcAgency[][] models) {
		DossierProcAgencySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DossierProcAgencySoap[models.length][models[0].length];
		}
		else {
			soapModels = new DossierProcAgencySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DossierProcAgencySoap[] toSoapModels(
		List<DossierProcAgency> models) {
		List<DossierProcAgencySoap> soapModels = new ArrayList<DossierProcAgencySoap>(models.size());

		for (DossierProcAgency model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DossierProcAgencySoap[soapModels.size()]);
	}

	public DossierProcAgencySoap() {
	}

	public long getPrimaryKey() {
		return _dossierProcAgencyId;
	}

	public void setPrimaryKey(long pk) {
		setDossierProcAgencyId(pk);
	}

	public long getDossierProcAgencyId() {
		return _dossierProcAgencyId;
	}

	public void setDossierProcAgencyId(long dossierProcAgencyId) {
		_dossierProcAgencyId = dossierProcAgencyId;
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

	public long getEbPartnerShipId() {
		return _ebPartnerShipId;
	}

	public void setEbPartnerShipId(long ebPartnerShipId) {
		_ebPartnerShipId = ebPartnerShipId;
	}

	private long _dossierProcAgencyId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _dossierProcId;
	private String _govAgencyId;
	private String _govAgencyName;
	private long _ebPartnerShipId;
}