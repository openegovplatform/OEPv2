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
 * This class is a wrapper for {@link TransitionHistory}.
 * </p>
 *
 * @author trungdk
 * @see TransitionHistory
 * @generated
 */
public class TransitionHistoryWrapper implements TransitionHistory,
	ModelWrapper<TransitionHistory> {
	public TransitionHistoryWrapper(TransitionHistory transitionHistory) {
		_transitionHistory = transitionHistory;
	}

	@Override
	public Class<?> getModelClass() {
		return TransitionHistory.class;
	}

	@Override
	public String getModelClassName() {
		return TransitionHistory.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("transitionHistoryId", getTransitionHistoryId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("dossierId", getDossierId());
		attributes.put("processOrderId", getProcessOrderId());
		attributes.put("daysDoing", getDaysDoing());
		attributes.put("daysDelay", getDaysDelay());
		attributes.put("startDate", getStartDate());
		attributes.put("preDossierStatus", getPreDossierStatus());
		attributes.put("postDossierStatus", getPostDossierStatus());
		attributes.put("stepTransitionId", getStepTransitionId());
		attributes.put("preDossierStepId", getPreDossierStepId());
		attributes.put("postDossierStepId", getPostDossierStepId());
		attributes.put("transitionName", getTransitionName());
		attributes.put("note", getNote());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long transitionHistoryId = (Long)attributes.get("transitionHistoryId");

		if (transitionHistoryId != null) {
			setTransitionHistoryId(transitionHistoryId);
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

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		Long processOrderId = (Long)attributes.get("processOrderId");

		if (processOrderId != null) {
			setProcessOrderId(processOrderId);
		}

		Integer daysDoing = (Integer)attributes.get("daysDoing");

		if (daysDoing != null) {
			setDaysDoing(daysDoing);
		}

		Integer daysDelay = (Integer)attributes.get("daysDelay");

		if (daysDelay != null) {
			setDaysDelay(daysDelay);
		}

		Date startDate = (Date)attributes.get("startDate");

		if (startDate != null) {
			setStartDate(startDate);
		}

		String preDossierStatus = (String)attributes.get("preDossierStatus");

		if (preDossierStatus != null) {
			setPreDossierStatus(preDossierStatus);
		}

		String postDossierStatus = (String)attributes.get("postDossierStatus");

		if (postDossierStatus != null) {
			setPostDossierStatus(postDossierStatus);
		}

		Long stepTransitionId = (Long)attributes.get("stepTransitionId");

		if (stepTransitionId != null) {
			setStepTransitionId(stepTransitionId);
		}

		Long preDossierStepId = (Long)attributes.get("preDossierStepId");

		if (preDossierStepId != null) {
			setPreDossierStepId(preDossierStepId);
		}

		Long postDossierStepId = (Long)attributes.get("postDossierStepId");

		if (postDossierStepId != null) {
			setPostDossierStepId(postDossierStepId);
		}

		String transitionName = (String)attributes.get("transitionName");

		if (transitionName != null) {
			setTransitionName(transitionName);
		}

		String note = (String)attributes.get("note");

		if (note != null) {
			setNote(note);
		}
	}

	/**
	* Returns the primary key of this transition history.
	*
	* @return the primary key of this transition history
	*/
	@Override
	public long getPrimaryKey() {
		return _transitionHistory.getPrimaryKey();
	}

	/**
	* Sets the primary key of this transition history.
	*
	* @param primaryKey the primary key of this transition history
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_transitionHistory.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the transition history ID of this transition history.
	*
	* @return the transition history ID of this transition history
	*/
	@Override
	public long getTransitionHistoryId() {
		return _transitionHistory.getTransitionHistoryId();
	}

	/**
	* Sets the transition history ID of this transition history.
	*
	* @param transitionHistoryId the transition history ID of this transition history
	*/
	@Override
	public void setTransitionHistoryId(long transitionHistoryId) {
		_transitionHistory.setTransitionHistoryId(transitionHistoryId);
	}

	/**
	* Returns the user ID of this transition history.
	*
	* @return the user ID of this transition history
	*/
	@Override
	public long getUserId() {
		return _transitionHistory.getUserId();
	}

	/**
	* Sets the user ID of this transition history.
	*
	* @param userId the user ID of this transition history
	*/
	@Override
	public void setUserId(long userId) {
		_transitionHistory.setUserId(userId);
	}

	/**
	* Returns the user uuid of this transition history.
	*
	* @return the user uuid of this transition history
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _transitionHistory.getUserUuid();
	}

	/**
	* Sets the user uuid of this transition history.
	*
	* @param userUuid the user uuid of this transition history
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_transitionHistory.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this transition history.
	*
	* @return the group ID of this transition history
	*/
	@Override
	public long getGroupId() {
		return _transitionHistory.getGroupId();
	}

	/**
	* Sets the group ID of this transition history.
	*
	* @param groupId the group ID of this transition history
	*/
	@Override
	public void setGroupId(long groupId) {
		_transitionHistory.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this transition history.
	*
	* @return the company ID of this transition history
	*/
	@Override
	public long getCompanyId() {
		return _transitionHistory.getCompanyId();
	}

	/**
	* Sets the company ID of this transition history.
	*
	* @param companyId the company ID of this transition history
	*/
	@Override
	public void setCompanyId(long companyId) {
		_transitionHistory.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this transition history.
	*
	* @return the create date of this transition history
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _transitionHistory.getCreateDate();
	}

	/**
	* Sets the create date of this transition history.
	*
	* @param createDate the create date of this transition history
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_transitionHistory.setCreateDate(createDate);
	}

	/**
	* Returns the dossier ID of this transition history.
	*
	* @return the dossier ID of this transition history
	*/
	@Override
	public long getDossierId() {
		return _transitionHistory.getDossierId();
	}

	/**
	* Sets the dossier ID of this transition history.
	*
	* @param dossierId the dossier ID of this transition history
	*/
	@Override
	public void setDossierId(long dossierId) {
		_transitionHistory.setDossierId(dossierId);
	}

	/**
	* Returns the process order ID of this transition history.
	*
	* @return the process order ID of this transition history
	*/
	@Override
	public long getProcessOrderId() {
		return _transitionHistory.getProcessOrderId();
	}

	/**
	* Sets the process order ID of this transition history.
	*
	* @param processOrderId the process order ID of this transition history
	*/
	@Override
	public void setProcessOrderId(long processOrderId) {
		_transitionHistory.setProcessOrderId(processOrderId);
	}

	/**
	* Returns the days doing of this transition history.
	*
	* @return the days doing of this transition history
	*/
	@Override
	public int getDaysDoing() {
		return _transitionHistory.getDaysDoing();
	}

	/**
	* Sets the days doing of this transition history.
	*
	* @param daysDoing the days doing of this transition history
	*/
	@Override
	public void setDaysDoing(int daysDoing) {
		_transitionHistory.setDaysDoing(daysDoing);
	}

	/**
	* Returns the days delay of this transition history.
	*
	* @return the days delay of this transition history
	*/
	@Override
	public int getDaysDelay() {
		return _transitionHistory.getDaysDelay();
	}

	/**
	* Sets the days delay of this transition history.
	*
	* @param daysDelay the days delay of this transition history
	*/
	@Override
	public void setDaysDelay(int daysDelay) {
		_transitionHistory.setDaysDelay(daysDelay);
	}

	/**
	* Returns the start date of this transition history.
	*
	* @return the start date of this transition history
	*/
	@Override
	public java.util.Date getStartDate() {
		return _transitionHistory.getStartDate();
	}

	/**
	* Sets the start date of this transition history.
	*
	* @param startDate the start date of this transition history
	*/
	@Override
	public void setStartDate(java.util.Date startDate) {
		_transitionHistory.setStartDate(startDate);
	}

	/**
	* Returns the pre dossier status of this transition history.
	*
	* @return the pre dossier status of this transition history
	*/
	@Override
	public java.lang.String getPreDossierStatus() {
		return _transitionHistory.getPreDossierStatus();
	}

	/**
	* Sets the pre dossier status of this transition history.
	*
	* @param preDossierStatus the pre dossier status of this transition history
	*/
	@Override
	public void setPreDossierStatus(java.lang.String preDossierStatus) {
		_transitionHistory.setPreDossierStatus(preDossierStatus);
	}

	/**
	* Returns the post dossier status of this transition history.
	*
	* @return the post dossier status of this transition history
	*/
	@Override
	public java.lang.String getPostDossierStatus() {
		return _transitionHistory.getPostDossierStatus();
	}

	/**
	* Sets the post dossier status of this transition history.
	*
	* @param postDossierStatus the post dossier status of this transition history
	*/
	@Override
	public void setPostDossierStatus(java.lang.String postDossierStatus) {
		_transitionHistory.setPostDossierStatus(postDossierStatus);
	}

	/**
	* Returns the step transition ID of this transition history.
	*
	* @return the step transition ID of this transition history
	*/
	@Override
	public long getStepTransitionId() {
		return _transitionHistory.getStepTransitionId();
	}

	/**
	* Sets the step transition ID of this transition history.
	*
	* @param stepTransitionId the step transition ID of this transition history
	*/
	@Override
	public void setStepTransitionId(long stepTransitionId) {
		_transitionHistory.setStepTransitionId(stepTransitionId);
	}

	/**
	* Returns the pre dossier step ID of this transition history.
	*
	* @return the pre dossier step ID of this transition history
	*/
	@Override
	public long getPreDossierStepId() {
		return _transitionHistory.getPreDossierStepId();
	}

	/**
	* Sets the pre dossier step ID of this transition history.
	*
	* @param preDossierStepId the pre dossier step ID of this transition history
	*/
	@Override
	public void setPreDossierStepId(long preDossierStepId) {
		_transitionHistory.setPreDossierStepId(preDossierStepId);
	}

	/**
	* Returns the post dossier step ID of this transition history.
	*
	* @return the post dossier step ID of this transition history
	*/
	@Override
	public long getPostDossierStepId() {
		return _transitionHistory.getPostDossierStepId();
	}

	/**
	* Sets the post dossier step ID of this transition history.
	*
	* @param postDossierStepId the post dossier step ID of this transition history
	*/
	@Override
	public void setPostDossierStepId(long postDossierStepId) {
		_transitionHistory.setPostDossierStepId(postDossierStepId);
	}

	/**
	* Returns the transition name of this transition history.
	*
	* @return the transition name of this transition history
	*/
	@Override
	public java.lang.String getTransitionName() {
		return _transitionHistory.getTransitionName();
	}

	/**
	* Sets the transition name of this transition history.
	*
	* @param transitionName the transition name of this transition history
	*/
	@Override
	public void setTransitionName(java.lang.String transitionName) {
		_transitionHistory.setTransitionName(transitionName);
	}

	/**
	* Returns the note of this transition history.
	*
	* @return the note of this transition history
	*/
	@Override
	public java.lang.String getNote() {
		return _transitionHistory.getNote();
	}

	/**
	* Sets the note of this transition history.
	*
	* @param note the note of this transition history
	*/
	@Override
	public void setNote(java.lang.String note) {
		_transitionHistory.setNote(note);
	}

	@Override
	public boolean isNew() {
		return _transitionHistory.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_transitionHistory.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _transitionHistory.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_transitionHistory.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _transitionHistory.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _transitionHistory.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_transitionHistory.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _transitionHistory.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_transitionHistory.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_transitionHistory.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_transitionHistory.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TransitionHistoryWrapper((TransitionHistory)_transitionHistory.clone());
	}

	@Override
	public int compareTo(
		org.oep.core.processmgt.model.TransitionHistory transitionHistory) {
		return _transitionHistory.compareTo(transitionHistory);
	}

	@Override
	public int hashCode() {
		return _transitionHistory.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.core.processmgt.model.TransitionHistory> toCacheModel() {
		return _transitionHistory.toCacheModel();
	}

	@Override
	public org.oep.core.processmgt.model.TransitionHistory toEscapedModel() {
		return new TransitionHistoryWrapper(_transitionHistory.toEscapedModel());
	}

	@Override
	public org.oep.core.processmgt.model.TransitionHistory toUnescapedModel() {
		return new TransitionHistoryWrapper(_transitionHistory.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _transitionHistory.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _transitionHistory.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_transitionHistory.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TransitionHistoryWrapper)) {
			return false;
		}

		TransitionHistoryWrapper transitionHistoryWrapper = (TransitionHistoryWrapper)obj;

		if (Validator.equals(_transitionHistory,
					transitionHistoryWrapper._transitionHistory)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TransitionHistory getWrappedTransitionHistory() {
		return _transitionHistory;
	}

	@Override
	public TransitionHistory getWrappedModel() {
		return _transitionHistory;
	}

	@Override
	public void resetOriginalValues() {
		_transitionHistory.resetOriginalValues();
	}

	private TransitionHistory _transitionHistory;
}