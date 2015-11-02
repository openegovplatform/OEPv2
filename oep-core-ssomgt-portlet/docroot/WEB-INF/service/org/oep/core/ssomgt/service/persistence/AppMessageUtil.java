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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.oep.core.ssomgt.model.AppMessage;

import java.util.List;

/**
 * The persistence utility for the app message service. This utility wraps {@link AppMessagePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see AppMessagePersistence
 * @see AppMessagePersistenceImpl
 * @generated
 */
public class AppMessageUtil {
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
	public static void clearCache(AppMessage appMessage) {
		getPersistence().clearCache(appMessage);
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
	public static List<AppMessage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AppMessage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AppMessage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static AppMessage update(AppMessage appMessage)
		throws SystemException {
		return getPersistence().update(appMessage);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static AppMessage update(AppMessage appMessage,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(appMessage, serviceContext);
	}

	/**
	* Returns all the app messages where toUser = &#63;.
	*
	* @param toUser the to user
	* @return the matching app messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.ssomgt.model.AppMessage> findByTU(
		java.lang.String toUser)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTU(toUser);
	}

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
	public static java.util.List<org.oep.core.ssomgt.model.AppMessage> findByTU(
		java.lang.String toUser, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTU(toUser, start, end);
	}

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
	public static java.util.List<org.oep.core.ssomgt.model.AppMessage> findByTU(
		java.lang.String toUser, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTU(toUser, start, end, orderByComparator);
	}

	/**
	* Returns the first app message in the ordered set where toUser = &#63;.
	*
	* @param toUser the to user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app message
	* @throws org.oep.core.ssomgt.NoSuchAppMessageException if a matching app message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.AppMessage findByTU_First(
		java.lang.String toUser,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppMessageException {
		return getPersistence().findByTU_First(toUser, orderByComparator);
	}

	/**
	* Returns the first app message in the ordered set where toUser = &#63;.
	*
	* @param toUser the to user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app message, or <code>null</code> if a matching app message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.AppMessage fetchByTU_First(
		java.lang.String toUser,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByTU_First(toUser, orderByComparator);
	}

	/**
	* Returns the last app message in the ordered set where toUser = &#63;.
	*
	* @param toUser the to user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app message
	* @throws org.oep.core.ssomgt.NoSuchAppMessageException if a matching app message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.AppMessage findByTU_Last(
		java.lang.String toUser,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppMessageException {
		return getPersistence().findByTU_Last(toUser, orderByComparator);
	}

	/**
	* Returns the last app message in the ordered set where toUser = &#63;.
	*
	* @param toUser the to user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app message, or <code>null</code> if a matching app message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.AppMessage fetchByTU_Last(
		java.lang.String toUser,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByTU_Last(toUser, orderByComparator);
	}

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
	public static org.oep.core.ssomgt.model.AppMessage[] findByTU_PrevAndNext(
		long appMessageId, java.lang.String toUser,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppMessageException {
		return getPersistence()
				   .findByTU_PrevAndNext(appMessageId, toUser, orderByComparator);
	}

	/**
	* Removes all the app messages where toUser = &#63; from the database.
	*
	* @param toUser the to user
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTU(java.lang.String toUser)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByTU(toUser);
	}

	/**
	* Returns the number of app messages where toUser = &#63;.
	*
	* @param toUser the to user
	* @return the number of matching app messages
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTU(java.lang.String toUser)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTU(toUser);
	}

	/**
	* Returns all the app messages where fromApplication = &#63; and toUser = &#63;.
	*
	* @param fromApplication the from application
	* @param toUser the to user
	* @return the matching app messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.ssomgt.model.AppMessage> findByFA_TU(
		java.lang.String fromApplication, java.lang.String toUser)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByFA_TU(fromApplication, toUser);
	}

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
	public static java.util.List<org.oep.core.ssomgt.model.AppMessage> findByFA_TU(
		java.lang.String fromApplication, java.lang.String toUser, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByFA_TU(fromApplication, toUser, start, end);
	}

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
	public static java.util.List<org.oep.core.ssomgt.model.AppMessage> findByFA_TU(
		java.lang.String fromApplication, java.lang.String toUser, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFA_TU(fromApplication, toUser, start, end,
			orderByComparator);
	}

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
	public static org.oep.core.ssomgt.model.AppMessage findByFA_TU_First(
		java.lang.String fromApplication, java.lang.String toUser,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppMessageException {
		return getPersistence()
				   .findByFA_TU_First(fromApplication, toUser, orderByComparator);
	}

	/**
	* Returns the first app message in the ordered set where fromApplication = &#63; and toUser = &#63;.
	*
	* @param fromApplication the from application
	* @param toUser the to user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app message, or <code>null</code> if a matching app message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.AppMessage fetchByFA_TU_First(
		java.lang.String fromApplication, java.lang.String toUser,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFA_TU_First(fromApplication, toUser,
			orderByComparator);
	}

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
	public static org.oep.core.ssomgt.model.AppMessage findByFA_TU_Last(
		java.lang.String fromApplication, java.lang.String toUser,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppMessageException {
		return getPersistence()
				   .findByFA_TU_Last(fromApplication, toUser, orderByComparator);
	}

	/**
	* Returns the last app message in the ordered set where fromApplication = &#63; and toUser = &#63;.
	*
	* @param fromApplication the from application
	* @param toUser the to user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app message, or <code>null</code> if a matching app message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.AppMessage fetchByFA_TU_Last(
		java.lang.String fromApplication, java.lang.String toUser,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFA_TU_Last(fromApplication, toUser, orderByComparator);
	}

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
	public static org.oep.core.ssomgt.model.AppMessage[] findByFA_TU_PrevAndNext(
		long appMessageId, java.lang.String fromApplication,
		java.lang.String toUser,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppMessageException {
		return getPersistence()
				   .findByFA_TU_PrevAndNext(appMessageId, fromApplication,
			toUser, orderByComparator);
	}

	/**
	* Removes all the app messages where fromApplication = &#63; and toUser = &#63; from the database.
	*
	* @param fromApplication the from application
	* @param toUser the to user
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByFA_TU(java.lang.String fromApplication,
		java.lang.String toUser)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByFA_TU(fromApplication, toUser);
	}

	/**
	* Returns the number of app messages where fromApplication = &#63; and toUser = &#63;.
	*
	* @param fromApplication the from application
	* @param toUser the to user
	* @return the number of matching app messages
	* @throws SystemException if a system exception occurred
	*/
	public static int countByFA_TU(java.lang.String fromApplication,
		java.lang.String toUser)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByFA_TU(fromApplication, toUser);
	}

	/**
	* Caches the app message in the entity cache if it is enabled.
	*
	* @param appMessage the app message
	*/
	public static void cacheResult(
		org.oep.core.ssomgt.model.AppMessage appMessage) {
		getPersistence().cacheResult(appMessage);
	}

	/**
	* Caches the app messages in the entity cache if it is enabled.
	*
	* @param appMessages the app messages
	*/
	public static void cacheResult(
		java.util.List<org.oep.core.ssomgt.model.AppMessage> appMessages) {
		getPersistence().cacheResult(appMessages);
	}

	/**
	* Creates a new app message with the primary key. Does not add the app message to the database.
	*
	* @param appMessageId the primary key for the new app message
	* @return the new app message
	*/
	public static org.oep.core.ssomgt.model.AppMessage create(long appMessageId) {
		return getPersistence().create(appMessageId);
	}

	/**
	* Removes the app message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param appMessageId the primary key of the app message
	* @return the app message that was removed
	* @throws org.oep.core.ssomgt.NoSuchAppMessageException if a app message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.AppMessage remove(long appMessageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppMessageException {
		return getPersistence().remove(appMessageId);
	}

	public static org.oep.core.ssomgt.model.AppMessage updateImpl(
		org.oep.core.ssomgt.model.AppMessage appMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(appMessage);
	}

	/**
	* Returns the app message with the primary key or throws a {@link org.oep.core.ssomgt.NoSuchAppMessageException} if it could not be found.
	*
	* @param appMessageId the primary key of the app message
	* @return the app message
	* @throws org.oep.core.ssomgt.NoSuchAppMessageException if a app message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.AppMessage findByPrimaryKey(
		long appMessageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppMessageException {
		return getPersistence().findByPrimaryKey(appMessageId);
	}

	/**
	* Returns the app message with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param appMessageId the primary key of the app message
	* @return the app message, or <code>null</code> if a app message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.AppMessage fetchByPrimaryKey(
		long appMessageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(appMessageId);
	}

	/**
	* Returns all the app messages.
	*
	* @return the app messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.ssomgt.model.AppMessage> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<org.oep.core.ssomgt.model.AppMessage> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<org.oep.core.ssomgt.model.AppMessage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the app messages from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of app messages.
	*
	* @return the number of app messages
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AppMessagePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AppMessagePersistence)PortletBeanLocatorUtil.locate(org.oep.core.ssomgt.service.ClpSerializer.getServletContextName(),
					AppMessagePersistence.class.getName());

			ReferenceRegistry.registerReference(AppMessageUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(AppMessagePersistence persistence) {
	}

	private static AppMessagePersistence _persistence;
}