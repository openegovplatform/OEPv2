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

package org.oep.core.dossiermgt.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author trungdk
 */
public class DocTemplateFinderUtil {
	public static java.util.List<org.oep.core.dossiermgt.model.DocTemplate> findByLikeTitle(
		java.lang.String title, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder()
				   .findByLikeTitle(title, startIndex, endIndex, serviceContext);
	}

	public static int countByLikeTitle(java.lang.String title,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder().countByLikeTitle(title, serviceContext);
	}

	public static java.util.List<org.oep.core.dossiermgt.model.DocTemplate> findByGroupLikeTitle(
		java.lang.String title, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder()
				   .findByGroupLikeTitle(title, startIndex, endIndex,
			serviceContext);
	}

	public static int countByGroupLikeTitle(java.lang.String title,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getFinder().countByGroupLikeTitle(title, serviceContext);
	}

	public static DocTemplateFinder getFinder() {
		if (_finder == null) {
			_finder = (DocTemplateFinder)PortletBeanLocatorUtil.locate(org.oep.core.dossiermgt.service.ClpSerializer.getServletContextName(),
					DocTemplateFinder.class.getName());

			ReferenceRegistry.registerReference(DocTemplateFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(DocTemplateFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(DocTemplateFinderUtil.class,
			"_finder");
	}

	private static DocTemplateFinder _finder;
}