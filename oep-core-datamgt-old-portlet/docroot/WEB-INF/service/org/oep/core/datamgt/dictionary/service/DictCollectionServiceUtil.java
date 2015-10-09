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

package org.oep.core.datamgt.dictionary.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for DictCollection. This utility wraps
 * {@link org.oep.core.datamgt.dictionary.service.impl.DictCollectionServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author TrungDK
 * @see DictCollectionService
 * @see org.oep.core.datamgt.dictionary.service.base.DictCollectionServiceBaseImpl
 * @see org.oep.core.datamgt.dictionary.service.impl.DictCollectionServiceImpl
 * @generated
 */
public class DictCollectionServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.core.datamgt.dictionary.service.impl.DictCollectionServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static org.oep.core.datamgt.dictionary.model.DictCollection addDictCollection(
		long companyId, java.lang.String name, java.lang.String version,
		java.lang.String title, java.util.Date validatedFrom,
		java.util.Date validatedTo, int status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addDictCollection(companyId, name, version, title,
			validatedFrom, validatedTo, status, serviceContext);
	}

	public static org.oep.core.datamgt.dictionary.model.DictCollection getDictCollectionByName(
		long companyId, java.lang.String collectionName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getDictCollectionByName(companyId, collectionName,
			serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static DictCollectionService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DictCollectionService.class.getName());

			if (invokableService instanceof DictCollectionService) {
				_service = (DictCollectionService)invokableService;
			}
			else {
				_service = new DictCollectionServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(DictCollectionServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DictCollectionService service) {
	}

	private static DictCollectionService _service;
}