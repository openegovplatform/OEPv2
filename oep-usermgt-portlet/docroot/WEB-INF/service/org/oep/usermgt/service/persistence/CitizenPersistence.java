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

import org.oep.usermgt.model.Citizen;

/**
 * The persistence interface for the citizen service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NQMINH
 * @see CitizenPersistenceImpl
 * @see CitizenUtil
 * @generated
 */
public interface CitizenPersistence extends BasePersistence<Citizen> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CitizenUtil} to access the citizen persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the citizens where cityNo = &#63;.
	*
	* @param cityNo the city no
	* @return the matching citizens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Citizen> findByCN(
		java.lang.String cityNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the citizens where cityNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.CitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param cityNo the city no
	* @param start the lower bound of the range of citizens
	* @param end the upper bound of the range of citizens (not inclusive)
	* @return the range of matching citizens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Citizen> findByCN(
		java.lang.String cityNo, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the citizens where cityNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.CitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param cityNo the city no
	* @param start the lower bound of the range of citizens
	* @param end the upper bound of the range of citizens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching citizens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Citizen> findByCN(
		java.lang.String cityNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first citizen in the ordered set where cityNo = &#63;.
	*
	* @param cityNo the city no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen
	* @throws org.oep.usermgt.NoSuchCitizenException if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Citizen findByCN_First(
		java.lang.String cityNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchCitizenException;

	/**
	* Returns the first citizen in the ordered set where cityNo = &#63;.
	*
	* @param cityNo the city no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen, or <code>null</code> if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Citizen fetchByCN_First(
		java.lang.String cityNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last citizen in the ordered set where cityNo = &#63;.
	*
	* @param cityNo the city no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen
	* @throws org.oep.usermgt.NoSuchCitizenException if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Citizen findByCN_Last(
		java.lang.String cityNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchCitizenException;

	/**
	* Returns the last citizen in the ordered set where cityNo = &#63;.
	*
	* @param cityNo the city no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen, or <code>null</code> if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Citizen fetchByCN_Last(
		java.lang.String cityNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the citizens before and after the current citizen in the ordered set where cityNo = &#63;.
	*
	* @param citizenId the primary key of the current citizen
	* @param cityNo the city no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next citizen
	* @throws org.oep.usermgt.NoSuchCitizenException if a citizen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Citizen[] findByCN_PrevAndNext(
		long citizenId, java.lang.String cityNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchCitizenException;

	/**
	* Removes all the citizens where cityNo = &#63; from the database.
	*
	* @param cityNo the city no
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCN(java.lang.String cityNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of citizens where cityNo = &#63;.
	*
	* @param cityNo the city no
	* @return the number of matching citizens
	* @throws SystemException if a system exception occurred
	*/
	public int countByCN(java.lang.String cityNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the citizens where districtNo = &#63;.
	*
	* @param districtNo the district no
	* @return the matching citizens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Citizen> findByDN(
		java.lang.String districtNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the citizens where districtNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.CitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param districtNo the district no
	* @param start the lower bound of the range of citizens
	* @param end the upper bound of the range of citizens (not inclusive)
	* @return the range of matching citizens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Citizen> findByDN(
		java.lang.String districtNo, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the citizens where districtNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.CitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param districtNo the district no
	* @param start the lower bound of the range of citizens
	* @param end the upper bound of the range of citizens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching citizens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Citizen> findByDN(
		java.lang.String districtNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first citizen in the ordered set where districtNo = &#63;.
	*
	* @param districtNo the district no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen
	* @throws org.oep.usermgt.NoSuchCitizenException if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Citizen findByDN_First(
		java.lang.String districtNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchCitizenException;

	/**
	* Returns the first citizen in the ordered set where districtNo = &#63;.
	*
	* @param districtNo the district no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen, or <code>null</code> if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Citizen fetchByDN_First(
		java.lang.String districtNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last citizen in the ordered set where districtNo = &#63;.
	*
	* @param districtNo the district no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen
	* @throws org.oep.usermgt.NoSuchCitizenException if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Citizen findByDN_Last(
		java.lang.String districtNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchCitizenException;

	/**
	* Returns the last citizen in the ordered set where districtNo = &#63;.
	*
	* @param districtNo the district no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen, or <code>null</code> if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Citizen fetchByDN_Last(
		java.lang.String districtNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the citizens before and after the current citizen in the ordered set where districtNo = &#63;.
	*
	* @param citizenId the primary key of the current citizen
	* @param districtNo the district no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next citizen
	* @throws org.oep.usermgt.NoSuchCitizenException if a citizen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Citizen[] findByDN_PrevAndNext(
		long citizenId, java.lang.String districtNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchCitizenException;

	/**
	* Removes all the citizens where districtNo = &#63; from the database.
	*
	* @param districtNo the district no
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDN(java.lang.String districtNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of citizens where districtNo = &#63;.
	*
	* @param districtNo the district no
	* @return the number of matching citizens
	* @throws SystemException if a system exception occurred
	*/
	public int countByDN(java.lang.String districtNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the citizens where wardNo = &#63;.
	*
	* @param wardNo the ward no
	* @return the matching citizens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Citizen> findByWN(
		java.lang.String wardNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the citizens where wardNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.CitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param wardNo the ward no
	* @param start the lower bound of the range of citizens
	* @param end the upper bound of the range of citizens (not inclusive)
	* @return the range of matching citizens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Citizen> findByWN(
		java.lang.String wardNo, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the citizens where wardNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.CitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param wardNo the ward no
	* @param start the lower bound of the range of citizens
	* @param end the upper bound of the range of citizens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching citizens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Citizen> findByWN(
		java.lang.String wardNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first citizen in the ordered set where wardNo = &#63;.
	*
	* @param wardNo the ward no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen
	* @throws org.oep.usermgt.NoSuchCitizenException if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Citizen findByWN_First(
		java.lang.String wardNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchCitizenException;

	/**
	* Returns the first citizen in the ordered set where wardNo = &#63;.
	*
	* @param wardNo the ward no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen, or <code>null</code> if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Citizen fetchByWN_First(
		java.lang.String wardNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last citizen in the ordered set where wardNo = &#63;.
	*
	* @param wardNo the ward no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen
	* @throws org.oep.usermgt.NoSuchCitizenException if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Citizen findByWN_Last(
		java.lang.String wardNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchCitizenException;

	/**
	* Returns the last citizen in the ordered set where wardNo = &#63;.
	*
	* @param wardNo the ward no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen, or <code>null</code> if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Citizen fetchByWN_Last(
		java.lang.String wardNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the citizens before and after the current citizen in the ordered set where wardNo = &#63;.
	*
	* @param citizenId the primary key of the current citizen
	* @param wardNo the ward no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next citizen
	* @throws org.oep.usermgt.NoSuchCitizenException if a citizen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Citizen[] findByWN_PrevAndNext(
		long citizenId, java.lang.String wardNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchCitizenException;

	/**
	* Removes all the citizens where wardNo = &#63; from the database.
	*
	* @param wardNo the ward no
	* @throws SystemException if a system exception occurred
	*/
	public void removeByWN(java.lang.String wardNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of citizens where wardNo = &#63;.
	*
	* @param wardNo the ward no
	* @return the number of matching citizens
	* @throws SystemException if a system exception occurred
	*/
	public int countByWN(java.lang.String wardNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the citizen where mappingUserId = &#63; or throws a {@link org.oep.usermgt.NoSuchCitizenException} if it could not be found.
	*
	* @param mappingUserId the mapping user ID
	* @return the matching citizen
	* @throws org.oep.usermgt.NoSuchCitizenException if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Citizen findByMU(long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchCitizenException;

	/**
	* Returns the citizen where mappingUserId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param mappingUserId the mapping user ID
	* @return the matching citizen, or <code>null</code> if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Citizen fetchByMU(long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the citizen where mappingUserId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param mappingUserId the mapping user ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching citizen, or <code>null</code> if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Citizen fetchByMU(long mappingUserId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the citizen where mappingUserId = &#63; from the database.
	*
	* @param mappingUserId the mapping user ID
	* @return the citizen that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Citizen removeByMU(long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchCitizenException;

	/**
	* Returns the number of citizens where mappingUserId = &#63;.
	*
	* @param mappingUserId the mapping user ID
	* @return the number of matching citizens
	* @throws SystemException if a system exception occurred
	*/
	public int countByMU(long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the citizen where identificationNo = &#63; or throws a {@link org.oep.usermgt.NoSuchCitizenException} if it could not be found.
	*
	* @param identificationNo the identification no
	* @return the matching citizen
	* @throws org.oep.usermgt.NoSuchCitizenException if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Citizen findByIN(
		java.lang.String identificationNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchCitizenException;

	/**
	* Returns the citizen where identificationNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param identificationNo the identification no
	* @return the matching citizen, or <code>null</code> if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Citizen fetchByIN(
		java.lang.String identificationNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the citizen where identificationNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param identificationNo the identification no
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching citizen, or <code>null</code> if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Citizen fetchByIN(
		java.lang.String identificationNo, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the citizen where identificationNo = &#63; from the database.
	*
	* @param identificationNo the identification no
	* @return the citizen that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Citizen removeByIN(
		java.lang.String identificationNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchCitizenException;

	/**
	* Returns the number of citizens where identificationNo = &#63;.
	*
	* @param identificationNo the identification no
	* @return the number of matching citizens
	* @throws SystemException if a system exception occurred
	*/
	public int countByIN(java.lang.String identificationNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the citizen in the entity cache if it is enabled.
	*
	* @param citizen the citizen
	*/
	public void cacheResult(org.oep.usermgt.model.Citizen citizen);

	/**
	* Caches the citizens in the entity cache if it is enabled.
	*
	* @param citizens the citizens
	*/
	public void cacheResult(
		java.util.List<org.oep.usermgt.model.Citizen> citizens);

	/**
	* Creates a new citizen with the primary key. Does not add the citizen to the database.
	*
	* @param citizenId the primary key for the new citizen
	* @return the new citizen
	*/
	public org.oep.usermgt.model.Citizen create(long citizenId);

	/**
	* Removes the citizen with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param citizenId the primary key of the citizen
	* @return the citizen that was removed
	* @throws org.oep.usermgt.NoSuchCitizenException if a citizen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Citizen remove(long citizenId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchCitizenException;

	public org.oep.usermgt.model.Citizen updateImpl(
		org.oep.usermgt.model.Citizen citizen)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the citizen with the primary key or throws a {@link org.oep.usermgt.NoSuchCitizenException} if it could not be found.
	*
	* @param citizenId the primary key of the citizen
	* @return the citizen
	* @throws org.oep.usermgt.NoSuchCitizenException if a citizen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Citizen findByPrimaryKey(long citizenId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchCitizenException;

	/**
	* Returns the citizen with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param citizenId the primary key of the citizen
	* @return the citizen, or <code>null</code> if a citizen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.usermgt.model.Citizen fetchByPrimaryKey(long citizenId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the citizens.
	*
	* @return the citizens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Citizen> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the citizens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.CitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of citizens
	* @param end the upper bound of the range of citizens (not inclusive)
	* @return the range of citizens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Citizen> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the citizens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.CitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of citizens
	* @param end the upper bound of the range of citizens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of citizens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.usermgt.model.Citizen> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the citizens from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of citizens.
	*
	* @return the number of citizens
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}