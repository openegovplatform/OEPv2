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

package org.oep.ssomgt.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.oep.ssomgt.model.UserSync;

import java.util.List;

/**
 * The persistence utility for the user sync service. This utility wraps {@link UserSyncPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see UserSyncPersistence
 * @see UserSyncPersistenceImpl
 * @generated
 */
public class UserSyncUtil {
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
	public static void clearCache(UserSync userSync) {
		getPersistence().clearCache(userSync);
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
	public static List<UserSync> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UserSync> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UserSync> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static UserSync update(UserSync userSync) throws SystemException {
		return getPersistence().update(userSync);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static UserSync update(UserSync userSync,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(userSync, serviceContext);
	}

	/**
	* Returns all the user syncs where applicationId = &#63; and checkpoint &gt; &#63;.
	*
	* @param applicationId the application ID
	* @param checkpoint the checkpoint
	* @return the matching user syncs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.UserSync> findByA_GtCP(
		long applicationId, java.util.Date checkpoint)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByA_GtCP(applicationId, checkpoint);
	}

	/**
	* Returns a range of all the user syncs where applicationId = &#63; and checkpoint &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.UserSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicationId the application ID
	* @param checkpoint the checkpoint
	* @param start the lower bound of the range of user syncs
	* @param end the upper bound of the range of user syncs (not inclusive)
	* @return the range of matching user syncs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.UserSync> findByA_GtCP(
		long applicationId, java.util.Date checkpoint, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByA_GtCP(applicationId, checkpoint, start, end);
	}

	/**
	* Returns an ordered range of all the user syncs where applicationId = &#63; and checkpoint &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.UserSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicationId the application ID
	* @param checkpoint the checkpoint
	* @param start the lower bound of the range of user syncs
	* @param end the upper bound of the range of user syncs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user syncs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.UserSync> findByA_GtCP(
		long applicationId, java.util.Date checkpoint, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByA_GtCP(applicationId, checkpoint, start, end,
			orderByComparator);
	}

	/**
	* Returns the first user sync in the ordered set where applicationId = &#63; and checkpoint &gt; &#63;.
	*
	* @param applicationId the application ID
	* @param checkpoint the checkpoint
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user sync
	* @throws org.oep.ssomgt.NoSuchUserSyncException if a matching user sync could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.UserSync findByA_GtCP_First(
		long applicationId, java.util.Date checkpoint,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchUserSyncException {
		return getPersistence()
				   .findByA_GtCP_First(applicationId, checkpoint,
			orderByComparator);
	}

	/**
	* Returns the first user sync in the ordered set where applicationId = &#63; and checkpoint &gt; &#63;.
	*
	* @param applicationId the application ID
	* @param checkpoint the checkpoint
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user sync, or <code>null</code> if a matching user sync could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.UserSync fetchByA_GtCP_First(
		long applicationId, java.util.Date checkpoint,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByA_GtCP_First(applicationId, checkpoint,
			orderByComparator);
	}

	/**
	* Returns the last user sync in the ordered set where applicationId = &#63; and checkpoint &gt; &#63;.
	*
	* @param applicationId the application ID
	* @param checkpoint the checkpoint
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user sync
	* @throws org.oep.ssomgt.NoSuchUserSyncException if a matching user sync could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.UserSync findByA_GtCP_Last(
		long applicationId, java.util.Date checkpoint,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchUserSyncException {
		return getPersistence()
				   .findByA_GtCP_Last(applicationId, checkpoint,
			orderByComparator);
	}

	/**
	* Returns the last user sync in the ordered set where applicationId = &#63; and checkpoint &gt; &#63;.
	*
	* @param applicationId the application ID
	* @param checkpoint the checkpoint
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user sync, or <code>null</code> if a matching user sync could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.UserSync fetchByA_GtCP_Last(
		long applicationId, java.util.Date checkpoint,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByA_GtCP_Last(applicationId, checkpoint,
			orderByComparator);
	}

	/**
	* Returns the user syncs before and after the current user sync in the ordered set where applicationId = &#63; and checkpoint &gt; &#63;.
	*
	* @param userSyncId the primary key of the current user sync
	* @param applicationId the application ID
	* @param checkpoint the checkpoint
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user sync
	* @throws org.oep.ssomgt.NoSuchUserSyncException if a user sync with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.UserSync[] findByA_GtCP_PrevAndNext(
		long userSyncId, long applicationId, java.util.Date checkpoint,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchUserSyncException {
		return getPersistence()
				   .findByA_GtCP_PrevAndNext(userSyncId, applicationId,
			checkpoint, orderByComparator);
	}

	/**
	* Removes all the user syncs where applicationId = &#63; and checkpoint &gt; &#63; from the database.
	*
	* @param applicationId the application ID
	* @param checkpoint the checkpoint
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByA_GtCP(long applicationId,
		java.util.Date checkpoint)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByA_GtCP(applicationId, checkpoint);
	}

	/**
	* Returns the number of user syncs where applicationId = &#63; and checkpoint &gt; &#63;.
	*
	* @param applicationId the application ID
	* @param checkpoint the checkpoint
	* @return the number of matching user syncs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByA_GtCP(long applicationId,
		java.util.Date checkpoint)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByA_GtCP(applicationId, checkpoint);
	}

	/**
	* Caches the user sync in the entity cache if it is enabled.
	*
	* @param userSync the user sync
	*/
	public static void cacheResult(org.oep.ssomgt.model.UserSync userSync) {
		getPersistence().cacheResult(userSync);
	}

	/**
	* Caches the user syncs in the entity cache if it is enabled.
	*
	* @param userSyncs the user syncs
	*/
	public static void cacheResult(
		java.util.List<org.oep.ssomgt.model.UserSync> userSyncs) {
		getPersistence().cacheResult(userSyncs);
	}

	/**
	* Creates a new user sync with the primary key. Does not add the user sync to the database.
	*
	* @param userSyncId the primary key for the new user sync
	* @return the new user sync
	*/
	public static org.oep.ssomgt.model.UserSync create(long userSyncId) {
		return getPersistence().create(userSyncId);
	}

	/**
	* Removes the user sync with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userSyncId the primary key of the user sync
	* @return the user sync that was removed
	* @throws org.oep.ssomgt.NoSuchUserSyncException if a user sync with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.UserSync remove(long userSyncId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchUserSyncException {
		return getPersistence().remove(userSyncId);
	}

	public static org.oep.ssomgt.model.UserSync updateImpl(
		org.oep.ssomgt.model.UserSync userSync)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(userSync);
	}

	/**
	* Returns the user sync with the primary key or throws a {@link org.oep.ssomgt.NoSuchUserSyncException} if it could not be found.
	*
	* @param userSyncId the primary key of the user sync
	* @return the user sync
	* @throws org.oep.ssomgt.NoSuchUserSyncException if a user sync with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.UserSync findByPrimaryKey(
		long userSyncId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchUserSyncException {
		return getPersistence().findByPrimaryKey(userSyncId);
	}

	/**
	* Returns the user sync with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param userSyncId the primary key of the user sync
	* @return the user sync, or <code>null</code> if a user sync with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.UserSync fetchByPrimaryKey(
		long userSyncId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(userSyncId);
	}

	/**
	* Returns all the user syncs.
	*
	* @return the user syncs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.UserSync> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the user syncs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.UserSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user syncs
	* @param end the upper bound of the range of user syncs (not inclusive)
	* @return the range of user syncs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.UserSync> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the user syncs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.UserSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user syncs
	* @param end the upper bound of the range of user syncs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of user syncs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.UserSync> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the user syncs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of user syncs.
	*
	* @return the number of user syncs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static UserSyncPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (UserSyncPersistence)PortletBeanLocatorUtil.locate(org.oep.ssomgt.service.ClpSerializer.getServletContextName(),
					UserSyncPersistence.class.getName());

			ReferenceRegistry.registerReference(UserSyncUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(UserSyncPersistence persistence) {
	}

	private static UserSyncPersistence _persistence;
}