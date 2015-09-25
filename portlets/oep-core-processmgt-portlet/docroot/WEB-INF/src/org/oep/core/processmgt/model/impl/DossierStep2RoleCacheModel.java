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

package org.oep.core.processmgt.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import org.oep.core.processmgt.model.DossierStep2Role;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing DossierStep2Role in entity cache.
 *
 * @author trungdk
 * @see DossierStep2Role
 * @generated
 */
public class DossierStep2RoleCacheModel implements CacheModel<DossierStep2Role>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(id);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", dossierStepId=");
		sb.append(dossierStepId);
		sb.append(", roleId=");
		sb.append(roleId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DossierStep2Role toEntityModel() {
		DossierStep2RoleImpl dossierStep2RoleImpl = new DossierStep2RoleImpl();

		dossierStep2RoleImpl.setId(id);
		dossierStep2RoleImpl.setCompanyId(companyId);
		dossierStep2RoleImpl.setDossierStepId(dossierStepId);
		dossierStep2RoleImpl.setRoleId(roleId);

		dossierStep2RoleImpl.resetOriginalValues();

		return dossierStep2RoleImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		companyId = objectInput.readLong();
		dossierStepId = objectInput.readLong();
		roleId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(dossierStepId);
		objectOutput.writeLong(roleId);
	}

	public long id;
	public long companyId;
	public long dossierStepId;
	public long roleId;
}