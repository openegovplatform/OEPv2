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

package org.oep.processmgt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CreateFile}.
 * </p>
 *
 * @author trungdk
 * @see CreateFile
 * @generated
 */
public class CreateFileWrapper implements CreateFile, ModelWrapper<CreateFile> {
	public CreateFileWrapper(CreateFile createFile) {
		_createFile = createFile;
	}

	@Override
	public Class<?> getModelClass() {
		return CreateFile.class;
	}

	@Override
	public String getModelClassName() {
		return CreateFile.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("createFileId", getCreateFileId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("processOrderId", getProcessOrderId());
		attributes.put("dossierStepId", getDossierStepId());
		attributes.put("stepDate", getStepDate());
		attributes.put("docFileId", getDocFileId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long createFileId = (Long)attributes.get("createFileId");

		if (createFileId != null) {
			setCreateFileId(createFileId);
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

		Long processOrderId = (Long)attributes.get("processOrderId");

		if (processOrderId != null) {
			setProcessOrderId(processOrderId);
		}

		Long dossierStepId = (Long)attributes.get("dossierStepId");

		if (dossierStepId != null) {
			setDossierStepId(dossierStepId);
		}

		Date stepDate = (Date)attributes.get("stepDate");

		if (stepDate != null) {
			setStepDate(stepDate);
		}

		Long docFileId = (Long)attributes.get("docFileId");

		if (docFileId != null) {
			setDocFileId(docFileId);
		}
	}

	/**
	* Returns the primary key of this create file.
	*
	* @return the primary key of this create file
	*/
	@Override
	public long getPrimaryKey() {
		return _createFile.getPrimaryKey();
	}

	/**
	* Sets the primary key of this create file.
	*
	* @param primaryKey the primary key of this create file
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_createFile.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the create file ID of this create file.
	*
	* @return the create file ID of this create file
	*/
	@Override
	public long getCreateFileId() {
		return _createFile.getCreateFileId();
	}

	/**
	* Sets the create file ID of this create file.
	*
	* @param createFileId the create file ID of this create file
	*/
	@Override
	public void setCreateFileId(long createFileId) {
		_createFile.setCreateFileId(createFileId);
	}

	/**
	* Returns the user ID of this create file.
	*
	* @return the user ID of this create file
	*/
	@Override
	public long getUserId() {
		return _createFile.getUserId();
	}

	/**
	* Sets the user ID of this create file.
	*
	* @param userId the user ID of this create file
	*/
	@Override
	public void setUserId(long userId) {
		_createFile.setUserId(userId);
	}

	/**
	* Returns the user uuid of this create file.
	*
	* @return the user uuid of this create file
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _createFile.getUserUuid();
	}

	/**
	* Sets the user uuid of this create file.
	*
	* @param userUuid the user uuid of this create file
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_createFile.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this create file.
	*
	* @return the group ID of this create file
	*/
	@Override
	public long getGroupId() {
		return _createFile.getGroupId();
	}

	/**
	* Sets the group ID of this create file.
	*
	* @param groupId the group ID of this create file
	*/
	@Override
	public void setGroupId(long groupId) {
		_createFile.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this create file.
	*
	* @return the company ID of this create file
	*/
	@Override
	public long getCompanyId() {
		return _createFile.getCompanyId();
	}

	/**
	* Sets the company ID of this create file.
	*
	* @param companyId the company ID of this create file
	*/
	@Override
	public void setCompanyId(long companyId) {
		_createFile.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this create file.
	*
	* @return the create date of this create file
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _createFile.getCreateDate();
	}

	/**
	* Sets the create date of this create file.
	*
	* @param createDate the create date of this create file
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_createFile.setCreateDate(createDate);
	}

	/**
	* Returns the process order ID of this create file.
	*
	* @return the process order ID of this create file
	*/
	@Override
	public long getProcessOrderId() {
		return _createFile.getProcessOrderId();
	}

	/**
	* Sets the process order ID of this create file.
	*
	* @param processOrderId the process order ID of this create file
	*/
	@Override
	public void setProcessOrderId(long processOrderId) {
		_createFile.setProcessOrderId(processOrderId);
	}

	/**
	* Returns the dossier step ID of this create file.
	*
	* @return the dossier step ID of this create file
	*/
	@Override
	public long getDossierStepId() {
		return _createFile.getDossierStepId();
	}

	/**
	* Sets the dossier step ID of this create file.
	*
	* @param dossierStepId the dossier step ID of this create file
	*/
	@Override
	public void setDossierStepId(long dossierStepId) {
		_createFile.setDossierStepId(dossierStepId);
	}

	/**
	* Returns the step date of this create file.
	*
	* @return the step date of this create file
	*/
	@Override
	public java.util.Date getStepDate() {
		return _createFile.getStepDate();
	}

	/**
	* Sets the step date of this create file.
	*
	* @param stepDate the step date of this create file
	*/
	@Override
	public void setStepDate(java.util.Date stepDate) {
		_createFile.setStepDate(stepDate);
	}

	/**
	* Returns the doc file ID of this create file.
	*
	* @return the doc file ID of this create file
	*/
	@Override
	public long getDocFileId() {
		return _createFile.getDocFileId();
	}

	/**
	* Sets the doc file ID of this create file.
	*
	* @param docFileId the doc file ID of this create file
	*/
	@Override
	public void setDocFileId(long docFileId) {
		_createFile.setDocFileId(docFileId);
	}

	@Override
	public boolean isNew() {
		return _createFile.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_createFile.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _createFile.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_createFile.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _createFile.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _createFile.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_createFile.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _createFile.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_createFile.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_createFile.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_createFile.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CreateFileWrapper((CreateFile)_createFile.clone());
	}

	@Override
	public int compareTo(org.oep.processmgt.model.CreateFile createFile) {
		return _createFile.compareTo(createFile);
	}

	@Override
	public int hashCode() {
		return _createFile.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.processmgt.model.CreateFile> toCacheModel() {
		return _createFile.toCacheModel();
	}

	@Override
	public org.oep.processmgt.model.CreateFile toEscapedModel() {
		return new CreateFileWrapper(_createFile.toEscapedModel());
	}

	@Override
	public org.oep.processmgt.model.CreateFile toUnescapedModel() {
		return new CreateFileWrapper(_createFile.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _createFile.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _createFile.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_createFile.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CreateFileWrapper)) {
			return false;
		}

		CreateFileWrapper createFileWrapper = (CreateFileWrapper)obj;

		if (Validator.equals(_createFile, createFileWrapper._createFile)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CreateFile getWrappedCreateFile() {
		return _createFile;
	}

	@Override
	public CreateFile getWrappedModel() {
		return _createFile;
	}

	@Override
	public void resetOriginalValues() {
		_createFile.resetOriginalValues();
	}

	private CreateFile _createFile;
}