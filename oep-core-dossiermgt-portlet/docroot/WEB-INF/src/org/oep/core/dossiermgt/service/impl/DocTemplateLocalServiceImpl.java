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

import org.oep.core.dossiermgt.TemplateNoException;
import org.oep.core.dossiermgt.model.DocTemplate;
import org.oep.core.dossiermgt.service.base.DocTemplateLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the doc template local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.dossiermgt.service.DocTemplateLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.base.DocTemplateLocalServiceBaseImpl
 * @see org.oep.core.dossiermgt.service.DocTemplateLocalServiceUtil
 */
public class DocTemplateLocalServiceImpl extends DocTemplateLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.dossiermgt.service.DocTemplateLocalServiceUtil} to access the doc template local service.
	 */
	
	/** 
	 * Add doc template
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Create new
	 * @param
	 * @return: new doc template
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public DocTemplate addDocTemplate(
			String templateNo, 
			String title,
			String enTitle,
			long fileEntryId,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate(templateNo);
		long id = counterLocalService.increment();
		DocTemplate docTemplate = docTemplatePersistence.create(id);
		Date now = new Date();
		
		docTemplate.setCompanyId(serviceContext.getCompanyId());
		docTemplate.setGroupId(serviceContext.getScopeGroupId());
		docTemplate.setUserId(serviceContext.getUserId());
		docTemplate.setCreateDate(serviceContext.getCreateDate(now));
		docTemplate.setTemplateNo(templateNo);
		docTemplate.setTitle(title);
		docTemplate.setEnTitle(enTitle);
		docTemplate.setFileEntryId(fileEntryId);
		
		docTemplatePersistence.update(docTemplate);

		if (_log.isInfoEnabled()) {
			_log.info("Create new dossier proc " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addDocTemplateResources(docTemplate, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addDocTemplateResources(docTemplate, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getDocTemplate(id);
	}

	@Indexable(type = IndexableType.REINDEX)
	public DocTemplate updateDocTemplate(
			long id, 
			String templateNo, 
			String title,
			String enTitle,
			long fileEntryId,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		validate(templateNo);

		DocTemplate docTemplate = docTemplatePersistence.findByPrimaryKey(id);

		docTemplate.setModifiedDate(serviceContext.getModifiedDate(null));
		docTemplate.setCompanyId(serviceContext.getCompanyId());
		docTemplate.setGroupId(serviceContext.getScopeGroupId());
		docTemplate.setUserId(serviceContext.getUserId());
		docTemplate.setTemplateNo(templateNo);
		docTemplate.setTitle(title);
		docTemplate.setEnTitle(enTitle);
		docTemplate.setFileEntryId(fileEntryId);

		docTemplatePersistence.update(docTemplate);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateDocTemplateResources(
				docTemplate, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getDocTemplate(docTemplate.getDocTemplateId());
	}
	
	public void updateDocTemplateResources(
			DocTemplate docTemplate, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			docTemplate.getCompanyId(), serviceContext.getScopeGroupId(),
			DocTemplate.class.getName(), docTemplate.getDocTemplateId(), groupPermissions,
			guestPermissions);
	}
	
	public void removeDocTemplate(DocTemplate docTemplate) throws PortalException, SystemException {
		docTemplatePersistence.remove(docTemplate);
		resourceLocalService.deleteResource(docTemplate.getCompanyId(), DocTemplate.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, docTemplate.getDocTemplateId());
	}
	
	public void removeDocTemplate(long id) throws PortalException, SystemException {
		DocTemplate docTemplate = docTemplatePersistence.findByPrimaryKey(id);
		removeDocTemplate(docTemplate);
	}
	
	public DocTemplate getDocTemplate(long id) throws PortalException, SystemException {
		return docTemplatePersistence.findByPrimaryKey(id);
	}

	public void addDocTemplateResources(DocTemplate docTemplate, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(docTemplate.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DocTemplate.class.getName(), docTemplate.getDocTemplateId(), false, addGroupPermission, addGuestPermission);
	}

	public void addDocTemplateResources(DocTemplate docTemplate, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(docTemplate.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DocTemplate.class.getName(), docTemplate.getDocTemplateId(), groupPermissions, guestPermissions);
	}
	
	public void addDocTemplateResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		DocTemplate docTemplate = docTemplatePersistence.findByPrimaryKey(id);
		addDocTemplateResources(docTemplate, groupPermissions, guestPermissions, serviceContext);
	}
	
	protected void validate(String templateNo) throws PortalException {
		if (Validator.isNull(templateNo)) {
			throw new TemplateNoException();
		}
	}
	
	private static Log _log = LogFactoryUtil.getLog(DocTemplateLocalServiceImpl.class);
	
}