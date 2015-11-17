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

package org.oep.dossiermgt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.oep.dossiermgt.service.http.DossierTagServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.dossiermgt.service.http.DossierTagServiceSoap
 * @generated
 */
public class DossierTagSoap implements Serializable {
	public static DossierTagSoap toSoapModel(DossierTag model) {
		DossierTagSoap soapModel = new DossierTagSoap();

		soapModel.setDossierTagId(model.getDossierTagId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setTag(model.getTag());

		return soapModel;
	}

	public static DossierTagSoap[] toSoapModels(DossierTag[] models) {
		DossierTagSoap[] soapModels = new DossierTagSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DossierTagSoap[][] toSoapModels(DossierTag[][] models) {
		DossierTagSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DossierTagSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DossierTagSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DossierTagSoap[] toSoapModels(List<DossierTag> models) {
		List<DossierTagSoap> soapModels = new ArrayList<DossierTagSoap>(models.size());

		for (DossierTag model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DossierTagSoap[soapModels.size()]);
	}

	public DossierTagSoap() {
	}

	public long getPrimaryKey() {
		return _dossierTagId;
	}

	public void setPrimaryKey(long pk) {
		setDossierTagId(pk);
	}

	public long getDossierTagId() {
		return _dossierTagId;
	}

	public void setDossierTagId(long dossierTagId) {
		_dossierTagId = dossierTagId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public long getDossierId() {
		return _dossierId;
	}

	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
	}

	public String getTag() {
		return _tag;
	}

	public void setTag(String tag) {
		_tag = tag;
	}

	private long _dossierTagId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private long _dossierId;
	private String _tag;
}