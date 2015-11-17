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

package org.oep.dossiermgt.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author trungdk
 */
public class DossierProcFinderUtil {
	public static java.util.List<org.oep.dossiermgt.model.DossierProc> findByLikeName(
		java.lang.String name, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder()
				   .findByLikeName(name, startIndex, endIndex, serviceContext);
	}

	public static int countByLikeName(java.lang.String name,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder().countByLikeName(name, serviceContext);
	}

	public static java.util.List<org.oep.dossiermgt.model.DossierProc> findByGroupLikeName(
		java.lang.String name, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder()
				   .findByGroupLikeName(name, startIndex, endIndex,
			serviceContext);
	}

	public static int countByGroupLikeName(java.lang.String name,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder().countByGroupLikeName(name, serviceContext);
	}

	public static java.util.List<org.oep.dossiermgt.model.DossierProc> findByCustomCondition(
		java.lang.String name, java.util.Date effectDate,
		java.util.Date expireDate, int active, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder()
				   .findByCustomCondition(name, effectDate, expireDate, active,
			startIndex, endIndex, serviceContext);
	}

	public static int countByCustomCondition(java.lang.String name,
		java.util.Date effectDate, java.util.Date expireDate, int active,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder()
				   .countByCustomCondition(name, effectDate, expireDate,
			active, serviceContext);
	}

	public static java.util.List<org.oep.dossiermgt.model.DossierProc> findByGroupCustomCondition(
		java.lang.String name, java.lang.String administrationNo,
		java.lang.String domainNo, java.util.Date effectDate,
		java.util.Date expireDate, int active, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder()
				   .findByGroupCustomCondition(name, administrationNo,
			domainNo, effectDate, expireDate, active, startIndex, endIndex,
			serviceContext);
	}

	public static int countByGroupCustomCondition(java.lang.String name,
		java.lang.String administrationNo, java.lang.String domainNo,
		java.util.Date effectDate, java.util.Date expireDate, int active,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder()
				   .countByGroupCustomCondition(name, administrationNo,
			domainNo, effectDate, expireDate, active, serviceContext);
	}

	public static DossierProcFinder getFinder() {
		if (_finder == null) {
			_finder = (DossierProcFinder)PortletBeanLocatorUtil.locate(org.oep.dossiermgt.service.ClpSerializer.getServletContextName(),
					DossierProcFinder.class.getName());

			ReferenceRegistry.registerReference(DossierProcFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(DossierProcFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(DossierProcFinderUtil.class,
			"_finder");
	}

	private static DossierProcFinder _finder;
}