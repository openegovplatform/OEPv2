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
 * This class is used by SOAP remote services, specifically {@link org.oep.core.dossiermgt.service.http.DossierProcAgentServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.http.DossierProcAgentServiceSoap
 * @generated
 */
public class DossierProcAgentSoap implements Serializable {
	public static DossierProcAgentSoap toSoapModel(DossierProcAgent model) {
		DossierProcAgentSoap soapModel = new DossierProcAgentSoap();

		soapModel.setDossierProcAgentId(model.getDossierProcAgentId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDossierProcId(model.getDossierProcId());
		soapModel.setGovAgencyId(model.getGovAgencyId());
		soapModel.setGovAgencyName(model.getGovAgencyName());
		soapModel.setEbPartnerShipId(model.getEbPartnerShipId());

		return soapModel;
	}

	public static DossierProcAgentSoap[] toSoapModels(DossierProcAgent[] models) {
		DossierProcAgentSoap[] soapModels = new DossierProcAgentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DossierProcAgentSoap[][] toSoapModels(
		DossierProcAgent[][] models) {
		DossierProcAgentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DossierProcAgentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DossierProcAgentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DossierProcAgentSoap[] toSoapModels(
		List<DossierProcAgent> models) {
		List<DossierProcAgentSoap> soapModels = new ArrayList<DossierProcAgentSoap>(models.size());

		for (DossierProcAgent model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DossierProcAgentSoap[soapModels.size()]);
	}

	public DossierProcAgentSoap() {
	}

	public long getPrimaryKey() {
		return _dossierProcAgentId;
	}

	public void setPrimaryKey(long pk) {
		setDossierProcAgentId(pk);
	}

	public long getDossierProcAgentId() {
		return _dossierProcAgentId;
	}

	public void setDossierProcAgentId(long dossierProcAgentId) {
		_dossierProcAgentId = dossierProcAgentId;
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

	private long _dossierProcAgentId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _dossierProcId;
	private String _govAgencyId;
	private String _govAgencyName;
	private long _ebPartnerShipId;
}