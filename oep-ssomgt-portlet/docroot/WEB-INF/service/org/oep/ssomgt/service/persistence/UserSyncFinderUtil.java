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

package org.oep.ssomgt.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author trungdk
 */
public class UserSyncFinderUtil {
	public static java.util.List<org.oep.ssomgt.model.UserSync> findByApplicationSync(
		long applicationId, boolean isSync, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder()
				   .findByApplicationSync(applicationId, isSync, startIndex,
			endIndex, serviceContext);
	}

	public static int countByApplicationSync(long applicationId,
		boolean isSync, com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder()
				   .countByApplicationSync(applicationId, isSync, serviceContext);
	}

	public static UserSyncFinder getFinder() {
		if (_finder == null) {
			_finder = (UserSyncFinder)PortletBeanLocatorUtil.locate(org.oep.ssomgt.service.ClpSerializer.getServletContextName(),
					UserSyncFinder.class.getName());

			ReferenceRegistry.registerReference(UserSyncFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(UserSyncFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(UserSyncFinderUtil.class, "_finder");
	}

	private static UserSyncFinder _finder;
}