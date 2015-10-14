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

package org.oep.core.dossiermgt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link StatisticByDayLocalService}.
 *
 * @author trungdk
 * @see StatisticByDayLocalService
 * @generated
 */
public class StatisticByDayLocalServiceWrapper
	implements StatisticByDayLocalService,
		ServiceWrapper<StatisticByDayLocalService> {
	public StatisticByDayLocalServiceWrapper(
		StatisticByDayLocalService statisticByDayLocalService) {
		_statisticByDayLocalService = statisticByDayLocalService;
	}

	/**
	* Adds the statistic by day to the database. Also notifies the appropriate model listeners.
	*
	* @param statisticByDay the statistic by day
	* @return the statistic by day that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.StatisticByDay addStatisticByDay(
		org.oep.core.dossiermgt.model.StatisticByDay statisticByDay)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _statisticByDayLocalService.addStatisticByDay(statisticByDay);
	}

	/**
	* Creates a new statistic by day with the primary key. Does not add the statistic by day to the database.
	*
	* @param statisticByDayId the primary key for the new statistic by day
	* @return the new statistic by day
	*/
	@Override
	public org.oep.core.dossiermgt.model.StatisticByDay createStatisticByDay(
		long statisticByDayId) {
		return _statisticByDayLocalService.createStatisticByDay(statisticByDayId);
	}

	/**
	* Deletes the statistic by day with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param statisticByDayId the primary key of the statistic by day
	* @return the statistic by day that was removed
	* @throws PortalException if a statistic by day with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.StatisticByDay deleteStatisticByDay(
		long statisticByDayId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _statisticByDayLocalService.deleteStatisticByDay(statisticByDayId);
	}

	/**
	* Deletes the statistic by day from the database. Also notifies the appropriate model listeners.
	*
	* @param statisticByDay the statistic by day
	* @return the statistic by day that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.StatisticByDay deleteStatisticByDay(
		org.oep.core.dossiermgt.model.StatisticByDay statisticByDay)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _statisticByDayLocalService.deleteStatisticByDay(statisticByDay);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _statisticByDayLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _statisticByDayLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.StatisticByDayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _statisticByDayLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.StatisticByDayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _statisticByDayLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _statisticByDayLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _statisticByDayLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.core.dossiermgt.model.StatisticByDay fetchStatisticByDay(
		long statisticByDayId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _statisticByDayLocalService.fetchStatisticByDay(statisticByDayId);
	}

	/**
	* Returns the statistic by day with the primary key.
	*
	* @param statisticByDayId the primary key of the statistic by day
	* @return the statistic by day
	* @throws PortalException if a statistic by day with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.StatisticByDay getStatisticByDay(
		long statisticByDayId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _statisticByDayLocalService.getStatisticByDay(statisticByDayId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _statisticByDayLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the statistic by daies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.StatisticByDayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of statistic by daies
	* @param end the upper bound of the range of statistic by daies (not inclusive)
	* @return the range of statistic by daies
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.dossiermgt.model.StatisticByDay> getStatisticByDaies(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _statisticByDayLocalService.getStatisticByDaies(start, end);
	}

	/**
	* Returns the number of statistic by daies.
	*
	* @return the number of statistic by daies
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getStatisticByDaiesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _statisticByDayLocalService.getStatisticByDaiesCount();
	}

	/**
	* Updates the statistic by day in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param statisticByDay the statistic by day
	* @return the statistic by day that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.StatisticByDay updateStatisticByDay(
		org.oep.core.dossiermgt.model.StatisticByDay statisticByDay)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _statisticByDayLocalService.updateStatisticByDay(statisticByDay);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _statisticByDayLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_statisticByDayLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _statisticByDayLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public StatisticByDayLocalService getWrappedStatisticByDayLocalService() {
		return _statisticByDayLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedStatisticByDayLocalService(
		StatisticByDayLocalService statisticByDayLocalService) {
		_statisticByDayLocalService = statisticByDayLocalService;
	}

	@Override
	public StatisticByDayLocalService getWrappedService() {
		return _statisticByDayLocalService;
	}

	@Override
	public void setWrappedService(
		StatisticByDayLocalService statisticByDayLocalService) {
		_statisticByDayLocalService = statisticByDayLocalService;
	}

	private StatisticByDayLocalService _statisticByDayLocalService;
}