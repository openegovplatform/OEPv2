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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.oep.dossiermgt.service.http.ProfileDataServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.dossiermgt.service.http.ProfileDataServiceSoap
 * @generated
 */
public class ProfileDataSoap implements Serializable {
	public static ProfileDataSoap toSoapModel(ProfileData model) {
		ProfileDataSoap soapModel = new ProfileDataSoap();

		soapModel.setProfileDataId(model.getProfileDataId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setFieldName(model.getFieldName());
		soapModel.setFieldValue(model.getFieldValue());

		return soapModel;
	}

	public static ProfileDataSoap[] toSoapModels(ProfileData[] models) {
		ProfileDataSoap[] soapModels = new ProfileDataSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ProfileDataSoap[][] toSoapModels(ProfileData[][] models) {
		ProfileDataSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ProfileDataSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ProfileDataSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ProfileDataSoap[] toSoapModels(List<ProfileData> models) {
		List<ProfileDataSoap> soapModels = new ArrayList<ProfileDataSoap>(models.size());

		for (ProfileData model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ProfileDataSoap[soapModels.size()]);
	}

	public ProfileDataSoap() {
	}

	public long getPrimaryKey() {
		return _profileDataId;
	}

	public void setPrimaryKey(long pk) {
		setProfileDataId(pk);
	}

	public long getProfileDataId() {
		return _profileDataId;
	}

	public void setProfileDataId(long profileDataId) {
		_profileDataId = profileDataId;
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

	public String getFieldName() {
		return _fieldName;
	}

	public void setFieldName(String fieldName) {
		_fieldName = fieldName;
	}

	public String getFieldValue() {
		return _fieldValue;
	}

	public void setFieldValue(String fieldValue) {
		_fieldValue = fieldValue;
	}

	private long _profileDataId;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _fieldName;
	private String _fieldValue;
}