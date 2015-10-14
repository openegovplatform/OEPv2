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
import com.liferay.portal.kernel.lar.StagedModelType;
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

import org.oep.core.dossiermgt.model.DocFile;
import org.oep.core.dossiermgt.model.DocFileModel;
import org.oep.core.dossiermgt.model.DocFileSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the DocFile service. Represents a row in the &quot;oep_dossiermgt_docfile&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.core.dossiermgt.model.DocFileModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DocFileImpl}.
 * </p>
 *
 * @author trungdk
 * @see DocFileImpl
 * @see org.oep.core.dossiermgt.model.DocFile
 * @see org.oep.core.dossiermgt.model.DocFileModel
 * @generated
 */
@JSON(strict = true)
public class DocFileModelImpl extends BaseModelImpl<DocFile>
	implements DocFileModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a doc file model instance should use the {@link org.oep.core.dossiermgt.model.DocFile} interface instead.
	 */
	public static final String TABLE_NAME = "oep_dossiermgt_docfile";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "docFileId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "dossierId", Types.BIGINT },
			{ "dossierDocId", Types.BIGINT },
			{ "docTemplateId", Types.BIGINT },
			{ "docFileVersionId", Types.BIGINT },
			{ "docName", Types.VARCHAR },
			{ "note", Types.VARCHAR },
			{ "premier", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table oep_dossiermgt_docfile (uuid_ VARCHAR(75) null,docFileId LONG not null primary key,userId LONG,groupId LONG,companyId LONG,createDate DATE null,modifiedDate DATE null,dossierId LONG,dossierDocId LONG,docTemplateId LONG,docFileVersionId LONG,docName VARCHAR(200) null,note VARCHAR(200) null,premier INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table oep_dossiermgt_docfile";
	public static final String ORDER_BY_JPQL = " ORDER BY docFile.docFileId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY oep_dossiermgt_docfile.docFileId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.core.dossiermgt.model.DocFile"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.core.dossiermgt.model.DocFile"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.oep.core.dossiermgt.model.DocFile"),
			true);
	public static long COMPANYID_COLUMN_BITMASK = 1L;
	public static long GROUPID_COLUMN_BITMASK = 2L;
	public static long UUID_COLUMN_BITMASK = 4L;
	public static long DOCFILEID_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static DocFile toModel(DocFileSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		DocFile model = new DocFileImpl();

		model.setUuid(soapModel.getUuid());
		model.setDocFileId(soapModel.getDocFileId());
		model.setUserId(soapModel.getUserId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setDossierId(soapModel.getDossierId());
		model.setDossierDocId(soapModel.getDossierDocId());
		model.setDocTemplateId(soapModel.getDocTemplateId());
		model.setDocFileVersionId(soapModel.getDocFileVersionId());
		model.setDocName(soapModel.getDocName());
		model.setNote(soapModel.getNote());
		model.setPremier(soapModel.getPremier());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<DocFile> toModels(DocFileSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<DocFile> models = new ArrayList<DocFile>(soapModels.length);

		for (DocFileSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.core.dossiermgt.model.DocFile"));

	public DocFileModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _docFileId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDocFileId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _docFileId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return DocFile.class;
	}

	@Override
	public String getModelClassName() {
		return DocFile.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("docFileId", getDocFileId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dossierId", getDossierId());
		attributes.put("dossierDocId", getDossierDocId());
		attributes.put("docTemplateId", getDocTemplateId());
		attributes.put("docFileVersionId", getDocFileVersionId());
		attributes.put("docName", getDocName());
		attributes.put("note", getNote());
		attributes.put("premier", getPremier());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long docFileId = (Long)attributes.get("docFileId");

		if (docFileId != null) {
			setDocFileId(docFileId);
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

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		Long dossierDocId = (Long)attributes.get("dossierDocId");

		if (dossierDocId != null) {
			setDossierDocId(dossierDocId);
		}

		Long docTemplateId = (Long)attributes.get("docTemplateId");

		if (docTemplateId != null) {
			setDocTemplateId(docTemplateId);
		}

		Long docFileVersionId = (Long)attributes.get("docFileVersionId");

		if (docFileVersionId != null) {
			setDocFileVersionId(docFileVersionId);
		}

		String docName = (String)attributes.get("docName");

		if (docName != null) {
			setDocName(docName);
		}

		String note = (String)attributes.get("note");

		if (note != null) {
			setNote(note);
		}

		Integer premier = (Integer)attributes.get("premier");

		if (premier != null) {
			setPremier(premier);
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
	public long getDocFileId() {
		return _docFileId;
	}

	@Override
	public void setDocFileId(long docFileId) {
		_docFileId = docFileId;
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
	public long getDossierId() {
		return _dossierId;
	}

	@Override
	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
	}

	@JSON
	@Override
	public long getDossierDocId() {
		return _dossierDocId;
	}

	@Override
	public void setDossierDocId(long dossierDocId) {
		_dossierDocId = dossierDocId;
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
	public long getDocFileVersionId() {
		return _docFileVersionId;
	}

	@Override
	public void setDocFileVersionId(long docFileVersionId) {
		_docFileVersionId = docFileVersionId;
	}

	@JSON
	@Override
	public String getDocName() {
		if (_docName == null) {
			return StringPool.BLANK;
		}
		else {
			return _docName;
		}
	}

	@Override
	public void setDocName(String docName) {
		_docName = docName;
	}

	@JSON
	@Override
	public String getNote() {
		if (_note == null) {
			return StringPool.BLANK;
		}
		else {
			return _note;
		}
	}

	@Override
	public void setNote(String note) {
		_note = note;
	}

	@JSON
	@Override
	public int getPremier() {
		return _premier;
	}

	@Override
	public void setPremier(int premier) {
		_premier = premier;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				DocFile.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			DocFile.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public DocFile toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DocFile)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DocFileImpl docFileImpl = new DocFileImpl();

		docFileImpl.setUuid(getUuid());
		docFileImpl.setDocFileId(getDocFileId());
		docFileImpl.setUserId(getUserId());
		docFileImpl.setGroupId(getGroupId());
		docFileImpl.setCompanyId(getCompanyId());
		docFileImpl.setCreateDate(getCreateDate());
		docFileImpl.setModifiedDate(getModifiedDate());
		docFileImpl.setDossierId(getDossierId());
		docFileImpl.setDossierDocId(getDossierDocId());
		docFileImpl.setDocTemplateId(getDocTemplateId());
		docFileImpl.setDocFileVersionId(getDocFileVersionId());
		docFileImpl.setDocName(getDocName());
		docFileImpl.setNote(getNote());
		docFileImpl.setPremier(getPremier());

		docFileImpl.resetOriginalValues();

		return docFileImpl;
	}

	@Override
	public int compareTo(DocFile docFile) {
		long primaryKey = docFile.getPrimaryKey();

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

		if (!(obj instanceof DocFile)) {
			return false;
		}

		DocFile docFile = (DocFile)obj;

		long primaryKey = docFile.getPrimaryKey();

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
		DocFileModelImpl docFileModelImpl = this;

		docFileModelImpl._originalUuid = docFileModelImpl._uuid;

		docFileModelImpl._originalGroupId = docFileModelImpl._groupId;

		docFileModelImpl._setOriginalGroupId = false;

		docFileModelImpl._originalCompanyId = docFileModelImpl._companyId;

		docFileModelImpl._setOriginalCompanyId = false;

		docFileModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DocFile> toCacheModel() {
		DocFileCacheModel docFileCacheModel = new DocFileCacheModel();

		docFileCacheModel.uuid = getUuid();

		String uuid = docFileCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			docFileCacheModel.uuid = null;
		}

		docFileCacheModel.docFileId = getDocFileId();

		docFileCacheModel.userId = getUserId();

		docFileCacheModel.groupId = getGroupId();

		docFileCacheModel.companyId = getCompanyId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			docFileCacheModel.createDate = createDate.getTime();
		}
		else {
			docFileCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			docFileCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			docFileCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		docFileCacheModel.dossierId = getDossierId();

		docFileCacheModel.dossierDocId = getDossierDocId();

		docFileCacheModel.docTemplateId = getDocTemplateId();

		docFileCacheModel.docFileVersionId = getDocFileVersionId();

		docFileCacheModel.docName = getDocName();

		String docName = docFileCacheModel.docName;

		if ((docName != null) && (docName.length() == 0)) {
			docFileCacheModel.docName = null;
		}

		docFileCacheModel.note = getNote();

		String note = docFileCacheModel.note;

		if ((note != null) && (note.length() == 0)) {
			docFileCacheModel.note = null;
		}

		docFileCacheModel.premier = getPremier();

		return docFileCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", docFileId=");
		sb.append(getDocFileId());
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
		sb.append(", dossierId=");
		sb.append(getDossierId());
		sb.append(", dossierDocId=");
		sb.append(getDossierDocId());
		sb.append(", docTemplateId=");
		sb.append(getDocTemplateId());
		sb.append(", docFileVersionId=");
		sb.append(getDocFileVersionId());
		sb.append(", docName=");
		sb.append(getDocName());
		sb.append(", note=");
		sb.append(getNote());
		sb.append(", premier=");
		sb.append(getPremier());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.dossiermgt.model.DocFile");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>docFileId</column-name><column-value><![CDATA[");
		sb.append(getDocFileId());
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
			"<column><column-name>dossierId</column-name><column-value><![CDATA[");
		sb.append(getDossierId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierDocId</column-name><column-value><![CDATA[");
		sb.append(getDossierDocId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>docTemplateId</column-name><column-value><![CDATA[");
		sb.append(getDocTemplateId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>docFileVersionId</column-name><column-value><![CDATA[");
		sb.append(getDocFileVersionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>docName</column-name><column-value><![CDATA[");
		sb.append(getDocName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>note</column-name><column-value><![CDATA[");
		sb.append(getNote());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>premier</column-name><column-value><![CDATA[");
		sb.append(getPremier());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DocFile.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DocFile.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _docFileId;
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
	private long _dossierId;
	private long _dossierDocId;
	private long _docTemplateId;
	private long _docFileVersionId;
	private String _docName;
	private String _note;
	private int _premier;
	private long _columnBitmask;
	private DocFile _escapedModel;
}