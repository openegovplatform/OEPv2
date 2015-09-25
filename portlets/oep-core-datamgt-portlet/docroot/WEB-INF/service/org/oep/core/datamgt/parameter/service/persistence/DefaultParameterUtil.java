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

package org.oep.core.datamgt.parameter.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.oep.core.datamgt.parameter.model.DefaultParameter;

import java.util.List;

/**
 * The persistence utility for the default parameter service. This utility wraps {@link DefaultParameterPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author TrungDK
 * @see DefaultParameterPersistence
 * @see DefaultParameterPersistenceImpl
 * @generated
 */
public class DefaultParameterUtil {
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
	public static void clearCache(DefaultParameter defaultParameter) {
		getPersistence().clearCache(defaultParameter);
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
	public static List<DefaultParameter> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DefaultParameter> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DefaultParameter> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DefaultParameter update(DefaultParameter defaultParameter)
		throws SystemException {
		return getPersistence().update(defaultParameter);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DefaultParameter update(DefaultParameter defaultParameter,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(defaultParameter, serviceContext);
	}

	/**
	* Caches the default parameter in the entity cache if it is enabled.
	*
	* @param defaultParameter the default parameter
	*/
	public static void cacheResult(
		org.oep.core.datamgt.parameter.model.DefaultParameter defaultParameter) {
		getPersistence().cacheResult(defaultParameter);
	}

	/**
	* Caches the default parameters in the entity cache if it is enabled.
	*
	* @param defaultParameters the default parameters
	*/
	public static void cacheResult(
		java.util.List<org.oep.core.datamgt.parameter.model.DefaultParameter> defaultParameters) {
		getPersistence().cacheResult(defaultParameters);
	}

	/**
	* Creates a new default parameter with the primary key. Does not add the default parameter to the database.
	*
	* @param defaultParameterId the primary key for the new default parameter
	* @return the new default parameter
	*/
	public static org.oep.core.datamgt.parameter.model.DefaultParameter create(
		long defaultParameterId) {
		return getPersistence().create(defaultParameterId);
	}

	/**
	* Removes the default parameter with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param defaultParameterId the primary key of the default parameter
	* @return the default parameter that was removed
	* @throws org.oep.core.datamgt.parameter.NoSuchDefaultParameterException if a default parameter with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.parameter.model.DefaultParameter remove(
		long defaultParameterId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.parameter.NoSuchDefaultParameterException {
		return getPersistence().remove(defaultParameterId);
	}

	public static org.oep.core.datamgt.parameter.model.DefaultParameter updateImpl(
		org.oep.core.datamgt.parameter.model.DefaultParameter defaultParameter)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(defaultParameter);
	}

	/**
	* Returns the default parameter with the primary key or throws a {@link org.oep.core.datamgt.parameter.NoSuchDefaultParameterException} if it could not be found.
	*
	* @param defaultParameterId the primary key of the default parameter
	* @return the default parameter
	* @throws org.oep.core.datamgt.parameter.NoSuchDefaultParameterException if a default parameter with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.parameter.model.DefaultParameter findByPrimaryKey(
		long defaultParameterId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.parameter.NoSuchDefaultParameterException {
		return getPersistence().findByPrimaryKey(defaultParameterId);
	}

	/**
	* Returns the default parameter with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param defaultParameterId the primary key of the default parameter
	* @return the default parameter, or <code>null</code> if a default parameter with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.parameter.model.DefaultParameter fetchByPrimaryKey(
		long defaultParameterId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(defaultParameterId);
	}

	/**
	* Returns all the default parameters.
	*
	* @return the default parameters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.parameter.model.DefaultParameter> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the default parameters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.parameter.model.impl.DefaultParameterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of default parameters
	* @param end the upper bound of the range of default parameters (not inclusive)
	* @return the range of default parameters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.parameter.model.DefaultParameter> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the default parameters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.parameter.model.impl.DefaultParameterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of default parameters
	* @param end the upper bound of the range of default parameters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of default parameters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.parameter.model.DefaultParameter> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the default parameters from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of default parameters.
	*
	* @return the number of default parameters
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DefaultParameterPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DefaultParameterPersistence)PortletBeanLocatorUtil.locate(org.oep.core.datamgt.parameter.service.ClpSerializer.getServletContextName(),
					DefaultParameterPersistence.class.getName());

			ReferenceRegistry.registerReference(DefaultParameterUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DefaultParameterPersistence persistence) {
	}

	private static DefaultParameterPersistence _persistence;
}