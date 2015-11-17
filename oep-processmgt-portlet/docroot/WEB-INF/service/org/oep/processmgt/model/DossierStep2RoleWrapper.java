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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DossierStep2Role}.
 * </p>
 *
 * @author trungdk
 * @see DossierStep2Role
 * @generated
 */
public class DossierStep2RoleWrapper implements DossierStep2Role,
	ModelWrapper<DossierStep2Role> {
	public DossierStep2RoleWrapper(DossierStep2Role dossierStep2Role) {
		_dossierStep2Role = dossierStep2Role;
	}

	@Override
	public Class<?> getModelClass() {
		return DossierStep2Role.class;
	}

	@Override
	public String getModelClassName() {
		return DossierStep2Role.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dossierStepId", getDossierStepId());
		attributes.put("roleId", getRoleId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dossierStepId = (Long)attributes.get("dossierStepId");

		if (dossierStepId != null) {
			setDossierStepId(dossierStepId);
		}

		Long roleId = (Long)attributes.get("roleId");

		if (roleId != null) {
			setRoleId(roleId);
		}
	}

	/**
	* Returns the primary key of this dossier step2 role.
	*
	* @return the primary key of this dossier step2 role
	*/
	@Override
	public org.oep.processmgt.service.persistence.DossierStep2RolePK getPrimaryKey() {
		return _dossierStep2Role.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dossier step2 role.
	*
	* @param primaryKey the primary key of this dossier step2 role
	*/
	@Override
	public void setPrimaryKey(
		org.oep.processmgt.service.persistence.DossierStep2RolePK primaryKey) {
		_dossierStep2Role.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the dossier step ID of this dossier step2 role.
	*
	* @return the dossier step ID of this dossier step2 role
	*/
	@Override
	public long getDossierStepId() {
		return _dossierStep2Role.getDossierStepId();
	}

	/**
	* Sets the dossier step ID of this dossier step2 role.
	*
	* @param dossierStepId the dossier step ID of this dossier step2 role
	*/
	@Override
	public void setDossierStepId(long dossierStepId) {
		_dossierStep2Role.setDossierStepId(dossierStepId);
	}

	/**
	* Returns the role ID of this dossier step2 role.
	*
	* @return the role ID of this dossier step2 role
	*/
	@Override
	public long getRoleId() {
		return _dossierStep2Role.getRoleId();
	}

	/**
	* Sets the role ID of this dossier step2 role.
	*
	* @param roleId the role ID of this dossier step2 role
	*/
	@Override
	public void setRoleId(long roleId) {
		_dossierStep2Role.setRoleId(roleId);
	}

	@Override
	public boolean isNew() {
		return _dossierStep2Role.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dossierStep2Role.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dossierStep2Role.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dossierStep2Role.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dossierStep2Role.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dossierStep2Role.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dossierStep2Role.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dossierStep2Role.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dossierStep2Role.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dossierStep2Role.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dossierStep2Role.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DossierStep2RoleWrapper((DossierStep2Role)_dossierStep2Role.clone());
	}

	@Override
	public int compareTo(
		org.oep.processmgt.model.DossierStep2Role dossierStep2Role) {
		return _dossierStep2Role.compareTo(dossierStep2Role);
	}

	@Override
	public int hashCode() {
		return _dossierStep2Role.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.processmgt.model.DossierStep2Role> toCacheModel() {
		return _dossierStep2Role.toCacheModel();
	}

	@Override
	public org.oep.processmgt.model.DossierStep2Role toEscapedModel() {
		return new DossierStep2RoleWrapper(_dossierStep2Role.toEscapedModel());
	}

	@Override
	public org.oep.processmgt.model.DossierStep2Role toUnescapedModel() {
		return new DossierStep2RoleWrapper(_dossierStep2Role.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dossierStep2Role.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dossierStep2Role.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dossierStep2Role.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DossierStep2RoleWrapper)) {
			return false;
		}

		DossierStep2RoleWrapper dossierStep2RoleWrapper = (DossierStep2RoleWrapper)obj;

		if (Validator.equals(_dossierStep2Role,
					dossierStep2RoleWrapper._dossierStep2Role)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DossierStep2Role getWrappedDossierStep2Role() {
		return _dossierStep2Role;
	}

	@Override
	public DossierStep2Role getWrappedModel() {
		return _dossierStep2Role;
	}

	@Override
	public void resetOriginalValues() {
		_dossierStep2Role.resetOriginalValues();
	}

	private DossierStep2Role _dossierStep2Role;
}