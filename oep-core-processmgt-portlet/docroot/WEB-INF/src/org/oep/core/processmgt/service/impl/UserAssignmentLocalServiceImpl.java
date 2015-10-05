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

package org.oep.core.processmgt.service.impl;

import java.util.Date;

import org.oep.core.processmgt.model.UserAssignment;
import org.oep.core.processmgt.service.base.UserAssignmentLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the user assignment local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.processmgt.service.UserAssignmentLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.core.processmgt.service.base.UserAssignmentLocalServiceBaseImpl
 * @see org.oep.core.processmgt.service.UserAssignmentLocalServiceUtil
 */
public class UserAssignmentLocalServiceImpl
	extends UserAssignmentLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.processmgt.service.UserAssignmentLocalServiceUtil} to access the user assignment local service.
	 */

	/** 
	 * Add user assignment
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Create new
	 * @param
	 * @return: new user assignment
	 */
	@Indexable(type = IndexableType.REINDEX)	
	@Transactional
	public UserAssignment addUserAssignment(
			long processOrderId,
			long dossierStepId,
			long assignToUserId,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate();
		long id = counterLocalService.increment();
		UserAssignment userAssignment = userAssignmentPersistence.create(id);
		Date now = new Date();
		
		userAssignment.setUserId(serviceContext.getUserId());
		userAssignment.setGroupId(serviceContext.getScopeGroupId());
		userAssignment.setCompanyId(serviceContext.getCompanyId());
		userAssignment.setCreateDate(serviceContext.getCreateDate(now));
		userAssignment.setProcessOrderId(processOrderId);
		userAssignment.setDossierStepId(dossierStepId);
		userAssignment.setAssignToUserId(assignToUserId);
		
		userAssignmentPersistence.update(userAssignment);

		if (_log.isInfoEnabled()) {
			_log.info("Create new step transition " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addUserAssignmentResources(userAssignment, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addUserAssignmentResources(userAssignment, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getUserAssignment(id);
	}

	@Indexable(type = IndexableType.REINDEX)
	public UserAssignment updateUserAssignment(
			long id, 
			long processOrderId,
			long dossierStepId,
			long assignToUserId,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		validate();

		UserAssignment userAssignment = userAssignmentPersistence.findByPrimaryKey(id);

		userAssignment.setProcessOrderId(processOrderId);
		userAssignment.setDossierStepId(dossierStepId);
		userAssignment.setAssignToUserId(assignToUserId);
		
		userAssignmentPersistence.update(userAssignment);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateUserAssignmentResources(
				userAssignment, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getUserAssignment(userAssignment.getUserAssignmentId());
	}

	public void updateUserAssignmentResources(
			UserAssignment userAssignment, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			userAssignment.getCompanyId(), serviceContext.getScopeGroupId(),
			UserAssignment.class.getName(), userAssignment.getUserAssignmentId(), groupPermissions,
			guestPermissions);
	}
	
	public void removeUserAssignment(UserAssignment userAssignment) throws PortalException, SystemException {
		userAssignmentPersistence.remove(userAssignment);
		resourceLocalService.deleteResource(userAssignment.getCompanyId(), UserAssignment.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, userAssignment.getUserAssignmentId());
	}
	
	public void removeUserAssignment(long id) throws PortalException, SystemException {
		UserAssignment userAssignment = userAssignmentPersistence.findByPrimaryKey(id);
		removeUserAssignment(userAssignment);
	}
	
	public UserAssignment getUserAssignment(long id) throws PortalException, SystemException {
		return userAssignmentPersistence.findByPrimaryKey(id);
	}

	public void addUserAssignmentResources(UserAssignment userAssignment, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(userAssignment.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), UserAssignment.class.getName(), userAssignment.getUserAssignmentId(), false, addGroupPermission, addGuestPermission);
	}

	public void addUserAssignmentResources(UserAssignment userAssignment, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(userAssignment.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), UserAssignment.class.getName(), userAssignment.getUserAssignmentId(), groupPermissions, guestPermissions);
	}
	
	public void addUserAssignmentResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		UserAssignment userAssignment = userAssignmentPersistence.findByPrimaryKey(id);
		addUserAssignmentResources(userAssignment, groupPermissions, guestPermissions, serviceContext);
	}
	
	protected void validate() throws PortalException {
	}
	
	private static Log _log = LogFactoryUtil.getLog(UserAssignmentLocalServiceImpl.class);
	
}