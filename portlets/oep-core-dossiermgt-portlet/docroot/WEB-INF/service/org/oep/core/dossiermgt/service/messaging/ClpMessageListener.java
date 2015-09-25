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

package org.oep.core.dossiermgt.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import org.oep.core.dossiermgt.service.ClpSerializer;
import org.oep.core.dossiermgt.service.DocFileLocalServiceUtil;
import org.oep.core.dossiermgt.service.DocFileServiceUtil;
import org.oep.core.dossiermgt.service.DocFileVersionLocalServiceUtil;
import org.oep.core.dossiermgt.service.DocFileVersionServiceUtil;
import org.oep.core.dossiermgt.service.DocTemplateLocalServiceUtil;
import org.oep.core.dossiermgt.service.DocTemplateServiceUtil;
import org.oep.core.dossiermgt.service.DossierDoc2TemplateLocalServiceUtil;
import org.oep.core.dossiermgt.service.DossierDoc2TemplateServiceUtil;
import org.oep.core.dossiermgt.service.DossierDocLocalServiceUtil;
import org.oep.core.dossiermgt.service.DossierDocServiceUtil;
import org.oep.core.dossiermgt.service.DossierFolder2RoleLocalServiceUtil;
import org.oep.core.dossiermgt.service.DossierFolder2RoleServiceUtil;
import org.oep.core.dossiermgt.service.DossierFolderLocalServiceUtil;
import org.oep.core.dossiermgt.service.DossierFolderServiceUtil;
import org.oep.core.dossiermgt.service.DossierLocalServiceUtil;
import org.oep.core.dossiermgt.service.DossierProc2AgentLocalServiceUtil;
import org.oep.core.dossiermgt.service.DossierProc2AgentServiceUtil;
import org.oep.core.dossiermgt.service.DossierProcLocalServiceUtil;
import org.oep.core.dossiermgt.service.DossierProcServiceUtil;
import org.oep.core.dossiermgt.service.DossierServiceUtil;
import org.oep.core.dossiermgt.service.PaymentConfigLocalServiceUtil;
import org.oep.core.dossiermgt.service.PaymentConfigServiceUtil;
import org.oep.core.dossiermgt.service.PaymentFile2DossierLocalServiceUtil;
import org.oep.core.dossiermgt.service.PaymentFile2DossierServiceUtil;
import org.oep.core.dossiermgt.service.PaymentFileLocalServiceUtil;
import org.oep.core.dossiermgt.service.PaymentFileServiceUtil;
import org.oep.core.dossiermgt.service.PaymentRequestLocalServiceUtil;
import org.oep.core.dossiermgt.service.PaymentRequestServiceUtil;

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
			DocFileLocalServiceUtil.clearService();

			DocFileServiceUtil.clearService();
			DocFileVersionLocalServiceUtil.clearService();

			DocFileVersionServiceUtil.clearService();
			DocTemplateLocalServiceUtil.clearService();

			DocTemplateServiceUtil.clearService();
			DossierLocalServiceUtil.clearService();

			DossierServiceUtil.clearService();
			DossierDocLocalServiceUtil.clearService();

			DossierDocServiceUtil.clearService();
			DossierDoc2TemplateLocalServiceUtil.clearService();

			DossierDoc2TemplateServiceUtil.clearService();
			DossierFolderLocalServiceUtil.clearService();

			DossierFolderServiceUtil.clearService();
			DossierFolder2RoleLocalServiceUtil.clearService();

			DossierFolder2RoleServiceUtil.clearService();
			DossierProcLocalServiceUtil.clearService();

			DossierProcServiceUtil.clearService();
			DossierProc2AgentLocalServiceUtil.clearService();

			DossierProc2AgentServiceUtil.clearService();
			PaymentConfigLocalServiceUtil.clearService();

			PaymentConfigServiceUtil.clearService();
			PaymentFileLocalServiceUtil.clearService();

			PaymentFileServiceUtil.clearService();
			PaymentFile2DossierLocalServiceUtil.clearService();

			PaymentFile2DossierServiceUtil.clearService();
			PaymentRequestLocalServiceUtil.clearService();

			PaymentRequestServiceUtil.clearService();
		}
	}
}