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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import org.oep.dossiermgt.service.ClpSerializer;
import org.oep.dossiermgt.service.EbPartnerShipLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class EbPartnerShipClp extends BaseModelImpl<EbPartnerShip>
	implements EbPartnerShip {
	public EbPartnerShipClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return EbPartnerShip.class;
	}

	@Override
	public String getModelClassName() {
		return EbPartnerShip.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _ebPartnerShipId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEbPartnerShipId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ebPartnerShipId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ebPartnerShipId", getEbPartnerShipId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("createDate", getCreateDate());
		attributes.put("name", getName());
		attributes.put("cpaId", getCpaId());
		attributes.put("service", getService());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ebPartnerShipId = (Long)attributes.get("ebPartnerShipId");

		if (ebPartnerShipId != null) {
			setEbPartnerShipId(ebPartnerShipId);
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String cpaId = (String)attributes.get("cpaId");

		if (cpaId != null) {
			setCpaId(cpaId);
		}

		String service = (String)attributes.get("service");

		if (service != null) {
			setService(service);
		}
	}

	@Override
	public long getEbPartnerShipId() {
		return _ebPartnerShipId;
	}

	@Override
	public void setEbPartnerShipId(long ebPartnerShipId) {
		_ebPartnerShipId = ebPartnerShipId;

		if (_ebPartnerShipRemoteModel != null) {
			try {
				Class<?> clazz = _ebPartnerShipRemoteModel.getClass();

				Method method = clazz.getMethod("setEbPartnerShipId", long.class);

				method.invoke(_ebPartnerShipRemoteModel, ebPartnerShipId);
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

		if (_ebPartnerShipRemoteModel != null) {
			try {
				Class<?> clazz = _ebPartnerShipRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_ebPartnerShipRemoteModel, companyId);
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

		if (_ebPartnerShipRemoteModel != null) {
			try {
				Class<?> clazz = _ebPartnerShipRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_ebPartnerShipRemoteModel, userId);
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

		if (_ebPartnerShipRemoteModel != null) {
			try {
				Class<?> clazz = _ebPartnerShipRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_ebPartnerShipRemoteModel, groupId);
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

		if (_ebPartnerShipRemoteModel != null) {
			try {
				Class<?> clazz = _ebPartnerShipRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_ebPartnerShipRemoteModel, createDate);
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

		if (_ebPartnerShipRemoteModel != null) {
			try {
				Class<?> clazz = _ebPartnerShipRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_ebPartnerShipRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCpaId() {
		return _cpaId;
	}

	@Override
	public void setCpaId(String cpaId) {
		_cpaId = cpaId;

		if (_ebPartnerShipRemoteModel != null) {
			try {
				Class<?> clazz = _ebPartnerShipRemoteModel.getClass();

				Method method = clazz.getMethod("setCpaId", String.class);

				method.invoke(_ebPartnerShipRemoteModel, cpaId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getService() {
		return _service;
	}

	@Override
	public void setService(String service) {
		_service = service;

		if (_ebPartnerShipRemoteModel != null) {
			try {
				Class<?> clazz = _ebPartnerShipRemoteModel.getClass();

				Method method = clazz.getMethod("setService", String.class);

				method.invoke(_ebPartnerShipRemoteModel, service);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getEbPartnerShipRemoteModel() {
		return _ebPartnerShipRemoteModel;
	}

	public void setEbPartnerShipRemoteModel(
		BaseModel<?> ebPartnerShipRemoteModel) {
		_ebPartnerShipRemoteModel = ebPartnerShipRemoteModel;
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

		Class<?> remoteModelClass = _ebPartnerShipRemoteModel.getClass();

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

		Object returnValue = method.invoke(_ebPartnerShipRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EbPartnerShipLocalServiceUtil.addEbPartnerShip(this);
		}
		else {
			EbPartnerShipLocalServiceUtil.updateEbPartnerShip(this);
		}
	}

	@Override
	public EbPartnerShip toEscapedModel() {
		return (EbPartnerShip)ProxyUtil.newProxyInstance(EbPartnerShip.class.getClassLoader(),
			new Class[] { EbPartnerShip.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EbPartnerShipClp clone = new EbPartnerShipClp();

		clone.setEbPartnerShipId(getEbPartnerShipId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCreateDate(getCreateDate());
		clone.setName(getName());
		clone.setCpaId(getCpaId());
		clone.setService(getService());

		return clone;
	}

	@Override
	public int compareTo(EbPartnerShip ebPartnerShip) {
		long primaryKey = ebPartnerShip.getPrimaryKey();

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

		if (!(obj instanceof EbPartnerShipClp)) {
			return false;
		}

		EbPartnerShipClp ebPartnerShip = (EbPartnerShipClp)obj;

		long primaryKey = ebPartnerShip.getPrimaryKey();

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

		sb.append("{ebPartnerShipId=");
		sb.append(getEbPartnerShipId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", cpaId=");
		sb.append(getCpaId());
		sb.append(", service=");
		sb.append(getService());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("org.oep.dossiermgt.model.EbPartnerShip");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ebPartnerShipId</column-name><column-value><![CDATA[");
		sb.append(getEbPartnerShipId());
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
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cpaId</column-name><column-value><![CDATA[");
		sb.append(getCpaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>service</column-name><column-value><![CDATA[");
		sb.append(getService());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _ebPartnerShipId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private Date _createDate;
	private String _name;
	private String _cpaId;
	private String _service;
	private BaseModel<?> _ebPartnerShipRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.dossiermgt.service.ClpSerializer.class;
}