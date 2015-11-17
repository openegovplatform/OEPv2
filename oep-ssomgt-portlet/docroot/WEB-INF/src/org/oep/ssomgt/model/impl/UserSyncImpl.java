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

import java.util.List;

import org.oep.ssomgt.model.AppRole;
import org.oep.ssomgt.model.Application;
import org.oep.ssomgt.service.AppRole2EmployeeLocalServiceUtil;
import org.oep.ssomgt.service.ApplicationLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model implementation for the UserSync service. Represents a row in the &quot;oep_usermgt_usersync&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.ssomgt.model.UserSync} interface.
 * </p>
 *
 * @author trungdk
 */
public class UserSyncImpl extends UserSyncBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. All methods that expect a user sync model instance should use the {@link org.oep.ssomgt.model.UserSync} interface instead.
	 */
	public UserSyncImpl() {
	}
	
	public Application getApplication() {
		Application app = null;
		try {
			app = ApplicationLocalServiceUtil.getApplication(getApplicationId());
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return app;
	}
	/*
	public String getRoles() {
		Application app = getApplication();
		StringBuilder roles = new StringBuilder();
		boolean first = true;
		try {
			List<AppRole> lstAppRoles = AppRole2EmployeeLocalServiceUtil.findRoleByEmployee(getEmployeeId(), app.getCompanyId());
			for (AppRole ar : lstAppRoles) {
				if (first) {
					roles.append(ar.getRoleCode());
					first = false;
				}
				else {
					roles.append(",");
					roles.append(ar.getRoleCode());
				}
			}
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return roles.toString();
	}
	*/
}