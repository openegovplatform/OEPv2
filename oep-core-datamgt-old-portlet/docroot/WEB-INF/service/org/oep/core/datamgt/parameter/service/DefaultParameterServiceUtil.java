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

package org.oep.core.datamgt.parameter.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for DefaultParameter. This utility wraps
 * {@link org.oep.core.datamgt.parameter.service.impl.DefaultParameterServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author TrungDK
 * @see DefaultParameterService
 * @see org.oep.core.datamgt.parameter.service.base.DefaultParameterServiceBaseImpl
 * @see org.oep.core.datamgt.parameter.service.impl.DefaultParameterServiceImpl
 * @generated
 */
public class DefaultParameterServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.core.datamgt.parameter.service.impl.DefaultParameterServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static org.oep.core.datamgt.parameter.model.DefaultParameter addDefaultParameter(
		long companyId, java.lang.String applicationName,
		java.lang.String title, java.lang.String parameterName,
		java.lang.String parameterValue, int changeable,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addDefaultParameter(companyId, applicationName, title,
			parameterName, parameterValue, changeable, serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static DefaultParameterService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DefaultParameterService.class.getName());

			if (invokableService instanceof DefaultParameterService) {
				_service = (DefaultParameterService)invokableService;
			}
			else {
				_service = new DefaultParameterServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(DefaultParameterServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DefaultParameterService service) {
	}

	private static DefaultParameterService _service;
}