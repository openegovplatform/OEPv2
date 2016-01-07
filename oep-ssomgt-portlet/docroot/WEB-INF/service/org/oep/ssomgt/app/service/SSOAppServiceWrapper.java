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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SSOAppService}.
 *
 * @author trungdk
 * @see SSOAppService
 * @generated
 */
public class SSOAppServiceWrapper implements SSOAppService,
	ServiceWrapper<SSOAppService> {
	public SSOAppServiceWrapper(SSOAppService ssoAppService) {
		_ssoAppService = ssoAppService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _ssoAppService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_ssoAppService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _ssoAppService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.lang.String newMessage(java.lang.String appCode,
		java.lang.String appPin, java.util.Date createDate,
		java.lang.String toUser, java.lang.String messageType,
		java.lang.String messageCode, java.lang.String messageText,
		java.lang.String messageValue, java.lang.String messageUrl,
		java.lang.String signature)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _ssoAppService.newMessage(appCode, appPin, createDate, toUser,
			messageType, messageCode, messageText, messageValue, messageUrl,
			signature);
	}

	@Override
	public java.lang.String ping(java.lang.String app, java.lang.String pin)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ssoAppService.ping(app, pin);
	}

	@Override
	public java.lang.String syncDateAccounts(java.lang.String appCode,
		java.lang.String pin, java.util.Date checkpoint) {
		return _ssoAppService.syncDateAccounts(appCode, pin, checkpoint);
	}

	@Override
	public java.lang.String syncAccounts(java.lang.String appCode,
		java.lang.String pin, long timestamp) {
		return _ssoAppService.syncAccounts(appCode, pin, timestamp);
	}

	@Override
	public java.lang.String unsecuredSyncDateAccounts(
		java.lang.String appCode, java.lang.String pin,
		java.util.Date checkpoint) {
		return _ssoAppService.unsecuredSyncDateAccounts(appCode, pin, checkpoint);
	}

	@Override
	public java.lang.String unsecuredSyncAccounts(java.lang.String appCode,
		java.lang.String pin, long timestamp) {
		return _ssoAppService.unsecuredSyncAccounts(appCode, pin, timestamp);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public SSOAppService getWrappedSSOAppService() {
		return _ssoAppService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedSSOAppService(SSOAppService ssoAppService) {
		_ssoAppService = ssoAppService;
	}

	@Override
	public SSOAppService getWrappedService() {
		return _ssoAppService;
	}

	@Override
	public void setWrappedService(SSOAppService ssoAppService) {
		_ssoAppService = ssoAppService;
	}

	private SSOAppService _ssoAppService;
}