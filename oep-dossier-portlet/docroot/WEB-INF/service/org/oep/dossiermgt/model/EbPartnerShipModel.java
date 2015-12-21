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
 * The base model interface for the EbPartnerShip service. Represents a row in the &quot;oep_dossiermgt_ebpartnership&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.dossiermgt.model.impl.EbPartnerShipModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.dossiermgt.model.impl.EbPartnerShipImpl}.
 * </p>
 *
 * @author trungdk
 * @see EbPartnerShip
 * @see org.oep.dossiermgt.model.impl.EbPartnerShipImpl
 * @see org.oep.dossiermgt.model.impl.EbPartnerShipModelImpl
 * @generated
 */
public interface EbPartnerShipModel extends BaseModel<EbPartnerShip> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a eb partner ship model instance should use the {@link EbPartnerShip} interface instead.
	 */

	/**
	 * Returns the primary key of this eb partner ship.
	 *
	 * @return the primary key of this eb partner ship
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this eb partner ship.
	 *
	 * @param primaryKey the primary key of this eb partner ship
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the eb partner ship ID of this eb partner ship.
	 *
	 * @return the eb partner ship ID of this eb partner ship
	 */
	public long getEbPartnerShipId();

	/**
	 * Sets the eb partner ship ID of this eb partner ship.
	 *
	 * @param ebPartnerShipId the eb partner ship ID of this eb partner ship
	 */
	public void setEbPartnerShipId(long ebPartnerShipId);

	/**
	 * Returns the company ID of this eb partner ship.
	 *
	 * @return the company ID of this eb partner ship
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this eb partner ship.
	 *
	 * @param companyId the company ID of this eb partner ship
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this eb partner ship.
	 *
	 * @return the user ID of this eb partner ship
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this eb partner ship.
	 *
	 * @param userId the user ID of this eb partner ship
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this eb partner ship.
	 *
	 * @return the user uuid of this eb partner ship
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this eb partner ship.
	 *
	 * @param userUuid the user uuid of this eb partner ship
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the group ID of this eb partner ship.
	 *
	 * @return the group ID of this eb partner ship
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this eb partner ship.
	 *
	 * @param groupId the group ID of this eb partner ship
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the create date of this eb partner ship.
	 *
	 * @return the create date of this eb partner ship
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this eb partner ship.
	 *
	 * @param createDate the create date of this eb partner ship
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the name of this eb partner ship.
	 *
	 * @return the name of this eb partner ship
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this eb partner ship.
	 *
	 * @param name the name of this eb partner ship
	 */
	public void setName(String name);

	/**
	 * Returns the cpa ID of this eb partner ship.
	 *
	 * @return the cpa ID of this eb partner ship
	 */
	@AutoEscape
	public String getCpaId();

	/**
	 * Sets the cpa ID of this eb partner ship.
	 *
	 * @param cpaId the cpa ID of this eb partner ship
	 */
	public void setCpaId(String cpaId);

	/**
	 * Returns the service of this eb partner ship.
	 *
	 * @return the service of this eb partner ship
	 */
	@AutoEscape
	public String getService();

	/**
	 * Sets the service of this eb partner ship.
	 *
	 * @param service the service of this eb partner ship
	 */
	public void setService(String service);

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
	public int compareTo(EbPartnerShip ebPartnerShip);

	@Override
	public int hashCode();

	@Override
	public CacheModel<EbPartnerShip> toCacheModel();

	@Override
	public EbPartnerShip toEscapedModel();

	@Override
	public EbPartnerShip toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}