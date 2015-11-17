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

package org.oep.ssomgt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AppRole2JobPosService}.
 *
 * @author trungdk
 * @see AppRole2JobPosService
 * @generated
 */
public class AppRole2JobPosServiceWrapper implements AppRole2JobPosService,
	ServiceWrapper<AppRole2JobPosService> {
	public AppRole2JobPosServiceWrapper(
		AppRole2JobPosService appRole2JobPosService) {
		_appRole2JobPosService = appRole2JobPosService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _appRole2JobPosService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_appRole2JobPosService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _appRole2JobPosService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AppRole2JobPosService getWrappedAppRole2JobPosService() {
		return _appRole2JobPosService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAppRole2JobPosService(
		AppRole2JobPosService appRole2JobPosService) {
		_appRole2JobPosService = appRole2JobPosService;
	}

	@Override
	public AppRole2JobPosService getWrappedService() {
		return _appRole2JobPosService;
	}

	@Override
	public void setWrappedService(AppRole2JobPosService appRole2JobPosService) {
		_appRole2JobPosService = appRole2JobPosService;
	}

	private AppRole2JobPosService _appRole2JobPosService;
}