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

package org.oep.core.processmgt.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.CompanyPersistence;
import com.liferay.portal.service.persistence.GroupPersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import org.oep.core.processmgt.model.DossierProcess;
import org.oep.core.processmgt.service.DossierProcessLocalService;
import org.oep.core.processmgt.service.persistence.DossierProcessPersistence;
import org.oep.core.processmgt.service.persistence.DossierStep2RolePersistence;
import org.oep.core.processmgt.service.persistence.DossierStepPersistence;
import org.oep.core.processmgt.service.persistence.ProcessOrder2UserPersistence;
import org.oep.core.processmgt.service.persistence.ProcessOrderPersistence;
import org.oep.core.processmgt.service.persistence.StatisticByUserPersistence;
import org.oep.core.processmgt.service.persistence.StepTransitionPersistence;
import org.oep.core.processmgt.service.persistence.TransitionHistoryPersistence;
import org.oep.core.processmgt.service.persistence.UserAssignmentPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the dossier process local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.oep.core.processmgt.service.impl.DossierProcessLocalServiceImpl}.
 * </p>
 *
 * @author trungdk
 * @see org.oep.core.processmgt.service.impl.DossierProcessLocalServiceImpl
 * @see org.oep.core.processmgt.service.DossierProcessLocalServiceUtil
 * @generated
 */
public abstract class DossierProcessLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements DossierProcessLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link org.oep.core.processmgt.service.DossierProcessLocalServiceUtil} to access the dossier process local service.
	 */

	/**
	 * Adds the dossier process to the database. Also notifies the appropriate model listeners.
	 *
	 * @param dossierProcess the dossier process
	 * @return the dossier process that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public DossierProcess addDossierProcess(DossierProcess dossierProcess)
		throws SystemException {
		dossierProcess.setNew(true);

		return dossierProcessPersistence.update(dossierProcess);
	}

	/**
	 * Creates a new dossier process with the primary key. Does not add the dossier process to the database.
	 *
	 * @param dossierProcessId the primary key for the new dossier process
	 * @return the new dossier process
	 */
	@Override
	public DossierProcess createDossierProcess(long dossierProcessId) {
		return dossierProcessPersistence.create(dossierProcessId);
	}

	/**
	 * Deletes the dossier process with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dossierProcessId the primary key of the dossier process
	 * @return the dossier process that was removed
	 * @throws PortalException if a dossier process with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public DossierProcess deleteDossierProcess(long dossierProcessId)
		throws PortalException, SystemException {
		return dossierProcessPersistence.remove(dossierProcessId);
	}

	/**
	 * Deletes the dossier process from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dossierProcess the dossier process
	 * @return the dossier process that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public DossierProcess deleteDossierProcess(DossierProcess dossierProcess)
		throws SystemException {
		return dossierProcessPersistence.remove(dossierProcess);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(DossierProcess.class,
			clazz.getClassLoader());
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
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return dossierProcessPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DossierProcessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return dossierProcessPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DossierProcessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return dossierProcessPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return dossierProcessPersistence.countWithDynamicQuery(dynamicQuery);
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
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return dossierProcessPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public DossierProcess fetchDossierProcess(long dossierProcessId)
		throws SystemException {
		return dossierProcessPersistence.fetchByPrimaryKey(dossierProcessId);
	}

	/**
	 * Returns the dossier process with the primary key.
	 *
	 * @param dossierProcessId the primary key of the dossier process
	 * @return the dossier process
	 * @throws PortalException if a dossier process with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcess getDossierProcess(long dossierProcessId)
		throws PortalException, SystemException {
		return dossierProcessPersistence.findByPrimaryKey(dossierProcessId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return dossierProcessPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the dossier processes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DossierProcessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier processes
	 * @param end the upper bound of the range of dossier processes (not inclusive)
	 * @return the range of dossier processes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProcess> getDossierProcesses(int start, int end)
		throws SystemException {
		return dossierProcessPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of dossier processes.
	 *
	 * @return the number of dossier processes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getDossierProcessesCount() throws SystemException {
		return dossierProcessPersistence.countAll();
	}

	/**
	 * Updates the dossier process in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param dossierProcess the dossier process
	 * @return the dossier process that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public DossierProcess updateDossierProcess(DossierProcess dossierProcess)
		throws SystemException {
		return dossierProcessPersistence.update(dossierProcess);
	}

	/**
	 * Returns the dossier process local service.
	 *
	 * @return the dossier process local service
	 */
	public org.oep.core.processmgt.service.DossierProcessLocalService getDossierProcessLocalService() {
		return dossierProcessLocalService;
	}

	/**
	 * Sets the dossier process local service.
	 *
	 * @param dossierProcessLocalService the dossier process local service
	 */
	public void setDossierProcessLocalService(
		org.oep.core.processmgt.service.DossierProcessLocalService dossierProcessLocalService) {
		this.dossierProcessLocalService = dossierProcessLocalService;
	}

	/**
	 * Returns the dossier process remote service.
	 *
	 * @return the dossier process remote service
	 */
	public org.oep.core.processmgt.service.DossierProcessService getDossierProcessService() {
		return dossierProcessService;
	}

	/**
	 * Sets the dossier process remote service.
	 *
	 * @param dossierProcessService the dossier process remote service
	 */
	public void setDossierProcessService(
		org.oep.core.processmgt.service.DossierProcessService dossierProcessService) {
		this.dossierProcessService = dossierProcessService;
	}

	/**
	 * Returns the dossier process persistence.
	 *
	 * @return the dossier process persistence
	 */
	public DossierProcessPersistence getDossierProcessPersistence() {
		return dossierProcessPersistence;
	}

	/**
	 * Sets the dossier process persistence.
	 *
	 * @param dossierProcessPersistence the dossier process persistence
	 */
	public void setDossierProcessPersistence(
		DossierProcessPersistence dossierProcessPersistence) {
		this.dossierProcessPersistence = dossierProcessPersistence;
	}

	/**
	 * Returns the dossier step local service.
	 *
	 * @return the dossier step local service
	 */
	public org.oep.core.processmgt.service.DossierStepLocalService getDossierStepLocalService() {
		return dossierStepLocalService;
	}

	/**
	 * Sets the dossier step local service.
	 *
	 * @param dossierStepLocalService the dossier step local service
	 */
	public void setDossierStepLocalService(
		org.oep.core.processmgt.service.DossierStepLocalService dossierStepLocalService) {
		this.dossierStepLocalService = dossierStepLocalService;
	}

	/**
	 * Returns the dossier step remote service.
	 *
	 * @return the dossier step remote service
	 */
	public org.oep.core.processmgt.service.DossierStepService getDossierStepService() {
		return dossierStepService;
	}

	/**
	 * Sets the dossier step remote service.
	 *
	 * @param dossierStepService the dossier step remote service
	 */
	public void setDossierStepService(
		org.oep.core.processmgt.service.DossierStepService dossierStepService) {
		this.dossierStepService = dossierStepService;
	}

	/**
	 * Returns the dossier step persistence.
	 *
	 * @return the dossier step persistence
	 */
	public DossierStepPersistence getDossierStepPersistence() {
		return dossierStepPersistence;
	}

	/**
	 * Sets the dossier step persistence.
	 *
	 * @param dossierStepPersistence the dossier step persistence
	 */
	public void setDossierStepPersistence(
		DossierStepPersistence dossierStepPersistence) {
		this.dossierStepPersistence = dossierStepPersistence;
	}

	/**
	 * Returns the dossier step2 role local service.
	 *
	 * @return the dossier step2 role local service
	 */
	public org.oep.core.processmgt.service.DossierStep2RoleLocalService getDossierStep2RoleLocalService() {
		return dossierStep2RoleLocalService;
	}

	/**
	 * Sets the dossier step2 role local service.
	 *
	 * @param dossierStep2RoleLocalService the dossier step2 role local service
	 */
	public void setDossierStep2RoleLocalService(
		org.oep.core.processmgt.service.DossierStep2RoleLocalService dossierStep2RoleLocalService) {
		this.dossierStep2RoleLocalService = dossierStep2RoleLocalService;
	}

	/**
	 * Returns the dossier step2 role persistence.
	 *
	 * @return the dossier step2 role persistence
	 */
	public DossierStep2RolePersistence getDossierStep2RolePersistence() {
		return dossierStep2RolePersistence;
	}

	/**
	 * Sets the dossier step2 role persistence.
	 *
	 * @param dossierStep2RolePersistence the dossier step2 role persistence
	 */
	public void setDossierStep2RolePersistence(
		DossierStep2RolePersistence dossierStep2RolePersistence) {
		this.dossierStep2RolePersistence = dossierStep2RolePersistence;
	}

	/**
	 * Returns the process order local service.
	 *
	 * @return the process order local service
	 */
	public org.oep.core.processmgt.service.ProcessOrderLocalService getProcessOrderLocalService() {
		return processOrderLocalService;
	}

	/**
	 * Sets the process order local service.
	 *
	 * @param processOrderLocalService the process order local service
	 */
	public void setProcessOrderLocalService(
		org.oep.core.processmgt.service.ProcessOrderLocalService processOrderLocalService) {
		this.processOrderLocalService = processOrderLocalService;
	}

	/**
	 * Returns the process order remote service.
	 *
	 * @return the process order remote service
	 */
	public org.oep.core.processmgt.service.ProcessOrderService getProcessOrderService() {
		return processOrderService;
	}

	/**
	 * Sets the process order remote service.
	 *
	 * @param processOrderService the process order remote service
	 */
	public void setProcessOrderService(
		org.oep.core.processmgt.service.ProcessOrderService processOrderService) {
		this.processOrderService = processOrderService;
	}

	/**
	 * Returns the process order persistence.
	 *
	 * @return the process order persistence
	 */
	public ProcessOrderPersistence getProcessOrderPersistence() {
		return processOrderPersistence;
	}

	/**
	 * Sets the process order persistence.
	 *
	 * @param processOrderPersistence the process order persistence
	 */
	public void setProcessOrderPersistence(
		ProcessOrderPersistence processOrderPersistence) {
		this.processOrderPersistence = processOrderPersistence;
	}

	/**
	 * Returns the process order2 user local service.
	 *
	 * @return the process order2 user local service
	 */
	public org.oep.core.processmgt.service.ProcessOrder2UserLocalService getProcessOrder2UserLocalService() {
		return processOrder2UserLocalService;
	}

	/**
	 * Sets the process order2 user local service.
	 *
	 * @param processOrder2UserLocalService the process order2 user local service
	 */
	public void setProcessOrder2UserLocalService(
		org.oep.core.processmgt.service.ProcessOrder2UserLocalService processOrder2UserLocalService) {
		this.processOrder2UserLocalService = processOrder2UserLocalService;
	}

	/**
	 * Returns the process order2 user persistence.
	 *
	 * @return the process order2 user persistence
	 */
	public ProcessOrder2UserPersistence getProcessOrder2UserPersistence() {
		return processOrder2UserPersistence;
	}

	/**
	 * Sets the process order2 user persistence.
	 *
	 * @param processOrder2UserPersistence the process order2 user persistence
	 */
	public void setProcessOrder2UserPersistence(
		ProcessOrder2UserPersistence processOrder2UserPersistence) {
		this.processOrder2UserPersistence = processOrder2UserPersistence;
	}

	/**
	 * Returns the statistic by user remote service.
	 *
	 * @return the statistic by user remote service
	 */
	public org.oep.core.processmgt.service.StatisticByUserService getStatisticByUserService() {
		return statisticByUserService;
	}

	/**
	 * Sets the statistic by user remote service.
	 *
	 * @param statisticByUserService the statistic by user remote service
	 */
	public void setStatisticByUserService(
		org.oep.core.processmgt.service.StatisticByUserService statisticByUserService) {
		this.statisticByUserService = statisticByUserService;
	}

	/**
	 * Returns the statistic by user persistence.
	 *
	 * @return the statistic by user persistence
	 */
	public StatisticByUserPersistence getStatisticByUserPersistence() {
		return statisticByUserPersistence;
	}

	/**
	 * Sets the statistic by user persistence.
	 *
	 * @param statisticByUserPersistence the statistic by user persistence
	 */
	public void setStatisticByUserPersistence(
		StatisticByUserPersistence statisticByUserPersistence) {
		this.statisticByUserPersistence = statisticByUserPersistence;
	}

	/**
	 * Returns the step transition local service.
	 *
	 * @return the step transition local service
	 */
	public org.oep.core.processmgt.service.StepTransitionLocalService getStepTransitionLocalService() {
		return stepTransitionLocalService;
	}

	/**
	 * Sets the step transition local service.
	 *
	 * @param stepTransitionLocalService the step transition local service
	 */
	public void setStepTransitionLocalService(
		org.oep.core.processmgt.service.StepTransitionLocalService stepTransitionLocalService) {
		this.stepTransitionLocalService = stepTransitionLocalService;
	}

	/**
	 * Returns the step transition remote service.
	 *
	 * @return the step transition remote service
	 */
	public org.oep.core.processmgt.service.StepTransitionService getStepTransitionService() {
		return stepTransitionService;
	}

	/**
	 * Sets the step transition remote service.
	 *
	 * @param stepTransitionService the step transition remote service
	 */
	public void setStepTransitionService(
		org.oep.core.processmgt.service.StepTransitionService stepTransitionService) {
		this.stepTransitionService = stepTransitionService;
	}

	/**
	 * Returns the step transition persistence.
	 *
	 * @return the step transition persistence
	 */
	public StepTransitionPersistence getStepTransitionPersistence() {
		return stepTransitionPersistence;
	}

	/**
	 * Sets the step transition persistence.
	 *
	 * @param stepTransitionPersistence the step transition persistence
	 */
	public void setStepTransitionPersistence(
		StepTransitionPersistence stepTransitionPersistence) {
		this.stepTransitionPersistence = stepTransitionPersistence;
	}

	/**
	 * Returns the transition history local service.
	 *
	 * @return the transition history local service
	 */
	public org.oep.core.processmgt.service.TransitionHistoryLocalService getTransitionHistoryLocalService() {
		return transitionHistoryLocalService;
	}

	/**
	 * Sets the transition history local service.
	 *
	 * @param transitionHistoryLocalService the transition history local service
	 */
	public void setTransitionHistoryLocalService(
		org.oep.core.processmgt.service.TransitionHistoryLocalService transitionHistoryLocalService) {
		this.transitionHistoryLocalService = transitionHistoryLocalService;
	}

	/**
	 * Returns the transition history remote service.
	 *
	 * @return the transition history remote service
	 */
	public org.oep.core.processmgt.service.TransitionHistoryService getTransitionHistoryService() {
		return transitionHistoryService;
	}

	/**
	 * Sets the transition history remote service.
	 *
	 * @param transitionHistoryService the transition history remote service
	 */
	public void setTransitionHistoryService(
		org.oep.core.processmgt.service.TransitionHistoryService transitionHistoryService) {
		this.transitionHistoryService = transitionHistoryService;
	}

	/**
	 * Returns the transition history persistence.
	 *
	 * @return the transition history persistence
	 */
	public TransitionHistoryPersistence getTransitionHistoryPersistence() {
		return transitionHistoryPersistence;
	}

	/**
	 * Sets the transition history persistence.
	 *
	 * @param transitionHistoryPersistence the transition history persistence
	 */
	public void setTransitionHistoryPersistence(
		TransitionHistoryPersistence transitionHistoryPersistence) {
		this.transitionHistoryPersistence = transitionHistoryPersistence;
	}

	/**
	 * Returns the user assignment local service.
	 *
	 * @return the user assignment local service
	 */
	public org.oep.core.processmgt.service.UserAssignmentLocalService getUserAssignmentLocalService() {
		return userAssignmentLocalService;
	}

	/**
	 * Sets the user assignment local service.
	 *
	 * @param userAssignmentLocalService the user assignment local service
	 */
	public void setUserAssignmentLocalService(
		org.oep.core.processmgt.service.UserAssignmentLocalService userAssignmentLocalService) {
		this.userAssignmentLocalService = userAssignmentLocalService;
	}

	/**
	 * Returns the user assignment remote service.
	 *
	 * @return the user assignment remote service
	 */
	public org.oep.core.processmgt.service.UserAssignmentService getUserAssignmentService() {
		return userAssignmentService;
	}

	/**
	 * Sets the user assignment remote service.
	 *
	 * @param userAssignmentService the user assignment remote service
	 */
	public void setUserAssignmentService(
		org.oep.core.processmgt.service.UserAssignmentService userAssignmentService) {
		this.userAssignmentService = userAssignmentService;
	}

	/**
	 * Returns the user assignment persistence.
	 *
	 * @return the user assignment persistence
	 */
	public UserAssignmentPersistence getUserAssignmentPersistence() {
		return userAssignmentPersistence;
	}

	/**
	 * Sets the user assignment persistence.
	 *
	 * @param userAssignmentPersistence the user assignment persistence
	 */
	public void setUserAssignmentPersistence(
		UserAssignmentPersistence userAssignmentPersistence) {
		this.userAssignmentPersistence = userAssignmentPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the company local service.
	 *
	 * @return the company local service
	 */
	public com.liferay.portal.service.CompanyLocalService getCompanyLocalService() {
		return companyLocalService;
	}

	/**
	 * Sets the company local service.
	 *
	 * @param companyLocalService the company local service
	 */
	public void setCompanyLocalService(
		com.liferay.portal.service.CompanyLocalService companyLocalService) {
		this.companyLocalService = companyLocalService;
	}

	/**
	 * Returns the company remote service.
	 *
	 * @return the company remote service
	 */
	public com.liferay.portal.service.CompanyService getCompanyService() {
		return companyService;
	}

	/**
	 * Sets the company remote service.
	 *
	 * @param companyService the company remote service
	 */
	public void setCompanyService(
		com.liferay.portal.service.CompanyService companyService) {
		this.companyService = companyService;
	}

	/**
	 * Returns the company persistence.
	 *
	 * @return the company persistence
	 */
	public CompanyPersistence getCompanyPersistence() {
		return companyPersistence;
	}

	/**
	 * Sets the company persistence.
	 *
	 * @param companyPersistence the company persistence
	 */
	public void setCompanyPersistence(CompanyPersistence companyPersistence) {
		this.companyPersistence = companyPersistence;
	}

	/**
	 * Returns the group local service.
	 *
	 * @return the group local service
	 */
	public com.liferay.portal.service.GroupLocalService getGroupLocalService() {
		return groupLocalService;
	}

	/**
	 * Sets the group local service.
	 *
	 * @param groupLocalService the group local service
	 */
	public void setGroupLocalService(
		com.liferay.portal.service.GroupLocalService groupLocalService) {
		this.groupLocalService = groupLocalService;
	}

	/**
	 * Returns the group remote service.
	 *
	 * @return the group remote service
	 */
	public com.liferay.portal.service.GroupService getGroupService() {
		return groupService;
	}

	/**
	 * Sets the group remote service.
	 *
	 * @param groupService the group remote service
	 */
	public void setGroupService(
		com.liferay.portal.service.GroupService groupService) {
		this.groupService = groupService;
	}

	/**
	 * Returns the group persistence.
	 *
	 * @return the group persistence
	 */
	public GroupPersistence getGroupPersistence() {
		return groupPersistence;
	}

	/**
	 * Sets the group persistence.
	 *
	 * @param groupPersistence the group persistence
	 */
	public void setGroupPersistence(GroupPersistence groupPersistence) {
		this.groupPersistence = groupPersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("org.oep.core.processmgt.model.DossierProcess",
			dossierProcessLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"org.oep.core.processmgt.model.DossierProcess");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return DossierProcess.class;
	}

	protected String getModelClassName() {
		return DossierProcess.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = dossierProcessPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = org.oep.core.processmgt.service.DossierProcessLocalService.class)
	protected org.oep.core.processmgt.service.DossierProcessLocalService dossierProcessLocalService;
	@BeanReference(type = org.oep.core.processmgt.service.DossierProcessService.class)
	protected org.oep.core.processmgt.service.DossierProcessService dossierProcessService;
	@BeanReference(type = DossierProcessPersistence.class)
	protected DossierProcessPersistence dossierProcessPersistence;
	@BeanReference(type = org.oep.core.processmgt.service.DossierStepLocalService.class)
	protected org.oep.core.processmgt.service.DossierStepLocalService dossierStepLocalService;
	@BeanReference(type = org.oep.core.processmgt.service.DossierStepService.class)
	protected org.oep.core.processmgt.service.DossierStepService dossierStepService;
	@BeanReference(type = DossierStepPersistence.class)
	protected DossierStepPersistence dossierStepPersistence;
	@BeanReference(type = org.oep.core.processmgt.service.DossierStep2RoleLocalService.class)
	protected org.oep.core.processmgt.service.DossierStep2RoleLocalService dossierStep2RoleLocalService;
	@BeanReference(type = DossierStep2RolePersistence.class)
	protected DossierStep2RolePersistence dossierStep2RolePersistence;
	@BeanReference(type = org.oep.core.processmgt.service.ProcessOrderLocalService.class)
	protected org.oep.core.processmgt.service.ProcessOrderLocalService processOrderLocalService;
	@BeanReference(type = org.oep.core.processmgt.service.ProcessOrderService.class)
	protected org.oep.core.processmgt.service.ProcessOrderService processOrderService;
	@BeanReference(type = ProcessOrderPersistence.class)
	protected ProcessOrderPersistence processOrderPersistence;
	@BeanReference(type = org.oep.core.processmgt.service.ProcessOrder2UserLocalService.class)
	protected org.oep.core.processmgt.service.ProcessOrder2UserLocalService processOrder2UserLocalService;
	@BeanReference(type = ProcessOrder2UserPersistence.class)
	protected ProcessOrder2UserPersistence processOrder2UserPersistence;
	@BeanReference(type = org.oep.core.processmgt.service.StatisticByUserService.class)
	protected org.oep.core.processmgt.service.StatisticByUserService statisticByUserService;
	@BeanReference(type = StatisticByUserPersistence.class)
	protected StatisticByUserPersistence statisticByUserPersistence;
	@BeanReference(type = org.oep.core.processmgt.service.StepTransitionLocalService.class)
	protected org.oep.core.processmgt.service.StepTransitionLocalService stepTransitionLocalService;
	@BeanReference(type = org.oep.core.processmgt.service.StepTransitionService.class)
	protected org.oep.core.processmgt.service.StepTransitionService stepTransitionService;
	@BeanReference(type = StepTransitionPersistence.class)
	protected StepTransitionPersistence stepTransitionPersistence;
	@BeanReference(type = org.oep.core.processmgt.service.TransitionHistoryLocalService.class)
	protected org.oep.core.processmgt.service.TransitionHistoryLocalService transitionHistoryLocalService;
	@BeanReference(type = org.oep.core.processmgt.service.TransitionHistoryService.class)
	protected org.oep.core.processmgt.service.TransitionHistoryService transitionHistoryService;
	@BeanReference(type = TransitionHistoryPersistence.class)
	protected TransitionHistoryPersistence transitionHistoryPersistence;
	@BeanReference(type = org.oep.core.processmgt.service.UserAssignmentLocalService.class)
	protected org.oep.core.processmgt.service.UserAssignmentLocalService userAssignmentLocalService;
	@BeanReference(type = org.oep.core.processmgt.service.UserAssignmentService.class)
	protected org.oep.core.processmgt.service.UserAssignmentService userAssignmentService;
	@BeanReference(type = UserAssignmentPersistence.class)
	protected UserAssignmentPersistence userAssignmentPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.CompanyLocalService.class)
	protected com.liferay.portal.service.CompanyLocalService companyLocalService;
	@BeanReference(type = com.liferay.portal.service.CompanyService.class)
	protected com.liferay.portal.service.CompanyService companyService;
	@BeanReference(type = CompanyPersistence.class)
	protected CompanyPersistence companyPersistence;
	@BeanReference(type = com.liferay.portal.service.GroupLocalService.class)
	protected com.liferay.portal.service.GroupLocalService groupLocalService;
	@BeanReference(type = com.liferay.portal.service.GroupService.class)
	protected com.liferay.portal.service.GroupService groupService;
	@BeanReference(type = GroupPersistence.class)
	protected GroupPersistence groupPersistence;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private DossierProcessLocalServiceClpInvoker _clpInvoker = new DossierProcessLocalServiceClpInvoker();
}