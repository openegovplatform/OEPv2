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
 * This class is a wrapper for {@link JobPos2Role}.
 * </p>
 *
 * @author NQMINH
 * @see JobPos2Role
 * @generated
 */
public class JobPos2RoleWrapper implements JobPos2Role,
	ModelWrapper<JobPos2Role> {
	public JobPos2RoleWrapper(JobPos2Role jobPos2Role) {
		_jobPos2Role = jobPos2Role;
	}

	@Override
	public Class<?> getModelClass() {
		return JobPos2Role.class;
	}

	@Override
	public String getModelClassName() {
		return JobPos2Role.class.getName();
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
	public org.oep.usermgt.service.persistence.JobPos2RolePK getPrimaryKey() {
		return _jobPos2Role.getPrimaryKey();
	}

	/**
	* Sets the primary key of this jobpos to role.
	*
	* @param primaryKey the primary key of this jobpos to role
	*/
	@Override
	public void setPrimaryKey(
		org.oep.usermgt.service.persistence.JobPos2RolePK primaryKey) {
		_jobPos2Role.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the job pos ID of this jobpos to role.
	*
	* @return the job pos ID of this jobpos to role
	*/
	@Override
	public long getJobPosId() {
		return _jobPos2Role.getJobPosId();
	}

	/**
	* Sets the job pos ID of this jobpos to role.
	*
	* @param jobPosId the job pos ID of this jobpos to role
	*/
	@Override
	public void setJobPosId(long jobPosId) {
		_jobPos2Role.setJobPosId(jobPosId);
	}

	/**
	* Returns the role ID of this jobpos to role.
	*
	* @return the role ID of this jobpos to role
	*/
	@Override
	public long getRoleId() {
		return _jobPos2Role.getRoleId();
	}

	/**
	* Sets the role ID of this jobpos to role.
	*
	* @param roleId the role ID of this jobpos to role
	*/
	@Override
	public void setRoleId(long roleId) {
		_jobPos2Role.setRoleId(roleId);
	}

	@Override
	public boolean isNew() {
		return _jobPos2Role.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_jobPos2Role.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _jobPos2Role.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_jobPos2Role.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _jobPos2Role.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _jobPos2Role.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_jobPos2Role.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _jobPos2Role.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_jobPos2Role.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_jobPos2Role.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_jobPos2Role.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new JobPos2RoleWrapper((JobPos2Role)_jobPos2Role.clone());
	}

	@Override
	public int compareTo(org.oep.usermgt.model.JobPos2Role jobPos2Role) {
		return _jobPos2Role.compareTo(jobPos2Role);
	}

	@Override
	public int hashCode() {
		return _jobPos2Role.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.usermgt.model.JobPos2Role> toCacheModel() {
		return _jobPos2Role.toCacheModel();
	}

	@Override
	public org.oep.usermgt.model.JobPos2Role toEscapedModel() {
		return new JobPos2RoleWrapper(_jobPos2Role.toEscapedModel());
	}

	@Override
	public org.oep.usermgt.model.JobPos2Role toUnescapedModel() {
		return new JobPos2RoleWrapper(_jobPos2Role.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _jobPos2Role.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _jobPos2Role.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_jobPos2Role.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof JobPos2RoleWrapper)) {
			return false;
		}

		JobPos2RoleWrapper jobPos2RoleWrapper = (JobPos2RoleWrapper)obj;

		if (Validator.equals(_jobPos2Role, jobPos2RoleWrapper._jobPos2Role)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public JobPos2Role getWrappedJobPos2Role() {
		return _jobPos2Role;
	}

	@Override
	public JobPos2Role getWrappedModel() {
		return _jobPos2Role;
	}

	@Override
	public void resetOriginalValues() {
		_jobPos2Role.resetOriginalValues();
	}

	private JobPos2Role _jobPos2Role;
}