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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for TransitionHistory. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author trungdk
 * @see TransitionHistoryLocalServiceUtil
 * @see org.oep.processmgt.service.base.TransitionHistoryLocalServiceBaseImpl
 * @see org.oep.processmgt.service.impl.TransitionHistoryLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface TransitionHistoryLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TransitionHistoryLocalServiceUtil} to access the transition history local service. Add custom service methods to {@link org.oep.processmgt.service.impl.TransitionHistoryLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the transition history to the database. Also notifies the appropriate model listeners.
	*
	* @param transitionHistory the transition history
	* @return the transition history that was added
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.processmgt.model.TransitionHistory addTransitionHistory(
		org.oep.processmgt.model.TransitionHistory transitionHistory)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new transition history with the primary key. Does not add the transition history to the database.
	*
	* @param transitionHistoryId the primary key for the new transition history
	* @return the new transition history
	*/
	public org.oep.processmgt.model.TransitionHistory createTransitionHistory(
		long transitionHistoryId);

	/**
	* Deletes the transition history with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param transitionHistoryId the primary key of the transition history
	* @return the transition history that was removed
	* @throws PortalException if a transition history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public org.oep.processmgt.model.TransitionHistory deleteTransitionHistory(
		long transitionHistoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the transition history from the database. Also notifies the appropriate model listeners.
	*
	* @param transitionHistory the transition history
	* @return the transition history that was removed
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public org.oep.processmgt.model.TransitionHistory deleteTransitionHistory(
		org.oep.processmgt.model.TransitionHistory transitionHistory)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.TransitionHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.TransitionHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.oep.processmgt.model.TransitionHistory fetchTransitionHistory(
		long transitionHistoryId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the transition history with the primary key.
	*
	* @param transitionHistoryId the primary key of the transition history
	* @return the transition history
	* @throws PortalException if a transition history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.oep.processmgt.model.TransitionHistory getTransitionHistory(
		long transitionHistoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.oep.processmgt.model.TransitionHistory> getTransitionHistories(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of transition histories.
	*
	* @return the number of transition histories
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getTransitionHistoriesCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the transition history in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param transitionHistory the transition history
	* @return the transition history that was updated
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.processmgt.model.TransitionHistory updateTransitionHistory(
		org.oep.processmgt.model.TransitionHistory transitionHistory)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	/**
	* ThÃªm lá»‹ch sá»­ chuyá»ƒn dá»‹ch tráº¡ng thÃ¡i
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Create new
	*
	* @param dossierId há»“ sÆ¡ thá»§ tá»¥c cá»§a diá»…n biáº¿n
	* @param processOrderId ghi diá»…n biáº¿n cho phiáº¿u xá»­ lÃ½ chÃ­nh hoáº·c phá»¥
	* @param dossierProcId tham chiáº¿u thá»§ tá»¥c hÃ nh chÃ­nh
	* @param daysDoing sá»‘ ngÃ y thá»±c hiá»‡n xá»­ lÃ½ há»“ sÆ¡
	* @param daysDelay sá»‘ ngÃ y há»“ sÆ¡ bá»‹ quÃ¡ háº¡n (dáº¥u - thá»ƒ hiá»‡n trÆ°á»›c háº¡n)
	* @param startDate thá»�i Ä‘iá»ƒm báº¯t Ä‘áº§u thá»±c hiá»‡n
	* @param preDossierStatus tráº¡ng thÃ¡i há»“ sÆ¡ khi xá»­ lÃ½
	* @param postDossierStatus tráº¡ng thÃ¡i há»“ sÆ¡ sau xá»­ lÃ½
	* @param stepTransitionId chuyá»ƒn dá»‹ch tráº¡ng thÃ¡i
	* @param preDossierStepId tráº¡ng thÃ¡i trÆ°á»›c
	* @param postDossierStepId bÆ°á»›c chuyá»ƒn dá»‹ch sau
	* @param transitionName tÃªn mÃ´ táº£ hÃ nh Ä‘á»™ng xá»­ lÃ½ liÃªn quan Ä‘áº¿n há»“ sÆ¡
	* @param note ghi chÃº Ä‘Æ°á»£c ghi láº¡i cá»§a ngÆ°á»�i xá»­ lÃ½ há»“ sÆ¡
	* @param assignToUserId ngÆ°á»�i thá»±c hiá»‡n bÆ°á»›c xá»­ lÃ½
	* @return: lá»‹ch sá»­ chuyá»ƒn dá»‹ch tráº¡ng thÃ¡i má»›i
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	@com.liferay.portal.kernel.transaction.Transactional
	public org.oep.processmgt.model.TransitionHistory addTransitionHistory(
		long dossierId, long processOrderId, int daysDoing, int daysDelay,
		java.util.Date startDate, long stepTransitionId, long preDossierStepId,
		long postDossierStepId, java.lang.String transitionName,
		java.lang.String note,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Cáº­p nháº­t diá»…n biáº¿n chuyá»ƒn dá»‹ch tráº¡ng thÃ¡i
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Create new
	*
	* @param id mÃ£ diá»…n biáº¿n chuyá»ƒn dá»‹ch tráº¡ng thÃ¡i
	* @param dossierId há»“ sÆ¡ thá»§ tá»¥c cá»§a diá»…n biáº¿n
	* @param processOrderId ghi diá»…n biáº¿n cho phiáº¿u xá»­ lÃ½ chÃ­nh hoáº·c phá»¥
	* @param dossierProcId tham chiáº¿u thá»§ tá»¥c hÃ nh chÃ­nh
	* @param daysDoing sá»‘ ngÃ y thá»±c hiá»‡n xá»­ lÃ½ há»“ sÆ¡
	* @param daysDelay sá»‘ ngÃ y há»“ sÆ¡ bá»‹ quÃ¡ háº¡n (dáº¥u - thá»ƒ hiá»‡n trÆ°á»›c háº¡n)
	* @param startDate thá»�i Ä‘iá»ƒm báº¯t Ä‘áº§u thá»±c hiá»‡n
	* @param preDossierStatus tráº¡ng thÃ¡i há»“ sÆ¡ khi xá»­ lÃ½
	* @param postDossierStatus tráº¡ng thÃ¡i há»“ sÆ¡ sau xá»­ lÃ½
	* @param stepTransitionId chuyá»ƒn dá»‹ch tráº¡ng thÃ¡i
	* @param preDossierStepId tráº¡ng thÃ¡i trÆ°á»›c
	* @param postDossierStepId bÆ°á»›c chuyá»ƒn dá»‹ch sau
	* @param transitionName tÃªn mÃ´ táº£ hÃ nh Ä‘á»™ng xá»­ lÃ½ liÃªn quan Ä‘áº¿n há»“ sÆ¡
	* @param note ghi chÃº Ä‘Æ°á»£c ghi láº¡i cá»§a ngÆ°á»�i xá»­ lÃ½ há»“ sÆ¡
	* @param assignToUserId ngÆ°á»�i thá»±c hiá»‡n bÆ°á»›c xá»­ lÃ½
	* @return: lá»‹ch sá»­ chuyá»ƒn dá»‹ch tráº¡ng thÃ¡i má»›i Ä‘Æ°á»£c cáº­p nháº­t
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.processmgt.model.TransitionHistory updateTransitionHistory(
		long id, long dossierId, long processOrderId, int daysDoing,
		int daysDelay, java.util.Date startDate, long stepTransitionId,
		long preDossierStepId, long postDossierStepId,
		java.lang.String transitionName, java.lang.String note,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void updateTransitionHistoryResources(
		org.oep.processmgt.model.TransitionHistory transitionHistory,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void removeTransitionHistory(
		org.oep.processmgt.model.TransitionHistory transitionHistory)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void removeTransitionHistory(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void addTransitionHistoryResources(
		org.oep.processmgt.model.TransitionHistory transitionHistory,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void addTransitionHistoryResources(
		org.oep.processmgt.model.TransitionHistory transitionHistory,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void addTransitionHistoryResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;
}