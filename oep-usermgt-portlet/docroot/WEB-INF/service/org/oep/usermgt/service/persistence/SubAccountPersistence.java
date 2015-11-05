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

import org.oep.usermgt.model.SubAccount;

/**
 * The persistence interface for the sub account service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NQMINH
 * @see SubAccountPersistenceImpl
 * @see SubAccountUtil
 * @generated
 */
public interface SubAccountPersistence extends BasePersistence<SubAccount> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SubAccountUtil} to access the sub account persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the sub accounts where businessId = &#63;.
	*
	* @param businessId the business ID
	* @return the matching sub accounts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.SubAccount> findByB(
		long businessId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the sub accounts where businessId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.SubAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param businessId the business ID
	* @param start the lower bound of the range of sub accounts
	* @param end the upper bound of the range of sub accounts (not inclusive)
	* @return the range of matching sub accounts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.SubAccount> findByB(
		long businessId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the sub accounts where businessId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.SubAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param businessId the business ID
	* @param start the lower bound of the range of sub accounts
	* @param end the upper bound of the range of sub accounts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching sub accounts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.SubAccount> findByB(
		long businessId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first sub account in the ordered set where businessId = &#63;.
	*
	* @param businessId the business ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sub account
	* @throws org.oep.usermgt.NoSuchSubAccountException if a matching sub account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.SubAccount findByB_First(long businessId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchSubAccountException;

	/**
	* Returns the first sub account in the ordered set where businessId = &#63;.
	*
	* @param businessId the business ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sub account, or <code>null</code> if a matching sub account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.SubAccount fetchByB_First(long businessId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last sub account in the ordered set where businessId = &#63;.
	*
	* @param businessId the business ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sub account
	* @throws org.oep.usermgt.NoSuchSubAccountException if a matching sub account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.SubAccount findByB_Last(long businessId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchSubAccountException;

	/**
	* Returns the last sub account in the ordered set where businessId = &#63;.
	*
	* @param businessId the business ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sub account, or <code>null</code> if a matching sub account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.SubAccount fetchByB_Last(long businessId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the sub accounts before and after the current sub account in the ordered set where businessId = &#63;.
	*
	* @param subAccountId the primary key of the current sub account
	* @param businessId the business ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next sub account
	* @throws org.oep.usermgt.NoSuchSubAccountException if a sub account with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.SubAccount[] findByB_PrevAndNext(
		long subAccountId, long businessId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchSubAccountException;

	/**
	* Removes all the sub accounts where businessId = &#63; from the database.
	*
	* @param businessId the business ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByB(long businessId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of sub accounts where businessId = &#63;.
	*
	* @param businessId the business ID
	* @return the number of matching sub accounts
	* @throws SystemException if a system exception occurred
	*/
	public int countByB(long businessId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the sub accounts where mappingUserId = &#63;.
	*
	* @param mappingUserId the mapping user ID
	* @return the matching sub accounts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.SubAccount> findByMU(
		long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the sub accounts where mappingUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.SubAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mappingUserId the mapping user ID
	* @param start the lower bound of the range of sub accounts
	* @param end the upper bound of the range of sub accounts (not inclusive)
	* @return the range of matching sub accounts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.SubAccount> findByMU(
		long mappingUserId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the sub accounts where mappingUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.SubAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mappingUserId the mapping user ID
	* @param start the lower bound of the range of sub accounts
	* @param end the upper bound of the range of sub accounts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching sub accounts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.SubAccount> findByMU(
		long mappingUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first sub account in the ordered set where mappingUserId = &#63;.
	*
	* @param mappingUserId the mapping user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sub account
	* @throws org.oep.usermgt.NoSuchSubAccountException if a matching sub account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.SubAccount findByMU_First(long mappingUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchSubAccountException;

	/**
	* Returns the first sub account in the ordered set where mappingUserId = &#63;.
	*
	* @param mappingUserId the mapping user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sub account, or <code>null</code> if a matching sub account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.SubAccount fetchByMU_First(
		long mappingUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last sub account in the ordered set where mappingUserId = &#63;.
	*
	* @param mappingUserId the mapping user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sub account
	* @throws org.oep.usermgt.NoSuchSubAccountException if a matching sub account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.SubAccount findByMU_Last(long mappingUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchSubAccountException;

	/**
	* Returns the last sub account in the ordered set where mappingUserId = &#63;.
	*
	* @param mappingUserId the mapping user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sub account, or <code>null</code> if a matching sub account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.SubAccount fetchByMU_Last(long mappingUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the sub accounts before and after the current sub account in the ordered set where mappingUserId = &#63;.
	*
	* @param subAccountId the primary key of the current sub account
	* @param mappingUserId the mapping user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next sub account
	* @throws org.oep.usermgt.NoSuchSubAccountException if a sub account with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.SubAccount[] findByMU_PrevAndNext(
		long subAccountId, long mappingUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchSubAccountException;

	/**
	* Removes all the sub accounts where mappingUserId = &#63; from the database.
	*
	* @param mappingUserId the mapping user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByMU(long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of sub accounts where mappingUserId = &#63;.
	*
	* @param mappingUserId the mapping user ID
	* @return the number of matching sub accounts
	* @throws SystemException if a system exception occurred
	*/
	public int countByMU(long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the sub account where businessId = &#63; and mappingUserId = &#63; or throws a {@link org.oep.usermgt.NoSuchSubAccountException} if it could not be found.
	*
	* @param businessId the business ID
	* @param mappingUserId the mapping user ID
	* @return the matching sub account
	* @throws org.oep.usermgt.NoSuchSubAccountException if a matching sub account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.SubAccount findByB_MU(long businessId,
		long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchSubAccountException;

	/**
	* Returns the sub account where businessId = &#63; and mappingUserId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param businessId the business ID
	* @param mappingUserId the mapping user ID
	* @return the matching sub account, or <code>null</code> if a matching sub account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.SubAccount fetchByB_MU(long businessId,
		long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the sub account where businessId = &#63; and mappingUserId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param businessId the business ID
	* @param mappingUserId the mapping user ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching sub account, or <code>null</code> if a matching sub account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.SubAccount fetchByB_MU(long businessId,
		long mappingUserId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the sub account where businessId = &#63; and mappingUserId = &#63; from the database.
	*
	* @param businessId the business ID
	* @param mappingUserId the mapping user ID
	* @return the sub account that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.SubAccount removeByB_MU(long businessId,
		long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchSubAccountException;

	/**
	* Returns the number of sub accounts where businessId = &#63; and mappingUserId = &#63;.
	*
	* @param businessId the business ID
	* @param mappingUserId the mapping user ID
	* @return the number of matching sub accounts
	* @throws SystemException if a system exception occurred
	*/
	public int countByB_MU(long businessId, long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the sub accounts where businessId = &#63; and workingRole = &#63;.
	*
	* @param businessId the business ID
	* @param workingRole the working role
	* @return the matching sub accounts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.SubAccount> findByB_WR(
		long businessId, java.lang.String workingRole)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the sub accounts where businessId = &#63; and workingRole = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.SubAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param businessId the business ID
	* @param workingRole the working role
	* @param start the lower bound of the range of sub accounts
	* @param end the upper bound of the range of sub accounts (not inclusive)
	* @return the range of matching sub accounts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.SubAccount> findByB_WR(
		long businessId, java.lang.String workingRole, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the sub accounts where businessId = &#63; and workingRole = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.SubAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param businessId the business ID
	* @param workingRole the working role
	* @param start the lower bound of the range of sub accounts
	* @param end the upper bound of the range of sub accounts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching sub accounts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.SubAccount> findByB_WR(
		long businessId, java.lang.String workingRole, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first sub account in the ordered set where businessId = &#63; and workingRole = &#63;.
	*
	* @param businessId the business ID
	* @param workingRole the working role
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sub account
	* @throws org.oep.usermgt.NoSuchSubAccountException if a matching sub account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.SubAccount findByB_WR_First(long businessId,
		java.lang.String workingRole,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchSubAccountException;

	/**
	* Returns the first sub account in the ordered set where businessId = &#63; and workingRole = &#63;.
	*
	* @param businessId the business ID
	* @param workingRole the working role
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sub account, or <code>null</code> if a matching sub account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.SubAccount fetchByB_WR_First(long businessId,
		java.lang.String workingRole,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last sub account in the ordered set where businessId = &#63; and workingRole = &#63;.
	*
	* @param businessId the business ID
	* @param workingRole the working role
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sub account
	* @throws org.oep.usermgt.NoSuchSubAccountException if a matching sub account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.SubAccount findByB_WR_Last(long businessId,
		java.lang.String workingRole,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchSubAccountException;

	/**
	* Returns the last sub account in the ordered set where businessId = &#63; and workingRole = &#63;.
	*
	* @param businessId the business ID
	* @param workingRole the working role
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sub account, or <code>null</code> if a matching sub account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.SubAccount fetchByB_WR_Last(long businessId,
		java.lang.String workingRole,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the sub accounts before and after the current sub account in the ordered set where businessId = &#63; and workingRole = &#63;.
	*
	* @param subAccountId the primary key of the current sub account
	* @param businessId the business ID
	* @param workingRole the working role
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next sub account
	* @throws org.oep.usermgt.NoSuchSubAccountException if a sub account with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.SubAccount[] findByB_WR_PrevAndNext(
		long subAccountId, long businessId, java.lang.String workingRole,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchSubAccountException;

	/**
	* Removes all the sub accounts where businessId = &#63; and workingRole = &#63; from the database.
	*
	* @param businessId the business ID
	* @param workingRole the working role
	* @throws SystemException if a system exception occurred
	*/
	public void removeByB_WR(long businessId, java.lang.String workingRole)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of sub accounts where businessId = &#63; and workingRole = &#63;.
	*
	* @param businessId the business ID
	* @param workingRole the working role
	* @return the number of matching sub accounts
	* @throws SystemException if a system exception occurred
	*/
	public int countByB_WR(long businessId, java.lang.String workingRole)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the sub account in the entity cache if it is enabled.
	*
	* @param subAccount the sub account
	*/
	public void cacheResult(org.oep.usermgt.model.SubAccount subAccount);

	/**
	* Caches the sub accounts in the entity cache if it is enabled.
	*
	* @param subAccounts the sub accounts
	*/
	public void cacheResult(
		java.util.List<org.oep.usermgt.model.SubAccount> subAccounts);

	/**
	* Creates a new sub account with the primary key. Does not add the sub account to the database.
	*
	* @param subAccountId the primary key for the new sub account
	* @return the new sub account
	*/
	public org.oep.usermgt.model.SubAccount create(long subAccountId);

	/**
	* Removes the sub account with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param subAccountId the primary key of the sub account
	* @return the sub account that was removed
	* @throws org.oep.usermgt.NoSuchSubAccountException if a sub account with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.SubAccount remove(long subAccountId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchSubAccountException;

	public org.oep.usermgt.model.SubAccount updateImpl(
		org.oep.usermgt.model.SubAccount subAccount)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the sub account with the primary key or throws a {@link org.oep.usermgt.NoSuchSubAccountException} if it could not be found.
	*
	* @param subAccountId the primary key of the sub account
	* @return the sub account
	* @throws org.oep.usermgt.NoSuchSubAccountException if a sub account with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.SubAccount findByPrimaryKey(long subAccountId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchSubAccountException;

	/**
	* Returns the sub account with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param subAccountId the primary key of the sub account
	* @return the sub account, or <code>null</code> if a sub account with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.SubAccount fetchByPrimaryKey(long subAccountId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the sub accounts.
	*
	* @return the sub accounts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.SubAccount> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the sub accounts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.SubAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sub accounts
	* @param end the upper bound of the range of sub accounts (not inclusive)
	* @return the range of sub accounts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.SubAccount> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the sub accounts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.SubAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sub accounts
	* @param end the upper bound of the range of sub accounts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of sub accounts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.SubAccount> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the sub accounts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of sub accounts.
	*
	* @return the number of sub accounts
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}