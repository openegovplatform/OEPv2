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

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the DossierDoc2Template service. Represents a row in the &quot;oep_dossiermgt_DossierDoc2Template&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.core.dossiermgt.model.impl.DossierDoc2TemplateModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.core.dossiermgt.model.impl.DossierDoc2TemplateImpl}.
 * </p>
 *
 * @author trungdk
 * @see DossierDoc2Template
 * @see org.oep.core.dossiermgt.model.impl.DossierDoc2TemplateImpl
 * @see org.oep.core.dossiermgt.model.impl.DossierDoc2TemplateModelImpl
 * @generated
 */
public interface DossierDoc2TemplateModel extends BaseModel<DossierDoc2Template> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dossier doc2 template model instance should use the {@link DossierDoc2Template} interface instead.
	 */

	/**
	 * Returns the primary key of this dossier doc2 template.
	 *
	 * @return the primary key of this dossier doc2 template
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this dossier doc2 template.
	 *
	 * @param primaryKey the primary key of this dossier doc2 template
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this dossier doc2 template.
	 *
	 * @return the ID of this dossier doc2 template
	 */
	public long getId();

	/**
	 * Sets the ID of this dossier doc2 template.
	 *
	 * @param id the ID of this dossier doc2 template
	 */
	public void setId(long id);

	/**
	 * Returns the company ID of this dossier doc2 template.
	 *
	 * @return the company ID of this dossier doc2 template
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this dossier doc2 template.
	 *
	 * @param companyId the company ID of this dossier doc2 template
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the dossier doc ID of this dossier doc2 template.
	 *
	 * @return the dossier doc ID of this dossier doc2 template
	 */
	public long getDossierDocId();

	/**
	 * Sets the dossier doc ID of this dossier doc2 template.
	 *
	 * @param dossierDocId the dossier doc ID of this dossier doc2 template
	 */
	public void setDossierDocId(long dossierDocId);

	/**
	 * Returns the doc template ID of this dossier doc2 template.
	 *
	 * @return the doc template ID of this dossier doc2 template
	 */
	public long getDocTemplateId();

	/**
	 * Sets the doc template ID of this dossier doc2 template.
	 *
	 * @param docTemplateId the doc template ID of this dossier doc2 template
	 */
	public void setDocTemplateId(long docTemplateId);

	/**
	 * Returns the sequence no of this dossier doc2 template.
	 *
	 * @return the sequence no of this dossier doc2 template
	 */
	public int getSequenceNo();

	/**
	 * Sets the sequence no of this dossier doc2 template.
	 *
	 * @param sequenceNo the sequence no of this dossier doc2 template
	 */
	public void setSequenceNo(int sequenceNo);

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
	public int compareTo(DossierDoc2Template dossierDoc2Template);

	@Override
	public int hashCode();

	@Override
	public CacheModel<DossierDoc2Template> toCacheModel();

	@Override
	public DossierDoc2Template toEscapedModel();

	@Override
	public DossierDoc2Template toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}