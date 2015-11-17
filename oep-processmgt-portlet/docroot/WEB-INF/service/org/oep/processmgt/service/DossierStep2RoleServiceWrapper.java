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
 * Provides a wrapper for {@link DossierStep2RoleService}.
 *
 * @author trungdk
 * @see DossierStep2RoleService
 * @generated
 */
public class DossierStep2RoleServiceWrapper implements DossierStep2RoleService,
	ServiceWrapper<DossierStep2RoleService> {
	public DossierStep2RoleServiceWrapper(
		DossierStep2RoleService dossierStep2RoleService) {
		_dossierStep2RoleService = dossierStep2RoleService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dossierStep2RoleService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dossierStep2RoleService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dossierStep2RoleService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DossierStep2RoleService getWrappedDossierStep2RoleService() {
		return _dossierStep2RoleService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDossierStep2RoleService(
		DossierStep2RoleService dossierStep2RoleService) {
		_dossierStep2RoleService = dossierStep2RoleService;
	}

	@Override
	public DossierStep2RoleService getWrappedService() {
		return _dossierStep2RoleService;
	}

	@Override
	public void setWrappedService(
		DossierStep2RoleService dossierStep2RoleService) {
		_dossierStep2RoleService = dossierStep2RoleService;
	}

	private DossierStep2RoleService _dossierStep2RoleService;
}