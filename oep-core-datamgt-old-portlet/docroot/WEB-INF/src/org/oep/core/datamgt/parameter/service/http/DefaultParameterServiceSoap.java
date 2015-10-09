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

package org.oep.core.datamgt.parameter.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import org.oep.core.datamgt.parameter.service.DefaultParameterServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link org.oep.core.datamgt.parameter.service.DefaultParameterServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link org.oep.core.datamgt.parameter.model.DefaultParameterSoap}.
 * If the method in the service utility returns a
 * {@link org.oep.core.datamgt.parameter.model.DefaultParameter}, that is translated to a
 * {@link org.oep.core.datamgt.parameter.model.DefaultParameterSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
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
 * @author TrungDK
 * @see DefaultParameterServiceHttp
 * @see org.oep.core.datamgt.parameter.model.DefaultParameterSoap
 * @see org.oep.core.datamgt.parameter.service.DefaultParameterServiceUtil
 * @generated
 */
public class DefaultParameterServiceSoap {
	public static org.oep.core.datamgt.parameter.model.DefaultParameterSoap addDefaultParameter(
		long companyId, java.lang.String applicationName,
		java.lang.String title, java.lang.String parameterName,
		java.lang.String parameterValue, int changeable,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			org.oep.core.datamgt.parameter.model.DefaultParameter returnValue = DefaultParameterServiceUtil.addDefaultParameter(companyId,
					applicationName, title, parameterName, parameterValue,
					changeable, serviceContext);

			return org.oep.core.datamgt.parameter.model.DefaultParameterSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(DefaultParameterServiceSoap.class);
}