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

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the DossierStep2Role service. Represents a row in the &quot;oep_processmgt_DossierStep2Role&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.core.processmgt.model.impl.DossierStep2RoleModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.core.processmgt.model.impl.DossierStep2RoleImpl}.
 * </p>
 *
 * @author trungdk
 * @see DossierStep2Role
 * @see org.oep.core.processmgt.model.impl.DossierStep2RoleImpl
 * @see org.oep.core.processmgt.model.impl.DossierStep2RoleModelImpl
 * @generated
 */
public interface DossierStep2RoleModel extends BaseModel<DossierStep2Role> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dossier step2 role model instance should use the {@link DossierStep2Role} interface instead.
	 */

	/**
	 * Returns the primary key of this dossier step2 role.
	 *
	 * @return the primary key of this dossier step2 role
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this dossier step2 role.
	 *
	 * @param primaryKey the primary key of this dossier step2 role
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this dossier step2 role.
	 *
	 * @return the ID of this dossier step2 role
	 */
	public long getId();

	/**
	 * Sets the ID of this dossier step2 role.
	 *
	 * @param id the ID of this dossier step2 role
	 */
	public void setId(long id);

	/**
	 * Returns the company ID of this dossier step2 role.
	 *
	 * @return the company ID of this dossier step2 role
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this dossier step2 role.
	 *
	 * @param companyId the company ID of this dossier step2 role
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the dossier step ID of this dossier step2 role.
	 *
	 * @return the dossier step ID of this dossier step2 role
	 */
	public long getDossierStepId();

	/**
	 * Sets the dossier step ID of this dossier step2 role.
	 *
	 * @param dossierStepId the dossier step ID of this dossier step2 role
	 */
	public void setDossierStepId(long dossierStepId);

	/**
	 * Returns the role ID of this dossier step2 role.
	 *
	 * @return the role ID of this dossier step2 role
	 */
	public long getRoleId();

	/**
	 * Sets the role ID of this dossier step2 role.
	 *
	 * @param roleId the role ID of this dossier step2 role
	 */
	public void setRoleId(long roleId);

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
	public int compareTo(DossierStep2Role dossierStep2Role);

	@Override
	public int hashCode();

	@Override
	public CacheModel<DossierStep2Role> toCacheModel();

	@Override
	public DossierStep2Role toEscapedModel();

	@Override
	public DossierStep2Role toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}