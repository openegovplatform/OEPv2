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

import org.oep.usermgt.model.Employee;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Employee in entity cache.
 *
 * @author NQMINH
 * @see Employee
 * @generated
 */
public class EmployeeCacheModel implements CacheModel<Employee>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{employeeId=");
		sb.append(employeeId);
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
		sb.append(", mappingUserId=");
		sb.append(mappingUserId);
		sb.append(", workingUnitId=");
		sb.append(workingUnitId);
		sb.append(", mainJobPosId=");
		sb.append(mainJobPosId);
		sb.append(", employeeNo=");
		sb.append(employeeNo);
		sb.append(", fullName=");
		sb.append(fullName);
		sb.append(", officeTel=");
		sb.append(officeTel);
		sb.append(", homeTel=");
		sb.append(homeTel);
		sb.append(", mobile=");
		sb.append(mobile);
		sb.append(", email=");
		sb.append(email);
		sb.append(", shortName=");
		sb.append(shortName);
		sb.append(", personelDocNo=");
		sb.append(personelDocNo);
		sb.append(", gender=");
		sb.append(gender);
		sb.append(", birthdate=");
		sb.append(birthdate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Employee toEntityModel() {
		EmployeeImpl employeeImpl = new EmployeeImpl();

		employeeImpl.setEmployeeId(employeeId);
		employeeImpl.setCompanyId(companyId);
		employeeImpl.setGroupId(groupId);
		employeeImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			employeeImpl.setCreateDate(null);
		}
		else {
			employeeImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			employeeImpl.setModifiedDate(null);
		}
		else {
			employeeImpl.setModifiedDate(new Date(modifiedDate));
		}

		employeeImpl.setMappingUserId(mappingUserId);
		employeeImpl.setWorkingUnitId(workingUnitId);
		employeeImpl.setMainJobPosId(mainJobPosId);

		if (employeeNo == null) {
			employeeImpl.setEmployeeNo(StringPool.BLANK);
		}
		else {
			employeeImpl.setEmployeeNo(employeeNo);
		}

		if (fullName == null) {
			employeeImpl.setFullName(StringPool.BLANK);
		}
		else {
			employeeImpl.setFullName(fullName);
		}

		if (officeTel == null) {
			employeeImpl.setOfficeTel(StringPool.BLANK);
		}
		else {
			employeeImpl.setOfficeTel(officeTel);
		}

		if (homeTel == null) {
			employeeImpl.setHomeTel(StringPool.BLANK);
		}
		else {
			employeeImpl.setHomeTel(homeTel);
		}

		if (mobile == null) {
			employeeImpl.setMobile(StringPool.BLANK);
		}
		else {
			employeeImpl.setMobile(mobile);
		}

		if (email == null) {
			employeeImpl.setEmail(StringPool.BLANK);
		}
		else {
			employeeImpl.setEmail(email);
		}

		if (shortName == null) {
			employeeImpl.setShortName(StringPool.BLANK);
		}
		else {
			employeeImpl.setShortName(shortName);
		}

		if (personelDocNo == null) {
			employeeImpl.setPersonelDocNo(StringPool.BLANK);
		}
		else {
			employeeImpl.setPersonelDocNo(personelDocNo);
		}

		employeeImpl.setGender(gender);

		if (birthdate == Long.MIN_VALUE) {
			employeeImpl.setBirthdate(null);
		}
		else {
			employeeImpl.setBirthdate(new Date(birthdate));
		}

		employeeImpl.resetOriginalValues();

		return employeeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		employeeId = objectInput.readLong();
		companyId = objectInput.readLong();
		groupId = objectInput.readLong();
		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		mappingUserId = objectInput.readLong();
		workingUnitId = objectInput.readLong();
		mainJobPosId = objectInput.readLong();
		employeeNo = objectInput.readUTF();
		fullName = objectInput.readUTF();
		officeTel = objectInput.readUTF();
		homeTel = objectInput.readUTF();
		mobile = objectInput.readUTF();
		email = objectInput.readUTF();
		shortName = objectInput.readUTF();
		personelDocNo = objectInput.readUTF();
		gender = objectInput.readInt();
		birthdate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(employeeId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(mappingUserId);
		objectOutput.writeLong(workingUnitId);
		objectOutput.writeLong(mainJobPosId);

		if (employeeNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(employeeNo);
		}

		if (fullName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fullName);
		}

		if (officeTel == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(officeTel);
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

		if (personelDocNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(personelDocNo);
		}

		objectOutput.writeInt(gender);
		objectOutput.writeLong(birthdate);
	}

	public long employeeId;
	public long companyId;
	public long groupId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public long mappingUserId;
	public long workingUnitId;
	public long mainJobPosId;
	public String employeeNo;
	public String fullName;
	public String officeTel;
	public String homeTel;
	public String mobile;
	public String email;
	public String shortName;
	public String personelDocNo;
	public int gender;
	public long birthdate;
}