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

package org.oep.ssomgt.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the AppRole2Employee service. Represents a row in the &quot;oep_usermgt_approle2employee&quot; database table, with each column mapped to a property of this class.
 *
 * @author trungdk
 * @see AppRole2EmployeeModel
 * @see org.oep.ssomgt.model.impl.AppRole2EmployeeImpl
 * @see org.oep.ssomgt.model.impl.AppRole2EmployeeModelImpl
 * @generated
 */
public interface AppRole2Employee extends AppRole2EmployeeModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link org.oep.ssomgt.model.impl.AppRole2EmployeeImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public org.oep.usermgt.model.Employee getEmployee();

	public org.oep.usermgt.model.WorkingUnit getWorkingUnit();
}