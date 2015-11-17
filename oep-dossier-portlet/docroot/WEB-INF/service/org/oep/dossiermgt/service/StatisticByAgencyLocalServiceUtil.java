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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for StatisticByAgency. This utility wraps
 * {@link org.oep.dossiermgt.service.impl.StatisticByAgencyLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author trungdk
 * @see StatisticByAgencyLocalService
 * @see org.oep.dossiermgt.service.base.StatisticByAgencyLocalServiceBaseImpl
 * @see org.oep.dossiermgt.service.impl.StatisticByAgencyLocalServiceImpl
 * @generated
 */
public class StatisticByAgencyLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.dossiermgt.service.impl.StatisticByAgencyLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the statistic by agency to the database. Also notifies the appropriate model listeners.
	*
	* @param statisticByAgency the statistic by agency
	* @return the statistic by agency that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.StatisticByAgency addStatisticByAgency(
		org.oep.dossiermgt.model.StatisticByAgency statisticByAgency)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addStatisticByAgency(statisticByAgency);
	}

	/**
	* Creates a new statistic by agency with the primary key. Does not add the statistic by agency to the database.
	*
	* @param statisticByAgencyId the primary key for the new statistic by agency
	* @return the new statistic by agency
	*/
	public static org.oep.dossiermgt.model.StatisticByAgency createStatisticByAgency(
		long statisticByAgencyId) {
		return getService().createStatisticByAgency(statisticByAgencyId);
	}

	/**
	* Deletes the statistic by agency with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param statisticByAgencyId the primary key of the statistic by agency
	* @return the statistic by agency that was removed
	* @throws PortalException if a statistic by agency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.StatisticByAgency deleteStatisticByAgency(
		long statisticByAgencyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteStatisticByAgency(statisticByAgencyId);
	}

	/**
	* Deletes the statistic by agency from the database. Also notifies the appropriate model listeners.
	*
	* @param statisticByAgency the statistic by agency
	* @return the statistic by agency that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.StatisticByAgency deleteStatisticByAgency(
		org.oep.dossiermgt.model.StatisticByAgency statisticByAgency)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteStatisticByAgency(statisticByAgency);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.StatisticByAgencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.StatisticByAgencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static org.oep.dossiermgt.model.StatisticByAgency fetchStatisticByAgency(
		long statisticByAgencyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchStatisticByAgency(statisticByAgencyId);
	}

	/**
	* Returns the statistic by agency with the primary key.
	*
	* @param statisticByAgencyId the primary key of the statistic by agency
	* @return the statistic by agency
	* @throws PortalException if a statistic by agency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.StatisticByAgency getStatisticByAgency(
		long statisticByAgencyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getStatisticByAgency(statisticByAgencyId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the statistic by agencies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.StatisticByAgencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of statistic by agencies
	* @param end the upper bound of the range of statistic by agencies (not inclusive)
	* @return the range of statistic by agencies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.dossiermgt.model.StatisticByAgency> getStatisticByAgencies(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getStatisticByAgencies(start, end);
	}

	/**
	* Returns the number of statistic by agencies.
	*
	* @return the number of statistic by agencies
	* @throws SystemException if a system exception occurred
	*/
	public static int getStatisticByAgenciesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getStatisticByAgenciesCount();
	}

	/**
	* Updates the statistic by agency in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param statisticByAgency the statistic by agency
	* @return the statistic by agency that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.StatisticByAgency updateStatisticByAgency(
		org.oep.dossiermgt.model.StatisticByAgency statisticByAgency)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateStatisticByAgency(statisticByAgency);
	}

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
	* ThÃƒÂªm mÃ¡Â»â€ºi mÃ¡Â»â„¢t thÃ¡Â»â€˜ng kÃƒÂª hÃ¡Â»â€œ sÃ†Â¡ theo cÃ†Â¡ quan xÃ¡Â»Â­ lÃƒÂ½
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param month thÃƒÂ¡ng thÃ¡Â»â€˜ng kÃƒÂª
	* @param year nÃ„Æ’m thÃ¡Â»â€˜ng kÃƒÂª
	* @param govAgencyId mÃƒÂ£ cÃ†Â¡ quan xÃ¡Â»Â­ lÃƒÂ½
	* @param receiveNumber sÃ¡Â»â€˜ hÃ¡Â»â€œ sÃ†Â¡ Ã„â€˜Ã†Â°Ã¡Â»Â£c tiÃ¡ÂºÂ¿p nhÃ¡ÂºÂ­n
	* @param onlineNumber sÃ¡Â»â€˜ hÃ¡Â»â€œ sÃ†Â¡ trÃ¡Â»Â±c tuyÃ¡ÂºÂ¿n
	* @param onlineRatio tÃ¡Â»â€° lÃ¡Â»â€¡ hÃ¡Â»â€œ sÃ†Â¡ trÃ¡Â»Â±c tuyÃ¡ÂºÂ¿n
	* @param finishNumber sÃ¡Â»â€˜ hÃ¡Â»â€œ sÃ†Â¡ Ã„â€˜Ã†Â°Ã¡Â»Â£c hoÃƒÂ n thÃƒÂ nh
	* @param ontimeNumber sÃ¡Â»â€˜ hÃ¡Â»â€œ sÃ†Â¡ hoÃƒÂ n thÃƒÂ nh Ã„â€˜ÃƒÂºng hÃ¡ÂºÂ¹n
	* @param ontimeRatio tÃ¡Â»â€° lÃ¡Â»â€¡ hÃ¡Â»â€œ sÃ†Â¡ hoÃƒÂ n thÃƒÂ nh Ã„â€˜ÃƒÂºng hÃ¡ÂºÂ¹n
	* @param delayDaysAvg sÃ¡Â»â€˜ ngÃƒÂ y trÃ¡Â»â€¦ hÃ¡ÂºÂ¹n trung bÃƒÂ¬nh
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: thÃ¡Â»â€˜ng kÃƒÂª hÃ¡Â»â€œ sÃ†Â¡ mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c tÃ¡ÂºÂ¡o
	*/
	public static org.oep.dossiermgt.model.StatisticByAgency addStatisticByAgency(
		int month, int year, java.lang.String govAgencyId, int receiveNumber,
		int onlineNumber, double onlineRatio, int finishNumber,
		int ontimeNumber, double ontimeRatio, double delayDaysAvg,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addStatisticByAgency(month, year, govAgencyId,
			receiveNumber, onlineNumber, onlineRatio, finishNumber,
			ontimeNumber, ontimeRatio, delayDaysAvg, serviceContext);
	}

	/**
	* CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin thÃ¡Â»â€˜ng kÃƒÂª theo cÃ†Â¡ quan xÃ¡Â»Â­ lÃƒÂ½
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin thÃ¡Â»â€˜ng kÃƒÂª theo cÃ†Â¡ quan xÃ¡Â»Â­ lÃƒÂ½
	*
	* @param id mÃƒÂ£ phÃƒÂ¢n biÃ¡Â»â€¡t cÃ¡Â»Â§a thÃ¡Â»â€˜ng kÃƒÂª theo ngÃƒÂ y
	* @param month thÃƒÂ¡ng thÃ¡Â»â€˜ng kÃƒÂª
	* @param year nÃ„Æ’m thÃ¡Â»â€˜ng kÃƒÂª
	* @param govAgencyId cÃ†Â¡ quan xÃ¡Â»Â­ lÃƒÂ½
	* @param receiveNumber sÃ¡Â»â€˜ hÃ¡Â»â€œ sÃ†Â¡ Ã„â€˜Ã†Â°Ã¡Â»Â£c tiÃ¡ÂºÂ¿p nhÃ¡ÂºÂ­n
	* @param onlineNumber sÃ¡Â»â€˜ hÃ¡Â»â€œ sÃ†Â¡ trÃ¡Â»Â±c tuyÃ¡ÂºÂ¿n
	* @param onlineRatio tÃ¡Â»â€° lÃ¡Â»â€¡ hÃ¡Â»â€œ sÃ†Â¡ trÃ¡Â»Â±c tuyÃ¡ÂºÂ¿n
	* @param finishNumber sÃ¡Â»â€˜ hÃ¡Â»â€œ sÃ†Â¡ Ã„â€˜Ã†Â°Ã¡Â»Â£c hoÃƒÂ n thÃƒÂ nh
	* @param ontimeNumber sÃ¡Â»â€˜ hÃ¡Â»â€œ sÃ†Â¡ hoÃƒÂ n thÃƒÂ nh Ã„â€˜ÃƒÂºng hÃ¡ÂºÂ¹n
	* @param ontimeRatio tÃ¡Â»â€° lÃ¡Â»â€¡ hÃ¡Â»â€œ sÃ†Â¡ hoÃƒÂ n thÃƒÂ nh Ã„â€˜ÃƒÂºng hÃ¡ÂºÂ¹n
	* @param delayDaysAvg sÃ¡Â»â€˜ ngÃƒÂ y trÃ¡Â»â€¦ hÃ¡ÂºÂ¹n trung bÃƒÂ¬nh
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng thÃ¡Â»â€˜ng kÃƒÂª theo ngÃƒÂ y mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin
	*/
	public static org.oep.dossiermgt.model.StatisticByAgency updateStatisticByAgency(
		long id, int month, int year, java.lang.String govAgencyId,
		long receiveNumber, long onlineNumber, double onlineRatio,
		int finishNumber, int ontimeNumber, double ontimeRatio,
		double delayDaysAvg,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateStatisticByAgency(id, month, year, govAgencyId,
			receiveNumber, onlineNumber, onlineRatio, finishNumber,
			ontimeNumber, ontimeRatio, delayDaysAvg, serviceContext);
	}

	/**
	* CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin mÃ¡Â»â„¢t thÃ¡Â»â€˜ng kÃƒÂª hÃ¡Â»â€œ sÃ†Â¡
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin thÃ¡Â»â€˜ng kÃƒÂª hÃ¡Â»â€œ sÃ†Â¡
	*
	* @param statisticByAgency thÃ¡Â»â€˜ng kÃƒÂª hÃ¡Â»â€œ sÃ†Â¡ theo cÃ†Â¡ quan xÃ¡Â»Â­ lÃƒÂ½
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng thÃ¡Â»â€˜ng kÃƒÂª hÃ¡Â»â€œ sÃ†Â¡ theo ngÃƒÂ y mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin
	*/
	public static org.oep.dossiermgt.model.StatisticByAgency updateStatisticByAgency(
		org.oep.dossiermgt.model.StatisticByAgency statisticByAgency,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateStatisticByAgency(statisticByAgency, serviceContext);
	}

	/**
	* XÃƒÂ³a bÃ¡Â»ï¿½ thÃƒÂ´ng tin mÃ¡Â»â„¢t thÃ¡Â»â€˜ng kÃƒÂª theo ngÃƒÂ y
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    XÃƒÂ³a bÃ¡Â»ï¿½ thÃƒÂ´ng tin thÃ¡Â»â€˜ng kÃƒÂª theo ngÃƒÂ y
	*
	* @param statisticByAgency thÃ¡Â»â€˜ng kÃƒÂª theo ngÃƒÂ y Ã„â€˜Ã†Â°Ã¡Â»Â£c xÃƒÂ³a
	* @return
	*/
	public static void removeStatisticByAgency(
		org.oep.dossiermgt.model.StatisticByAgency statisticByAgency)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeStatisticByAgency(statisticByAgency);
	}

	/**
	* XÃƒÂ³a bÃ¡Â»ï¿½ thÃƒÂ´ng tin mÃ¡Â»â„¢t thÃ¡Â»â€˜ng kÃƒÂª theo ngÃƒÂ y
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    XÃƒÂ³a bÃ¡Â»ï¿½ thÃƒÂ´ng tin thÃ¡Â»â€˜ng kÃƒÂª theo ngÃƒÂ y
	*
	* @param id mÃƒÂ£ phÃƒÂ¢n biÃ¡Â»â€¡t thÃ¡Â»â€˜ng kÃƒÂª theo ngÃƒÂ y
	* @return
	*/
	public static void removeStatisticByAgency(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeStatisticByAgency(id);
	}

	public static void clearService() {
		_service = null;
	}

	public static StatisticByAgencyLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					StatisticByAgencyLocalService.class.getName());

			if (invokableLocalService instanceof StatisticByAgencyLocalService) {
				_service = (StatisticByAgencyLocalService)invokableLocalService;
			}
			else {
				_service = new StatisticByAgencyLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(StatisticByAgencyLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(StatisticByAgencyLocalService service) {
	}

	private static StatisticByAgencyLocalService _service;
}