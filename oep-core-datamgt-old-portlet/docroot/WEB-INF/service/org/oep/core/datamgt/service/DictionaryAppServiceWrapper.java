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

package org.oep.core.datamgt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DictionaryAppService}.
 *
 * @author trungdk
 * @see DictionaryAppService
 * @generated
 */
public class DictionaryAppServiceWrapper implements DictionaryAppService,
	ServiceWrapper<DictionaryAppService> {
	public DictionaryAppServiceWrapper(
		DictionaryAppService dictionaryAppService) {
		_dictionaryAppService = dictionaryAppService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dictionaryAppService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dictionaryAppService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dictionaryAppService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<java.lang.String> getAllDictCollectionNames(
		long companyId, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictionaryAppService.getAllDictCollectionNames(companyId,
			serviceContext);
	}

	@Override
	public java.util.List<java.lang.String> getAllDictCollectionNames(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictionaryAppService.getAllDictCollectionNames(companyId);
	}

	@Override
	public org.oep.core.datamgt.dictionary.model.DictCollection getDictCollectionByName(
		long companyId, java.lang.String collectionName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictionaryAppService.getDictCollectionByName(companyId,
			collectionName, serviceContext);
	}

	@Override
	public org.oep.core.datamgt.dictionary.model.DictData getDictDataByCode(
		long companyId, java.lang.String collectionName,
		java.lang.String dataCode,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictionaryAppService.getDictDataByCode(companyId,
			collectionName, dataCode, serviceContext);
	}

	@Override
	public org.oep.core.datamgt.dictionary.model.DictData saveDictData(
		org.oep.core.datamgt.dictionary.model.DictData item,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dictionaryAppService.saveDictData(item, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DictionaryAppService getWrappedDictionaryAppService() {
		return _dictionaryAppService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDictionaryAppService(
		DictionaryAppService dictionaryAppService) {
		_dictionaryAppService = dictionaryAppService;
	}

	@Override
	public DictionaryAppService getWrappedService() {
		return _dictionaryAppService;
	}

	@Override
	public void setWrappedService(DictionaryAppService dictionaryAppService) {
		_dictionaryAppService = dictionaryAppService;
	}

	private DictionaryAppService _dictionaryAppService;
}