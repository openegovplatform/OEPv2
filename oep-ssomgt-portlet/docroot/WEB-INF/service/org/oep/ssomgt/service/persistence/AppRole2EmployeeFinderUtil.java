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
public class AppRole2EmployeeFinderUtil {
	public static int countByWorkingUnit(long workingUnitId,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder().countByWorkingUnit(workingUnitId, serviceContext);
	}

	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByWorkingUnit(
		long workingUnitId, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder()
				   .findByWorkingUnit(workingUnitId, startIndex, endIndex,
			serviceContext);
	}

	public static java.util.List<org.oep.ssomgt.model.AppRole> findRoleByEmployee(
		long employeeId, long companyId) {
		return getFinder().findRoleByEmployee(employeeId, companyId);
	}

	public static int countByAppRoleWorkingUnit(long appRoleId,
		long workingUnitId,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder()
				   .countByAppRoleWorkingUnit(appRoleId, workingUnitId,
			serviceContext);
	}

	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByAppRoleWorkingUnit(
		long appRoleId, long workingUnitId, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder()
				   .findByAppRoleWorkingUnit(appRoleId, workingUnitId,
			startIndex, endIndex, serviceContext);
	}

	public static AppRole2EmployeeFinder getFinder() {
		if (_finder == null) {
			_finder = (AppRole2EmployeeFinder)PortletBeanLocatorUtil.locate(org.oep.ssomgt.service.ClpSerializer.getServletContextName(),
					AppRole2EmployeeFinder.class.getName());

			ReferenceRegistry.registerReference(AppRole2EmployeeFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(AppRole2EmployeeFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(AppRole2EmployeeFinderUtil.class,
			"_finder");
	}

	private static AppRole2EmployeeFinder _finder;
}