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

package org.oep.core.dossiermgt.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the DocFile service. Represents a row in the &quot;oep_dossiermgt_docfile&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.core.dossiermgt.model.impl.DocFileModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.core.dossiermgt.model.impl.DocFileImpl}.
 * </p>
 *
 * @author trungdk
 * @see DocFile
 * @see org.oep.core.dossiermgt.model.impl.DocFileImpl
 * @see org.oep.core.dossiermgt.model.impl.DocFileModelImpl
 * @generated
 */
public interface DocFileModel extends BaseModel<DocFile>, StagedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a doc file model instance should use the {@link DocFile} interface instead.
	 */

	/**
	 * Returns the primary key of this doc file.
	 *
	 * @return the primary key of this doc file
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this doc file.
	 *
	 * @param primaryKey the primary key of this doc file
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this doc file.
	 *
	 * @return the uuid of this doc file
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this doc file.
	 *
	 * @param uuid the uuid of this doc file
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the doc file ID of this doc file.
	 *
	 * @return the doc file ID of this doc file
	 */
	public long getDocFileId();

	/**
	 * Sets the doc file ID of this doc file.
	 *
	 * @param docFileId the doc file ID of this doc file
	 */
	public void setDocFileId(long docFileId);

	/**
	 * Returns the user ID of this doc file.
	 *
	 * @return the user ID of this doc file
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this doc file.
	 *
	 * @param userId the user ID of this doc file
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this doc file.
	 *
	 * @return the user uuid of this doc file
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this doc file.
	 *
	 * @param userUuid the user uuid of this doc file
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the group ID of this doc file.
	 *
	 * @return the group ID of this doc file
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this doc file.
	 *
	 * @param groupId the group ID of this doc file
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this doc file.
	 *
	 * @return the company ID of this doc file
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this doc file.
	 *
	 * @param companyId the company ID of this doc file
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the create date of this doc file.
	 *
	 * @return the create date of this doc file
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this doc file.
	 *
	 * @param createDate the create date of this doc file
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this doc file.
	 *
	 * @return the modified date of this doc file
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this doc file.
	 *
	 * @param modifiedDate the modified date of this doc file
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the dossier ID of this doc file.
	 *
	 * @return the dossier ID of this doc file
	 */
	public long getDossierId();

	/**
	 * Sets the dossier ID of this doc file.
	 *
	 * @param dossierId the dossier ID of this doc file
	 */
	public void setDossierId(long dossierId);

	/**
	 * Returns the dossier doc ID of this doc file.
	 *
	 * @return the dossier doc ID of this doc file
	 */
	public long getDossierDocId();

	/**
	 * Sets the dossier doc ID of this doc file.
	 *
	 * @param dossierDocId the dossier doc ID of this doc file
	 */
	public void setDossierDocId(long dossierDocId);

	/**
	 * Returns the doc template ID of this doc file.
	 *
	 * @return the doc template ID of this doc file
	 */
	public long getDocTemplateId();

	/**
	 * Sets the doc template ID of this doc file.
	 *
	 * @param docTemplateId the doc template ID of this doc file
	 */
	public void setDocTemplateId(long docTemplateId);

	/**
	 * Returns the doc file version ID of this doc file.
	 *
	 * @return the doc file version ID of this doc file
	 */
	public long getDocFileVersionId();

	/**
	 * Sets the doc file version ID of this doc file.
	 *
	 * @param docFileVersionId the doc file version ID of this doc file
	 */
	public void setDocFileVersionId(long docFileVersionId);

	/**
	 * Returns the doc file name of this doc file.
	 *
	 * @return the doc file name of this doc file
	 */
	@AutoEscape
	public String getDocFileName();

	/**
	 * Sets the doc file name of this doc file.
	 *
	 * @param docFileName the doc file name of this doc file
	 */
	public void setDocFileName(String docFileName);

	/**
	 * Returns the doc file type of this doc file.
	 *
	 * @return the doc file type of this doc file
	 */
	public long getDocFileType();

	/**
	 * Sets the doc file type of this doc file.
	 *
	 * @param docFileType the doc file type of this doc file
	 */
	public void setDocFileType(long docFileType);

	/**
	 * Returns the verify status of this doc file.
	 *
	 * @return the verify status of this doc file
	 */
	public int getVerifyStatus();

	/**
	 * Sets the verify status of this doc file.
	 *
	 * @param verifyStatus the verify status of this doc file
	 */
	public void setVerifyStatus(int verifyStatus);

	/**
	 * Returns the note of this doc file.
	 *
	 * @return the note of this doc file
	 */
	@AutoEscape
	public String getNote();

	/**
	 * Sets the note of this doc file.
	 *
	 * @param note the note of this doc file
	 */
	public void setNote(String note);

	/**
	 * Returns the approve by of this doc file.
	 *
	 * @return the approve by of this doc file
	 */
	@AutoEscape
	public String getApproveBy();

	/**
	 * Sets the approve by of this doc file.
	 *
	 * @param approveBy the approve by of this doc file
	 */
	public void setApproveBy(String approveBy);

	/**
	 * Returns the approve date of this doc file.
	 *
	 * @return the approve date of this doc file
	 */
	public Date getApproveDate();

	/**
	 * Sets the approve date of this doc file.
	 *
	 * @param approveDate the approve date of this doc file
	 */
	public void setApproveDate(Date approveDate);

	/**
	 * Returns the premier of this doc file.
	 *
	 * @return the premier of this doc file
	 */
	public int getPremier();

	/**
	 * Sets the premier of this doc file.
	 *
	 * @param premier the premier of this doc file
	 */
	public void setPremier(int premier);

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
	public int compareTo(DocFile docFile);

	@Override
	public int hashCode();

	@Override
	public CacheModel<DocFile> toCacheModel();

	@Override
	public DocFile toEscapedModel();

	@Override
	public DocFile toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}