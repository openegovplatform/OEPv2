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

package org.oep.processmgt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.oep.processmgt.service.http.DocFile2ProcessOrderServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.processmgt.service.http.DocFile2ProcessOrderServiceSoap
 * @generated
 */
public class DocFile2ProcessOrderSoap implements Serializable {
	public static DocFile2ProcessOrderSoap toSoapModel(
		DocFile2ProcessOrder model) {
		DocFile2ProcessOrderSoap soapModel = new DocFile2ProcessOrderSoap();

		soapModel.setDocFileId(model.getDocFileId());
		soapModel.setProcessOrderId(model.getProcessOrderId());

		return soapModel;
	}

	public static DocFile2ProcessOrderSoap[] toSoapModels(
		DocFile2ProcessOrder[] models) {
		DocFile2ProcessOrderSoap[] soapModels = new DocFile2ProcessOrderSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DocFile2ProcessOrderSoap[][] toSoapModels(
		DocFile2ProcessOrder[][] models) {
		DocFile2ProcessOrderSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DocFile2ProcessOrderSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DocFile2ProcessOrderSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DocFile2ProcessOrderSoap[] toSoapModels(
		List<DocFile2ProcessOrder> models) {
		List<DocFile2ProcessOrderSoap> soapModels = new ArrayList<DocFile2ProcessOrderSoap>(models.size());

		for (DocFile2ProcessOrder model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DocFile2ProcessOrderSoap[soapModels.size()]);
	}

	public DocFile2ProcessOrderSoap() {
	}

	public long getPrimaryKey() {
		return _docFileId;
	}

	public void setPrimaryKey(long pk) {
		setDocFileId(pk);
	}

	public long getDocFileId() {
		return _docFileId;
	}

	public void setDocFileId(long docFileId) {
		_docFileId = docFileId;
	}

	public long getProcessOrderId() {
		return _processOrderId;
	}

	public void setProcessOrderId(long processOrderId) {
		_processOrderId = processOrderId;
	}

	private long _docFileId;
	private long _processOrderId;
}