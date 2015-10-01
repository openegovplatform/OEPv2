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

import org.oep.core.processmgt.model.ProcessOrder2User;

import java.util.List;

/**
 * The persistence utility for the process order2 user service. This utility wraps {@link ProcessOrder2UserPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see ProcessOrder2UserPersistence
 * @see ProcessOrder2UserPersistenceImpl
 * @generated
 */
public class ProcessOrder2UserUtil {
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
	public static void clearCache(ProcessOrder2User processOrder2User) {
		getPersistence().clearCache(processOrder2User);
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
	public static List<ProcessOrder2User> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ProcessOrder2User> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ProcessOrder2User> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static ProcessOrder2User update(ProcessOrder2User processOrder2User)
		throws SystemException {
		return getPersistence().update(processOrder2User);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static ProcessOrder2User update(
		ProcessOrder2User processOrder2User, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(processOrder2User, serviceContext);
	}

	/**
	* Caches the process order2 user in the entity cache if it is enabled.
	*
	* @param processOrder2User the process order2 user
	*/
	public static void cacheResult(
		org.oep.core.processmgt.model.ProcessOrder2User processOrder2User) {
		getPersistence().cacheResult(processOrder2User);
	}

	/**
	* Caches the process order2 users in the entity cache if it is enabled.
	*
	* @param processOrder2Users the process order2 users
	*/
	public static void cacheResult(
		java.util.List<org.oep.core.processmgt.model.ProcessOrder2User> processOrder2Users) {
		getPersistence().cacheResult(processOrder2Users);
	}

	/**
	* Creates a new process order2 user with the primary key. Does not add the process order2 user to the database.
	*
	* @param processOrder2UserPK the primary key for the new process order2 user
	* @return the new process order2 user
	*/
	public static org.oep.core.processmgt.model.ProcessOrder2User create(
		org.oep.core.processmgt.service.persistence.ProcessOrder2UserPK processOrder2UserPK) {
		return getPersistence().create(processOrder2UserPK);
	}

	/**
	* Removes the process order2 user with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param processOrder2UserPK the primary key of the process order2 user
	* @return the process order2 user that was removed
	* @throws org.oep.core.processmgt.NoSuchProcessOrder2UserException if a process order2 user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.ProcessOrder2User remove(
		org.oep.core.processmgt.service.persistence.ProcessOrder2UserPK processOrder2UserPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.processmgt.NoSuchProcessOrder2UserException {
		return getPersistence().remove(processOrder2UserPK);
	}

	public static org.oep.core.processmgt.model.ProcessOrder2User updateImpl(
		org.oep.core.processmgt.model.ProcessOrder2User processOrder2User)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(processOrder2User);
	}

	/**
	* Returns the process order2 user with the primary key or throws a {@link org.oep.core.processmgt.NoSuchProcessOrder2UserException} if it could not be found.
	*
	* @param processOrder2UserPK the primary key of the process order2 user
	* @return the process order2 user
	* @throws org.oep.core.processmgt.NoSuchProcessOrder2UserException if a process order2 user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.ProcessOrder2User findByPrimaryKey(
		org.oep.core.processmgt.service.persistence.ProcessOrder2UserPK processOrder2UserPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.processmgt.NoSuchProcessOrder2UserException {
		return getPersistence().findByPrimaryKey(processOrder2UserPK);
	}

	/**
	* Returns the process order2 user with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param processOrder2UserPK the primary key of the process order2 user
	* @return the process order2 user, or <code>null</code> if a process order2 user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.ProcessOrder2User fetchByPrimaryKey(
		org.oep.core.processmgt.service.persistence.ProcessOrder2UserPK processOrder2UserPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(processOrder2UserPK);
	}

	/**
	* Returns all the process order2 users.
	*
	* @return the process order2 users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.processmgt.model.ProcessOrder2User> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the process order2 users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.ProcessOrder2UserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of process order2 users
	* @param end the upper bound of the range of process order2 users (not inclusive)
	* @return the range of process order2 users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.processmgt.model.ProcessOrder2User> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the process order2 users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.ProcessOrder2UserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of process order2 users
	* @param end the upper bound of the range of process order2 users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of process order2 users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.processmgt.model.ProcessOrder2User> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the process order2 users from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of process order2 users.
	*
	* @return the number of process order2 users
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ProcessOrder2UserPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ProcessOrder2UserPersistence)PortletBeanLocatorUtil.locate(org.oep.core.processmgt.service.ClpSerializer.getServletContextName(),
					ProcessOrder2UserPersistence.class.getName());

			ReferenceRegistry.registerReference(ProcessOrder2UserUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ProcessOrder2UserPersistence persistence) {
	}

	private static ProcessOrder2UserPersistence _persistence;
}