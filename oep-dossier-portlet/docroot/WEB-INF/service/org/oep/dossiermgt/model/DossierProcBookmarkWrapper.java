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

package org.oep.dossiermgt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DossierProcBookmark}.
 * </p>
 *
 * @author trungdk
 * @see DossierProcBookmark
 * @generated
 */
public class DossierProcBookmarkWrapper implements DossierProcBookmark,
	ModelWrapper<DossierProcBookmark> {
	public DossierProcBookmarkWrapper(DossierProcBookmark dossierProcBookmark) {
		_dossierProcBookmark = dossierProcBookmark;
	}

	@Override
	public Class<?> getModelClass() {
		return DossierProcBookmark.class;
	}

	@Override
	public String getModelClassName() {
		return DossierProcBookmark.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dossierProcBookmarkId", getDossierProcBookmarkId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("dossierProcAgentId", getDossierProcAgentId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dossierProcBookmarkId = (Long)attributes.get(
				"dossierProcBookmarkId");

		if (dossierProcBookmarkId != null) {
			setDossierProcBookmarkId(dossierProcBookmarkId);
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

		Long dossierProcAgentId = (Long)attributes.get("dossierProcAgentId");

		if (dossierProcAgentId != null) {
			setDossierProcAgentId(dossierProcAgentId);
		}
	}

	/**
	* Returns the primary key of this dossier proc bookmark.
	*
	* @return the primary key of this dossier proc bookmark
	*/
	@Override
	public long getPrimaryKey() {
		return _dossierProcBookmark.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dossier proc bookmark.
	*
	* @param primaryKey the primary key of this dossier proc bookmark
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dossierProcBookmark.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the dossier proc bookmark ID of this dossier proc bookmark.
	*
	* @return the dossier proc bookmark ID of this dossier proc bookmark
	*/
	@Override
	public long getDossierProcBookmarkId() {
		return _dossierProcBookmark.getDossierProcBookmarkId();
	}

	/**
	* Sets the dossier proc bookmark ID of this dossier proc bookmark.
	*
	* @param dossierProcBookmarkId the dossier proc bookmark ID of this dossier proc bookmark
	*/
	@Override
	public void setDossierProcBookmarkId(long dossierProcBookmarkId) {
		_dossierProcBookmark.setDossierProcBookmarkId(dossierProcBookmarkId);
	}

	/**
	* Returns the user ID of this dossier proc bookmark.
	*
	* @return the user ID of this dossier proc bookmark
	*/
	@Override
	public long getUserId() {
		return _dossierProcBookmark.getUserId();
	}

	/**
	* Sets the user ID of this dossier proc bookmark.
	*
	* @param userId the user ID of this dossier proc bookmark
	*/
	@Override
	public void setUserId(long userId) {
		_dossierProcBookmark.setUserId(userId);
	}

	/**
	* Returns the user uuid of this dossier proc bookmark.
	*
	* @return the user uuid of this dossier proc bookmark
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcBookmark.getUserUuid();
	}

	/**
	* Sets the user uuid of this dossier proc bookmark.
	*
	* @param userUuid the user uuid of this dossier proc bookmark
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_dossierProcBookmark.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this dossier proc bookmark.
	*
	* @return the group ID of this dossier proc bookmark
	*/
	@Override
	public long getGroupId() {
		return _dossierProcBookmark.getGroupId();
	}

	/**
	* Sets the group ID of this dossier proc bookmark.
	*
	* @param groupId the group ID of this dossier proc bookmark
	*/
	@Override
	public void setGroupId(long groupId) {
		_dossierProcBookmark.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this dossier proc bookmark.
	*
	* @return the company ID of this dossier proc bookmark
	*/
	@Override
	public long getCompanyId() {
		return _dossierProcBookmark.getCompanyId();
	}

	/**
	* Sets the company ID of this dossier proc bookmark.
	*
	* @param companyId the company ID of this dossier proc bookmark
	*/
	@Override
	public void setCompanyId(long companyId) {
		_dossierProcBookmark.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this dossier proc bookmark.
	*
	* @return the create date of this dossier proc bookmark
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _dossierProcBookmark.getCreateDate();
	}

	/**
	* Sets the create date of this dossier proc bookmark.
	*
	* @param createDate the create date of this dossier proc bookmark
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_dossierProcBookmark.setCreateDate(createDate);
	}

	/**
	* Returns the dossier proc agent ID of this dossier proc bookmark.
	*
	* @return the dossier proc agent ID of this dossier proc bookmark
	*/
	@Override
	public long getDossierProcAgentId() {
		return _dossierProcBookmark.getDossierProcAgentId();
	}

	/**
	* Sets the dossier proc agent ID of this dossier proc bookmark.
	*
	* @param dossierProcAgentId the dossier proc agent ID of this dossier proc bookmark
	*/
	@Override
	public void setDossierProcAgentId(long dossierProcAgentId) {
		_dossierProcBookmark.setDossierProcAgentId(dossierProcAgentId);
	}

	@Override
	public boolean isNew() {
		return _dossierProcBookmark.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dossierProcBookmark.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dossierProcBookmark.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dossierProcBookmark.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dossierProcBookmark.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dossierProcBookmark.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dossierProcBookmark.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dossierProcBookmark.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dossierProcBookmark.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dossierProcBookmark.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dossierProcBookmark.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DossierProcBookmarkWrapper((DossierProcBookmark)_dossierProcBookmark.clone());
	}

	@Override
	public int compareTo(
		org.oep.dossiermgt.model.DossierProcBookmark dossierProcBookmark) {
		return _dossierProcBookmark.compareTo(dossierProcBookmark);
	}

	@Override
	public int hashCode() {
		return _dossierProcBookmark.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.dossiermgt.model.DossierProcBookmark> toCacheModel() {
		return _dossierProcBookmark.toCacheModel();
	}

	@Override
	public org.oep.dossiermgt.model.DossierProcBookmark toEscapedModel() {
		return new DossierProcBookmarkWrapper(_dossierProcBookmark.toEscapedModel());
	}

	@Override
	public org.oep.dossiermgt.model.DossierProcBookmark toUnescapedModel() {
		return new DossierProcBookmarkWrapper(_dossierProcBookmark.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dossierProcBookmark.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dossierProcBookmark.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dossierProcBookmark.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DossierProcBookmarkWrapper)) {
			return false;
		}

		DossierProcBookmarkWrapper dossierProcBookmarkWrapper = (DossierProcBookmarkWrapper)obj;

		if (Validator.equals(_dossierProcBookmark,
					dossierProcBookmarkWrapper._dossierProcBookmark)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DossierProcBookmark getWrappedDossierProcBookmark() {
		return _dossierProcBookmark;
	}

	@Override
	public DossierProcBookmark getWrappedModel() {
		return _dossierProcBookmark;
	}

	@Override
	public void resetOriginalValues() {
		_dossierProcBookmark.resetOriginalValues();
	}

	private DossierProcBookmark _dossierProcBookmark;
}