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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the DossierStep service. Represents a row in the &quot;oep_processmgt_dossierstep&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.processmgt.model.impl.DossierStepModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.processmgt.model.impl.DossierStepImpl}.
 * </p>
 *
 * @author trungdk
 * @see DossierStep
 * @see org.oep.processmgt.model.impl.DossierStepImpl
 * @see org.oep.processmgt.model.impl.DossierStepModelImpl
 * @generated
 */
public interface DossierStepModel extends BaseModel<DossierStep> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dossier step model instance should use the {@link DossierStep} interface instead.
	 */

	/**
	 * Returns the primary key of this dossier step.
	 *
	 * @return the primary key of this dossier step
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this dossier step.
	 *
	 * @param primaryKey the primary key of this dossier step
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the dossier step ID of this dossier step.
	 *
	 * @return the dossier step ID of this dossier step
	 */
	public long getDossierStepId();

	/**
	 * Sets the dossier step ID of this dossier step.
	 *
	 * @param dossierStepId the dossier step ID of this dossier step
	 */
	public void setDossierStepId(long dossierStepId);

	/**
	 * Returns the user ID of this dossier step.
	 *
	 * @return the user ID of this dossier step
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this dossier step.
	 *
	 * @param userId the user ID of this dossier step
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this dossier step.
	 *
	 * @return the user uuid of this dossier step
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this dossier step.
	 *
	 * @param userUuid the user uuid of this dossier step
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the group ID of this dossier step.
	 *
	 * @return the group ID of this dossier step
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this dossier step.
	 *
	 * @param groupId the group ID of this dossier step
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this dossier step.
	 *
	 * @return the company ID of this dossier step
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this dossier step.
	 *
	 * @param companyId the company ID of this dossier step
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the create date of this dossier step.
	 *
	 * @return the create date of this dossier step
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this dossier step.
	 *
	 * @param createDate the create date of this dossier step
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this dossier step.
	 *
	 * @return the modified date of this dossier step
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this dossier step.
	 *
	 * @param modifiedDate the modified date of this dossier step
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the dossier process ID of this dossier step.
	 *
	 * @return the dossier process ID of this dossier step
	 */
	public long getDossierProcessId();

	/**
	 * Sets the dossier process ID of this dossier step.
	 *
	 * @param dossierProcessId the dossier process ID of this dossier step
	 */
	public void setDossierProcessId(long dossierProcessId);

	/**
	 * Returns the title of this dossier step.
	 *
	 * @return the title of this dossier step
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this dossier step.
	 *
	 * @param title the title of this dossier step
	 */
	public void setTitle(String title);

	/**
	 * Returns the sequence no of this dossier step.
	 *
	 * @return the sequence no of this dossier step
	 */
	public int getSequenceNo();

	/**
	 * Sets the sequence no of this dossier step.
	 *
	 * @param sequenceNo the sequence no of this dossier step
	 */
	public void setSequenceNo(int sequenceNo);

	/**
	 * Returns the days duration of this dossier step.
	 *
	 * @return the days duration of this dossier step
	 */
	public int getDaysDuration();

	/**
	 * Sets the days duration of this dossier step.
	 *
	 * @param daysDuration the days duration of this dossier step
	 */
	public void setDaysDuration(int daysDuration);

	/**
	 * Returns the do form of this dossier step.
	 *
	 * @return the do form of this dossier step
	 */
	@AutoEscape
	public String getDoForm();

	/**
	 * Sets the do form of this dossier step.
	 *
	 * @param doForm the do form of this dossier step
	 */
	public void setDoForm(String doForm);

	/**
	 * Returns the form label of this dossier step.
	 *
	 * @return the form label of this dossier step
	 */
	@AutoEscape
	public String getFormLabel();

	/**
	 * Sets the form label of this dossier step.
	 *
	 * @param formLabel the form label of this dossier step
	 */
	public void setFormLabel(String formLabel);

	/**
	 * Returns the rollback of this dossier step.
	 *
	 * @return the rollback of this dossier step
	 */
	public int getRollback();

	/**
	 * Sets the rollback of this dossier step.
	 *
	 * @param rollback the rollback of this dossier step
	 */
	public void setRollback(int rollback);

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
	public int compareTo(DossierStep dossierStep);

	@Override
	public int hashCode();

	@Override
	public CacheModel<DossierStep> toCacheModel();

	@Override
	public DossierStep toEscapedModel();

	@Override
	public DossierStep toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}