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
public class DictDataFinderUtil {
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByCustomCondition(
		java.lang.String dataCode, java.lang.String collectionName,
		java.lang.String dataCodeParent, int datalevel,
		java.util.Date validatedFrom, java.util.Date validatedTo, int status,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder()
				   .findByCustomCondition(dataCode, collectionName,
			dataCodeParent, datalevel, validatedFrom, validatedTo, status,
			serviceContext);
	}

	public static java.util.List<org.oep.core.datamgt.model.DictData> findByCustomCondition(
		java.lang.String dataCode, java.lang.String collectionName,
		java.lang.String dataCodeParent, int datalevel,
		java.util.Date validatedFrom, java.util.Date validatedTo, int status,
		int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder()
				   .findByCustomCondition(dataCode, collectionName,
			dataCodeParent, datalevel, validatedFrom, validatedTo, status,
			startIndex, endIndex, serviceContext);
	}

	public static int countByCustomCondition(java.lang.String dataCode,
		java.lang.String collectionName, java.lang.String dataCodeParent,
		int datalevel, java.util.Date validatedFrom,
		java.util.Date validatedTo, int status,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder()
				   .countByCustomCondition(dataCode, collectionName,
			dataCodeParent, datalevel, validatedFrom, validatedTo, status,
			serviceContext);
	}

	public static java.util.List<org.oep.core.datamgt.model.DictData> findByGroupCustomCondition(
		java.lang.String dataCode, java.lang.String collectionName,
		java.lang.String dataCodeParent, int datalevel,
		java.util.Date validatedFrom, java.util.Date validatedTo, int status,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder()
				   .findByGroupCustomCondition(dataCode, collectionName,
			dataCodeParent, datalevel, validatedFrom, validatedTo, status,
			serviceContext);
	}

	public static java.util.List<org.oep.core.datamgt.model.DictData> findByGroupCustomCondition(
		java.lang.String dataCode, java.lang.String collectionName,
		java.lang.String dataCodeParent, int datalevel,
		java.util.Date validatedFrom, java.util.Date validatedTo, int status,
		int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder()
				   .findByGroupCustomCondition(dataCode, collectionName,
			dataCodeParent, datalevel, validatedFrom, validatedTo, status,
			startIndex, endIndex, serviceContext);
	}

	public static int countByGroupCustomCondition(java.lang.String dataCode,
		java.lang.String collectionName, java.lang.String dataCodeParent,
		int datalevel, java.util.Date validatedFrom,
		java.util.Date validatedTo, int status,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder()
				   .countByGroupCustomCondition(dataCode, collectionName,
			dataCodeParent, datalevel, validatedFrom, validatedTo, status,
			serviceContext);
	}

	public static DictDataFinder getFinder() {
		if (_finder == null) {
			_finder = (DictDataFinder)PortletBeanLocatorUtil.locate(org.oep.core.datamgt.service.ClpSerializer.getServletContextName(),
					DictDataFinder.class.getName());

			ReferenceRegistry.registerReference(DictDataFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(DictDataFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(DictDataFinderUtil.class, "_finder");
	}

	private static DictDataFinder _finder;
}