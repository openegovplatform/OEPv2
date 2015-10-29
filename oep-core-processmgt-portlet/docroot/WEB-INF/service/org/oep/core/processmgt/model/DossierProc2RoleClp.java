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

package org.oep.core.processmgt.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import org.oep.core.processmgt.service.ClpSerializer;
import org.oep.core.processmgt.service.DossierProc2RoleLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class DossierProc2RoleClp extends BaseModelImpl<DossierProc2Role>
	implements DossierProc2Role {
	public DossierProc2RoleClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DossierProc2Role.class;
	}

	@Override
	public String getModelClassName() {
		return DossierProc2Role.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _dossierProc2RoleId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDossierProc2RoleId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dossierProc2RoleId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dossierProc2RoleId", getDossierProc2RoleId());
		attributes.put("dossierProcId", getDossierProcId());
		attributes.put("roleId", getRoleId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dossierProc2RoleId = (Long)attributes.get("dossierProc2RoleId");

		if (dossierProc2RoleId != null) {
			setDossierProc2RoleId(dossierProc2RoleId);
		}

		Long dossierProcId = (Long)attributes.get("dossierProcId");

		if (dossierProcId != null) {
			setDossierProcId(dossierProcId);
		}

		Long roleId = (Long)attributes.get("roleId");

		if (roleId != null) {
			setRoleId(roleId);
		}
	}

	@Override
	public long getDossierProc2RoleId() {
		return _dossierProc2RoleId;
	}

	@Override
	public void setDossierProc2RoleId(long dossierProc2RoleId) {
		_dossierProc2RoleId = dossierProc2RoleId;

		if (_dossierProc2RoleRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProc2RoleRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierProc2RoleId",
						long.class);

				method.invoke(_dossierProc2RoleRemoteModel, dossierProc2RoleId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDossierProcId() {
		return _dossierProcId;
	}

	@Override
	public void setDossierProcId(long dossierProcId) {
		_dossierProcId = dossierProcId;

		if (_dossierProc2RoleRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProc2RoleRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierProcId", long.class);

				method.invoke(_dossierProc2RoleRemoteModel, dossierProcId);
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

		if (_dossierProc2RoleRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProc2RoleRemoteModel.getClass();

				Method method = clazz.getMethod("setRoleId", long.class);

				method.invoke(_dossierProc2RoleRemoteModel, roleId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDossierProc2RoleRemoteModel() {
		return _dossierProc2RoleRemoteModel;
	}

	public void setDossierProc2RoleRemoteModel(
		BaseModel<?> dossierProc2RoleRemoteModel) {
		_dossierProc2RoleRemoteModel = dossierProc2RoleRemoteModel;
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

		Class<?> remoteModelClass = _dossierProc2RoleRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dossierProc2RoleRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DossierProc2RoleLocalServiceUtil.addDossierProc2Role(this);
		}
		else {
			DossierProc2RoleLocalServiceUtil.updateDossierProc2Role(this);
		}
	}

	@Override
	public DossierProc2Role toEscapedModel() {
		return (DossierProc2Role)ProxyUtil.newProxyInstance(DossierProc2Role.class.getClassLoader(),
			new Class[] { DossierProc2Role.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DossierProc2RoleClp clone = new DossierProc2RoleClp();

		clone.setDossierProc2RoleId(getDossierProc2RoleId());
		clone.setDossierProcId(getDossierProcId());
		clone.setRoleId(getRoleId());

		return clone;
	}

	@Override
	public int compareTo(DossierProc2Role dossierProc2Role) {
		long primaryKey = dossierProc2Role.getPrimaryKey();

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

		if (!(obj instanceof DossierProc2RoleClp)) {
			return false;
		}

		DossierProc2RoleClp dossierProc2Role = (DossierProc2RoleClp)obj;

		long primaryKey = dossierProc2Role.getPrimaryKey();

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
		StringBundler sb = new StringBundler(7);

		sb.append("{dossierProc2RoleId=");
		sb.append(getDossierProc2RoleId());
		sb.append(", dossierProcId=");
		sb.append(getDossierProcId());
		sb.append(", roleId=");
		sb.append(getRoleId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.processmgt.model.DossierProc2Role");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>dossierProc2RoleId</column-name><column-value><![CDATA[");
		sb.append(getDossierProc2RoleId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierProcId</column-name><column-value><![CDATA[");
		sb.append(getDossierProcId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roleId</column-name><column-value><![CDATA[");
		sb.append(getRoleId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _dossierProc2RoleId;
	private long _dossierProcId;
	private long _roleId;
	private BaseModel<?> _dossierProc2RoleRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.processmgt.service.ClpSerializer.class;
}