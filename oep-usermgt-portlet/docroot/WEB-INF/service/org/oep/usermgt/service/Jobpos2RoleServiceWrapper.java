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
 * Provides a wrapper for {@link JobPos2RoleService}.
 *
 * @author NQMINH
 * @see JobPos2RoleService
 * @generated
 */
public class JobPos2RoleServiceWrapper implements JobPos2RoleService,
	ServiceWrapper<JobPos2RoleService> {
	public JobPos2RoleServiceWrapper(JobPos2RoleService jobPos2RoleService) {
		_jobPos2RoleService = jobPos2RoleService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _jobPos2RoleService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_jobPos2RoleService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _jobPos2RoleService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public JobPos2RoleService getWrappedJobPos2RoleService() {
		return _jobPos2RoleService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedJobPos2RoleService(
		JobPos2RoleService jobPos2RoleService) {
		_jobPos2RoleService = jobPos2RoleService;
	}

	@Override
	public JobPos2RoleService getWrappedService() {
		return _jobPos2RoleService;
	}

	@Override
	public void setWrappedService(JobPos2RoleService jobPos2RoleService) {
		_jobPos2RoleService = jobPos2RoleService;
	}

	private JobPos2RoleService _jobPos2RoleService;
}