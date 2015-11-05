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

/**
 * @author NQMINH
 */
public interface EmployeeFinder {
	public java.util.List<org.oep.usermgt.model.Employee> findByLikeName(
		java.lang.String textSearch, long workingUnitId);

	public java.util.List<org.oep.usermgt.model.Employee> findByLikeName(
		java.lang.String textSearch, long workingUnitId, int startIndex,
		int endIndex);

	public int countByLikeName(java.lang.String textSearch, long workingUnitId);
}