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

import org.oep.core.processmgt.model.DossierStep;
import org.oep.core.processmgt.service.base.DossierStepLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the dossier step local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.processmgt.service.DossierStepLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.core.processmgt.service.base.DossierStepLocalServiceBaseImpl
 * @see org.oep.core.processmgt.service.DossierStepLocalServiceUtil
 */
public class DossierStepLocalServiceImpl extends DossierStepLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.processmgt.service.DossierStepLocalServiceUtil} to access the dossier step local service.
	 */

	/** 
	 * Add dossier step
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Create new
	 * @param
	 * @return: new dossier process
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public DossierStep addDossierStep(long dossierProcessId, String title, int sequenceNo, int stepType, ServiceContext serviceContext) throws SystemException, PortalException {
		validate(dossierProcessId, title, sequenceNo, stepType);
		long id = counterLocalService.increment();
		DossierStep dossierStep = dossierStepPersistence.create(id);
		Date now = new Date();
		
		dossierStep.setUserId(serviceContext.getUserId());
		dossierStep.setGroupId(serviceContext.getScopeGroupId());
		dossierStep.setCompanyId(serviceContext.getCompanyId());
		dossierStep.setDossierProcessId(dossierProcessId);
		dossierStep.setTitle(title);
		dossierStep.setSequenceNo(sequenceNo);
		dossierStep.setStepType(stepType);
		dossierStep.setCreateDate(serviceContext.getCreateDate(now));
		
		dossierStepPersistence.update(dossierStep);

		if (_log.isInfoEnabled()) {
			_log.info("Create new dossier step " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addDossierStepResources(dossierStep, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addDossierStepResources(dossierStep, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getDossierStep(id);
	}

	@Indexable(type = IndexableType.REINDEX)
	public DossierStep updateDossierStep(
			long id, long dossierProcessId, String title, int sequenceNo, int stepType, ServiceContext serviceContext)
		throws PortalException, SystemException {

		validate(dossierProcessId, title, sequenceNo, stepType);

		DossierStep dossierStep = dossierStepPersistence.findByPrimaryKey(id);

		dossierStep.setModifiedDate(serviceContext.getModifiedDate(null));
		dossierStep.setDossierProcessId(dossierProcessId);
		dossierStep.setTitle(title);
		dossierStep.setSequenceNo(sequenceNo);
		dossierStep.setStepType(stepType);
		
		dossierStepPersistence.update(dossierStep);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateDossierStepResources(
				dossierStep, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getDossierStep(dossierStep.getDossierStepId());
	}

	public void updateDossierStepResources(
			DossierStep dossierStep, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			dossierStep.getCompanyId(), serviceContext.getScopeGroupId(),
			DossierStep.class.getName(), dossierStep.getDossierProcessId(), groupPermissions,
			guestPermissions);
	}
	
	public void removeDossierStep(DossierStep dossierStep) throws PortalException, SystemException {
		dossierStepPersistence.remove(dossierStep);
		resourceLocalService.deleteResource(dossierStep.getCompanyId(), DossierStep.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, dossierStep.getDossierStepId());
	}
	
	public void removeDossierStep(long id) throws PortalException, SystemException {
		DossierStep dossierStep = dossierStepPersistence.findByPrimaryKey(id);
		removeDossierStep(dossierStep);
	}
	
	public DossierStep getDossierStep(long id) throws PortalException, SystemException {
		return dossierStepPersistence.findByPrimaryKey(id);
	}

	public void addDossierStepResources(DossierStep dossierStep, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(dossierStep.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DossierStep.class.getName(), dossierStep.getDossierStepId(), false, addGroupPermission, addGuestPermission);
	}

	public void addDossierStepResources(DossierStep dossierStep, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(dossierStep.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DossierStep.class.getName(), dossierStep.getDossierStepId(), groupPermissions, guestPermissions);
	}
	
	public void addDossierStepResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		DossierStep dossierStep = dossierStepPersistence.findByPrimaryKey(id);
		addDossierStepResources(dossierStep, groupPermissions, guestPermissions, serviceContext);
	}
	
	protected void validate(long dossierProcessid, String title, int sequenceNo, int stepType) throws PortalException {
	}
	
	private static Log _log = LogFactoryUtil.getLog(DossierStepLocalServiceImpl.class);
	
}