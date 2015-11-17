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

package org.oep.dossiermgt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link StatisticByDayService}.
 *
 * @author trungdk
 * @see StatisticByDayService
 * @generated
 */
public class StatisticByDayServiceWrapper implements StatisticByDayService,
	ServiceWrapper<StatisticByDayService> {
	public StatisticByDayServiceWrapper(
		StatisticByDayService statisticByDayService) {
		_statisticByDayService = statisticByDayService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _statisticByDayService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_statisticByDayService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _statisticByDayService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public StatisticByDayService getWrappedStatisticByDayService() {
		return _statisticByDayService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedStatisticByDayService(
		StatisticByDayService statisticByDayService) {
		_statisticByDayService = statisticByDayService;
	}

	@Override
	public StatisticByDayService getWrappedService() {
		return _statisticByDayService;
	}

	@Override
	public void setWrappedService(StatisticByDayService statisticByDayService) {
		_statisticByDayService = statisticByDayService;
	}

	private StatisticByDayService _statisticByDayService;
}