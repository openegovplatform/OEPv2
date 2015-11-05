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

package org.oep.usermgt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Business}.
 * </p>
 *
 * @author NQMINH
 * @see Business
 * @generated
 */
public class BusinessWrapper implements Business, ModelWrapper<Business> {
	public BusinessWrapper(Business business) {
		_business = business;
	}

	@Override
	public Class<?> getModelClass() {
		return Business.class;
	}

	@Override
	public String getModelClassName() {
		return Business.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("businessId", getBusinessId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("organizationId", getOrganizationId());
		attributes.put("masterUserId", getMasterUserId());
		attributes.put("name", getName());
		attributes.put("enName", getEnName());
		attributes.put("shortName", getShortName());
		attributes.put("address", getAddress());
		attributes.put("cityNo", getCityNo());
		attributes.put("cityName", getCityName());
		attributes.put("districtNo", getDistrictNo());
		attributes.put("districtName", getDistrictName());
		attributes.put("wardNo", getWardNo());
		attributes.put("wardName", getWardName());
		attributes.put("gpsPosition", getGpsPosition());
		attributes.put("telNo", getTelNo());
		attributes.put("fax", getFax());
		attributes.put("email", getEmail());
		attributes.put("businessNo", getBusinessNo());
		attributes.put("businessType", getBusinessType());
		attributes.put("registerAgent", getRegisterAgent());
		attributes.put("registerDate", getRegisterDate());
		attributes.put("representative", getRepresentative());
		attributes.put("representativeRole", getRepresentativeRole());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long businessId = (Long)attributes.get("businessId");

		if (businessId != null) {
			setBusinessId(businessId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
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

		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}

		Long masterUserId = (Long)attributes.get("masterUserId");

		if (masterUserId != null) {
			setMasterUserId(masterUserId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String enName = (String)attributes.get("enName");

		if (enName != null) {
			setEnName(enName);
		}

		String shortName = (String)attributes.get("shortName");

		if (shortName != null) {
			setShortName(shortName);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String cityNo = (String)attributes.get("cityNo");

		if (cityNo != null) {
			setCityNo(cityNo);
		}

		String cityName = (String)attributes.get("cityName");

		if (cityName != null) {
			setCityName(cityName);
		}

		String districtNo = (String)attributes.get("districtNo");

		if (districtNo != null) {
			setDistrictNo(districtNo);
		}

		String districtName = (String)attributes.get("districtName");

		if (districtName != null) {
			setDistrictName(districtName);
		}

		String wardNo = (String)attributes.get("wardNo");

		if (wardNo != null) {
			setWardNo(wardNo);
		}

		String wardName = (String)attributes.get("wardName");

		if (wardName != null) {
			setWardName(wardName);
		}

		String gpsPosition = (String)attributes.get("gpsPosition");

		if (gpsPosition != null) {
			setGpsPosition(gpsPosition);
		}

		String telNo = (String)attributes.get("telNo");

		if (telNo != null) {
			setTelNo(telNo);
		}

		String fax = (String)attributes.get("fax");

		if (fax != null) {
			setFax(fax);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String businessNo = (String)attributes.get("businessNo");

		if (businessNo != null) {
			setBusinessNo(businessNo);
		}

		String businessType = (String)attributes.get("businessType");

		if (businessType != null) {
			setBusinessType(businessType);
		}

		String registerAgent = (String)attributes.get("registerAgent");

		if (registerAgent != null) {
			setRegisterAgent(registerAgent);
		}

		Date registerDate = (Date)attributes.get("registerDate");

		if (registerDate != null) {
			setRegisterDate(registerDate);
		}

		String representative = (String)attributes.get("representative");

		if (representative != null) {
			setRepresentative(representative);
		}

		String representativeRole = (String)attributes.get("representativeRole");

		if (representativeRole != null) {
			setRepresentativeRole(representativeRole);
		}
	}

	/**
	* Returns the primary key of this business.
	*
	* @return the primary key of this business
	*/
	@Override
	public long getPrimaryKey() {
		return _business.getPrimaryKey();
	}

	/**
	* Sets the primary key of this business.
	*
	* @param primaryKey the primary key of this business
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_business.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the business ID of this business.
	*
	* @return the business ID of this business
	*/
	@Override
	public long getBusinessId() {
		return _business.getBusinessId();
	}

	/**
	* Sets the business ID of this business.
	*
	* @param businessId the business ID of this business
	*/
	@Override
	public void setBusinessId(long businessId) {
		_business.setBusinessId(businessId);
	}

	/**
	* Returns the user ID of this business.
	*
	* @return the user ID of this business
	*/
	@Override
	public long getUserId() {
		return _business.getUserId();
	}

	/**
	* Sets the user ID of this business.
	*
	* @param userId the user ID of this business
	*/
	@Override
	public void setUserId(long userId) {
		_business.setUserId(userId);
	}

	/**
	* Returns the user uuid of this business.
	*
	* @return the user uuid of this business
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _business.getUserUuid();
	}

	/**
	* Sets the user uuid of this business.
	*
	* @param userUuid the user uuid of this business
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_business.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this business.
	*
	* @return the group ID of this business
	*/
	@Override
	public long getGroupId() {
		return _business.getGroupId();
	}

	/**
	* Sets the group ID of this business.
	*
	* @param groupId the group ID of this business
	*/
	@Override
	public void setGroupId(long groupId) {
		_business.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this business.
	*
	* @return the company ID of this business
	*/
	@Override
	public long getCompanyId() {
		return _business.getCompanyId();
	}

	/**
	* Sets the company ID of this business.
	*
	* @param companyId the company ID of this business
	*/
	@Override
	public void setCompanyId(long companyId) {
		_business.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this business.
	*
	* @return the create date of this business
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _business.getCreateDate();
	}

	/**
	* Sets the create date of this business.
	*
	* @param createDate the create date of this business
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_business.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this business.
	*
	* @return the modified date of this business
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _business.getModifiedDate();
	}

	/**
	* Sets the modified date of this business.
	*
	* @param modifiedDate the modified date of this business
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_business.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the organization ID of this business.
	*
	* @return the organization ID of this business
	*/
	@Override
	public long getOrganizationId() {
		return _business.getOrganizationId();
	}

	/**
	* Sets the organization ID of this business.
	*
	* @param organizationId the organization ID of this business
	*/
	@Override
	public void setOrganizationId(long organizationId) {
		_business.setOrganizationId(organizationId);
	}

	/**
	* Returns the master user ID of this business.
	*
	* @return the master user ID of this business
	*/
	@Override
	public long getMasterUserId() {
		return _business.getMasterUserId();
	}

	/**
	* Sets the master user ID of this business.
	*
	* @param masterUserId the master user ID of this business
	*/
	@Override
	public void setMasterUserId(long masterUserId) {
		_business.setMasterUserId(masterUserId);
	}

	/**
	* Returns the master user uuid of this business.
	*
	* @return the master user uuid of this business
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getMasterUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _business.getMasterUserUuid();
	}

	/**
	* Sets the master user uuid of this business.
	*
	* @param masterUserUuid the master user uuid of this business
	*/
	@Override
	public void setMasterUserUuid(java.lang.String masterUserUuid) {
		_business.setMasterUserUuid(masterUserUuid);
	}

	/**
	* Returns the name of this business.
	*
	* @return the name of this business
	*/
	@Override
	public java.lang.String getName() {
		return _business.getName();
	}

	/**
	* Sets the name of this business.
	*
	* @param name the name of this business
	*/
	@Override
	public void setName(java.lang.String name) {
		_business.setName(name);
	}

	/**
	* Returns the en name of this business.
	*
	* @return the en name of this business
	*/
	@Override
	public java.lang.String getEnName() {
		return _business.getEnName();
	}

	/**
	* Sets the en name of this business.
	*
	* @param enName the en name of this business
	*/
	@Override
	public void setEnName(java.lang.String enName) {
		_business.setEnName(enName);
	}

	/**
	* Returns the short name of this business.
	*
	* @return the short name of this business
	*/
	@Override
	public java.lang.String getShortName() {
		return _business.getShortName();
	}

	/**
	* Sets the short name of this business.
	*
	* @param shortName the short name of this business
	*/
	@Override
	public void setShortName(java.lang.String shortName) {
		_business.setShortName(shortName);
	}

	/**
	* Returns the address of this business.
	*
	* @return the address of this business
	*/
	@Override
	public java.lang.String getAddress() {
		return _business.getAddress();
	}

	/**
	* Sets the address of this business.
	*
	* @param address the address of this business
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_business.setAddress(address);
	}

	/**
	* Returns the city no of this business.
	*
	* @return the city no of this business
	*/
	@Override
	public java.lang.String getCityNo() {
		return _business.getCityNo();
	}

	/**
	* Sets the city no of this business.
	*
	* @param cityNo the city no of this business
	*/
	@Override
	public void setCityNo(java.lang.String cityNo) {
		_business.setCityNo(cityNo);
	}

	/**
	* Returns the city name of this business.
	*
	* @return the city name of this business
	*/
	@Override
	public java.lang.String getCityName() {
		return _business.getCityName();
	}

	/**
	* Sets the city name of this business.
	*
	* @param cityName the city name of this business
	*/
	@Override
	public void setCityName(java.lang.String cityName) {
		_business.setCityName(cityName);
	}

	/**
	* Returns the district no of this business.
	*
	* @return the district no of this business
	*/
	@Override
	public java.lang.String getDistrictNo() {
		return _business.getDistrictNo();
	}

	/**
	* Sets the district no of this business.
	*
	* @param districtNo the district no of this business
	*/
	@Override
	public void setDistrictNo(java.lang.String districtNo) {
		_business.setDistrictNo(districtNo);
	}

	/**
	* Returns the district name of this business.
	*
	* @return the district name of this business
	*/
	@Override
	public java.lang.String getDistrictName() {
		return _business.getDistrictName();
	}

	/**
	* Sets the district name of this business.
	*
	* @param districtName the district name of this business
	*/
	@Override
	public void setDistrictName(java.lang.String districtName) {
		_business.setDistrictName(districtName);
	}

	/**
	* Returns the ward no of this business.
	*
	* @return the ward no of this business
	*/
	@Override
	public java.lang.String getWardNo() {
		return _business.getWardNo();
	}

	/**
	* Sets the ward no of this business.
	*
	* @param wardNo the ward no of this business
	*/
	@Override
	public void setWardNo(java.lang.String wardNo) {
		_business.setWardNo(wardNo);
	}

	/**
	* Returns the ward name of this business.
	*
	* @return the ward name of this business
	*/
	@Override
	public java.lang.String getWardName() {
		return _business.getWardName();
	}

	/**
	* Sets the ward name of this business.
	*
	* @param wardName the ward name of this business
	*/
	@Override
	public void setWardName(java.lang.String wardName) {
		_business.setWardName(wardName);
	}

	/**
	* Returns the gps position of this business.
	*
	* @return the gps position of this business
	*/
	@Override
	public java.lang.String getGpsPosition() {
		return _business.getGpsPosition();
	}

	/**
	* Sets the gps position of this business.
	*
	* @param gpsPosition the gps position of this business
	*/
	@Override
	public void setGpsPosition(java.lang.String gpsPosition) {
		_business.setGpsPosition(gpsPosition);
	}

	/**
	* Returns the tel no of this business.
	*
	* @return the tel no of this business
	*/
	@Override
	public java.lang.String getTelNo() {
		return _business.getTelNo();
	}

	/**
	* Sets the tel no of this business.
	*
	* @param telNo the tel no of this business
	*/
	@Override
	public void setTelNo(java.lang.String telNo) {
		_business.setTelNo(telNo);
	}

	/**
	* Returns the fax of this business.
	*
	* @return the fax of this business
	*/
	@Override
	public java.lang.String getFax() {
		return _business.getFax();
	}

	/**
	* Sets the fax of this business.
	*
	* @param fax the fax of this business
	*/
	@Override
	public void setFax(java.lang.String fax) {
		_business.setFax(fax);
	}

	/**
	* Returns the email of this business.
	*
	* @return the email of this business
	*/
	@Override
	public java.lang.String getEmail() {
		return _business.getEmail();
	}

	/**
	* Sets the email of this business.
	*
	* @param email the email of this business
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_business.setEmail(email);
	}

	/**
	* Returns the business no of this business.
	*
	* @return the business no of this business
	*/
	@Override
	public java.lang.String getBusinessNo() {
		return _business.getBusinessNo();
	}

	/**
	* Sets the business no of this business.
	*
	* @param businessNo the business no of this business
	*/
	@Override
	public void setBusinessNo(java.lang.String businessNo) {
		_business.setBusinessNo(businessNo);
	}

	/**
	* Returns the business type of this business.
	*
	* @return the business type of this business
	*/
	@Override
	public java.lang.String getBusinessType() {
		return _business.getBusinessType();
	}

	/**
	* Sets the business type of this business.
	*
	* @param businessType the business type of this business
	*/
	@Override
	public void setBusinessType(java.lang.String businessType) {
		_business.setBusinessType(businessType);
	}

	/**
	* Returns the register agent of this business.
	*
	* @return the register agent of this business
	*/
	@Override
	public java.lang.String getRegisterAgent() {
		return _business.getRegisterAgent();
	}

	/**
	* Sets the register agent of this business.
	*
	* @param registerAgent the register agent of this business
	*/
	@Override
	public void setRegisterAgent(java.lang.String registerAgent) {
		_business.setRegisterAgent(registerAgent);
	}

	/**
	* Returns the register date of this business.
	*
	* @return the register date of this business
	*/
	@Override
	public java.util.Date getRegisterDate() {
		return _business.getRegisterDate();
	}

	/**
	* Sets the register date of this business.
	*
	* @param registerDate the register date of this business
	*/
	@Override
	public void setRegisterDate(java.util.Date registerDate) {
		_business.setRegisterDate(registerDate);
	}

	/**
	* Returns the representative of this business.
	*
	* @return the representative of this business
	*/
	@Override
	public java.lang.String getRepresentative() {
		return _business.getRepresentative();
	}

	/**
	* Sets the representative of this business.
	*
	* @param representative the representative of this business
	*/
	@Override
	public void setRepresentative(java.lang.String representative) {
		_business.setRepresentative(representative);
	}

	/**
	* Returns the representative role of this business.
	*
	* @return the representative role of this business
	*/
	@Override
	public java.lang.String getRepresentativeRole() {
		return _business.getRepresentativeRole();
	}

	/**
	* Sets the representative role of this business.
	*
	* @param representativeRole the representative role of this business
	*/
	@Override
	public void setRepresentativeRole(java.lang.String representativeRole) {
		_business.setRepresentativeRole(representativeRole);
	}

	@Override
	public boolean isNew() {
		return _business.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_business.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _business.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_business.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _business.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _business.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_business.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _business.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_business.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_business.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_business.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new BusinessWrapper((Business)_business.clone());
	}

	@Override
	public int compareTo(org.oep.usermgt.model.Business business) {
		return _business.compareTo(business);
	}

	@Override
	public int hashCode() {
		return _business.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.usermgt.model.Business> toCacheModel() {
		return _business.toCacheModel();
	}

	@Override
	public org.oep.usermgt.model.Business toEscapedModel() {
		return new BusinessWrapper(_business.toEscapedModel());
	}

	@Override
	public org.oep.usermgt.model.Business toUnescapedModel() {
		return new BusinessWrapper(_business.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _business.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _business.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_business.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BusinessWrapper)) {
			return false;
		}

		BusinessWrapper businessWrapper = (BusinessWrapper)obj;

		if (Validator.equals(_business, businessWrapper._business)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Business getWrappedBusiness() {
		return _business;
	}

	@Override
	public Business getWrappedModel() {
		return _business;
	}

	@Override
	public void resetOriginalValues() {
		_business.resetOriginalValues();
	}

	private Business _business;
}