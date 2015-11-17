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
 * This class is a wrapper for {@link DossierTag}.
 * </p>
 *
 * @author trungdk
 * @see DossierTag
 * @generated
 */
public class DossierTagWrapper implements DossierTag, ModelWrapper<DossierTag> {
	public DossierTagWrapper(DossierTag dossierTag) {
		_dossierTag = dossierTag;
	}

	@Override
	public Class<?> getModelClass() {
		return DossierTag.class;
	}

	@Override
	public String getModelClassName() {
		return DossierTag.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dossierTagId", getDossierTagId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("dossierId", getDossierId());
		attributes.put("tag", getTag());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dossierTagId = (Long)attributes.get("dossierTagId");

		if (dossierTagId != null) {
			setDossierTagId(dossierTagId);
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

		String tag = (String)attributes.get("tag");

		if (tag != null) {
			setTag(tag);
		}
	}

	/**
	* Returns the primary key of this dossier tag.
	*
	* @return the primary key of this dossier tag
	*/
	@Override
	public long getPrimaryKey() {
		return _dossierTag.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dossier tag.
	*
	* @param primaryKey the primary key of this dossier tag
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dossierTag.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the dossier tag ID of this dossier tag.
	*
	* @return the dossier tag ID of this dossier tag
	*/
	@Override
	public long getDossierTagId() {
		return _dossierTag.getDossierTagId();
	}

	/**
	* Sets the dossier tag ID of this dossier tag.
	*
	* @param dossierTagId the dossier tag ID of this dossier tag
	*/
	@Override
	public void setDossierTagId(long dossierTagId) {
		_dossierTag.setDossierTagId(dossierTagId);
	}

	/**
	* Returns the user ID of this dossier tag.
	*
	* @return the user ID of this dossier tag
	*/
	@Override
	public long getUserId() {
		return _dossierTag.getUserId();
	}

	/**
	* Sets the user ID of this dossier tag.
	*
	* @param userId the user ID of this dossier tag
	*/
	@Override
	public void setUserId(long userId) {
		_dossierTag.setUserId(userId);
	}

	/**
	* Returns the user uuid of this dossier tag.
	*
	* @return the user uuid of this dossier tag
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierTag.getUserUuid();
	}

	/**
	* Sets the user uuid of this dossier tag.
	*
	* @param userUuid the user uuid of this dossier tag
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_dossierTag.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this dossier tag.
	*
	* @return the group ID of this dossier tag
	*/
	@Override
	public long getGroupId() {
		return _dossierTag.getGroupId();
	}

	/**
	* Sets the group ID of this dossier tag.
	*
	* @param groupId the group ID of this dossier tag
	*/
	@Override
	public void setGroupId(long groupId) {
		_dossierTag.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this dossier tag.
	*
	* @return the company ID of this dossier tag
	*/
	@Override
	public long getCompanyId() {
		return _dossierTag.getCompanyId();
	}

	/**
	* Sets the company ID of this dossier tag.
	*
	* @param companyId the company ID of this dossier tag
	*/
	@Override
	public void setCompanyId(long companyId) {
		_dossierTag.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this dossier tag.
	*
	* @return the create date of this dossier tag
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _dossierTag.getCreateDate();
	}

	/**
	* Sets the create date of this dossier tag.
	*
	* @param createDate the create date of this dossier tag
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_dossierTag.setCreateDate(createDate);
	}

	/**
	* Returns the dossier ID of this dossier tag.
	*
	* @return the dossier ID of this dossier tag
	*/
	@Override
	public long getDossierId() {
		return _dossierTag.getDossierId();
	}

	/**
	* Sets the dossier ID of this dossier tag.
	*
	* @param dossierId the dossier ID of this dossier tag
	*/
	@Override
	public void setDossierId(long dossierId) {
		_dossierTag.setDossierId(dossierId);
	}

	/**
	* Returns the tag of this dossier tag.
	*
	* @return the tag of this dossier tag
	*/
	@Override
	public java.lang.String getTag() {
		return _dossierTag.getTag();
	}

	/**
	* Sets the tag of this dossier tag.
	*
	* @param tag the tag of this dossier tag
	*/
	@Override
	public void setTag(java.lang.String tag) {
		_dossierTag.setTag(tag);
	}

	@Override
	public boolean isNew() {
		return _dossierTag.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dossierTag.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dossierTag.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dossierTag.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dossierTag.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dossierTag.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dossierTag.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dossierTag.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dossierTag.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dossierTag.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dossierTag.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DossierTagWrapper((DossierTag)_dossierTag.clone());
	}

	@Override
	public int compareTo(org.oep.dossiermgt.model.DossierTag dossierTag) {
		return _dossierTag.compareTo(dossierTag);
	}

	@Override
	public int hashCode() {
		return _dossierTag.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.dossiermgt.model.DossierTag> toCacheModel() {
		return _dossierTag.toCacheModel();
	}

	@Override
	public org.oep.dossiermgt.model.DossierTag toEscapedModel() {
		return new DossierTagWrapper(_dossierTag.toEscapedModel());
	}

	@Override
	public org.oep.dossiermgt.model.DossierTag toUnescapedModel() {
		return new DossierTagWrapper(_dossierTag.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dossierTag.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dossierTag.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dossierTag.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DossierTagWrapper)) {
			return false;
		}

		DossierTagWrapper dossierTagWrapper = (DossierTagWrapper)obj;

		if (Validator.equals(_dossierTag, dossierTagWrapper._dossierTag)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DossierTag getWrappedDossierTag() {
		return _dossierTag;
	}

	@Override
	public DossierTag getWrappedModel() {
		return _dossierTag;
	}

	@Override
	public void resetOriginalValues() {
		_dossierTag.resetOriginalValues();
	}

	private DossierTag _dossierTag;
}