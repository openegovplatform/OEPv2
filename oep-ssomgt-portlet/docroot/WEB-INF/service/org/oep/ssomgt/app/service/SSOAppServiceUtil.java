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
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for SSOApp. This utility wraps
 * {@link org.oep.ssomgt.app.service.impl.SSOAppServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author trungdk
 * @see SSOAppService
 * @see org.oep.ssomgt.app.service.base.SSOAppServiceBaseImpl
 * @see org.oep.ssomgt.app.service.impl.SSOAppServiceImpl
 * @generated
 */
public class SSOAppServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.ssomgt.app.service.impl.SSOAppServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static java.lang.String newMessage(java.lang.String appCode,
		java.lang.String appPin, java.util.Date createDate,
		java.lang.String toUser, java.lang.String messageType,
		java.lang.String messageCode, java.lang.String messageText,
		java.lang.String messageValue, java.lang.String messageUrl,
		java.lang.String signature)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .newMessage(appCode, appPin, createDate, toUser,
			messageType, messageCode, messageText, messageValue, messageUrl,
			signature);
	}

	public static java.lang.String ping(java.lang.String app,
		java.lang.String pin)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().ping(app, pin);
	}

	public static java.lang.String syncDateAccounts(java.lang.String appCode,
		java.lang.String pin, java.util.Date checkpoint) {
		return getService().syncDateAccounts(appCode, pin, checkpoint);
	}

	public static java.lang.String syncAccounts(java.lang.String appCode,
		java.lang.String pin, long timestamp) {
		return getService().syncAccounts(appCode, pin, timestamp);
	}

	public static java.lang.String unsecuredSyncDateAccounts(
		java.lang.String appCode, java.lang.String pin,
		java.util.Date checkpoint) {
		return getService().unsecuredSyncDateAccounts(appCode, pin, checkpoint);
	}

	public static java.lang.String unsecuredSyncAccounts(
		java.lang.String appCode, java.lang.String pin, long timestamp) {
		return getService().unsecuredSyncAccounts(appCode, pin, timestamp);
	}

	public static void clearService() {
		_service = null;
	}

	public static SSOAppService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					SSOAppService.class.getName());

			if (invokableService instanceof SSOAppService) {
				_service = (SSOAppService)invokableService;
			}
			else {
				_service = new SSOAppServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(SSOAppServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(SSOAppService service) {
	}

	private static SSOAppService _service;
}