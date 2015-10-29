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
 * Provides a wrapper for {@link StatisticByDomainLocalService}.
 *
 * @author trungdk
 * @see StatisticByDomainLocalService
 * @generated
 */
public class StatisticByDomainLocalServiceWrapper
	implements StatisticByDomainLocalService,
		ServiceWrapper<StatisticByDomainLocalService> {
	public StatisticByDomainLocalServiceWrapper(
		StatisticByDomainLocalService statisticByDomainLocalService) {
		_statisticByDomainLocalService = statisticByDomainLocalService;
	}

	/**
	* Adds the statistic by domain to the database. Also notifies the appropriate model listeners.
	*
	* @param statisticByDomain the statistic by domain
	* @return the statistic by domain that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.StatisticByDomain addStatisticByDomain(
		org.oep.core.dossiermgt.model.StatisticByDomain statisticByDomain)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _statisticByDomainLocalService.addStatisticByDomain(statisticByDomain);
	}

	/**
	* Creates a new statistic by domain with the primary key. Does not add the statistic by domain to the database.
	*
	* @param statisticByDomainId the primary key for the new statistic by domain
	* @return the new statistic by domain
	*/
	@Override
	public org.oep.core.dossiermgt.model.StatisticByDomain createStatisticByDomain(
		long statisticByDomainId) {
		return _statisticByDomainLocalService.createStatisticByDomain(statisticByDomainId);
	}

	/**
	* Deletes the statistic by domain with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param statisticByDomainId the primary key of the statistic by domain
	* @return the statistic by domain that was removed
	* @throws PortalException if a statistic by domain with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.StatisticByDomain deleteStatisticByDomain(
		long statisticByDomainId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _statisticByDomainLocalService.deleteStatisticByDomain(statisticByDomainId);
	}

	/**
	* Deletes the statistic by domain from the database. Also notifies the appropriate model listeners.
	*
	* @param statisticByDomain the statistic by domain
	* @return the statistic by domain that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.StatisticByDomain deleteStatisticByDomain(
		org.oep.core.dossiermgt.model.StatisticByDomain statisticByDomain)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _statisticByDomainLocalService.deleteStatisticByDomain(statisticByDomain);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _statisticByDomainLocalService.dynamicQuery();
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
		return _statisticByDomainLocalService.dynamicQuery(dynamicQuery);
	}

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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _statisticByDomainLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _statisticByDomainLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _statisticByDomainLocalService.dynamicQueryCount(dynamicQuery);
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
		return _statisticByDomainLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.core.dossiermgt.model.StatisticByDomain fetchStatisticByDomain(
		long statisticByDomainId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _statisticByDomainLocalService.fetchStatisticByDomain(statisticByDomainId);
	}

	/**
	* Returns the statistic by domain with the primary key.
	*
	* @param statisticByDomainId the primary key of the statistic by domain
	* @return the statistic by domain
	* @throws PortalException if a statistic by domain with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.StatisticByDomain getStatisticByDomain(
		long statisticByDomainId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _statisticByDomainLocalService.getStatisticByDomain(statisticByDomainId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _statisticByDomainLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<org.oep.core.dossiermgt.model.StatisticByDomain> getStatisticByDomains(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _statisticByDomainLocalService.getStatisticByDomains(start, end);
	}

	/**
	* Returns the number of statistic by domains.
	*
	* @return the number of statistic by domains
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getStatisticByDomainsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _statisticByDomainLocalService.getStatisticByDomainsCount();
	}

	/**
	* Updates the statistic by domain in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param statisticByDomain the statistic by domain
	* @return the statistic by domain that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.dossiermgt.model.StatisticByDomain updateStatisticByDomain(
		org.oep.core.dossiermgt.model.StatisticByDomain statisticByDomain)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _statisticByDomainLocalService.updateStatisticByDomain(statisticByDomain);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _statisticByDomainLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_statisticByDomainLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _statisticByDomainLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* ThÃƒÂªm mÃ¡Â»â€ºi mÃ¡Â»â„¢t thÃ¡Â»â€˜ng kÃƒÂª hÃ¡Â»â€œ sÃ†Â¡ theo lÃ„Â©nh vÃ¡Â»Â±c
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
	* @param dossierDomain lÃ„Â©nh vÃ¡Â»Â±c hÃ¡Â»â€œ sÃ†Â¡ theo cÃ¡ÂºÂ¥p 1
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
	@Override
	public org.oep.core.dossiermgt.model.StatisticByDomain addStatisticByDomain(
		int month, int year, java.lang.String dossierDomain, int receiveNumber,
		int onlineNumber, double onlineRatio, int finishNumber,
		int ontimeNumber, double ontimeRatio, double delayDaysAvg,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _statisticByDomainLocalService.addStatisticByDomain(month, year,
			dossierDomain, receiveNumber, onlineNumber, onlineRatio,
			finishNumber, ontimeNumber, ontimeRatio, delayDaysAvg,
			serviceContext);
	}

	/**
	* CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin thÃ¡Â»â€˜ng kÃƒÂª theo lÃ„Â©nh vÃ¡Â»Â±c
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin thÃ¡Â»â€˜ng kÃƒÂª theo lÃ„Â©nh vÃ¡Â»Â±c
	*
	* @param id mÃƒÂ£ phÃƒÂ¢n biÃ¡Â»â€¡t cÃ¡Â»Â§a thÃ¡Â»â€˜ng kÃƒÂª theo ngÃƒÂ y
	* @param month thÃƒÂ¡ng thÃ¡Â»â€˜ng kÃƒÂª
	* @param year nÃ„Æ’m thÃ¡Â»â€˜ng kÃƒÂª
	* @param dossierDomain lÃ„Â©nh vÃ¡Â»Â±c hÃ¡Â»â€œ sÃ†Â¡ cÃ¡ÂºÂ¥p 1
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
	@Override
	public org.oep.core.dossiermgt.model.StatisticByDomain updateStatisticByDomain(
		long id, int month, int year, java.lang.String dossierDomain,
		long receiveNumber, long onlineNumber, double onlineRatio,
		int finishNumber, int ontimeNumber, double ontimeRatio,
		double delayDaysAvg,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _statisticByDomainLocalService.updateStatisticByDomain(id,
			month, year, dossierDomain, receiveNumber, onlineNumber,
			onlineRatio, finishNumber, ontimeNumber, ontimeRatio, delayDaysAvg,
			serviceContext);
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
	* @param statisticByDomain thÃ¡Â»â€˜ng kÃƒÂª hÃ¡Â»â€œ sÃ†Â¡ theo lÃ„Â©nh vÃ¡Â»Â±c
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng thÃ¡Â»â€˜ng kÃƒÂª hÃ¡Â»â€œ sÃ†Â¡ theo ngÃƒÂ y mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin
	*/
	@Override
	public org.oep.core.dossiermgt.model.StatisticByDomain updateStatisticByDomain(
		org.oep.core.dossiermgt.model.StatisticByDomain statisticByDomain,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _statisticByDomainLocalService.updateStatisticByDomain(statisticByDomain,
			serviceContext);
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
	* @param statisticByDomain thÃ¡Â»â€˜ng kÃƒÂª theo ngÃƒÂ y Ã„â€˜Ã†Â°Ã¡Â»Â£c xÃƒÂ³a
	* @return
	*/
	@Override
	public void removeStatisticByDomain(
		org.oep.core.dossiermgt.model.StatisticByDomain statisticByDomain)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_statisticByDomainLocalService.removeStatisticByDomain(statisticByDomain);
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
	@Override
	public void removeStatisticByDomain(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_statisticByDomainLocalService.removeStatisticByDomain(id);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public StatisticByDomainLocalService getWrappedStatisticByDomainLocalService() {
		return _statisticByDomainLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedStatisticByDomainLocalService(
		StatisticByDomainLocalService statisticByDomainLocalService) {
		_statisticByDomainLocalService = statisticByDomainLocalService;
	}

	@Override
	public StatisticByDomainLocalService getWrappedService() {
		return _statisticByDomainLocalService;
	}

	@Override
	public void setWrappedService(
		StatisticByDomainLocalService statisticByDomainLocalService) {
		_statisticByDomainLocalService = statisticByDomainLocalService;
	}

	private StatisticByDomainLocalService _statisticByDomainLocalService;
}