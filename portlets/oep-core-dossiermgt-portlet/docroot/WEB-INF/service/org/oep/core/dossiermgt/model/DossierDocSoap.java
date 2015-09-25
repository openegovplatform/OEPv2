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
 * This class is used by SOAP remote services, specifically {@link org.oep.core.dossiermgt.service.http.DossierDocServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.http.DossierDocServiceSoap
 * @generated
 */
public class DossierDocSoap implements Serializable {
	public static DossierDocSoap toSoapModel(DossierDoc model) {
		DossierDocSoap soapModel = new DossierDocSoap();

		soapModel.setDossierDocId(model.getDossierDocId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDossierProcId(model.getDossierProcId());
		soapModel.setDocumentNo(model.getDocumentNo());
		soapModel.setDocumentName(model.getDocumentName());
		soapModel.setNote(model.getNote());
		soapModel.setSequenceNo(model.getSequenceNo());
		soapModel.setDocumentType(model.getDocumentType());
		soapModel.setNumberOfFile(model.getNumberOfFile());
		soapModel.setOnlineForm(model.getOnlineForm());

		return soapModel;
	}

	public static DossierDocSoap[] toSoapModels(DossierDoc[] models) {
		DossierDocSoap[] soapModels = new DossierDocSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DossierDocSoap[][] toSoapModels(DossierDoc[][] models) {
		DossierDocSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DossierDocSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DossierDocSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DossierDocSoap[] toSoapModels(List<DossierDoc> models) {
		List<DossierDocSoap> soapModels = new ArrayList<DossierDocSoap>(models.size());

		for (DossierDoc model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DossierDocSoap[soapModels.size()]);
	}

	public DossierDocSoap() {
	}

	public long getPrimaryKey() {
		return _dossierDocId;
	}

	public void setPrimaryKey(long pk) {
		setDossierDocId(pk);
	}

	public long getDossierDocId() {
		return _dossierDocId;
	}

	public void setDossierDocId(long dossierDocId) {
		_dossierDocId = dossierDocId;
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

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getDossierProcId() {
		return _dossierProcId;
	}

	public void setDossierProcId(long dossierProcId) {
		_dossierProcId = dossierProcId;
	}

	public String getDocumentNo() {
		return _documentNo;
	}

	public void setDocumentNo(String documentNo) {
		_documentNo = documentNo;
	}

	public String getDocumentName() {
		return _documentName;
	}

	public void setDocumentName(String documentName) {
		_documentName = documentName;
	}

	public String getNote() {
		return _note;
	}

	public void setNote(String note) {
		_note = note;
	}

	public int getSequenceNo() {
		return _sequenceNo;
	}

	public void setSequenceNo(int sequenceNo) {
		_sequenceNo = sequenceNo;
	}

	public int getDocumentType() {
		return _documentType;
	}

	public void setDocumentType(int documentType) {
		_documentType = documentType;
	}

	public int getNumberOfFile() {
		return _numberOfFile;
	}

	public void setNumberOfFile(int numberOfFile) {
		_numberOfFile = numberOfFile;
	}

	public String getOnlineForm() {
		return _onlineForm;
	}

	public void setOnlineForm(String onlineForm) {
		_onlineForm = onlineForm;
	}

	private long _dossierDocId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _dossierProcId;
	private String _documentNo;
	private String _documentName;
	private String _note;
	private int _sequenceNo;
	private int _documentType;
	private int _numberOfFile;
	private String _onlineForm;
}