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

import org.oep.dossiermgt.model.StatisticByAgency;

/**
 * The persistence interface for the statistic by agency service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see StatisticByAgencyPersistenceImpl
 * @see StatisticByAgencyUtil
 * @generated
 */
public interface StatisticByAgencyPersistence extends BasePersistence<StatisticByAgency> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StatisticByAgencyUtil} to access the statistic by agency persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the statistic by agency in the entity cache if it is enabled.
	*
	* @param statisticByAgency the statistic by agency
	*/
	public void cacheResult(
		org.oep.dossiermgt.model.StatisticByAgency statisticByAgency);

	/**
	* Caches the statistic by agencies in the entity cache if it is enabled.
	*
	* @param statisticByAgencies the statistic by agencies
	*/
	public void cacheResult(
		java.util.List<org.oep.dossiermgt.model.StatisticByAgency> statisticByAgencies);

	/**
	* Creates a new statistic by agency with the primary key. Does not add the statistic by agency to the database.
	*
	* @param statisticByAgencyId the primary key for the new statistic by agency
	* @return the new statistic by agency
	*/
	public org.oep.dossiermgt.model.StatisticByAgency create(
		long statisticByAgencyId);

	/**
	* Removes the statistic by agency with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param statisticByAgencyId the primary key of the statistic by agency
	* @return the statistic by agency that was removed
	* @throws org.oep.dossiermgt.NoSuchStatisticByAgencyException if a statistic by agency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.StatisticByAgency remove(
		long statisticByAgencyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchStatisticByAgencyException;

	public org.oep.dossiermgt.model.StatisticByAgency updateImpl(
		org.oep.dossiermgt.model.StatisticByAgency statisticByAgency)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the statistic by agency with the primary key or throws a {@link org.oep.dossiermgt.NoSuchStatisticByAgencyException} if it could not be found.
	*
	* @param statisticByAgencyId the primary key of the statistic by agency
	* @return the statistic by agency
	* @throws org.oep.dossiermgt.NoSuchStatisticByAgencyException if a statistic by agency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.StatisticByAgency findByPrimaryKey(
		long statisticByAgencyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchStatisticByAgencyException;

	/**
	* Returns the statistic by agency with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param statisticByAgencyId the primary key of the statistic by agency
	* @return the statistic by agency, or <code>null</code> if a statistic by agency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.StatisticByAgency fetchByPrimaryKey(
		long statisticByAgencyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the statistic by agencies.
	*
	* @return the statistic by agencies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.dossiermgt.model.StatisticByAgency> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the statistic by agencies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.StatisticByAgencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of statistic by agencies
	* @param end the upper bound of the range of statistic by agencies (not inclusive)
	* @return the range of statistic by agencies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.dossiermgt.model.StatisticByAgency> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the statistic by agencies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.StatisticByAgencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of statistic by agencies
	* @param end the upper bound of the range of statistic by agencies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of statistic by agencies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.dossiermgt.model.StatisticByAgency> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the statistic by agencies from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of statistic by agencies.
	*
	* @return the number of statistic by agencies
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}