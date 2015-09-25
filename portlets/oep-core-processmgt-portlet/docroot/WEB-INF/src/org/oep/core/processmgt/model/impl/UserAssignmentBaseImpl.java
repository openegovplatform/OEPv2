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

package org.oep.core.processmgt.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import org.oep.core.processmgt.model.UserAssignment;
import org.oep.core.processmgt.service.UserAssignmentLocalServiceUtil;

/**
 * The extended model base implementation for the UserAssignment service. Represents a row in the &quot;oep_processmgt_UserAssignment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UserAssignmentImpl}.
 * </p>
 *
 * @author trungdk
 * @see UserAssignmentImpl
 * @see org.oep.core.processmgt.model.UserAssignment
 * @generated
 */
public abstract class UserAssignmentBaseImpl extends UserAssignmentModelImpl
	implements UserAssignment {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a user assignment model instance should use the {@link UserAssignment} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			UserAssignmentLocalServiceUtil.addUserAssignment(this);
		}
		else {
			UserAssignmentLocalServiceUtil.updateUserAssignment(this);
		}
	}
}