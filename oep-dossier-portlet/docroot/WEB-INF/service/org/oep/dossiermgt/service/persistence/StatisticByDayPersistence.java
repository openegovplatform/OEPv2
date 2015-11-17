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

import org.oep.dossiermgt.model.StatisticByDay;

/**
 * The persistence interface for the statistic by day service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see StatisticByDayPersistenceImpl
 * @see StatisticByDayUtil
 * @generated
 */
public interface StatisticByDayPersistence extends BasePersistence<StatisticByDay> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StatisticByDayUtil} to access the statistic by day persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the statistic by day in the entity cache if it is enabled.
	*
	* @param statisticByDay the statistic by day
	*/
	public void cacheResult(
		org.oep.dossiermgt.model.StatisticByDay statisticByDay);

	/**
	* Caches the statistic by daies in the entity cache if it is enabled.
	*
	* @param statisticByDaies the statistic by daies
	*/
	public void cacheResult(
		java.util.List<org.oep.dossiermgt.model.StatisticByDay> statisticByDaies);

	/**
	* Creates a new statistic by day with the primary key. Does not add the statistic by day to the database.
	*
	* @param statisticByDayId the primary key for the new statistic by day
	* @return the new statistic by day
	*/
	public org.oep.dossiermgt.model.StatisticByDay create(long statisticByDayId);

	/**
	* Removes the statistic by day with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param statisticByDayId the primary key of the statistic by day
	* @return the statistic by day that was removed
	* @throws org.oep.dossiermgt.NoSuchStatisticByDayException if a statistic by day with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.StatisticByDay remove(long statisticByDayId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchStatisticByDayException;

	public org.oep.dossiermgt.model.StatisticByDay updateImpl(
		org.oep.dossiermgt.model.StatisticByDay statisticByDay)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the statistic by day with the primary key or throws a {@link org.oep.dossiermgt.NoSuchStatisticByDayException} if it could not be found.
	*
	* @param statisticByDayId the primary key of the statistic by day
	* @return the statistic by day
	* @throws org.oep.dossiermgt.NoSuchStatisticByDayException if a statistic by day with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.StatisticByDay findByPrimaryKey(
		long statisticByDayId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchStatisticByDayException;

	/**
	* Returns the statistic by day with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param statisticByDayId the primary key of the statistic by day
	* @return the statistic by day, or <code>null</code> if a statistic by day with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.StatisticByDay fetchByPrimaryKey(
		long statisticByDayId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the statistic by daies.
	*
	* @return the statistic by daies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.dossiermgt.model.StatisticByDay> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the statistic by daies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.StatisticByDayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of statistic by daies
	* @param end the upper bound of the range of statistic by daies (not inclusive)
	* @return the range of statistic by daies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.dossiermgt.model.StatisticByDay> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the statistic by daies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.StatisticByDayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of statistic by daies
	* @param end the upper bound of the range of statistic by daies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of statistic by daies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.dossiermgt.model.StatisticByDay> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the statistic by daies from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of statistic by daies.
	*
	* @return the number of statistic by daies
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}