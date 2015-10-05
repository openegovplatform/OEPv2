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
 * Provides a wrapper for {@link PaymentFile2DossierLocalService}.
 *
 * @author trungdk
 * @see PaymentFile2DossierLocalService
 * @generated
 */
public class PaymentFile2DossierLocalServiceWrapper
	implements PaymentFile2DossierLocalService,
		ServiceWrapper<PaymentFile2DossierLocalService> {
	public PaymentFile2DossierLocalServiceWrapper(
		PaymentFile2DossierLocalService paymentFile2DossierLocalService) {
		_paymentFile2DossierLocalService = paymentFile2DossierLocalService;
	}

	/**
	* Adds the payment file2 dossier to the database. Also notifies the appropriate model listeners.
	*
	* @param paymentFile2Dossier the payment file2 dossier
	* @return the payment file2 dossier that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.PaymentFile2Dossier addPaymentFile2Dossier(
		org.oep.core.dossiermgt.model.PaymentFile2Dossier paymentFile2Dossier)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentFile2DossierLocalService.addPaymentFile2Dossier(paymentFile2Dossier);
	}

	/**
	* Creates a new payment file2 dossier with the primary key. Does not add the payment file2 dossier to the database.
	*
	* @param id the primary key for the new payment file2 dossier
	* @return the new payment file2 dossier
	*/
	@Override
	public org.oep.core.dossiermgt.model.PaymentFile2Dossier createPaymentFile2Dossier(
		long id) {
		return _paymentFile2DossierLocalService.createPaymentFile2Dossier(id);
	}

	/**
	* Deletes the payment file2 dossier with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the payment file2 dossier
	* @return the payment file2 dossier that was removed
	* @throws PortalException if a payment file2 dossier with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.PaymentFile2Dossier deletePaymentFile2Dossier(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentFile2DossierLocalService.deletePaymentFile2Dossier(id);
	}

	/**
	* Deletes the payment file2 dossier from the database. Also notifies the appropriate model listeners.
	*
	* @param paymentFile2Dossier the payment file2 dossier
	* @return the payment file2 dossier that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.PaymentFile2Dossier deletePaymentFile2Dossier(
		org.oep.core.dossiermgt.model.PaymentFile2Dossier paymentFile2Dossier)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentFile2DossierLocalService.deletePaymentFile2Dossier(paymentFile2Dossier);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _paymentFile2DossierLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentFile2DossierLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.PaymentFile2DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentFile2DossierLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.PaymentFile2DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentFile2DossierLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentFile2DossierLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentFile2DossierLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.core.dossiermgt.model.PaymentFile2Dossier fetchPaymentFile2Dossier(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentFile2DossierLocalService.fetchPaymentFile2Dossier(id);
	}

	/**
	* Returns the payment file2 dossier with the primary key.
	*
	* @param id the primary key of the payment file2 dossier
	* @return the payment file2 dossier
	* @throws PortalException if a payment file2 dossier with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.PaymentFile2Dossier getPaymentFile2Dossier(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentFile2DossierLocalService.getPaymentFile2Dossier(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentFile2DossierLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the payment file2 dossiers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.PaymentFile2DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment file2 dossiers
	* @param end the upper bound of the range of payment file2 dossiers (not inclusive)
	* @return the range of payment file2 dossiers
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.dossiermgt.model.PaymentFile2Dossier> getPaymentFile2Dossiers(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentFile2DossierLocalService.getPaymentFile2Dossiers(start,
			end);
	}

	/**
	* Returns the number of payment file2 dossiers.
	*
	* @return the number of payment file2 dossiers
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPaymentFile2DossiersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentFile2DossierLocalService.getPaymentFile2DossiersCount();
	}

	/**
	* Updates the payment file2 dossier in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param paymentFile2Dossier the payment file2 dossier
	* @return the payment file2 dossier that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.PaymentFile2Dossier updatePaymentFile2Dossier(
		org.oep.core.dossiermgt.model.PaymentFile2Dossier paymentFile2Dossier)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentFile2DossierLocalService.updatePaymentFile2Dossier(paymentFile2Dossier);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _paymentFile2DossierLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_paymentFile2DossierLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _paymentFile2DossierLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PaymentFile2DossierLocalService getWrappedPaymentFile2DossierLocalService() {
		return _paymentFile2DossierLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPaymentFile2DossierLocalService(
		PaymentFile2DossierLocalService paymentFile2DossierLocalService) {
		_paymentFile2DossierLocalService = paymentFile2DossierLocalService;
	}

	@Override
	public PaymentFile2DossierLocalService getWrappedService() {
		return _paymentFile2DossierLocalService;
	}

	@Override
	public void setWrappedService(
		PaymentFile2DossierLocalService paymentFile2DossierLocalService) {
		_paymentFile2DossierLocalService = paymentFile2DossierLocalService;
	}

	private PaymentFile2DossierLocalService _paymentFile2DossierLocalService;
}