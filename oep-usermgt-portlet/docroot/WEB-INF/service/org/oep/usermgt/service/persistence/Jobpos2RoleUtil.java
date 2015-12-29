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

package org.oep.usermgt.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.oep.usermgt.model.JobPos2Role;

import java.util.List;

/**
 * The persistence utility for the jobpos to role service. This utility wraps {@link JobPos2RolePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NQMINH
 * @see JobPos2RolePersistence
 * @see JobPos2RolePersistenceImpl
 * @generated
 */
public class JobPos2RoleUtil {
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
	public static void clearCache(JobPos2Role jobPos2Role) {
		getPersistence().clearCache(jobPos2Role);
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
	public static List<JobPos2Role> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JobPos2Role> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JobPos2Role> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static JobPos2Role update(JobPos2Role jobPos2Role)
		throws SystemException {
		return getPersistence().update(jobPos2Role);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static JobPos2Role update(JobPos2Role jobPos2Role,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(jobPos2Role, serviceContext);
	}

	/**
	* Returns all the jobpos to roles where roleId = &#63;.
	*
	* @param roleId the role ID
	* @return the matching jobpos to roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.JobPos2Role> findByR(
		long roleId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByR(roleId);
	}

	/**
	* Returns a range of all the jobpos to roles where roleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPos2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param roleId the role ID
	* @param start the lower bound of the range of jobpos to roles
	* @param end the upper bound of the range of jobpos to roles (not inclusive)
	* @return the range of matching jobpos to roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.JobPos2Role> findByR(
		long roleId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByR(roleId, start, end);
	}

	/**
	* Returns an ordered range of all the jobpos to roles where roleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPos2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param roleId the role ID
	* @param start the lower bound of the range of jobpos to roles
	* @param end the upper bound of the range of jobpos to roles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching jobpos to roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.JobPos2Role> findByR(
		long roleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByR(roleId, start, end, orderByComparator);
	}

	/**
	* Returns the first jobpos to role in the ordered set where roleId = &#63;.
	*
	* @param roleId the role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jobpos to role
	* @throws org.oep.usermgt.NoSuchJobPos2RoleException if a matching jobpos to role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos2Role findByR_First(long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchJobPos2RoleException {
		return getPersistence().findByR_First(roleId, orderByComparator);
	}

	/**
	* Returns the first jobpos to role in the ordered set where roleId = &#63;.
	*
	* @param roleId the role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jobpos to role, or <code>null</code> if a matching jobpos to role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos2Role fetchByR_First(
		long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByR_First(roleId, orderByComparator);
	}

	/**
	* Returns the last jobpos to role in the ordered set where roleId = &#63;.
	*
	* @param roleId the role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jobpos to role
	* @throws org.oep.usermgt.NoSuchJobPos2RoleException if a matching jobpos to role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos2Role findByR_Last(long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchJobPos2RoleException {
		return getPersistence().findByR_Last(roleId, orderByComparator);
	}

	/**
	* Returns the last jobpos to role in the ordered set where roleId = &#63;.
	*
	* @param roleId the role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jobpos to role, or <code>null</code> if a matching jobpos to role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos2Role fetchByR_Last(long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByR_Last(roleId, orderByComparator);
	}

	/**
	* Returns the jobpos to roles before and after the current jobpos to role in the ordered set where roleId = &#63;.
	*
	* @param jobPos2RolePK the primary key of the current jobpos to role
	* @param roleId the role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next jobpos to role
	* @throws org.oep.usermgt.NoSuchJobPos2RoleException if a jobpos to role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos2Role[] findByR_PrevAndNext(
		org.oep.usermgt.service.persistence.JobPos2RolePK jobPos2RolePK,
		long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchJobPos2RoleException {
		return getPersistence()
				   .findByR_PrevAndNext(jobPos2RolePK, roleId, orderByComparator);
	}

	/**
	* Removes all the jobpos to roles where roleId = &#63; from the database.
	*
	* @param roleId the role ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByR(long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByR(roleId);
	}

	/**
	* Returns the number of jobpos to roles where roleId = &#63;.
	*
	* @param roleId the role ID
	* @return the number of matching jobpos to roles
	* @throws SystemException if a system exception occurred
	*/
	public static int countByR(long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByR(roleId);
	}

	/**
	* Returns all the jobpos to roles where jobPosId = &#63;.
	*
	* @param jobPosId the job pos ID
	* @return the matching jobpos to roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.JobPos2Role> findByJP(
		long jobPosId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByJP(jobPosId);
	}

	/**
	* Returns a range of all the jobpos to roles where jobPosId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPos2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param jobPosId the job pos ID
	* @param start the lower bound of the range of jobpos to roles
	* @param end the upper bound of the range of jobpos to roles (not inclusive)
	* @return the range of matching jobpos to roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.JobPos2Role> findByJP(
		long jobPosId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByJP(jobPosId, start, end);
	}

	/**
	* Returns an ordered range of all the jobpos to roles where jobPosId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPos2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param jobPosId the job pos ID
	* @param start the lower bound of the range of jobpos to roles
	* @param end the upper bound of the range of jobpos to roles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching jobpos to roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.JobPos2Role> findByJP(
		long jobPosId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByJP(jobPosId, start, end, orderByComparator);
	}

	/**
	* Returns the first jobpos to role in the ordered set where jobPosId = &#63;.
	*
	* @param jobPosId the job pos ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jobpos to role
	* @throws org.oep.usermgt.NoSuchJobPos2RoleException if a matching jobpos to role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos2Role findByJP_First(
		long jobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchJobPos2RoleException {
		return getPersistence().findByJP_First(jobPosId, orderByComparator);
	}

	/**
	* Returns the first jobpos to role in the ordered set where jobPosId = &#63;.
	*
	* @param jobPosId the job pos ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jobpos to role, or <code>null</code> if a matching jobpos to role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos2Role fetchByJP_First(
		long jobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByJP_First(jobPosId, orderByComparator);
	}

	/**
	* Returns the last jobpos to role in the ordered set where jobPosId = &#63;.
	*
	* @param jobPosId the job pos ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jobpos to role
	* @throws org.oep.usermgt.NoSuchJobPos2RoleException if a matching jobpos to role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos2Role findByJP_Last(
		long jobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchJobPos2RoleException {
		return getPersistence().findByJP_Last(jobPosId, orderByComparator);
	}

	/**
	* Returns the last jobpos to role in the ordered set where jobPosId = &#63;.
	*
	* @param jobPosId the job pos ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jobpos to role, or <code>null</code> if a matching jobpos to role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos2Role fetchByJP_Last(
		long jobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByJP_Last(jobPosId, orderByComparator);
	}

	/**
	* Returns the jobpos to roles before and after the current jobpos to role in the ordered set where jobPosId = &#63;.
	*
	* @param jobPos2RolePK the primary key of the current jobpos to role
	* @param jobPosId the job pos ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next jobpos to role
	* @throws org.oep.usermgt.NoSuchJobPos2RoleException if a jobpos to role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos2Role[] findByJP_PrevAndNext(
		org.oep.usermgt.service.persistence.JobPos2RolePK jobPos2RolePK,
		long jobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchJobPos2RoleException {
		return getPersistence()
				   .findByJP_PrevAndNext(jobPos2RolePK, jobPosId,
			orderByComparator);
	}

	/**
	* Removes all the jobpos to roles where jobPosId = &#63; from the database.
	*
	* @param jobPosId the job pos ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByJP(long jobPosId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByJP(jobPosId);
	}

	/**
	* Returns the number of jobpos to roles where jobPosId = &#63;.
	*
	* @param jobPosId the job pos ID
	* @return the number of matching jobpos to roles
	* @throws SystemException if a system exception occurred
	*/
	public static int countByJP(long jobPosId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByJP(jobPosId);
	}

	/**
	* Caches the jobpos to role in the entity cache if it is enabled.
	*
	* @param jobPos2Role the jobpos to role
	*/
	public static void cacheResult(
		org.oep.usermgt.model.JobPos2Role jobPos2Role) {
		getPersistence().cacheResult(jobPos2Role);
	}

	/**
	* Caches the jobpos to roles in the entity cache if it is enabled.
	*
	* @param jobPos2Roles the jobpos to roles
	*/
	public static void cacheResult(
		java.util.List<org.oep.usermgt.model.JobPos2Role> jobPos2Roles) {
		getPersistence().cacheResult(jobPos2Roles);
	}

	/**
	* Creates a new jobpos to role with the primary key. Does not add the jobpos to role to the database.
	*
	* @param jobPos2RolePK the primary key for the new jobpos to role
	* @return the new jobpos to role
	*/
	public static org.oep.usermgt.model.JobPos2Role create(
		org.oep.usermgt.service.persistence.JobPos2RolePK jobPos2RolePK) {
		return getPersistence().create(jobPos2RolePK);
	}

	/**
	* Removes the jobpos to role with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jobPos2RolePK the primary key of the jobpos to role
	* @return the jobpos to role that was removed
	* @throws org.oep.usermgt.NoSuchJobPos2RoleException if a jobpos to role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos2Role remove(
		org.oep.usermgt.service.persistence.JobPos2RolePK jobPos2RolePK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchJobPos2RoleException {
		return getPersistence().remove(jobPos2RolePK);
	}

	public static org.oep.usermgt.model.JobPos2Role updateImpl(
		org.oep.usermgt.model.JobPos2Role jobPos2Role)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(jobPos2Role);
	}

	/**
	* Returns the jobpos to role with the primary key or throws a {@link org.oep.usermgt.NoSuchJobPos2RoleException} if it could not be found.
	*
	* @param jobPos2RolePK the primary key of the jobpos to role
	* @return the jobpos to role
	* @throws org.oep.usermgt.NoSuchJobPos2RoleException if a jobpos to role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos2Role findByPrimaryKey(
		org.oep.usermgt.service.persistence.JobPos2RolePK jobPos2RolePK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchJobPos2RoleException {
		return getPersistence().findByPrimaryKey(jobPos2RolePK);
	}

	/**
	* Returns the jobpos to role with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param jobPos2RolePK the primary key of the jobpos to role
	* @return the jobpos to role, or <code>null</code> if a jobpos to role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos2Role fetchByPrimaryKey(
		org.oep.usermgt.service.persistence.JobPos2RolePK jobPos2RolePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(jobPos2RolePK);
	}

	/**
	* Returns all the jobpos to roles.
	*
	* @return the jobpos to roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.JobPos2Role> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the jobpos to roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPos2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of jobpos to roles
	* @param end the upper bound of the range of jobpos to roles (not inclusive)
	* @return the range of jobpos to roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.JobPos2Role> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the jobpos to roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPos2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of jobpos to roles
	* @param end the upper bound of the range of jobpos to roles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of jobpos to roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.JobPos2Role> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the jobpos to roles from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of jobpos to roles.
	*
	* @return the number of jobpos to roles
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static JobPos2RolePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (JobPos2RolePersistence)PortletBeanLocatorUtil.locate(org.oep.usermgt.service.ClpSerializer.getServletContextName(),
					JobPos2RolePersistence.class.getName());

			ReferenceRegistry.registerReference(JobPos2RoleUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(JobPos2RolePersistence persistence) {
	}

	private static JobPos2RolePersistence _persistence;
}