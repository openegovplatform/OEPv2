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

package org.oep.core.datamgt.parameter.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.oep.core.datamgt.parameter.service.http.DefaultParameterServiceSoap}.
 *
 * @author TrungDK
 * @see org.oep.core.datamgt.parameter.service.http.DefaultParameterServiceSoap
 * @generated
 */
public class DefaultParameterSoap implements Serializable {
	public static DefaultParameterSoap toSoapModel(DefaultParameter model) {
		DefaultParameterSoap soapModel = new DefaultParameterSoap();

		soapModel.setDefaultParameterId(model.getDefaultParameterId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setApplicationName(model.getApplicationName());
		soapModel.setParameterName(model.getParameterName());
		soapModel.setTitle(model.getTitle());
		soapModel.setParameterValue(model.getParameterValue());
		soapModel.setChangeable(model.getChangeable());

		return soapModel;
	}

	public static DefaultParameterSoap[] toSoapModels(DefaultParameter[] models) {
		DefaultParameterSoap[] soapModels = new DefaultParameterSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DefaultParameterSoap[][] toSoapModels(
		DefaultParameter[][] models) {
		DefaultParameterSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DefaultParameterSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DefaultParameterSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DefaultParameterSoap[] toSoapModels(
		List<DefaultParameter> models) {
		List<DefaultParameterSoap> soapModels = new ArrayList<DefaultParameterSoap>(models.size());

		for (DefaultParameter model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DefaultParameterSoap[soapModels.size()]);
	}

	public DefaultParameterSoap() {
	}

	public long getPrimaryKey() {
		return _defaultParameterId;
	}

	public void setPrimaryKey(long pk) {
		setDefaultParameterId(pk);
	}

	public long getDefaultParameterId() {
		return _defaultParameterId;
	}

	public void setDefaultParameterId(long defaultParameterId) {
		_defaultParameterId = defaultParameterId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getApplicationName() {
		return _applicationName;
	}

	public void setApplicationName(String applicationName) {
		_applicationName = applicationName;
	}

	public String getParameterName() {
		return _parameterName;
	}

	public void setParameterName(String parameterName) {
		_parameterName = parameterName;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getParameterValue() {
		return _parameterValue;
	}

	public void setParameterValue(String parameterValue) {
		_parameterValue = parameterValue;
	}

	public int getChangeable() {
		return _changeable;
	}

	public void setChangeable(int changeable) {
		_changeable = changeable;
	}

	private long _defaultParameterId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _applicationName;
	private String _parameterName;
	private String _title;
	private String _parameterValue;
	private int _changeable;
}