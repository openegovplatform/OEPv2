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

package org.oep.processmgt.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import org.oep.processmgt.model.ProcessOrder2User;

/**
 * The persistence interface for the process order2 user service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see ProcessOrder2UserPersistenceImpl
 * @see ProcessOrder2UserUtil
 * @generated
 */
public interface ProcessOrder2UserPersistence extends BasePersistence<ProcessOrder2User> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProcessOrder2UserUtil} to access the process order2 user persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the process order2 users where processOrderId = &#63;.
	*
	* @param processOrderId the process order ID
	* @return the matching process order2 users
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.processmgt.model.ProcessOrder2User> findByP(
		long processOrderId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the process order2 users where processOrderId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.ProcessOrder2UserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param processOrderId the process order ID
	* @param start the lower bound of the range of process order2 users
	* @param end the upper bound of the range of process order2 users (not inclusive)
	* @return the range of matching process order2 users
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.processmgt.model.ProcessOrder2User> findByP(
		long processOrderId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the process order2 users where processOrderId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.ProcessOrder2UserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param processOrderId the process order ID
	* @param start the lower bound of the range of process order2 users
	* @param end the upper bound of the range of process order2 users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching process order2 users
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.processmgt.model.ProcessOrder2User> findByP(
		long processOrderId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first process order2 user in the ordered set where processOrderId = &#63;.
	*
	* @param processOrderId the process order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching process order2 user
	* @throws org.oep.processmgt.NoSuchProcessOrder2UserException if a matching process order2 user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.ProcessOrder2User findByP_First(
		long processOrderId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.processmgt.NoSuchProcessOrder2UserException;

	/**
	* Returns the first process order2 user in the ordered set where processOrderId = &#63;.
	*
	* @param processOrderId the process order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching process order2 user, or <code>null</code> if a matching process order2 user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.ProcessOrder2User fetchByP_First(
		long processOrderId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last process order2 user in the ordered set where processOrderId = &#63;.
	*
	* @param processOrderId the process order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching process order2 user
	* @throws org.oep.processmgt.NoSuchProcessOrder2UserException if a matching process order2 user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.ProcessOrder2User findByP_Last(
		long processOrderId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.processmgt.NoSuchProcessOrder2UserException;

	/**
	* Returns the last process order2 user in the ordered set where processOrderId = &#63;.
	*
	* @param processOrderId the process order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching process order2 user, or <code>null</code> if a matching process order2 user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.ProcessOrder2User fetchByP_Last(
		long processOrderId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the process order2 users before and after the current process order2 user in the ordered set where processOrderId = &#63;.
	*
	* @param processOrder2UserPK the primary key of the current process order2 user
	* @param processOrderId the process order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next process order2 user
	* @throws org.oep.processmgt.NoSuchProcessOrder2UserException if a process order2 user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.ProcessOrder2User[] findByP_PrevAndNext(
		org.oep.processmgt.service.persistence.ProcessOrder2UserPK processOrder2UserPK,
		long processOrderId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.processmgt.NoSuchProcessOrder2UserException;

	/**
	* Removes all the process order2 users where processOrderId = &#63; from the database.
	*
	* @param processOrderId the process order ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByP(long processOrderId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of process order2 users where processOrderId = &#63;.
	*
	* @param processOrderId the process order ID
	* @return the number of matching process order2 users
	* @throws SystemException if a system exception occurred
	*/
	public int countByP(long processOrderId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the process order2 users where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching process order2 users
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.processmgt.model.ProcessOrder2User> findByU(
		long userId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the process order2 users where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.ProcessOrder2UserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of process order2 users
	* @param end the upper bound of the range of process order2 users (not inclusive)
	* @return the range of matching process order2 users
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.processmgt.model.ProcessOrder2User> findByU(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the process order2 users where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.ProcessOrder2UserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of process order2 users
	* @param end the upper bound of the range of process order2 users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching process order2 users
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.processmgt.model.ProcessOrder2User> findByU(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first process order2 user in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching process order2 user
	* @throws org.oep.processmgt.NoSuchProcessOrder2UserException if a matching process order2 user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.ProcessOrder2User findByU_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.processmgt.NoSuchProcessOrder2UserException;

	/**
	* Returns the first process order2 user in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching process order2 user, or <code>null</code> if a matching process order2 user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.ProcessOrder2User fetchByU_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last process order2 user in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching process order2 user
	* @throws org.oep.processmgt.NoSuchProcessOrder2UserException if a matching process order2 user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.ProcessOrder2User findByU_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.processmgt.NoSuchProcessOrder2UserException;

	/**
	* Returns the last process order2 user in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching process order2 user, or <code>null</code> if a matching process order2 user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.ProcessOrder2User fetchByU_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the process order2 users before and after the current process order2 user in the ordered set where userId = &#63;.
	*
	* @param processOrder2UserPK the primary key of the current process order2 user
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next process order2 user
	* @throws org.oep.processmgt.NoSuchProcessOrder2UserException if a process order2 user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.ProcessOrder2User[] findByU_PrevAndNext(
		org.oep.processmgt.service.persistence.ProcessOrder2UserPK processOrder2UserPK,
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.processmgt.NoSuchProcessOrder2UserException;

	/**
	* Removes all the process order2 users where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByU(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of process order2 users where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching process order2 users
	* @throws SystemException if a system exception occurred
	*/
	public int countByU(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the process order2 user in the entity cache if it is enabled.
	*
	* @param processOrder2User the process order2 user
	*/
	public void cacheResult(
		org.oep.processmgt.model.ProcessOrder2User processOrder2User);

	/**
	* Caches the process order2 users in the entity cache if it is enabled.
	*
	* @param processOrder2Users the process order2 users
	*/
	public void cacheResult(
		java.util.List<org.oep.processmgt.model.ProcessOrder2User> processOrder2Users);

	/**
	* Creates a new process order2 user with the primary key. Does not add the process order2 user to the database.
	*
	* @param processOrder2UserPK the primary key for the new process order2 user
	* @return the new process order2 user
	*/
	public org.oep.processmgt.model.ProcessOrder2User create(
		org.oep.processmgt.service.persistence.ProcessOrder2UserPK processOrder2UserPK);

	/**
	* Removes the process order2 user with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param processOrder2UserPK the primary key of the process order2 user
	* @return the process order2 user that was removed
	* @throws org.oep.processmgt.NoSuchProcessOrder2UserException if a process order2 user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.ProcessOrder2User remove(
		org.oep.processmgt.service.persistence.ProcessOrder2UserPK processOrder2UserPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.processmgt.NoSuchProcessOrder2UserException;

	public org.oep.processmgt.model.ProcessOrder2User updateImpl(
		org.oep.processmgt.model.ProcessOrder2User processOrder2User)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the process order2 user with the primary key or throws a {@link org.oep.processmgt.NoSuchProcessOrder2UserException} if it could not be found.
	*
	* @param processOrder2UserPK the primary key of the process order2 user
	* @return the process order2 user
	* @throws org.oep.processmgt.NoSuchProcessOrder2UserException if a process order2 user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.ProcessOrder2User findByPrimaryKey(
		org.oep.processmgt.service.persistence.ProcessOrder2UserPK processOrder2UserPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.processmgt.NoSuchProcessOrder2UserException;

	/**
	* Returns the process order2 user with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param processOrder2UserPK the primary key of the process order2 user
	* @return the process order2 user, or <code>null</code> if a process order2 user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.ProcessOrder2User fetchByPrimaryKey(
		org.oep.processmgt.service.persistence.ProcessOrder2UserPK processOrder2UserPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the process order2 users.
	*
	* @return the process order2 users
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.processmgt.model.ProcessOrder2User> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the process order2 users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.ProcessOrder2UserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of process order2 users
	* @param end the upper bound of the range of process order2 users (not inclusive)
	* @return the range of process order2 users
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.processmgt.model.ProcessOrder2User> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the process order2 users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.ProcessOrder2UserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of process order2 users
	* @param end the upper bound of the range of process order2 users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of process order2 users
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.processmgt.model.ProcessOrder2User> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the process order2 users from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of process order2 users.
	*
	* @return the number of process order2 users
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}