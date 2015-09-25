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

package org.oep.core.datamgt.dictionary.service.persistence;

/**
 * @author TrungDK
 */
public interface DictCollectionFinder {
	public java.util.List<org.oep.core.datamgt.dictionary.model.DictCollection> findByLikeName(
		java.lang.String name, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext);

	public int countByLikeName(java.lang.String name,
		com.liferay.portal.service.ServiceContext serviceContext);

	public java.util.List<org.oep.core.datamgt.dictionary.model.DictCollection> findByCustomCondition(
		java.lang.String name, java.lang.String version,
		java.util.Date validatedFrom, java.util.Date validatedTo, int status,
		int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext);

	public int countByCustomCondition(java.lang.String name,
		java.lang.String version, java.util.Date validatedFrom,
		java.util.Date validatedTo, int status,
		com.liferay.portal.service.ServiceContext serviceContext);
}