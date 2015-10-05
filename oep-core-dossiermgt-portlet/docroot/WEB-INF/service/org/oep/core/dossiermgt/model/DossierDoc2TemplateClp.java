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
import org.oep.core.dossiermgt.service.DossierDoc2TemplateLocalServiceUtil;
import org.oep.core.dossiermgt.service.persistence.DossierDoc2TemplatePK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class DossierDoc2TemplateClp extends BaseModelImpl<DossierDoc2Template>
	implements DossierDoc2Template {
	public DossierDoc2TemplateClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DossierDoc2Template.class;
	}

	@Override
	public String getModelClassName() {
		return DossierDoc2Template.class.getName();
	}

	@Override
	public DossierDoc2TemplatePK getPrimaryKey() {
		return new DossierDoc2TemplatePK(_dossierDocId, _docTemplateId);
	}

	@Override
	public void setPrimaryKey(DossierDoc2TemplatePK primaryKey) {
		setDossierDocId(primaryKey.dossierDocId);
		setDocTemplateId(primaryKey.docTemplateId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new DossierDoc2TemplatePK(_dossierDocId, _docTemplateId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((DossierDoc2TemplatePK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dossierDocId", getDossierDocId());
		attributes.put("docTemplateId", getDocTemplateId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dossierDocId = (Long)attributes.get("dossierDocId");

		if (dossierDocId != null) {
			setDossierDocId(dossierDocId);
		}

		Long docTemplateId = (Long)attributes.get("docTemplateId");

		if (docTemplateId != null) {
			setDocTemplateId(docTemplateId);
		}
	}

	@Override
	public long getDossierDocId() {
		return _dossierDocId;
	}

	@Override
	public void setDossierDocId(long dossierDocId) {
		_dossierDocId = dossierDocId;

		if (_dossierDoc2TemplateRemoteModel != null) {
			try {
				Class<?> clazz = _dossierDoc2TemplateRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierDocId", long.class);

				method.invoke(_dossierDoc2TemplateRemoteModel, dossierDocId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDocTemplateId() {
		return _docTemplateId;
	}

	@Override
	public void setDocTemplateId(long docTemplateId) {
		_docTemplateId = docTemplateId;

		if (_dossierDoc2TemplateRemoteModel != null) {
			try {
				Class<?> clazz = _dossierDoc2TemplateRemoteModel.getClass();

				Method method = clazz.getMethod("setDocTemplateId", long.class);

				method.invoke(_dossierDoc2TemplateRemoteModel, docTemplateId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDossierDoc2TemplateRemoteModel() {
		return _dossierDoc2TemplateRemoteModel;
	}

	public void setDossierDoc2TemplateRemoteModel(
		BaseModel<?> dossierDoc2TemplateRemoteModel) {
		_dossierDoc2TemplateRemoteModel = dossierDoc2TemplateRemoteModel;
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

		Class<?> remoteModelClass = _dossierDoc2TemplateRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dossierDoc2TemplateRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DossierDoc2TemplateLocalServiceUtil.addDossierDoc2Template(this);
		}
		else {
			DossierDoc2TemplateLocalServiceUtil.updateDossierDoc2Template(this);
		}
	}

	@Override
	public DossierDoc2Template toEscapedModel() {
		return (DossierDoc2Template)ProxyUtil.newProxyInstance(DossierDoc2Template.class.getClassLoader(),
			new Class[] { DossierDoc2Template.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DossierDoc2TemplateClp clone = new DossierDoc2TemplateClp();

		clone.setDossierDocId(getDossierDocId());
		clone.setDocTemplateId(getDocTemplateId());

		return clone;
	}

	@Override
	public int compareTo(DossierDoc2Template dossierDoc2Template) {
		DossierDoc2TemplatePK primaryKey = dossierDoc2Template.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DossierDoc2TemplateClp)) {
			return false;
		}

		DossierDoc2TemplateClp dossierDoc2Template = (DossierDoc2TemplateClp)obj;

		DossierDoc2TemplatePK primaryKey = dossierDoc2Template.getPrimaryKey();

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

		sb.append("{dossierDocId=");
		sb.append(getDossierDocId());
		sb.append(", docTemplateId=");
		sb.append(getDocTemplateId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.dossiermgt.model.DossierDoc2Template");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>dossierDocId</column-name><column-value><![CDATA[");
		sb.append(getDossierDocId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>docTemplateId</column-name><column-value><![CDATA[");
		sb.append(getDocTemplateId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _dossierDocId;
	private long _docTemplateId;
	private BaseModel<?> _dossierDoc2TemplateRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.dossiermgt.service.ClpSerializer.class;
}