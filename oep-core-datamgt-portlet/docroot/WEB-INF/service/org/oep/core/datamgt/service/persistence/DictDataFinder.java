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

/**
 * @author NQMINH
 */
public interface DictDataFinder {
	public java.util.List<org.oep.core.datamgt.model.DictData> findByCustomCondition(
		java.lang.String dataCode, java.lang.String collectionName,
		java.lang.String dataCodeParent, int datalevel,
		java.util.Date validatedFrom, java.util.Date validatedTo, int status,
		com.liferay.portal.service.ServiceContext serviceContext);

	public java.util.List<org.oep.core.datamgt.model.DictData> findByCustomCondition(
		java.lang.String dataCode, java.lang.String collectionName,
		java.lang.String dataCodeParent, int datalevel,
		java.util.Date validatedFrom, java.util.Date validatedTo, int status,
		int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext);

	public int countByCustomCondition(java.lang.String dataCode,
		java.lang.String collectionName, java.lang.String dataCodeParent,
		int datalevel, java.util.Date validatedFrom,
		java.util.Date validatedTo, int status,
		com.liferay.portal.service.ServiceContext serviceContext);

	public java.util.List<org.oep.core.datamgt.model.DictData> findByGroupCustomCondition(
		java.lang.String dataCode, java.lang.String collectionName,
		java.lang.String dataCodeParent, int datalevel,
		java.util.Date validatedFrom, java.util.Date validatedTo, int status,
		com.liferay.portal.service.ServiceContext serviceContext);

	public java.util.List<org.oep.core.datamgt.model.DictData> findByGroupCustomCondition(
		java.lang.String dataCode, java.lang.String collectionName,
		java.lang.String dataCodeParent, int datalevel,
		java.util.Date validatedFrom, java.util.Date validatedTo, int status,
		int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext);

	public int countByGroupCustomCondition(java.lang.String dataCode,
		java.lang.String collectionName, java.lang.String dataCodeParent,
		int datalevel, java.util.Date validatedFrom,
		java.util.Date validatedTo, int status,
		com.liferay.portal.service.ServiceContext serviceContext);
}