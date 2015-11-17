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

package org.oep.processmgt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DossierProc2ProcessLocalService}.
 *
 * @author trungdk
 * @see DossierProc2ProcessLocalService
 * @generated
 */
public class DossierProc2ProcessLocalServiceWrapper
	implements DossierProc2ProcessLocalService,
		ServiceWrapper<DossierProc2ProcessLocalService> {
	public DossierProc2ProcessLocalServiceWrapper(
		DossierProc2ProcessLocalService dossierProc2ProcessLocalService) {
		_dossierProc2ProcessLocalService = dossierProc2ProcessLocalService;
	}

	/**
	* Adds the dossier proc2 process to the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProc2Process the dossier proc2 process
	* @return the dossier proc2 process that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.processmgt.model.DossierProc2Process addDossierProc2Process(
		org.oep.processmgt.model.DossierProc2Process dossierProc2Process)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProc2ProcessLocalService.addDossierProc2Process(dossierProc2Process);
	}

	/**
	* Creates a new dossier proc2 process with the primary key. Does not add the dossier proc2 process to the database.
	*
	* @param dossierProc2ProcessId the primary key for the new dossier proc2 process
	* @return the new dossier proc2 process
	*/
	@Override
	public org.oep.processmgt.model.DossierProc2Process createDossierProc2Process(
		long dossierProc2ProcessId) {
		return _dossierProc2ProcessLocalService.createDossierProc2Process(dossierProc2ProcessId);
	}

	/**
	* Deletes the dossier proc2 process with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProc2ProcessId the primary key of the dossier proc2 process
	* @return the dossier proc2 process that was removed
	* @throws PortalException if a dossier proc2 process with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.processmgt.model.DossierProc2Process deleteDossierProc2Process(
		long dossierProc2ProcessId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProc2ProcessLocalService.deleteDossierProc2Process(dossierProc2ProcessId);
	}

	/**
	* Deletes the dossier proc2 process from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProc2Process the dossier proc2 process
	* @return the dossier proc2 process that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.processmgt.model.DossierProc2Process deleteDossierProc2Process(
		org.oep.processmgt.model.DossierProc2Process dossierProc2Process)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProc2ProcessLocalService.deleteDossierProc2Process(dossierProc2Process);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dossierProc2ProcessLocalService.dynamicQuery();
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
		return _dossierProc2ProcessLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.DossierProc2ProcessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dossierProc2ProcessLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.DossierProc2ProcessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dossierProc2ProcessLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return _dossierProc2ProcessLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dossierProc2ProcessLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.processmgt.model.DossierProc2Process fetchDossierProc2Process(
		long dossierProc2ProcessId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProc2ProcessLocalService.fetchDossierProc2Process(dossierProc2ProcessId);
	}

	/**
	* Returns the dossier proc2 process with the primary key.
	*
	* @param dossierProc2ProcessId the primary key of the dossier proc2 process
	* @return the dossier proc2 process
	* @throws PortalException if a dossier proc2 process with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.processmgt.model.DossierProc2Process getDossierProc2Process(
		long dossierProc2ProcessId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProc2ProcessLocalService.getDossierProc2Process(dossierProc2ProcessId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProc2ProcessLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dossier proc2 processes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.DossierProc2ProcessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier proc2 processes
	* @param end the upper bound of the range of dossier proc2 processes (not inclusive)
	* @return the range of dossier proc2 processes
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.processmgt.model.DossierProc2Process> getDossierProc2Processes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProc2ProcessLocalService.getDossierProc2Processes(start,
			end);
	}

	/**
	* Returns the number of dossier proc2 processes.
	*
	* @return the number of dossier proc2 processes
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDossierProc2ProcessesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProc2ProcessLocalService.getDossierProc2ProcessesCount();
	}

	/**
	* Updates the dossier proc2 process in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossierProc2Process the dossier proc2 process
	* @return the dossier proc2 process that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.processmgt.model.DossierProc2Process updateDossierProc2Process(
		org.oep.processmgt.model.DossierProc2Process dossierProc2Process)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProc2ProcessLocalService.updateDossierProc2Process(dossierProc2Process);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dossierProc2ProcessLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dossierProc2ProcessLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dossierProc2ProcessLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* ThÃƒÂªm mÃ¡Â»â€ºi mÃ¡Â»â„¢t cÃ¡ÂºÂ¥u hÃƒÂ¬nh thÃ¡Â»Â§ tÃ¡Â»Â¥c thÃ¡Â»Â±c hiÃ¡Â»â€¡n bÃƒÂªn Ã¡Â»Â©ng dÃ¡Â»Â¥ng mÃ¡Â»â„¢t cÃ¡Â»Â­a
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param dossierProcId mÃƒÂ£ thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh
	* @param govAgencyId tham chiÃ¡ÂºÂ¿u cÃ†Â¡ quan xÃ¡Â»Â­ lÃƒÂ½ hÃ¡Â»â€œ sÃ†Â¡
	* @param govAgencyName tham chiÃ¡ÂºÂ¿u cÃ†Â¡ quan xÃ¡Â»Â­ lÃƒÂ½ hÃ¡Â»â€œ sÃ†Â¡
	* @param dossierProcessId mÃƒÂ£ quy trÃƒÂ¬nh xÃ¡Â»Â­ lÃƒÂ½ thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh
	* @param aaaa 4 sÃ¡Â»â€˜ cÃ¡Â»â€˜ Ã„â€˜Ã¡Â»â€¹nh cÃ¡ÂºÂ¥p phÃƒÂ¡t cho thÃ¡Â»Â§ tÃ¡Â»Â¥c
	* @param bbb 3 sÃ¡Â»â€˜ lÃ¡ÂºÂ·p quay vÃƒÂ²ng Ã„â€˜Ã¡Â»Æ’ trÃƒÂ¡nh trÃƒÂ¹ng lÃ¡ÂºÂ·p
	* @param daysDuration sÃ¡Â»â€˜ ngÃƒÂ y xÃ¡Â»Â­ lÃƒÂ½ thÃ¡Â»Â§ tÃ¡Â»Â¥c
	* @param paymentFee sÃ¡Â»â€˜ tiÃ¡Â»ï¿½n phÃƒÂ­ thÃ¡Â»Â§ tÃ¡Â»Â¥c phÃ¡ÂºÂ£i thanh toÃƒÂ¡n ban Ã„â€˜Ã¡ÂºÂ§u
	* @param paymentOnegate cho phÃƒÂ©p thanh toÃƒÂ¡n qua mÃ¡Â»â„¢t cÃ¡Â»Â­a
	* @param paymentEservice cho phÃƒÂ©p thanh toÃƒÂ¡n bÃ¡ÂºÂ±ng hÃƒÂ¬nh thÃ¡Â»Â©c online
	* @param organizationId cÃ¡ÂºÂ¥u hÃƒÂ¬nh org nhÃ¡ÂºÂ­n tÃ¡Â»Â« cÃ¡Â»â€¢ng dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @param ebPartnershipId service Ã„â€˜Ã†Â°Ã¡Â»Â£c sÃ¡Â»Â­ dÃ¡Â»Â¥ng Ã„â€˜Ã¡Â»Æ’ trao Ã„â€˜Ã¡Â»â€¢i thÃƒÂ´ng tin hÃ¡Â»â€œ sÃ†Â¡ vÃ¡Â»â€ºi cÃ¡Â»â€¢ng
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: tag hÃ¡Â»â€œ sÃ†Â¡ mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c tÃ¡ÂºÂ¡o
	*/
	@Override
	public org.oep.processmgt.model.DossierProc2Process addDossierProc2Process(
		long dossierProcId, java.lang.String govAgencyId,
		java.lang.String govAgencyName, long dossierProcessId,
		java.lang.String aaaa, java.lang.String bbb, int daysDuration,
		int paymentFee, int paymentOnegate, int paymentEservice,
		long organizationId, long ebPartnershipId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProc2ProcessLocalService.addDossierProc2Process(dossierProcId,
			govAgencyId, govAgencyName, dossierProcessId, aaaa, bbb,
			daysDuration, paymentFee, paymentOnegate, paymentEservice,
			organizationId, ebPartnershipId, serviceContext);
	}

	/**
	* CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin mÃ¡Â»â„¢t cÃ¡ÂºÂ¥u hÃƒÂ¬nh thÃ¡Â»Â§ tÃ¡Â»Â¥c bÃƒÂªn Ã¡Â»Â©ng dÃ¡Â»Â¥ng mÃ¡Â»â„¢t cÃ¡Â»Â­a
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param id mÃƒÂ£ phÃƒÂ¢n biÃ¡Â»â€¡t cÃ¡Â»Â§a cÃ¡ÂºÂ¥u hÃƒÂ¬nh thÃ¡Â»Â§ tÃ¡Â»Â¥c
	* @param dossierProcId mÃƒÂ£ thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh
	* @param govAgencyId tham chiÃ¡ÂºÂ¿u cÃ†Â¡ quan xÃ¡Â»Â­ lÃƒÂ½ hÃ¡Â»â€œ sÃ†Â¡
	* @param govAgencyName tham chiÃ¡ÂºÂ¿u cÃ†Â¡ quan xÃ¡Â»Â­ lÃƒÂ½ hÃ¡Â»â€œ sÃ†Â¡
	* @param dossierProcessId mÃƒÂ£ quy trÃƒÂ¬nh xÃ¡Â»Â­ lÃƒÂ½ thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh
	* @param aaaa 4 sÃ¡Â»â€˜ cÃ¡Â»â€˜ Ã„â€˜Ã¡Â»â€¹nh cÃ¡ÂºÂ¥p phÃƒÂ¡t cho thÃ¡Â»Â§ tÃ¡Â»Â¥c
	* @param bbb 3 sÃ¡Â»â€˜ lÃ¡ÂºÂ·p quay vÃƒÂ²ng Ã„â€˜Ã¡Â»Æ’ trÃƒÂ¡nh trÃƒÂ¹ng lÃ¡ÂºÂ·p
	* @param daysDuration sÃ¡Â»â€˜ ngÃƒÂ y xÃ¡Â»Â­ lÃƒÂ½ thÃ¡Â»Â§ tÃ¡Â»Â¥c
	* @param paymentFee sÃ¡Â»â€˜ tiÃ¡Â»ï¿½n phÃƒÂ­ thÃ¡Â»Â§ tÃ¡Â»Â¥c phÃ¡ÂºÂ£i thanh toÃƒÂ¡n ban Ã„â€˜Ã¡ÂºÂ§u
	* @param paymentOnegate cho phÃƒÂ©p thanh toÃƒÂ¡n qua mÃ¡Â»â„¢t cÃ¡Â»Â­a
	* @param paymentEservice cho phÃƒÂ©p thanh toÃƒÂ¡n bÃ¡ÂºÂ±ng hÃƒÂ¬nh thÃ¡Â»Â©c online
	* @param organizationId cÃ¡ÂºÂ¥u hÃƒÂ¬nh org nhÃ¡ÂºÂ­n tÃ¡Â»Â« cÃ¡Â»â€¢ng dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @param ebPartnershipId service Ã„â€˜Ã†Â°Ã¡Â»Â£c sÃ¡Â»Â­ dÃ¡Â»Â¥ng Ã„â€˜Ã¡Â»Æ’ trao Ã„â€˜Ã¡Â»â€¢i thÃƒÂ´ng tin hÃ¡Â»â€œ sÃ†Â¡ vÃ¡Â»â€ºi cÃ¡Â»â€¢ng
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng cÃ¡ÂºÂ¥u hÃƒÂ¬nh thÃ¡Â»Â§ tÃ¡Â»Â¥c mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin
	*/
	@Override
	public org.oep.processmgt.model.DossierProc2Process updateDossierProc2Process(
		long id, long dossierProcId, java.lang.String govAgencyId,
		java.lang.String govAgencyName, long dossierProcessId,
		java.lang.String aaaa, java.lang.String bbb, int daysDuration,
		int paymentFee, int paymentOnegate, int paymentEservice,
		long organizationId, long ebPartnershipId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProc2ProcessLocalService.updateDossierProc2Process(id,
			dossierProcId, govAgencyId, govAgencyName, dossierProcessId, aaaa,
			bbb, daysDuration, paymentFee, paymentOnegate, paymentEservice,
			organizationId, ebPartnershipId, serviceContext);
	}

	/**
	* CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin mÃ¡Â»â„¢t cÃ¡ÂºÂ¥u hÃƒÂ¬nh thÃ¡Â»Â§ tÃ¡Â»Â¥c
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin cÃ¡ÂºÂ¥u hÃƒÂ¬nh thÃ¡Â»Â§ tÃ¡Â»Â¥c
	*
	* @param dossierProc2Process cÃ¡ÂºÂ¥u hÃƒÂ¬nh thÃ¡Â»Â§ tÃ¡Â»Â¥c cÃ¡ÂºÂ§n cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng cÃ¡ÂºÂ¥u hÃƒÂ¬nh thÃ¡Â»Â§ tÃ¡Â»Â¥c Ã„â€˜Ã†Â°Ã¡Â»Â£c cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin
	*/
	@Override
	public org.oep.processmgt.model.DossierProc2Process updateDossierProc2Process(
		org.oep.processmgt.model.DossierProc2Process dossierProc2Process,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierProc2ProcessLocalService.updateDossierProc2Process(dossierProc2Process,
			serviceContext);
	}

	/**
	* XÃƒÂ³a bÃ¡Â»ï¿½ thÃƒÂ´ng tin mÃ¡Â»â„¢t cÃ¡ÂºÂ¥u hÃƒÂ¬nh thÃ¡Â»Â§ tÃ¡Â»Â¥c
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    XÃƒÂ³a bÃ¡Â»ï¿½ thÃƒÂ´ng tin cÃ¡ÂºÂ¥u hÃƒÂ¬nh thÃ¡Â»Â§ tÃ¡Â»Â¥c
	*
	* @param dossierProc2Process cÃ¡ÂºÂ¥u hÃƒÂ¬nh thÃ¡Â»Â§ tÃ¡Â»Â¥c cÃ¡ÂºÂ§n xÃƒÂ³a
	* @return
	*/
	@Override
	public void removeDossierProc2Process(
		org.oep.processmgt.model.DossierProc2Process dossierProc2Process)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dossierProc2ProcessLocalService.removeDossierProc2Process(dossierProc2Process);
	}

	/**
	* XÃƒÂ³a bÃ¡Â»ï¿½ thÃƒÂ´ng tin mÃ¡Â»â„¢t cÃ¡ÂºÂ¥u hÃƒÂ¬nh thÃ¡Â»Â§ tÃ¡Â»Â¥c
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    XÃƒÂ³a bÃ¡Â»ï¿½ thÃƒÂ´ng tin cÃ¡ÂºÂ¥u hÃƒÂ¬nh thÃ¡Â»Â§ tÃ¡Â»Â¥c
	*
	* @param id mÃƒÂ£ phÃƒÂ¢n biÃ¡Â»â€¡t cÃ¡ÂºÂ¥u hÃƒÂ¬nh thÃ¡Â»Â§ tÃ¡Â»Â¥c
	* @return
	*/
	@Override
	public void removeDossierProc2Process(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dossierProc2ProcessLocalService.removeDossierProc2Process(id);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DossierProc2ProcessLocalService getWrappedDossierProc2ProcessLocalService() {
		return _dossierProc2ProcessLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDossierProc2ProcessLocalService(
		DossierProc2ProcessLocalService dossierProc2ProcessLocalService) {
		_dossierProc2ProcessLocalService = dossierProc2ProcessLocalService;
	}

	@Override
	public DossierProc2ProcessLocalService getWrappedService() {
		return _dossierProc2ProcessLocalService;
	}

	@Override
	public void setWrappedService(
		DossierProc2ProcessLocalService dossierProc2ProcessLocalService) {
		_dossierProc2ProcessLocalService = dossierProc2ProcessLocalService;
	}

	private DossierProc2ProcessLocalService _dossierProc2ProcessLocalService;
}