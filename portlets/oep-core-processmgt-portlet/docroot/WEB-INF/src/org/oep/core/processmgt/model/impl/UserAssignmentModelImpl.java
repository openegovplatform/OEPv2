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

package org.oep.core.processmgt.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import org.oep.core.processmgt.model.UserAssignment;
import org.oep.core.processmgt.model.UserAssignmentModel;
import org.oep.core.processmgt.model.UserAssignmentSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the UserAssignment service. Represents a row in the &quot;oep_processmgt_UserAssignment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.core.processmgt.model.UserAssignmentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UserAssignmentImpl}.
 * </p>
 *
 * @author trungdk
 * @see UserAssignmentImpl
 * @see org.oep.core.processmgt.model.UserAssignment
 * @see org.oep.core.processmgt.model.UserAssignmentModel
 * @generated
 */
@JSON(strict = true)
public class UserAssignmentModelImpl extends BaseModelImpl<UserAssignment>
	implements UserAssignmentModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a user assignment model instance should use the {@link org.oep.core.processmgt.model.UserAssignment} interface instead.
	 */
	public static final String TABLE_NAME = "oep_processmgt_UserAssignment";
	public static final Object[][] TABLE_COLUMNS = {
			{ "userAssignmentId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "processOrderId", Types.BIGINT },
			{ "dossierStepId", Types.BIGINT },
			{ "assignToUserId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table oep_processmgt_UserAssignment (userAssignmentId LONG not null primary key,userId LONG,groupId LONG,companyId LONG,createDate DATE null,processOrderId LONG,dossierStepId LONG,assignToUserId LONG)";
	public static final String TABLE_SQL_DROP = "drop table oep_processmgt_UserAssignment";
	public static final String ORDER_BY_JPQL = " ORDER BY userAssignment.userAssignmentId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY oep_processmgt_UserAssignment.userAssignmentId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.core.processmgt.model.UserAssignment"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.core.processmgt.model.UserAssignment"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static UserAssignment toModel(UserAssignmentSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		UserAssignment model = new UserAssignmentImpl();

		model.setUserAssignmentId(soapModel.getUserAssignmentId());
		model.setUserId(soapModel.getUserId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setProcessOrderId(soapModel.getProcessOrderId());
		model.setDossierStepId(soapModel.getDossierStepId());
		model.setAssignToUserId(soapModel.getAssignToUserId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<UserAssignment> toModels(UserAssignmentSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<UserAssignment> models = new ArrayList<UserAssignment>(soapModels.length);

		for (UserAssignmentSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.core.processmgt.model.UserAssignment"));

	public UserAssignmentModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _userAssignmentId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setUserAssignmentId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _userAssignmentId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return UserAssignment.class;
	}

	@Override
	public String getModelClassName() {
		return UserAssignment.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userAssignmentId", getUserAssignmentId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("processOrderId", getProcessOrderId());
		attributes.put("dossierStepId", getDossierStepId());
		attributes.put("assignToUserId", getAssignToUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long userAssignmentId = (Long)attributes.get("userAssignmentId");

		if (userAssignmentId != null) {
			setUserAssignmentId(userAssignmentId);
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

		Long processOrderId = (Long)attributes.get("processOrderId");

		if (processOrderId != null) {
			setProcessOrderId(processOrderId);
		}

		Long dossierStepId = (Long)attributes.get("dossierStepId");

		if (dossierStepId != null) {
			setDossierStepId(dossierStepId);
		}

		Long assignToUserId = (Long)attributes.get("assignToUserId");

		if (assignToUserId != null) {
			setAssignToUserId(assignToUserId);
		}
	}

	@JSON
	@Override
	public long getUserAssignmentId() {
		return _userAssignmentId;
	}

	@Override
	public void setUserAssignmentId(long userAssignmentId) {
		_userAssignmentId = userAssignmentId;
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
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
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
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public long getProcessOrderId() {
		return _processOrderId;
	}

	@Override
	public void setProcessOrderId(long processOrderId) {
		_processOrderId = processOrderId;
	}

	@JSON
	@Override
	public long getDossierStepId() {
		return _dossierStepId;
	}

	@Override
	public void setDossierStepId(long dossierStepId) {
		_dossierStepId = dossierStepId;
	}

	@JSON
	@Override
	public long getAssignToUserId() {
		return _assignToUserId;
	}

	@Override
	public void setAssignToUserId(long assignToUserId) {
		_assignToUserId = assignToUserId;
	}

	@Override
	public String getAssignToUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getAssignToUserId(), "uuid",
			_assignToUserUuid);
	}

	@Override
	public void setAssignToUserUuid(String assignToUserUuid) {
		_assignToUserUuid = assignToUserUuid;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			UserAssignment.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public UserAssignment toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (UserAssignment)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		UserAssignmentImpl userAssignmentImpl = new UserAssignmentImpl();

		userAssignmentImpl.setUserAssignmentId(getUserAssignmentId());
		userAssignmentImpl.setUserId(getUserId());
		userAssignmentImpl.setGroupId(getGroupId());
		userAssignmentImpl.setCompanyId(getCompanyId());
		userAssignmentImpl.setCreateDate(getCreateDate());
		userAssignmentImpl.setProcessOrderId(getProcessOrderId());
		userAssignmentImpl.setDossierStepId(getDossierStepId());
		userAssignmentImpl.setAssignToUserId(getAssignToUserId());

		userAssignmentImpl.resetOriginalValues();

		return userAssignmentImpl;
	}

	@Override
	public int compareTo(UserAssignment userAssignment) {
		long primaryKey = userAssignment.getPrimaryKey();

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

		if (!(obj instanceof UserAssignment)) {
			return false;
		}

		UserAssignment userAssignment = (UserAssignment)obj;

		long primaryKey = userAssignment.getPrimaryKey();

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
	}

	@Override
	public CacheModel<UserAssignment> toCacheModel() {
		UserAssignmentCacheModel userAssignmentCacheModel = new UserAssignmentCacheModel();

		userAssignmentCacheModel.userAssignmentId = getUserAssignmentId();

		userAssignmentCacheModel.userId = getUserId();

		userAssignmentCacheModel.groupId = getGroupId();

		userAssignmentCacheModel.companyId = getCompanyId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			userAssignmentCacheModel.createDate = createDate.getTime();
		}
		else {
			userAssignmentCacheModel.createDate = Long.MIN_VALUE;
		}

		userAssignmentCacheModel.processOrderId = getProcessOrderId();

		userAssignmentCacheModel.dossierStepId = getDossierStepId();

		userAssignmentCacheModel.assignToUserId = getAssignToUserId();

		return userAssignmentCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{userAssignmentId=");
		sb.append(getUserAssignmentId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", processOrderId=");
		sb.append(getProcessOrderId());
		sb.append(", dossierStepId=");
		sb.append(getDossierStepId());
		sb.append(", assignToUserId=");
		sb.append(getAssignToUserId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.processmgt.model.UserAssignment");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>userAssignmentId</column-name><column-value><![CDATA[");
		sb.append(getUserAssignmentId());
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
			"<column><column-name>processOrderId</column-name><column-value><![CDATA[");
		sb.append(getProcessOrderId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierStepId</column-name><column-value><![CDATA[");
		sb.append(getDossierStepId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assignToUserId</column-name><column-value><![CDATA[");
		sb.append(getAssignToUserId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = UserAssignment.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			UserAssignment.class
		};
	private long _userAssignmentId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private long _processOrderId;
	private long _dossierStepId;
	private long _assignToUserId;
	private String _assignToUserUuid;
	private UserAssignment _escapedModel;
}