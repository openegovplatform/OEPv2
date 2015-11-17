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

package org.oep.processmgt.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import org.oep.processmgt.model.TransitionHistory;

/**
 * The persistence interface for the transition history service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see TransitionHistoryPersistenceImpl
 * @see TransitionHistoryUtil
 * @generated
 */
public interface TransitionHistoryPersistence extends BasePersistence<TransitionHistory> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TransitionHistoryUtil} to access the transition history persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the transition history in the entity cache if it is enabled.
	*
	* @param transitionHistory the transition history
	*/
	public void cacheResult(
		org.oep.processmgt.model.TransitionHistory transitionHistory);

	/**
	* Caches the transition histories in the entity cache if it is enabled.
	*
	* @param transitionHistories the transition histories
	*/
	public void cacheResult(
		java.util.List<org.oep.processmgt.model.TransitionHistory> transitionHistories);

	/**
	* Creates a new transition history with the primary key. Does not add the transition history to the database.
	*
	* @param transitionHistoryId the primary key for the new transition history
	* @return the new transition history
	*/
	public org.oep.processmgt.model.TransitionHistory create(
		long transitionHistoryId);

	/**
	* Removes the transition history with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param transitionHistoryId the primary key of the transition history
	* @return the transition history that was removed
	* @throws org.oep.processmgt.NoSuchTransitionHistoryException if a transition history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.TransitionHistory remove(
		long transitionHistoryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.processmgt.NoSuchTransitionHistoryException;

	public org.oep.processmgt.model.TransitionHistory updateImpl(
		org.oep.processmgt.model.TransitionHistory transitionHistory)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the transition history with the primary key or throws a {@link org.oep.processmgt.NoSuchTransitionHistoryException} if it could not be found.
	*
	* @param transitionHistoryId the primary key of the transition history
	* @return the transition history
	* @throws org.oep.processmgt.NoSuchTransitionHistoryException if a transition history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.TransitionHistory findByPrimaryKey(
		long transitionHistoryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.processmgt.NoSuchTransitionHistoryException;

	/**
	* Returns the transition history with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param transitionHistoryId the primary key of the transition history
	* @return the transition history, or <code>null</code> if a transition history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.processmgt.model.TransitionHistory fetchByPrimaryKey(
		long transitionHistoryId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the transition histories.
	*
	* @return the transition histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.processmgt.model.TransitionHistory> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the transition histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.TransitionHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of transition histories
	* @param end the upper bound of the range of transition histories (not inclusive)
	* @return the range of transition histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.processmgt.model.TransitionHistory> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the transition histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.TransitionHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of transition histories
	* @param end the upper bound of the range of transition histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of transition histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.processmgt.model.TransitionHistory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the transition histories from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of transition histories.
	*
	* @return the number of transition histories
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}