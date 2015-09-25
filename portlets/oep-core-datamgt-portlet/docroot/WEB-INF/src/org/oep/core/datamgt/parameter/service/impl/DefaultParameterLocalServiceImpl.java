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

import java.util.Date;

import org.oep.core.datamgt.parameter.model.DefaultParameter;
import org.oep.core.datamgt.parameter.service.base.DefaultParameterLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the default parameter local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.datamgt.parameter.service.DefaultParameterLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author TrungDK
 * @see org.oep.core.datamgt.parameter.service.base.DefaultParameterLocalServiceBaseImpl
 * @see org.oep.core.datamgt.parameter.service.DefaultParameterLocalServiceUtil
 */
public class DefaultParameterLocalServiceImpl
	extends DefaultParameterLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.datamgt.parameter.service.DefaultParameterLocalServiceUtil} to access the default parameter local service.
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public DefaultParameter addDefaultParameter(String applicationName, String title, String parameterName, String parameterValue, int changeable, ServiceContext serviceContext) throws SystemException, PortalException {
		validate(applicationName, title, parameterName, parameterValue);
		long id = counterLocalService.increment();
		DefaultParameter defaultParameter = defaultParameterPersistence.create(id);
		Date now = new Date();
		
		defaultParameter.setApplicationName(applicationName);
		defaultParameter.setTitle(title);
		defaultParameter.setParameterName(parameterName);
		defaultParameter.setParameterValue(parameterValue);
		defaultParameter.setCreateDate(serviceContext.getCreateDate(now));
		defaultParameter.setCompanyId(serviceContext.getCompanyId());
		defaultParameter.setChangeable(changeable);
		
		defaultParameterPersistence.update(defaultParameter);

		if (_log.isInfoEnabled()) {
			_log.info("Create new default parameter " + id);
		}
		
		return getDefaultParameter(id);
	}

	@Indexable(type = IndexableType.REINDEX)
	public DefaultParameter saveDefaultParameter(
			long id, String applicationName, String title,
			String parameterName, String parameterValue, int changeable, ServiceContext serviceContext)
		throws PortalException, SystemException {

		validate(applicationName, title, parameterName, parameterValue);

		DefaultParameter defaultParameter = defaultParameterPersistence.findByPrimaryKey(id);

		defaultParameter.setModifiedDate(serviceContext.getModifiedDate(null));
		defaultParameter.setApplicationName(applicationName);
		defaultParameter.setTitle(title);
		defaultParameter.setParameterName(parameterName);
		defaultParameter.setParameterValue(parameterValue);
		defaultParameter.setChangeable(changeable);
		
		defaultParameterPersistence.update(defaultParameter);

		return getDefaultParameter(defaultParameter.getDefaultParameterId());
	}
		
	public DefaultParameter getDefaultParameter(long id) throws PortalException, SystemException {
		return defaultParameterPersistence.findByPrimaryKey(id);
	}
	
	protected void validate(String applicationName, String title, String parameterName, String parameterValue) throws PortalException {
		if (Validator.isNull(applicationName)) {
		}
		if (Validator.isNull(parameterName)) {
			
		}
	}
	private static Log _log = LogFactoryUtil.getLog(DefaultParameterLocalServiceImpl.class);
	
}