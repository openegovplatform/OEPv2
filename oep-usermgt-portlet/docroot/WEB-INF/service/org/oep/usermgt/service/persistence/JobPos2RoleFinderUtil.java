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

package org.oep.usermgt.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author NQMINH
 */
public class JobPos2RoleFinderUtil {
	public static java.util.List<com.liferay.portal.model.Role> findRoleByJobPosId(
		long jobPosId) {
		return getFinder().findRoleByJobPosId(jobPosId);
	}

	public static java.util.List<com.liferay.portal.model.Role> findRoleNotInJobPosId(
		long jobPosId) {
		return getFinder().findRoleNotInJobPosId(jobPosId);
	}

	public static JobPos2RoleFinder getFinder() {
		if (_finder == null) {
			_finder = (JobPos2RoleFinder)PortletBeanLocatorUtil.locate(org.oep.usermgt.service.ClpSerializer.getServletContextName(),
					JobPos2RoleFinder.class.getName());

			ReferenceRegistry.registerReference(JobPos2RoleFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(JobPos2RoleFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(JobPos2RoleFinderUtil.class,
			"_finder");
	}

	private static JobPos2RoleFinder _finder;
}