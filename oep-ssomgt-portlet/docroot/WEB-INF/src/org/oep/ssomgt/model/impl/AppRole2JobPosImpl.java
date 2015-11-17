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

import org.oep.ssomgt.service.impl.ApplicationLocalServiceImpl;
import org.oep.usermgt.model.JobPos;
import org.oep.usermgt.model.WorkingUnit;
import org.oep.usermgt.service.JobPosLocalServiceUtil;
import org.oep.usermgt.service.WorkingUnitLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * The extended model implementation for the AppRole2JobPos service. Represents a row in the &quot;oep_usermgt_approle2jobpos&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.ssomgt.model.AppRole2JobPos} interface.
 * </p>
 *
 * @author trungdk
 */
public class AppRole2JobPosImpl extends AppRole2JobPosBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. All methods that expect a app role2 job pos model instance should use the {@link org.oep.ssomgt.model.AppRole2JobPos} interface instead.
	 */
	private static Log _log = LogFactoryUtil.getLog(AppRole2JobPosImpl.class);	
	
	public AppRole2JobPosImpl() {
	}
	
	public JobPos getJobPos() {
		JobPos rs = null;
		
		_log.info("Job pos id: " + getJobPosId());
		try {
			rs = JobPosLocalServiceUtil.getJobPos(getJobPosId());
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
		JobPos rs = null;
		
		try {
			rs = JobPosLocalServiceUtil.getJobPos(getJobPosId());
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