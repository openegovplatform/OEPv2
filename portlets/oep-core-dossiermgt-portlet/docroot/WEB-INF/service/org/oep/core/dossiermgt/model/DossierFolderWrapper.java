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

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DossierFolder}.
 * </p>
 *
 * @author trungdk
 * @see DossierFolder
 * @generated
 */
public class DossierFolderWrapper implements DossierFolder,
	ModelWrapper<DossierFolder> {
	public DossierFolderWrapper(DossierFolder dossierFolder) {
		_dossierFolder = dossierFolder;
	}

	@Override
	public Class<?> getModelClass() {
		return DossierFolder.class;
	}

	@Override
	public String getModelClassName() {
		return DossierFolder.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("dossierFolderId", getDossierFolderId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("folderName", getFolderName());
		attributes.put("parentFolderId", getParentFolderId());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("procedureFilter", getProcedureFilter());
		attributes.put("statusFilter", getStatusFilter());
		attributes.put("filterByOrganization", getFilterByOrganization());
		attributes.put("filterByUser", getFilterByUser());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long dossierFolderId = (Long)attributes.get("dossierFolderId");

		if (dossierFolderId != null) {
			setDossierFolderId(dossierFolderId);
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

		String folderName = (String)attributes.get("folderName");

		if (folderName != null) {
			setFolderName(folderName);
		}

		Long parentFolderId = (Long)attributes.get("parentFolderId");

		if (parentFolderId != null) {
			setParentFolderId(parentFolderId);
		}

		Integer sequenceNo = (Integer)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		String procedureFilter = (String)attributes.get("procedureFilter");

		if (procedureFilter != null) {
			setProcedureFilter(procedureFilter);
		}

		String statusFilter = (String)attributes.get("statusFilter");

		if (statusFilter != null) {
			setStatusFilter(statusFilter);
		}

		Integer filterByOrganization = (Integer)attributes.get(
				"filterByOrganization");

		if (filterByOrganization != null) {
			setFilterByOrganization(filterByOrganization);
		}

		Integer filterByUser = (Integer)attributes.get("filterByUser");

		if (filterByUser != null) {
			setFilterByUser(filterByUser);
		}
	}

	/**
	* Returns the primary key of this dossier folder.
	*
	* @return the primary key of this dossier folder
	*/
	@Override
	public long getPrimaryKey() {
		return _dossierFolder.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dossier folder.
	*
	* @param primaryKey the primary key of this dossier folder
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dossierFolder.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this dossier folder.
	*
	* @return the uuid of this dossier folder
	*/
	@Override
	public java.lang.String getUuid() {
		return _dossierFolder.getUuid();
	}

	/**
	* Sets the uuid of this dossier folder.
	*
	* @param uuid the uuid of this dossier folder
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_dossierFolder.setUuid(uuid);
	}

	/**
	* Returns the dossier folder ID of this dossier folder.
	*
	* @return the dossier folder ID of this dossier folder
	*/
	@Override
	public long getDossierFolderId() {
		return _dossierFolder.getDossierFolderId();
	}

	/**
	* Sets the dossier folder ID of this dossier folder.
	*
	* @param dossierFolderId the dossier folder ID of this dossier folder
	*/
	@Override
	public void setDossierFolderId(long dossierFolderId) {
		_dossierFolder.setDossierFolderId(dossierFolderId);
	}

	/**
	* Returns the company ID of this dossier folder.
	*
	* @return the company ID of this dossier folder
	*/
	@Override
	public long getCompanyId() {
		return _dossierFolder.getCompanyId();
	}

	/**
	* Sets the company ID of this dossier folder.
	*
	* @param companyId the company ID of this dossier folder
	*/
	@Override
	public void setCompanyId(long companyId) {
		_dossierFolder.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this dossier folder.
	*
	* @return the create date of this dossier folder
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _dossierFolder.getCreateDate();
	}

	/**
	* Sets the create date of this dossier folder.
	*
	* @param createDate the create date of this dossier folder
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_dossierFolder.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this dossier folder.
	*
	* @return the modified date of this dossier folder
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dossierFolder.getModifiedDate();
	}

	/**
	* Sets the modified date of this dossier folder.
	*
	* @param modifiedDate the modified date of this dossier folder
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dossierFolder.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the folder name of this dossier folder.
	*
	* @return the folder name of this dossier folder
	*/
	@Override
	public java.lang.String getFolderName() {
		return _dossierFolder.getFolderName();
	}

	/**
	* Sets the folder name of this dossier folder.
	*
	* @param folderName the folder name of this dossier folder
	*/
	@Override
	public void setFolderName(java.lang.String folderName) {
		_dossierFolder.setFolderName(folderName);
	}

	/**
	* Returns the parent folder ID of this dossier folder.
	*
	* @return the parent folder ID of this dossier folder
	*/
	@Override
	public long getParentFolderId() {
		return _dossierFolder.getParentFolderId();
	}

	/**
	* Sets the parent folder ID of this dossier folder.
	*
	* @param parentFolderId the parent folder ID of this dossier folder
	*/
	@Override
	public void setParentFolderId(long parentFolderId) {
		_dossierFolder.setParentFolderId(parentFolderId);
	}

	/**
	* Returns the sequence no of this dossier folder.
	*
	* @return the sequence no of this dossier folder
	*/
	@Override
	public int getSequenceNo() {
		return _dossierFolder.getSequenceNo();
	}

	/**
	* Sets the sequence no of this dossier folder.
	*
	* @param sequenceNo the sequence no of this dossier folder
	*/
	@Override
	public void setSequenceNo(int sequenceNo) {
		_dossierFolder.setSequenceNo(sequenceNo);
	}

	/**
	* Returns the procedure filter of this dossier folder.
	*
	* @return the procedure filter of this dossier folder
	*/
	@Override
	public java.lang.String getProcedureFilter() {
		return _dossierFolder.getProcedureFilter();
	}

	/**
	* Sets the procedure filter of this dossier folder.
	*
	* @param procedureFilter the procedure filter of this dossier folder
	*/
	@Override
	public void setProcedureFilter(java.lang.String procedureFilter) {
		_dossierFolder.setProcedureFilter(procedureFilter);
	}

	/**
	* Returns the status filter of this dossier folder.
	*
	* @return the status filter of this dossier folder
	*/
	@Override
	public java.lang.String getStatusFilter() {
		return _dossierFolder.getStatusFilter();
	}

	/**
	* Sets the status filter of this dossier folder.
	*
	* @param statusFilter the status filter of this dossier folder
	*/
	@Override
	public void setStatusFilter(java.lang.String statusFilter) {
		_dossierFolder.setStatusFilter(statusFilter);
	}

	/**
	* Returns the filter by organization of this dossier folder.
	*
	* @return the filter by organization of this dossier folder
	*/
	@Override
	public int getFilterByOrganization() {
		return _dossierFolder.getFilterByOrganization();
	}

	/**
	* Sets the filter by organization of this dossier folder.
	*
	* @param filterByOrganization the filter by organization of this dossier folder
	*/
	@Override
	public void setFilterByOrganization(int filterByOrganization) {
		_dossierFolder.setFilterByOrganization(filterByOrganization);
	}

	/**
	* Returns the filter by user of this dossier folder.
	*
	* @return the filter by user of this dossier folder
	*/
	@Override
	public int getFilterByUser() {
		return _dossierFolder.getFilterByUser();
	}

	/**
	* Sets the filter by user of this dossier folder.
	*
	* @param filterByUser the filter by user of this dossier folder
	*/
	@Override
	public void setFilterByUser(int filterByUser) {
		_dossierFolder.setFilterByUser(filterByUser);
	}

	@Override
	public boolean isNew() {
		return _dossierFolder.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dossierFolder.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dossierFolder.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dossierFolder.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dossierFolder.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dossierFolder.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dossierFolder.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dossierFolder.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dossierFolder.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dossierFolder.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dossierFolder.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DossierFolderWrapper((DossierFolder)_dossierFolder.clone());
	}

	@Override
	public int compareTo(DossierFolder dossierFolder) {
		return _dossierFolder.compareTo(dossierFolder);
	}

	@Override
	public int hashCode() {
		return _dossierFolder.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<DossierFolder> toCacheModel() {
		return _dossierFolder.toCacheModel();
	}

	@Override
	public DossierFolder toEscapedModel() {
		return new DossierFolderWrapper(_dossierFolder.toEscapedModel());
	}

	@Override
	public DossierFolder toUnescapedModel() {
		return new DossierFolderWrapper(_dossierFolder.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dossierFolder.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dossierFolder.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dossierFolder.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DossierFolderWrapper)) {
			return false;
		}

		DossierFolderWrapper dossierFolderWrapper = (DossierFolderWrapper)obj;

		if (Validator.equals(_dossierFolder, dossierFolderWrapper._dossierFolder)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _dossierFolder.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DossierFolder getWrappedDossierFolder() {
		return _dossierFolder;
	}

	@Override
	public DossierFolder getWrappedModel() {
		return _dossierFolder;
	}

	@Override
	public void resetOriginalValues() {
		_dossierFolder.resetOriginalValues();
	}

	private DossierFolder _dossierFolder;
}