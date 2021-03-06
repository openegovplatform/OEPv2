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

package org.oep.dossiermgt.service;

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
 * Provides the local service interface for StatisticByDay. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author trungdk
 * @see StatisticByDayLocalServiceUtil
 * @see org.oep.dossiermgt.service.base.StatisticByDayLocalServiceBaseImpl
 * @see org.oep.dossiermgt.service.impl.StatisticByDayLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface StatisticByDayLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StatisticByDayLocalServiceUtil} to access the statistic by day local service. Add custom service methods to {@link org.oep.dossiermgt.service.impl.StatisticByDayLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the statistic by day to the database. Also notifies the appropriate model listeners.
	*
	* @param statisticByDay the statistic by day
	* @return the statistic by day that was added
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.dossiermgt.model.StatisticByDay addStatisticByDay(
		org.oep.dossiermgt.model.StatisticByDay statisticByDay)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new statistic by day with the primary key. Does not add the statistic by day to the database.
	*
	* @param statisticByDayId the primary key for the new statistic by day
	* @return the new statistic by day
	*/
	public org.oep.dossiermgt.model.StatisticByDay createStatisticByDay(
		long statisticByDayId);

	/**
	* Deletes the statistic by day with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param statisticByDayId the primary key of the statistic by day
	* @return the statistic by day that was removed
	* @throws PortalException if a statistic by day with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public org.oep.dossiermgt.model.StatisticByDay deleteStatisticByDay(
		long statisticByDayId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the statistic by day from the database. Also notifies the appropriate model listeners.
	*
	* @param statisticByDay the statistic by day
	* @return the statistic by day that was removed
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public org.oep.dossiermgt.model.StatisticByDay deleteStatisticByDay(
		org.oep.dossiermgt.model.StatisticByDay statisticByDay)
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.StatisticByDayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.StatisticByDayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public org.oep.dossiermgt.model.StatisticByDay fetchStatisticByDay(
		long statisticByDayId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the statistic by day with the primary key.
	*
	* @param statisticByDayId the primary key of the statistic by day
	* @return the statistic by day
	* @throws PortalException if a statistic by day with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.oep.dossiermgt.model.StatisticByDay getStatisticByDay(
		long statisticByDayId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the statistic by daies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.StatisticByDayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of statistic by daies
	* @param end the upper bound of the range of statistic by daies (not inclusive)
	* @return the range of statistic by daies
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.oep.dossiermgt.model.StatisticByDay> getStatisticByDaies(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of statistic by daies.
	*
	* @return the number of statistic by daies
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getStatisticByDaiesCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the statistic by day in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param statisticByDay the statistic by day
	* @return the statistic by day that was updated
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.dossiermgt.model.StatisticByDay updateStatisticByDay(
		org.oep.dossiermgt.model.StatisticByDay statisticByDay)
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
	* ThÃªm má»›i má»™t thá»‘ng kÃª há»“ sÆ¡ theo ngÃ y
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Táº¡o má»›i
	*
	* @param statisticDate ngÃ y thá»‘ng kÃª
	* @param statisticWeek tuáº§n thá»‘ng kÃª
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
	public org.oep.dossiermgt.model.StatisticByDay addStatisticByDay(
		java.util.Date statisticDate, int statisticWeek, int receiveNumber,
		int onlineNumber, double onlineRatio, int finishNumber,
		int ontimeNumber, double ontimeRatio, double delayDaysAvg,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Cáº­p nháº­t thÃ´ng tin thá»‘ng kÃª theo ngÃ y
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Cáº­p nháº­t thÃ´ng tin thá»‘ng kÃª theo ngÃ y
	*
	* @param id mÃ£ phÃ¢n biá»‡t cá»§a thá»‘ng kÃª theo ngÃ y
	* @param statisticDate ngÃ y thá»‘ng kÃª
	* @param statisticWeek tuáº§n thá»‘ng kÃª
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
	public org.oep.dossiermgt.model.StatisticByDay updateStatisticByDay(
		long id, java.util.Date statisticDate, int statisticWeek,
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
	* @param statisticByDay thá»‘ng kÃª há»“ sÆ¡ theo ngÃ y
	* @param serviceContext ngá»¯ cáº£nh dá»‹ch vá»¥
	* @return: Ä‘á»‘i tÆ°á»£ng thá»‘ng kÃª há»“ sÆ¡ theo ngÃ y má»›i Ä‘Æ°á»£c cáº­p nháº­t thÃ´ng tin
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.dossiermgt.model.StatisticByDay updateStatisticByDay(
		org.oep.dossiermgt.model.StatisticByDay statisticByDay,
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
	* @param statisticByDay thá»‘ng kÃª theo ngÃ y Ä‘Æ°á»£c xÃ³a
	* @return
	*/
	public void removeStatisticByDay(
		org.oep.dossiermgt.model.StatisticByDay statisticByDay)
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
	public void removeStatisticByDay(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;
}