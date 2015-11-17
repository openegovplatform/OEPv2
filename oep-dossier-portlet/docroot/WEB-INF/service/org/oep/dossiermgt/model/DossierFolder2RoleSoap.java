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

import org.oep.dossiermgt.service.persistence.DossierFolder2RolePK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.oep.dossiermgt.service.http.DossierFolder2RoleServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.dossiermgt.service.http.DossierFolder2RoleServiceSoap
 * @generated
 */
public class DossierFolder2RoleSoap implements Serializable {
	public static DossierFolder2RoleSoap toSoapModel(DossierFolder2Role model) {
		DossierFolder2RoleSoap soapModel = new DossierFolder2RoleSoap();

		soapModel.setDossierFolderId(model.getDossierFolderId());
		soapModel.setRoleId(model.getRoleId());

		return soapModel;
	}

	public static DossierFolder2RoleSoap[] toSoapModels(
		DossierFolder2Role[] models) {
		DossierFolder2RoleSoap[] soapModels = new DossierFolder2RoleSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DossierFolder2RoleSoap[][] toSoapModels(
		DossierFolder2Role[][] models) {
		DossierFolder2RoleSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DossierFolder2RoleSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DossierFolder2RoleSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DossierFolder2RoleSoap[] toSoapModels(
		List<DossierFolder2Role> models) {
		List<DossierFolder2RoleSoap> soapModels = new ArrayList<DossierFolder2RoleSoap>(models.size());

		for (DossierFolder2Role model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DossierFolder2RoleSoap[soapModels.size()]);
	}

	public DossierFolder2RoleSoap() {
	}

	public DossierFolder2RolePK getPrimaryKey() {
		return new DossierFolder2RolePK(_dossierFolderId, _roleId);
	}

	public void setPrimaryKey(DossierFolder2RolePK pk) {
		setDossierFolderId(pk.dossierFolderId);
		setRoleId(pk.roleId);
	}

	public long getDossierFolderId() {
		return _dossierFolderId;
	}

	public void setDossierFolderId(long dossierFolderId) {
		_dossierFolderId = dossierFolderId;
	}

	public long getRoleId() {
		return _roleId;
	}

	public void setRoleId(long roleId) {
		_roleId = roleId;
	}

	private long _dossierFolderId;
	private long _roleId;
}