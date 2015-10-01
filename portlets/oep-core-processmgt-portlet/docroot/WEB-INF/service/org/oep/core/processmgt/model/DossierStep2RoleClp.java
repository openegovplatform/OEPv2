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
import org.oep.core.processmgt.service.DossierStep2RoleLocalServiceUtil;
import org.oep.core.processmgt.service.persistence.DossierStep2RolePK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class DossierStep2RoleClp extends BaseModelImpl<DossierStep2Role>
	implements DossierStep2Role {
	public DossierStep2RoleClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DossierStep2Role.class;
	}

	@Override
	public String getModelClassName() {
		return DossierStep2Role.class.getName();
	}

	@Override
	public DossierStep2RolePK getPrimaryKey() {
		return new DossierStep2RolePK(_dossierStepId, _roleId);
	}

	@Override
	public void setPrimaryKey(DossierStep2RolePK primaryKey) {
		setDossierStepId(primaryKey.dossierStepId);
		setRoleId(primaryKey.roleId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new DossierStep2RolePK(_dossierStepId, _roleId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((DossierStep2RolePK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dossierStepId", getDossierStepId());
		attributes.put("roleId", getRoleId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dossierStepId = (Long)attributes.get("dossierStepId");

		if (dossierStepId != null) {
			setDossierStepId(dossierStepId);
		}

		Long roleId = (Long)attributes.get("roleId");

		if (roleId != null) {
			setRoleId(roleId);
		}
	}

	@Override
	public long getDossierStepId() {
		return _dossierStepId;
	}

	@Override
	public void setDossierStepId(long dossierStepId) {
		_dossierStepId = dossierStepId;

		if (_dossierStep2RoleRemoteModel != null) {
			try {
				Class<?> clazz = _dossierStep2RoleRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierStepId", long.class);

				method.invoke(_dossierStep2RoleRemoteModel, dossierStepId);
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

		if (_dossierStep2RoleRemoteModel != null) {
			try {
				Class<?> clazz = _dossierStep2RoleRemoteModel.getClass();

				Method method = clazz.getMethod("setRoleId", long.class);

				method.invoke(_dossierStep2RoleRemoteModel, roleId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDossierStep2RoleRemoteModel() {
		return _dossierStep2RoleRemoteModel;
	}

	public void setDossierStep2RoleRemoteModel(
		BaseModel<?> dossierStep2RoleRemoteModel) {
		_dossierStep2RoleRemoteModel = dossierStep2RoleRemoteModel;
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

		Class<?> remoteModelClass = _dossierStep2RoleRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dossierStep2RoleRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DossierStep2RoleLocalServiceUtil.addDossierStep2Role(this);
		}
		else {
			DossierStep2RoleLocalServiceUtil.updateDossierStep2Role(this);
		}
	}

	@Override
	public DossierStep2Role toEscapedModel() {
		return (DossierStep2Role)ProxyUtil.newProxyInstance(DossierStep2Role.class.getClassLoader(),
			new Class[] { DossierStep2Role.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DossierStep2RoleClp clone = new DossierStep2RoleClp();

		clone.setDossierStepId(getDossierStepId());
		clone.setRoleId(getRoleId());

		return clone;
	}

	@Override
	public int compareTo(DossierStep2Role dossierStep2Role) {
		DossierStep2RolePK primaryKey = dossierStep2Role.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DossierStep2RoleClp)) {
			return false;
		}

		DossierStep2RoleClp dossierStep2Role = (DossierStep2RoleClp)obj;

		DossierStep2RolePK primaryKey = dossierStep2Role.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
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
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{dossierStepId=");
		sb.append(getDossierStepId());
		sb.append(", roleId=");
		sb.append(getRoleId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.processmgt.model.DossierStep2Role");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>dossierStepId</column-name><column-value><![CDATA[");
		sb.append(getDossierStepId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roleId</column-name><column-value><![CDATA[");
		sb.append(getRoleId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _dossierStepId;
	private long _roleId;
	private BaseModel<?> _dossierStep2RoleRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.processmgt.service.ClpSerializer.class;
}