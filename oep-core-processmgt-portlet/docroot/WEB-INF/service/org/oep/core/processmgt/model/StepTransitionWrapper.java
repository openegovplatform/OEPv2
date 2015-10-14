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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link StepTransition}.
 * </p>
 *
 * @author trungdk
 * @see StepTransition
 * @generated
 */
public class StepTransitionWrapper implements StepTransition,
	ModelWrapper<StepTransition> {
	public StepTransitionWrapper(StepTransition stepTransition) {
		_stepTransition = stepTransition;
	}

	@Override
	public Class<?> getModelClass() {
		return StepTransition.class;
	}

	@Override
	public String getModelClassName() {
		return StepTransition.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("stepTransitionId", getStepTransitionId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dossierProcessId", getDossierProcessId());
		attributes.put("preDossierStepId", getPreDossierStepId());
		attributes.put("postDossierStepId", getPostDossierStepId());
		attributes.put("precondition", getPrecondition());
		attributes.put("autoCondition", getAutoCondition());
		attributes.put("transitionName", getTransitionName());
		attributes.put("dossierStatus", getDossierStatus());
		attributes.put("notifyStatus", getNotifyStatus());
		attributes.put("sendResults", getSendResults());
		attributes.put("requestPayment", getRequestPayment());
		attributes.put("userAssignment", getUserAssignment());
		attributes.put("newProcessOrder", getNewProcessOrder());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long stepTransitionId = (Long)attributes.get("stepTransitionId");

		if (stepTransitionId != null) {
			setStepTransitionId(stepTransitionId);
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

		Long dossierProcessId = (Long)attributes.get("dossierProcessId");

		if (dossierProcessId != null) {
			setDossierProcessId(dossierProcessId);
		}

		Long preDossierStepId = (Long)attributes.get("preDossierStepId");

		if (preDossierStepId != null) {
			setPreDossierStepId(preDossierStepId);
		}

		Long postDossierStepId = (Long)attributes.get("postDossierStepId");

		if (postDossierStepId != null) {
			setPostDossierStepId(postDossierStepId);
		}

		String precondition = (String)attributes.get("precondition");

		if (precondition != null) {
			setPrecondition(precondition);
		}

		String autoCondition = (String)attributes.get("autoCondition");

		if (autoCondition != null) {
			setAutoCondition(autoCondition);
		}

		String transitionName = (String)attributes.get("transitionName");

		if (transitionName != null) {
			setTransitionName(transitionName);
		}

		String dossierStatus = (String)attributes.get("dossierStatus");

		if (dossierStatus != null) {
			setDossierStatus(dossierStatus);
		}

		Integer notifyStatus = (Integer)attributes.get("notifyStatus");

		if (notifyStatus != null) {
			setNotifyStatus(notifyStatus);
		}

		Integer sendResults = (Integer)attributes.get("sendResults");

		if (sendResults != null) {
			setSendResults(sendResults);
		}

		Integer requestPayment = (Integer)attributes.get("requestPayment");

		if (requestPayment != null) {
			setRequestPayment(requestPayment);
		}

		Integer userAssignment = (Integer)attributes.get("userAssignment");

		if (userAssignment != null) {
			setUserAssignment(userAssignment);
		}

		Integer newProcessOrder = (Integer)attributes.get("newProcessOrder");

		if (newProcessOrder != null) {
			setNewProcessOrder(newProcessOrder);
		}
	}

	/**
	* Returns the primary key of this step transition.
	*
	* @return the primary key of this step transition
	*/
	@Override
	public long getPrimaryKey() {
		return _stepTransition.getPrimaryKey();
	}

	/**
	* Sets the primary key of this step transition.
	*
	* @param primaryKey the primary key of this step transition
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_stepTransition.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the step transition ID of this step transition.
	*
	* @return the step transition ID of this step transition
	*/
	@Override
	public long getStepTransitionId() {
		return _stepTransition.getStepTransitionId();
	}

	/**
	* Sets the step transition ID of this step transition.
	*
	* @param stepTransitionId the step transition ID of this step transition
	*/
	@Override
	public void setStepTransitionId(long stepTransitionId) {
		_stepTransition.setStepTransitionId(stepTransitionId);
	}

	/**
	* Returns the user ID of this step transition.
	*
	* @return the user ID of this step transition
	*/
	@Override
	public long getUserId() {
		return _stepTransition.getUserId();
	}

	/**
	* Sets the user ID of this step transition.
	*
	* @param userId the user ID of this step transition
	*/
	@Override
	public void setUserId(long userId) {
		_stepTransition.setUserId(userId);
	}

	/**
	* Returns the user uuid of this step transition.
	*
	* @return the user uuid of this step transition
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stepTransition.getUserUuid();
	}

	/**
	* Sets the user uuid of this step transition.
	*
	* @param userUuid the user uuid of this step transition
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_stepTransition.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this step transition.
	*
	* @return the group ID of this step transition
	*/
	@Override
	public long getGroupId() {
		return _stepTransition.getGroupId();
	}

	/**
	* Sets the group ID of this step transition.
	*
	* @param groupId the group ID of this step transition
	*/
	@Override
	public void setGroupId(long groupId) {
		_stepTransition.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this step transition.
	*
	* @return the company ID of this step transition
	*/
	@Override
	public long getCompanyId() {
		return _stepTransition.getCompanyId();
	}

	/**
	* Sets the company ID of this step transition.
	*
	* @param companyId the company ID of this step transition
	*/
	@Override
	public void setCompanyId(long companyId) {
		_stepTransition.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this step transition.
	*
	* @return the create date of this step transition
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _stepTransition.getCreateDate();
	}

	/**
	* Sets the create date of this step transition.
	*
	* @param createDate the create date of this step transition
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_stepTransition.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this step transition.
	*
	* @return the modified date of this step transition
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _stepTransition.getModifiedDate();
	}

	/**
	* Sets the modified date of this step transition.
	*
	* @param modifiedDate the modified date of this step transition
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_stepTransition.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the dossier process ID of this step transition.
	*
	* @return the dossier process ID of this step transition
	*/
	@Override
	public long getDossierProcessId() {
		return _stepTransition.getDossierProcessId();
	}

	/**
	* Sets the dossier process ID of this step transition.
	*
	* @param dossierProcessId the dossier process ID of this step transition
	*/
	@Override
	public void setDossierProcessId(long dossierProcessId) {
		_stepTransition.setDossierProcessId(dossierProcessId);
	}

	/**
	* Returns the pre dossier step ID of this step transition.
	*
	* @return the pre dossier step ID of this step transition
	*/
	@Override
	public long getPreDossierStepId() {
		return _stepTransition.getPreDossierStepId();
	}

	/**
	* Sets the pre dossier step ID of this step transition.
	*
	* @param preDossierStepId the pre dossier step ID of this step transition
	*/
	@Override
	public void setPreDossierStepId(long preDossierStepId) {
		_stepTransition.setPreDossierStepId(preDossierStepId);
	}

	/**
	* Returns the post dossier step ID of this step transition.
	*
	* @return the post dossier step ID of this step transition
	*/
	@Override
	public long getPostDossierStepId() {
		return _stepTransition.getPostDossierStepId();
	}

	/**
	* Sets the post dossier step ID of this step transition.
	*
	* @param postDossierStepId the post dossier step ID of this step transition
	*/
	@Override
	public void setPostDossierStepId(long postDossierStepId) {
		_stepTransition.setPostDossierStepId(postDossierStepId);
	}

	/**
	* Returns the precondition of this step transition.
	*
	* @return the precondition of this step transition
	*/
	@Override
	public java.lang.String getPrecondition() {
		return _stepTransition.getPrecondition();
	}

	/**
	* Sets the precondition of this step transition.
	*
	* @param precondition the precondition of this step transition
	*/
	@Override
	public void setPrecondition(java.lang.String precondition) {
		_stepTransition.setPrecondition(precondition);
	}

	/**
	* Returns the auto condition of this step transition.
	*
	* @return the auto condition of this step transition
	*/
	@Override
	public java.lang.String getAutoCondition() {
		return _stepTransition.getAutoCondition();
	}

	/**
	* Sets the auto condition of this step transition.
	*
	* @param autoCondition the auto condition of this step transition
	*/
	@Override
	public void setAutoCondition(java.lang.String autoCondition) {
		_stepTransition.setAutoCondition(autoCondition);
	}

	/**
	* Returns the transition name of this step transition.
	*
	* @return the transition name of this step transition
	*/
	@Override
	public java.lang.String getTransitionName() {
		return _stepTransition.getTransitionName();
	}

	/**
	* Sets the transition name of this step transition.
	*
	* @param transitionName the transition name of this step transition
	*/
	@Override
	public void setTransitionName(java.lang.String transitionName) {
		_stepTransition.setTransitionName(transitionName);
	}

	/**
	* Returns the dossier status of this step transition.
	*
	* @return the dossier status of this step transition
	*/
	@Override
	public java.lang.String getDossierStatus() {
		return _stepTransition.getDossierStatus();
	}

	/**
	* Sets the dossier status of this step transition.
	*
	* @param dossierStatus the dossier status of this step transition
	*/
	@Override
	public void setDossierStatus(java.lang.String dossierStatus) {
		_stepTransition.setDossierStatus(dossierStatus);
	}

	/**
	* Returns the notify status of this step transition.
	*
	* @return the notify status of this step transition
	*/
	@Override
	public int getNotifyStatus() {
		return _stepTransition.getNotifyStatus();
	}

	/**
	* Sets the notify status of this step transition.
	*
	* @param notifyStatus the notify status of this step transition
	*/
	@Override
	public void setNotifyStatus(int notifyStatus) {
		_stepTransition.setNotifyStatus(notifyStatus);
	}

	/**
	* Returns the send results of this step transition.
	*
	* @return the send results of this step transition
	*/
	@Override
	public int getSendResults() {
		return _stepTransition.getSendResults();
	}

	/**
	* Sets the send results of this step transition.
	*
	* @param sendResults the send results of this step transition
	*/
	@Override
	public void setSendResults(int sendResults) {
		_stepTransition.setSendResults(sendResults);
	}

	/**
	* Returns the request payment of this step transition.
	*
	* @return the request payment of this step transition
	*/
	@Override
	public int getRequestPayment() {
		return _stepTransition.getRequestPayment();
	}

	/**
	* Sets the request payment of this step transition.
	*
	* @param requestPayment the request payment of this step transition
	*/
	@Override
	public void setRequestPayment(int requestPayment) {
		_stepTransition.setRequestPayment(requestPayment);
	}

	/**
	* Returns the user assignment of this step transition.
	*
	* @return the user assignment of this step transition
	*/
	@Override
	public int getUserAssignment() {
		return _stepTransition.getUserAssignment();
	}

	/**
	* Sets the user assignment of this step transition.
	*
	* @param userAssignment the user assignment of this step transition
	*/
	@Override
	public void setUserAssignment(int userAssignment) {
		_stepTransition.setUserAssignment(userAssignment);
	}

	/**
	* Returns the new process order of this step transition.
	*
	* @return the new process order of this step transition
	*/
	@Override
	public int getNewProcessOrder() {
		return _stepTransition.getNewProcessOrder();
	}

	/**
	* Sets the new process order of this step transition.
	*
	* @param newProcessOrder the new process order of this step transition
	*/
	@Override
	public void setNewProcessOrder(int newProcessOrder) {
		_stepTransition.setNewProcessOrder(newProcessOrder);
	}

	@Override
	public boolean isNew() {
		return _stepTransition.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_stepTransition.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _stepTransition.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_stepTransition.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _stepTransition.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _stepTransition.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_stepTransition.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _stepTransition.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_stepTransition.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_stepTransition.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_stepTransition.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new StepTransitionWrapper((StepTransition)_stepTransition.clone());
	}

	@Override
	public int compareTo(
		org.oep.core.processmgt.model.StepTransition stepTransition) {
		return _stepTransition.compareTo(stepTransition);
	}

	@Override
	public int hashCode() {
		return _stepTransition.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.core.processmgt.model.StepTransition> toCacheModel() {
		return _stepTransition.toCacheModel();
	}

	@Override
	public org.oep.core.processmgt.model.StepTransition toEscapedModel() {
		return new StepTransitionWrapper(_stepTransition.toEscapedModel());
	}

	@Override
	public org.oep.core.processmgt.model.StepTransition toUnescapedModel() {
		return new StepTransitionWrapper(_stepTransition.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _stepTransition.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _stepTransition.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_stepTransition.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StepTransitionWrapper)) {
			return false;
		}

		StepTransitionWrapper stepTransitionWrapper = (StepTransitionWrapper)obj;

		if (Validator.equals(_stepTransition,
					stepTransitionWrapper._stepTransition)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public StepTransition getWrappedStepTransition() {
		return _stepTransition;
	}

	@Override
	public StepTransition getWrappedModel() {
		return _stepTransition;
	}

	@Override
	public void resetOriginalValues() {
		_stepTransition.resetOriginalValues();
	}

	private StepTransition _stepTransition;
}