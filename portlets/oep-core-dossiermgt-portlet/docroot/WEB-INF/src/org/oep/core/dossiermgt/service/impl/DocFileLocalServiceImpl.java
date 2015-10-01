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

import org.oep.core.dossiermgt.model.DocFile;
import org.oep.core.dossiermgt.service.base.DocFileLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the doc file local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.dossiermgt.service.DocFileLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.base.DocFileLocalServiceBaseImpl
 * @see org.oep.core.dossiermgt.service.DocFileLocalServiceUtil
 */
public class DocFileLocalServiceImpl extends DocFileLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.dossiermgt.service.DocFileLocalServiceUtil} to access the doc file local service.
	 */

	/** 
	 * Add dossier proc
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Create new
	 * @param
	 * @return: new dossier proc
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public DocFile addDocFile(
			long dossierId,
			long dossierDocId,
			long docTemplateId,
			long docFileVersionId,
			String docName,
			String note,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate();
		long id = counterLocalService.increment();
		DocFile docFile = docFilePersistence.create(id);
		Date now = new Date();
				
		docFile.setCompanyId(serviceContext.getCompanyId());
		docFile.setGroupId(serviceContext.getScopeGroupId());
		docFile.setUserId(serviceContext.getUserId());
		docFile.setCreateDate(serviceContext.getCreateDate(now));
		docFile.setDossierId(dossierId);
		docFile.setDossierDocId(dossierDocId);
		docFile.setDocTemplateId(docTemplateId);
		docFile.setDocFileVersionId(docFileVersionId);
		docFile.setDocName(docName);
		docFile.setNote(note);
		
		docFilePersistence.update(docFile);

		if (_log.isInfoEnabled()) {
			_log.info("Create new dossier proc " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addDocFileResources(docFile, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addDocFileResources(docFile, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getDocFile(id);
	}
	
	@Indexable(type = IndexableType.REINDEX)
	public DocFile updateDocFile(
			long id, 
			long dossierId,
			long dossierDocId,
			long docTemplateId,
			long docFileVersionId,
			String docName,
			String note,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		validate();

		DocFile docFile = docFilePersistence.findByPrimaryKey(id);

		docFile.setModifiedDate(serviceContext.getModifiedDate(null));
		docFile.setDossierId(dossierId);
		docFile.setDossierDocId(dossierDocId);
		docFile.setDocTemplateId(docTemplateId);
		docFile.setDocFileVersionId(docFileVersionId);
		docFile.setDocName(docName);
		docFile.setNote(note);

		docFilePersistence.update(docFile);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateDocFileResources(
				docFile, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getDocFile(docFile.getDocFileId());
	}
	
	public void updateDocFileResources(
			DocFile docFile, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			docFile.getCompanyId(), serviceContext.getScopeGroupId(),
			DocFile.class.getName(), docFile.getDocFileId(), groupPermissions,
			guestPermissions);
	}
	
	public void removeDocFile(DocFile docFile) throws PortalException, SystemException {
		docFilePersistence.remove(docFile);
		resourceLocalService.deleteResource(docFile.getCompanyId(), DocFile.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, docFile.getDocFileId());
	}
	
	public void removeDocFile(long id) throws PortalException, SystemException {
		DocFile docFile = docFilePersistence.findByPrimaryKey(id);
		removeDocFile(docFile);
	}
	
	public DocFile getDocFile(long id) throws PortalException, SystemException {
		return docFilePersistence.findByPrimaryKey(id);
	}

	public void addDocFileResources(DocFile docFile, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(docFile.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DocFile.class.getName(), docFile.getDocFileId(), false, addGroupPermission, addGuestPermission);
	}

	public void addDocFileResources(DocFile docFile, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(docFile.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DocFile.class.getName(), docFile.getDocFileId(), groupPermissions, guestPermissions);
	}
	
	public void addDocFileResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		DocFile docFile = docFilePersistence.findByPrimaryKey(id);
		addDocFileResources(docFile, groupPermissions, guestPermissions, serviceContext);
	}
	
	protected void validate() throws PortalException {
	}
	
	private static Log _log = LogFactoryUtil.getLog(DocFileLocalServiceImpl.class);
	
}