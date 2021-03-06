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
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the DossierProcAgency service. Represents a row in the &quot;oep_dossiermgt_dossierprocagent&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.core.dossiermgt.model.impl.DossierProcAgencyModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.core.dossiermgt.model.impl.DossierProcAgencyImpl}.
 * </p>
 *
 * @author trungdk
 * @see DossierProcAgency
 * @see org.oep.core.dossiermgt.model.impl.DossierProcAgencyImpl
 * @see org.oep.core.dossiermgt.model.impl.DossierProcAgencyModelImpl
 * @generated
 */
public interface DossierProcAgencyModel extends BaseModel<DossierProcAgency> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dossier proc agency model instance should use the {@link DossierProcAgency} interface instead.
	 */

	/**
	 * Returns the primary key of this dossier proc agency.
	 *
	 * @return the primary key of this dossier proc agency
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this dossier proc agency.
	 *
	 * @param primaryKey the primary key of this dossier proc agency
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the dossier proc agency ID of this dossier proc agency.
	 *
	 * @return the dossier proc agency ID of this dossier proc agency
	 */
	public long getDossierProcAgencyId();

	/**
	 * Sets the dossier proc agency ID of this dossier proc agency.
	 *
	 * @param dossierProcAgencyId the dossier proc agency ID of this dossier proc agency
	 */
	public void setDossierProcAgencyId(long dossierProcAgencyId);

	/**
	 * Returns the company ID of this dossier proc agency.
	 *
	 * @return the company ID of this dossier proc agency
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this dossier proc agency.
	 *
	 * @param companyId the company ID of this dossier proc agency
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the create date of this dossier proc agency.
	 *
	 * @return the create date of this dossier proc agency
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this dossier proc agency.
	 *
	 * @param createDate the create date of this dossier proc agency
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this dossier proc agency.
	 *
	 * @return the modified date of this dossier proc agency
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this dossier proc agency.
	 *
	 * @param modifiedDate the modified date of this dossier proc agency
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the dossier proc ID of this dossier proc agency.
	 *
	 * @return the dossier proc ID of this dossier proc agency
	 */
	public long getDossierProcId();

	/**
	 * Sets the dossier proc ID of this dossier proc agency.
	 *
	 * @param dossierProcId the dossier proc ID of this dossier proc agency
	 */
	public void setDossierProcId(long dossierProcId);

	/**
	 * Returns the gov agency ID of this dossier proc agency.
	 *
	 * @return the gov agency ID of this dossier proc agency
	 */
	@AutoEscape
	public String getGovAgencyId();

	/**
	 * Sets the gov agency ID of this dossier proc agency.
	 *
	 * @param govAgencyId the gov agency ID of this dossier proc agency
	 */
	public void setGovAgencyId(String govAgencyId);

	/**
	 * Returns the gov agency name of this dossier proc agency.
	 *
	 * @return the gov agency name of this dossier proc agency
	 */
	@AutoEscape
	public String getGovAgencyName();

	/**
	 * Sets the gov agency name of this dossier proc agency.
	 *
	 * @param govAgencyName the gov agency name of this dossier proc agency
	 */
	public void setGovAgencyName(String govAgencyName);

	/**
	 * Returns the eb partner ship ID of this dossier proc agency.
	 *
	 * @return the eb partner ship ID of this dossier proc agency
	 */
	public long getEbPartnerShipId();

	/**
	 * Sets the eb partner ship ID of this dossier proc agency.
	 *
	 * @param ebPartnerShipId the eb partner ship ID of this dossier proc agency
	 */
	public void setEbPartnerShipId(long ebPartnerShipId);

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
	public int compareTo(DossierProcAgency dossierProcAgency);

	@Override
	public int hashCode();

	@Override
	public CacheModel<DossierProcAgency> toCacheModel();

	@Override
	public DossierProcAgency toEscapedModel();

	@Override
	public DossierProcAgency toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}