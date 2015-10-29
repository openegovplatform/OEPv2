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

package org.oep.core.dossiermgt.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import org.oep.core.dossiermgt.service.DossierProcServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link org.oep.core.dossiermgt.service.DossierProcServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link org.oep.core.dossiermgt.model.DossierProcSoap}.
 * If the method in the service utility returns a
 * {@link org.oep.core.dossiermgt.model.DossierProc}, that is translated to a
 * {@link org.oep.core.dossiermgt.model.DossierProcSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
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
 * @see DossierProcServiceHttp
 * @see org.oep.core.dossiermgt.model.DossierProcSoap
 * @see org.oep.core.dossiermgt.service.DossierProcServiceUtil
 * @generated
 */
public class DossierProcServiceSoap {
	/**
	* ThÃªm má»›i má»™t thá»§ tá»¥c hÃ nh chÃ­nh cÃ´ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Táº¡o má»›i thá»§ tá»¥c hÃ nh chÃ­nh
	*
	* @param dossierProcNo mÃ£ thá»§ tá»¥c hÃ nh chÃ­nh
	* @param name tÃªn thá»§ tá»¥c hÃ nh chÃ­nh
	* @param enName tÃªn Tiáº¿ng Anh cá»§a thá»§ tá»¥c hÃ nh chÃ­nh
	* @param shortName tÃªn viáº¿t táº¯t
	* @param processDescription TrÃ¬nh tá»± thá»±c hiá»‡n thá»§ tá»¥c hÃ nh chÃ­nh
	* @param methodDescription CÃ¡ch thá»©c thá»±c hiá»‡n
	* @param dossierDescription ThÃ nh pháº§n há»“ sÆ¡
	* @param conditionDescription Ä�iá»�u kiá»‡n thá»±c hiá»‡n
	* @param durationDescription Thá»�i háº¡n giáº£i quyáº¿t
	* @param actorsDescription Ä�á»‘i tÆ°á»£ng thá»±c hiá»‡n thá»§ tá»¥c
	* @param resultsDescription MÃ´ táº£ káº¿t quáº£ thá»§ tá»¥c
	* @param recordsDescription MÃ´ táº£ cÄƒn cá»© phÃ¡p lÃ½ HTML
	* @param feeDescription MÃ´ táº£ phÃ­ vÃ  lá»‡ phÃ­ thá»±c hiá»‡n
	* @param instructionsDescription MÃ´ táº£ hÆ°á»›ng dáº«n dáº¡ng HTML
	* @param administrationNo Cáº¥p quáº£n lÃ½
	* @param domainNo Ä�Æ¡n vá»‹ quáº£n lÃ½
	* @param effectDate NgÃ y báº¯t Ä‘áº§u cÃ³ hiá»‡u lá»±c
	* @param expireDate NgÃ y háº¿t hiá»‡u lá»±c
	* @param active Tráº¡ng thÃ¡i hoáº¡t Ä‘á»™ng cá»§a thá»§ tá»¥c hÃ nh chÃ­nh
	* @param serviceContext ngá»¯ cáº£nh dá»‹ch vá»¥
	* @return: Ä‘á»‘i tÆ°á»£ng thá»§ tá»¥c hÃ nh chÃ­nh má»›i Ä‘Æ°á»£c thÃªm vÃ o
	*/
	public static org.oep.core.dossiermgt.model.DossierProcSoap addDossierProc(
		long userId, java.lang.String dossierProcNo, java.lang.String name,
		java.lang.String enName, java.lang.String shortName,
		java.lang.String processDescription,
		java.lang.String methodDescription,
		java.lang.String dossierDescription,
		java.lang.String conditionDescription,
		java.lang.String durationDescription,
		java.lang.String actorsDescription,
		java.lang.String resultsDescription,
		java.lang.String recordsDescription, java.lang.String feeDescription,
		java.lang.String instructionsDescription,
		java.lang.String administrationNo, java.lang.String domainNo,
		java.util.Date effectDate, java.util.Date expireDate, int forCitizen,
		int forBusiness, int statusActive,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			org.oep.core.dossiermgt.model.DossierProc returnValue = DossierProcServiceUtil.addDossierProc(userId,
					dossierProcNo, name, enName, shortName, processDescription,
					methodDescription, dossierDescription,
					conditionDescription, durationDescription,
					actorsDescription, resultsDescription, recordsDescription,
					feeDescription, instructionsDescription, administrationNo,
					domainNo, effectDate, expireDate, forCitizen, forBusiness,
					statusActive, serviceContext);

			return org.oep.core.dossiermgt.model.DossierProcSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(DossierProcServiceSoap.class);
}