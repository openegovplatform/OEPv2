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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DossierProcAgency}.
 * </p>
 *
 * @author trungdk
 * @see DossierProcAgency
 * @generated
 */
public class DossierProcAgencyWrapper implements DossierProcAgency,
	ModelWrapper<DossierProcAgency> {
	public DossierProcAgencyWrapper(DossierProcAgency dossierProcAgency) {
		_dossierProcAgency = dossierProcAgency;
	}

	@Override
	public Class<?> getModelClass() {
		return DossierProcAgency.class;
	}

	@Override
	public String getModelClassName() {
		return DossierProcAgency.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dossierProcAgencyId", getDossierProcAgencyId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dossierProcId", getDossierProcId());
		attributes.put("govAgencyId", getGovAgencyId());
		attributes.put("govAgencyName", getGovAgencyName());
		attributes.put("ebPartnerShipId", getEbPartnerShipId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dossierProcAgencyId = (Long)attributes.get("dossierProcAgencyId");

		if (dossierProcAgencyId != null) {
			setDossierProcAgencyId(dossierProcAgencyId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long dossierProcId = (Long)attributes.get("dossierProcId");

		if (dossierProcId != null) {
			setDossierProcId(dossierProcId);
		}

		String govAgencyId = (String)attributes.get("govAgencyId");

		if (govAgencyId != null) {
			setGovAgencyId(govAgencyId);
		}

		String govAgencyName = (String)attributes.get("govAgencyName");

		if (govAgencyName != null) {
			setGovAgencyName(govAgencyName);
		}

		Long ebPartnerShipId = (Long)attributes.get("ebPartnerShipId");

		if (ebPartnerShipId != null) {
			setEbPartnerShipId(ebPartnerShipId);
		}
	}

	/**
	* Returns the primary key of this dossier proc agency.
	*
	* @return the primary key of this dossier proc agency
	*/
	@Override
	public long getPrimaryKey() {
		return _dossierProcAgency.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dossier proc agency.
	*
	* @param primaryKey the primary key of this dossier proc agency
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dossierProcAgency.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the dossier proc agency ID of this dossier proc agency.
	*
	* @return the dossier proc agency ID of this dossier proc agency
	*/
	@Override
	public long getDossierProcAgencyId() {
		return _dossierProcAgency.getDossierProcAgencyId();
	}

	/**
	* Sets the dossier proc agency ID of this dossier proc agency.
	*
	* @param dossierProcAgencyId the dossier proc agency ID of this dossier proc agency
	*/
	@Override
	public void setDossierProcAgencyId(long dossierProcAgencyId) {
		_dossierProcAgency.setDossierProcAgencyId(dossierProcAgencyId);
	}

	/**
	* Returns the company ID of this dossier proc agency.
	*
	* @return the company ID of this dossier proc agency
	*/
	@Override
	public long getCompanyId() {
		return _dossierProcAgency.getCompanyId();
	}

	/**
	* Sets the company ID of this dossier proc agency.
	*
	* @param companyId the company ID of this dossier proc agency
	*/
	@Override
	public void setCompanyId(long companyId) {
		_dossierProcAgency.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this dossier proc agency.
	*
	* @return the create date of this dossier proc agency
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _dossierProcAgency.getCreateDate();
	}

	/**
	* Sets the create date of this dossier proc agency.
	*
	* @param createDate the create date of this dossier proc agency
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_dossierProcAgency.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this dossier proc agency.
	*
	* @return the modified date of this dossier proc agency
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dossierProcAgency.getModifiedDate();
	}

	/**
	* Sets the modified date of this dossier proc agency.
	*
	* @param modifiedDate the modified date of this dossier proc agency
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dossierProcAgency.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the dossier proc ID of this dossier proc agency.
	*
	* @return the dossier proc ID of this dossier proc agency
	*/
	@Override
	public long getDossierProcId() {
		return _dossierProcAgency.getDossierProcId();
	}

	/**
	* Sets the dossier proc ID of this dossier proc agency.
	*
	* @param dossierProcId the dossier proc ID of this dossier proc agency
	*/
	@Override
	public void setDossierProcId(long dossierProcId) {
		_dossierProcAgency.setDossierProcId(dossierProcId);
	}

	/**
	* Returns the gov agency ID of this dossier proc agency.
	*
	* @return the gov agency ID of this dossier proc agency
	*/
	@Override
	public java.lang.String getGovAgencyId() {
		return _dossierProcAgency.getGovAgencyId();
	}

	/**
	* Sets the gov agency ID of this dossier proc agency.
	*
	* @param govAgencyId the gov agency ID of this dossier proc agency
	*/
	@Override
	public void setGovAgencyId(java.lang.String govAgencyId) {
		_dossierProcAgency.setGovAgencyId(govAgencyId);
	}

	/**
	* Returns the gov agency name of this dossier proc agency.
	*
	* @return the gov agency name of this dossier proc agency
	*/
	@Override
	public java.lang.String getGovAgencyName() {
		return _dossierProcAgency.getGovAgencyName();
	}

	/**
	* Sets the gov agency name of this dossier proc agency.
	*
	* @param govAgencyName the gov agency name of this dossier proc agency
	*/
	@Override
	public void setGovAgencyName(java.lang.String govAgencyName) {
		_dossierProcAgency.setGovAgencyName(govAgencyName);
	}

	/**
	* Returns the eb partner ship ID of this dossier proc agency.
	*
	* @return the eb partner ship ID of this dossier proc agency
	*/
	@Override
	public long getEbPartnerShipId() {
		return _dossierProcAgency.getEbPartnerShipId();
	}

	/**
	* Sets the eb partner ship ID of this dossier proc agency.
	*
	* @param ebPartnerShipId the eb partner ship ID of this dossier proc agency
	*/
	@Override
	public void setEbPartnerShipId(long ebPartnerShipId) {
		_dossierProcAgency.setEbPartnerShipId(ebPartnerShipId);
	}

	@Override
	public boolean isNew() {
		return _dossierProcAgency.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dossierProcAgency.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dossierProcAgency.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dossierProcAgency.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dossierProcAgency.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dossierProcAgency.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dossierProcAgency.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dossierProcAgency.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dossierProcAgency.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dossierProcAgency.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dossierProcAgency.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DossierProcAgencyWrapper((DossierProcAgency)_dossierProcAgency.clone());
	}

	@Override
	public int compareTo(
		org.oep.core.dossiermgt.model.DossierProcAgency dossierProcAgency) {
		return _dossierProcAgency.compareTo(dossierProcAgency);
	}

	@Override
	public int hashCode() {
		return _dossierProcAgency.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.core.dossiermgt.model.DossierProcAgency> toCacheModel() {
		return _dossierProcAgency.toCacheModel();
	}

	@Override
	public org.oep.core.dossiermgt.model.DossierProcAgency toEscapedModel() {
		return new DossierProcAgencyWrapper(_dossierProcAgency.toEscapedModel());
	}

	@Override
	public org.oep.core.dossiermgt.model.DossierProcAgency toUnescapedModel() {
		return new DossierProcAgencyWrapper(_dossierProcAgency.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dossierProcAgency.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dossierProcAgency.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dossierProcAgency.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DossierProcAgencyWrapper)) {
			return false;
		}

		DossierProcAgencyWrapper dossierProcAgencyWrapper = (DossierProcAgencyWrapper)obj;

		if (Validator.equals(_dossierProcAgency,
					dossierProcAgencyWrapper._dossierProcAgency)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DossierProcAgency getWrappedDossierProcAgency() {
		return _dossierProcAgency;
	}

	@Override
	public DossierProcAgency getWrappedModel() {
		return _dossierProcAgency;
	}

	@Override
	public void resetOriginalValues() {
		_dossierProcAgency.resetOriginalValues();
	}

	private DossierProcAgency _dossierProcAgency;
}