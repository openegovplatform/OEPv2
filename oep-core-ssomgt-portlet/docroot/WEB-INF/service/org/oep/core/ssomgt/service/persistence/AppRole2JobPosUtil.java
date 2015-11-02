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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.oep.core.ssomgt.model.AppRole2JobPos;

import java.util.List;

/**
 * The persistence utility for the app role2 job pos service. This utility wraps {@link AppRole2JobPosPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see AppRole2JobPosPersistence
 * @see AppRole2JobPosPersistenceImpl
 * @generated
 */
public class AppRole2JobPosUtil {
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
	public static void clearCache(AppRole2JobPos appRole2JobPos) {
		getPersistence().clearCache(appRole2JobPos);
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
	public static List<AppRole2JobPos> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AppRole2JobPos> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AppRole2JobPos> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static AppRole2JobPos update(AppRole2JobPos appRole2JobPos)
		throws SystemException {
		return getPersistence().update(appRole2JobPos);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static AppRole2JobPos update(AppRole2JobPos appRole2JobPos,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(appRole2JobPos, serviceContext);
	}

	/**
	* Returns all the app role2 job poses where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.ssomgt.model.AppRole2JobPos> findByC(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC(companyId);
	}

	/**
	* Returns a range of all the app role2 job poses where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRole2JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of app role2 job poses
	* @param end the upper bound of the range of app role2 job poses (not inclusive)
	* @return the range of matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.ssomgt.model.AppRole2JobPos> findByC(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC(companyId, start, end);
	}

	/**
	* Returns an ordered range of all the app role2 job poses where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRole2JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of app role2 job poses
	* @param end the upper bound of the range of app role2 job poses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.ssomgt.model.AppRole2JobPos> findByC(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC(companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first app role2 job pos in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app role2 job pos
	* @throws org.oep.core.ssomgt.NoSuchAppRole2JobPosException if a matching app role2 job pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.AppRole2JobPos findByC_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppRole2JobPosException {
		return getPersistence().findByC_First(companyId, orderByComparator);
	}

	/**
	* Returns the first app role2 job pos in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app role2 job pos, or <code>null</code> if a matching app role2 job pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.AppRole2JobPos fetchByC_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_First(companyId, orderByComparator);
	}

	/**
	* Returns the last app role2 job pos in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app role2 job pos
	* @throws org.oep.core.ssomgt.NoSuchAppRole2JobPosException if a matching app role2 job pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.AppRole2JobPos findByC_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppRole2JobPosException {
		return getPersistence().findByC_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last app role2 job pos in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app role2 job pos, or <code>null</code> if a matching app role2 job pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.AppRole2JobPos fetchByC_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_Last(companyId, orderByComparator);
	}

	/**
	* Returns the app role2 job poses before and after the current app role2 job pos in the ordered set where companyId = &#63;.
	*
	* @param appRole2JobPosId the primary key of the current app role2 job pos
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next app role2 job pos
	* @throws org.oep.core.ssomgt.NoSuchAppRole2JobPosException if a app role2 job pos with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.AppRole2JobPos[] findByC_PrevAndNext(
		long appRole2JobPosId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppRole2JobPosException {
		return getPersistence()
				   .findByC_PrevAndNext(appRole2JobPosId, companyId,
			orderByComparator);
	}

	/**
	* Removes all the app role2 job poses where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC(companyId);
	}

	/**
	* Returns the number of app role2 job poses where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC(companyId);
	}

	/**
	* Returns all the app role2 job poses where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.ssomgt.model.AppRole2JobPos> findByC_G(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_G(companyId, groupId);
	}

	/**
	* Returns a range of all the app role2 job poses where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRole2JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of app role2 job poses
	* @param end the upper bound of the range of app role2 job poses (not inclusive)
	* @return the range of matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.ssomgt.model.AppRole2JobPos> findByC_G(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_G(companyId, groupId, start, end);
	}

	/**
	* Returns an ordered range of all the app role2 job poses where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRole2JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public static java.util.List<org.oep.core.ssomgt.model.AppRole2JobPos> findByC_G(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G(companyId, groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first app role2 job pos in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app role2 job pos
	* @throws org.oep.core.ssomgt.NoSuchAppRole2JobPosException if a matching app role2 job pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.AppRole2JobPos findByC_G_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppRole2JobPosException {
		return getPersistence()
				   .findByC_G_First(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the first app role2 job pos in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app role2 job pos, or <code>null</code> if a matching app role2 job pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.AppRole2JobPos fetchByC_G_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_First(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the last app role2 job pos in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app role2 job pos
	* @throws org.oep.core.ssomgt.NoSuchAppRole2JobPosException if a matching app role2 job pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.AppRole2JobPos findByC_G_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppRole2JobPosException {
		return getPersistence()
				   .findByC_G_Last(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the last app role2 job pos in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app role2 job pos, or <code>null</code> if a matching app role2 job pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.AppRole2JobPos fetchByC_G_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_Last(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the app role2 job poses before and after the current app role2 job pos in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param appRole2JobPosId the primary key of the current app role2 job pos
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next app role2 job pos
	* @throws org.oep.core.ssomgt.NoSuchAppRole2JobPosException if a app role2 job pos with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.AppRole2JobPos[] findByC_G_PrevAndNext(
		long appRole2JobPosId, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppRole2JobPosException {
		return getPersistence()
				   .findByC_G_PrevAndNext(appRole2JobPosId, companyId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the app role2 job poses where companyId = &#63; and groupId = &#63; from the database.
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
	* Returns the number of app role2 job poses where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_G(companyId, groupId);
	}

	/**
	* Returns all the app role2 job poses where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param appRoleId the app role ID
	* @return the matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.ssomgt.model.AppRole2JobPos> findByC_G_AR(
		long companyId, long groupId, long appRoleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_G_AR(companyId, groupId, appRoleId);
	}

	/**
	* Returns a range of all the app role2 job poses where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRole2JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public static java.util.List<org.oep.core.ssomgt.model.AppRole2JobPos> findByC_G_AR(
		long companyId, long groupId, long appRoleId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G_AR(companyId, groupId, appRoleId, start, end);
	}

	/**
	* Returns an ordered range of all the app role2 job poses where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRole2JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public static java.util.List<org.oep.core.ssomgt.model.AppRole2JobPos> findByC_G_AR(
		long companyId, long groupId, long appRoleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G_AR(companyId, groupId, appRoleId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first app role2 job pos in the ordered set where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param appRoleId the app role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching app role2 job pos
	* @throws org.oep.core.ssomgt.NoSuchAppRole2JobPosException if a matching app role2 job pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.AppRole2JobPos findByC_G_AR_First(
		long companyId, long groupId, long appRoleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppRole2JobPosException {
		return getPersistence()
				   .findByC_G_AR_First(companyId, groupId, appRoleId,
			orderByComparator);
	}

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
	public static org.oep.core.ssomgt.model.AppRole2JobPos fetchByC_G_AR_First(
		long companyId, long groupId, long appRoleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_AR_First(companyId, groupId, appRoleId,
			orderByComparator);
	}

	/**
	* Returns the last app role2 job pos in the ordered set where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param appRoleId the app role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching app role2 job pos
	* @throws org.oep.core.ssomgt.NoSuchAppRole2JobPosException if a matching app role2 job pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.AppRole2JobPos findByC_G_AR_Last(
		long companyId, long groupId, long appRoleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppRole2JobPosException {
		return getPersistence()
				   .findByC_G_AR_Last(companyId, groupId, appRoleId,
			orderByComparator);
	}

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
	public static org.oep.core.ssomgt.model.AppRole2JobPos fetchByC_G_AR_Last(
		long companyId, long groupId, long appRoleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_AR_Last(companyId, groupId, appRoleId,
			orderByComparator);
	}

	/**
	* Returns the app role2 job poses before and after the current app role2 job pos in the ordered set where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	*
	* @param appRole2JobPosId the primary key of the current app role2 job pos
	* @param companyId the company ID
	* @param groupId the group ID
	* @param appRoleId the app role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next app role2 job pos
	* @throws org.oep.core.ssomgt.NoSuchAppRole2JobPosException if a app role2 job pos with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.AppRole2JobPos[] findByC_G_AR_PrevAndNext(
		long appRole2JobPosId, long companyId, long groupId, long appRoleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppRole2JobPosException {
		return getPersistence()
				   .findByC_G_AR_PrevAndNext(appRole2JobPosId, companyId,
			groupId, appRoleId, orderByComparator);
	}

	/**
	* Removes all the app role2 job poses where companyId = &#63; and groupId = &#63; and appRoleId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param appRoleId the app role ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_G_AR(long companyId, long groupId,
		long appRoleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_G_AR(companyId, groupId, appRoleId);
	}

	/**
	* Returns the number of app role2 job poses where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param appRoleId the app role ID
	* @return the number of matching app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_G_AR(long companyId, long groupId, long appRoleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_G_AR(companyId, groupId, appRoleId);
	}

	/**
	* Caches the app role2 job pos in the entity cache if it is enabled.
	*
	* @param appRole2JobPos the app role2 job pos
	*/
	public static void cacheResult(
		org.oep.core.ssomgt.model.AppRole2JobPos appRole2JobPos) {
		getPersistence().cacheResult(appRole2JobPos);
	}

	/**
	* Caches the app role2 job poses in the entity cache if it is enabled.
	*
	* @param appRole2JobPoses the app role2 job poses
	*/
	public static void cacheResult(
		java.util.List<org.oep.core.ssomgt.model.AppRole2JobPos> appRole2JobPoses) {
		getPersistence().cacheResult(appRole2JobPoses);
	}

	/**
	* Creates a new app role2 job pos with the primary key. Does not add the app role2 job pos to the database.
	*
	* @param appRole2JobPosId the primary key for the new app role2 job pos
	* @return the new app role2 job pos
	*/
	public static org.oep.core.ssomgt.model.AppRole2JobPos create(
		long appRole2JobPosId) {
		return getPersistence().create(appRole2JobPosId);
	}

	/**
	* Removes the app role2 job pos with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param appRole2JobPosId the primary key of the app role2 job pos
	* @return the app role2 job pos that was removed
	* @throws org.oep.core.ssomgt.NoSuchAppRole2JobPosException if a app role2 job pos with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.AppRole2JobPos remove(
		long appRole2JobPosId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppRole2JobPosException {
		return getPersistence().remove(appRole2JobPosId);
	}

	public static org.oep.core.ssomgt.model.AppRole2JobPos updateImpl(
		org.oep.core.ssomgt.model.AppRole2JobPos appRole2JobPos)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(appRole2JobPos);
	}

	/**
	* Returns the app role2 job pos with the primary key or throws a {@link org.oep.core.ssomgt.NoSuchAppRole2JobPosException} if it could not be found.
	*
	* @param appRole2JobPosId the primary key of the app role2 job pos
	* @return the app role2 job pos
	* @throws org.oep.core.ssomgt.NoSuchAppRole2JobPosException if a app role2 job pos with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.AppRole2JobPos findByPrimaryKey(
		long appRole2JobPosId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchAppRole2JobPosException {
		return getPersistence().findByPrimaryKey(appRole2JobPosId);
	}

	/**
	* Returns the app role2 job pos with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param appRole2JobPosId the primary key of the app role2 job pos
	* @return the app role2 job pos, or <code>null</code> if a app role2 job pos with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.AppRole2JobPos fetchByPrimaryKey(
		long appRole2JobPosId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(appRole2JobPosId);
	}

	/**
	* Returns all the app role2 job poses.
	*
	* @return the app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.ssomgt.model.AppRole2JobPos> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the app role2 job poses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRole2JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of app role2 job poses
	* @param end the upper bound of the range of app role2 job poses (not inclusive)
	* @return the range of app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.ssomgt.model.AppRole2JobPos> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the app role2 job poses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRole2JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of app role2 job poses
	* @param end the upper bound of the range of app role2 job poses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.ssomgt.model.AppRole2JobPos> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the app role2 job poses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of app role2 job poses.
	*
	* @return the number of app role2 job poses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AppRole2JobPosPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AppRole2JobPosPersistence)PortletBeanLocatorUtil.locate(org.oep.core.ssomgt.service.ClpSerializer.getServletContextName(),
					AppRole2JobPosPersistence.class.getName());

			ReferenceRegistry.registerReference(AppRole2JobPosUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(AppRole2JobPosPersistence persistence) {
	}

	private static AppRole2JobPosPersistence _persistence;
}