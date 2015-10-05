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

package org.oep.core.dossiermgt.service.impl;

import java.util.Date;

import org.oep.core.dossiermgt.model.DossierProcAgent;
import org.oep.core.dossiermgt.service.base.DossierProcAgentLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the dossier proc agent local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.dossiermgt.service.DossierProcAgentLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.base.DossierProcAgentLocalServiceBaseImpl
 * @see org.oep.core.dossiermgt.service.DossierProcAgentLocalServiceUtil
 */
public class DossierProcAgentLocalServiceImpl
	extends DossierProcAgentLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.dossiermgt.service.DossierProcAgentLocalServiceUtil} to access the dossier proc agent local service.
	 */
	
	/** 
	 * Add dossier proc agent
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Create new
	 * @param
	 * @return: new dossier proc agent
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public DossierProcAgent addDossierProcAgent(
			long dossierProcId,
			String govAgentId,
			String govAgentName,
			long ebPartnerShipId,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate();
		long id = counterLocalService.increment();
		DossierProcAgent dossierProcAgent = dossierProcAgentPersistence.create(id);
		Date now = new Date();
				
		dossierProcAgent.setCompanyId(serviceContext.getCompanyId());
		dossierProcAgent.setDossierProcId(dossierProcId);
		dossierProcAgent.setGovAgentId(govAgentId);
		dossierProcAgent.setGovAgentName(govAgentName);
		dossierProcAgent.setEbPartnerShipId(ebPartnerShipId);
		
		dossierProcAgent.setCreateDate(serviceContext.getCreateDate(now));
		
		dossierProcAgentPersistence.update(dossierProcAgent);

		if (_log.isInfoEnabled()) {
			_log.info("Create new dossier proc " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addDossierProcAgentResources(dossierProcAgent, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addDossierProcAgentResources(dossierProcAgent, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getDossierProcAgent(id);
	}

	@Indexable(type = IndexableType.REINDEX)
	public DossierProcAgent updateDossierProcAgent(
			long id, 
			long dossierProcId,
			String govAgentId,
			String govAgentName,
			long ebPartnerShipId,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		validate();

		DossierProcAgent dossierProcAgent = dossierProcAgentPersistence.findByPrimaryKey(id);

		dossierProcAgent.setModifiedDate(serviceContext.getModifiedDate(null));
		dossierProcAgent.setDossierProcId(dossierProcId);
		dossierProcAgent.setGovAgentId(govAgentId);
		dossierProcAgent.setGovAgentName(govAgentName);
		dossierProcAgent.setEbPartnerShipId(ebPartnerShipId);

		dossierProcAgentPersistence.update(dossierProcAgent);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateDossierProcAgentResources(
				dossierProcAgent, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getDossierProcAgent(dossierProcAgent.getDossierProcAgentId());
	}
	
	public void updateDossierProcAgentResources(
			DossierProcAgent dossierProcAgent, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			dossierProcAgent.getCompanyId(), serviceContext.getScopeGroupId(),
			DossierProcAgent.class.getName(), dossierProcAgent.getDossierProcAgentId(), groupPermissions,
			guestPermissions);
	}
	
	public void removeDossierProcAgent(DossierProcAgent dossierProcAgent) throws PortalException, SystemException {
		dossierProcAgentPersistence.remove(dossierProcAgent);
		resourceLocalService.deleteResource(dossierProcAgent.getCompanyId(), DossierProcAgent.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, dossierProcAgent.getDossierProcAgentId());
	}
	
	public void removeDossierProcAgent(long id) throws PortalException, SystemException {
		DossierProcAgent dossierProcAgent = dossierProcAgentPersistence.findByPrimaryKey(id);
		removeDossierProcAgent(dossierProcAgent);
	}
	
	public DossierProcAgent getDossierProcAgent(long id) throws PortalException, SystemException {
		return dossierProcAgentPersistence.findByPrimaryKey(id);
	}

	public void addDossierProcAgentResources(DossierProcAgent dossierProcAgent, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(dossierProcAgent.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DossierProcAgent.class.getName(), dossierProcAgent.getDossierProcAgentId(), false, addGroupPermission, addGuestPermission);
	}

	public void addDossierProcAgentResources(DossierProcAgent dossierProcAgent, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(dossierProcAgent.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DossierProcAgent.class.getName(), dossierProcAgent.getDossierProcAgentId(), groupPermissions, guestPermissions);
	}
	
	public void addDossierProcAgentResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		DossierProcAgent dossierProcAgent = dossierProcAgentPersistence.findByPrimaryKey(id);
		addDossierProcAgentResources(dossierProcAgent, groupPermissions, guestPermissions, serviceContext);
	}
	
	protected void validate() throws PortalException {
	}
	
	private static Log _log = LogFactoryUtil.getLog(DossierProcAgentLocalServiceImpl.class);
}