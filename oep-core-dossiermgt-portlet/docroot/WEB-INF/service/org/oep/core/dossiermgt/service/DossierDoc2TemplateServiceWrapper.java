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

package org.oep.core.dossiermgt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DossierDoc2TemplateService}.
 *
 * @author trungdk
 * @see DossierDoc2TemplateService
 * @generated
 */
public class DossierDoc2TemplateServiceWrapper
	implements DossierDoc2TemplateService,
		ServiceWrapper<DossierDoc2TemplateService> {
	public DossierDoc2TemplateServiceWrapper(
		DossierDoc2TemplateService dossierDoc2TemplateService) {
		_dossierDoc2TemplateService = dossierDoc2TemplateService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dossierDoc2TemplateService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dossierDoc2TemplateService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dossierDoc2TemplateService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DossierDoc2TemplateService getWrappedDossierDoc2TemplateService() {
		return _dossierDoc2TemplateService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDossierDoc2TemplateService(
		DossierDoc2TemplateService dossierDoc2TemplateService) {
		_dossierDoc2TemplateService = dossierDoc2TemplateService;
	}

	@Override
	public DossierDoc2TemplateService getWrappedService() {
		return _dossierDoc2TemplateService;
	}

	@Override
	public void setWrappedService(
		DossierDoc2TemplateService dossierDoc2TemplateService) {
		_dossierDoc2TemplateService = dossierDoc2TemplateService;
	}

	private DossierDoc2TemplateService _dossierDoc2TemplateService;
}