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

package org.oep.core.ssomgt.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author trungdk
 */
public class AppMessageFinderUtil {
	public static java.util.List<org.oep.core.ssomgt.model.AppMessage> findByCustomCondition(
		java.lang.String fromApplication, java.lang.String toUser,
		java.util.Date fromDate, java.util.Date toDate,
		java.lang.String messageType, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder()
				   .findByCustomCondition(fromApplication, toUser, fromDate,
			toDate, messageType, startIndex, endIndex, serviceContext);
	}

	public static int countByCustomCondition(java.lang.String fromApplication,
		java.lang.String toUser, java.util.Date fromDate,
		java.util.Date toDate, java.lang.String messageType,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder()
				   .countByCustomCondition(fromApplication, toUser, fromDate,
			toDate, messageType, serviceContext);
	}

	public static AppMessageFinder getFinder() {
		if (_finder == null) {
			_finder = (AppMessageFinder)PortletBeanLocatorUtil.locate(org.oep.core.ssomgt.service.ClpSerializer.getServletContextName(),
					AppMessageFinder.class.getName());

			ReferenceRegistry.registerReference(AppMessageFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(AppMessageFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(AppMessageFinderUtil.class,
			"_finder");
	}

	private static AppMessageFinder _finder;
}