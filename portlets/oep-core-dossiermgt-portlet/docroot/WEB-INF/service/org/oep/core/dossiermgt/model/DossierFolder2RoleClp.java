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

import org.oep.core.dossiermgt.service.ClpSerializer;
import org.oep.core.dossiermgt.service.DossierFolder2RoleLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class DossierFolder2RoleClp extends BaseModelImpl<DossierFolder2Role>
	implements DossierFolder2Role {
	public DossierFolder2RoleClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DossierFolder2Role.class;
	}

	@Override
	public String getModelClassName() {
		return DossierFolder2Role.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("companyId", getCompanyId());
		attributes.put("dossierFolderId", getDossierFolderId());
		attributes.put("roleId", getRoleId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long dossierFolderId = (Long)attributes.get("dossierFolderId");

		if (dossierFolderId != null) {
			setDossierFolderId(dossierFolderId);
		}

		Long roleId = (Long)attributes.get("roleId");

		if (roleId != null) {
			setRoleId(roleId);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_dossierFolder2RoleRemoteModel != null) {
			try {
				Class<?> clazz = _dossierFolder2RoleRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_dossierFolder2RoleRemoteModel, id);
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

		if (_dossierFolder2RoleRemoteModel != null) {
			try {
				Class<?> clazz = _dossierFolder2RoleRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_dossierFolder2RoleRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDossierFolderId() {
		return _dossierFolderId;
	}

	@Override
	public void setDossierFolderId(long dossierFolderId) {
		_dossierFolderId = dossierFolderId;

		if (_dossierFolder2RoleRemoteModel != null) {
			try {
				Class<?> clazz = _dossierFolder2RoleRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierFolderId", long.class);

				method.invoke(_dossierFolder2RoleRemoteModel, dossierFolderId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getRoleId() {
		return _roleId;
	}

	@Override
	public void setRoleId(long roleId) {
		_roleId = roleId;

		if (_dossierFolder2RoleRemoteModel != null) {
			try {
				Class<?> clazz = _dossierFolder2RoleRemoteModel.getClass();

				Method method = clazz.getMethod("setRoleId", long.class);

				method.invoke(_dossierFolder2RoleRemoteModel, roleId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDossierFolder2RoleRemoteModel() {
		return _dossierFolder2RoleRemoteModel;
	}

	public void setDossierFolder2RoleRemoteModel(
		BaseModel<?> dossierFolder2RoleRemoteModel) {
		_dossierFolder2RoleRemoteModel = dossierFolder2RoleRemoteModel;
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

		Class<?> remoteModelClass = _dossierFolder2RoleRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dossierFolder2RoleRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DossierFolder2RoleLocalServiceUtil.addDossierFolder2Role(this);
		}
		else {
			DossierFolder2RoleLocalServiceUtil.updateDossierFolder2Role(this);
		}
	}

	@Override
	public DossierFolder2Role toEscapedModel() {
		return (DossierFolder2Role)ProxyUtil.newProxyInstance(DossierFolder2Role.class.getClassLoader(),
			new Class[] { DossierFolder2Role.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DossierFolder2RoleClp clone = new DossierFolder2RoleClp();

		clone.setId(getId());
		clone.setCompanyId(getCompanyId());
		clone.setDossierFolderId(getDossierFolderId());
		clone.setRoleId(getRoleId());

		return clone;
	}

	@Override
	public int compareTo(DossierFolder2Role dossierFolder2Role) {
		long primaryKey = dossierFolder2Role.getPrimaryKey();

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

		if (!(obj instanceof DossierFolder2RoleClp)) {
			return false;
		}

		DossierFolder2RoleClp dossierFolder2Role = (DossierFolder2RoleClp)obj;

		long primaryKey = dossierFolder2Role.getPrimaryKey();

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
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", dossierFolderId=");
		sb.append(getDossierFolderId());
		sb.append(", roleId=");
		sb.append(getRoleId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.dossiermgt.model.DossierFolder2Role");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierFolderId</column-name><column-value><![CDATA[");
		sb.append(getDossierFolderId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roleId</column-name><column-value><![CDATA[");
		sb.append(getRoleId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _companyId;
	private long _dossierFolderId;
	private long _roleId;
	private BaseModel<?> _dossierFolder2RoleRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.dossiermgt.service.ClpSerializer.class;
}