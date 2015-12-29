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

package org.oep.usermgt.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import org.oep.usermgt.service.BusinessLocalServiceUtil;
import org.oep.usermgt.service.BusinessServiceUtil;
import org.oep.usermgt.service.CitizenLocalServiceUtil;
import org.oep.usermgt.service.CitizenServiceUtil;
import org.oep.usermgt.service.ClpSerializer;
import org.oep.usermgt.service.DelegacyLocalServiceUtil;
import org.oep.usermgt.service.DelegacyServiceUtil;
import org.oep.usermgt.service.EmployeeLocalServiceUtil;
import org.oep.usermgt.service.EmployeeServiceUtil;
import org.oep.usermgt.service.JobPos2RoleLocalServiceUtil;
import org.oep.usermgt.service.JobPos2RoleServiceUtil;
import org.oep.usermgt.service.JobPosLocalServiceUtil;
import org.oep.usermgt.service.JobPosServiceUtil;
import org.oep.usermgt.service.SubAccountLocalServiceUtil;
import org.oep.usermgt.service.SubAccountServiceUtil;
import org.oep.usermgt.service.WorkingUnitLocalServiceUtil;
import org.oep.usermgt.service.WorkingUnitServiceUtil;

/**
 * @author NQMINH
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
			BusinessLocalServiceUtil.clearService();

			BusinessServiceUtil.clearService();
			CitizenLocalServiceUtil.clearService();

			CitizenServiceUtil.clearService();
			DelegacyLocalServiceUtil.clearService();

			DelegacyServiceUtil.clearService();
			EmployeeLocalServiceUtil.clearService();

			EmployeeServiceUtil.clearService();
			JobPosLocalServiceUtil.clearService();

			JobPosServiceUtil.clearService();
			JobPos2RoleLocalServiceUtil.clearService();

			JobPos2RoleServiceUtil.clearService();
			SubAccountLocalServiceUtil.clearService();

			SubAccountServiceUtil.clearService();
			WorkingUnitLocalServiceUtil.clearService();

			WorkingUnitServiceUtil.clearService();
		}
	}
}