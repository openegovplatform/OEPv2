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
 * The base model interface for the DocFileVersion service. Represents a row in the &quot;oep_dossiermgt_docfileversion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.dossiermgt.model.impl.DocFileVersionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.dossiermgt.model.impl.DocFileVersionImpl}.
 * </p>
 *
 * @author trungdk
 * @see DocFileVersion
 * @see org.oep.dossiermgt.model.impl.DocFileVersionImpl
 * @see org.oep.dossiermgt.model.impl.DocFileVersionModelImpl
 * @generated
 */
public interface DocFileVersionModel extends BaseModel<DocFileVersion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a doc file version model instance should use the {@link DocFileVersion} interface instead.
	 */

	/**
	 * Returns the primary key of this doc file version.
	 *
	 * @return the primary key of this doc file version
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this doc file version.
	 *
	 * @param primaryKey the primary key of this doc file version
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this doc file version.
	 *
	 * @return the uuid of this doc file version
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this doc file version.
	 *
	 * @param uuid the uuid of this doc file version
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the doc file version ID of this doc file version.
	 *
	 * @return the doc file version ID of this doc file version
	 */
	public long getDocFileVersionId();

	/**
	 * Sets the doc file version ID of this doc file version.
	 *
	 * @param docFileVersionId the doc file version ID of this doc file version
	 */
	public void setDocFileVersionId(long docFileVersionId);

	/**
	 * Returns the user ID of this doc file version.
	 *
	 * @return the user ID of this doc file version
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this doc file version.
	 *
	 * @param userId the user ID of this doc file version
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this doc file version.
	 *
	 * @return the user uuid of this doc file version
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this doc file version.
	 *
	 * @param userUuid the user uuid of this doc file version
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the group ID of this doc file version.
	 *
	 * @return the group ID of this doc file version
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this doc file version.
	 *
	 * @param groupId the group ID of this doc file version
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this doc file version.
	 *
	 * @return the company ID of this doc file version
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this doc file version.
	 *
	 * @param companyId the company ID of this doc file version
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the create date of this doc file version.
	 *
	 * @return the create date of this doc file version
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this doc file version.
	 *
	 * @param createDate the create date of this doc file version
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the doc file ID of this doc file version.
	 *
	 * @return the doc file ID of this doc file version
	 */
	public long getDocFileId();

	/**
	 * Sets the doc file ID of this doc file version.
	 *
	 * @param docFileId the doc file ID of this doc file version
	 */
	public void setDocFileId(long docFileId);

	/**
	 * Returns the file entry ID of this doc file version.
	 *
	 * @return the file entry ID of this doc file version
	 */
	public long getFileEntryId();

	/**
	 * Sets the file entry ID of this doc file version.
	 *
	 * @param fileEntryId the file entry ID of this doc file version
	 */
	public void setFileEntryId(long fileEntryId);

	/**
	 * Returns the xml content of this doc file version.
	 *
	 * @return the xml content of this doc file version
	 */
	@AutoEscape
	public String getXmlContent();

	/**
	 * Sets the xml content of this doc file version.
	 *
	 * @param xmlContent the xml content of this doc file version
	 */
	public void setXmlContent(String xmlContent);

	/**
	 * Returns the eb message ID of this doc file version.
	 *
	 * @return the eb message ID of this doc file version
	 */
	public long getEbMessageId();

	/**
	 * Sets the eb message ID of this doc file version.
	 *
	 * @param ebMessageId the eb message ID of this doc file version
	 */
	public void setEbMessageId(long ebMessageId);

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
	public int compareTo(DocFileVersion docFileVersion);

	@Override
	public int hashCode();

	@Override
	public CacheModel<DocFileVersion> toCacheModel();

	@Override
	public DocFileVersion toEscapedModel();

	@Override
	public DocFileVersion toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}