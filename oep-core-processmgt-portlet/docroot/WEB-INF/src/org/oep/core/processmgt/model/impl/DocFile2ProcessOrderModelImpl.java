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
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import org.oep.core.processmgt.model.DocFile2ProcessOrder;
import org.oep.core.processmgt.model.DocFile2ProcessOrderModel;
import org.oep.core.processmgt.model.DocFile2ProcessOrderSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the DocFile2ProcessOrder service. Represents a row in the &quot;oep_processmgt_docfile2processorder&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.core.processmgt.model.DocFile2ProcessOrderModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DocFile2ProcessOrderImpl}.
 * </p>
 *
 * @author trungdk
 * @see DocFile2ProcessOrderImpl
 * @see org.oep.core.processmgt.model.DocFile2ProcessOrder
 * @see org.oep.core.processmgt.model.DocFile2ProcessOrderModel
 * @generated
 */
@JSON(strict = true)
public class DocFile2ProcessOrderModelImpl extends BaseModelImpl<DocFile2ProcessOrder>
	implements DocFile2ProcessOrderModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a doc file2 process order model instance should use the {@link org.oep.core.processmgt.model.DocFile2ProcessOrder} interface instead.
	 */
	public static final String TABLE_NAME = "oep_processmgt_docfile2processorder";
	public static final Object[][] TABLE_COLUMNS = {
			{ "docFileId", Types.BIGINT },
			{ "processOrderId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table oep_processmgt_docfile2processorder (docFileId LONG not null primary key,processOrderId LONG)";
	public static final String TABLE_SQL_DROP = "drop table oep_processmgt_docfile2processorder";
	public static final String ORDER_BY_JPQL = " ORDER BY docFile2ProcessOrder.docFileId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY oep_processmgt_docfile2processorder.docFileId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.core.processmgt.model.DocFile2ProcessOrder"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.core.processmgt.model.DocFile2ProcessOrder"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static DocFile2ProcessOrder toModel(
		DocFile2ProcessOrderSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		DocFile2ProcessOrder model = new DocFile2ProcessOrderImpl();

		model.setDocFileId(soapModel.getDocFileId());
		model.setProcessOrderId(soapModel.getProcessOrderId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<DocFile2ProcessOrder> toModels(
		DocFile2ProcessOrderSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<DocFile2ProcessOrder> models = new ArrayList<DocFile2ProcessOrder>(soapModels.length);

		for (DocFile2ProcessOrderSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.core.processmgt.model.DocFile2ProcessOrder"));

	public DocFile2ProcessOrderModelImpl() {
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
		return DocFile2ProcessOrder.class;
	}

	@Override
	public String getModelClassName() {
		return DocFile2ProcessOrder.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("docFileId", getDocFileId());
		attributes.put("processOrderId", getProcessOrderId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long docFileId = (Long)attributes.get("docFileId");

		if (docFileId != null) {
			setDocFileId(docFileId);
		}

		Long processOrderId = (Long)attributes.get("processOrderId");

		if (processOrderId != null) {
			setProcessOrderId(processOrderId);
		}
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
	public long getProcessOrderId() {
		return _processOrderId;
	}

	@Override
	public void setProcessOrderId(long processOrderId) {
		_processOrderId = processOrderId;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			DocFile2ProcessOrder.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public DocFile2ProcessOrder toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DocFile2ProcessOrder)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DocFile2ProcessOrderImpl docFile2ProcessOrderImpl = new DocFile2ProcessOrderImpl();

		docFile2ProcessOrderImpl.setDocFileId(getDocFileId());
		docFile2ProcessOrderImpl.setProcessOrderId(getProcessOrderId());

		docFile2ProcessOrderImpl.resetOriginalValues();

		return docFile2ProcessOrderImpl;
	}

	@Override
	public int compareTo(DocFile2ProcessOrder docFile2ProcessOrder) {
		long primaryKey = docFile2ProcessOrder.getPrimaryKey();

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

		if (!(obj instanceof DocFile2ProcessOrder)) {
			return false;
		}

		DocFile2ProcessOrder docFile2ProcessOrder = (DocFile2ProcessOrder)obj;

		long primaryKey = docFile2ProcessOrder.getPrimaryKey();

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
	public CacheModel<DocFile2ProcessOrder> toCacheModel() {
		DocFile2ProcessOrderCacheModel docFile2ProcessOrderCacheModel = new DocFile2ProcessOrderCacheModel();

		docFile2ProcessOrderCacheModel.docFileId = getDocFileId();

		docFile2ProcessOrderCacheModel.processOrderId = getProcessOrderId();

		return docFile2ProcessOrderCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{docFileId=");
		sb.append(getDocFileId());
		sb.append(", processOrderId=");
		sb.append(getProcessOrderId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.processmgt.model.DocFile2ProcessOrder");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>docFileId</column-name><column-value><![CDATA[");
		sb.append(getDocFileId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>processOrderId</column-name><column-value><![CDATA[");
		sb.append(getProcessOrderId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DocFile2ProcessOrder.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DocFile2ProcessOrder.class
		};
	private long _docFileId;
	private long _processOrderId;
	private DocFile2ProcessOrder _escapedModel;
}