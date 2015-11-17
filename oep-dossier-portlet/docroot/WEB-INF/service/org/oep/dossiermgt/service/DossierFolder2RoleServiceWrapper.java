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

package org.oep.dossiermgt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DossierFolder2RoleService}.
 *
 * @author trungdk
 * @see DossierFolder2RoleService
 * @generated
 */
public class DossierFolder2RoleServiceWrapper
	implements DossierFolder2RoleService,
		ServiceWrapper<DossierFolder2RoleService> {
	public DossierFolder2RoleServiceWrapper(
		DossierFolder2RoleService dossierFolder2RoleService) {
		_dossierFolder2RoleService = dossierFolder2RoleService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dossierFolder2RoleService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dossierFolder2RoleService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dossierFolder2RoleService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DossierFolder2RoleService getWrappedDossierFolder2RoleService() {
		return _dossierFolder2RoleService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDossierFolder2RoleService(
		DossierFolder2RoleService dossierFolder2RoleService) {
		_dossierFolder2RoleService = dossierFolder2RoleService;
	}

	@Override
	public DossierFolder2RoleService getWrappedService() {
		return _dossierFolder2RoleService;
	}

	@Override
	public void setWrappedService(
		DossierFolder2RoleService dossierFolder2RoleService) {
		_dossierFolder2RoleService = dossierFolder2RoleService;
	}

	private DossierFolder2RoleService _dossierFolder2RoleService;
}