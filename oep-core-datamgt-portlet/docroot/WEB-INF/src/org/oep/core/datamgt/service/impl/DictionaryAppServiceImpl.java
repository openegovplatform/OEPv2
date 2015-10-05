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

import java.util.List;

import org.oep.core.datamgt.dictionary.model.DictCollection;
import org.oep.core.datamgt.dictionary.model.DictData;
import org.oep.core.datamgt.service.base.DictionaryAppServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the dictionary app remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.datamgt.service.DictionaryAppService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author trungdk
 * @see org.oep.core.datamgt.service.base.DictionaryAppServiceBaseImpl
 * @see org.oep.core.datamgt.service.DictionaryAppServiceUtil
 */
public class DictionaryAppServiceImpl extends DictionaryAppServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.datamgt.service.DictionaryAppServiceUtil} to access the dictionary app remote service.
	 */
		
	public List<String> getAllDictCollectionNames(long companyId, ServiceContext serviceContext) throws SystemException {
		serviceContext.setCompanyId(companyId);
		return dictionaryAppLocalService.getAllDictCollectionNames(serviceContext);
	}
	public List<String> getAllDictCollectionNames(long companyId) throws SystemException {
		return dictionaryAppLocalService.getAllDictCollectionNames(companyId);
	}		
	
	public DictCollection getDictCollectionByName(long companyId, String collectionName, ServiceContext serviceContext) throws SystemException {
		serviceContext.setCompanyId(companyId);
		return dictionaryAppLocalService.getDictCollectionByName(collectionName, serviceContext);
	}
	
	public DictData getDictDataByCode(long companyId, String collectionName, String dataCode, ServiceContext serviceContext) throws SystemException {
		serviceContext.setCompanyId(companyId);
		return dictionaryAppLocalService.getDictDataByCode(collectionName, dataCode, serviceContext);
	}
	
	public DictData saveDictData(DictData item, ServiceContext serviceContext) throws PortalException, SystemException {
		serviceContext.setCompanyId(item.getCompanyId());
		return dictionaryAppLocalService.saveDictData(item, serviceContext);
	}
	
}