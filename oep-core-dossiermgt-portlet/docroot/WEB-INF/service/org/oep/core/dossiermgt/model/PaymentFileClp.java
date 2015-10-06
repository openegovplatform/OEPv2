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
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import org.oep.core.dossiermgt.service.ClpSerializer;
import org.oep.core.dossiermgt.service.PaymentFileLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class PaymentFileClp extends BaseModelImpl<PaymentFile>
	implements PaymentFile {
	public PaymentFileClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return PaymentFile.class;
	}

	@Override
	public String getModelClassName() {
		return PaymentFile.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _paymentFileId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPaymentFileId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _paymentFileId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("paymentFileId", getPaymentFileId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("organizationId", getOrganizationId());
		attributes.put("govAgencyId", getGovAgencyId());
		attributes.put("govAgencyName", getGovAgencyName());
		attributes.put("subjectId", getSubjectId());
		attributes.put("subjectType", getSubjectType());
		attributes.put("subjectName", getSubjectName());
		attributes.put("amount", getAmount());
		attributes.put("paymentType", getPaymentType());
		attributes.put("paymentDescription", getPaymentDescription());
		attributes.put("transactionInfo", getTransactionInfo());
		attributes.put("fileEntryId", getFileEntryId());
		attributes.put("checkingDate", getCheckingDate());
		attributes.put("checkingUserId", getCheckingUserId());
		attributes.put("checkingUserName", getCheckingUserName());
		attributes.put("checkingResult", getCheckingResult());
		attributes.put("checkingNote", getCheckingNote());
		attributes.put("ebMessageId", getEbMessageId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long paymentFileId = (Long)attributes.get("paymentFileId");

		if (paymentFileId != null) {
			setPaymentFileId(paymentFileId);
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

		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}

		String govAgencyId = (String)attributes.get("govAgencyId");

		if (govAgencyId != null) {
			setGovAgencyId(govAgencyId);
		}

		String govAgencyName = (String)attributes.get("govAgencyName");

		if (govAgencyName != null) {
			setGovAgencyName(govAgencyName);
		}

		String subjectId = (String)attributes.get("subjectId");

		if (subjectId != null) {
			setSubjectId(subjectId);
		}

		String subjectType = (String)attributes.get("subjectType");

		if (subjectType != null) {
			setSubjectType(subjectType);
		}

		String subjectName = (String)attributes.get("subjectName");

		if (subjectName != null) {
			setSubjectName(subjectName);
		}

		Long amount = (Long)attributes.get("amount");

		if (amount != null) {
			setAmount(amount);
		}

		String paymentType = (String)attributes.get("paymentType");

		if (paymentType != null) {
			setPaymentType(paymentType);
		}

		String paymentDescription = (String)attributes.get("paymentDescription");

		if (paymentDescription != null) {
			setPaymentDescription(paymentDescription);
		}

		String transactionInfo = (String)attributes.get("transactionInfo");

		if (transactionInfo != null) {
			setTransactionInfo(transactionInfo);
		}

		Long fileEntryId = (Long)attributes.get("fileEntryId");

		if (fileEntryId != null) {
			setFileEntryId(fileEntryId);
		}

		Date checkingDate = (Date)attributes.get("checkingDate");

		if (checkingDate != null) {
			setCheckingDate(checkingDate);
		}

		Long checkingUserId = (Long)attributes.get("checkingUserId");

		if (checkingUserId != null) {
			setCheckingUserId(checkingUserId);
		}

		String checkingUserName = (String)attributes.get("checkingUserName");

		if (checkingUserName != null) {
			setCheckingUserName(checkingUserName);
		}

		Integer checkingResult = (Integer)attributes.get("checkingResult");

		if (checkingResult != null) {
			setCheckingResult(checkingResult);
		}

		String checkingNote = (String)attributes.get("checkingNote");

		if (checkingNote != null) {
			setCheckingNote(checkingNote);
		}

		Long ebMessageId = (Long)attributes.get("ebMessageId");

		if (ebMessageId != null) {
			setEbMessageId(ebMessageId);
		}
	}

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_paymentFileRemoteModel, uuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPaymentFileId() {
		return _paymentFileId;
	}

	@Override
	public void setPaymentFileId(long paymentFileId) {
		_paymentFileId = paymentFileId;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setPaymentFileId", long.class);

				method.invoke(_paymentFileRemoteModel, paymentFileId);
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

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_paymentFileRemoteModel, userId);
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

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_paymentFileRemoteModel, groupId);
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

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_paymentFileRemoteModel, companyId);
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

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_paymentFileRemoteModel, createDate);
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

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_paymentFileRemoteModel, modifiedDate);
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

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setOrganizationId", long.class);

				method.invoke(_paymentFileRemoteModel, organizationId);
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

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setGovAgencyId", String.class);

				method.invoke(_paymentFileRemoteModel, govAgencyId);
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

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setGovAgencyName", String.class);

				method.invoke(_paymentFileRemoteModel, govAgencyName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSubjectId() {
		return _subjectId;
	}

	@Override
	public void setSubjectId(String subjectId) {
		_subjectId = subjectId;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setSubjectId", String.class);

				method.invoke(_paymentFileRemoteModel, subjectId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSubjectType() {
		return _subjectType;
	}

	@Override
	public void setSubjectType(String subjectType) {
		_subjectType = subjectType;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setSubjectType", String.class);

				method.invoke(_paymentFileRemoteModel, subjectType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSubjectName() {
		return _subjectName;
	}

	@Override
	public void setSubjectName(String subjectName) {
		_subjectName = subjectName;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setSubjectName", String.class);

				method.invoke(_paymentFileRemoteModel, subjectName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAmount() {
		return _amount;
	}

	@Override
	public void setAmount(long amount) {
		_amount = amount;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setAmount", long.class);

				method.invoke(_paymentFileRemoteModel, amount);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPaymentType() {
		return _paymentType;
	}

	@Override
	public void setPaymentType(String paymentType) {
		_paymentType = paymentType;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setPaymentType", String.class);

				method.invoke(_paymentFileRemoteModel, paymentType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPaymentDescription() {
		return _paymentDescription;
	}

	@Override
	public void setPaymentDescription(String paymentDescription) {
		_paymentDescription = paymentDescription;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setPaymentDescription",
						String.class);

				method.invoke(_paymentFileRemoteModel, paymentDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTransactionInfo() {
		return _transactionInfo;
	}

	@Override
	public void setTransactionInfo(String transactionInfo) {
		_transactionInfo = transactionInfo;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setTransactionInfo",
						String.class);

				method.invoke(_paymentFileRemoteModel, transactionInfo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getFileEntryId() {
		return _fileEntryId;
	}

	@Override
	public void setFileEntryId(long fileEntryId) {
		_fileEntryId = fileEntryId;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setFileEntryId", long.class);

				method.invoke(_paymentFileRemoteModel, fileEntryId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCheckingDate() {
		return _checkingDate;
	}

	@Override
	public void setCheckingDate(Date checkingDate) {
		_checkingDate = checkingDate;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setCheckingDate", Date.class);

				method.invoke(_paymentFileRemoteModel, checkingDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCheckingUserId() {
		return _checkingUserId;
	}

	@Override
	public void setCheckingUserId(long checkingUserId) {
		_checkingUserId = checkingUserId;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setCheckingUserId", long.class);

				method.invoke(_paymentFileRemoteModel, checkingUserId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCheckingUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getCheckingUserId(), "uuid",
			_checkingUserUuid);
	}

	@Override
	public void setCheckingUserUuid(String checkingUserUuid) {
		_checkingUserUuid = checkingUserUuid;
	}

	@Override
	public String getCheckingUserName() {
		return _checkingUserName;
	}

	@Override
	public void setCheckingUserName(String checkingUserName) {
		_checkingUserName = checkingUserName;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setCheckingUserName",
						String.class);

				method.invoke(_paymentFileRemoteModel, checkingUserName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCheckingResult() {
		return _checkingResult;
	}

	@Override
	public void setCheckingResult(int checkingResult) {
		_checkingResult = checkingResult;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setCheckingResult", int.class);

				method.invoke(_paymentFileRemoteModel, checkingResult);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCheckingNote() {
		return _checkingNote;
	}

	@Override
	public void setCheckingNote(String checkingNote) {
		_checkingNote = checkingNote;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setCheckingNote", String.class);

				method.invoke(_paymentFileRemoteModel, checkingNote);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getEbMessageId() {
		return _ebMessageId;
	}

	@Override
	public void setEbMessageId(long ebMessageId) {
		_ebMessageId = ebMessageId;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setEbMessageId", long.class);

				method.invoke(_paymentFileRemoteModel, ebMessageId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				PaymentFile.class.getName()));
	}

	public BaseModel<?> getPaymentFileRemoteModel() {
		return _paymentFileRemoteModel;
	}

	public void setPaymentFileRemoteModel(BaseModel<?> paymentFileRemoteModel) {
		_paymentFileRemoteModel = paymentFileRemoteModel;
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

		Class<?> remoteModelClass = _paymentFileRemoteModel.getClass();

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

		Object returnValue = method.invoke(_paymentFileRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PaymentFileLocalServiceUtil.addPaymentFile(this);
		}
		else {
			PaymentFileLocalServiceUtil.updatePaymentFile(this);
		}
	}

	@Override
	public PaymentFile toEscapedModel() {
		return (PaymentFile)ProxyUtil.newProxyInstance(PaymentFile.class.getClassLoader(),
			new Class[] { PaymentFile.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PaymentFileClp clone = new PaymentFileClp();

		clone.setUuid(getUuid());
		clone.setPaymentFileId(getPaymentFileId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setOrganizationId(getOrganizationId());
		clone.setGovAgencyId(getGovAgencyId());
		clone.setGovAgencyName(getGovAgencyName());
		clone.setSubjectId(getSubjectId());
		clone.setSubjectType(getSubjectType());
		clone.setSubjectName(getSubjectName());
		clone.setAmount(getAmount());
		clone.setPaymentType(getPaymentType());
		clone.setPaymentDescription(getPaymentDescription());
		clone.setTransactionInfo(getTransactionInfo());
		clone.setFileEntryId(getFileEntryId());
		clone.setCheckingDate(getCheckingDate());
		clone.setCheckingUserId(getCheckingUserId());
		clone.setCheckingUserName(getCheckingUserName());
		clone.setCheckingResult(getCheckingResult());
		clone.setCheckingNote(getCheckingNote());
		clone.setEbMessageId(getEbMessageId());

		return clone;
	}

	@Override
	public int compareTo(PaymentFile paymentFile) {
		long primaryKey = paymentFile.getPrimaryKey();

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

		if (!(obj instanceof PaymentFileClp)) {
			return false;
		}

		PaymentFileClp paymentFile = (PaymentFileClp)obj;

		long primaryKey = paymentFile.getPrimaryKey();

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
		StringBundler sb = new StringBundler(49);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", paymentFileId=");
		sb.append(getPaymentFileId());
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
		sb.append(", organizationId=");
		sb.append(getOrganizationId());
		sb.append(", govAgencyId=");
		sb.append(getGovAgencyId());
		sb.append(", govAgencyName=");
		sb.append(getGovAgencyName());
		sb.append(", subjectId=");
		sb.append(getSubjectId());
		sb.append(", subjectType=");
		sb.append(getSubjectType());
		sb.append(", subjectName=");
		sb.append(getSubjectName());
		sb.append(", amount=");
		sb.append(getAmount());
		sb.append(", paymentType=");
		sb.append(getPaymentType());
		sb.append(", paymentDescription=");
		sb.append(getPaymentDescription());
		sb.append(", transactionInfo=");
		sb.append(getTransactionInfo());
		sb.append(", fileEntryId=");
		sb.append(getFileEntryId());
		sb.append(", checkingDate=");
		sb.append(getCheckingDate());
		sb.append(", checkingUserId=");
		sb.append(getCheckingUserId());
		sb.append(", checkingUserName=");
		sb.append(getCheckingUserName());
		sb.append(", checkingResult=");
		sb.append(getCheckingResult());
		sb.append(", checkingNote=");
		sb.append(getCheckingNote());
		sb.append(", ebMessageId=");
		sb.append(getEbMessageId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(76);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.dossiermgt.model.PaymentFile");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>paymentFileId</column-name><column-value><![CDATA[");
		sb.append(getPaymentFileId());
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
			"<column><column-name>organizationId</column-name><column-value><![CDATA[");
		sb.append(getOrganizationId());
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
			"<column><column-name>subjectId</column-name><column-value><![CDATA[");
		sb.append(getSubjectId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subjectType</column-name><column-value><![CDATA[");
		sb.append(getSubjectType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subjectName</column-name><column-value><![CDATA[");
		sb.append(getSubjectName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>amount</column-name><column-value><![CDATA[");
		sb.append(getAmount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>paymentType</column-name><column-value><![CDATA[");
		sb.append(getPaymentType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>paymentDescription</column-name><column-value><![CDATA[");
		sb.append(getPaymentDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>transactionInfo</column-name><column-value><![CDATA[");
		sb.append(getTransactionInfo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileEntryId</column-name><column-value><![CDATA[");
		sb.append(getFileEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>checkingDate</column-name><column-value><![CDATA[");
		sb.append(getCheckingDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>checkingUserId</column-name><column-value><![CDATA[");
		sb.append(getCheckingUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>checkingUserName</column-name><column-value><![CDATA[");
		sb.append(getCheckingUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>checkingResult</column-name><column-value><![CDATA[");
		sb.append(getCheckingResult());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>checkingNote</column-name><column-value><![CDATA[");
		sb.append(getCheckingNote());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ebMessageId</column-name><column-value><![CDATA[");
		sb.append(getEbMessageId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _paymentFileId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _organizationId;
	private String _govAgencyId;
	private String _govAgencyName;
	private String _subjectId;
	private String _subjectType;
	private String _subjectName;
	private long _amount;
	private String _paymentType;
	private String _paymentDescription;
	private String _transactionInfo;
	private long _fileEntryId;
	private Date _checkingDate;
	private long _checkingUserId;
	private String _checkingUserUuid;
	private String _checkingUserName;
	private int _checkingResult;
	private String _checkingNote;
	private long _ebMessageId;
	private BaseModel<?> _paymentFileRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.dossiermgt.service.ClpSerializer.class;
}