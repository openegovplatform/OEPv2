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

import org.oep.processmgt.model.DossierStep2Role;
import org.oep.processmgt.service.DossierStep2RoleLocalServiceUtil;

/**
 * @author trungdk
 * @generated
 */
public abstract class DossierStep2RoleActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public DossierStep2RoleActionableDynamicQuery() throws SystemException {
		setBaseLocalService(DossierStep2RoleLocalServiceUtil.getService());
		setClass(DossierStep2Role.class);

		setClassLoader(org.oep.processmgt.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("primaryKey.dossierStepId");
	}
}