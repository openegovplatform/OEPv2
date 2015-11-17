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

import org.oep.dossiermgt.model.ProfileData;
import org.oep.dossiermgt.service.ProfileDataLocalServiceUtil;

/**
 * The extended model base implementation for the ProfileData service. Represents a row in the &quot;oep_dossiermgt_profiledata&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ProfileDataImpl}.
 * </p>
 *
 * @author trungdk
 * @see ProfileDataImpl
 * @see org.oep.dossiermgt.model.ProfileData
 * @generated
 */
public abstract class ProfileDataBaseImpl extends ProfileDataModelImpl
	implements ProfileData {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a profile data model instance should use the {@link ProfileData} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ProfileDataLocalServiceUtil.addProfileData(this);
		}
		else {
			ProfileDataLocalServiceUtil.updateProfileData(this);
		}
	}
}