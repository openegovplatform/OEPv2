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
 * This class is a wrapper for {@link DossierProc}.
 * </p>
 *
 * @author trungdk
 * @see DossierProc
 * @generated
 */
public class DossierProcWrapper implements DossierProc,
	ModelWrapper<DossierProc> {
	public DossierProcWrapper(DossierProc dossierProc) {
		_dossierProc = dossierProc;
	}

	@Override
	public Class<?> getModelClass() {
		return DossierProc.class;
	}

	@Override
	public String getModelClassName() {
		return DossierProc.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dossierProcId", getDossierProcId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dossierProcNo", getDossierProcNo());
		attributes.put("name", getName());
		attributes.put("enName", getEnName());
		attributes.put("shortName", getShortName());
		attributes.put("processDescription", getProcessDescription());
		attributes.put("methodDescription", getMethodDescription());
		attributes.put("dossierDescription", getDossierDescription());
		attributes.put("conditionDescription", getConditionDescription());
		attributes.put("durationDescription", getDurationDescription());
		attributes.put("actorsDescription", getActorsDescription());
		attributes.put("resultsDescription", getResultsDescription());
		attributes.put("recordsDescription", getRecordsDescription());
		attributes.put("feeDescription", getFeeDescription());
		attributes.put("instructionsDescription", getInstructionsDescription());
		attributes.put("administrationNo", getAdministrationNo());
		attributes.put("administrationName", getAdministrationName());
		attributes.put("domainNo", getDomainNo());
		attributes.put("domainName", getDomainName());
		attributes.put("forCitizen", getForCitizen());
		attributes.put("forBusiness", getForBusiness());
		attributes.put("effectDate", getEffectDate());
		attributes.put("expireDate", getExpireDate());
		attributes.put("statusActive", getStatusActive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dossierProcId = (Long)attributes.get("dossierProcId");

		if (dossierProcId != null) {
			setDossierProcId(dossierProcId);
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

		String dossierProcNo = (String)attributes.get("dossierProcNo");

		if (dossierProcNo != null) {
			setDossierProcNo(dossierProcNo);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String enName = (String)attributes.get("enName");

		if (enName != null) {
			setEnName(enName);
		}

		String shortName = (String)attributes.get("shortName");

		if (shortName != null) {
			setShortName(shortName);
		}

		String processDescription = (String)attributes.get("processDescription");

		if (processDescription != null) {
			setProcessDescription(processDescription);
		}

		String methodDescription = (String)attributes.get("methodDescription");

		if (methodDescription != null) {
			setMethodDescription(methodDescription);
		}

		String dossierDescription = (String)attributes.get("dossierDescription");

		if (dossierDescription != null) {
			setDossierDescription(dossierDescription);
		}

		String conditionDescription = (String)attributes.get(
				"conditionDescription");

		if (conditionDescription != null) {
			setConditionDescription(conditionDescription);
		}

		String durationDescription = (String)attributes.get(
				"durationDescription");

		if (durationDescription != null) {
			setDurationDescription(durationDescription);
		}

		String actorsDescription = (String)attributes.get("actorsDescription");

		if (actorsDescription != null) {
			setActorsDescription(actorsDescription);
		}

		String resultsDescription = (String)attributes.get("resultsDescription");

		if (resultsDescription != null) {
			setResultsDescription(resultsDescription);
		}

		String recordsDescription = (String)attributes.get("recordsDescription");

		if (recordsDescription != null) {
			setRecordsDescription(recordsDescription);
		}

		String feeDescription = (String)attributes.get("feeDescription");

		if (feeDescription != null) {
			setFeeDescription(feeDescription);
		}

		String instructionsDescription = (String)attributes.get(
				"instructionsDescription");

		if (instructionsDescription != null) {
			setInstructionsDescription(instructionsDescription);
		}

		String administrationNo = (String)attributes.get("administrationNo");

		if (administrationNo != null) {
			setAdministrationNo(administrationNo);
		}

		String administrationName = (String)attributes.get("administrationName");

		if (administrationName != null) {
			setAdministrationName(administrationName);
		}

		String domainNo = (String)attributes.get("domainNo");

		if (domainNo != null) {
			setDomainNo(domainNo);
		}

		String domainName = (String)attributes.get("domainName");

		if (domainName != null) {
			setDomainName(domainName);
		}

		Integer forCitizen = (Integer)attributes.get("forCitizen");

		if (forCitizen != null) {
			setForCitizen(forCitizen);
		}

		Integer forBusiness = (Integer)attributes.get("forBusiness");

		if (forBusiness != null) {
			setForBusiness(forBusiness);
		}

		Date effectDate = (Date)attributes.get("effectDate");

		if (effectDate != null) {
			setEffectDate(effectDate);
		}

		Date expireDate = (Date)attributes.get("expireDate");

		if (expireDate != null) {
			setExpireDate(expireDate);
		}

		Integer statusActive = (Integer)attributes.get("statusActive");

		if (statusActive != null) {
			setStatusActive(statusActive);
		}
	}

	/**
	* Returns the primary key of this dossier proc.
	*
	* @return the primary key of this dossier proc
	*/
	@Override
	public long getPrimaryKey() {
		return _dossierProc.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dossier proc.
	*
	* @param primaryKey the primary key of this dossier proc
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dossierProc.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the dossier proc ID of this dossier proc.
	*
	* @return the dossier proc ID of this dossier proc
	*/
	@Override
	public long getDossierProcId() {
		return _dossierProc.getDossierProcId();
	}

	/**
	* Sets the dossier proc ID of this dossier proc.
	*
	* @param dossierProcId the dossier proc ID of this dossier proc
	*/
	@Override
	public void setDossierProcId(long dossierProcId) {
		_dossierProc.setDossierProcId(dossierProcId);
	}

	/**
	* Returns the user ID of this dossier proc.
	*
	* @return the user ID of this dossier proc
	*/
	@Override
	public long getUserId() {
		return _dossierProc.getUserId();
	}

	/**
	* Sets the user ID of this dossier proc.
	*
	* @param userId the user ID of this dossier proc
	*/
	@Override
	public void setUserId(long userId) {
		_dossierProc.setUserId(userId);
	}

	/**
	* Returns the user uuid of this dossier proc.
	*
	* @return the user uuid of this dossier proc
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProc.getUserUuid();
	}

	/**
	* Sets the user uuid of this dossier proc.
	*
	* @param userUuid the user uuid of this dossier proc
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_dossierProc.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this dossier proc.
	*
	* @return the group ID of this dossier proc
	*/
	@Override
	public long getGroupId() {
		return _dossierProc.getGroupId();
	}

	/**
	* Sets the group ID of this dossier proc.
	*
	* @param groupId the group ID of this dossier proc
	*/
	@Override
	public void setGroupId(long groupId) {
		_dossierProc.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this dossier proc.
	*
	* @return the company ID of this dossier proc
	*/
	@Override
	public long getCompanyId() {
		return _dossierProc.getCompanyId();
	}

	/**
	* Sets the company ID of this dossier proc.
	*
	* @param companyId the company ID of this dossier proc
	*/
	@Override
	public void setCompanyId(long companyId) {
		_dossierProc.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this dossier proc.
	*
	* @return the create date of this dossier proc
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _dossierProc.getCreateDate();
	}

	/**
	* Sets the create date of this dossier proc.
	*
	* @param createDate the create date of this dossier proc
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_dossierProc.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this dossier proc.
	*
	* @return the modified date of this dossier proc
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dossierProc.getModifiedDate();
	}

	/**
	* Sets the modified date of this dossier proc.
	*
	* @param modifiedDate the modified date of this dossier proc
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dossierProc.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the dossier proc no of this dossier proc.
	*
	* @return the dossier proc no of this dossier proc
	*/
	@Override
	public java.lang.String getDossierProcNo() {
		return _dossierProc.getDossierProcNo();
	}

	/**
	* Sets the dossier proc no of this dossier proc.
	*
	* @param dossierProcNo the dossier proc no of this dossier proc
	*/
	@Override
	public void setDossierProcNo(java.lang.String dossierProcNo) {
		_dossierProc.setDossierProcNo(dossierProcNo);
	}

	/**
	* Returns the name of this dossier proc.
	*
	* @return the name of this dossier proc
	*/
	@Override
	public java.lang.String getName() {
		return _dossierProc.getName();
	}

	/**
	* Sets the name of this dossier proc.
	*
	* @param name the name of this dossier proc
	*/
	@Override
	public void setName(java.lang.String name) {
		_dossierProc.setName(name);
	}

	/**
	* Returns the en name of this dossier proc.
	*
	* @return the en name of this dossier proc
	*/
	@Override
	public java.lang.String getEnName() {
		return _dossierProc.getEnName();
	}

	/**
	* Sets the en name of this dossier proc.
	*
	* @param enName the en name of this dossier proc
	*/
	@Override
	public void setEnName(java.lang.String enName) {
		_dossierProc.setEnName(enName);
	}

	/**
	* Returns the short name of this dossier proc.
	*
	* @return the short name of this dossier proc
	*/
	@Override
	public java.lang.String getShortName() {
		return _dossierProc.getShortName();
	}

	/**
	* Sets the short name of this dossier proc.
	*
	* @param shortName the short name of this dossier proc
	*/
	@Override
	public void setShortName(java.lang.String shortName) {
		_dossierProc.setShortName(shortName);
	}

	/**
	* Returns the process description of this dossier proc.
	*
	* @return the process description of this dossier proc
	*/
	@Override
	public java.lang.String getProcessDescription() {
		return _dossierProc.getProcessDescription();
	}

	/**
	* Sets the process description of this dossier proc.
	*
	* @param processDescription the process description of this dossier proc
	*/
	@Override
	public void setProcessDescription(java.lang.String processDescription) {
		_dossierProc.setProcessDescription(processDescription);
	}

	/**
	* Returns the method description of this dossier proc.
	*
	* @return the method description of this dossier proc
	*/
	@Override
	public java.lang.String getMethodDescription() {
		return _dossierProc.getMethodDescription();
	}

	/**
	* Sets the method description of this dossier proc.
	*
	* @param methodDescription the method description of this dossier proc
	*/
	@Override
	public void setMethodDescription(java.lang.String methodDescription) {
		_dossierProc.setMethodDescription(methodDescription);
	}

	/**
	* Returns the dossier description of this dossier proc.
	*
	* @return the dossier description of this dossier proc
	*/
	@Override
	public java.lang.String getDossierDescription() {
		return _dossierProc.getDossierDescription();
	}

	/**
	* Sets the dossier description of this dossier proc.
	*
	* @param dossierDescription the dossier description of this dossier proc
	*/
	@Override
	public void setDossierDescription(java.lang.String dossierDescription) {
		_dossierProc.setDossierDescription(dossierDescription);
	}

	/**
	* Returns the condition description of this dossier proc.
	*
	* @return the condition description of this dossier proc
	*/
	@Override
	public java.lang.String getConditionDescription() {
		return _dossierProc.getConditionDescription();
	}

	/**
	* Sets the condition description of this dossier proc.
	*
	* @param conditionDescription the condition description of this dossier proc
	*/
	@Override
	public void setConditionDescription(java.lang.String conditionDescription) {
		_dossierProc.setConditionDescription(conditionDescription);
	}

	/**
	* Returns the duration description of this dossier proc.
	*
	* @return the duration description of this dossier proc
	*/
	@Override
	public java.lang.String getDurationDescription() {
		return _dossierProc.getDurationDescription();
	}

	/**
	* Sets the duration description of this dossier proc.
	*
	* @param durationDescription the duration description of this dossier proc
	*/
	@Override
	public void setDurationDescription(java.lang.String durationDescription) {
		_dossierProc.setDurationDescription(durationDescription);
	}

	/**
	* Returns the actors description of this dossier proc.
	*
	* @return the actors description of this dossier proc
	*/
	@Override
	public java.lang.String getActorsDescription() {
		return _dossierProc.getActorsDescription();
	}

	/**
	* Sets the actors description of this dossier proc.
	*
	* @param actorsDescription the actors description of this dossier proc
	*/
	@Override
	public void setActorsDescription(java.lang.String actorsDescription) {
		_dossierProc.setActorsDescription(actorsDescription);
	}

	/**
	* Returns the results description of this dossier proc.
	*
	* @return the results description of this dossier proc
	*/
	@Override
	public java.lang.String getResultsDescription() {
		return _dossierProc.getResultsDescription();
	}

	/**
	* Sets the results description of this dossier proc.
	*
	* @param resultsDescription the results description of this dossier proc
	*/
	@Override
	public void setResultsDescription(java.lang.String resultsDescription) {
		_dossierProc.setResultsDescription(resultsDescription);
	}

	/**
	* Returns the records description of this dossier proc.
	*
	* @return the records description of this dossier proc
	*/
	@Override
	public java.lang.String getRecordsDescription() {
		return _dossierProc.getRecordsDescription();
	}

	/**
	* Sets the records description of this dossier proc.
	*
	* @param recordsDescription the records description of this dossier proc
	*/
	@Override
	public void setRecordsDescription(java.lang.String recordsDescription) {
		_dossierProc.setRecordsDescription(recordsDescription);
	}

	/**
	* Returns the fee description of this dossier proc.
	*
	* @return the fee description of this dossier proc
	*/
	@Override
	public java.lang.String getFeeDescription() {
		return _dossierProc.getFeeDescription();
	}

	/**
	* Sets the fee description of this dossier proc.
	*
	* @param feeDescription the fee description of this dossier proc
	*/
	@Override
	public void setFeeDescription(java.lang.String feeDescription) {
		_dossierProc.setFeeDescription(feeDescription);
	}

	/**
	* Returns the instructions description of this dossier proc.
	*
	* @return the instructions description of this dossier proc
	*/
	@Override
	public java.lang.String getInstructionsDescription() {
		return _dossierProc.getInstructionsDescription();
	}

	/**
	* Sets the instructions description of this dossier proc.
	*
	* @param instructionsDescription the instructions description of this dossier proc
	*/
	@Override
	public void setInstructionsDescription(
		java.lang.String instructionsDescription) {
		_dossierProc.setInstructionsDescription(instructionsDescription);
	}

	/**
	* Returns the administration no of this dossier proc.
	*
	* @return the administration no of this dossier proc
	*/
	@Override
	public java.lang.String getAdministrationNo() {
		return _dossierProc.getAdministrationNo();
	}

	/**
	* Sets the administration no of this dossier proc.
	*
	* @param administrationNo the administration no of this dossier proc
	*/
	@Override
	public void setAdministrationNo(java.lang.String administrationNo) {
		_dossierProc.setAdministrationNo(administrationNo);
	}

	/**
	* Returns the administration name of this dossier proc.
	*
	* @return the administration name of this dossier proc
	*/
	@Override
	public java.lang.String getAdministrationName() {
		return _dossierProc.getAdministrationName();
	}

	/**
	* Sets the administration name of this dossier proc.
	*
	* @param administrationName the administration name of this dossier proc
	*/
	@Override
	public void setAdministrationName(java.lang.String administrationName) {
		_dossierProc.setAdministrationName(administrationName);
	}

	/**
	* Returns the domain no of this dossier proc.
	*
	* @return the domain no of this dossier proc
	*/
	@Override
	public java.lang.String getDomainNo() {
		return _dossierProc.getDomainNo();
	}

	/**
	* Sets the domain no of this dossier proc.
	*
	* @param domainNo the domain no of this dossier proc
	*/
	@Override
	public void setDomainNo(java.lang.String domainNo) {
		_dossierProc.setDomainNo(domainNo);
	}

	/**
	* Returns the domain name of this dossier proc.
	*
	* @return the domain name of this dossier proc
	*/
	@Override
	public java.lang.String getDomainName() {
		return _dossierProc.getDomainName();
	}

	/**
	* Sets the domain name of this dossier proc.
	*
	* @param domainName the domain name of this dossier proc
	*/
	@Override
	public void setDomainName(java.lang.String domainName) {
		_dossierProc.setDomainName(domainName);
	}

	/**
	* Returns the for citizen of this dossier proc.
	*
	* @return the for citizen of this dossier proc
	*/
	@Override
	public int getForCitizen() {
		return _dossierProc.getForCitizen();
	}

	/**
	* Sets the for citizen of this dossier proc.
	*
	* @param forCitizen the for citizen of this dossier proc
	*/
	@Override
	public void setForCitizen(int forCitizen) {
		_dossierProc.setForCitizen(forCitizen);
	}

	/**
	* Returns the for business of this dossier proc.
	*
	* @return the for business of this dossier proc
	*/
	@Override
	public int getForBusiness() {
		return _dossierProc.getForBusiness();
	}

	/**
	* Sets the for business of this dossier proc.
	*
	* @param forBusiness the for business of this dossier proc
	*/
	@Override
	public void setForBusiness(int forBusiness) {
		_dossierProc.setForBusiness(forBusiness);
	}

	/**
	* Returns the effect date of this dossier proc.
	*
	* @return the effect date of this dossier proc
	*/
	@Override
	public java.util.Date getEffectDate() {
		return _dossierProc.getEffectDate();
	}

	/**
	* Sets the effect date of this dossier proc.
	*
	* @param effectDate the effect date of this dossier proc
	*/
	@Override
	public void setEffectDate(java.util.Date effectDate) {
		_dossierProc.setEffectDate(effectDate);
	}

	/**
	* Returns the expire date of this dossier proc.
	*
	* @return the expire date of this dossier proc
	*/
	@Override
	public java.util.Date getExpireDate() {
		return _dossierProc.getExpireDate();
	}

	/**
	* Sets the expire date of this dossier proc.
	*
	* @param expireDate the expire date of this dossier proc
	*/
	@Override
	public void setExpireDate(java.util.Date expireDate) {
		_dossierProc.setExpireDate(expireDate);
	}

	/**
	* Returns the status active of this dossier proc.
	*
	* @return the status active of this dossier proc
	*/
	@Override
	public int getStatusActive() {
		return _dossierProc.getStatusActive();
	}

	/**
	* Sets the status active of this dossier proc.
	*
	* @param statusActive the status active of this dossier proc
	*/
	@Override
	public void setStatusActive(int statusActive) {
		_dossierProc.setStatusActive(statusActive);
	}

	@Override
	public boolean isNew() {
		return _dossierProc.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dossierProc.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dossierProc.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dossierProc.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dossierProc.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dossierProc.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dossierProc.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dossierProc.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dossierProc.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dossierProc.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dossierProc.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DossierProcWrapper((DossierProc)_dossierProc.clone());
	}

	@Override
	public int compareTo(org.oep.dossiermgt.model.DossierProc dossierProc) {
		return _dossierProc.compareTo(dossierProc);
	}

	@Override
	public int hashCode() {
		return _dossierProc.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.dossiermgt.model.DossierProc> toCacheModel() {
		return _dossierProc.toCacheModel();
	}

	@Override
	public org.oep.dossiermgt.model.DossierProc toEscapedModel() {
		return new DossierProcWrapper(_dossierProc.toEscapedModel());
	}

	@Override
	public org.oep.dossiermgt.model.DossierProc toUnescapedModel() {
		return new DossierProcWrapper(_dossierProc.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dossierProc.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dossierProc.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dossierProc.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DossierProcWrapper)) {
			return false;
		}

		DossierProcWrapper dossierProcWrapper = (DossierProcWrapper)obj;

		if (Validator.equals(_dossierProc, dossierProcWrapper._dossierProc)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DossierProc getWrappedDossierProc() {
		return _dossierProc;
	}

	@Override
	public DossierProc getWrappedModel() {
		return _dossierProc;
	}

	@Override
	public void resetOriginalValues() {
		_dossierProc.resetOriginalValues();
	}

	private DossierProc _dossierProc;
}