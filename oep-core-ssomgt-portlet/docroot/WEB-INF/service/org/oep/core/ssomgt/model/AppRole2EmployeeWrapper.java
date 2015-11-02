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

package org.oep.core.ssomgt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AppRole2Employee}.
 * </p>
 *
 * @author trungdk
 * @see AppRole2Employee
 * @generated
 */
public class AppRole2EmployeeWrapper implements AppRole2Employee,
	ModelWrapper<AppRole2Employee> {
	public AppRole2EmployeeWrapper(AppRole2Employee appRole2Employee) {
		_appRole2Employee = appRole2Employee;
	}

	@Override
	public Class<?> getModelClass() {
		return AppRole2Employee.class;
	}

	@Override
	public String getModelClassName() {
		return AppRole2Employee.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("appRole2EmployeeId", getAppRole2EmployeeId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("appRoleId", getAppRoleId());
		attributes.put("employeeId", getEmployeeId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long appRole2EmployeeId = (Long)attributes.get("appRole2EmployeeId");

		if (appRole2EmployeeId != null) {
			setAppRole2EmployeeId(appRole2EmployeeId);
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

		Long appRoleId = (Long)attributes.get("appRoleId");

		if (appRoleId != null) {
			setAppRoleId(appRoleId);
		}

		Long employeeId = (Long)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}
	}

	/**
	* Returns the primary key of this app role2 employee.
	*
	* @return the primary key of this app role2 employee
	*/
	@Override
	public long getPrimaryKey() {
		return _appRole2Employee.getPrimaryKey();
	}

	/**
	* Sets the primary key of this app role2 employee.
	*
	* @param primaryKey the primary key of this app role2 employee
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_appRole2Employee.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the app role2 employee ID of this app role2 employee.
	*
	* @return the app role2 employee ID of this app role2 employee
	*/
	@Override
	public long getAppRole2EmployeeId() {
		return _appRole2Employee.getAppRole2EmployeeId();
	}

	/**
	* Sets the app role2 employee ID of this app role2 employee.
	*
	* @param appRole2EmployeeId the app role2 employee ID of this app role2 employee
	*/
	@Override
	public void setAppRole2EmployeeId(long appRole2EmployeeId) {
		_appRole2Employee.setAppRole2EmployeeId(appRole2EmployeeId);
	}

	/**
	* Returns the user ID of this app role2 employee.
	*
	* @return the user ID of this app role2 employee
	*/
	@Override
	public long getUserId() {
		return _appRole2Employee.getUserId();
	}

	/**
	* Sets the user ID of this app role2 employee.
	*
	* @param userId the user ID of this app role2 employee
	*/
	@Override
	public void setUserId(long userId) {
		_appRole2Employee.setUserId(userId);
	}

	/**
	* Returns the user uuid of this app role2 employee.
	*
	* @return the user uuid of this app role2 employee
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appRole2Employee.getUserUuid();
	}

	/**
	* Sets the user uuid of this app role2 employee.
	*
	* @param userUuid the user uuid of this app role2 employee
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_appRole2Employee.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this app role2 employee.
	*
	* @return the group ID of this app role2 employee
	*/
	@Override
	public long getGroupId() {
		return _appRole2Employee.getGroupId();
	}

	/**
	* Sets the group ID of this app role2 employee.
	*
	* @param groupId the group ID of this app role2 employee
	*/
	@Override
	public void setGroupId(long groupId) {
		_appRole2Employee.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this app role2 employee.
	*
	* @return the company ID of this app role2 employee
	*/
	@Override
	public long getCompanyId() {
		return _appRole2Employee.getCompanyId();
	}

	/**
	* Sets the company ID of this app role2 employee.
	*
	* @param companyId the company ID of this app role2 employee
	*/
	@Override
	public void setCompanyId(long companyId) {
		_appRole2Employee.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this app role2 employee.
	*
	* @return the create date of this app role2 employee
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _appRole2Employee.getCreateDate();
	}

	/**
	* Sets the create date of this app role2 employee.
	*
	* @param createDate the create date of this app role2 employee
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_appRole2Employee.setCreateDate(createDate);
	}

	/**
	* Returns the app role ID of this app role2 employee.
	*
	* @return the app role ID of this app role2 employee
	*/
	@Override
	public long getAppRoleId() {
		return _appRole2Employee.getAppRoleId();
	}

	/**
	* Sets the app role ID of this app role2 employee.
	*
	* @param appRoleId the app role ID of this app role2 employee
	*/
	@Override
	public void setAppRoleId(long appRoleId) {
		_appRole2Employee.setAppRoleId(appRoleId);
	}

	/**
	* Returns the employee ID of this app role2 employee.
	*
	* @return the employee ID of this app role2 employee
	*/
	@Override
	public long getEmployeeId() {
		return _appRole2Employee.getEmployeeId();
	}

	/**
	* Sets the employee ID of this app role2 employee.
	*
	* @param employeeId the employee ID of this app role2 employee
	*/
	@Override
	public void setEmployeeId(long employeeId) {
		_appRole2Employee.setEmployeeId(employeeId);
	}

	@Override
	public boolean isNew() {
		return _appRole2Employee.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_appRole2Employee.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _appRole2Employee.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_appRole2Employee.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _appRole2Employee.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _appRole2Employee.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_appRole2Employee.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _appRole2Employee.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_appRole2Employee.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_appRole2Employee.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_appRole2Employee.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AppRole2EmployeeWrapper((AppRole2Employee)_appRole2Employee.clone());
	}

	@Override
	public int compareTo(
		org.oep.core.ssomgt.model.AppRole2Employee appRole2Employee) {
		return _appRole2Employee.compareTo(appRole2Employee);
	}

	@Override
	public int hashCode() {
		return _appRole2Employee.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.core.ssomgt.model.AppRole2Employee> toCacheModel() {
		return _appRole2Employee.toCacheModel();
	}

	@Override
	public org.oep.core.ssomgt.model.AppRole2Employee toEscapedModel() {
		return new AppRole2EmployeeWrapper(_appRole2Employee.toEscapedModel());
	}

	@Override
	public org.oep.core.ssomgt.model.AppRole2Employee toUnescapedModel() {
		return new AppRole2EmployeeWrapper(_appRole2Employee.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _appRole2Employee.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _appRole2Employee.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_appRole2Employee.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AppRole2EmployeeWrapper)) {
			return false;
		}

		AppRole2EmployeeWrapper appRole2EmployeeWrapper = (AppRole2EmployeeWrapper)obj;

		if (Validator.equals(_appRole2Employee,
					appRole2EmployeeWrapper._appRole2Employee)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public AppRole2Employee getWrappedAppRole2Employee() {
		return _appRole2Employee;
	}

	@Override
	public AppRole2Employee getWrappedModel() {
		return _appRole2Employee;
	}

	@Override
	public void resetOriginalValues() {
		_appRole2Employee.resetOriginalValues();
	}

	private AppRole2Employee _appRole2Employee;
}