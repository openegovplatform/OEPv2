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

package org.oep.datamgt.service.impl;

import java.util.Date;

import org.oep.datamgt.model.DictMetaData;
import org.oep.datamgt.service.base.DictMetaDataLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the dictionary meta data local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.datamgt.service.DictMetaDataLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author NQMINH
 * @see org.oep.datamgt.service.base.DictMetaDataLocalServiceBaseImpl
 * @see org.oep.datamgt.service.DictMetaDataLocalServiceUtil
 */
public class DictMetaDataLocalServiceImpl
	extends DictMetaDataLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.datamgt.service.DictMetaDataLocalServiceUtil} to access the dictionary meta data local service.
	 */
	public DictMetaData addDictMetaData(long dictDataId, String attributeName, String attributeValue, ServiceContext serviceContext) throws SystemException, PortalException {
		//validate(collectionName, dataCode, title, status);
		long id = counterLocalService.increment();
		DictMetaData dictMetaData = dictMetaDataPersistence.create(id);
		Date now = new Date();
		
		dictMetaData.setDictDataId(dictDataId);
		dictMetaData.setAttributeName(attributeName);
		dictMetaData.setAttributeValue(attributeValue);
		
		dictMetaData.setCompanyId(serviceContext.getCompanyId());
		dictMetaData.setGroupId(serviceContext.getScopeGroupId());
		dictMetaData.setUserId(serviceContext.getUserId());
		dictMetaData.setCreateDate(serviceContext.getCreateDate(now));
		dictMetaData.setModifiedDate(serviceContext.getCreateDate(now));

		
		dictMetaDataPersistence.update(dictMetaData);

		if (_log.isInfoEnabled()) {
			_log.info("Create new dict data " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addDictMetaDataResources(dictMetaData, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addDictMetaDataResources(dictMetaData, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getDictMetaData(id);
	}
	

	public DictMetaData updateDictMetaData(long id, long dictDataId, String attributeName, String attributeValue, ServiceContext serviceContext)
		throws PortalException, SystemException {

		//validate(collectionName, dataCode, title, status);

		DictMetaData dictMetaData = dictMetaDataPersistence.findByPrimaryKey(id);

		dictMetaData.setModifiedDate(serviceContext.getModifiedDate(null));
		dictMetaData.setDictDataId(dictDataId);
		dictMetaData.setAttributeName(attributeName);
		dictMetaData.setAttributeValue(attributeValue);
		
		dictMetaDataPersistence.update(dictMetaData);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateDictMetaDataResources(
				dictMetaData, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getDictMetaData(dictMetaData.getDictMetaDataId());
	}

	public DictMetaData saveDictMetaData(DictMetaData dictMetaData, ServiceContext serviceContext) throws PortalException, SystemException {
		return updateDictMetaData(dictMetaData.getDictMetaDataId(), dictMetaData.getDictDataId(), dictMetaData.getAttributeName(),dictMetaData.getAttributeValue(), serviceContext);
	}
	
	public void updateDictMetaDataResources(
			DictMetaData dictMetaData, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			dictMetaData.getCompanyId(), serviceContext.getGuestOrUserId(),
			DictMetaData.class.getName(), dictMetaData.getDictMetaDataId(), groupPermissions,
			guestPermissions);
	}
	
	public void removeDictMetaData(DictMetaData dictMetaData) throws PortalException, SystemException {
		dictMetaDataPersistence.remove(dictMetaData);
		resourceLocalService.deleteResource(dictMetaData.getCompanyId(), DictMetaData.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, dictMetaData.getDictMetaDataId());
	}
	
	public void removeDictMetaData(long id) throws PortalException, SystemException {
		DictMetaData dictMetaData = dictMetaDataPersistence.findByPrimaryKey(id);
		removeDictMetaData(dictMetaData);
	}
	
	public DictMetaData getDictMetaData(long id) throws PortalException, SystemException {
		return dictMetaDataPersistence.findByPrimaryKey(id);
	}

	public void addDictMetaDataResources(DictMetaData dictMetaData, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(dictMetaData.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DictMetaData.class.getName(), dictMetaData.getDictMetaDataId(), false, addGroupPermission, addGuestPermission);
	}

	public void addDictMetaDataResources(DictMetaData dictMetaData, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(dictMetaData.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DictMetaData.class.getName(), dictMetaData.getDictMetaDataId(), groupPermissions, guestPermissions);
	}
	
	public void addDictMetaDataResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		DictMetaData dictMetaData = dictMetaDataPersistence.findByPrimaryKey(id);
		addDictMetaDataResources(dictMetaData, groupPermissions, guestPermissions, serviceContext);
	}
	
	private static Log _log = LogFactoryUtil.getLog(DictDataLocalServiceImpl.class);
}