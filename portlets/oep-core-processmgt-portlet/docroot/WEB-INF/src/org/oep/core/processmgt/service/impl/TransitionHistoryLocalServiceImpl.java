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

import org.oep.core.processmgt.model.TransitionHistory;
import org.oep.core.processmgt.service.base.TransitionHistoryLocalServiceBaseImpl;

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
 * The implementation of the transition history local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.processmgt.service.TransitionHistoryLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.core.processmgt.service.base.TransitionHistoryLocalServiceBaseImpl
 * @see org.oep.core.processmgt.service.TransitionHistoryLocalServiceUtil
 */
public class TransitionHistoryLocalServiceImpl
	extends TransitionHistoryLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.processmgt.service.TransitionHistoryLocalServiceUtil} to access the transition history local service.
	 */

	/** 
	 * Add transition history
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Create new
	 * @param
	 * @return: new transition history
	 */
	@Indexable(type = IndexableType.REINDEX)	
	@Transactional
	public TransitionHistory addTransitionHistory(
			long dossierId,
			long processOrderId,
			int daysDoing,
			int daysDelay,
			Date startDate,
			long stepTransitionId,
			long preDossierStepId,
			long postDossierStepId,
			String transitionName,
			String note,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate();
		long id = counterLocalService.increment();
		TransitionHistory transitionHistory = transitionHistoryPersistence.create(id);
		Date now = new Date();
		
		transitionHistory.setUserId(serviceContext.getUserId());
		transitionHistory.setGroupId(serviceContext.getScopeGroupId());
		transitionHistory.setCompanyId(serviceContext.getCompanyId());
		transitionHistory.setCreateDate(serviceContext.getCreateDate(now));
		transitionHistory.setDossierId(dossierId);
		transitionHistory.setProcessOrderId(processOrderId);
		transitionHistory.setDaysDelay(daysDelay);
		transitionHistory.setDaysDoing(daysDoing);
		transitionHistory.setStartDate(startDate);
		transitionHistory.setStepTransitionId(stepTransitionId);
		transitionHistory.setPreDossierStepId(preDossierStepId);
		transitionHistory.setPostDossierStepId(postDossierStepId);
		transitionHistory.setTransitionName(transitionName);
		transitionHistory.setNote(note);
		
		transitionHistoryPersistence.update(transitionHistory);

		if (_log.isInfoEnabled()) {
			_log.info("Create new step transition " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addTransitionHistoryResources(transitionHistory, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addTransitionHistoryResources(transitionHistory, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getTransitionHistory(id);
	}

	@Indexable(type = IndexableType.REINDEX)
	public TransitionHistory updateTransitionHistory(
			long id, 
			long dossierId,
			long processOrderId,
			int daysDoing,
			int daysDelay,
			Date startDate,
			long stepTransitionId,
			long preDossierStepId,
			long postDossierStepId,
			String transitionName,
			String note,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		validate();

		TransitionHistory transitionHistory = transitionHistoryPersistence.findByPrimaryKey(id);

		transitionHistory.setDossierId(dossierId);
		transitionHistory.setProcessOrderId(processOrderId);
		transitionHistory.setDaysDelay(daysDelay);
		transitionHistory.setDaysDoing(daysDoing);
		transitionHistory.setStartDate(startDate);
		transitionHistory.setStepTransitionId(stepTransitionId);
		transitionHistory.setPreDossierStepId(preDossierStepId);
		transitionHistory.setPostDossierStepId(postDossierStepId);
		transitionHistory.setTransitionName(transitionName);
		transitionHistory.setNote(note);
		
		transitionHistoryPersistence.update(transitionHistory);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateTransitionHistoryResources(
				transitionHistory, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getTransitionHistory(transitionHistory.getTransitionHistoryId());
	}

	public void updateTransitionHistoryResources(
			TransitionHistory transitionHistory, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			transitionHistory.getCompanyId(), serviceContext.getScopeGroupId(),
			TransitionHistory.class.getName(), transitionHistory.getTransitionHistoryId(), groupPermissions,
			guestPermissions);
	}
	
	public void removeTransitionHistory(TransitionHistory transitionHistory) throws PortalException, SystemException {
		transitionHistoryPersistence.remove(transitionHistory);
		resourceLocalService.deleteResource(transitionHistory.getCompanyId(), TransitionHistory.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, transitionHistory.getTransitionHistoryId());
	}
	
	public void removeTransitionHistory(long id) throws PortalException, SystemException {
		TransitionHistory transitionHistory = transitionHistoryPersistence.findByPrimaryKey(id);
		removeTransitionHistory(transitionHistory);
	}
	
	public TransitionHistory getTransitionHistory(long id) throws PortalException, SystemException {
		return transitionHistoryPersistence.findByPrimaryKey(id);
	}

	public void addTransitionHistoryResources(TransitionHistory transitionHistory, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(transitionHistory.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), TransitionHistory.class.getName(), transitionHistory.getTransitionHistoryId(), false, addGroupPermission, addGuestPermission);
	}

	public void addTransitionHistoryResources(TransitionHistory transitionHistory, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(transitionHistory.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), TransitionHistory.class.getName(), transitionHistory.getTransitionHistoryId(), groupPermissions, guestPermissions);
	}
	
	public void addTransitionHistoryResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		TransitionHistory transitionHistory = transitionHistoryPersistence.findByPrimaryKey(id);
		addTransitionHistoryResources(transitionHistory, groupPermissions, guestPermissions, serviceContext);
	}
	
	protected void validate() throws PortalException {
	}
	
	private static Log _log = LogFactoryUtil.getLog(TransitionHistoryLocalServiceImpl.class);

}