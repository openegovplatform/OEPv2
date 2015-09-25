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

package org.oep.core.processmgt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DossierProcess}.
 * </p>
 *
 * @author trungdk
 * @see DossierProcess
 * @generated
 */
public class DossierProcessWrapper implements DossierProcess,
	ModelWrapper<DossierProcess> {
	public DossierProcessWrapper(DossierProcess dossierProcess) {
		_dossierProcess = dossierProcess;
	}

	@Override
	public Class<?> getModelClass() {
		return DossierProcess.class;
	}

	@Override
	public String getModelClassName() {
		return DossierProcess.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dossierProcessId", getDossierProcessId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dossierProcId", getDossierProcId());
		attributes.put("govAgentNo", getGovAgentNo());
		attributes.put("govAgentName", getGovAgentName());
		attributes.put("startDossierStepId", getStartDossierStepId());
		attributes.put("daysDuration", getDaysDuration());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dossierProcessId = (Long)attributes.get("dossierProcessId");

		if (dossierProcessId != null) {
			setDossierProcessId(dossierProcessId);
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

		String govAgentNo = (String)attributes.get("govAgentNo");

		if (govAgentNo != null) {
			setGovAgentNo(govAgentNo);
		}

		String govAgentName = (String)attributes.get("govAgentName");

		if (govAgentName != null) {
			setGovAgentName(govAgentName);
		}

		Long startDossierStepId = (Long)attributes.get("startDossierStepId");

		if (startDossierStepId != null) {
			setStartDossierStepId(startDossierStepId);
		}

		Integer daysDuration = (Integer)attributes.get("daysDuration");

		if (daysDuration != null) {
			setDaysDuration(daysDuration);
		}
	}

	/**
	* Returns the primary key of this dossier process.
	*
	* @return the primary key of this dossier process
	*/
	@Override
	public long getPrimaryKey() {
		return _dossierProcess.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dossier process.
	*
	* @param primaryKey the primary key of this dossier process
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dossierProcess.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the dossier process ID of this dossier process.
	*
	* @return the dossier process ID of this dossier process
	*/
	@Override
	public long getDossierProcessId() {
		return _dossierProcess.getDossierProcessId();
	}

	/**
	* Sets the dossier process ID of this dossier process.
	*
	* @param dossierProcessId the dossier process ID of this dossier process
	*/
	@Override
	public void setDossierProcessId(long dossierProcessId) {
		_dossierProcess.setDossierProcessId(dossierProcessId);
	}

	/**
	* Returns the user ID of this dossier process.
	*
	* @return the user ID of this dossier process
	*/
	@Override
	public long getUserId() {
		return _dossierProcess.getUserId();
	}

	/**
	* Sets the user ID of this dossier process.
	*
	* @param userId the user ID of this dossier process
	*/
	@Override
	public void setUserId(long userId) {
		_dossierProcess.setUserId(userId);
	}

	/**
	* Returns the user uuid of this dossier process.
	*
	* @return the user uuid of this dossier process
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcess.getUserUuid();
	}

	/**
	* Sets the user uuid of this dossier process.
	*
	* @param userUuid the user uuid of this dossier process
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_dossierProcess.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this dossier process.
	*
	* @return the group ID of this dossier process
	*/
	@Override
	public long getGroupId() {
		return _dossierProcess.getGroupId();
	}

	/**
	* Sets the group ID of this dossier process.
	*
	* @param groupId the group ID of this dossier process
	*/
	@Override
	public void setGroupId(long groupId) {
		_dossierProcess.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this dossier process.
	*
	* @return the company ID of this dossier process
	*/
	@Override
	public long getCompanyId() {
		return _dossierProcess.getCompanyId();
	}

	/**
	* Sets the company ID of this dossier process.
	*
	* @param companyId the company ID of this dossier process
	*/
	@Override
	public void setCompanyId(long companyId) {
		_dossierProcess.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this dossier process.
	*
	* @return the create date of this dossier process
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _dossierProcess.getCreateDate();
	}

	/**
	* Sets the create date of this dossier process.
	*
	* @param createDate the create date of this dossier process
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_dossierProcess.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this dossier process.
	*
	* @return the modified date of this dossier process
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dossierProcess.getModifiedDate();
	}

	/**
	* Sets the modified date of this dossier process.
	*
	* @param modifiedDate the modified date of this dossier process
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dossierProcess.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the dossier proc ID of this dossier process.
	*
	* @return the dossier proc ID of this dossier process
	*/
	@Override
	public long getDossierProcId() {
		return _dossierProcess.getDossierProcId();
	}

	/**
	* Sets the dossier proc ID of this dossier process.
	*
	* @param dossierProcId the dossier proc ID of this dossier process
	*/
	@Override
	public void setDossierProcId(long dossierProcId) {
		_dossierProcess.setDossierProcId(dossierProcId);
	}

	/**
	* Returns the gov agent no of this dossier process.
	*
	* @return the gov agent no of this dossier process
	*/
	@Override
	public java.lang.String getGovAgentNo() {
		return _dossierProcess.getGovAgentNo();
	}

	/**
	* Sets the gov agent no of this dossier process.
	*
	* @param govAgentNo the gov agent no of this dossier process
	*/
	@Override
	public void setGovAgentNo(java.lang.String govAgentNo) {
		_dossierProcess.setGovAgentNo(govAgentNo);
	}

	/**
	* Returns the gov agent name of this dossier process.
	*
	* @return the gov agent name of this dossier process
	*/
	@Override
	public java.lang.String getGovAgentName() {
		return _dossierProcess.getGovAgentName();
	}

	/**
	* Sets the gov agent name of this dossier process.
	*
	* @param govAgentName the gov agent name of this dossier process
	*/
	@Override
	public void setGovAgentName(java.lang.String govAgentName) {
		_dossierProcess.setGovAgentName(govAgentName);
	}

	/**
	* Returns the start dossier step ID of this dossier process.
	*
	* @return the start dossier step ID of this dossier process
	*/
	@Override
	public long getStartDossierStepId() {
		return _dossierProcess.getStartDossierStepId();
	}

	/**
	* Sets the start dossier step ID of this dossier process.
	*
	* @param startDossierStepId the start dossier step ID of this dossier process
	*/
	@Override
	public void setStartDossierStepId(long startDossierStepId) {
		_dossierProcess.setStartDossierStepId(startDossierStepId);
	}

	/**
	* Returns the days duration of this dossier process.
	*
	* @return the days duration of this dossier process
	*/
	@Override
	public int getDaysDuration() {
		return _dossierProcess.getDaysDuration();
	}

	/**
	* Sets the days duration of this dossier process.
	*
	* @param daysDuration the days duration of this dossier process
	*/
	@Override
	public void setDaysDuration(int daysDuration) {
		_dossierProcess.setDaysDuration(daysDuration);
	}

	@Override
	public boolean isNew() {
		return _dossierProcess.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dossierProcess.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dossierProcess.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dossierProcess.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dossierProcess.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dossierProcess.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dossierProcess.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dossierProcess.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dossierProcess.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dossierProcess.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dossierProcess.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DossierProcessWrapper((DossierProcess)_dossierProcess.clone());
	}

	@Override
	public int compareTo(
		org.oep.core.processmgt.model.DossierProcess dossierProcess) {
		return _dossierProcess.compareTo(dossierProcess);
	}

	@Override
	public int hashCode() {
		return _dossierProcess.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.core.processmgt.model.DossierProcess> toCacheModel() {
		return _dossierProcess.toCacheModel();
	}

	@Override
	public org.oep.core.processmgt.model.DossierProcess toEscapedModel() {
		return new DossierProcessWrapper(_dossierProcess.toEscapedModel());
	}

	@Override
	public org.oep.core.processmgt.model.DossierProcess toUnescapedModel() {
		return new DossierProcessWrapper(_dossierProcess.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dossierProcess.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dossierProcess.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dossierProcess.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DossierProcessWrapper)) {
			return false;
		}

		DossierProcessWrapper dossierProcessWrapper = (DossierProcessWrapper)obj;

		if (Validator.equals(_dossierProcess,
					dossierProcessWrapper._dossierProcess)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DossierProcess getWrappedDossierProcess() {
		return _dossierProcess;
	}

	@Override
	public DossierProcess getWrappedModel() {
		return _dossierProcess;
	}

	@Override
	public void resetOriginalValues() {
		_dossierProcess.resetOriginalValues();
	}

	private DossierProcess _dossierProcess;
}