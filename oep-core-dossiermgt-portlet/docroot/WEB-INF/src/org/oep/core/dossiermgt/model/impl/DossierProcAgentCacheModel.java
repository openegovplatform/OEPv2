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

package org.oep.core.dossiermgt.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.oep.core.dossiermgt.model.DossierProcAgent;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DossierProcAgent in entity cache.
 *
 * @author trungdk
 * @see DossierProcAgent
 * @generated
 */
public class DossierProcAgentCacheModel implements CacheModel<DossierProcAgent>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{dossierProcAgentId=");
		sb.append(dossierProcAgentId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", dossierProcId=");
		sb.append(dossierProcId);
		sb.append(", govAgencyId=");
		sb.append(govAgencyId);
		sb.append(", govAgencyName=");
		sb.append(govAgencyName);
		sb.append(", ebPartnerShipId=");
		sb.append(ebPartnerShipId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DossierProcAgent toEntityModel() {
		DossierProcAgentImpl dossierProcAgentImpl = new DossierProcAgentImpl();

		dossierProcAgentImpl.setDossierProcAgentId(dossierProcAgentId);
		dossierProcAgentImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			dossierProcAgentImpl.setCreateDate(null);
		}
		else {
			dossierProcAgentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			dossierProcAgentImpl.setModifiedDate(null);
		}
		else {
			dossierProcAgentImpl.setModifiedDate(new Date(modifiedDate));
		}

		dossierProcAgentImpl.setDossierProcId(dossierProcId);

		if (govAgencyId == null) {
			dossierProcAgentImpl.setGovAgencyId(StringPool.BLANK);
		}
		else {
			dossierProcAgentImpl.setGovAgencyId(govAgencyId);
		}

		if (govAgencyName == null) {
			dossierProcAgentImpl.setGovAgencyName(StringPool.BLANK);
		}
		else {
			dossierProcAgentImpl.setGovAgencyName(govAgencyName);
		}

		dossierProcAgentImpl.setEbPartnerShipId(ebPartnerShipId);

		dossierProcAgentImpl.resetOriginalValues();

		return dossierProcAgentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		dossierProcAgentId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		dossierProcId = objectInput.readLong();
		govAgencyId = objectInput.readUTF();
		govAgencyName = objectInput.readUTF();
		ebPartnerShipId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(dossierProcAgentId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(dossierProcId);

		if (govAgencyId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(govAgencyId);
		}

		if (govAgencyName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(govAgencyName);
		}

		objectOutput.writeLong(ebPartnerShipId);
	}

	public long dossierProcAgentId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public long dossierProcId;
	public String govAgencyId;
	public String govAgencyName;
	public long ebPartnerShipId;
}