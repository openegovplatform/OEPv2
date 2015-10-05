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

package org.oep.core.datamgt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ParameterAppLocalService}.
 *
 * @author trungdk
 * @see ParameterAppLocalService
 * @generated
 */
public class ParameterAppLocalServiceWrapper implements ParameterAppLocalService,
	ServiceWrapper<ParameterAppLocalService> {
	public ParameterAppLocalServiceWrapper(
		ParameterAppLocalService parameterAppLocalService) {
		_parameterAppLocalService = parameterAppLocalService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _parameterAppLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_parameterAppLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _parameterAppLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ParameterAppLocalService getWrappedParameterAppLocalService() {
		return _parameterAppLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedParameterAppLocalService(
		ParameterAppLocalService parameterAppLocalService) {
		_parameterAppLocalService = parameterAppLocalService;
	}

	@Override
	public ParameterAppLocalService getWrappedService() {
		return _parameterAppLocalService;
	}

	@Override
	public void setWrappedService(
		ParameterAppLocalService parameterAppLocalService) {
		_parameterAppLocalService = parameterAppLocalService;
	}

	private ParameterAppLocalService _parameterAppLocalService;
}