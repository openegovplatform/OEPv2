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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the DossierTag service. Represents a row in the &quot;oep_dossiermgt_dossiertag&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.dossiermgt.model.impl.DossierTagModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.dossiermgt.model.impl.DossierTagImpl}.
 * </p>
 *
 * @author trungdk
 * @see DossierTag
 * @see org.oep.dossiermgt.model.impl.DossierTagImpl
 * @see org.oep.dossiermgt.model.impl.DossierTagModelImpl
 * @generated
 */
public interface DossierTagModel extends BaseModel<DossierTag> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dossier tag model instance should use the {@link DossierTag} interface instead.
	 */

	/**
	 * Returns the primary key of this dossier tag.
	 *
	 * @return the primary key of this dossier tag
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this dossier tag.
	 *
	 * @param primaryKey the primary key of this dossier tag
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the dossier tag ID of this dossier tag.
	 *
	 * @return the dossier tag ID of this dossier tag
	 */
	public long getDossierTagId();

	/**
	 * Sets the dossier tag ID of this dossier tag.
	 *
	 * @param dossierTagId the dossier tag ID of this dossier tag
	 */
	public void setDossierTagId(long dossierTagId);

	/**
	 * Returns the user ID of this dossier tag.
	 *
	 * @return the user ID of this dossier tag
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this dossier tag.
	 *
	 * @param userId the user ID of this dossier tag
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this dossier tag.
	 *
	 * @return the user uuid of this dossier tag
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this dossier tag.
	 *
	 * @param userUuid the user uuid of this dossier tag
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the group ID of this dossier tag.
	 *
	 * @return the group ID of this dossier tag
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this dossier tag.
	 *
	 * @param groupId the group ID of this dossier tag
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this dossier tag.
	 *
	 * @return the company ID of this dossier tag
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this dossier tag.
	 *
	 * @param companyId the company ID of this dossier tag
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the create date of this dossier tag.
	 *
	 * @return the create date of this dossier tag
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this dossier tag.
	 *
	 * @param createDate the create date of this dossier tag
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the dossier ID of this dossier tag.
	 *
	 * @return the dossier ID of this dossier tag
	 */
	public long getDossierId();

	/**
	 * Sets the dossier ID of this dossier tag.
	 *
	 * @param dossierId the dossier ID of this dossier tag
	 */
	public void setDossierId(long dossierId);

	/**
	 * Returns the tag of this dossier tag.
	 *
	 * @return the tag of this dossier tag
	 */
	@AutoEscape
	public String getTag();

	/**
	 * Sets the tag of this dossier tag.
	 *
	 * @param tag the tag of this dossier tag
	 */
	public void setTag(String tag);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(DossierTag dossierTag);

	@Override
	public int hashCode();

	@Override
	public CacheModel<DossierTag> toCacheModel();

	@Override
	public DossierTag toEscapedModel();

	@Override
	public DossierTag toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}