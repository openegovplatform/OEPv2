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

package org.oep.core.ssomgt.app.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SSOAppLocalService}.
 *
 * @author trungdk
 * @see SSOAppLocalService
 * @generated
 */
public class SSOAppLocalServiceWrapper implements SSOAppLocalService,
	ServiceWrapper<SSOAppLocalService> {
	public SSOAppLocalServiceWrapper(SSOAppLocalService ssoAppLocalService) {
		_ssoAppLocalService = ssoAppLocalService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _ssoAppLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_ssoAppLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _ssoAppLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public org.oep.core.ssomgt.model.AppMessage newMessage(
		java.lang.String appCode, java.lang.String appPin,
		java.util.Date createDate, java.lang.String toUser,
		java.lang.String messageType, java.lang.String messageCode,
		java.lang.String messageText, java.lang.String messageValue,
		java.lang.String messageUrl,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _ssoAppLocalService.newMessage(appCode, appPin, createDate,
			toUser, messageType, messageCode, messageText, messageValue,
			messageUrl, serviceContext);
	}

	@Override
	public org.oep.core.ssomgt.model.AppMessage newMessage(long userId,
		java.lang.String appCode, java.lang.String appPin,
		java.util.Date createDate, java.lang.String toUser,
		java.lang.String messageType, java.lang.String messageCode,
		java.lang.String messageText, java.lang.String messageValue,
		java.lang.String messageUrl)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _ssoAppLocalService.newMessage(userId, appCode, appPin,
			createDate, toUser, messageType, messageCode, messageText,
			messageValue, messageUrl);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public SSOAppLocalService getWrappedSSOAppLocalService() {
		return _ssoAppLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedSSOAppLocalService(
		SSOAppLocalService ssoAppLocalService) {
		_ssoAppLocalService = ssoAppLocalService;
	}

	@Override
	public SSOAppLocalService getWrappedService() {
		return _ssoAppLocalService;
	}

	@Override
	public void setWrappedService(SSOAppLocalService ssoAppLocalService) {
		_ssoAppLocalService = ssoAppLocalService;
	}

	private SSOAppLocalService _ssoAppLocalService;
}