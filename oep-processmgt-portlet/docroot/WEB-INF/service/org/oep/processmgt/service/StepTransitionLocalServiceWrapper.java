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

package org.oep.processmgt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link StepTransitionLocalService}.
 *
 * @author trungdk
 * @see StepTransitionLocalService
 * @generated
 */
public class StepTransitionLocalServiceWrapper
	implements StepTransitionLocalService,
		ServiceWrapper<StepTransitionLocalService> {
	public StepTransitionLocalServiceWrapper(
		StepTransitionLocalService stepTransitionLocalService) {
		_stepTransitionLocalService = stepTransitionLocalService;
	}

	/**
	* Adds the step transition to the database. Also notifies the appropriate model listeners.
	*
	* @param stepTransition the step transition
	* @return the step transition that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.processmgt.model.StepTransition addStepTransition(
		org.oep.processmgt.model.StepTransition stepTransition)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stepTransitionLocalService.addStepTransition(stepTransition);
	}

	/**
	* Creates a new step transition with the primary key. Does not add the step transition to the database.
	*
	* @param stepTransitionId the primary key for the new step transition
	* @return the new step transition
	*/
	@Override
	public org.oep.processmgt.model.StepTransition createStepTransition(
		long stepTransitionId) {
		return _stepTransitionLocalService.createStepTransition(stepTransitionId);
	}

	/**
	* Deletes the step transition with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param stepTransitionId the primary key of the step transition
	* @return the step transition that was removed
	* @throws PortalException if a step transition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.processmgt.model.StepTransition deleteStepTransition(
		long stepTransitionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _stepTransitionLocalService.deleteStepTransition(stepTransitionId);
	}

	/**
	* Deletes the step transition from the database. Also notifies the appropriate model listeners.
	*
	* @param stepTransition the step transition
	* @return the step transition that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.processmgt.model.StepTransition deleteStepTransition(
		org.oep.processmgt.model.StepTransition stepTransition)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stepTransitionLocalService.deleteStepTransition(stepTransition);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _stepTransitionLocalService.dynamicQuery();
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
		return _stepTransitionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.StepTransitionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _stepTransitionLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.StepTransitionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _stepTransitionLocalService.dynamicQuery(dynamicQuery, start,
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
		return _stepTransitionLocalService.dynamicQueryCount(dynamicQuery);
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
		return _stepTransitionLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.processmgt.model.StepTransition fetchStepTransition(
		long stepTransitionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stepTransitionLocalService.fetchStepTransition(stepTransitionId);
	}

	/**
	* Returns the step transition with the primary key.
	*
	* @param stepTransitionId the primary key of the step transition
	* @return the step transition
	* @throws PortalException if a step transition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.processmgt.model.StepTransition getStepTransition(
		long stepTransitionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _stepTransitionLocalService.getStepTransition(stepTransitionId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _stepTransitionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the step transitions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.StepTransitionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of step transitions
	* @param end the upper bound of the range of step transitions (not inclusive)
	* @return the range of step transitions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.processmgt.model.StepTransition> getStepTransitions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stepTransitionLocalService.getStepTransitions(start, end);
	}

	/**
	* Returns the number of step transitions.
	*
	* @return the number of step transitions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getStepTransitionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stepTransitionLocalService.getStepTransitionsCount();
	}

	/**
	* Updates the step transition in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param stepTransition the step transition
	* @return the step transition that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.processmgt.model.StepTransition updateStepTransition(
		org.oep.processmgt.model.StepTransition stepTransition)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stepTransitionLocalService.updateStepTransition(stepTransition);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _stepTransitionLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_stepTransitionLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _stepTransitionLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* ThÃƒÂªm chuyÃ¡Â»Æ’n dÃ¡Â»â€¹ch trÃ¡ÂºÂ¡ng thÃƒÂ¡i
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param dossierProcessId nÃ¡ÂºÂ±m trong quy trÃƒÂ¬nh nÃƒÂ o
	* @param preDossierStepId trÃ¡ÂºÂ¡ng thÃƒÂ¡i nguÃ¡Â»â€œn
	* @param postDossierStepId trÃ¡ÂºÂ¡ng thÃƒÂ¡i Ã„â€˜ÃƒÂ­ch
	* @param autoCondition mÃƒÂ£ Ã„â€˜iÃ¡Â»ï¿½u kiÃ¡Â»â€¡n chuyÃ¡Â»Æ’n dÃ¡Â»â€¹ch trÃ¡ÂºÂ¡ng thÃƒÂ¡i
	* @param transitionName tÃƒÂªn mÃƒÂ´ tÃ¡ÂºÂ£ hÃƒÂ nh Ã„â€˜Ã¡Â»â„¢ng xÃ¡Â»Â­ lÃƒÂ½ hÃ¡Â»â€œ sÃ†Â¡
	* @param dossierStatus kÃ¡ÂºÂ¿t thÃƒÂºc mÃ¡Â»â„¢t bÃ†Â°Ã¡Â»â€ºc hÃ¡Â»â€œ sÃ†Â¡ Ã„â€˜Ã†Â°Ã¡Â»Â£c phÃƒÂ¢n trÃ¡ÂºÂ¡ng thÃƒÂ¡i mÃ¡Â»â€ºi
	* @param sendResults tÃ¡Â»Â± Ã„â€˜Ã¡Â»â„¢ng gÃ¡Â»Â­i trÃ¡ÂºÂ£ kÃ¡ÂºÂ¿t quÃ¡ÂºÂ£ cÃƒÂ³ trong hÃ¡Â»â€œ sÃ†Â¡
	* @param userAssignment Ã„â€˜ÃƒÂ¡nh dÃ¡ÂºÂ¥u bÃ†Â°Ã¡Â»â€ºc nÃƒÂ y phÃ¡ÂºÂ£i Ã„â€˜Ã†Â°Ã¡Â»Â£c phÃƒÂ¢n cÃƒÂ´ng cÃ¡Â»Â¥ thÃ¡Â»Æ’ ngÃ†Â°Ã¡Â»ï¿½i xÃ¡Â»Â­ lÃƒÂ½
	* @param newProcessOrder chuyÃ¡Â»Æ’n dÃ¡Â»â€¹ch cÃƒÂ³ tÃ¡ÂºÂ¡o phiÃ¡ÂºÂ¿u xÃ¡Â»Â­ lÃƒÂ½ con
	* @return: chuyÃ¡Â»Æ’n dÃ¡Â»â€¹ch trÃ¡ÂºÂ¡ng thÃƒÂ¡i mÃ¡Â»â€ºi tÃ¡ÂºÂ¡o
	*/
	@Override
	public org.oep.processmgt.model.StepTransition addStepTransition(
		long dossierProcessId, long preDossierStepId, long postDossierStepId,
		java.lang.String autoCondition, java.lang.String transitionName,
		java.lang.String dossierStatus, int sendResults, int userAssignment,
		int newProcessOrder,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _stepTransitionLocalService.addStepTransition(dossierProcessId,
			preDossierStepId, postDossierStepId, autoCondition, transitionName,
			dossierStatus, sendResults, userAssignment, newProcessOrder,
			serviceContext);
	}

	/**
	* CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin chuyÃ¡Â»Æ’n dÃ¡Â»â€¹ch trÃ¡ÂºÂ¡ng thÃƒÂ¡i
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param id mÃƒÂ£ chuyÃ¡Â»Æ’n dÃ¡Â»â€¹ch trÃ¡ÂºÂ¡ng thÃƒÂ¡i
	* @param dossierProcessId nÃ¡ÂºÂ±m trong quy trÃƒÂ¬nh nÃƒÂ o
	* @param preDossierStepId trÃ¡ÂºÂ¡ng thÃƒÂ¡i nguÃ¡Â»â€œn
	* @param postDossierStepId trÃ¡ÂºÂ¡ng thÃƒÂ¡i Ã„â€˜ÃƒÂ­ch
	* @param autoCondition mÃƒÂ£ Ã„â€˜iÃ¡Â»ï¿½u kiÃ¡Â»â€¡n chuyÃ¡Â»Æ’n dÃ¡Â»â€¹ch trÃ¡ÂºÂ¡ng thÃƒÂ¡i
	* @param transitionName tÃƒÂªn mÃƒÂ´ tÃ¡ÂºÂ£ hÃƒÂ nh Ã„â€˜Ã¡Â»â„¢ng xÃ¡Â»Â­ lÃƒÂ½ hÃ¡Â»â€œ sÃ†Â¡
	* @param dossierStatus kÃ¡ÂºÂ¿t thÃƒÂºc mÃ¡Â»â„¢t bÃ†Â°Ã¡Â»â€ºc hÃ¡Â»â€œ sÃ†Â¡ Ã„â€˜Ã†Â°Ã¡Â»Â£c phÃƒÂ¢n trÃ¡ÂºÂ¡ng thÃƒÂ¡i mÃ¡Â»â€ºi
	* @param sendResults tÃ¡Â»Â± Ã„â€˜Ã¡Â»â„¢ng gÃ¡Â»Â­i trÃ¡ÂºÂ£ kÃ¡ÂºÂ¿t quÃ¡ÂºÂ£ cÃƒÂ³ trong hÃ¡Â»â€œ sÃ†Â¡
	* @param userAssignment Ã„â€˜ÃƒÂ¡nh dÃ¡ÂºÂ¥u bÃ†Â°Ã¡Â»â€ºc nÃƒÂ y phÃ¡ÂºÂ£i Ã„â€˜Ã†Â°Ã¡Â»Â£c phÃƒÂ¢n cÃƒÂ´ng cÃ¡Â»Â¥ thÃ¡Â»Æ’ ngÃ†Â°Ã¡Â»ï¿½i xÃ¡Â»Â­ lÃƒÂ½
	* @param newProcessOrder chuyÃ¡Â»Æ’n dÃ¡Â»â€¹ch cÃƒÂ³ tÃ¡ÂºÂ¡o phiÃ¡ÂºÂ¿u xÃ¡Â»Â­ lÃƒÂ½ con
	* @return: chuyÃ¡Â»Æ’n dÃ¡Â»â€¹ch trÃ¡ÂºÂ¡ng thÃƒÂ¡i mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t
	*/
	@Override
	public org.oep.processmgt.model.StepTransition updateStepTransition(
		long id, long dossierProcessId, long preDossierStepId,
		long postDossierStepId, java.lang.String autoCondition,
		java.lang.String transitionName, java.lang.String dossierStatus,
		int sendResults, int userAssignment, int newProcessOrder,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _stepTransitionLocalService.updateStepTransition(id,
			dossierProcessId, preDossierStepId, postDossierStepId,
			autoCondition, transitionName, dossierStatus, sendResults,
			userAssignment, newProcessOrder, serviceContext);
	}

	@Override
	public void updateStepTransitionResources(
		org.oep.processmgt.model.StepTransition stepTransition,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_stepTransitionLocalService.updateStepTransitionResources(stepTransition,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void removeStepTransition(
		org.oep.processmgt.model.StepTransition stepTransition)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_stepTransitionLocalService.removeStepTransition(stepTransition);
	}

	@Override
	public void removeStepTransition(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_stepTransitionLocalService.removeStepTransition(id);
	}

	@Override
	public void addStepTransitionResources(
		org.oep.processmgt.model.StepTransition stepTransition,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_stepTransitionLocalService.addStepTransitionResources(stepTransition,
			addGroupPermission, addGuestPermission, serviceContext);
	}

	@Override
	public void addStepTransitionResources(
		org.oep.processmgt.model.StepTransition stepTransition,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_stepTransitionLocalService.addStepTransitionResources(stepTransition,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void addStepTransitionResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_stepTransitionLocalService.addStepTransitionResources(id,
			groupPermissions, guestPermissions, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public StepTransitionLocalService getWrappedStepTransitionLocalService() {
		return _stepTransitionLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedStepTransitionLocalService(
		StepTransitionLocalService stepTransitionLocalService) {
		_stepTransitionLocalService = stepTransitionLocalService;
	}

	@Override
	public StepTransitionLocalService getWrappedService() {
		return _stepTransitionLocalService;
	}

	@Override
	public void setWrappedService(
		StepTransitionLocalService stepTransitionLocalService) {
		_stepTransitionLocalService = stepTransitionLocalService;
	}

	private StepTransitionLocalService _stepTransitionLocalService;
}