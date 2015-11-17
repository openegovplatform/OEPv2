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

package org.oep.dossiermgt.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import org.oep.dossiermgt.model.PaymentRequest;

/**
 * The persistence interface for the payment request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see PaymentRequestPersistenceImpl
 * @see PaymentRequestUtil
 * @generated
 */
public interface PaymentRequestPersistence extends BasePersistence<PaymentRequest> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PaymentRequestUtil} to access the payment request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the payment requests where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching payment requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.dossiermgt.model.PaymentRequest> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the payment requests where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.PaymentRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of payment requests
	* @param end the upper bound of the range of payment requests (not inclusive)
	* @return the range of matching payment requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.dossiermgt.model.PaymentRequest> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the payment requests where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.PaymentRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of payment requests
	* @param end the upper bound of the range of payment requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching payment requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.dossiermgt.model.PaymentRequest> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first payment request in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching payment request
	* @throws org.oep.dossiermgt.NoSuchPaymentRequestException if a matching payment request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.PaymentRequest findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchPaymentRequestException;

	/**
	* Returns the first payment request in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching payment request, or <code>null</code> if a matching payment request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.PaymentRequest fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last payment request in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching payment request
	* @throws org.oep.dossiermgt.NoSuchPaymentRequestException if a matching payment request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.PaymentRequest findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchPaymentRequestException;

	/**
	* Returns the last payment request in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching payment request, or <code>null</code> if a matching payment request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.PaymentRequest fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the payment requests before and after the current payment request in the ordered set where uuid = &#63;.
	*
	* @param paymentRequestId the primary key of the current payment request
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next payment request
	* @throws org.oep.dossiermgt.NoSuchPaymentRequestException if a payment request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.PaymentRequest[] findByUuid_PrevAndNext(
		long paymentRequestId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchPaymentRequestException;

	/**
	* Removes all the payment requests where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of payment requests where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching payment requests
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the payment request where uuid = &#63; and groupId = &#63; or throws a {@link org.oep.dossiermgt.NoSuchPaymentRequestException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching payment request
	* @throws org.oep.dossiermgt.NoSuchPaymentRequestException if a matching payment request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.PaymentRequest findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchPaymentRequestException;

	/**
	* Returns the payment request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching payment request, or <code>null</code> if a matching payment request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.PaymentRequest fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the payment request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching payment request, or <code>null</code> if a matching payment request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.PaymentRequest fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the payment request where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the payment request that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.PaymentRequest removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchPaymentRequestException;

	/**
	* Returns the number of payment requests where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching payment requests
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the payment requests where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching payment requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.dossiermgt.model.PaymentRequest> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the payment requests where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.PaymentRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of payment requests
	* @param end the upper bound of the range of payment requests (not inclusive)
	* @return the range of matching payment requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.dossiermgt.model.PaymentRequest> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the payment requests where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.PaymentRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of payment requests
	* @param end the upper bound of the range of payment requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching payment requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.dossiermgt.model.PaymentRequest> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first payment request in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching payment request
	* @throws org.oep.dossiermgt.NoSuchPaymentRequestException if a matching payment request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.PaymentRequest findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchPaymentRequestException;

	/**
	* Returns the first payment request in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching payment request, or <code>null</code> if a matching payment request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.PaymentRequest fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last payment request in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching payment request
	* @throws org.oep.dossiermgt.NoSuchPaymentRequestException if a matching payment request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.PaymentRequest findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchPaymentRequestException;

	/**
	* Returns the last payment request in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching payment request, or <code>null</code> if a matching payment request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.PaymentRequest fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the payment requests before and after the current payment request in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param paymentRequestId the primary key of the current payment request
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next payment request
	* @throws org.oep.dossiermgt.NoSuchPaymentRequestException if a payment request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.PaymentRequest[] findByUuid_C_PrevAndNext(
		long paymentRequestId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchPaymentRequestException;

	/**
	* Removes all the payment requests where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of payment requests where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching payment requests
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the payment request in the entity cache if it is enabled.
	*
	* @param paymentRequest the payment request
	*/
	public void cacheResult(
		org.oep.dossiermgt.model.PaymentRequest paymentRequest);

	/**
	* Caches the payment requests in the entity cache if it is enabled.
	*
	* @param paymentRequests the payment requests
	*/
	public void cacheResult(
		java.util.List<org.oep.dossiermgt.model.PaymentRequest> paymentRequests);

	/**
	* Creates a new payment request with the primary key. Does not add the payment request to the database.
	*
	* @param paymentRequestId the primary key for the new payment request
	* @return the new payment request
	*/
	public org.oep.dossiermgt.model.PaymentRequest create(long paymentRequestId);

	/**
	* Removes the payment request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param paymentRequestId the primary key of the payment request
	* @return the payment request that was removed
	* @throws org.oep.dossiermgt.NoSuchPaymentRequestException if a payment request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.PaymentRequest remove(long paymentRequestId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchPaymentRequestException;

	public org.oep.dossiermgt.model.PaymentRequest updateImpl(
		org.oep.dossiermgt.model.PaymentRequest paymentRequest)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the payment request with the primary key or throws a {@link org.oep.dossiermgt.NoSuchPaymentRequestException} if it could not be found.
	*
	* @param paymentRequestId the primary key of the payment request
	* @return the payment request
	* @throws org.oep.dossiermgt.NoSuchPaymentRequestException if a payment request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.PaymentRequest findByPrimaryKey(
		long paymentRequestId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchPaymentRequestException;

	/**
	* Returns the payment request with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param paymentRequestId the primary key of the payment request
	* @return the payment request, or <code>null</code> if a payment request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.PaymentRequest fetchByPrimaryKey(
		long paymentRequestId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the payment requests.
	*
	* @return the payment requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.dossiermgt.model.PaymentRequest> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the payment requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.PaymentRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment requests
	* @param end the upper bound of the range of payment requests (not inclusive)
	* @return the range of payment requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.dossiermgt.model.PaymentRequest> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the payment requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.PaymentRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment requests
	* @param end the upper bound of the range of payment requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of payment requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.dossiermgt.model.PaymentRequest> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the payment requests from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of payment requests.
	*
	* @return the number of payment requests
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}