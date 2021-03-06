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

package org.oep.core.ssomgt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AppRole2EmployeeService}.
 *
 * @author trungdk
 * @see AppRole2EmployeeService
 * @generated
 */
public class AppRole2EmployeeServiceWrapper implements AppRole2EmployeeService,
	ServiceWrapper<AppRole2EmployeeService> {
	public AppRole2EmployeeServiceWrapper(
		AppRole2EmployeeService appRole2EmployeeService) {
		_appRole2EmployeeService = appRole2EmployeeService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _appRole2EmployeeService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_appRole2EmployeeService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _appRole2EmployeeService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AppRole2EmployeeService getWrappedAppRole2EmployeeService() {
		return _appRole2EmployeeService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAppRole2EmployeeService(
		AppRole2EmployeeService appRole2EmployeeService) {
		_appRole2EmployeeService = appRole2EmployeeService;
	}

	@Override
	public AppRole2EmployeeService getWrappedService() {
		return _appRole2EmployeeService;
	}

	@Override
	public void setWrappedService(
		AppRole2EmployeeService appRole2EmployeeService) {
		_appRole2EmployeeService = appRole2EmployeeService;
	}

	private AppRole2EmployeeService _appRole2EmployeeService;
}