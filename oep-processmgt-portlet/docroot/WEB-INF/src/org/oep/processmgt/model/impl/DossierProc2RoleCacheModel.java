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

package org.oep.processmgt.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import org.oep.processmgt.model.DossierProc2Role;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing DossierProc2Role in entity cache.
 *
 * @author trungdk
 * @see DossierProc2Role
 * @generated
 */
public class DossierProc2RoleCacheModel implements CacheModel<DossierProc2Role>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{dossierProc2RoleId=");
		sb.append(dossierProc2RoleId);
		sb.append(", dossierProcId=");
		sb.append(dossierProcId);
		sb.append(", roleId=");
		sb.append(roleId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DossierProc2Role toEntityModel() {
		DossierProc2RoleImpl dossierProc2RoleImpl = new DossierProc2RoleImpl();

		dossierProc2RoleImpl.setDossierProc2RoleId(dossierProc2RoleId);
		dossierProc2RoleImpl.setDossierProcId(dossierProcId);
		dossierProc2RoleImpl.setRoleId(roleId);

		dossierProc2RoleImpl.resetOriginalValues();

		return dossierProc2RoleImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		dossierProc2RoleId = objectInput.readLong();
		dossierProcId = objectInput.readLong();
		roleId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(dossierProc2RoleId);
		objectOutput.writeLong(dossierProcId);
		objectOutput.writeLong(roleId);
	}

	public long dossierProc2RoleId;
	public long dossierProcId;
	public long roleId;
}