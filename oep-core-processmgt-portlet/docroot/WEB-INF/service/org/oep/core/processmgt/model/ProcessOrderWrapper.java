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

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ProcessOrder}.
 * </p>
 *
 * @author trungdk
 * @see ProcessOrder
 * @generated
 */
public class ProcessOrderWrapper implements ProcessOrder,
	ModelWrapper<ProcessOrder> {
	public ProcessOrderWrapper(ProcessOrder processOrder) {
		_processOrder = processOrder;
	}

	@Override
	public Class<?> getModelClass() {
		return ProcessOrder.class;
	}

	@Override
	public String getModelClassName() {
		return ProcessOrder.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("processOrderId", getProcessOrderId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("organizationId", getOrganizationId());
		attributes.put("parentProcessOrderId", getParentProcessOrderId());
		attributes.put("dossierId", getDossierId());
		attributes.put("dossierProcessId", getDossierProcessId());
		attributes.put("dossierStepId", getDossierStepId());
		attributes.put("orderStatus", getOrderStatus());
		attributes.put("orderResume", getOrderResume());
		attributes.put("stepDate", getStepDate());
		attributes.put("stepNote", getStepNote());
		attributes.put("assignToUserId", getAssignToUserId());
		attributes.put("currentCondition", getCurrentCondition());
		attributes.put("lastStepTransitionId", getLastStepTransitionId());
		attributes.put("stopRollback", getStopRollback());
		attributes.put("ebPartnerShipId", getEbPartnerShipId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long processOrderId = (Long)attributes.get("processOrderId");

		if (processOrderId != null) {
			setProcessOrderId(processOrderId);
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

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}

		Long parentProcessOrderId = (Long)attributes.get("parentProcessOrderId");

		if (parentProcessOrderId != null) {
			setParentProcessOrderId(parentProcessOrderId);
		}

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		Long dossierProcessId = (Long)attributes.get("dossierProcessId");

		if (dossierProcessId != null) {
			setDossierProcessId(dossierProcessId);
		}

		Long dossierStepId = (Long)attributes.get("dossierStepId");

		if (dossierStepId != null) {
			setDossierStepId(dossierStepId);
		}

		String orderStatus = (String)attributes.get("orderStatus");

		if (orderStatus != null) {
			setOrderStatus(orderStatus);
		}

		String orderResume = (String)attributes.get("orderResume");

		if (orderResume != null) {
			setOrderResume(orderResume);
		}

		Date stepDate = (Date)attributes.get("stepDate");

		if (stepDate != null) {
			setStepDate(stepDate);
		}

		String stepNote = (String)attributes.get("stepNote");

		if (stepNote != null) {
			setStepNote(stepNote);
		}

		Long assignToUserId = (Long)attributes.get("assignToUserId");

		if (assignToUserId != null) {
			setAssignToUserId(assignToUserId);
		}

		String currentCondition = (String)attributes.get("currentCondition");

		if (currentCondition != null) {
			setCurrentCondition(currentCondition);
		}

		Long lastStepTransitionId = (Long)attributes.get("lastStepTransitionId");

		if (lastStepTransitionId != null) {
			setLastStepTransitionId(lastStepTransitionId);
		}

		Integer stopRollback = (Integer)attributes.get("stopRollback");

		if (stopRollback != null) {
			setStopRollback(stopRollback);
		}

		Long ebPartnerShipId = (Long)attributes.get("ebPartnerShipId");

		if (ebPartnerShipId != null) {
			setEbPartnerShipId(ebPartnerShipId);
		}
	}

	/**
	* Returns the primary key of this process order.
	*
	* @return the primary key of this process order
	*/
	@Override
	public long getPrimaryKey() {
		return _processOrder.getPrimaryKey();
	}

	/**
	* Sets the primary key of this process order.
	*
	* @param primaryKey the primary key of this process order
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_processOrder.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this process order.
	*
	* @return the uuid of this process order
	*/
	@Override
	public java.lang.String getUuid() {
		return _processOrder.getUuid();
	}

	/**
	* Sets the uuid of this process order.
	*
	* @param uuid the uuid of this process order
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_processOrder.setUuid(uuid);
	}

	/**
	* Returns the process order ID of this process order.
	*
	* @return the process order ID of this process order
	*/
	@Override
	public long getProcessOrderId() {
		return _processOrder.getProcessOrderId();
	}

	/**
	* Sets the process order ID of this process order.
	*
	* @param processOrderId the process order ID of this process order
	*/
	@Override
	public void setProcessOrderId(long processOrderId) {
		_processOrder.setProcessOrderId(processOrderId);
	}

	/**
	* Returns the user ID of this process order.
	*
	* @return the user ID of this process order
	*/
	@Override
	public long getUserId() {
		return _processOrder.getUserId();
	}

	/**
	* Sets the user ID of this process order.
	*
	* @param userId the user ID of this process order
	*/
	@Override
	public void setUserId(long userId) {
		_processOrder.setUserId(userId);
	}

	/**
	* Returns the user uuid of this process order.
	*
	* @return the user uuid of this process order
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _processOrder.getUserUuid();
	}

	/**
	* Sets the user uuid of this process order.
	*
	* @param userUuid the user uuid of this process order
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_processOrder.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this process order.
	*
	* @return the group ID of this process order
	*/
	@Override
	public long getGroupId() {
		return _processOrder.getGroupId();
	}

	/**
	* Sets the group ID of this process order.
	*
	* @param groupId the group ID of this process order
	*/
	@Override
	public void setGroupId(long groupId) {
		_processOrder.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this process order.
	*
	* @return the company ID of this process order
	*/
	@Override
	public long getCompanyId() {
		return _processOrder.getCompanyId();
	}

	/**
	* Sets the company ID of this process order.
	*
	* @param companyId the company ID of this process order
	*/
	@Override
	public void setCompanyId(long companyId) {
		_processOrder.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this process order.
	*
	* @return the create date of this process order
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _processOrder.getCreateDate();
	}

	/**
	* Sets the create date of this process order.
	*
	* @param createDate the create date of this process order
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_processOrder.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this process order.
	*
	* @return the modified date of this process order
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _processOrder.getModifiedDate();
	}

	/**
	* Sets the modified date of this process order.
	*
	* @param modifiedDate the modified date of this process order
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_processOrder.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the organization ID of this process order.
	*
	* @return the organization ID of this process order
	*/
	@Override
	public long getOrganizationId() {
		return _processOrder.getOrganizationId();
	}

	/**
	* Sets the organization ID of this process order.
	*
	* @param organizationId the organization ID of this process order
	*/
	@Override
	public void setOrganizationId(long organizationId) {
		_processOrder.setOrganizationId(organizationId);
	}

	/**
	* Returns the parent process order ID of this process order.
	*
	* @return the parent process order ID of this process order
	*/
	@Override
	public long getParentProcessOrderId() {
		return _processOrder.getParentProcessOrderId();
	}

	/**
	* Sets the parent process order ID of this process order.
	*
	* @param parentProcessOrderId the parent process order ID of this process order
	*/
	@Override
	public void setParentProcessOrderId(long parentProcessOrderId) {
		_processOrder.setParentProcessOrderId(parentProcessOrderId);
	}

	/**
	* Returns the dossier ID of this process order.
	*
	* @return the dossier ID of this process order
	*/
	@Override
	public long getDossierId() {
		return _processOrder.getDossierId();
	}

	/**
	* Sets the dossier ID of this process order.
	*
	* @param dossierId the dossier ID of this process order
	*/
	@Override
	public void setDossierId(long dossierId) {
		_processOrder.setDossierId(dossierId);
	}

	/**
	* Returns the dossier process ID of this process order.
	*
	* @return the dossier process ID of this process order
	*/
	@Override
	public long getDossierProcessId() {
		return _processOrder.getDossierProcessId();
	}

	/**
	* Sets the dossier process ID of this process order.
	*
	* @param dossierProcessId the dossier process ID of this process order
	*/
	@Override
	public void setDossierProcessId(long dossierProcessId) {
		_processOrder.setDossierProcessId(dossierProcessId);
	}

	/**
	* Returns the dossier step ID of this process order.
	*
	* @return the dossier step ID of this process order
	*/
	@Override
	public long getDossierStepId() {
		return _processOrder.getDossierStepId();
	}

	/**
	* Sets the dossier step ID of this process order.
	*
	* @param dossierStepId the dossier step ID of this process order
	*/
	@Override
	public void setDossierStepId(long dossierStepId) {
		_processOrder.setDossierStepId(dossierStepId);
	}

	/**
	* Returns the order status of this process order.
	*
	* @return the order status of this process order
	*/
	@Override
	public java.lang.String getOrderStatus() {
		return _processOrder.getOrderStatus();
	}

	/**
	* Sets the order status of this process order.
	*
	* @param orderStatus the order status of this process order
	*/
	@Override
	public void setOrderStatus(java.lang.String orderStatus) {
		_processOrder.setOrderStatus(orderStatus);
	}

	/**
	* Returns the order resume of this process order.
	*
	* @return the order resume of this process order
	*/
	@Override
	public java.lang.String getOrderResume() {
		return _processOrder.getOrderResume();
	}

	/**
	* Sets the order resume of this process order.
	*
	* @param orderResume the order resume of this process order
	*/
	@Override
	public void setOrderResume(java.lang.String orderResume) {
		_processOrder.setOrderResume(orderResume);
	}

	/**
	* Returns the step date of this process order.
	*
	* @return the step date of this process order
	*/
	@Override
	public java.util.Date getStepDate() {
		return _processOrder.getStepDate();
	}

	/**
	* Sets the step date of this process order.
	*
	* @param stepDate the step date of this process order
	*/
	@Override
	public void setStepDate(java.util.Date stepDate) {
		_processOrder.setStepDate(stepDate);
	}

	/**
	* Returns the step note of this process order.
	*
	* @return the step note of this process order
	*/
	@Override
	public java.lang.String getStepNote() {
		return _processOrder.getStepNote();
	}

	/**
	* Sets the step note of this process order.
	*
	* @param stepNote the step note of this process order
	*/
	@Override
	public void setStepNote(java.lang.String stepNote) {
		_processOrder.setStepNote(stepNote);
	}

	/**
	* Returns the assign to user ID of this process order.
	*
	* @return the assign to user ID of this process order
	*/
	@Override
	public long getAssignToUserId() {
		return _processOrder.getAssignToUserId();
	}

	/**
	* Sets the assign to user ID of this process order.
	*
	* @param assignToUserId the assign to user ID of this process order
	*/
	@Override
	public void setAssignToUserId(long assignToUserId) {
		_processOrder.setAssignToUserId(assignToUserId);
	}

	/**
	* Returns the assign to user uuid of this process order.
	*
	* @return the assign to user uuid of this process order
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getAssignToUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _processOrder.getAssignToUserUuid();
	}

	/**
	* Sets the assign to user uuid of this process order.
	*
	* @param assignToUserUuid the assign to user uuid of this process order
	*/
	@Override
	public void setAssignToUserUuid(java.lang.String assignToUserUuid) {
		_processOrder.setAssignToUserUuid(assignToUserUuid);
	}

	/**
	* Returns the current condition of this process order.
	*
	* @return the current condition of this process order
	*/
	@Override
	public java.lang.String getCurrentCondition() {
		return _processOrder.getCurrentCondition();
	}

	/**
	* Sets the current condition of this process order.
	*
	* @param currentCondition the current condition of this process order
	*/
	@Override
	public void setCurrentCondition(java.lang.String currentCondition) {
		_processOrder.setCurrentCondition(currentCondition);
	}

	/**
	* Returns the last step transition ID of this process order.
	*
	* @return the last step transition ID of this process order
	*/
	@Override
	public long getLastStepTransitionId() {
		return _processOrder.getLastStepTransitionId();
	}

	/**
	* Sets the last step transition ID of this process order.
	*
	* @param lastStepTransitionId the last step transition ID of this process order
	*/
	@Override
	public void setLastStepTransitionId(long lastStepTransitionId) {
		_processOrder.setLastStepTransitionId(lastStepTransitionId);
	}

	/**
	* Returns the stop rollback of this process order.
	*
	* @return the stop rollback of this process order
	*/
	@Override
	public int getStopRollback() {
		return _processOrder.getStopRollback();
	}

	/**
	* Sets the stop rollback of this process order.
	*
	* @param stopRollback the stop rollback of this process order
	*/
	@Override
	public void setStopRollback(int stopRollback) {
		_processOrder.setStopRollback(stopRollback);
	}

	/**
	* Returns the eb partner ship ID of this process order.
	*
	* @return the eb partner ship ID of this process order
	*/
	@Override
	public long getEbPartnerShipId() {
		return _processOrder.getEbPartnerShipId();
	}

	/**
	* Sets the eb partner ship ID of this process order.
	*
	* @param ebPartnerShipId the eb partner ship ID of this process order
	*/
	@Override
	public void setEbPartnerShipId(long ebPartnerShipId) {
		_processOrder.setEbPartnerShipId(ebPartnerShipId);
	}

	@Override
	public boolean isNew() {
		return _processOrder.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_processOrder.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _processOrder.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_processOrder.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _processOrder.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _processOrder.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_processOrder.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _processOrder.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_processOrder.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_processOrder.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_processOrder.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ProcessOrderWrapper((ProcessOrder)_processOrder.clone());
	}

	@Override
	public int compareTo(
		org.oep.core.processmgt.model.ProcessOrder processOrder) {
		return _processOrder.compareTo(processOrder);
	}

	@Override
	public int hashCode() {
		return _processOrder.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.core.processmgt.model.ProcessOrder> toCacheModel() {
		return _processOrder.toCacheModel();
	}

	@Override
	public org.oep.core.processmgt.model.ProcessOrder toEscapedModel() {
		return new ProcessOrderWrapper(_processOrder.toEscapedModel());
	}

	@Override
	public org.oep.core.processmgt.model.ProcessOrder toUnescapedModel() {
		return new ProcessOrderWrapper(_processOrder.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _processOrder.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _processOrder.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_processOrder.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProcessOrderWrapper)) {
			return false;
		}

		ProcessOrderWrapper processOrderWrapper = (ProcessOrderWrapper)obj;

		if (Validator.equals(_processOrder, processOrderWrapper._processOrder)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _processOrder.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ProcessOrder getWrappedProcessOrder() {
		return _processOrder;
	}

	@Override
	public ProcessOrder getWrappedModel() {
		return _processOrder;
	}

	@Override
	public void resetOriginalValues() {
		_processOrder.resetOriginalValues();
	}

	private ProcessOrder _processOrder;
}