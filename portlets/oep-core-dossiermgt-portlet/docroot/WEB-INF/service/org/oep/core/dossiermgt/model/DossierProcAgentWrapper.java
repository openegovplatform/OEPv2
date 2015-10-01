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
 * This class is a wrapper for {@link DossierProcAgent}.
 * </p>
 *
 * @author trungdk
 * @see DossierProcAgent
 * @generated
 */
public class DossierProcAgentWrapper implements DossierProcAgent,
	ModelWrapper<DossierProcAgent> {
	public DossierProcAgentWrapper(DossierProcAgent dossierProcAgent) {
		_dossierProcAgent = dossierProcAgent;
	}

	@Override
	public Class<?> getModelClass() {
		return DossierProcAgent.class;
	}

	@Override
	public String getModelClassName() {
		return DossierProcAgent.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dossierProcAgentId", getDossierProcAgentId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dossierProcId", getDossierProcId());
		attributes.put("govAgentId", getGovAgentId());
		attributes.put("govAgentName", getGovAgentName());
		attributes.put("ebPartnerShipId", getEbPartnerShipId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dossierProcAgentId = (Long)attributes.get("dossierProcAgentId");

		if (dossierProcAgentId != null) {
			setDossierProcAgentId(dossierProcAgentId);
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

		String govAgentId = (String)attributes.get("govAgentId");

		if (govAgentId != null) {
			setGovAgentId(govAgentId);
		}

		String govAgentName = (String)attributes.get("govAgentName");

		if (govAgentName != null) {
			setGovAgentName(govAgentName);
		}

		Long ebPartnerShipId = (Long)attributes.get("ebPartnerShipId");

		if (ebPartnerShipId != null) {
			setEbPartnerShipId(ebPartnerShipId);
		}
	}

	/**
	* Returns the primary key of this dossier proc agent.
	*
	* @return the primary key of this dossier proc agent
	*/
	@Override
	public long getPrimaryKey() {
		return _dossierProcAgent.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dossier proc agent.
	*
	* @param primaryKey the primary key of this dossier proc agent
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dossierProcAgent.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the dossier proc agent ID of this dossier proc agent.
	*
	* @return the dossier proc agent ID of this dossier proc agent
	*/
	@Override
	public long getDossierProcAgentId() {
		return _dossierProcAgent.getDossierProcAgentId();
	}

	/**
	* Sets the dossier proc agent ID of this dossier proc agent.
	*
	* @param dossierProcAgentId the dossier proc agent ID of this dossier proc agent
	*/
	@Override
	public void setDossierProcAgentId(long dossierProcAgentId) {
		_dossierProcAgent.setDossierProcAgentId(dossierProcAgentId);
	}

	/**
	* Returns the company ID of this dossier proc agent.
	*
	* @return the company ID of this dossier proc agent
	*/
	@Override
	public long getCompanyId() {
		return _dossierProcAgent.getCompanyId();
	}

	/**
	* Sets the company ID of this dossier proc agent.
	*
	* @param companyId the company ID of this dossier proc agent
	*/
	@Override
	public void setCompanyId(long companyId) {
		_dossierProcAgent.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this dossier proc agent.
	*
	* @return the create date of this dossier proc agent
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _dossierProcAgent.getCreateDate();
	}

	/**
	* Sets the create date of this dossier proc agent.
	*
	* @param createDate the create date of this dossier proc agent
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_dossierProcAgent.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this dossier proc agent.
	*
	* @return the modified date of this dossier proc agent
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dossierProcAgent.getModifiedDate();
	}

	/**
	* Sets the modified date of this dossier proc agent.
	*
	* @param modifiedDate the modified date of this dossier proc agent
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dossierProcAgent.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the dossier proc ID of this dossier proc agent.
	*
	* @return the dossier proc ID of this dossier proc agent
	*/
	@Override
	public long getDossierProcId() {
		return _dossierProcAgent.getDossierProcId();
	}

	/**
	* Sets the dossier proc ID of this dossier proc agent.
	*
	* @param dossierProcId the dossier proc ID of this dossier proc agent
	*/
	@Override
	public void setDossierProcId(long dossierProcId) {
		_dossierProcAgent.setDossierProcId(dossierProcId);
	}

	/**
	* Returns the gov agent ID of this dossier proc agent.
	*
	* @return the gov agent ID of this dossier proc agent
	*/
	@Override
	public java.lang.String getGovAgentId() {
		return _dossierProcAgent.getGovAgentId();
	}

	/**
	* Sets the gov agent ID of this dossier proc agent.
	*
	* @param govAgentId the gov agent ID of this dossier proc agent
	*/
	@Override
	public void setGovAgentId(java.lang.String govAgentId) {
		_dossierProcAgent.setGovAgentId(govAgentId);
	}

	/**
	* Returns the gov agent name of this dossier proc agent.
	*
	* @return the gov agent name of this dossier proc agent
	*/
	@Override
	public java.lang.String getGovAgentName() {
		return _dossierProcAgent.getGovAgentName();
	}

	/**
	* Sets the gov agent name of this dossier proc agent.
	*
	* @param govAgentName the gov agent name of this dossier proc agent
	*/
	@Override
	public void setGovAgentName(java.lang.String govAgentName) {
		_dossierProcAgent.setGovAgentName(govAgentName);
	}

	/**
	* Returns the eb partner ship ID of this dossier proc agent.
	*
	* @return the eb partner ship ID of this dossier proc agent
	*/
	@Override
	public long getEbPartnerShipId() {
		return _dossierProcAgent.getEbPartnerShipId();
	}

	/**
	* Sets the eb partner ship ID of this dossier proc agent.
	*
	* @param ebPartnerShipId the eb partner ship ID of this dossier proc agent
	*/
	@Override
	public void setEbPartnerShipId(long ebPartnerShipId) {
		_dossierProcAgent.setEbPartnerShipId(ebPartnerShipId);
	}

	@Override
	public boolean isNew() {
		return _dossierProcAgent.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dossierProcAgent.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dossierProcAgent.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dossierProcAgent.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dossierProcAgent.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dossierProcAgent.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dossierProcAgent.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dossierProcAgent.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dossierProcAgent.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dossierProcAgent.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dossierProcAgent.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DossierProcAgentWrapper((DossierProcAgent)_dossierProcAgent.clone());
	}

	@Override
	public int compareTo(
		org.oep.core.dossiermgt.model.DossierProcAgent dossierProcAgent) {
		return _dossierProcAgent.compareTo(dossierProcAgent);
	}

	@Override
	public int hashCode() {
		return _dossierProcAgent.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.core.dossiermgt.model.DossierProcAgent> toCacheModel() {
		return _dossierProcAgent.toCacheModel();
	}

	@Override
	public org.oep.core.dossiermgt.model.DossierProcAgent toEscapedModel() {
		return new DossierProcAgentWrapper(_dossierProcAgent.toEscapedModel());
	}

	@Override
	public org.oep.core.dossiermgt.model.DossierProcAgent toUnescapedModel() {
		return new DossierProcAgentWrapper(_dossierProcAgent.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dossierProcAgent.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dossierProcAgent.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dossierProcAgent.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DossierProcAgentWrapper)) {
			return false;
		}

		DossierProcAgentWrapper dossierProcAgentWrapper = (DossierProcAgentWrapper)obj;

		if (Validator.equals(_dossierProcAgent,
					dossierProcAgentWrapper._dossierProcAgent)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DossierProcAgent getWrappedDossierProcAgent() {
		return _dossierProcAgent;
	}

	@Override
	public DossierProcAgent getWrappedModel() {
		return _dossierProcAgent;
	}

	@Override
	public void resetOriginalValues() {
		_dossierProcAgent.resetOriginalValues();
	}

	private DossierProcAgent _dossierProcAgent;
}