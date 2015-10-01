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

import org.oep.core.dossiermgt.model.DocFileVersion;
import org.oep.core.dossiermgt.service.base.DocFileVersionLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the doc file version local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.dossiermgt.service.DocFileVersionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.base.DocFileVersionLocalServiceBaseImpl
 * @see org.oep.core.dossiermgt.service.DocFileVersionLocalServiceUtil
 */
public class DocFileVersionLocalServiceImpl
	extends DocFileVersionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.dossiermgt.service.DocFileVersionLocalServiceUtil} to access the doc file version local service.
	 */
	
	/** 
	 * Add doc file version
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Create new
	 * @param
	 * @return: new doc file version
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public DocFileVersion addDocFileVersion(
			long docFileId,
			long fileEntryId,
			String xmlContent,
			long ebMessageId,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate();
		long id = counterLocalService.increment();
		DocFileVersion docFileVersion = docFileVersionPersistence.create(id);
		Date now = new Date();
				
		docFileVersion.setCompanyId(serviceContext.getCompanyId());
		docFileVersion.setGroupId(serviceContext.getScopeGroupId());
		docFileVersion.setUserId(serviceContext.getUserId());
		docFileVersion.setCreateDate(serviceContext.getCreateDate(now));
		docFileVersion.setDocFileId(docFileId);
		docFileVersion.setFileEntryId(fileEntryId);
		docFileVersion.setXmlContent(xmlContent);
		docFileVersion.setEbMessageId(ebMessageId);
		
		docFileVersionPersistence.update(docFileVersion);

		if (_log.isInfoEnabled()) {
			_log.info("Create new dossier proc " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addDocFileVersionResources(docFileVersion, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addDocFileVersionResources(docFileVersion, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getDocFileVersion(id);
	}

	@Indexable(type = IndexableType.REINDEX)
	public DocFileVersion updateDocFileVersion(
			long id, 
			long docFileId,
			long fileEntryId,
			String xmlContent,
			long ebMessageId,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		validate();

		DocFileVersion docFileVersion = docFileVersionPersistence.findByPrimaryKey(id);
		docFileVersion.setDocFileId(docFileId);
		docFileVersion.setFileEntryId(fileEntryId);
		docFileVersion.setXmlContent(xmlContent);
		docFileVersion.setEbMessageId(ebMessageId);


		docFileVersionPersistence.update(docFileVersion);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateDocFileVersionResources(
				docFileVersion, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getDocFileVersion(docFileVersion.getDocFileVersionId());
	}
	
	public void updateDocFileVersionResources(
			DocFileVersion docFileVersion, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			docFileVersion.getCompanyId(), serviceContext.getScopeGroupId(),
			DocFileVersion.class.getName(), docFileVersion.getDocFileVersionId(), groupPermissions,
			guestPermissions);
	}
	
	public void removeDocFileVersion(DocFileVersion docFileVersion) throws PortalException, SystemException {
		docFileVersionPersistence.remove(docFileVersion);
		resourceLocalService.deleteResource(docFileVersion.getCompanyId(), DocFileVersion.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, docFileVersion.getDocFileVersionId());
	}
	
	public void removeDocFileVersion(long id) throws PortalException, SystemException {
		DocFileVersion docFileVersion = docFileVersionPersistence.findByPrimaryKey(id);
		removeDocFileVersion(docFileVersion);
	}
	
	public DocFileVersion getDocFileVersion(long id) throws PortalException, SystemException {
		return docFileVersionPersistence.findByPrimaryKey(id);
	}

	public void addDocFileVersionResources(DocFileVersion docFileVersion, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(docFileVersion.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DocFileVersion.class.getName(), docFileVersion.getDocFileVersionId(), false, addGroupPermission, addGuestPermission);
	}

	public void addDocFileVersionResources(DocFileVersion docFileVersion, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(docFileVersion.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DocFileVersion.class.getName(), docFileVersion.getDocFileVersionId(), groupPermissions, guestPermissions);
	}
	
	public void addDocFileVersionResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		DocFileVersion docFileVersion = docFileVersionPersistence.findByPrimaryKey(id);
		addDocFileVersionResources(docFileVersion, groupPermissions, guestPermissions, serviceContext);
	}
	
	protected void validate() throws PortalException {
	}
	
	private static Log _log = LogFactoryUtil.getLog(DocFileVersionLocalServiceImpl.class);
	
}