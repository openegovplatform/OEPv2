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

package org.oep.core.processmgt.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.oep.core.processmgt.model.StepTransition;

import java.util.List;

/**
 * The persistence utility for the step transition service. This utility wraps {@link StepTransitionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see StepTransitionPersistence
 * @see StepTransitionPersistenceImpl
 * @generated
 */
public class StepTransitionUtil {
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
	public static void clearCache(StepTransition stepTransition) {
		getPersistence().clearCache(stepTransition);
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
	public static List<StepTransition> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<StepTransition> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<StepTransition> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static StepTransition update(StepTransition stepTransition)
		throws SystemException {
		return getPersistence().update(stepTransition);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static StepTransition update(StepTransition stepTransition,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(stepTransition, serviceContext);
	}

	/**
	* Caches the step transition in the entity cache if it is enabled.
	*
	* @param stepTransition the step transition
	*/
	public static void cacheResult(
		org.oep.core.processmgt.model.StepTransition stepTransition) {
		getPersistence().cacheResult(stepTransition);
	}

	/**
	* Caches the step transitions in the entity cache if it is enabled.
	*
	* @param stepTransitions the step transitions
	*/
	public static void cacheResult(
		java.util.List<org.oep.core.processmgt.model.StepTransition> stepTransitions) {
		getPersistence().cacheResult(stepTransitions);
	}

	/**
	* Creates a new step transition with the primary key. Does not add the step transition to the database.
	*
	* @param stepTransitionId the primary key for the new step transition
	* @return the new step transition
	*/
	public static org.oep.core.processmgt.model.StepTransition create(
		long stepTransitionId) {
		return getPersistence().create(stepTransitionId);
	}

	/**
	* Removes the step transition with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param stepTransitionId the primary key of the step transition
	* @return the step transition that was removed
	* @throws org.oep.core.processmgt.NoSuchStepTransitionException if a step transition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.StepTransition remove(
		long stepTransitionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.processmgt.NoSuchStepTransitionException {
		return getPersistence().remove(stepTransitionId);
	}

	public static org.oep.core.processmgt.model.StepTransition updateImpl(
		org.oep.core.processmgt.model.StepTransition stepTransition)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(stepTransition);
	}

	/**
	* Returns the step transition with the primary key or throws a {@link org.oep.core.processmgt.NoSuchStepTransitionException} if it could not be found.
	*
	* @param stepTransitionId the primary key of the step transition
	* @return the step transition
	* @throws org.oep.core.processmgt.NoSuchStepTransitionException if a step transition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.StepTransition findByPrimaryKey(
		long stepTransitionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.processmgt.NoSuchStepTransitionException {
		return getPersistence().findByPrimaryKey(stepTransitionId);
	}

	/**
	* Returns the step transition with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param stepTransitionId the primary key of the step transition
	* @return the step transition, or <code>null</code> if a step transition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.StepTransition fetchByPrimaryKey(
		long stepTransitionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(stepTransitionId);
	}

	/**
	* Returns all the step transitions.
	*
	* @return the step transitions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.processmgt.model.StepTransition> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the step transitions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.StepTransitionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of step transitions
	* @param end the upper bound of the range of step transitions (not inclusive)
	* @return the range of step transitions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.processmgt.model.StepTransition> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the step transitions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.StepTransitionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of step transitions
	* @param end the upper bound of the range of step transitions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of step transitions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.processmgt.model.StepTransition> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the step transitions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of step transitions.
	*
	* @return the number of step transitions
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static StepTransitionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (StepTransitionPersistence)PortletBeanLocatorUtil.locate(org.oep.core.processmgt.service.ClpSerializer.getServletContextName(),
					StepTransitionPersistence.class.getName());

			ReferenceRegistry.registerReference(StepTransitionUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(StepTransitionPersistence persistence) {
	}

	private static StepTransitionPersistence _persistence;
}