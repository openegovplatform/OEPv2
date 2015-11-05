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

import org.oep.usermgt.model.Delegacy;

import java.util.List;

/**
 * The persistence utility for the delegacy service. This utility wraps {@link DelegacyPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NQMINH
 * @see DelegacyPersistence
 * @see DelegacyPersistenceImpl
 * @generated
 */
public class DelegacyUtil {
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
	public static void clearCache(Delegacy delegacy) {
		getPersistence().clearCache(delegacy);
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
	public static List<Delegacy> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Delegacy> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Delegacy> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Delegacy update(Delegacy delegacy) throws SystemException {
		return getPersistence().update(delegacy);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Delegacy update(Delegacy delegacy,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(delegacy, serviceContext);
	}

	/**
	* Returns all the delegacies where fromEmployeeId = &#63;.
	*
	* @param fromEmployeeId the from employee ID
	* @return the matching delegacies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.Delegacy> findByFE(
		long fromEmployeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByFE(fromEmployeeId);
	}

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
	public static java.util.List<org.oep.usermgt.model.Delegacy> findByFE(
		long fromEmployeeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByFE(fromEmployeeId, start, end);
	}

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
	public static java.util.List<org.oep.usermgt.model.Delegacy> findByFE(
		long fromEmployeeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFE(fromEmployeeId, start, end, orderByComparator);
	}

	/**
	* Returns the first delegacy in the ordered set where fromEmployeeId = &#63;.
	*
	* @param fromEmployeeId the from employee ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching delegacy
	* @throws org.oep.usermgt.NoSuchDelegacyException if a matching delegacy could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Delegacy findByFE_First(
		long fromEmployeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchDelegacyException {
		return getPersistence().findByFE_First(fromEmployeeId, orderByComparator);
	}

	/**
	* Returns the first delegacy in the ordered set where fromEmployeeId = &#63;.
	*
	* @param fromEmployeeId the from employee ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching delegacy, or <code>null</code> if a matching delegacy could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Delegacy fetchByFE_First(
		long fromEmployeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFE_First(fromEmployeeId, orderByComparator);
	}

	/**
	* Returns the last delegacy in the ordered set where fromEmployeeId = &#63;.
	*
	* @param fromEmployeeId the from employee ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching delegacy
	* @throws org.oep.usermgt.NoSuchDelegacyException if a matching delegacy could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Delegacy findByFE_Last(
		long fromEmployeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchDelegacyException {
		return getPersistence().findByFE_Last(fromEmployeeId, orderByComparator);
	}

	/**
	* Returns the last delegacy in the ordered set where fromEmployeeId = &#63;.
	*
	* @param fromEmployeeId the from employee ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching delegacy, or <code>null</code> if a matching delegacy could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Delegacy fetchByFE_Last(
		long fromEmployeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByFE_Last(fromEmployeeId, orderByComparator);
	}

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
	public static org.oep.usermgt.model.Delegacy[] findByFE_PrevAndNext(
		long delegacyId, long fromEmployeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchDelegacyException {
		return getPersistence()
				   .findByFE_PrevAndNext(delegacyId, fromEmployeeId,
			orderByComparator);
	}

	/**
	* Removes all the delegacies where fromEmployeeId = &#63; from the database.
	*
	* @param fromEmployeeId the from employee ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByFE(long fromEmployeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByFE(fromEmployeeId);
	}

	/**
	* Returns the number of delegacies where fromEmployeeId = &#63;.
	*
	* @param fromEmployeeId the from employee ID
	* @return the number of matching delegacies
	* @throws SystemException if a system exception occurred
	*/
	public static int countByFE(long fromEmployeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByFE(fromEmployeeId);
	}

	/**
	* Returns all the delegacies where toEmployeeId = &#63;.
	*
	* @param toEmployeeId the to employee ID
	* @return the matching delegacies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.Delegacy> findByTE(
		long toEmployeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTE(toEmployeeId);
	}

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
	public static java.util.List<org.oep.usermgt.model.Delegacy> findByTE(
		long toEmployeeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTE(toEmployeeId, start, end);
	}

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
	public static java.util.List<org.oep.usermgt.model.Delegacy> findByTE(
		long toEmployeeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTE(toEmployeeId, start, end, orderByComparator);
	}

	/**
	* Returns the first delegacy in the ordered set where toEmployeeId = &#63;.
	*
	* @param toEmployeeId the to employee ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching delegacy
	* @throws org.oep.usermgt.NoSuchDelegacyException if a matching delegacy could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Delegacy findByTE_First(
		long toEmployeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchDelegacyException {
		return getPersistence().findByTE_First(toEmployeeId, orderByComparator);
	}

	/**
	* Returns the first delegacy in the ordered set where toEmployeeId = &#63;.
	*
	* @param toEmployeeId the to employee ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching delegacy, or <code>null</code> if a matching delegacy could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Delegacy fetchByTE_First(
		long toEmployeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByTE_First(toEmployeeId, orderByComparator);
	}

	/**
	* Returns the last delegacy in the ordered set where toEmployeeId = &#63;.
	*
	* @param toEmployeeId the to employee ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching delegacy
	* @throws org.oep.usermgt.NoSuchDelegacyException if a matching delegacy could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Delegacy findByTE_Last(
		long toEmployeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchDelegacyException {
		return getPersistence().findByTE_Last(toEmployeeId, orderByComparator);
	}

	/**
	* Returns the last delegacy in the ordered set where toEmployeeId = &#63;.
	*
	* @param toEmployeeId the to employee ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching delegacy, or <code>null</code> if a matching delegacy could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Delegacy fetchByTE_Last(
		long toEmployeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByTE_Last(toEmployeeId, orderByComparator);
	}

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
	public static org.oep.usermgt.model.Delegacy[] findByTE_PrevAndNext(
		long delegacyId, long toEmployeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchDelegacyException {
		return getPersistence()
				   .findByTE_PrevAndNext(delegacyId, toEmployeeId,
			orderByComparator);
	}

	/**
	* Removes all the delegacies where toEmployeeId = &#63; from the database.
	*
	* @param toEmployeeId the to employee ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTE(long toEmployeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByTE(toEmployeeId);
	}

	/**
	* Returns the number of delegacies where toEmployeeId = &#63;.
	*
	* @param toEmployeeId the to employee ID
	* @return the number of matching delegacies
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTE(long toEmployeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTE(toEmployeeId);
	}

	/**
	* Returns the delegacy where toEmployeeId = &#63; and roleId = &#63; or throws a {@link org.oep.usermgt.NoSuchDelegacyException} if it could not be found.
	*
	* @param toEmployeeId the to employee ID
	* @param roleId the role ID
	* @return the matching delegacy
	* @throws org.oep.usermgt.NoSuchDelegacyException if a matching delegacy could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Delegacy findByTE_R(long toEmployeeId,
		long roleId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchDelegacyException {
		return getPersistence().findByTE_R(toEmployeeId, roleId);
	}

	/**
	* Returns the delegacy where toEmployeeId = &#63; and roleId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param toEmployeeId the to employee ID
	* @param roleId the role ID
	* @return the matching delegacy, or <code>null</code> if a matching delegacy could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Delegacy fetchByTE_R(
		long toEmployeeId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByTE_R(toEmployeeId, roleId);
	}

	/**
	* Returns the delegacy where toEmployeeId = &#63; and roleId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param toEmployeeId the to employee ID
	* @param roleId the role ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching delegacy, or <code>null</code> if a matching delegacy could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Delegacy fetchByTE_R(
		long toEmployeeId, long roleId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTE_R(toEmployeeId, roleId, retrieveFromCache);
	}

	/**
	* Removes the delegacy where toEmployeeId = &#63; and roleId = &#63; from the database.
	*
	* @param toEmployeeId the to employee ID
	* @param roleId the role ID
	* @return the delegacy that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Delegacy removeByTE_R(
		long toEmployeeId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchDelegacyException {
		return getPersistence().removeByTE_R(toEmployeeId, roleId);
	}

	/**
	* Returns the number of delegacies where toEmployeeId = &#63; and roleId = &#63;.
	*
	* @param toEmployeeId the to employee ID
	* @param roleId the role ID
	* @return the number of matching delegacies
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTE_R(long toEmployeeId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTE_R(toEmployeeId, roleId);
	}

	/**
	* Caches the delegacy in the entity cache if it is enabled.
	*
	* @param delegacy the delegacy
	*/
	public static void cacheResult(org.oep.usermgt.model.Delegacy delegacy) {
		getPersistence().cacheResult(delegacy);
	}

	/**
	* Caches the delegacies in the entity cache if it is enabled.
	*
	* @param delegacies the delegacies
	*/
	public static void cacheResult(
		java.util.List<org.oep.usermgt.model.Delegacy> delegacies) {
		getPersistence().cacheResult(delegacies);
	}

	/**
	* Creates a new delegacy with the primary key. Does not add the delegacy to the database.
	*
	* @param delegacyId the primary key for the new delegacy
	* @return the new delegacy
	*/
	public static org.oep.usermgt.model.Delegacy create(long delegacyId) {
		return getPersistence().create(delegacyId);
	}

	/**
	* Removes the delegacy with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param delegacyId the primary key of the delegacy
	* @return the delegacy that was removed
	* @throws org.oep.usermgt.NoSuchDelegacyException if a delegacy with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Delegacy remove(long delegacyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchDelegacyException {
		return getPersistence().remove(delegacyId);
	}

	public static org.oep.usermgt.model.Delegacy updateImpl(
		org.oep.usermgt.model.Delegacy delegacy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(delegacy);
	}

	/**
	* Returns the delegacy with the primary key or throws a {@link org.oep.usermgt.NoSuchDelegacyException} if it could not be found.
	*
	* @param delegacyId the primary key of the delegacy
	* @return the delegacy
	* @throws org.oep.usermgt.NoSuchDelegacyException if a delegacy with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Delegacy findByPrimaryKey(
		long delegacyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchDelegacyException {
		return getPersistence().findByPrimaryKey(delegacyId);
	}

	/**
	* Returns the delegacy with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param delegacyId the primary key of the delegacy
	* @return the delegacy, or <code>null</code> if a delegacy with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Delegacy fetchByPrimaryKey(
		long delegacyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(delegacyId);
	}

	/**
	* Returns all the delegacies.
	*
	* @return the delegacies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.Delegacy> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<org.oep.usermgt.model.Delegacy> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<org.oep.usermgt.model.Delegacy> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the delegacies from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of delegacies.
	*
	* @return the number of delegacies
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DelegacyPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DelegacyPersistence)PortletBeanLocatorUtil.locate(org.oep.usermgt.service.ClpSerializer.getServletContextName(),
					DelegacyPersistence.class.getName());

			ReferenceRegistry.registerReference(DelegacyUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DelegacyPersistence persistence) {
	}

	private static DelegacyPersistence _persistence;
}