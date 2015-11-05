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

import org.oep.usermgt.model.WorkingUnit;

import java.util.List;

/**
 * The persistence utility for the Working Unit service. This utility wraps {@link WorkingUnitPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NQMINH
 * @see WorkingUnitPersistence
 * @see WorkingUnitPersistenceImpl
 * @generated
 */
public class WorkingUnitUtil {
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
	public static void clearCache(WorkingUnit workingUnit) {
		getPersistence().clearCache(workingUnit);
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
	public static List<WorkingUnit> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<WorkingUnit> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<WorkingUnit> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static WorkingUnit update(WorkingUnit workingUnit)
		throws SystemException {
		return getPersistence().update(workingUnit);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static WorkingUnit update(WorkingUnit workingUnit,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(workingUnit, serviceContext);
	}

	/**
	* Returns all the Working Units where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findByC(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC(companyId);
	}

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
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findByC(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC(companyId, start, end);
	}

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
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findByC(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC(companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first Working Unit in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit findByC_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException {
		return getPersistence().findByC_First(companyId, orderByComparator);
	}

	/**
	* Returns the first Working Unit in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit fetchByC_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_First(companyId, orderByComparator);
	}

	/**
	* Returns the last Working Unit in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit findByC_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException {
		return getPersistence().findByC_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last Working Unit in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit fetchByC_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_Last(companyId, orderByComparator);
	}

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
	public static org.oep.usermgt.model.WorkingUnit[] findByC_PrevAndNext(
		long workingUnitId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException {
		return getPersistence()
				   .findByC_PrevAndNext(workingUnitId, companyId,
			orderByComparator);
	}

	/**
	* Removes all the Working Units where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC(companyId);
	}

	/**
	* Returns the number of Working Units where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC(companyId);
	}

	/**
	* Returns all the Working Units where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findByG(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG(groupId);
	}

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
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findByG(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG(groupId, start, end);
	}

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
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findByG(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first Working Unit in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit findByG_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException {
		return getPersistence().findByG_First(groupId, orderByComparator);
	}

	/**
	* Returns the first Working Unit in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit fetchByG_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByG_First(groupId, orderByComparator);
	}

	/**
	* Returns the last Working Unit in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit findByG_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException {
		return getPersistence().findByG_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last Working Unit in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit fetchByG_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByG_Last(groupId, orderByComparator);
	}

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
	public static org.oep.usermgt.model.WorkingUnit[] findByG_PrevAndNext(
		long workingUnitId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException {
		return getPersistence()
				   .findByG_PrevAndNext(workingUnitId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the Working Units where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG(groupId);
	}

	/**
	* Returns the number of Working Units where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG(groupId);
	}

	/**
	* Returns all the Working Units where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findByO(
		java.lang.String organizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByO(organizationId);
	}

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
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findByO(
		java.lang.String organizationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByO(organizationId, start, end);
	}

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
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findByO(
		java.lang.String organizationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByO(organizationId, start, end, orderByComparator);
	}

	/**
	* Returns the first Working Unit in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit findByO_First(
		java.lang.String organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException {
		return getPersistence().findByO_First(organizationId, orderByComparator);
	}

	/**
	* Returns the first Working Unit in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit fetchByO_First(
		java.lang.String organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByO_First(organizationId, orderByComparator);
	}

	/**
	* Returns the last Working Unit in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit findByO_Last(
		java.lang.String organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException {
		return getPersistence().findByO_Last(organizationId, orderByComparator);
	}

	/**
	* Returns the last Working Unit in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit fetchByO_Last(
		java.lang.String organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByO_Last(organizationId, orderByComparator);
	}

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
	public static org.oep.usermgt.model.WorkingUnit[] findByO_PrevAndNext(
		long workingUnitId, java.lang.String organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException {
		return getPersistence()
				   .findByO_PrevAndNext(workingUnitId, organizationId,
			orderByComparator);
	}

	/**
	* Removes all the Working Units where organizationId = &#63; from the database.
	*
	* @param organizationId the organization ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByO(java.lang.String organizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByO(organizationId);
	}

	/**
	* Returns the number of Working Units where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the number of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public static int countByO(java.lang.String organizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByO(organizationId);
	}

	/**
	* Returns all the Working Units where govAgencyId = &#63;.
	*
	* @param govAgencyId the gov agency ID
	* @return the matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findByGA(
		java.lang.String govAgencyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGA(govAgencyId);
	}

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
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findByGA(
		java.lang.String govAgencyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGA(govAgencyId, start, end);
	}

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
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findByGA(
		java.lang.String govAgencyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGA(govAgencyId, start, end, orderByComparator);
	}

	/**
	* Returns the first Working Unit in the ordered set where govAgencyId = &#63;.
	*
	* @param govAgencyId the gov agency ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit findByGA_First(
		java.lang.String govAgencyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException {
		return getPersistence().findByGA_First(govAgencyId, orderByComparator);
	}

	/**
	* Returns the first Working Unit in the ordered set where govAgencyId = &#63;.
	*
	* @param govAgencyId the gov agency ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit fetchByGA_First(
		java.lang.String govAgencyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGA_First(govAgencyId, orderByComparator);
	}

	/**
	* Returns the last Working Unit in the ordered set where govAgencyId = &#63;.
	*
	* @param govAgencyId the gov agency ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit findByGA_Last(
		java.lang.String govAgencyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException {
		return getPersistence().findByGA_Last(govAgencyId, orderByComparator);
	}

	/**
	* Returns the last Working Unit in the ordered set where govAgencyId = &#63;.
	*
	* @param govAgencyId the gov agency ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit fetchByGA_Last(
		java.lang.String govAgencyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGA_Last(govAgencyId, orderByComparator);
	}

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
	public static org.oep.usermgt.model.WorkingUnit[] findByGA_PrevAndNext(
		long workingUnitId, java.lang.String govAgencyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException {
		return getPersistence()
				   .findByGA_PrevAndNext(workingUnitId, govAgencyId,
			orderByComparator);
	}

	/**
	* Removes all the Working Units where govAgencyId = &#63; from the database.
	*
	* @param govAgencyId the gov agency ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGA(java.lang.String govAgencyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGA(govAgencyId);
	}

	/**
	* Returns the number of Working Units where govAgencyId = &#63;.
	*
	* @param govAgencyId the gov agency ID
	* @return the number of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGA(java.lang.String govAgencyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGA(govAgencyId);
	}

	/**
	* Returns all the Working Units where cityNo = &#63;.
	*
	* @param cityNo the city no
	* @return the matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findByCN(
		java.lang.String cityNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCN(cityNo);
	}

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
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findByCN(
		java.lang.String cityNo, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCN(cityNo, start, end);
	}

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
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findByCN(
		java.lang.String cityNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCN(cityNo, start, end, orderByComparator);
	}

	/**
	* Returns the first Working Unit in the ordered set where cityNo = &#63;.
	*
	* @param cityNo the city no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit findByCN_First(
		java.lang.String cityNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException {
		return getPersistence().findByCN_First(cityNo, orderByComparator);
	}

	/**
	* Returns the first Working Unit in the ordered set where cityNo = &#63;.
	*
	* @param cityNo the city no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit fetchByCN_First(
		java.lang.String cityNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCN_First(cityNo, orderByComparator);
	}

	/**
	* Returns the last Working Unit in the ordered set where cityNo = &#63;.
	*
	* @param cityNo the city no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit findByCN_Last(
		java.lang.String cityNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException {
		return getPersistence().findByCN_Last(cityNo, orderByComparator);
	}

	/**
	* Returns the last Working Unit in the ordered set where cityNo = &#63;.
	*
	* @param cityNo the city no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit fetchByCN_Last(
		java.lang.String cityNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCN_Last(cityNo, orderByComparator);
	}

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
	public static org.oep.usermgt.model.WorkingUnit[] findByCN_PrevAndNext(
		long workingUnitId, java.lang.String cityNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException {
		return getPersistence()
				   .findByCN_PrevAndNext(workingUnitId, cityNo,
			orderByComparator);
	}

	/**
	* Removes all the Working Units where cityNo = &#63; from the database.
	*
	* @param cityNo the city no
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCN(java.lang.String cityNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCN(cityNo);
	}

	/**
	* Returns the number of Working Units where cityNo = &#63;.
	*
	* @param cityNo the city no
	* @return the number of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCN(java.lang.String cityNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCN(cityNo);
	}

	/**
	* Returns all the Working Units where districtNo = &#63;.
	*
	* @param districtNo the district no
	* @return the matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findByDN(
		java.lang.String districtNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDN(districtNo);
	}

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
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findByDN(
		java.lang.String districtNo, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDN(districtNo, start, end);
	}

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
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findByDN(
		java.lang.String districtNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDN(districtNo, start, end, orderByComparator);
	}

	/**
	* Returns the first Working Unit in the ordered set where districtNo = &#63;.
	*
	* @param districtNo the district no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit findByDN_First(
		java.lang.String districtNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException {
		return getPersistence().findByDN_First(districtNo, orderByComparator);
	}

	/**
	* Returns the first Working Unit in the ordered set where districtNo = &#63;.
	*
	* @param districtNo the district no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit fetchByDN_First(
		java.lang.String districtNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByDN_First(districtNo, orderByComparator);
	}

	/**
	* Returns the last Working Unit in the ordered set where districtNo = &#63;.
	*
	* @param districtNo the district no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit findByDN_Last(
		java.lang.String districtNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException {
		return getPersistence().findByDN_Last(districtNo, orderByComparator);
	}

	/**
	* Returns the last Working Unit in the ordered set where districtNo = &#63;.
	*
	* @param districtNo the district no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit fetchByDN_Last(
		java.lang.String districtNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByDN_Last(districtNo, orderByComparator);
	}

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
	public static org.oep.usermgt.model.WorkingUnit[] findByDN_PrevAndNext(
		long workingUnitId, java.lang.String districtNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException {
		return getPersistence()
				   .findByDN_PrevAndNext(workingUnitId, districtNo,
			orderByComparator);
	}

	/**
	* Removes all the Working Units where districtNo = &#63; from the database.
	*
	* @param districtNo the district no
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDN(java.lang.String districtNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDN(districtNo);
	}

	/**
	* Returns the number of Working Units where districtNo = &#63;.
	*
	* @param districtNo the district no
	* @return the number of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDN(java.lang.String districtNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDN(districtNo);
	}

	/**
	* Returns all the Working Units where wardNo = &#63;.
	*
	* @param wardNo the ward no
	* @return the matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findByWA(
		java.lang.String wardNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByWA(wardNo);
	}

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
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findByWA(
		java.lang.String wardNo, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByWA(wardNo, start, end);
	}

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
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findByWA(
		java.lang.String wardNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByWA(wardNo, start, end, orderByComparator);
	}

	/**
	* Returns the first Working Unit in the ordered set where wardNo = &#63;.
	*
	* @param wardNo the ward no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit findByWA_First(
		java.lang.String wardNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException {
		return getPersistence().findByWA_First(wardNo, orderByComparator);
	}

	/**
	* Returns the first Working Unit in the ordered set where wardNo = &#63;.
	*
	* @param wardNo the ward no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit fetchByWA_First(
		java.lang.String wardNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByWA_First(wardNo, orderByComparator);
	}

	/**
	* Returns the last Working Unit in the ordered set where wardNo = &#63;.
	*
	* @param wardNo the ward no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit findByWA_Last(
		java.lang.String wardNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException {
		return getPersistence().findByWA_Last(wardNo, orderByComparator);
	}

	/**
	* Returns the last Working Unit in the ordered set where wardNo = &#63;.
	*
	* @param wardNo the ward no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit fetchByWA_Last(
		java.lang.String wardNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByWA_Last(wardNo, orderByComparator);
	}

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
	public static org.oep.usermgt.model.WorkingUnit[] findByWA_PrevAndNext(
		long workingUnitId, java.lang.String wardNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException {
		return getPersistence()
				   .findByWA_PrevAndNext(workingUnitId, wardNo,
			orderByComparator);
	}

	/**
	* Removes all the Working Units where wardNo = &#63; from the database.
	*
	* @param wardNo the ward no
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByWA(java.lang.String wardNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByWA(wardNo);
	}

	/**
	* Returns the number of Working Units where wardNo = &#63;.
	*
	* @param wardNo the ward no
	* @return the number of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public static int countByWA(java.lang.String wardNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByWA(wardNo);
	}

	/**
	* Returns all the Working Units where parentWorkingUnitId = &#63;.
	*
	* @param parentWorkingUnitId the parent working unit ID
	* @return the matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findByPW(
		long parentWorkingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPW(parentWorkingUnitId);
	}

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
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findByPW(
		long parentWorkingUnitId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPW(parentWorkingUnitId, start, end);
	}

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
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findByPW(
		long parentWorkingUnitId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPW(parentWorkingUnitId, start, end, orderByComparator);
	}

	/**
	* Returns the first Working Unit in the ordered set where parentWorkingUnitId = &#63;.
	*
	* @param parentWorkingUnitId the parent working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit findByPW_First(
		long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException {
		return getPersistence()
				   .findByPW_First(parentWorkingUnitId, orderByComparator);
	}

	/**
	* Returns the first Working Unit in the ordered set where parentWorkingUnitId = &#63;.
	*
	* @param parentWorkingUnitId the parent working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit fetchByPW_First(
		long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPW_First(parentWorkingUnitId, orderByComparator);
	}

	/**
	* Returns the last Working Unit in the ordered set where parentWorkingUnitId = &#63;.
	*
	* @param parentWorkingUnitId the parent working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit findByPW_Last(
		long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException {
		return getPersistence()
				   .findByPW_Last(parentWorkingUnitId, orderByComparator);
	}

	/**
	* Returns the last Working Unit in the ordered set where parentWorkingUnitId = &#63;.
	*
	* @param parentWorkingUnitId the parent working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit fetchByPW_Last(
		long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPW_Last(parentWorkingUnitId, orderByComparator);
	}

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
	public static org.oep.usermgt.model.WorkingUnit[] findByPW_PrevAndNext(
		long workingUnitId, long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException {
		return getPersistence()
				   .findByPW_PrevAndNext(workingUnitId, parentWorkingUnitId,
			orderByComparator);
	}

	/**
	* Removes all the Working Units where parentWorkingUnitId = &#63; from the database.
	*
	* @param parentWorkingUnitId the parent working unit ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPW(long parentWorkingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPW(parentWorkingUnitId);
	}

	/**
	* Returns the number of Working Units where parentWorkingUnitId = &#63;.
	*
	* @param parentWorkingUnitId the parent working unit ID
	* @return the number of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPW(long parentWorkingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPW(parentWorkingUnitId);
	}

	/**
	* Returns all the Working Units where companyId = &#63; and parentWorkingUnitId = &#63;.
	*
	* @param companyId the company ID
	* @param parentWorkingUnitId the parent working unit ID
	* @return the matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findByC_PW(
		long companyId, long parentWorkingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_PW(companyId, parentWorkingUnitId);
	}

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
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findByC_PW(
		long companyId, long parentWorkingUnitId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_PW(companyId, parentWorkingUnitId, start, end);
	}

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
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findByC_PW(
		long companyId, long parentWorkingUnitId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_PW(companyId, parentWorkingUnitId, start, end,
			orderByComparator);
	}

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
	public static org.oep.usermgt.model.WorkingUnit findByC_PW_First(
		long companyId, long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException {
		return getPersistence()
				   .findByC_PW_First(companyId, parentWorkingUnitId,
			orderByComparator);
	}

	/**
	* Returns the first Working Unit in the ordered set where companyId = &#63; and parentWorkingUnitId = &#63;.
	*
	* @param companyId the company ID
	* @param parentWorkingUnitId the parent working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit fetchByC_PW_First(
		long companyId, long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_PW_First(companyId, parentWorkingUnitId,
			orderByComparator);
	}

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
	public static org.oep.usermgt.model.WorkingUnit findByC_PW_Last(
		long companyId, long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException {
		return getPersistence()
				   .findByC_PW_Last(companyId, parentWorkingUnitId,
			orderByComparator);
	}

	/**
	* Returns the last Working Unit in the ordered set where companyId = &#63; and parentWorkingUnitId = &#63;.
	*
	* @param companyId the company ID
	* @param parentWorkingUnitId the parent working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit fetchByC_PW_Last(
		long companyId, long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_PW_Last(companyId, parentWorkingUnitId,
			orderByComparator);
	}

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
	public static org.oep.usermgt.model.WorkingUnit[] findByC_PW_PrevAndNext(
		long workingUnitId, long companyId, long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException {
		return getPersistence()
				   .findByC_PW_PrevAndNext(workingUnitId, companyId,
			parentWorkingUnitId, orderByComparator);
	}

	/**
	* Removes all the Working Units where companyId = &#63; and parentWorkingUnitId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param parentWorkingUnitId the parent working unit ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_PW(long companyId, long parentWorkingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_PW(companyId, parentWorkingUnitId);
	}

	/**
	* Returns the number of Working Units where companyId = &#63; and parentWorkingUnitId = &#63;.
	*
	* @param companyId the company ID
	* @param parentWorkingUnitId the parent working unit ID
	* @return the number of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_PW(long companyId, long parentWorkingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_PW(companyId, parentWorkingUnitId);
	}

	/**
	* Returns all the Working Units where groupId = &#63; and parentWorkingUnitId = &#63;.
	*
	* @param groupId the group ID
	* @param parentWorkingUnitId the parent working unit ID
	* @return the matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findByG_PW(
		long groupId, long parentWorkingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_PW(groupId, parentWorkingUnitId);
	}

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
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findByG_PW(
		long groupId, long parentWorkingUnitId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_PW(groupId, parentWorkingUnitId, start, end);
	}

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
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findByG_PW(
		long groupId, long parentWorkingUnitId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_PW(groupId, parentWorkingUnitId, start, end,
			orderByComparator);
	}

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
	public static org.oep.usermgt.model.WorkingUnit findByG_PW_First(
		long groupId, long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException {
		return getPersistence()
				   .findByG_PW_First(groupId, parentWorkingUnitId,
			orderByComparator);
	}

	/**
	* Returns the first Working Unit in the ordered set where groupId = &#63; and parentWorkingUnitId = &#63;.
	*
	* @param groupId the group ID
	* @param parentWorkingUnitId the parent working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit fetchByG_PW_First(
		long groupId, long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_PW_First(groupId, parentWorkingUnitId,
			orderByComparator);
	}

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
	public static org.oep.usermgt.model.WorkingUnit findByG_PW_Last(
		long groupId, long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException {
		return getPersistence()
				   .findByG_PW_Last(groupId, parentWorkingUnitId,
			orderByComparator);
	}

	/**
	* Returns the last Working Unit in the ordered set where groupId = &#63; and parentWorkingUnitId = &#63;.
	*
	* @param groupId the group ID
	* @param parentWorkingUnitId the parent working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Working Unit, or <code>null</code> if a matching Working Unit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit fetchByG_PW_Last(
		long groupId, long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_PW_Last(groupId, parentWorkingUnitId,
			orderByComparator);
	}

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
	public static org.oep.usermgt.model.WorkingUnit[] findByG_PW_PrevAndNext(
		long workingUnitId, long groupId, long parentWorkingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException {
		return getPersistence()
				   .findByG_PW_PrevAndNext(workingUnitId, groupId,
			parentWorkingUnitId, orderByComparator);
	}

	/**
	* Removes all the Working Units where groupId = &#63; and parentWorkingUnitId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param parentWorkingUnitId the parent working unit ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_PW(long groupId, long parentWorkingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_PW(groupId, parentWorkingUnitId);
	}

	/**
	* Returns the number of Working Units where groupId = &#63; and parentWorkingUnitId = &#63;.
	*
	* @param groupId the group ID
	* @param parentWorkingUnitId the parent working unit ID
	* @return the number of matching Working Units
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_PW(long groupId, long parentWorkingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_PW(groupId, parentWorkingUnitId);
	}

	/**
	* Caches the Working Unit in the entity cache if it is enabled.
	*
	* @param workingUnit the Working Unit
	*/
	public static void cacheResult(
		org.oep.usermgt.model.WorkingUnit workingUnit) {
		getPersistence().cacheResult(workingUnit);
	}

	/**
	* Caches the Working Units in the entity cache if it is enabled.
	*
	* @param workingUnits the Working Units
	*/
	public static void cacheResult(
		java.util.List<org.oep.usermgt.model.WorkingUnit> workingUnits) {
		getPersistence().cacheResult(workingUnits);
	}

	/**
	* Creates a new Working Unit with the primary key. Does not add the Working Unit to the database.
	*
	* @param workingUnitId the primary key for the new Working Unit
	* @return the new Working Unit
	*/
	public static org.oep.usermgt.model.WorkingUnit create(long workingUnitId) {
		return getPersistence().create(workingUnitId);
	}

	/**
	* Removes the Working Unit with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param workingUnitId the primary key of the Working Unit
	* @return the Working Unit that was removed
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a Working Unit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit remove(long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException {
		return getPersistence().remove(workingUnitId);
	}

	public static org.oep.usermgt.model.WorkingUnit updateImpl(
		org.oep.usermgt.model.WorkingUnit workingUnit)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(workingUnit);
	}

	/**
	* Returns the Working Unit with the primary key or throws a {@link org.oep.usermgt.NoSuchWorkingUnitException} if it could not be found.
	*
	* @param workingUnitId the primary key of the Working Unit
	* @return the Working Unit
	* @throws org.oep.usermgt.NoSuchWorkingUnitException if a Working Unit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit findByPrimaryKey(
		long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchWorkingUnitException {
		return getPersistence().findByPrimaryKey(workingUnitId);
	}

	/**
	* Returns the Working Unit with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param workingUnitId the primary key of the Working Unit
	* @return the Working Unit, or <code>null</code> if a Working Unit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.WorkingUnit fetchByPrimaryKey(
		long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(workingUnitId);
	}

	/**
	* Returns all the Working Units.
	*
	* @return the Working Units
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<org.oep.usermgt.model.WorkingUnit> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the Working Units from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of Working Units.
	*
	* @return the number of Working Units
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static WorkingUnitPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (WorkingUnitPersistence)PortletBeanLocatorUtil.locate(org.oep.usermgt.service.ClpSerializer.getServletContextName(),
					WorkingUnitPersistence.class.getName());

			ReferenceRegistry.registerReference(WorkingUnitUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(WorkingUnitPersistence persistence) {
	}

	private static WorkingUnitPersistence _persistence;
}