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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DossierDoc2Template}.
 * </p>
 *
 * @author trungdk
 * @see DossierDoc2Template
 * @generated
 */
public class DossierDoc2TemplateWrapper implements DossierDoc2Template,
	ModelWrapper<DossierDoc2Template> {
	public DossierDoc2TemplateWrapper(DossierDoc2Template dossierDoc2Template) {
		_dossierDoc2Template = dossierDoc2Template;
	}

	@Override
	public Class<?> getModelClass() {
		return DossierDoc2Template.class;
	}

	@Override
	public String getModelClassName() {
		return DossierDoc2Template.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("companyId", getCompanyId());
		attributes.put("dossierDocId", getDossierDocId());
		attributes.put("docTemplateId", getDocTemplateId());
		attributes.put("sequenceNo", getSequenceNo());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long dossierDocId = (Long)attributes.get("dossierDocId");

		if (dossierDocId != null) {
			setDossierDocId(dossierDocId);
		}

		Long docTemplateId = (Long)attributes.get("docTemplateId");

		if (docTemplateId != null) {
			setDocTemplateId(docTemplateId);
		}

		Integer sequenceNo = (Integer)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}
	}

	/**
	* Returns the primary key of this dossier doc2 template.
	*
	* @return the primary key of this dossier doc2 template
	*/
	@Override
	public long getPrimaryKey() {
		return _dossierDoc2Template.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dossier doc2 template.
	*
	* @param primaryKey the primary key of this dossier doc2 template
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dossierDoc2Template.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dossier doc2 template.
	*
	* @return the ID of this dossier doc2 template
	*/
	@Override
	public long getId() {
		return _dossierDoc2Template.getId();
	}

	/**
	* Sets the ID of this dossier doc2 template.
	*
	* @param id the ID of this dossier doc2 template
	*/
	@Override
	public void setId(long id) {
		_dossierDoc2Template.setId(id);
	}

	/**
	* Returns the company ID of this dossier doc2 template.
	*
	* @return the company ID of this dossier doc2 template
	*/
	@Override
	public long getCompanyId() {
		return _dossierDoc2Template.getCompanyId();
	}

	/**
	* Sets the company ID of this dossier doc2 template.
	*
	* @param companyId the company ID of this dossier doc2 template
	*/
	@Override
	public void setCompanyId(long companyId) {
		_dossierDoc2Template.setCompanyId(companyId);
	}

	/**
	* Returns the dossier doc ID of this dossier doc2 template.
	*
	* @return the dossier doc ID of this dossier doc2 template
	*/
	@Override
	public long getDossierDocId() {
		return _dossierDoc2Template.getDossierDocId();
	}

	/**
	* Sets the dossier doc ID of this dossier doc2 template.
	*
	* @param dossierDocId the dossier doc ID of this dossier doc2 template
	*/
	@Override
	public void setDossierDocId(long dossierDocId) {
		_dossierDoc2Template.setDossierDocId(dossierDocId);
	}

	/**
	* Returns the doc template ID of this dossier doc2 template.
	*
	* @return the doc template ID of this dossier doc2 template
	*/
	@Override
	public long getDocTemplateId() {
		return _dossierDoc2Template.getDocTemplateId();
	}

	/**
	* Sets the doc template ID of this dossier doc2 template.
	*
	* @param docTemplateId the doc template ID of this dossier doc2 template
	*/
	@Override
	public void setDocTemplateId(long docTemplateId) {
		_dossierDoc2Template.setDocTemplateId(docTemplateId);
	}

	/**
	* Returns the sequence no of this dossier doc2 template.
	*
	* @return the sequence no of this dossier doc2 template
	*/
	@Override
	public int getSequenceNo() {
		return _dossierDoc2Template.getSequenceNo();
	}

	/**
	* Sets the sequence no of this dossier doc2 template.
	*
	* @param sequenceNo the sequence no of this dossier doc2 template
	*/
	@Override
	public void setSequenceNo(int sequenceNo) {
		_dossierDoc2Template.setSequenceNo(sequenceNo);
	}

	@Override
	public boolean isNew() {
		return _dossierDoc2Template.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dossierDoc2Template.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dossierDoc2Template.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dossierDoc2Template.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dossierDoc2Template.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dossierDoc2Template.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dossierDoc2Template.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dossierDoc2Template.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dossierDoc2Template.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dossierDoc2Template.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dossierDoc2Template.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DossierDoc2TemplateWrapper((DossierDoc2Template)_dossierDoc2Template.clone());
	}

	@Override
	public int compareTo(DossierDoc2Template dossierDoc2Template) {
		return _dossierDoc2Template.compareTo(dossierDoc2Template);
	}

	@Override
	public int hashCode() {
		return _dossierDoc2Template.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<DossierDoc2Template> toCacheModel() {
		return _dossierDoc2Template.toCacheModel();
	}

	@Override
	public DossierDoc2Template toEscapedModel() {
		return new DossierDoc2TemplateWrapper(_dossierDoc2Template.toEscapedModel());
	}

	@Override
	public DossierDoc2Template toUnescapedModel() {
		return new DossierDoc2TemplateWrapper(_dossierDoc2Template.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dossierDoc2Template.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dossierDoc2Template.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dossierDoc2Template.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DossierDoc2TemplateWrapper)) {
			return false;
		}

		DossierDoc2TemplateWrapper dossierDoc2TemplateWrapper = (DossierDoc2TemplateWrapper)obj;

		if (Validator.equals(_dossierDoc2Template,
					dossierDoc2TemplateWrapper._dossierDoc2Template)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DossierDoc2Template getWrappedDossierDoc2Template() {
		return _dossierDoc2Template;
	}

	@Override
	public DossierDoc2Template getWrappedModel() {
		return _dossierDoc2Template;
	}

	@Override
	public void resetOriginalValues() {
		_dossierDoc2Template.resetOriginalValues();
	}

	private DossierDoc2Template _dossierDoc2Template;
}