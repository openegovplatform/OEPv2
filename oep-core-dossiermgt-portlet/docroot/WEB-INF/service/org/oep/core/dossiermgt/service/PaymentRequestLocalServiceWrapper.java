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
 * Provides a wrapper for {@link PaymentRequestLocalService}.
 *
 * @author trungdk
 * @see PaymentRequestLocalService
 * @generated
 */
public class PaymentRequestLocalServiceWrapper
	implements PaymentRequestLocalService,
		ServiceWrapper<PaymentRequestLocalService> {
	public PaymentRequestLocalServiceWrapper(
		PaymentRequestLocalService paymentRequestLocalService) {
		_paymentRequestLocalService = paymentRequestLocalService;
	}

	/**
	* Adds the payment request to the database. Also notifies the appropriate model listeners.
	*
	* @param paymentRequest the payment request
	* @return the payment request that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.PaymentRequest addPaymentRequest(
		org.oep.core.dossiermgt.model.PaymentRequest paymentRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentRequestLocalService.addPaymentRequest(paymentRequest);
	}

	/**
	* Creates a new payment request with the primary key. Does not add the payment request to the database.
	*
	* @param paymentRequestId the primary key for the new payment request
	* @return the new payment request
	*/
	@Override
	public org.oep.core.dossiermgt.model.PaymentRequest createPaymentRequest(
		long paymentRequestId) {
		return _paymentRequestLocalService.createPaymentRequest(paymentRequestId);
	}

	/**
	* Deletes the payment request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param paymentRequestId the primary key of the payment request
	* @return the payment request that was removed
	* @throws PortalException if a payment request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.PaymentRequest deletePaymentRequest(
		long paymentRequestId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentRequestLocalService.deletePaymentRequest(paymentRequestId);
	}

	/**
	* Deletes the payment request from the database. Also notifies the appropriate model listeners.
	*
	* @param paymentRequest the payment request
	* @return the payment request that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.PaymentRequest deletePaymentRequest(
		org.oep.core.dossiermgt.model.PaymentRequest paymentRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentRequestLocalService.deletePaymentRequest(paymentRequest);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _paymentRequestLocalService.dynamicQuery();
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
		return _paymentRequestLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.PaymentRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _paymentRequestLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.PaymentRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _paymentRequestLocalService.dynamicQuery(dynamicQuery, start,
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
		return _paymentRequestLocalService.dynamicQueryCount(dynamicQuery);
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
		return _paymentRequestLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.core.dossiermgt.model.PaymentRequest fetchPaymentRequest(
		long paymentRequestId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentRequestLocalService.fetchPaymentRequest(paymentRequestId);
	}

	/**
	* Returns the payment request with the matching UUID and company.
	*
	* @param uuid the payment request's UUID
	* @param companyId the primary key of the company
	* @return the matching payment request, or <code>null</code> if a matching payment request could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.PaymentRequest fetchPaymentRequestByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentRequestLocalService.fetchPaymentRequestByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the payment request matching the UUID and group.
	*
	* @param uuid the payment request's UUID
	* @param groupId the primary key of the group
	* @return the matching payment request, or <code>null</code> if a matching payment request could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.PaymentRequest fetchPaymentRequestByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentRequestLocalService.fetchPaymentRequestByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the payment request with the primary key.
	*
	* @param paymentRequestId the primary key of the payment request
	* @return the payment request
	* @throws PortalException if a payment request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.PaymentRequest getPaymentRequest(
		long paymentRequestId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentRequestLocalService.getPaymentRequest(paymentRequestId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentRequestLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the payment request with the matching UUID and company.
	*
	* @param uuid the payment request's UUID
	* @param companyId the primary key of the company
	* @return the matching payment request
	* @throws PortalException if a matching payment request could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.PaymentRequest getPaymentRequestByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentRequestLocalService.getPaymentRequestByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the payment request matching the UUID and group.
	*
	* @param uuid the payment request's UUID
	* @param groupId the primary key of the group
	* @return the matching payment request
	* @throws PortalException if a matching payment request could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.PaymentRequest getPaymentRequestByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentRequestLocalService.getPaymentRequestByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns a range of all the payment requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.PaymentRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment requests
	* @param end the upper bound of the range of payment requests (not inclusive)
	* @return the range of payment requests
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.dossiermgt.model.PaymentRequest> getPaymentRequests(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentRequestLocalService.getPaymentRequests(start, end);
	}

	/**
	* Returns the number of payment requests.
	*
	* @return the number of payment requests
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPaymentRequestsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentRequestLocalService.getPaymentRequestsCount();
	}

	/**
	* Updates the payment request in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param paymentRequest the payment request
	* @return the payment request that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.PaymentRequest updatePaymentRequest(
		org.oep.core.dossiermgt.model.PaymentRequest paymentRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentRequestLocalService.updatePaymentRequest(paymentRequest);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _paymentRequestLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_paymentRequestLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _paymentRequestLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Add payment request
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Create new
	*
	* @param
	* @return: new payment request
	*/
	@Override
	public org.oep.core.dossiermgt.model.PaymentRequest addPaymentRequest(
		long organizationId, long dossierId, java.lang.String govAgentId,
		java.lang.String govAgentName, java.lang.String subjectId,
		java.lang.String subjectType, java.lang.String subjectName, int amount,
		java.lang.String requestNote, long paymentFileId, int confirmOK,
		long ebMessageId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentRequestLocalService.addPaymentRequest(organizationId,
			dossierId, govAgentId, govAgentName, subjectId, subjectType,
			subjectName, amount, requestNote, paymentFileId, confirmOK,
			ebMessageId, serviceContext);
	}

	@Override
	public org.oep.core.dossiermgt.model.PaymentRequest updatePaymentRequest(
		long id, long organizationId, long dossierId,
		java.lang.String govAgentId, java.lang.String govAgentName,
		java.lang.String subjectId, java.lang.String subjectType,
		java.lang.String subjectName, int amount, java.lang.String requestNote,
		long paymentFileId, int confirmOK, long ebMessageId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentRequestLocalService.updatePaymentRequest(id,
			organizationId, dossierId, govAgentId, govAgentName, subjectId,
			subjectType, subjectName, amount, requestNote, paymentFileId,
			confirmOK, ebMessageId, serviceContext);
	}

	@Override
	public void updatePaymentRequestResources(
		org.oep.core.dossiermgt.model.PaymentRequest paymentRequest,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_paymentRequestLocalService.updatePaymentRequestResources(paymentRequest,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void removePaymentRequest(
		org.oep.core.dossiermgt.model.PaymentRequest paymentRequest)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_paymentRequestLocalService.removePaymentRequest(paymentRequest);
	}

	@Override
	public void removePaymentRequest(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_paymentRequestLocalService.removePaymentRequest(id);
	}

	@Override
	public void addPaymentRequestResources(
		org.oep.core.dossiermgt.model.PaymentRequest paymentRequest,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_paymentRequestLocalService.addPaymentRequestResources(paymentRequest,
			addGroupPermission, addGuestPermission, serviceContext);
	}

	@Override
	public void addPaymentRequestResources(
		org.oep.core.dossiermgt.model.PaymentRequest paymentRequest,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_paymentRequestLocalService.addPaymentRequestResources(paymentRequest,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void addPaymentRequestResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_paymentRequestLocalService.addPaymentRequestResources(id,
			groupPermissions, guestPermissions, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PaymentRequestLocalService getWrappedPaymentRequestLocalService() {
		return _paymentRequestLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPaymentRequestLocalService(
		PaymentRequestLocalService paymentRequestLocalService) {
		_paymentRequestLocalService = paymentRequestLocalService;
	}

	@Override
	public PaymentRequestLocalService getWrappedService() {
		return _paymentRequestLocalService;
	}

	@Override
	public void setWrappedService(
		PaymentRequestLocalService paymentRequestLocalService) {
		_paymentRequestLocalService = paymentRequestLocalService;
	}

	private PaymentRequestLocalService _paymentRequestLocalService;
}