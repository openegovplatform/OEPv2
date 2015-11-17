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

import org.oep.ssomgt.model.Application;

/**
 * The persistence interface for the application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see ApplicationPersistenceImpl
 * @see ApplicationUtil
 * @generated
 */
public interface ApplicationPersistence extends BasePersistence<Application> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ApplicationUtil} to access the application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the applications where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching applications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.ssomgt.model.Application> findByC(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.ssomgt.model.Application> findByC(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.ssomgt.model.Application> findByC(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first application in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching application
	* @throws org.oep.ssomgt.NoSuchApplicationException if a matching application could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.Application findByC_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchApplicationException;

	/**
	* Returns the first application in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching application, or <code>null</code> if a matching application could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.Application fetchByC_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last application in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching application
	* @throws org.oep.ssomgt.NoSuchApplicationException if a matching application could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.Application findByC_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchApplicationException;

	/**
	* Returns the last application in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching application, or <code>null</code> if a matching application could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.Application fetchByC_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.ssomgt.model.Application[] findByC_PrevAndNext(
		long applicationId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchApplicationException;

	/**
	* Removes all the applications where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of applications where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching applications
	* @throws SystemException if a system exception occurred
	*/
	public int countByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the applications where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching applications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.ssomgt.model.Application> findByC_G(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.ssomgt.model.Application> findByC_G(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.ssomgt.model.Application> findByC_G(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.ssomgt.model.Application findByC_G_First(long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchApplicationException;

	/**
	* Returns the first application in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching application, or <code>null</code> if a matching application could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.Application fetchByC_G_First(long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.ssomgt.model.Application findByC_G_Last(long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchApplicationException;

	/**
	* Returns the last application in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching application, or <code>null</code> if a matching application could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.Application fetchByC_G_Last(long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.ssomgt.model.Application[] findByC_G_PrevAndNext(
		long applicationId, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchApplicationException;

	/**
	* Removes all the applications where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of applications where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching applications
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the application where appCode = &#63; or throws a {@link org.oep.ssomgt.NoSuchApplicationException} if it could not be found.
	*
	* @param appCode the app code
	* @return the matching application
	* @throws org.oep.ssomgt.NoSuchApplicationException if a matching application could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.Application findByAC(java.lang.String appCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchApplicationException;

	/**
	* Returns the application where appCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param appCode the app code
	* @return the matching application, or <code>null</code> if a matching application could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.Application fetchByAC(java.lang.String appCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the application where appCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param appCode the app code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching application, or <code>null</code> if a matching application could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.Application fetchByAC(
		java.lang.String appCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the application where appCode = &#63; from the database.
	*
	* @param appCode the app code
	* @return the application that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.Application removeByAC(java.lang.String appCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchApplicationException;

	/**
	* Returns the number of applications where appCode = &#63;.
	*
	* @param appCode the app code
	* @return the number of matching applications
	* @throws SystemException if a system exception occurred
	*/
	public int countByAC(java.lang.String appCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the application where appCode = &#63; and appPin = &#63; or throws a {@link org.oep.ssomgt.NoSuchApplicationException} if it could not be found.
	*
	* @param appCode the app code
	* @param appPin the app pin
	* @return the matching application
	* @throws org.oep.ssomgt.NoSuchApplicationException if a matching application could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.Application findByAC_P(
		java.lang.String appCode, java.lang.String appPin)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchApplicationException;

	/**
	* Returns the application where appCode = &#63; and appPin = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param appCode the app code
	* @param appPin the app pin
	* @return the matching application, or <code>null</code> if a matching application could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.Application fetchByAC_P(
		java.lang.String appCode, java.lang.String appPin)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the application where appCode = &#63; and appPin = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param appCode the app code
	* @param appPin the app pin
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching application, or <code>null</code> if a matching application could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.Application fetchByAC_P(
		java.lang.String appCode, java.lang.String appPin,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the application where appCode = &#63; and appPin = &#63; from the database.
	*
	* @param appCode the app code
	* @param appPin the app pin
	* @return the application that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.Application removeByAC_P(
		java.lang.String appCode, java.lang.String appPin)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchApplicationException;

	/**
	* Returns the number of applications where appCode = &#63; and appPin = &#63;.
	*
	* @param appCode the app code
	* @param appPin the app pin
	* @return the number of matching applications
	* @throws SystemException if a system exception occurred
	*/
	public int countByAC_P(java.lang.String appCode, java.lang.String appPin)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the application in the entity cache if it is enabled.
	*
	* @param application the application
	*/
	public void cacheResult(org.oep.ssomgt.model.Application application);

	/**
	* Caches the applications in the entity cache if it is enabled.
	*
	* @param applications the applications
	*/
	public void cacheResult(
		java.util.List<org.oep.ssomgt.model.Application> applications);

	/**
	* Creates a new application with the primary key. Does not add the application to the database.
	*
	* @param applicationId the primary key for the new application
	* @return the new application
	*/
	public org.oep.ssomgt.model.Application create(long applicationId);

	/**
	* Removes the application with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param applicationId the primary key of the application
	* @return the application that was removed
	* @throws org.oep.ssomgt.NoSuchApplicationException if a application with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.Application remove(long applicationId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchApplicationException;

	public org.oep.ssomgt.model.Application updateImpl(
		org.oep.ssomgt.model.Application application)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the application with the primary key or throws a {@link org.oep.ssomgt.NoSuchApplicationException} if it could not be found.
	*
	* @param applicationId the primary key of the application
	* @return the application
	* @throws org.oep.ssomgt.NoSuchApplicationException if a application with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.Application findByPrimaryKey(long applicationId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchApplicationException;

	/**
	* Returns the application with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param applicationId the primary key of the application
	* @return the application, or <code>null</code> if a application with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.ssomgt.model.Application fetchByPrimaryKey(
		long applicationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the applications.
	*
	* @return the applications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.ssomgt.model.Application> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.ssomgt.model.Application> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.ssomgt.model.Application> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the applications from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of applications.
	*
	* @return the number of applications
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}