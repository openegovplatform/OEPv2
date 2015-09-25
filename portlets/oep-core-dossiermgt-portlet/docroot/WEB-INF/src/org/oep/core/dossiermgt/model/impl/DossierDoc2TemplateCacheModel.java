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
import com.liferay.portal.model.CacheModel;

import org.oep.core.dossiermgt.model.DossierDoc2Template;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing DossierDoc2Template in entity cache.
 *
 * @author trungdk
 * @see DossierDoc2Template
 * @generated
 */
public class DossierDoc2TemplateCacheModel implements CacheModel<DossierDoc2Template>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(id);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", dossierDocId=");
		sb.append(dossierDocId);
		sb.append(", docTemplateId=");
		sb.append(docTemplateId);
		sb.append(", sequenceNo=");
		sb.append(sequenceNo);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DossierDoc2Template toEntityModel() {
		DossierDoc2TemplateImpl dossierDoc2TemplateImpl = new DossierDoc2TemplateImpl();

		dossierDoc2TemplateImpl.setId(id);
		dossierDoc2TemplateImpl.setCompanyId(companyId);
		dossierDoc2TemplateImpl.setDossierDocId(dossierDocId);
		dossierDoc2TemplateImpl.setDocTemplateId(docTemplateId);
		dossierDoc2TemplateImpl.setSequenceNo(sequenceNo);

		dossierDoc2TemplateImpl.resetOriginalValues();

		return dossierDoc2TemplateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		companyId = objectInput.readLong();
		dossierDocId = objectInput.readLong();
		docTemplateId = objectInput.readLong();
		sequenceNo = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(dossierDocId);
		objectOutput.writeLong(docTemplateId);
		objectOutput.writeInt(sequenceNo);
	}

	public long id;
	public long companyId;
	public long dossierDocId;
	public long docTemplateId;
	public int sequenceNo;
}