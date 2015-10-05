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

import org.oep.core.logging.model.NewUserLog;

/**
 * The persistence interface for the new user log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NewUserLogPersistenceImpl
 * @see NewUserLogUtil
 * @generated
 */
public interface NewUserLogPersistence extends BasePersistence<NewUserLog> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NewUserLogUtil} to access the new user log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the new user log where userId = &#63; or throws a {@link org.oep.core.logging.NoSuchNewUserLogException} if it could not be found.
	*
	* @param userId the user ID
	* @return the matching new user log
	* @throws org.oep.core.logging.NoSuchNewUserLogException if a matching new user log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.logging.model.NewUserLog findByU(long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.logging.NoSuchNewUserLogException;

	/**
	* Returns the new user log where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user ID
	* @return the matching new user log, or <code>null</code> if a matching new user log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.logging.model.NewUserLog fetchByU(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the new user log where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching new user log, or <code>null</code> if a matching new user log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.logging.model.NewUserLog fetchByU(long userId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the new user log where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @return the new user log that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.logging.model.NewUserLog removeByU(long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.logging.NoSuchNewUserLogException;

	/**
	* Returns the number of new user logs where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching new user logs
	* @throws SystemException if a system exception occurred
	*/
	public int countByU(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the new user log where userActivityId = &#63; or throws a {@link org.oep.core.logging.NoSuchNewUserLogException} if it could not be found.
	*
	* @param userActivityId the user activity ID
	* @return the matching new user log
	* @throws org.oep.core.logging.NoSuchNewUserLogException if a matching new user log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.logging.model.NewUserLog findByUai(long userActivityId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.logging.NoSuchNewUserLogException;

	/**
	* Returns the new user log where userActivityId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userActivityId the user activity ID
	* @return the matching new user log, or <code>null</code> if a matching new user log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.logging.model.NewUserLog fetchByUai(long userActivityId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the new user log where userActivityId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userActivityId the user activity ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching new user log, or <code>null</code> if a matching new user log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.logging.model.NewUserLog fetchByUai(
		long userActivityId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the new user log where userActivityId = &#63; from the database.
	*
	* @param userActivityId the user activity ID
	* @return the new user log that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.logging.model.NewUserLog removeByUai(
		long userActivityId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.logging.NoSuchNewUserLogException;

	/**
	* Returns the number of new user logs where userActivityId = &#63;.
	*
	* @param userActivityId the user activity ID
	* @return the number of matching new user logs
	* @throws SystemException if a system exception occurred
	*/
	public int countByUai(long userActivityId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the new user logs where userName = &#63; and email = &#63; and createDate = &#63;.
	*
	* @param userName the user name
	* @param email the email
	* @param createDate the create date
	* @return the matching new user logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.logging.model.NewUserLog> findByU_E_C(
		java.lang.String userName, java.lang.String email,
		java.util.Date createDate)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the new user logs where userName = &#63; and email = &#63; and createDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.logging.model.impl.NewUserLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userName the user name
	* @param email the email
	* @param createDate the create date
	* @param start the lower bound of the range of new user logs
	* @param end the upper bound of the range of new user logs (not inclusive)
	* @return the range of matching new user logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.logging.model.NewUserLog> findByU_E_C(
		java.lang.String userName, java.lang.String email,
		java.util.Date createDate, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the new user logs where userName = &#63; and email = &#63; and createDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.logging.model.impl.NewUserLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userName the user name
	* @param email the email
	* @param createDate the create date
	* @param start the lower bound of the range of new user logs
	* @param end the upper bound of the range of new user logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching new user logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.logging.model.NewUserLog> findByU_E_C(
		java.lang.String userName, java.lang.String email,
		java.util.Date createDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first new user log in the ordered set where userName = &#63; and email = &#63; and createDate = &#63;.
	*
	* @param userName the user name
	* @param email the email
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching new user log
	* @throws org.oep.core.logging.NoSuchNewUserLogException if a matching new user log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.logging.model.NewUserLog findByU_E_C_First(
		java.lang.String userName, java.lang.String email,
		java.util.Date createDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.logging.NoSuchNewUserLogException;

	/**
	* Returns the first new user log in the ordered set where userName = &#63; and email = &#63; and createDate = &#63;.
	*
	* @param userName the user name
	* @param email the email
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching new user log, or <code>null</code> if a matching new user log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.logging.model.NewUserLog fetchByU_E_C_First(
		java.lang.String userName, java.lang.String email,
		java.util.Date createDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last new user log in the ordered set where userName = &#63; and email = &#63; and createDate = &#63;.
	*
	* @param userName the user name
	* @param email the email
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching new user log
	* @throws org.oep.core.logging.NoSuchNewUserLogException if a matching new user log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.logging.model.NewUserLog findByU_E_C_Last(
		java.lang.String userName, java.lang.String email,
		java.util.Date createDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.logging.NoSuchNewUserLogException;

	/**
	* Returns the last new user log in the ordered set where userName = &#63; and email = &#63; and createDate = &#63;.
	*
	* @param userName the user name
	* @param email the email
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching new user log, or <code>null</code> if a matching new user log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.logging.model.NewUserLog fetchByU_E_C_Last(
		java.lang.String userName, java.lang.String email,
		java.util.Date createDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the new user logs before and after the current new user log in the ordered set where userName = &#63; and email = &#63; and createDate = &#63;.
	*
	* @param id the primary key of the current new user log
	* @param userName the user name
	* @param email the email
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next new user log
	* @throws org.oep.core.logging.NoSuchNewUserLogException if a new user log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.logging.model.NewUserLog[] findByU_E_C_PrevAndNext(
		long id, java.lang.String userName, java.lang.String email,
		java.util.Date createDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.logging.NoSuchNewUserLogException;

	/**
	* Removes all the new user logs where userName = &#63; and email = &#63; and createDate = &#63; from the database.
	*
	* @param userName the user name
	* @param email the email
	* @param createDate the create date
	* @throws SystemException if a system exception occurred
	*/
	public void removeByU_E_C(java.lang.String userName,
		java.lang.String email, java.util.Date createDate)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of new user logs where userName = &#63; and email = &#63; and createDate = &#63;.
	*
	* @param userName the user name
	* @param email the email
	* @param createDate the create date
	* @return the number of matching new user logs
	* @throws SystemException if a system exception occurred
	*/
	public int countByU_E_C(java.lang.String userName, java.lang.String email,
		java.util.Date createDate)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the new user log in the entity cache if it is enabled.
	*
	* @param newUserLog the new user log
	*/
	public void cacheResult(org.oep.core.logging.model.NewUserLog newUserLog);

	/**
	* Caches the new user logs in the entity cache if it is enabled.
	*
	* @param newUserLogs the new user logs
	*/
	public void cacheResult(
		java.util.List<org.oep.core.logging.model.NewUserLog> newUserLogs);

	/**
	* Creates a new new user log with the primary key. Does not add the new user log to the database.
	*
	* @param id the primary key for the new new user log
	* @return the new new user log
	*/
	public org.oep.core.logging.model.NewUserLog create(long id);

	/**
	* Removes the new user log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the new user log
	* @return the new user log that was removed
	* @throws org.oep.core.logging.NoSuchNewUserLogException if a new user log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.logging.model.NewUserLog remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.logging.NoSuchNewUserLogException;

	public org.oep.core.logging.model.NewUserLog updateImpl(
		org.oep.core.logging.model.NewUserLog newUserLog)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the new user log with the primary key or throws a {@link org.oep.core.logging.NoSuchNewUserLogException} if it could not be found.
	*
	* @param id the primary key of the new user log
	* @return the new user log
	* @throws org.oep.core.logging.NoSuchNewUserLogException if a new user log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.logging.model.NewUserLog findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.logging.NoSuchNewUserLogException;

	/**
	* Returns the new user log with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the new user log
	* @return the new user log, or <code>null</code> if a new user log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.logging.model.NewUserLog fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the new user logs.
	*
	* @return the new user logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.logging.model.NewUserLog> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the new user logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.logging.model.impl.NewUserLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of new user logs
	* @param end the upper bound of the range of new user logs (not inclusive)
	* @return the range of new user logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.logging.model.NewUserLog> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the new user logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.logging.model.impl.NewUserLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of new user logs
	* @param end the upper bound of the range of new user logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of new user logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.logging.model.NewUserLog> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the new user logs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of new user logs.
	*
	* @return the number of new user logs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}