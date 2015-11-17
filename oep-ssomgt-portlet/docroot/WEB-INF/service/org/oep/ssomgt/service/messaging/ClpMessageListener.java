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

package org.oep.ssomgt.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import org.oep.ssomgt.service.AppMessageLocalServiceUtil;
import org.oep.ssomgt.service.AppMessageServiceUtil;
import org.oep.ssomgt.service.AppRole2EmployeeLocalServiceUtil;
import org.oep.ssomgt.service.AppRole2EmployeeServiceUtil;
import org.oep.ssomgt.service.AppRole2JobPosLocalServiceUtil;
import org.oep.ssomgt.service.AppRole2JobPosServiceUtil;
import org.oep.ssomgt.service.AppRoleLocalServiceUtil;
import org.oep.ssomgt.service.AppRoleServiceUtil;
import org.oep.ssomgt.service.ApplicationLocalServiceUtil;
import org.oep.ssomgt.service.ApplicationServiceUtil;
import org.oep.ssomgt.service.ClpSerializer;
import org.oep.ssomgt.service.UserSyncLocalServiceUtil;
import org.oep.ssomgt.service.UserSyncServiceUtil;

/**
 * @author trungdk
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			ApplicationLocalServiceUtil.clearService();

			ApplicationServiceUtil.clearService();
			AppMessageLocalServiceUtil.clearService();

			AppMessageServiceUtil.clearService();
			AppRoleLocalServiceUtil.clearService();

			AppRoleServiceUtil.clearService();
			AppRole2EmployeeLocalServiceUtil.clearService();

			AppRole2EmployeeServiceUtil.clearService();
			AppRole2JobPosLocalServiceUtil.clearService();

			AppRole2JobPosServiceUtil.clearService();
			UserSyncLocalServiceUtil.clearService();

			UserSyncServiceUtil.clearService();
		}
	}
}