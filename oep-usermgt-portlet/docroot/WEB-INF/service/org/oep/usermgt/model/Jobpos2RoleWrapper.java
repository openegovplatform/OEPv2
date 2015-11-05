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

package org.oep.usermgt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Jobpos2Role}.
 * </p>
 *
 * @author NQMINH
 * @see Jobpos2Role
 * @generated
 */
public class Jobpos2RoleWrapper implements Jobpos2Role,
	ModelWrapper<Jobpos2Role> {
	public Jobpos2RoleWrapper(Jobpos2Role jobpos2Role) {
		_jobpos2Role = jobpos2Role;
	}

	@Override
	public Class<?> getModelClass() {
		return Jobpos2Role.class;
	}

	@Override
	public String getModelClassName() {
		return Jobpos2Role.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("jobPosId", getJobPosId());
		attributes.put("roleId", getRoleId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long jobPosId = (Long)attributes.get("jobPosId");

		if (jobPosId != null) {
			setJobPosId(jobPosId);
		}

		Long roleId = (Long)attributes.get("roleId");

		if (roleId != null) {
			setRoleId(roleId);
		}
	}

	/**
	* Returns the primary key of this jobpos to role.
	*
	* @return the primary key of this jobpos to role
	*/
	@Override
	public org.oep.usermgt.service.persistence.Jobpos2RolePK getPrimaryKey() {
		return _jobpos2Role.getPrimaryKey();
	}

	/**
	* Sets the primary key of this jobpos to role.
	*
	* @param primaryKey the primary key of this jobpos to role
	*/
	@Override
	public void setPrimaryKey(
		org.oep.usermgt.service.persistence.Jobpos2RolePK primaryKey) {
		_jobpos2Role.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the job pos ID of this jobpos to role.
	*
	* @return the job pos ID of this jobpos to role
	*/
	@Override
	public long getJobPosId() {
		return _jobpos2Role.getJobPosId();
	}

	/**
	* Sets the job pos ID of this jobpos to role.
	*
	* @param jobPosId the job pos ID of this jobpos to role
	*/
	@Override
	public void setJobPosId(long jobPosId) {
		_jobpos2Role.setJobPosId(jobPosId);
	}

	/**
	* Returns the role ID of this jobpos to role.
	*
	* @return the role ID of this jobpos to role
	*/
	@Override
	public long getRoleId() {
		return _jobpos2Role.getRoleId();
	}

	/**
	* Sets the role ID of this jobpos to role.
	*
	* @param roleId the role ID of this jobpos to role
	*/
	@Override
	public void setRoleId(long roleId) {
		_jobpos2Role.setRoleId(roleId);
	}

	@Override
	public boolean isNew() {
		return _jobpos2Role.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_jobpos2Role.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _jobpos2Role.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_jobpos2Role.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _jobpos2Role.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _jobpos2Role.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_jobpos2Role.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _jobpos2Role.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_jobpos2Role.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_jobpos2Role.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_jobpos2Role.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new Jobpos2RoleWrapper((Jobpos2Role)_jobpos2Role.clone());
	}

	@Override
	public int compareTo(org.oep.usermgt.model.Jobpos2Role jobpos2Role) {
		return _jobpos2Role.compareTo(jobpos2Role);
	}

	@Override
	public int hashCode() {
		return _jobpos2Role.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.usermgt.model.Jobpos2Role> toCacheModel() {
		return _jobpos2Role.toCacheModel();
	}

	@Override
	public org.oep.usermgt.model.Jobpos2Role toEscapedModel() {
		return new Jobpos2RoleWrapper(_jobpos2Role.toEscapedModel());
	}

	@Override
	public org.oep.usermgt.model.Jobpos2Role toUnescapedModel() {
		return new Jobpos2RoleWrapper(_jobpos2Role.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _jobpos2Role.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _jobpos2Role.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_jobpos2Role.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Jobpos2RoleWrapper)) {
			return false;
		}

		Jobpos2RoleWrapper jobpos2RoleWrapper = (Jobpos2RoleWrapper)obj;

		if (Validator.equals(_jobpos2Role, jobpos2RoleWrapper._jobpos2Role)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Jobpos2Role getWrappedJobpos2Role() {
		return _jobpos2Role;
	}

	@Override
	public Jobpos2Role getWrappedModel() {
		return _jobpos2Role;
	}

	@Override
	public void resetOriginalValues() {
		_jobpos2Role.resetOriginalValues();
	}

	private Jobpos2Role _jobpos2Role;
}