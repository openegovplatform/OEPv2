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

package org.oep.core.ssomgt.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import org.oep.core.ssomgt.model.AppRole2Employee;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AppRole2Employee in entity cache.
 *
 * @author trungdk
 * @see AppRole2Employee
 * @generated
 */
public class AppRole2EmployeeCacheModel implements CacheModel<AppRole2Employee>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{appRole2EmployeeId=");
		sb.append(appRole2EmployeeId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", appRoleId=");
		sb.append(appRoleId);
		sb.append(", employeeId=");
		sb.append(employeeId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AppRole2Employee toEntityModel() {
		AppRole2EmployeeImpl appRole2EmployeeImpl = new AppRole2EmployeeImpl();

		appRole2EmployeeImpl.setAppRole2EmployeeId(appRole2EmployeeId);
		appRole2EmployeeImpl.setUserId(userId);
		appRole2EmployeeImpl.setGroupId(groupId);
		appRole2EmployeeImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			appRole2EmployeeImpl.setCreateDate(null);
		}
		else {
			appRole2EmployeeImpl.setCreateDate(new Date(createDate));
		}

		appRole2EmployeeImpl.setAppRoleId(appRoleId);
		appRole2EmployeeImpl.setEmployeeId(employeeId);

		appRole2EmployeeImpl.resetOriginalValues();

		return appRole2EmployeeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		appRole2EmployeeId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		appRoleId = objectInput.readLong();
		employeeId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(appRole2EmployeeId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(appRoleId);
		objectOutput.writeLong(employeeId);
	}

	public long appRole2EmployeeId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long appRoleId;
	public long employeeId;
}