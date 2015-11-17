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
public class ApplicationFinderUtil {
	public static java.util.List<org.oep.ssomgt.model.Application> getUpApplication(
		org.oep.ssomgt.model.Application app,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder().getUpApplication(app, serviceContext);
	}

	public static java.util.List<org.oep.ssomgt.model.Application> getDownApplications(
		org.oep.ssomgt.model.Application app,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder().getDownApplications(app, serviceContext);
	}

	public static org.oep.ssomgt.model.Application getDownApplication(
		org.oep.ssomgt.model.Application app,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder().getDownApplication(app, serviceContext);
	}

	public static int getMaxSequenceNo(
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder().getMaxSequenceNo(serviceContext);
	}

	public static ApplicationFinder getFinder() {
		if (_finder == null) {
			_finder = (ApplicationFinder)PortletBeanLocatorUtil.locate(org.oep.ssomgt.service.ClpSerializer.getServletContextName(),
					ApplicationFinder.class.getName());

			ReferenceRegistry.registerReference(ApplicationFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(ApplicationFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(ApplicationFinderUtil.class,
			"_finder");
	}

	private static ApplicationFinder _finder;
}