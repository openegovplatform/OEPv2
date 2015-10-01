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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ProcessOrder2User}.
 * </p>
 *
 * @author trungdk
 * @see ProcessOrder2User
 * @generated
 */
public class ProcessOrder2UserWrapper implements ProcessOrder2User,
	ModelWrapper<ProcessOrder2User> {
	public ProcessOrder2UserWrapper(ProcessOrder2User processOrder2User) {
		_processOrder2User = processOrder2User;
	}

	@Override
	public Class<?> getModelClass() {
		return ProcessOrder2User.class;
	}

	@Override
	public String getModelClassName() {
		return ProcessOrder2User.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("processOrderId", getProcessOrderId());
		attributes.put("userId", getUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long processOrderId = (Long)attributes.get("processOrderId");

		if (processOrderId != null) {
			setProcessOrderId(processOrderId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}
	}

	/**
	* Returns the primary key of this process order2 user.
	*
	* @return the primary key of this process order2 user
	*/
	@Override
	public org.oep.core.processmgt.service.persistence.ProcessOrder2UserPK getPrimaryKey() {
		return _processOrder2User.getPrimaryKey();
	}

	/**
	* Sets the primary key of this process order2 user.
	*
	* @param primaryKey the primary key of this process order2 user
	*/
	@Override
	public void setPrimaryKey(
		org.oep.core.processmgt.service.persistence.ProcessOrder2UserPK primaryKey) {
		_processOrder2User.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the process order ID of this process order2 user.
	*
	* @return the process order ID of this process order2 user
	*/
	@Override
	public long getProcessOrderId() {
		return _processOrder2User.getProcessOrderId();
	}

	/**
	* Sets the process order ID of this process order2 user.
	*
	* @param processOrderId the process order ID of this process order2 user
	*/
	@Override
	public void setProcessOrderId(long processOrderId) {
		_processOrder2User.setProcessOrderId(processOrderId);
	}

	/**
	* Returns the user ID of this process order2 user.
	*
	* @return the user ID of this process order2 user
	*/
	@Override
	public long getUserId() {
		return _processOrder2User.getUserId();
	}

	/**
	* Sets the user ID of this process order2 user.
	*
	* @param userId the user ID of this process order2 user
	*/
	@Override
	public void setUserId(long userId) {
		_processOrder2User.setUserId(userId);
	}

	/**
	* Returns the user uuid of this process order2 user.
	*
	* @return the user uuid of this process order2 user
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _processOrder2User.getUserUuid();
	}

	/**
	* Sets the user uuid of this process order2 user.
	*
	* @param userUuid the user uuid of this process order2 user
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_processOrder2User.setUserUuid(userUuid);
	}

	@Override
	public boolean isNew() {
		return _processOrder2User.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_processOrder2User.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _processOrder2User.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_processOrder2User.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _processOrder2User.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _processOrder2User.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_processOrder2User.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _processOrder2User.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_processOrder2User.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_processOrder2User.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_processOrder2User.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ProcessOrder2UserWrapper((ProcessOrder2User)_processOrder2User.clone());
	}

	@Override
	public int compareTo(
		org.oep.core.processmgt.model.ProcessOrder2User processOrder2User) {
		return _processOrder2User.compareTo(processOrder2User);
	}

	@Override
	public int hashCode() {
		return _processOrder2User.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.core.processmgt.model.ProcessOrder2User> toCacheModel() {
		return _processOrder2User.toCacheModel();
	}

	@Override
	public org.oep.core.processmgt.model.ProcessOrder2User toEscapedModel() {
		return new ProcessOrder2UserWrapper(_processOrder2User.toEscapedModel());
	}

	@Override
	public org.oep.core.processmgt.model.ProcessOrder2User toUnescapedModel() {
		return new ProcessOrder2UserWrapper(_processOrder2User.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _processOrder2User.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _processOrder2User.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_processOrder2User.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProcessOrder2UserWrapper)) {
			return false;
		}

		ProcessOrder2UserWrapper processOrder2UserWrapper = (ProcessOrder2UserWrapper)obj;

		if (Validator.equals(_processOrder2User,
					processOrder2UserWrapper._processOrder2User)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ProcessOrder2User getWrappedProcessOrder2User() {
		return _processOrder2User;
	}

	@Override
	public ProcessOrder2User getWrappedModel() {
		return _processOrder2User;
	}

	@Override
	public void resetOriginalValues() {
		_processOrder2User.resetOriginalValues();
	}

	private ProcessOrder2User _processOrder2User;
}