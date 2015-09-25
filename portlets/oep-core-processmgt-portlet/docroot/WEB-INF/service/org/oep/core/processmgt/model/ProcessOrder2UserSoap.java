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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.oep.core.processmgt.service.http.ProcessOrder2UserServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.core.processmgt.service.http.ProcessOrder2UserServiceSoap
 * @generated
 */
public class ProcessOrder2UserSoap implements Serializable {
	public static ProcessOrder2UserSoap toSoapModel(ProcessOrder2User model) {
		ProcessOrder2UserSoap soapModel = new ProcessOrder2UserSoap();

		soapModel.setId(model.getId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setProcessOrderId(model.getProcessOrderId());
		soapModel.setUserId(model.getUserId());

		return soapModel;
	}

	public static ProcessOrder2UserSoap[] toSoapModels(
		ProcessOrder2User[] models) {
		ProcessOrder2UserSoap[] soapModels = new ProcessOrder2UserSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ProcessOrder2UserSoap[][] toSoapModels(
		ProcessOrder2User[][] models) {
		ProcessOrder2UserSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ProcessOrder2UserSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ProcessOrder2UserSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ProcessOrder2UserSoap[] toSoapModels(
		List<ProcessOrder2User> models) {
		List<ProcessOrder2UserSoap> soapModels = new ArrayList<ProcessOrder2UserSoap>(models.size());

		for (ProcessOrder2User model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ProcessOrder2UserSoap[soapModels.size()]);
	}

	public ProcessOrder2UserSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getProcessOrderId() {
		return _processOrderId;
	}

	public void setProcessOrderId(long processOrderId) {
		_processOrderId = processOrderId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	private long _id;
	private long _companyId;
	private long _processOrderId;
	private long _userId;
}