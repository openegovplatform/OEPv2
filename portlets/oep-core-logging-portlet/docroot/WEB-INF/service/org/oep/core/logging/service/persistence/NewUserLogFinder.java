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

package org.oep.core.logging.service.persistence;

/**
 * @author Brian Wing Shun Chan
 */
public interface NewUserLogFinder {
	public java.util.List<org.oep.core.logging.model.NewUserLog> getByParam(
		long companyId, long groupId, java.lang.String keyWord,
		boolean isUsername, boolean isEmail, java.util.Date fromDate,
		java.util.Date toDate, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByParam(long companyId, long groupId,
		java.lang.String keyWord, boolean isUsername, boolean isEmail,
		java.util.Date fromDate, java.util.Date toDate)
		throws com.liferay.portal.kernel.exception.SystemException;
}