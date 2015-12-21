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

package org.oep.usermgt.service.impl;

import java.util.Date;
import java.util.List;

import org.oep.usermgt.model.JobPos;
import org.oep.usermgt.service.base.JobPosLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the Job Pos local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.usermgt.service.JobPosLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author NQMINH
 * @see org.oep.usermgt.service.base.JobPosLocalServiceBaseImpl
 * @see org.oep.usermgt.service.JobPosLocalServiceUtil
 */
public class JobPosLocalServiceImpl extends JobPosLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.usermgt.service.JobPosLocalServiceUtil} to access the Job Pos local service.
	 */
	public JobPos addJobPos(
			String title,
			String positionCatNo,
			long workingUnitId,
			long subWorkingUnitId,
			int leader,
			ServiceContext serviceContext) throws SystemException, PortalException {
		//validate(collectionName, dataCode, title, status);
		long id = counterLocalService.increment();
		JobPos jobPos = jobPosPersistence.create(id);
		Date now = new Date();
		jobPos.setTitle(title);
		jobPos.setPositionCatNo(positionCatNo);
		jobPos.setWorkingUnitId(workingUnitId);
		jobPos.setSubWorkingUnitId(subWorkingUnitId);
		jobPos.setLeader(leader);


		jobPos.setCompanyId(serviceContext.getCompanyId());
		jobPos.setGroupId(serviceContext.getScopeGroupId());
		jobPos.setUserId(serviceContext.getUserId());
		jobPos.setCreateDate(serviceContext.getCreateDate(now));
		
		jobPosPersistence.update(jobPos);

		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addJobPosResources(jobPos, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addJobPosResources(jobPos, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getJobPos(id);
	}
	

	public JobPos updateJobPos(
			long jobPosId,
			String title,
			String positionCatNo,
			long  workingUnitId,
			long subWorkingUnitId,
			int leader,
	
			ServiceContext serviceContext)
		throws PortalException, SystemException {
		JobPos jobPos = jobPosPersistence.findByPrimaryKey(jobPosId);
		jobPos.setTitle(title);
		jobPos.setPositionCatNo(positionCatNo);
		jobPos.setWorkingUnitId(workingUnitId);
		jobPos.setLeader(leader);
		jobPos.setSubWorkingUnitId(subWorkingUnitId);
		jobPos.setModifiedDate(serviceContext.getModifiedDate(null));
		jobPosPersistence.update(jobPos);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateJobPosResources(
				jobPos, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getJobPos(jobPos.getJobPosId());
	}
	public JobPos saveJobPos(JobPos jobPos, ServiceContext serviceContext) throws PortalException, SystemException {
		return updateJobPos(jobPos.getJobPosId(), 
				jobPos.getTitle(),
				jobPos.getPositionCatNo(),
				jobPos.getWorkingUnitId(),
				jobPos.getSubWorkingUnitId(),
				jobPos.getLeader(),

				serviceContext);
	}
	
	public void updateJobPosResources(
			JobPos jobPos, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			jobPos.getCompanyId(), serviceContext.getGuestOrUserId(),
			JobPos.class.getName(), jobPos.getJobPosId(), groupPermissions,
			guestPermissions);
	}
	public void removeJobPos(JobPos jobPos) throws PortalException, SystemException {
		jobPosPersistence.remove(jobPos);
		resourceLocalService.deleteResource(jobPos.getCompanyId(), JobPos.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, jobPos.getJobPosId());
	}
	
	public void removeJobPos(long id) throws PortalException, SystemException {
		JobPos jobPos = jobPosPersistence.findByPrimaryKey(id);
		removeJobPos(jobPos);
	}
	
	public JobPos getJobPos(long id) throws PortalException, SystemException {
		return jobPosPersistence.findByPrimaryKey(id);
	}

	public void addJobPosResources(JobPos jobPos, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(jobPos.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), JobPos.class.getName(), jobPos.getJobPosId(), false, addGroupPermission, addGuestPermission);
	}

	public void addJobPosResources(JobPos jobPos, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(jobPos.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), JobPos.class.getName(), jobPos.getJobPosId(), groupPermissions, guestPermissions);
	}
	
	public void addJobPosResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		JobPos jobPos = jobPosPersistence.findByPrimaryKey(id);
		addJobPosResources(jobPos, groupPermissions, guestPermissions, serviceContext);
	}
	/* WorkingUnit */
	public int countJobPosByWorkingUnit(long workingUnitId) throws PortalException, SystemException {
		return jobPosPersistence.countByWU(workingUnitId);
	}
	
	public List<JobPos> getByWorkingUnit(long workingUnitId) throws PortalException, SystemException {
		return jobPosPersistence.findByWU(workingUnitId);
	}
	
	public List<JobPos> getByWorkingUnit(long workingUnitId, int start, int end) throws PortalException, SystemException {
		return jobPosPersistence.findByWU(workingUnitId, start, end);
	}
	/* WorkingUnit Leader*/
	public int countJobPosByWorkingUniLeadert(long workingUnitId, int leader) throws PortalException, SystemException {
		return jobPosPersistence.countByWU_L(workingUnitId, leader);
	}
	
	public List<JobPos> getByWorkingUnitLeader(long workingUnitId, int leader) throws PortalException, SystemException {
		return jobPosPersistence.findByWU_L(workingUnitId, leader);
	}
	
	public List<JobPos> getByWorkingUnitLeader(long workingUnitId, int leader, int start, int end) throws PortalException, SystemException {
		return jobPosPersistence.findByWU_L(workingUnitId, leader, start, end);
	}
	
	/* WorkingUnit PositionCatNo*/
	public int countJobPosByWorkingUniLeadert(long workingUnitId, String positionCatNo) throws PortalException, SystemException {
		return jobPosPersistence.countByWU_PCN(workingUnitId, positionCatNo);
	}
	
	public List<JobPos> getByWorkingUnitLeader(long workingUnitId, String positionCatNo) throws PortalException, SystemException {
		return jobPosPersistence.findByWU_PCN(workingUnitId, positionCatNo);
	}
	
	public List<JobPos> getByWorkingUnitLeader(long workingUnitId, String positionCatNo, int start, int end) throws PortalException, SystemException {
		return jobPosPersistence.findByWU_PCN(workingUnitId, positionCatNo, start, end);
	}
}