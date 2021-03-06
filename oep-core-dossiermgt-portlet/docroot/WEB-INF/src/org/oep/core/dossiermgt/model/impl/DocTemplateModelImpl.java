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

import org.oep.core.dossiermgt.model.DocTemplate;
import org.oep.core.dossiermgt.model.DocTemplateModel;
import org.oep.core.dossiermgt.model.DocTemplateSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the DocTemplate service. Represents a row in the &quot;oep_dossiermgt_doctemplate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.core.dossiermgt.model.DocTemplateModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DocTemplateImpl}.
 * </p>
 *
 * @author trungdk
 * @see DocTemplateImpl
 * @see org.oep.core.dossiermgt.model.DocTemplate
 * @see org.oep.core.dossiermgt.model.DocTemplateModel
 * @generated
 */
@JSON(strict = true)
public class DocTemplateModelImpl extends BaseModelImpl<DocTemplate>
	implements DocTemplateModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a doc template model instance should use the {@link org.oep.core.dossiermgt.model.DocTemplate} interface instead.
	 */
	public static final String TABLE_NAME = "oep_dossiermgt_doctemplate";
	public static final Object[][] TABLE_COLUMNS = {
			{ "docTemplateId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "templateNo", Types.VARCHAR },
			{ "title", Types.VARCHAR },
			{ "enTitle", Types.VARCHAR },
			{ "fileEntryId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table oep_dossiermgt_doctemplate (docTemplateId LONG not null primary key,userId LONG,groupId LONG,companyId LONG,createDate DATE null,modifiedDate DATE null,templateNo VARCHAR(30) null,title VARCHAR(255) null,enTitle VARCHAR(255) null,fileEntryId LONG)";
	public static final String TABLE_SQL_DROP = "drop table oep_dossiermgt_doctemplate";
	public static final String ORDER_BY_JPQL = " ORDER BY docTemplate.docTemplateId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY oep_dossiermgt_doctemplate.docTemplateId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.core.dossiermgt.model.DocTemplate"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.core.dossiermgt.model.DocTemplate"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.oep.core.dossiermgt.model.DocTemplate"),
			true);
	public static long COMPANYID_COLUMN_BITMASK = 1L;
	public static long GROUPID_COLUMN_BITMASK = 2L;
	public static long TEMPLATENO_COLUMN_BITMASK = 4L;
	public static long DOCTEMPLATEID_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static DocTemplate toModel(DocTemplateSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		DocTemplate model = new DocTemplateImpl();

		model.setDocTemplateId(soapModel.getDocTemplateId());
		model.setUserId(soapModel.getUserId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setTemplateNo(soapModel.getTemplateNo());
		model.setTitle(soapModel.getTitle());
		model.setEnTitle(soapModel.getEnTitle());
		model.setFileEntryId(soapModel.getFileEntryId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<DocTemplate> toModels(DocTemplateSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<DocTemplate> models = new ArrayList<DocTemplate>(soapModels.length);

		for (DocTemplateSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final String MAPPING_TABLE_OEP_DOSSIERMGT_DOSSIERDOC2TEMPLATE_NAME =
		"oep_dossiermgt_dossierdoc2template";
	public static final Object[][] MAPPING_TABLE_OEP_DOSSIERMGT_DOSSIERDOC2TEMPLATE_COLUMNS =
		{
			{ "docTemplateId", Types.BIGINT },
			{ "dossierDocId", Types.BIGINT }
		};
	public static final String MAPPING_TABLE_OEP_DOSSIERMGT_DOSSIERDOC2TEMPLATE_SQL_CREATE =
		"create table oep_dossiermgt_dossierdoc2template (docTemplateId LONG not null,dossierDocId LONG not null,primary key (docTemplateId, dossierDocId))";
	public static final boolean FINDER_CACHE_ENABLED_OEP_DOSSIERMGT_DOSSIERDOC2TEMPLATE =
		GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.oep_dossiermgt_dossierdoc2template"),
			true);
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.core.dossiermgt.model.DocTemplate"));

	public DocTemplateModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _docTemplateId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDocTemplateId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _docTemplateId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return DocTemplate.class;
	}

	@Override
	public String getModelClassName() {
		return DocTemplate.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("docTemplateId", getDocTemplateId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("templateNo", getTemplateNo());
		attributes.put("title", getTitle());
		attributes.put("enTitle", getEnTitle());
		attributes.put("fileEntryId", getFileEntryId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long docTemplateId = (Long)attributes.get("docTemplateId");

		if (docTemplateId != null) {
			setDocTemplateId(docTemplateId);
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

		String templateNo = (String)attributes.get("templateNo");

		if (templateNo != null) {
			setTemplateNo(templateNo);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String enTitle = (String)attributes.get("enTitle");

		if (enTitle != null) {
			setEnTitle(enTitle);
		}

		Long fileEntryId = (Long)attributes.get("fileEntryId");

		if (fileEntryId != null) {
			setFileEntryId(fileEntryId);
		}
	}

	@JSON
	@Override
	public long getDocTemplateId() {
		return _docTemplateId;
	}

	@Override
	public void setDocTemplateId(long docTemplateId) {
		_docTemplateId = docTemplateId;
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
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getTemplateNo() {
		if (_templateNo == null) {
			return StringPool.BLANK;
		}
		else {
			return _templateNo;
		}
	}

	@Override
	public void setTemplateNo(String templateNo) {
		_columnBitmask |= TEMPLATENO_COLUMN_BITMASK;

		if (_originalTemplateNo == null) {
			_originalTemplateNo = _templateNo;
		}

		_templateNo = templateNo;
	}

	public String getOriginalTemplateNo() {
		return GetterUtil.getString(_originalTemplateNo);
	}

	@JSON
	@Override
	public String getTitle() {
		if (_title == null) {
			return StringPool.BLANK;
		}
		else {
			return _title;
		}
	}

	@Override
	public void setTitle(String title) {
		_title = title;
	}

	@JSON
	@Override
	public String getEnTitle() {
		if (_enTitle == null) {
			return StringPool.BLANK;
		}
		else {
			return _enTitle;
		}
	}

	@Override
	public void setEnTitle(String enTitle) {
		_enTitle = enTitle;
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

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			DocTemplate.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public DocTemplate toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DocTemplate)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DocTemplateImpl docTemplateImpl = new DocTemplateImpl();

		docTemplateImpl.setDocTemplateId(getDocTemplateId());
		docTemplateImpl.setUserId(getUserId());
		docTemplateImpl.setGroupId(getGroupId());
		docTemplateImpl.setCompanyId(getCompanyId());
		docTemplateImpl.setCreateDate(getCreateDate());
		docTemplateImpl.setModifiedDate(getModifiedDate());
		docTemplateImpl.setTemplateNo(getTemplateNo());
		docTemplateImpl.setTitle(getTitle());
		docTemplateImpl.setEnTitle(getEnTitle());
		docTemplateImpl.setFileEntryId(getFileEntryId());

		docTemplateImpl.resetOriginalValues();

		return docTemplateImpl;
	}

	@Override
	public int compareTo(DocTemplate docTemplate) {
		long primaryKey = docTemplate.getPrimaryKey();

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

		if (!(obj instanceof DocTemplate)) {
			return false;
		}

		DocTemplate docTemplate = (DocTemplate)obj;

		long primaryKey = docTemplate.getPrimaryKey();

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
		DocTemplateModelImpl docTemplateModelImpl = this;

		docTemplateModelImpl._originalGroupId = docTemplateModelImpl._groupId;

		docTemplateModelImpl._setOriginalGroupId = false;

		docTemplateModelImpl._originalCompanyId = docTemplateModelImpl._companyId;

		docTemplateModelImpl._setOriginalCompanyId = false;

		docTemplateModelImpl._originalTemplateNo = docTemplateModelImpl._templateNo;

		docTemplateModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DocTemplate> toCacheModel() {
		DocTemplateCacheModel docTemplateCacheModel = new DocTemplateCacheModel();

		docTemplateCacheModel.docTemplateId = getDocTemplateId();

		docTemplateCacheModel.userId = getUserId();

		docTemplateCacheModel.groupId = getGroupId();

		docTemplateCacheModel.companyId = getCompanyId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			docTemplateCacheModel.createDate = createDate.getTime();
		}
		else {
			docTemplateCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			docTemplateCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			docTemplateCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		docTemplateCacheModel.templateNo = getTemplateNo();

		String templateNo = docTemplateCacheModel.templateNo;

		if ((templateNo != null) && (templateNo.length() == 0)) {
			docTemplateCacheModel.templateNo = null;
		}

		docTemplateCacheModel.title = getTitle();

		String title = docTemplateCacheModel.title;

		if ((title != null) && (title.length() == 0)) {
			docTemplateCacheModel.title = null;
		}

		docTemplateCacheModel.enTitle = getEnTitle();

		String enTitle = docTemplateCacheModel.enTitle;

		if ((enTitle != null) && (enTitle.length() == 0)) {
			docTemplateCacheModel.enTitle = null;
		}

		docTemplateCacheModel.fileEntryId = getFileEntryId();

		return docTemplateCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{docTemplateId=");
		sb.append(getDocTemplateId());
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
		sb.append(", templateNo=");
		sb.append(getTemplateNo());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", enTitle=");
		sb.append(getEnTitle());
		sb.append(", fileEntryId=");
		sb.append(getFileEntryId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.dossiermgt.model.DocTemplate");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>docTemplateId</column-name><column-value><![CDATA[");
		sb.append(getDocTemplateId());
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
			"<column><column-name>templateNo</column-name><column-value><![CDATA[");
		sb.append(getTemplateNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enTitle</column-name><column-value><![CDATA[");
		sb.append(getEnTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileEntryId</column-name><column-value><![CDATA[");
		sb.append(getFileEntryId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DocTemplate.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DocTemplate.class
		};
	private long _docTemplateId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _templateNo;
	private String _originalTemplateNo;
	private String _title;
	private String _enTitle;
	private long _fileEntryId;
	private long _columnBitmask;
	private DocTemplate _escapedModel;
}