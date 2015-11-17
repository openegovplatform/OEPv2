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
public class EbPartnerShipFinderUtil {
	public static java.util.List<org.oep.dossiermgt.model.EbPartnerShip> findByLikeName(
		java.lang.String name, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder()
				   .findByLikeName(name, startIndex, endIndex, serviceContext);
	}

	public static int countByLikeName(java.lang.String name,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder().countByLikeName(name, serviceContext);
	}

	public static java.util.List<org.oep.dossiermgt.model.EbPartnerShip> findByGroupLikeName(
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

	public static EbPartnerShipFinder getFinder() {
		if (_finder == null) {
			_finder = (EbPartnerShipFinder)PortletBeanLocatorUtil.locate(org.oep.dossiermgt.service.ClpSerializer.getServletContextName(),
					EbPartnerShipFinder.class.getName());

			ReferenceRegistry.registerReference(EbPartnerShipFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(EbPartnerShipFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(EbPartnerShipFinderUtil.class,
			"_finder");
	}

	private static EbPartnerShipFinder _finder;
}