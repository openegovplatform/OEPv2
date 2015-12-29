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

import com.liferay.portal.service.persistence.BasePersistence;

import org.oep.usermgt.model.JobPos2Role;

/**
 * The persistence interface for the jobpos to role service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NQMINH
 * @see JobPos2RolePersistenceImpl
 * @see JobPos2RoleUtil
 * @generated
 */
public interface JobPos2RolePersistence extends BasePersistence<JobPos2Role> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JobPos2RoleUtil} to access the jobpos to role persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the jobpos to roles where roleId = &#63;.
	*
	* @param roleId the role ID
	* @return the matching jobpos to roles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.JobPos2Role> findByR(
		long roleId) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.usermgt.model.JobPos2Role> findByR(
		long roleId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.usermgt.model.JobPos2Role> findByR(
		long roleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first jobpos to role in the ordered set where roleId = &#63;.
	*
	* @param roleId the role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jobpos to role
	* @throws org.oep.usermgt.NoSuchJobPos2RoleException if a matching jobpos to role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.JobPos2Role findByR_First(long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchJobPos2RoleException;

	/**
	* Returns the first jobpos to role in the ordered set where roleId = &#63;.
	*
	* @param roleId the role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jobpos to role, or <code>null</code> if a matching jobpos to role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.JobPos2Role fetchByR_First(long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last jobpos to role in the ordered set where roleId = &#63;.
	*
	* @param roleId the role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jobpos to role
	* @throws org.oep.usermgt.NoSuchJobPos2RoleException if a matching jobpos to role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.JobPos2Role findByR_Last(long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchJobPos2RoleException;

	/**
	* Returns the last jobpos to role in the ordered set where roleId = &#63;.
	*
	* @param roleId the role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jobpos to role, or <code>null</code> if a matching jobpos to role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.JobPos2Role fetchByR_Last(long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.usermgt.model.JobPos2Role[] findByR_PrevAndNext(
		org.oep.usermgt.service.persistence.JobPos2RolePK jobPos2RolePK,
		long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchJobPos2RoleException;

	/**
	* Removes all the jobpos to roles where roleId = &#63; from the database.
	*
	* @param roleId the role ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByR(long roleId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of jobpos to roles where roleId = &#63;.
	*
	* @param roleId the role ID
	* @return the number of matching jobpos to roles
	* @throws SystemException if a system exception occurred
	*/
	public int countByR(long roleId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the jobpos to roles where jobPosId = &#63;.
	*
	* @param jobPosId the job pos ID
	* @return the matching jobpos to roles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.JobPos2Role> findByJP(
		long jobPosId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.usermgt.model.JobPos2Role> findByJP(
		long jobPosId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.usermgt.model.JobPos2Role> findByJP(
		long jobPosId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first jobpos to role in the ordered set where jobPosId = &#63;.
	*
	* @param jobPosId the job pos ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jobpos to role
	* @throws org.oep.usermgt.NoSuchJobPos2RoleException if a matching jobpos to role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.JobPos2Role findByJP_First(long jobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchJobPos2RoleException;

	/**
	* Returns the first jobpos to role in the ordered set where jobPosId = &#63;.
	*
	* @param jobPosId the job pos ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jobpos to role, or <code>null</code> if a matching jobpos to role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.JobPos2Role fetchByJP_First(long jobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last jobpos to role in the ordered set where jobPosId = &#63;.
	*
	* @param jobPosId the job pos ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jobpos to role
	* @throws org.oep.usermgt.NoSuchJobPos2RoleException if a matching jobpos to role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.JobPos2Role findByJP_Last(long jobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchJobPos2RoleException;

	/**
	* Returns the last jobpos to role in the ordered set where jobPosId = &#63;.
	*
	* @param jobPosId the job pos ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jobpos to role, or <code>null</code> if a matching jobpos to role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.JobPos2Role fetchByJP_Last(long jobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.usermgt.model.JobPos2Role[] findByJP_PrevAndNext(
		org.oep.usermgt.service.persistence.JobPos2RolePK jobPos2RolePK,
		long jobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchJobPos2RoleException;

	/**
	* Removes all the jobpos to roles where jobPosId = &#63; from the database.
	*
	* @param jobPosId the job pos ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByJP(long jobPosId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of jobpos to roles where jobPosId = &#63;.
	*
	* @param jobPosId the job pos ID
	* @return the number of matching jobpos to roles
	* @throws SystemException if a system exception occurred
	*/
	public int countByJP(long jobPosId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the jobpos to role in the entity cache if it is enabled.
	*
	* @param jobPos2Role the jobpos to role
	*/
	public void cacheResult(org.oep.usermgt.model.JobPos2Role jobPos2Role);

	/**
	* Caches the jobpos to roles in the entity cache if it is enabled.
	*
	* @param jobPos2Roles the jobpos to roles
	*/
	public void cacheResult(
		java.util.List<org.oep.usermgt.model.JobPos2Role> jobPos2Roles);

	/**
	* Creates a new jobpos to role with the primary key. Does not add the jobpos to role to the database.
	*
	* @param jobPos2RolePK the primary key for the new jobpos to role
	* @return the new jobpos to role
	*/
	public org.oep.usermgt.model.JobPos2Role create(
		org.oep.usermgt.service.persistence.JobPos2RolePK jobPos2RolePK);

	/**
	* Removes the jobpos to role with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jobPos2RolePK the primary key of the jobpos to role
	* @return the jobpos to role that was removed
	* @throws org.oep.usermgt.NoSuchJobPos2RoleException if a jobpos to role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.JobPos2Role remove(
		org.oep.usermgt.service.persistence.JobPos2RolePK jobPos2RolePK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchJobPos2RoleException;

	public org.oep.usermgt.model.JobPos2Role updateImpl(
		org.oep.usermgt.model.JobPos2Role jobPos2Role)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the jobpos to role with the primary key or throws a {@link org.oep.usermgt.NoSuchJobPos2RoleException} if it could not be found.
	*
	* @param jobPos2RolePK the primary key of the jobpos to role
	* @return the jobpos to role
	* @throws org.oep.usermgt.NoSuchJobPos2RoleException if a jobpos to role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.JobPos2Role findByPrimaryKey(
		org.oep.usermgt.service.persistence.JobPos2RolePK jobPos2RolePK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchJobPos2RoleException;

	/**
	* Returns the jobpos to role with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param jobPos2RolePK the primary key of the jobpos to role
	* @return the jobpos to role, or <code>null</code> if a jobpos to role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.JobPos2Role fetchByPrimaryKey(
		org.oep.usermgt.service.persistence.JobPos2RolePK jobPos2RolePK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the jobpos to roles.
	*
	* @return the jobpos to roles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.JobPos2Role> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.usermgt.model.JobPos2Role> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.usermgt.model.JobPos2Role> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the jobpos to roles from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of jobpos to roles.
	*
	* @return the number of jobpos to roles
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}