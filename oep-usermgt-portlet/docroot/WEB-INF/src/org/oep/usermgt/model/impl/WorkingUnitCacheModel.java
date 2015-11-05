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

import org.oep.usermgt.model.WorkingUnit;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing WorkingUnit in entity cache.
 *
 * @author NQMINH
 * @see WorkingUnit
 * @generated
 */
public class WorkingUnitCacheModel implements CacheModel<WorkingUnit>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(51);

		sb.append("{workingUnitId=");
		sb.append(workingUnitId);
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
		sb.append(", organizationId=");
		sb.append(organizationId);
		sb.append(", govAgencyId=");
		sb.append(govAgencyId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", enName=");
		sb.append(enName);
		sb.append(", parentWorkingUnitId=");
		sb.append(parentWorkingUnitId);
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
		sb.append(", website=");
		sb.append(website);
		sb.append(", aaa=");
		sb.append(aaa);
		sb.append(", shortName=");
		sb.append(shortName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public WorkingUnit toEntityModel() {
		WorkingUnitImpl workingUnitImpl = new WorkingUnitImpl();

		workingUnitImpl.setWorkingUnitId(workingUnitId);
		workingUnitImpl.setCompanyId(companyId);
		workingUnitImpl.setGroupId(groupId);
		workingUnitImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			workingUnitImpl.setCreateDate(null);
		}
		else {
			workingUnitImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			workingUnitImpl.setModifiedDate(null);
		}
		else {
			workingUnitImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (organizationId == null) {
			workingUnitImpl.setOrganizationId(StringPool.BLANK);
		}
		else {
			workingUnitImpl.setOrganizationId(organizationId);
		}

		if (govAgencyId == null) {
			workingUnitImpl.setGovAgencyId(StringPool.BLANK);
		}
		else {
			workingUnitImpl.setGovAgencyId(govAgencyId);
		}

		if (name == null) {
			workingUnitImpl.setName(StringPool.BLANK);
		}
		else {
			workingUnitImpl.setName(name);
		}

		if (enName == null) {
			workingUnitImpl.setEnName(StringPool.BLANK);
		}
		else {
			workingUnitImpl.setEnName(enName);
		}

		workingUnitImpl.setParentWorkingUnitId(parentWorkingUnitId);

		if (address == null) {
			workingUnitImpl.setAddress(StringPool.BLANK);
		}
		else {
			workingUnitImpl.setAddress(address);
		}

		if (cityNo == null) {
			workingUnitImpl.setCityNo(StringPool.BLANK);
		}
		else {
			workingUnitImpl.setCityNo(cityNo);
		}

		if (cityName == null) {
			workingUnitImpl.setCityName(StringPool.BLANK);
		}
		else {
			workingUnitImpl.setCityName(cityName);
		}

		if (districtNo == null) {
			workingUnitImpl.setDistrictNo(StringPool.BLANK);
		}
		else {
			workingUnitImpl.setDistrictNo(districtNo);
		}

		if (districtName == null) {
			workingUnitImpl.setDistrictName(StringPool.BLANK);
		}
		else {
			workingUnitImpl.setDistrictName(districtName);
		}

		if (wardNo == null) {
			workingUnitImpl.setWardNo(StringPool.BLANK);
		}
		else {
			workingUnitImpl.setWardNo(wardNo);
		}

		if (wardName == null) {
			workingUnitImpl.setWardName(StringPool.BLANK);
		}
		else {
			workingUnitImpl.setWardName(wardName);
		}

		if (gpsPosition == null) {
			workingUnitImpl.setGpsPosition(StringPool.BLANK);
		}
		else {
			workingUnitImpl.setGpsPosition(gpsPosition);
		}

		if (telNo == null) {
			workingUnitImpl.setTelNo(StringPool.BLANK);
		}
		else {
			workingUnitImpl.setTelNo(telNo);
		}

		if (fax == null) {
			workingUnitImpl.setFax(StringPool.BLANK);
		}
		else {
			workingUnitImpl.setFax(fax);
		}

		if (email == null) {
			workingUnitImpl.setEmail(StringPool.BLANK);
		}
		else {
			workingUnitImpl.setEmail(email);
		}

		if (website == null) {
			workingUnitImpl.setWebsite(StringPool.BLANK);
		}
		else {
			workingUnitImpl.setWebsite(website);
		}

		if (aaa == null) {
			workingUnitImpl.setAaa(StringPool.BLANK);
		}
		else {
			workingUnitImpl.setAaa(aaa);
		}

		if (shortName == null) {
			workingUnitImpl.setShortName(StringPool.BLANK);
		}
		else {
			workingUnitImpl.setShortName(shortName);
		}

		workingUnitImpl.resetOriginalValues();

		return workingUnitImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		workingUnitId = objectInput.readLong();
		companyId = objectInput.readLong();
		groupId = objectInput.readLong();
		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		organizationId = objectInput.readUTF();
		govAgencyId = objectInput.readUTF();
		name = objectInput.readUTF();
		enName = objectInput.readUTF();
		parentWorkingUnitId = objectInput.readLong();
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
		website = objectInput.readUTF();
		aaa = objectInput.readUTF();
		shortName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(workingUnitId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (organizationId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(organizationId);
		}

		if (govAgencyId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(govAgencyId);
		}

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

		objectOutput.writeLong(parentWorkingUnitId);

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

		if (website == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(website);
		}

		if (aaa == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(aaa);
		}

		if (shortName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shortName);
		}
	}

	public long workingUnitId;
	public long companyId;
	public long groupId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public String organizationId;
	public String govAgencyId;
	public String name;
	public String enName;
	public long parentWorkingUnitId;
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
	public String website;
	public String aaa;
	public String shortName;
}