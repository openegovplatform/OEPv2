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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DefaultParameter}.
 * </p>
 *
 * @author TrungDK
 * @see DefaultParameter
 * @generated
 */
public class DefaultParameterWrapper implements DefaultParameter,
	ModelWrapper<DefaultParameter> {
	public DefaultParameterWrapper(DefaultParameter defaultParameter) {
		_defaultParameter = defaultParameter;
	}

	@Override
	public Class<?> getModelClass() {
		return DefaultParameter.class;
	}

	@Override
	public String getModelClassName() {
		return DefaultParameter.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("defaultParameterId", getDefaultParameterId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("applicationName", getApplicationName());
		attributes.put("parameterName", getParameterName());
		attributes.put("title", getTitle());
		attributes.put("parameterValue", getParameterValue());
		attributes.put("changeable", getChangeable());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long defaultParameterId = (Long)attributes.get("defaultParameterId");

		if (defaultParameterId != null) {
			setDefaultParameterId(defaultParameterId);
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

		String applicationName = (String)attributes.get("applicationName");

		if (applicationName != null) {
			setApplicationName(applicationName);
		}

		String parameterName = (String)attributes.get("parameterName");

		if (parameterName != null) {
			setParameterName(parameterName);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String parameterValue = (String)attributes.get("parameterValue");

		if (parameterValue != null) {
			setParameterValue(parameterValue);
		}

		Integer changeable = (Integer)attributes.get("changeable");

		if (changeable != null) {
			setChangeable(changeable);
		}
	}

	/**
	* Returns the primary key of this default parameter.
	*
	* @return the primary key of this default parameter
	*/
	@Override
	public long getPrimaryKey() {
		return _defaultParameter.getPrimaryKey();
	}

	/**
	* Sets the primary key of this default parameter.
	*
	* @param primaryKey the primary key of this default parameter
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_defaultParameter.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the default parameter ID of this default parameter.
	*
	* @return the default parameter ID of this default parameter
	*/
	@Override
	public long getDefaultParameterId() {
		return _defaultParameter.getDefaultParameterId();
	}

	/**
	* Sets the default parameter ID of this default parameter.
	*
	* @param defaultParameterId the default parameter ID of this default parameter
	*/
	@Override
	public void setDefaultParameterId(long defaultParameterId) {
		_defaultParameter.setDefaultParameterId(defaultParameterId);
	}

	/**
	* Returns the company ID of this default parameter.
	*
	* @return the company ID of this default parameter
	*/
	@Override
	public long getCompanyId() {
		return _defaultParameter.getCompanyId();
	}

	/**
	* Sets the company ID of this default parameter.
	*
	* @param companyId the company ID of this default parameter
	*/
	@Override
	public void setCompanyId(long companyId) {
		_defaultParameter.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this default parameter.
	*
	* @return the create date of this default parameter
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _defaultParameter.getCreateDate();
	}

	/**
	* Sets the create date of this default parameter.
	*
	* @param createDate the create date of this default parameter
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_defaultParameter.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this default parameter.
	*
	* @return the modified date of this default parameter
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _defaultParameter.getModifiedDate();
	}

	/**
	* Sets the modified date of this default parameter.
	*
	* @param modifiedDate the modified date of this default parameter
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_defaultParameter.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the application name of this default parameter.
	*
	* @return the application name of this default parameter
	*/
	@Override
	public java.lang.String getApplicationName() {
		return _defaultParameter.getApplicationName();
	}

	/**
	* Sets the application name of this default parameter.
	*
	* @param applicationName the application name of this default parameter
	*/
	@Override
	public void setApplicationName(java.lang.String applicationName) {
		_defaultParameter.setApplicationName(applicationName);
	}

	/**
	* Returns the parameter name of this default parameter.
	*
	* @return the parameter name of this default parameter
	*/
	@Override
	public java.lang.String getParameterName() {
		return _defaultParameter.getParameterName();
	}

	/**
	* Sets the parameter name of this default parameter.
	*
	* @param parameterName the parameter name of this default parameter
	*/
	@Override
	public void setParameterName(java.lang.String parameterName) {
		_defaultParameter.setParameterName(parameterName);
	}

	/**
	* Returns the title of this default parameter.
	*
	* @return the title of this default parameter
	*/
	@Override
	public java.lang.String getTitle() {
		return _defaultParameter.getTitle();
	}

	/**
	* Sets the title of this default parameter.
	*
	* @param title the title of this default parameter
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_defaultParameter.setTitle(title);
	}

	/**
	* Returns the parameter value of this default parameter.
	*
	* @return the parameter value of this default parameter
	*/
	@Override
	public java.lang.String getParameterValue() {
		return _defaultParameter.getParameterValue();
	}

	/**
	* Sets the parameter value of this default parameter.
	*
	* @param parameterValue the parameter value of this default parameter
	*/
	@Override
	public void setParameterValue(java.lang.String parameterValue) {
		_defaultParameter.setParameterValue(parameterValue);
	}

	/**
	* Returns the changeable of this default parameter.
	*
	* @return the changeable of this default parameter
	*/
	@Override
	public int getChangeable() {
		return _defaultParameter.getChangeable();
	}

	/**
	* Sets the changeable of this default parameter.
	*
	* @param changeable the changeable of this default parameter
	*/
	@Override
	public void setChangeable(int changeable) {
		_defaultParameter.setChangeable(changeable);
	}

	@Override
	public boolean isNew() {
		return _defaultParameter.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_defaultParameter.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _defaultParameter.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_defaultParameter.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _defaultParameter.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _defaultParameter.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_defaultParameter.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _defaultParameter.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_defaultParameter.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_defaultParameter.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_defaultParameter.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DefaultParameterWrapper((DefaultParameter)_defaultParameter.clone());
	}

	@Override
	public int compareTo(
		org.oep.core.datamgt.parameter.model.DefaultParameter defaultParameter) {
		return _defaultParameter.compareTo(defaultParameter);
	}

	@Override
	public int hashCode() {
		return _defaultParameter.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.core.datamgt.parameter.model.DefaultParameter> toCacheModel() {
		return _defaultParameter.toCacheModel();
	}

	@Override
	public org.oep.core.datamgt.parameter.model.DefaultParameter toEscapedModel() {
		return new DefaultParameterWrapper(_defaultParameter.toEscapedModel());
	}

	@Override
	public org.oep.core.datamgt.parameter.model.DefaultParameter toUnescapedModel() {
		return new DefaultParameterWrapper(_defaultParameter.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _defaultParameter.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _defaultParameter.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_defaultParameter.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DefaultParameterWrapper)) {
			return false;
		}

		DefaultParameterWrapper defaultParameterWrapper = (DefaultParameterWrapper)obj;

		if (Validator.equals(_defaultParameter,
					defaultParameterWrapper._defaultParameter)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DefaultParameter getWrappedDefaultParameter() {
		return _defaultParameter;
	}

	@Override
	public DefaultParameter getWrappedModel() {
		return _defaultParameter;
	}

	@Override
	public void resetOriginalValues() {
		_defaultParameter.resetOriginalValues();
	}

	private DefaultParameter _defaultParameter;
}