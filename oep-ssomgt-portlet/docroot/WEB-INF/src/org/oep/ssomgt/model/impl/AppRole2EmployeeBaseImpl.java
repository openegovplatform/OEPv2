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

package org.oep.ssomgt.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import org.oep.ssomgt.model.AppRole2Employee;
import org.oep.ssomgt.service.AppRole2EmployeeLocalServiceUtil;

/**
 * The extended model base implementation for the AppRole2Employee service. Represents a row in the &quot;oep_usermgt_approle2employee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AppRole2EmployeeImpl}.
 * </p>
 *
 * @author trungdk
 * @see AppRole2EmployeeImpl
 * @see org.oep.ssomgt.model.AppRole2Employee
 * @generated
 */
public abstract class AppRole2EmployeeBaseImpl extends AppRole2EmployeeModelImpl
	implements AppRole2Employee {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a app role2 employee model instance should use the {@link AppRole2Employee} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AppRole2EmployeeLocalServiceUtil.addAppRole2Employee(this);
		}
		else {
			AppRole2EmployeeLocalServiceUtil.updateAppRole2Employee(this);
		}
	}
}