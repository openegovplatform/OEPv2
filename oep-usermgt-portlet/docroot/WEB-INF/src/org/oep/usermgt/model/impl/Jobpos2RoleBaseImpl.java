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

package org.oep.usermgt.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import org.oep.usermgt.model.Jobpos2Role;
import org.oep.usermgt.service.Jobpos2RoleLocalServiceUtil;

/**
 * The extended model base implementation for the Jobpos2Role service. Represents a row in the &quot;oep_usermgt_jobpos2role&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link Jobpos2RoleImpl}.
 * </p>
 *
 * @author NQMINH
 * @see Jobpos2RoleImpl
 * @see org.oep.usermgt.model.Jobpos2Role
 * @generated
 */
public abstract class Jobpos2RoleBaseImpl extends Jobpos2RoleModelImpl
	implements Jobpos2Role {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a jobpos to role model instance should use the {@link Jobpos2Role} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			Jobpos2RoleLocalServiceUtil.addJobpos2Role(this);
		}
		else {
			Jobpos2RoleLocalServiceUtil.updateJobpos2Role(this);
		}
	}
}