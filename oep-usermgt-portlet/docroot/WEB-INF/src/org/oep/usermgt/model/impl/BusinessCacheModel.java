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

import org.oep.usermgt.model.Business;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Business in entity cache.
 *
 * @author NQMINH
 * @see Business
 * @generated
 */
public class BusinessCacheModel implements CacheModel<Business>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(57);

		sb.append("{businessId=");
		sb.append(businessId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", organizationId=");
		sb.append(organizationId);
		sb.append(", masterUserId=");
		sb.append(masterUserId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", enName=");
		sb.append(enName);
		sb.append(", shortName=");
		sb.append(shortName);
		sb.append(", address=");
		sb.append(address);
		sb.append(", cityNo=");
		sb.append(cityNo);
		sb.append(", cityName=");
		sb.append(cityName);
		sb.append(", districtNo=");
		sb.append(districtNo);
		sb.append(", districtName=");
		sb.append(districtName);
		sb.append(", wardNo=");
		sb.append(wardNo);
		sb.append(", wardName=");
		sb.append(wardName);
		sb.append(", gpsPosition=");
		sb.append(gpsPosition);
		sb.append(", telNo=");
		sb.append(telNo);
		sb.append(", fax=");
		sb.append(fax);
		sb.append(", email=");
		sb.append(email);
		sb.append(", businessNo=");
		sb.append(businessNo);
		sb.append(", businessType=");
		sb.append(businessType);
		sb.append(", registerAgent=");
		sb.append(registerAgent);
		sb.append(", registerDate=");
		sb.append(registerDate);
		sb.append(", representative=");
		sb.append(representative);
		sb.append(", representativeRole=");
		sb.append(representativeRole);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Business toEntityModel() {
		BusinessImpl businessImpl = new BusinessImpl();

		businessImpl.setBusinessId(businessId);
		businessImpl.setUserId(userId);
		businessImpl.setGroupId(groupId);
		businessImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			businessImpl.setCreateDate(null);
		}
		else {
			businessImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			businessImpl.setModifiedDate(null);
		}
		else {
			businessImpl.setModifiedDate(new Date(modifiedDate));
		}

		businessImpl.setOrganizationId(organizationId);
		businessImpl.setMasterUserId(masterUserId);

		if (name == null) {
			businessImpl.setName(StringPool.BLANK);
		}
		else {
			businessImpl.setName(name);
		}

		if (enName == null) {
			businessImpl.setEnName(StringPool.BLANK);
		}
		else {
			businessImpl.setEnName(enName);
		}

		if (shortName == null) {
			businessImpl.setShortName(StringPool.BLANK);
		}
		else {
			businessImpl.setShortName(shortName);
		}

		if (address == null) {
			businessImpl.setAddress(StringPool.BLANK);
		}
		else {
			businessImpl.setAddress(address);
		}

		if (cityNo == null) {
			businessImpl.setCityNo(StringPool.BLANK);
		}
		else {
			businessImpl.setCityNo(cityNo);
		}

		if (cityName == null) {
			businessImpl.setCityName(StringPool.BLANK);
		}
		else {
			businessImpl.setCityName(cityName);
		}

		if (districtNo == null) {
			businessImpl.setDistrictNo(StringPool.BLANK);
		}
		else {
			businessImpl.setDistrictNo(districtNo);
		}

		if (districtName == null) {
			businessImpl.setDistrictName(StringPool.BLANK);
		}
		else {
			businessImpl.setDistrictName(districtName);
		}

		if (wardNo == null) {
			businessImpl.setWardNo(StringPool.BLANK);
		}
		else {
			businessImpl.setWardNo(wardNo);
		}

		if (wardName == null) {
			businessImpl.setWardName(StringPool.BLANK);
		}
		else {
			businessImpl.setWardName(wardName);
		}

		if (gpsPosition == null) {
			businessImpl.setGpsPosition(StringPool.BLANK);
		}
		else {
			businessImpl.setGpsPosition(gpsPosition);
		}

		if (telNo == null) {
			businessImpl.setTelNo(StringPool.BLANK);
		}
		else {
			businessImpl.setTelNo(telNo);
		}

		if (fax == null) {
			businessImpl.setFax(StringPool.BLANK);
		}
		else {
			businessImpl.setFax(fax);
		}

		if (email == null) {
			businessImpl.setEmail(StringPool.BLANK);
		}
		else {
			businessImpl.setEmail(email);
		}

		if (businessNo == null) {
			businessImpl.setBusinessNo(StringPool.BLANK);
		}
		else {
			businessImpl.setBusinessNo(businessNo);
		}

		if (businessType == null) {
			businessImpl.setBusinessType(StringPool.BLANK);
		}
		else {
			businessImpl.setBusinessType(businessType);
		}

		if (registerAgent == null) {
			businessImpl.setRegisterAgent(StringPool.BLANK);
		}
		else {
			businessImpl.setRegisterAgent(registerAgent);
		}

		if (registerDate == Long.MIN_VALUE) {
			businessImpl.setRegisterDate(null);
		}
		else {
			businessImpl.setRegisterDate(new Date(registerDate));
		}

		if (representative == null) {
			businessImpl.setRepresentative(StringPool.BLANK);
		}
		else {
			businessImpl.setRepresentative(representative);
		}

		if (representativeRole == null) {
			businessImpl.setRepresentativeRole(StringPool.BLANK);
		}
		else {
			businessImpl.setRepresentativeRole(representativeRole);
		}

		businessImpl.resetOriginalValues();

		return businessImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		businessId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		organizationId = objectInput.readLong();
		masterUserId = objectInput.readLong();
		name = objectInput.readUTF();
		enName = objectInput.readUTF();
		shortName = objectInput.readUTF();
		address = objectInput.readUTF();
		cityNo = objectInput.readUTF();
		cityName = objectInput.readUTF();
		districtNo = objectInput.readUTF();
		districtName = objectInput.readUTF();
		wardNo = objectInput.readUTF();
		wardName = objectInput.readUTF();
		gpsPosition = objectInput.readUTF();
		telNo = objectInput.readUTF();
		fax = objectInput.readUTF();
		email = objectInput.readUTF();
		businessNo = objectInput.readUTF();
		businessType = objectInput.readUTF();
		registerAgent = objectInput.readUTF();
		registerDate = objectInput.readLong();
		representative = objectInput.readUTF();
		representativeRole = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(businessId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(organizationId);
		objectOutput.writeLong(masterUserId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (enName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(enName);
		}

		if (shortName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shortName);
		}

		if (address == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (cityNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cityNo);
		}

		if (cityName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cityName);
		}

		if (districtNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(districtNo);
		}

		if (districtName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(districtName);
		}

		if (wardNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(wardNo);
		}

		if (wardName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(wardName);
		}

		if (gpsPosition == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(gpsPosition);
		}

		if (telNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(telNo);
		}

		if (fax == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fax);
		}

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (businessNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(businessNo);
		}

		if (businessType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(businessType);
		}

		if (registerAgent == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(registerAgent);
		}

		objectOutput.writeLong(registerDate);

		if (representative == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(representative);
		}

		if (representativeRole == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(representativeRole);
		}
	}

	public long businessId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public long organizationId;
	public long masterUserId;
	public String name;
	public String enName;
	public String shortName;
	public String address;
	public String cityNo;
	public String cityName;
	public String districtNo;
	public String districtName;
	public String wardNo;
	public String wardName;
	public String gpsPosition;
	public String telNo;
	public String fax;
	public String email;
	public String businessNo;
	public String businessType;
	public String registerAgent;
	public long registerDate;
	public String representative;
	public String representativeRole;
}