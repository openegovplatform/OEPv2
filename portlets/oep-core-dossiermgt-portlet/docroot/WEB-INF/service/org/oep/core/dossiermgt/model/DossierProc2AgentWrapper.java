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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DossierProc2Agent}.
 * </p>
 *
 * @author trungdk
 * @see DossierProc2Agent
 * @generated
 */
public class DossierProc2AgentWrapper implements DossierProc2Agent,
	ModelWrapper<DossierProc2Agent> {
	public DossierProc2AgentWrapper(DossierProc2Agent dossierProc2Agent) {
		_dossierProc2Agent = dossierProc2Agent;
	}

	@Override
	public Class<?> getModelClass() {
		return DossierProc2Agent.class;
	}

	@Override
	public String getModelClassName() {
		return DossierProc2Agent.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("companyId", getCompanyId());
		attributes.put("dossierProcId", getDossierProcId());
		attributes.put("govAgentNo", getGovAgentNo());
		attributes.put("govAgentName", getGovAgentName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
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
	}

	/**
	* Returns the primary key of this dossier proc2 agent.
	*
	* @return the primary key of this dossier proc2 agent
	*/
	@Override
	public long getPrimaryKey() {
		return _dossierProc2Agent.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dossier proc2 agent.
	*
	* @param primaryKey the primary key of this dossier proc2 agent
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dossierProc2Agent.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dossier proc2 agent.
	*
	* @return the ID of this dossier proc2 agent
	*/
	@Override
	public long getId() {
		return _dossierProc2Agent.getId();
	}

	/**
	* Sets the ID of this dossier proc2 agent.
	*
	* @param id the ID of this dossier proc2 agent
	*/
	@Override
	public void setId(long id) {
		_dossierProc2Agent.setId(id);
	}

	/**
	* Returns the company ID of this dossier proc2 agent.
	*
	* @return the company ID of this dossier proc2 agent
	*/
	@Override
	public long getCompanyId() {
		return _dossierProc2Agent.getCompanyId();
	}

	/**
	* Sets the company ID of this dossier proc2 agent.
	*
	* @param companyId the company ID of this dossier proc2 agent
	*/
	@Override
	public void setCompanyId(long companyId) {
		_dossierProc2Agent.setCompanyId(companyId);
	}

	/**
	* Returns the dossier proc ID of this dossier proc2 agent.
	*
	* @return the dossier proc ID of this dossier proc2 agent
	*/
	@Override
	public long getDossierProcId() {
		return _dossierProc2Agent.getDossierProcId();
	}

	/**
	* Sets the dossier proc ID of this dossier proc2 agent.
	*
	* @param dossierProcId the dossier proc ID of this dossier proc2 agent
	*/
	@Override
	public void setDossierProcId(long dossierProcId) {
		_dossierProc2Agent.setDossierProcId(dossierProcId);
	}

	/**
	* Returns the gov agent no of this dossier proc2 agent.
	*
	* @return the gov agent no of this dossier proc2 agent
	*/
	@Override
	public java.lang.String getGovAgentNo() {
		return _dossierProc2Agent.getGovAgentNo();
	}

	/**
	* Sets the gov agent no of this dossier proc2 agent.
	*
	* @param govAgentNo the gov agent no of this dossier proc2 agent
	*/
	@Override
	public void setGovAgentNo(java.lang.String govAgentNo) {
		_dossierProc2Agent.setGovAgentNo(govAgentNo);
	}

	/**
	* Returns the gov agent name of this dossier proc2 agent.
	*
	* @return the gov agent name of this dossier proc2 agent
	*/
	@Override
	public java.lang.String getGovAgentName() {
		return _dossierProc2Agent.getGovAgentName();
	}

	/**
	* Sets the gov agent name of this dossier proc2 agent.
	*
	* @param govAgentName the gov agent name of this dossier proc2 agent
	*/
	@Override
	public void setGovAgentName(java.lang.String govAgentName) {
		_dossierProc2Agent.setGovAgentName(govAgentName);
	}

	@Override
	public boolean isNew() {
		return _dossierProc2Agent.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dossierProc2Agent.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dossierProc2Agent.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dossierProc2Agent.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dossierProc2Agent.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dossierProc2Agent.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dossierProc2Agent.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dossierProc2Agent.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dossierProc2Agent.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dossierProc2Agent.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dossierProc2Agent.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DossierProc2AgentWrapper((DossierProc2Agent)_dossierProc2Agent.clone());
	}

	@Override
	public int compareTo(DossierProc2Agent dossierProc2Agent) {
		return _dossierProc2Agent.compareTo(dossierProc2Agent);
	}

	@Override
	public int hashCode() {
		return _dossierProc2Agent.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<DossierProc2Agent> toCacheModel() {
		return _dossierProc2Agent.toCacheModel();
	}

	@Override
	public DossierProc2Agent toEscapedModel() {
		return new DossierProc2AgentWrapper(_dossierProc2Agent.toEscapedModel());
	}

	@Override
	public DossierProc2Agent toUnescapedModel() {
		return new DossierProc2AgentWrapper(_dossierProc2Agent.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dossierProc2Agent.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dossierProc2Agent.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dossierProc2Agent.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DossierProc2AgentWrapper)) {
			return false;
		}

		DossierProc2AgentWrapper dossierProc2AgentWrapper = (DossierProc2AgentWrapper)obj;

		if (Validator.equals(_dossierProc2Agent,
					dossierProc2AgentWrapper._dossierProc2Agent)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DossierProc2Agent getWrappedDossierProc2Agent() {
		return _dossierProc2Agent;
	}

	@Override
	public DossierProc2Agent getWrappedModel() {
		return _dossierProc2Agent;
	}

	@Override
	public void resetOriginalValues() {
		_dossierProc2Agent.resetOriginalValues();
	}

	private DossierProc2Agent _dossierProc2Agent;
}