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

package org.oep.ssomgt.app.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import org.oep.ssomgt.app.service.SSOAppServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link org.oep.ssomgt.app.service.SSOAppServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author trungdk
 * @see SSOAppServiceHttp
 * @see org.oep.ssomgt.app.service.SSOAppServiceUtil
 * @generated
 */
public class SSOAppServiceSoap {
	public static java.lang.String newMessage(java.lang.String appCode,
		java.lang.String appPin, java.util.Date createDate,
		java.lang.String toUser, java.lang.String messageType,
		java.lang.String messageCode, java.lang.String messageText,
		java.lang.String messageValue, java.lang.String messageUrl,
		java.lang.String signature) throws RemoteException {
		try {
			java.lang.String returnValue = SSOAppServiceUtil.newMessage(appCode,
					appPin, createDate, toUser, messageType, messageCode,
					messageText, messageValue, messageUrl, signature);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String ping(java.lang.String app,
		java.lang.String pin) throws RemoteException {
		try {
			java.lang.String returnValue = SSOAppServiceUtil.ping(app, pin);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String syncDateAccounts(java.lang.String appCode,
		java.lang.String pin, java.util.Date checkpoint)
		throws RemoteException {
		try {
			java.lang.String returnValue = SSOAppServiceUtil.syncDateAccounts(appCode,
					pin, checkpoint);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String syncAccounts(java.lang.String appCode,
		java.lang.String pin, long timestamp) throws RemoteException {
		try {
			java.lang.String returnValue = SSOAppServiceUtil.syncAccounts(appCode,
					pin, timestamp);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String unsecuredSyncDateAccounts(
		java.lang.String appCode, java.lang.String pin,
		java.util.Date checkpoint) throws RemoteException {
		try {
			java.lang.String returnValue = SSOAppServiceUtil.unsecuredSyncDateAccounts(appCode,
					pin, checkpoint);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String unsecuredSyncAccounts(
		java.lang.String appCode, java.lang.String pin, long timestamp)
		throws RemoteException {
		try {
			java.lang.String returnValue = SSOAppServiceUtil.unsecuredSyncAccounts(appCode,
					pin, timestamp);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(SSOAppServiceSoap.class);
}