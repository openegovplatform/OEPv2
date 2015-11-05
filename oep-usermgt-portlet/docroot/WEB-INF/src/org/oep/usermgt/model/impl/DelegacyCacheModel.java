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

import org.oep.usermgt.model.Delegacy;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Delegacy in entity cache.
 *
 * @author NQMINH
 * @see Delegacy
 * @generated
 */
public class DelegacyCacheModel implements CacheModel<Delegacy>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{delegacyId=");
		sb.append(delegacyId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", fromEmployeeId=");
		sb.append(fromEmployeeId);
		sb.append(", toEmployeeId=");
		sb.append(toEmployeeId);
		sb.append(", roleId=");
		sb.append(roleId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Delegacy toEntityModel() {
		DelegacyImpl delegacyImpl = new DelegacyImpl();

		delegacyImpl.setDelegacyId(delegacyId);
		delegacyImpl.setCompanyId(companyId);
		delegacyImpl.setGroupId(groupId);
		delegacyImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			delegacyImpl.setCreateDate(null);
		}
		else {
			delegacyImpl.setCreateDate(new Date(createDate));
		}

		delegacyImpl.setFromEmployeeId(fromEmployeeId);
		delegacyImpl.setToEmployeeId(toEmployeeId);
		delegacyImpl.setRoleId(roleId);

		delegacyImpl.resetOriginalValues();

		return delegacyImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		delegacyId = objectInput.readLong();
		companyId = objectInput.readLong();
		groupId = objectInput.readLong();
		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		fromEmployeeId = objectInput.readLong();
		toEmployeeId = objectInput.readLong();
		roleId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(delegacyId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(fromEmployeeId);
		objectOutput.writeLong(toEmployeeId);
		objectOutput.writeLong(roleId);
	}

	public long delegacyId;
	public long companyId;
	public long groupId;
	public long userId;
	public long createDate;
	public long fromEmployeeId;
	public long toEmployeeId;
	public long roleId;
}