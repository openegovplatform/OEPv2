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
import org.oep.core.dossiermgt.service.DossierProc2AgentLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class DossierProc2AgentClp extends BaseModelImpl<DossierProc2Agent>
	implements DossierProc2Agent {
	public DossierProc2AgentClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DossierProc2Agent.class;
	}

	@Override
	public String getModelClassName() {
		return DossierProc2Agent.class.getName();
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
		attributes.put("dossierProcId", getDossierProcId());
		attributes.put("govAgentNo", getGovAgentNo());
		attributes.put("govAgentName", getGovAgentName());

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

		Long dossierProcId = (Long)attributes.get("dossierProcId");

		if (dossierProcId != null) {
			setDossierProcId(dossierProcId);
		}

		String govAgentNo = (String)attributes.get("govAgentNo");

		if (govAgentNo != null) {
			setGovAgentNo(govAgentNo);
		}

		String govAgentName = (String)attributes.get("govAgentName");

		if (govAgentName != null) {
			setGovAgentName(govAgentName);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_dossierProc2AgentRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProc2AgentRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_dossierProc2AgentRemoteModel, id);
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

		if (_dossierProc2AgentRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProc2AgentRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_dossierProc2AgentRemoteModel, companyId);
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

		if (_dossierProc2AgentRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProc2AgentRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierProcId", long.class);

				method.invoke(_dossierProc2AgentRemoteModel, dossierProcId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGovAgentNo() {
		return _govAgentNo;
	}

	@Override
	public void setGovAgentNo(String govAgentNo) {
		_govAgentNo = govAgentNo;

		if (_dossierProc2AgentRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProc2AgentRemoteModel.getClass();

				Method method = clazz.getMethod("setGovAgentNo", String.class);

				method.invoke(_dossierProc2AgentRemoteModel, govAgentNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGovAgentName() {
		return _govAgentName;
	}

	@Override
	public void setGovAgentName(String govAgentName) {
		_govAgentName = govAgentName;

		if (_dossierProc2AgentRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProc2AgentRemoteModel.getClass();

				Method method = clazz.getMethod("setGovAgentName", String.class);

				method.invoke(_dossierProc2AgentRemoteModel, govAgentName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDossierProc2AgentRemoteModel() {
		return _dossierProc2AgentRemoteModel;
	}

	public void setDossierProc2AgentRemoteModel(
		BaseModel<?> dossierProc2AgentRemoteModel) {
		_dossierProc2AgentRemoteModel = dossierProc2AgentRemoteModel;
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

		Class<?> remoteModelClass = _dossierProc2AgentRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dossierProc2AgentRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DossierProc2AgentLocalServiceUtil.addDossierProc2Agent(this);
		}
		else {
			DossierProc2AgentLocalServiceUtil.updateDossierProc2Agent(this);
		}
	}

	@Override
	public DossierProc2Agent toEscapedModel() {
		return (DossierProc2Agent)ProxyUtil.newProxyInstance(DossierProc2Agent.class.getClassLoader(),
			new Class[] { DossierProc2Agent.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DossierProc2AgentClp clone = new DossierProc2AgentClp();

		clone.setId(getId());
		clone.setCompanyId(getCompanyId());
		clone.setDossierProcId(getDossierProcId());
		clone.setGovAgentNo(getGovAgentNo());
		clone.setGovAgentName(getGovAgentName());

		return clone;
	}

	@Override
	public int compareTo(DossierProc2Agent dossierProc2Agent) {
		long primaryKey = dossierProc2Agent.getPrimaryKey();

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

		if (!(obj instanceof DossierProc2AgentClp)) {
			return false;
		}

		DossierProc2AgentClp dossierProc2Agent = (DossierProc2AgentClp)obj;

		long primaryKey = dossierProc2Agent.getPrimaryKey();

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
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", dossierProcId=");
		sb.append(getDossierProcId());
		sb.append(", govAgentNo=");
		sb.append(getGovAgentNo());
		sb.append(", govAgentName=");
		sb.append(getGovAgentName());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.dossiermgt.model.DossierProc2Agent");
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
			"<column><column-name>dossierProcId</column-name><column-value><![CDATA[");
		sb.append(getDossierProcId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>govAgentNo</column-name><column-value><![CDATA[");
		sb.append(getGovAgentNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>govAgentName</column-name><column-value><![CDATA[");
		sb.append(getGovAgentName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _companyId;
	private long _dossierProcId;
	private String _govAgentNo;
	private String _govAgentName;
	private BaseModel<?> _dossierProc2AgentRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.dossiermgt.service.ClpSerializer.class;
}