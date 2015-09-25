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

package org.oep.core.dossiermgt.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.oep.core.dossiermgt.model.PaymentConfig;

import java.util.List;

/**
 * The persistence utility for the payment config service. This utility wraps {@link PaymentConfigPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see PaymentConfigPersistence
 * @see PaymentConfigPersistenceImpl
 * @generated
 */
public class PaymentConfigUtil {
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
	public static void clearCache(PaymentConfig paymentConfig) {
		getPersistence().clearCache(paymentConfig);
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
	public static List<PaymentConfig> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PaymentConfig> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PaymentConfig> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static PaymentConfig update(PaymentConfig paymentConfig)
		throws SystemException {
		return getPersistence().update(paymentConfig);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static PaymentConfig update(PaymentConfig paymentConfig,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(paymentConfig, serviceContext);
	}

	/**
	* Caches the payment config in the entity cache if it is enabled.
	*
	* @param paymentConfig the payment config
	*/
	public static void cacheResult(
		org.oep.core.dossiermgt.model.PaymentConfig paymentConfig) {
		getPersistence().cacheResult(paymentConfig);
	}

	/**
	* Caches the payment configs in the entity cache if it is enabled.
	*
	* @param paymentConfigs the payment configs
	*/
	public static void cacheResult(
		java.util.List<org.oep.core.dossiermgt.model.PaymentConfig> paymentConfigs) {
		getPersistence().cacheResult(paymentConfigs);
	}

	/**
	* Creates a new payment config with the primary key. Does not add the payment config to the database.
	*
	* @param paymentConfigId the primary key for the new payment config
	* @return the new payment config
	*/
	public static org.oep.core.dossiermgt.model.PaymentConfig create(
		long paymentConfigId) {
		return getPersistence().create(paymentConfigId);
	}

	/**
	* Removes the payment config with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param paymentConfigId the primary key of the payment config
	* @return the payment config that was removed
	* @throws org.oep.core.dossiermgt.NoSuchPaymentConfigException if a payment config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.PaymentConfig remove(
		long paymentConfigId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchPaymentConfigException {
		return getPersistence().remove(paymentConfigId);
	}

	public static org.oep.core.dossiermgt.model.PaymentConfig updateImpl(
		org.oep.core.dossiermgt.model.PaymentConfig paymentConfig)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(paymentConfig);
	}

	/**
	* Returns the payment config with the primary key or throws a {@link org.oep.core.dossiermgt.NoSuchPaymentConfigException} if it could not be found.
	*
	* @param paymentConfigId the primary key of the payment config
	* @return the payment config
	* @throws org.oep.core.dossiermgt.NoSuchPaymentConfigException if a payment config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.PaymentConfig findByPrimaryKey(
		long paymentConfigId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchPaymentConfigException {
		return getPersistence().findByPrimaryKey(paymentConfigId);
	}

	/**
	* Returns the payment config with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param paymentConfigId the primary key of the payment config
	* @return the payment config, or <code>null</code> if a payment config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.PaymentConfig fetchByPrimaryKey(
		long paymentConfigId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(paymentConfigId);
	}

	/**
	* Returns all the payment configs.
	*
	* @return the payment configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.PaymentConfig> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the payment configs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.PaymentConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment configs
	* @param end the upper bound of the range of payment configs (not inclusive)
	* @return the range of payment configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.PaymentConfig> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the payment configs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.PaymentConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment configs
	* @param end the upper bound of the range of payment configs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of payment configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.PaymentConfig> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the payment configs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of payment configs.
	*
	* @return the number of payment configs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static PaymentConfigPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PaymentConfigPersistence)PortletBeanLocatorUtil.locate(org.oep.core.dossiermgt.service.ClpSerializer.getServletContextName(),
					PaymentConfigPersistence.class.getName());

			ReferenceRegistry.registerReference(PaymentConfigUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(PaymentConfigPersistence persistence) {
	}

	private static PaymentConfigPersistence _persistence;
}