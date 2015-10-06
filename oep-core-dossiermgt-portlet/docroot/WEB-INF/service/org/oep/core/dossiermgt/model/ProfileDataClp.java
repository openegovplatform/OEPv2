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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import org.oep.core.dossiermgt.service.ClpSerializer;
import org.oep.core.dossiermgt.service.ProfileDataLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class ProfileDataClp extends BaseModelImpl<ProfileData>
	implements ProfileData {
	public ProfileDataClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ProfileData.class;
	}

	@Override
	public String getModelClassName() {
		return ProfileData.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _profileDataId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setProfileDataId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _profileDataId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("profileDataId", getProfileDataId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("fieldName", getFieldName());
		attributes.put("fieldValue", getFieldValue());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long profileDataId = (Long)attributes.get("profileDataId");

		if (profileDataId != null) {
			setProfileDataId(profileDataId);
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

		String fieldName = (String)attributes.get("fieldName");

		if (fieldName != null) {
			setFieldName(fieldName);
		}

		String fieldValue = (String)attributes.get("fieldValue");

		if (fieldValue != null) {
			setFieldValue(fieldValue);
		}
	}

	@Override
	public long getProfileDataId() {
		return _profileDataId;
	}

	@Override
	public void setProfileDataId(long profileDataId) {
		_profileDataId = profileDataId;

		if (_profileDataRemoteModel != null) {
			try {
				Class<?> clazz = _profileDataRemoteModel.getClass();

				Method method = clazz.getMethod("setProfileDataId", long.class);

				method.invoke(_profileDataRemoteModel, profileDataId);
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

		if (_profileDataRemoteModel != null) {
			try {
				Class<?> clazz = _profileDataRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_profileDataRemoteModel, userId);
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

		if (_profileDataRemoteModel != null) {
			try {
				Class<?> clazz = _profileDataRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_profileDataRemoteModel, groupId);
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

		if (_profileDataRemoteModel != null) {
			try {
				Class<?> clazz = _profileDataRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_profileDataRemoteModel, companyId);
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

		if (_profileDataRemoteModel != null) {
			try {
				Class<?> clazz = _profileDataRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_profileDataRemoteModel, createDate);
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

		if (_profileDataRemoteModel != null) {
			try {
				Class<?> clazz = _profileDataRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_profileDataRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFieldName() {
		return _fieldName;
	}

	@Override
	public void setFieldName(String fieldName) {
		_fieldName = fieldName;

		if (_profileDataRemoteModel != null) {
			try {
				Class<?> clazz = _profileDataRemoteModel.getClass();

				Method method = clazz.getMethod("setFieldName", String.class);

				method.invoke(_profileDataRemoteModel, fieldName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFieldValue() {
		return _fieldValue;
	}

	@Override
	public void setFieldValue(String fieldValue) {
		_fieldValue = fieldValue;

		if (_profileDataRemoteModel != null) {
			try {
				Class<?> clazz = _profileDataRemoteModel.getClass();

				Method method = clazz.getMethod("setFieldValue", String.class);

				method.invoke(_profileDataRemoteModel, fieldValue);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getProfileDataRemoteModel() {
		return _profileDataRemoteModel;
	}

	public void setProfileDataRemoteModel(BaseModel<?> profileDataRemoteModel) {
		_profileDataRemoteModel = profileDataRemoteModel;
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

		Class<?> remoteModelClass = _profileDataRemoteModel.getClass();

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

		Object returnValue = method.invoke(_profileDataRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ProfileDataLocalServiceUtil.addProfileData(this);
		}
		else {
			ProfileDataLocalServiceUtil.updateProfileData(this);
		}
	}

	@Override
	public ProfileData toEscapedModel() {
		return (ProfileData)ProxyUtil.newProxyInstance(ProfileData.class.getClassLoader(),
			new Class[] { ProfileData.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ProfileDataClp clone = new ProfileDataClp();

		clone.setProfileDataId(getProfileDataId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setFieldName(getFieldName());
		clone.setFieldValue(getFieldValue());

		return clone;
	}

	@Override
	public int compareTo(ProfileData profileData) {
		long primaryKey = profileData.getPrimaryKey();

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

		if (!(obj instanceof ProfileDataClp)) {
			return false;
		}

		ProfileDataClp profileData = (ProfileDataClp)obj;

		long primaryKey = profileData.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{profileDataId=");
		sb.append(getProfileDataId());
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
		sb.append(", fieldName=");
		sb.append(getFieldName());
		sb.append(", fieldValue=");
		sb.append(getFieldValue());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.dossiermgt.model.ProfileData");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>profileDataId</column-name><column-value><![CDATA[");
		sb.append(getProfileDataId());
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
			"<column><column-name>fieldName</column-name><column-value><![CDATA[");
		sb.append(getFieldName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fieldValue</column-name><column-value><![CDATA[");
		sb.append(getFieldValue());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _profileDataId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _fieldName;
	private String _fieldValue;
	private BaseModel<?> _profileDataRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.dossiermgt.service.ClpSerializer.class;
}