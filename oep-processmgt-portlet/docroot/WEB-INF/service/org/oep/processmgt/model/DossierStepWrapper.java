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
 * This class is a wrapper for {@link DossierStep}.
 * </p>
 *
 * @author trungdk
 * @see DossierStep
 * @generated
 */
public class DossierStepWrapper implements DossierStep,
	ModelWrapper<DossierStep> {
	public DossierStepWrapper(DossierStep dossierStep) {
		_dossierStep = dossierStep;
	}

	@Override
	public Class<?> getModelClass() {
		return DossierStep.class;
	}

	@Override
	public String getModelClassName() {
		return DossierStep.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dossierStepId", getDossierStepId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dossierProcessId", getDossierProcessId());
		attributes.put("title", getTitle());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("daysDuration", getDaysDuration());
		attributes.put("doForm", getDoForm());
		attributes.put("formLabel", getFormLabel());
		attributes.put("rollback", getRollback());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dossierStepId = (Long)attributes.get("dossierStepId");

		if (dossierStepId != null) {
			setDossierStepId(dossierStepId);
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

		Long dossierProcessId = (Long)attributes.get("dossierProcessId");

		if (dossierProcessId != null) {
			setDossierProcessId(dossierProcessId);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		Integer sequenceNo = (Integer)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		Integer daysDuration = (Integer)attributes.get("daysDuration");

		if (daysDuration != null) {
			setDaysDuration(daysDuration);
		}

		String doForm = (String)attributes.get("doForm");

		if (doForm != null) {
			setDoForm(doForm);
		}

		String formLabel = (String)attributes.get("formLabel");

		if (formLabel != null) {
			setFormLabel(formLabel);
		}

		Integer rollback = (Integer)attributes.get("rollback");

		if (rollback != null) {
			setRollback(rollback);
		}
	}

	/**
	* Returns the primary key of this dossier step.
	*
	* @return the primary key of this dossier step
	*/
	@Override
	public long getPrimaryKey() {
		return _dossierStep.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dossier step.
	*
	* @param primaryKey the primary key of this dossier step
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dossierStep.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the dossier step ID of this dossier step.
	*
	* @return the dossier step ID of this dossier step
	*/
	@Override
	public long getDossierStepId() {
		return _dossierStep.getDossierStepId();
	}

	/**
	* Sets the dossier step ID of this dossier step.
	*
	* @param dossierStepId the dossier step ID of this dossier step
	*/
	@Override
	public void setDossierStepId(long dossierStepId) {
		_dossierStep.setDossierStepId(dossierStepId);
	}

	/**
	* Returns the user ID of this dossier step.
	*
	* @return the user ID of this dossier step
	*/
	@Override
	public long getUserId() {
		return _dossierStep.getUserId();
	}

	/**
	* Sets the user ID of this dossier step.
	*
	* @param userId the user ID of this dossier step
	*/
	@Override
	public void setUserId(long userId) {
		_dossierStep.setUserId(userId);
	}

	/**
	* Returns the user uuid of this dossier step.
	*
	* @return the user uuid of this dossier step
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierStep.getUserUuid();
	}

	/**
	* Sets the user uuid of this dossier step.
	*
	* @param userUuid the user uuid of this dossier step
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_dossierStep.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this dossier step.
	*
	* @return the group ID of this dossier step
	*/
	@Override
	public long getGroupId() {
		return _dossierStep.getGroupId();
	}

	/**
	* Sets the group ID of this dossier step.
	*
	* @param groupId the group ID of this dossier step
	*/
	@Override
	public void setGroupId(long groupId) {
		_dossierStep.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this dossier step.
	*
	* @return the company ID of this dossier step
	*/
	@Override
	public long getCompanyId() {
		return _dossierStep.getCompanyId();
	}

	/**
	* Sets the company ID of this dossier step.
	*
	* @param companyId the company ID of this dossier step
	*/
	@Override
	public void setCompanyId(long companyId) {
		_dossierStep.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this dossier step.
	*
	* @return the create date of this dossier step
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _dossierStep.getCreateDate();
	}

	/**
	* Sets the create date of this dossier step.
	*
	* @param createDate the create date of this dossier step
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_dossierStep.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this dossier step.
	*
	* @return the modified date of this dossier step
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dossierStep.getModifiedDate();
	}

	/**
	* Sets the modified date of this dossier step.
	*
	* @param modifiedDate the modified date of this dossier step
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dossierStep.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the dossier process ID of this dossier step.
	*
	* @return the dossier process ID of this dossier step
	*/
	@Override
	public long getDossierProcessId() {
		return _dossierStep.getDossierProcessId();
	}

	/**
	* Sets the dossier process ID of this dossier step.
	*
	* @param dossierProcessId the dossier process ID of this dossier step
	*/
	@Override
	public void setDossierProcessId(long dossierProcessId) {
		_dossierStep.setDossierProcessId(dossierProcessId);
	}

	/**
	* Returns the title of this dossier step.
	*
	* @return the title of this dossier step
	*/
	@Override
	public java.lang.String getTitle() {
		return _dossierStep.getTitle();
	}

	/**
	* Sets the title of this dossier step.
	*
	* @param title the title of this dossier step
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_dossierStep.setTitle(title);
	}

	/**
	* Returns the sequence no of this dossier step.
	*
	* @return the sequence no of this dossier step
	*/
	@Override
	public int getSequenceNo() {
		return _dossierStep.getSequenceNo();
	}

	/**
	* Sets the sequence no of this dossier step.
	*
	* @param sequenceNo the sequence no of this dossier step
	*/
	@Override
	public void setSequenceNo(int sequenceNo) {
		_dossierStep.setSequenceNo(sequenceNo);
	}

	/**
	* Returns the days duration of this dossier step.
	*
	* @return the days duration of this dossier step
	*/
	@Override
	public int getDaysDuration() {
		return _dossierStep.getDaysDuration();
	}

	/**
	* Sets the days duration of this dossier step.
	*
	* @param daysDuration the days duration of this dossier step
	*/
	@Override
	public void setDaysDuration(int daysDuration) {
		_dossierStep.setDaysDuration(daysDuration);
	}

	/**
	* Returns the do form of this dossier step.
	*
	* @return the do form of this dossier step
	*/
	@Override
	public java.lang.String getDoForm() {
		return _dossierStep.getDoForm();
	}

	/**
	* Sets the do form of this dossier step.
	*
	* @param doForm the do form of this dossier step
	*/
	@Override
	public void setDoForm(java.lang.String doForm) {
		_dossierStep.setDoForm(doForm);
	}

	/**
	* Returns the form label of this dossier step.
	*
	* @return the form label of this dossier step
	*/
	@Override
	public java.lang.String getFormLabel() {
		return _dossierStep.getFormLabel();
	}

	/**
	* Sets the form label of this dossier step.
	*
	* @param formLabel the form label of this dossier step
	*/
	@Override
	public void setFormLabel(java.lang.String formLabel) {
		_dossierStep.setFormLabel(formLabel);
	}

	/**
	* Returns the rollback of this dossier step.
	*
	* @return the rollback of this dossier step
	*/
	@Override
	public int getRollback() {
		return _dossierStep.getRollback();
	}

	/**
	* Sets the rollback of this dossier step.
	*
	* @param rollback the rollback of this dossier step
	*/
	@Override
	public void setRollback(int rollback) {
		_dossierStep.setRollback(rollback);
	}

	@Override
	public boolean isNew() {
		return _dossierStep.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dossierStep.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dossierStep.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dossierStep.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dossierStep.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dossierStep.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dossierStep.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dossierStep.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dossierStep.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dossierStep.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dossierStep.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DossierStepWrapper((DossierStep)_dossierStep.clone());
	}

	@Override
	public int compareTo(org.oep.processmgt.model.DossierStep dossierStep) {
		return _dossierStep.compareTo(dossierStep);
	}

	@Override
	public int hashCode() {
		return _dossierStep.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.processmgt.model.DossierStep> toCacheModel() {
		return _dossierStep.toCacheModel();
	}

	@Override
	public org.oep.processmgt.model.DossierStep toEscapedModel() {
		return new DossierStepWrapper(_dossierStep.toEscapedModel());
	}

	@Override
	public org.oep.processmgt.model.DossierStep toUnescapedModel() {
		return new DossierStepWrapper(_dossierStep.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dossierStep.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dossierStep.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dossierStep.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DossierStepWrapper)) {
			return false;
		}

		DossierStepWrapper dossierStepWrapper = (DossierStepWrapper)obj;

		if (Validator.equals(_dossierStep, dossierStepWrapper._dossierStep)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DossierStep getWrappedDossierStep() {
		return _dossierStep;
	}

	@Override
	public DossierStep getWrappedModel() {
		return _dossierStep;
	}

	@Override
	public void resetOriginalValues() {
		_dossierStep.resetOriginalValues();
	}

	private DossierStep _dossierStep;
}