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

import org.oep.core.ssomgt.model.AppRole;

/**
 * The persistence interface for the app role service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see AppRolePersistenceImpl
 * @see AppRoleUtil
 * @generated
 */
public interface AppRolePersistence extends BasePersistence<AppRole> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AppRoleUtil} to access the app role persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the app roles where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching app roles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.ssomgt.model.AppRole> findByC(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the app roles where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of app roles
	* @param end the upper bound of the range of app roles (not inclusive)
	* @return the range of matching app roles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.ssomgt.model.AppRole> findByC(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the app roles where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of app roles
	* @param end the upper bound of the range of app roles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching app roles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.ssomgt.model.AppRole> findByC(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first app role in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app role
	* @throws org.oep.core.ssomgt.NoSuchAppRoleException if a matching app role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.ssomgt.model.AppRole findByC_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppRoleException;

	/**
	* Returns the first app role in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app role, or <code>null</code> if a matching app role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.ssomgt.model.AppRole fetchByC_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last app role in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app role
	* @throws org.oep.core.ssomgt.NoSuchAppRoleException if a matching app role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.ssomgt.model.AppRole findByC_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppRoleException;

	/**
	* Returns the last app role in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app role, or <code>null</code> if a matching app role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.ssomgt.model.AppRole fetchByC_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the app roles before and after the current app role in the ordered set where companyId = &#63;.
	*
	* @param appRoleId the primary key of the current app role
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next app role
	* @throws org.oep.core.ssomgt.NoSuchAppRoleException if a app role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.ssomgt.model.AppRole[] findByC_PrevAndNext(
		long appRoleId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppRoleException;

	/**
	* Removes all the app roles where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of app roles where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching app roles
	* @throws SystemException if a system exception occurred
	*/
	public int countByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the app roles where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching app roles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.ssomgt.model.AppRole> findByC_G(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the app roles where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of app roles
	* @param end the upper bound of the range of app roles (not inclusive)
	* @return the range of matching app roles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.ssomgt.model.AppRole> findByC_G(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the app roles where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of app roles
	* @param end the upper bound of the range of app roles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching app roles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.ssomgt.model.AppRole> findByC_G(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first app role in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app role
	* @throws org.oep.core.ssomgt.NoSuchAppRoleException if a matching app role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.ssomgt.model.AppRole findByC_G_First(long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppRoleException;

	/**
	* Returns the first app role in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app role, or <code>null</code> if a matching app role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.ssomgt.model.AppRole fetchByC_G_First(long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last app role in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app role
	* @throws org.oep.core.ssomgt.NoSuchAppRoleException if a matching app role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.ssomgt.model.AppRole findByC_G_Last(long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppRoleException;

	/**
	* Returns the last app role in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app role, or <code>null</code> if a matching app role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.ssomgt.model.AppRole fetchByC_G_Last(long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the app roles before and after the current app role in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param appRoleId the primary key of the current app role
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next app role
	* @throws org.oep.core.ssomgt.NoSuchAppRoleException if a app role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.ssomgt.model.AppRole[] findByC_G_PrevAndNext(
		long appRoleId, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppRoleException;

	/**
	* Removes all the app roles where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of app roles where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching app roles
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the app roles where companyId = &#63; and groupId = &#63; and applicationId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param applicationId the application ID
	* @return the matching app roles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.ssomgt.model.AppRole> findByC_G_A(
		long companyId, long groupId, long applicationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the app roles where companyId = &#63; and groupId = &#63; and applicationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param applicationId the application ID
	* @param start the lower bound of the range of app roles
	* @param end the upper bound of the range of app roles (not inclusive)
	* @return the range of matching app roles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.ssomgt.model.AppRole> findByC_G_A(
		long companyId, long groupId, long applicationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the app roles where companyId = &#63; and groupId = &#63; and applicationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param applicationId the application ID
	* @param start the lower bound of the range of app roles
	* @param end the upper bound of the range of app roles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching app roles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.ssomgt.model.AppRole> findByC_G_A(
		long companyId, long groupId, long applicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first app role in the ordered set where companyId = &#63; and groupId = &#63; and applicationId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param applicationId the application ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app role
	* @throws org.oep.core.ssomgt.NoSuchAppRoleException if a matching app role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.ssomgt.model.AppRole findByC_G_A_First(long companyId,
		long groupId, long applicationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppRoleException;

	/**
	* Returns the first app role in the ordered set where companyId = &#63; and groupId = &#63; and applicationId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param applicationId the application ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app role, or <code>null</code> if a matching app role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.ssomgt.model.AppRole fetchByC_G_A_First(
		long companyId, long groupId, long applicationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last app role in the ordered set where companyId = &#63; and groupId = &#63; and applicationId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param applicationId the application ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app role
	* @throws org.oep.core.ssomgt.NoSuchAppRoleException if a matching app role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.ssomgt.model.AppRole findByC_G_A_Last(long companyId,
		long groupId, long applicationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppRoleException;

	/**
	* Returns the last app role in the ordered set where companyId = &#63; and groupId = &#63; and applicationId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param applicationId the application ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app role, or <code>null</code> if a matching app role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.ssomgt.model.AppRole fetchByC_G_A_Last(long companyId,
		long groupId, long applicationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the app roles before and after the current app role in the ordered set where companyId = &#63; and groupId = &#63; and applicationId = &#63;.
	*
	* @param appRoleId the primary key of the current app role
	* @param companyId the company ID
	* @param groupId the group ID
	* @param applicationId the application ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next app role
	* @throws org.oep.core.ssomgt.NoSuchAppRoleException if a app role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.ssomgt.model.AppRole[] findByC_G_A_PrevAndNext(
		long appRoleId, long companyId, long groupId, long applicationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppRoleException;

	/**
	* Removes all the app roles where companyId = &#63; and groupId = &#63; and applicationId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param applicationId the application ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_G_A(long companyId, long groupId, long applicationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of app roles where companyId = &#63; and groupId = &#63; and applicationId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param applicationId the application ID
	* @return the number of matching app roles
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_G_A(long companyId, long groupId, long applicationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the app role in the entity cache if it is enabled.
	*
	* @param appRole the app role
	*/
	public void cacheResult(org.oep.core.ssomgt.model.AppRole appRole);

	/**
	* Caches the app roles in the entity cache if it is enabled.
	*
	* @param appRoles the app roles
	*/
	public void cacheResult(
		java.util.List<org.oep.core.ssomgt.model.AppRole> appRoles);

	/**
	* Creates a new app role with the primary key. Does not add the app role to the database.
	*
	* @param appRoleId the primary key for the new app role
	* @return the new app role
	*/
	public org.oep.core.ssomgt.model.AppRole create(long appRoleId);

	/**
	* Removes the app role with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param appRoleId the primary key of the app role
	* @return the app role that was removed
	* @throws org.oep.core.ssomgt.NoSuchAppRoleException if a app role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.ssomgt.model.AppRole remove(long appRoleId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppRoleException;

	public org.oep.core.ssomgt.model.AppRole updateImpl(
		org.oep.core.ssomgt.model.AppRole appRole)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the app role with the primary key or throws a {@link org.oep.core.ssomgt.NoSuchAppRoleException} if it could not be found.
	*
	* @param appRoleId the primary key of the app role
	* @return the app role
	* @throws org.oep.core.ssomgt.NoSuchAppRoleException if a app role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.ssomgt.model.AppRole findByPrimaryKey(long appRoleId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppRoleException;

	/**
	* Returns the app role with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param appRoleId the primary key of the app role
	* @return the app role, or <code>null</code> if a app role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.ssomgt.model.AppRole fetchByPrimaryKey(long appRoleId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the app roles.
	*
	* @return the app roles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.ssomgt.model.AppRole> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the app roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of app roles
	* @param end the upper bound of the range of app roles (not inclusive)
	* @return the range of app roles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.ssomgt.model.AppRole> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the app roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of app roles
	* @param end the upper bound of the range of app roles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of app roles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.ssomgt.model.AppRole> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the app roles from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of app roles.
	*
	* @return the number of app roles
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}