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

import org.oep.core.processmgt.model.ProcessOrder;
import org.oep.core.processmgt.service.base.ProcessOrderLocalServiceBaseImpl;

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
 * The implementation of the process order local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.processmgt.service.ProcessOrderLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.core.processmgt.service.base.ProcessOrderLocalServiceBaseImpl
 * @see org.oep.core.processmgt.service.ProcessOrderLocalServiceUtil
 */
public class ProcessOrderLocalServiceImpl
	extends ProcessOrderLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.processmgt.service.ProcessOrderLocalServiceUtil} to access the process order local service.
	 */
	
	/** 
	 * Add process order
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Create new
	 * @param
	 * @return: new process order
	 */
	@Indexable(type = IndexableType.REINDEX)	
	@Transactional
	public ProcessOrder addProcessOrder(
			long organizationId,
			long parentProcessOrderId,
			long dossierId,
			long dossierProcessId,
			long dossierStepId,
			String dossierStatus,
			String dossierResume,
			Date stepDate,
			String stepNote,
			long assignToUserId,
			String currentCondition,
			int endState,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate();
		long id = counterLocalService.increment();
		ProcessOrder processOrder = processOrderPersistence.create(id);
		Date now = new Date();
		
		processOrder.setUserId(serviceContext.getUserId());
		processOrder.setGroupId(serviceContext.getScopeGroupId());
		processOrder.setCompanyId(serviceContext.getCompanyId());
		processOrder.setCreateDate(serviceContext.getCreateDate(now));
		processOrder.setOrganizationId(organizationId);
		processOrder.setParentProcessOrderId(parentProcessOrderId);
		processOrder.setDossierId(dossierId);
		processOrder.setDossierProcessId(dossierProcessId);
		processOrder.setDossierStepId(dossierStepId);
		processOrder.setDossierStatus(dossierStatus);
		processOrder.setDossierResume(dossierResume);
		processOrder.setStepDate(stepDate);
		processOrder.setStepNote(stepNote);
		processOrder.setAssignToUserId(assignToUserId);
		processOrder.setCurrentCondition(currentCondition);
		processOrder.setEndState(endState);
		
		processOrderPersistence.update(processOrder);

		if (_log.isInfoEnabled()) {
			_log.info("Create new process order " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addProcessOrderResources(processOrder, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addProcessOrderResources(processOrder, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getProcessOrder(id);
	}

	@Indexable(type = IndexableType.REINDEX)
	public ProcessOrder updateProcessOrder(
			long id, 
			long organizationId,
			long parentProcessOrderId,
			long dossierId,
			long dossierProcessId,
			long dossierStepId,
			String dossierStatus,
			String dossierResume,
			Date stepDate,
			String stepNote,
			long assignToUserId,
			String currentCondition,
			int endState,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		validate();

		ProcessOrder processOrder = processOrderPersistence.findByPrimaryKey(id);

		processOrder.setModifiedDate(serviceContext.getModifiedDate(null));
		processOrder.setOrganizationId(organizationId);
		processOrder.setParentProcessOrderId(parentProcessOrderId);
		processOrder.setDossierId(dossierId);
		processOrder.setDossierProcessId(dossierProcessId);
		processOrder.setDossierStepId(dossierStepId);
		processOrder.setDossierStatus(dossierStatus);
		processOrder.setDossierResume(dossierResume);
		processOrder.setStepDate(stepDate);
		processOrder.setStepNote(stepNote);
		processOrder.setAssignToUserId(assignToUserId);
		processOrder.setCurrentCondition(currentCondition);
		processOrder.setEndState(endState);
		
		processOrderPersistence.update(processOrder);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateProcessOrderResources(
				processOrder, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getProcessOrder(processOrder.getProcessOrderId());
	}

	public void updateProcessOrderResources(
			ProcessOrder processOrder, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			processOrder.getCompanyId(), serviceContext.getScopeGroupId(),
			ProcessOrder.class.getName(), processOrder.getProcessOrderId(), groupPermissions,
			guestPermissions);
	}
	
	public void removeProcessOrder(ProcessOrder processOrder) throws PortalException, SystemException {
		processOrderPersistence.remove(processOrder);
		resourceLocalService.deleteResource(processOrder.getCompanyId(), ProcessOrder.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, processOrder.getProcessOrderId());
	}
	
	public void removeProcessOrder(long id) throws PortalException, SystemException {
		ProcessOrder processOrder = processOrderPersistence.findByPrimaryKey(id);
		removeProcessOrder(processOrder);
	}
	
	public ProcessOrder getProcessOrder(long id) throws PortalException, SystemException {
		return processOrderPersistence.findByPrimaryKey(id);
	}

	public void addProcessOrderResources(ProcessOrder processOrder, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(processOrder.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), ProcessOrder.class.getName(), processOrder.getProcessOrderId(), false, addGroupPermission, addGuestPermission);
	}

	public void addProcessOrderResources(ProcessOrder processOrder, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(processOrder.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), ProcessOrder.class.getName(), processOrder.getProcessOrderId(), groupPermissions, guestPermissions);
	}
	
	public void addProcessOrderResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		ProcessOrder processOrder = processOrderPersistence.findByPrimaryKey(id);
		addProcessOrderResources(processOrder, groupPermissions, guestPermissions, serviceContext);
	}
	
	protected void validate() throws PortalException {
	}
	
	private static Log _log = LogFactoryUtil.getLog(ProcessOrderLocalServiceImpl.class);
	
}