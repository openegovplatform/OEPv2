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

package org.oep.processmgt.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import org.oep.processmgt.service.ClpSerializer;
import org.oep.processmgt.service.CreateFileLocalServiceUtil;
import org.oep.processmgt.service.CreateFileServiceUtil;
import org.oep.processmgt.service.DocFile2ProcessOrderLocalServiceUtil;
import org.oep.processmgt.service.DocFile2ProcessOrderServiceUtil;
import org.oep.processmgt.service.DossierProc2ProcessLocalServiceUtil;
import org.oep.processmgt.service.DossierProc2ProcessServiceUtil;
import org.oep.processmgt.service.DossierProc2RoleLocalServiceUtil;
import org.oep.processmgt.service.DossierProc2RoleServiceUtil;
import org.oep.processmgt.service.DossierProcessLocalServiceUtil;
import org.oep.processmgt.service.DossierProcessServiceUtil;
import org.oep.processmgt.service.DossierStep2RoleLocalServiceUtil;
import org.oep.processmgt.service.DossierStep2RoleServiceUtil;
import org.oep.processmgt.service.DossierStepLocalServiceUtil;
import org.oep.processmgt.service.DossierStepServiceUtil;
import org.oep.processmgt.service.ProcessOrder2UserLocalServiceUtil;
import org.oep.processmgt.service.ProcessOrder2UserServiceUtil;
import org.oep.processmgt.service.ProcessOrderLocalServiceUtil;
import org.oep.processmgt.service.ProcessOrderServiceUtil;
import org.oep.processmgt.service.StatisticByUserLocalServiceUtil;
import org.oep.processmgt.service.StatisticByUserServiceUtil;
import org.oep.processmgt.service.StepTransitionLocalServiceUtil;
import org.oep.processmgt.service.StepTransitionServiceUtil;
import org.oep.processmgt.service.TransitionHistoryLocalServiceUtil;
import org.oep.processmgt.service.TransitionHistoryServiceUtil;
import org.oep.processmgt.service.UserAssignmentLocalServiceUtil;
import org.oep.processmgt.service.UserAssignmentServiceUtil;

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
			CreateFileLocalServiceUtil.clearService();

			CreateFileServiceUtil.clearService();
			DocFile2ProcessOrderLocalServiceUtil.clearService();

			DocFile2ProcessOrderServiceUtil.clearService();
			DossierProc2ProcessLocalServiceUtil.clearService();

			DossierProc2ProcessServiceUtil.clearService();
			DossierProc2RoleLocalServiceUtil.clearService();

			DossierProc2RoleServiceUtil.clearService();
			DossierProcessLocalServiceUtil.clearService();

			DossierProcessServiceUtil.clearService();
			DossierStepLocalServiceUtil.clearService();

			DossierStepServiceUtil.clearService();
			DossierStep2RoleLocalServiceUtil.clearService();

			DossierStep2RoleServiceUtil.clearService();
			ProcessOrderLocalServiceUtil.clearService();

			ProcessOrderServiceUtil.clearService();
			ProcessOrder2UserLocalServiceUtil.clearService();

			ProcessOrder2UserServiceUtil.clearService();
			StatisticByUserLocalServiceUtil.clearService();

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