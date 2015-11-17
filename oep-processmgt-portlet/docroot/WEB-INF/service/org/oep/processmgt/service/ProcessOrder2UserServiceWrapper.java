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

package org.oep.processmgt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ProcessOrder2UserService}.
 *
 * @author trungdk
 * @see ProcessOrder2UserService
 * @generated
 */
public class ProcessOrder2UserServiceWrapper implements ProcessOrder2UserService,
	ServiceWrapper<ProcessOrder2UserService> {
	public ProcessOrder2UserServiceWrapper(
		ProcessOrder2UserService processOrder2UserService) {
		_processOrder2UserService = processOrder2UserService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _processOrder2UserService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_processOrder2UserService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _processOrder2UserService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ProcessOrder2UserService getWrappedProcessOrder2UserService() {
		return _processOrder2UserService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedProcessOrder2UserService(
		ProcessOrder2UserService processOrder2UserService) {
		_processOrder2UserService = processOrder2UserService;
	}

	@Override
	public ProcessOrder2UserService getWrappedService() {
		return _processOrder2UserService;
	}

	@Override
	public void setWrappedService(
		ProcessOrder2UserService processOrder2UserService) {
		_processOrder2UserService = processOrder2UserService;
	}

	private ProcessOrder2UserService _processOrder2UserService;
}