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
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for DossierProc. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author trungdk
 * @see DossierProcLocalServiceUtil
 * @see org.oep.core.dossiermgt.service.base.DossierProcLocalServiceBaseImpl
 * @see org.oep.core.dossiermgt.service.impl.DossierProcLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface DossierProcLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DossierProcLocalServiceUtil} to access the dossier proc local service. Add custom service methods to {@link org.oep.core.dossiermgt.service.impl.DossierProcLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the dossier proc to the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProc the dossier proc
	* @return the dossier proc that was added
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.core.dossiermgt.model.DossierProc addDossierProc(
		org.oep.core.dossiermgt.model.DossierProc dossierProc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new dossier proc with the primary key. Does not add the dossier proc to the database.
	*
	* @param dossierProcId the primary key for the new dossier proc
	* @return the new dossier proc
	*/
	public org.oep.core.dossiermgt.model.DossierProc createDossierProc(
		long dossierProcId);

	/**
	* Deletes the dossier proc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProcId the primary key of the dossier proc
	* @return the dossier proc that was removed
	* @throws PortalException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public org.oep.core.dossiermgt.model.DossierProc deleteDossierProc(
		long dossierProcId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the dossier proc from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProc the dossier proc
	* @return the dossier proc that was removed
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public org.oep.core.dossiermgt.model.DossierProc deleteDossierProc(
		org.oep.core.dossiermgt.model.DossierProc dossierProc)
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public org.oep.core.dossiermgt.model.DossierProc fetchDossierProc(
		long dossierProcId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier proc with the primary key.
	*
	* @param dossierProcId the primary key of the dossier proc
	* @return the dossier proc
	* @throws PortalException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.oep.core.dossiermgt.model.DossierProc getDossierProc(
		long dossierProcId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> getDossierProcs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossier procs.
	*
	* @return the number of dossier procs
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getDossierProcsCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the dossier proc in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossierProc the dossier proc
	* @return the dossier proc that was updated
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.core.dossiermgt.model.DossierProc updateDossierProc(
		org.oep.core.dossiermgt.model.DossierProc dossierProc)
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
		int forCitizen, int forBusiness, java.util.Date effectDate,
		java.util.Date expireDate, int statusActive,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Cáº­p nháº­t thÃ´ng tin má»™t thá»§ tá»¥c hÃ nh chÃ­nh cÃ´ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Cáº­p nháº­t thÃ´ng tin thá»§ tá»¥c hÃ nh chÃ­nh
	*
	* @param id mÃ£ phÃ¢n biá»‡t cá»§a thá»§ tá»¥c hÃ nh chÃ­nh
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
	* @return: Ä‘á»‘i tÆ°á»£ng thá»§ tá»¥c hÃ nh chÃ­nh má»›i Ä‘Æ°á»£c cáº­p nháº­t thÃ´ng tin
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
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
		int forCitizen, int forBusiness, java.util.Date effectDate,
		java.util.Date expireDate, int statusActive,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Cáº­p nháº­t thÃ´ng tin má»™t thá»§ tá»¥c hÃ nh chÃ­nh cÃ´ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Cáº­p nháº­t thÃ´ng tin thá»§ tá»¥c hÃ nh chÃ­nh
	*
	* @param dossierProc Thá»§ tá»¥c hÃ nh chÃ­nh cáº§n cáº­p nháº­t thÃ´ng tin
	* @param serviceContext ngá»¯ cáº£nh dá»‹ch vá»¥
	* @return: Ä‘á»‘i tÆ°á»£ng thá»§ tá»¥c hÃ nh chÃ­nh má»›i Ä‘Æ°á»£c cáº­p nháº­t thÃ´ng tin
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.core.dossiermgt.model.DossierProc updateDossierProc(
		org.oep.core.dossiermgt.model.DossierProc dossierProc,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* XÃ³a bá»� thÃ´ng tin má»™t thá»§ tá»¥c hÃ nh chÃ­nh cÃ´ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    XÃ³a bá»� thÃ´ng tin thá»§ tá»¥c hÃ nh chÃ­nh
	*
	* @param dossierProc Thá»§ tá»¥c hÃ nh chÃ­nh sáº½ bá»‹ xÃ³a
	* @return
	*/
	public void removeDossierProc(
		org.oep.core.dossiermgt.model.DossierProc dossierProc)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* XÃ³a bá»� thÃ´ng tin má»™t thá»§ tá»¥c hÃ nh chÃ­nh cÃ´ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    XÃ³a bá»� thÃ´ng tin thá»§ tá»¥c hÃ nh chÃ­nh
	*
	* @param id mÃ£ phÃ¢n biá»‡t thá»§ tá»¥c hÃ nh chÃ­nh
	* @return
	*/
	public void removeDossierProc(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* XÃ³a bá»� thÃ´ng tin táº¥t cáº£ thá»§ tá»¥c hÃ nh chÃ­nh cÃ´ng thuá»™c má»™t nhÃ³m
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    XÃ³a bá»� thÃ´ng tin thá»§ tá»¥c hÃ nh chÃ­nh cÃ´ng thuá»™c má»™t nhÃ³m
	*
	* @param groupId mÃ£ nhÃ³m quáº£n lÃ½ thá»§ tá»¥c hÃ nh chÃ­nh
	* @return
	*/
	public void deleteDossierProcs(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Láº¥y thÃ´ng tin má»™t thá»§ tá»¥c hÃ nh chÃ­nh cÃ´ng dá»±a vÃ o mÃ£ thá»§ tá»¥c hÃ nh chÃ­nh
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Láº¥y thÃ´ng tin thá»§ tá»¥c hÃ nh chÃ­nh
	*
	* @param dossierProcNo mÃ£ thá»§ tá»¥c hÃ nh chÃ­nh
	* @param serviceContext ngá»¯ cáº£nh dá»‹ch vá»¥
	* @return thá»§ tá»¥c hÃ nh chÃ­nh
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.oep.core.dossiermgt.model.DossierProc getByDossierProcNo(
		java.lang.String dossierProcNo,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* TÃ¬m kiáº¿m táº¥t cáº£ thá»§ tá»¥c hÃ nh chÃ­nh cá»§a má»™t cáº¥p quáº£n lÃ½
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¬m kiáº¿m thá»§ tá»¥c hÃ nh chÃ­nh cá»§a má»™t cáº¥p
	*
	* @param dossierProcNo mÃ£ thá»§ tá»¥c hÃ nh chÃ­nh
	* @param serviceContext ngá»¯ cáº£nh dá»‹ch vá»¥
	* @return danh sÃ¡ch thá»§ tá»¥c hÃ nh chÃ­nh cá»§a má»™t cáº¥p quáº£n lÃ½
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findAllByAdministrationNo(
		java.lang.String administrationNo,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* TÃ¬m kiáº¿m táº¥t cáº£ thá»§ tá»¥c hÃ nh chÃ­nh cá»§a thuá»™c má»™t lÄ©nh vá»±c
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¬m kiáº¿m thá»§ tá»¥c hÃ nh chÃ­nh thuá»™c má»™t lÄ©nh vá»±c
	*
	* @param dossierProcNo mÃ£ thá»§ tá»¥c hÃ nh chÃ­nh
	* @param serviceContext ngá»¯ cáº£nh dá»‹ch vá»¥
	* @return danh sÃ¡ch thá»§ tá»¥c hÃ nh chÃ­nh cá»§a má»™t lÄ©nh vá»±c
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findAllByDomainNo(
		java.lang.String domainNo,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* TÃ¬m kiáº¿m táº¥t cáº£ thá»§ tá»¥c hÃ nh chÃ­nh cá»§a thuá»™c má»™t lÄ©nh vá»±c vÃ  cáº¥p quáº£n lÃ½ nÃ o Ä‘Ã³
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¬m kiáº¿m thá»§ tá»¥c hÃ nh chÃ­nh thuá»™c má»™t lÄ©nh vá»±c vÃ  cáº¥p quáº£n lÃ½
	*
	* @param dossierProcNo mÃ£ thá»§ tá»¥c hÃ nh chÃ­nh
	* @param serviceContext ngá»¯ cáº£nh dá»‹ch vá»¥
	* @return danh sÃ¡ch thá»§ tá»¥c hÃ nh chÃ­nh cá»§a má»™t lÄ©nh vá»±c vÃ  cáº¥p quáº£n lÃ½
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findAllByAdministrationAndDomain(
		java.lang.String administrationNo, java.lang.String domainNo,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* TÃ¬m kiáº¿m táº¥t cáº£ thá»§ tá»¥c hÃ nh chÃ­nh cá»§a thuá»™c má»™t lÄ©nh vá»±c vÃ  cáº¥p quáº£n lÃ½ cá»§a má»™t Ä‘Æ¡n vá»‹
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¬m kiáº¿m thá»§ tá»¥c hÃ nh chÃ­nh thuá»™c má»™t lÄ©nh vá»±c vÃ  cáº¥p quáº£n lÃ½ cá»§a má»™t Ä‘Æ¡n vá»‹
	*
	* @param dossierProcNo mÃ£ thá»§ tá»¥c hÃ nh chÃ­nh
	* @param serviceContext ngá»¯ cáº£nh dá»‹ch vá»¥
	* @return danh sÃ¡ch thá»§ tá»¥c hÃ nh chÃ­nh cá»§a má»™t lÄ©nh vá»±c vÃ  cáº¥p quáº£n lÃ½ cá»§a má»™t Ä‘Æ¡n vá»‹
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByGroupAdministrationAndDomain(
		java.lang.String administrationNo, java.lang.String domainNo,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> getCompanyDossierProcs(
		long companyId,
		com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCompanyDossierProcsCount(long companyId,
		com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByGroupLikeName(
		java.lang.String name, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByGroupLikeName(java.lang.String name,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByLikeName(
		java.lang.String name, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByLikeName(java.lang.String name,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByCustomCondition(
		java.lang.String name, java.util.Date effectDate,
		java.util.Date expireDate, int active, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByCustomCondition(java.lang.String name,
		java.util.Date effectDate, java.util.Date expireDate, int active,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByGroupCustomCondition(
		java.lang.String name, java.lang.String administrationNo,
		java.lang.String domainNo, java.util.Date effectDate,
		java.util.Date expireDate, int active, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByGroupCustomCondition(java.lang.String name,
		java.lang.String administrationNo, java.lang.String domainNo,
		java.util.Date effectDate, java.util.Date expireDate, int active,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByCompany(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByCompany(
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException;
}