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
 * Provides a wrapper for {@link PaymentConfigLocalService}.
 *
 * @author trungdk
 * @see PaymentConfigLocalService
 * @generated
 */
public class PaymentConfigLocalServiceWrapper
	implements PaymentConfigLocalService,
		ServiceWrapper<PaymentConfigLocalService> {
	public PaymentConfigLocalServiceWrapper(
		PaymentConfigLocalService paymentConfigLocalService) {
		_paymentConfigLocalService = paymentConfigLocalService;
	}

	/**
	* Adds the payment config to the database. Also notifies the appropriate model listeners.
	*
	* @param paymentConfig the payment config
	* @return the payment config that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.PaymentConfig addPaymentConfig(
		org.oep.core.dossiermgt.model.PaymentConfig paymentConfig)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentConfigLocalService.addPaymentConfig(paymentConfig);
	}

	/**
	* Creates a new payment config with the primary key. Does not add the payment config to the database.
	*
	* @param paymentConfigId the primary key for the new payment config
	* @return the new payment config
	*/
	@Override
	public org.oep.core.dossiermgt.model.PaymentConfig createPaymentConfig(
		long paymentConfigId) {
		return _paymentConfigLocalService.createPaymentConfig(paymentConfigId);
	}

	/**
	* Deletes the payment config with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param paymentConfigId the primary key of the payment config
	* @return the payment config that was removed
	* @throws PortalException if a payment config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.PaymentConfig deletePaymentConfig(
		long paymentConfigId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentConfigLocalService.deletePaymentConfig(paymentConfigId);
	}

	/**
	* Deletes the payment config from the database. Also notifies the appropriate model listeners.
	*
	* @param paymentConfig the payment config
	* @return the payment config that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.PaymentConfig deletePaymentConfig(
		org.oep.core.dossiermgt.model.PaymentConfig paymentConfig)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentConfigLocalService.deletePaymentConfig(paymentConfig);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _paymentConfigLocalService.dynamicQuery();
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
		return _paymentConfigLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.PaymentConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _paymentConfigLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.PaymentConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _paymentConfigLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _paymentConfigLocalService.dynamicQueryCount(dynamicQuery);
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
		return _paymentConfigLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.core.dossiermgt.model.PaymentConfig fetchPaymentConfig(
		long paymentConfigId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentConfigLocalService.fetchPaymentConfig(paymentConfigId);
	}

	/**
	* Returns the payment config with the primary key.
	*
	* @param paymentConfigId the primary key of the payment config
	* @return the payment config
	* @throws PortalException if a payment config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.PaymentConfig getPaymentConfig(
		long paymentConfigId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentConfigLocalService.getPaymentConfig(paymentConfigId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentConfigLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the payment configs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.PaymentConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment configs
	* @param end the upper bound of the range of payment configs (not inclusive)
	* @return the range of payment configs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.dossiermgt.model.PaymentConfig> getPaymentConfigs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentConfigLocalService.getPaymentConfigs(start, end);
	}

	/**
	* Returns the number of payment configs.
	*
	* @return the number of payment configs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPaymentConfigsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentConfigLocalService.getPaymentConfigsCount();
	}

	/**
	* Updates the payment config in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param paymentConfig the payment config
	* @return the payment config that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.PaymentConfig updatePaymentConfig(
		org.oep.core.dossiermgt.model.PaymentConfig paymentConfig)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentConfigLocalService.updatePaymentConfig(paymentConfig);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _paymentConfigLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_paymentConfigLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _paymentConfigLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Add dossier proc
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Create new
	*
	* @param
	* @return: new dossier proc
	*/
	@Override
	public org.oep.core.dossiermgt.model.PaymentConfig addPaymentConfig(
		java.lang.String govAgentId, java.lang.String govAgentName,
		java.lang.String bankTransfer, java.lang.String keypay,
		long ebPartnerShipId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentConfigLocalService.addPaymentConfig(govAgentId,
			govAgentName, bankTransfer, keypay, ebPartnerShipId, serviceContext);
	}

	@Override
	public org.oep.core.dossiermgt.model.PaymentConfig updatePaymentConfig(
		long id, java.lang.String govAgentId, java.lang.String govAgentName,
		java.lang.String bankTransfer, java.lang.String keypay,
		long ebPartnerShipId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentConfigLocalService.updatePaymentConfig(id, govAgentId,
			govAgentName, bankTransfer, keypay, ebPartnerShipId, serviceContext);
	}

	@Override
	public void updatePaymentConfigResources(
		org.oep.core.dossiermgt.model.PaymentConfig paymentConfig,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_paymentConfigLocalService.updatePaymentConfigResources(paymentConfig,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void removePaymentConfig(
		org.oep.core.dossiermgt.model.PaymentConfig paymentConfig)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_paymentConfigLocalService.removePaymentConfig(paymentConfig);
	}

	@Override
	public void removePaymentConfig(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_paymentConfigLocalService.removePaymentConfig(id);
	}

	@Override
	public void addPaymentConfigResources(
		org.oep.core.dossiermgt.model.PaymentConfig paymentConfig,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_paymentConfigLocalService.addPaymentConfigResources(paymentConfig,
			addGroupPermission, addGuestPermission, serviceContext);
	}

	@Override
	public void addPaymentConfigResources(
		org.oep.core.dossiermgt.model.PaymentConfig paymentConfig,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_paymentConfigLocalService.addPaymentConfigResources(paymentConfig,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void addPaymentConfigResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_paymentConfigLocalService.addPaymentConfigResources(id,
			groupPermissions, guestPermissions, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PaymentConfigLocalService getWrappedPaymentConfigLocalService() {
		return _paymentConfigLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPaymentConfigLocalService(
		PaymentConfigLocalService paymentConfigLocalService) {
		_paymentConfigLocalService = paymentConfigLocalService;
	}

	@Override
	public PaymentConfigLocalService getWrappedService() {
		return _paymentConfigLocalService;
	}

	@Override
	public void setWrappedService(
		PaymentConfigLocalService paymentConfigLocalService) {
		_paymentConfigLocalService = paymentConfigLocalService;
	}

	private PaymentConfigLocalService _paymentConfigLocalService;
}