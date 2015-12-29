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

import org.oep.usermgt.service.persistence.JobPos2RolePK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.oep.usermgt.service.http.JobPos2RoleServiceSoap}.
 *
 * @author NQMINH
 * @see org.oep.usermgt.service.http.JobPos2RoleServiceSoap
 * @generated
 */
public class JobPos2RoleSoap implements Serializable {
	public static JobPos2RoleSoap toSoapModel(JobPos2Role model) {
		JobPos2RoleSoap soapModel = new JobPos2RoleSoap();

		soapModel.setJobPosId(model.getJobPosId());
		soapModel.setRoleId(model.getRoleId());

		return soapModel;
	}

	public static JobPos2RoleSoap[] toSoapModels(JobPos2Role[] models) {
		JobPos2RoleSoap[] soapModels = new JobPos2RoleSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static JobPos2RoleSoap[][] toSoapModels(JobPos2Role[][] models) {
		JobPos2RoleSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new JobPos2RoleSoap[models.length][models[0].length];
		}
		else {
			soapModels = new JobPos2RoleSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static JobPos2RoleSoap[] toSoapModels(List<JobPos2Role> models) {
		List<JobPos2RoleSoap> soapModels = new ArrayList<JobPos2RoleSoap>(models.size());

		for (JobPos2Role model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new JobPos2RoleSoap[soapModels.size()]);
	}

	public JobPos2RoleSoap() {
	}

	public JobPos2RolePK getPrimaryKey() {
		return new JobPos2RolePK(_jobPosId, _roleId);
	}

	public void setPrimaryKey(JobPos2RolePK pk) {
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