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
 * This class is used by SOAP remote services, specifically {@link org.oep.usermgt.service.http.CitizenServiceSoap}.
 *
 * @author NQMINH
 * @see org.oep.usermgt.service.http.CitizenServiceSoap
 * @generated
 */
public class CitizenSoap implements Serializable {
	public static CitizenSoap toSoapModel(Citizen model) {
		CitizenSoap soapModel = new CitizenSoap();

		soapModel.setCitizenId(model.getCitizenId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setMappingUserId(model.getMappingUserId());
		soapModel.setCitizenNo(model.getCitizenNo());
		soapModel.setFullName(model.getFullName());
		soapModel.setGender(model.getGender());
		soapModel.setIdentificationNo(model.getIdentificationNo());
		soapModel.setAddress(model.getAddress());
		soapModel.setCityNo(model.getCityNo());
		soapModel.setCityName(model.getCityName());
		soapModel.setDistrictNo(model.getDistrictNo());
		soapModel.setDistrictName(model.getDistrictName());
		soapModel.setWardNo(model.getWardNo());
		soapModel.setWardName(model.getWardName());
		soapModel.setHomeAddress(model.getHomeAddress());
		soapModel.setHomeTel(model.getHomeTel());
		soapModel.setMobile(model.getMobile());
		soapModel.setEmail(model.getEmail());
		soapModel.setShortName(model.getShortName());

		return soapModel;
	}

	public static CitizenSoap[] toSoapModels(Citizen[] models) {
		CitizenSoap[] soapModels = new CitizenSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CitizenSoap[][] toSoapModels(Citizen[][] models) {
		CitizenSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CitizenSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CitizenSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CitizenSoap[] toSoapModels(List<Citizen> models) {
		List<CitizenSoap> soapModels = new ArrayList<CitizenSoap>(models.size());

		for (Citizen model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CitizenSoap[soapModels.size()]);
	}

	public CitizenSoap() {
	}

	public long getPrimaryKey() {
		return _citizenId;
	}

	public void setPrimaryKey(long pk) {
		setCitizenId(pk);
	}

	public long getCitizenId() {
		return _citizenId;
	}

	public void setCitizenId(long citizenId) {
		_citizenId = citizenId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
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

	public long getMappingUserId() {
		return _mappingUserId;
	}

	public void setMappingUserId(long mappingUserId) {
		_mappingUserId = mappingUserId;
	}

	public String getCitizenNo() {
		return _citizenNo;
	}

	public void setCitizenNo(String citizenNo) {
		_citizenNo = citizenNo;
	}

	public String getFullName() {
		return _fullName;
	}

	public void setFullName(String fullName) {
		_fullName = fullName;
	}

	public int getGender() {
		return _gender;
	}

	public void setGender(int gender) {
		_gender = gender;
	}

	public String getIdentificationNo() {
		return _identificationNo;
	}

	public void setIdentificationNo(String identificationNo) {
		_identificationNo = identificationNo;
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

	public String getHomeAddress() {
		return _homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		_homeAddress = homeAddress;
	}

	public String getHomeTel() {
		return _homeTel;
	}

	public void setHomeTel(String homeTel) {
		_homeTel = homeTel;
	}

	public String getMobile() {
		return _mobile;
	}

	public void setMobile(String mobile) {
		_mobile = mobile;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getShortName() {
		return _shortName;
	}

	public void setShortName(String shortName) {
		_shortName = shortName;
	}

	private long _citizenId;
	private long _companyId;
	private long _userId;
	private long _groupId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _mappingUserId;
	private String _citizenNo;
	private String _fullName;
	private int _gender;
	private String _identificationNo;
	private String _address;
	private String _cityNo;
	private String _cityName;
	private String _districtNo;
	private String _districtName;
	private String _wardNo;
	private String _wardName;
	private String _homeAddress;
	private String _homeTel;
	private String _mobile;
	private String _email;
	private String _shortName;
}