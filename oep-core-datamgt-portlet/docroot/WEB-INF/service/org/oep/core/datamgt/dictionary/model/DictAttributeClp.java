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

package org.oep.core.datamgt.dictionary.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import org.oep.core.datamgt.dictionary.service.ClpSerializer;
import org.oep.core.datamgt.dictionary.service.DictAttributeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author TrungDK
 */
public class DictAttributeClp extends BaseModelImpl<DictAttribute>
	implements DictAttribute {
	public DictAttributeClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DictAttribute.class;
	}

	@Override
	public String getModelClassName() {
		return DictAttribute.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _dictAttributeId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDictAttributeId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dictAttributeId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dictAttributeId", getDictAttributeId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("collectionName", getCollectionName());
		attributes.put("name", getName());
		attributes.put("title", getTitle());
		attributes.put("dataType", getDataType());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dictAttributeId = (Long)attributes.get("dictAttributeId");

		if (dictAttributeId != null) {
			setDictAttributeId(dictAttributeId);
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

		String collectionName = (String)attributes.get("collectionName");

		if (collectionName != null) {
			setCollectionName(collectionName);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String dataType = (String)attributes.get("dataType");

		if (dataType != null) {
			setDataType(dataType);
		}
	}

	@Override
	public long getDictAttributeId() {
		return _dictAttributeId;
	}

	@Override
	public void setDictAttributeId(long dictAttributeId) {
		_dictAttributeId = dictAttributeId;

		if (_dictAttributeRemoteModel != null) {
			try {
				Class<?> clazz = _dictAttributeRemoteModel.getClass();

				Method method = clazz.getMethod("setDictAttributeId", long.class);

				method.invoke(_dictAttributeRemoteModel, dictAttributeId);
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

		if (_dictAttributeRemoteModel != null) {
			try {
				Class<?> clazz = _dictAttributeRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_dictAttributeRemoteModel, companyId);
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

		if (_dictAttributeRemoteModel != null) {
			try {
				Class<?> clazz = _dictAttributeRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_dictAttributeRemoteModel, userId);
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

		if (_dictAttributeRemoteModel != null) {
			try {
				Class<?> clazz = _dictAttributeRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_dictAttributeRemoteModel, groupId);
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

		if (_dictAttributeRemoteModel != null) {
			try {
				Class<?> clazz = _dictAttributeRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_dictAttributeRemoteModel, createDate);
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

		if (_dictAttributeRemoteModel != null) {
			try {
				Class<?> clazz = _dictAttributeRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dictAttributeRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCollectionName() {
		return _collectionName;
	}

	@Override
	public void setCollectionName(String collectionName) {
		_collectionName = collectionName;

		if (_dictAttributeRemoteModel != null) {
			try {
				Class<?> clazz = _dictAttributeRemoteModel.getClass();

				Method method = clazz.getMethod("setCollectionName",
						String.class);

				method.invoke(_dictAttributeRemoteModel, collectionName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_dictAttributeRemoteModel != null) {
			try {
				Class<?> clazz = _dictAttributeRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_dictAttributeRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTitle() {
		return _title;
	}

	@Override
	public void setTitle(String title) {
		_title = title;

		if (_dictAttributeRemoteModel != null) {
			try {
				Class<?> clazz = _dictAttributeRemoteModel.getClass();

				Method method = clazz.getMethod("setTitle", String.class);

				method.invoke(_dictAttributeRemoteModel, title);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDataType() {
		return _dataType;
	}

	@Override
	public void setDataType(String dataType) {
		_dataType = dataType;

		if (_dictAttributeRemoteModel != null) {
			try {
				Class<?> clazz = _dictAttributeRemoteModel.getClass();

				Method method = clazz.getMethod("setDataType", String.class);

				method.invoke(_dictAttributeRemoteModel, dataType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDictAttributeRemoteModel() {
		return _dictAttributeRemoteModel;
	}

	public void setDictAttributeRemoteModel(
		BaseModel<?> dictAttributeRemoteModel) {
		_dictAttributeRemoteModel = dictAttributeRemoteModel;
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

		Class<?> remoteModelClass = _dictAttributeRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dictAttributeRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DictAttributeLocalServiceUtil.addDictAttribute(this);
		}
		else {
			DictAttributeLocalServiceUtil.updateDictAttribute(this);
		}
	}

	@Override
	public DictAttribute toEscapedModel() {
		return (DictAttribute)ProxyUtil.newProxyInstance(DictAttribute.class.getClassLoader(),
			new Class[] { DictAttribute.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DictAttributeClp clone = new DictAttributeClp();

		clone.setDictAttributeId(getDictAttributeId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setCollectionName(getCollectionName());
		clone.setName(getName());
		clone.setTitle(getTitle());
		clone.setDataType(getDataType());

		return clone;
	}

	@Override
	public int compareTo(DictAttribute dictAttribute) {
		long primaryKey = dictAttribute.getPrimaryKey();

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

		if (!(obj instanceof DictAttributeClp)) {
			return false;
		}

		DictAttributeClp dictAttribute = (DictAttributeClp)obj;

		long primaryKey = dictAttribute.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{dictAttributeId=");
		sb.append(getDictAttributeId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", collectionName=");
		sb.append(getCollectionName());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", dataType=");
		sb.append(getDataType());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.datamgt.dictionary.model.DictAttribute");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>dictAttributeId</column-name><column-value><![CDATA[");
		sb.append(getDictAttributeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
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
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>collectionName</column-name><column-value><![CDATA[");
		sb.append(getCollectionName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dataType</column-name><column-value><![CDATA[");
		sb.append(getDataType());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _dictAttributeId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _collectionName;
	private String _name;
	private String _title;
	private String _dataType;
	private BaseModel<?> _dictAttributeRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.datamgt.dictionary.service.ClpSerializer.class;
}