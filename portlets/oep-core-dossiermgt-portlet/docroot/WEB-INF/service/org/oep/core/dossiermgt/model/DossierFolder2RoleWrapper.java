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
 * This class is a wrapper for {@link DossierFolder2Role}.
 * </p>
 *
 * @author trungdk
 * @see DossierFolder2Role
 * @generated
 */
public class DossierFolder2RoleWrapper implements DossierFolder2Role,
	ModelWrapper<DossierFolder2Role> {
	public DossierFolder2RoleWrapper(DossierFolder2Role dossierFolder2Role) {
		_dossierFolder2Role = dossierFolder2Role;
	}

	@Override
	public Class<?> getModelClass() {
		return DossierFolder2Role.class;
	}

	@Override
	public String getModelClassName() {
		return DossierFolder2Role.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("companyId", getCompanyId());
		attributes.put("dossierFolderId", getDossierFolderId());
		attributes.put("roleId", getRoleId());

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

		Long dossierFolderId = (Long)attributes.get("dossierFolderId");

		if (dossierFolderId != null) {
			setDossierFolderId(dossierFolderId);
		}

		Long roleId = (Long)attributes.get("roleId");

		if (roleId != null) {
			setRoleId(roleId);
		}
	}

	/**
	* Returns the primary key of this dossier folder2 role.
	*
	* @return the primary key of this dossier folder2 role
	*/
	@Override
	public long getPrimaryKey() {
		return _dossierFolder2Role.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dossier folder2 role.
	*
	* @param primaryKey the primary key of this dossier folder2 role
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dossierFolder2Role.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dossier folder2 role.
	*
	* @return the ID of this dossier folder2 role
	*/
	@Override
	public long getId() {
		return _dossierFolder2Role.getId();
	}

	/**
	* Sets the ID of this dossier folder2 role.
	*
	* @param id the ID of this dossier folder2 role
	*/
	@Override
	public void setId(long id) {
		_dossierFolder2Role.setId(id);
	}

	/**
	* Returns the company ID of this dossier folder2 role.
	*
	* @return the company ID of this dossier folder2 role
	*/
	@Override
	public long getCompanyId() {
		return _dossierFolder2Role.getCompanyId();
	}

	/**
	* Sets the company ID of this dossier folder2 role.
	*
	* @param companyId the company ID of this dossier folder2 role
	*/
	@Override
	public void setCompanyId(long companyId) {
		_dossierFolder2Role.setCompanyId(companyId);
	}

	/**
	* Returns the dossier folder ID of this dossier folder2 role.
	*
	* @return the dossier folder ID of this dossier folder2 role
	*/
	@Override
	public long getDossierFolderId() {
		return _dossierFolder2Role.getDossierFolderId();
	}

	/**
	* Sets the dossier folder ID of this dossier folder2 role.
	*
	* @param dossierFolderId the dossier folder ID of this dossier folder2 role
	*/
	@Override
	public void setDossierFolderId(long dossierFolderId) {
		_dossierFolder2Role.setDossierFolderId(dossierFolderId);
	}

	/**
	* Returns the role ID of this dossier folder2 role.
	*
	* @return the role ID of this dossier folder2 role
	*/
	@Override
	public long getRoleId() {
		return _dossierFolder2Role.getRoleId();
	}

	/**
	* Sets the role ID of this dossier folder2 role.
	*
	* @param roleId the role ID of this dossier folder2 role
	*/
	@Override
	public void setRoleId(long roleId) {
		_dossierFolder2Role.setRoleId(roleId);
	}

	@Override
	public boolean isNew() {
		return _dossierFolder2Role.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dossierFolder2Role.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dossierFolder2Role.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dossierFolder2Role.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dossierFolder2Role.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dossierFolder2Role.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dossierFolder2Role.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dossierFolder2Role.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dossierFolder2Role.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dossierFolder2Role.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dossierFolder2Role.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DossierFolder2RoleWrapper((DossierFolder2Role)_dossierFolder2Role.clone());
	}

	@Override
	public int compareTo(DossierFolder2Role dossierFolder2Role) {
		return _dossierFolder2Role.compareTo(dossierFolder2Role);
	}

	@Override
	public int hashCode() {
		return _dossierFolder2Role.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<DossierFolder2Role> toCacheModel() {
		return _dossierFolder2Role.toCacheModel();
	}

	@Override
	public DossierFolder2Role toEscapedModel() {
		return new DossierFolder2RoleWrapper(_dossierFolder2Role.toEscapedModel());
	}

	@Override
	public DossierFolder2Role toUnescapedModel() {
		return new DossierFolder2RoleWrapper(_dossierFolder2Role.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dossierFolder2Role.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dossierFolder2Role.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dossierFolder2Role.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DossierFolder2RoleWrapper)) {
			return false;
		}

		DossierFolder2RoleWrapper dossierFolder2RoleWrapper = (DossierFolder2RoleWrapper)obj;

		if (Validator.equals(_dossierFolder2Role,
					dossierFolder2RoleWrapper._dossierFolder2Role)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DossierFolder2Role getWrappedDossierFolder2Role() {
		return _dossierFolder2Role;
	}

	@Override
	public DossierFolder2Role getWrappedModel() {
		return _dossierFolder2Role;
	}

	@Override
	public void resetOriginalValues() {
		_dossierFolder2Role.resetOriginalValues();
	}

	private DossierFolder2Role _dossierFolder2Role;
}