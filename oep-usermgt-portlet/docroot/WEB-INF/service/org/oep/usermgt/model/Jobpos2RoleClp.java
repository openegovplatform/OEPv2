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

import org.oep.usermgt.service.ClpSerializer;
import org.oep.usermgt.service.Jobpos2RoleLocalServiceUtil;
import org.oep.usermgt.service.persistence.Jobpos2RolePK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author NQMINH
 */
public class Jobpos2RoleClp extends BaseModelImpl<Jobpos2Role>
	implements Jobpos2Role {
	public Jobpos2RoleClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Jobpos2Role.class;
	}

	@Override
	public String getModelClassName() {
		return Jobpos2Role.class.getName();
	}

	@Override
	public Jobpos2RolePK getPrimaryKey() {
		return new Jobpos2RolePK(_jobPosId, _roleId);
	}

	@Override
	public void setPrimaryKey(Jobpos2RolePK primaryKey) {
		setJobPosId(primaryKey.jobPosId);
		setRoleId(primaryKey.roleId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new Jobpos2RolePK(_jobPosId, _roleId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((Jobpos2RolePK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("jobPosId", getJobPosId());
		attributes.put("roleId", getRoleId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long jobPosId = (Long)attributes.get("jobPosId");

		if (jobPosId != null) {
			setJobPosId(jobPosId);
		}

		Long roleId = (Long)attributes.get("roleId");

		if (roleId != null) {
			setRoleId(roleId);
		}
	}

	@Override
	public long getJobPosId() {
		return _jobPosId;
	}

	@Override
	public void setJobPosId(long jobPosId) {
		_jobPosId = jobPosId;

		if (_jobpos2RoleRemoteModel != null) {
			try {
				Class<?> clazz = _jobpos2RoleRemoteModel.getClass();

				Method method = clazz.getMethod("setJobPosId", long.class);

				method.invoke(_jobpos2RoleRemoteModel, jobPosId);
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

		if (_jobpos2RoleRemoteModel != null) {
			try {
				Class<?> clazz = _jobpos2RoleRemoteModel.getClass();

				Method method = clazz.getMethod("setRoleId", long.class);

				method.invoke(_jobpos2RoleRemoteModel, roleId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getJobpos2RoleRemoteModel() {
		return _jobpos2RoleRemoteModel;
	}

	public void setJobpos2RoleRemoteModel(BaseModel<?> jobpos2RoleRemoteModel) {
		_jobpos2RoleRemoteModel = jobpos2RoleRemoteModel;
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

		Class<?> remoteModelClass = _jobpos2RoleRemoteModel.getClass();

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

		Object returnValue = method.invoke(_jobpos2RoleRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			Jobpos2RoleLocalServiceUtil.addJobpos2Role(this);
		}
		else {
			Jobpos2RoleLocalServiceUtil.updateJobpos2Role(this);
		}
	}

	@Override
	public Jobpos2Role toEscapedModel() {
		return (Jobpos2Role)ProxyUtil.newProxyInstance(Jobpos2Role.class.getClassLoader(),
			new Class[] { Jobpos2Role.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		Jobpos2RoleClp clone = new Jobpos2RoleClp();

		clone.setJobPosId(getJobPosId());
		clone.setRoleId(getRoleId());

		return clone;
	}

	@Override
	public int compareTo(Jobpos2Role jobpos2Role) {
		Jobpos2RolePK primaryKey = jobpos2Role.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Jobpos2RoleClp)) {
			return false;
		}

		Jobpos2RoleClp jobpos2Role = (Jobpos2RoleClp)obj;

		Jobpos2RolePK primaryKey = jobpos2Role.getPrimaryKey();

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

		sb.append("{jobPosId=");
		sb.append(getJobPosId());
		sb.append(", roleId=");
		sb.append(getRoleId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("org.oep.usermgt.model.Jobpos2Role");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>jobPosId</column-name><column-value><![CDATA[");
		sb.append(getJobPosId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roleId</column-name><column-value><![CDATA[");
		sb.append(getRoleId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _jobPosId;
	private long _roleId;
	private BaseModel<?> _jobpos2RoleRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.usermgt.service.ClpSerializer.class;
}