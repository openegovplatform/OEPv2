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
public class NewUserLogFinderUtil {
	public static java.util.List<org.oep.core.logging.model.NewUserLog> getByParam(
		long companyId, long groupId, java.lang.String keyWord,
		boolean isUsername, boolean isEmail, java.util.Date fromDate,
		java.util.Date toDate, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .getByParam(companyId, groupId, keyWord, isUsername,
			isEmail, fromDate, toDate, begin, end);
	}

	public static int countByParam(long companyId, long groupId,
		java.lang.String keyWord, boolean isUsername, boolean isEmail,
		java.util.Date fromDate, java.util.Date toDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countByParam(companyId, groupId, keyWord, isUsername,
			isEmail, fromDate, toDate);
	}

	public static NewUserLogFinder getFinder() {
		if (_finder == null) {
			_finder = (NewUserLogFinder)PortletBeanLocatorUtil.locate(org.oep.core.logging.service.ClpSerializer.getServletContextName(),
					NewUserLogFinder.class.getName());

			ReferenceRegistry.registerReference(NewUserLogFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(NewUserLogFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(NewUserLogFinderUtil.class,
			"_finder");
	}

	private static NewUserLogFinder _finder;
}