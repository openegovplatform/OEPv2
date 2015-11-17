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

package org.oep.ssomgt.app.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for SSOApp. This utility wraps
 * {@link org.oep.ssomgt.app.service.impl.SSOAppLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author trungdk
 * @see SSOAppLocalService
 * @see org.oep.ssomgt.app.service.base.SSOAppLocalServiceBaseImpl
 * @see org.oep.ssomgt.app.service.impl.SSOAppLocalServiceImpl
 * @generated
 */
public class SSOAppLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.ssomgt.app.service.impl.SSOAppLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static org.oep.ssomgt.model.AppMessage newMessage(
		java.lang.String appCode, java.lang.String appPin,
		java.util.Date createDate, java.lang.String toUser,
		java.lang.String messageType, java.lang.String messageCode,
		java.lang.String messageText, java.lang.String messageValue,
		java.lang.String messageUrl,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .newMessage(appCode, appPin, createDate, toUser,
			messageType, messageCode, messageText, messageValue, messageUrl,
			serviceContext);
	}

	public static org.oep.ssomgt.model.AppMessage newMessage(long userId,
		java.lang.String appCode, java.lang.String appPin,
		java.util.Date createDate, java.lang.String toUser,
		java.lang.String messageType, java.lang.String messageCode,
		java.lang.String messageText, java.lang.String messageValue,
		java.lang.String messageUrl)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .newMessage(userId, appCode, appPin, createDate, toUser,
			messageType, messageCode, messageText, messageValue, messageUrl);
	}

	public static void clearService() {
		_service = null;
	}

	public static SSOAppLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					SSOAppLocalService.class.getName());

			if (invokableLocalService instanceof SSOAppLocalService) {
				_service = (SSOAppLocalService)invokableLocalService;
			}
			else {
				_service = new SSOAppLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(SSOAppLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(SSOAppLocalService service) {
	}

	private static SSOAppLocalService _service;
}