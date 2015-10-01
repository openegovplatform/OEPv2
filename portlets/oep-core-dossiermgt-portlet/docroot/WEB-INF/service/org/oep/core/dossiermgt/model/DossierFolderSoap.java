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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.oep.core.dossiermgt.service.http.DossierFolderServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.http.DossierFolderServiceSoap
 * @generated
 */
public class DossierFolderSoap implements Serializable {
	public static DossierFolderSoap toSoapModel(DossierFolder model) {
		DossierFolderSoap soapModel = new DossierFolderSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setDossierFolderId(model.getDossierFolderId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setFolderName(model.getFolderName());
		soapModel.setParentDossierFolderId(model.getParentDossierFolderId());
		soapModel.setSequenceNo(model.getSequenceNo());
		soapModel.setProcedureFilter(model.getProcedureFilter());
		soapModel.setStatusFilter(model.getStatusFilter());
		soapModel.setFilterByOrganization(model.getFilterByOrganization());
		soapModel.setFilterByUser(model.getFilterByUser());

		return soapModel;
	}

	public static DossierFolderSoap[] toSoapModels(DossierFolder[] models) {
		DossierFolderSoap[] soapModels = new DossierFolderSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DossierFolderSoap[][] toSoapModels(DossierFolder[][] models) {
		DossierFolderSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DossierFolderSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DossierFolderSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DossierFolderSoap[] toSoapModels(List<DossierFolder> models) {
		List<DossierFolderSoap> soapModels = new ArrayList<DossierFolderSoap>(models.size());

		for (DossierFolder model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DossierFolderSoap[soapModels.size()]);
	}

	public DossierFolderSoap() {
	}

	public long getPrimaryKey() {
		return _dossierFolderId;
	}

	public void setPrimaryKey(long pk) {
		setDossierFolderId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getDossierFolderId() {
		return _dossierFolderId;
	}

	public void setDossierFolderId(long dossierFolderId) {
		_dossierFolderId = dossierFolderId;
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

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getFolderName() {
		return _folderName;
	}

	public void setFolderName(String folderName) {
		_folderName = folderName;
	}

	public long getParentDossierFolderId() {
		return _parentDossierFolderId;
	}

	public void setParentDossierFolderId(long parentDossierFolderId) {
		_parentDossierFolderId = parentDossierFolderId;
	}

	public int getSequenceNo() {
		return _sequenceNo;
	}

	public void setSequenceNo(int sequenceNo) {
		_sequenceNo = sequenceNo;
	}

	public String getProcedureFilter() {
		return _procedureFilter;
	}

	public void setProcedureFilter(String procedureFilter) {
		_procedureFilter = procedureFilter;
	}

	public String getStatusFilter() {
		return _statusFilter;
	}

	public void setStatusFilter(String statusFilter) {
		_statusFilter = statusFilter;
	}

	public int getFilterByOrganization() {
		return _filterByOrganization;
	}

	public void setFilterByOrganization(int filterByOrganization) {
		_filterByOrganization = filterByOrganization;
	}

	public int getFilterByUser() {
		return _filterByUser;
	}

	public void setFilterByUser(int filterByUser) {
		_filterByUser = filterByUser;
	}

	private String _uuid;
	private long _dossierFolderId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _folderName;
	private long _parentDossierFolderId;
	private int _sequenceNo;
	private String _procedureFilter;
	private String _statusFilter;
	private int _filterByOrganization;
	private int _filterByUser;
}