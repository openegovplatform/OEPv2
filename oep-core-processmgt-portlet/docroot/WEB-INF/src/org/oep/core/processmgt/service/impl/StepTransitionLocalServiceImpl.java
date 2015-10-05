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

import org.oep.core.processmgt.model.StepTransition;
import org.oep.core.processmgt.service.base.StepTransitionLocalServiceBaseImpl;

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
 * The implementation of the step transition local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.processmgt.service.StepTransitionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.core.processmgt.service.base.StepTransitionLocalServiceBaseImpl
 * @see org.oep.core.processmgt.service.StepTransitionLocalServiceUtil
 */
public class StepTransitionLocalServiceImpl
	extends StepTransitionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.processmgt.service.StepTransitionLocalServiceUtil} to access the step transition local service.
	 */
	
	/** 
	 * Add step transition
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Create new
	 * @param
	 * @return: new step transition
	 */
	@Indexable(type = IndexableType.REINDEX)	
	@Transactional
	public StepTransition addStepTransition(
			long dossierProcessId,
			long preDossierStepId,
			long postDossierStepId,
			String precondition,
			String transitionName,
			int daysDuration,
			String dossierStatus,
			int userAssignment,
			int newProcessOrder,
			String errorMessage,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate();
		long id = counterLocalService.increment();
		StepTransition stepTransition = stepTransitionPersistence.create(id);
		Date now = new Date();
		
		stepTransition.setUserId(serviceContext.getUserId());
		stepTransition.setGroupId(serviceContext.getScopeGroupId());
		stepTransition.setCompanyId(serviceContext.getCompanyId());
		stepTransition.setCreateDate(serviceContext.getCreateDate(now));
		stepTransition.setDossierProcessId(dossierProcessId);
		stepTransition.setPreDossierStepId(preDossierStepId);
		stepTransition.setPostDossierStepId(postDossierStepId);
		stepTransition.setPrecondition(precondition);
		stepTransition.setTransitionName(transitionName);
		stepTransition.setDaysDuration(daysDuration);
		stepTransition.setDossierStatus(dossierStatus);
		stepTransition.setUserAssignment(userAssignment);
		stepTransition.setNewProcessOrder(newProcessOrder);
		stepTransition.setErrorMessage(errorMessage);
		
		stepTransitionPersistence.update(stepTransition);

		if (_log.isInfoEnabled()) {
			_log.info("Create new step transition " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addStepTransitionResources(stepTransition, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addStepTransitionResources(stepTransition, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getStepTransition(id);
	}

	@Indexable(type = IndexableType.REINDEX)
	public StepTransition updateStepTransition(
			long id, 
			long dossierProcessId,
			long preDossierStepId,
			long postDossierStepId,
			String precondition,
			String transitionName,
			int daysDuration,
			String dossierStatus,
			int userAssignment,
			int newProcessOrder,
			String errorMessage,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		validate();

		StepTransition stepTransition = stepTransitionPersistence.findByPrimaryKey(id);

		stepTransition.setModifiedDate(serviceContext.getModifiedDate(null));
		stepTransition.setDossierProcessId(dossierProcessId);
		stepTransition.setPreDossierStepId(preDossierStepId);
		stepTransition.setPostDossierStepId(postDossierStepId);
		stepTransition.setPrecondition(precondition);
		stepTransition.setTransitionName(transitionName);
		stepTransition.setDaysDuration(daysDuration);
		stepTransition.setDossierStatus(dossierStatus);
		stepTransition.setUserAssignment(userAssignment);
		stepTransition.setNewProcessOrder(newProcessOrder);
		stepTransition.setErrorMessage(errorMessage);
		
		stepTransitionPersistence.update(stepTransition);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateStepTransitionResources(
				stepTransition, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getStepTransition(stepTransition.getStepTransitionId());
	}

	public void updateStepTransitionResources(
			StepTransition stepTransition, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			stepTransition.getCompanyId(), serviceContext.getScopeGroupId(),
			StepTransition.class.getName(), stepTransition.getStepTransitionId(), groupPermissions,
			guestPermissions);
	}
	
	public void removeStepTransition(StepTransition stepTransition) throws PortalException, SystemException {
		stepTransitionPersistence.remove(stepTransition);
		resourceLocalService.deleteResource(stepTransition.getCompanyId(), StepTransition.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, stepTransition.getStepTransitionId());
	}
	
	public void removeStepTransition(long id) throws PortalException, SystemException {
		StepTransition stepTransition = stepTransitionPersistence.findByPrimaryKey(id);
		removeStepTransition(stepTransition);
	}
	
	public StepTransition getStepTransition(long id) throws PortalException, SystemException {
		return stepTransitionPersistence.findByPrimaryKey(id);
	}

	public void addStepTransitionResources(StepTransition stepTransition, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(stepTransition.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), StepTransition.class.getName(), stepTransition.getStepTransitionId(), false, addGroupPermission, addGuestPermission);
	}

	public void addStepTransitionResources(StepTransition stepTransition, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(stepTransition.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), StepTransition.class.getName(), stepTransition.getStepTransitionId(), groupPermissions, guestPermissions);
	}
	
	public void addStepTransitionResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		StepTransition stepTransition = stepTransitionPersistence.findByPrimaryKey(id);
		addStepTransitionResources(stepTransition, groupPermissions, guestPermissions, serviceContext);
	}
	
	protected void validate() throws PortalException {
	}
	
	private static Log _log = LogFactoryUtil.getLog(StepTransitionLocalServiceImpl.class);
	
}