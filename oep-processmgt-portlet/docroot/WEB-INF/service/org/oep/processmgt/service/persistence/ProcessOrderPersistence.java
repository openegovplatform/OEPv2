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

package org.oep.processmgt.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import org.oep.processmgt.model.ProcessOrder;

/**
 * The persistence interface for the process order service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see ProcessOrderPersistenceImpl
 * @see ProcessOrderUtil
 * @generated
 */
public interface ProcessOrderPersistence extends BasePersistence<ProcessOrder> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProcessOrderUtil} to access the process order persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the process orders where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching process orders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.processmgt.model.ProcessOrder> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the process orders where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of process orders
	* @param end the upper bound of the range of process orders (not inclusive)
	* @return the range of matching process orders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.processmgt.model.ProcessOrder> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the process orders where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of process orders
	* @param end the upper bound of the range of process orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching process orders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.processmgt.model.ProcessOrder> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first process order in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching process order
	* @throws org.oep.processmgt.NoSuchProcessOrderException if a matching process order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.ProcessOrder findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.processmgt.NoSuchProcessOrderException;

	/**
	* Returns the first process order in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching process order, or <code>null</code> if a matching process order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.ProcessOrder fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last process order in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching process order
	* @throws org.oep.processmgt.NoSuchProcessOrderException if a matching process order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.ProcessOrder findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.processmgt.NoSuchProcessOrderException;

	/**
	* Returns the last process order in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching process order, or <code>null</code> if a matching process order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.ProcessOrder fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the process orders before and after the current process order in the ordered set where uuid = &#63;.
	*
	* @param processOrderId the primary key of the current process order
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next process order
	* @throws org.oep.processmgt.NoSuchProcessOrderException if a process order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.ProcessOrder[] findByUuid_PrevAndNext(
		long processOrderId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.processmgt.NoSuchProcessOrderException;

	/**
	* Removes all the process orders where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of process orders where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching process orders
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the process order where uuid = &#63; and groupId = &#63; or throws a {@link org.oep.processmgt.NoSuchProcessOrderException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching process order
	* @throws org.oep.processmgt.NoSuchProcessOrderException if a matching process order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.ProcessOrder findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.processmgt.NoSuchProcessOrderException;

	/**
	* Returns the process order where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching process order, or <code>null</code> if a matching process order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.ProcessOrder fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the process order where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching process order, or <code>null</code> if a matching process order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.ProcessOrder fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the process order where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the process order that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.ProcessOrder removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.processmgt.NoSuchProcessOrderException;

	/**
	* Returns the number of process orders where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching process orders
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the process orders where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching process orders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.processmgt.model.ProcessOrder> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the process orders where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of process orders
	* @param end the upper bound of the range of process orders (not inclusive)
	* @return the range of matching process orders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.processmgt.model.ProcessOrder> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the process orders where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of process orders
	* @param end the upper bound of the range of process orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching process orders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.processmgt.model.ProcessOrder> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first process order in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching process order
	* @throws org.oep.processmgt.NoSuchProcessOrderException if a matching process order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.ProcessOrder findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.processmgt.NoSuchProcessOrderException;

	/**
	* Returns the first process order in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching process order, or <code>null</code> if a matching process order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.ProcessOrder fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last process order in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching process order
	* @throws org.oep.processmgt.NoSuchProcessOrderException if a matching process order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.ProcessOrder findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.processmgt.NoSuchProcessOrderException;

	/**
	* Returns the last process order in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching process order, or <code>null</code> if a matching process order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.ProcessOrder fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the process orders before and after the current process order in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param processOrderId the primary key of the current process order
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next process order
	* @throws org.oep.processmgt.NoSuchProcessOrderException if a process order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.ProcessOrder[] findByUuid_C_PrevAndNext(
		long processOrderId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.processmgt.NoSuchProcessOrderException;

	/**
	* Removes all the process orders where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of process orders where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching process orders
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the process order in the entity cache if it is enabled.
	*
	* @param processOrder the process order
	*/
	public void cacheResult(org.oep.processmgt.model.ProcessOrder processOrder);

	/**
	* Caches the process orders in the entity cache if it is enabled.
	*
	* @param processOrders the process orders
	*/
	public void cacheResult(
		java.util.List<org.oep.processmgt.model.ProcessOrder> processOrders);

	/**
	* Creates a new process order with the primary key. Does not add the process order to the database.
	*
	* @param processOrderId the primary key for the new process order
	* @return the new process order
	*/
	public org.oep.processmgt.model.ProcessOrder create(long processOrderId);

	/**
	* Removes the process order with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param processOrderId the primary key of the process order
	* @return the process order that was removed
	* @throws org.oep.processmgt.NoSuchProcessOrderException if a process order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.ProcessOrder remove(long processOrderId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.processmgt.NoSuchProcessOrderException;

	public org.oep.processmgt.model.ProcessOrder updateImpl(
		org.oep.processmgt.model.ProcessOrder processOrder)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the process order with the primary key or throws a {@link org.oep.processmgt.NoSuchProcessOrderException} if it could not be found.
	*
	* @param processOrderId the primary key of the process order
	* @return the process order
	* @throws org.oep.processmgt.NoSuchProcessOrderException if a process order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.ProcessOrder findByPrimaryKey(
		long processOrderId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.processmgt.NoSuchProcessOrderException;

	/**
	* Returns the process order with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param processOrderId the primary key of the process order
	* @return the process order, or <code>null</code> if a process order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.ProcessOrder fetchByPrimaryKey(
		long processOrderId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the process orders.
	*
	* @return the process orders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.processmgt.model.ProcessOrder> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the process orders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of process orders
	* @param end the upper bound of the range of process orders (not inclusive)
	* @return the range of process orders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.processmgt.model.ProcessOrder> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the process orders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of process orders
	* @param end the upper bound of the range of process orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of process orders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.processmgt.model.ProcessOrder> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the process orders from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of process orders.
	*
	* @return the number of process orders
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}