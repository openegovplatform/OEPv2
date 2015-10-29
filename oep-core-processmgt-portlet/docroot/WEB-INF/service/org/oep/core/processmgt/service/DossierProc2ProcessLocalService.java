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

package org.oep.core.processmgt.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for DossierProc2Process. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author trungdk
 * @see DossierProc2ProcessLocalServiceUtil
 * @see org.oep.core.processmgt.service.base.DossierProc2ProcessLocalServiceBaseImpl
 * @see org.oep.core.processmgt.service.impl.DossierProc2ProcessLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface DossierProc2ProcessLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DossierProc2ProcessLocalServiceUtil} to access the dossier proc2 process local service. Add custom service methods to {@link org.oep.core.processmgt.service.impl.DossierProc2ProcessLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the dossier proc2 process to the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProc2Process the dossier proc2 process
	* @return the dossier proc2 process that was added
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.core.processmgt.model.DossierProc2Process addDossierProc2Process(
		org.oep.core.processmgt.model.DossierProc2Process dossierProc2Process)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new dossier proc2 process with the primary key. Does not add the dossier proc2 process to the database.
	*
	* @param dossierProc2ProcessId the primary key for the new dossier proc2 process
	* @return the new dossier proc2 process
	*/
	public org.oep.core.processmgt.model.DossierProc2Process createDossierProc2Process(
		long dossierProc2ProcessId);

	/**
	* Deletes the dossier proc2 process with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProc2ProcessId the primary key of the dossier proc2 process
	* @return the dossier proc2 process that was removed
	* @throws PortalException if a dossier proc2 process with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public org.oep.core.processmgt.model.DossierProc2Process deleteDossierProc2Process(
		long dossierProc2ProcessId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the dossier proc2 process from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProc2Process the dossier proc2 process
	* @return the dossier proc2 process that was removed
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public org.oep.core.processmgt.model.DossierProc2Process deleteDossierProc2Process(
		org.oep.core.processmgt.model.DossierProc2Process dossierProc2Process)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DossierProc2ProcessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DossierProc2ProcessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.oep.core.processmgt.model.DossierProc2Process fetchDossierProc2Process(
		long dossierProc2ProcessId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier proc2 process with the primary key.
	*
	* @param dossierProc2ProcessId the primary key of the dossier proc2 process
	* @return the dossier proc2 process
	* @throws PortalException if a dossier proc2 process with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.oep.core.processmgt.model.DossierProc2Process getDossierProc2Process(
		long dossierProc2ProcessId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossier proc2 processes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DossierProc2ProcessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier proc2 processes
	* @param end the upper bound of the range of dossier proc2 processes (not inclusive)
	* @return the range of dossier proc2 processes
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.oep.core.processmgt.model.DossierProc2Process> getDossierProc2Processes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossier proc2 processes.
	*
	* @return the number of dossier proc2 processes
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getDossierProc2ProcessesCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the dossier proc2 process in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossierProc2Process the dossier proc2 process
	* @return the dossier proc2 process that was updated
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.core.processmgt.model.DossierProc2Process updateDossierProc2Process(
		org.oep.core.processmgt.model.DossierProc2Process dossierProc2Process)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	* ThÃªm má»›i má»™t cáº¥u hÃ¬nh thá»§ tá»¥c thá»±c hiá»‡n bÃªn á»©ng dá»¥ng má»™t cá»­a
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Táº¡o má»›i
	*
	* @param dossierProcId mÃ£ thá»§ tá»¥c hÃ nh chÃ­nh
	* @param govAgencyId tham chiáº¿u cÆ¡ quan xá»­ lÃ½ há»“ sÆ¡
	* @param govAgencyName tham chiáº¿u cÆ¡ quan xá»­ lÃ½ há»“ sÆ¡
	* @param dossierProcessId mÃ£ quy trÃ¬nh xá»­ lÃ½ thá»§ tá»¥c hÃ nh chÃ­nh
	* @param aaaa 4 sá»‘ cá»‘ Ä‘á»‹nh cáº¥p phÃ¡t cho thá»§ tá»¥c
	* @param bbb 3 sá»‘ láº·p quay vÃ²ng Ä‘á»ƒ trÃ¡nh trÃ¹ng láº·p
	* @param daysDuration sá»‘ ngÃ y xá»­ lÃ½ thá»§ tá»¥c
	* @param paymentFee sá»‘ tiá»�n phÃ­ thá»§ tá»¥c pháº£i thanh toÃ¡n ban Ä‘áº§u
	* @param paymentOnegate cho phÃ©p thanh toÃ¡n qua má»™t cá»­a
	* @param paymentEservice cho phÃ©p thanh toÃ¡n báº±ng hÃ¬nh thá»©c online
	* @param organizationId cáº¥u hÃ¬nh org nháº­n tá»« cá»•ng dá»‹ch vá»¥
	* @param ebPartnershipId service Ä‘Æ°á»£c sá»­ dá»¥ng Ä‘á»ƒ trao Ä‘á»•i thÃ´ng tin há»“ sÆ¡ vá»›i cá»•ng
	* @param serviceContext ngá»¯ cáº£nh dá»‹ch vá»¥
	* @return: tag há»“ sÆ¡ má»›i Ä‘Æ°á»£c táº¡o
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.core.processmgt.model.DossierProc2Process addDossierProc2Process(
		long dossierProcId, java.lang.String govAgencyId,
		java.lang.String govAgencyName, long dossierProcessId,
		java.lang.String aaaa, java.lang.String bbb, int daysDuration,
		int paymentFee, int paymentOnegate, int paymentEservice,
		long organizationId, long ebPartnershipId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Cáº­p nháº­t thÃ´ng tin má»™t cáº¥u hÃ¬nh thá»§ tá»¥c bÃªn á»©ng dá»¥ng má»™t cá»­a
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Táº¡o má»›i
	*
	* @param id mÃ£ phÃ¢n biá»‡t cá»§a cáº¥u hÃ¬nh thá»§ tá»¥c
	* @param dossierProcId mÃ£ thá»§ tá»¥c hÃ nh chÃ­nh
	* @param govAgencyId tham chiáº¿u cÆ¡ quan xá»­ lÃ½ há»“ sÆ¡
	* @param govAgencyName tham chiáº¿u cÆ¡ quan xá»­ lÃ½ há»“ sÆ¡
	* @param dossierProcessId mÃ£ quy trÃ¬nh xá»­ lÃ½ thá»§ tá»¥c hÃ nh chÃ­nh
	* @param aaaa 4 sá»‘ cá»‘ Ä‘á»‹nh cáº¥p phÃ¡t cho thá»§ tá»¥c
	* @param bbb 3 sá»‘ láº·p quay vÃ²ng Ä‘á»ƒ trÃ¡nh trÃ¹ng láº·p
	* @param daysDuration sá»‘ ngÃ y xá»­ lÃ½ thá»§ tá»¥c
	* @param paymentFee sá»‘ tiá»�n phÃ­ thá»§ tá»¥c pháº£i thanh toÃ¡n ban Ä‘áº§u
	* @param paymentOnegate cho phÃ©p thanh toÃ¡n qua má»™t cá»­a
	* @param paymentEservice cho phÃ©p thanh toÃ¡n báº±ng hÃ¬nh thá»©c online
	* @param organizationId cáº¥u hÃ¬nh org nháº­n tá»« cá»•ng dá»‹ch vá»¥
	* @param ebPartnershipId service Ä‘Æ°á»£c sá»­ dá»¥ng Ä‘á»ƒ trao Ä‘á»•i thÃ´ng tin há»“ sÆ¡ vá»›i cá»•ng
	* @param serviceContext ngá»¯ cáº£nh dá»‹ch vá»¥
	* @return: Ä‘á»‘i tÆ°á»£ng cáº¥u hÃ¬nh thá»§ tá»¥c má»›i Ä‘Æ°á»£c cáº­p nháº­t thÃ´ng tin
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.core.processmgt.model.DossierProc2Process updateDossierProc2Process(
		long id, long dossierProcId, java.lang.String govAgencyId,
		java.lang.String govAgencyName, long dossierProcessId,
		java.lang.String aaaa, java.lang.String bbb, int daysDuration,
		int paymentFee, int paymentOnegate, int paymentEservice,
		long organizationId, long ebPartnershipId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Cáº­p nháº­t thÃ´ng tin má»™t cáº¥u hÃ¬nh thá»§ tá»¥c
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Cáº­p nháº­t thÃ´ng tin cáº¥u hÃ¬nh thá»§ tá»¥c
	*
	* @param dossierProc2Process cáº¥u hÃ¬nh thá»§ tá»¥c cáº§n cáº­p nháº­t
	* @param serviceContext ngá»¯ cáº£nh dá»‹ch vá»¥
	* @return: Ä‘á»‘i tÆ°á»£ng cáº¥u hÃ¬nh thá»§ tá»¥c Ä‘Æ°á»£c cáº­p nháº­t thÃ´ng tin
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.core.processmgt.model.DossierProc2Process updateDossierProc2Process(
		org.oep.core.processmgt.model.DossierProc2Process dossierProc2Process,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* XÃ³a bá»� thÃ´ng tin má»™t cáº¥u hÃ¬nh thá»§ tá»¥c
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    XÃ³a bá»� thÃ´ng tin cáº¥u hÃ¬nh thá»§ tá»¥c
	*
	* @param dossierProc2Process cáº¥u hÃ¬nh thá»§ tá»¥c cáº§n xÃ³a
	* @return
	*/
	public void removeDossierProc2Process(
		org.oep.core.processmgt.model.DossierProc2Process dossierProc2Process)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* XÃ³a bá»� thÃ´ng tin má»™t cáº¥u hÃ¬nh thá»§ tá»¥c
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    XÃ³a bá»� thÃ´ng tin cáº¥u hÃ¬nh thá»§ tá»¥c
	*
	* @param id mÃ£ phÃ¢n biá»‡t cáº¥u hÃ¬nh thá»§ tá»¥c
	* @return
	*/
	public void removeDossierProc2Process(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;
}