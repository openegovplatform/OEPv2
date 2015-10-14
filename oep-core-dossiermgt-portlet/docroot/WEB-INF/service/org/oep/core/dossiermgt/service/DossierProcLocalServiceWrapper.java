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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DossierProcLocalService}.
 *
 * @author trungdk
 * @see DossierProcLocalService
 * @generated
 */
public class DossierProcLocalServiceWrapper implements DossierProcLocalService,
	ServiceWrapper<DossierProcLocalService> {
	public DossierProcLocalServiceWrapper(
		DossierProcLocalService dossierProcLocalService) {
		_dossierProcLocalService = dossierProcLocalService;
	}

	/**
	* Adds the dossier proc to the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProc the dossier proc
	* @return the dossier proc that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierProc addDossierProc(
		org.oep.core.dossiermgt.model.DossierProc dossierProc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.addDossierProc(dossierProc);
	}

	/**
	* Creates a new dossier proc with the primary key. Does not add the dossier proc to the database.
	*
	* @param dossierProcId the primary key for the new dossier proc
	* @return the new dossier proc
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierProc createDossierProc(
		long dossierProcId) {
		return _dossierProcLocalService.createDossierProc(dossierProcId);
	}

	/**
	* Deletes the dossier proc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProcId the primary key of the dossier proc
	* @return the dossier proc that was removed
	* @throws PortalException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierProc deleteDossierProc(
		long dossierProcId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.deleteDossierProc(dossierProcId);
	}

	/**
	* Deletes the dossier proc from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProc the dossier proc
	* @return the dossier proc that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierProc deleteDossierProc(
		org.oep.core.dossiermgt.model.DossierProc dossierProc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.deleteDossierProc(dossierProc);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dossierProcLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.core.dossiermgt.model.DossierProc fetchDossierProc(
		long dossierProcId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.fetchDossierProc(dossierProcId);
	}

	/**
	* Returns the dossier proc with the primary key.
	*
	* @param dossierProcId the primary key of the dossier proc
	* @return the dossier proc
	* @throws PortalException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierProc getDossierProc(
		long dossierProcId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.getDossierProc(dossierProcId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dossier procs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @return the range of dossier procs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> getDossierProcs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.getDossierProcs(start, end);
	}

	/**
	* Returns the number of dossier procs.
	*
	* @return the number of dossier procs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDossierProcsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.getDossierProcsCount();
	}

	/**
	* Updates the dossier proc in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossierProc the dossier proc
	* @return the dossier proc that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierProc updateDossierProc(
		org.oep.core.dossiermgt.model.DossierProc dossierProc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.updateDossierProc(dossierProc);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dossierProcLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dossierProcLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dossierProcLocalService.invokeMethod(name, parameterTypes,
			arguments);
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
	@Override
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
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.addDossierProc(userId, dossierProcNo,
			name, enName, shortName, processDescription, methodDescription,
			dossierDescription, conditionDescription, durationDescription,
			actorsDescription, resultsDescription, recordsDescription,
			feeDescription, instructionsDescription, administrationNo,
			domainNo, effectDate, expireDate, active, serviceContext);
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
	* @param administrationNo CÃ¡ÂºÂ¥p quÃ¡ÂºÂ£n lÃƒÂ½
	* @param domainNo Ã„ï¿½Ã†Â¡n vÃ¡Â»â€¹ quÃ¡ÂºÂ£n lÃƒÂ½
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c thÃƒÂªm vÃƒÂ o
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierProc addDossierProc(
		long userId, java.lang.String dossierProcNo, java.lang.String name,
		java.lang.String administrationNo, java.lang.String domainNo,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.addDossierProc(userId, dossierProcNo,
			name, administrationNo, domainNo, serviceContext);
	}

	/**
	* CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin mÃ¡Â»â„¢t thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh cÃƒÂ´ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh
	*
	* @param id mÃƒÂ£ phÃƒÂ¢n biÃ¡Â»â€¡t cÃ¡Â»Â§a thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh
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
	* @return: Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierProc updateDossierProc(
		long id, java.lang.String dossierProcNo, java.lang.String name,
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
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.updateDossierProc(id, dossierProcNo,
			name, enName, shortName, processDescription, methodDescription,
			dossierDescription, conditionDescription, durationDescription,
			actorsDescription, resultsDescription, recordsDescription,
			feeDescription, instructionsDescription, administrationNo,
			domainNo, effectDate, expireDate, active, serviceContext);
	}

	/**
	* CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin mÃ¡Â»â„¢t thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh cÃƒÂ´ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh
	*
	* @param dossierProc ThÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh cÃ¡ÂºÂ§n cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierProc updateDossierProc(
		org.oep.core.dossiermgt.model.DossierProc dossierProc,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.updateDossierProc(dossierProc,
			serviceContext);
	}

	/**
	* XÃƒÂ³a bÃ¡Â»ï¿½ thÃƒÂ´ng tin mÃ¡Â»â„¢t thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh cÃƒÂ´ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    XÃƒÂ³a bÃ¡Â»ï¿½ thÃƒÂ´ng tin thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh
	*
	* @param dossierProc ThÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh sÃ¡ÂºÂ½ bÃ¡Â»â€¹ xÃƒÂ³a
	* @return
	*/
	@Override
	public void removeDossierProc(
		org.oep.core.dossiermgt.model.DossierProc dossierProc)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dossierProcLocalService.removeDossierProc(dossierProc);
	}

	/**
	* XÃƒÂ³a bÃ¡Â»ï¿½ thÃƒÂ´ng tin mÃ¡Â»â„¢t thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh cÃƒÂ´ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    XÃƒÂ³a bÃ¡Â»ï¿½ thÃƒÂ´ng tin thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh
	*
	* @param id mÃƒÂ£ phÃƒÂ¢n biÃ¡Â»â€¡t thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh
	* @return
	*/
	@Override
	public void removeDossierProc(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dossierProcLocalService.removeDossierProc(id);
	}

	/**
	* XÃƒÂ³a bÃ¡Â»ï¿½ thÃƒÂ´ng tin tÃ¡ÂºÂ¥t cÃ¡ÂºÂ£ thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh cÃƒÂ´ng thuÃ¡Â»â„¢c mÃ¡Â»â„¢t nhÃƒÂ³m
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    XÃƒÂ³a bÃ¡Â»ï¿½ thÃƒÂ´ng tin thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh cÃƒÂ´ng thuÃ¡Â»â„¢c mÃ¡Â»â„¢t nhÃƒÂ³m
	*
	* @param groupId mÃƒÂ£ nhÃƒÂ³m quÃ¡ÂºÂ£n lÃƒÂ½ thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh
	* @return
	*/
	@Override
	public void deleteDossierProcs(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dossierProcLocalService.deleteDossierProcs(groupId);
	}

	/**
	* LÃ¡ÂºÂ¥y thÃƒÂ´ng tin mÃ¡Â»â„¢t thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh cÃƒÂ´ng dÃ¡Â»Â±a vÃƒÂ o mÃƒÂ£ thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    LÃ¡ÂºÂ¥y thÃƒÂ´ng tin thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh
	*
	* @param dossierProcNo mÃƒÂ£ thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh
	*/
	@Override
	public org.oep.core.dossiermgt.model.DossierProc getByDossierProcNo(
		java.lang.String dossierProcNo,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.getByDossierProcNo(dossierProcNo,
			serviceContext);
	}

	/**
	* TÃƒÂ¬m kiÃ¡ÂºÂ¿m tÃ¡ÂºÂ¥t cÃ¡ÂºÂ£ thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh cÃ¡Â»Â§a mÃ¡Â»â„¢t cÃ¡ÂºÂ¥p quÃ¡ÂºÂ£n lÃƒÂ½
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃƒÂ¬m kiÃ¡ÂºÂ¿m thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh cÃ¡Â»Â§a mÃ¡Â»â„¢t cÃ¡ÂºÂ¥p
	*
	* @param dossierProcNo mÃƒÂ£ thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return danh sÃƒÂ¡ch thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh cÃ¡Â»Â§a mÃ¡Â»â„¢t cÃ¡ÂºÂ¥p quÃ¡ÂºÂ£n lÃƒÂ½
	*/
	@Override
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findAllByAdministrationNo(
		java.lang.String administrationNo,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.findAllByAdministrationNo(administrationNo,
			serviceContext);
	}

	/**
	* TÃƒÂ¬m kiÃ¡ÂºÂ¿m tÃ¡ÂºÂ¥t cÃ¡ÂºÂ£ thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh cÃ¡Â»Â§a thuÃ¡Â»â„¢c mÃ¡Â»â„¢t lÃ„Â©nh vÃ¡Â»Â±c
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃƒÂ¬m kiÃ¡ÂºÂ¿m thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh thuÃ¡Â»â„¢c mÃ¡Â»â„¢t lÃ„Â©nh vÃ¡Â»Â±c
	*
	* @param dossierProcNo mÃƒÂ£ thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return danh sÃƒÂ¡ch thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh cÃ¡Â»Â§a mÃ¡Â»â„¢t lÃ„Â©nh vÃ¡Â»Â±c
	*/
	@Override
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findAllByDomainNo(
		java.lang.String domainNo,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.findAllByDomainNo(domainNo,
			serviceContext);
	}

	/**
	* TÃƒÂ¬m kiÃ¡ÂºÂ¿m tÃ¡ÂºÂ¥t cÃ¡ÂºÂ£ thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh cÃ¡Â»Â§a thuÃ¡Â»â„¢c mÃ¡Â»â„¢t lÃ„Â©nh vÃ¡Â»Â±c vÃƒÂ  cÃ¡ÂºÂ¥p quÃ¡ÂºÂ£n lÃƒÂ½ nÃƒÂ o Ã„â€˜ÃƒÂ³
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃƒÂ¬m kiÃ¡ÂºÂ¿m thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh thuÃ¡Â»â„¢c mÃ¡Â»â„¢t lÃ„Â©nh vÃ¡Â»Â±c vÃƒÂ  cÃ¡ÂºÂ¥p quÃ¡ÂºÂ£n lÃƒÂ½
	*
	* @param dossierProcNo mÃƒÂ£ thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return danh sÃƒÂ¡ch thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh cÃ¡Â»Â§a mÃ¡Â»â„¢t lÃ„Â©nh vÃ¡Â»Â±c vÃƒÂ  cÃ¡ÂºÂ¥p quÃ¡ÂºÂ£n lÃƒÂ½
	*/
	@Override
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findAllByAdministrationAndDomain(
		java.lang.String administrationNo, java.lang.String domainNo,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.findAllByAdministrationAndDomain(administrationNo,
			domainNo, serviceContext);
	}

	/**
	* TÃƒÂ¬m kiÃ¡ÂºÂ¿m tÃ¡ÂºÂ¥t cÃ¡ÂºÂ£ thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh cÃ¡Â»Â§a thuÃ¡Â»â„¢c mÃ¡Â»â„¢t lÃ„Â©nh vÃ¡Â»Â±c vÃƒÂ  cÃ¡ÂºÂ¥p quÃ¡ÂºÂ£n lÃƒÂ½ cÃ¡Â»Â§a mÃ¡Â»â„¢t Ã„â€˜Ã†Â¡n vÃ¡Â»â€¹
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃƒÂ¬m kiÃ¡ÂºÂ¿m thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh thuÃ¡Â»â„¢c mÃ¡Â»â„¢t lÃ„Â©nh vÃ¡Â»Â±c vÃƒÂ  cÃ¡ÂºÂ¥p quÃ¡ÂºÂ£n lÃƒÂ½ cÃ¡Â»Â§a mÃ¡Â»â„¢t Ã„â€˜Ã†Â¡n vÃ¡Â»â€¹
	*
	* @param dossierProcNo mÃƒÂ£ thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return danh sÃƒÂ¡ch thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh cÃ¡Â»Â§a mÃ¡Â»â„¢t lÃ„Â©nh vÃ¡Â»Â±c vÃƒÂ  cÃ¡ÂºÂ¥p quÃ¡ÂºÂ£n lÃƒÂ½ cÃ¡Â»Â§a mÃ¡Â»â„¢t Ã„â€˜Ã†Â¡n vÃ¡Â»â€¹
	*/
	@Override
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByGroupAdministrationAndDomain(
		java.lang.String administrationNo, java.lang.String domainNo,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.findByGroupAdministrationAndDomain(administrationNo,
			domainNo, serviceContext);
	}

	@Override
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> getCompanyDossierProcs(
		long companyId,
		com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.getCompanyDossierProcs(companyId,
			queryDefinition);
	}

	@Override
	public int getCompanyDossierProcsCount(long companyId,
		com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.getCompanyDossierProcsCount(companyId,
			queryDefinition);
	}

	@Override
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByGroupLikeName(
		java.lang.String name, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.findByGroupLikeName(name, startIndex,
			endIndex, serviceContext);
	}

	@Override
	public int countByGroupLikeName(java.lang.String name,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.countByGroupLikeName(name,
			serviceContext);
	}

	@Override
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByLikeName(
		java.lang.String name, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.findByLikeName(name, startIndex,
			endIndex, serviceContext);
	}

	@Override
	public int countByLikeName(java.lang.String name,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.countByLikeName(name, serviceContext);
	}

	@Override
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByCustomCondition(
		java.lang.String name, java.util.Date effectDate,
		java.util.Date expireDate, int active, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.findByCustomCondition(name, effectDate,
			expireDate, active, startIndex, endIndex, serviceContext);
	}

	@Override
	public int countByCustomCondition(java.lang.String name,
		java.util.Date effectDate, java.util.Date expireDate, int active,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.countByCustomCondition(name,
			effectDate, expireDate, active, serviceContext);
	}

	@Override
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByGroupCustomCondition(
		java.lang.String name, java.util.Date effectDate,
		java.util.Date expireDate, int active, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.findByGroupCustomCondition(name,
			effectDate, expireDate, active, startIndex, endIndex, serviceContext);
	}

	@Override
	public int countByGroupCustomCondition(java.lang.String name,
		java.util.Date effectDate, java.util.Date expireDate, int active,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.countByGroupCustomCondition(name,
			effectDate, expireDate, active, serviceContext);
	}

	@Override
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByCompany(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.findByCompany(companyId);
	}

	@Override
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByCompany(
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProcLocalService.findByCompany(serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DossierProcLocalService getWrappedDossierProcLocalService() {
		return _dossierProcLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDossierProcLocalService(
		DossierProcLocalService dossierProcLocalService) {
		_dossierProcLocalService = dossierProcLocalService;
	}

	@Override
	public DossierProcLocalService getWrappedService() {
		return _dossierProcLocalService;
	}

	@Override
	public void setWrappedService(
		DossierProcLocalService dossierProcLocalService) {
		_dossierProcLocalService = dossierProcLocalService;
	}

	private DossierProcLocalService _dossierProcLocalService;
}