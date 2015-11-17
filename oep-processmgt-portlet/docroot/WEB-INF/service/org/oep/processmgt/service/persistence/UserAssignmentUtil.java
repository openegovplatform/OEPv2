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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.oep.processmgt.model.UserAssignment;

import java.util.List;

/**
 * The persistence utility for the user assignment service. This utility wraps {@link UserAssignmentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see UserAssignmentPersistence
 * @see UserAssignmentPersistenceImpl
 * @generated
 */
public class UserAssignmentUtil {
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
	public static void clearCache(UserAssignment userAssignment) {
		getPersistence().clearCache(userAssignment);
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
	public static List<UserAssignment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UserAssignment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UserAssignment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static UserAssignment update(UserAssignment userAssignment)
		throws SystemException {
		return getPersistence().update(userAssignment);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static UserAssignment update(UserAssignment userAssignment,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(userAssignment, serviceContext);
	}

	/**
	* Caches the user assignment in the entity cache if it is enabled.
	*
	* @param userAssignment the user assignment
	*/
	public static void cacheResult(
		org.oep.processmgt.model.UserAssignment userAssignment) {
		getPersistence().cacheResult(userAssignment);
	}

	/**
	* Caches the user assignments in the entity cache if it is enabled.
	*
	* @param userAssignments the user assignments
	*/
	public static void cacheResult(
		java.util.List<org.oep.processmgt.model.UserAssignment> userAssignments) {
		getPersistence().cacheResult(userAssignments);
	}

	/**
	* Creates a new user assignment with the primary key. Does not add the user assignment to the database.
	*
	* @param userAssignmentId the primary key for the new user assignment
	* @return the new user assignment
	*/
	public static org.oep.processmgt.model.UserAssignment create(
		long userAssignmentId) {
		return getPersistence().create(userAssignmentId);
	}

	/**
	* Removes the user assignment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userAssignmentId the primary key of the user assignment
	* @return the user assignment that was removed
	* @throws org.oep.processmgt.NoSuchUserAssignmentException if a user assignment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.processmgt.model.UserAssignment remove(
		long userAssignmentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.processmgt.NoSuchUserAssignmentException {
		return getPersistence().remove(userAssignmentId);
	}

	public static org.oep.processmgt.model.UserAssignment updateImpl(
		org.oep.processmgt.model.UserAssignment userAssignment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(userAssignment);
	}

	/**
	* Returns the user assignment with the primary key or throws a {@link org.oep.processmgt.NoSuchUserAssignmentException} if it could not be found.
	*
	* @param userAssignmentId the primary key of the user assignment
	* @return the user assignment
	* @throws org.oep.processmgt.NoSuchUserAssignmentException if a user assignment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.processmgt.model.UserAssignment findByPrimaryKey(
		long userAssignmentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.processmgt.NoSuchUserAssignmentException {
		return getPersistence().findByPrimaryKey(userAssignmentId);
	}

	/**
	* Returns the user assignment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param userAssignmentId the primary key of the user assignment
	* @return the user assignment, or <code>null</code> if a user assignment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.processmgt.model.UserAssignment fetchByPrimaryKey(
		long userAssignmentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(userAssignmentId);
	}

	/**
	* Returns all the user assignments.
	*
	* @return the user assignments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.processmgt.model.UserAssignment> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the user assignments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.UserAssignmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user assignments
	* @param end the upper bound of the range of user assignments (not inclusive)
	* @return the range of user assignments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.processmgt.model.UserAssignment> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the user assignments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.UserAssignmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user assignments
	* @param end the upper bound of the range of user assignments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of user assignments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.processmgt.model.UserAssignment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the user assignments from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of user assignments.
	*
	* @return the number of user assignments
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static UserAssignmentPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (UserAssignmentPersistence)PortletBeanLocatorUtil.locate(org.oep.processmgt.service.ClpSerializer.getServletContextName(),
					UserAssignmentPersistence.class.getName());

			ReferenceRegistry.registerReference(UserAssignmentUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(UserAssignmentPersistence persistence) {
	}

	private static UserAssignmentPersistence _persistence;
}