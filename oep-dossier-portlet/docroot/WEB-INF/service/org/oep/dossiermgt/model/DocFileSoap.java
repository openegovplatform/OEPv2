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
 * This class is used by SOAP remote services, specifically {@link org.oep.dossiermgt.service.http.DocFileServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.dossiermgt.service.http.DocFileServiceSoap
 * @generated
 */
public class DocFileSoap implements Serializable {
	public static DocFileSoap toSoapModel(DocFile model) {
		DocFileSoap soapModel = new DocFileSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setDocFileId(model.getDocFileId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setDossierDocId(model.getDossierDocId());
		soapModel.setDocTemplateId(model.getDocTemplateId());
		soapModel.setDocFileVersionId(model.getDocFileVersionId());
		soapModel.setDocFileName(model.getDocFileName());
		soapModel.setDocFileType(model.getDocFileType());
		soapModel.setVerifyStatus(model.getVerifyStatus());
		soapModel.setNote(model.getNote());
		soapModel.setApproveBy(model.getApproveBy());
		soapModel.setApproveDate(model.getApproveDate());
		soapModel.setPremier(model.getPremier());

		return soapModel;
	}

	public static DocFileSoap[] toSoapModels(DocFile[] models) {
		DocFileSoap[] soapModels = new DocFileSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DocFileSoap[][] toSoapModels(DocFile[][] models) {
		DocFileSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DocFileSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DocFileSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DocFileSoap[] toSoapModels(List<DocFile> models) {
		List<DocFileSoap> soapModels = new ArrayList<DocFileSoap>(models.size());

		for (DocFile model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DocFileSoap[soapModels.size()]);
	}

	public DocFileSoap() {
	}

	public long getPrimaryKey() {
		return _docFileId;
	}

	public void setPrimaryKey(long pk) {
		setDocFileId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getDocFileId() {
		return _docFileId;
	}

	public void setDocFileId(long docFileId) {
		_docFileId = docFileId;
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

	public long getDossierId() {
		return _dossierId;
	}

	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
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

	public long getDocFileVersionId() {
		return _docFileVersionId;
	}

	public void setDocFileVersionId(long docFileVersionId) {
		_docFileVersionId = docFileVersionId;
	}

	public String getDocFileName() {
		return _docFileName;
	}

	public void setDocFileName(String docFileName) {
		_docFileName = docFileName;
	}

	public long getDocFileType() {
		return _docFileType;
	}

	public void setDocFileType(long docFileType) {
		_docFileType = docFileType;
	}

	public int getVerifyStatus() {
		return _verifyStatus;
	}

	public void setVerifyStatus(int verifyStatus) {
		_verifyStatus = verifyStatus;
	}

	public String getNote() {
		return _note;
	}

	public void setNote(String note) {
		_note = note;
	}

	public String getApproveBy() {
		return _approveBy;
	}

	public void setApproveBy(String approveBy) {
		_approveBy = approveBy;
	}

	public Date getApproveDate() {
		return _approveDate;
	}

	public void setApproveDate(Date approveDate) {
		_approveDate = approveDate;
	}

	public int getPremier() {
		return _premier;
	}

	public void setPremier(int premier) {
		_premier = premier;
	}

	private String _uuid;
	private long _docFileId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _dossierId;
	private long _dossierDocId;
	private long _docTemplateId;
	private long _docFileVersionId;
	private String _docFileName;
	private long _docFileType;
	private int _verifyStatus;
	private String _note;
	private String _approveBy;
	private Date _approveDate;
	private int _premier;
}