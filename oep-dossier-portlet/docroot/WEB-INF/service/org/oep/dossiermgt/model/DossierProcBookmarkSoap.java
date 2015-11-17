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
 * This class is used by SOAP remote services, specifically {@link org.oep.dossiermgt.service.http.DossierProcBookmarkServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.dossiermgt.service.http.DossierProcBookmarkServiceSoap
 * @generated
 */
public class DossierProcBookmarkSoap implements Serializable {
	public static DossierProcBookmarkSoap toSoapModel(DossierProcBookmark model) {
		DossierProcBookmarkSoap soapModel = new DossierProcBookmarkSoap();

		soapModel.setDossierProcBookmarkId(model.getDossierProcBookmarkId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setDossierProcAgentId(model.getDossierProcAgentId());

		return soapModel;
	}

	public static DossierProcBookmarkSoap[] toSoapModels(
		DossierProcBookmark[] models) {
		DossierProcBookmarkSoap[] soapModels = new DossierProcBookmarkSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DossierProcBookmarkSoap[][] toSoapModels(
		DossierProcBookmark[][] models) {
		DossierProcBookmarkSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DossierProcBookmarkSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DossierProcBookmarkSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DossierProcBookmarkSoap[] toSoapModels(
		List<DossierProcBookmark> models) {
		List<DossierProcBookmarkSoap> soapModels = new ArrayList<DossierProcBookmarkSoap>(models.size());

		for (DossierProcBookmark model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DossierProcBookmarkSoap[soapModels.size()]);
	}

	public DossierProcBookmarkSoap() {
	}

	public long getPrimaryKey() {
		return _dossierProcBookmarkId;
	}

	public void setPrimaryKey(long pk) {
		setDossierProcBookmarkId(pk);
	}

	public long getDossierProcBookmarkId() {
		return _dossierProcBookmarkId;
	}

	public void setDossierProcBookmarkId(long dossierProcBookmarkId) {
		_dossierProcBookmarkId = dossierProcBookmarkId;
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

	public long getDossierProcAgentId() {
		return _dossierProcAgentId;
	}

	public void setDossierProcAgentId(long dossierProcAgentId) {
		_dossierProcAgentId = dossierProcAgentId;
	}

	private long _dossierProcBookmarkId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private long _dossierProcAgentId;
}