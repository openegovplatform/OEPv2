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
 * This class is a wrapper for {@link DossierProc2Role}.
 * </p>
 *
 * @author trungdk
 * @see DossierProc2Role
 * @generated
 */
public class DossierProc2RoleWrapper implements DossierProc2Role,
	ModelWrapper<DossierProc2Role> {
	public DossierProc2RoleWrapper(DossierProc2Role dossierProc2Role) {
		_dossierProc2Role = dossierProc2Role;
	}

	@Override
	public Class<?> getModelClass() {
		return DossierProc2Role.class;
	}

	@Override
	public String getModelClassName() {
		return DossierProc2Role.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dossierProc2RoleId", getDossierProc2RoleId());
		attributes.put("dossierProcId", getDossierProcId());
		attributes.put("roleId", getRoleId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dossierProc2RoleId = (Long)attributes.get("dossierProc2RoleId");

		if (dossierProc2RoleId != null) {
			setDossierProc2RoleId(dossierProc2RoleId);
		}

		Long dossierProcId = (Long)attributes.get("dossierProcId");

		if (dossierProcId != null) {
			setDossierProcId(dossierProcId);
		}

		Long roleId = (Long)attributes.get("roleId");

		if (roleId != null) {
			setRoleId(roleId);
		}
	}

	/**
	* Returns the primary key of this dossier proc2 role.
	*
	* @return the primary key of this dossier proc2 role
	*/
	@Override
	public long getPrimaryKey() {
		return _dossierProc2Role.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dossier proc2 role.
	*
	* @param primaryKey the primary key of this dossier proc2 role
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dossierProc2Role.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the dossier proc2 role ID of this dossier proc2 role.
	*
	* @return the dossier proc2 role ID of this dossier proc2 role
	*/
	@Override
	public long getDossierProc2RoleId() {
		return _dossierProc2Role.getDossierProc2RoleId();
	}

	/**
	* Sets the dossier proc2 role ID of this dossier proc2 role.
	*
	* @param dossierProc2RoleId the dossier proc2 role ID of this dossier proc2 role
	*/
	@Override
	public void setDossierProc2RoleId(long dossierProc2RoleId) {
		_dossierProc2Role.setDossierProc2RoleId(dossierProc2RoleId);
	}

	/**
	* Returns the dossier proc ID of this dossier proc2 role.
	*
	* @return the dossier proc ID of this dossier proc2 role
	*/
	@Override
	public long getDossierProcId() {
		return _dossierProc2Role.getDossierProcId();
	}

	/**
	* Sets the dossier proc ID of this dossier proc2 role.
	*
	* @param dossierProcId the dossier proc ID of this dossier proc2 role
	*/
	@Override
	public void setDossierProcId(long dossierProcId) {
		_dossierProc2Role.setDossierProcId(dossierProcId);
	}

	/**
	* Returns the role ID of this dossier proc2 role.
	*
	* @return the role ID of this dossier proc2 role
	*/
	@Override
	public long getRoleId() {
		return _dossierProc2Role.getRoleId();
	}

	/**
	* Sets the role ID of this dossier proc2 role.
	*
	* @param roleId the role ID of this dossier proc2 role
	*/
	@Override
	public void setRoleId(long roleId) {
		_dossierProc2Role.setRoleId(roleId);
	}

	@Override
	public boolean isNew() {
		return _dossierProc2Role.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dossierProc2Role.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dossierProc2Role.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dossierProc2Role.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dossierProc2Role.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dossierProc2Role.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dossierProc2Role.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dossierProc2Role.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dossierProc2Role.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dossierProc2Role.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dossierProc2Role.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DossierProc2RoleWrapper((DossierProc2Role)_dossierProc2Role.clone());
	}

	@Override
	public int compareTo(
		org.oep.processmgt.model.DossierProc2Role dossierProc2Role) {
		return _dossierProc2Role.compareTo(dossierProc2Role);
	}

	@Override
	public int hashCode() {
		return _dossierProc2Role.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.processmgt.model.DossierProc2Role> toCacheModel() {
		return _dossierProc2Role.toCacheModel();
	}

	@Override
	public org.oep.processmgt.model.DossierProc2Role toEscapedModel() {
		return new DossierProc2RoleWrapper(_dossierProc2Role.toEscapedModel());
	}

	@Override
	public org.oep.processmgt.model.DossierProc2Role toUnescapedModel() {
		return new DossierProc2RoleWrapper(_dossierProc2Role.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dossierProc2Role.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dossierProc2Role.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dossierProc2Role.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DossierProc2RoleWrapper)) {
			return false;
		}

		DossierProc2RoleWrapper dossierProc2RoleWrapper = (DossierProc2RoleWrapper)obj;

		if (Validator.equals(_dossierProc2Role,
					dossierProc2RoleWrapper._dossierProc2Role)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DossierProc2Role getWrappedDossierProc2Role() {
		return _dossierProc2Role;
	}

	@Override
	public DossierProc2Role getWrappedModel() {
		return _dossierProc2Role;
	}

	@Override
	public void resetOriginalValues() {
		_dossierProc2Role.resetOriginalValues();
	}

	private DossierProc2Role _dossierProc2Role;
}