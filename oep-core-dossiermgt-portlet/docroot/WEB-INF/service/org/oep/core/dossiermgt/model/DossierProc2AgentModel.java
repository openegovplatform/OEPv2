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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the DossierProc2Agent service. Represents a row in the &quot;oep_dossiermgt_DossierProc2Agent&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.core.dossiermgt.model.impl.DossierProc2AgentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.core.dossiermgt.model.impl.DossierProc2AgentImpl}.
 * </p>
 *
 * @author trungdk
 * @see DossierProc2Agent
 * @see org.oep.core.dossiermgt.model.impl.DossierProc2AgentImpl
 * @see org.oep.core.dossiermgt.model.impl.DossierProc2AgentModelImpl
 * @generated
 */
public interface DossierProc2AgentModel extends BaseModel<DossierProc2Agent> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dossier proc2 agent model instance should use the {@link DossierProc2Agent} interface instead.
	 */

	/**
	 * Returns the primary key of this dossier proc2 agent.
	 *
	 * @return the primary key of this dossier proc2 agent
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this dossier proc2 agent.
	 *
	 * @param primaryKey the primary key of this dossier proc2 agent
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this dossier proc2 agent.
	 *
	 * @return the ID of this dossier proc2 agent
	 */
	public long getId();

	/**
	 * Sets the ID of this dossier proc2 agent.
	 *
	 * @param id the ID of this dossier proc2 agent
	 */
	public void setId(long id);

	/**
	 * Returns the company ID of this dossier proc2 agent.
	 *
	 * @return the company ID of this dossier proc2 agent
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this dossier proc2 agent.
	 *
	 * @param companyId the company ID of this dossier proc2 agent
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the dossier proc ID of this dossier proc2 agent.
	 *
	 * @return the dossier proc ID of this dossier proc2 agent
	 */
	public long getDossierProcId();

	/**
	 * Sets the dossier proc ID of this dossier proc2 agent.
	 *
	 * @param dossierProcId the dossier proc ID of this dossier proc2 agent
	 */
	public void setDossierProcId(long dossierProcId);

	/**
	 * Returns the gov agent no of this dossier proc2 agent.
	 *
	 * @return the gov agent no of this dossier proc2 agent
	 */
	@AutoEscape
	public String getGovAgentNo();

	/**
	 * Sets the gov agent no of this dossier proc2 agent.
	 *
	 * @param govAgentNo the gov agent no of this dossier proc2 agent
	 */
	public void setGovAgentNo(String govAgentNo);

	/**
	 * Returns the gov agent name of this dossier proc2 agent.
	 *
	 * @return the gov agent name of this dossier proc2 agent
	 */
	@AutoEscape
	public String getGovAgentName();

	/**
	 * Sets the gov agent name of this dossier proc2 agent.
	 *
	 * @param govAgentName the gov agent name of this dossier proc2 agent
	 */
	public void setGovAgentName(String govAgentName);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(DossierProc2Agent dossierProc2Agent);

	@Override
	public int hashCode();

	@Override
	public CacheModel<DossierProc2Agent> toCacheModel();

	@Override
	public DossierProc2Agent toEscapedModel();

	@Override
	public DossierProc2Agent toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}