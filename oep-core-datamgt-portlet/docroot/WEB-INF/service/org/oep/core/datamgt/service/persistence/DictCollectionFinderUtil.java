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

package org.oep.core.datamgt.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author NQMINH
 */
public class DictCollectionFinderUtil {
	public static java.util.List<org.oep.core.datamgt.model.DictCollection> findByLikeName(
		java.lang.String name, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder()
				   .findByLikeName(name, startIndex, endIndex, serviceContext);
	}

	public static int countByLikeName(java.lang.String name,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder().countByLikeName(name, serviceContext);
	}

	public static java.util.List<org.oep.core.datamgt.model.DictCollection> findByCustomCondition(
		java.lang.String name, java.lang.String version,
		java.util.Date validatedFrom, java.util.Date validatedTo, int status,
		int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder()
				   .findByCustomCondition(name, version, validatedFrom,
			validatedTo, status, startIndex, endIndex, serviceContext);
	}

	public static int countByCustomCondition(java.lang.String name,
		java.lang.String version, java.util.Date validatedFrom,
		java.util.Date validatedTo, int status,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder()
				   .countByCustomCondition(name, version, validatedFrom,
			validatedTo, status, serviceContext);
	}

	public static DictCollectionFinder getFinder() {
		if (_finder == null) {
			_finder = (DictCollectionFinder)PortletBeanLocatorUtil.locate(org.oep.core.datamgt.service.ClpSerializer.getServletContextName(),
					DictCollectionFinder.class.getName());

			ReferenceRegistry.registerReference(DictCollectionFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(DictCollectionFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(DictCollectionFinderUtil.class,
			"_finder");
	}

	private static DictCollectionFinder _finder;
}