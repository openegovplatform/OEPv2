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

package org.oep.core.processmgt.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.oep.core.processmgt.model.DocFile2ProcessOrder;

import java.util.List;

/**
 * The persistence utility for the doc file2 process order service. This utility wraps {@link DocFile2ProcessOrderPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DocFile2ProcessOrderPersistence
 * @see DocFile2ProcessOrderPersistenceImpl
 * @generated
 */
public class DocFile2ProcessOrderUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(DocFile2ProcessOrder docFile2ProcessOrder) {
		getPersistence().clearCache(docFile2ProcessOrder);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DocFile2ProcessOrder> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DocFile2ProcessOrder> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DocFile2ProcessOrder> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DocFile2ProcessOrder update(
		DocFile2ProcessOrder docFile2ProcessOrder) throws SystemException {
		return getPersistence().update(docFile2ProcessOrder);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DocFile2ProcessOrder update(
		DocFile2ProcessOrder docFile2ProcessOrder, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(docFile2ProcessOrder, serviceContext);
	}

	/**
	* Caches the doc file2 process order in the entity cache if it is enabled.
	*
	* @param docFile2ProcessOrder the doc file2 process order
	*/
	public static void cacheResult(
		org.oep.core.processmgt.model.DocFile2ProcessOrder docFile2ProcessOrder) {
		getPersistence().cacheResult(docFile2ProcessOrder);
	}

	/**
	* Caches the doc file2 process orders in the entity cache if it is enabled.
	*
	* @param docFile2ProcessOrders the doc file2 process orders
	*/
	public static void cacheResult(
		java.util.List<org.oep.core.processmgt.model.DocFile2ProcessOrder> docFile2ProcessOrders) {
		getPersistence().cacheResult(docFile2ProcessOrders);
	}

	/**
	* Creates a new doc file2 process order with the primary key. Does not add the doc file2 process order to the database.
	*
	* @param docFileId the primary key for the new doc file2 process order
	* @return the new doc file2 process order
	*/
	public static org.oep.core.processmgt.model.DocFile2ProcessOrder create(
		long docFileId) {
		return getPersistence().create(docFileId);
	}

	/**
	* Removes the doc file2 process order with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param docFileId the primary key of the doc file2 process order
	* @return the doc file2 process order that was removed
	* @throws org.oep.core.processmgt.NoSuchDocFile2ProcessOrderException if a doc file2 process order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.DocFile2ProcessOrder remove(
		long docFileId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.processmgt.NoSuchDocFile2ProcessOrderException {
		return getPersistence().remove(docFileId);
	}

	public static org.oep.core.processmgt.model.DocFile2ProcessOrder updateImpl(
		org.oep.core.processmgt.model.DocFile2ProcessOrder docFile2ProcessOrder)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(docFile2ProcessOrder);
	}

	/**
	* Returns the doc file2 process order with the primary key or throws a {@link org.oep.core.processmgt.NoSuchDocFile2ProcessOrderException} if it could not be found.
	*
	* @param docFileId the primary key of the doc file2 process order
	* @return the doc file2 process order
	* @throws org.oep.core.processmgt.NoSuchDocFile2ProcessOrderException if a doc file2 process order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.DocFile2ProcessOrder findByPrimaryKey(
		long docFileId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.processmgt.NoSuchDocFile2ProcessOrderException {
		return getPersistence().findByPrimaryKey(docFileId);
	}

	/**
	* Returns the doc file2 process order with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param docFileId the primary key of the doc file2 process order
	* @return the doc file2 process order, or <code>null</code> if a doc file2 process order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.DocFile2ProcessOrder fetchByPrimaryKey(
		long docFileId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(docFileId);
	}

	/**
	* Returns all the doc file2 process orders.
	*
	* @return the doc file2 process orders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.processmgt.model.DocFile2ProcessOrder> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the doc file2 process orders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DocFile2ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of doc file2 process orders
	* @param end the upper bound of the range of doc file2 process orders (not inclusive)
	* @return the range of doc file2 process orders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.processmgt.model.DocFile2ProcessOrder> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the doc file2 process orders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DocFile2ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of doc file2 process orders
	* @param end the upper bound of the range of doc file2 process orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of doc file2 process orders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.processmgt.model.DocFile2ProcessOrder> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the doc file2 process orders from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of doc file2 process orders.
	*
	* @return the number of doc file2 process orders
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DocFile2ProcessOrderPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DocFile2ProcessOrderPersistence)PortletBeanLocatorUtil.locate(org.oep.core.processmgt.service.ClpSerializer.getServletContextName(),
					DocFile2ProcessOrderPersistence.class.getName());

			ReferenceRegistry.registerReference(DocFile2ProcessOrderUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DocFile2ProcessOrderPersistence persistence) {
	}

	private static DocFile2ProcessOrderPersistence _persistence;
}