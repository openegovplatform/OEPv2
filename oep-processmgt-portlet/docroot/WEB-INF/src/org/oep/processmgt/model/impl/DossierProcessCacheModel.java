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

package org.oep.processmgt.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import org.oep.processmgt.model.DossierProcess;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DossierProcess in entity cache.
 *
 * @author trungdk
 * @see DossierProcess
 * @generated
 */
public class DossierProcessCacheModel implements CacheModel<DossierProcess>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{dossierProcessId=");
		sb.append(dossierProcessId);
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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DossierProcess toEntityModel() {
		DossierProcessImpl dossierProcessImpl = new DossierProcessImpl();

		dossierProcessImpl.setDossierProcessId(dossierProcessId);
		dossierProcessImpl.setUserId(userId);
		dossierProcessImpl.setGroupId(groupId);
		dossierProcessImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			dossierProcessImpl.setCreateDate(null);
		}
		else {
			dossierProcessImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			dossierProcessImpl.setModifiedDate(null);
		}
		else {
			dossierProcessImpl.setModifiedDate(new Date(modifiedDate));
		}

		dossierProcessImpl.resetOriginalValues();

		return dossierProcessImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		dossierProcessId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(dossierProcessId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public long dossierProcessId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
}