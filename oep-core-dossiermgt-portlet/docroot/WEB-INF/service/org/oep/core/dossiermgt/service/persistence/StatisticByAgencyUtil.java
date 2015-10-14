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

package org.oep.core.dossiermgt.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.oep.core.dossiermgt.model.StatisticByAgency;

import java.util.List;

/**
 * The persistence utility for the statistic by agency service. This utility wraps {@link StatisticByAgencyPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see StatisticByAgencyPersistence
 * @see StatisticByAgencyPersistenceImpl
 * @generated
 */
public class StatisticByAgencyUtil {
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
	public static void clearCache(StatisticByAgency statisticByAgency) {
		getPersistence().clearCache(statisticByAgency);
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
	public static List<StatisticByAgency> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<StatisticByAgency> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<StatisticByAgency> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static StatisticByAgency update(StatisticByAgency statisticByAgency)
		throws SystemException {
		return getPersistence().update(statisticByAgency);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static StatisticByAgency update(
		StatisticByAgency statisticByAgency, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(statisticByAgency, serviceContext);
	}

	/**
	* Caches the statistic by agency in the entity cache if it is enabled.
	*
	* @param statisticByAgency the statistic by agency
	*/
	public static void cacheResult(
		org.oep.core.dossiermgt.model.StatisticByAgency statisticByAgency) {
		getPersistence().cacheResult(statisticByAgency);
	}

	/**
	* Caches the statistic by agencies in the entity cache if it is enabled.
	*
	* @param statisticByAgencies the statistic by agencies
	*/
	public static void cacheResult(
		java.util.List<org.oep.core.dossiermgt.model.StatisticByAgency> statisticByAgencies) {
		getPersistence().cacheResult(statisticByAgencies);
	}

	/**
	* Creates a new statistic by agency with the primary key. Does not add the statistic by agency to the database.
	*
	* @param statisticByAgencyId the primary key for the new statistic by agency
	* @return the new statistic by agency
	*/
	public static org.oep.core.dossiermgt.model.StatisticByAgency create(
		long statisticByAgencyId) {
		return getPersistence().create(statisticByAgencyId);
	}

	/**
	* Removes the statistic by agency with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param statisticByAgencyId the primary key of the statistic by agency
	* @return the statistic by agency that was removed
	* @throws org.oep.core.dossiermgt.NoSuchStatisticByAgencyException if a statistic by agency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.StatisticByAgency remove(
		long statisticByAgencyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchStatisticByAgencyException {
		return getPersistence().remove(statisticByAgencyId);
	}

	public static org.oep.core.dossiermgt.model.StatisticByAgency updateImpl(
		org.oep.core.dossiermgt.model.StatisticByAgency statisticByAgency)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(statisticByAgency);
	}

	/**
	* Returns the statistic by agency with the primary key or throws a {@link org.oep.core.dossiermgt.NoSuchStatisticByAgencyException} if it could not be found.
	*
	* @param statisticByAgencyId the primary key of the statistic by agency
	* @return the statistic by agency
	* @throws org.oep.core.dossiermgt.NoSuchStatisticByAgencyException if a statistic by agency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.StatisticByAgency findByPrimaryKey(
		long statisticByAgencyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchStatisticByAgencyException {
		return getPersistence().findByPrimaryKey(statisticByAgencyId);
	}

	/**
	* Returns the statistic by agency with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param statisticByAgencyId the primary key of the statistic by agency
	* @return the statistic by agency, or <code>null</code> if a statistic by agency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.StatisticByAgency fetchByPrimaryKey(
		long statisticByAgencyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(statisticByAgencyId);
	}

	/**
	* Returns all the statistic by agencies.
	*
	* @return the statistic by agencies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.StatisticByAgency> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the statistic by agencies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.StatisticByAgencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of statistic by agencies
	* @param end the upper bound of the range of statistic by agencies (not inclusive)
	* @return the range of statistic by agencies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.StatisticByAgency> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the statistic by agencies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.StatisticByAgencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of statistic by agencies
	* @param end the upper bound of the range of statistic by agencies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of statistic by agencies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.StatisticByAgency> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the statistic by agencies from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of statistic by agencies.
	*
	* @return the number of statistic by agencies
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static StatisticByAgencyPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (StatisticByAgencyPersistence)PortletBeanLocatorUtil.locate(org.oep.core.dossiermgt.service.ClpSerializer.getServletContextName(),
					StatisticByAgencyPersistence.class.getName());

			ReferenceRegistry.registerReference(StatisticByAgencyUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(StatisticByAgencyPersistence persistence) {
	}

	private static StatisticByAgencyPersistence _persistence;
}