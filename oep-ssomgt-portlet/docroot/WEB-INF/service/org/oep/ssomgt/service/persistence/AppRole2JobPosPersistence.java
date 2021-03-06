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

import com.liferay.portal.service.persistence.BasePersistence;

import org.oep.ssomgt.model.AppRole2JobPos;

/**
 * The persistence interface for the app role2 job pos service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see AppRole2JobPosPersistenceImpl
 * @see AppRole2JobPosUtil
 * @generated
 */
public interface AppRole2JobPosPersistence extends BasePersistence<AppRole2JobPos> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AppRole2JobPosUtil} to access the app role2 job pos persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the app role2 job poses where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.ssomgt.model.AppRole2JobPos> findByC(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the app role2 job poses where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of app role2 job poses
	* @param end the upper bound of the range of app role2 job poses (not inclusive)
	* @return the range of matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.ssomgt.model.AppRole2JobPos> findByC(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the app role2 job poses where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of app role2 job poses
	* @param end the upper bound of the range of app role2 job poses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.ssomgt.model.AppRole2JobPos> findByC(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first app role2 job pos in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app role2 job pos
	* @throws org.oep.ssomgt.NoSuchAppRole2JobPosException if a matching app role2 job pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.AppRole2JobPos findByC_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2JobPosException;

	/**
	* Returns the first app role2 job pos in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app role2 job pos, or <code>null</code> if a matching app role2 job pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.AppRole2JobPos fetchByC_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last app role2 job pos in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app role2 job pos
	* @throws org.oep.ssomgt.NoSuchAppRole2JobPosException if a matching app role2 job pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.AppRole2JobPos findByC_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2JobPosException;

	/**
	* Returns the last app role2 job pos in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app role2 job pos, or <code>null</code> if a matching app role2 job pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.AppRole2JobPos fetchByC_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the app role2 job poses before and after the current app role2 job pos in the ordered set where companyId = &#63;.
	*
	* @param appRole2JobPosId the primary key of the current app role2 job pos
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next app role2 job pos
	* @throws org.oep.ssomgt.NoSuchAppRole2JobPosException if a app role2 job pos with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.AppRole2JobPos[] findByC_PrevAndNext(
		long appRole2JobPosId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2JobPosException;

	/**
	* Removes all the app role2 job poses where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of app role2 job poses where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public int countByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the app role2 job poses where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.ssomgt.model.AppRole2JobPos> findByC_G(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the app role2 job poses where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of app role2 job poses
	* @param end the upper bound of the range of app role2 job poses (not inclusive)
	* @return the range of matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.ssomgt.model.AppRole2JobPos> findByC_G(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the app role2 job poses where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of app role2 job poses
	* @param end the upper bound of the range of app role2 job poses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.ssomgt.model.AppRole2JobPos> findByC_G(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first app role2 job pos in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app role2 job pos
	* @throws org.oep.ssomgt.NoSuchAppRole2JobPosException if a matching app role2 job pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.AppRole2JobPos findByC_G_First(long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2JobPosException;

	/**
	* Returns the first app role2 job pos in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app role2 job pos, or <code>null</code> if a matching app role2 job pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.AppRole2JobPos fetchByC_G_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last app role2 job pos in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app role2 job pos
	* @throws org.oep.ssomgt.NoSuchAppRole2JobPosException if a matching app role2 job pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.AppRole2JobPos findByC_G_Last(long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2JobPosException;

	/**
	* Returns the last app role2 job pos in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app role2 job pos, or <code>null</code> if a matching app role2 job pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.AppRole2JobPos fetchByC_G_Last(long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the app role2 job poses before and after the current app role2 job pos in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param appRole2JobPosId the primary key of the current app role2 job pos
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next app role2 job pos
	* @throws org.oep.ssomgt.NoSuchAppRole2JobPosException if a app role2 job pos with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.AppRole2JobPos[] findByC_G_PrevAndNext(
		long appRole2JobPosId, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2JobPosException;

	/**
	* Removes all the app role2 job poses where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of app role2 job poses where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the app role2 job poses where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param appRoleId the app role ID
	* @return the matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.ssomgt.model.AppRole2JobPos> findByC_G_AR(
		long companyId, long groupId, long appRoleId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the app role2 job poses where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param appRoleId the app role ID
	* @param start the lower bound of the range of app role2 job poses
	* @param end the upper bound of the range of app role2 job poses (not inclusive)
	* @return the range of matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.ssomgt.model.AppRole2JobPos> findByC_G_AR(
		long companyId, long groupId, long appRoleId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the app role2 job poses where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param appRoleId the app role ID
	* @param start the lower bound of the range of app role2 job poses
	* @param end the upper bound of the range of app role2 job poses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.ssomgt.model.AppRole2JobPos> findByC_G_AR(
		long companyId, long groupId, long appRoleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first app role2 job pos in the ordered set where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param appRoleId the app role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app role2 job pos
	* @throws org.oep.ssomgt.NoSuchAppRole2JobPosException if a matching app role2 job pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.AppRole2JobPos findByC_G_AR_First(
		long companyId, long groupId, long appRoleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2JobPosException;

	/**
	* Returns the first app role2 job pos in the ordered set where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param appRoleId the app role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app role2 job pos, or <code>null</code> if a matching app role2 job pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.AppRole2JobPos fetchByC_G_AR_First(
		long companyId, long groupId, long appRoleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last app role2 job pos in the ordered set where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param appRoleId the app role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app role2 job pos
	* @throws org.oep.ssomgt.NoSuchAppRole2JobPosException if a matching app role2 job pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.AppRole2JobPos findByC_G_AR_Last(
		long companyId, long groupId, long appRoleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2JobPosException;

	/**
	* Returns the last app role2 job pos in the ordered set where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param appRoleId the app role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app role2 job pos, or <code>null</code> if a matching app role2 job pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.AppRole2JobPos fetchByC_G_AR_Last(
		long companyId, long groupId, long appRoleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the app role2 job poses before and after the current app role2 job pos in the ordered set where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	*
	* @param appRole2JobPosId the primary key of the current app role2 job pos
	* @param companyId the company ID
	* @param groupId the group ID
	* @param appRoleId the app role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next app role2 job pos
	* @throws org.oep.ssomgt.NoSuchAppRole2JobPosException if a app role2 job pos with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.AppRole2JobPos[] findByC_G_AR_PrevAndNext(
		long appRole2JobPosId, long companyId, long groupId, long appRoleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2JobPosException;

	/**
	* Removes all the app role2 job poses where companyId = &#63; and groupId = &#63; and appRoleId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param appRoleId the app role ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_G_AR(long companyId, long groupId, long appRoleId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of app role2 job poses where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param appRoleId the app role ID
	* @return the number of matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_G_AR(long companyId, long groupId, long appRoleId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the app role2 job poses where companyId = &#63; and jobPosId = &#63;.
	*
	* @param companyId the company ID
	* @param jobPosId the job pos ID
	* @return the matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.ssomgt.model.AppRole2JobPos> findByC_InJobPos(
		long companyId, long jobPosId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the app role2 job poses where companyId = &#63; and jobPosId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param jobPosId the job pos ID
	* @param start the lower bound of the range of app role2 job poses
	* @param end the upper bound of the range of app role2 job poses (not inclusive)
	* @return the range of matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.ssomgt.model.AppRole2JobPos> findByC_InJobPos(
		long companyId, long jobPosId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the app role2 job poses where companyId = &#63; and jobPosId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param jobPosId the job pos ID
	* @param start the lower bound of the range of app role2 job poses
	* @param end the upper bound of the range of app role2 job poses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.ssomgt.model.AppRole2JobPos> findByC_InJobPos(
		long companyId, long jobPosId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first app role2 job pos in the ordered set where companyId = &#63; and jobPosId = &#63;.
	*
	* @param companyId the company ID
	* @param jobPosId the job pos ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app role2 job pos
	* @throws org.oep.ssomgt.NoSuchAppRole2JobPosException if a matching app role2 job pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.AppRole2JobPos findByC_InJobPos_First(
		long companyId, long jobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2JobPosException;

	/**
	* Returns the first app role2 job pos in the ordered set where companyId = &#63; and jobPosId = &#63;.
	*
	* @param companyId the company ID
	* @param jobPosId the job pos ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app role2 job pos, or <code>null</code> if a matching app role2 job pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.AppRole2JobPos fetchByC_InJobPos_First(
		long companyId, long jobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last app role2 job pos in the ordered set where companyId = &#63; and jobPosId = &#63;.
	*
	* @param companyId the company ID
	* @param jobPosId the job pos ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app role2 job pos
	* @throws org.oep.ssomgt.NoSuchAppRole2JobPosException if a matching app role2 job pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.AppRole2JobPos findByC_InJobPos_Last(
		long companyId, long jobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2JobPosException;

	/**
	* Returns the last app role2 job pos in the ordered set where companyId = &#63; and jobPosId = &#63;.
	*
	* @param companyId the company ID
	* @param jobPosId the job pos ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app role2 job pos, or <code>null</code> if a matching app role2 job pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.AppRole2JobPos fetchByC_InJobPos_Last(
		long companyId, long jobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the app role2 job poses before and after the current app role2 job pos in the ordered set where companyId = &#63; and jobPosId = &#63;.
	*
	* @param appRole2JobPosId the primary key of the current app role2 job pos
	* @param companyId the company ID
	* @param jobPosId the job pos ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next app role2 job pos
	* @throws org.oep.ssomgt.NoSuchAppRole2JobPosException if a app role2 job pos with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.AppRole2JobPos[] findByC_InJobPos_PrevAndNext(
		long appRole2JobPosId, long companyId, long jobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2JobPosException;

	/**
	* Returns all the app role2 job poses where companyId = &#63; and jobPosId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param jobPosIds the job pos IDs
	* @return the matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.ssomgt.model.AppRole2JobPos> findByC_InJobPos(
		long companyId, long[] jobPosIds)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the app role2 job poses where companyId = &#63; and jobPosId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param jobPosIds the job pos IDs
	* @param start the lower bound of the range of app role2 job poses
	* @param end the upper bound of the range of app role2 job poses (not inclusive)
	* @return the range of matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.ssomgt.model.AppRole2JobPos> findByC_InJobPos(
		long companyId, long[] jobPosIds, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the app role2 job poses where companyId = &#63; and jobPosId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param jobPosIds the job pos IDs
	* @param start the lower bound of the range of app role2 job poses
	* @param end the upper bound of the range of app role2 job poses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.ssomgt.model.AppRole2JobPos> findByC_InJobPos(
		long companyId, long[] jobPosIds, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the app role2 job poses where companyId = &#63; and jobPosId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param jobPosId the job pos ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_InJobPos(long companyId, long jobPosId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of app role2 job poses where companyId = &#63; and jobPosId = &#63;.
	*
	* @param companyId the company ID
	* @param jobPosId the job pos ID
	* @return the number of matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_InJobPos(long companyId, long jobPosId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of app role2 job poses where companyId = &#63; and jobPosId = any &#63;.
	*
	* @param companyId the company ID
	* @param jobPosIds the job pos IDs
	* @return the number of matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_InJobPos(long companyId, long[] jobPosIds)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the app role2 job poses where companyId = &#63; and groupId = &#63; and jobPosId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param jobPosId the job pos ID
	* @return the matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.ssomgt.model.AppRole2JobPos> findByC_G_InJobPos(
		long companyId, long groupId, long jobPosId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the app role2 job poses where companyId = &#63; and groupId = &#63; and jobPosId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param jobPosId the job pos ID
	* @param start the lower bound of the range of app role2 job poses
	* @param end the upper bound of the range of app role2 job poses (not inclusive)
	* @return the range of matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.ssomgt.model.AppRole2JobPos> findByC_G_InJobPos(
		long companyId, long groupId, long jobPosId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the app role2 job poses where companyId = &#63; and groupId = &#63; and jobPosId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param jobPosId the job pos ID
	* @param start the lower bound of the range of app role2 job poses
	* @param end the upper bound of the range of app role2 job poses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.ssomgt.model.AppRole2JobPos> findByC_G_InJobPos(
		long companyId, long groupId, long jobPosId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first app role2 job pos in the ordered set where companyId = &#63; and groupId = &#63; and jobPosId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param jobPosId the job pos ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app role2 job pos
	* @throws org.oep.ssomgt.NoSuchAppRole2JobPosException if a matching app role2 job pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.AppRole2JobPos findByC_G_InJobPos_First(
		long companyId, long groupId, long jobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2JobPosException;

	/**
	* Returns the first app role2 job pos in the ordered set where companyId = &#63; and groupId = &#63; and jobPosId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param jobPosId the job pos ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app role2 job pos, or <code>null</code> if a matching app role2 job pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.AppRole2JobPos fetchByC_G_InJobPos_First(
		long companyId, long groupId, long jobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last app role2 job pos in the ordered set where companyId = &#63; and groupId = &#63; and jobPosId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param jobPosId the job pos ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app role2 job pos
	* @throws org.oep.ssomgt.NoSuchAppRole2JobPosException if a matching app role2 job pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.AppRole2JobPos findByC_G_InJobPos_Last(
		long companyId, long groupId, long jobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2JobPosException;

	/**
	* Returns the last app role2 job pos in the ordered set where companyId = &#63; and groupId = &#63; and jobPosId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param jobPosId the job pos ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app role2 job pos, or <code>null</code> if a matching app role2 job pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.AppRole2JobPos fetchByC_G_InJobPos_Last(
		long companyId, long groupId, long jobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the app role2 job poses before and after the current app role2 job pos in the ordered set where companyId = &#63; and groupId = &#63; and jobPosId = &#63;.
	*
	* @param appRole2JobPosId the primary key of the current app role2 job pos
	* @param companyId the company ID
	* @param groupId the group ID
	* @param jobPosId the job pos ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next app role2 job pos
	* @throws org.oep.ssomgt.NoSuchAppRole2JobPosException if a app role2 job pos with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.AppRole2JobPos[] findByC_G_InJobPos_PrevAndNext(
		long appRole2JobPosId, long companyId, long groupId, long jobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2JobPosException;

	/**
	* Returns all the app role2 job poses where companyId = &#63; and groupId = &#63; and jobPosId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param jobPosIds the job pos IDs
	* @return the matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.ssomgt.model.AppRole2JobPos> findByC_G_InJobPos(
		long companyId, long groupId, long[] jobPosIds)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the app role2 job poses where companyId = &#63; and groupId = &#63; and jobPosId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param jobPosIds the job pos IDs
	* @param start the lower bound of the range of app role2 job poses
	* @param end the upper bound of the range of app role2 job poses (not inclusive)
	* @return the range of matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.ssomgt.model.AppRole2JobPos> findByC_G_InJobPos(
		long companyId, long groupId, long[] jobPosIds, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the app role2 job poses where companyId = &#63; and groupId = &#63; and jobPosId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param jobPosIds the job pos IDs
	* @param start the lower bound of the range of app role2 job poses
	* @param end the upper bound of the range of app role2 job poses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.ssomgt.model.AppRole2JobPos> findByC_G_InJobPos(
		long companyId, long groupId, long[] jobPosIds, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the app role2 job poses where companyId = &#63; and groupId = &#63; and jobPosId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param jobPosId the job pos ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_G_InJobPos(long companyId, long groupId, long jobPosId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of app role2 job poses where companyId = &#63; and groupId = &#63; and jobPosId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param jobPosId the job pos ID
	* @return the number of matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_G_InJobPos(long companyId, long groupId, long jobPosId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of app role2 job poses where companyId = &#63; and groupId = &#63; and jobPosId = any &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param jobPosIds the job pos IDs
	* @return the number of matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_G_InJobPos(long companyId, long groupId,
		long[] jobPosIds)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the app role2 job pos in the entity cache if it is enabled.
	*
	* @param appRole2JobPos the app role2 job pos
	*/
	public void cacheResult(org.oep.ssomgt.model.AppRole2JobPos appRole2JobPos);

	/**
	* Caches the app role2 job poses in the entity cache if it is enabled.
	*
	* @param appRole2JobPoses the app role2 job poses
	*/
	public void cacheResult(
		java.util.List<org.oep.ssomgt.model.AppRole2JobPos> appRole2JobPoses);

	/**
	* Creates a new app role2 job pos with the primary key. Does not add the app role2 job pos to the database.
	*
	* @param appRole2JobPosId the primary key for the new app role2 job pos
	* @return the new app role2 job pos
	*/
	public org.oep.ssomgt.model.AppRole2JobPos create(long appRole2JobPosId);

	/**
	* Removes the app role2 job pos with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param appRole2JobPosId the primary key of the app role2 job pos
	* @return the app role2 job pos that was removed
	* @throws org.oep.ssomgt.NoSuchAppRole2JobPosException if a app role2 job pos with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.AppRole2JobPos remove(long appRole2JobPosId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2JobPosException;

	public org.oep.ssomgt.model.AppRole2JobPos updateImpl(
		org.oep.ssomgt.model.AppRole2JobPos appRole2JobPos)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the app role2 job pos with the primary key or throws a {@link org.oep.ssomgt.NoSuchAppRole2JobPosException} if it could not be found.
	*
	* @param appRole2JobPosId the primary key of the app role2 job pos
	* @return the app role2 job pos
	* @throws org.oep.ssomgt.NoSuchAppRole2JobPosException if a app role2 job pos with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.AppRole2JobPos findByPrimaryKey(
		long appRole2JobPosId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRole2JobPosException;

	/**
	* Returns the app role2 job pos with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param appRole2JobPosId the primary key of the app role2 job pos
	* @return the app role2 job pos, or <code>null</code> if a app role2 job pos with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.AppRole2JobPos fetchByPrimaryKey(
		long appRole2JobPosId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the app role2 job poses.
	*
	* @return the app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.ssomgt.model.AppRole2JobPos> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the app role2 job poses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of app role2 job poses
	* @param end the upper bound of the range of app role2 job poses (not inclusive)
	* @return the range of app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.ssomgt.model.AppRole2JobPos> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the app role2 job poses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of app role2 job poses
	* @param end the upper bound of the range of app role2 job poses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.ssomgt.model.AppRole2JobPos> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the app role2 job poses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of app role2 job poses.
	*
	* @return the number of app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}