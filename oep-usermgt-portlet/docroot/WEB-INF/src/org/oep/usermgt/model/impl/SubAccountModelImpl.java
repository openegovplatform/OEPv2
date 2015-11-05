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

package org.oep.usermgt.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import org.oep.usermgt.model.SubAccount;
import org.oep.usermgt.model.SubAccountModel;
import org.oep.usermgt.model.SubAccountSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the SubAccount service. Represents a row in the &quot;oep_usermgt_subaccount&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.usermgt.model.SubAccountModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SubAccountImpl}.
 * </p>
 *
 * @author NQMINH
 * @see SubAccountImpl
 * @see org.oep.usermgt.model.SubAccount
 * @see org.oep.usermgt.model.SubAccountModel
 * @generated
 */
@JSON(strict = true)
public class SubAccountModelImpl extends BaseModelImpl<SubAccount>
	implements SubAccountModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a sub account model instance should use the {@link org.oep.usermgt.model.SubAccount} interface instead.
	 */
	public static final String TABLE_NAME = "oep_usermgt_subaccount";
	public static final Object[][] TABLE_COLUMNS = {
			{ "subAccountId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "businessId", Types.BIGINT },
			{ "mappingUserId", Types.BIGINT },
			{ "fullName", Types.VARCHAR },
			{ "shortName", Types.VARCHAR },
			{ "workingRole", Types.VARCHAR },
			{ "telNo", Types.VARCHAR },
			{ "mobile", Types.VARCHAR },
			{ "email", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table oep_usermgt_subaccount (subAccountId LONG not null primary key,companyId LONG,groupId LONG,userId LONG,createDate DATE null,modifiedDate DATE null,businessId LONG,mappingUserId LONG,fullName VARCHAR(75) null,shortName VARCHAR(75) null,workingRole VARCHAR(75) null,telNo VARCHAR(75) null,mobile VARCHAR(75) null,email VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table oep_usermgt_subaccount";
	public static final String ORDER_BY_JPQL = " ORDER BY subAccount.subAccountId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY oep_usermgt_subaccount.subAccountId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.usermgt.model.SubAccount"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.usermgt.model.SubAccount"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.oep.usermgt.model.SubAccount"),
			true);
	public static long BUSINESSID_COLUMN_BITMASK = 1L;
	public static long MAPPINGUSERID_COLUMN_BITMASK = 2L;
	public static long WORKINGROLE_COLUMN_BITMASK = 4L;
	public static long SUBACCOUNTID_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static SubAccount toModel(SubAccountSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		SubAccount model = new SubAccountImpl();

		model.setSubAccountId(soapModel.getSubAccountId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setGroupId(soapModel.getGroupId());
		model.setUserId(soapModel.getUserId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setBusinessId(soapModel.getBusinessId());
		model.setMappingUserId(soapModel.getMappingUserId());
		model.setFullName(soapModel.getFullName());
		model.setShortName(soapModel.getShortName());
		model.setWorkingRole(soapModel.getWorkingRole());
		model.setTelNo(soapModel.getTelNo());
		model.setMobile(soapModel.getMobile());
		model.setEmail(soapModel.getEmail());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<SubAccount> toModels(SubAccountSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<SubAccount> models = new ArrayList<SubAccount>(soapModels.length);

		for (SubAccountSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.usermgt.model.SubAccount"));

	public SubAccountModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _subAccountId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSubAccountId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _subAccountId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return SubAccount.class;
	}

	@Override
	public String getModelClassName() {
		return SubAccount.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("subAccountId", getSubAccountId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("businessId", getBusinessId());
		attributes.put("mappingUserId", getMappingUserId());
		attributes.put("fullName", getFullName());
		attributes.put("shortName", getShortName());
		attributes.put("workingRole", getWorkingRole());
		attributes.put("telNo", getTelNo());
		attributes.put("mobile", getMobile());
		attributes.put("email", getEmail());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long subAccountId = (Long)attributes.get("subAccountId");

		if (subAccountId != null) {
			setSubAccountId(subAccountId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long businessId = (Long)attributes.get("businessId");

		if (businessId != null) {
			setBusinessId(businessId);
		}

		Long mappingUserId = (Long)attributes.get("mappingUserId");

		if (mappingUserId != null) {
			setMappingUserId(mappingUserId);
		}

		String fullName = (String)attributes.get("fullName");

		if (fullName != null) {
			setFullName(fullName);
		}

		String shortName = (String)attributes.get("shortName");

		if (shortName != null) {
			setShortName(shortName);
		}

		String workingRole = (String)attributes.get("workingRole");

		if (workingRole != null) {
			setWorkingRole(workingRole);
		}

		String telNo = (String)attributes.get("telNo");

		if (telNo != null) {
			setTelNo(telNo);
		}

		String mobile = (String)attributes.get("mobile");

		if (mobile != null) {
			setMobile(mobile);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}
	}

	@JSON
	@Override
	public long getSubAccountId() {
		return _subAccountId;
	}

	@Override
	public void setSubAccountId(long subAccountId) {
		_subAccountId = subAccountId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public long getBusinessId() {
		return _businessId;
	}

	@Override
	public void setBusinessId(long businessId) {
		_columnBitmask |= BUSINESSID_COLUMN_BITMASK;

		if (!_setOriginalBusinessId) {
			_setOriginalBusinessId = true;

			_originalBusinessId = _businessId;
		}

		_businessId = businessId;
	}

	public long getOriginalBusinessId() {
		return _originalBusinessId;
	}

	@JSON
	@Override
	public long getMappingUserId() {
		return _mappingUserId;
	}

	@Override
	public void setMappingUserId(long mappingUserId) {
		_columnBitmask |= MAPPINGUSERID_COLUMN_BITMASK;

		if (!_setOriginalMappingUserId) {
			_setOriginalMappingUserId = true;

			_originalMappingUserId = _mappingUserId;
		}

		_mappingUserId = mappingUserId;
	}

	@Override
	public String getMappingUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getMappingUserId(), "uuid",
			_mappingUserUuid);
	}

	@Override
	public void setMappingUserUuid(String mappingUserUuid) {
		_mappingUserUuid = mappingUserUuid;
	}

	public long getOriginalMappingUserId() {
		return _originalMappingUserId;
	}

	@JSON
	@Override
	public String getFullName() {
		if (_fullName == null) {
			return StringPool.BLANK;
		}
		else {
			return _fullName;
		}
	}

	@Override
	public void setFullName(String fullName) {
		_fullName = fullName;
	}

	@JSON
	@Override
	public String getShortName() {
		if (_shortName == null) {
			return StringPool.BLANK;
		}
		else {
			return _shortName;
		}
	}

	@Override
	public void setShortName(String shortName) {
		_shortName = shortName;
	}

	@JSON
	@Override
	public String getWorkingRole() {
		if (_workingRole == null) {
			return StringPool.BLANK;
		}
		else {
			return _workingRole;
		}
	}

	@Override
	public void setWorkingRole(String workingRole) {
		_columnBitmask |= WORKINGROLE_COLUMN_BITMASK;

		if (_originalWorkingRole == null) {
			_originalWorkingRole = _workingRole;
		}

		_workingRole = workingRole;
	}

	public String getOriginalWorkingRole() {
		return GetterUtil.getString(_originalWorkingRole);
	}

	@JSON
	@Override
	public String getTelNo() {
		if (_telNo == null) {
			return StringPool.BLANK;
		}
		else {
			return _telNo;
		}
	}

	@Override
	public void setTelNo(String telNo) {
		_telNo = telNo;
	}

	@JSON
	@Override
	public String getMobile() {
		if (_mobile == null) {
			return StringPool.BLANK;
		}
		else {
			return _mobile;
		}
	}

	@Override
	public void setMobile(String mobile) {
		_mobile = mobile;
	}

	@JSON
	@Override
	public String getEmail() {
		if (_email == null) {
			return StringPool.BLANK;
		}
		else {
			return _email;
		}
	}

	@Override
	public void setEmail(String email) {
		_email = email;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			SubAccount.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SubAccount toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (SubAccount)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		SubAccountImpl subAccountImpl = new SubAccountImpl();

		subAccountImpl.setSubAccountId(getSubAccountId());
		subAccountImpl.setCompanyId(getCompanyId());
		subAccountImpl.setGroupId(getGroupId());
		subAccountImpl.setUserId(getUserId());
		subAccountImpl.setCreateDate(getCreateDate());
		subAccountImpl.setModifiedDate(getModifiedDate());
		subAccountImpl.setBusinessId(getBusinessId());
		subAccountImpl.setMappingUserId(getMappingUserId());
		subAccountImpl.setFullName(getFullName());
		subAccountImpl.setShortName(getShortName());
		subAccountImpl.setWorkingRole(getWorkingRole());
		subAccountImpl.setTelNo(getTelNo());
		subAccountImpl.setMobile(getMobile());
		subAccountImpl.setEmail(getEmail());

		subAccountImpl.resetOriginalValues();

		return subAccountImpl;
	}

	@Override
	public int compareTo(SubAccount subAccount) {
		long primaryKey = subAccount.getPrimaryKey();

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

		if (!(obj instanceof SubAccount)) {
			return false;
		}

		SubAccount subAccount = (SubAccount)obj;

		long primaryKey = subAccount.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		SubAccountModelImpl subAccountModelImpl = this;

		subAccountModelImpl._originalBusinessId = subAccountModelImpl._businessId;

		subAccountModelImpl._setOriginalBusinessId = false;

		subAccountModelImpl._originalMappingUserId = subAccountModelImpl._mappingUserId;

		subAccountModelImpl._setOriginalMappingUserId = false;

		subAccountModelImpl._originalWorkingRole = subAccountModelImpl._workingRole;

		subAccountModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<SubAccount> toCacheModel() {
		SubAccountCacheModel subAccountCacheModel = new SubAccountCacheModel();

		subAccountCacheModel.subAccountId = getSubAccountId();

		subAccountCacheModel.companyId = getCompanyId();

		subAccountCacheModel.groupId = getGroupId();

		subAccountCacheModel.userId = getUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			subAccountCacheModel.createDate = createDate.getTime();
		}
		else {
			subAccountCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			subAccountCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			subAccountCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		subAccountCacheModel.businessId = getBusinessId();

		subAccountCacheModel.mappingUserId = getMappingUserId();

		subAccountCacheModel.fullName = getFullName();

		String fullName = subAccountCacheModel.fullName;

		if ((fullName != null) && (fullName.length() == 0)) {
			subAccountCacheModel.fullName = null;
		}

		subAccountCacheModel.shortName = getShortName();

		String shortName = subAccountCacheModel.shortName;

		if ((shortName != null) && (shortName.length() == 0)) {
			subAccountCacheModel.shortName = null;
		}

		subAccountCacheModel.workingRole = getWorkingRole();

		String workingRole = subAccountCacheModel.workingRole;

		if ((workingRole != null) && (workingRole.length() == 0)) {
			subAccountCacheModel.workingRole = null;
		}

		subAccountCacheModel.telNo = getTelNo();

		String telNo = subAccountCacheModel.telNo;

		if ((telNo != null) && (telNo.length() == 0)) {
			subAccountCacheModel.telNo = null;
		}

		subAccountCacheModel.mobile = getMobile();

		String mobile = subAccountCacheModel.mobile;

		if ((mobile != null) && (mobile.length() == 0)) {
			subAccountCacheModel.mobile = null;
		}

		subAccountCacheModel.email = getEmail();

		String email = subAccountCacheModel.email;

		if ((email != null) && (email.length() == 0)) {
			subAccountCacheModel.email = null;
		}

		return subAccountCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{subAccountId=");
		sb.append(getSubAccountId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", businessId=");
		sb.append(getBusinessId());
		sb.append(", mappingUserId=");
		sb.append(getMappingUserId());
		sb.append(", fullName=");
		sb.append(getFullName());
		sb.append(", shortName=");
		sb.append(getShortName());
		sb.append(", workingRole=");
		sb.append(getWorkingRole());
		sb.append(", telNo=");
		sb.append(getTelNo());
		sb.append(", mobile=");
		sb.append(getMobile());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("org.oep.usermgt.model.SubAccount");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>subAccountId</column-name><column-value><![CDATA[");
		sb.append(getSubAccountId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
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
			"<column><column-name>businessId</column-name><column-value><![CDATA[");
		sb.append(getBusinessId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mappingUserId</column-name><column-value><![CDATA[");
		sb.append(getMappingUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fullName</column-name><column-value><![CDATA[");
		sb.append(getFullName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shortName</column-name><column-value><![CDATA[");
		sb.append(getShortName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>workingRole</column-name><column-value><![CDATA[");
		sb.append(getWorkingRole());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>telNo</column-name><column-value><![CDATA[");
		sb.append(getTelNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mobile</column-name><column-value><![CDATA[");
		sb.append(getMobile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = SubAccount.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			SubAccount.class
		};
	private long _subAccountId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private String _userUuid;
	private Date _createDate;
	private Date _modifiedDate;
	private long _businessId;
	private long _originalBusinessId;
	private boolean _setOriginalBusinessId;
	private long _mappingUserId;
	private String _mappingUserUuid;
	private long _originalMappingUserId;
	private boolean _setOriginalMappingUserId;
	private String _fullName;
	private String _shortName;
	private String _workingRole;
	private String _originalWorkingRole;
	private String _telNo;
	private String _mobile;
	private String _email;
	private long _columnBitmask;
	private SubAccount _escapedModel;
}