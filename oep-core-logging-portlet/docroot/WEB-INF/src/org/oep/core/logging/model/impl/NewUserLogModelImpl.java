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

package org.oep.core.logging.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
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

import org.oep.core.logging.model.NewUserLog;
import org.oep.core.logging.model.NewUserLogModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the NewUserLog service. Represents a row in the &quot;oep_logging_newuserlog&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.core.logging.model.NewUserLogModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link NewUserLogImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NewUserLogImpl
 * @see org.oep.core.logging.model.NewUserLog
 * @see org.oep.core.logging.model.NewUserLogModel
 * @generated
 */
public class NewUserLogModelImpl extends BaseModelImpl<NewUserLog>
	implements NewUserLogModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a new user log model instance should use the {@link org.oep.core.logging.model.NewUserLog} interface instead.
	 */
	public static final String TABLE_NAME = "oep_logging_newuserlog";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "useractivityid", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "userName", Types.VARCHAR },
			{ "email", Types.VARCHAR },
			{ "site", Types.VARCHAR },
			{ "page", Types.VARCHAR },
			{ "action", Types.VARCHAR },
			{ "description", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table oep_logging_newuserlog (id LONG not null primary key,useractivityid LONG,userId LONG,groupId LONG,companyId LONG,createDate DATE null,userName VARCHAR(100) null,email VARCHAR(100) null,site VARCHAR(200) null,page VARCHAR(200) null,action VARCHAR(30) null,description VARCHAR(1000) null)";
	public static final String TABLE_SQL_DROP = "drop table oep_logging_newuserlog";
	public static final String ORDER_BY_JPQL = " ORDER BY newUserLog.createDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY oep_logging_newuserlog.createDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.core.logging.model.NewUserLog"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.core.logging.model.NewUserLog"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.oep.core.logging.model.NewUserLog"),
			true);
	public static long CREATEDATE_COLUMN_BITMASK = 1L;
	public static long EMAIL_COLUMN_BITMASK = 2L;
	public static long USERACTIVITYID_COLUMN_BITMASK = 4L;
	public static long USERID_COLUMN_BITMASK = 8L;
	public static long USERNAME_COLUMN_BITMASK = 16L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.core.logging.model.NewUserLog"));

	public NewUserLogModelImpl() {
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
	public Class<?> getModelClass() {
		return NewUserLog.class;
	}

	@Override
	public String getModelClassName() {
		return NewUserLog.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("userActivityId", getUserActivityId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("userName", getUserName());
		attributes.put("email", getEmail());
		attributes.put("site", getSite());
		attributes.put("page", getPage());
		attributes.put("action", getAction());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long userActivityId = (Long)attributes.get("userActivityId");

		if (userActivityId != null) {
			setUserActivityId(userActivityId);
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

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String site = (String)attributes.get("site");

		if (site != null) {
			setSite(site);
		}

		String page = (String)attributes.get("page");

		if (page != null) {
			setPage(page);
		}

		String action = (String)attributes.get("action");

		if (action != null) {
			setAction(action);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;
	}

	@Override
	public long getUserActivityId() {
		return _userActivityId;
	}

	@Override
	public void setUserActivityId(long userActivityId) {
		_columnBitmask |= USERACTIVITYID_COLUMN_BITMASK;

		if (!_setOriginalUserActivityId) {
			_setOriginalUserActivityId = true;

			_originalUserActivityId = _userActivityId;
		}

		_userActivityId = userActivityId;
	}

	public long getOriginalUserActivityId() {
		return _originalUserActivityId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

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

	public long getOriginalUserId() {
		return _originalUserId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_columnBitmask = -1L;

		if (_originalCreateDate == null) {
			_originalCreateDate = _createDate;
		}

		_createDate = createDate;
	}

	public Date getOriginalCreateDate() {
		return _originalCreateDate;
	}

	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_columnBitmask |= USERNAME_COLUMN_BITMASK;

		if (_originalUserName == null) {
			_originalUserName = _userName;
		}

		_userName = userName;
	}

	public String getOriginalUserName() {
		return GetterUtil.getString(_originalUserName);
	}

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
		_columnBitmask |= EMAIL_COLUMN_BITMASK;

		if (_originalEmail == null) {
			_originalEmail = _email;
		}

		_email = email;
	}

	public String getOriginalEmail() {
		return GetterUtil.getString(_originalEmail);
	}

	@Override
	public String getSite() {
		if (_site == null) {
			return StringPool.BLANK;
		}
		else {
			return _site;
		}
	}

	@Override
	public void setSite(String site) {
		_site = site;
	}

	@Override
	public String getPage() {
		if (_page == null) {
			return StringPool.BLANK;
		}
		else {
			return _page;
		}
	}

	@Override
	public void setPage(String page) {
		_page = page;
	}

	@Override
	public String getAction() {
		if (_action == null) {
			return StringPool.BLANK;
		}
		else {
			return _action;
		}
	}

	@Override
	public void setAction(String action) {
		_action = action;
	}

	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			NewUserLog.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public NewUserLog toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (NewUserLog)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		NewUserLogImpl newUserLogImpl = new NewUserLogImpl();

		newUserLogImpl.setId(getId());
		newUserLogImpl.setUserActivityId(getUserActivityId());
		newUserLogImpl.setUserId(getUserId());
		newUserLogImpl.setGroupId(getGroupId());
		newUserLogImpl.setCompanyId(getCompanyId());
		newUserLogImpl.setCreateDate(getCreateDate());
		newUserLogImpl.setUserName(getUserName());
		newUserLogImpl.setEmail(getEmail());
		newUserLogImpl.setSite(getSite());
		newUserLogImpl.setPage(getPage());
		newUserLogImpl.setAction(getAction());
		newUserLogImpl.setDescription(getDescription());

		newUserLogImpl.resetOriginalValues();

		return newUserLogImpl;
	}

	@Override
	public int compareTo(NewUserLog newUserLog) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), newUserLog.getCreateDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NewUserLog)) {
			return false;
		}

		NewUserLog newUserLog = (NewUserLog)obj;

		long primaryKey = newUserLog.getPrimaryKey();

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
		NewUserLogModelImpl newUserLogModelImpl = this;

		newUserLogModelImpl._originalUserActivityId = newUserLogModelImpl._userActivityId;

		newUserLogModelImpl._setOriginalUserActivityId = false;

		newUserLogModelImpl._originalUserId = newUserLogModelImpl._userId;

		newUserLogModelImpl._setOriginalUserId = false;

		newUserLogModelImpl._originalCreateDate = newUserLogModelImpl._createDate;

		newUserLogModelImpl._originalUserName = newUserLogModelImpl._userName;

		newUserLogModelImpl._originalEmail = newUserLogModelImpl._email;

		newUserLogModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<NewUserLog> toCacheModel() {
		NewUserLogCacheModel newUserLogCacheModel = new NewUserLogCacheModel();

		newUserLogCacheModel.id = getId();

		newUserLogCacheModel.userActivityId = getUserActivityId();

		newUserLogCacheModel.userId = getUserId();

		newUserLogCacheModel.groupId = getGroupId();

		newUserLogCacheModel.companyId = getCompanyId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			newUserLogCacheModel.createDate = createDate.getTime();
		}
		else {
			newUserLogCacheModel.createDate = Long.MIN_VALUE;
		}

		newUserLogCacheModel.userName = getUserName();

		String userName = newUserLogCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			newUserLogCacheModel.userName = null;
		}

		newUserLogCacheModel.email = getEmail();

		String email = newUserLogCacheModel.email;

		if ((email != null) && (email.length() == 0)) {
			newUserLogCacheModel.email = null;
		}

		newUserLogCacheModel.site = getSite();

		String site = newUserLogCacheModel.site;

		if ((site != null) && (site.length() == 0)) {
			newUserLogCacheModel.site = null;
		}

		newUserLogCacheModel.page = getPage();

		String page = newUserLogCacheModel.page;

		if ((page != null) && (page.length() == 0)) {
			newUserLogCacheModel.page = null;
		}

		newUserLogCacheModel.action = getAction();

		String action = newUserLogCacheModel.action;

		if ((action != null) && (action.length() == 0)) {
			newUserLogCacheModel.action = null;
		}

		newUserLogCacheModel.description = getDescription();

		String description = newUserLogCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			newUserLogCacheModel.description = null;
		}

		return newUserLogCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", userActivityId=");
		sb.append(getUserActivityId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", site=");
		sb.append(getSite());
		sb.append(", page=");
		sb.append(getPage());
		sb.append(", action=");
		sb.append(getAction());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.logging.model.NewUserLog");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userActivityId</column-name><column-value><![CDATA[");
		sb.append(getUserActivityId());
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
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>site</column-name><column-value><![CDATA[");
		sb.append(getSite());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>page</column-name><column-value><![CDATA[");
		sb.append(getPage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>action</column-name><column-value><![CDATA[");
		sb.append(getAction());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = NewUserLog.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			NewUserLog.class
		};
	private long _id;
	private long _userActivityId;
	private long _originalUserActivityId;
	private boolean _setOriginalUserActivityId;
	private long _userId;
	private String _userUuid;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _originalCreateDate;
	private String _userName;
	private String _originalUserName;
	private String _email;
	private String _originalEmail;
	private String _site;
	private String _page;
	private String _action;
	private String _description;
	private long _columnBitmask;
	private NewUserLog _escapedModel;
}