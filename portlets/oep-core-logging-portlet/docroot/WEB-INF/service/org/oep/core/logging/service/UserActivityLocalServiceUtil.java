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

package org.oep.core.logging.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for UserActivity. This utility wraps
 * {@link org.oep.core.logging.service.impl.UserActivityLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see UserActivityLocalService
 * @see org.oep.core.logging.service.base.UserActivityLocalServiceBaseImpl
 * @see org.oep.core.logging.service.impl.UserActivityLocalServiceImpl
 * @generated
 */
public class UserActivityLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.core.logging.service.impl.UserActivityLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the user activity to the database. Also notifies the appropriate model listeners.
	*
	* @param userActivity the user activity
	* @return the user activity that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.logging.model.UserActivity addUserActivity(
		org.oep.core.logging.model.UserActivity userActivity)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addUserActivity(userActivity);
	}

	/**
	* Creates a new user activity with the primary key. Does not add the user activity to the database.
	*
	* @param id the primary key for the new user activity
	* @return the new user activity
	*/
	public static org.oep.core.logging.model.UserActivity createUserActivity(
		long id) {
		return getService().createUserActivity(id);
	}

	/**
	* Deletes the user activity with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the user activity
	* @return the user activity that was removed
	* @throws PortalException if a user activity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.logging.model.UserActivity deleteUserActivity(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteUserActivity(id);
	}

	/**
	* Deletes the user activity from the database. Also notifies the appropriate model listeners.
	*
	* @param userActivity the user activity
	* @return the user activity that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.logging.model.UserActivity deleteUserActivity(
		org.oep.core.logging.model.UserActivity userActivity)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteUserActivity(userActivity);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.logging.model.impl.UserActivityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.logging.model.impl.UserActivityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.oep.core.logging.model.UserActivity fetchUserActivity(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchUserActivity(id);
	}

	/**
	* Returns the user activity with the primary key.
	*
	* @param id the primary key of the user activity
	* @return the user activity
	* @throws PortalException if a user activity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.logging.model.UserActivity getUserActivity(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserActivity(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the user activities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.logging.model.impl.UserActivityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user activities
	* @param end the upper bound of the range of user activities (not inclusive)
	* @return the range of user activities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.logging.model.UserActivity> getUserActivities(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserActivities(start, end);
	}

	/**
	* Returns the number of user activities.
	*
	* @return the number of user activities
	* @throws SystemException if a system exception occurred
	*/
	public static int getUserActivitiesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserActivitiesCount();
	}

	/**
	* Updates the user activity in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param userActivity the user activity
	* @return the user activity that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.logging.model.UserActivity updateUserActivity(
		org.oep.core.logging.model.UserActivity userActivity)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateUserActivity(userActivity);
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
	* This function use message bus for add user's activity
	*
	* Version: OEP 1.1
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  20-April-2015  ThongDV    Create new
	*
	* @param action
	* @param description
	* @param serviceContext
	* @throws SystemException
	*/
	public static void log(java.lang.String action,
		java.lang.String description,
		com.liferay.portal.service.ServiceContext serviceContext) {
		getService().log(action, description, serviceContext);
	}

	/**
	* This function add User's log to database
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  20-September-2015  ThongDV    Create new
	*
	* @param userId
	* @param groupId
	* @param companyId
	* @param createDate
	* @param username
	* @param email
	* @param siter
	* @param page
	* @param action
	* @param description
	* @param url
	* @param sessionId
	* @param ip
	* @param userAgent
	* @throws PortalException
	* @throws SystemException
	* @return UserActivity
	*/
	public static org.oep.core.logging.model.UserActivity addUserActivity(
		long userId, long groupId, long companyId, java.util.Date createDate,
		java.lang.String userName, java.lang.String email,
		java.lang.String site, java.lang.String page, java.lang.String action,
		java.lang.String description, java.lang.String url,
		java.lang.String sessionId, java.lang.String ip,
		java.lang.String userAgent)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addUserActivity(userId, groupId, companyId, createDate,
			userName, email, site, page, action, description, url, sessionId,
			ip, userAgent);
	}

	/**
	* This function get list UserActivity by list parameter
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  20-September-2015  ThongDV    Create new
	*
	* @param action
	* @param fromDate
	* @param toDate
	* @param begin
	* @param end
	* @throws PortalException, SystemException
	* @return: List<UserActivity>
	*/
	public static java.util.List<org.oep.core.logging.model.UserActivity> getByParam(
		java.lang.String action, java.util.Date fromDate,
		java.util.Date toDate,
		com.liferay.portal.service.ServiceContext serviceContext, int begin,
		int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getByParam(action, fromDate, toDate, serviceContext, begin,
			end);
	}

	/**
	* This function count UserActivity by list parameter
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  20-September-2015  ThongDV    Create new
	*
	* @param: action
	* @param: fromDate
	* @param toDate
	* @throws SystemException, PortalException
	* @return Integer
	*/
	public static int countByParam(java.lang.String action,
		java.util.Date fromDate, java.util.Date toDate,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countByParam(action, fromDate, toDate, serviceContext);
	}

	/**
	* This function get list action inside UserActivity table
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  20-September-2015  ThongDV    Create new
	*
	* @param: action
	* @param: fromDate
	* @param toDate
	* @throws SystemException, PortalException
	* @return Integer
	*/
	public static java.util.List<java.lang.String> getDistinctAction(
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDistinctAction(serviceContext);
	}

	/**
	* This function count log by userId
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  20-September-2015  ThongDV    Create new
	*
	* @param: action
	* @param: fromDate
	* @param toDate
	* @throws SystemException, PortalException
	* @return Integer
	*/
	public static int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByUserId(userId);
	}

	/**
	* This function get list log by userId
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  20-September-2015  ThongDV    Create new
	*
	* @param: action
	* @param: fromDate
	* @param toDate
	* @throws SystemException, PortalException
	* @return Integer
	*/
	public static java.util.List<org.oep.core.logging.model.UserActivity> getByUserId(
		long userId, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getByUserId(userId, begin, end);
	}

	public static void clearService() {
		_service = null;
	}

	public static UserActivityLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					UserActivityLocalService.class.getName());

			if (invokableLocalService instanceof UserActivityLocalService) {
				_service = (UserActivityLocalService)invokableLocalService;
			}
			else {
				_service = new UserActivityLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(UserActivityLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(UserActivityLocalService service) {
	}

	private static UserActivityLocalService _service;
}