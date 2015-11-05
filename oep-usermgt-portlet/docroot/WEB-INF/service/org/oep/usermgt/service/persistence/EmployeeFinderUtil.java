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
public class EmployeeFinderUtil {
	public static java.util.List<org.oep.usermgt.model.Employee> findByLikeName(
		java.lang.String textSearch, long workingUnitId) {
		return getFinder().findByLikeName(textSearch, workingUnitId);
	}

	public static java.util.List<org.oep.usermgt.model.Employee> findByLikeName(
		java.lang.String textSearch, long workingUnitId, int startIndex,
		int endIndex) {
		return getFinder()
				   .findByLikeName(textSearch, workingUnitId, startIndex,
			endIndex);
	}

	public static int countByLikeName(java.lang.String textSearch,
		long workingUnitId) {
		return getFinder().countByLikeName(textSearch, workingUnitId);
	}

	public static EmployeeFinder getFinder() {
		if (_finder == null) {
			_finder = (EmployeeFinder)PortletBeanLocatorUtil.locate(org.oep.usermgt.service.ClpSerializer.getServletContextName(),
					EmployeeFinder.class.getName());

			ReferenceRegistry.registerReference(EmployeeFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(EmployeeFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(EmployeeFinderUtil.class, "_finder");
	}

	private static EmployeeFinder _finder;
}