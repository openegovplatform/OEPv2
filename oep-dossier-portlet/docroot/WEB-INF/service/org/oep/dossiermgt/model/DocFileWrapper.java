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

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DocFile}.
 * </p>
 *
 * @author trungdk
 * @see DocFile
 * @generated
 */
public class DocFileWrapper implements DocFile, ModelWrapper<DocFile> {
	public DocFileWrapper(DocFile docFile) {
		_docFile = docFile;
	}

	@Override
	public Class<?> getModelClass() {
		return DocFile.class;
	}

	@Override
	public String getModelClassName() {
		return DocFile.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("docFileId", getDocFileId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dossierId", getDossierId());
		attributes.put("dossierDocId", getDossierDocId());
		attributes.put("docTemplateId", getDocTemplateId());
		attributes.put("docFileVersionId", getDocFileVersionId());
		attributes.put("docFileName", getDocFileName());
		attributes.put("docFileType", getDocFileType());
		attributes.put("verifyStatus", getVerifyStatus());
		attributes.put("note", getNote());
		attributes.put("approveBy", getApproveBy());
		attributes.put("approveDate", getApproveDate());
		attributes.put("premier", getPremier());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long docFileId = (Long)attributes.get("docFileId");

		if (docFileId != null) {
			setDocFileId(docFileId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		Long dossierDocId = (Long)attributes.get("dossierDocId");

		if (dossierDocId != null) {
			setDossierDocId(dossierDocId);
		}

		Long docTemplateId = (Long)attributes.get("docTemplateId");

		if (docTemplateId != null) {
			setDocTemplateId(docTemplateId);
		}

		Long docFileVersionId = (Long)attributes.get("docFileVersionId");

		if (docFileVersionId != null) {
			setDocFileVersionId(docFileVersionId);
		}

		String docFileName = (String)attributes.get("docFileName");

		if (docFileName != null) {
			setDocFileName(docFileName);
		}

		Long docFileType = (Long)attributes.get("docFileType");

		if (docFileType != null) {
			setDocFileType(docFileType);
		}

		Integer verifyStatus = (Integer)attributes.get("verifyStatus");

		if (verifyStatus != null) {
			setVerifyStatus(verifyStatus);
		}

		String note = (String)attributes.get("note");

		if (note != null) {
			setNote(note);
		}

		String approveBy = (String)attributes.get("approveBy");

		if (approveBy != null) {
			setApproveBy(approveBy);
		}

		Date approveDate = (Date)attributes.get("approveDate");

		if (approveDate != null) {
			setApproveDate(approveDate);
		}

		Integer premier = (Integer)attributes.get("premier");

		if (premier != null) {
			setPremier(premier);
		}
	}

	/**
	* Returns the primary key of this doc file.
	*
	* @return the primary key of this doc file
	*/
	@Override
	public long getPrimaryKey() {
		return _docFile.getPrimaryKey();
	}

	/**
	* Sets the primary key of this doc file.
	*
	* @param primaryKey the primary key of this doc file
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_docFile.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this doc file.
	*
	* @return the uuid of this doc file
	*/
	@Override
	public java.lang.String getUuid() {
		return _docFile.getUuid();
	}

	/**
	* Sets the uuid of this doc file.
	*
	* @param uuid the uuid of this doc file
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_docFile.setUuid(uuid);
	}

	/**
	* Returns the doc file ID of this doc file.
	*
	* @return the doc file ID of this doc file
	*/
	@Override
	public long getDocFileId() {
		return _docFile.getDocFileId();
	}

	/**
	* Sets the doc file ID of this doc file.
	*
	* @param docFileId the doc file ID of this doc file
	*/
	@Override
	public void setDocFileId(long docFileId) {
		_docFile.setDocFileId(docFileId);
	}

	/**
	* Returns the user ID of this doc file.
	*
	* @return the user ID of this doc file
	*/
	@Override
	public long getUserId() {
		return _docFile.getUserId();
	}

	/**
	* Sets the user ID of this doc file.
	*
	* @param userId the user ID of this doc file
	*/
	@Override
	public void setUserId(long userId) {
		_docFile.setUserId(userId);
	}

	/**
	* Returns the user uuid of this doc file.
	*
	* @return the user uuid of this doc file
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docFile.getUserUuid();
	}

	/**
	* Sets the user uuid of this doc file.
	*
	* @param userUuid the user uuid of this doc file
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_docFile.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this doc file.
	*
	* @return the group ID of this doc file
	*/
	@Override
	public long getGroupId() {
		return _docFile.getGroupId();
	}

	/**
	* Sets the group ID of this doc file.
	*
	* @param groupId the group ID of this doc file
	*/
	@Override
	public void setGroupId(long groupId) {
		_docFile.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this doc file.
	*
	* @return the company ID of this doc file
	*/
	@Override
	public long getCompanyId() {
		return _docFile.getCompanyId();
	}

	/**
	* Sets the company ID of this doc file.
	*
	* @param companyId the company ID of this doc file
	*/
	@Override
	public void setCompanyId(long companyId) {
		_docFile.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this doc file.
	*
	* @return the create date of this doc file
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _docFile.getCreateDate();
	}

	/**
	* Sets the create date of this doc file.
	*
	* @param createDate the create date of this doc file
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_docFile.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this doc file.
	*
	* @return the modified date of this doc file
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _docFile.getModifiedDate();
	}

	/**
	* Sets the modified date of this doc file.
	*
	* @param modifiedDate the modified date of this doc file
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_docFile.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the dossier ID of this doc file.
	*
	* @return the dossier ID of this doc file
	*/
	@Override
	public long getDossierId() {
		return _docFile.getDossierId();
	}

	/**
	* Sets the dossier ID of this doc file.
	*
	* @param dossierId the dossier ID of this doc file
	*/
	@Override
	public void setDossierId(long dossierId) {
		_docFile.setDossierId(dossierId);
	}

	/**
	* Returns the dossier doc ID of this doc file.
	*
	* @return the dossier doc ID of this doc file
	*/
	@Override
	public long getDossierDocId() {
		return _docFile.getDossierDocId();
	}

	/**
	* Sets the dossier doc ID of this doc file.
	*
	* @param dossierDocId the dossier doc ID of this doc file
	*/
	@Override
	public void setDossierDocId(long dossierDocId) {
		_docFile.setDossierDocId(dossierDocId);
	}

	/**
	* Returns the doc template ID of this doc file.
	*
	* @return the doc template ID of this doc file
	*/
	@Override
	public long getDocTemplateId() {
		return _docFile.getDocTemplateId();
	}

	/**
	* Sets the doc template ID of this doc file.
	*
	* @param docTemplateId the doc template ID of this doc file
	*/
	@Override
	public void setDocTemplateId(long docTemplateId) {
		_docFile.setDocTemplateId(docTemplateId);
	}

	/**
	* Returns the doc file version ID of this doc file.
	*
	* @return the doc file version ID of this doc file
	*/
	@Override
	public long getDocFileVersionId() {
		return _docFile.getDocFileVersionId();
	}

	/**
	* Sets the doc file version ID of this doc file.
	*
	* @param docFileVersionId the doc file version ID of this doc file
	*/
	@Override
	public void setDocFileVersionId(long docFileVersionId) {
		_docFile.setDocFileVersionId(docFileVersionId);
	}

	/**
	* Returns the doc file name of this doc file.
	*
	* @return the doc file name of this doc file
	*/
	@Override
	public java.lang.String getDocFileName() {
		return _docFile.getDocFileName();
	}

	/**
	* Sets the doc file name of this doc file.
	*
	* @param docFileName the doc file name of this doc file
	*/
	@Override
	public void setDocFileName(java.lang.String docFileName) {
		_docFile.setDocFileName(docFileName);
	}

	/**
	* Returns the doc file type of this doc file.
	*
	* @return the doc file type of this doc file
	*/
	@Override
	public long getDocFileType() {
		return _docFile.getDocFileType();
	}

	/**
	* Sets the doc file type of this doc file.
	*
	* @param docFileType the doc file type of this doc file
	*/
	@Override
	public void setDocFileType(long docFileType) {
		_docFile.setDocFileType(docFileType);
	}

	/**
	* Returns the verify status of this doc file.
	*
	* @return the verify status of this doc file
	*/
	@Override
	public int getVerifyStatus() {
		return _docFile.getVerifyStatus();
	}

	/**
	* Sets the verify status of this doc file.
	*
	* @param verifyStatus the verify status of this doc file
	*/
	@Override
	public void setVerifyStatus(int verifyStatus) {
		_docFile.setVerifyStatus(verifyStatus);
	}

	/**
	* Returns the note of this doc file.
	*
	* @return the note of this doc file
	*/
	@Override
	public java.lang.String getNote() {
		return _docFile.getNote();
	}

	/**
	* Sets the note of this doc file.
	*
	* @param note the note of this doc file
	*/
	@Override
	public void setNote(java.lang.String note) {
		_docFile.setNote(note);
	}

	/**
	* Returns the approve by of this doc file.
	*
	* @return the approve by of this doc file
	*/
	@Override
	public java.lang.String getApproveBy() {
		return _docFile.getApproveBy();
	}

	/**
	* Sets the approve by of this doc file.
	*
	* @param approveBy the approve by of this doc file
	*/
	@Override
	public void setApproveBy(java.lang.String approveBy) {
		_docFile.setApproveBy(approveBy);
	}

	/**
	* Returns the approve date of this doc file.
	*
	* @return the approve date of this doc file
	*/
	@Override
	public java.util.Date getApproveDate() {
		return _docFile.getApproveDate();
	}

	/**
	* Sets the approve date of this doc file.
	*
	* @param approveDate the approve date of this doc file
	*/
	@Override
	public void setApproveDate(java.util.Date approveDate) {
		_docFile.setApproveDate(approveDate);
	}

	/**
	* Returns the premier of this doc file.
	*
	* @return the premier of this doc file
	*/
	@Override
	public int getPremier() {
		return _docFile.getPremier();
	}

	/**
	* Sets the premier of this doc file.
	*
	* @param premier the premier of this doc file
	*/
	@Override
	public void setPremier(int premier) {
		_docFile.setPremier(premier);
	}

	@Override
	public boolean isNew() {
		return _docFile.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_docFile.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _docFile.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_docFile.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _docFile.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _docFile.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_docFile.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _docFile.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_docFile.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_docFile.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_docFile.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DocFileWrapper((DocFile)_docFile.clone());
	}

	@Override
	public int compareTo(org.oep.dossiermgt.model.DocFile docFile) {
		return _docFile.compareTo(docFile);
	}

	@Override
	public int hashCode() {
		return _docFile.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.dossiermgt.model.DocFile> toCacheModel() {
		return _docFile.toCacheModel();
	}

	@Override
	public org.oep.dossiermgt.model.DocFile toEscapedModel() {
		return new DocFileWrapper(_docFile.toEscapedModel());
	}

	@Override
	public org.oep.dossiermgt.model.DocFile toUnescapedModel() {
		return new DocFileWrapper(_docFile.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _docFile.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _docFile.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_docFile.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DocFileWrapper)) {
			return false;
		}

		DocFileWrapper docFileWrapper = (DocFileWrapper)obj;

		if (Validator.equals(_docFile, docFileWrapper._docFile)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _docFile.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DocFile getWrappedDocFile() {
		return _docFile;
	}

	@Override
	public DocFile getWrappedModel() {
		return _docFile;
	}

	@Override
	public void resetOriginalValues() {
		_docFile.resetOriginalValues();
	}

	private DocFile _docFile;
}