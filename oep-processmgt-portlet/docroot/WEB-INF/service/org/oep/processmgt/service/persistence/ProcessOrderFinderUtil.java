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
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author trungdk
 */
public class ProcessOrderFinderUtil {
	public static int countAllCanAutoCondition(
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder().countAllCanAutoCondition(serviceContext);
	}

	public static java.util.List<org.oep.processmgt.model.ProcessOrder> findAllCanAutoCondition(
		int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder()
				   .findAllCanAutoCondition(startIndex, endIndex, serviceContext);
	}

	public static java.util.List<org.oep.processmgt.model.ProcessOrder> findAllCanAutoCondition(
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder().findAllCanAutoCondition(serviceContext);
	}

	public static java.util.List<org.oep.processmgt.model.ProcessOrder> findAllCanAutoCondition(
		long companyId) {
		return getFinder().findAllCanAutoCondition(companyId);
	}

	public static int countByWaitingProcessed(long userId,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder().countByWaitingProcessed(userId, serviceContext);
	}

	public static java.util.List<org.oep.processmgt.model.ProcessOrder> findByWaitingProcessed(
		long userId, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder()
				   .findByWaitingProcessed(userId, startIndex, endIndex,
			serviceContext);
	}

	public static ProcessOrderFinder getFinder() {
		if (_finder == null) {
			_finder = (ProcessOrderFinder)PortletBeanLocatorUtil.locate(org.oep.processmgt.service.ClpSerializer.getServletContextName(),
					ProcessOrderFinder.class.getName());

			ReferenceRegistry.registerReference(ProcessOrderFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(ProcessOrderFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(ProcessOrderFinderUtil.class,
			"_finder");
	}

	private static ProcessOrderFinder _finder;
}