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
		attributes.put("dossierDocId", getDossierDocId());
		attributes.put("docTemplateId", getDocTemplateId());
		attributes.put("sequenceNo", getSequenceNo());

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

		Long dossierDocId = (Long)attributes.get("dossierDocId");

		if (dossierDocId != null) {
			setDossierDocId(dossierDocId);
		}

		Long docTemplateId = (Long)attributes.get("docTemplateId");

		if (docTemplateId != null) {
			setDocTemplateId(docTemplateId);
		}

		Integer sequenceNo = (Integer)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_dossierDoc2TemplateRemoteModel != null) {
			try {
				Class<?> clazz = _dossierDoc2TemplateRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_dossierDoc2TemplateRemoteModel, id);
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

		if (_dossierDoc2TemplateRemoteModel != null) {
			try {
				Class<?> clazz = _dossierDoc2TemplateRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_dossierDoc2TemplateRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
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

	@Override
	public int getSequenceNo() {
		return _sequenceNo;
	}

	@Override
	public void setSequenceNo(int sequenceNo) {
		_sequenceNo = sequenceNo;

		if (_dossierDoc2TemplateRemoteModel != null) {
			try {
				Class<?> clazz = _dossierDoc2TemplateRemoteModel.getClass();

				Method method = clazz.getMethod("setSequenceNo", int.class);

				method.invoke(_dossierDoc2TemplateRemoteModel, sequenceNo);
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

		clone.setId(getId());
		clone.setCompanyId(getCompanyId());
		clone.setDossierDocId(getDossierDocId());
		clone.setDocTemplateId(getDocTemplateId());
		clone.setSequenceNo(getSequenceNo());

		return clone;
	}

	@Override
	public int compareTo(DossierDoc2Template dossierDoc2Template) {
		long primaryKey = dossierDoc2Template.getPrimaryKey();

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

		if (!(obj instanceof DossierDoc2TemplateClp)) {
			return false;
		}

		DossierDoc2TemplateClp dossierDoc2Template = (DossierDoc2TemplateClp)obj;

		long primaryKey = dossierDoc2Template.getPrimaryKey();

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
		sb.append(", dossierDocId=");
		sb.append(getDossierDocId());
		sb.append(", docTemplateId=");
		sb.append(getDocTemplateId());
		sb.append(", sequenceNo=");
		sb.append(getSequenceNo());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.dossiermgt.model.DossierDoc2Template");
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
			"<column><column-name>dossierDocId</column-name><column-value><![CDATA[");
		sb.append(getDossierDocId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>docTemplateId</column-name><column-value><![CDATA[");
		sb.append(getDocTemplateId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sequenceNo</column-name><column-value><![CDATA[");
		sb.append(getSequenceNo());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _companyId;
	private long _dossierDocId;
	private long _docTemplateId;
	private int _sequenceNo;
	private BaseModel<?> _dossierDoc2TemplateRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.dossiermgt.service.ClpSerializer.class;
}