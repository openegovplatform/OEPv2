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

package org.oep.processmgt.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import org.oep.processmgt.service.ClpSerializer;
import org.oep.processmgt.service.DossierProc2ProcessLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class DossierProc2ProcessClp extends BaseModelImpl<DossierProc2Process>
	implements DossierProc2Process {
	public DossierProc2ProcessClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DossierProc2Process.class;
	}

	@Override
	public String getModelClassName() {
		return DossierProc2Process.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _dossierProc2ProcessId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDossierProc2ProcessId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dossierProc2ProcessId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dossierProc2ProcessId", getDossierProc2ProcessId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dossierProcId", getDossierProcId());
		attributes.put("govAgencyId", getGovAgencyId());
		attributes.put("govAgencyName", getGovAgencyName());
		attributes.put("dossierProcessId", getDossierProcessId());
		attributes.put("aaaa", getAaaa());
		attributes.put("bbb", getBbb());
		attributes.put("daysDuration", getDaysDuration());
		attributes.put("paymentFee", getPaymentFee());
		attributes.put("paymentOneGate", getPaymentOneGate());
		attributes.put("paymentEservice", getPaymentEservice());
		attributes.put("organizationId", getOrganizationId());
		attributes.put("ebPartnershipId", getEbPartnershipId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dossierProc2ProcessId = (Long)attributes.get(
				"dossierProc2ProcessId");

		if (dossierProc2ProcessId != null) {
			setDossierProc2ProcessId(dossierProc2ProcessId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
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

		Long dossierProcessId = (Long)attributes.get("dossierProcessId");

		if (dossierProcessId != null) {
			setDossierProcessId(dossierProcessId);
		}

		String aaaa = (String)attributes.get("aaaa");

		if (aaaa != null) {
			setAaaa(aaaa);
		}

		String bbb = (String)attributes.get("bbb");

		if (bbb != null) {
			setBbb(bbb);
		}

		Integer daysDuration = (Integer)attributes.get("daysDuration");

		if (daysDuration != null) {
			setDaysDuration(daysDuration);
		}

		Integer paymentFee = (Integer)attributes.get("paymentFee");

		if (paymentFee != null) {
			setPaymentFee(paymentFee);
		}

		Integer paymentOneGate = (Integer)attributes.get("paymentOneGate");

		if (paymentOneGate != null) {
			setPaymentOneGate(paymentOneGate);
		}

		Integer paymentEservice = (Integer)attributes.get("paymentEservice");

		if (paymentEservice != null) {
			setPaymentEservice(paymentEservice);
		}

		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}

		Long ebPartnershipId = (Long)attributes.get("ebPartnershipId");

		if (ebPartnershipId != null) {
			setEbPartnershipId(ebPartnershipId);
		}
	}

	@Override
	public long getDossierProc2ProcessId() {
		return _dossierProc2ProcessId;
	}

	@Override
	public void setDossierProc2ProcessId(long dossierProc2ProcessId) {
		_dossierProc2ProcessId = dossierProc2ProcessId;

		if (_dossierProc2ProcessRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProc2ProcessRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierProc2ProcessId",
						long.class);

				method.invoke(_dossierProc2ProcessRemoteModel,
					dossierProc2ProcessId);
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

		if (_dossierProc2ProcessRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProc2ProcessRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_dossierProc2ProcessRemoteModel, userId);
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

		if (_dossierProc2ProcessRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProc2ProcessRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_dossierProc2ProcessRemoteModel, groupId);
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

		if (_dossierProc2ProcessRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProc2ProcessRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_dossierProc2ProcessRemoteModel, companyId);
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

		if (_dossierProc2ProcessRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProc2ProcessRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_dossierProc2ProcessRemoteModel, createDate);
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

		if (_dossierProc2ProcessRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProc2ProcessRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dossierProc2ProcessRemoteModel, modifiedDate);
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

		if (_dossierProc2ProcessRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProc2ProcessRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierProcId", long.class);

				method.invoke(_dossierProc2ProcessRemoteModel, dossierProcId);
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

		if (_dossierProc2ProcessRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProc2ProcessRemoteModel.getClass();

				Method method = clazz.getMethod("setGovAgencyId", String.class);

				method.invoke(_dossierProc2ProcessRemoteModel, govAgencyId);
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

		if (_dossierProc2ProcessRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProc2ProcessRemoteModel.getClass();

				Method method = clazz.getMethod("setGovAgencyName", String.class);

				method.invoke(_dossierProc2ProcessRemoteModel, govAgencyName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDossierProcessId() {
		return _dossierProcessId;
	}

	@Override
	public void setDossierProcessId(long dossierProcessId) {
		_dossierProcessId = dossierProcessId;

		if (_dossierProc2ProcessRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProc2ProcessRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierProcessId",
						long.class);

				method.invoke(_dossierProc2ProcessRemoteModel, dossierProcessId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAaaa() {
		return _aaaa;
	}

	@Override
	public void setAaaa(String aaaa) {
		_aaaa = aaaa;

		if (_dossierProc2ProcessRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProc2ProcessRemoteModel.getClass();

				Method method = clazz.getMethod("setAaaa", String.class);

				method.invoke(_dossierProc2ProcessRemoteModel, aaaa);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBbb() {
		return _bbb;
	}

	@Override
	public void setBbb(String bbb) {
		_bbb = bbb;

		if (_dossierProc2ProcessRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProc2ProcessRemoteModel.getClass();

				Method method = clazz.getMethod("setBbb", String.class);

				method.invoke(_dossierProc2ProcessRemoteModel, bbb);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDaysDuration() {
		return _daysDuration;
	}

	@Override
	public void setDaysDuration(int daysDuration) {
		_daysDuration = daysDuration;

		if (_dossierProc2ProcessRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProc2ProcessRemoteModel.getClass();

				Method method = clazz.getMethod("setDaysDuration", int.class);

				method.invoke(_dossierProc2ProcessRemoteModel, daysDuration);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPaymentFee() {
		return _paymentFee;
	}

	@Override
	public void setPaymentFee(int paymentFee) {
		_paymentFee = paymentFee;

		if (_dossierProc2ProcessRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProc2ProcessRemoteModel.getClass();

				Method method = clazz.getMethod("setPaymentFee", int.class);

				method.invoke(_dossierProc2ProcessRemoteModel, paymentFee);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPaymentOneGate() {
		return _paymentOneGate;
	}

	@Override
	public void setPaymentOneGate(int paymentOneGate) {
		_paymentOneGate = paymentOneGate;

		if (_dossierProc2ProcessRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProc2ProcessRemoteModel.getClass();

				Method method = clazz.getMethod("setPaymentOneGate", int.class);

				method.invoke(_dossierProc2ProcessRemoteModel, paymentOneGate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPaymentEservice() {
		return _paymentEservice;
	}

	@Override
	public void setPaymentEservice(int paymentEservice) {
		_paymentEservice = paymentEservice;

		if (_dossierProc2ProcessRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProc2ProcessRemoteModel.getClass();

				Method method = clazz.getMethod("setPaymentEservice", int.class);

				method.invoke(_dossierProc2ProcessRemoteModel, paymentEservice);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getOrganizationId() {
		return _organizationId;
	}

	@Override
	public void setOrganizationId(long organizationId) {
		_organizationId = organizationId;

		if (_dossierProc2ProcessRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProc2ProcessRemoteModel.getClass();

				Method method = clazz.getMethod("setOrganizationId", long.class);

				method.invoke(_dossierProc2ProcessRemoteModel, organizationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getEbPartnershipId() {
		return _ebPartnershipId;
	}

	@Override
	public void setEbPartnershipId(long ebPartnershipId) {
		_ebPartnershipId = ebPartnershipId;

		if (_dossierProc2ProcessRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProc2ProcessRemoteModel.getClass();

				Method method = clazz.getMethod("setEbPartnershipId", long.class);

				method.invoke(_dossierProc2ProcessRemoteModel, ebPartnershipId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDossierProc2ProcessRemoteModel() {
		return _dossierProc2ProcessRemoteModel;
	}

	public void setDossierProc2ProcessRemoteModel(
		BaseModel<?> dossierProc2ProcessRemoteModel) {
		_dossierProc2ProcessRemoteModel = dossierProc2ProcessRemoteModel;
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

		Class<?> remoteModelClass = _dossierProc2ProcessRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dossierProc2ProcessRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DossierProc2ProcessLocalServiceUtil.addDossierProc2Process(this);
		}
		else {
			DossierProc2ProcessLocalServiceUtil.updateDossierProc2Process(this);
		}
	}

	@Override
	public DossierProc2Process toEscapedModel() {
		return (DossierProc2Process)ProxyUtil.newProxyInstance(DossierProc2Process.class.getClassLoader(),
			new Class[] { DossierProc2Process.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DossierProc2ProcessClp clone = new DossierProc2ProcessClp();

		clone.setDossierProc2ProcessId(getDossierProc2ProcessId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setDossierProcId(getDossierProcId());
		clone.setGovAgencyId(getGovAgencyId());
		clone.setGovAgencyName(getGovAgencyName());
		clone.setDossierProcessId(getDossierProcessId());
		clone.setAaaa(getAaaa());
		clone.setBbb(getBbb());
		clone.setDaysDuration(getDaysDuration());
		clone.setPaymentFee(getPaymentFee());
		clone.setPaymentOneGate(getPaymentOneGate());
		clone.setPaymentEservice(getPaymentEservice());
		clone.setOrganizationId(getOrganizationId());
		clone.setEbPartnershipId(getEbPartnershipId());

		return clone;
	}

	@Override
	public int compareTo(DossierProc2Process dossierProc2Process) {
		long primaryKey = dossierProc2Process.getPrimaryKey();

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

		if (!(obj instanceof DossierProc2ProcessClp)) {
			return false;
		}

		DossierProc2ProcessClp dossierProc2Process = (DossierProc2ProcessClp)obj;

		long primaryKey = dossierProc2Process.getPrimaryKey();

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
		StringBundler sb = new StringBundler(37);

		sb.append("{dossierProc2ProcessId=");
		sb.append(getDossierProc2ProcessId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
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
		sb.append(", dossierProcessId=");
		sb.append(getDossierProcessId());
		sb.append(", aaaa=");
		sb.append(getAaaa());
		sb.append(", bbb=");
		sb.append(getBbb());
		sb.append(", daysDuration=");
		sb.append(getDaysDuration());
		sb.append(", paymentFee=");
		sb.append(getPaymentFee());
		sb.append(", paymentOneGate=");
		sb.append(getPaymentOneGate());
		sb.append(", paymentEservice=");
		sb.append(getPaymentEservice());
		sb.append(", organizationId=");
		sb.append(getOrganizationId());
		sb.append(", ebPartnershipId=");
		sb.append(getEbPartnershipId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(58);

		sb.append("<model><model-name>");
		sb.append("org.oep.processmgt.model.DossierProc2Process");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>dossierProc2ProcessId</column-name><column-value><![CDATA[");
		sb.append(getDossierProc2ProcessId());
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
			"<column><column-name>dossierProcessId</column-name><column-value><![CDATA[");
		sb.append(getDossierProcessId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>aaaa</column-name><column-value><![CDATA[");
		sb.append(getAaaa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bbb</column-name><column-value><![CDATA[");
		sb.append(getBbb());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>daysDuration</column-name><column-value><![CDATA[");
		sb.append(getDaysDuration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>paymentFee</column-name><column-value><![CDATA[");
		sb.append(getPaymentFee());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>paymentOneGate</column-name><column-value><![CDATA[");
		sb.append(getPaymentOneGate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>paymentEservice</column-name><column-value><![CDATA[");
		sb.append(getPaymentEservice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizationId</column-name><column-value><![CDATA[");
		sb.append(getOrganizationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ebPartnershipId</column-name><column-value><![CDATA[");
		sb.append(getEbPartnershipId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _dossierProc2ProcessId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _dossierProcId;
	private String _govAgencyId;
	private String _govAgencyName;
	private long _dossierProcessId;
	private String _aaaa;
	private String _bbb;
	private int _daysDuration;
	private int _paymentFee;
	private int _paymentOneGate;
	private int _paymentEservice;
	private long _organizationId;
	private long _ebPartnershipId;
	private BaseModel<?> _dossierProc2ProcessRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.processmgt.service.ClpSerializer.class;
}