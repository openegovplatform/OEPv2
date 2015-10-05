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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for DictionaryApp. This utility wraps
 * {@link org.oep.core.datamgt.service.impl.DictionaryAppServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author trungdk
 * @see DictionaryAppService
 * @see org.oep.core.datamgt.service.base.DictionaryAppServiceBaseImpl
 * @see org.oep.core.datamgt.service.impl.DictionaryAppServiceImpl
 * @generated
 */
public class DictionaryAppServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.core.datamgt.service.impl.DictionaryAppServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.util.List<java.lang.String> getAllDictCollectionNames(
		long companyId, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAllDictCollectionNames(companyId, serviceContext);
	}

	public static java.util.List<java.lang.String> getAllDictCollectionNames(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAllDictCollectionNames(companyId);
	}

	public static org.oep.core.datamgt.dictionary.model.DictCollection getDictCollectionByName(
		long companyId, java.lang.String collectionName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getDictCollectionByName(companyId, collectionName,
			serviceContext);
	}

	public static org.oep.core.datamgt.dictionary.model.DictData getDictDataByCode(
		long companyId, java.lang.String collectionName,
		java.lang.String dataCode,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getDictDataByCode(companyId, collectionName, dataCode,
			serviceContext);
	}

	public static org.oep.core.datamgt.dictionary.model.DictData saveDictData(
		org.oep.core.datamgt.dictionary.model.DictData item,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().saveDictData(item, serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static DictionaryAppService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DictionaryAppService.class.getName());

			if (invokableService instanceof DictionaryAppService) {
				_service = (DictionaryAppService)invokableService;
			}
			else {
				_service = new DictionaryAppServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(DictionaryAppServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DictionaryAppService service) {
	}

	private static DictionaryAppService _service;
}