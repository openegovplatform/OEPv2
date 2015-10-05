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

import com.liferay.portal.service.persistence.BasePersistence;

import org.oep.core.logging.model.UserActivity;

/**
 * The persistence interface for the user activity service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserActivityPersistenceImpl
 * @see UserActivityUtil
 * @generated
 */
public interface UserActivityPersistence extends BasePersistence<UserActivity> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UserActivityUtil} to access the user activity persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the user activities where action = &#63;.
	*
	* @param action the action
	* @return the matching user activities
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.logging.model.UserActivity> findByA(
		java.lang.String action)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.core.logging.model.UserActivity> findByA(
		java.lang.String action, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.core.logging.model.UserActivity> findByA(
		java.lang.String action, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first user activity in the ordered set where action = &#63;.
	*
	* @param action the action
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user activity
	* @throws org.oep.core.logging.NoSuchUserActivityException if a matching user activity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.logging.model.UserActivity findByA_First(
		java.lang.String action,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.logging.NoSuchUserActivityException;

	/**
	* Returns the first user activity in the ordered set where action = &#63;.
	*
	* @param action the action
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user activity, or <code>null</code> if a matching user activity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.logging.model.UserActivity fetchByA_First(
		java.lang.String action,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last user activity in the ordered set where action = &#63;.
	*
	* @param action the action
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user activity
	* @throws org.oep.core.logging.NoSuchUserActivityException if a matching user activity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.logging.model.UserActivity findByA_Last(
		java.lang.String action,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.logging.NoSuchUserActivityException;

	/**
	* Returns the last user activity in the ordered set where action = &#63;.
	*
	* @param action the action
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user activity, or <code>null</code> if a matching user activity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.logging.model.UserActivity fetchByA_Last(
		java.lang.String action,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.core.logging.model.UserActivity[] findByA_PrevAndNext(
		long id, java.lang.String action,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.logging.NoSuchUserActivityException;

	/**
	* Removes all the user activities where action = &#63; from the database.
	*
	* @param action the action
	* @throws SystemException if a system exception occurred
	*/
	public void removeByA(java.lang.String action)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user activities where action = &#63;.
	*
	* @param action the action
	* @return the number of matching user activities
	* @throws SystemException if a system exception occurred
	*/
	public int countByA(java.lang.String action)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the user activities where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching user activities
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.logging.model.UserActivity> findByU(
		long userId) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.core.logging.model.UserActivity> findByU(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.core.logging.model.UserActivity> findByU(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first user activity in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user activity
	* @throws org.oep.core.logging.NoSuchUserActivityException if a matching user activity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.logging.model.UserActivity findByU_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.logging.NoSuchUserActivityException;

	/**
	* Returns the first user activity in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user activity, or <code>null</code> if a matching user activity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.logging.model.UserActivity fetchByU_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last user activity in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user activity
	* @throws org.oep.core.logging.NoSuchUserActivityException if a matching user activity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.logging.model.UserActivity findByU_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.logging.NoSuchUserActivityException;

	/**
	* Returns the last user activity in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user activity, or <code>null</code> if a matching user activity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.logging.model.UserActivity fetchByU_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.core.logging.model.UserActivity[] findByU_PrevAndNext(
		long id, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.logging.NoSuchUserActivityException;

	/**
	* Removes all the user activities where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByU(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user activities where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching user activities
	* @throws SystemException if a system exception occurred
	*/
	public int countByU(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the user activities where action = &#63; and createDate = &#63;.
	*
	* @param action the action
	* @param createDate the create date
	* @return the matching user activities
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.logging.model.UserActivity> findByA_C(
		java.lang.String action, java.util.Date createDate)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.core.logging.model.UserActivity> findByA_C(
		java.lang.String action, java.util.Date createDate, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.core.logging.model.UserActivity> findByA_C(
		java.lang.String action, java.util.Date createDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.core.logging.model.UserActivity findByA_C_First(
		java.lang.String action, java.util.Date createDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.logging.NoSuchUserActivityException;

	/**
	* Returns the first user activity in the ordered set where action = &#63; and createDate = &#63;.
	*
	* @param action the action
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user activity, or <code>null</code> if a matching user activity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.logging.model.UserActivity fetchByA_C_First(
		java.lang.String action, java.util.Date createDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.core.logging.model.UserActivity findByA_C_Last(
		java.lang.String action, java.util.Date createDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.logging.NoSuchUserActivityException;

	/**
	* Returns the last user activity in the ordered set where action = &#63; and createDate = &#63;.
	*
	* @param action the action
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user activity, or <code>null</code> if a matching user activity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.logging.model.UserActivity fetchByA_C_Last(
		java.lang.String action, java.util.Date createDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.core.logging.model.UserActivity[] findByA_C_PrevAndNext(
		long id, java.lang.String action, java.util.Date createDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.logging.NoSuchUserActivityException;

	/**
	* Removes all the user activities where action = &#63; and createDate = &#63; from the database.
	*
	* @param action the action
	* @param createDate the create date
	* @throws SystemException if a system exception occurred
	*/
	public void removeByA_C(java.lang.String action, java.util.Date createDate)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user activities where action = &#63; and createDate = &#63;.
	*
	* @param action the action
	* @param createDate the create date
	* @return the number of matching user activities
	* @throws SystemException if a system exception occurred
	*/
	public int countByA_C(java.lang.String action, java.util.Date createDate)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the user activity in the entity cache if it is enabled.
	*
	* @param userActivity the user activity
	*/
	public void cacheResult(
		org.oep.core.logging.model.UserActivity userActivity);

	/**
	* Caches the user activities in the entity cache if it is enabled.
	*
	* @param userActivities the user activities
	*/
	public void cacheResult(
		java.util.List<org.oep.core.logging.model.UserActivity> userActivities);

	/**
	* Creates a new user activity with the primary key. Does not add the user activity to the database.
	*
	* @param id the primary key for the new user activity
	* @return the new user activity
	*/
	public org.oep.core.logging.model.UserActivity create(long id);

	/**
	* Removes the user activity with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the user activity
	* @return the user activity that was removed
	* @throws org.oep.core.logging.NoSuchUserActivityException if a user activity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.logging.model.UserActivity remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.logging.NoSuchUserActivityException;

	public org.oep.core.logging.model.UserActivity updateImpl(
		org.oep.core.logging.model.UserActivity userActivity)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user activity with the primary key or throws a {@link org.oep.core.logging.NoSuchUserActivityException} if it could not be found.
	*
	* @param id the primary key of the user activity
	* @return the user activity
	* @throws org.oep.core.logging.NoSuchUserActivityException if a user activity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.logging.model.UserActivity findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.logging.NoSuchUserActivityException;

	/**
	* Returns the user activity with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the user activity
	* @return the user activity, or <code>null</code> if a user activity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.logging.model.UserActivity fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the user activities.
	*
	* @return the user activities
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.logging.model.UserActivity> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.core.logging.model.UserActivity> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.core.logging.model.UserActivity> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the user activities from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user activities.
	*
	* @return the number of user activities
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}