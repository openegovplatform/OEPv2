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
import com.liferay.portal.model.CacheModel;

import org.oep.dossiermgt.model.DossierProcBookmark;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DossierProcBookmark in entity cache.
 *
 * @author trungdk
 * @see DossierProcBookmark
 * @generated
 */
public class DossierProcBookmarkCacheModel implements CacheModel<DossierProcBookmark>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{dossierProcBookmarkId=");
		sb.append(dossierProcBookmarkId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", dossierProcAgentId=");
		sb.append(dossierProcAgentId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DossierProcBookmark toEntityModel() {
		DossierProcBookmarkImpl dossierProcBookmarkImpl = new DossierProcBookmarkImpl();

		dossierProcBookmarkImpl.setDossierProcBookmarkId(dossierProcBookmarkId);
		dossierProcBookmarkImpl.setUserId(userId);
		dossierProcBookmarkImpl.setGroupId(groupId);
		dossierProcBookmarkImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			dossierProcBookmarkImpl.setCreateDate(null);
		}
		else {
			dossierProcBookmarkImpl.setCreateDate(new Date(createDate));
		}

		dossierProcBookmarkImpl.setDossierProcAgentId(dossierProcAgentId);

		dossierProcBookmarkImpl.resetOriginalValues();

		return dossierProcBookmarkImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		dossierProcBookmarkId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		dossierProcAgentId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(dossierProcBookmarkId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(dossierProcAgentId);
	}

	public long dossierProcBookmarkId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long dossierProcAgentId;
}