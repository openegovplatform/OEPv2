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
 * This class is used by SOAP remote services, specifically {@link org.oep.usermgt.service.http.SubAccountServiceSoap}.
 *
 * @author NQMINH
 * @see org.oep.usermgt.service.http.SubAccountServiceSoap
 * @generated
 */
public class SubAccountSoap implements Serializable {
	public static SubAccountSoap toSoapModel(SubAccount model) {
		SubAccountSoap soapModel = new SubAccountSoap();

		soapModel.setSubAccountId(model.getSubAccountId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setBusinessId(model.getBusinessId());
		soapModel.setMappingUserId(model.getMappingUserId());
		soapModel.setFullName(model.getFullName());
		soapModel.setShortName(model.getShortName());
		soapModel.setWorkingRole(model.getWorkingRole());
		soapModel.setTelNo(model.getTelNo());
		soapModel.setMobile(model.getMobile());
		soapModel.setEmail(model.getEmail());

		return soapModel;
	}

	public static SubAccountSoap[] toSoapModels(SubAccount[] models) {
		SubAccountSoap[] soapModels = new SubAccountSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SubAccountSoap[][] toSoapModels(SubAccount[][] models) {
		SubAccountSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SubAccountSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SubAccountSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SubAccountSoap[] toSoapModels(List<SubAccount> models) {
		List<SubAccountSoap> soapModels = new ArrayList<SubAccountSoap>(models.size());

		for (SubAccount model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SubAccountSoap[soapModels.size()]);
	}

	public SubAccountSoap() {
	}

	public long getPrimaryKey() {
		return _subAccountId;
	}

	public void setPrimaryKey(long pk) {
		setSubAccountId(pk);
	}

	public long getSubAccountId() {
		return _subAccountId;
	}

	public void setSubAccountId(long subAccountId) {
		_subAccountId = subAccountId;
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

	public long getBusinessId() {
		return _businessId;
	}

	public void setBusinessId(long businessId) {
		_businessId = businessId;
	}

	public long getMappingUserId() {
		return _mappingUserId;
	}

	public void setMappingUserId(long mappingUserId) {
		_mappingUserId = mappingUserId;
	}

	public String getFullName() {
		return _fullName;
	}

	public void setFullName(String fullName) {
		_fullName = fullName;
	}

	public String getShortName() {
		return _shortName;
	}

	public void setShortName(String shortName) {
		_shortName = shortName;
	}

	public String getWorkingRole() {
		return _workingRole;
	}

	public void setWorkingRole(String workingRole) {
		_workingRole = workingRole;
	}

	public String getTelNo() {
		return _telNo;
	}

	public void setTelNo(String telNo) {
		_telNo = telNo;
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

	private long _subAccountId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _businessId;
	private long _mappingUserId;
	private String _fullName;
	private String _shortName;
	private String _workingRole;
	private String _telNo;
	private String _mobile;
	private String _email;
}