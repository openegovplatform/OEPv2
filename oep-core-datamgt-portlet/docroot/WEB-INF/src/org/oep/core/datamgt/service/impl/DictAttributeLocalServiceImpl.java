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

package org.oep.core.datamgt.service.impl;

import java.util.Date;

import org.oep.core.datamgt.model.DictAttribute;
import org.oep.core.datamgt.service.base.DictAttributeLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the dictionary attribute local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.datamgt.service.DictAttributeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author NQMINH
 * @see org.oep.core.datamgt.service.base.DictAttributeLocalServiceBaseImpl
 * @see org.oep.core.datamgt.service.DictAttributeLocalServiceUtil
 */
public class DictAttributeLocalServiceImpl
	extends DictAttributeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.datamgt.service.DictAttributeLocalServiceUtil} to access the dictionary attribute local service.
	 */
	public DictAttribute addDictAttribute(String collectionName, String name, String title,String dataType, ServiceContext serviceContext) throws SystemException, PortalException {
		//validate(collectionName, dataCode, title, status);
		long id = counterLocalService.increment();
		DictAttribute dictAttribute = dictAttributePersistence.create(id);
		Date now = new Date();
		
		dictAttribute.setCollectionName(collectionName);
		
		dictAttribute.setTitle(title);
		dictAttribute.setName(name);
		dictAttribute.setDataType(dataType);
		
		dictAttribute.setCompanyId(serviceContext.getCompanyId());
		dictAttribute.setGroupId(serviceContext.getScopeGroupId());
		dictAttribute.setUserId(serviceContext.getUserId());
		dictAttribute.setCreateDate(serviceContext.getCreateDate(now));
		dictAttribute.setModifiedDate(serviceContext.getCreateDate(now));

		
		dictAttributePersistence.update(dictAttribute);

		if (_log.isInfoEnabled()) {
			_log.info("Create new dict data " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addDictAttributeResources(dictAttribute, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addDictAttributeResources(dictAttribute, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getDictAttribute(id);
	}
	

	public DictAttribute updateDictAttribute(long id, String collectionName,  String name, String title,String dataType, ServiceContext serviceContext)
		throws PortalException, SystemException {

		//validate(collectionName, dataCode, title, status);

		DictAttribute dictAttribute = dictAttributePersistence.findByPrimaryKey(id);

		dictAttribute.setModifiedDate(serviceContext.getModifiedDate(null));
		dictAttribute.setCollectionName(collectionName);
		dictAttribute.setCollectionName(collectionName);
		dictAttribute.setTitle(title);
		dictAttribute.setName(name);
		dictAttribute.setDataType(dataType);
		
		dictAttributePersistence.update(dictAttribute);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateDictAttributeResources(
				dictAttribute, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getDictAttribute(dictAttribute.getDictAttributeId());
	}

	public DictAttribute saveDictAttribute(DictAttribute dictAttribute, ServiceContext serviceContext) throws PortalException, SystemException {
		return updateDictAttribute(dictAttribute.getDictAttributeId(), dictAttribute.getCollectionName(), dictAttribute.getName(),dictAttribute.getTitle(), dictAttribute.getDataType(), serviceContext);
	}
	
	public void updateDictAttributeResources(
			DictAttribute dictAttribute, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			dictAttribute.getCompanyId(), serviceContext.getGuestOrUserId(),
			DictAttribute.class.getName(), dictAttribute.getDictAttributeId(), groupPermissions,
			guestPermissions);
	}
	
	public void removeDictAttribute(DictAttribute dictAttribute) throws PortalException, SystemException {
		dictAttributePersistence.remove(dictAttribute);
		resourceLocalService.deleteResource(dictAttribute.getCompanyId(), DictAttribute.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, dictAttribute.getDictAttributeId());
	}
	
	public void removeDictAttribute(long id) throws PortalException, SystemException {
		DictAttribute dictAttribute = dictAttributePersistence.findByPrimaryKey(id);
		removeDictAttribute(dictAttribute);
	}
	
	public DictAttribute getDictAttribute(long id) throws PortalException, SystemException {
		return dictAttributePersistence.findByPrimaryKey(id);
	}

	public void addDictAttributeResources(DictAttribute dictAttribute, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(dictAttribute.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DictAttribute.class.getName(), dictAttribute.getDictAttributeId(), false, addGroupPermission, addGuestPermission);
	}

	public void addDictAttributeResources(DictAttribute dictAttribute, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(dictAttribute.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DictAttribute.class.getName(), dictAttribute.getDictAttributeId(), groupPermissions, guestPermissions);
	}
	
	public void addDictAttributeResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		DictAttribute dictAttribute = dictAttributePersistence.findByPrimaryKey(id);
		addDictAttributeResources(dictAttribute, groupPermissions, guestPermissions, serviceContext);
	}
	
	
	
	private static Log _log = LogFactoryUtil.getLog(DictDataLocalServiceImpl.class);
}