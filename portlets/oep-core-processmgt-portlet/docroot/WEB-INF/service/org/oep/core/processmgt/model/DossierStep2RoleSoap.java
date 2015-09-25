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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.oep.core.processmgt.service.http.DossierStep2RoleServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.core.processmgt.service.http.DossierStep2RoleServiceSoap
 * @generated
 */
public class DossierStep2RoleSoap implements Serializable {
	public static DossierStep2RoleSoap toSoapModel(DossierStep2Role model) {
		DossierStep2RoleSoap soapModel = new DossierStep2RoleSoap();

		soapModel.setId(model.getId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setDossierStepId(model.getDossierStepId());
		soapModel.setRoleId(model.getRoleId());

		return soapModel;
	}

	public static DossierStep2RoleSoap[] toSoapModels(DossierStep2Role[] models) {
		DossierStep2RoleSoap[] soapModels = new DossierStep2RoleSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DossierStep2RoleSoap[][] toSoapModels(
		DossierStep2Role[][] models) {
		DossierStep2RoleSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DossierStep2RoleSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DossierStep2RoleSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DossierStep2RoleSoap[] toSoapModels(
		List<DossierStep2Role> models) {
		List<DossierStep2RoleSoap> soapModels = new ArrayList<DossierStep2RoleSoap>(models.size());

		for (DossierStep2Role model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DossierStep2RoleSoap[soapModels.size()]);
	}

	public DossierStep2RoleSoap() {
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

	public long getDossierStepId() {
		return _dossierStepId;
	}

	public void setDossierStepId(long dossierStepId) {
		_dossierStepId = dossierStepId;
	}

	public long getRoleId() {
		return _roleId;
	}

	public void setRoleId(long roleId) {
		_roleId = roleId;
	}

	private long _id;
	private long _companyId;
	private long _dossierStepId;
	private long _roleId;
}