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
 * This class is a wrapper for {@link DossierDoc}.
 * </p>
 *
 * @author trungdk
 * @see DossierDoc
 * @generated
 */
public class DossierDocWrapper implements DossierDoc, ModelWrapper<DossierDoc> {
	public DossierDocWrapper(DossierDoc dossierDoc) {
		_dossierDoc = dossierDoc;
	}

	@Override
	public Class<?> getModelClass() {
		return DossierDoc.class;
	}

	@Override
	public String getModelClassName() {
		return DossierDoc.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dossierDocId", getDossierDocId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dossierProcId", getDossierProcId());
		attributes.put("dossierDocNo", getDossierDocNo());
		attributes.put("dossierDocName", getDossierDocName());
		attributes.put("note", getNote());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("defaultDocTemplateId", getDefaultDocTemplateId());
		attributes.put("validationType", getValidationType());
		attributes.put("requirementType", getRequirementType());
		attributes.put("numberOfFile", getNumberOfFile());
		attributes.put("splitSubDossier", getSplitSubDossier());
		attributes.put("onlineForm", getOnlineForm());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dossierDocId = (Long)attributes.get("dossierDocId");

		if (dossierDocId != null) {
			setDossierDocId(dossierDocId);
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

		Long dossierProcId = (Long)attributes.get("dossierProcId");

		if (dossierProcId != null) {
			setDossierProcId(dossierProcId);
		}

		String dossierDocNo = (String)attributes.get("dossierDocNo");

		if (dossierDocNo != null) {
			setDossierDocNo(dossierDocNo);
		}

		String dossierDocName = (String)attributes.get("dossierDocName");

		if (dossierDocName != null) {
			setDossierDocName(dossierDocName);
		}

		String note = (String)attributes.get("note");

		if (note != null) {
			setNote(note);
		}

		Integer sequenceNo = (Integer)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		Long defaultDocTemplateId = (Long)attributes.get("defaultDocTemplateId");

		if (defaultDocTemplateId != null) {
			setDefaultDocTemplateId(defaultDocTemplateId);
		}

		Integer validationType = (Integer)attributes.get("validationType");

		if (validationType != null) {
			setValidationType(validationType);
		}

		Integer requirementType = (Integer)attributes.get("requirementType");

		if (requirementType != null) {
			setRequirementType(requirementType);
		}

		Integer numberOfFile = (Integer)attributes.get("numberOfFile");

		if (numberOfFile != null) {
			setNumberOfFile(numberOfFile);
		}

		Integer splitSubDossier = (Integer)attributes.get("splitSubDossier");

		if (splitSubDossier != null) {
			setSplitSubDossier(splitSubDossier);
		}

		String onlineForm = (String)attributes.get("onlineForm");

		if (onlineForm != null) {
			setOnlineForm(onlineForm);
		}
	}

	/**
	* Returns the primary key of this dossier doc.
	*
	* @return the primary key of this dossier doc
	*/
	@Override
	public long getPrimaryKey() {
		return _dossierDoc.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dossier doc.
	*
	* @param primaryKey the primary key of this dossier doc
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dossierDoc.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the dossier doc ID of this dossier doc.
	*
	* @return the dossier doc ID of this dossier doc
	*/
	@Override
	public long getDossierDocId() {
		return _dossierDoc.getDossierDocId();
	}

	/**
	* Sets the dossier doc ID of this dossier doc.
	*
	* @param dossierDocId the dossier doc ID of this dossier doc
	*/
	@Override
	public void setDossierDocId(long dossierDocId) {
		_dossierDoc.setDossierDocId(dossierDocId);
	}

	/**
	* Returns the user ID of this dossier doc.
	*
	* @return the user ID of this dossier doc
	*/
	@Override
	public long getUserId() {
		return _dossierDoc.getUserId();
	}

	/**
	* Sets the user ID of this dossier doc.
	*
	* @param userId the user ID of this dossier doc
	*/
	@Override
	public void setUserId(long userId) {
		_dossierDoc.setUserId(userId);
	}

	/**
	* Returns the user uuid of this dossier doc.
	*
	* @return the user uuid of this dossier doc
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierDoc.getUserUuid();
	}

	/**
	* Sets the user uuid of this dossier doc.
	*
	* @param userUuid the user uuid of this dossier doc
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_dossierDoc.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this dossier doc.
	*
	* @return the group ID of this dossier doc
	*/
	@Override
	public long getGroupId() {
		return _dossierDoc.getGroupId();
	}

	/**
	* Sets the group ID of this dossier doc.
	*
	* @param groupId the group ID of this dossier doc
	*/
	@Override
	public void setGroupId(long groupId) {
		_dossierDoc.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this dossier doc.
	*
	* @return the company ID of this dossier doc
	*/
	@Override
	public long getCompanyId() {
		return _dossierDoc.getCompanyId();
	}

	/**
	* Sets the company ID of this dossier doc.
	*
	* @param companyId the company ID of this dossier doc
	*/
	@Override
	public void setCompanyId(long companyId) {
		_dossierDoc.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this dossier doc.
	*
	* @return the create date of this dossier doc
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _dossierDoc.getCreateDate();
	}

	/**
	* Sets the create date of this dossier doc.
	*
	* @param createDate the create date of this dossier doc
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_dossierDoc.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this dossier doc.
	*
	* @return the modified date of this dossier doc
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dossierDoc.getModifiedDate();
	}

	/**
	* Sets the modified date of this dossier doc.
	*
	* @param modifiedDate the modified date of this dossier doc
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dossierDoc.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the dossier proc ID of this dossier doc.
	*
	* @return the dossier proc ID of this dossier doc
	*/
	@Override
	public long getDossierProcId() {
		return _dossierDoc.getDossierProcId();
	}

	/**
	* Sets the dossier proc ID of this dossier doc.
	*
	* @param dossierProcId the dossier proc ID of this dossier doc
	*/
	@Override
	public void setDossierProcId(long dossierProcId) {
		_dossierDoc.setDossierProcId(dossierProcId);
	}

	/**
	* Returns the dossier doc no of this dossier doc.
	*
	* @return the dossier doc no of this dossier doc
	*/
	@Override
	public java.lang.String getDossierDocNo() {
		return _dossierDoc.getDossierDocNo();
	}

	/**
	* Sets the dossier doc no of this dossier doc.
	*
	* @param dossierDocNo the dossier doc no of this dossier doc
	*/
	@Override
	public void setDossierDocNo(java.lang.String dossierDocNo) {
		_dossierDoc.setDossierDocNo(dossierDocNo);
	}

	/**
	* Returns the dossier doc name of this dossier doc.
	*
	* @return the dossier doc name of this dossier doc
	*/
	@Override
	public java.lang.String getDossierDocName() {
		return _dossierDoc.getDossierDocName();
	}

	/**
	* Sets the dossier doc name of this dossier doc.
	*
	* @param dossierDocName the dossier doc name of this dossier doc
	*/
	@Override
	public void setDossierDocName(java.lang.String dossierDocName) {
		_dossierDoc.setDossierDocName(dossierDocName);
	}

	/**
	* Returns the note of this dossier doc.
	*
	* @return the note of this dossier doc
	*/
	@Override
	public java.lang.String getNote() {
		return _dossierDoc.getNote();
	}

	/**
	* Sets the note of this dossier doc.
	*
	* @param note the note of this dossier doc
	*/
	@Override
	public void setNote(java.lang.String note) {
		_dossierDoc.setNote(note);
	}

	/**
	* Returns the sequence no of this dossier doc.
	*
	* @return the sequence no of this dossier doc
	*/
	@Override
	public int getSequenceNo() {
		return _dossierDoc.getSequenceNo();
	}

	/**
	* Sets the sequence no of this dossier doc.
	*
	* @param sequenceNo the sequence no of this dossier doc
	*/
	@Override
	public void setSequenceNo(int sequenceNo) {
		_dossierDoc.setSequenceNo(sequenceNo);
	}

	/**
	* Returns the default doc template ID of this dossier doc.
	*
	* @return the default doc template ID of this dossier doc
	*/
	@Override
	public long getDefaultDocTemplateId() {
		return _dossierDoc.getDefaultDocTemplateId();
	}

	/**
	* Sets the default doc template ID of this dossier doc.
	*
	* @param defaultDocTemplateId the default doc template ID of this dossier doc
	*/
	@Override
	public void setDefaultDocTemplateId(long defaultDocTemplateId) {
		_dossierDoc.setDefaultDocTemplateId(defaultDocTemplateId);
	}

	/**
	* Returns the validation type of this dossier doc.
	*
	* @return the validation type of this dossier doc
	*/
	@Override
	public int getValidationType() {
		return _dossierDoc.getValidationType();
	}

	/**
	* Sets the validation type of this dossier doc.
	*
	* @param validationType the validation type of this dossier doc
	*/
	@Override
	public void setValidationType(int validationType) {
		_dossierDoc.setValidationType(validationType);
	}

	/**
	* Returns the requirement type of this dossier doc.
	*
	* @return the requirement type of this dossier doc
	*/
	@Override
	public int getRequirementType() {
		return _dossierDoc.getRequirementType();
	}

	/**
	* Sets the requirement type of this dossier doc.
	*
	* @param requirementType the requirement type of this dossier doc
	*/
	@Override
	public void setRequirementType(int requirementType) {
		_dossierDoc.setRequirementType(requirementType);
	}

	/**
	* Returns the number of file of this dossier doc.
	*
	* @return the number of file of this dossier doc
	*/
	@Override
	public int getNumberOfFile() {
		return _dossierDoc.getNumberOfFile();
	}

	/**
	* Sets the number of file of this dossier doc.
	*
	* @param numberOfFile the number of file of this dossier doc
	*/
	@Override
	public void setNumberOfFile(int numberOfFile) {
		_dossierDoc.setNumberOfFile(numberOfFile);
	}

	/**
	* Returns the split sub dossier of this dossier doc.
	*
	* @return the split sub dossier of this dossier doc
	*/
	@Override
	public int getSplitSubDossier() {
		return _dossierDoc.getSplitSubDossier();
	}

	/**
	* Sets the split sub dossier of this dossier doc.
	*
	* @param splitSubDossier the split sub dossier of this dossier doc
	*/
	@Override
	public void setSplitSubDossier(int splitSubDossier) {
		_dossierDoc.setSplitSubDossier(splitSubDossier);
	}

	/**
	* Returns the online form of this dossier doc.
	*
	* @return the online form of this dossier doc
	*/
	@Override
	public java.lang.String getOnlineForm() {
		return _dossierDoc.getOnlineForm();
	}

	/**
	* Sets the online form of this dossier doc.
	*
	* @param onlineForm the online form of this dossier doc
	*/
	@Override
	public void setOnlineForm(java.lang.String onlineForm) {
		_dossierDoc.setOnlineForm(onlineForm);
	}

	@Override
	public boolean isNew() {
		return _dossierDoc.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dossierDoc.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dossierDoc.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dossierDoc.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dossierDoc.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dossierDoc.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dossierDoc.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dossierDoc.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dossierDoc.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dossierDoc.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dossierDoc.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DossierDocWrapper((DossierDoc)_dossierDoc.clone());
	}

	@Override
	public int compareTo(org.oep.core.dossiermgt.model.DossierDoc dossierDoc) {
		return _dossierDoc.compareTo(dossierDoc);
	}

	@Override
	public int hashCode() {
		return _dossierDoc.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.core.dossiermgt.model.DossierDoc> toCacheModel() {
		return _dossierDoc.toCacheModel();
	}

	@Override
	public org.oep.core.dossiermgt.model.DossierDoc toEscapedModel() {
		return new DossierDocWrapper(_dossierDoc.toEscapedModel());
	}

	@Override
	public org.oep.core.dossiermgt.model.DossierDoc toUnescapedModel() {
		return new DossierDocWrapper(_dossierDoc.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dossierDoc.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dossierDoc.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dossierDoc.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DossierDocWrapper)) {
			return false;
		}

		DossierDocWrapper dossierDocWrapper = (DossierDocWrapper)obj;

		if (Validator.equals(_dossierDoc, dossierDocWrapper._dossierDoc)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DossierDoc getWrappedDossierDoc() {
		return _dossierDoc;
	}

	@Override
	public DossierDoc getWrappedModel() {
		return _dossierDoc;
	}

	@Override
	public void resetOriginalValues() {
		_dossierDoc.resetOriginalValues();
	}

	private DossierDoc _dossierDoc;
}