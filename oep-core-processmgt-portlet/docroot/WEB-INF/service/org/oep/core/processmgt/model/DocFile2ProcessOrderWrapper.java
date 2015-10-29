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

package org.oep.core.processmgt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DocFile2ProcessOrder}.
 * </p>
 *
 * @author trungdk
 * @see DocFile2ProcessOrder
 * @generated
 */
public class DocFile2ProcessOrderWrapper implements DocFile2ProcessOrder,
	ModelWrapper<DocFile2ProcessOrder> {
	public DocFile2ProcessOrderWrapper(
		DocFile2ProcessOrder docFile2ProcessOrder) {
		_docFile2ProcessOrder = docFile2ProcessOrder;
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

	/**
	* Returns the primary key of this doc file2 process order.
	*
	* @return the primary key of this doc file2 process order
	*/
	@Override
	public long getPrimaryKey() {
		return _docFile2ProcessOrder.getPrimaryKey();
	}

	/**
	* Sets the primary key of this doc file2 process order.
	*
	* @param primaryKey the primary key of this doc file2 process order
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_docFile2ProcessOrder.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the doc file ID of this doc file2 process order.
	*
	* @return the doc file ID of this doc file2 process order
	*/
	@Override
	public long getDocFileId() {
		return _docFile2ProcessOrder.getDocFileId();
	}

	/**
	* Sets the doc file ID of this doc file2 process order.
	*
	* @param docFileId the doc file ID of this doc file2 process order
	*/
	@Override
	public void setDocFileId(long docFileId) {
		_docFile2ProcessOrder.setDocFileId(docFileId);
	}

	/**
	* Returns the process order ID of this doc file2 process order.
	*
	* @return the process order ID of this doc file2 process order
	*/
	@Override
	public long getProcessOrderId() {
		return _docFile2ProcessOrder.getProcessOrderId();
	}

	/**
	* Sets the process order ID of this doc file2 process order.
	*
	* @param processOrderId the process order ID of this doc file2 process order
	*/
	@Override
	public void setProcessOrderId(long processOrderId) {
		_docFile2ProcessOrder.setProcessOrderId(processOrderId);
	}

	@Override
	public boolean isNew() {
		return _docFile2ProcessOrder.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_docFile2ProcessOrder.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _docFile2ProcessOrder.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_docFile2ProcessOrder.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _docFile2ProcessOrder.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _docFile2ProcessOrder.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_docFile2ProcessOrder.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _docFile2ProcessOrder.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_docFile2ProcessOrder.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_docFile2ProcessOrder.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_docFile2ProcessOrder.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DocFile2ProcessOrderWrapper((DocFile2ProcessOrder)_docFile2ProcessOrder.clone());
	}

	@Override
	public int compareTo(
		org.oep.core.processmgt.model.DocFile2ProcessOrder docFile2ProcessOrder) {
		return _docFile2ProcessOrder.compareTo(docFile2ProcessOrder);
	}

	@Override
	public int hashCode() {
		return _docFile2ProcessOrder.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.core.processmgt.model.DocFile2ProcessOrder> toCacheModel() {
		return _docFile2ProcessOrder.toCacheModel();
	}

	@Override
	public org.oep.core.processmgt.model.DocFile2ProcessOrder toEscapedModel() {
		return new DocFile2ProcessOrderWrapper(_docFile2ProcessOrder.toEscapedModel());
	}

	@Override
	public org.oep.core.processmgt.model.DocFile2ProcessOrder toUnescapedModel() {
		return new DocFile2ProcessOrderWrapper(_docFile2ProcessOrder.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _docFile2ProcessOrder.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _docFile2ProcessOrder.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_docFile2ProcessOrder.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DocFile2ProcessOrderWrapper)) {
			return false;
		}

		DocFile2ProcessOrderWrapper docFile2ProcessOrderWrapper = (DocFile2ProcessOrderWrapper)obj;

		if (Validator.equals(_docFile2ProcessOrder,
					docFile2ProcessOrderWrapper._docFile2ProcessOrder)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DocFile2ProcessOrder getWrappedDocFile2ProcessOrder() {
		return _docFile2ProcessOrder;
	}

	@Override
	public DocFile2ProcessOrder getWrappedModel() {
		return _docFile2ProcessOrder;
	}

	@Override
	public void resetOriginalValues() {
		_docFile2ProcessOrder.resetOriginalValues();
	}

	private DocFile2ProcessOrder _docFile2ProcessOrder;
}