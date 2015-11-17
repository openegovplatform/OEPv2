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

package org.oep.dossiermgt.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.oep.dossiermgt.model.EbPartnerShip;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EbPartnerShip in entity cache.
 *
 * @author trungdk
 * @see EbPartnerShip
 * @generated
 */
public class EbPartnerShipCacheModel implements CacheModel<EbPartnerShip>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{ebPartnerShipId=");
		sb.append(ebPartnerShipId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", cpaId=");
		sb.append(cpaId);
		sb.append(", service=");
		sb.append(service);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public EbPartnerShip toEntityModel() {
		EbPartnerShipImpl ebPartnerShipImpl = new EbPartnerShipImpl();

		ebPartnerShipImpl.setEbPartnerShipId(ebPartnerShipId);
		ebPartnerShipImpl.setCompanyId(companyId);
		ebPartnerShipImpl.setUserId(userId);
		ebPartnerShipImpl.setGroupId(groupId);

		if (createDate == Long.MIN_VALUE) {
			ebPartnerShipImpl.setCreateDate(null);
		}
		else {
			ebPartnerShipImpl.setCreateDate(new Date(createDate));
		}

		if (name == null) {
			ebPartnerShipImpl.setName(StringPool.BLANK);
		}
		else {
			ebPartnerShipImpl.setName(name);
		}

		if (cpaId == null) {
			ebPartnerShipImpl.setCpaId(StringPool.BLANK);
		}
		else {
			ebPartnerShipImpl.setCpaId(cpaId);
		}

		if (service == null) {
			ebPartnerShipImpl.setService(StringPool.BLANK);
		}
		else {
			ebPartnerShipImpl.setService(service);
		}

		ebPartnerShipImpl.resetOriginalValues();

		return ebPartnerShipImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ebPartnerShipId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		createDate = objectInput.readLong();
		name = objectInput.readUTF();
		cpaId = objectInput.readUTF();
		service = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(ebPartnerShipId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(createDate);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (cpaId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cpaId);
		}

		if (service == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(service);
		}
	}

	public long ebPartnerShipId;
	public long companyId;
	public long userId;
	public long groupId;
	public long createDate;
	public String name;
	public String cpaId;
	public String service;
}