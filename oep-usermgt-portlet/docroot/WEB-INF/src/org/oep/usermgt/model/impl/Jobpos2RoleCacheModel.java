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

package org.oep.usermgt.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import org.oep.usermgt.model.Jobpos2Role;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Jobpos2Role in entity cache.
 *
 * @author NQMINH
 * @see Jobpos2Role
 * @generated
 */
public class Jobpos2RoleCacheModel implements CacheModel<Jobpos2Role>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{jobPosId=");
		sb.append(jobPosId);
		sb.append(", roleId=");
		sb.append(roleId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Jobpos2Role toEntityModel() {
		Jobpos2RoleImpl jobpos2RoleImpl = new Jobpos2RoleImpl();

		jobpos2RoleImpl.setJobPosId(jobPosId);
		jobpos2RoleImpl.setRoleId(roleId);

		jobpos2RoleImpl.resetOriginalValues();

		return jobpos2RoleImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		jobPosId = objectInput.readLong();
		roleId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(jobPosId);
		objectOutput.writeLong(roleId);
	}

	public long jobPosId;
	public long roleId;
}