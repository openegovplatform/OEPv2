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

import org.oep.core.dossiermgt.model.PaymentFile2Dossier;

import java.util.List;

/**
 * The persistence utility for the payment file2 dossier service. This utility wraps {@link PaymentFile2DossierPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see PaymentFile2DossierPersistence
 * @see PaymentFile2DossierPersistenceImpl
 * @generated
 */
public class PaymentFile2DossierUtil {
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
	public static void clearCache(PaymentFile2Dossier paymentFile2Dossier) {
		getPersistence().clearCache(paymentFile2Dossier);
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
	public static List<PaymentFile2Dossier> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PaymentFile2Dossier> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PaymentFile2Dossier> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static PaymentFile2Dossier update(
		PaymentFile2Dossier paymentFile2Dossier) throws SystemException {
		return getPersistence().update(paymentFile2Dossier);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static PaymentFile2Dossier update(
		PaymentFile2Dossier paymentFile2Dossier, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(paymentFile2Dossier, serviceContext);
	}

	/**
	* Caches the payment file2 dossier in the entity cache if it is enabled.
	*
	* @param paymentFile2Dossier the payment file2 dossier
	*/
	public static void cacheResult(
		org.oep.core.dossiermgt.model.PaymentFile2Dossier paymentFile2Dossier) {
		getPersistence().cacheResult(paymentFile2Dossier);
	}

	/**
	* Caches the payment file2 dossiers in the entity cache if it is enabled.
	*
	* @param paymentFile2Dossiers the payment file2 dossiers
	*/
	public static void cacheResult(
		java.util.List<org.oep.core.dossiermgt.model.PaymentFile2Dossier> paymentFile2Dossiers) {
		getPersistence().cacheResult(paymentFile2Dossiers);
	}

	/**
	* Creates a new payment file2 dossier with the primary key. Does not add the payment file2 dossier to the database.
	*
	* @param id the primary key for the new payment file2 dossier
	* @return the new payment file2 dossier
	*/
	public static org.oep.core.dossiermgt.model.PaymentFile2Dossier create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the payment file2 dossier with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the payment file2 dossier
	* @return the payment file2 dossier that was removed
	* @throws org.oep.core.dossiermgt.NoSuchPaymentFile2DossierException if a payment file2 dossier with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.PaymentFile2Dossier remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchPaymentFile2DossierException {
		return getPersistence().remove(id);
	}

	public static org.oep.core.dossiermgt.model.PaymentFile2Dossier updateImpl(
		org.oep.core.dossiermgt.model.PaymentFile2Dossier paymentFile2Dossier)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(paymentFile2Dossier);
	}

	/**
	* Returns the payment file2 dossier with the primary key or throws a {@link org.oep.core.dossiermgt.NoSuchPaymentFile2DossierException} if it could not be found.
	*
	* @param id the primary key of the payment file2 dossier
	* @return the payment file2 dossier
	* @throws org.oep.core.dossiermgt.NoSuchPaymentFile2DossierException if a payment file2 dossier with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.PaymentFile2Dossier findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchPaymentFile2DossierException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the payment file2 dossier with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the payment file2 dossier
	* @return the payment file2 dossier, or <code>null</code> if a payment file2 dossier with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.PaymentFile2Dossier fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the payment file2 dossiers.
	*
	* @return the payment file2 dossiers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.PaymentFile2Dossier> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the payment file2 dossiers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.PaymentFile2DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment file2 dossiers
	* @param end the upper bound of the range of payment file2 dossiers (not inclusive)
	* @return the range of payment file2 dossiers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.PaymentFile2Dossier> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the payment file2 dossiers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.PaymentFile2DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment file2 dossiers
	* @param end the upper bound of the range of payment file2 dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of payment file2 dossiers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.PaymentFile2Dossier> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the payment file2 dossiers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of payment file2 dossiers.
	*
	* @return the number of payment file2 dossiers
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static PaymentFile2DossierPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PaymentFile2DossierPersistence)PortletBeanLocatorUtil.locate(org.oep.core.dossiermgt.service.ClpSerializer.getServletContextName(),
					PaymentFile2DossierPersistence.class.getName());

			ReferenceRegistry.registerReference(PaymentFile2DossierUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(PaymentFile2DossierPersistence persistence) {
	}

	private static PaymentFile2DossierPersistence _persistence;
}