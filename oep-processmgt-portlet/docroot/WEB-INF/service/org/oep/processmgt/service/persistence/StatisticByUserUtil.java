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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.oep.processmgt.model.StatisticByUser;

import java.util.List;

/**
 * The persistence utility for the statistic by user service. This utility wraps {@link StatisticByUserPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see StatisticByUserPersistence
 * @see StatisticByUserPersistenceImpl
 * @generated
 */
public class StatisticByUserUtil {
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
	public static void clearCache(StatisticByUser statisticByUser) {
		getPersistence().clearCache(statisticByUser);
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
	public static List<StatisticByUser> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<StatisticByUser> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<StatisticByUser> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static StatisticByUser update(StatisticByUser statisticByUser)
		throws SystemException {
		return getPersistence().update(statisticByUser);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static StatisticByUser update(StatisticByUser statisticByUser,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(statisticByUser, serviceContext);
	}

	/**
	* Caches the statistic by user in the entity cache if it is enabled.
	*
	* @param statisticByUser the statistic by user
	*/
	public static void cacheResult(
		org.oep.processmgt.model.StatisticByUser statisticByUser) {
		getPersistence().cacheResult(statisticByUser);
	}

	/**
	* Caches the statistic by users in the entity cache if it is enabled.
	*
	* @param statisticByUsers the statistic by users
	*/
	public static void cacheResult(
		java.util.List<org.oep.processmgt.model.StatisticByUser> statisticByUsers) {
		getPersistence().cacheResult(statisticByUsers);
	}

	/**
	* Creates a new statistic by user with the primary key. Does not add the statistic by user to the database.
	*
	* @param statisticByUserId the primary key for the new statistic by user
	* @return the new statistic by user
	*/
	public static org.oep.processmgt.model.StatisticByUser create(
		long statisticByUserId) {
		return getPersistence().create(statisticByUserId);
	}

	/**
	* Removes the statistic by user with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param statisticByUserId the primary key of the statistic by user
	* @return the statistic by user that was removed
	* @throws org.oep.processmgt.NoSuchStatisticByUserException if a statistic by user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.processmgt.model.StatisticByUser remove(
		long statisticByUserId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.processmgt.NoSuchStatisticByUserException {
		return getPersistence().remove(statisticByUserId);
	}

	public static org.oep.processmgt.model.StatisticByUser updateImpl(
		org.oep.processmgt.model.StatisticByUser statisticByUser)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(statisticByUser);
	}

	/**
	* Returns the statistic by user with the primary key or throws a {@link org.oep.processmgt.NoSuchStatisticByUserException} if it could not be found.
	*
	* @param statisticByUserId the primary key of the statistic by user
	* @return the statistic by user
	* @throws org.oep.processmgt.NoSuchStatisticByUserException if a statistic by user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.processmgt.model.StatisticByUser findByPrimaryKey(
		long statisticByUserId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.processmgt.NoSuchStatisticByUserException {
		return getPersistence().findByPrimaryKey(statisticByUserId);
	}

	/**
	* Returns the statistic by user with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param statisticByUserId the primary key of the statistic by user
	* @return the statistic by user, or <code>null</code> if a statistic by user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.processmgt.model.StatisticByUser fetchByPrimaryKey(
		long statisticByUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(statisticByUserId);
	}

	/**
	* Returns all the statistic by users.
	*
	* @return the statistic by users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.processmgt.model.StatisticByUser> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the statistic by users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.StatisticByUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of statistic by users
	* @param end the upper bound of the range of statistic by users (not inclusive)
	* @return the range of statistic by users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.processmgt.model.StatisticByUser> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the statistic by users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.StatisticByUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of statistic by users
	* @param end the upper bound of the range of statistic by users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of statistic by users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.processmgt.model.StatisticByUser> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the statistic by users from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of statistic by users.
	*
	* @return the number of statistic by users
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static StatisticByUserPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (StatisticByUserPersistence)PortletBeanLocatorUtil.locate(org.oep.processmgt.service.ClpSerializer.getServletContextName(),
					StatisticByUserPersistence.class.getName());

			ReferenceRegistry.registerReference(StatisticByUserUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(StatisticByUserPersistence persistence) {
	}

	private static StatisticByUserPersistence _persistence;
}