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

package org.oep.core.processmgt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TransitionHistoryLocalService}.
 *
 * @author trungdk
 * @see TransitionHistoryLocalService
 * @generated
 */
public class TransitionHistoryLocalServiceWrapper
	implements TransitionHistoryLocalService,
		ServiceWrapper<TransitionHistoryLocalService> {
	public TransitionHistoryLocalServiceWrapper(
		TransitionHistoryLocalService transitionHistoryLocalService) {
		_transitionHistoryLocalService = transitionHistoryLocalService;
	}

	/**
	* Adds the transition history to the database. Also notifies the appropriate model listeners.
	*
	* @param transitionHistory the transition history
	* @return the transition history that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.TransitionHistory addTransitionHistory(
		org.oep.core.processmgt.model.TransitionHistory transitionHistory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _transitionHistoryLocalService.addTransitionHistory(transitionHistory);
	}

	/**
	* Creates a new transition history with the primary key. Does not add the transition history to the database.
	*
	* @param transitionHistoryId the primary key for the new transition history
	* @return the new transition history
	*/
	@Override
	public org.oep.core.processmgt.model.TransitionHistory createTransitionHistory(
		long transitionHistoryId) {
		return _transitionHistoryLocalService.createTransitionHistory(transitionHistoryId);
	}

	/**
	* Deletes the transition history with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param transitionHistoryId the primary key of the transition history
	* @return the transition history that was removed
	* @throws PortalException if a transition history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.TransitionHistory deleteTransitionHistory(
		long transitionHistoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _transitionHistoryLocalService.deleteTransitionHistory(transitionHistoryId);
	}

	/**
	* Deletes the transition history from the database. Also notifies the appropriate model listeners.
	*
	* @param transitionHistory the transition history
	* @return the transition history that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.TransitionHistory deleteTransitionHistory(
		org.oep.core.processmgt.model.TransitionHistory transitionHistory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _transitionHistoryLocalService.deleteTransitionHistory(transitionHistory);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _transitionHistoryLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _transitionHistoryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.TransitionHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _transitionHistoryLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.TransitionHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _transitionHistoryLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _transitionHistoryLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _transitionHistoryLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.core.processmgt.model.TransitionHistory fetchTransitionHistory(
		long transitionHistoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _transitionHistoryLocalService.fetchTransitionHistory(transitionHistoryId);
	}

	/**
	* Returns the transition history with the primary key.
	*
	* @param transitionHistoryId the primary key of the transition history
	* @return the transition history
	* @throws PortalException if a transition history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.TransitionHistory getTransitionHistory(
		long transitionHistoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _transitionHistoryLocalService.getTransitionHistory(transitionHistoryId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _transitionHistoryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the transition histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.TransitionHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of transition histories
	* @param end the upper bound of the range of transition histories (not inclusive)
	* @return the range of transition histories
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.processmgt.model.TransitionHistory> getTransitionHistories(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _transitionHistoryLocalService.getTransitionHistories(start, end);
	}

	/**
	* Returns the number of transition histories.
	*
	* @return the number of transition histories
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTransitionHistoriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _transitionHistoryLocalService.getTransitionHistoriesCount();
	}

	/**
	* Updates the transition history in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param transitionHistory the transition history
	* @return the transition history that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.TransitionHistory updateTransitionHistory(
		org.oep.core.processmgt.model.TransitionHistory transitionHistory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _transitionHistoryLocalService.updateTransitionHistory(transitionHistory);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _transitionHistoryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_transitionHistoryLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _transitionHistoryLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* Add transition history
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Create new
	*
	* @param
	* @return: new transition history
	*/
	@Override
	public org.oep.core.processmgt.model.TransitionHistory addTransitionHistory(
		long dossierId, long processOrderId, int daysDoing, int daysDelay,
		java.util.Date startDate, long stepTransitionId, long preDossierStepId,
		long postDossierStepId, java.lang.String transitionName,
		java.lang.String note,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _transitionHistoryLocalService.addTransitionHistory(dossierId,
			processOrderId, daysDoing, daysDelay, startDate, stepTransitionId,
			preDossierStepId, postDossierStepId, transitionName, note,
			serviceContext);
	}

	@Override
	public org.oep.core.processmgt.model.TransitionHistory updateTransitionHistory(
		long id, long dossierId, long processOrderId, int daysDoing,
		int daysDelay, java.util.Date startDate, long stepTransitionId,
		long preDossierStepId, long postDossierStepId,
		java.lang.String transitionName, java.lang.String note,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _transitionHistoryLocalService.updateTransitionHistory(id,
			dossierId, processOrderId, daysDoing, daysDelay, startDate,
			stepTransitionId, preDossierStepId, postDossierStepId,
			transitionName, note, serviceContext);
	}

	@Override
	public void updateTransitionHistoryResources(
		org.oep.core.processmgt.model.TransitionHistory transitionHistory,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_transitionHistoryLocalService.updateTransitionHistoryResources(transitionHistory,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void removeTransitionHistory(
		org.oep.core.processmgt.model.TransitionHistory transitionHistory)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_transitionHistoryLocalService.removeTransitionHistory(transitionHistory);
	}

	@Override
	public void removeTransitionHistory(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_transitionHistoryLocalService.removeTransitionHistory(id);
	}

	@Override
	public void addTransitionHistoryResources(
		org.oep.core.processmgt.model.TransitionHistory transitionHistory,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_transitionHistoryLocalService.addTransitionHistoryResources(transitionHistory,
			addGroupPermission, addGuestPermission, serviceContext);
	}

	@Override
	public void addTransitionHistoryResources(
		org.oep.core.processmgt.model.TransitionHistory transitionHistory,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_transitionHistoryLocalService.addTransitionHistoryResources(transitionHistory,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void addTransitionHistoryResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_transitionHistoryLocalService.addTransitionHistoryResources(id,
			groupPermissions, guestPermissions, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TransitionHistoryLocalService getWrappedTransitionHistoryLocalService() {
		return _transitionHistoryLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTransitionHistoryLocalService(
		TransitionHistoryLocalService transitionHistoryLocalService) {
		_transitionHistoryLocalService = transitionHistoryLocalService;
	}

	@Override
	public TransitionHistoryLocalService getWrappedService() {
		return _transitionHistoryLocalService;
	}

	@Override
	public void setWrappedService(
		TransitionHistoryLocalService transitionHistoryLocalService) {
		_transitionHistoryLocalService = transitionHistoryLocalService;
	}

	private TransitionHistoryLocalService _transitionHistoryLocalService;
}