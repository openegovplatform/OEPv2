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

import java.util.Collection;
import java.util.List;

import org.oep.core.datamgt.dictionary.model.DictCollection;
import org.oep.core.datamgt.dictionary.model.DictData;
import org.oep.core.datamgt.service.base.DictionaryAppLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the dictionary app local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.datamgt.service.DictionaryAppLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.core.datamgt.service.base.DictionaryAppLocalServiceBaseImpl
 * @see org.oep.core.datamgt.service.DictionaryAppLocalServiceUtil
 */
public class DictionaryAppLocalServiceImpl
	extends DictionaryAppLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.datamgt.service.DictionaryAppLocalServiceUtil} to access the dictionary app local service.
	 */

	public DictCollection getDictCollectionByName(String collectionName, ServiceContext serviceContext) throws SystemException {
		return dictCollectionLocalService.getDictCollectionByName(collectionName, serviceContext);
	}
	
	public Collection<DictCollection> getAllDictCollectionsByName(String collectionName, ServiceContext serviceContext) throws SystemException {
		return dictCollectionPersistence.findByC_N(serviceContext.getCompanyId(), collectionName);
	}	
	
	public List<String> getAllDictCollectionNames(ServiceContext serviceContext) throws SystemException {
		return dictCollectionLocalService.getAllDictCollectionNames(serviceContext);
	}
	public List<String> getAllDictCollectionNames(long companyId) throws SystemException {
		return dictCollectionLocalService.getAllDictCollectionNames(companyId);
	}	
	
	public List<DictData> getDictDatasByCollection(String collectionName, int dataLevel, ServiceContext serviceContext) throws SystemException {
		return dictDataLocalService.getDictDatasByCollection(collectionName, dataLevel, serviceContext);
	}
	
	public DictData getDictDataByCode(String collectionName, String dataCode, ServiceContext serviceContext) throws SystemException {
		return dictDataLocalService.getDictDataByCode(collectionName, dataCode, serviceContext);
	}
	
	public DictData saveDictData(DictData item, ServiceContext serviceContext) throws PortalException, SystemException {
		return dictDataLocalService.saveDictData(item, serviceContext);
	}
	
}