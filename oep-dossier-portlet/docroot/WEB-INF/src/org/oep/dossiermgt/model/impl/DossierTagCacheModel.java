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

import org.oep.dossiermgt.model.DossierTag;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DossierTag in entity cache.
 *
 * @author trungdk
 * @see DossierTag
 * @generated
 */
public class DossierTagCacheModel implements CacheModel<DossierTag>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{dossierTagId=");
		sb.append(dossierTagId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", tag=");
		sb.append(tag);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DossierTag toEntityModel() {
		DossierTagImpl dossierTagImpl = new DossierTagImpl();

		dossierTagImpl.setDossierTagId(dossierTagId);
		dossierTagImpl.setUserId(userId);
		dossierTagImpl.setGroupId(groupId);
		dossierTagImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			dossierTagImpl.setCreateDate(null);
		}
		else {
			dossierTagImpl.setCreateDate(new Date(createDate));
		}

		dossierTagImpl.setDossierId(dossierId);

		if (tag == null) {
			dossierTagImpl.setTag(StringPool.BLANK);
		}
		else {
			dossierTagImpl.setTag(tag);
		}

		dossierTagImpl.resetOriginalValues();

		return dossierTagImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		dossierTagId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		dossierId = objectInput.readLong();
		tag = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(dossierTagId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(dossierId);

		if (tag == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tag);
		}
	}

	public long dossierTagId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long dossierId;
	public String tag;
}