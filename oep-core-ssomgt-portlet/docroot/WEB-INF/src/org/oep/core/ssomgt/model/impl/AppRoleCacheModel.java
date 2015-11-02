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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.oep.core.ssomgt.model.AppRole;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AppRole in entity cache.
 *
 * @author trungdk
 * @see AppRole
 * @generated
 */
public class AppRoleCacheModel implements CacheModel<AppRole>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{appRoleId=");
		sb.append(appRoleId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", applicationId=");
		sb.append(applicationId);
		sb.append(", roleCode=");
		sb.append(roleCode);
		sb.append(", roleName=");
		sb.append(roleName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AppRole toEntityModel() {
		AppRoleImpl appRoleImpl = new AppRoleImpl();

		appRoleImpl.setAppRoleId(appRoleId);
		appRoleImpl.setUserId(userId);
		appRoleImpl.setGroupId(groupId);
		appRoleImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			appRoleImpl.setCreateDate(null);
		}
		else {
			appRoleImpl.setCreateDate(new Date(createDate));
		}

		appRoleImpl.setApplicationId(applicationId);

		if (roleCode == null) {
			appRoleImpl.setRoleCode(StringPool.BLANK);
		}
		else {
			appRoleImpl.setRoleCode(roleCode);
		}

		if (roleName == null) {
			appRoleImpl.setRoleName(StringPool.BLANK);
		}
		else {
			appRoleImpl.setRoleName(roleName);
		}

		appRoleImpl.resetOriginalValues();

		return appRoleImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		appRoleId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		applicationId = objectInput.readLong();
		roleCode = objectInput.readUTF();
		roleName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(appRoleId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(applicationId);

		if (roleCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(roleCode);
		}

		if (roleName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(roleName);
		}
	}

	public long appRoleId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long applicationId;
	public String roleCode;
	public String roleName;
}