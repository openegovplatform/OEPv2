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

/**
 * @author trungdk
 */
public interface AppRole2EmployeeFinder {
	public int countByWorkingUnit(long workingUnitId,
		com.liferay.portal.service.ServiceContext serviceContext);

	public java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByWorkingUnit(
		long workingUnitId, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext);

	public java.util.List<org.oep.ssomgt.model.AppRole> findRoleByEmployee(
		long employeeId, long companyId);

	public int countByAppRoleWorkingUnit(long appRoleId, long workingUnitId,
		com.liferay.portal.service.ServiceContext serviceContext);

	public java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByAppRoleWorkingUnit(
		long appRoleId, long workingUnitId, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext);
}