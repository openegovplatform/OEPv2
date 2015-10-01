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
 * This class is used by SOAP remote services, specifically {@link org.oep.core.dossiermgt.service.http.DocFileVersionServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.http.DocFileVersionServiceSoap
 * @generated
 */
public class DocFileVersionSoap implements Serializable {
	public static DocFileVersionSoap toSoapModel(DocFileVersion model) {
		DocFileVersionSoap soapModel = new DocFileVersionSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setDocFileVersionId(model.getDocFileVersionId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setDocFileId(model.getDocFileId());
		soapModel.setFileEntryId(model.getFileEntryId());
		soapModel.setXmlContent(model.getXmlContent());
		soapModel.setEbMessageId(model.getEbMessageId());

		return soapModel;
	}

	public static DocFileVersionSoap[] toSoapModels(DocFileVersion[] models) {
		DocFileVersionSoap[] soapModels = new DocFileVersionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DocFileVersionSoap[][] toSoapModels(DocFileVersion[][] models) {
		DocFileVersionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DocFileVersionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DocFileVersionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DocFileVersionSoap[] toSoapModels(List<DocFileVersion> models) {
		List<DocFileVersionSoap> soapModels = new ArrayList<DocFileVersionSoap>(models.size());

		for (DocFileVersion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DocFileVersionSoap[soapModels.size()]);
	}

	public DocFileVersionSoap() {
	}

	public long getPrimaryKey() {
		return _docFileVersionId;
	}

	public void setPrimaryKey(long pk) {
		setDocFileVersionId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getDocFileVersionId() {
		return _docFileVersionId;
	}

	public void setDocFileVersionId(long docFileVersionId) {
		_docFileVersionId = docFileVersionId;
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

	public long getDocFileId() {
		return _docFileId;
	}

	public void setDocFileId(long docFileId) {
		_docFileId = docFileId;
	}

	public long getFileEntryId() {
		return _fileEntryId;
	}

	public void setFileEntryId(long fileEntryId) {
		_fileEntryId = fileEntryId;
	}

	public String getXmlContent() {
		return _xmlContent;
	}

	public void setXmlContent(String xmlContent) {
		_xmlContent = xmlContent;
	}

	public long getEbMessageId() {
		return _ebMessageId;
	}

	public void setEbMessageId(long ebMessageId) {
		_ebMessageId = ebMessageId;
	}

	private String _uuid;
	private long _docFileVersionId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private long _docFileId;
	private long _fileEntryId;
	private String _xmlContent;
	private long _ebMessageId;
}