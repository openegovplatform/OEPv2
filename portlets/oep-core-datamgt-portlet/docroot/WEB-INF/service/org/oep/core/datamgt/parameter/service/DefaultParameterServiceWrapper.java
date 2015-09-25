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

package org.oep.core.datamgt.parameter.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DefaultParameterService}.
 *
 * @author TrungDK
 * @see DefaultParameterService
 * @generated
 */
public class DefaultParameterServiceWrapper implements DefaultParameterService,
	ServiceWrapper<DefaultParameterService> {
	public DefaultParameterServiceWrapper(
		DefaultParameterService defaultParameterService) {
		_defaultParameterService = defaultParameterService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _defaultParameterService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_defaultParameterService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _defaultParameterService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public org.oep.core.datamgt.parameter.model.DefaultParameter addDefaultParameter(
		long companyId, java.lang.String applicationName,
		java.lang.String title, java.lang.String parameterName,
		java.lang.String parameterValue, int changeable,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _defaultParameterService.addDefaultParameter(companyId,
			applicationName, title, parameterName, parameterValue, changeable,
			serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DefaultParameterService getWrappedDefaultParameterService() {
		return _defaultParameterService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDefaultParameterService(
		DefaultParameterService defaultParameterService) {
		_defaultParameterService = defaultParameterService;
	}

	@Override
	public DefaultParameterService getWrappedService() {
		return _defaultParameterService;
	}

	@Override
	public void setWrappedService(
		DefaultParameterService defaultParameterService) {
		_defaultParameterService = defaultParameterService;
	}

	private DefaultParameterService _defaultParameterService;
}