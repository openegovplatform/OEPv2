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
 * This class is a wrapper for {@link EbPartnerShip}.
 * </p>
 *
 * @author trungdk
 * @see EbPartnerShip
 * @generated
 */
public class EbPartnerShipWrapper implements EbPartnerShip,
	ModelWrapper<EbPartnerShip> {
	public EbPartnerShipWrapper(EbPartnerShip ebPartnerShip) {
		_ebPartnerShip = ebPartnerShip;
	}

	@Override
	public Class<?> getModelClass() {
		return EbPartnerShip.class;
	}

	@Override
	public String getModelClassName() {
		return EbPartnerShip.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ebPartnerShipId", getEbPartnerShipId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("createDate", getCreateDate());
		attributes.put("name", getName());
		attributes.put("cpaId", getCpaId());
		attributes.put("service", getService());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ebPartnerShipId = (Long)attributes.get("ebPartnerShipId");

		if (ebPartnerShipId != null) {
			setEbPartnerShipId(ebPartnerShipId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String cpaId = (String)attributes.get("cpaId");

		if (cpaId != null) {
			setCpaId(cpaId);
		}

		String service = (String)attributes.get("service");

		if (service != null) {
			setService(service);
		}
	}

	/**
	* Returns the primary key of this eb partner ship.
	*
	* @return the primary key of this eb partner ship
	*/
	@Override
	public long getPrimaryKey() {
		return _ebPartnerShip.getPrimaryKey();
	}

	/**
	* Sets the primary key of this eb partner ship.
	*
	* @param primaryKey the primary key of this eb partner ship
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_ebPartnerShip.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the eb partner ship ID of this eb partner ship.
	*
	* @return the eb partner ship ID of this eb partner ship
	*/
	@Override
	public long getEbPartnerShipId() {
		return _ebPartnerShip.getEbPartnerShipId();
	}

	/**
	* Sets the eb partner ship ID of this eb partner ship.
	*
	* @param ebPartnerShipId the eb partner ship ID of this eb partner ship
	*/
	@Override
	public void setEbPartnerShipId(long ebPartnerShipId) {
		_ebPartnerShip.setEbPartnerShipId(ebPartnerShipId);
	}

	/**
	* Returns the company ID of this eb partner ship.
	*
	* @return the company ID of this eb partner ship
	*/
	@Override
	public long getCompanyId() {
		return _ebPartnerShip.getCompanyId();
	}

	/**
	* Sets the company ID of this eb partner ship.
	*
	* @param companyId the company ID of this eb partner ship
	*/
	@Override
	public void setCompanyId(long companyId) {
		_ebPartnerShip.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this eb partner ship.
	*
	* @return the user ID of this eb partner ship
	*/
	@Override
	public long getUserId() {
		return _ebPartnerShip.getUserId();
	}

	/**
	* Sets the user ID of this eb partner ship.
	*
	* @param userId the user ID of this eb partner ship
	*/
	@Override
	public void setUserId(long userId) {
		_ebPartnerShip.setUserId(userId);
	}

	/**
	* Returns the user uuid of this eb partner ship.
	*
	* @return the user uuid of this eb partner ship
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ebPartnerShip.getUserUuid();
	}

	/**
	* Sets the user uuid of this eb partner ship.
	*
	* @param userUuid the user uuid of this eb partner ship
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_ebPartnerShip.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this eb partner ship.
	*
	* @return the group ID of this eb partner ship
	*/
	@Override
	public long getGroupId() {
		return _ebPartnerShip.getGroupId();
	}

	/**
	* Sets the group ID of this eb partner ship.
	*
	* @param groupId the group ID of this eb partner ship
	*/
	@Override
	public void setGroupId(long groupId) {
		_ebPartnerShip.setGroupId(groupId);
	}

	/**
	* Returns the create date of this eb partner ship.
	*
	* @return the create date of this eb partner ship
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _ebPartnerShip.getCreateDate();
	}

	/**
	* Sets the create date of this eb partner ship.
	*
	* @param createDate the create date of this eb partner ship
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_ebPartnerShip.setCreateDate(createDate);
	}

	/**
	* Returns the name of this eb partner ship.
	*
	* @return the name of this eb partner ship
	*/
	@Override
	public java.lang.String getName() {
		return _ebPartnerShip.getName();
	}

	/**
	* Sets the name of this eb partner ship.
	*
	* @param name the name of this eb partner ship
	*/
	@Override
	public void setName(java.lang.String name) {
		_ebPartnerShip.setName(name);
	}

	/**
	* Returns the cpa ID of this eb partner ship.
	*
	* @return the cpa ID of this eb partner ship
	*/
	@Override
	public java.lang.String getCpaId() {
		return _ebPartnerShip.getCpaId();
	}

	/**
	* Sets the cpa ID of this eb partner ship.
	*
	* @param cpaId the cpa ID of this eb partner ship
	*/
	@Override
	public void setCpaId(java.lang.String cpaId) {
		_ebPartnerShip.setCpaId(cpaId);
	}

	/**
	* Returns the service of this eb partner ship.
	*
	* @return the service of this eb partner ship
	*/
	@Override
	public java.lang.String getService() {
		return _ebPartnerShip.getService();
	}

	/**
	* Sets the service of this eb partner ship.
	*
	* @param service the service of this eb partner ship
	*/
	@Override
	public void setService(java.lang.String service) {
		_ebPartnerShip.setService(service);
	}

	@Override
	public boolean isNew() {
		return _ebPartnerShip.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_ebPartnerShip.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _ebPartnerShip.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_ebPartnerShip.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _ebPartnerShip.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _ebPartnerShip.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_ebPartnerShip.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _ebPartnerShip.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_ebPartnerShip.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_ebPartnerShip.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_ebPartnerShip.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EbPartnerShipWrapper((EbPartnerShip)_ebPartnerShip.clone());
	}

	@Override
	public int compareTo(
		org.oep.core.dossiermgt.model.EbPartnerShip ebPartnerShip) {
		return _ebPartnerShip.compareTo(ebPartnerShip);
	}

	@Override
	public int hashCode() {
		return _ebPartnerShip.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.core.dossiermgt.model.EbPartnerShip> toCacheModel() {
		return _ebPartnerShip.toCacheModel();
	}

	@Override
	public org.oep.core.dossiermgt.model.EbPartnerShip toEscapedModel() {
		return new EbPartnerShipWrapper(_ebPartnerShip.toEscapedModel());
	}

	@Override
	public org.oep.core.dossiermgt.model.EbPartnerShip toUnescapedModel() {
		return new EbPartnerShipWrapper(_ebPartnerShip.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _ebPartnerShip.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _ebPartnerShip.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_ebPartnerShip.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EbPartnerShipWrapper)) {
			return false;
		}

		EbPartnerShipWrapper ebPartnerShipWrapper = (EbPartnerShipWrapper)obj;

		if (Validator.equals(_ebPartnerShip, ebPartnerShipWrapper._ebPartnerShip)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public EbPartnerShip getWrappedEbPartnerShip() {
		return _ebPartnerShip;
	}

	@Override
	public EbPartnerShip getWrappedModel() {
		return _ebPartnerShip;
	}

	@Override
	public void resetOriginalValues() {
		_ebPartnerShip.resetOriginalValues();
	}

	private EbPartnerShip _ebPartnerShip;
}