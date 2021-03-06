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

package org.oep.core.ssomgt.model.impl;

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

import org.oep.core.ssomgt.model.UserSync;
import org.oep.core.ssomgt.model.UserSyncModel;
import org.oep.core.ssomgt.model.UserSyncSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the UserSync service. Represents a row in the &quot;oep_ssomgt_usersync&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.core.ssomgt.model.UserSyncModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UserSyncImpl}.
 * </p>
 *
 * @author trungdk
 * @see UserSyncImpl
 * @see org.oep.core.ssomgt.model.UserSync
 * @see org.oep.core.ssomgt.model.UserSyncModel
 * @generated
 */
@JSON(strict = true)
public class UserSyncModelImpl extends BaseModelImpl<UserSync>
	implements UserSyncModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a user sync model instance should use the {@link org.oep.core.ssomgt.model.UserSync} interface instead.
	 */
	public static final String TABLE_NAME = "oep_ssomgt_usersync";
	public static final Object[][] TABLE_COLUMNS = {
			{ "userSyncId", Types.BIGINT },
			{ "applicationId", Types.BIGINT },
			{ "employeeId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "accessible", Types.INTEGER },
			{ "checkpoint", Types.TIMESTAMP },
			{ "syncTime", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table oep_ssomgt_usersync (userSyncId LONG not null primary key,applicationId LONG,employeeId LONG,userId LONG,accessible INTEGER,checkpoint DATE null,syncTime DATE null)";
	public static final String TABLE_SQL_DROP = "drop table oep_ssomgt_usersync";
	public static final String ORDER_BY_JPQL = " ORDER BY userSync.userSyncId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY oep_ssomgt_usersync.userSyncId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.core.ssomgt.model.UserSync"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.core.ssomgt.model.UserSync"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static UserSync toModel(UserSyncSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		UserSync model = new UserSyncImpl();

		model.setUserSyncId(soapModel.getUserSyncId());
		model.setApplicationId(soapModel.getApplicationId());
		model.setEmployeeId(soapModel.getEmployeeId());
		model.setUserId(soapModel.getUserId());
		model.setAccessible(soapModel.getAccessible());
		model.setCheckpoint(soapModel.getCheckpoint());
		model.setSyncTime(soapModel.getSyncTime());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<UserSync> toModels(UserSyncSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<UserSync> models = new ArrayList<UserSync>(soapModels.length);

		for (UserSyncSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.core.ssomgt.model.UserSync"));

	public UserSyncModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _userSyncId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setUserSyncId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _userSyncId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return UserSync.class;
	}

	@Override
	public String getModelClassName() {
		return UserSync.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userSyncId", getUserSyncId());
		attributes.put("applicationId", getApplicationId());
		attributes.put("employeeId", getEmployeeId());
		attributes.put("userId", getUserId());
		attributes.put("accessible", getAccessible());
		attributes.put("checkpoint", getCheckpoint());
		attributes.put("syncTime", getSyncTime());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long userSyncId = (Long)attributes.get("userSyncId");

		if (userSyncId != null) {
			setUserSyncId(userSyncId);
		}

		Long applicationId = (Long)attributes.get("applicationId");

		if (applicationId != null) {
			setApplicationId(applicationId);
		}

		Long employeeId = (Long)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Integer accessible = (Integer)attributes.get("accessible");

		if (accessible != null) {
			setAccessible(accessible);
		}

		Date checkpoint = (Date)attributes.get("checkpoint");

		if (checkpoint != null) {
			setCheckpoint(checkpoint);
		}

		Date syncTime = (Date)attributes.get("syncTime");

		if (syncTime != null) {
			setSyncTime(syncTime);
		}
	}

	@JSON
	@Override
	public long getUserSyncId() {
		return _userSyncId;
	}

	@Override
	public void setUserSyncId(long userSyncId) {
		_userSyncId = userSyncId;
	}

	@JSON
	@Override
	public long getApplicationId() {
		return _applicationId;
	}

	@Override
	public void setApplicationId(long applicationId) {
		_applicationId = applicationId;
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
	public int getAccessible() {
		return _accessible;
	}

	@Override
	public void setAccessible(int accessible) {
		_accessible = accessible;
	}

	@JSON
	@Override
	public Date getCheckpoint() {
		return _checkpoint;
	}

	@Override
	public void setCheckpoint(Date checkpoint) {
		_checkpoint = checkpoint;
	}

	@JSON
	@Override
	public Date getSyncTime() {
		return _syncTime;
	}

	@Override
	public void setSyncTime(Date syncTime) {
		_syncTime = syncTime;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			UserSync.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public UserSync toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (UserSync)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		UserSyncImpl userSyncImpl = new UserSyncImpl();

		userSyncImpl.setUserSyncId(getUserSyncId());
		userSyncImpl.setApplicationId(getApplicationId());
		userSyncImpl.setEmployeeId(getEmployeeId());
		userSyncImpl.setUserId(getUserId());
		userSyncImpl.setAccessible(getAccessible());
		userSyncImpl.setCheckpoint(getCheckpoint());
		userSyncImpl.setSyncTime(getSyncTime());

		userSyncImpl.resetOriginalValues();

		return userSyncImpl;
	}

	@Override
	public int compareTo(UserSync userSync) {
		long primaryKey = userSync.getPrimaryKey();

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

		if (!(obj instanceof UserSync)) {
			return false;
		}

		UserSync userSync = (UserSync)obj;

		long primaryKey = userSync.getPrimaryKey();

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
	public CacheModel<UserSync> toCacheModel() {
		UserSyncCacheModel userSyncCacheModel = new UserSyncCacheModel();

		userSyncCacheModel.userSyncId = getUserSyncId();

		userSyncCacheModel.applicationId = getApplicationId();

		userSyncCacheModel.employeeId = getEmployeeId();

		userSyncCacheModel.userId = getUserId();

		userSyncCacheModel.accessible = getAccessible();

		Date checkpoint = getCheckpoint();

		if (checkpoint != null) {
			userSyncCacheModel.checkpoint = checkpoint.getTime();
		}
		else {
			userSyncCacheModel.checkpoint = Long.MIN_VALUE;
		}

		Date syncTime = getSyncTime();

		if (syncTime != null) {
			userSyncCacheModel.syncTime = syncTime.getTime();
		}
		else {
			userSyncCacheModel.syncTime = Long.MIN_VALUE;
		}

		return userSyncCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{userSyncId=");
		sb.append(getUserSyncId());
		sb.append(", applicationId=");
		sb.append(getApplicationId());
		sb.append(", employeeId=");
		sb.append(getEmployeeId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", accessible=");
		sb.append(getAccessible());
		sb.append(", checkpoint=");
		sb.append(getCheckpoint());
		sb.append(", syncTime=");
		sb.append(getSyncTime());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.ssomgt.model.UserSync");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>userSyncId</column-name><column-value><![CDATA[");
		sb.append(getUserSyncId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>applicationId</column-name><column-value><![CDATA[");
		sb.append(getApplicationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>accessible</column-name><column-value><![CDATA[");
		sb.append(getAccessible());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>checkpoint</column-name><column-value><![CDATA[");
		sb.append(getCheckpoint());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>syncTime</column-name><column-value><![CDATA[");
		sb.append(getSyncTime());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = UserSync.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			UserSync.class
		};
	private long _userSyncId;
	private long _applicationId;
	private long _employeeId;
	private long _userId;
	private String _userUuid;
	private int _accessible;
	private Date _checkpoint;
	private Date _syncTime;
	private UserSync _escapedModel;
}