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

import org.oep.core.dossiermgt.model.DossierFolder;
import org.oep.core.dossiermgt.service.base.DossierFolderLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the dossier folder local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.dossiermgt.service.DossierFolderLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.base.DossierFolderLocalServiceBaseImpl
 * @see org.oep.core.dossiermgt.service.DossierFolderLocalServiceUtil
 */
public class DossierFolderLocalServiceImpl
	extends DossierFolderLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.dossiermgt.service.DossierFolderLocalServiceUtil} to access the dossier folder local service.
	 */
	
	/** 
	 * Add dossier folder
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Create new
	 * @param
	 * @return: new dossier folder
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public DossierFolder addDossierFolder(
			String folderName,
			long parentDossierFolderId,
			int sequenceNo,
			String procedureFilter,
			String statusFilter,
			int filterByOrganization,
			int filterByUser,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate();
		long id = counterLocalService.increment();
		DossierFolder dossierFolder = dossierFolderPersistence.create(id);
		Date now = new Date();
				
		dossierFolder.setCompanyId(serviceContext.getCompanyId());
		dossierFolder.setCreateDate(serviceContext.getCreateDate(now));
		dossierFolder.setFolderName(folderName);
		dossierFolder.setParentDossierFolderId(parentDossierFolderId);
		dossierFolder.setSequenceNo(sequenceNo);
		dossierFolder.setProcedureFilter(procedureFilter);
		dossierFolder.setStatusFilter(statusFilter);
		dossierFolder.setFilterByOrganization(filterByOrganization);
		dossierFolder.setFilterByUser(filterByUser);
		
		dossierFolderPersistence.update(dossierFolder);

		if (_log.isInfoEnabled()) {
			_log.info("Create new dossier proc " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addDossierFolderResources(dossierFolder, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addDossierFolderResources(dossierFolder, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getDossierFolder(id);
	}

	@Indexable(type = IndexableType.REINDEX)
	public DossierFolder updateDossierFolder(
			long id, 
			String folderName,
			long parentDossierFolderId,
			int sequenceNo,
			String procedureFilter,
			String statusFilter,
			int filterByOrganization,
			int filterByUser,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		validate();

		DossierFolder dossierFolder = dossierFolderPersistence.findByPrimaryKey(id);

		dossierFolder.setModifiedDate(serviceContext.getModifiedDate(null));
		dossierFolder.setFolderName(folderName);
		dossierFolder.setParentDossierFolderId(parentDossierFolderId);
		dossierFolder.setSequenceNo(sequenceNo);
		dossierFolder.setProcedureFilter(procedureFilter);
		dossierFolder.setStatusFilter(statusFilter);
		dossierFolder.setFilterByOrganization(filterByOrganization);
		dossierFolder.setFilterByUser(filterByUser);

		dossierFolderPersistence.update(dossierFolder);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateDossierFolderResources(
				dossierFolder, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getDossierFolder(dossierFolder.getDossierFolderId());
	}
	
	public void updateDossierFolderResources(
			DossierFolder dossierFolder, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			dossierFolder.getCompanyId(), serviceContext.getScopeGroupId(),
			DossierFolder.class.getName(), dossierFolder.getDossierFolderId(), groupPermissions,
			guestPermissions);
	}
	
	public void removeDossierFolder(DossierFolder dossierFolder) throws PortalException, SystemException {
		dossierFolderPersistence.remove(dossierFolder);
		resourceLocalService.deleteResource(dossierFolder.getCompanyId(), DossierFolder.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, dossierFolder.getDossierFolderId());
	}
	
	public void removeDossierFolder(long id) throws PortalException, SystemException {
		DossierFolder dossierFolder = dossierFolderPersistence.findByPrimaryKey(id);
		removeDossierFolder(dossierFolder);
	}
	
	public DossierFolder getDossierFolder(long id) throws PortalException, SystemException {
		return dossierFolderPersistence.findByPrimaryKey(id);
	}

	public void addDossierFolderResources(DossierFolder dossierFolder, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(dossierFolder.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DossierFolder.class.getName(), dossierFolder.getDossierFolderId(), false, addGroupPermission, addGuestPermission);
	}

	public void addDossierFolderResources(DossierFolder dossierFolder, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(dossierFolder.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DossierFolder.class.getName(), dossierFolder.getDossierFolderId(), groupPermissions, guestPermissions);
	}
	
	public void addDossierFolderResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		DossierFolder dossierFolder = dossierFolderPersistence.findByPrimaryKey(id);
		addDossierFolderResources(dossierFolder, groupPermissions, guestPermissions, serviceContext);
	}
	
	protected void validate() throws PortalException {
	}
	
	private static Log _log = LogFactoryUtil.getLog(DossierFolderLocalServiceImpl.class);
	
}