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
 * This class is used by SOAP remote services, specifically {@link org.oep.usermgt.service.http.WorkingUnitServiceSoap}.
 *
 * @author NQMINH
 * @see org.oep.usermgt.service.http.WorkingUnitServiceSoap
 * @generated
 */
public class WorkingUnitSoap implements Serializable {
	public static WorkingUnitSoap toSoapModel(WorkingUnit model) {
		WorkingUnitSoap soapModel = new WorkingUnitSoap();

		soapModel.setWorkingUnitId(model.getWorkingUnitId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setOrganizationId(model.getOrganizationId());
		soapModel.setGovAgencyId(model.getGovAgencyId());
		soapModel.setName(model.getName());
		soapModel.setEnName(model.getEnName());
		soapModel.setParentWorkingUnitId(model.getParentWorkingUnitId());
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
		soapModel.setWebsite(model.getWebsite());
		soapModel.setAaa(model.getAaa());
		soapModel.setShortName(model.getShortName());

		return soapModel;
	}

	public static WorkingUnitSoap[] toSoapModels(WorkingUnit[] models) {
		WorkingUnitSoap[] soapModels = new WorkingUnitSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static WorkingUnitSoap[][] toSoapModels(WorkingUnit[][] models) {
		WorkingUnitSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new WorkingUnitSoap[models.length][models[0].length];
		}
		else {
			soapModels = new WorkingUnitSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static WorkingUnitSoap[] toSoapModels(List<WorkingUnit> models) {
		List<WorkingUnitSoap> soapModels = new ArrayList<WorkingUnitSoap>(models.size());

		for (WorkingUnit model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new WorkingUnitSoap[soapModels.size()]);
	}

	public WorkingUnitSoap() {
	}

	public long getPrimaryKey() {
		return _workingUnitId;
	}

	public void setPrimaryKey(long pk) {
		setWorkingUnitId(pk);
	}

	public long getWorkingUnitId() {
		return _workingUnitId;
	}

	public void setWorkingUnitId(long workingUnitId) {
		_workingUnitId = workingUnitId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
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

	public String getOrganizationId() {
		return _organizationId;
	}

	public void setOrganizationId(String organizationId) {
		_organizationId = organizationId;
	}

	public String getGovAgencyId() {
		return _govAgencyId;
	}

	public void setGovAgencyId(String govAgencyId) {
		_govAgencyId = govAgencyId;
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

	public long getParentWorkingUnitId() {
		return _parentWorkingUnitId;
	}

	public void setParentWorkingUnitId(long parentWorkingUnitId) {
		_parentWorkingUnitId = parentWorkingUnitId;
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

	public String getWebsite() {
		return _website;
	}

	public void setWebsite(String website) {
		_website = website;
	}

	public String getAaa() {
		return _aaa;
	}

	public void setAaa(String aaa) {
		_aaa = aaa;
	}

	public String getShortName() {
		return _shortName;
	}

	public void setShortName(String shortName) {
		_shortName = shortName;
	}

	private long _workingUnitId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _organizationId;
	private String _govAgencyId;
	private String _name;
	private String _enName;
	private long _parentWorkingUnitId;
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
	private String _website;
	private String _aaa;
	private String _shortName;
}