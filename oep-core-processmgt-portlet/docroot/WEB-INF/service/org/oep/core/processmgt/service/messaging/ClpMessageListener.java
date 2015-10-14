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

package org.oep.core.processmgt.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import org.oep.core.processmgt.service.ClpSerializer;
import org.oep.core.processmgt.service.DossierProcessLocalServiceUtil;
import org.oep.core.processmgt.service.DossierProcessServiceUtil;
import org.oep.core.processmgt.service.DossierStep2RoleLocalServiceUtil;
import org.oep.core.processmgt.service.DossierStepLocalServiceUtil;
import org.oep.core.processmgt.service.DossierStepServiceUtil;
import org.oep.core.processmgt.service.ProcessOrder2UserLocalServiceUtil;
import org.oep.core.processmgt.service.ProcessOrderLocalServiceUtil;
import org.oep.core.processmgt.service.ProcessOrderServiceUtil;
import org.oep.core.processmgt.service.StatisticByUserServiceUtil;
import org.oep.core.processmgt.service.StepTransitionLocalServiceUtil;
import org.oep.core.processmgt.service.StepTransitionServiceUtil;
import org.oep.core.processmgt.service.TransitionHistoryLocalServiceUtil;
import org.oep.core.processmgt.service.TransitionHistoryServiceUtil;
import org.oep.core.processmgt.service.UserAssignmentLocalServiceUtil;
import org.oep.core.processmgt.service.UserAssignmentServiceUtil;

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
			DossierProcessLocalServiceUtil.clearService();

			DossierProcessServiceUtil.clearService();
			DossierStepLocalServiceUtil.clearService();

			DossierStepServiceUtil.clearService();
			DossierStep2RoleLocalServiceUtil.clearService();

			ProcessOrderLocalServiceUtil.clearService();

			ProcessOrderServiceUtil.clearService();
			ProcessOrder2UserLocalServiceUtil.clearService();

			StatisticByUserServiceUtil.clearService();
			StepTransitionLocalServiceUtil.clearService();

			StepTransitionServiceUtil.clearService();
			TransitionHistoryLocalServiceUtil.clearService();

			TransitionHistoryServiceUtil.clearService();
			UserAssignmentLocalServiceUtil.clearService();

			UserAssignmentServiceUtil.clearService();
		}
	}
}