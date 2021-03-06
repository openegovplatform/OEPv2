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
 * Provides a wrapper for {@link DossierProc2RoleService}.
 *
 * @author trungdk
 * @see DossierProc2RoleService
 * @generated
 */
public class DossierProc2RoleServiceWrapper implements DossierProc2RoleService,
	ServiceWrapper<DossierProc2RoleService> {
	public DossierProc2RoleServiceWrapper(
		DossierProc2RoleService dossierProc2RoleService) {
		_dossierProc2RoleService = dossierProc2RoleService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dossierProc2RoleService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dossierProc2RoleService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dossierProc2RoleService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DossierProc2RoleService getWrappedDossierProc2RoleService() {
		return _dossierProc2RoleService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDossierProc2RoleService(
		DossierProc2RoleService dossierProc2RoleService) {
		_dossierProc2RoleService = dossierProc2RoleService;
	}

	@Override
	public DossierProc2RoleService getWrappedService() {
		return _dossierProc2RoleService;
	}

	@Override
	public void setWrappedService(
		DossierProc2RoleService dossierProc2RoleService) {
		_dossierProc2RoleService = dossierProc2RoleService;
	}

	private DossierProc2RoleService _dossierProc2RoleService;
}