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
 * Provides the local service interface for StatisticByUser. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author trungdk
 * @see StatisticByUserLocalServiceUtil
 * @see org.oep.core.processmgt.service.base.StatisticByUserLocalServiceBaseImpl
 * @see org.oep.core.processmgt.service.impl.StatisticByUserLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface StatisticByUserLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StatisticByUserLocalServiceUtil} to access the statistic by user local service. Add custom service methods to {@link org.oep.core.processmgt.service.impl.StatisticByUserLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the statistic by user to the database. Also notifies the appropriate model listeners.
	*
	* @param statisticByUser the statistic by user
	* @return the statistic by user that was added
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.core.processmgt.model.StatisticByUser addStatisticByUser(
		org.oep.core.processmgt.model.StatisticByUser statisticByUser)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new statistic by user with the primary key. Does not add the statistic by user to the database.
	*
	* @param statisticByUserId the primary key for the new statistic by user
	* @return the new statistic by user
	*/
	public org.oep.core.processmgt.model.StatisticByUser createStatisticByUser(
		long statisticByUserId);

	/**
	* Deletes the statistic by user with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param statisticByUserId the primary key of the statistic by user
	* @return the statistic by user that was removed
	* @throws PortalException if a statistic by user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public org.oep.core.processmgt.model.StatisticByUser deleteStatisticByUser(
		long statisticByUserId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the statistic by user from the database. Also notifies the appropriate model listeners.
	*
	* @param statisticByUser the statistic by user
	* @return the statistic by user that was removed
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public org.oep.core.processmgt.model.StatisticByUser deleteStatisticByUser(
		org.oep.core.processmgt.model.StatisticByUser statisticByUser)
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.StatisticByUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.StatisticByUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public org.oep.core.processmgt.model.StatisticByUser fetchStatisticByUser(
		long statisticByUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the statistic by user with the primary key.
	*
	* @param statisticByUserId the primary key of the statistic by user
	* @return the statistic by user
	* @throws PortalException if a statistic by user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.oep.core.processmgt.model.StatisticByUser getStatisticByUser(
		long statisticByUserId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the statistic by users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.StatisticByUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of statistic by users
	* @param end the upper bound of the range of statistic by users (not inclusive)
	* @return the range of statistic by users
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.oep.core.processmgt.model.StatisticByUser> getStatisticByUsers(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of statistic by users.
	*
	* @return the number of statistic by users
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getStatisticByUsersCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the statistic by user in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param statisticByUser the statistic by user
	* @return the statistic by user that was updated
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.core.processmgt.model.StatisticByUser updateStatisticByUser(
		org.oep.core.processmgt.model.StatisticByUser statisticByUser)
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
	* ThÃªm thÃ´ng tin thá»‘ng kÃª theo ngÆ°á»�i dÃ¹ng xá»­ lÃ½ há»“ sÆ¡
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Táº¡o má»›i
	*
	* @param month thÃ¡ng trong nÄƒm
	* @param year nÄƒm
	* @param totalNumber sá»‘ há»“ sÆ¡ xá»­ lÃ½
	* @param ontimeNumber sá»‘ Ä‘Ãºng háº¹n
	* @param ontimeRatio tá»‰ lá»‡ Ä‘Ãºng háº¹n
	* @param delayDaysAvg sá»‘ ngÃ y trá»… háº¹n trung bÃ¬nh
	* @return: thÃ´ng tin thá»‘ng kÃª ngÆ°á»�i dÃ¹ng xá»­ lÃ½ há»“ sÆ¡ má»›i
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	@com.liferay.portal.kernel.transaction.Transactional
	public org.oep.core.processmgt.model.StatisticByUser addStatisticByUser(
		int month, int year, int totalNumber, int ontimeNumber,
		double ontimeRatio, double delayDaysAvg,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Cáº­p nháº­t thÃ´ng tin thá»‘ng kÃª theo ngÆ°á»�i dÃ¹ng xá»­ lÃ½ há»“ sÆ¡
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Táº¡o má»›i
	*
	* @param id mÃ£ thÃ´ng tin thá»‘ng kÃª ngÆ°á»�i dÃ¹ng xá»­ lÃ½ há»“ sÆ¡
	* @param month thÃ¡ng trong nÄƒm
	* @param year nÄƒm
	* @param totalNumber sá»‘ há»“ sÆ¡ xá»­ lÃ½
	* @param ontimeNumber sá»‘ Ä‘Ãºng háº¹n
	* @param ontimeRatio tá»‰ lá»‡ Ä‘Ãºng háº¹n
	* @param delayDaysAvg sá»‘ ngÃ y trá»… háº¹n trung bÃ¬nh
	* @return: cáº­p nháº­t thÃ´ng tin thá»‘ng kÃª ngÆ°á»�i dÃ¹ng xá»­ lÃ½ há»“ sÆ¡ má»›i
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.core.processmgt.model.StatisticByUser updateStatisticByUser(
		long id, int month, int year, int totalNumber, int ontimeNumber,
		double ontimeRatio, double delayDaysAvg,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void updateStatisticByUserResources(
		org.oep.core.processmgt.model.StatisticByUser statisticByUser,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void removeStatisticByUser(
		org.oep.core.processmgt.model.StatisticByUser statisticByUser)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void removeStatisticByUser(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void addStatisticByUserResources(
		org.oep.core.processmgt.model.StatisticByUser statisticByUser,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void addStatisticByUserResources(
		org.oep.core.processmgt.model.StatisticByUser statisticByUser,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void addStatisticByUserResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;
}