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

package org.oep.dossiermgt.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.oep.dossiermgt.model.EbPartnerShip;

import java.util.List;

/**
 * The persistence utility for the eb partner ship service. This utility wraps {@link EbPartnerShipPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see EbPartnerShipPersistence
 * @see EbPartnerShipPersistenceImpl
 * @generated
 */
public class EbPartnerShipUtil {
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
	public static void clearCache(EbPartnerShip ebPartnerShip) {
		getPersistence().clearCache(ebPartnerShip);
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
	public static List<EbPartnerShip> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EbPartnerShip> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EbPartnerShip> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static EbPartnerShip update(EbPartnerShip ebPartnerShip)
		throws SystemException {
		return getPersistence().update(ebPartnerShip);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static EbPartnerShip update(EbPartnerShip ebPartnerShip,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(ebPartnerShip, serviceContext);
	}

	/**
	* Caches the eb partner ship in the entity cache if it is enabled.
	*
	* @param ebPartnerShip the eb partner ship
	*/
	public static void cacheResult(
		org.oep.dossiermgt.model.EbPartnerShip ebPartnerShip) {
		getPersistence().cacheResult(ebPartnerShip);
	}

	/**
	* Caches the eb partner ships in the entity cache if it is enabled.
	*
	* @param ebPartnerShips the eb partner ships
	*/
	public static void cacheResult(
		java.util.List<org.oep.dossiermgt.model.EbPartnerShip> ebPartnerShips) {
		getPersistence().cacheResult(ebPartnerShips);
	}

	/**
	* Creates a new eb partner ship with the primary key. Does not add the eb partner ship to the database.
	*
	* @param ebPartnerShipId the primary key for the new eb partner ship
	* @return the new eb partner ship
	*/
	public static org.oep.dossiermgt.model.EbPartnerShip create(
		long ebPartnerShipId) {
		return getPersistence().create(ebPartnerShipId);
	}

	/**
	* Removes the eb partner ship with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ebPartnerShipId the primary key of the eb partner ship
	* @return the eb partner ship that was removed
	* @throws org.oep.dossiermgt.NoSuchEbPartnerShipException if a eb partner ship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.EbPartnerShip remove(
		long ebPartnerShipId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchEbPartnerShipException {
		return getPersistence().remove(ebPartnerShipId);
	}

	public static org.oep.dossiermgt.model.EbPartnerShip updateImpl(
		org.oep.dossiermgt.model.EbPartnerShip ebPartnerShip)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(ebPartnerShip);
	}

	/**
	* Returns the eb partner ship with the primary key or throws a {@link org.oep.dossiermgt.NoSuchEbPartnerShipException} if it could not be found.
	*
	* @param ebPartnerShipId the primary key of the eb partner ship
	* @return the eb partner ship
	* @throws org.oep.dossiermgt.NoSuchEbPartnerShipException if a eb partner ship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.EbPartnerShip findByPrimaryKey(
		long ebPartnerShipId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchEbPartnerShipException {
		return getPersistence().findByPrimaryKey(ebPartnerShipId);
	}

	/**
	* Returns the eb partner ship with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ebPartnerShipId the primary key of the eb partner ship
	* @return the eb partner ship, or <code>null</code> if a eb partner ship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.EbPartnerShip fetchByPrimaryKey(
		long ebPartnerShipId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(ebPartnerShipId);
	}

	/**
	* Returns all the eb partner ships.
	*
	* @return the eb partner ships
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.dossiermgt.model.EbPartnerShip> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the eb partner ships.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.EbPartnerShipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of eb partner ships
	* @param end the upper bound of the range of eb partner ships (not inclusive)
	* @return the range of eb partner ships
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.dossiermgt.model.EbPartnerShip> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the eb partner ships.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.EbPartnerShipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of eb partner ships
	* @param end the upper bound of the range of eb partner ships (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of eb partner ships
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.dossiermgt.model.EbPartnerShip> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the eb partner ships from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of eb partner ships.
	*
	* @return the number of eb partner ships
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static EbPartnerShipPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (EbPartnerShipPersistence)PortletBeanLocatorUtil.locate(org.oep.dossiermgt.service.ClpSerializer.getServletContextName(),
					EbPartnerShipPersistence.class.getName());

			ReferenceRegistry.registerReference(EbPartnerShipUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(EbPartnerShipPersistence persistence) {
	}

	private static EbPartnerShipPersistence _persistence;
}