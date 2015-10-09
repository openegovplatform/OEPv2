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

package org.oep.core.datamgt.dictionary.service.impl;

import java.util.Date;

import org.oep.core.datamgt.dictionary.model.DictCollection;
import org.oep.core.datamgt.dictionary.service.base.DictCollectionServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the dictionary collection remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.datamgt.dictionary.service.DictCollectionService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author TrungDK
 * @see org.oep.core.datamgt.dictionary.service.base.DictCollectionServiceBaseImpl
 * @see org.oep.core.datamgt.dictionary.service.DictCollectionServiceUtil
 */
public class DictCollectionServiceImpl extends DictCollectionServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.datamgt.dictionary.service.DictCollectionServiceUtil} to access the dictionary collection remote service.
	 */
	public DictCollection addDictCollection(long companyId, String name, String version, String title, Date validatedFrom, Date validatedTo, int status, ServiceContext serviceContext) throws SystemException, PortalException {
		serviceContext.setCompanyId(companyId);
		return dictCollectionLocalService.addDictCollection(name, version, title, validatedFrom, validatedTo, status, serviceContext);
	}
	
	public DictCollection getDictCollectionByName(long companyId, String collectionName, ServiceContext serviceContext) throws SystemException {
		serviceContext.setCompanyId(companyId);
		return dictCollectionLocalService.getDictCollectionByName(collectionName, serviceContext);
	}	
}