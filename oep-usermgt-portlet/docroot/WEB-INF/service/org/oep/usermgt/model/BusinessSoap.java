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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.oep.usermgt.service.http.BusinessServiceSoap}.
 *
 * @author NQMINH
 * @see org.oep.usermgt.service.http.BusinessServiceSoap
 * @generated
 */
public class BusinessSoap implements Serializable {
	public static BusinessSoap toSoapModel(Business model) {
		BusinessSoap soapModel = new BusinessSoap();

		soapModel.setBusinessId(model.getBusinessId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setOrganizationId(model.getOrganizationId());
		soapModel.setMasterUserId(model.getMasterUserId());
		soapModel.setName(model.getName());
		soapModel.setEnName(model.getEnName());
		soapModel.setShortName(model.getShortName());
		soapModel.setAddress(model.getAddress());
		soapModel.setCityNo(model.getCityNo());
		soapModel.setCityName(model.getCityName());
		soapModel.setDistrictNo(model.getDistrictNo());
		soapModel.setDistrictName(model.getDistrictName());
		soapModel.setWardNo(model.getWardNo());
		soapModel.setWardName(model.getWardName());
		soapModel.setGpsPosition(model.getGpsPosition());
		soapModel.setTelNo(model.getTelNo());
		soapModel.setFax(model.getFax());
		soapModel.setEmail(model.getEmail());
		soapModel.setBusinessNo(model.getBusinessNo());
		soapModel.setBusinessType(model.getBusinessType());
		soapModel.setRegisterAgent(model.getRegisterAgent());
		soapModel.setRegisterDate(model.getRegisterDate());
		soapModel.setRepresentative(model.getRepresentative());
		soapModel.setRepresentativeRole(model.getRepresentativeRole());

		return soapModel;
	}

	public static BusinessSoap[] toSoapModels(Business[] models) {
		BusinessSoap[] soapModels = new BusinessSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BusinessSoap[][] toSoapModels(Business[][] models) {
		BusinessSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BusinessSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BusinessSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BusinessSoap[] toSoapModels(List<Business> models) {
		List<BusinessSoap> soapModels = new ArrayList<BusinessSoap>(models.size());

		for (Business model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BusinessSoap[soapModels.size()]);
	}

	public BusinessSoap() {
	}

	public long getPrimaryKey() {
		return _businessId;
	}

	public void setPrimaryKey(long pk) {
		setBusinessId(pk);
	}

	public long getBusinessId() {
		return _businessId;
	}

	public void setBusinessId(long businessId) {
		_businessId = businessId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getOrganizationId() {
		return _organizationId;
	}

	public void setOrganizationId(long organizationId) {
		_organizationId = organizationId;
	}

	public long getMasterUserId() {
		return _masterUserId;
	}

	public void setMasterUserId(long masterUserId) {
		_masterUserId = masterUserId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getEnName() {
		return _enName;
	}

	public void setEnName(String enName) {
		_enName = enName;
	}

	public String getShortName() {
		return _shortName;
	}

	public void setShortName(String shortName) {
		_shortName = shortName;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public String getCityNo() {
		return _cityNo;
	}

	public void setCityNo(String cityNo) {
		_cityNo = cityNo;
	}

	public String getCityName() {
		return _cityName;
	}

	public void setCityName(String cityName) {
		_cityName = cityName;
	}

	public String getDistrictNo() {
		return _districtNo;
	}

	public void setDistrictNo(String districtNo) {
		_districtNo = districtNo;
	}

	public String getDistrictName() {
		return _districtName;
	}

	public void setDistrictName(String districtName) {
		_districtName = districtName;
	}

	public String getWardNo() {
		return _wardNo;
	}

	public void setWardNo(String wardNo) {
		_wardNo = wardNo;
	}

	public String getWardName() {
		return _wardName;
	}

	public void setWardName(String wardName) {
		_wardName = wardName;
	}

	public String getGpsPosition() {
		return _gpsPosition;
	}

	public void setGpsPosition(String gpsPosition) {
		_gpsPosition = gpsPosition;
	}

	public String getTelNo() {
		return _telNo;
	}

	public void setTelNo(String telNo) {
		_telNo = telNo;
	}

	public String getFax() {
		return _fax;
	}

	public void setFax(String fax) {
		_fax = fax;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getBusinessNo() {
		return _businessNo;
	}

	public void setBusinessNo(String businessNo) {
		_businessNo = businessNo;
	}

	public String getBusinessType() {
		return _businessType;
	}

	public void setBusinessType(String businessType) {
		_businessType = businessType;
	}

	public String getRegisterAgent() {
		return _registerAgent;
	}

	public void setRegisterAgent(String registerAgent) {
		_registerAgent = registerAgent;
	}

	public Date getRegisterDate() {
		return _registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		_registerDate = registerDate;
	}

	public String getRepresentative() {
		return _representative;
	}

	public void setRepresentative(String representative) {
		_representative = representative;
	}

	public String getRepresentativeRole() {
		return _representativeRole;
	}

	public void setRepresentativeRole(String representativeRole) {
		_representativeRole = representativeRole;
	}

	private long _businessId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _organizationId;
	private long _masterUserId;
	private String _name;
	private String _enName;
	private String _shortName;
	private String _address;
	private String _cityNo;
	private String _cityName;
	private String _districtNo;
	private String _districtName;
	private String _wardNo;
	private String _wardName;
	private String _gpsPosition;
	private String _telNo;
	private String _fax;
	private String _email;
	private String _businessNo;
	private String _businessType;
	private String _registerAgent;
	private Date _registerDate;
	private String _representative;
	private String _representativeRole;
}