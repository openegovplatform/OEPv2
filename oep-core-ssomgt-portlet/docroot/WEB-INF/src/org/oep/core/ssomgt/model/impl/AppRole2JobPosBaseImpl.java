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

package org.oep.core.ssomgt.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import org.oep.core.ssomgt.model.AppRole2JobPos;
import org.oep.core.ssomgt.service.AppRole2JobPosLocalServiceUtil;

/**
 * The extended model base implementation for the AppRole2JobPos service. Represents a row in the &quot;oep_ssomgt_approle2jobpos&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AppRole2JobPosImpl}.
 * </p>
 *
 * @author trungdk
 * @see AppRole2JobPosImpl
 * @see org.oep.core.ssomgt.model.AppRole2JobPos
 * @generated
 */
public abstract class AppRole2JobPosBaseImpl extends AppRole2JobPosModelImpl
	implements AppRole2JobPos {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a app role2 job pos model instance should use the {@link AppRole2JobPos} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AppRole2JobPosLocalServiceUtil.addAppRole2JobPos(this);
		}
		else {
			AppRole2JobPosLocalServiceUtil.updateAppRole2JobPos(this);
		}
	}
}