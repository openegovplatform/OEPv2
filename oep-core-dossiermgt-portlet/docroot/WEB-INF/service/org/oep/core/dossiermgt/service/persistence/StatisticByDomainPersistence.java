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

import com.liferay.portal.service.persistence.BasePersistence;

import org.oep.core.dossiermgt.model.StatisticByDomain;

/**
 * The persistence interface for the statistic by domain service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see StatisticByDomainPersistenceImpl
 * @see StatisticByDomainUtil
 * @generated
 */
public interface StatisticByDomainPersistence extends BasePersistence<StatisticByDomain> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StatisticByDomainUtil} to access the statistic by domain persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the statistic by domain in the entity cache if it is enabled.
	*
	* @param statisticByDomain the statistic by domain
	*/
	public void cacheResult(
		org.oep.core.dossiermgt.model.StatisticByDomain statisticByDomain);

	/**
	* Caches the statistic by domains in the entity cache if it is enabled.
	*
	* @param statisticByDomains the statistic by domains
	*/
	public void cacheResult(
		java.util.List<org.oep.core.dossiermgt.model.StatisticByDomain> statisticByDomains);

	/**
	* Creates a new statistic by domain with the primary key. Does not add the statistic by domain to the database.
	*
	* @param statisticByDomainId the primary key for the new statistic by domain
	* @return the new statistic by domain
	*/
	public org.oep.core.dossiermgt.model.StatisticByDomain create(
		long statisticByDomainId);

	/**
	* Removes the statistic by domain with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param statisticByDomainId the primary key of the statistic by domain
	* @return the statistic by domain that was removed
	* @throws org.oep.core.dossiermgt.NoSuchStatisticByDomainException if a statistic by domain with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.StatisticByDomain remove(
		long statisticByDomainId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchStatisticByDomainException;

	public org.oep.core.dossiermgt.model.StatisticByDomain updateImpl(
		org.oep.core.dossiermgt.model.StatisticByDomain statisticByDomain)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the statistic by domain with the primary key or throws a {@link org.oep.core.dossiermgt.NoSuchStatisticByDomainException} if it could not be found.
	*
	* @param statisticByDomainId the primary key of the statistic by domain
	* @return the statistic by domain
	* @throws org.oep.core.dossiermgt.NoSuchStatisticByDomainException if a statistic by domain with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.StatisticByDomain findByPrimaryKey(
		long statisticByDomainId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchStatisticByDomainException;

	/**
	* Returns the statistic by domain with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param statisticByDomainId the primary key of the statistic by domain
	* @return the statistic by domain, or <code>null</code> if a statistic by domain with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.StatisticByDomain fetchByPrimaryKey(
		long statisticByDomainId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the statistic by domains.
	*
	* @return the statistic by domains
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.StatisticByDomain> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the statistic by domains.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.StatisticByDomainModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of statistic by domains
	* @param end the upper bound of the range of statistic by domains (not inclusive)
	* @return the range of statistic by domains
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.StatisticByDomain> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the statistic by domains.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.StatisticByDomainModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of statistic by domains
	* @param end the upper bound of the range of statistic by domains (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of statistic by domains
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.StatisticByDomain> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the statistic by domains from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of statistic by domains.
	*
	* @return the number of statistic by domains
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}