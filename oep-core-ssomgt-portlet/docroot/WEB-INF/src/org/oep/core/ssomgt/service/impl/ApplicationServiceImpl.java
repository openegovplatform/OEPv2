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

package org.oep.core.ssomgt.service.impl;

import org.oep.core.ssomgt.model.Application;
import org.oep.core.ssomgt.service.ApplicationLocalServiceUtil;
import org.oep.core.ssomgt.service.base.ApplicationServiceBaseImpl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;

/**
 * The implementation of the application remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.ssomgt.service.ApplicationService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author trungdk
 * @see org.oep.core.ssomgt.service.base.ApplicationServiceBaseImpl
 * @see org.oep.core.ssomgt.service.ApplicationServiceUtil
 */
public class ApplicationServiceImpl extends ApplicationServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.ssomgt.service.ApplicationServiceUtil} to access the application remote service.
	 */
	
	public String ping(String app, String pin) throws SystemException {
		Application application = ApplicationLocalServiceUtil.ping(app, pin);
		JSONObject jsonObj = JSONFactoryUtil.createJSONObject();
		if (application == null) {
			jsonObj.put("success", false);
			jsonObj.put("errorCode", 1);
		}
		else {
			jsonObj.put("success", true);
		}
		
		return jsonObj.toString();
	}
}