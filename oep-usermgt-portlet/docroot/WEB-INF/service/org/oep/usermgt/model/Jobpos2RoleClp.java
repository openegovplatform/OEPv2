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
import org.oep.usermgt.service.JobPos2RoleLocalServiceUtil;
import org.oep.usermgt.service.persistence.JobPos2RolePK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author NQMINH
 */
public class JobPos2RoleClp extends BaseModelImpl<JobPos2Role>
	implements JobPos2Role {
	public JobPos2RoleClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return JobPos2Role.class;
	}

	@Override
	public String getModelClassName() {
		return JobPos2Role.class.getName();
	}

	@Override
	public JobPos2RolePK getPrimaryKey() {
		return new JobPos2RolePK(_jobPosId, _roleId);
	}

	@Override
	public void setPrimaryKey(JobPos2RolePK primaryKey) {
		setJobPosId(primaryKey.jobPosId);
		setRoleId(primaryKey.roleId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new JobPos2RolePK(_jobPosId, _roleId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((JobPos2RolePK)primaryKeyObj);
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

		if (_jobPos2RoleRemoteModel != null) {
			try {
				Class<?> clazz = _jobPos2RoleRemoteModel.getClass();

				Method method = clazz.getMethod("setJobPosId", long.class);

				method.invoke(_jobPos2RoleRemoteModel, jobPosId);
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

		if (_jobPos2RoleRemoteModel != null) {
			try {
				Class<?> clazz = _jobPos2RoleRemoteModel.getClass();

				Method method = clazz.getMethod("setRoleId", long.class);

				method.invoke(_jobPos2RoleRemoteModel, roleId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getJobPos2RoleRemoteModel() {
		return _jobPos2RoleRemoteModel;
	}

	public void setJobPos2RoleRemoteModel(BaseModel<?> jobPos2RoleRemoteModel) {
		_jobPos2RoleRemoteModel = jobPos2RoleRemoteModel;
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

		Class<?> remoteModelClass = _jobPos2RoleRemoteModel.getClass();

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

		Object returnValue = method.invoke(_jobPos2RoleRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			JobPos2RoleLocalServiceUtil.addJobPos2Role(this);
		}
		else {
			JobPos2RoleLocalServiceUtil.updateJobPos2Role(this);
		}
	}

	@Override
	public JobPos2Role toEscapedModel() {
		return (JobPos2Role)ProxyUtil.newProxyInstance(JobPos2Role.class.getClassLoader(),
			new Class[] { JobPos2Role.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		JobPos2RoleClp clone = new JobPos2RoleClp();

		clone.setJobPosId(getJobPosId());
		clone.setRoleId(getRoleId());

		return clone;
	}

	@Override
	public int compareTo(JobPos2Role jobPos2Role) {
		JobPos2RolePK primaryKey = jobPos2Role.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof JobPos2RoleClp)) {
			return false;
		}

		JobPos2RoleClp jobPos2Role = (JobPos2RoleClp)obj;

		JobPos2RolePK primaryKey = jobPos2Role.getPrimaryKey();

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
		sb.append("org.oep.usermgt.model.JobPos2Role");
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
	private BaseModel<?> _jobPos2RoleRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.usermgt.service.ClpSerializer.class;
}