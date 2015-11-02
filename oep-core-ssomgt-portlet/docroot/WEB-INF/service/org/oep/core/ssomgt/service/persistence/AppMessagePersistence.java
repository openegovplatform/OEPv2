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

package org.oep.core.ssomgt.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import org.oep.core.ssomgt.model.AppMessage;

/**
 * The persistence interface for the app message service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see AppMessagePersistenceImpl
 * @see AppMessageUtil
 * @generated
 */
public interface AppMessagePersistence extends BasePersistence<AppMessage> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AppMessageUtil} to access the app message persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the app messages where toUser = &#63;.
	*
	* @param toUser the to user
	* @return the matching app messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.ssomgt.model.AppMessage> findByTU(
		java.lang.String toUser)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the app messages where toUser = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param toUser the to user
	* @param start the lower bound of the range of app messages
	* @param end the upper bound of the range of app messages (not inclusive)
	* @return the range of matching app messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.ssomgt.model.AppMessage> findByTU(
		java.lang.String toUser, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the app messages where toUser = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param toUser the to user
	* @param start the lower bound of the range of app messages
	* @param end the upper bound of the range of app messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching app messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.ssomgt.model.AppMessage> findByTU(
		java.lang.String toUser, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first app message in the ordered set where toUser = &#63;.
	*
	* @param toUser the to user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app message
	* @throws org.oep.core.ssomgt.NoSuchAppMessageException if a matching app message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.ssomgt.model.AppMessage findByTU_First(
		java.lang.String toUser,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppMessageException;

	/**
	* Returns the first app message in the ordered set where toUser = &#63;.
	*
	* @param toUser the to user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app message, or <code>null</code> if a matching app message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.ssomgt.model.AppMessage fetchByTU_First(
		java.lang.String toUser,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last app message in the ordered set where toUser = &#63;.
	*
	* @param toUser the to user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app message
	* @throws org.oep.core.ssomgt.NoSuchAppMessageException if a matching app message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.ssomgt.model.AppMessage findByTU_Last(
		java.lang.String toUser,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppMessageException;

	/**
	* Returns the last app message in the ordered set where toUser = &#63;.
	*
	* @param toUser the to user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app message, or <code>null</code> if a matching app message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.ssomgt.model.AppMessage fetchByTU_Last(
		java.lang.String toUser,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the app messages before and after the current app message in the ordered set where toUser = &#63;.
	*
	* @param appMessageId the primary key of the current app message
	* @param toUser the to user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next app message
	* @throws org.oep.core.ssomgt.NoSuchAppMessageException if a app message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.ssomgt.model.AppMessage[] findByTU_PrevAndNext(
		long appMessageId, java.lang.String toUser,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppMessageException;

	/**
	* Removes all the app messages where toUser = &#63; from the database.
	*
	* @param toUser the to user
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTU(java.lang.String toUser)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of app messages where toUser = &#63;.
	*
	* @param toUser the to user
	* @return the number of matching app messages
	* @throws SystemException if a system exception occurred
	*/
	public int countByTU(java.lang.String toUser)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the app messages where fromApplication = &#63; and toUser = &#63;.
	*
	* @param fromApplication the from application
	* @param toUser the to user
	* @return the matching app messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.ssomgt.model.AppMessage> findByFA_TU(
		java.lang.String fromApplication, java.lang.String toUser)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the app messages where fromApplication = &#63; and toUser = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fromApplication the from application
	* @param toUser the to user
	* @param start the lower bound of the range of app messages
	* @param end the upper bound of the range of app messages (not inclusive)
	* @return the range of matching app messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.ssomgt.model.AppMessage> findByFA_TU(
		java.lang.String fromApplication, java.lang.String toUser, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the app messages where fromApplication = &#63; and toUser = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fromApplication the from application
	* @param toUser the to user
	* @param start the lower bound of the range of app messages
	* @param end the upper bound of the range of app messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching app messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.ssomgt.model.AppMessage> findByFA_TU(
		java.lang.String fromApplication, java.lang.String toUser, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first app message in the ordered set where fromApplication = &#63; and toUser = &#63;.
	*
	* @param fromApplication the from application
	* @param toUser the to user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app message
	* @throws org.oep.core.ssomgt.NoSuchAppMessageException if a matching app message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.ssomgt.model.AppMessage findByFA_TU_First(
		java.lang.String fromApplication, java.lang.String toUser,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppMessageException;

	/**
	* Returns the first app message in the ordered set where fromApplication = &#63; and toUser = &#63;.
	*
	* @param fromApplication the from application
	* @param toUser the to user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app message, or <code>null</code> if a matching app message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.ssomgt.model.AppMessage fetchByFA_TU_First(
		java.lang.String fromApplication, java.lang.String toUser,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last app message in the ordered set where fromApplication = &#63; and toUser = &#63;.
	*
	* @param fromApplication the from application
	* @param toUser the to user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app message
	* @throws org.oep.core.ssomgt.NoSuchAppMessageException if a matching app message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.ssomgt.model.AppMessage findByFA_TU_Last(
		java.lang.String fromApplication, java.lang.String toUser,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppMessageException;

	/**
	* Returns the last app message in the ordered set where fromApplication = &#63; and toUser = &#63;.
	*
	* @param fromApplication the from application
	* @param toUser the to user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app message, or <code>null</code> if a matching app message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.ssomgt.model.AppMessage fetchByFA_TU_Last(
		java.lang.String fromApplication, java.lang.String toUser,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the app messages before and after the current app message in the ordered set where fromApplication = &#63; and toUser = &#63;.
	*
	* @param appMessageId the primary key of the current app message
	* @param fromApplication the from application
	* @param toUser the to user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next app message
	* @throws org.oep.core.ssomgt.NoSuchAppMessageException if a app message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.ssomgt.model.AppMessage[] findByFA_TU_PrevAndNext(
		long appMessageId, java.lang.String fromApplication,
		java.lang.String toUser,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppMessageException;

	/**
	* Removes all the app messages where fromApplication = &#63; and toUser = &#63; from the database.
	*
	* @param fromApplication the from application
	* @param toUser the to user
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFA_TU(java.lang.String fromApplication,
		java.lang.String toUser)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of app messages where fromApplication = &#63; and toUser = &#63;.
	*
	* @param fromApplication the from application
	* @param toUser the to user
	* @return the number of matching app messages
	* @throws SystemException if a system exception occurred
	*/
	public int countByFA_TU(java.lang.String fromApplication,
		java.lang.String toUser)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the app message in the entity cache if it is enabled.
	*
	* @param appMessage the app message
	*/
	public void cacheResult(org.oep.core.ssomgt.model.AppMessage appMessage);

	/**
	* Caches the app messages in the entity cache if it is enabled.
	*
	* @param appMessages the app messages
	*/
	public void cacheResult(
		java.util.List<org.oep.core.ssomgt.model.AppMessage> appMessages);

	/**
	* Creates a new app message with the primary key. Does not add the app message to the database.
	*
	* @param appMessageId the primary key for the new app message
	* @return the new app message
	*/
	public org.oep.core.ssomgt.model.AppMessage create(long appMessageId);

	/**
	* Removes the app message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param appMessageId the primary key of the app message
	* @return the app message that was removed
	* @throws org.oep.core.ssomgt.NoSuchAppMessageException if a app message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.ssomgt.model.AppMessage remove(long appMessageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppMessageException;

	public org.oep.core.ssomgt.model.AppMessage updateImpl(
		org.oep.core.ssomgt.model.AppMessage appMessage)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the app message with the primary key or throws a {@link org.oep.core.ssomgt.NoSuchAppMessageException} if it could not be found.
	*
	* @param appMessageId the primary key of the app message
	* @return the app message
	* @throws org.oep.core.ssomgt.NoSuchAppMessageException if a app message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.ssomgt.model.AppMessage findByPrimaryKey(
		long appMessageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppMessageException;

	/**
	* Returns the app message with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param appMessageId the primary key of the app message
	* @return the app message, or <code>null</code> if a app message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.ssomgt.model.AppMessage fetchByPrimaryKey(
		long appMessageId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the app messages.
	*
	* @return the app messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.ssomgt.model.AppMessage> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the app messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of app messages
	* @param end the upper bound of the range of app messages (not inclusive)
	* @return the range of app messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.ssomgt.model.AppMessage> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the app messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of app messages
	* @param end the upper bound of the range of app messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of app messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.ssomgt.model.AppMessage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the app messages from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of app messages.
	*
	* @return the number of app messages
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}