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

package org.oep.core.dossiermgt.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author trungdk
 * @generated
 */
public class DossierFolder2RolePK implements Comparable<DossierFolder2RolePK>,
	Serializable {
	public long dossierFolderId;
	public long roleId;

	public DossierFolder2RolePK() {
	}

	public DossierFolder2RolePK(long dossierFolderId, long roleId) {
		this.dossierFolderId = dossierFolderId;
		this.roleId = roleId;
	}

	public long getDossierFolderId() {
		return dossierFolderId;
	}

	public void setDossierFolderId(long dossierFolderId) {
		this.dossierFolderId = dossierFolderId;
	}

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	@Override
	public int compareTo(DossierFolder2RolePK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (dossierFolderId < pk.dossierFolderId) {
			value = -1;
		}
		else if (dossierFolderId > pk.dossierFolderId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (roleId < pk.roleId) {
			value = -1;
		}
		else if (roleId > pk.roleId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DossierFolder2RolePK)) {
			return false;
		}

		DossierFolder2RolePK pk = (DossierFolder2RolePK)obj;

		if ((dossierFolderId == pk.dossierFolderId) && (roleId == pk.roleId)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(dossierFolderId) + String.valueOf(roleId)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("dossierFolderId");
		sb.append(StringPool.EQUAL);
		sb.append(dossierFolderId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("roleId");
		sb.append(StringPool.EQUAL);
		sb.append(roleId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}