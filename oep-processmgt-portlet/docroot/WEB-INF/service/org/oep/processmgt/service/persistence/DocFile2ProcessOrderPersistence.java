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

import org.oep.processmgt.model.DocFile2ProcessOrder;

/**
 * The persistence interface for the doc file2 process order service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DocFile2ProcessOrderPersistenceImpl
 * @see DocFile2ProcessOrderUtil
 * @generated
 */
public interface DocFile2ProcessOrderPersistence extends BasePersistence<DocFile2ProcessOrder> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DocFile2ProcessOrderUtil} to access the doc file2 process order persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the doc file2 process order in the entity cache if it is enabled.
	*
	* @param docFile2ProcessOrder the doc file2 process order
	*/
	public void cacheResult(
		org.oep.processmgt.model.DocFile2ProcessOrder docFile2ProcessOrder);

	/**
	* Caches the doc file2 process orders in the entity cache if it is enabled.
	*
	* @param docFile2ProcessOrders the doc file2 process orders
	*/
	public void cacheResult(
		java.util.List<org.oep.processmgt.model.DocFile2ProcessOrder> docFile2ProcessOrders);

	/**
	* Creates a new doc file2 process order with the primary key. Does not add the doc file2 process order to the database.
	*
	* @param docFileId the primary key for the new doc file2 process order
	* @return the new doc file2 process order
	*/
	public org.oep.processmgt.model.DocFile2ProcessOrder create(long docFileId);

	/**
	* Removes the doc file2 process order with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param docFileId the primary key of the doc file2 process order
	* @return the doc file2 process order that was removed
	* @throws org.oep.processmgt.NoSuchDocFile2ProcessOrderException if a doc file2 process order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.DocFile2ProcessOrder remove(long docFileId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.processmgt.NoSuchDocFile2ProcessOrderException;

	public org.oep.processmgt.model.DocFile2ProcessOrder updateImpl(
		org.oep.processmgt.model.DocFile2ProcessOrder docFile2ProcessOrder)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the doc file2 process order with the primary key or throws a {@link org.oep.processmgt.NoSuchDocFile2ProcessOrderException} if it could not be found.
	*
	* @param docFileId the primary key of the doc file2 process order
	* @return the doc file2 process order
	* @throws org.oep.processmgt.NoSuchDocFile2ProcessOrderException if a doc file2 process order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.DocFile2ProcessOrder findByPrimaryKey(
		long docFileId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.processmgt.NoSuchDocFile2ProcessOrderException;

	/**
	* Returns the doc file2 process order with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param docFileId the primary key of the doc file2 process order
	* @return the doc file2 process order, or <code>null</code> if a doc file2 process order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.DocFile2ProcessOrder fetchByPrimaryKey(
		long docFileId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the doc file2 process orders.
	*
	* @return the doc file2 process orders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.processmgt.model.DocFile2ProcessOrder> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the doc file2 process orders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.DocFile2ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of doc file2 process orders
	* @param end the upper bound of the range of doc file2 process orders (not inclusive)
	* @return the range of doc file2 process orders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.processmgt.model.DocFile2ProcessOrder> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the doc file2 process orders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.DocFile2ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of doc file2 process orders
	* @param end the upper bound of the range of doc file2 process orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of doc file2 process orders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.processmgt.model.DocFile2ProcessOrder> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the doc file2 process orders from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of doc file2 process orders.
	*
	* @return the number of doc file2 process orders
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}