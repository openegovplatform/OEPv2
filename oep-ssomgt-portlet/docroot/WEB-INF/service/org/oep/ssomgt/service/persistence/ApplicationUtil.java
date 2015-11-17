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

import org.oep.ssomgt.model.Application;

import java.util.List;

/**
 * The persistence utility for the application service. This utility wraps {@link ApplicationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see ApplicationPersistence
 * @see ApplicationPersistenceImpl
 * @generated
 */
public class ApplicationUtil {
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
	public static void clearCache(Application application) {
		getPersistence().clearCache(application);
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
	public static List<Application> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Application> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Application> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Application update(Application application)
		throws SystemException {
		return getPersistence().update(application);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Application update(Application application,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(application, serviceContext);
	}

	/**
	* Returns all the applications where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching applications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.Application> findByC(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC(companyId);
	}

	/**
	* Returns a range of all the applications where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.ApplicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of applications
	* @param end the upper bound of the range of applications (not inclusive)
	* @return the range of matching applications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.Application> findByC(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC(companyId, start, end);
	}

	/**
	* Returns an ordered range of all the applications where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.ApplicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of applications
	* @param end the upper bound of the range of applications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching applications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.Application> findByC(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC(companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first application in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching application
	* @throws org.oep.ssomgt.NoSuchApplicationException if a matching application could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.Application findByC_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchApplicationException {
		return getPersistence().findByC_First(companyId, orderByComparator);
	}

	/**
	* Returns the first application in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching application, or <code>null</code> if a matching application could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.Application fetchByC_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_First(companyId, orderByComparator);
	}

	/**
	* Returns the last application in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching application
	* @throws org.oep.ssomgt.NoSuchApplicationException if a matching application could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.Application findByC_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchApplicationException {
		return getPersistence().findByC_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last application in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching application, or <code>null</code> if a matching application could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.Application fetchByC_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_Last(companyId, orderByComparator);
	}

	/**
	* Returns the applications before and after the current application in the ordered set where companyId = &#63;.
	*
	* @param applicationId the primary key of the current application
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next application
	* @throws org.oep.ssomgt.NoSuchApplicationException if a application with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.Application[] findByC_PrevAndNext(
		long applicationId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchApplicationException {
		return getPersistence()
				   .findByC_PrevAndNext(applicationId, companyId,
			orderByComparator);
	}

	/**
	* Removes all the applications where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC(companyId);
	}

	/**
	* Returns the number of applications where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching applications
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC(companyId);
	}

	/**
	* Returns all the applications where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching applications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.Application> findByC_G(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_G(companyId, groupId);
	}

	/**
	* Returns a range of all the applications where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.ApplicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of applications
	* @param end the upper bound of the range of applications (not inclusive)
	* @return the range of matching applications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.Application> findByC_G(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_G(companyId, groupId, start, end);
	}

	/**
	* Returns an ordered range of all the applications where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.ApplicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of applications
	* @param end the upper bound of the range of applications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching applications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.Application> findByC_G(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G(companyId, groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first application in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching application
	* @throws org.oep.ssomgt.NoSuchApplicationException if a matching application could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.Application findByC_G_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchApplicationException {
		return getPersistence()
				   .findByC_G_First(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the first application in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching application, or <code>null</code> if a matching application could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.Application fetchByC_G_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_First(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the last application in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching application
	* @throws org.oep.ssomgt.NoSuchApplicationException if a matching application could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.Application findByC_G_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchApplicationException {
		return getPersistence()
				   .findByC_G_Last(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the last application in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching application, or <code>null</code> if a matching application could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.Application fetchByC_G_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_Last(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the applications before and after the current application in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param applicationId the primary key of the current application
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next application
	* @throws org.oep.ssomgt.NoSuchApplicationException if a application with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.Application[] findByC_G_PrevAndNext(
		long applicationId, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchApplicationException {
		return getPersistence()
				   .findByC_G_PrevAndNext(applicationId, companyId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the applications where companyId = &#63; and groupId = &#63; from the database.
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
	* Returns the number of applications where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching applications
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_G(companyId, groupId);
	}

	/**
	* Returns the application where appCode = &#63; or throws a {@link org.oep.ssomgt.NoSuchApplicationException} if it could not be found.
	*
	* @param appCode the app code
	* @return the matching application
	* @throws org.oep.ssomgt.NoSuchApplicationException if a matching application could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.Application findByAC(
		java.lang.String appCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchApplicationException {
		return getPersistence().findByAC(appCode);
	}

	/**
	* Returns the application where appCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param appCode the app code
	* @return the matching application, or <code>null</code> if a matching application could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.Application fetchByAC(
		java.lang.String appCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByAC(appCode);
	}

	/**
	* Returns the application where appCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param appCode the app code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching application, or <code>null</code> if a matching application could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.Application fetchByAC(
		java.lang.String appCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByAC(appCode, retrieveFromCache);
	}

	/**
	* Removes the application where appCode = &#63; from the database.
	*
	* @param appCode the app code
	* @return the application that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.Application removeByAC(
		java.lang.String appCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchApplicationException {
		return getPersistence().removeByAC(appCode);
	}

	/**
	* Returns the number of applications where appCode = &#63;.
	*
	* @param appCode the app code
	* @return the number of matching applications
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAC(java.lang.String appCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByAC(appCode);
	}

	/**
	* Returns the application where appCode = &#63; and appPin = &#63; or throws a {@link org.oep.ssomgt.NoSuchApplicationException} if it could not be found.
	*
	* @param appCode the app code
	* @param appPin the app pin
	* @return the matching application
	* @throws org.oep.ssomgt.NoSuchApplicationException if a matching application could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.Application findByAC_P(
		java.lang.String appCode, java.lang.String appPin)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchApplicationException {
		return getPersistence().findByAC_P(appCode, appPin);
	}

	/**
	* Returns the application where appCode = &#63; and appPin = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param appCode the app code
	* @param appPin the app pin
	* @return the matching application, or <code>null</code> if a matching application could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.Application fetchByAC_P(
		java.lang.String appCode, java.lang.String appPin)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByAC_P(appCode, appPin);
	}

	/**
	* Returns the application where appCode = &#63; and appPin = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param appCode the app code
	* @param appPin the app pin
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching application, or <code>null</code> if a matching application could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.Application fetchByAC_P(
		java.lang.String appCode, java.lang.String appPin,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByAC_P(appCode, appPin, retrieveFromCache);
	}

	/**
	* Removes the application where appCode = &#63; and appPin = &#63; from the database.
	*
	* @param appCode the app code
	* @param appPin the app pin
	* @return the application that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.Application removeByAC_P(
		java.lang.String appCode, java.lang.String appPin)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchApplicationException {
		return getPersistence().removeByAC_P(appCode, appPin);
	}

	/**
	* Returns the number of applications where appCode = &#63; and appPin = &#63;.
	*
	* @param appCode the app code
	* @param appPin the app pin
	* @return the number of matching applications
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAC_P(java.lang.String appCode,
		java.lang.String appPin)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByAC_P(appCode, appPin);
	}

	/**
	* Caches the application in the entity cache if it is enabled.
	*
	* @param application the application
	*/
	public static void cacheResult(org.oep.ssomgt.model.Application application) {
		getPersistence().cacheResult(application);
	}

	/**
	* Caches the applications in the entity cache if it is enabled.
	*
	* @param applications the applications
	*/
	public static void cacheResult(
		java.util.List<org.oep.ssomgt.model.Application> applications) {
		getPersistence().cacheResult(applications);
	}

	/**
	* Creates a new application with the primary key. Does not add the application to the database.
	*
	* @param applicationId the primary key for the new application
	* @return the new application
	*/
	public static org.oep.ssomgt.model.Application create(long applicationId) {
		return getPersistence().create(applicationId);
	}

	/**
	* Removes the application with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param applicationId the primary key of the application
	* @return the application that was removed
	* @throws org.oep.ssomgt.NoSuchApplicationException if a application with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.Application remove(long applicationId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchApplicationException {
		return getPersistence().remove(applicationId);
	}

	public static org.oep.ssomgt.model.Application updateImpl(
		org.oep.ssomgt.model.Application application)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(application);
	}

	/**
	* Returns the application with the primary key or throws a {@link org.oep.ssomgt.NoSuchApplicationException} if it could not be found.
	*
	* @param applicationId the primary key of the application
	* @return the application
	* @throws org.oep.ssomgt.NoSuchApplicationException if a application with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.Application findByPrimaryKey(
		long applicationId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchApplicationException {
		return getPersistence().findByPrimaryKey(applicationId);
	}

	/**
	* Returns the application with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param applicationId the primary key of the application
	* @return the application, or <code>null</code> if a application with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.Application fetchByPrimaryKey(
		long applicationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(applicationId);
	}

	/**
	* Returns all the applications.
	*
	* @return the applications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.Application> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the applications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.ApplicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of applications
	* @param end the upper bound of the range of applications (not inclusive)
	* @return the range of applications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.Application> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the applications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.ApplicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of applications
	* @param end the upper bound of the range of applications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of applications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.Application> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the applications from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of applications.
	*
	* @return the number of applications
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ApplicationPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ApplicationPersistence)PortletBeanLocatorUtil.locate(org.oep.ssomgt.service.ClpSerializer.getServletContextName(),
					ApplicationPersistence.class.getName());

			ReferenceRegistry.registerReference(ApplicationUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ApplicationPersistence persistence) {
	}

	private static ApplicationPersistence _persistence;
}