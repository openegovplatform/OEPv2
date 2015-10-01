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
		StringBundler sb = new StringBundler(5);

		sb.append("{dossierDocId=");
		sb.append(dossierDocId);
		sb.append(", docTemplateId=");
		sb.append(docTemplateId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DossierDoc2Template toEntityModel() {
		DossierDoc2TemplateImpl dossierDoc2TemplateImpl = new DossierDoc2TemplateImpl();

		dossierDoc2TemplateImpl.setDossierDocId(dossierDocId);
		dossierDoc2TemplateImpl.setDocTemplateId(docTemplateId);

		dossierDoc2TemplateImpl.resetOriginalValues();

		return dossierDoc2TemplateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		dossierDocId = objectInput.readLong();
		docTemplateId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(dossierDocId);
		objectOutput.writeLong(docTemplateId);
	}

	public long dossierDocId;
	public long docTemplateId;
}