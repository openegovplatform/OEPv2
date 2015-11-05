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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import org.oep.usermgt.service.BusinessLocalServiceUtil;
import org.oep.usermgt.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author NQMINH
 */
public class BusinessClp extends BaseModelImpl<Business> implements Business {
	public BusinessClp() {
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
	public long getPrimaryKey() {
		return _businessId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setBusinessId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _businessId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getBusinessId() {
		return _businessId;
	}

	@Override
	public void setBusinessId(long businessId) {
		_businessId = businessId;

		if (_businessRemoteModel != null) {
			try {
				Class<?> clazz = _businessRemoteModel.getClass();

				Method method = clazz.getMethod("setBusinessId", long.class);

				method.invoke(_businessRemoteModel, businessId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_businessRemoteModel != null) {
			try {
				Class<?> clazz = _businessRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_businessRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_businessRemoteModel != null) {
			try {
				Class<?> clazz = _businessRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_businessRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_businessRemoteModel != null) {
			try {
				Class<?> clazz = _businessRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_businessRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_businessRemoteModel != null) {
			try {
				Class<?> clazz = _businessRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_businessRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_businessRemoteModel != null) {
			try {
				Class<?> clazz = _businessRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_businessRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getOrganizationId() {
		return _organizationId;
	}

	@Override
	public void setOrganizationId(long organizationId) {
		_organizationId = organizationId;

		if (_businessRemoteModel != null) {
			try {
				Class<?> clazz = _businessRemoteModel.getClass();

				Method method = clazz.getMethod("setOrganizationId", long.class);

				method.invoke(_businessRemoteModel, organizationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getMasterUserId() {
		return _masterUserId;
	}

	@Override
	public void setMasterUserId(long masterUserId) {
		_masterUserId = masterUserId;

		if (_businessRemoteModel != null) {
			try {
				Class<?> clazz = _businessRemoteModel.getClass();

				Method method = clazz.getMethod("setMasterUserId", long.class);

				method.invoke(_businessRemoteModel, masterUserId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMasterUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getMasterUserId(), "uuid",
			_masterUserUuid);
	}

	@Override
	public void setMasterUserUuid(String masterUserUuid) {
		_masterUserUuid = masterUserUuid;
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_businessRemoteModel != null) {
			try {
				Class<?> clazz = _businessRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_businessRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEnName() {
		return _enName;
	}

	@Override
	public void setEnName(String enName) {
		_enName = enName;

		if (_businessRemoteModel != null) {
			try {
				Class<?> clazz = _businessRemoteModel.getClass();

				Method method = clazz.getMethod("setEnName", String.class);

				method.invoke(_businessRemoteModel, enName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getShortName() {
		return _shortName;
	}

	@Override
	public void setShortName(String shortName) {
		_shortName = shortName;

		if (_businessRemoteModel != null) {
			try {
				Class<?> clazz = _businessRemoteModel.getClass();

				Method method = clazz.getMethod("setShortName", String.class);

				method.invoke(_businessRemoteModel, shortName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddress() {
		return _address;
	}

	@Override
	public void setAddress(String address) {
		_address = address;

		if (_businessRemoteModel != null) {
			try {
				Class<?> clazz = _businessRemoteModel.getClass();

				Method method = clazz.getMethod("setAddress", String.class);

				method.invoke(_businessRemoteModel, address);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCityNo() {
		return _cityNo;
	}

	@Override
	public void setCityNo(String cityNo) {
		_cityNo = cityNo;

		if (_businessRemoteModel != null) {
			try {
				Class<?> clazz = _businessRemoteModel.getClass();

				Method method = clazz.getMethod("setCityNo", String.class);

				method.invoke(_businessRemoteModel, cityNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCityName() {
		return _cityName;
	}

	@Override
	public void setCityName(String cityName) {
		_cityName = cityName;

		if (_businessRemoteModel != null) {
			try {
				Class<?> clazz = _businessRemoteModel.getClass();

				Method method = clazz.getMethod("setCityName", String.class);

				method.invoke(_businessRemoteModel, cityName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDistrictNo() {
		return _districtNo;
	}

	@Override
	public void setDistrictNo(String districtNo) {
		_districtNo = districtNo;

		if (_businessRemoteModel != null) {
			try {
				Class<?> clazz = _businessRemoteModel.getClass();

				Method method = clazz.getMethod("setDistrictNo", String.class);

				method.invoke(_businessRemoteModel, districtNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDistrictName() {
		return _districtName;
	}

	@Override
	public void setDistrictName(String districtName) {
		_districtName = districtName;

		if (_businessRemoteModel != null) {
			try {
				Class<?> clazz = _businessRemoteModel.getClass();

				Method method = clazz.getMethod("setDistrictName", String.class);

				method.invoke(_businessRemoteModel, districtName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getWardNo() {
		return _wardNo;
	}

	@Override
	public void setWardNo(String wardNo) {
		_wardNo = wardNo;

		if (_businessRemoteModel != null) {
			try {
				Class<?> clazz = _businessRemoteModel.getClass();

				Method method = clazz.getMethod("setWardNo", String.class);

				method.invoke(_businessRemoteModel, wardNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getWardName() {
		return _wardName;
	}

	@Override
	public void setWardName(String wardName) {
		_wardName = wardName;

		if (_businessRemoteModel != null) {
			try {
				Class<?> clazz = _businessRemoteModel.getClass();

				Method method = clazz.getMethod("setWardName", String.class);

				method.invoke(_businessRemoteModel, wardName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGpsPosition() {
		return _gpsPosition;
	}

	@Override
	public void setGpsPosition(String gpsPosition) {
		_gpsPosition = gpsPosition;

		if (_businessRemoteModel != null) {
			try {
				Class<?> clazz = _businessRemoteModel.getClass();

				Method method = clazz.getMethod("setGpsPosition", String.class);

				method.invoke(_businessRemoteModel, gpsPosition);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTelNo() {
		return _telNo;
	}

	@Override
	public void setTelNo(String telNo) {
		_telNo = telNo;

		if (_businessRemoteModel != null) {
			try {
				Class<?> clazz = _businessRemoteModel.getClass();

				Method method = clazz.getMethod("setTelNo", String.class);

				method.invoke(_businessRemoteModel, telNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFax() {
		return _fax;
	}

	@Override
	public void setFax(String fax) {
		_fax = fax;

		if (_businessRemoteModel != null) {
			try {
				Class<?> clazz = _businessRemoteModel.getClass();

				Method method = clazz.getMethod("setFax", String.class);

				method.invoke(_businessRemoteModel, fax);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmail() {
		return _email;
	}

	@Override
	public void setEmail(String email) {
		_email = email;

		if (_businessRemoteModel != null) {
			try {
				Class<?> clazz = _businessRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_businessRemoteModel, email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBusinessNo() {
		return _businessNo;
	}

	@Override
	public void setBusinessNo(String businessNo) {
		_businessNo = businessNo;

		if (_businessRemoteModel != null) {
			try {
				Class<?> clazz = _businessRemoteModel.getClass();

				Method method = clazz.getMethod("setBusinessNo", String.class);

				method.invoke(_businessRemoteModel, businessNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBusinessType() {
		return _businessType;
	}

	@Override
	public void setBusinessType(String businessType) {
		_businessType = businessType;

		if (_businessRemoteModel != null) {
			try {
				Class<?> clazz = _businessRemoteModel.getClass();

				Method method = clazz.getMethod("setBusinessType", String.class);

				method.invoke(_businessRemoteModel, businessType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRegisterAgent() {
		return _registerAgent;
	}

	@Override
	public void setRegisterAgent(String registerAgent) {
		_registerAgent = registerAgent;

		if (_businessRemoteModel != null) {
			try {
				Class<?> clazz = _businessRemoteModel.getClass();

				Method method = clazz.getMethod("setRegisterAgent", String.class);

				method.invoke(_businessRemoteModel, registerAgent);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getRegisterDate() {
		return _registerDate;
	}

	@Override
	public void setRegisterDate(Date registerDate) {
		_registerDate = registerDate;

		if (_businessRemoteModel != null) {
			try {
				Class<?> clazz = _businessRemoteModel.getClass();

				Method method = clazz.getMethod("setRegisterDate", Date.class);

				method.invoke(_businessRemoteModel, registerDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRepresentative() {
		return _representative;
	}

	@Override
	public void setRepresentative(String representative) {
		_representative = representative;

		if (_businessRemoteModel != null) {
			try {
				Class<?> clazz = _businessRemoteModel.getClass();

				Method method = clazz.getMethod("setRepresentative",
						String.class);

				method.invoke(_businessRemoteModel, representative);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRepresentativeRole() {
		return _representativeRole;
	}

	@Override
	public void setRepresentativeRole(String representativeRole) {
		_representativeRole = representativeRole;

		if (_businessRemoteModel != null) {
			try {
				Class<?> clazz = _businessRemoteModel.getClass();

				Method method = clazz.getMethod("setRepresentativeRole",
						String.class);

				method.invoke(_businessRemoteModel, representativeRole);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getBusinessRemoteModel() {
		return _businessRemoteModel;
	}

	public void setBusinessRemoteModel(BaseModel<?> businessRemoteModel) {
		_businessRemoteModel = businessRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _businessRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_businessRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			BusinessLocalServiceUtil.addBusiness(this);
		}
		else {
			BusinessLocalServiceUtil.updateBusiness(this);
		}
	}

	@Override
	public Business toEscapedModel() {
		return (Business)ProxyUtil.newProxyInstance(Business.class.getClassLoader(),
			new Class[] { Business.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		BusinessClp clone = new BusinessClp();

		clone.setBusinessId(getBusinessId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setOrganizationId(getOrganizationId());
		clone.setMasterUserId(getMasterUserId());
		clone.setName(getName());
		clone.setEnName(getEnName());
		clone.setShortName(getShortName());
		clone.setAddress(getAddress());
		clone.setCityNo(getCityNo());
		clone.setCityName(getCityName());
		clone.setDistrictNo(getDistrictNo());
		clone.setDistrictName(getDistrictName());
		clone.setWardNo(getWardNo());
		clone.setWardName(getWardName());
		clone.setGpsPosition(getGpsPosition());
		clone.setTelNo(getTelNo());
		clone.setFax(getFax());
		clone.setEmail(getEmail());
		clone.setBusinessNo(getBusinessNo());
		clone.setBusinessType(getBusinessType());
		clone.setRegisterAgent(getRegisterAgent());
		clone.setRegisterDate(getRegisterDate());
		clone.setRepresentative(getRepresentative());
		clone.setRepresentativeRole(getRepresentativeRole());

		return clone;
	}

	@Override
	public int compareTo(Business business) {
		long primaryKey = business.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BusinessClp)) {
			return false;
		}

		BusinessClp business = (BusinessClp)obj;

		long primaryKey = business.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(57);

		sb.append("{businessId=");
		sb.append(getBusinessId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", organizationId=");
		sb.append(getOrganizationId());
		sb.append(", masterUserId=");
		sb.append(getMasterUserId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", enName=");
		sb.append(getEnName());
		sb.append(", shortName=");
		sb.append(getShortName());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", cityNo=");
		sb.append(getCityNo());
		sb.append(", cityName=");
		sb.append(getCityName());
		sb.append(", districtNo=");
		sb.append(getDistrictNo());
		sb.append(", districtName=");
		sb.append(getDistrictName());
		sb.append(", wardNo=");
		sb.append(getWardNo());
		sb.append(", wardName=");
		sb.append(getWardName());
		sb.append(", gpsPosition=");
		sb.append(getGpsPosition());
		sb.append(", telNo=");
		sb.append(getTelNo());
		sb.append(", fax=");
		sb.append(getFax());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", businessNo=");
		sb.append(getBusinessNo());
		sb.append(", businessType=");
		sb.append(getBusinessType());
		sb.append(", registerAgent=");
		sb.append(getRegisterAgent());
		sb.append(", registerDate=");
		sb.append(getRegisterDate());
		sb.append(", representative=");
		sb.append(getRepresentative());
		sb.append(", representativeRole=");
		sb.append(getRepresentativeRole());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(88);

		sb.append("<model><model-name>");
		sb.append("org.oep.usermgt.model.Business");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>businessId</column-name><column-value><![CDATA[");
		sb.append(getBusinessId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizationId</column-name><column-value><![CDATA[");
		sb.append(getOrganizationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>masterUserId</column-name><column-value><![CDATA[");
		sb.append(getMasterUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enName</column-name><column-value><![CDATA[");
		sb.append(getEnName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shortName</column-name><column-value><![CDATA[");
		sb.append(getShortName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cityNo</column-name><column-value><![CDATA[");
		sb.append(getCityNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cityName</column-name><column-value><![CDATA[");
		sb.append(getCityName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>districtNo</column-name><column-value><![CDATA[");
		sb.append(getDistrictNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>districtName</column-name><column-value><![CDATA[");
		sb.append(getDistrictName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wardNo</column-name><column-value><![CDATA[");
		sb.append(getWardNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wardName</column-name><column-value><![CDATA[");
		sb.append(getWardName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gpsPosition</column-name><column-value><![CDATA[");
		sb.append(getGpsPosition());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>telNo</column-name><column-value><![CDATA[");
		sb.append(getTelNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fax</column-name><column-value><![CDATA[");
		sb.append(getFax());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>businessNo</column-name><column-value><![CDATA[");
		sb.append(getBusinessNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>businessType</column-name><column-value><![CDATA[");
		sb.append(getBusinessType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registerAgent</column-name><column-value><![CDATA[");
		sb.append(getRegisterAgent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registerDate</column-name><column-value><![CDATA[");
		sb.append(getRegisterDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>representative</column-name><column-value><![CDATA[");
		sb.append(getRepresentative());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>representativeRole</column-name><column-value><![CDATA[");
		sb.append(getRepresentativeRole());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _businessId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _organizationId;
	private long _masterUserId;
	private String _masterUserUuid;
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
	private BaseModel<?> _businessRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.usermgt.service.ClpSerializer.class;
}