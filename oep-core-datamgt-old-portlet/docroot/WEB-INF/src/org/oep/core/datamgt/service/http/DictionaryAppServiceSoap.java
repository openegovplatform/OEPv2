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

package org.oep.core.datamgt.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import org.oep.core.datamgt.service.DictionaryAppServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link org.oep.core.datamgt.service.DictionaryAppServiceUtil} service utility. The
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
 * @see DictionaryAppServiceHttp
 * @see org.oep.core.datamgt.service.DictionaryAppServiceUtil
 * @generated
 */
public class DictionaryAppServiceSoap {
	public static java.lang.String[] getAllDictCollectionNames(long companyId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			java.util.List<java.lang.String> returnValue = DictionaryAppServiceUtil.getAllDictCollectionNames(companyId,
					serviceContext);

			return returnValue.toArray(new java.lang.String[returnValue.size()]);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String[] getAllDictCollectionNames(long companyId)
		throws RemoteException {
		try {
			java.util.List<java.lang.String> returnValue = DictionaryAppServiceUtil.getAllDictCollectionNames(companyId);

			return returnValue.toArray(new java.lang.String[returnValue.size()]);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static org.oep.core.datamgt.dictionary.model.DictCollection getDictCollectionByName(
		long companyId, java.lang.String collectionName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			org.oep.core.datamgt.dictionary.model.DictCollection returnValue = DictionaryAppServiceUtil.getDictCollectionByName(companyId,
					collectionName, serviceContext);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static org.oep.core.datamgt.dictionary.model.DictData getDictDataByCode(
		long companyId, java.lang.String collectionName,
		java.lang.String dataCode,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			org.oep.core.datamgt.dictionary.model.DictData returnValue = DictionaryAppServiceUtil.getDictDataByCode(companyId,
					collectionName, dataCode, serviceContext);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static org.oep.core.datamgt.dictionary.model.DictData saveDictData(
		org.oep.core.datamgt.dictionary.model.DictDataSoap item,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			org.oep.core.datamgt.dictionary.model.DictData returnValue = DictionaryAppServiceUtil.saveDictData(org.oep.core.datamgt.dictionary.model.impl.DictDataModelImpl.toModel(
						item), serviceContext);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(DictionaryAppServiceSoap.class);
}