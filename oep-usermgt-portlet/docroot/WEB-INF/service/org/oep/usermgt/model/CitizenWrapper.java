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
 * This class is a wrapper for {@link Citizen}.
 * </p>
 *
 * @author NQMINH
 * @see Citizen
 * @generated
 */
public class CitizenWrapper implements Citizen, ModelWrapper<Citizen> {
	public CitizenWrapper(Citizen citizen) {
		_citizen = citizen;
	}

	@Override
	public Class<?> getModelClass() {
		return Citizen.class;
	}

	@Override
	public String getModelClassName() {
		return Citizen.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("citizenId", getCitizenId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("mappingUserId", getMappingUserId());
		attributes.put("citizenNo", getCitizenNo());
		attributes.put("fullName", getFullName());
		attributes.put("gender", getGender());
		attributes.put("identificationNo", getIdentificationNo());
		attributes.put("address", getAddress());
		attributes.put("cityNo", getCityNo());
		attributes.put("cityName", getCityName());
		attributes.put("districtNo", getDistrictNo());
		attributes.put("districtName", getDistrictName());
		attributes.put("wardNo", getWardNo());
		attributes.put("wardName", getWardName());
		attributes.put("homeAddress", getHomeAddress());
		attributes.put("homeTel", getHomeTel());
		attributes.put("mobile", getMobile());
		attributes.put("email", getEmail());
		attributes.put("shortName", getShortName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long citizenId = (Long)attributes.get("citizenId");

		if (citizenId != null) {
			setCitizenId(citizenId);
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

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long mappingUserId = (Long)attributes.get("mappingUserId");

		if (mappingUserId != null) {
			setMappingUserId(mappingUserId);
		}

		String citizenNo = (String)attributes.get("citizenNo");

		if (citizenNo != null) {
			setCitizenNo(citizenNo);
		}

		String fullName = (String)attributes.get("fullName");

		if (fullName != null) {
			setFullName(fullName);
		}

		Integer gender = (Integer)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		String identificationNo = (String)attributes.get("identificationNo");

		if (identificationNo != null) {
			setIdentificationNo(identificationNo);
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

		String homeAddress = (String)attributes.get("homeAddress");

		if (homeAddress != null) {
			setHomeAddress(homeAddress);
		}

		String homeTel = (String)attributes.get("homeTel");

		if (homeTel != null) {
			setHomeTel(homeTel);
		}

		String mobile = (String)attributes.get("mobile");

		if (mobile != null) {
			setMobile(mobile);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String shortName = (String)attributes.get("shortName");

		if (shortName != null) {
			setShortName(shortName);
		}
	}

	/**
	* Returns the primary key of this citizen.
	*
	* @return the primary key of this citizen
	*/
	@Override
	public long getPrimaryKey() {
		return _citizen.getPrimaryKey();
	}

	/**
	* Sets the primary key of this citizen.
	*
	* @param primaryKey the primary key of this citizen
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_citizen.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the citizen ID of this citizen.
	*
	* @return the citizen ID of this citizen
	*/
	@Override
	public long getCitizenId() {
		return _citizen.getCitizenId();
	}

	/**
	* Sets the citizen ID of this citizen.
	*
	* @param citizenId the citizen ID of this citizen
	*/
	@Override
	public void setCitizenId(long citizenId) {
		_citizen.setCitizenId(citizenId);
	}

	/**
	* Returns the company ID of this citizen.
	*
	* @return the company ID of this citizen
	*/
	@Override
	public long getCompanyId() {
		return _citizen.getCompanyId();
	}

	/**
	* Sets the company ID of this citizen.
	*
	* @param companyId the company ID of this citizen
	*/
	@Override
	public void setCompanyId(long companyId) {
		_citizen.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this citizen.
	*
	* @return the user ID of this citizen
	*/
	@Override
	public long getUserId() {
		return _citizen.getUserId();
	}

	/**
	* Sets the user ID of this citizen.
	*
	* @param userId the user ID of this citizen
	*/
	@Override
	public void setUserId(long userId) {
		_citizen.setUserId(userId);
	}

	/**
	* Returns the user uuid of this citizen.
	*
	* @return the user uuid of this citizen
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _citizen.getUserUuid();
	}

	/**
	* Sets the user uuid of this citizen.
	*
	* @param userUuid the user uuid of this citizen
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_citizen.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this citizen.
	*
	* @return the group ID of this citizen
	*/
	@Override
	public long getGroupId() {
		return _citizen.getGroupId();
	}

	/**
	* Sets the group ID of this citizen.
	*
	* @param groupId the group ID of this citizen
	*/
	@Override
	public void setGroupId(long groupId) {
		_citizen.setGroupId(groupId);
	}

	/**
	* Returns the create date of this citizen.
	*
	* @return the create date of this citizen
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _citizen.getCreateDate();
	}

	/**
	* Sets the create date of this citizen.
	*
	* @param createDate the create date of this citizen
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_citizen.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this citizen.
	*
	* @return the modified date of this citizen
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _citizen.getModifiedDate();
	}

	/**
	* Sets the modified date of this citizen.
	*
	* @param modifiedDate the modified date of this citizen
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_citizen.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the mapping user ID of this citizen.
	*
	* @return the mapping user ID of this citizen
	*/
	@Override
	public long getMappingUserId() {
		return _citizen.getMappingUserId();
	}

	/**
	* Sets the mapping user ID of this citizen.
	*
	* @param mappingUserId the mapping user ID of this citizen
	*/
	@Override
	public void setMappingUserId(long mappingUserId) {
		_citizen.setMappingUserId(mappingUserId);
	}

	/**
	* Returns the mapping user uuid of this citizen.
	*
	* @return the mapping user uuid of this citizen
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getMappingUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _citizen.getMappingUserUuid();
	}

	/**
	* Sets the mapping user uuid of this citizen.
	*
	* @param mappingUserUuid the mapping user uuid of this citizen
	*/
	@Override
	public void setMappingUserUuid(java.lang.String mappingUserUuid) {
		_citizen.setMappingUserUuid(mappingUserUuid);
	}

	/**
	* Returns the citizen no of this citizen.
	*
	* @return the citizen no of this citizen
	*/
	@Override
	public java.lang.String getCitizenNo() {
		return _citizen.getCitizenNo();
	}

	/**
	* Sets the citizen no of this citizen.
	*
	* @param citizenNo the citizen no of this citizen
	*/
	@Override
	public void setCitizenNo(java.lang.String citizenNo) {
		_citizen.setCitizenNo(citizenNo);
	}

	/**
	* Returns the full name of this citizen.
	*
	* @return the full name of this citizen
	*/
	@Override
	public java.lang.String getFullName() {
		return _citizen.getFullName();
	}

	/**
	* Sets the full name of this citizen.
	*
	* @param fullName the full name of this citizen
	*/
	@Override
	public void setFullName(java.lang.String fullName) {
		_citizen.setFullName(fullName);
	}

	/**
	* Returns the gender of this citizen.
	*
	* @return the gender of this citizen
	*/
	@Override
	public int getGender() {
		return _citizen.getGender();
	}

	/**
	* Sets the gender of this citizen.
	*
	* @param gender the gender of this citizen
	*/
	@Override
	public void setGender(int gender) {
		_citizen.setGender(gender);
	}

	/**
	* Returns the identification no of this citizen.
	*
	* @return the identification no of this citizen
	*/
	@Override
	public java.lang.String getIdentificationNo() {
		return _citizen.getIdentificationNo();
	}

	/**
	* Sets the identification no of this citizen.
	*
	* @param identificationNo the identification no of this citizen
	*/
	@Override
	public void setIdentificationNo(java.lang.String identificationNo) {
		_citizen.setIdentificationNo(identificationNo);
	}

	/**
	* Returns the address of this citizen.
	*
	* @return the address of this citizen
	*/
	@Override
	public java.lang.String getAddress() {
		return _citizen.getAddress();
	}

	/**
	* Sets the address of this citizen.
	*
	* @param address the address of this citizen
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_citizen.setAddress(address);
	}

	/**
	* Returns the city no of this citizen.
	*
	* @return the city no of this citizen
	*/
	@Override
	public java.lang.String getCityNo() {
		return _citizen.getCityNo();
	}

	/**
	* Sets the city no of this citizen.
	*
	* @param cityNo the city no of this citizen
	*/
	@Override
	public void setCityNo(java.lang.String cityNo) {
		_citizen.setCityNo(cityNo);
	}

	/**
	* Returns the city name of this citizen.
	*
	* @return the city name of this citizen
	*/
	@Override
	public java.lang.String getCityName() {
		return _citizen.getCityName();
	}

	/**
	* Sets the city name of this citizen.
	*
	* @param cityName the city name of this citizen
	*/
	@Override
	public void setCityName(java.lang.String cityName) {
		_citizen.setCityName(cityName);
	}

	/**
	* Returns the district no of this citizen.
	*
	* @return the district no of this citizen
	*/
	@Override
	public java.lang.String getDistrictNo() {
		return _citizen.getDistrictNo();
	}

	/**
	* Sets the district no of this citizen.
	*
	* @param districtNo the district no of this citizen
	*/
	@Override
	public void setDistrictNo(java.lang.String districtNo) {
		_citizen.setDistrictNo(districtNo);
	}

	/**
	* Returns the district name of this citizen.
	*
	* @return the district name of this citizen
	*/
	@Override
	public java.lang.String getDistrictName() {
		return _citizen.getDistrictName();
	}

	/**
	* Sets the district name of this citizen.
	*
	* @param districtName the district name of this citizen
	*/
	@Override
	public void setDistrictName(java.lang.String districtName) {
		_citizen.setDistrictName(districtName);
	}

	/**
	* Returns the ward no of this citizen.
	*
	* @return the ward no of this citizen
	*/
	@Override
	public java.lang.String getWardNo() {
		return _citizen.getWardNo();
	}

	/**
	* Sets the ward no of this citizen.
	*
	* @param wardNo the ward no of this citizen
	*/
	@Override
	public void setWardNo(java.lang.String wardNo) {
		_citizen.setWardNo(wardNo);
	}

	/**
	* Returns the ward name of this citizen.
	*
	* @return the ward name of this citizen
	*/
	@Override
	public java.lang.String getWardName() {
		return _citizen.getWardName();
	}

	/**
	* Sets the ward name of this citizen.
	*
	* @param wardName the ward name of this citizen
	*/
	@Override
	public void setWardName(java.lang.String wardName) {
		_citizen.setWardName(wardName);
	}

	/**
	* Returns the home address of this citizen.
	*
	* @return the home address of this citizen
	*/
	@Override
	public java.lang.String getHomeAddress() {
		return _citizen.getHomeAddress();
	}

	/**
	* Sets the home address of this citizen.
	*
	* @param homeAddress the home address of this citizen
	*/
	@Override
	public void setHomeAddress(java.lang.String homeAddress) {
		_citizen.setHomeAddress(homeAddress);
	}

	/**
	* Returns the home tel of this citizen.
	*
	* @return the home tel of this citizen
	*/
	@Override
	public java.lang.String getHomeTel() {
		return _citizen.getHomeTel();
	}

	/**
	* Sets the home tel of this citizen.
	*
	* @param homeTel the home tel of this citizen
	*/
	@Override
	public void setHomeTel(java.lang.String homeTel) {
		_citizen.setHomeTel(homeTel);
	}

	/**
	* Returns the mobile of this citizen.
	*
	* @return the mobile of this citizen
	*/
	@Override
	public java.lang.String getMobile() {
		return _citizen.getMobile();
	}

	/**
	* Sets the mobile of this citizen.
	*
	* @param mobile the mobile of this citizen
	*/
	@Override
	public void setMobile(java.lang.String mobile) {
		_citizen.setMobile(mobile);
	}

	/**
	* Returns the email of this citizen.
	*
	* @return the email of this citizen
	*/
	@Override
	public java.lang.String getEmail() {
		return _citizen.getEmail();
	}

	/**
	* Sets the email of this citizen.
	*
	* @param email the email of this citizen
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_citizen.setEmail(email);
	}

	/**
	* Returns the short name of this citizen.
	*
	* @return the short name of this citizen
	*/
	@Override
	public java.lang.String getShortName() {
		return _citizen.getShortName();
	}

	/**
	* Sets the short name of this citizen.
	*
	* @param shortName the short name of this citizen
	*/
	@Override
	public void setShortName(java.lang.String shortName) {
		_citizen.setShortName(shortName);
	}

	@Override
	public boolean isNew() {
		return _citizen.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_citizen.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _citizen.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_citizen.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _citizen.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _citizen.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_citizen.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _citizen.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_citizen.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_citizen.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_citizen.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CitizenWrapper((Citizen)_citizen.clone());
	}

	@Override
	public int compareTo(org.oep.usermgt.model.Citizen citizen) {
		return _citizen.compareTo(citizen);
	}

	@Override
	public int hashCode() {
		return _citizen.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.usermgt.model.Citizen> toCacheModel() {
		return _citizen.toCacheModel();
	}

	@Override
	public org.oep.usermgt.model.Citizen toEscapedModel() {
		return new CitizenWrapper(_citizen.toEscapedModel());
	}

	@Override
	public org.oep.usermgt.model.Citizen toUnescapedModel() {
		return new CitizenWrapper(_citizen.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _citizen.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _citizen.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_citizen.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CitizenWrapper)) {
			return false;
		}

		CitizenWrapper citizenWrapper = (CitizenWrapper)obj;

		if (Validator.equals(_citizen, citizenWrapper._citizen)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Citizen getWrappedCitizen() {
		return _citizen;
	}

	@Override
	public Citizen getWrappedModel() {
		return _citizen;
	}

	@Override
	public void resetOriginalValues() {
		_citizen.resetOriginalValues();
	}

	private Citizen _citizen;
}