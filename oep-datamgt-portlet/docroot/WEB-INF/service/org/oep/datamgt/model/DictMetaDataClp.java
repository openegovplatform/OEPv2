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

package org.oep.datamgt.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import org.oep.datamgt.service.ClpSerializer;
import org.oep.datamgt.service.DictMetaDataLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author NQMINH
 */
public class DictMetaDataClp extends BaseModelImpl<DictMetaData>
	implements DictMetaData {
	public DictMetaDataClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DictMetaData.class;
	}

	@Override
	public String getModelClassName() {
		return DictMetaData.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _dictMetaDataId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDictMetaDataId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dictMetaDataId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dictMetaDataId", getDictMetaDataId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dictDataId", getDictDataId());
		attributes.put("attributeName", getAttributeName());
		attributes.put("attributeValue", getAttributeValue());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dictMetaDataId = (Long)attributes.get("dictMetaDataId");

		if (dictMetaDataId != null) {
			setDictMetaDataId(dictMetaDataId);
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

		Long dictDataId = (Long)attributes.get("dictDataId");

		if (dictDataId != null) {
			setDictDataId(dictDataId);
		}

		String attributeName = (String)attributes.get("attributeName");

		if (attributeName != null) {
			setAttributeName(attributeName);
		}

		String attributeValue = (String)attributes.get("attributeValue");

		if (attributeValue != null) {
			setAttributeValue(attributeValue);
		}
	}

	@Override
	public long getDictMetaDataId() {
		return _dictMetaDataId;
	}

	@Override
	public void setDictMetaDataId(long dictMetaDataId) {
		_dictMetaDataId = dictMetaDataId;

		if (_dictMetaDataRemoteModel != null) {
			try {
				Class<?> clazz = _dictMetaDataRemoteModel.getClass();

				Method method = clazz.getMethod("setDictMetaDataId", long.class);

				method.invoke(_dictMetaDataRemoteModel, dictMetaDataId);
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

		if (_dictMetaDataRemoteModel != null) {
			try {
				Class<?> clazz = _dictMetaDataRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_dictMetaDataRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_dictMetaDataRemoteModel != null) {
			try {
				Class<?> clazz = _dictMetaDataRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_dictMetaDataRemoteModel, groupId);
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

		if (_dictMetaDataRemoteModel != null) {
			try {
				Class<?> clazz = _dictMetaDataRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_dictMetaDataRemoteModel, userId);
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
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_dictMetaDataRemoteModel != null) {
			try {
				Class<?> clazz = _dictMetaDataRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_dictMetaDataRemoteModel, createDate);
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

		if (_dictMetaDataRemoteModel != null) {
			try {
				Class<?> clazz = _dictMetaDataRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dictMetaDataRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDictDataId() {
		return _dictDataId;
	}

	@Override
	public void setDictDataId(long dictDataId) {
		_dictDataId = dictDataId;

		if (_dictMetaDataRemoteModel != null) {
			try {
				Class<?> clazz = _dictMetaDataRemoteModel.getClass();

				Method method = clazz.getMethod("setDictDataId", long.class);

				method.invoke(_dictMetaDataRemoteModel, dictDataId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAttributeName() {
		return _attributeName;
	}

	@Override
	public void setAttributeName(String attributeName) {
		_attributeName = attributeName;

		if (_dictMetaDataRemoteModel != null) {
			try {
				Class<?> clazz = _dictMetaDataRemoteModel.getClass();

				Method method = clazz.getMethod("setAttributeName", String.class);

				method.invoke(_dictMetaDataRemoteModel, attributeName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAttributeValue() {
		return _attributeValue;
	}

	@Override
	public void setAttributeValue(String attributeValue) {
		_attributeValue = attributeValue;

		if (_dictMetaDataRemoteModel != null) {
			try {
				Class<?> clazz = _dictMetaDataRemoteModel.getClass();

				Method method = clazz.getMethod("setAttributeValue",
						String.class);

				method.invoke(_dictMetaDataRemoteModel, attributeValue);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDictMetaDataRemoteModel() {
		return _dictMetaDataRemoteModel;
	}

	public void setDictMetaDataRemoteModel(BaseModel<?> dictMetaDataRemoteModel) {
		_dictMetaDataRemoteModel = dictMetaDataRemoteModel;
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

		Class<?> remoteModelClass = _dictMetaDataRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dictMetaDataRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DictMetaDataLocalServiceUtil.addDictMetaData(this);
		}
		else {
			DictMetaDataLocalServiceUtil.updateDictMetaData(this);
		}
	}

	@Override
	public DictMetaData toEscapedModel() {
		return (DictMetaData)ProxyUtil.newProxyInstance(DictMetaData.class.getClassLoader(),
			new Class[] { DictMetaData.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DictMetaDataClp clone = new DictMetaDataClp();

		clone.setDictMetaDataId(getDictMetaDataId());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());
		clone.setUserId(getUserId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setDictDataId(getDictDataId());
		clone.setAttributeName(getAttributeName());
		clone.setAttributeValue(getAttributeValue());

		return clone;
	}

	@Override
	public int compareTo(DictMetaData dictMetaData) {
		long primaryKey = dictMetaData.getPrimaryKey();

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

		if (!(obj instanceof DictMetaDataClp)) {
			return false;
		}

		DictMetaDataClp dictMetaData = (DictMetaDataClp)obj;

		long primaryKey = dictMetaData.getPrimaryKey();

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
		StringBundler sb = new StringBundler(19);

		sb.append("{dictMetaDataId=");
		sb.append(getDictMetaDataId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", dictDataId=");
		sb.append(getDictDataId());
		sb.append(", attributeName=");
		sb.append(getAttributeName());
		sb.append(", attributeValue=");
		sb.append(getAttributeValue());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("org.oep.datamgt.model.DictMetaData");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>dictMetaDataId</column-name><column-value><![CDATA[");
		sb.append(getDictMetaDataId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
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
			"<column><column-name>dictDataId</column-name><column-value><![CDATA[");
		sb.append(getDictDataId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attributeName</column-name><column-value><![CDATA[");
		sb.append(getAttributeName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attributeValue</column-name><column-value><![CDATA[");
		sb.append(getAttributeValue());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _dictMetaDataId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private String _userUuid;
	private Date _createDate;
	private Date _modifiedDate;
	private long _dictDataId;
	private String _attributeName;
	private String _attributeValue;
	private BaseModel<?> _dictMetaDataRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.datamgt.service.ClpSerializer.class;
}