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

package org.oep.usermgt.model;

import org.oep.usermgt.service.persistence.Jobpos2RolePK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.oep.usermgt.service.http.Jobpos2RoleServiceSoap}.
 *
 * @author NQMINH
 * @see org.oep.usermgt.service.http.Jobpos2RoleServiceSoap
 * @generated
 */
public class Jobpos2RoleSoap implements Serializable {
	public static Jobpos2RoleSoap toSoapModel(Jobpos2Role model) {
		Jobpos2RoleSoap soapModel = new Jobpos2RoleSoap();

		soapModel.setJobPosId(model.getJobPosId());
		soapModel.setRoleId(model.getRoleId());

		return soapModel;
	}

	public static Jobpos2RoleSoap[] toSoapModels(Jobpos2Role[] models) {
		Jobpos2RoleSoap[] soapModels = new Jobpos2RoleSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static Jobpos2RoleSoap[][] toSoapModels(Jobpos2Role[][] models) {
		Jobpos2RoleSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new Jobpos2RoleSoap[models.length][models[0].length];
		}
		else {
			soapModels = new Jobpos2RoleSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static Jobpos2RoleSoap[] toSoapModels(List<Jobpos2Role> models) {
		List<Jobpos2RoleSoap> soapModels = new ArrayList<Jobpos2RoleSoap>(models.size());

		for (Jobpos2Role model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new Jobpos2RoleSoap[soapModels.size()]);
	}

	public Jobpos2RoleSoap() {
	}

	public Jobpos2RolePK getPrimaryKey() {
		return new Jobpos2RolePK(_jobPosId, _roleId);
	}

	public void setPrimaryKey(Jobpos2RolePK pk) {
		setJobPosId(pk.jobPosId);
		setRoleId(pk.roleId);
	}

	public long getJobPosId() {
		return _jobPosId;
	}

	public void setJobPosId(long jobPosId) {
		_jobPosId = jobPosId;
	}

	public long getRoleId() {
		return _roleId;
	}

	public void setRoleId(long roleId) {
		_roleId = roleId;
	}

	private long _jobPosId;
	private long _roleId;
}