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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.security.ac.AccessControlled;
import com.liferay.portal.service.BaseService;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service interface for SSOApp. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author trungdk
 * @see SSOAppServiceUtil
 * @see org.oep.ssomgt.app.service.base.SSOAppServiceBaseImpl
 * @see org.oep.ssomgt.app.service.impl.SSOAppServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface SSOAppService extends BaseService, InvokableService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SSOAppServiceUtil} to access the s s o app remote service. Add custom service methods to {@link org.oep.ssomgt.app.service.impl.SSOAppServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	@com.liferay.portal.kernel.jsonwebservice.JSONWebService(value = "newMessage")
	@com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
	public java.lang.String newMessage(java.lang.String appCode,
		java.lang.String appPin, java.util.Date createDate,
		java.lang.String toUser, java.lang.String messageType,
		java.lang.String messageCode, java.lang.String messageText,
		java.lang.String messageValue, java.lang.String messageUrl,
		java.lang.String signature)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@com.liferay.portal.kernel.jsonwebservice.JSONWebService(value = "ping")
	@com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
	public java.lang.String ping(java.lang.String app, java.lang.String pin)
		throws com.liferay.portal.kernel.exception.SystemException;

	@com.liferay.portal.kernel.jsonwebservice.JSONWebService(value = "syncDateAccounts")
	@com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
	public java.lang.String syncDateAccounts(java.lang.String appCode,
		java.lang.String pin, java.util.Date checkpoint);

	@com.liferay.portal.kernel.jsonwebservice.JSONWebService(value = "syncAccounts")
	@com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
	public java.lang.String syncAccounts(java.lang.String appCode,
		java.lang.String pin, long timestamp);

	@com.liferay.portal.kernel.jsonwebservice.JSONWebService(value = "syncDateAccounts")
	@com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
	public java.lang.String unsecuredSyncDateAccounts(
		java.lang.String appCode, java.lang.String pin,
		java.util.Date checkpoint);

	@com.liferay.portal.kernel.jsonwebservice.JSONWebService(value = "syncAccounts")
	@com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
	public java.lang.String unsecuredSyncAccounts(java.lang.String appCode,
		java.lang.String pin, long timestamp);
}