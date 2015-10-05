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

package org.oep.core.logging.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author Brian Wing Shun Chan
 */
public class UserActivityFinderUtil {
	public static java.util.List<org.oep.core.logging.model.UserActivity> getByParam(
		long companyId, long groupId, java.lang.String action,
		java.util.Date fromDate, java.util.Date toDate, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .getByParam(companyId, groupId, action, fromDate, toDate,
			begin, end);
	}

	public static int countByParam(long companyId, long groupId,
		java.lang.String action, java.util.Date fromDate, java.util.Date toDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countByParam(companyId, groupId, action, fromDate, toDate);
	}

	public static java.util.List<java.lang.String> getDistinctAction(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().getDistinctAction(companyId, groupId);
	}

	public static UserActivityFinder getFinder() {
		if (_finder == null) {
			_finder = (UserActivityFinder)PortletBeanLocatorUtil.locate(org.oep.core.logging.service.ClpSerializer.getServletContextName(),
					UserActivityFinder.class.getName());

			ReferenceRegistry.registerReference(UserActivityFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(UserActivityFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(UserActivityFinderUtil.class,
			"_finder");
	}

	private static UserActivityFinder _finder;
}