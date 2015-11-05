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

import org.oep.usermgt.model.WorkingUnit;

/**
 * The persistence interface for the Working Unit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NQMINH
 * @see WorkingUnitPersistenceImpl
 * @see WorkingUnitUtil
 * @generated
 */
public interface WorkingUnitPersistence extends BasePersistence<WorkingUnit> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link WorkingUnitUtil} to access the Working Unit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the Working Units where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.WorkingUnit> findByC(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the Working Units where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of Working Units
	* @param end the upper bound of the range of Working Units (not inclusive)
	* @return the range of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.WorkingUnit> findByC(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the Working Units where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of Working Units
	* @param end the upper bound of the range of Working Units (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.WorkingUnit> findByC(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first Working Unit in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit findByC_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException;

	/**
	* Returns the first Working Unit in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit fetchByC_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last Working Unit in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit findByC_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException;

	/**
	* Returns the last Working Unit in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit fetchByC_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Working Units before and after the current Working Unit in the ordered set where companyId = &#63;.
	*
	* @param workingUnitId the primary key of the current Working Unit
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a Working Unit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit[] findByC_PrevAndNext(
		long workingUnitId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException;

	/**
	* Removes all the Working Units where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of Working Units where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public int countByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the Working Units where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.WorkingUnit> findByG(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the Working Units where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of Working Units
	* @param end the upper bound of the range of Working Units (not inclusive)
	* @return the range of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.WorkingUnit> findByG(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the Working Units where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of Working Units
	* @param end the upper bound of the range of Working Units (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.WorkingUnit> findByG(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first Working Unit in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit findByG_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException;

	/**
	* Returns the first Working Unit in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit fetchByG_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last Working Unit in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit findByG_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException;

	/**
	* Returns the last Working Unit in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit fetchByG_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Working Units before and after the current Working Unit in the ordered set where groupId = &#63;.
	*
	* @param workingUnitId the primary key of the current Working Unit
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a Working Unit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit[] findByG_PrevAndNext(
		long workingUnitId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException;

	/**
	* Removes all the Working Units where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of Working Units where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public int countByG(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the Working Units where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.WorkingUnit> findByO(
		java.lang.String organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the Working Units where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of Working Units
	* @param end the upper bound of the range of Working Units (not inclusive)
	* @return the range of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.WorkingUnit> findByO(
		java.lang.String organizationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the Working Units where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of Working Units
	* @param end the upper bound of the range of Working Units (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.WorkingUnit> findByO(
		java.lang.String organizationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first Working Unit in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit findByO_First(
		java.lang.String organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException;

	/**
	* Returns the first Working Unit in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit fetchByO_First(
		java.lang.String organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last Working Unit in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit findByO_Last(
		java.lang.String organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException;

	/**
	* Returns the last Working Unit in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit fetchByO_Last(
		java.lang.String organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Working Units before and after the current Working Unit in the ordered set where organizationId = &#63;.
	*
	* @param workingUnitId the primary key of the current Working Unit
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a Working Unit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit[] findByO_PrevAndNext(
		long workingUnitId, java.lang.String organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException;

	/**
	* Removes all the Working Units where organizationId = &#63; from the database.
	*
	* @param organizationId the organization ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByO(java.lang.String organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of Working Units where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the number of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public int countByO(java.lang.String organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the Working Units where govAgencyId = &#63;.
	*
	* @param govAgencyId the gov agency ID
	* @return the matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.WorkingUnit> findByGA(
		java.lang.String govAgencyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the Working Units where govAgencyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param govAgencyId the gov agency ID
	* @param start the lower bound of the range of Working Units
	* @param end the upper bound of the range of Working Units (not inclusive)
	* @return the range of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.WorkingUnit> findByGA(
		java.lang.String govAgencyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the Working Units where govAgencyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param govAgencyId the gov agency ID
	* @param start the lower bound of the range of Working Units
	* @param end the upper bound of the range of Working Units (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.WorkingUnit> findByGA(
		java.lang.String govAgencyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first Working Unit in the ordered set where govAgencyId = &#63;.
	*
	* @param govAgencyId the gov agency ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit findByGA_First(
		java.lang.String govAgencyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException;

	/**
	* Returns the first Working Unit in the ordered set where govAgencyId = &#63;.
	*
	* @param govAgencyId the gov agency ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit fetchByGA_First(
		java.lang.String govAgencyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last Working Unit in the ordered set where govAgencyId = &#63;.
	*
	* @param govAgencyId the gov agency ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit findByGA_Last(
		java.lang.String govAgencyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException;

	/**
	* Returns the last Working Unit in the ordered set where govAgencyId = &#63;.
	*
	* @param govAgencyId the gov agency ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit fetchByGA_Last(
		java.lang.String govAgencyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Working Units before and after the current Working Unit in the ordered set where govAgencyId = &#63;.
	*
	* @param workingUnitId the primary key of the current Working Unit
	* @param govAgencyId the gov agency ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a Working Unit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit[] findByGA_PrevAndNext(
		long workingUnitId, java.lang.String govAgencyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException;

	/**
	* Removes all the Working Units where govAgencyId = &#63; from the database.
	*
	* @param govAgencyId the gov agency ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGA(java.lang.String govAgencyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of Working Units where govAgencyId = &#63;.
	*
	* @param govAgencyId the gov agency ID
	* @return the number of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public int countByGA(java.lang.String govAgencyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the Working Units where cityNo = &#63;.
	*
	* @param cityNo the city no
	* @return the matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.WorkingUnit> findByCN(
		java.lang.String cityNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the Working Units where cityNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param cityNo the city no
	* @param start the lower bound of the range of Working Units
	* @param end the upper bound of the range of Working Units (not inclusive)
	* @return the range of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.WorkingUnit> findByCN(
		java.lang.String cityNo, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the Working Units where cityNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param cityNo the city no
	* @param start the lower bound of the range of Working Units
	* @param end the upper bound of the range of Working Units (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.WorkingUnit> findByCN(
		java.lang.String cityNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first Working Unit in the ordered set where cityNo = &#63;.
	*
	* @param cityNo the city no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit findByCN_First(
		java.lang.String cityNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException;

	/**
	* Returns the first Working Unit in the ordered set where cityNo = &#63;.
	*
	* @param cityNo the city no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit fetchByCN_First(
		java.lang.String cityNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last Working Unit in the ordered set where cityNo = &#63;.
	*
	* @param cityNo the city no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit findByCN_Last(
		java.lang.String cityNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException;

	/**
	* Returns the last Working Unit in the ordered set where cityNo = &#63;.
	*
	* @param cityNo the city no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit fetchByCN_Last(
		java.lang.String cityNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Working Units before and after the current Working Unit in the ordered set where cityNo = &#63;.
	*
	* @param workingUnitId the primary key of the current Working Unit
	* @param cityNo the city no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a Working Unit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit[] findByCN_PrevAndNext(
		long workingUnitId, java.lang.String cityNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException;

	/**
	* Removes all the Working Units where cityNo = &#63; from the database.
	*
	* @param cityNo the city no
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCN(java.lang.String cityNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of Working Units where cityNo = &#63;.
	*
	* @param cityNo the city no
	* @return the number of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public int countByCN(java.lang.String cityNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the Working Units where districtNo = &#63;.
	*
	* @param districtNo the district no
	* @return the matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.WorkingUnit> findByDN(
		java.lang.String districtNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the Working Units where districtNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param districtNo the district no
	* @param start the lower bound of the range of Working Units
	* @param end the upper bound of the range of Working Units (not inclusive)
	* @return the range of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.WorkingUnit> findByDN(
		java.lang.String districtNo, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the Working Units where districtNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param districtNo the district no
	* @param start the lower bound of the range of Working Units
	* @param end the upper bound of the range of Working Units (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.WorkingUnit> findByDN(
		java.lang.String districtNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first Working Unit in the ordered set where districtNo = &#63;.
	*
	* @param districtNo the district no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit findByDN_First(
		java.lang.String districtNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException;

	/**
	* Returns the first Working Unit in the ordered set where districtNo = &#63;.
	*
	* @param districtNo the district no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit fetchByDN_First(
		java.lang.String districtNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last Working Unit in the ordered set where districtNo = &#63;.
	*
	* @param districtNo the district no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit findByDN_Last(
		java.lang.String districtNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException;

	/**
	* Returns the last Working Unit in the ordered set where districtNo = &#63;.
	*
	* @param districtNo the district no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit fetchByDN_Last(
		java.lang.String districtNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Working Units before and after the current Working Unit in the ordered set where districtNo = &#63;.
	*
	* @param workingUnitId the primary key of the current Working Unit
	* @param districtNo the district no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a Working Unit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit[] findByDN_PrevAndNext(
		long workingUnitId, java.lang.String districtNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException;

	/**
	* Removes all the Working Units where districtNo = &#63; from the database.
	*
	* @param districtNo the district no
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDN(java.lang.String districtNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of Working Units where districtNo = &#63;.
	*
	* @param districtNo the district no
	* @return the number of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public int countByDN(java.lang.String districtNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the Working Units where wardNo = &#63;.
	*
	* @param wardNo the ward no
	* @return the matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.WorkingUnit> findByWA(
		java.lang.String wardNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the Working Units where wardNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param wardNo the ward no
	* @param start the lower bound of the range of Working Units
	* @param end the upper bound of the range of Working Units (not inclusive)
	* @return the range of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.WorkingUnit> findByWA(
		java.lang.String wardNo, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the Working Units where wardNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param wardNo the ward no
	* @param start the lower bound of the range of Working Units
	* @param end the upper bound of the range of Working Units (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.WorkingUnit> findByWA(
		java.lang.String wardNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first Working Unit in the ordered set where wardNo = &#63;.
	*
	* @param wardNo the ward no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit findByWA_First(
		java.lang.String wardNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException;

	/**
	* Returns the first Working Unit in the ordered set where wardNo = &#63;.
	*
	* @param wardNo the ward no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit fetchByWA_First(
		java.lang.String wardNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last Working Unit in the ordered set where wardNo = &#63;.
	*
	* @param wardNo the ward no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit findByWA_Last(
		java.lang.String wardNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException;

	/**
	* Returns the last Working Unit in the ordered set where wardNo = &#63;.
	*
	* @param wardNo the ward no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit fetchByWA_Last(
		java.lang.String wardNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Working Units before and after the current Working Unit in the ordered set where wardNo = &#63;.
	*
	* @param workingUnitId the primary key of the current Working Unit
	* @param wardNo the ward no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a Working Unit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit[] findByWA_PrevAndNext(
		long workingUnitId, java.lang.String wardNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException;

	/**
	* Removes all the Working Units where wardNo = &#63; from the database.
	*
	* @param wardNo the ward no
	* @throws SystemException if a system exception occurred
	*/
	public void removeByWA(java.lang.String wardNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of Working Units where wardNo = &#63;.
	*
	* @param wardNo the ward no
	* @return the number of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public int countByWA(java.lang.String wardNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the Working Units where parentWorkingUnitId = &#63;.
	*
	* @param parentWorkingUnitId the parent working unit ID
	* @return the matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.WorkingUnit> findByPW(
		long parentWorkingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the Working Units where parentWorkingUnitId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param parentWorkingUnitId the parent working unit ID
	* @param start the lower bound of the range of Working Units
	* @param end the upper bound of the range of Working Units (not inclusive)
	* @return the range of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.WorkingUnit> findByPW(
		long parentWorkingUnitId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the Working Units where parentWorkingUnitId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param parentWorkingUnitId the parent working unit ID
	* @param start the lower bound of the range of Working Units
	* @param end the upper bound of the range of Working Units (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.WorkingUnit> findByPW(
		long parentWorkingUnitId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first Working Unit in the ordered set where parentWorkingUnitId = &#63;.
	*
	* @param parentWorkingUnitId the parent working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit findByPW_First(
		long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException;

	/**
	* Returns the first Working Unit in the ordered set where parentWorkingUnitId = &#63;.
	*
	* @param parentWorkingUnitId the parent working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit fetchByPW_First(
		long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last Working Unit in the ordered set where parentWorkingUnitId = &#63;.
	*
	* @param parentWorkingUnitId the parent working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit findByPW_Last(
		long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException;

	/**
	* Returns the last Working Unit in the ordered set where parentWorkingUnitId = &#63;.
	*
	* @param parentWorkingUnitId the parent working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit fetchByPW_Last(
		long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Working Units before and after the current Working Unit in the ordered set where parentWorkingUnitId = &#63;.
	*
	* @param workingUnitId the primary key of the current Working Unit
	* @param parentWorkingUnitId the parent working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a Working Unit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit[] findByPW_PrevAndNext(
		long workingUnitId, long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException;

	/**
	* Removes all the Working Units where parentWorkingUnitId = &#63; from the database.
	*
	* @param parentWorkingUnitId the parent working unit ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPW(long parentWorkingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of Working Units where parentWorkingUnitId = &#63;.
	*
	* @param parentWorkingUnitId the parent working unit ID
	* @return the number of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public int countByPW(long parentWorkingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the Working Units where companyId = &#63; and parentWorkingUnitId = &#63;.
	*
	* @param companyId the company ID
	* @param parentWorkingUnitId the parent working unit ID
	* @return the matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.WorkingUnit> findByC_PW(
		long companyId, long parentWorkingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the Working Units where companyId = &#63; and parentWorkingUnitId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param parentWorkingUnitId the parent working unit ID
	* @param start the lower bound of the range of Working Units
	* @param end the upper bound of the range of Working Units (not inclusive)
	* @return the range of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.WorkingUnit> findByC_PW(
		long companyId, long parentWorkingUnitId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the Working Units where companyId = &#63; and parentWorkingUnitId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param parentWorkingUnitId the parent working unit ID
	* @param start the lower bound of the range of Working Units
	* @param end the upper bound of the range of Working Units (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.WorkingUnit> findByC_PW(
		long companyId, long parentWorkingUnitId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first Working Unit in the ordered set where companyId = &#63; and parentWorkingUnitId = &#63;.
	*
	* @param companyId the company ID
	* @param parentWorkingUnitId the parent working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit findByC_PW_First(long companyId,
		long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException;

	/**
	* Returns the first Working Unit in the ordered set where companyId = &#63; and parentWorkingUnitId = &#63;.
	*
	* @param companyId the company ID
	* @param parentWorkingUnitId the parent working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit fetchByC_PW_First(long companyId,
		long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last Working Unit in the ordered set where companyId = &#63; and parentWorkingUnitId = &#63;.
	*
	* @param companyId the company ID
	* @param parentWorkingUnitId the parent working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit findByC_PW_Last(long companyId,
		long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException;

	/**
	* Returns the last Working Unit in the ordered set where companyId = &#63; and parentWorkingUnitId = &#63;.
	*
	* @param companyId the company ID
	* @param parentWorkingUnitId the parent working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit fetchByC_PW_Last(long companyId,
		long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Working Units before and after the current Working Unit in the ordered set where companyId = &#63; and parentWorkingUnitId = &#63;.
	*
	* @param workingUnitId the primary key of the current Working Unit
	* @param companyId the company ID
	* @param parentWorkingUnitId the parent working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a Working Unit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit[] findByC_PW_PrevAndNext(
		long workingUnitId, long companyId, long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException;

	/**
	* Removes all the Working Units where companyId = &#63; and parentWorkingUnitId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param parentWorkingUnitId the parent working unit ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_PW(long companyId, long parentWorkingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of Working Units where companyId = &#63; and parentWorkingUnitId = &#63;.
	*
	* @param companyId the company ID
	* @param parentWorkingUnitId the parent working unit ID
	* @return the number of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_PW(long companyId, long parentWorkingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the Working Units where groupId = &#63; and parentWorkingUnitId = &#63;.
	*
	* @param groupId the group ID
	* @param parentWorkingUnitId the parent working unit ID
	* @return the matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.WorkingUnit> findByG_PW(
		long groupId, long parentWorkingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the Working Units where groupId = &#63; and parentWorkingUnitId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param parentWorkingUnitId the parent working unit ID
	* @param start the lower bound of the range of Working Units
	* @param end the upper bound of the range of Working Units (not inclusive)
	* @return the range of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.WorkingUnit> findByG_PW(
		long groupId, long parentWorkingUnitId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the Working Units where groupId = &#63; and parentWorkingUnitId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param parentWorkingUnitId the parent working unit ID
	* @param start the lower bound of the range of Working Units
	* @param end the upper bound of the range of Working Units (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.WorkingUnit> findByG_PW(
		long groupId, long parentWorkingUnitId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first Working Unit in the ordered set where groupId = &#63; and parentWorkingUnitId = &#63;.
	*
	* @param groupId the group ID
	* @param parentWorkingUnitId the parent working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit findByG_PW_First(long groupId,
		long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException;

	/**
	* Returns the first Working Unit in the ordered set where groupId = &#63; and parentWorkingUnitId = &#63;.
	*
	* @param groupId the group ID
	* @param parentWorkingUnitId the parent working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit fetchByG_PW_First(long groupId,
		long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last Working Unit in the ordered set where groupId = &#63; and parentWorkingUnitId = &#63;.
	*
	* @param groupId the group ID
	* @param parentWorkingUnitId the parent working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit findByG_PW_Last(long groupId,
		long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException;

	/**
	* Returns the last Working Unit in the ordered set where groupId = &#63; and parentWorkingUnitId = &#63;.
	*
	* @param groupId the group ID
	* @param parentWorkingUnitId the parent working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit fetchByG_PW_Last(long groupId,
		long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Working Units before and after the current Working Unit in the ordered set where groupId = &#63; and parentWorkingUnitId = &#63;.
	*
	* @param workingUnitId the primary key of the current Working Unit
	* @param groupId the group ID
	* @param parentWorkingUnitId the parent working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a Working Unit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit[] findByG_PW_PrevAndNext(
		long workingUnitId, long groupId, long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException;

	/**
	* Removes all the Working Units where groupId = &#63; and parentWorkingUnitId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param parentWorkingUnitId the parent working unit ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_PW(long groupId, long parentWorkingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of Working Units where groupId = &#63; and parentWorkingUnitId = &#63;.
	*
	* @param groupId the group ID
	* @param parentWorkingUnitId the parent working unit ID
	* @return the number of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_PW(long groupId, long parentWorkingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the Working Unit in the entity cache if it is enabled.
	*
	* @param workingUnit the Working Unit
	*/
	public void cacheResult(org.oep.usermgt.model.WorkingUnit workingUnit);

	/**
	* Caches the Working Units in the entity cache if it is enabled.
	*
	* @param workingUnits the Working Units
	*/
	public void cacheResult(
		java.util.List<org.oep.usermgt.model.WorkingUnit> workingUnits);

	/**
	* Creates a new Working Unit with the primary key. Does not add the Working Unit to the database.
	*
	* @param workingUnitId the primary key for the new Working Unit
	* @return the new Working Unit
	*/
	public org.oep.usermgt.model.WorkingUnit create(long workingUnitId);

	/**
	* Removes the Working Unit with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param workingUnitId the primary key of the Working Unit
	* @return the Working Unit that was removed
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a Working Unit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit remove(long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException;

	public org.oep.usermgt.model.WorkingUnit updateImpl(
		org.oep.usermgt.model.WorkingUnit workingUnit)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Working Unit with the primary key or throws a {@link org.oep.usermgt.NoSuchWorkingUnitException} if it could not be found.
	*
	* @param workingUnitId the primary key of the Working Unit
	* @return the Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a Working Unit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit findByPrimaryKey(
		long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException;

	/**
	* Returns the Working Unit with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param workingUnitId the primary key of the Working Unit
	* @return the Working Unit, or <code>null</code> if a Working Unit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.WorkingUnit fetchByPrimaryKey(
		long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the Working Units.
	*
	* @return the Working Units
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.WorkingUnit> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the Working Units.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Working Units
	* @param end the upper bound of the range of Working Units (not inclusive)
	* @return the range of Working Units
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.WorkingUnit> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the Working Units.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.WorkingUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Working Units
	* @param end the upper bound of the range of Working Units (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of Working Units
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.WorkingUnit> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the Working Units from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of Working Units.
	*
	* @return the number of Working Units
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}