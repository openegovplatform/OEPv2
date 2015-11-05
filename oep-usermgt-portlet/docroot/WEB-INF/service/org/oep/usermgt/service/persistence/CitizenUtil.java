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

import org.oep.usermgt.model.Citizen;

import java.util.List;

/**
 * The persistence utility for the citizen service. This utility wraps {@link CitizenPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NQMINH
 * @see CitizenPersistence
 * @see CitizenPersistenceImpl
 * @generated
 */
public class CitizenUtil {
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
	public static void clearCache(Citizen citizen) {
		getPersistence().clearCache(citizen);
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
	public static List<Citizen> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Citizen> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Citizen> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Citizen update(Citizen citizen) throws SystemException {
		return getPersistence().update(citizen);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Citizen update(Citizen citizen, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(citizen, serviceContext);
	}

	/**
	* Returns all the citizens where cityNo = &#63;.
	*
	* @param cityNo the city no
	* @return the matching citizens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.Citizen> findByCN(
		java.lang.String cityNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCN(cityNo);
	}

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
	public static java.util.List<org.oep.usermgt.model.Citizen> findByCN(
		java.lang.String cityNo, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCN(cityNo, start, end);
	}

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
	public static java.util.List<org.oep.usermgt.model.Citizen> findByCN(
		java.lang.String cityNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCN(cityNo, start, end, orderByComparator);
	}

	/**
	* Returns the first citizen in the ordered set where cityNo = &#63;.
	*
	* @param cityNo the city no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen
	* @throws org.oep.usermgt.NoSuchCitizenException if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Citizen findByCN_First(
		java.lang.String cityNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchCitizenException {
		return getPersistence().findByCN_First(cityNo, orderByComparator);
	}

	/**
	* Returns the first citizen in the ordered set where cityNo = &#63;.
	*
	* @param cityNo the city no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen, or <code>null</code> if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Citizen fetchByCN_First(
		java.lang.String cityNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCN_First(cityNo, orderByComparator);
	}

	/**
	* Returns the last citizen in the ordered set where cityNo = &#63;.
	*
	* @param cityNo the city no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen
	* @throws org.oep.usermgt.NoSuchCitizenException if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Citizen findByCN_Last(
		java.lang.String cityNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchCitizenException {
		return getPersistence().findByCN_Last(cityNo, orderByComparator);
	}

	/**
	* Returns the last citizen in the ordered set where cityNo = &#63;.
	*
	* @param cityNo the city no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen, or <code>null</code> if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Citizen fetchByCN_Last(
		java.lang.String cityNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCN_Last(cityNo, orderByComparator);
	}

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
	public static org.oep.usermgt.model.Citizen[] findByCN_PrevAndNext(
		long citizenId, java.lang.String cityNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchCitizenException {
		return getPersistence()
				   .findByCN_PrevAndNext(citizenId, cityNo, orderByComparator);
	}

	/**
	* Removes all the citizens where cityNo = &#63; from the database.
	*
	* @param cityNo the city no
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCN(java.lang.String cityNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCN(cityNo);
	}

	/**
	* Returns the number of citizens where cityNo = &#63;.
	*
	* @param cityNo the city no
	* @return the number of matching citizens
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCN(java.lang.String cityNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCN(cityNo);
	}

	/**
	* Returns all the citizens where districtNo = &#63;.
	*
	* @param districtNo the district no
	* @return the matching citizens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.Citizen> findByDN(
		java.lang.String districtNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDN(districtNo);
	}

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
	public static java.util.List<org.oep.usermgt.model.Citizen> findByDN(
		java.lang.String districtNo, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDN(districtNo, start, end);
	}

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
	public static java.util.List<org.oep.usermgt.model.Citizen> findByDN(
		java.lang.String districtNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDN(districtNo, start, end, orderByComparator);
	}

	/**
	* Returns the first citizen in the ordered set where districtNo = &#63;.
	*
	* @param districtNo the district no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen
	* @throws org.oep.usermgt.NoSuchCitizenException if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Citizen findByDN_First(
		java.lang.String districtNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchCitizenException {
		return getPersistence().findByDN_First(districtNo, orderByComparator);
	}

	/**
	* Returns the first citizen in the ordered set where districtNo = &#63;.
	*
	* @param districtNo the district no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen, or <code>null</code> if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Citizen fetchByDN_First(
		java.lang.String districtNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByDN_First(districtNo, orderByComparator);
	}

	/**
	* Returns the last citizen in the ordered set where districtNo = &#63;.
	*
	* @param districtNo the district no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen
	* @throws org.oep.usermgt.NoSuchCitizenException if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Citizen findByDN_Last(
		java.lang.String districtNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchCitizenException {
		return getPersistence().findByDN_Last(districtNo, orderByComparator);
	}

	/**
	* Returns the last citizen in the ordered set where districtNo = &#63;.
	*
	* @param districtNo the district no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen, or <code>null</code> if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Citizen fetchByDN_Last(
		java.lang.String districtNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByDN_Last(districtNo, orderByComparator);
	}

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
	public static org.oep.usermgt.model.Citizen[] findByDN_PrevAndNext(
		long citizenId, java.lang.String districtNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchCitizenException {
		return getPersistence()
				   .findByDN_PrevAndNext(citizenId, districtNo,
			orderByComparator);
	}

	/**
	* Removes all the citizens where districtNo = &#63; from the database.
	*
	* @param districtNo the district no
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDN(java.lang.String districtNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDN(districtNo);
	}

	/**
	* Returns the number of citizens where districtNo = &#63;.
	*
	* @param districtNo the district no
	* @return the number of matching citizens
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDN(java.lang.String districtNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDN(districtNo);
	}

	/**
	* Returns all the citizens where wardNo = &#63;.
	*
	* @param wardNo the ward no
	* @return the matching citizens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.Citizen> findByWN(
		java.lang.String wardNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByWN(wardNo);
	}

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
	public static java.util.List<org.oep.usermgt.model.Citizen> findByWN(
		java.lang.String wardNo, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByWN(wardNo, start, end);
	}

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
	public static java.util.List<org.oep.usermgt.model.Citizen> findByWN(
		java.lang.String wardNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByWN(wardNo, start, end, orderByComparator);
	}

	/**
	* Returns the first citizen in the ordered set where wardNo = &#63;.
	*
	* @param wardNo the ward no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen
	* @throws org.oep.usermgt.NoSuchCitizenException if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Citizen findByWN_First(
		java.lang.String wardNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchCitizenException {
		return getPersistence().findByWN_First(wardNo, orderByComparator);
	}

	/**
	* Returns the first citizen in the ordered set where wardNo = &#63;.
	*
	* @param wardNo the ward no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen, or <code>null</code> if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Citizen fetchByWN_First(
		java.lang.String wardNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByWN_First(wardNo, orderByComparator);
	}

	/**
	* Returns the last citizen in the ordered set where wardNo = &#63;.
	*
	* @param wardNo the ward no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen
	* @throws org.oep.usermgt.NoSuchCitizenException if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Citizen findByWN_Last(
		java.lang.String wardNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchCitizenException {
		return getPersistence().findByWN_Last(wardNo, orderByComparator);
	}

	/**
	* Returns the last citizen in the ordered set where wardNo = &#63;.
	*
	* @param wardNo the ward no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen, or <code>null</code> if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Citizen fetchByWN_Last(
		java.lang.String wardNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByWN_Last(wardNo, orderByComparator);
	}

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
	public static org.oep.usermgt.model.Citizen[] findByWN_PrevAndNext(
		long citizenId, java.lang.String wardNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchCitizenException {
		return getPersistence()
				   .findByWN_PrevAndNext(citizenId, wardNo, orderByComparator);
	}

	/**
	* Removes all the citizens where wardNo = &#63; from the database.
	*
	* @param wardNo the ward no
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByWN(java.lang.String wardNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByWN(wardNo);
	}

	/**
	* Returns the number of citizens where wardNo = &#63;.
	*
	* @param wardNo the ward no
	* @return the number of matching citizens
	* @throws SystemException if a system exception occurred
	*/
	public static int countByWN(java.lang.String wardNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByWN(wardNo);
	}

	/**
	* Returns the citizen where mappingUserId = &#63; or throws a {@link org.oep.usermgt.NoSuchCitizenException} if it could not be found.
	*
	* @param mappingUserId the mapping user ID
	* @return the matching citizen
	* @throws org.oep.usermgt.NoSuchCitizenException if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Citizen findByMU(long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchCitizenException {
		return getPersistence().findByMU(mappingUserId);
	}

	/**
	* Returns the citizen where mappingUserId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param mappingUserId the mapping user ID
	* @return the matching citizen, or <code>null</code> if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Citizen fetchByMU(long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByMU(mappingUserId);
	}

	/**
	* Returns the citizen where mappingUserId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param mappingUserId the mapping user ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching citizen, or <code>null</code> if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Citizen fetchByMU(long mappingUserId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByMU(mappingUserId, retrieveFromCache);
	}

	/**
	* Removes the citizen where mappingUserId = &#63; from the database.
	*
	* @param mappingUserId the mapping user ID
	* @return the citizen that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Citizen removeByMU(long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchCitizenException {
		return getPersistence().removeByMU(mappingUserId);
	}

	/**
	* Returns the number of citizens where mappingUserId = &#63;.
	*
	* @param mappingUserId the mapping user ID
	* @return the number of matching citizens
	* @throws SystemException if a system exception occurred
	*/
	public static int countByMU(long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByMU(mappingUserId);
	}

	/**
	* Returns the citizen where identificationNo = &#63; or throws a {@link org.oep.usermgt.NoSuchCitizenException} if it could not be found.
	*
	* @param identificationNo the identification no
	* @return the matching citizen
	* @throws org.oep.usermgt.NoSuchCitizenException if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Citizen findByIN(
		java.lang.String identificationNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchCitizenException {
		return getPersistence().findByIN(identificationNo);
	}

	/**
	* Returns the citizen where identificationNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param identificationNo the identification no
	* @return the matching citizen, or <code>null</code> if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Citizen fetchByIN(
		java.lang.String identificationNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByIN(identificationNo);
	}

	/**
	* Returns the citizen where identificationNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param identificationNo the identification no
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching citizen, or <code>null</code> if a matching citizen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Citizen fetchByIN(
		java.lang.String identificationNo, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByIN(identificationNo, retrieveFromCache);
	}

	/**
	* Removes the citizen where identificationNo = &#63; from the database.
	*
	* @param identificationNo the identification no
	* @return the citizen that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Citizen removeByIN(
		java.lang.String identificationNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchCitizenException {
		return getPersistence().removeByIN(identificationNo);
	}

	/**
	* Returns the number of citizens where identificationNo = &#63;.
	*
	* @param identificationNo the identification no
	* @return the number of matching citizens
	* @throws SystemException if a system exception occurred
	*/
	public static int countByIN(java.lang.String identificationNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByIN(identificationNo);
	}

	/**
	* Caches the citizen in the entity cache if it is enabled.
	*
	* @param citizen the citizen
	*/
	public static void cacheResult(org.oep.usermgt.model.Citizen citizen) {
		getPersistence().cacheResult(citizen);
	}

	/**
	* Caches the citizens in the entity cache if it is enabled.
	*
	* @param citizens the citizens
	*/
	public static void cacheResult(
		java.util.List<org.oep.usermgt.model.Citizen> citizens) {
		getPersistence().cacheResult(citizens);
	}

	/**
	* Creates a new citizen with the primary key. Does not add the citizen to the database.
	*
	* @param citizenId the primary key for the new citizen
	* @return the new citizen
	*/
	public static org.oep.usermgt.model.Citizen create(long citizenId) {
		return getPersistence().create(citizenId);
	}

	/**
	* Removes the citizen with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param citizenId the primary key of the citizen
	* @return the citizen that was removed
	* @throws org.oep.usermgt.NoSuchCitizenException if a citizen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Citizen remove(long citizenId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchCitizenException {
		return getPersistence().remove(citizenId);
	}

	public static org.oep.usermgt.model.Citizen updateImpl(
		org.oep.usermgt.model.Citizen citizen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(citizen);
	}

	/**
	* Returns the citizen with the primary key or throws a {@link org.oep.usermgt.NoSuchCitizenException} if it could not be found.
	*
	* @param citizenId the primary key of the citizen
	* @return the citizen
	* @throws org.oep.usermgt.NoSuchCitizenException if a citizen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Citizen findByPrimaryKey(long citizenId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchCitizenException {
		return getPersistence().findByPrimaryKey(citizenId);
	}

	/**
	* Returns the citizen with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param citizenId the primary key of the citizen
	* @return the citizen, or <code>null</code> if a citizen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Citizen fetchByPrimaryKey(
		long citizenId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(citizenId);
	}

	/**
	* Returns all the citizens.
	*
	* @return the citizens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.Citizen> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<org.oep.usermgt.model.Citizen> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<org.oep.usermgt.model.Citizen> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the citizens from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of citizens.
	*
	* @return the number of citizens
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CitizenPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CitizenPersistence)PortletBeanLocatorUtil.locate(org.oep.usermgt.service.ClpSerializer.getServletContextName(),
					CitizenPersistence.class.getName());

			ReferenceRegistry.registerReference(CitizenUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CitizenPersistence persistence) {
	}

	private static CitizenPersistence _persistence;
}