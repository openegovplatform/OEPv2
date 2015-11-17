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

package org.oep.dossiermgt.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import org.oep.dossiermgt.service.ClpSerializer;
import org.oep.dossiermgt.service.DocFileLocalServiceUtil;
import org.oep.dossiermgt.service.DocFileServiceUtil;
import org.oep.dossiermgt.service.DocFileVersionLocalServiceUtil;
import org.oep.dossiermgt.service.DocFileVersionServiceUtil;
import org.oep.dossiermgt.service.DocTemplateLocalServiceUtil;
import org.oep.dossiermgt.service.DocTemplateServiceUtil;
import org.oep.dossiermgt.service.DossierDocLocalServiceUtil;
import org.oep.dossiermgt.service.DossierDocServiceUtil;
import org.oep.dossiermgt.service.DossierFolder2RoleLocalServiceUtil;
import org.oep.dossiermgt.service.DossierFolder2RoleServiceUtil;
import org.oep.dossiermgt.service.DossierFolderLocalServiceUtil;
import org.oep.dossiermgt.service.DossierFolderServiceUtil;
import org.oep.dossiermgt.service.DossierLocalServiceUtil;
import org.oep.dossiermgt.service.DossierProcAgentLocalServiceUtil;
import org.oep.dossiermgt.service.DossierProcAgentServiceUtil;
import org.oep.dossiermgt.service.DossierProcBookmarkLocalServiceUtil;
import org.oep.dossiermgt.service.DossierProcBookmarkServiceUtil;
import org.oep.dossiermgt.service.DossierProcLocalServiceUtil;
import org.oep.dossiermgt.service.DossierProcServiceUtil;
import org.oep.dossiermgt.service.DossierTagLocalServiceUtil;
import org.oep.dossiermgt.service.DossierTagServiceUtil;
import org.oep.dossiermgt.service.EbMessageLocalServiceUtil;
import org.oep.dossiermgt.service.EbMessageServiceUtil;
import org.oep.dossiermgt.service.EbPartnerShipLocalServiceUtil;
import org.oep.dossiermgt.service.EbPartnerShipServiceUtil;
import org.oep.dossiermgt.service.PaymentConfigLocalServiceUtil;
import org.oep.dossiermgt.service.PaymentConfigServiceUtil;
import org.oep.dossiermgt.service.PaymentFileLocalServiceUtil;
import org.oep.dossiermgt.service.PaymentFileServiceUtil;
import org.oep.dossiermgt.service.PaymentRequestLocalServiceUtil;
import org.oep.dossiermgt.service.PaymentRequestServiceUtil;
import org.oep.dossiermgt.service.ProfileDataLocalServiceUtil;
import org.oep.dossiermgt.service.ProfileDataServiceUtil;
import org.oep.dossiermgt.service.StatisticByAgencyLocalServiceUtil;
import org.oep.dossiermgt.service.StatisticByAgencyServiceUtil;
import org.oep.dossiermgt.service.StatisticByDayLocalServiceUtil;
import org.oep.dossiermgt.service.StatisticByDayServiceUtil;
import org.oep.dossiermgt.service.StatisticByDomainLocalServiceUtil;
import org.oep.dossiermgt.service.StatisticByDomainServiceUtil;

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

			DossierDocLocalServiceUtil.clearService();

			DossierDocServiceUtil.clearService();
			DossierFolderLocalServiceUtil.clearService();

			DossierFolderServiceUtil.clearService();
			DossierFolder2RoleLocalServiceUtil.clearService();

			DossierFolder2RoleServiceUtil.clearService();
			DossierProcLocalServiceUtil.clearService();

			DossierProcServiceUtil.clearService();
			DossierProcAgentLocalServiceUtil.clearService();

			DossierProcAgentServiceUtil.clearService();
			DossierProcBookmarkLocalServiceUtil.clearService();

			DossierProcBookmarkServiceUtil.clearService();
			DossierTagLocalServiceUtil.clearService();

			DossierTagServiceUtil.clearService();
			EbMessageLocalServiceUtil.clearService();

			EbMessageServiceUtil.clearService();
			EbPartnerShipLocalServiceUtil.clearService();

			EbPartnerShipServiceUtil.clearService();
			PaymentConfigLocalServiceUtil.clearService();

			PaymentConfigServiceUtil.clearService();
			PaymentFileLocalServiceUtil.clearService();

			PaymentFileServiceUtil.clearService();
			PaymentRequestLocalServiceUtil.clearService();

			PaymentRequestServiceUtil.clearService();
			ProfileDataLocalServiceUtil.clearService();

			ProfileDataServiceUtil.clearService();
			StatisticByAgencyLocalServiceUtil.clearService();

			StatisticByAgencyServiceUtil.clearService();
			StatisticByDayLocalServiceUtil.clearService();

			StatisticByDayServiceUtil.clearService();
			StatisticByDomainLocalServiceUtil.clearService();

			StatisticByDomainServiceUtil.clearService();
		}
	}
}