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

package org.oep.core.dossiermgt.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for DossierProc. This utility wraps
 * {@link org.oep.core.dossiermgt.service.impl.DossierProcServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author trungdk
 * @see DossierProcService
 * @see org.oep.core.dossiermgt.service.base.DossierProcServiceBaseImpl
 * @see org.oep.core.dossiermgt.service.impl.DossierProcServiceImpl
 * @generated
 */
public class DossierProcServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.core.dossiermgt.service.impl.DossierProcServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* ThÃƒÂªm mÃ¡Â»â€ºi mÃ¡Â»â„¢t thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh cÃƒÂ´ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh
	*
	* @param dossierProcNo mÃƒÂ£ thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh
	* @param name tÃƒÂªn thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh
	* @param enName tÃƒÂªn TiÃ¡ÂºÂ¿ng Anh cÃ¡Â»Â§a thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh
	* @param shortName tÃƒÂªn viÃ¡ÂºÂ¿t tÃ¡ÂºÂ¯t
	* @param processDescription TrÃƒÂ¬nh tÃ¡Â»Â± thÃ¡Â»Â±c hiÃ¡Â»â€¡n thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh
	* @param methodDescription CÃƒÂ¡ch thÃ¡Â»Â©c thÃ¡Â»Â±c hiÃ¡Â»â€¡n
	* @param dossierDescription ThÃƒÂ nh phÃ¡ÂºÂ§n hÃ¡Â»â€œ sÃ†Â¡
	* @param conditionDescription Ã„ï¿½iÃ¡Â»ï¿½u kiÃ¡Â»â€¡n thÃ¡Â»Â±c hiÃ¡Â»â€¡n
	* @param durationDescription ThÃ¡Â»ï¿½i hÃ¡ÂºÂ¡n giÃ¡ÂºÂ£i quyÃ¡ÂºÂ¿t
	* @param actorsDescription Ã„ï¿½Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng thÃ¡Â»Â±c hiÃ¡Â»â€¡n thÃ¡Â»Â§ tÃ¡Â»Â¥c
	* @param resultsDescription MÃƒÂ´ tÃ¡ÂºÂ£ kÃ¡ÂºÂ¿t quÃ¡ÂºÂ£ thÃ¡Â»Â§ tÃ¡Â»Â¥c
	* @param recordsDescription MÃƒÂ´ tÃ¡ÂºÂ£ cÃ„Æ’n cÃ¡Â»Â© phÃƒÂ¡p lÃƒÂ½ HTML
	* @param feeDescription MÃƒÂ´ tÃ¡ÂºÂ£ phÃƒÂ­ vÃƒÂ  lÃ¡Â»â€¡ phÃƒÂ­ thÃ¡Â»Â±c hiÃ¡Â»â€¡n
	* @param instructionsDescription MÃƒÂ´ tÃ¡ÂºÂ£ hÃ†Â°Ã¡Â»â€ºng dÃ¡ÂºÂ«n dÃ¡ÂºÂ¡ng HTML
	* @param administrationNo CÃ¡ÂºÂ¥p quÃ¡ÂºÂ£n lÃƒÂ½
	* @param domainNo Ã„ï¿½Ã†Â¡n vÃ¡Â»â€¹ quÃ¡ÂºÂ£n lÃƒÂ½
	* @param effectDate NgÃƒÂ y bÃ¡ÂºÂ¯t Ã„â€˜Ã¡ÂºÂ§u cÃƒÂ³ hiÃ¡Â»â€¡u lÃ¡Â»Â±c
	* @param expireDate NgÃƒÂ y hÃ¡ÂºÂ¿t hiÃ¡Â»â€¡u lÃ¡Â»Â±c
	* @param active TrÃ¡ÂºÂ¡ng thÃƒÂ¡i hoÃ¡ÂºÂ¡t Ã„â€˜Ã¡Â»â„¢ng cÃ¡Â»Â§a thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c thÃƒÂªm vÃƒÂ o
	*/
	public static org.oep.core.dossiermgt.model.DossierProc addDossierProc(
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
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addDossierProc(userId, dossierProcNo, name, enName,
			shortName, processDescription, methodDescription,
			dossierDescription, conditionDescription, durationDescription,
			actorsDescription, resultsDescription, recordsDescription,
			feeDescription, instructionsDescription, administrationNo,
			domainNo, effectDate, expireDate, forCitizen, forBusiness,
			statusActive, serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static DossierProcService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DossierProcService.class.getName());

			if (invokableService instanceof DossierProcService) {
				_service = (DossierProcService)invokableService;
			}
			else {
				_service = new DossierProcServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(DossierProcServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DossierProcService service) {
	}

	private static DossierProcService _service;
}