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
import org.oep.core.dossiermgt.service.DossierFolderLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class DossierFolderClp extends BaseModelImpl<DossierFolder>
	implements DossierFolder {
	public DossierFolderClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DossierFolder.class;
	}

	@Override
	public String getModelClassName() {
		return DossierFolder.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _dossierFolderId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDossierFolderId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dossierFolderId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("dossierFolderId", getDossierFolderId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("folderName", getFolderName());
		attributes.put("parentDossierFolderId", getParentDossierFolderId());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("procedureFilter", getProcedureFilter());
		attributes.put("statusFilter", getStatusFilter());
		attributes.put("tagFilter", getTagFilter());
		attributes.put("filterByOrganization", getFilterByOrganization());
		attributes.put("filterByUser", getFilterByUser());
		attributes.put("orderBy", getOrderBy());
		attributes.put("counting", getCounting());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long dossierFolderId = (Long)attributes.get("dossierFolderId");

		if (dossierFolderId != null) {
			setDossierFolderId(dossierFolderId);
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

		String folderName = (String)attributes.get("folderName");

		if (folderName != null) {
			setFolderName(folderName);
		}

		Long parentDossierFolderId = (Long)attributes.get(
				"parentDossierFolderId");

		if (parentDossierFolderId != null) {
			setParentDossierFolderId(parentDossierFolderId);
		}

		Integer sequenceNo = (Integer)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		String procedureFilter = (String)attributes.get("procedureFilter");

		if (procedureFilter != null) {
			setProcedureFilter(procedureFilter);
		}

		String statusFilter = (String)attributes.get("statusFilter");

		if (statusFilter != null) {
			setStatusFilter(statusFilter);
		}

		String tagFilter = (String)attributes.get("tagFilter");

		if (tagFilter != null) {
			setTagFilter(tagFilter);
		}

		Integer filterByOrganization = (Integer)attributes.get(
				"filterByOrganization");

		if (filterByOrganization != null) {
			setFilterByOrganization(filterByOrganization);
		}

		Integer filterByUser = (Integer)attributes.get("filterByUser");

		if (filterByUser != null) {
			setFilterByUser(filterByUser);
		}

		String orderBy = (String)attributes.get("orderBy");

		if (orderBy != null) {
			setOrderBy(orderBy);
		}

		Integer counting = (Integer)attributes.get("counting");

		if (counting != null) {
			setCounting(counting);
		}
	}

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_dossierFolderRemoteModel != null) {
			try {
				Class<?> clazz = _dossierFolderRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_dossierFolderRemoteModel, uuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDossierFolderId() {
		return _dossierFolderId;
	}

	@Override
	public void setDossierFolderId(long dossierFolderId) {
		_dossierFolderId = dossierFolderId;

		if (_dossierFolderRemoteModel != null) {
			try {
				Class<?> clazz = _dossierFolderRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierFolderId", long.class);

				method.invoke(_dossierFolderRemoteModel, dossierFolderId);
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

		if (_dossierFolderRemoteModel != null) {
			try {
				Class<?> clazz = _dossierFolderRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_dossierFolderRemoteModel, userId);
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

		if (_dossierFolderRemoteModel != null) {
			try {
				Class<?> clazz = _dossierFolderRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_dossierFolderRemoteModel, groupId);
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

		if (_dossierFolderRemoteModel != null) {
			try {
				Class<?> clazz = _dossierFolderRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_dossierFolderRemoteModel, companyId);
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

		if (_dossierFolderRemoteModel != null) {
			try {
				Class<?> clazz = _dossierFolderRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_dossierFolderRemoteModel, createDate);
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

		if (_dossierFolderRemoteModel != null) {
			try {
				Class<?> clazz = _dossierFolderRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dossierFolderRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFolderName() {
		return _folderName;
	}

	@Override
	public void setFolderName(String folderName) {
		_folderName = folderName;

		if (_dossierFolderRemoteModel != null) {
			try {
				Class<?> clazz = _dossierFolderRemoteModel.getClass();

				Method method = clazz.getMethod("setFolderName", String.class);

				method.invoke(_dossierFolderRemoteModel, folderName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getParentDossierFolderId() {
		return _parentDossierFolderId;
	}

	@Override
	public void setParentDossierFolderId(long parentDossierFolderId) {
		_parentDossierFolderId = parentDossierFolderId;

		if (_dossierFolderRemoteModel != null) {
			try {
				Class<?> clazz = _dossierFolderRemoteModel.getClass();

				Method method = clazz.getMethod("setParentDossierFolderId",
						long.class);

				method.invoke(_dossierFolderRemoteModel, parentDossierFolderId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSequenceNo() {
		return _sequenceNo;
	}

	@Override
	public void setSequenceNo(int sequenceNo) {
		_sequenceNo = sequenceNo;

		if (_dossierFolderRemoteModel != null) {
			try {
				Class<?> clazz = _dossierFolderRemoteModel.getClass();

				Method method = clazz.getMethod("setSequenceNo", int.class);

				method.invoke(_dossierFolderRemoteModel, sequenceNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProcedureFilter() {
		return _procedureFilter;
	}

	@Override
	public void setProcedureFilter(String procedureFilter) {
		_procedureFilter = procedureFilter;

		if (_dossierFolderRemoteModel != null) {
			try {
				Class<?> clazz = _dossierFolderRemoteModel.getClass();

				Method method = clazz.getMethod("setProcedureFilter",
						String.class);

				method.invoke(_dossierFolderRemoteModel, procedureFilter);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatusFilter() {
		return _statusFilter;
	}

	@Override
	public void setStatusFilter(String statusFilter) {
		_statusFilter = statusFilter;

		if (_dossierFolderRemoteModel != null) {
			try {
				Class<?> clazz = _dossierFolderRemoteModel.getClass();

				Method method = clazz.getMethod("setStatusFilter", String.class);

				method.invoke(_dossierFolderRemoteModel, statusFilter);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTagFilter() {
		return _tagFilter;
	}

	@Override
	public void setTagFilter(String tagFilter) {
		_tagFilter = tagFilter;

		if (_dossierFolderRemoteModel != null) {
			try {
				Class<?> clazz = _dossierFolderRemoteModel.getClass();

				Method method = clazz.getMethod("setTagFilter", String.class);

				method.invoke(_dossierFolderRemoteModel, tagFilter);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getFilterByOrganization() {
		return _filterByOrganization;
	}

	@Override
	public void setFilterByOrganization(int filterByOrganization) {
		_filterByOrganization = filterByOrganization;

		if (_dossierFolderRemoteModel != null) {
			try {
				Class<?> clazz = _dossierFolderRemoteModel.getClass();

				Method method = clazz.getMethod("setFilterByOrganization",
						int.class);

				method.invoke(_dossierFolderRemoteModel, filterByOrganization);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getFilterByUser() {
		return _filterByUser;
	}

	@Override
	public void setFilterByUser(int filterByUser) {
		_filterByUser = filterByUser;

		if (_dossierFolderRemoteModel != null) {
			try {
				Class<?> clazz = _dossierFolderRemoteModel.getClass();

				Method method = clazz.getMethod("setFilterByUser", int.class);

				method.invoke(_dossierFolderRemoteModel, filterByUser);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOrderBy() {
		return _orderBy;
	}

	@Override
	public void setOrderBy(String orderBy) {
		_orderBy = orderBy;

		if (_dossierFolderRemoteModel != null) {
			try {
				Class<?> clazz = _dossierFolderRemoteModel.getClass();

				Method method = clazz.getMethod("setOrderBy", String.class);

				method.invoke(_dossierFolderRemoteModel, orderBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCounting() {
		return _counting;
	}

	@Override
	public void setCounting(int counting) {
		_counting = counting;

		if (_dossierFolderRemoteModel != null) {
			try {
				Class<?> clazz = _dossierFolderRemoteModel.getClass();

				Method method = clazz.getMethod("setCounting", int.class);

				method.invoke(_dossierFolderRemoteModel, counting);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				DossierFolder.class.getName()));
	}

	public BaseModel<?> getDossierFolderRemoteModel() {
		return _dossierFolderRemoteModel;
	}

	public void setDossierFolderRemoteModel(
		BaseModel<?> dossierFolderRemoteModel) {
		_dossierFolderRemoteModel = dossierFolderRemoteModel;
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

		Class<?> remoteModelClass = _dossierFolderRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dossierFolderRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DossierFolderLocalServiceUtil.addDossierFolder(this);
		}
		else {
			DossierFolderLocalServiceUtil.updateDossierFolder(this);
		}
	}

	@Override
	public DossierFolder toEscapedModel() {
		return (DossierFolder)ProxyUtil.newProxyInstance(DossierFolder.class.getClassLoader(),
			new Class[] { DossierFolder.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DossierFolderClp clone = new DossierFolderClp();

		clone.setUuid(getUuid());
		clone.setDossierFolderId(getDossierFolderId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setFolderName(getFolderName());
		clone.setParentDossierFolderId(getParentDossierFolderId());
		clone.setSequenceNo(getSequenceNo());
		clone.setProcedureFilter(getProcedureFilter());
		clone.setStatusFilter(getStatusFilter());
		clone.setTagFilter(getTagFilter());
		clone.setFilterByOrganization(getFilterByOrganization());
		clone.setFilterByUser(getFilterByUser());
		clone.setOrderBy(getOrderBy());
		clone.setCounting(getCounting());

		return clone;
	}

	@Override
	public int compareTo(DossierFolder dossierFolder) {
		long primaryKey = dossierFolder.getPrimaryKey();

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

		if (!(obj instanceof DossierFolderClp)) {
			return false;
		}

		DossierFolderClp dossierFolder = (DossierFolderClp)obj;

		long primaryKey = dossierFolder.getPrimaryKey();

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
		StringBundler sb = new StringBundler(35);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", dossierFolderId=");
		sb.append(getDossierFolderId());
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
		sb.append(", folderName=");
		sb.append(getFolderName());
		sb.append(", parentDossierFolderId=");
		sb.append(getParentDossierFolderId());
		sb.append(", sequenceNo=");
		sb.append(getSequenceNo());
		sb.append(", procedureFilter=");
		sb.append(getProcedureFilter());
		sb.append(", statusFilter=");
		sb.append(getStatusFilter());
		sb.append(", tagFilter=");
		sb.append(getTagFilter());
		sb.append(", filterByOrganization=");
		sb.append(getFilterByOrganization());
		sb.append(", filterByUser=");
		sb.append(getFilterByUser());
		sb.append(", orderBy=");
		sb.append(getOrderBy());
		sb.append(", counting=");
		sb.append(getCounting());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.dossiermgt.model.DossierFolder");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierFolderId</column-name><column-value><![CDATA[");
		sb.append(getDossierFolderId());
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
			"<column><column-name>folderName</column-name><column-value><![CDATA[");
		sb.append(getFolderName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parentDossierFolderId</column-name><column-value><![CDATA[");
		sb.append(getParentDossierFolderId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sequenceNo</column-name><column-value><![CDATA[");
		sb.append(getSequenceNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>procedureFilter</column-name><column-value><![CDATA[");
		sb.append(getProcedureFilter());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusFilter</column-name><column-value><![CDATA[");
		sb.append(getStatusFilter());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tagFilter</column-name><column-value><![CDATA[");
		sb.append(getTagFilter());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>filterByOrganization</column-name><column-value><![CDATA[");
		sb.append(getFilterByOrganization());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>filterByUser</column-name><column-value><![CDATA[");
		sb.append(getFilterByUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>orderBy</column-name><column-value><![CDATA[");
		sb.append(getOrderBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>counting</column-name><column-value><![CDATA[");
		sb.append(getCounting());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _dossierFolderId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _folderName;
	private long _parentDossierFolderId;
	private int _sequenceNo;
	private String _procedureFilter;
	private String _statusFilter;
	private String _tagFilter;
	private int _filterByOrganization;
	private int _filterByUser;
	private String _orderBy;
	private int _counting;
	private BaseModel<?> _dossierFolderRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.dossiermgt.service.ClpSerializer.class;
}