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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.oep.usermgt.model.SubAccount;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SubAccount in entity cache.
 *
 * @author NQMINH
 * @see SubAccount
 * @generated
 */
public class SubAccountCacheModel implements CacheModel<SubAccount>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{subAccountId=");
		sb.append(subAccountId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", businessId=");
		sb.append(businessId);
		sb.append(", mappingUserId=");
		sb.append(mappingUserId);
		sb.append(", fullName=");
		sb.append(fullName);
		sb.append(", shortName=");
		sb.append(shortName);
		sb.append(", workingRole=");
		sb.append(workingRole);
		sb.append(", telNo=");
		sb.append(telNo);
		sb.append(", mobile=");
		sb.append(mobile);
		sb.append(", email=");
		sb.append(email);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SubAccount toEntityModel() {
		SubAccountImpl subAccountImpl = new SubAccountImpl();

		subAccountImpl.setSubAccountId(subAccountId);
		subAccountImpl.setCompanyId(companyId);
		subAccountImpl.setGroupId(groupId);
		subAccountImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			subAccountImpl.setCreateDate(null);
		}
		else {
			subAccountImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			subAccountImpl.setModifiedDate(null);
		}
		else {
			subAccountImpl.setModifiedDate(new Date(modifiedDate));
		}

		subAccountImpl.setBusinessId(businessId);
		subAccountImpl.setMappingUserId(mappingUserId);

		if (fullName == null) {
			subAccountImpl.setFullName(StringPool.BLANK);
		}
		else {
			subAccountImpl.setFullName(fullName);
		}

		if (shortName == null) {
			subAccountImpl.setShortName(StringPool.BLANK);
		}
		else {
			subAccountImpl.setShortName(shortName);
		}

		if (workingRole == null) {
			subAccountImpl.setWorkingRole(StringPool.BLANK);
		}
		else {
			subAccountImpl.setWorkingRole(workingRole);
		}

		if (telNo == null) {
			subAccountImpl.setTelNo(StringPool.BLANK);
		}
		else {
			subAccountImpl.setTelNo(telNo);
		}

		if (mobile == null) {
			subAccountImpl.setMobile(StringPool.BLANK);
		}
		else {
			subAccountImpl.setMobile(mobile);
		}

		if (email == null) {
			subAccountImpl.setEmail(StringPool.BLANK);
		}
		else {
			subAccountImpl.setEmail(email);
		}

		subAccountImpl.resetOriginalValues();

		return subAccountImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		subAccountId = objectInput.readLong();
		companyId = objectInput.readLong();
		groupId = objectInput.readLong();
		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		businessId = objectInput.readLong();
		mappingUserId = objectInput.readLong();
		fullName = objectInput.readUTF();
		shortName = objectInput.readUTF();
		workingRole = objectInput.readUTF();
		telNo = objectInput.readUTF();
		mobile = objectInput.readUTF();
		email = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(subAccountId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(businessId);
		objectOutput.writeLong(mappingUserId);

		if (fullName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fullName);
		}

		if (shortName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shortName);
		}

		if (workingRole == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(workingRole);
		}

		if (telNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(telNo);
		}

		if (mobile == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mobile);
		}

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}
	}

	public long subAccountId;
	public long companyId;
	public long groupId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public long businessId;
	public long mappingUserId;
	public String fullName;
	public String shortName;
	public String workingRole;
	public String telNo;
	public String mobile;
	public String email;
}