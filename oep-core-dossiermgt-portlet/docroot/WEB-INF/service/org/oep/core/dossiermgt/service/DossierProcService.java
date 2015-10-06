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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.security.ac.AccessControlled;
import com.liferay.portal.service.BaseService;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service interface for DossierProc. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author trungdk
 * @see DossierProcServiceUtil
 * @see org.oep.core.dossiermgt.service.base.DossierProcServiceBaseImpl
 * @see org.oep.core.dossiermgt.service.impl.DossierProcServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface DossierProcService extends BaseService, InvokableService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DossierProcServiceUtil} to access the dossier proc remote service. Add custom service methods to {@link org.oep.core.dossiermgt.service.impl.DossierProcServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

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
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.core.dossiermgt.model.DossierProc addDossierProc(
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
		java.util.Date effectDate, java.util.Date expireDate, int active,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;
}