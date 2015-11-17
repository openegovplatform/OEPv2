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

package org.oep.dossiermgt.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import org.oep.dossiermgt.model.DossierFolder2Role;
import org.oep.dossiermgt.service.DossierFolder2RoleLocalServiceUtil;

/**
 * The extended model base implementation for the DossierFolder2Role service. Represents a row in the &quot;oep_dossiermgt_dossierfolder2role&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DossierFolder2RoleImpl}.
 * </p>
 *
 * @author trungdk
 * @see DossierFolder2RoleImpl
 * @see org.oep.dossiermgt.model.DossierFolder2Role
 * @generated
 */
public abstract class DossierFolder2RoleBaseImpl
	extends DossierFolder2RoleModelImpl implements DossierFolder2Role {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dossier folder2 role model instance should use the {@link DossierFolder2Role} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DossierFolder2RoleLocalServiceUtil.addDossierFolder2Role(this);
		}
		else {
			DossierFolder2RoleLocalServiceUtil.updateDossierFolder2Role(this);
		}
	}
}