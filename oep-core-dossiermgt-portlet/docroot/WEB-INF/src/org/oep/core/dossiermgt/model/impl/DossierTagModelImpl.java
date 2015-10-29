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

package org.oep.core.dossiermgt.model.impl;

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

import org.oep.core.dossiermgt.model.DossierTag;
import org.oep.core.dossiermgt.model.DossierTagModel;
import org.oep.core.dossiermgt.model.DossierTagSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the DossierTag service. Represents a row in the &quot;oep_dossiermgt_dossiertag&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.core.dossiermgt.model.DossierTagModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DossierTagImpl}.
 * </p>
 *
 * @author trungdk
 * @see DossierTagImpl
 * @see org.oep.core.dossiermgt.model.DossierTag
 * @see org.oep.core.dossiermgt.model.DossierTagModel
 * @generated
 */
@JSON(strict = true)
public class DossierTagModelImpl extends BaseModelImpl<DossierTag>
	implements DossierTagModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dossier tag model instance should use the {@link org.oep.core.dossiermgt.model.DossierTag} interface instead.
	 */
	public static final String TABLE_NAME = "oep_dossiermgt_dossiertag";
	public static final Object[][] TABLE_COLUMNS = {
			{ "dossierTagId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "dossierId", Types.BIGINT },
			{ "tag", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table oep_dossiermgt_dossiertag (dossierTagId LONG not null primary key,userId LONG,groupId LONG,companyId LONG,createDate DATE null,dossierId LONG,tag VARCHAR(100) null)";
	public static final String TABLE_SQL_DROP = "drop table oep_dossiermgt_dossiertag";
	public static final String ORDER_BY_JPQL = " ORDER BY dossierTag.dossierTagId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY oep_dossiermgt_dossiertag.dossierTagId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.core.dossiermgt.model.DossierTag"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.core.dossiermgt.model.DossierTag"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static DossierTag toModel(DossierTagSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		DossierTag model = new DossierTagImpl();

		model.setDossierTagId(soapModel.getDossierTagId());
		model.setUserId(soapModel.getUserId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setDossierId(soapModel.getDossierId());
		model.setTag(soapModel.getTag());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<DossierTag> toModels(DossierTagSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<DossierTag> models = new ArrayList<DossierTag>(soapModels.length);

		for (DossierTagSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.core.dossiermgt.model.DossierTag"));

	public DossierTagModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _dossierTagId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDossierTagId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dossierTagId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return DossierTag.class;
	}

	@Override
	public String getModelClassName() {
		return DossierTag.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dossierTagId", getDossierTagId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("dossierId", getDossierId());
		attributes.put("tag", getTag());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dossierTagId = (Long)attributes.get("dossierTagId");

		if (dossierTagId != null) {
			setDossierTagId(dossierTagId);
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

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		String tag = (String)attributes.get("tag");

		if (tag != null) {
			setTag(tag);
		}
	}

	@JSON
	@Override
	public long getDossierTagId() {
		return _dossierTagId;
	}

	@Override
	public void setDossierTagId(long dossierTagId) {
		_dossierTagId = dossierTagId;
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
	public long getDossierId() {
		return _dossierId;
	}

	@Override
	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
	}

	@JSON
	@Override
	public String getTag() {
		if (_tag == null) {
			return StringPool.BLANK;
		}
		else {
			return _tag;
		}
	}

	@Override
	public void setTag(String tag) {
		_tag = tag;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			DossierTag.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public DossierTag toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DossierTag)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DossierTagImpl dossierTagImpl = new DossierTagImpl();

		dossierTagImpl.setDossierTagId(getDossierTagId());
		dossierTagImpl.setUserId(getUserId());
		dossierTagImpl.setGroupId(getGroupId());
		dossierTagImpl.setCompanyId(getCompanyId());
		dossierTagImpl.setCreateDate(getCreateDate());
		dossierTagImpl.setDossierId(getDossierId());
		dossierTagImpl.setTag(getTag());

		dossierTagImpl.resetOriginalValues();

		return dossierTagImpl;
	}

	@Override
	public int compareTo(DossierTag dossierTag) {
		long primaryKey = dossierTag.getPrimaryKey();

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

		if (!(obj instanceof DossierTag)) {
			return false;
		}

		DossierTag dossierTag = (DossierTag)obj;

		long primaryKey = dossierTag.getPrimaryKey();

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
	public CacheModel<DossierTag> toCacheModel() {
		DossierTagCacheModel dossierTagCacheModel = new DossierTagCacheModel();

		dossierTagCacheModel.dossierTagId = getDossierTagId();

		dossierTagCacheModel.userId = getUserId();

		dossierTagCacheModel.groupId = getGroupId();

		dossierTagCacheModel.companyId = getCompanyId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			dossierTagCacheModel.createDate = createDate.getTime();
		}
		else {
			dossierTagCacheModel.createDate = Long.MIN_VALUE;
		}

		dossierTagCacheModel.dossierId = getDossierId();

		dossierTagCacheModel.tag = getTag();

		String tag = dossierTagCacheModel.tag;

		if ((tag != null) && (tag.length() == 0)) {
			dossierTagCacheModel.tag = null;
		}

		return dossierTagCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{dossierTagId=");
		sb.append(getDossierTagId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", dossierId=");
		sb.append(getDossierId());
		sb.append(", tag=");
		sb.append(getTag());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.dossiermgt.model.DossierTag");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>dossierTagId</column-name><column-value><![CDATA[");
		sb.append(getDossierTagId());
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
			"<column><column-name>dossierId</column-name><column-value><![CDATA[");
		sb.append(getDossierId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tag</column-name><column-value><![CDATA[");
		sb.append(getTag());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DossierTag.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DossierTag.class
		};
	private long _dossierTagId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private long _dossierId;
	private String _tag;
	private DossierTag _escapedModel;
}