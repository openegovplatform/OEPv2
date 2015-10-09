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

import org.oep.core.datamgt.dictionary.service.ClpSerializer;
import org.oep.core.datamgt.dictionary.service.DictDataLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author TrungDK
 */
public class DictDataClp extends BaseModelImpl<DictData> implements DictData {
	public DictDataClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DictData.class;
	}

	@Override
	public String getModelClassName() {
		return DictData.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _dictDataId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDictDataId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dictDataId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dictDataId", getDictDataId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("collectionName", getCollectionName());
		attributes.put("dataCode", getDataCode());
		attributes.put("node_1", getNode_1());
		attributes.put("node_2", getNode_2());
		attributes.put("node_3", getNode_3());
		attributes.put("node_4", getNode_4());
		attributes.put("node_5", getNode_5());
		attributes.put("dataLevel", getDataLevel());
		attributes.put("title", getTitle());
		attributes.put("description", getDescription());
		attributes.put("validatedFrom", getValidatedFrom());
		attributes.put("validatedTo", getValidatedTo());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dictDataId = (Long)attributes.get("dictDataId");

		if (dictDataId != null) {
			setDictDataId(dictDataId);
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

		String collectionName = (String)attributes.get("collectionName");

		if (collectionName != null) {
			setCollectionName(collectionName);
		}

		String dataCode = (String)attributes.get("dataCode");

		if (dataCode != null) {
			setDataCode(dataCode);
		}

		String node_1 = (String)attributes.get("node_1");

		if (node_1 != null) {
			setNode_1(node_1);
		}

		String node_2 = (String)attributes.get("node_2");

		if (node_2 != null) {
			setNode_2(node_2);
		}

		String node_3 = (String)attributes.get("node_3");

		if (node_3 != null) {
			setNode_3(node_3);
		}

		String node_4 = (String)attributes.get("node_4");

		if (node_4 != null) {
			setNode_4(node_4);
		}

		String node_5 = (String)attributes.get("node_5");

		if (node_5 != null) {
			setNode_5(node_5);
		}

		Integer dataLevel = (Integer)attributes.get("dataLevel");

		if (dataLevel != null) {
			setDataLevel(dataLevel);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Date validatedFrom = (Date)attributes.get("validatedFrom");

		if (validatedFrom != null) {
			setValidatedFrom(validatedFrom);
		}

		Date validatedTo = (Date)attributes.get("validatedTo");

		if (validatedTo != null) {
			setValidatedTo(validatedTo);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public long getDictDataId() {
		return _dictDataId;
	}

	@Override
	public void setDictDataId(long dictDataId) {
		_dictDataId = dictDataId;

		if (_dictDataRemoteModel != null) {
			try {
				Class<?> clazz = _dictDataRemoteModel.getClass();

				Method method = clazz.getMethod("setDictDataId", long.class);

				method.invoke(_dictDataRemoteModel, dictDataId);
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

		if (_dictDataRemoteModel != null) {
			try {
				Class<?> clazz = _dictDataRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_dictDataRemoteModel, companyId);
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

		if (_dictDataRemoteModel != null) {
			try {
				Class<?> clazz = _dictDataRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_dictDataRemoteModel, createDate);
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

		if (_dictDataRemoteModel != null) {
			try {
				Class<?> clazz = _dictDataRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dictDataRemoteModel, modifiedDate);
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

		if (_dictDataRemoteModel != null) {
			try {
				Class<?> clazz = _dictDataRemoteModel.getClass();

				Method method = clazz.getMethod("setCollectionName",
						String.class);

				method.invoke(_dictDataRemoteModel, collectionName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDataCode() {
		return _dataCode;
	}

	@Override
	public void setDataCode(String dataCode) {
		_dataCode = dataCode;

		if (_dictDataRemoteModel != null) {
			try {
				Class<?> clazz = _dictDataRemoteModel.getClass();

				Method method = clazz.getMethod("setDataCode", String.class);

				method.invoke(_dictDataRemoteModel, dataCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNode_1() {
		return _node_1;
	}

	@Override
	public void setNode_1(String node_1) {
		_node_1 = node_1;

		if (_dictDataRemoteModel != null) {
			try {
				Class<?> clazz = _dictDataRemoteModel.getClass();

				Method method = clazz.getMethod("setNode_1", String.class);

				method.invoke(_dictDataRemoteModel, node_1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNode_2() {
		return _node_2;
	}

	@Override
	public void setNode_2(String node_2) {
		_node_2 = node_2;

		if (_dictDataRemoteModel != null) {
			try {
				Class<?> clazz = _dictDataRemoteModel.getClass();

				Method method = clazz.getMethod("setNode_2", String.class);

				method.invoke(_dictDataRemoteModel, node_2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNode_3() {
		return _node_3;
	}

	@Override
	public void setNode_3(String node_3) {
		_node_3 = node_3;

		if (_dictDataRemoteModel != null) {
			try {
				Class<?> clazz = _dictDataRemoteModel.getClass();

				Method method = clazz.getMethod("setNode_3", String.class);

				method.invoke(_dictDataRemoteModel, node_3);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNode_4() {
		return _node_4;
	}

	@Override
	public void setNode_4(String node_4) {
		_node_4 = node_4;

		if (_dictDataRemoteModel != null) {
			try {
				Class<?> clazz = _dictDataRemoteModel.getClass();

				Method method = clazz.getMethod("setNode_4", String.class);

				method.invoke(_dictDataRemoteModel, node_4);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNode_5() {
		return _node_5;
	}

	@Override
	public void setNode_5(String node_5) {
		_node_5 = node_5;

		if (_dictDataRemoteModel != null) {
			try {
				Class<?> clazz = _dictDataRemoteModel.getClass();

				Method method = clazz.getMethod("setNode_5", String.class);

				method.invoke(_dictDataRemoteModel, node_5);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDataLevel() {
		return _dataLevel;
	}

	@Override
	public void setDataLevel(int dataLevel) {
		_dataLevel = dataLevel;

		if (_dictDataRemoteModel != null) {
			try {
				Class<?> clazz = _dictDataRemoteModel.getClass();

				Method method = clazz.getMethod("setDataLevel", int.class);

				method.invoke(_dictDataRemoteModel, dataLevel);
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

		if (_dictDataRemoteModel != null) {
			try {
				Class<?> clazz = _dictDataRemoteModel.getClass();

				Method method = clazz.getMethod("setTitle", String.class);

				method.invoke(_dictDataRemoteModel, title);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_dictDataRemoteModel != null) {
			try {
				Class<?> clazz = _dictDataRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_dictDataRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getValidatedFrom() {
		return _validatedFrom;
	}

	@Override
	public void setValidatedFrom(Date validatedFrom) {
		_validatedFrom = validatedFrom;

		if (_dictDataRemoteModel != null) {
			try {
				Class<?> clazz = _dictDataRemoteModel.getClass();

				Method method = clazz.getMethod("setValidatedFrom", Date.class);

				method.invoke(_dictDataRemoteModel, validatedFrom);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getValidatedTo() {
		return _validatedTo;
	}

	@Override
	public void setValidatedTo(Date validatedTo) {
		_validatedTo = validatedTo;

		if (_dictDataRemoteModel != null) {
			try {
				Class<?> clazz = _dictDataRemoteModel.getClass();

				Method method = clazz.getMethod("setValidatedTo", Date.class);

				method.invoke(_dictDataRemoteModel, validatedTo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_status = status;

		if (_dictDataRemoteModel != null) {
			try {
				Class<?> clazz = _dictDataRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", int.class);

				method.invoke(_dictDataRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDictDataRemoteModel() {
		return _dictDataRemoteModel;
	}

	public void setDictDataRemoteModel(BaseModel<?> dictDataRemoteModel) {
		_dictDataRemoteModel = dictDataRemoteModel;
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

		Class<?> remoteModelClass = _dictDataRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dictDataRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DictDataLocalServiceUtil.addDictData(this);
		}
		else {
			DictDataLocalServiceUtil.updateDictData(this);
		}
	}

	@Override
	public DictData toEscapedModel() {
		return (DictData)ProxyUtil.newProxyInstance(DictData.class.getClassLoader(),
			new Class[] { DictData.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DictDataClp clone = new DictDataClp();

		clone.setDictDataId(getDictDataId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setCollectionName(getCollectionName());
		clone.setDataCode(getDataCode());
		clone.setNode_1(getNode_1());
		clone.setNode_2(getNode_2());
		clone.setNode_3(getNode_3());
		clone.setNode_4(getNode_4());
		clone.setNode_5(getNode_5());
		clone.setDataLevel(getDataLevel());
		clone.setTitle(getTitle());
		clone.setDescription(getDescription());
		clone.setValidatedFrom(getValidatedFrom());
		clone.setValidatedTo(getValidatedTo());
		clone.setStatus(getStatus());

		return clone;
	}

	@Override
	public int compareTo(DictData dictData) {
		long primaryKey = dictData.getPrimaryKey();

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

		if (!(obj instanceof DictDataClp)) {
			return false;
		}

		DictDataClp dictData = (DictDataClp)obj;

		long primaryKey = dictData.getPrimaryKey();

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
		StringBundler sb = new StringBundler(35);

		sb.append("{dictDataId=");
		sb.append(getDictDataId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", collectionName=");
		sb.append(getCollectionName());
		sb.append(", dataCode=");
		sb.append(getDataCode());
		sb.append(", node_1=");
		sb.append(getNode_1());
		sb.append(", node_2=");
		sb.append(getNode_2());
		sb.append(", node_3=");
		sb.append(getNode_3());
		sb.append(", node_4=");
		sb.append(getNode_4());
		sb.append(", node_5=");
		sb.append(getNode_5());
		sb.append(", dataLevel=");
		sb.append(getDataLevel());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", validatedFrom=");
		sb.append(getValidatedFrom());
		sb.append(", validatedTo=");
		sb.append(getValidatedTo());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.datamgt.dictionary.model.DictData");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>dictDataId</column-name><column-value><![CDATA[");
		sb.append(getDictDataId());
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
			"<column><column-name>collectionName</column-name><column-value><![CDATA[");
		sb.append(getCollectionName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dataCode</column-name><column-value><![CDATA[");
		sb.append(getDataCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>node_1</column-name><column-value><![CDATA[");
		sb.append(getNode_1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>node_2</column-name><column-value><![CDATA[");
		sb.append(getNode_2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>node_3</column-name><column-value><![CDATA[");
		sb.append(getNode_3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>node_4</column-name><column-value><![CDATA[");
		sb.append(getNode_4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>node_5</column-name><column-value><![CDATA[");
		sb.append(getNode_5());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dataLevel</column-name><column-value><![CDATA[");
		sb.append(getDataLevel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>validatedFrom</column-name><column-value><![CDATA[");
		sb.append(getValidatedFrom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>validatedTo</column-name><column-value><![CDATA[");
		sb.append(getValidatedTo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _dictDataId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _collectionName;
	private String _dataCode;
	private String _node_1;
	private String _node_2;
	private String _node_3;
	private String _node_4;
	private String _node_5;
	private int _dataLevel;
	private String _title;
	private String _description;
	private Date _validatedFrom;
	private Date _validatedTo;
	private int _status;
	private BaseModel<?> _dictDataRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.datamgt.dictionary.service.ClpSerializer.class;
}