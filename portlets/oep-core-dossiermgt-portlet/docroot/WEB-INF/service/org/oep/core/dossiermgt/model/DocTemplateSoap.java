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
 * This class is used by SOAP remote services, specifically {@link org.oep.core.dossiermgt.service.http.DocTemplateServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.http.DocTemplateServiceSoap
 * @generated
 */
public class DocTemplateSoap implements Serializable {
	public static DocTemplateSoap toSoapModel(DocTemplate model) {
		DocTemplateSoap soapModel = new DocTemplateSoap();

		soapModel.setDocTemplateId(model.getDocTemplateId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTemplateNo(model.getTemplateNo());
		soapModel.setTitle(model.getTitle());
		soapModel.setEnTitle(model.getEnTitle());
		soapModel.setFileEntryId(model.getFileEntryId());

		return soapModel;
	}

	public static DocTemplateSoap[] toSoapModels(DocTemplate[] models) {
		DocTemplateSoap[] soapModels = new DocTemplateSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DocTemplateSoap[][] toSoapModels(DocTemplate[][] models) {
		DocTemplateSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DocTemplateSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DocTemplateSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DocTemplateSoap[] toSoapModels(List<DocTemplate> models) {
		List<DocTemplateSoap> soapModels = new ArrayList<DocTemplateSoap>(models.size());

		for (DocTemplate model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DocTemplateSoap[soapModels.size()]);
	}

	public DocTemplateSoap() {
	}

	public long getPrimaryKey() {
		return _docTemplateId;
	}

	public void setPrimaryKey(long pk) {
		setDocTemplateId(pk);
	}

	public long getDocTemplateId() {
		return _docTemplateId;
	}

	public void setDocTemplateId(long docTemplateId) {
		_docTemplateId = docTemplateId;
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

	public String getTemplateNo() {
		return _templateNo;
	}

	public void setTemplateNo(String templateNo) {
		_templateNo = templateNo;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getEnTitle() {
		return _enTitle;
	}

	public void setEnTitle(String enTitle) {
		_enTitle = enTitle;
	}

	public long getFileEntryId() {
		return _fileEntryId;
	}

	public void setFileEntryId(long fileEntryId) {
		_fileEntryId = fileEntryId;
	}

	private long _docTemplateId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _templateNo;
	private String _title;
	private String _enTitle;
	private long _fileEntryId;
}