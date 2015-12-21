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

package org.oep.processmgt.model;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the CreateFile service. Represents a row in the &quot;oep_processmgt_createfile&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.processmgt.model.impl.CreateFileModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.processmgt.model.impl.CreateFileImpl}.
 * </p>
 *
 * @author trungdk
 * @see CreateFile
 * @see org.oep.processmgt.model.impl.CreateFileImpl
 * @see org.oep.processmgt.model.impl.CreateFileModelImpl
 * @generated
 */
public interface CreateFileModel extends BaseModel<CreateFile> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a create file model instance should use the {@link CreateFile} interface instead.
	 */

	/**
	 * Returns the primary key of this create file.
	 *
	 * @return the primary key of this create file
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this create file.
	 *
	 * @param primaryKey the primary key of this create file
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the create file ID of this create file.
	 *
	 * @return the create file ID of this create file
	 */
	public long getCreateFileId();

	/**
	 * Sets the create file ID of this create file.
	 *
	 * @param createFileId the create file ID of this create file
	 */
	public void setCreateFileId(long createFileId);

	/**
	 * Returns the user ID of this create file.
	 *
	 * @return the user ID of this create file
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this create file.
	 *
	 * @param userId the user ID of this create file
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this create file.
	 *
	 * @return the user uuid of this create file
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this create file.
	 *
	 * @param userUuid the user uuid of this create file
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the group ID of this create file.
	 *
	 * @return the group ID of this create file
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this create file.
	 *
	 * @param groupId the group ID of this create file
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this create file.
	 *
	 * @return the company ID of this create file
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this create file.
	 *
	 * @param companyId the company ID of this create file
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the create date of this create file.
	 *
	 * @return the create date of this create file
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this create file.
	 *
	 * @param createDate the create date of this create file
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the process order ID of this create file.
	 *
	 * @return the process order ID of this create file
	 */
	public long getProcessOrderId();

	/**
	 * Sets the process order ID of this create file.
	 *
	 * @param processOrderId the process order ID of this create file
	 */
	public void setProcessOrderId(long processOrderId);

	/**
	 * Returns the dossier step ID of this create file.
	 *
	 * @return the dossier step ID of this create file
	 */
	public long getDossierStepId();

	/**
	 * Sets the dossier step ID of this create file.
	 *
	 * @param dossierStepId the dossier step ID of this create file
	 */
	public void setDossierStepId(long dossierStepId);

	/**
	 * Returns the step date of this create file.
	 *
	 * @return the step date of this create file
	 */
	public Date getStepDate();

	/**
	 * Sets the step date of this create file.
	 *
	 * @param stepDate the step date of this create file
	 */
	public void setStepDate(Date stepDate);

	/**
	 * Returns the doc file ID of this create file.
	 *
	 * @return the doc file ID of this create file
	 */
	public long getDocFileId();

	/**
	 * Sets the doc file ID of this create file.
	 *
	 * @param docFileId the doc file ID of this create file
	 */
	public void setDocFileId(long docFileId);

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
	public int compareTo(CreateFile createFile);

	@Override
	public int hashCode();

	@Override
	public CacheModel<CreateFile> toCacheModel();

	@Override
	public CreateFile toEscapedModel();

	@Override
	public CreateFile toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}