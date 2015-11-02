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

package org.oep.core.ssomgt.app.service.impl;

import java.util.Date;

import org.oep.core.ssomgt.app.service.base.SSOAppServiceBaseImpl;
import org.oep.core.ssomgt.model.AppMessage;
import org.oep.core.ssomgt.service.AppMessageLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the s s o app remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.ssomgt.app.service.SSOAppService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author trungdk
 * @see org.oep.core.ssomgt.app.service.base.SSOAppServiceBaseImpl
 * @see org.oep.core.ssomgt.app.service.SSOAppServiceUtil
 */
public class SSOAppServiceImpl extends SSOAppServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.ssomgt.app.service.SSOAppServiceUtil} to access the s s o app remote service.
	 */
	/*
	public AppMessage newMessage(String appCode, String appPin, Date createDate, String toUser, String messageType, String messageCode, String messageText, String messageValue, String messageUrl, ServiceContext serviceContext) throws SystemException, PortalException {
		AppMessage appMessage = AppMessageLocalServiceUtil.addAppMessage(appCode, createDate, toUser, messageType, messageCode, messageText, messageValue, messageUrl, serviceContext);
		return appMessage;
	}
	*/
	public AppMessage newMessage(long userId, String appCode, String appPin, Date createDate, String toUser, String messageType, String messageCode, String messageText, String messageValue, String messageUrl) throws SystemException, PortalException {
		AppMessage appMessage = AppMessageLocalServiceUtil.addAppMessage(userId, appCode, createDate, toUser, messageType, messageCode, messageText, messageValue, messageUrl);
		return appMessage;
	}

}