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
 * Provides a wrapper for {@link DocFile2ProcessOrderService}.
 *
 * @author trungdk
 * @see DocFile2ProcessOrderService
 * @generated
 */
public class DocFile2ProcessOrderServiceWrapper
	implements DocFile2ProcessOrderService,
		ServiceWrapper<DocFile2ProcessOrderService> {
	public DocFile2ProcessOrderServiceWrapper(
		DocFile2ProcessOrderService docFile2ProcessOrderService) {
		_docFile2ProcessOrderService = docFile2ProcessOrderService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _docFile2ProcessOrderService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_docFile2ProcessOrderService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _docFile2ProcessOrderService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DocFile2ProcessOrderService getWrappedDocFile2ProcessOrderService() {
		return _docFile2ProcessOrderService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDocFile2ProcessOrderService(
		DocFile2ProcessOrderService docFile2ProcessOrderService) {
		_docFile2ProcessOrderService = docFile2ProcessOrderService;
	}

	@Override
	public DocFile2ProcessOrderService getWrappedService() {
		return _docFile2ProcessOrderService;
	}

	@Override
	public void setWrappedService(
		DocFile2ProcessOrderService docFile2ProcessOrderService) {
		_docFile2ProcessOrderService = docFile2ProcessOrderService;
	}

	private DocFile2ProcessOrderService _docFile2ProcessOrderService;
}