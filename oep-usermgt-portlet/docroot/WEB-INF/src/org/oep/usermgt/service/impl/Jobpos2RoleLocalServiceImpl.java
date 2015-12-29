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


import java.util.ArrayList;
import java.util.List;

import org.oep.usermgt.model.JobPos;
import org.oep.usermgt.model.JobPos2Role;
import org.oep.usermgt.service.base.JobPos2RoleLocalServiceBaseImpl;
import org.oep.usermgt.service.persistence.JobPos2RolePK;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.Role;
//import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the jobpos to role local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.usermgt.service.JobPos2RoleLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author NQMINH
 * @see org.oep.usermgt.service.base.JobPos2RoleLocalServiceBaseImpl
 * @see org.oep.usermgt.service.JobPos2RoleLocalServiceUtil
 */
public class JobPos2RoleLocalServiceImpl extends JobPos2RoleLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.usermgt.service.JobPos2RoleLocalServiceUtil} to access the jobpos to role local service.
	 */
	public JobPos2Role addJobPos2Role(
			long jobPosId,
			long roleId,
			ServiceContext serviceContext) throws SystemException, PortalException {
		//validate(collectionName, dataCode, title, status);
		JobPos2Role jobPos2Role = jobPos2RolePersistence.create(new JobPos2RolePK(jobPosId,roleId));
		jobPos2Role.setRoleId(roleId);
		jobPos2Role.setJobPosId(jobPosId);
		jobPos2RolePersistence.update(jobPos2Role);
		/*
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addJobPos2RoleResources(jobPos2Role, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addJobPos2RoleResources(jobPos2Role, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		*/
		
		return jobPos2Role;
	}
	

	public JobPos2Role updateJobPos2Role(
			long jobPosId,
			long roleId,
			ServiceContext serviceContext)
		throws PortalException, SystemException {
		JobPos2Role jobPos2Role = jobPos2RolePersistence.fetchByPrimaryKey(new JobPos2RolePK(jobPosId,roleId));
		jobPos2Role.setRoleId(roleId);
		jobPos2Role.setJobPosId(jobPosId);
		jobPos2RolePersistence.update(jobPos2Role);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateJobPos2RoleResources(
					jobPos2Role, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return jobPos2Role;
	}
	public JobPos2Role saveJobPos2Role(JobPos2Role jobPos2Role, ServiceContext serviceContext) throws PortalException, SystemException {
		return updateJobPos2Role(jobPos2Role.getJobPosId(), 
				jobPos2Role.getRoleId(),
				serviceContext);
	}
	
	public void updateJobPos2RoleResources(
			JobPos2Role jobPos, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
				serviceContext.getCompanyId(), serviceContext.getGuestOrUserId(),
			JobPos.class.getName(), jobPos.getJobPosId(), groupPermissions,
			guestPermissions);
	}
	public void removeJobPos2Role(JobPos2Role jobPos2Role) throws PortalException, SystemException {
		jobPosPersistence.remove(jobPos2Role);
		//resourceLocalService.deleteResource(JobPos.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, jobPos.getJobPosId());
	}
	
	public void removeJobPos2Role(long jobPosId,long roleId) throws PortalException, SystemException {
		JobPos2Role jobPos = jobPos2RolePersistence.findByPrimaryKey(new JobPos2RolePK(jobPosId,roleId));
		removeJobPos2Role(jobPos);
	}
	
	public JobPos getJobPos2Role(long id) throws PortalException, SystemException {
		return jobPosPersistence.findByPrimaryKey(id);
	}

	public void addJobPos2RoleResources(JobPos jobPos, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(jobPos.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), JobPos.class.getName(), jobPos.getJobPosId(), false, addGroupPermission, addGuestPermission);
	}

	public void addJobPos2RoleResources(JobPos jobPos, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(jobPos.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), JobPos.class.getName(), jobPos.getJobPosId(), groupPermissions, guestPermissions);
	}
	
	public void addJobPos2RoleResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		JobPos jobPos = jobPosPersistence.findByPrimaryKey(id);
		addJobPos2RoleResources(jobPos, groupPermissions, guestPermissions, serviceContext);
	}
	
	public List<JobPos2Role> getByJobPos(long jobPosId) throws PortalException, SystemException {
		return jobPos2RolePersistence.findByJP(jobPosId);
	}
	
	public long[] getRoleIdByJobPosId(long jobPosId) throws PortalException, SystemException {
		List<JobPos2Role> listJobPos2Role =  jobPos2RolePersistence.findByJP(jobPosId);
		long[] roleIds = new long[listJobPos2Role.size()];
		for (int i = 0; i < listJobPos2Role.size();i++){
			roleIds[i] = listJobPos2Role.get(i).getRoleId();
		}
		return roleIds;
	}
	public ArrayList<Role> getRoleIdByJobPosId(ArrayList<Role> listRole, long jobPosId) throws PortalException, SystemException {
		List<JobPos2Role> listJobPos2Role =  jobPos2RolePersistence.findByJP(jobPosId);
		ArrayList<Role> roles = new ArrayList<Role>();
		for (int i = 0; i < listJobPos2Role.size();i++){
			//roleIds[i] = listJobPos2Role.get(i).getRoleId();
			int index = -1;
			for (int k = 0; k < listRole.size();k++){
				if (listRole.get(k).getRoleId() == listJobPos2Role.get(i).getRoleId()){
					index = k;
					break;
				}
			}
			if (index >= 0){
				roles.add(listRole.get(index));
				listRole.remove(index);
			}
		}
		return roles;
	}
	
	public List<Role> getRoleByJobPosId(long jobPosId) throws PortalException, SystemException {
		return jobPos2RoleFinder.findRoleByJobPosId(jobPosId);
	}
	public List<Role> getRoleByNotInJobPosId(long jobPosId) throws PortalException, SystemException {
		return jobPos2RoleFinder.findRoleNotInJobPosId(jobPosId);
	}
}