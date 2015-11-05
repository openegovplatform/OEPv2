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

package org.oep.usermgt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Jobpos2RoleService}.
 *
 * @author NQMINH
 * @see Jobpos2RoleService
 * @generated
 */
public class Jobpos2RoleServiceWrapper implements Jobpos2RoleService,
	ServiceWrapper<Jobpos2RoleService> {
	public Jobpos2RoleServiceWrapper(Jobpos2RoleService jobpos2RoleService) {
		_jobpos2RoleService = jobpos2RoleService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _jobpos2RoleService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_jobpos2RoleService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _jobpos2RoleService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public Jobpos2RoleService getWrappedJobpos2RoleService() {
		return _jobpos2RoleService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedJobpos2RoleService(
		Jobpos2RoleService jobpos2RoleService) {
		_jobpos2RoleService = jobpos2RoleService;
	}

	@Override
	public Jobpos2RoleService getWrappedService() {
		return _jobpos2RoleService;
	}

	@Override
	public void setWrappedService(Jobpos2RoleService jobpos2RoleService) {
		_jobpos2RoleService = jobpos2RoleService;
	}

	private Jobpos2RoleService _jobpos2RoleService;
}