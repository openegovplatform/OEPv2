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

package org.oep.processmgt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.oep.processmgt.service.http.DossierProc2RoleServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.processmgt.service.http.DossierProc2RoleServiceSoap
 * @generated
 */
public class DossierProc2RoleSoap implements Serializable {
	public static DossierProc2RoleSoap toSoapModel(DossierProc2Role model) {
		DossierProc2RoleSoap soapModel = new DossierProc2RoleSoap();

		soapModel.setDossierProc2RoleId(model.getDossierProc2RoleId());
		soapModel.setDossierProcId(model.getDossierProcId());
		soapModel.setRoleId(model.getRoleId());

		return soapModel;
	}

	public static DossierProc2RoleSoap[] toSoapModels(DossierProc2Role[] models) {
		DossierProc2RoleSoap[] soapModels = new DossierProc2RoleSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DossierProc2RoleSoap[][] toSoapModels(
		DossierProc2Role[][] models) {
		DossierProc2RoleSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DossierProc2RoleSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DossierProc2RoleSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DossierProc2RoleSoap[] toSoapModels(
		List<DossierProc2Role> models) {
		List<DossierProc2RoleSoap> soapModels = new ArrayList<DossierProc2RoleSoap>(models.size());

		for (DossierProc2Role model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DossierProc2RoleSoap[soapModels.size()]);
	}

	public DossierProc2RoleSoap() {
	}

	public long getPrimaryKey() {
		return _dossierProc2RoleId;
	}

	public void setPrimaryKey(long pk) {
		setDossierProc2RoleId(pk);
	}

	public long getDossierProc2RoleId() {
		return _dossierProc2RoleId;
	}

	public void setDossierProc2RoleId(long dossierProc2RoleId) {
		_dossierProc2RoleId = dossierProc2RoleId;
	}

	public long getDossierProcId() {
		return _dossierProcId;
	}

	public void setDossierProcId(long dossierProcId) {
		_dossierProcId = dossierProcId;
	}

	public long getRoleId() {
		return _roleId;
	}

	public void setRoleId(long roleId) {
		_roleId = roleId;
	}

	private long _dossierProc2RoleId;
	private long _dossierProcId;
	private long _roleId;
}