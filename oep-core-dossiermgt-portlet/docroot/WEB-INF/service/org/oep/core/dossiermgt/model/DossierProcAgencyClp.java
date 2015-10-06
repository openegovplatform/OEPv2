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
import org.oep.core.dossiermgt.service.DossierProcAgencyLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class DossierProcAgencyClp extends BaseModelImpl<DossierProcAgency>
	implements DossierProcAgency {
	public DossierProcAgencyClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DossierProcAgency.class;
	}

	@Override
	public String getModelClassName() {
		return DossierProcAgency.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _dossierProcAgencyId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDossierProcAgencyId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dossierProcAgencyId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dossierProcAgencyId", getDossierProcAgencyId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dossierProcId", getDossierProcId());
		attributes.put("govAgencyId", getGovAgencyId());
		attributes.put("govAgencyName", getGovAgencyName());
		attributes.put("ebPartnerShipId", getEbPartnerShipId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dossierProcAgencyId = (Long)attributes.get("dossierProcAgencyId");

		if (dossierProcAgencyId != null) {
			setDossierProcAgencyId(dossierProcAgencyId);
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

		Long dossierProcId = (Long)attributes.get("dossierProcId");

		if (dossierProcId != null) {
			setDossierProcId(dossierProcId);
		}

		String govAgencyId = (String)attributes.get("govAgencyId");

		if (govAgencyId != null) {
			setGovAgencyId(govAgencyId);
		}

		String govAgencyName = (String)attributes.get("govAgencyName");

		if (govAgencyName != null) {
			setGovAgencyName(govAgencyName);
		}

		Long ebPartnerShipId = (Long)attributes.get("ebPartnerShipId");

		if (ebPartnerShipId != null) {
			setEbPartnerShipId(ebPartnerShipId);
		}
	}

	@Override
	public long getDossierProcAgencyId() {
		return _dossierProcAgencyId;
	}

	@Override
	public void setDossierProcAgencyId(long dossierProcAgencyId) {
		_dossierProcAgencyId = dossierProcAgencyId;

		if (_dossierProcAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierProcAgencyId",
						long.class);

				method.invoke(_dossierProcAgencyRemoteModel, dossierProcAgencyId);
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

		if (_dossierProcAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_dossierProcAgencyRemoteModel, companyId);
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

		if (_dossierProcAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_dossierProcAgencyRemoteModel, createDate);
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

		if (_dossierProcAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dossierProcAgencyRemoteModel, modifiedDate);
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

		if (_dossierProcAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierProcId", long.class);

				method.invoke(_dossierProcAgencyRemoteModel, dossierProcId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGovAgencyId() {
		return _govAgencyId;
	}

	@Override
	public void setGovAgencyId(String govAgencyId) {
		_govAgencyId = govAgencyId;

		if (_dossierProcAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setGovAgencyId", String.class);

				method.invoke(_dossierProcAgencyRemoteModel, govAgencyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGovAgencyName() {
		return _govAgencyName;
	}

	@Override
	public void setGovAgencyName(String govAgencyName) {
		_govAgencyName = govAgencyName;

		if (_dossierProcAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setGovAgencyName", String.class);

				method.invoke(_dossierProcAgencyRemoteModel, govAgencyName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getEbPartnerShipId() {
		return _ebPartnerShipId;
	}

	@Override
	public void setEbPartnerShipId(long ebPartnerShipId) {
		_ebPartnerShipId = ebPartnerShipId;

		if (_dossierProcAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setEbPartnerShipId", long.class);

				method.invoke(_dossierProcAgencyRemoteModel, ebPartnerShipId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDossierProcAgencyRemoteModel() {
		return _dossierProcAgencyRemoteModel;
	}

	public void setDossierProcAgencyRemoteModel(
		BaseModel<?> dossierProcAgencyRemoteModel) {
		_dossierProcAgencyRemoteModel = dossierProcAgencyRemoteModel;
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

		Class<?> remoteModelClass = _dossierProcAgencyRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dossierProcAgencyRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DossierProcAgencyLocalServiceUtil.addDossierProcAgency(this);
		}
		else {
			DossierProcAgencyLocalServiceUtil.updateDossierProcAgency(this);
		}
	}

	@Override
	public DossierProcAgency toEscapedModel() {
		return (DossierProcAgency)ProxyUtil.newProxyInstance(DossierProcAgency.class.getClassLoader(),
			new Class[] { DossierProcAgency.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DossierProcAgencyClp clone = new DossierProcAgencyClp();

		clone.setDossierProcAgencyId(getDossierProcAgencyId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setDossierProcId(getDossierProcId());
		clone.setGovAgencyId(getGovAgencyId());
		clone.setGovAgencyName(getGovAgencyName());
		clone.setEbPartnerShipId(getEbPartnerShipId());

		return clone;
	}

	@Override
	public int compareTo(DossierProcAgency dossierProcAgency) {
		long primaryKey = dossierProcAgency.getPrimaryKey();

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

		if (!(obj instanceof DossierProcAgencyClp)) {
			return false;
		}

		DossierProcAgencyClp dossierProcAgency = (DossierProcAgencyClp)obj;

		long primaryKey = dossierProcAgency.getPrimaryKey();

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

		sb.append("{dossierProcAgencyId=");
		sb.append(getDossierProcAgencyId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", dossierProcId=");
		sb.append(getDossierProcId());
		sb.append(", govAgencyId=");
		sb.append(getGovAgencyId());
		sb.append(", govAgencyName=");
		sb.append(getGovAgencyName());
		sb.append(", ebPartnerShipId=");
		sb.append(getEbPartnerShipId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.dossiermgt.model.DossierProcAgency");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>dossierProcAgencyId</column-name><column-value><![CDATA[");
		sb.append(getDossierProcAgencyId());
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
			"<column><column-name>dossierProcId</column-name><column-value><![CDATA[");
		sb.append(getDossierProcId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>govAgencyId</column-name><column-value><![CDATA[");
		sb.append(getGovAgencyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>govAgencyName</column-name><column-value><![CDATA[");
		sb.append(getGovAgencyName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ebPartnerShipId</column-name><column-value><![CDATA[");
		sb.append(getEbPartnerShipId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _dossierProcAgencyId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _dossierProcId;
	private String _govAgencyId;
	private String _govAgencyName;
	private long _ebPartnerShipId;
	private BaseModel<?> _dossierProcAgencyRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.dossiermgt.service.ClpSerializer.class;
}