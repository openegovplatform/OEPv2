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
 * Provides a wrapper for {@link PaymentFile2DossierService}.
 *
 * @author trungdk
 * @see PaymentFile2DossierService
 * @generated
 */
public class PaymentFile2DossierServiceWrapper
	implements PaymentFile2DossierService,
		ServiceWrapper<PaymentFile2DossierService> {
	public PaymentFile2DossierServiceWrapper(
		PaymentFile2DossierService paymentFile2DossierService) {
		_paymentFile2DossierService = paymentFile2DossierService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _paymentFile2DossierService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_paymentFile2DossierService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _paymentFile2DossierService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PaymentFile2DossierService getWrappedPaymentFile2DossierService() {
		return _paymentFile2DossierService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPaymentFile2DossierService(
		PaymentFile2DossierService paymentFile2DossierService) {
		_paymentFile2DossierService = paymentFile2DossierService;
	}

	@Override
	public PaymentFile2DossierService getWrappedService() {
		return _paymentFile2DossierService;
	}

	@Override
	public void setWrappedService(
		PaymentFile2DossierService paymentFile2DossierService) {
		_paymentFile2DossierService = paymentFile2DossierService;
	}

	private PaymentFile2DossierService _paymentFile2DossierService;
}