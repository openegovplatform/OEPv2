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
 * Provides a wrapper for {@link DictionaryAppLocalService}.
 *
 * @author trungdk
 * @see DictionaryAppLocalService
 * @generated
 */
public class DictionaryAppLocalServiceWrapper
	implements DictionaryAppLocalService,
		ServiceWrapper<DictionaryAppLocalService> {
	public DictionaryAppLocalServiceWrapper(
		DictionaryAppLocalService dictionaryAppLocalService) {
		_dictionaryAppLocalService = dictionaryAppLocalService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dictionaryAppLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dictionaryAppLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dictionaryAppLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public org.oep.core.datamgt.dictionary.model.DictCollection getDictCollectionByName(
		java.lang.String collectionName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictionaryAppLocalService.getDictCollectionByName(collectionName,
			serviceContext);
	}

	@Override
	public java.util.Collection<org.oep.core.datamgt.dictionary.model.DictCollection> getAllDictCollectionsByName(
		java.lang.String collectionName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictionaryAppLocalService.getAllDictCollectionsByName(collectionName,
			serviceContext);
	}

	@Override
	public java.util.List<java.lang.String> getAllDictCollectionNames(
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictionaryAppLocalService.getAllDictCollectionNames(serviceContext);
	}

	@Override
	public java.util.List<java.lang.String> getAllDictCollectionNames(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictionaryAppLocalService.getAllDictCollectionNames(companyId);
	}

	@Override
	public java.util.List<org.oep.core.datamgt.dictionary.model.DictData> getDictDatasByCollection(
		java.lang.String collectionName, int dataLevel,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictionaryAppLocalService.getDictDatasByCollection(collectionName,
			dataLevel, serviceContext);
	}

	@Override
	public org.oep.core.datamgt.dictionary.model.DictData getDictDataByCode(
		java.lang.String collectionName, java.lang.String dataCode,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictionaryAppLocalService.getDictDataByCode(collectionName,
			dataCode, serviceContext);
	}

	@Override
	public org.oep.core.datamgt.dictionary.model.DictData saveDictData(
		org.oep.core.datamgt.dictionary.model.DictData item,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dictionaryAppLocalService.saveDictData(item, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DictionaryAppLocalService getWrappedDictionaryAppLocalService() {
		return _dictionaryAppLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDictionaryAppLocalService(
		DictionaryAppLocalService dictionaryAppLocalService) {
		_dictionaryAppLocalService = dictionaryAppLocalService;
	}

	@Override
	public DictionaryAppLocalService getWrappedService() {
		return _dictionaryAppLocalService;
	}

	@Override
	public void setWrappedService(
		DictionaryAppLocalService dictionaryAppLocalService) {
		_dictionaryAppLocalService = dictionaryAppLocalService;
	}

	private DictionaryAppLocalService _dictionaryAppLocalService;
}