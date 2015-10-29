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
 * Provides the local service interface for StatisticByDomain. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author trungdk
 * @see StatisticByDomainLocalServiceUtil
 * @see org.oep.core.dossiermgt.service.base.StatisticByDomainLocalServiceBaseImpl
 * @see org.oep.core.dossiermgt.service.impl.StatisticByDomainLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface StatisticByDomainLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StatisticByDomainLocalServiceUtil} to access the statistic by domain local service. Add custom service methods to {@link org.oep.core.dossiermgt.service.impl.StatisticByDomainLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the statistic by domain to the database. Also notifies the appropriate model listeners.
	*
	* @param statisticByDomain the statistic by domain
	* @return the statistic by domain that was added
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.core.dossiermgt.model.StatisticByDomain addStatisticByDomain(
		org.oep.core.dossiermgt.model.StatisticByDomain statisticByDomain)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new statistic by domain with the primary key. Does not add the statistic by domain to the database.
	*
	* @param statisticByDomainId the primary key for the new statistic by domain
	* @return the new statistic by domain
	*/
	public org.oep.core.dossiermgt.model.StatisticByDomain createStatisticByDomain(
		long statisticByDomainId);

	/**
	* Deletes the statistic by domain with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param statisticByDomainId the primary key of the statistic by domain
	* @return the statistic by domain that was removed
	* @throws PortalException if a statistic by domain with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public org.oep.core.dossiermgt.model.StatisticByDomain deleteStatisticByDomain(
		long statisticByDomainId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the statistic by domain from the database. Also notifies the appropriate model listeners.
	*
	* @param statisticByDomain the statistic by domain
	* @return the statistic by domain that was removed
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public org.oep.core.dossiermgt.model.StatisticByDomain deleteStatisticByDomain(
		org.oep.core.dossiermgt.model.StatisticByDomain statisticByDomain)
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.StatisticByDomainModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.StatisticByDomainModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public org.oep.core.dossiermgt.model.StatisticByDomain fetchStatisticByDomain(
		long statisticByDomainId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the statistic by domain with the primary key.
	*
	* @param statisticByDomainId the primary key of the statistic by domain
	* @return the statistic by domain
	* @throws PortalException if a statistic by domain with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.oep.core.dossiermgt.model.StatisticByDomain getStatisticByDomain(
		long statisticByDomainId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the statistic by domains.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.StatisticByDomainModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of statistic by domains
	* @param end the upper bound of the range of statistic by domains (not inclusive)
	* @return the range of statistic by domains
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.oep.core.dossiermgt.model.StatisticByDomain> getStatisticByDomains(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of statistic by domains.
	*
	* @return the number of statistic by domains
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getStatisticByDomainsCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the statistic by domain in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param statisticByDomain the statistic by domain
	* @return the statistic by domain that was updated
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.core.dossiermgt.model.StatisticByDomain updateStatisticByDomain(
		org.oep.core.dossiermgt.model.StatisticByDomain statisticByDomain)
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
	* ThÃªm má»›i má»™t thá»‘ng kÃª há»“ sÆ¡ theo lÄ©nh vá»±c
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Táº¡o má»›i
	*
	* @param month thÃ¡ng thá»‘ng kÃª
	* @param year nÄƒm thá»‘ng kÃª
	* @param dossierDomain lÄ©nh vá»±c há»“ sÆ¡ theo cáº¥p 1
	* @param receiveNumber sá»‘ há»“ sÆ¡ Ä‘Æ°á»£c tiáº¿p nháº­n
	* @param onlineNumber sá»‘ há»“ sÆ¡ trá»±c tuyáº¿n
	* @param onlineRatio tá»‰ lá»‡ há»“ sÆ¡ trá»±c tuyáº¿n
	* @param finishNumber sá»‘ há»“ sÆ¡ Ä‘Æ°á»£c hoÃ n thÃ nh
	* @param ontimeNumber sá»‘ há»“ sÆ¡ hoÃ n thÃ nh Ä‘Ãºng háº¹n
	* @param ontimeRatio tá»‰ lá»‡ há»“ sÆ¡ hoÃ n thÃ nh Ä‘Ãºng háº¹n
	* @param delayDaysAvg sá»‘ ngÃ y trá»… háº¹n trung bÃ¬nh
	* @param serviceContext ngá»¯ cáº£nh dá»‹ch vá»¥
	* @return: thá»‘ng kÃª há»“ sÆ¡ má»›i Ä‘Æ°á»£c táº¡o
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.core.dossiermgt.model.StatisticByDomain addStatisticByDomain(
		int month, int year, java.lang.String dossierDomain, int receiveNumber,
		int onlineNumber, double onlineRatio, int finishNumber,
		int ontimeNumber, double ontimeRatio, double delayDaysAvg,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Cáº­p nháº­t thÃ´ng tin thá»‘ng kÃª theo lÄ©nh vá»±c
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Cáº­p nháº­t thÃ´ng tin thá»‘ng kÃª theo lÄ©nh vá»±c
	*
	* @param id mÃ£ phÃ¢n biá»‡t cá»§a thá»‘ng kÃª theo ngÃ y
	* @param month thÃ¡ng thá»‘ng kÃª
	* @param year nÄƒm thá»‘ng kÃª
	* @param dossierDomain lÄ©nh vá»±c há»“ sÆ¡ cáº¥p 1
	* @param receiveNumber sá»‘ há»“ sÆ¡ Ä‘Æ°á»£c tiáº¿p nháº­n
	* @param onlineNumber sá»‘ há»“ sÆ¡ trá»±c tuyáº¿n
	* @param onlineRatio tá»‰ lá»‡ há»“ sÆ¡ trá»±c tuyáº¿n
	* @param finishNumber sá»‘ há»“ sÆ¡ Ä‘Æ°á»£c hoÃ n thÃ nh
	* @param ontimeNumber sá»‘ há»“ sÆ¡ hoÃ n thÃ nh Ä‘Ãºng háº¹n
	* @param ontimeRatio tá»‰ lá»‡ há»“ sÆ¡ hoÃ n thÃ nh Ä‘Ãºng háº¹n
	* @param delayDaysAvg sá»‘ ngÃ y trá»… háº¹n trung bÃ¬nh
	* @param serviceContext ngá»¯ cáº£nh dá»‹ch vá»¥
	* @return: Ä‘á»‘i tÆ°á»£ng thá»‘ng kÃª theo ngÃ y má»›i Ä‘Æ°á»£c cáº­p nháº­t thÃ´ng tin
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.core.dossiermgt.model.StatisticByDomain updateStatisticByDomain(
		long id, int month, int year, java.lang.String dossierDomain,
		long receiveNumber, long onlineNumber, double onlineRatio,
		int finishNumber, int ontimeNumber, double ontimeRatio,
		double delayDaysAvg,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Cáº­p nháº­t thÃ´ng tin má»™t thá»‘ng kÃª há»“ sÆ¡
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Cáº­p nháº­t thÃ´ng tin thá»‘ng kÃª há»“ sÆ¡
	*
	* @param statisticByDomain thá»‘ng kÃª há»“ sÆ¡ theo lÄ©nh vá»±c
	* @param serviceContext ngá»¯ cáº£nh dá»‹ch vá»¥
	* @return: Ä‘á»‘i tÆ°á»£ng thá»‘ng kÃª há»“ sÆ¡ theo ngÃ y má»›i Ä‘Æ°á»£c cáº­p nháº­t thÃ´ng tin
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.core.dossiermgt.model.StatisticByDomain updateStatisticByDomain(
		org.oep.core.dossiermgt.model.StatisticByDomain statisticByDomain,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* XÃ³a bá»� thÃ´ng tin má»™t thá»‘ng kÃª theo ngÃ y
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    XÃ³a bá»� thÃ´ng tin thá»‘ng kÃª theo ngÃ y
	*
	* @param statisticByDomain thá»‘ng kÃª theo ngÃ y Ä‘Æ°á»£c xÃ³a
	* @return
	*/
	public void removeStatisticByDomain(
		org.oep.core.dossiermgt.model.StatisticByDomain statisticByDomain)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* XÃ³a bá»� thÃ´ng tin má»™t thá»‘ng kÃª theo ngÃ y
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    XÃ³a bá»� thÃ´ng tin thá»‘ng kÃª theo ngÃ y
	*
	* @param id mÃ£ phÃ¢n biá»‡t thá»‘ng kÃª theo ngÃ y
	* @return
	*/
	public void removeStatisticByDomain(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;
}