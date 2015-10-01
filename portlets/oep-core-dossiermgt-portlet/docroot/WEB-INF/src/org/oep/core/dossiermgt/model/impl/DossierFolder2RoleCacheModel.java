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

package org.oep.core.dossiermgt.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import org.oep.core.dossiermgt.model.DossierFolder2Role;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing DossierFolder2Role in entity cache.
 *
 * @author trungdk
 * @see DossierFolder2Role
 * @generated
 */
public class DossierFolder2RoleCacheModel implements CacheModel<DossierFolder2Role>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{dossierFolderId=");
		sb.append(dossierFolderId);
		sb.append(", roleId=");
		sb.append(roleId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DossierFolder2Role toEntityModel() {
		DossierFolder2RoleImpl dossierFolder2RoleImpl = new DossierFolder2RoleImpl();

		dossierFolder2RoleImpl.setDossierFolderId(dossierFolderId);
		dossierFolder2RoleImpl.setRoleId(roleId);

		dossierFolder2RoleImpl.resetOriginalValues();

		return dossierFolder2RoleImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		dossierFolderId = objectInput.readLong();
		roleId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(dossierFolderId);
		objectOutput.writeLong(roleId);
	}

	public long dossierFolderId;
	public long roleId;
}