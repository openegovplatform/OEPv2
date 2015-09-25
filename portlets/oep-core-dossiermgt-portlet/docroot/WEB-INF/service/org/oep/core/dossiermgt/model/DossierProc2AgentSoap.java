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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.oep.core.dossiermgt.service.http.DossierProc2AgentServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.http.DossierProc2AgentServiceSoap
 * @generated
 */
public class DossierProc2AgentSoap implements Serializable {
	public static DossierProc2AgentSoap toSoapModel(DossierProc2Agent model) {
		DossierProc2AgentSoap soapModel = new DossierProc2AgentSoap();

		soapModel.setId(model.getId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setDossierProcId(model.getDossierProcId());
		soapModel.setGovAgentNo(model.getGovAgentNo());
		soapModel.setGovAgentName(model.getGovAgentName());

		return soapModel;
	}

	public static DossierProc2AgentSoap[] toSoapModels(
		DossierProc2Agent[] models) {
		DossierProc2AgentSoap[] soapModels = new DossierProc2AgentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DossierProc2AgentSoap[][] toSoapModels(
		DossierProc2Agent[][] models) {
		DossierProc2AgentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DossierProc2AgentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DossierProc2AgentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DossierProc2AgentSoap[] toSoapModels(
		List<DossierProc2Agent> models) {
		List<DossierProc2AgentSoap> soapModels = new ArrayList<DossierProc2AgentSoap>(models.size());

		for (DossierProc2Agent model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DossierProc2AgentSoap[soapModels.size()]);
	}

	public DossierProc2AgentSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getDossierProcId() {
		return _dossierProcId;
	}

	public void setDossierProcId(long dossierProcId) {
		_dossierProcId = dossierProcId;
	}

	public String getGovAgentNo() {
		return _govAgentNo;
	}

	public void setGovAgentNo(String govAgentNo) {
		_govAgentNo = govAgentNo;
	}

	public String getGovAgentName() {
		return _govAgentName;
	}

	public void setGovAgentName(String govAgentName) {
		_govAgentName = govAgentName;
	}

	private long _id;
	private long _companyId;
	private long _dossierProcId;
	private String _govAgentNo;
	private String _govAgentName;
}