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

package org.oep.processmgt.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import org.oep.processmgt.model.DossierProc2Role;
import org.oep.processmgt.service.DossierProc2RoleLocalServiceUtil;

/**
 * @author trungdk
 * @generated
 */
public abstract class DossierProc2RoleActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public DossierProc2RoleActionableDynamicQuery() throws SystemException {
		setBaseLocalService(DossierProc2RoleLocalServiceUtil.getService());
		setClass(DossierProc2Role.class);

		setClassLoader(org.oep.processmgt.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("dossierProc2RoleId");
	}
}