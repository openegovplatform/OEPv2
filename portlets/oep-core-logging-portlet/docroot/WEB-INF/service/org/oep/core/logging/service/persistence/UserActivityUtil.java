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

package org.oep.core.logging.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.oep.core.logging.model.UserActivity;

import java.util.List;

/**
 * The persistence utility for the user activity service. This utility wraps {@link UserActivityPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserActivityPersistence
 * @see UserActivityPersistenceImpl
 * @generated
 */
public class UserActivityUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(UserActivity userActivity) {
		getPersistence().clearCache(userActivity);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<UserActivity> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UserActivity> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UserActivity> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static UserActivity update(UserActivity userActivity)
		throws SystemException {
		return getPersistence().update(userActivity);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static UserActivity update(UserActivity userActivity,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(userActivity, serviceContext);
	}

	/**
	* Returns all the user activities where action = &#63;.
	*
	* @param action the action
	* @return the matching user activities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.logging.model.UserActivity> findByA(
		java.lang.String action)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByA(action);
	}

	/**
	* Returns a range of all the user activities where action = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.logging.model.impl.UserActivityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param action the action
	* @param start the lower bound of the range of user activities
	* @param end the upper bound of the range of user activities (not inclusive)
	* @return the range of matching user activities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.logging.model.UserActivity> findByA(
		java.lang.String action, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByA(action, start, end);
	}

	/**
	* Returns an ordered range of all the user activities where action = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.logging.model.impl.UserActivityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param action the action
	* @param start the lower bound of the range of user activities
	* @param end the upper bound of the range of user activities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user activities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.logging.model.UserActivity> findByA(
		java.lang.String action, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByA(action, start, end, orderByComparator);
	}

	/**
	* Returns the first user activity in the ordered set where action = &#63;.
	*
	* @param action the action
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user activity
	* @throws org.oep.core.logging.NoSuchUserActivityException if a matching user activity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.logging.model.UserActivity findByA_First(
		java.lang.String action,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.logging.NoSuchUserActivityException {
		return getPersistence().findByA_First(action, orderByComparator);
	}

	/**
	* Returns the first user activity in the ordered set where action = &#63;.
	*
	* @param action the action
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user activity, or <code>null</code> if a matching user activity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.logging.model.UserActivity fetchByA_First(
		java.lang.String action,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByA_First(action, orderByComparator);
	}

	/**
	* Returns the last user activity in the ordered set where action = &#63;.
	*
	* @param action the action
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user activity
	* @throws org.oep.core.logging.NoSuchUserActivityException if a matching user activity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.logging.model.UserActivity findByA_Last(
		java.lang.String action,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.logging.NoSuchUserActivityException {
		return getPersistence().findByA_Last(action, orderByComparator);
	}

	/**
	* Returns the last user activity in the ordered set where action = &#63;.
	*
	* @param action the action
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user activity, or <code>null</code> if a matching user activity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.logging.model.UserActivity fetchByA_Last(
		java.lang.String action,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByA_Last(action, orderByComparator);
	}

	/**
	* Returns the user activities before and after the current user activity in the ordered set where action = &#63;.
	*
	* @param id the primary key of the current user activity
	* @param action the action
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user activity
	* @throws org.oep.core.logging.NoSuchUserActivityException if a user activity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.logging.model.UserActivity[] findByA_PrevAndNext(
		long id, java.lang.String action,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.logging.NoSuchUserActivityException {
		return getPersistence()
				   .findByA_PrevAndNext(id, action, orderByComparator);
	}

	/**
	* Removes all the user activities where action = &#63; from the database.
	*
	* @param action the action
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByA(java.lang.String action)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByA(action);
	}

	/**
	* Returns the number of user activities where action = &#63;.
	*
	* @param action the action
	* @return the number of matching user activities
	* @throws SystemException if a system exception occurred
	*/
	public static int countByA(java.lang.String action)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByA(action);
	}

	/**
	* Returns all the user activities where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching user activities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.logging.model.UserActivity> findByU(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU(userId);
	}

	/**
	* Returns a range of all the user activities where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.logging.model.impl.UserActivityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of user activities
	* @param end the upper bound of the range of user activities (not inclusive)
	* @return the range of matching user activities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.logging.model.UserActivity> findByU(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU(userId, start, end);
	}

	/**
	* Returns an ordered range of all the user activities where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.logging.model.impl.UserActivityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of user activities
	* @param end the upper bound of the range of user activities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user activities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.logging.model.UserActivity> findByU(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU(userId, start, end, orderByComparator);
	}

	/**
	* Returns the first user activity in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user activity
	* @throws org.oep.core.logging.NoSuchUserActivityException if a matching user activity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.logging.model.UserActivity findByU_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.logging.NoSuchUserActivityException {
		return getPersistence().findByU_First(userId, orderByComparator);
	}

	/**
	* Returns the first user activity in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user activity, or <code>null</code> if a matching user activity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.logging.model.UserActivity fetchByU_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByU_First(userId, orderByComparator);
	}

	/**
	* Returns the last user activity in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user activity
	* @throws org.oep.core.logging.NoSuchUserActivityException if a matching user activity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.logging.model.UserActivity findByU_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.logging.NoSuchUserActivityException {
		return getPersistence().findByU_Last(userId, orderByComparator);
	}

	/**
	* Returns the last user activity in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user activity, or <code>null</code> if a matching user activity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.logging.model.UserActivity fetchByU_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByU_Last(userId, orderByComparator);
	}

	/**
	* Returns the user activities before and after the current user activity in the ordered set where userId = &#63;.
	*
	* @param id the primary key of the current user activity
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user activity
	* @throws org.oep.core.logging.NoSuchUserActivityException if a user activity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.logging.model.UserActivity[] findByU_PrevAndNext(
		long id, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.logging.NoSuchUserActivityException {
		return getPersistence()
				   .findByU_PrevAndNext(id, userId, orderByComparator);
	}

	/**
	* Removes all the user activities where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByU(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByU(userId);
	}

	/**
	* Returns the number of user activities where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching user activities
	* @throws SystemException if a system exception occurred
	*/
	public static int countByU(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByU(userId);
	}

	/**
	* Returns all the user activities where action = &#63; and createDate = &#63;.
	*
	* @param action the action
	* @param createDate the create date
	* @return the matching user activities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.logging.model.UserActivity> findByA_C(
		java.lang.String action, java.util.Date createDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByA_C(action, createDate);
	}

	/**
	* Returns a range of all the user activities where action = &#63; and createDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.logging.model.impl.UserActivityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param action the action
	* @param createDate the create date
	* @param start the lower bound of the range of user activities
	* @param end the upper bound of the range of user activities (not inclusive)
	* @return the range of matching user activities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.logging.model.UserActivity> findByA_C(
		java.lang.String action, java.util.Date createDate, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByA_C(action, createDate, start, end);
	}

	/**
	* Returns an ordered range of all the user activities where action = &#63; and createDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.logging.model.impl.UserActivityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param action the action
	* @param createDate the create date
	* @param start the lower bound of the range of user activities
	* @param end the upper bound of the range of user activities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user activities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.logging.model.UserActivity> findByA_C(
		java.lang.String action, java.util.Date createDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByA_C(action, createDate, start, end, orderByComparator);
	}

	/**
	* Returns the first user activity in the ordered set where action = &#63; and createDate = &#63;.
	*
	* @param action the action
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user activity
	* @throws org.oep.core.logging.NoSuchUserActivityException if a matching user activity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.logging.model.UserActivity findByA_C_First(
		java.lang.String action, java.util.Date createDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.logging.NoSuchUserActivityException {
		return getPersistence()
				   .findByA_C_First(action, createDate, orderByComparator);
	}

	/**
	* Returns the first user activity in the ordered set where action = &#63; and createDate = &#63;.
	*
	* @param action the action
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user activity, or <code>null</code> if a matching user activity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.logging.model.UserActivity fetchByA_C_First(
		java.lang.String action, java.util.Date createDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByA_C_First(action, createDate, orderByComparator);
	}

	/**
	* Returns the last user activity in the ordered set where action = &#63; and createDate = &#63;.
	*
	* @param action the action
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user activity
	* @throws org.oep.core.logging.NoSuchUserActivityException if a matching user activity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.logging.model.UserActivity findByA_C_Last(
		java.lang.String action, java.util.Date createDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.logging.NoSuchUserActivityException {
		return getPersistence()
				   .findByA_C_Last(action, createDate, orderByComparator);
	}

	/**
	* Returns the last user activity in the ordered set where action = &#63; and createDate = &#63;.
	*
	* @param action the action
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user activity, or <code>null</code> if a matching user activity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.logging.model.UserActivity fetchByA_C_Last(
		java.lang.String action, java.util.Date createDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByA_C_Last(action, createDate, orderByComparator);
	}

	/**
	* Returns the user activities before and after the current user activity in the ordered set where action = &#63; and createDate = &#63;.
	*
	* @param id the primary key of the current user activity
	* @param action the action
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user activity
	* @throws org.oep.core.logging.NoSuchUserActivityException if a user activity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.logging.model.UserActivity[] findByA_C_PrevAndNext(
		long id, java.lang.String action, java.util.Date createDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.logging.NoSuchUserActivityException {
		return getPersistence()
				   .findByA_C_PrevAndNext(id, action, createDate,
			orderByComparator);
	}

	/**
	* Removes all the user activities where action = &#63; and createDate = &#63; from the database.
	*
	* @param action the action
	* @param createDate the create date
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByA_C(java.lang.String action,
		java.util.Date createDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByA_C(action, createDate);
	}

	/**
	* Returns the number of user activities where action = &#63; and createDate = &#63;.
	*
	* @param action the action
	* @param createDate the create date
	* @return the number of matching user activities
	* @throws SystemException if a system exception occurred
	*/
	public static int countByA_C(java.lang.String action,
		java.util.Date createDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByA_C(action, createDate);
	}

	/**
	* Caches the user activity in the entity cache if it is enabled.
	*
	* @param userActivity the user activity
	*/
	public static void cacheResult(
		org.oep.core.logging.model.UserActivity userActivity) {
		getPersistence().cacheResult(userActivity);
	}

	/**
	* Caches the user activities in the entity cache if it is enabled.
	*
	* @param userActivities the user activities
	*/
	public static void cacheResult(
		java.util.List<org.oep.core.logging.model.UserActivity> userActivities) {
		getPersistence().cacheResult(userActivities);
	}

	/**
	* Creates a new user activity with the primary key. Does not add the user activity to the database.
	*
	* @param id the primary key for the new user activity
	* @return the new user activity
	*/
	public static org.oep.core.logging.model.UserActivity create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the user activity with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the user activity
	* @return the user activity that was removed
	* @throws org.oep.core.logging.NoSuchUserActivityException if a user activity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.logging.model.UserActivity remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.logging.NoSuchUserActivityException {
		return getPersistence().remove(id);
	}

	public static org.oep.core.logging.model.UserActivity updateImpl(
		org.oep.core.logging.model.UserActivity userActivity)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(userActivity);
	}

	/**
	* Returns the user activity with the primary key or throws a {@link org.oep.core.logging.NoSuchUserActivityException} if it could not be found.
	*
	* @param id the primary key of the user activity
	* @return the user activity
	* @throws org.oep.core.logging.NoSuchUserActivityException if a user activity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.logging.model.UserActivity findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.logging.NoSuchUserActivityException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the user activity with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the user activity
	* @return the user activity, or <code>null</code> if a user activity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.logging.model.UserActivity fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the user activities.
	*
	* @return the user activities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.logging.model.UserActivity> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<org.oep.core.logging.model.UserActivity> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the user activities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.logging.model.impl.UserActivityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user activities
	* @param end the upper bound of the range of user activities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of user activities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.logging.model.UserActivity> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the user activities from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of user activities.
	*
	* @return the number of user activities
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static UserActivityPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (UserActivityPersistence)PortletBeanLocatorUtil.locate(org.oep.core.logging.service.ClpSerializer.getServletContextName(),
					UserActivityPersistence.class.getName());

			ReferenceRegistry.registerReference(UserActivityUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(UserActivityPersistence persistence) {
	}

	private static UserActivityPersistence _persistence;
}