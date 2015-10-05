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
import com.liferay.portal.util.PortalUtil;

import org.oep.core.dossiermgt.service.ClpSerializer;
import org.oep.core.dossiermgt.service.DossierProcLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class DossierProcClp extends BaseModelImpl<DossierProc>
	implements DossierProc {
	public DossierProcClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DossierProc.class;
	}

	@Override
	public String getModelClassName() {
		return DossierProc.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _dossierProcId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDossierProcId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dossierProcId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dossierProcId", getDossierProcId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dossierProcNo", getDossierProcNo());
		attributes.put("name", getName());
		attributes.put("enName", getEnName());
		attributes.put("shortName", getShortName());
		attributes.put("processDescription", getProcessDescription());
		attributes.put("methodDescription", getMethodDescription());
		attributes.put("dossierDescription", getDossierDescription());
		attributes.put("conditionDescription", getConditionDescription());
		attributes.put("durationDescription", getDurationDescription());
		attributes.put("actorsDescription", getActorsDescription());
		attributes.put("resultsDescription", getResultsDescription());
		attributes.put("recordsDescription", getRecordsDescription());
		attributes.put("feeDescription", getFeeDescription());
		attributes.put("instructionsDescription", getInstructionsDescription());
		attributes.put("administrationNo", getAdministrationNo());
		attributes.put("administrationName", getAdministrationName());
		attributes.put("domainNo", getDomainNo());
		attributes.put("domainName", getDomainName());
		attributes.put("effectDate", getEffectDate());
		attributes.put("expireDate", getExpireDate());
		attributes.put("active", getActive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dossierProcId = (Long)attributes.get("dossierProcId");

		if (dossierProcId != null) {
			setDossierProcId(dossierProcId);
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

		String dossierProcNo = (String)attributes.get("dossierProcNo");

		if (dossierProcNo != null) {
			setDossierProcNo(dossierProcNo);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String enName = (String)attributes.get("enName");

		if (enName != null) {
			setEnName(enName);
		}

		String shortName = (String)attributes.get("shortName");

		if (shortName != null) {
			setShortName(shortName);
		}

		String processDescription = (String)attributes.get("processDescription");

		if (processDescription != null) {
			setProcessDescription(processDescription);
		}

		String methodDescription = (String)attributes.get("methodDescription");

		if (methodDescription != null) {
			setMethodDescription(methodDescription);
		}

		String dossierDescription = (String)attributes.get("dossierDescription");

		if (dossierDescription != null) {
			setDossierDescription(dossierDescription);
		}

		String conditionDescription = (String)attributes.get(
				"conditionDescription");

		if (conditionDescription != null) {
			setConditionDescription(conditionDescription);
		}

		String durationDescription = (String)attributes.get(
				"durationDescription");

		if (durationDescription != null) {
			setDurationDescription(durationDescription);
		}

		String actorsDescription = (String)attributes.get("actorsDescription");

		if (actorsDescription != null) {
			setActorsDescription(actorsDescription);
		}

		String resultsDescription = (String)attributes.get("resultsDescription");

		if (resultsDescription != null) {
			setResultsDescription(resultsDescription);
		}

		String recordsDescription = (String)attributes.get("recordsDescription");

		if (recordsDescription != null) {
			setRecordsDescription(recordsDescription);
		}

		String feeDescription = (String)attributes.get("feeDescription");

		if (feeDescription != null) {
			setFeeDescription(feeDescription);
		}

		String instructionsDescription = (String)attributes.get(
				"instructionsDescription");

		if (instructionsDescription != null) {
			setInstructionsDescription(instructionsDescription);
		}

		String administrationNo = (String)attributes.get("administrationNo");

		if (administrationNo != null) {
			setAdministrationNo(administrationNo);
		}

		String administrationName = (String)attributes.get("administrationName");

		if (administrationName != null) {
			setAdministrationName(administrationName);
		}

		String domainNo = (String)attributes.get("domainNo");

		if (domainNo != null) {
			setDomainNo(domainNo);
		}

		String domainName = (String)attributes.get("domainName");

		if (domainName != null) {
			setDomainName(domainName);
		}

		Date effectDate = (Date)attributes.get("effectDate");

		if (effectDate != null) {
			setEffectDate(effectDate);
		}

		Date expireDate = (Date)attributes.get("expireDate");

		if (expireDate != null) {
			setExpireDate(expireDate);
		}

		Integer active = (Integer)attributes.get("active");

		if (active != null) {
			setActive(active);
		}
	}

	@Override
	public long getDossierProcId() {
		return _dossierProcId;
	}

	@Override
	public void setDossierProcId(long dossierProcId) {
		_dossierProcId = dossierProcId;

		if (_dossierProcRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierProcId", long.class);

				method.invoke(_dossierProcRemoteModel, dossierProcId);
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

		if (_dossierProcRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_dossierProcRemoteModel, userId);
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

		if (_dossierProcRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_dossierProcRemoteModel, groupId);
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

		if (_dossierProcRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_dossierProcRemoteModel, companyId);
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

		if (_dossierProcRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_dossierProcRemoteModel, createDate);
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

		if (_dossierProcRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dossierProcRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDossierProcNo() {
		return _dossierProcNo;
	}

	@Override
	public void setDossierProcNo(String dossierProcNo) {
		_dossierProcNo = dossierProcNo;

		if (_dossierProcRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierProcNo", String.class);

				method.invoke(_dossierProcRemoteModel, dossierProcNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_dossierProcRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_dossierProcRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEnName() {
		return _enName;
	}

	@Override
	public void setEnName(String enName) {
		_enName = enName;

		if (_dossierProcRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcRemoteModel.getClass();

				Method method = clazz.getMethod("setEnName", String.class);

				method.invoke(_dossierProcRemoteModel, enName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getShortName() {
		return _shortName;
	}

	@Override
	public void setShortName(String shortName) {
		_shortName = shortName;

		if (_dossierProcRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcRemoteModel.getClass();

				Method method = clazz.getMethod("setShortName", String.class);

				method.invoke(_dossierProcRemoteModel, shortName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProcessDescription() {
		return _processDescription;
	}

	@Override
	public void setProcessDescription(String processDescription) {
		_processDescription = processDescription;

		if (_dossierProcRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcRemoteModel.getClass();

				Method method = clazz.getMethod("setProcessDescription",
						String.class);

				method.invoke(_dossierProcRemoteModel, processDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMethodDescription() {
		return _methodDescription;
	}

	@Override
	public void setMethodDescription(String methodDescription) {
		_methodDescription = methodDescription;

		if (_dossierProcRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcRemoteModel.getClass();

				Method method = clazz.getMethod("setMethodDescription",
						String.class);

				method.invoke(_dossierProcRemoteModel, methodDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDossierDescription() {
		return _dossierDescription;
	}

	@Override
	public void setDossierDescription(String dossierDescription) {
		_dossierDescription = dossierDescription;

		if (_dossierProcRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierDescription",
						String.class);

				method.invoke(_dossierProcRemoteModel, dossierDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getConditionDescription() {
		return _conditionDescription;
	}

	@Override
	public void setConditionDescription(String conditionDescription) {
		_conditionDescription = conditionDescription;

		if (_dossierProcRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcRemoteModel.getClass();

				Method method = clazz.getMethod("setConditionDescription",
						String.class);

				method.invoke(_dossierProcRemoteModel, conditionDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDurationDescription() {
		return _durationDescription;
	}

	@Override
	public void setDurationDescription(String durationDescription) {
		_durationDescription = durationDescription;

		if (_dossierProcRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcRemoteModel.getClass();

				Method method = clazz.getMethod("setDurationDescription",
						String.class);

				method.invoke(_dossierProcRemoteModel, durationDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getActorsDescription() {
		return _actorsDescription;
	}

	@Override
	public void setActorsDescription(String actorsDescription) {
		_actorsDescription = actorsDescription;

		if (_dossierProcRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcRemoteModel.getClass();

				Method method = clazz.getMethod("setActorsDescription",
						String.class);

				method.invoke(_dossierProcRemoteModel, actorsDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getResultsDescription() {
		return _resultsDescription;
	}

	@Override
	public void setResultsDescription(String resultsDescription) {
		_resultsDescription = resultsDescription;

		if (_dossierProcRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcRemoteModel.getClass();

				Method method = clazz.getMethod("setResultsDescription",
						String.class);

				method.invoke(_dossierProcRemoteModel, resultsDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRecordsDescription() {
		return _recordsDescription;
	}

	@Override
	public void setRecordsDescription(String recordsDescription) {
		_recordsDescription = recordsDescription;

		if (_dossierProcRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcRemoteModel.getClass();

				Method method = clazz.getMethod("setRecordsDescription",
						String.class);

				method.invoke(_dossierProcRemoteModel, recordsDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFeeDescription() {
		return _feeDescription;
	}

	@Override
	public void setFeeDescription(String feeDescription) {
		_feeDescription = feeDescription;

		if (_dossierProcRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcRemoteModel.getClass();

				Method method = clazz.getMethod("setFeeDescription",
						String.class);

				method.invoke(_dossierProcRemoteModel, feeDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInstructionsDescription() {
		return _instructionsDescription;
	}

	@Override
	public void setInstructionsDescription(String instructionsDescription) {
		_instructionsDescription = instructionsDescription;

		if (_dossierProcRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcRemoteModel.getClass();

				Method method = clazz.getMethod("setInstructionsDescription",
						String.class);

				method.invoke(_dossierProcRemoteModel, instructionsDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAdministrationNo() {
		return _administrationNo;
	}

	@Override
	public void setAdministrationNo(String administrationNo) {
		_administrationNo = administrationNo;

		if (_dossierProcRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcRemoteModel.getClass();

				Method method = clazz.getMethod("setAdministrationNo",
						String.class);

				method.invoke(_dossierProcRemoteModel, administrationNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAdministrationName() {
		return _administrationName;
	}

	@Override
	public void setAdministrationName(String administrationName) {
		_administrationName = administrationName;

		if (_dossierProcRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcRemoteModel.getClass();

				Method method = clazz.getMethod("setAdministrationName",
						String.class);

				method.invoke(_dossierProcRemoteModel, administrationName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDomainNo() {
		return _domainNo;
	}

	@Override
	public void setDomainNo(String domainNo) {
		_domainNo = domainNo;

		if (_dossierProcRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcRemoteModel.getClass();

				Method method = clazz.getMethod("setDomainNo", String.class);

				method.invoke(_dossierProcRemoteModel, domainNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDomainName() {
		return _domainName;
	}

	@Override
	public void setDomainName(String domainName) {
		_domainName = domainName;

		if (_dossierProcRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcRemoteModel.getClass();

				Method method = clazz.getMethod("setDomainName", String.class);

				method.invoke(_dossierProcRemoteModel, domainName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getEffectDate() {
		return _effectDate;
	}

	@Override
	public void setEffectDate(Date effectDate) {
		_effectDate = effectDate;

		if (_dossierProcRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcRemoteModel.getClass();

				Method method = clazz.getMethod("setEffectDate", Date.class);

				method.invoke(_dossierProcRemoteModel, effectDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getExpireDate() {
		return _expireDate;
	}

	@Override
	public void setExpireDate(Date expireDate) {
		_expireDate = expireDate;

		if (_dossierProcRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcRemoteModel.getClass();

				Method method = clazz.getMethod("setExpireDate", Date.class);

				method.invoke(_dossierProcRemoteModel, expireDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getActive() {
		return _active;
	}

	@Override
	public void setActive(int active) {
		_active = active;

		if (_dossierProcRemoteModel != null) {
			try {
				Class<?> clazz = _dossierProcRemoteModel.getClass();

				Method method = clazz.getMethod("setActive", int.class);

				method.invoke(_dossierProcRemoteModel, active);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDossierProcRemoteModel() {
		return _dossierProcRemoteModel;
	}

	public void setDossierProcRemoteModel(BaseModel<?> dossierProcRemoteModel) {
		_dossierProcRemoteModel = dossierProcRemoteModel;
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

		Class<?> remoteModelClass = _dossierProcRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dossierProcRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DossierProcLocalServiceUtil.addDossierProc(this);
		}
		else {
			DossierProcLocalServiceUtil.updateDossierProc(this);
		}
	}

	@Override
	public DossierProc toEscapedModel() {
		return (DossierProc)ProxyUtil.newProxyInstance(DossierProc.class.getClassLoader(),
			new Class[] { DossierProc.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DossierProcClp clone = new DossierProcClp();

		clone.setDossierProcId(getDossierProcId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setDossierProcNo(getDossierProcNo());
		clone.setName(getName());
		clone.setEnName(getEnName());
		clone.setShortName(getShortName());
		clone.setProcessDescription(getProcessDescription());
		clone.setMethodDescription(getMethodDescription());
		clone.setDossierDescription(getDossierDescription());
		clone.setConditionDescription(getConditionDescription());
		clone.setDurationDescription(getDurationDescription());
		clone.setActorsDescription(getActorsDescription());
		clone.setResultsDescription(getResultsDescription());
		clone.setRecordsDescription(getRecordsDescription());
		clone.setFeeDescription(getFeeDescription());
		clone.setInstructionsDescription(getInstructionsDescription());
		clone.setAdministrationNo(getAdministrationNo());
		clone.setAdministrationName(getAdministrationName());
		clone.setDomainNo(getDomainNo());
		clone.setDomainName(getDomainName());
		clone.setEffectDate(getEffectDate());
		clone.setExpireDate(getExpireDate());
		clone.setActive(getActive());

		return clone;
	}

	@Override
	public int compareTo(DossierProc dossierProc) {
		long primaryKey = dossierProc.getPrimaryKey();

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

		if (!(obj instanceof DossierProcClp)) {
			return false;
		}

		DossierProcClp dossierProc = (DossierProcClp)obj;

		long primaryKey = dossierProc.getPrimaryKey();

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
		StringBundler sb = new StringBundler(55);

		sb.append("{dossierProcId=");
		sb.append(getDossierProcId());
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
		sb.append(", dossierProcNo=");
		sb.append(getDossierProcNo());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", enName=");
		sb.append(getEnName());
		sb.append(", shortName=");
		sb.append(getShortName());
		sb.append(", processDescription=");
		sb.append(getProcessDescription());
		sb.append(", methodDescription=");
		sb.append(getMethodDescription());
		sb.append(", dossierDescription=");
		sb.append(getDossierDescription());
		sb.append(", conditionDescription=");
		sb.append(getConditionDescription());
		sb.append(", durationDescription=");
		sb.append(getDurationDescription());
		sb.append(", actorsDescription=");
		sb.append(getActorsDescription());
		sb.append(", resultsDescription=");
		sb.append(getResultsDescription());
		sb.append(", recordsDescription=");
		sb.append(getRecordsDescription());
		sb.append(", feeDescription=");
		sb.append(getFeeDescription());
		sb.append(", instructionsDescription=");
		sb.append(getInstructionsDescription());
		sb.append(", administrationNo=");
		sb.append(getAdministrationNo());
		sb.append(", administrationName=");
		sb.append(getAdministrationName());
		sb.append(", domainNo=");
		sb.append(getDomainNo());
		sb.append(", domainName=");
		sb.append(getDomainName());
		sb.append(", effectDate=");
		sb.append(getEffectDate());
		sb.append(", expireDate=");
		sb.append(getExpireDate());
		sb.append(", active=");
		sb.append(getActive());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(85);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.dossiermgt.model.DossierProc");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>dossierProcId</column-name><column-value><![CDATA[");
		sb.append(getDossierProcId());
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
			"<column><column-name>dossierProcNo</column-name><column-value><![CDATA[");
		sb.append(getDossierProcNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enName</column-name><column-value><![CDATA[");
		sb.append(getEnName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shortName</column-name><column-value><![CDATA[");
		sb.append(getShortName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>processDescription</column-name><column-value><![CDATA[");
		sb.append(getProcessDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>methodDescription</column-name><column-value><![CDATA[");
		sb.append(getMethodDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierDescription</column-name><column-value><![CDATA[");
		sb.append(getDossierDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>conditionDescription</column-name><column-value><![CDATA[");
		sb.append(getConditionDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>durationDescription</column-name><column-value><![CDATA[");
		sb.append(getDurationDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actorsDescription</column-name><column-value><![CDATA[");
		sb.append(getActorsDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>resultsDescription</column-name><column-value><![CDATA[");
		sb.append(getResultsDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>recordsDescription</column-name><column-value><![CDATA[");
		sb.append(getRecordsDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>feeDescription</column-name><column-value><![CDATA[");
		sb.append(getFeeDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>instructionsDescription</column-name><column-value><![CDATA[");
		sb.append(getInstructionsDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>administrationNo</column-name><column-value><![CDATA[");
		sb.append(getAdministrationNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>administrationName</column-name><column-value><![CDATA[");
		sb.append(getAdministrationName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>domainNo</column-name><column-value><![CDATA[");
		sb.append(getDomainNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>domainName</column-name><column-value><![CDATA[");
		sb.append(getDomainName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>effectDate</column-name><column-value><![CDATA[");
		sb.append(getEffectDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>expireDate</column-name><column-value><![CDATA[");
		sb.append(getExpireDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>active</column-name><column-value><![CDATA[");
		sb.append(getActive());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _dossierProcId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _dossierProcNo;
	private String _name;
	private String _enName;
	private String _shortName;
	private String _processDescription;
	private String _methodDescription;
	private String _dossierDescription;
	private String _conditionDescription;
	private String _durationDescription;
	private String _actorsDescription;
	private String _resultsDescription;
	private String _recordsDescription;
	private String _feeDescription;
	private String _instructionsDescription;
	private String _administrationNo;
	private String _administrationName;
	private String _domainNo;
	private String _domainName;
	private Date _effectDate;
	private Date _expireDate;
	private int _active;
	private BaseModel<?> _dossierProcRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.dossiermgt.service.ClpSerializer.class;
}