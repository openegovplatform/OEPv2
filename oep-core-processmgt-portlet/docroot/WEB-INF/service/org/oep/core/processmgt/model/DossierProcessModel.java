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

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the DossierProcess service. Represents a row in the &quot;oep_processmgt_dossierprocess&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.core.processmgt.model.impl.DossierProcessModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.core.processmgt.model.impl.DossierProcessImpl}.
 * </p>
 *
 * @author trungdk
 * @see DossierProcess
 * @see org.oep.core.processmgt.model.impl.DossierProcessImpl
 * @see org.oep.core.processmgt.model.impl.DossierProcessModelImpl
 * @generated
 */
public interface DossierProcessModel extends BaseModel<DossierProcess> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dossier process model instance should use the {@link DossierProcess} interface instead.
	 */

	/**
	 * Returns the primary key of this dossier process.
	 *
	 * @return the primary key of this dossier process
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this dossier process.
	 *
	 * @param primaryKey the primary key of this dossier process
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the dossier process ID of this dossier process.
	 *
	 * @return the dossier process ID of this dossier process
	 */
	public long getDossierProcessId();

	/**
	 * Sets the dossier process ID of this dossier process.
	 *
	 * @param dossierProcessId the dossier process ID of this dossier process
	 */
	public void setDossierProcessId(long dossierProcessId);

	/**
	 * Returns the user ID of this dossier process.
	 *
	 * @return the user ID of this dossier process
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this dossier process.
	 *
	 * @param userId the user ID of this dossier process
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this dossier process.
	 *
	 * @return the user uuid of this dossier process
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this dossier process.
	 *
	 * @param userUuid the user uuid of this dossier process
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the group ID of this dossier process.
	 *
	 * @return the group ID of this dossier process
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this dossier process.
	 *
	 * @param groupId the group ID of this dossier process
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this dossier process.
	 *
	 * @return the company ID of this dossier process
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this dossier process.
	 *
	 * @param companyId the company ID of this dossier process
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the create date of this dossier process.
	 *
	 * @return the create date of this dossier process
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this dossier process.
	 *
	 * @param createDate the create date of this dossier process
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this dossier process.
	 *
	 * @return the modified date of this dossier process
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this dossier process.
	 *
	 * @param modifiedDate the modified date of this dossier process
	 */
	public void setModifiedDate(Date modifiedDate);

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
	public int compareTo(DossierProcess dossierProcess);

	@Override
	public int hashCode();

	@Override
	public CacheModel<DossierProcess> toCacheModel();

	@Override
	public DossierProcess toEscapedModel();

	@Override
	public DossierProcess toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}