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

import org.oep.usermgt.model.Delegacy;

/**
 * The persistence interface for the delegacy service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NQMINH
 * @see DelegacyPersistenceImpl
 * @see DelegacyUtil
 * @generated
 */
public interface DelegacyPersistence extends BasePersistence<Delegacy> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DelegacyUtil} to access the delegacy persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the delegacies where fromEmployeeId = &#63;.
	*
	* @param fromEmployeeId the from employee ID
	* @return the matching delegacies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Delegacy> findByFE(
		long fromEmployeeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the delegacies where fromEmployeeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.DelegacyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fromEmployeeId the from employee ID
	* @param start the lower bound of the range of delegacies
	* @param end the upper bound of the range of delegacies (not inclusive)
	* @return the range of matching delegacies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Delegacy> findByFE(
		long fromEmployeeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the delegacies where fromEmployeeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.DelegacyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fromEmployeeId the from employee ID
	* @param start the lower bound of the range of delegacies
	* @param end the upper bound of the range of delegacies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching delegacies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Delegacy> findByFE(
		long fromEmployeeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first delegacy in the ordered set where fromEmployeeId = &#63;.
	*
	* @param fromEmployeeId the from employee ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching delegacy
	* @throws org.oep.usermgt.NoSuchDelegacyException if a matching delegacy could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Delegacy findByFE_First(long fromEmployeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchDelegacyException;

	/**
	* Returns the first delegacy in the ordered set where fromEmployeeId = &#63;.
	*
	* @param fromEmployeeId the from employee ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching delegacy, or <code>null</code> if a matching delegacy could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Delegacy fetchByFE_First(long fromEmployeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last delegacy in the ordered set where fromEmployeeId = &#63;.
	*
	* @param fromEmployeeId the from employee ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching delegacy
	* @throws org.oep.usermgt.NoSuchDelegacyException if a matching delegacy could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Delegacy findByFE_Last(long fromEmployeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchDelegacyException;

	/**
	* Returns the last delegacy in the ordered set where fromEmployeeId = &#63;.
	*
	* @param fromEmployeeId the from employee ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching delegacy, or <code>null</code> if a matching delegacy could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Delegacy fetchByFE_Last(long fromEmployeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the delegacies before and after the current delegacy in the ordered set where fromEmployeeId = &#63;.
	*
	* @param delegacyId the primary key of the current delegacy
	* @param fromEmployeeId the from employee ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next delegacy
	* @throws org.oep.usermgt.NoSuchDelegacyException if a delegacy with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Delegacy[] findByFE_PrevAndNext(
		long delegacyId, long fromEmployeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchDelegacyException;

	/**
	* Removes all the delegacies where fromEmployeeId = &#63; from the database.
	*
	* @param fromEmployeeId the from employee ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFE(long fromEmployeeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of delegacies where fromEmployeeId = &#63;.
	*
	* @param fromEmployeeId the from employee ID
	* @return the number of matching delegacies
	* @throws SystemException if a system exception occurred
	*/
	public int countByFE(long fromEmployeeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the delegacies where toEmployeeId = &#63;.
	*
	* @param toEmployeeId the to employee ID
	* @return the matching delegacies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Delegacy> findByTE(
		long toEmployeeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the delegacies where toEmployeeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.DelegacyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param toEmployeeId the to employee ID
	* @param start the lower bound of the range of delegacies
	* @param end the upper bound of the range of delegacies (not inclusive)
	* @return the range of matching delegacies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Delegacy> findByTE(
		long toEmployeeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the delegacies where toEmployeeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.DelegacyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param toEmployeeId the to employee ID
	* @param start the lower bound of the range of delegacies
	* @param end the upper bound of the range of delegacies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching delegacies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Delegacy> findByTE(
		long toEmployeeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first delegacy in the ordered set where toEmployeeId = &#63;.
	*
	* @param toEmployeeId the to employee ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching delegacy
	* @throws org.oep.usermgt.NoSuchDelegacyException if a matching delegacy could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Delegacy findByTE_First(long toEmployeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchDelegacyException;

	/**
	* Returns the first delegacy in the ordered set where toEmployeeId = &#63;.
	*
	* @param toEmployeeId the to employee ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching delegacy, or <code>null</code> if a matching delegacy could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Delegacy fetchByTE_First(long toEmployeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last delegacy in the ordered set where toEmployeeId = &#63;.
	*
	* @param toEmployeeId the to employee ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching delegacy
	* @throws org.oep.usermgt.NoSuchDelegacyException if a matching delegacy could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Delegacy findByTE_Last(long toEmployeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchDelegacyException;

	/**
	* Returns the last delegacy in the ordered set where toEmployeeId = &#63;.
	*
	* @param toEmployeeId the to employee ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching delegacy, or <code>null</code> if a matching delegacy could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Delegacy fetchByTE_Last(long toEmployeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the delegacies before and after the current delegacy in the ordered set where toEmployeeId = &#63;.
	*
	* @param delegacyId the primary key of the current delegacy
	* @param toEmployeeId the to employee ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next delegacy
	* @throws org.oep.usermgt.NoSuchDelegacyException if a delegacy with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Delegacy[] findByTE_PrevAndNext(
		long delegacyId, long toEmployeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchDelegacyException;

	/**
	* Removes all the delegacies where toEmployeeId = &#63; from the database.
	*
	* @param toEmployeeId the to employee ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTE(long toEmployeeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of delegacies where toEmployeeId = &#63;.
	*
	* @param toEmployeeId the to employee ID
	* @return the number of matching delegacies
	* @throws SystemException if a system exception occurred
	*/
	public int countByTE(long toEmployeeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the delegacy where toEmployeeId = &#63; and roleId = &#63; or throws a {@link org.oep.usermgt.NoSuchDelegacyException} if it could not be found.
	*
	* @param toEmployeeId the to employee ID
	* @param roleId the role ID
	* @return the matching delegacy
	* @throws org.oep.usermgt.NoSuchDelegacyException if a matching delegacy could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Delegacy findByTE_R(long toEmployeeId,
		long roleId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchDelegacyException;

	/**
	* Returns the delegacy where toEmployeeId = &#63; and roleId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param toEmployeeId the to employee ID
	* @param roleId the role ID
	* @return the matching delegacy, or <code>null</code> if a matching delegacy could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Delegacy fetchByTE_R(long toEmployeeId,
		long roleId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the delegacy where toEmployeeId = &#63; and roleId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param toEmployeeId the to employee ID
	* @param roleId the role ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching delegacy, or <code>null</code> if a matching delegacy could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Delegacy fetchByTE_R(long toEmployeeId,
		long roleId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the delegacy where toEmployeeId = &#63; and roleId = &#63; from the database.
	*
	* @param toEmployeeId the to employee ID
	* @param roleId the role ID
	* @return the delegacy that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Delegacy removeByTE_R(long toEmployeeId,
		long roleId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchDelegacyException;

	/**
	* Returns the number of delegacies where toEmployeeId = &#63; and roleId = &#63;.
	*
	* @param toEmployeeId the to employee ID
	* @param roleId the role ID
	* @return the number of matching delegacies
	* @throws SystemException if a system exception occurred
	*/
	public int countByTE_R(long toEmployeeId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the delegacy in the entity cache if it is enabled.
	*
	* @param delegacy the delegacy
	*/
	public void cacheResult(org.oep.usermgt.model.Delegacy delegacy);

	/**
	* Caches the delegacies in the entity cache if it is enabled.
	*
	* @param delegacies the delegacies
	*/
	public void cacheResult(
		java.util.List<org.oep.usermgt.model.Delegacy> delegacies);

	/**
	* Creates a new delegacy with the primary key. Does not add the delegacy to the database.
	*
	* @param delegacyId the primary key for the new delegacy
	* @return the new delegacy
	*/
	public org.oep.usermgt.model.Delegacy create(long delegacyId);

	/**
	* Removes the delegacy with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param delegacyId the primary key of the delegacy
	* @return the delegacy that was removed
	* @throws org.oep.usermgt.NoSuchDelegacyException if a delegacy with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Delegacy remove(long delegacyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchDelegacyException;

	public org.oep.usermgt.model.Delegacy updateImpl(
		org.oep.usermgt.model.Delegacy delegacy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the delegacy with the primary key or throws a {@link org.oep.usermgt.NoSuchDelegacyException} if it could not be found.
	*
	* @param delegacyId the primary key of the delegacy
	* @return the delegacy
	* @throws org.oep.usermgt.NoSuchDelegacyException if a delegacy with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Delegacy findByPrimaryKey(long delegacyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchDelegacyException;

	/**
	* Returns the delegacy with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param delegacyId the primary key of the delegacy
	* @return the delegacy, or <code>null</code> if a delegacy with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Delegacy fetchByPrimaryKey(long delegacyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the delegacies.
	*
	* @return the delegacies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Delegacy> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the delegacies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.DelegacyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of delegacies
	* @param end the upper bound of the range of delegacies (not inclusive)
	* @return the range of delegacies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Delegacy> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the delegacies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.DelegacyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of delegacies
	* @param end the upper bound of the range of delegacies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of delegacies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Delegacy> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the delegacies from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of delegacies.
	*
	* @return the number of delegacies
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}