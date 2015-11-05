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

import org.oep.usermgt.model.Business;

/**
 * The persistence interface for the business service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NQMINH
 * @see BusinessPersistenceImpl
 * @see BusinessUtil
 * @generated
 */
public interface BusinessPersistence extends BasePersistence<Business> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BusinessUtil} to access the business persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the businesses where masterUserId = &#63;.
	*
	* @param masterUserId the master user ID
	* @return the matching businesses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Business> findByMU(
		long masterUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the businesses where masterUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.BusinessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param masterUserId the master user ID
	* @param start the lower bound of the range of businesses
	* @param end the upper bound of the range of businesses (not inclusive)
	* @return the range of matching businesses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Business> findByMU(
		long masterUserId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the businesses where masterUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.BusinessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param masterUserId the master user ID
	* @param start the lower bound of the range of businesses
	* @param end the upper bound of the range of businesses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching businesses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Business> findByMU(
		long masterUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first business in the ordered set where masterUserId = &#63;.
	*
	* @param masterUserId the master user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching business
	* @throws org.oep.usermgt.NoSuchBusinessException if a matching business could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Business findByMU_First(long masterUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchBusinessException;

	/**
	* Returns the first business in the ordered set where masterUserId = &#63;.
	*
	* @param masterUserId the master user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching business, or <code>null</code> if a matching business could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Business fetchByMU_First(long masterUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last business in the ordered set where masterUserId = &#63;.
	*
	* @param masterUserId the master user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching business
	* @throws org.oep.usermgt.NoSuchBusinessException if a matching business could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Business findByMU_Last(long masterUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchBusinessException;

	/**
	* Returns the last business in the ordered set where masterUserId = &#63;.
	*
	* @param masterUserId the master user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching business, or <code>null</code> if a matching business could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Business fetchByMU_Last(long masterUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the businesses before and after the current business in the ordered set where masterUserId = &#63;.
	*
	* @param businessId the primary key of the current business
	* @param masterUserId the master user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next business
	* @throws org.oep.usermgt.NoSuchBusinessException if a business with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Business[] findByMU_PrevAndNext(
		long businessId, long masterUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchBusinessException;

	/**
	* Removes all the businesses where masterUserId = &#63; from the database.
	*
	* @param masterUserId the master user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByMU(long masterUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of businesses where masterUserId = &#63;.
	*
	* @param masterUserId the master user ID
	* @return the number of matching businesses
	* @throws SystemException if a system exception occurred
	*/
	public int countByMU(long masterUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the businesses where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the matching businesses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Business> findByO(
		long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the businesses where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.BusinessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of businesses
	* @param end the upper bound of the range of businesses (not inclusive)
	* @return the range of matching businesses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Business> findByO(
		long organizationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the businesses where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.BusinessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of businesses
	* @param end the upper bound of the range of businesses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching businesses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Business> findByO(
		long organizationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first business in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching business
	* @throws org.oep.usermgt.NoSuchBusinessException if a matching business could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Business findByO_First(long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchBusinessException;

	/**
	* Returns the first business in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching business, or <code>null</code> if a matching business could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Business fetchByO_First(long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last business in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching business
	* @throws org.oep.usermgt.NoSuchBusinessException if a matching business could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Business findByO_Last(long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchBusinessException;

	/**
	* Returns the last business in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching business, or <code>null</code> if a matching business could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Business fetchByO_Last(long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the businesses before and after the current business in the ordered set where organizationId = &#63;.
	*
	* @param businessId the primary key of the current business
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next business
	* @throws org.oep.usermgt.NoSuchBusinessException if a business with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Business[] findByO_PrevAndNext(
		long businessId, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchBusinessException;

	/**
	* Removes all the businesses where organizationId = &#63; from the database.
	*
	* @param organizationId the organization ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByO(long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of businesses where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the number of matching businesses
	* @throws SystemException if a system exception occurred
	*/
	public int countByO(long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the businesses where cityNo = &#63;.
	*
	* @param cityNo the city no
	* @return the matching businesses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Business> findByCN(
		java.lang.String cityNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the businesses where cityNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.BusinessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param cityNo the city no
	* @param start the lower bound of the range of businesses
	* @param end the upper bound of the range of businesses (not inclusive)
	* @return the range of matching businesses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Business> findByCN(
		java.lang.String cityNo, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the businesses where cityNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.BusinessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param cityNo the city no
	* @param start the lower bound of the range of businesses
	* @param end the upper bound of the range of businesses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching businesses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Business> findByCN(
		java.lang.String cityNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first business in the ordered set where cityNo = &#63;.
	*
	* @param cityNo the city no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching business
	* @throws org.oep.usermgt.NoSuchBusinessException if a matching business could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Business findByCN_First(
		java.lang.String cityNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchBusinessException;

	/**
	* Returns the first business in the ordered set where cityNo = &#63;.
	*
	* @param cityNo the city no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching business, or <code>null</code> if a matching business could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Business fetchByCN_First(
		java.lang.String cityNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last business in the ordered set where cityNo = &#63;.
	*
	* @param cityNo the city no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching business
	* @throws org.oep.usermgt.NoSuchBusinessException if a matching business could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Business findByCN_Last(
		java.lang.String cityNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchBusinessException;

	/**
	* Returns the last business in the ordered set where cityNo = &#63;.
	*
	* @param cityNo the city no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching business, or <code>null</code> if a matching business could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Business fetchByCN_Last(
		java.lang.String cityNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the businesses before and after the current business in the ordered set where cityNo = &#63;.
	*
	* @param businessId the primary key of the current business
	* @param cityNo the city no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next business
	* @throws org.oep.usermgt.NoSuchBusinessException if a business with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Business[] findByCN_PrevAndNext(
		long businessId, java.lang.String cityNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchBusinessException;

	/**
	* Removes all the businesses where cityNo = &#63; from the database.
	*
	* @param cityNo the city no
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCN(java.lang.String cityNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of businesses where cityNo = &#63;.
	*
	* @param cityNo the city no
	* @return the number of matching businesses
	* @throws SystemException if a system exception occurred
	*/
	public int countByCN(java.lang.String cityNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the businesses where districtNo = &#63;.
	*
	* @param districtNo the district no
	* @return the matching businesses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Business> findByDN(
		java.lang.String districtNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the businesses where districtNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.BusinessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param districtNo the district no
	* @param start the lower bound of the range of businesses
	* @param end the upper bound of the range of businesses (not inclusive)
	* @return the range of matching businesses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Business> findByDN(
		java.lang.String districtNo, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the businesses where districtNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.BusinessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param districtNo the district no
	* @param start the lower bound of the range of businesses
	* @param end the upper bound of the range of businesses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching businesses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Business> findByDN(
		java.lang.String districtNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first business in the ordered set where districtNo = &#63;.
	*
	* @param districtNo the district no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching business
	* @throws org.oep.usermgt.NoSuchBusinessException if a matching business could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Business findByDN_First(
		java.lang.String districtNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchBusinessException;

	/**
	* Returns the first business in the ordered set where districtNo = &#63;.
	*
	* @param districtNo the district no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching business, or <code>null</code> if a matching business could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Business fetchByDN_First(
		java.lang.String districtNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last business in the ordered set where districtNo = &#63;.
	*
	* @param districtNo the district no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching business
	* @throws org.oep.usermgt.NoSuchBusinessException if a matching business could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Business findByDN_Last(
		java.lang.String districtNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchBusinessException;

	/**
	* Returns the last business in the ordered set where districtNo = &#63;.
	*
	* @param districtNo the district no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching business, or <code>null</code> if a matching business could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Business fetchByDN_Last(
		java.lang.String districtNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the businesses before and after the current business in the ordered set where districtNo = &#63;.
	*
	* @param businessId the primary key of the current business
	* @param districtNo the district no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next business
	* @throws org.oep.usermgt.NoSuchBusinessException if a business with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Business[] findByDN_PrevAndNext(
		long businessId, java.lang.String districtNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchBusinessException;

	/**
	* Removes all the businesses where districtNo = &#63; from the database.
	*
	* @param districtNo the district no
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDN(java.lang.String districtNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of businesses where districtNo = &#63;.
	*
	* @param districtNo the district no
	* @return the number of matching businesses
	* @throws SystemException if a system exception occurred
	*/
	public int countByDN(java.lang.String districtNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the businesses where wardNo = &#63;.
	*
	* @param wardNo the ward no
	* @return the matching businesses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Business> findByWN(
		java.lang.String wardNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the businesses where wardNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.BusinessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param wardNo the ward no
	* @param start the lower bound of the range of businesses
	* @param end the upper bound of the range of businesses (not inclusive)
	* @return the range of matching businesses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Business> findByWN(
		java.lang.String wardNo, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the businesses where wardNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.BusinessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param wardNo the ward no
	* @param start the lower bound of the range of businesses
	* @param end the upper bound of the range of businesses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching businesses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Business> findByWN(
		java.lang.String wardNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first business in the ordered set where wardNo = &#63;.
	*
	* @param wardNo the ward no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching business
	* @throws org.oep.usermgt.NoSuchBusinessException if a matching business could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Business findByWN_First(
		java.lang.String wardNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchBusinessException;

	/**
	* Returns the first business in the ordered set where wardNo = &#63;.
	*
	* @param wardNo the ward no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching business, or <code>null</code> if a matching business could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Business fetchByWN_First(
		java.lang.String wardNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last business in the ordered set where wardNo = &#63;.
	*
	* @param wardNo the ward no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching business
	* @throws org.oep.usermgt.NoSuchBusinessException if a matching business could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Business findByWN_Last(
		java.lang.String wardNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchBusinessException;

	/**
	* Returns the last business in the ordered set where wardNo = &#63;.
	*
	* @param wardNo the ward no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching business, or <code>null</code> if a matching business could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Business fetchByWN_Last(
		java.lang.String wardNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the businesses before and after the current business in the ordered set where wardNo = &#63;.
	*
	* @param businessId the primary key of the current business
	* @param wardNo the ward no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next business
	* @throws org.oep.usermgt.NoSuchBusinessException if a business with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Business[] findByWN_PrevAndNext(
		long businessId, java.lang.String wardNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchBusinessException;

	/**
	* Removes all the businesses where wardNo = &#63; from the database.
	*
	* @param wardNo the ward no
	* @throws SystemException if a system exception occurred
	*/
	public void removeByWN(java.lang.String wardNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of businesses where wardNo = &#63;.
	*
	* @param wardNo the ward no
	* @return the number of matching businesses
	* @throws SystemException if a system exception occurred
	*/
	public int countByWN(java.lang.String wardNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the business where registerAgent = &#63; or throws a {@link org.oep.usermgt.NoSuchBusinessException} if it could not be found.
	*
	* @param registerAgent the register agent
	* @return the matching business
	* @throws org.oep.usermgt.NoSuchBusinessException if a matching business could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Business findByRA(
		java.lang.String registerAgent)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchBusinessException;

	/**
	* Returns the business where registerAgent = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param registerAgent the register agent
	* @return the matching business, or <code>null</code> if a matching business could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Business fetchByRA(
		java.lang.String registerAgent)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the business where registerAgent = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param registerAgent the register agent
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching business, or <code>null</code> if a matching business could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Business fetchByRA(
		java.lang.String registerAgent, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the business where registerAgent = &#63; from the database.
	*
	* @param registerAgent the register agent
	* @return the business that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Business removeByRA(
		java.lang.String registerAgent)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchBusinessException;

	/**
	* Returns the number of businesses where registerAgent = &#63;.
	*
	* @param registerAgent the register agent
	* @return the number of matching businesses
	* @throws SystemException if a system exception occurred
	*/
	public int countByRA(java.lang.String registerAgent)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the business in the entity cache if it is enabled.
	*
	* @param business the business
	*/
	public void cacheResult(org.oep.usermgt.model.Business business);

	/**
	* Caches the businesses in the entity cache if it is enabled.
	*
	* @param businesses the businesses
	*/
	public void cacheResult(
		java.util.List<org.oep.usermgt.model.Business> businesses);

	/**
	* Creates a new business with the primary key. Does not add the business to the database.
	*
	* @param businessId the primary key for the new business
	* @return the new business
	*/
	public org.oep.usermgt.model.Business create(long businessId);

	/**
	* Removes the business with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param businessId the primary key of the business
	* @return the business that was removed
	* @throws org.oep.usermgt.NoSuchBusinessException if a business with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Business remove(long businessId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchBusinessException;

	public org.oep.usermgt.model.Business updateImpl(
		org.oep.usermgt.model.Business business)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the business with the primary key or throws a {@link org.oep.usermgt.NoSuchBusinessException} if it could not be found.
	*
	* @param businessId the primary key of the business
	* @return the business
	* @throws org.oep.usermgt.NoSuchBusinessException if a business with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Business findByPrimaryKey(long businessId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchBusinessException;

	/**
	* Returns the business with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param businessId the primary key of the business
	* @return the business, or <code>null</code> if a business with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Business fetchByPrimaryKey(long businessId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the businesses.
	*
	* @return the businesses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Business> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the businesses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.BusinessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businesses
	* @param end the upper bound of the range of businesses (not inclusive)
	* @return the range of businesses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Business> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the businesses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.BusinessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businesses
	* @param end the upper bound of the range of businesses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of businesses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Business> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the businesses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of businesses.
	*
	* @return the number of businesses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}