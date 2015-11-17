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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DocFileVersion}.
 * </p>
 *
 * @author trungdk
 * @see DocFileVersion
 * @generated
 */
public class DocFileVersionWrapper implements DocFileVersion,
	ModelWrapper<DocFileVersion> {
	public DocFileVersionWrapper(DocFileVersion docFileVersion) {
		_docFileVersion = docFileVersion;
	}

	@Override
	public Class<?> getModelClass() {
		return DocFileVersion.class;
	}

	@Override
	public String getModelClassName() {
		return DocFileVersion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("docFileVersionId", getDocFileVersionId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("docFileId", getDocFileId());
		attributes.put("fileEntryId", getFileEntryId());
		attributes.put("xmlContent", getXmlContent());
		attributes.put("ebMessageId", getEbMessageId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long docFileVersionId = (Long)attributes.get("docFileVersionId");

		if (docFileVersionId != null) {
			setDocFileVersionId(docFileVersionId);
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

		Long docFileId = (Long)attributes.get("docFileId");

		if (docFileId != null) {
			setDocFileId(docFileId);
		}

		Long fileEntryId = (Long)attributes.get("fileEntryId");

		if (fileEntryId != null) {
			setFileEntryId(fileEntryId);
		}

		String xmlContent = (String)attributes.get("xmlContent");

		if (xmlContent != null) {
			setXmlContent(xmlContent);
		}

		Long ebMessageId = (Long)attributes.get("ebMessageId");

		if (ebMessageId != null) {
			setEbMessageId(ebMessageId);
		}
	}

	/**
	* Returns the primary key of this doc file version.
	*
	* @return the primary key of this doc file version
	*/
	@Override
	public long getPrimaryKey() {
		return _docFileVersion.getPrimaryKey();
	}

	/**
	* Sets the primary key of this doc file version.
	*
	* @param primaryKey the primary key of this doc file version
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_docFileVersion.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this doc file version.
	*
	* @return the uuid of this doc file version
	*/
	@Override
	public java.lang.String getUuid() {
		return _docFileVersion.getUuid();
	}

	/**
	* Sets the uuid of this doc file version.
	*
	* @param uuid the uuid of this doc file version
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_docFileVersion.setUuid(uuid);
	}

	/**
	* Returns the doc file version ID of this doc file version.
	*
	* @return the doc file version ID of this doc file version
	*/
	@Override
	public long getDocFileVersionId() {
		return _docFileVersion.getDocFileVersionId();
	}

	/**
	* Sets the doc file version ID of this doc file version.
	*
	* @param docFileVersionId the doc file version ID of this doc file version
	*/
	@Override
	public void setDocFileVersionId(long docFileVersionId) {
		_docFileVersion.setDocFileVersionId(docFileVersionId);
	}

	/**
	* Returns the user ID of this doc file version.
	*
	* @return the user ID of this doc file version
	*/
	@Override
	public long getUserId() {
		return _docFileVersion.getUserId();
	}

	/**
	* Sets the user ID of this doc file version.
	*
	* @param userId the user ID of this doc file version
	*/
	@Override
	public void setUserId(long userId) {
		_docFileVersion.setUserId(userId);
	}

	/**
	* Returns the user uuid of this doc file version.
	*
	* @return the user uuid of this doc file version
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docFileVersion.getUserUuid();
	}

	/**
	* Sets the user uuid of this doc file version.
	*
	* @param userUuid the user uuid of this doc file version
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_docFileVersion.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this doc file version.
	*
	* @return the group ID of this doc file version
	*/
	@Override
	public long getGroupId() {
		return _docFileVersion.getGroupId();
	}

	/**
	* Sets the group ID of this doc file version.
	*
	* @param groupId the group ID of this doc file version
	*/
	@Override
	public void setGroupId(long groupId) {
		_docFileVersion.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this doc file version.
	*
	* @return the company ID of this doc file version
	*/
	@Override
	public long getCompanyId() {
		return _docFileVersion.getCompanyId();
	}

	/**
	* Sets the company ID of this doc file version.
	*
	* @param companyId the company ID of this doc file version
	*/
	@Override
	public void setCompanyId(long companyId) {
		_docFileVersion.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this doc file version.
	*
	* @return the create date of this doc file version
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _docFileVersion.getCreateDate();
	}

	/**
	* Sets the create date of this doc file version.
	*
	* @param createDate the create date of this doc file version
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_docFileVersion.setCreateDate(createDate);
	}

	/**
	* Returns the doc file ID of this doc file version.
	*
	* @return the doc file ID of this doc file version
	*/
	@Override
	public long getDocFileId() {
		return _docFileVersion.getDocFileId();
	}

	/**
	* Sets the doc file ID of this doc file version.
	*
	* @param docFileId the doc file ID of this doc file version
	*/
	@Override
	public void setDocFileId(long docFileId) {
		_docFileVersion.setDocFileId(docFileId);
	}

	/**
	* Returns the file entry ID of this doc file version.
	*
	* @return the file entry ID of this doc file version
	*/
	@Override
	public long getFileEntryId() {
		return _docFileVersion.getFileEntryId();
	}

	/**
	* Sets the file entry ID of this doc file version.
	*
	* @param fileEntryId the file entry ID of this doc file version
	*/
	@Override
	public void setFileEntryId(long fileEntryId) {
		_docFileVersion.setFileEntryId(fileEntryId);
	}

	/**
	* Returns the xml content of this doc file version.
	*
	* @return the xml content of this doc file version
	*/
	@Override
	public java.lang.String getXmlContent() {
		return _docFileVersion.getXmlContent();
	}

	/**
	* Sets the xml content of this doc file version.
	*
	* @param xmlContent the xml content of this doc file version
	*/
	@Override
	public void setXmlContent(java.lang.String xmlContent) {
		_docFileVersion.setXmlContent(xmlContent);
	}

	/**
	* Returns the eb message ID of this doc file version.
	*
	* @return the eb message ID of this doc file version
	*/
	@Override
	public long getEbMessageId() {
		return _docFileVersion.getEbMessageId();
	}

	/**
	* Sets the eb message ID of this doc file version.
	*
	* @param ebMessageId the eb message ID of this doc file version
	*/
	@Override
	public void setEbMessageId(long ebMessageId) {
		_docFileVersion.setEbMessageId(ebMessageId);
	}

	@Override
	public boolean isNew() {
		return _docFileVersion.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_docFileVersion.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _docFileVersion.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_docFileVersion.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _docFileVersion.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _docFileVersion.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_docFileVersion.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _docFileVersion.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_docFileVersion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_docFileVersion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_docFileVersion.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DocFileVersionWrapper((DocFileVersion)_docFileVersion.clone());
	}

	@Override
	public int compareTo(org.oep.dossiermgt.model.DocFileVersion docFileVersion) {
		return _docFileVersion.compareTo(docFileVersion);
	}

	@Override
	public int hashCode() {
		return _docFileVersion.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.dossiermgt.model.DocFileVersion> toCacheModel() {
		return _docFileVersion.toCacheModel();
	}

	@Override
	public org.oep.dossiermgt.model.DocFileVersion toEscapedModel() {
		return new DocFileVersionWrapper(_docFileVersion.toEscapedModel());
	}

	@Override
	public org.oep.dossiermgt.model.DocFileVersion toUnescapedModel() {
		return new DocFileVersionWrapper(_docFileVersion.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _docFileVersion.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _docFileVersion.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_docFileVersion.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DocFileVersionWrapper)) {
			return false;
		}

		DocFileVersionWrapper docFileVersionWrapper = (DocFileVersionWrapper)obj;

		if (Validator.equals(_docFileVersion,
					docFileVersionWrapper._docFileVersion)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DocFileVersion getWrappedDocFileVersion() {
		return _docFileVersion;
	}

	@Override
	public DocFileVersion getWrappedModel() {
		return _docFileVersion;
	}

	@Override
	public void resetOriginalValues() {
		_docFileVersion.resetOriginalValues();
	}

	private DocFileVersion _docFileVersion;
}