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
 * This class is a wrapper for {@link WorkingUnit}.
 * </p>
 *
 * @author NQMINH
 * @see WorkingUnit
 * @generated
 */
public class WorkingUnitWrapper implements WorkingUnit,
	ModelWrapper<WorkingUnit> {
	public WorkingUnitWrapper(WorkingUnit workingUnit) {
		_workingUnit = workingUnit;
	}

	@Override
	public Class<?> getModelClass() {
		return WorkingUnit.class;
	}

	@Override
	public String getModelClassName() {
		return WorkingUnit.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("workingUnitId", getWorkingUnitId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("organizationId", getOrganizationId());
		attributes.put("govAgencyId", getGovAgencyId());
		attributes.put("name", getName());
		attributes.put("enName", getEnName());
		attributes.put("parentWorkingUnitId", getParentWorkingUnitId());
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
		attributes.put("website", getWebsite());
		attributes.put("aaa", getAaa());
		attributes.put("shortName", getShortName());
		attributes.put("localSiteId", getLocalSiteId());
		attributes.put("isEmployer", getIsEmployer());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long workingUnitId = (Long)attributes.get("workingUnitId");

		if (workingUnitId != null) {
			setWorkingUnitId(workingUnitId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
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

		String govAgencyId = (String)attributes.get("govAgencyId");

		if (govAgencyId != null) {
			setGovAgencyId(govAgencyId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String enName = (String)attributes.get("enName");

		if (enName != null) {
			setEnName(enName);
		}

		Long parentWorkingUnitId = (Long)attributes.get("parentWorkingUnitId");

		if (parentWorkingUnitId != null) {
			setParentWorkingUnitId(parentWorkingUnitId);
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

		String website = (String)attributes.get("website");

		if (website != null) {
			setWebsite(website);
		}

		String aaa = (String)attributes.get("aaa");

		if (aaa != null) {
			setAaa(aaa);
		}

		String shortName = (String)attributes.get("shortName");

		if (shortName != null) {
			setShortName(shortName);
		}

		Long localSiteId = (Long)attributes.get("localSiteId");

		if (localSiteId != null) {
			setLocalSiteId(localSiteId);
		}

		Integer isEmployer = (Integer)attributes.get("isEmployer");

		if (isEmployer != null) {
			setIsEmployer(isEmployer);
		}
	}

	/**
	* Returns the primary key of this Working Unit.
	*
	* @return the primary key of this Working Unit
	*/
	@Override
	public long getPrimaryKey() {
		return _workingUnit.getPrimaryKey();
	}

	/**
	* Sets the primary key of this Working Unit.
	*
	* @param primaryKey the primary key of this Working Unit
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_workingUnit.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the working unit ID of this Working Unit.
	*
	* @return the working unit ID of this Working Unit
	*/
	@Override
	public long getWorkingUnitId() {
		return _workingUnit.getWorkingUnitId();
	}

	/**
	* Sets the working unit ID of this Working Unit.
	*
	* @param workingUnitId the working unit ID of this Working Unit
	*/
	@Override
	public void setWorkingUnitId(long workingUnitId) {
		_workingUnit.setWorkingUnitId(workingUnitId);
	}

	/**
	* Returns the company ID of this Working Unit.
	*
	* @return the company ID of this Working Unit
	*/
	@Override
	public long getCompanyId() {
		return _workingUnit.getCompanyId();
	}

	/**
	* Sets the company ID of this Working Unit.
	*
	* @param companyId the company ID of this Working Unit
	*/
	@Override
	public void setCompanyId(long companyId) {
		_workingUnit.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this Working Unit.
	*
	* @return the group ID of this Working Unit
	*/
	@Override
	public long getGroupId() {
		return _workingUnit.getGroupId();
	}

	/**
	* Sets the group ID of this Working Unit.
	*
	* @param groupId the group ID of this Working Unit
	*/
	@Override
	public void setGroupId(long groupId) {
		_workingUnit.setGroupId(groupId);
	}

	/**
	* Returns the user ID of this Working Unit.
	*
	* @return the user ID of this Working Unit
	*/
	@Override
	public long getUserId() {
		return _workingUnit.getUserId();
	}

	/**
	* Sets the user ID of this Working Unit.
	*
	* @param userId the user ID of this Working Unit
	*/
	@Override
	public void setUserId(long userId) {
		_workingUnit.setUserId(userId);
	}

	/**
	* Returns the user uuid of this Working Unit.
	*
	* @return the user uuid of this Working Unit
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _workingUnit.getUserUuid();
	}

	/**
	* Sets the user uuid of this Working Unit.
	*
	* @param userUuid the user uuid of this Working Unit
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_workingUnit.setUserUuid(userUuid);
	}

	/**
	* Returns the create date of this Working Unit.
	*
	* @return the create date of this Working Unit
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _workingUnit.getCreateDate();
	}

	/**
	* Sets the create date of this Working Unit.
	*
	* @param createDate the create date of this Working Unit
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_workingUnit.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this Working Unit.
	*
	* @return the modified date of this Working Unit
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _workingUnit.getModifiedDate();
	}

	/**
	* Sets the modified date of this Working Unit.
	*
	* @param modifiedDate the modified date of this Working Unit
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_workingUnit.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the organization ID of this Working Unit.
	*
	* @return the organization ID of this Working Unit
	*/
	@Override
	public long getOrganizationId() {
		return _workingUnit.getOrganizationId();
	}

	/**
	* Sets the organization ID of this Working Unit.
	*
	* @param organizationId the organization ID of this Working Unit
	*/
	@Override
	public void setOrganizationId(long organizationId) {
		_workingUnit.setOrganizationId(organizationId);
	}

	/**
	* Returns the gov agency ID of this Working Unit.
	*
	* @return the gov agency ID of this Working Unit
	*/
	@Override
	public java.lang.String getGovAgencyId() {
		return _workingUnit.getGovAgencyId();
	}

	/**
	* Sets the gov agency ID of this Working Unit.
	*
	* @param govAgencyId the gov agency ID of this Working Unit
	*/
	@Override
	public void setGovAgencyId(java.lang.String govAgencyId) {
		_workingUnit.setGovAgencyId(govAgencyId);
	}

	/**
	* Returns the name of this Working Unit.
	*
	* @return the name of this Working Unit
	*/
	@Override
	public java.lang.String getName() {
		return _workingUnit.getName();
	}

	/**
	* Sets the name of this Working Unit.
	*
	* @param name the name of this Working Unit
	*/
	@Override
	public void setName(java.lang.String name) {
		_workingUnit.setName(name);
	}

	/**
	* Returns the en name of this Working Unit.
	*
	* @return the en name of this Working Unit
	*/
	@Override
	public java.lang.String getEnName() {
		return _workingUnit.getEnName();
	}

	/**
	* Sets the en name of this Working Unit.
	*
	* @param enName the en name of this Working Unit
	*/
	@Override
	public void setEnName(java.lang.String enName) {
		_workingUnit.setEnName(enName);
	}

	/**
	* Returns the parent working unit ID of this Working Unit.
	*
	* @return the parent working unit ID of this Working Unit
	*/
	@Override
	public long getParentWorkingUnitId() {
		return _workingUnit.getParentWorkingUnitId();
	}

	/**
	* Sets the parent working unit ID of this Working Unit.
	*
	* @param parentWorkingUnitId the parent working unit ID of this Working Unit
	*/
	@Override
	public void setParentWorkingUnitId(long parentWorkingUnitId) {
		_workingUnit.setParentWorkingUnitId(parentWorkingUnitId);
	}

	/**
	* Returns the address of this Working Unit.
	*
	* @return the address of this Working Unit
	*/
	@Override
	public java.lang.String getAddress() {
		return _workingUnit.getAddress();
	}

	/**
	* Sets the address of this Working Unit.
	*
	* @param address the address of this Working Unit
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_workingUnit.setAddress(address);
	}

	/**
	* Returns the city no of this Working Unit.
	*
	* @return the city no of this Working Unit
	*/
	@Override
	public java.lang.String getCityNo() {
		return _workingUnit.getCityNo();
	}

	/**
	* Sets the city no of this Working Unit.
	*
	* @param cityNo the city no of this Working Unit
	*/
	@Override
	public void setCityNo(java.lang.String cityNo) {
		_workingUnit.setCityNo(cityNo);
	}

	/**
	* Returns the city name of this Working Unit.
	*
	* @return the city name of this Working Unit
	*/
	@Override
	public java.lang.String getCityName() {
		return _workingUnit.getCityName();
	}

	/**
	* Sets the city name of this Working Unit.
	*
	* @param cityName the city name of this Working Unit
	*/
	@Override
	public void setCityName(java.lang.String cityName) {
		_workingUnit.setCityName(cityName);
	}

	/**
	* Returns the district no of this Working Unit.
	*
	* @return the district no of this Working Unit
	*/
	@Override
	public java.lang.String getDistrictNo() {
		return _workingUnit.getDistrictNo();
	}

	/**
	* Sets the district no of this Working Unit.
	*
	* @param districtNo the district no of this Working Unit
	*/
	@Override
	public void setDistrictNo(java.lang.String districtNo) {
		_workingUnit.setDistrictNo(districtNo);
	}

	/**
	* Returns the district name of this Working Unit.
	*
	* @return the district name of this Working Unit
	*/
	@Override
	public java.lang.String getDistrictName() {
		return _workingUnit.getDistrictName();
	}

	/**
	* Sets the district name of this Working Unit.
	*
	* @param districtName the district name of this Working Unit
	*/
	@Override
	public void setDistrictName(java.lang.String districtName) {
		_workingUnit.setDistrictName(districtName);
	}

	/**
	* Returns the ward no of this Working Unit.
	*
	* @return the ward no of this Working Unit
	*/
	@Override
	public java.lang.String getWardNo() {
		return _workingUnit.getWardNo();
	}

	/**
	* Sets the ward no of this Working Unit.
	*
	* @param wardNo the ward no of this Working Unit
	*/
	@Override
	public void setWardNo(java.lang.String wardNo) {
		_workingUnit.setWardNo(wardNo);
	}

	/**
	* Returns the ward name of this Working Unit.
	*
	* @return the ward name of this Working Unit
	*/
	@Override
	public java.lang.String getWardName() {
		return _workingUnit.getWardName();
	}

	/**
	* Sets the ward name of this Working Unit.
	*
	* @param wardName the ward name of this Working Unit
	*/
	@Override
	public void setWardName(java.lang.String wardName) {
		_workingUnit.setWardName(wardName);
	}

	/**
	* Returns the gps position of this Working Unit.
	*
	* @return the gps position of this Working Unit
	*/
	@Override
	public java.lang.String getGpsPosition() {
		return _workingUnit.getGpsPosition();
	}

	/**
	* Sets the gps position of this Working Unit.
	*
	* @param gpsPosition the gps position of this Working Unit
	*/
	@Override
	public void setGpsPosition(java.lang.String gpsPosition) {
		_workingUnit.setGpsPosition(gpsPosition);
	}

	/**
	* Returns the tel no of this Working Unit.
	*
	* @return the tel no of this Working Unit
	*/
	@Override
	public java.lang.String getTelNo() {
		return _workingUnit.getTelNo();
	}

	/**
	* Sets the tel no of this Working Unit.
	*
	* @param telNo the tel no of this Working Unit
	*/
	@Override
	public void setTelNo(java.lang.String telNo) {
		_workingUnit.setTelNo(telNo);
	}

	/**
	* Returns the fax of this Working Unit.
	*
	* @return the fax of this Working Unit
	*/
	@Override
	public java.lang.String getFax() {
		return _workingUnit.getFax();
	}

	/**
	* Sets the fax of this Working Unit.
	*
	* @param fax the fax of this Working Unit
	*/
	@Override
	public void setFax(java.lang.String fax) {
		_workingUnit.setFax(fax);
	}

	/**
	* Returns the email of this Working Unit.
	*
	* @return the email of this Working Unit
	*/
	@Override
	public java.lang.String getEmail() {
		return _workingUnit.getEmail();
	}

	/**
	* Sets the email of this Working Unit.
	*
	* @param email the email of this Working Unit
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_workingUnit.setEmail(email);
	}

	/**
	* Returns the website of this Working Unit.
	*
	* @return the website of this Working Unit
	*/
	@Override
	public java.lang.String getWebsite() {
		return _workingUnit.getWebsite();
	}

	/**
	* Sets the website of this Working Unit.
	*
	* @param website the website of this Working Unit
	*/
	@Override
	public void setWebsite(java.lang.String website) {
		_workingUnit.setWebsite(website);
	}

	/**
	* Returns the aaa of this Working Unit.
	*
	* @return the aaa of this Working Unit
	*/
	@Override
	public java.lang.String getAaa() {
		return _workingUnit.getAaa();
	}

	/**
	* Sets the aaa of this Working Unit.
	*
	* @param aaa the aaa of this Working Unit
	*/
	@Override
	public void setAaa(java.lang.String aaa) {
		_workingUnit.setAaa(aaa);
	}

	/**
	* Returns the short name of this Working Unit.
	*
	* @return the short name of this Working Unit
	*/
	@Override
	public java.lang.String getShortName() {
		return _workingUnit.getShortName();
	}

	/**
	* Sets the short name of this Working Unit.
	*
	* @param shortName the short name of this Working Unit
	*/
	@Override
	public void setShortName(java.lang.String shortName) {
		_workingUnit.setShortName(shortName);
	}

	/**
	* Returns the local site ID of this Working Unit.
	*
	* @return the local site ID of this Working Unit
	*/
	@Override
	public long getLocalSiteId() {
		return _workingUnit.getLocalSiteId();
	}

	/**
	* Sets the local site ID of this Working Unit.
	*
	* @param localSiteId the local site ID of this Working Unit
	*/
	@Override
	public void setLocalSiteId(long localSiteId) {
		_workingUnit.setLocalSiteId(localSiteId);
	}

	/**
	* Returns the is employer of this Working Unit.
	*
	* @return the is employer of this Working Unit
	*/
	@Override
	public int getIsEmployer() {
		return _workingUnit.getIsEmployer();
	}

	/**
	* Sets the is employer of this Working Unit.
	*
	* @param isEmployer the is employer of this Working Unit
	*/
	@Override
	public void setIsEmployer(int isEmployer) {
		_workingUnit.setIsEmployer(isEmployer);
	}

	@Override
	public boolean isNew() {
		return _workingUnit.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_workingUnit.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _workingUnit.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_workingUnit.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _workingUnit.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _workingUnit.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_workingUnit.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _workingUnit.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_workingUnit.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_workingUnit.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_workingUnit.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new WorkingUnitWrapper((WorkingUnit)_workingUnit.clone());
	}

	@Override
	public int compareTo(org.oep.usermgt.model.WorkingUnit workingUnit) {
		return _workingUnit.compareTo(workingUnit);
	}

	@Override
	public int hashCode() {
		return _workingUnit.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.usermgt.model.WorkingUnit> toCacheModel() {
		return _workingUnit.toCacheModel();
	}

	@Override
	public org.oep.usermgt.model.WorkingUnit toEscapedModel() {
		return new WorkingUnitWrapper(_workingUnit.toEscapedModel());
	}

	@Override
	public org.oep.usermgt.model.WorkingUnit toUnescapedModel() {
		return new WorkingUnitWrapper(_workingUnit.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _workingUnit.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _workingUnit.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_workingUnit.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof WorkingUnitWrapper)) {
			return false;
		}

		WorkingUnitWrapper workingUnitWrapper = (WorkingUnitWrapper)obj;

		if (Validator.equals(_workingUnit, workingUnitWrapper._workingUnit)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public WorkingUnit getWrappedWorkingUnit() {
		return _workingUnit;
	}

	@Override
	public WorkingUnit getWrappedModel() {
		return _workingUnit;
	}

	@Override
	public void resetOriginalValues() {
		_workingUnit.resetOriginalValues();
	}

	private WorkingUnit _workingUnit;
}