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

import org.oep.usermgt.model.Citizen;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Citizen in entity cache.
 *
 * @author NQMINH
 * @see Citizen
 * @generated
 */
public class CitizenCacheModel implements CacheModel<Citizen>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(47);

		sb.append("{citizenId=");
		sb.append(citizenId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", mappingUserId=");
		sb.append(mappingUserId);
		sb.append(", citizenNo=");
		sb.append(citizenNo);
		sb.append(", fullName=");
		sb.append(fullName);
		sb.append(", gender=");
		sb.append(gender);
		sb.append(", identificationNo=");
		sb.append(identificationNo);
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
		sb.append(", homeAddress=");
		sb.append(homeAddress);
		sb.append(", homeTel=");
		sb.append(homeTel);
		sb.append(", mobile=");
		sb.append(mobile);
		sb.append(", email=");
		sb.append(email);
		sb.append(", shortName=");
		sb.append(shortName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Citizen toEntityModel() {
		CitizenImpl citizenImpl = new CitizenImpl();

		citizenImpl.setCitizenId(citizenId);
		citizenImpl.setCompanyId(companyId);
		citizenImpl.setUserId(userId);
		citizenImpl.setGroupId(groupId);

		if (createDate == Long.MIN_VALUE) {
			citizenImpl.setCreateDate(null);
		}
		else {
			citizenImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			citizenImpl.setModifiedDate(null);
		}
		else {
			citizenImpl.setModifiedDate(new Date(modifiedDate));
		}

		citizenImpl.setMappingUserId(mappingUserId);

		if (citizenNo == null) {
			citizenImpl.setCitizenNo(StringPool.BLANK);
		}
		else {
			citizenImpl.setCitizenNo(citizenNo);
		}

		if (fullName == null) {
			citizenImpl.setFullName(StringPool.BLANK);
		}
		else {
			citizenImpl.setFullName(fullName);
		}

		citizenImpl.setGender(gender);

		if (identificationNo == null) {
			citizenImpl.setIdentificationNo(StringPool.BLANK);
		}
		else {
			citizenImpl.setIdentificationNo(identificationNo);
		}

		if (address == null) {
			citizenImpl.setAddress(StringPool.BLANK);
		}
		else {
			citizenImpl.setAddress(address);
		}

		if (cityNo == null) {
			citizenImpl.setCityNo(StringPool.BLANK);
		}
		else {
			citizenImpl.setCityNo(cityNo);
		}

		if (cityName == null) {
			citizenImpl.setCityName(StringPool.BLANK);
		}
		else {
			citizenImpl.setCityName(cityName);
		}

		if (districtNo == null) {
			citizenImpl.setDistrictNo(StringPool.BLANK);
		}
		else {
			citizenImpl.setDistrictNo(districtNo);
		}

		if (districtName == null) {
			citizenImpl.setDistrictName(StringPool.BLANK);
		}
		else {
			citizenImpl.setDistrictName(districtName);
		}

		if (wardNo == null) {
			citizenImpl.setWardNo(StringPool.BLANK);
		}
		else {
			citizenImpl.setWardNo(wardNo);
		}

		if (wardName == null) {
			citizenImpl.setWardName(StringPool.BLANK);
		}
		else {
			citizenImpl.setWardName(wardName);
		}

		if (homeAddress == null) {
			citizenImpl.setHomeAddress(StringPool.BLANK);
		}
		else {
			citizenImpl.setHomeAddress(homeAddress);
		}

		if (homeTel == null) {
			citizenImpl.setHomeTel(StringPool.BLANK);
		}
		else {
			citizenImpl.setHomeTel(homeTel);
		}

		if (mobile == null) {
			citizenImpl.setMobile(StringPool.BLANK);
		}
		else {
			citizenImpl.setMobile(mobile);
		}

		if (email == null) {
			citizenImpl.setEmail(StringPool.BLANK);
		}
		else {
			citizenImpl.setEmail(email);
		}

		if (shortName == null) {
			citizenImpl.setShortName(StringPool.BLANK);
		}
		else {
			citizenImpl.setShortName(shortName);
		}

		citizenImpl.resetOriginalValues();

		return citizenImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		citizenId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		mappingUserId = objectInput.readLong();
		citizenNo = objectInput.readUTF();
		fullName = objectInput.readUTF();
		gender = objectInput.readInt();
		identificationNo = objectInput.readUTF();
		address = objectInput.readUTF();
		cityNo = objectInput.readUTF();
		cityName = objectInput.readUTF();
		districtNo = objectInput.readUTF();
		districtName = objectInput.readUTF();
		wardNo = objectInput.readUTF();
		wardName = objectInput.readUTF();
		homeAddress = objectInput.readUTF();
		homeTel = objectInput.readUTF();
		mobile = objectInput.readUTF();
		email = objectInput.readUTF();
		shortName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(citizenId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(mappingUserId);

		if (citizenNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(citizenNo);
		}

		if (fullName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fullName);
		}

		objectOutput.writeInt(gender);

		if (identificationNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(identificationNo);
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

		if (homeAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(homeAddress);
		}

		if (homeTel == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(homeTel);
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

		if (shortName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shortName);
		}
	}

	public long citizenId;
	public long companyId;
	public long userId;
	public long groupId;
	public long createDate;
	public long modifiedDate;
	public long mappingUserId;
	public String citizenNo;
	public String fullName;
	public int gender;
	public String identificationNo;
	public String address;
	public String cityNo;
	public String cityName;
	public String districtNo;
	public String districtName;
	public String wardNo;
	public String wardName;
	public String homeAddress;
	public String homeTel;
	public String mobile;
	public String email;
	public String shortName;
}