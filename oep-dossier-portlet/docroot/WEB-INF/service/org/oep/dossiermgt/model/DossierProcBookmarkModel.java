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

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the DossierProcBookmark service. Represents a row in the &quot;oep_dossiermgt_dossierprocbookmark&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.dossiermgt.model.impl.DossierProcBookmarkModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.dossiermgt.model.impl.DossierProcBookmarkImpl}.
 * </p>
 *
 * @author trungdk
 * @see DossierProcBookmark
 * @see org.oep.dossiermgt.model.impl.DossierProcBookmarkImpl
 * @see org.oep.dossiermgt.model.impl.DossierProcBookmarkModelImpl
 * @generated
 */
public interface DossierProcBookmarkModel extends BaseModel<DossierProcBookmark> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dossier proc bookmark model instance should use the {@link DossierProcBookmark} interface instead.
	 */

	/**
	 * Returns the primary key of this dossier proc bookmark.
	 *
	 * @return the primary key of this dossier proc bookmark
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this dossier proc bookmark.
	 *
	 * @param primaryKey the primary key of this dossier proc bookmark
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the dossier proc bookmark ID of this dossier proc bookmark.
	 *
	 * @return the dossier proc bookmark ID of this dossier proc bookmark
	 */
	public long getDossierProcBookmarkId();

	/**
	 * Sets the dossier proc bookmark ID of this dossier proc bookmark.
	 *
	 * @param dossierProcBookmarkId the dossier proc bookmark ID of this dossier proc bookmark
	 */
	public void setDossierProcBookmarkId(long dossierProcBookmarkId);

	/**
	 * Returns the user ID of this dossier proc bookmark.
	 *
	 * @return the user ID of this dossier proc bookmark
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this dossier proc bookmark.
	 *
	 * @param userId the user ID of this dossier proc bookmark
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this dossier proc bookmark.
	 *
	 * @return the user uuid of this dossier proc bookmark
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this dossier proc bookmark.
	 *
	 * @param userUuid the user uuid of this dossier proc bookmark
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the group ID of this dossier proc bookmark.
	 *
	 * @return the group ID of this dossier proc bookmark
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this dossier proc bookmark.
	 *
	 * @param groupId the group ID of this dossier proc bookmark
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this dossier proc bookmark.
	 *
	 * @return the company ID of this dossier proc bookmark
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this dossier proc bookmark.
	 *
	 * @param companyId the company ID of this dossier proc bookmark
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the create date of this dossier proc bookmark.
	 *
	 * @return the create date of this dossier proc bookmark
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this dossier proc bookmark.
	 *
	 * @param createDate the create date of this dossier proc bookmark
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the dossier proc agent ID of this dossier proc bookmark.
	 *
	 * @return the dossier proc agent ID of this dossier proc bookmark
	 */
	public long getDossierProcAgentId();

	/**
	 * Sets the dossier proc agent ID of this dossier proc bookmark.
	 *
	 * @param dossierProcAgentId the dossier proc agent ID of this dossier proc bookmark
	 */
	public void setDossierProcAgentId(long dossierProcAgentId);

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
	public int compareTo(DossierProcBookmark dossierProcBookmark);

	@Override
	public int hashCode();

	@Override
	public CacheModel<DossierProcBookmark> toCacheModel();

	@Override
	public DossierProcBookmark toEscapedModel();

	@Override
	public DossierProcBookmark toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}