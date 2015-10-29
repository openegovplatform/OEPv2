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
import java.util.List;

import org.oep.core.processmgt.model.DossierProcess;
import org.oep.core.processmgt.service.base.DossierProcessLocalServiceBaseImpl;

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
 * The implementation of the dossier process local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.processmgt.service.DossierProcessLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.core.processmgt.service.base.DossierProcessLocalServiceBaseImpl
 * @see org.oep.core.processmgt.service.DossierProcessLocalServiceUtil
 */
public class DossierProcessLocalServiceImpl
	extends DossierProcessLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.processmgt.service.DossierProcessLocalServiceUtil} to access the dossier process local service.
	 */
	
	/** 
	 * Add dossier process
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
	@Transactional
	public DossierProcess addDossierProcess(
			ServiceContext serviceContext) throws SystemException, PortalException {
		long id = counterLocalService.increment();
		DossierProcess dossierProcess = dossierProcessPersistence.create(id);
		Date now = new Date();
		
		dossierProcess.setUserId(serviceContext.getUserId());
		dossierProcess.setGroupId(serviceContext.getScopeGroupId());		
		dossierProcess.setCompanyId(serviceContext.getCompanyId());
		dossierProcess.setCreateDate(serviceContext.getCreateDate(now));
		
		dossierProcessPersistence.update(dossierProcess);

		if (_log.isInfoEnabled()) {
			_log.info("Create new dossier process " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addDossierProcessResources(dossierProcess, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addDossierProcessResources(dossierProcess, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getDossierProcess(id);
	}

	@Indexable(type = IndexableType.REINDEX)
	public DossierProcess updateDossierProcess(
			long id, 
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		DossierProcess dossierProcess = dossierProcessPersistence.findByPrimaryKey(id);

		dossierProcess.setModifiedDate(serviceContext.getModifiedDate(null));
		
		dossierProcessPersistence.update(dossierProcess);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateDossierProcessResources(
				dossierProcess, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getDossierProcess(dossierProcess.getDossierProcessId());
	}

	public void updateDossierProcessResources(
			DossierProcess dossierProcess, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			dossierProcess.getCompanyId(), serviceContext.getScopeGroupId(),
			DossierProcess.class.getName(), dossierProcess.getDossierProcessId(), groupPermissions,
			guestPermissions);
	}
	
	public void removeDossierProcess(DossierProcess dossierProcess) throws PortalException, SystemException {
		dossierProcessPersistence.remove(dossierProcess);
		resourceLocalService.deleteResource(dossierProcess.getCompanyId(), DossierProcess.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, dossierProcess.getDossierProcessId());
	}
	
	public void removeDossierProcess(long id) throws PortalException, SystemException {
		DossierProcess dossierProcess = dossierProcessPersistence.findByPrimaryKey(id);
		removeDossierProcess(dossierProcess);
	}
	
	public DossierProcess getDossierProcess(long id) throws PortalException, SystemException {
		return dossierProcessPersistence.findByPrimaryKey(id);
	}

	public void addDossierProcessResources(DossierProcess dossierProcess, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(dossierProcess.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DossierProcess.class.getName(), dossierProcess.getDossierProcessId(), false, addGroupPermission, addGuestPermission);
	}

	public void addDossierProcessResources(DossierProcess dossierProcess, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(dossierProcess.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DossierProcess.class.getName(), dossierProcess.getDossierProcessId(), groupPermissions, guestPermissions);
	}
	
	public void addDossierProcessResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		DossierProcess dossierProcess = dossierProcessPersistence.findByPrimaryKey(id);
		addDossierProcessResources(dossierProcess, groupPermissions, guestPermissions, serviceContext);
	}
	
	protected void validate(long dossierProcId, String govAgencyId, String govAgencyName, long startDossierStepId, int daysDuration) throws PortalException {
	}
	
	public List<DossierProcess> getByCompany(long companyId, int startIndex, int endIndex) throws SystemException {
		return dossierProcessPersistence.findByC(companyId, startIndex, endIndex);
	}
	
	public List<DossierProcess> getByCompany(int startIndex, int endIndex, ServiceContext serviceContext) throws SystemException {
		return dossierProcessPersistence.findByC(serviceContext.getCompanyId(), startIndex, endIndex);
	}
	
	public int countByCompany(long companyId) throws SystemException {
		return dossierProcessPersistence.countByC(companyId);
	}
	
	public int countByCompany(ServiceContext serviceContext) throws SystemException {
		return dossierProcessPersistence.countByC(serviceContext.getCompanyId());
	}
	private static Log _log = LogFactoryUtil.getLog(DossierProcessLocalServiceImpl.class);
	
}