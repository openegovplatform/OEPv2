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

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import org.oep.ssomgt.model.AppRole2JobPos;
import org.oep.ssomgt.service.AppRole2JobPosLocalServiceUtil;

/**
 * @author trungdk
 * @generated
 */
public abstract class AppRole2JobPosActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public AppRole2JobPosActionableDynamicQuery() throws SystemException {
		setBaseLocalService(AppRole2JobPosLocalServiceUtil.getService());
		setClass(AppRole2JobPos.class);

		setClassLoader(org.oep.ssomgt.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("appRole2JobPosId");
	}
}