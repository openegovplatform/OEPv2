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

package org.oep.core.datamgt.parameter.service.impl;

import org.oep.core.datamgt.parameter.model.DefaultParameter;
import org.oep.core.datamgt.parameter.service.base.DefaultParameterServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the default parameter remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.datamgt.parameter.service.DefaultParameterService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author TrungDK
 * @see org.oep.core.datamgt.parameter.service.base.DefaultParameterServiceBaseImpl
 * @see org.oep.core.datamgt.parameter.service.DefaultParameterServiceUtil
 */
public class DefaultParameterServiceImpl extends DefaultParameterServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.datamgt.parameter.service.DefaultParameterServiceUtil} to access the default parameter remote service.
	 */
	public DefaultParameter addDefaultParameter(long companyId, String applicationName, String title, String parameterName, String parameterValue, int changeable, ServiceContext serviceContext) throws SystemException, PortalException {
		serviceContext.setCompanyId(companyId);
		return defaultParameterLocalService.addDefaultParameter(applicationName, title, parameterName, parameterValue, changeable, serviceContext);
	}
}