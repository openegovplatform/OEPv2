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

import org.oep.usermgt.model.Employee;
import org.oep.usermgt.model.EmployeeModel;
import org.oep.usermgt.model.EmployeeSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Employee service. Represents a row in the &quot;oep_usermgt_employee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.usermgt.model.EmployeeModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EmployeeImpl}.
 * </p>
 *
 * @author NQMINH
 * @see EmployeeImpl
 * @see org.oep.usermgt.model.Employee
 * @see org.oep.usermgt.model.EmployeeModel
 * @generated
 */
@JSON(strict = true)
public class EmployeeModelImpl extends BaseModelImpl<Employee>
	implements EmployeeModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a employee model instance should use the {@link org.oep.usermgt.model.Employee} interface instead.
	 */
	public static final String TABLE_NAME = "oep_usermgt_employee";
	public static final Object[][] TABLE_COLUMNS = {
			{ "employeeId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "mappingUserId", Types.BIGINT },
			{ "workingUnitId", Types.BIGINT },
			{ "mainJobPosId", Types.BIGINT },
			{ "employeeNo", Types.VARCHAR },
			{ "fullName", Types.VARCHAR },
			{ "officeTel", Types.VARCHAR },
			{ "homeTel", Types.VARCHAR },
			{ "mobile", Types.VARCHAR },
			{ "email", Types.VARCHAR },
			{ "shortName", Types.VARCHAR },
			{ "personelDocNo", Types.VARCHAR },
			{ "gender", Types.INTEGER },
			{ "birthdate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table oep_usermgt_employee (employeeId LONG not null primary key,companyId LONG,groupId LONG,userId LONG,createDate DATE null,modifiedDate DATE null,mappingUserId LONG,workingUnitId LONG,mainJobPosId LONG,employeeNo VARCHAR(75) null,fullName VARCHAR(75) null,officeTel VARCHAR(75) null,homeTel VARCHAR(75) null,mobile VARCHAR(75) null,email VARCHAR(75) null,shortName VARCHAR(75) null,personelDocNo VARCHAR(75) null,gender INTEGER,birthdate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table oep_usermgt_employee";
	public static final String ORDER_BY_JPQL = " ORDER BY employee.employeeId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY oep_usermgt_employee.employeeId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.usermgt.model.Employee"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.usermgt.model.Employee"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.oep.usermgt.model.Employee"),
			true);
	public static long MAINJOBPOSID_COLUMN_BITMASK = 1L;
	public static long MAPPINGUSERID_COLUMN_BITMASK = 2L;
	public static long WORKINGUNITID_COLUMN_BITMASK = 4L;
	public static long EMPLOYEEID_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Employee toModel(EmployeeSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Employee model = new EmployeeImpl();

		model.setEmployeeId(soapModel.getEmployeeId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setGroupId(soapModel.getGroupId());
		model.setUserId(soapModel.getUserId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setMappingUserId(soapModel.getMappingUserId());
		model.setWorkingUnitId(soapModel.getWorkingUnitId());
		model.setMainJobPosId(soapModel.getMainJobPosId());
		model.setEmployeeNo(soapModel.getEmployeeNo());
		model.setFullName(soapModel.getFullName());
		model.setOfficeTel(soapModel.getOfficeTel());
		model.setHomeTel(soapModel.getHomeTel());
		model.setMobile(soapModel.getMobile());
		model.setEmail(soapModel.getEmail());
		model.setShortName(soapModel.getShortName());
		model.setPersonelDocNo(soapModel.getPersonelDocNo());
		model.setGender(soapModel.getGender());
		model.setBirthdate(soapModel.getBirthdate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Employee> toModels(EmployeeSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Employee> models = new ArrayList<Employee>(soapModels.length);

		for (EmployeeSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final String MAPPING_TABLE_OEP_USERMGT_EMPLOYEE2JOBPOS_NAME = "oep_usermgt_employee2jobpos";
	public static final Object[][] MAPPING_TABLE_OEP_USERMGT_EMPLOYEE2JOBPOS_COLUMNS =
		{
			{ "employeeId", Types.BIGINT },
			{ "jobPosId", Types.BIGINT }
		};
	public static final String MAPPING_TABLE_OEP_USERMGT_EMPLOYEE2JOBPOS_SQL_CREATE =
		"create table oep_usermgt_employee2jobpos (employeeId LONG not null,jobPosId LONG not null,primary key (employeeId, jobPosId))";
	public static final boolean FINDER_CACHE_ENABLED_OEP_USERMGT_EMPLOYEE2JOBPOS =
		GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.oep_usermgt_employee2jobpos"),
			true);
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.usermgt.model.Employee"));

	public EmployeeModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _employeeId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEmployeeId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _employeeId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Employee.class;
	}

	@Override
	public String getModelClassName() {
		return Employee.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeId", getEmployeeId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("mappingUserId", getMappingUserId());
		attributes.put("workingUnitId", getWorkingUnitId());
		attributes.put("mainJobPosId", getMainJobPosId());
		attributes.put("employeeNo", getEmployeeNo());
		attributes.put("fullName", getFullName());
		attributes.put("officeTel", getOfficeTel());
		attributes.put("homeTel", getHomeTel());
		attributes.put("mobile", getMobile());
		attributes.put("email", getEmail());
		attributes.put("shortName", getShortName());
		attributes.put("personelDocNo", getPersonelDocNo());
		attributes.put("gender", getGender());
		attributes.put("birthdate", getBirthdate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeId = (Long)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
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

		Long mappingUserId = (Long)attributes.get("mappingUserId");

		if (mappingUserId != null) {
			setMappingUserId(mappingUserId);
		}

		Long workingUnitId = (Long)attributes.get("workingUnitId");

		if (workingUnitId != null) {
			setWorkingUnitId(workingUnitId);
		}

		Long mainJobPosId = (Long)attributes.get("mainJobPosId");

		if (mainJobPosId != null) {
			setMainJobPosId(mainJobPosId);
		}

		String employeeNo = (String)attributes.get("employeeNo");

		if (employeeNo != null) {
			setEmployeeNo(employeeNo);
		}

		String fullName = (String)attributes.get("fullName");

		if (fullName != null) {
			setFullName(fullName);
		}

		String officeTel = (String)attributes.get("officeTel");

		if (officeTel != null) {
			setOfficeTel(officeTel);
		}

		String homeTel = (String)attributes.get("homeTel");

		if (homeTel != null) {
			setHomeTel(homeTel);
		}

		String mobile = (String)attributes.get("mobile");

		if (mobile != null) {
			setMobile(mobile);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String shortName = (String)attributes.get("shortName");

		if (shortName != null) {
			setShortName(shortName);
		}

		String personelDocNo = (String)attributes.get("personelDocNo");

		if (personelDocNo != null) {
			setPersonelDocNo(personelDocNo);
		}

		Integer gender = (Integer)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		Date birthdate = (Date)attributes.get("birthdate");

		if (birthdate != null) {
			setBirthdate(birthdate);
		}
	}

	@JSON
	@Override
	public long getEmployeeId() {
		return _employeeId;
	}

	@Override
	public void setEmployeeId(long employeeId) {
		_employeeId = employeeId;
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
	public long getWorkingUnitId() {
		return _workingUnitId;
	}

	@Override
	public void setWorkingUnitId(long workingUnitId) {
		_columnBitmask |= WORKINGUNITID_COLUMN_BITMASK;

		if (!_setOriginalWorkingUnitId) {
			_setOriginalWorkingUnitId = true;

			_originalWorkingUnitId = _workingUnitId;
		}

		_workingUnitId = workingUnitId;
	}

	public long getOriginalWorkingUnitId() {
		return _originalWorkingUnitId;
	}

	@JSON
	@Override
	public long getMainJobPosId() {
		return _mainJobPosId;
	}

	@Override
	public void setMainJobPosId(long mainJobPosId) {
		_columnBitmask |= MAINJOBPOSID_COLUMN_BITMASK;

		if (!_setOriginalMainJobPosId) {
			_setOriginalMainJobPosId = true;

			_originalMainJobPosId = _mainJobPosId;
		}

		_mainJobPosId = mainJobPosId;
	}

	public long getOriginalMainJobPosId() {
		return _originalMainJobPosId;
	}

	@JSON
	@Override
	public String getEmployeeNo() {
		if (_employeeNo == null) {
			return StringPool.BLANK;
		}
		else {
			return _employeeNo;
		}
	}

	@Override
	public void setEmployeeNo(String employeeNo) {
		_employeeNo = employeeNo;
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
	public String getOfficeTel() {
		if (_officeTel == null) {
			return StringPool.BLANK;
		}
		else {
			return _officeTel;
		}
	}

	@Override
	public void setOfficeTel(String officeTel) {
		_officeTel = officeTel;
	}

	@JSON
	@Override
	public String getHomeTel() {
		if (_homeTel == null) {
			return StringPool.BLANK;
		}
		else {
			return _homeTel;
		}
	}

	@Override
	public void setHomeTel(String homeTel) {
		_homeTel = homeTel;
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
	public String getPersonelDocNo() {
		if (_personelDocNo == null) {
			return StringPool.BLANK;
		}
		else {
			return _personelDocNo;
		}
	}

	@Override
	public void setPersonelDocNo(String personelDocNo) {
		_personelDocNo = personelDocNo;
	}

	@JSON
	@Override
	public int getGender() {
		return _gender;
	}

	@Override
	public void setGender(int gender) {
		_gender = gender;
	}

	@JSON
	@Override
	public Date getBirthdate() {
		return _birthdate;
	}

	@Override
	public void setBirthdate(Date birthdate) {
		_birthdate = birthdate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Employee.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Employee toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Employee)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		EmployeeImpl employeeImpl = new EmployeeImpl();

		employeeImpl.setEmployeeId(getEmployeeId());
		employeeImpl.setCompanyId(getCompanyId());
		employeeImpl.setGroupId(getGroupId());
		employeeImpl.setUserId(getUserId());
		employeeImpl.setCreateDate(getCreateDate());
		employeeImpl.setModifiedDate(getModifiedDate());
		employeeImpl.setMappingUserId(getMappingUserId());
		employeeImpl.setWorkingUnitId(getWorkingUnitId());
		employeeImpl.setMainJobPosId(getMainJobPosId());
		employeeImpl.setEmployeeNo(getEmployeeNo());
		employeeImpl.setFullName(getFullName());
		employeeImpl.setOfficeTel(getOfficeTel());
		employeeImpl.setHomeTel(getHomeTel());
		employeeImpl.setMobile(getMobile());
		employeeImpl.setEmail(getEmail());
		employeeImpl.setShortName(getShortName());
		employeeImpl.setPersonelDocNo(getPersonelDocNo());
		employeeImpl.setGender(getGender());
		employeeImpl.setBirthdate(getBirthdate());

		employeeImpl.resetOriginalValues();

		return employeeImpl;
	}

	@Override
	public int compareTo(Employee employee) {
		long primaryKey = employee.getPrimaryKey();

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

		if (!(obj instanceof Employee)) {
			return false;
		}

		Employee employee = (Employee)obj;

		long primaryKey = employee.getPrimaryKey();

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
		EmployeeModelImpl employeeModelImpl = this;

		employeeModelImpl._originalMappingUserId = employeeModelImpl._mappingUserId;

		employeeModelImpl._setOriginalMappingUserId = false;

		employeeModelImpl._originalWorkingUnitId = employeeModelImpl._workingUnitId;

		employeeModelImpl._setOriginalWorkingUnitId = false;

		employeeModelImpl._originalMainJobPosId = employeeModelImpl._mainJobPosId;

		employeeModelImpl._setOriginalMainJobPosId = false;

		employeeModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Employee> toCacheModel() {
		EmployeeCacheModel employeeCacheModel = new EmployeeCacheModel();

		employeeCacheModel.employeeId = getEmployeeId();

		employeeCacheModel.companyId = getCompanyId();

		employeeCacheModel.groupId = getGroupId();

		employeeCacheModel.userId = getUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			employeeCacheModel.createDate = createDate.getTime();
		}
		else {
			employeeCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			employeeCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			employeeCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		employeeCacheModel.mappingUserId = getMappingUserId();

		employeeCacheModel.workingUnitId = getWorkingUnitId();

		employeeCacheModel.mainJobPosId = getMainJobPosId();

		employeeCacheModel.employeeNo = getEmployeeNo();

		String employeeNo = employeeCacheModel.employeeNo;

		if ((employeeNo != null) && (employeeNo.length() == 0)) {
			employeeCacheModel.employeeNo = null;
		}

		employeeCacheModel.fullName = getFullName();

		String fullName = employeeCacheModel.fullName;

		if ((fullName != null) && (fullName.length() == 0)) {
			employeeCacheModel.fullName = null;
		}

		employeeCacheModel.officeTel = getOfficeTel();

		String officeTel = employeeCacheModel.officeTel;

		if ((officeTel != null) && (officeTel.length() == 0)) {
			employeeCacheModel.officeTel = null;
		}

		employeeCacheModel.homeTel = getHomeTel();

		String homeTel = employeeCacheModel.homeTel;

		if ((homeTel != null) && (homeTel.length() == 0)) {
			employeeCacheModel.homeTel = null;
		}

		employeeCacheModel.mobile = getMobile();

		String mobile = employeeCacheModel.mobile;

		if ((mobile != null) && (mobile.length() == 0)) {
			employeeCacheModel.mobile = null;
		}

		employeeCacheModel.email = getEmail();

		String email = employeeCacheModel.email;

		if ((email != null) && (email.length() == 0)) {
			employeeCacheModel.email = null;
		}

		employeeCacheModel.shortName = getShortName();

		String shortName = employeeCacheModel.shortName;

		if ((shortName != null) && (shortName.length() == 0)) {
			employeeCacheModel.shortName = null;
		}

		employeeCacheModel.personelDocNo = getPersonelDocNo();

		String personelDocNo = employeeCacheModel.personelDocNo;

		if ((personelDocNo != null) && (personelDocNo.length() == 0)) {
			employeeCacheModel.personelDocNo = null;
		}

		employeeCacheModel.gender = getGender();

		Date birthdate = getBirthdate();

		if (birthdate != null) {
			employeeCacheModel.birthdate = birthdate.getTime();
		}
		else {
			employeeCacheModel.birthdate = Long.MIN_VALUE;
		}

		return employeeCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{employeeId=");
		sb.append(getEmployeeId());
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
		sb.append(", mappingUserId=");
		sb.append(getMappingUserId());
		sb.append(", workingUnitId=");
		sb.append(getWorkingUnitId());
		sb.append(", mainJobPosId=");
		sb.append(getMainJobPosId());
		sb.append(", employeeNo=");
		sb.append(getEmployeeNo());
		sb.append(", fullName=");
		sb.append(getFullName());
		sb.append(", officeTel=");
		sb.append(getOfficeTel());
		sb.append(", homeTel=");
		sb.append(getHomeTel());
		sb.append(", mobile=");
		sb.append(getMobile());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", shortName=");
		sb.append(getShortName());
		sb.append(", personelDocNo=");
		sb.append(getPersonelDocNo());
		sb.append(", gender=");
		sb.append(getGender());
		sb.append(", birthdate=");
		sb.append(getBirthdate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(61);

		sb.append("<model><model-name>");
		sb.append("org.oep.usermgt.model.Employee");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>employeeId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeId());
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
			"<column><column-name>mappingUserId</column-name><column-value><![CDATA[");
		sb.append(getMappingUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>workingUnitId</column-name><column-value><![CDATA[");
		sb.append(getWorkingUnitId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mainJobPosId</column-name><column-value><![CDATA[");
		sb.append(getMainJobPosId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeNo</column-name><column-value><![CDATA[");
		sb.append(getEmployeeNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fullName</column-name><column-value><![CDATA[");
		sb.append(getFullName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>officeTel</column-name><column-value><![CDATA[");
		sb.append(getOfficeTel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>homeTel</column-name><column-value><![CDATA[");
		sb.append(getHomeTel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mobile</column-name><column-value><![CDATA[");
		sb.append(getMobile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shortName</column-name><column-value><![CDATA[");
		sb.append(getShortName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>personelDocNo</column-name><column-value><![CDATA[");
		sb.append(getPersonelDocNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gender</column-name><column-value><![CDATA[");
		sb.append(getGender());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>birthdate</column-name><column-value><![CDATA[");
		sb.append(getBirthdate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Employee.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Employee.class
		};
	private long _employeeId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private String _userUuid;
	private Date _createDate;
	private Date _modifiedDate;
	private long _mappingUserId;
	private String _mappingUserUuid;
	private long _originalMappingUserId;
	private boolean _setOriginalMappingUserId;
	private long _workingUnitId;
	private long _originalWorkingUnitId;
	private boolean _setOriginalWorkingUnitId;
	private long _mainJobPosId;
	private long _originalMainJobPosId;
	private boolean _setOriginalMainJobPosId;
	private String _employeeNo;
	private String _fullName;
	private String _officeTel;
	private String _homeTel;
	private String _mobile;
	private String _email;
	private String _shortName;
	private String _personelDocNo;
	private int _gender;
	private Date _birthdate;
	private long _columnBitmask;
	private Employee _escapedModel;
}