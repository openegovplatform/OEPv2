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

package org.oep.core.datamgt.dictionary.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import org.oep.core.datamgt.dictionary.service.DictCollectionServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link org.oep.core.datamgt.dictionary.service.DictCollectionServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link org.oep.core.datamgt.dictionary.model.DictCollectionSoap}.
 * If the method in the service utility returns a
 * {@link org.oep.core.datamgt.dictionary.model.DictCollection}, that is translated to a
 * {@link org.oep.core.datamgt.dictionary.model.DictCollectionSoap}. Methods that SOAP cannot
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
 * @see DictCollectionServiceHttp
 * @see org.oep.core.datamgt.dictionary.model.DictCollectionSoap
 * @see org.oep.core.datamgt.dictionary.service.DictCollectionServiceUtil
 * @generated
 */
public class DictCollectionServiceSoap {
	public static org.oep.core.datamgt.dictionary.model.DictCollectionSoap addDictCollection(
		long companyId, java.lang.String name, java.lang.String version,
		java.lang.String title, java.util.Date validatedFrom,
		java.util.Date validatedTo, int status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			org.oep.core.datamgt.dictionary.model.DictCollection returnValue = DictCollectionServiceUtil.addDictCollection(companyId,
					name, version, title, validatedFrom, validatedTo, status,
					serviceContext);

			return org.oep.core.datamgt.dictionary.model.DictCollectionSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static org.oep.core.datamgt.dictionary.model.DictCollectionSoap getDictCollectionByName(
		long companyId, java.lang.String collectionName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			org.oep.core.datamgt.dictionary.model.DictCollection returnValue = DictCollectionServiceUtil.getDictCollectionByName(companyId,
					collectionName, serviceContext);

			return org.oep.core.datamgt.dictionary.model.DictCollectionSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(DictCollectionServiceSoap.class);
}