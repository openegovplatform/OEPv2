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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DocTemplate}.
 * </p>
 *
 * @author trungdk
 * @see DocTemplate
 * @generated
 */
public class DocTemplateWrapper implements DocTemplate,
	ModelWrapper<DocTemplate> {
	public DocTemplateWrapper(DocTemplate docTemplate) {
		_docTemplate = docTemplate;
	}

	@Override
	public Class<?> getModelClass() {
		return DocTemplate.class;
	}

	@Override
	public String getModelClassName() {
		return DocTemplate.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("docTemplateId", getDocTemplateId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("templateNo", getTemplateNo());
		attributes.put("title", getTitle());
		attributes.put("enTitle", getEnTitle());
		attributes.put("fileEntryId", getFileEntryId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long docTemplateId = (Long)attributes.get("docTemplateId");

		if (docTemplateId != null) {
			setDocTemplateId(docTemplateId);
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

		String templateNo = (String)attributes.get("templateNo");

		if (templateNo != null) {
			setTemplateNo(templateNo);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String enTitle = (String)attributes.get("enTitle");

		if (enTitle != null) {
			setEnTitle(enTitle);
		}

		Long fileEntryId = (Long)attributes.get("fileEntryId");

		if (fileEntryId != null) {
			setFileEntryId(fileEntryId);
		}
	}

	/**
	* Returns the primary key of this doc template.
	*
	* @return the primary key of this doc template
	*/
	@Override
	public long getPrimaryKey() {
		return _docTemplate.getPrimaryKey();
	}

	/**
	* Sets the primary key of this doc template.
	*
	* @param primaryKey the primary key of this doc template
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_docTemplate.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the doc template ID of this doc template.
	*
	* @return the doc template ID of this doc template
	*/
	@Override
	public long getDocTemplateId() {
		return _docTemplate.getDocTemplateId();
	}

	/**
	* Sets the doc template ID of this doc template.
	*
	* @param docTemplateId the doc template ID of this doc template
	*/
	@Override
	public void setDocTemplateId(long docTemplateId) {
		_docTemplate.setDocTemplateId(docTemplateId);
	}

	/**
	* Returns the user ID of this doc template.
	*
	* @return the user ID of this doc template
	*/
	@Override
	public long getUserId() {
		return _docTemplate.getUserId();
	}

	/**
	* Sets the user ID of this doc template.
	*
	* @param userId the user ID of this doc template
	*/
	@Override
	public void setUserId(long userId) {
		_docTemplate.setUserId(userId);
	}

	/**
	* Returns the user uuid of this doc template.
	*
	* @return the user uuid of this doc template
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docTemplate.getUserUuid();
	}

	/**
	* Sets the user uuid of this doc template.
	*
	* @param userUuid the user uuid of this doc template
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_docTemplate.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this doc template.
	*
	* @return the group ID of this doc template
	*/
	@Override
	public long getGroupId() {
		return _docTemplate.getGroupId();
	}

	/**
	* Sets the group ID of this doc template.
	*
	* @param groupId the group ID of this doc template
	*/
	@Override
	public void setGroupId(long groupId) {
		_docTemplate.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this doc template.
	*
	* @return the company ID of this doc template
	*/
	@Override
	public long getCompanyId() {
		return _docTemplate.getCompanyId();
	}

	/**
	* Sets the company ID of this doc template.
	*
	* @param companyId the company ID of this doc template
	*/
	@Override
	public void setCompanyId(long companyId) {
		_docTemplate.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this doc template.
	*
	* @return the create date of this doc template
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _docTemplate.getCreateDate();
	}

	/**
	* Sets the create date of this doc template.
	*
	* @param createDate the create date of this doc template
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_docTemplate.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this doc template.
	*
	* @return the modified date of this doc template
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _docTemplate.getModifiedDate();
	}

	/**
	* Sets the modified date of this doc template.
	*
	* @param modifiedDate the modified date of this doc template
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_docTemplate.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the template no of this doc template.
	*
	* @return the template no of this doc template
	*/
	@Override
	public java.lang.String getTemplateNo() {
		return _docTemplate.getTemplateNo();
	}

	/**
	* Sets the template no of this doc template.
	*
	* @param templateNo the template no of this doc template
	*/
	@Override
	public void setTemplateNo(java.lang.String templateNo) {
		_docTemplate.setTemplateNo(templateNo);
	}

	/**
	* Returns the title of this doc template.
	*
	* @return the title of this doc template
	*/
	@Override
	public java.lang.String getTitle() {
		return _docTemplate.getTitle();
	}

	/**
	* Sets the title of this doc template.
	*
	* @param title the title of this doc template
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_docTemplate.setTitle(title);
	}

	/**
	* Returns the en title of this doc template.
	*
	* @return the en title of this doc template
	*/
	@Override
	public java.lang.String getEnTitle() {
		return _docTemplate.getEnTitle();
	}

	/**
	* Sets the en title of this doc template.
	*
	* @param enTitle the en title of this doc template
	*/
	@Override
	public void setEnTitle(java.lang.String enTitle) {
		_docTemplate.setEnTitle(enTitle);
	}

	/**
	* Returns the file entry ID of this doc template.
	*
	* @return the file entry ID of this doc template
	*/
	@Override
	public long getFileEntryId() {
		return _docTemplate.getFileEntryId();
	}

	/**
	* Sets the file entry ID of this doc template.
	*
	* @param fileEntryId the file entry ID of this doc template
	*/
	@Override
	public void setFileEntryId(long fileEntryId) {
		_docTemplate.setFileEntryId(fileEntryId);
	}

	@Override
	public boolean isNew() {
		return _docTemplate.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_docTemplate.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _docTemplate.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_docTemplate.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _docTemplate.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _docTemplate.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_docTemplate.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _docTemplate.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_docTemplate.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_docTemplate.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_docTemplate.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DocTemplateWrapper((DocTemplate)_docTemplate.clone());
	}

	@Override
	public int compareTo(DocTemplate docTemplate) {
		return _docTemplate.compareTo(docTemplate);
	}

	@Override
	public int hashCode() {
		return _docTemplate.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<DocTemplate> toCacheModel() {
		return _docTemplate.toCacheModel();
	}

	@Override
	public DocTemplate toEscapedModel() {
		return new DocTemplateWrapper(_docTemplate.toEscapedModel());
	}

	@Override
	public DocTemplate toUnescapedModel() {
		return new DocTemplateWrapper(_docTemplate.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _docTemplate.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _docTemplate.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_docTemplate.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DocTemplateWrapper)) {
			return false;
		}

		DocTemplateWrapper docTemplateWrapper = (DocTemplateWrapper)obj;

		if (Validator.equals(_docTemplate, docTemplateWrapper._docTemplate)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DocTemplate getWrappedDocTemplate() {
		return _docTemplate;
	}

	@Override
	public DocTemplate getWrappedModel() {
		return _docTemplate;
	}

	@Override
	public void resetOriginalValues() {
		_docTemplate.resetOriginalValues();
	}

	private DocTemplate _docTemplate;
}