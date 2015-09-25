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

package org.oep.core.dossiermgt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.oep.core.dossiermgt.service.http.DossierDoc2TemplateServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.http.DossierDoc2TemplateServiceSoap
 * @generated
 */
public class DossierDoc2TemplateSoap implements Serializable {
	public static DossierDoc2TemplateSoap toSoapModel(DossierDoc2Template model) {
		DossierDoc2TemplateSoap soapModel = new DossierDoc2TemplateSoap();

		soapModel.setId(model.getId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setDossierDocId(model.getDossierDocId());
		soapModel.setDocTemplateId(model.getDocTemplateId());
		soapModel.setSequenceNo(model.getSequenceNo());

		return soapModel;
	}

	public static DossierDoc2TemplateSoap[] toSoapModels(
		DossierDoc2Template[] models) {
		DossierDoc2TemplateSoap[] soapModels = new DossierDoc2TemplateSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DossierDoc2TemplateSoap[][] toSoapModels(
		DossierDoc2Template[][] models) {
		DossierDoc2TemplateSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DossierDoc2TemplateSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DossierDoc2TemplateSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DossierDoc2TemplateSoap[] toSoapModels(
		List<DossierDoc2Template> models) {
		List<DossierDoc2TemplateSoap> soapModels = new ArrayList<DossierDoc2TemplateSoap>(models.size());

		for (DossierDoc2Template model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DossierDoc2TemplateSoap[soapModels.size()]);
	}

	public DossierDoc2TemplateSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getDossierDocId() {
		return _dossierDocId;
	}

	public void setDossierDocId(long dossierDocId) {
		_dossierDocId = dossierDocId;
	}

	public long getDocTemplateId() {
		return _docTemplateId;
	}

	public void setDocTemplateId(long docTemplateId) {
		_docTemplateId = docTemplateId;
	}

	public int getSequenceNo() {
		return _sequenceNo;
	}

	public void setSequenceNo(int sequenceNo) {
		_sequenceNo = sequenceNo;
	}

	private long _id;
	private long _companyId;
	private long _dossierDocId;
	private long _docTemplateId;
	private int _sequenceNo;
}