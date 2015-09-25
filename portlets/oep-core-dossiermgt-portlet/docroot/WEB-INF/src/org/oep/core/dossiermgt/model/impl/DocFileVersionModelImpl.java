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

import org.oep.core.dossiermgt.model.DocFileVersion;
import org.oep.core.dossiermgt.model.DocFileVersionModel;
import org.oep.core.dossiermgt.model.DocFileVersionSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the DocFileVersion service. Represents a row in the &quot;oep_dossiermgt_DocFileVersion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.core.dossiermgt.model.DocFileVersionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DocFileVersionImpl}.
 * </p>
 *
 * @author trungdk
 * @see DocFileVersionImpl
 * @see org.oep.core.dossiermgt.model.DocFileVersion
 * @see org.oep.core.dossiermgt.model.DocFileVersionModel
 * @generated
 */
@JSON(strict = true)
public class DocFileVersionModelImpl extends BaseModelImpl<DocFileVersion>
	implements DocFileVersionModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a doc file version model instance should use the {@link org.oep.core.dossiermgt.model.DocFileVersion} interface instead.
	 */
	public static final String TABLE_NAME = "oep_dossiermgt_DocFileVersion";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "docFileVersionId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "docFileId", Types.BIGINT },
			{ "fileEntryId", Types.BIGINT },
			{ "xmlContent", Types.VARCHAR },
			{ "issueDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table oep_dossiermgt_DocFileVersion (uuid_ VARCHAR(75) null,docFileVersionId LONG not null primary key,userId LONG,groupId LONG,companyId LONG,createDate DATE null,docFileId LONG,fileEntryId LONG,xmlContent VARCHAR(75) null,issueDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table oep_dossiermgt_DocFileVersion";
	public static final String ORDER_BY_JPQL = " ORDER BY docFileVersion.docFileVersionId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY oep_dossiermgt_DocFileVersion.docFileVersionId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.core.dossiermgt.model.DocFileVersion"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.core.dossiermgt.model.DocFileVersion"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.oep.core.dossiermgt.model.DocFileVersion"),
			true);
	public static long COMPANYID_COLUMN_BITMASK = 1L;
	public static long GROUPID_COLUMN_BITMASK = 2L;
	public static long UUID_COLUMN_BITMASK = 4L;
	public static long DOCFILEVERSIONID_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static DocFileVersion toModel(DocFileVersionSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		DocFileVersion model = new DocFileVersionImpl();

		model.setUuid(soapModel.getUuid());
		model.setDocFileVersionId(soapModel.getDocFileVersionId());
		model.setUserId(soapModel.getUserId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setDocFileId(soapModel.getDocFileId());
		model.setFileEntryId(soapModel.getFileEntryId());
		model.setXmlContent(soapModel.getXmlContent());
		model.setIssueDate(soapModel.getIssueDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<DocFileVersion> toModels(DocFileVersionSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<DocFileVersion> models = new ArrayList<DocFileVersion>(soapModels.length);

		for (DocFileVersionSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.core.dossiermgt.model.DocFileVersion"));

	public DocFileVersionModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _docFileVersionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDocFileVersionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _docFileVersionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return DocFileVersion.class;
	}

	@Override
	public String getModelClassName() {
		return DocFileVersion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("docFileVersionId", getDocFileVersionId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("docFileId", getDocFileId());
		attributes.put("fileEntryId", getFileEntryId());
		attributes.put("xmlContent", getXmlContent());
		attributes.put("issueDate", getIssueDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long docFileVersionId = (Long)attributes.get("docFileVersionId");

		if (docFileVersionId != null) {
			setDocFileVersionId(docFileVersionId);
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

		Long docFileId = (Long)attributes.get("docFileId");

		if (docFileId != null) {
			setDocFileId(docFileId);
		}

		Long fileEntryId = (Long)attributes.get("fileEntryId");

		if (fileEntryId != null) {
			setFileEntryId(fileEntryId);
		}

		String xmlContent = (String)attributes.get("xmlContent");

		if (xmlContent != null) {
			setXmlContent(xmlContent);
		}

		Date issueDate = (Date)attributes.get("issueDate");

		if (issueDate != null) {
			setIssueDate(issueDate);
		}
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getDocFileVersionId() {
		return _docFileVersionId;
	}

	@Override
	public void setDocFileVersionId(long docFileVersionId) {
		_docFileVersionId = docFileVersionId;
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
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
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
	public long getDocFileId() {
		return _docFileId;
	}

	@Override
	public void setDocFileId(long docFileId) {
		_docFileId = docFileId;
	}

	@JSON
	@Override
	public long getFileEntryId() {
		return _fileEntryId;
	}

	@Override
	public void setFileEntryId(long fileEntryId) {
		_fileEntryId = fileEntryId;
	}

	@JSON
	@Override
	public String getXmlContent() {
		if (_xmlContent == null) {
			return StringPool.BLANK;
		}
		else {
			return _xmlContent;
		}
	}

	@Override
	public void setXmlContent(String xmlContent) {
		_xmlContent = xmlContent;
	}

	@JSON
	@Override
	public Date getIssueDate() {
		return _issueDate;
	}

	@Override
	public void setIssueDate(Date issueDate) {
		_issueDate = issueDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			DocFileVersion.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public DocFileVersion toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DocFileVersion)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DocFileVersionImpl docFileVersionImpl = new DocFileVersionImpl();

		docFileVersionImpl.setUuid(getUuid());
		docFileVersionImpl.setDocFileVersionId(getDocFileVersionId());
		docFileVersionImpl.setUserId(getUserId());
		docFileVersionImpl.setGroupId(getGroupId());
		docFileVersionImpl.setCompanyId(getCompanyId());
		docFileVersionImpl.setCreateDate(getCreateDate());
		docFileVersionImpl.setDocFileId(getDocFileId());
		docFileVersionImpl.setFileEntryId(getFileEntryId());
		docFileVersionImpl.setXmlContent(getXmlContent());
		docFileVersionImpl.setIssueDate(getIssueDate());

		docFileVersionImpl.resetOriginalValues();

		return docFileVersionImpl;
	}

	@Override
	public int compareTo(DocFileVersion docFileVersion) {
		long primaryKey = docFileVersion.getPrimaryKey();

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

		if (!(obj instanceof DocFileVersion)) {
			return false;
		}

		DocFileVersion docFileVersion = (DocFileVersion)obj;

		long primaryKey = docFileVersion.getPrimaryKey();

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
		DocFileVersionModelImpl docFileVersionModelImpl = this;

		docFileVersionModelImpl._originalUuid = docFileVersionModelImpl._uuid;

		docFileVersionModelImpl._originalGroupId = docFileVersionModelImpl._groupId;

		docFileVersionModelImpl._setOriginalGroupId = false;

		docFileVersionModelImpl._originalCompanyId = docFileVersionModelImpl._companyId;

		docFileVersionModelImpl._setOriginalCompanyId = false;

		docFileVersionModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DocFileVersion> toCacheModel() {
		DocFileVersionCacheModel docFileVersionCacheModel = new DocFileVersionCacheModel();

		docFileVersionCacheModel.uuid = getUuid();

		String uuid = docFileVersionCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			docFileVersionCacheModel.uuid = null;
		}

		docFileVersionCacheModel.docFileVersionId = getDocFileVersionId();

		docFileVersionCacheModel.userId = getUserId();

		docFileVersionCacheModel.groupId = getGroupId();

		docFileVersionCacheModel.companyId = getCompanyId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			docFileVersionCacheModel.createDate = createDate.getTime();
		}
		else {
			docFileVersionCacheModel.createDate = Long.MIN_VALUE;
		}

		docFileVersionCacheModel.docFileId = getDocFileId();

		docFileVersionCacheModel.fileEntryId = getFileEntryId();

		docFileVersionCacheModel.xmlContent = getXmlContent();

		String xmlContent = docFileVersionCacheModel.xmlContent;

		if ((xmlContent != null) && (xmlContent.length() == 0)) {
			docFileVersionCacheModel.xmlContent = null;
		}

		Date issueDate = getIssueDate();

		if (issueDate != null) {
			docFileVersionCacheModel.issueDate = issueDate.getTime();
		}
		else {
			docFileVersionCacheModel.issueDate = Long.MIN_VALUE;
		}

		return docFileVersionCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", docFileVersionId=");
		sb.append(getDocFileVersionId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", docFileId=");
		sb.append(getDocFileId());
		sb.append(", fileEntryId=");
		sb.append(getFileEntryId());
		sb.append(", xmlContent=");
		sb.append(getXmlContent());
		sb.append(", issueDate=");
		sb.append(getIssueDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.dossiermgt.model.DocFileVersion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>docFileVersionId</column-name><column-value><![CDATA[");
		sb.append(getDocFileVersionId());
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
			"<column><column-name>docFileId</column-name><column-value><![CDATA[");
		sb.append(getDocFileId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileEntryId</column-name><column-value><![CDATA[");
		sb.append(getFileEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>xmlContent</column-name><column-value><![CDATA[");
		sb.append(getXmlContent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>issueDate</column-name><column-value><![CDATA[");
		sb.append(getIssueDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DocFileVersion.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DocFileVersion.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _docFileVersionId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private Date _createDate;
	private long _docFileId;
	private long _fileEntryId;
	private String _xmlContent;
	private Date _issueDate;
	private long _columnBitmask;
	private DocFileVersion _escapedModel;
}