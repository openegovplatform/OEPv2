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

/**
 * @author trungdk
 */
public interface DossierProcFinder {
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByLikeName(
		java.lang.String name, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext);

	public int countByLikeName(java.lang.String name,
		com.liferay.portal.service.ServiceContext serviceContext);

	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByGroupLikeName(
		java.lang.String name, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext);

	public int countByGroupLikeName(java.lang.String name,
		com.liferay.portal.service.ServiceContext serviceContext);

	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByCustomCondition(
		java.lang.String name, java.util.Date effectDate,
		java.util.Date expireDate, int active, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext);

	public int countByCustomCondition(java.lang.String name,
		java.util.Date effectDate, java.util.Date expireDate, int active,
		com.liferay.portal.service.ServiceContext serviceContext);

	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByGroupCustomCondition(
		java.lang.String name, java.lang.String administrationNo,
		java.lang.String domainNo, java.util.Date effectDate,
		java.util.Date expireDate, int active, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext);

	public int countByGroupCustomCondition(java.lang.String name,
		java.lang.String administrationNo, java.lang.String domainNo,
		java.util.Date effectDate, java.util.Date expireDate, int active,
		com.liferay.portal.service.ServiceContext serviceContext);
}