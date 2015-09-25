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

import org.oep.core.dossiermgt.model.DossierProc2Agent;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing DossierProc2Agent in entity cache.
 *
 * @author trungdk
 * @see DossierProc2Agent
 * @generated
 */
public class DossierProc2AgentCacheModel implements CacheModel<DossierProc2Agent>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(id);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", dossierProcId=");
		sb.append(dossierProcId);
		sb.append(", govAgentNo=");
		sb.append(govAgentNo);
		sb.append(", govAgentName=");
		sb.append(govAgentName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DossierProc2Agent toEntityModel() {
		DossierProc2AgentImpl dossierProc2AgentImpl = new DossierProc2AgentImpl();

		dossierProc2AgentImpl.setId(id);
		dossierProc2AgentImpl.setCompanyId(companyId);
		dossierProc2AgentImpl.setDossierProcId(dossierProcId);

		if (govAgentNo == null) {
			dossierProc2AgentImpl.setGovAgentNo(StringPool.BLANK);
		}
		else {
			dossierProc2AgentImpl.setGovAgentNo(govAgentNo);
		}

		if (govAgentName == null) {
			dossierProc2AgentImpl.setGovAgentName(StringPool.BLANK);
		}
		else {
			dossierProc2AgentImpl.setGovAgentName(govAgentName);
		}

		dossierProc2AgentImpl.resetOriginalValues();

		return dossierProc2AgentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		companyId = objectInput.readLong();
		dossierProcId = objectInput.readLong();
		govAgentNo = objectInput.readUTF();
		govAgentName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(dossierProcId);

		if (govAgentNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(govAgentNo);
		}

		if (govAgentName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(govAgentName);
		}
	}

	public long id;
	public long companyId;
	public long dossierProcId;
	public String govAgentNo;
	public String govAgentName;
}