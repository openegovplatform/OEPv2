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
public class WorkingUnitFinderUtil {
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findByLikeName(
		java.lang.String textSearch, long parentWorkingUnitId,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder()
				   .findByLikeName(textSearch, parentWorkingUnitId,
			serviceContext);
	}

	public static java.util.List<java.lang.Object[]> findByLikeNameShort(
		java.lang.String textSearch, long parentWorkingUnitId,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder()
				   .findByLikeNameShort(textSearch, parentWorkingUnitId,
			serviceContext);
	}

	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findByLikeName(
		java.lang.String textSearch, long parentWorkingUnitId, int startIndex,
		int endIndex, com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder()
				   .findByLikeName(textSearch, parentWorkingUnitId, startIndex,
			endIndex, serviceContext);
	}

	public static java.util.List<java.lang.Object[]> findByLikeNameShort(
		java.lang.String textSearch, long parentWorkingUnitId, int startIndex,
		int endIndex, com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder()
				   .findByLikeNameShort(textSearch, parentWorkingUnitId,
			startIndex, endIndex, serviceContext);
	}

	public static int countByLikeName(java.lang.String textSearch,
		long parentWorkingUnitId,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder()
				   .countByLikeName(textSearch, parentWorkingUnitId,
			serviceContext);
	}

	public static WorkingUnitFinder getFinder() {
		if (_finder == null) {
			_finder = (WorkingUnitFinder)PortletBeanLocatorUtil.locate(org.oep.usermgt.service.ClpSerializer.getServletContextName(),
					WorkingUnitFinder.class.getName());

			ReferenceRegistry.registerReference(WorkingUnitFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(WorkingUnitFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(WorkingUnitFinderUtil.class,
			"_finder");
	}

	private static WorkingUnitFinder _finder;
}