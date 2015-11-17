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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for StatisticByUser. This utility wraps
 * {@link org.oep.processmgt.service.impl.StatisticByUserLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author trungdk
 * @see StatisticByUserLocalService
 * @see org.oep.processmgt.service.base.StatisticByUserLocalServiceBaseImpl
 * @see org.oep.processmgt.service.impl.StatisticByUserLocalServiceImpl
 * @generated
 */
public class StatisticByUserLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.processmgt.service.impl.StatisticByUserLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the statistic by user to the database. Also notifies the appropriate model listeners.
	*
	* @param statisticByUser the statistic by user
	* @return the statistic by user that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.processmgt.model.StatisticByUser addStatisticByUser(
		org.oep.processmgt.model.StatisticByUser statisticByUser)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addStatisticByUser(statisticByUser);
	}

	/**
	* Creates a new statistic by user with the primary key. Does not add the statistic by user to the database.
	*
	* @param statisticByUserId the primary key for the new statistic by user
	* @return the new statistic by user
	*/
	public static org.oep.processmgt.model.StatisticByUser createStatisticByUser(
		long statisticByUserId) {
		return getService().createStatisticByUser(statisticByUserId);
	}

	/**
	* Deletes the statistic by user with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param statisticByUserId the primary key of the statistic by user
	* @return the statistic by user that was removed
	* @throws PortalException if a statistic by user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.processmgt.model.StatisticByUser deleteStatisticByUser(
		long statisticByUserId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteStatisticByUser(statisticByUserId);
	}

	/**
	* Deletes the statistic by user from the database. Also notifies the appropriate model listeners.
	*
	* @param statisticByUser the statistic by user
	* @return the statistic by user that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.processmgt.model.StatisticByUser deleteStatisticByUser(
		org.oep.processmgt.model.StatisticByUser statisticByUser)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteStatisticByUser(statisticByUser);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.StatisticByUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.StatisticByUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.oep.processmgt.model.StatisticByUser fetchStatisticByUser(
		long statisticByUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchStatisticByUser(statisticByUserId);
	}

	/**
	* Returns the statistic by user with the primary key.
	*
	* @param statisticByUserId the primary key of the statistic by user
	* @return the statistic by user
	* @throws PortalException if a statistic by user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.processmgt.model.StatisticByUser getStatisticByUser(
		long statisticByUserId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getStatisticByUser(statisticByUserId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the statistic by users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.StatisticByUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of statistic by users
	* @param end the upper bound of the range of statistic by users (not inclusive)
	* @return the range of statistic by users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.processmgt.model.StatisticByUser> getStatisticByUsers(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getStatisticByUsers(start, end);
	}

	/**
	* Returns the number of statistic by users.
	*
	* @return the number of statistic by users
	* @throws SystemException if a system exception occurred
	*/
	public static int getStatisticByUsersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getStatisticByUsersCount();
	}

	/**
	* Updates the statistic by user in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param statisticByUser the statistic by user
	* @return the statistic by user that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.processmgt.model.StatisticByUser updateStatisticByUser(
		org.oep.processmgt.model.StatisticByUser statisticByUser)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateStatisticByUser(statisticByUser);
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
	* ThÃƒÂªm thÃƒÂ´ng tin thÃ¡Â»â€˜ng kÃƒÂª theo ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng xÃ¡Â»Â­ lÃƒÂ½ hÃ¡Â»â€œ sÃ†Â¡
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param month thÃƒÂ¡ng trong nÃ„Æ’m
	* @param year nÃ„Æ’m
	* @param totalNumber sÃ¡Â»â€˜ hÃ¡Â»â€œ sÃ†Â¡ xÃ¡Â»Â­ lÃƒÂ½
	* @param ontimeNumber sÃ¡Â»â€˜ Ã„â€˜ÃƒÂºng hÃ¡ÂºÂ¹n
	* @param ontimeRatio tÃ¡Â»â€° lÃ¡Â»â€¡ Ã„â€˜ÃƒÂºng hÃ¡ÂºÂ¹n
	* @param delayDaysAvg sÃ¡Â»â€˜ ngÃƒÂ y trÃ¡Â»â€¦ hÃ¡ÂºÂ¹n trung bÃƒÂ¬nh
	* @return: thÃƒÂ´ng tin thÃ¡Â»â€˜ng kÃƒÂª ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng xÃ¡Â»Â­ lÃƒÂ½ hÃ¡Â»â€œ sÃ†Â¡ mÃ¡Â»â€ºi
	*/
	public static org.oep.processmgt.model.StatisticByUser addStatisticByUser(
		int month, int year, int totalNumber, int ontimeNumber,
		double ontimeRatio, double delayDaysAvg,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addStatisticByUser(month, year, totalNumber, ontimeNumber,
			ontimeRatio, delayDaysAvg, serviceContext);
	}

	/**
	* CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin thÃ¡Â»â€˜ng kÃƒÂª theo ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng xÃ¡Â»Â­ lÃƒÂ½ hÃ¡Â»â€œ sÃ†Â¡
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param id mÃƒÂ£ thÃƒÂ´ng tin thÃ¡Â»â€˜ng kÃƒÂª ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng xÃ¡Â»Â­ lÃƒÂ½ hÃ¡Â»â€œ sÃ†Â¡
	* @param month thÃƒÂ¡ng trong nÃ„Æ’m
	* @param year nÃ„Æ’m
	* @param totalNumber sÃ¡Â»â€˜ hÃ¡Â»â€œ sÃ†Â¡ xÃ¡Â»Â­ lÃƒÂ½
	* @param ontimeNumber sÃ¡Â»â€˜ Ã„â€˜ÃƒÂºng hÃ¡ÂºÂ¹n
	* @param ontimeRatio tÃ¡Â»â€° lÃ¡Â»â€¡ Ã„â€˜ÃƒÂºng hÃ¡ÂºÂ¹n
	* @param delayDaysAvg sÃ¡Â»â€˜ ngÃƒÂ y trÃ¡Â»â€¦ hÃ¡ÂºÂ¹n trung bÃƒÂ¬nh
	* @return: cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin thÃ¡Â»â€˜ng kÃƒÂª ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng xÃ¡Â»Â­ lÃƒÂ½ hÃ¡Â»â€œ sÃ†Â¡ mÃ¡Â»â€ºi
	*/
	public static org.oep.processmgt.model.StatisticByUser updateStatisticByUser(
		long id, int month, int year, int totalNumber, int ontimeNumber,
		double ontimeRatio, double delayDaysAvg,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateStatisticByUser(id, month, year, totalNumber,
			ontimeNumber, ontimeRatio, delayDaysAvg, serviceContext);
	}

	public static void updateStatisticByUserResources(
		org.oep.processmgt.model.StatisticByUser statisticByUser,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.updateStatisticByUserResources(statisticByUser, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void removeStatisticByUser(
		org.oep.processmgt.model.StatisticByUser statisticByUser)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeStatisticByUser(statisticByUser);
	}

	public static void removeStatisticByUser(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeStatisticByUser(id);
	}

	public static void addStatisticByUserResources(
		org.oep.processmgt.model.StatisticByUser statisticByUser,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addStatisticByUserResources(statisticByUser, addGroupPermission,
			addGuestPermission, serviceContext);
	}

	public static void addStatisticByUserResources(
		org.oep.processmgt.model.StatisticByUser statisticByUser,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addStatisticByUserResources(statisticByUser, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void addStatisticByUserResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addStatisticByUserResources(id, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static StatisticByUserLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					StatisticByUserLocalService.class.getName());

			if (invokableLocalService instanceof StatisticByUserLocalService) {
				_service = (StatisticByUserLocalService)invokableLocalService;
			}
			else {
				_service = new StatisticByUserLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(StatisticByUserLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(StatisticByUserLocalService service) {
	}

	private static StatisticByUserLocalService _service;
}