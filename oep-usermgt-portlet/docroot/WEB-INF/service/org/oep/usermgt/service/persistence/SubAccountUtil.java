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

import org.oep.usermgt.model.SubAccount;

import java.util.List;

/**
 * The persistence utility for the sub account service. This utility wraps {@link SubAccountPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NQMINH
 * @see SubAccountPersistence
 * @see SubAccountPersistenceImpl
 * @generated
 */
public class SubAccountUtil {
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
	public static void clearCache(SubAccount subAccount) {
		getPersistence().clearCache(subAccount);
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
	public static List<SubAccount> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SubAccount> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SubAccount> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static SubAccount update(SubAccount subAccount)
		throws SystemException {
		return getPersistence().update(subAccount);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static SubAccount update(SubAccount subAccount,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(subAccount, serviceContext);
	}

	/**
	* Returns all the sub accounts where businessId = &#63;.
	*
	* @param businessId the business ID
	* @return the matching sub accounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.SubAccount> findByB(
		long businessId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByB(businessId);
	}

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
	public static java.util.List<org.oep.usermgt.model.SubAccount> findByB(
		long businessId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByB(businessId, start, end);
	}

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
	public static java.util.List<org.oep.usermgt.model.SubAccount> findByB(
		long businessId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByB(businessId, start, end, orderByComparator);
	}

	/**
	* Returns the first sub account in the ordered set where businessId = &#63;.
	*
	* @param businessId the business ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sub account
	* @throws org.oep.usermgt.NoSuchSubAccountException if a matching sub account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.SubAccount findByB_First(
		long businessId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchSubAccountException {
		return getPersistence().findByB_First(businessId, orderByComparator);
	}

	/**
	* Returns the first sub account in the ordered set where businessId = &#63;.
	*
	* @param businessId the business ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sub account, or <code>null</code> if a matching sub account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.SubAccount fetchByB_First(
		long businessId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByB_First(businessId, orderByComparator);
	}

	/**
	* Returns the last sub account in the ordered set where businessId = &#63;.
	*
	* @param businessId the business ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sub account
	* @throws org.oep.usermgt.NoSuchSubAccountException if a matching sub account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.SubAccount findByB_Last(
		long businessId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchSubAccountException {
		return getPersistence().findByB_Last(businessId, orderByComparator);
	}

	/**
	* Returns the last sub account in the ordered set where businessId = &#63;.
	*
	* @param businessId the business ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sub account, or <code>null</code> if a matching sub account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.SubAccount fetchByB_Last(
		long businessId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByB_Last(businessId, orderByComparator);
	}

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
	public static org.oep.usermgt.model.SubAccount[] findByB_PrevAndNext(
		long subAccountId, long businessId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchSubAccountException {
		return getPersistence()
				   .findByB_PrevAndNext(subAccountId, businessId,
			orderByComparator);
	}

	/**
	* Removes all the sub accounts where businessId = &#63; from the database.
	*
	* @param businessId the business ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByB(long businessId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByB(businessId);
	}

	/**
	* Returns the number of sub accounts where businessId = &#63;.
	*
	* @param businessId the business ID
	* @return the number of matching sub accounts
	* @throws SystemException if a system exception occurred
	*/
	public static int countByB(long businessId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByB(businessId);
	}

	/**
	* Returns all the sub accounts where mappingUserId = &#63;.
	*
	* @param mappingUserId the mapping user ID
	* @return the matching sub accounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.SubAccount> findByMU(
		long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByMU(mappingUserId);
	}

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
	public static java.util.List<org.oep.usermgt.model.SubAccount> findByMU(
		long mappingUserId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByMU(mappingUserId, start, end);
	}

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
	public static java.util.List<org.oep.usermgt.model.SubAccount> findByMU(
		long mappingUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByMU(mappingUserId, start, end, orderByComparator);
	}

	/**
	* Returns the first sub account in the ordered set where mappingUserId = &#63;.
	*
	* @param mappingUserId the mapping user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sub account
	* @throws org.oep.usermgt.NoSuchSubAccountException if a matching sub account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.SubAccount findByMU_First(
		long mappingUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchSubAccountException {
		return getPersistence().findByMU_First(mappingUserId, orderByComparator);
	}

	/**
	* Returns the first sub account in the ordered set where mappingUserId = &#63;.
	*
	* @param mappingUserId the mapping user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sub account, or <code>null</code> if a matching sub account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.SubAccount fetchByMU_First(
		long mappingUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByMU_First(mappingUserId, orderByComparator);
	}

	/**
	* Returns the last sub account in the ordered set where mappingUserId = &#63;.
	*
	* @param mappingUserId the mapping user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sub account
	* @throws org.oep.usermgt.NoSuchSubAccountException if a matching sub account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.SubAccount findByMU_Last(
		long mappingUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchSubAccountException {
		return getPersistence().findByMU_Last(mappingUserId, orderByComparator);
	}

	/**
	* Returns the last sub account in the ordered set where mappingUserId = &#63;.
	*
	* @param mappingUserId the mapping user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sub account, or <code>null</code> if a matching sub account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.SubAccount fetchByMU_Last(
		long mappingUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByMU_Last(mappingUserId, orderByComparator);
	}

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
	public static org.oep.usermgt.model.SubAccount[] findByMU_PrevAndNext(
		long subAccountId, long mappingUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchSubAccountException {
		return getPersistence()
				   .findByMU_PrevAndNext(subAccountId, mappingUserId,
			orderByComparator);
	}

	/**
	* Removes all the sub accounts where mappingUserId = &#63; from the database.
	*
	* @param mappingUserId the mapping user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByMU(long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByMU(mappingUserId);
	}

	/**
	* Returns the number of sub accounts where mappingUserId = &#63;.
	*
	* @param mappingUserId the mapping user ID
	* @return the number of matching sub accounts
	* @throws SystemException if a system exception occurred
	*/
	public static int countByMU(long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByMU(mappingUserId);
	}

	/**
	* Returns the sub account where businessId = &#63; and mappingUserId = &#63; or throws a {@link org.oep.usermgt.NoSuchSubAccountException} if it could not be found.
	*
	* @param businessId the business ID
	* @param mappingUserId the mapping user ID
	* @return the matching sub account
	* @throws org.oep.usermgt.NoSuchSubAccountException if a matching sub account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.SubAccount findByB_MU(long businessId,
		long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchSubAccountException {
		return getPersistence().findByB_MU(businessId, mappingUserId);
	}

	/**
	* Returns the sub account where businessId = &#63; and mappingUserId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param businessId the business ID
	* @param mappingUserId the mapping user ID
	* @return the matching sub account, or <code>null</code> if a matching sub account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.SubAccount fetchByB_MU(
		long businessId, long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByB_MU(businessId, mappingUserId);
	}

	/**
	* Returns the sub account where businessId = &#63; and mappingUserId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param businessId the business ID
	* @param mappingUserId the mapping user ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching sub account, or <code>null</code> if a matching sub account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.SubAccount fetchByB_MU(
		long businessId, long mappingUserId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByB_MU(businessId, mappingUserId, retrieveFromCache);
	}

	/**
	* Removes the sub account where businessId = &#63; and mappingUserId = &#63; from the database.
	*
	* @param businessId the business ID
	* @param mappingUserId the mapping user ID
	* @return the sub account that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.SubAccount removeByB_MU(
		long businessId, long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchSubAccountException {
		return getPersistence().removeByB_MU(businessId, mappingUserId);
	}

	/**
	* Returns the number of sub accounts where businessId = &#63; and mappingUserId = &#63;.
	*
	* @param businessId the business ID
	* @param mappingUserId the mapping user ID
	* @return the number of matching sub accounts
	* @throws SystemException if a system exception occurred
	*/
	public static int countByB_MU(long businessId, long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByB_MU(businessId, mappingUserId);
	}

	/**
	* Returns all the sub accounts where businessId = &#63; and workingRole = &#63;.
	*
	* @param businessId the business ID
	* @param workingRole the working role
	* @return the matching sub accounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.SubAccount> findByB_WR(
		long businessId, java.lang.String workingRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByB_WR(businessId, workingRole);
	}

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
	public static java.util.List<org.oep.usermgt.model.SubAccount> findByB_WR(
		long businessId, java.lang.String workingRole, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByB_WR(businessId, workingRole, start, end);
	}

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
	public static java.util.List<org.oep.usermgt.model.SubAccount> findByB_WR(
		long businessId, java.lang.String workingRole, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByB_WR(businessId, workingRole, start, end,
			orderByComparator);
	}

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
	public static org.oep.usermgt.model.SubAccount findByB_WR_First(
		long businessId, java.lang.String workingRole,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchSubAccountException {
		return getPersistence()
				   .findByB_WR_First(businessId, workingRole, orderByComparator);
	}

	/**
	* Returns the first sub account in the ordered set where businessId = &#63; and workingRole = &#63;.
	*
	* @param businessId the business ID
	* @param workingRole the working role
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sub account, or <code>null</code> if a matching sub account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.SubAccount fetchByB_WR_First(
		long businessId, java.lang.String workingRole,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByB_WR_First(businessId, workingRole, orderByComparator);
	}

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
	public static org.oep.usermgt.model.SubAccount findByB_WR_Last(
		long businessId, java.lang.String workingRole,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchSubAccountException {
		return getPersistence()
				   .findByB_WR_Last(businessId, workingRole, orderByComparator);
	}

	/**
	* Returns the last sub account in the ordered set where businessId = &#63; and workingRole = &#63;.
	*
	* @param businessId the business ID
	* @param workingRole the working role
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sub account, or <code>null</code> if a matching sub account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.SubAccount fetchByB_WR_Last(
		long businessId, java.lang.String workingRole,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByB_WR_Last(businessId, workingRole, orderByComparator);
	}

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
	public static org.oep.usermgt.model.SubAccount[] findByB_WR_PrevAndNext(
		long subAccountId, long businessId, java.lang.String workingRole,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchSubAccountException {
		return getPersistence()
				   .findByB_WR_PrevAndNext(subAccountId, businessId,
			workingRole, orderByComparator);
	}

	/**
	* Removes all the sub accounts where businessId = &#63; and workingRole = &#63; from the database.
	*
	* @param businessId the business ID
	* @param workingRole the working role
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByB_WR(long businessId,
		java.lang.String workingRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByB_WR(businessId, workingRole);
	}

	/**
	* Returns the number of sub accounts where businessId = &#63; and workingRole = &#63;.
	*
	* @param businessId the business ID
	* @param workingRole the working role
	* @return the number of matching sub accounts
	* @throws SystemException if a system exception occurred
	*/
	public static int countByB_WR(long businessId, java.lang.String workingRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByB_WR(businessId, workingRole);
	}

	/**
	* Caches the sub account in the entity cache if it is enabled.
	*
	* @param subAccount the sub account
	*/
	public static void cacheResult(org.oep.usermgt.model.SubAccount subAccount) {
		getPersistence().cacheResult(subAccount);
	}

	/**
	* Caches the sub accounts in the entity cache if it is enabled.
	*
	* @param subAccounts the sub accounts
	*/
	public static void cacheResult(
		java.util.List<org.oep.usermgt.model.SubAccount> subAccounts) {
		getPersistence().cacheResult(subAccounts);
	}

	/**
	* Creates a new sub account with the primary key. Does not add the sub account to the database.
	*
	* @param subAccountId the primary key for the new sub account
	* @return the new sub account
	*/
	public static org.oep.usermgt.model.SubAccount create(long subAccountId) {
		return getPersistence().create(subAccountId);
	}

	/**
	* Removes the sub account with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param subAccountId the primary key of the sub account
	* @return the sub account that was removed
	* @throws org.oep.usermgt.NoSuchSubAccountException if a sub account with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.SubAccount remove(long subAccountId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchSubAccountException {
		return getPersistence().remove(subAccountId);
	}

	public static org.oep.usermgt.model.SubAccount updateImpl(
		org.oep.usermgt.model.SubAccount subAccount)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(subAccount);
	}

	/**
	* Returns the sub account with the primary key or throws a {@link org.oep.usermgt.NoSuchSubAccountException} if it could not be found.
	*
	* @param subAccountId the primary key of the sub account
	* @return the sub account
	* @throws org.oep.usermgt.NoSuchSubAccountException if a sub account with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.SubAccount findByPrimaryKey(
		long subAccountId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchSubAccountException {
		return getPersistence().findByPrimaryKey(subAccountId);
	}

	/**
	* Returns the sub account with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param subAccountId the primary key of the sub account
	* @return the sub account, or <code>null</code> if a sub account with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.SubAccount fetchByPrimaryKey(
		long subAccountId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(subAccountId);
	}

	/**
	* Returns all the sub accounts.
	*
	* @return the sub accounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.SubAccount> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<org.oep.usermgt.model.SubAccount> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<org.oep.usermgt.model.SubAccount> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the sub accounts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of sub accounts.
	*
	* @return the number of sub accounts
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static SubAccountPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SubAccountPersistence)PortletBeanLocatorUtil.locate(org.oep.usermgt.service.ClpSerializer.getServletContextName(),
					SubAccountPersistence.class.getName());

			ReferenceRegistry.registerReference(SubAccountUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(SubAccountPersistence persistence) {
	}

	private static SubAccountPersistence _persistence;
}