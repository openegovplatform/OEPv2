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

import org.oep.usermgt.model.Employee;
import org.oep.usermgt.model.WorkingUnit;
import org.oep.usermgt.service.EmployeeLocalServiceUtil;
import org.oep.usermgt.service.WorkingUnitLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * The extended model implementation for the AppRole2Employee service. Represents a row in the &quot;oep_usermgt_approle2employee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.ssomgt.model.AppRole2Employee} interface.
 * </p>
 *
 * @author trungdk
 */
public class AppRole2EmployeeImpl extends AppRole2EmployeeBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. All methods that expect a app role2 employee model instance should use the {@link org.oep.ssomgt.model.AppRole2Employee} interface instead.
	 */
	private static Log _log = LogFactoryUtil.getLog(AppRole2EmployeeImpl.class);	
	
	public AppRole2EmployeeImpl() {
	}
	
	public Employee getEmployee() {
		Employee rs = null;
		
		try {
			rs = EmployeeLocalServiceUtil.getEmployee(getEmployeeId());
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
	}
	
	public WorkingUnit getWorkingUnit() {
		Employee rs = null;
		
		try {
			rs = EmployeeLocalServiceUtil.getEmployee(getEmployeeId());
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (rs == null) return null;
		WorkingUnit wu = null;
		try {
			wu = WorkingUnitLocalServiceUtil.getWorkingUnit(rs.getWorkingUnitId());
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return wu;
	}	
}