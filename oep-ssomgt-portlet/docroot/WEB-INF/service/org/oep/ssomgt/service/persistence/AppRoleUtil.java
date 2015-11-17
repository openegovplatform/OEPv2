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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.oep.ssomgt.model.AppRole;

import java.util.List;

/**
 * The persistence utility for the app role service. This utility wraps {@link AppRolePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see AppRolePersistence
 * @see AppRolePersistenceImpl
 * @generated
 */
public class AppRoleUtil {
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
	public static void clearCache(AppRole appRole) {
		getPersistence().clearCache(appRole);
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
	public static List<AppRole> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AppRole> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AppRole> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static AppRole update(AppRole appRole) throws SystemException {
		return getPersistence().update(appRole);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static AppRole update(AppRole appRole, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(appRole, serviceContext);
	}

	/**
	* Returns all the app roles where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching app roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.AppRole> findByC(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC(companyId);
	}

	/**
	* Returns a range of all the app roles where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of app roles
	* @param end the upper bound of the range of app roles (not inclusive)
	* @return the range of matching app roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.AppRole> findByC(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC(companyId, start, end);
	}

	/**
	* Returns an ordered range of all the app roles where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of app roles
	* @param end the upper bound of the range of app roles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching app roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.AppRole> findByC(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC(companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first app role in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app role
	* @throws org.oep.ssomgt.NoSuchAppRoleException if a matching app role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole findByC_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRoleException {
		return getPersistence().findByC_First(companyId, orderByComparator);
	}

	/**
	* Returns the first app role in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app role, or <code>null</code> if a matching app role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole fetchByC_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_First(companyId, orderByComparator);
	}

	/**
	* Returns the last app role in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app role
	* @throws org.oep.ssomgt.NoSuchAppRoleException if a matching app role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole findByC_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRoleException {
		return getPersistence().findByC_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last app role in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app role, or <code>null</code> if a matching app role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole fetchByC_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_Last(companyId, orderByComparator);
	}

	/**
	* Returns the app roles before and after the current app role in the ordered set where companyId = &#63;.
	*
	* @param appRoleId the primary key of the current app role
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next app role
	* @throws org.oep.ssomgt.NoSuchAppRoleException if a app role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole[] findByC_PrevAndNext(
		long appRoleId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRoleException {
		return getPersistence()
				   .findByC_PrevAndNext(appRoleId, companyId, orderByComparator);
	}

	/**
	* Removes all the app roles where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC(companyId);
	}

	/**
	* Returns the number of app roles where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching app roles
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC(companyId);
	}

	/**
	* Returns all the app roles where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching app roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.AppRole> findByC_G(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_G(companyId, groupId);
	}

	/**
	* Returns a range of all the app roles where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of app roles
	* @param end the upper bound of the range of app roles (not inclusive)
	* @return the range of matching app roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.AppRole> findByC_G(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_G(companyId, groupId, start, end);
	}

	/**
	* Returns an ordered range of all the app roles where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public static java.util.List<org.oep.ssomgt.model.AppRole> findByC_G(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G(companyId, groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first app role in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app role
	* @throws org.oep.ssomgt.NoSuchAppRoleException if a matching app role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole findByC_G_First(long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRoleException {
		return getPersistence()
				   .findByC_G_First(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the first app role in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app role, or <code>null</code> if a matching app role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole fetchByC_G_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_First(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the last app role in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app role
	* @throws org.oep.ssomgt.NoSuchAppRoleException if a matching app role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole findByC_G_Last(long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRoleException {
		return getPersistence()
				   .findByC_G_Last(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the last app role in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app role, or <code>null</code> if a matching app role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole fetchByC_G_Last(long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_Last(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the app roles before and after the current app role in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param appRoleId the primary key of the current app role
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next app role
	* @throws org.oep.ssomgt.NoSuchAppRoleException if a app role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole[] findByC_G_PrevAndNext(
		long appRoleId, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRoleException {
		return getPersistence()
				   .findByC_G_PrevAndNext(appRoleId, companyId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the app roles where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_G(companyId, groupId);
	}

	/**
	* Returns the number of app roles where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching app roles
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_G(companyId, groupId);
	}

	/**
	* Returns all the app roles where companyId = &#63; and groupId = &#63; and applicationId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param applicationId the application ID
	* @return the matching app roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.AppRole> findByC_G_A(
		long companyId, long groupId, long applicationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_G_A(companyId, groupId, applicationId);
	}

	/**
	* Returns a range of all the app roles where companyId = &#63; and groupId = &#63; and applicationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public static java.util.List<org.oep.ssomgt.model.AppRole> findByC_G_A(
		long companyId, long groupId, long applicationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G_A(companyId, groupId, applicationId, start, end);
	}

	/**
	* Returns an ordered range of all the app roles where companyId = &#63; and groupId = &#63; and applicationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public static java.util.List<org.oep.ssomgt.model.AppRole> findByC_G_A(
		long companyId, long groupId, long applicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G_A(companyId, groupId, applicationId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first app role in the ordered set where companyId = &#63; and groupId = &#63; and applicationId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param applicationId the application ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app role
	* @throws org.oep.ssomgt.NoSuchAppRoleException if a matching app role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole findByC_G_A_First(
		long companyId, long groupId, long applicationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRoleException {
		return getPersistence()
				   .findByC_G_A_First(companyId, groupId, applicationId,
			orderByComparator);
	}

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
	public static org.oep.ssomgt.model.AppRole fetchByC_G_A_First(
		long companyId, long groupId, long applicationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_A_First(companyId, groupId, applicationId,
			orderByComparator);
	}

	/**
	* Returns the last app role in the ordered set where companyId = &#63; and groupId = &#63; and applicationId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param applicationId the application ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app role
	* @throws org.oep.ssomgt.NoSuchAppRoleException if a matching app role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole findByC_G_A_Last(
		long companyId, long groupId, long applicationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRoleException {
		return getPersistence()
				   .findByC_G_A_Last(companyId, groupId, applicationId,
			orderByComparator);
	}

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
	public static org.oep.ssomgt.model.AppRole fetchByC_G_A_Last(
		long companyId, long groupId, long applicationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_A_Last(companyId, groupId, applicationId,
			orderByComparator);
	}

	/**
	* Returns the app roles before and after the current app role in the ordered set where companyId = &#63; and groupId = &#63; and applicationId = &#63;.
	*
	* @param appRoleId the primary key of the current app role
	* @param companyId the company ID
	* @param groupId the group ID
	* @param applicationId the application ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next app role
	* @throws org.oep.ssomgt.NoSuchAppRoleException if a app role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole[] findByC_G_A_PrevAndNext(
		long appRoleId, long companyId, long groupId, long applicationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRoleException {
		return getPersistence()
				   .findByC_G_A_PrevAndNext(appRoleId, companyId, groupId,
			applicationId, orderByComparator);
	}

	/**
	* Removes all the app roles where companyId = &#63; and groupId = &#63; and applicationId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param applicationId the application ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_G_A(long companyId, long groupId,
		long applicationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_G_A(companyId, groupId, applicationId);
	}

	/**
	* Returns the number of app roles where companyId = &#63; and groupId = &#63; and applicationId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param applicationId the application ID
	* @return the number of matching app roles
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_G_A(long companyId, long groupId,
		long applicationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_G_A(companyId, groupId, applicationId);
	}

	/**
	* Returns the app role where roleCode = &#63; or throws a {@link org.oep.ssomgt.NoSuchAppRoleException} if it could not be found.
	*
	* @param roleCode the role code
	* @return the matching app role
	* @throws org.oep.ssomgt.NoSuchAppRoleException if a matching app role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole findByRC(
		java.lang.String roleCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRoleException {
		return getPersistence().findByRC(roleCode);
	}

	/**
	* Returns the app role where roleCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param roleCode the role code
	* @return the matching app role, or <code>null</code> if a matching app role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole fetchByRC(
		java.lang.String roleCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByRC(roleCode);
	}

	/**
	* Returns the app role where roleCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param roleCode the role code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching app role, or <code>null</code> if a matching app role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole fetchByRC(
		java.lang.String roleCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByRC(roleCode, retrieveFromCache);
	}

	/**
	* Removes the app role where roleCode = &#63; from the database.
	*
	* @param roleCode the role code
	* @return the app role that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole removeByRC(
		java.lang.String roleCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRoleException {
		return getPersistence().removeByRC(roleCode);
	}

	/**
	* Returns the number of app roles where roleCode = &#63;.
	*
	* @param roleCode the role code
	* @return the number of matching app roles
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRC(java.lang.String roleCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByRC(roleCode);
	}

	/**
	* Caches the app role in the entity cache if it is enabled.
	*
	* @param appRole the app role
	*/
	public static void cacheResult(org.oep.ssomgt.model.AppRole appRole) {
		getPersistence().cacheResult(appRole);
	}

	/**
	* Caches the app roles in the entity cache if it is enabled.
	*
	* @param appRoles the app roles
	*/
	public static void cacheResult(
		java.util.List<org.oep.ssomgt.model.AppRole> appRoles) {
		getPersistence().cacheResult(appRoles);
	}

	/**
	* Creates a new app role with the primary key. Does not add the app role to the database.
	*
	* @param appRoleId the primary key for the new app role
	* @return the new app role
	*/
	public static org.oep.ssomgt.model.AppRole create(long appRoleId) {
		return getPersistence().create(appRoleId);
	}

	/**
	* Removes the app role with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param appRoleId the primary key of the app role
	* @return the app role that was removed
	* @throws org.oep.ssomgt.NoSuchAppRoleException if a app role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole remove(long appRoleId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRoleException {
		return getPersistence().remove(appRoleId);
	}

	public static org.oep.ssomgt.model.AppRole updateImpl(
		org.oep.ssomgt.model.AppRole appRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(appRole);
	}

	/**
	* Returns the app role with the primary key or throws a {@link org.oep.ssomgt.NoSuchAppRoleException} if it could not be found.
	*
	* @param appRoleId the primary key of the app role
	* @return the app role
	* @throws org.oep.ssomgt.NoSuchAppRoleException if a app role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole findByPrimaryKey(long appRoleId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchAppRoleException {
		return getPersistence().findByPrimaryKey(appRoleId);
	}

	/**
	* Returns the app role with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param appRoleId the primary key of the app role
	* @return the app role, or <code>null</code> if a app role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole fetchByPrimaryKey(long appRoleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(appRoleId);
	}

	/**
	* Returns all the app roles.
	*
	* @return the app roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.AppRole> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the app roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of app roles
	* @param end the upper bound of the range of app roles (not inclusive)
	* @return the range of app roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.AppRole> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the app roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of app roles
	* @param end the upper bound of the range of app roles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of app roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.AppRole> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the app roles from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of app roles.
	*
	* @return the number of app roles
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AppRolePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AppRolePersistence)PortletBeanLocatorUtil.locate(org.oep.ssomgt.service.ClpSerializer.getServletContextName(),
					AppRolePersistence.class.getName());

			ReferenceRegistry.registerReference(AppRoleUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(AppRolePersistence persistence) {
	}

	private static AppRolePersistence _persistence;
}