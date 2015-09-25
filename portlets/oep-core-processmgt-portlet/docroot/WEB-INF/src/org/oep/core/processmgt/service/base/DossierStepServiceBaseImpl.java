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
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import org.oep.core.processmgt.model.DossierStep;
import org.oep.core.processmgt.service.DossierStepService;
import org.oep.core.processmgt.service.persistence.DossierProcessPersistence;
import org.oep.core.processmgt.service.persistence.DossierStep2RolePersistence;
import org.oep.core.processmgt.service.persistence.DossierStepPersistence;
import org.oep.core.processmgt.service.persistence.ProcessOrder2UserPersistence;
import org.oep.core.processmgt.service.persistence.ProcessOrderPersistence;
import org.oep.core.processmgt.service.persistence.StepTransitionPersistence;
import org.oep.core.processmgt.service.persistence.TransitionHistoryPersistence;
import org.oep.core.processmgt.service.persistence.UserAssignmentPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the dossier step remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.oep.core.processmgt.service.impl.DossierStepServiceImpl}.
 * </p>
 *
 * @author trungdk
 * @see org.oep.core.processmgt.service.impl.DossierStepServiceImpl
 * @see org.oep.core.processmgt.service.DossierStepServiceUtil
 * @generated
 */
public abstract class DossierStepServiceBaseImpl extends BaseServiceImpl
	implements DossierStepService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link org.oep.core.processmgt.service.DossierStepServiceUtil} to access the dossier step remote service.
	 */

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
	 * Returns the dossier step2 role remote service.
	 *
	 * @return the dossier step2 role remote service
	 */
	public org.oep.core.processmgt.service.DossierStep2RoleService getDossierStep2RoleService() {
		return dossierStep2RoleService;
	}

	/**
	 * Sets the dossier step2 role remote service.
	 *
	 * @param dossierStep2RoleService the dossier step2 role remote service
	 */
	public void setDossierStep2RoleService(
		org.oep.core.processmgt.service.DossierStep2RoleService dossierStep2RoleService) {
		this.dossierStep2RoleService = dossierStep2RoleService;
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
	 * Returns the process order2 user remote service.
	 *
	 * @return the process order2 user remote service
	 */
	public org.oep.core.processmgt.service.ProcessOrder2UserService getProcessOrder2UserService() {
		return processOrder2UserService;
	}

	/**
	 * Sets the process order2 user remote service.
	 *
	 * @param processOrder2UserService the process order2 user remote service
	 */
	public void setProcessOrder2UserService(
		org.oep.core.processmgt.service.ProcessOrder2UserService processOrder2UserService) {
		this.processOrder2UserService = processOrder2UserService;
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
	}

	public void destroy() {
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
		return DossierStep.class;
	}

	protected String getModelClassName() {
		return DossierStep.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = dossierStepPersistence.getDataSource();

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
	@BeanReference(type = org.oep.core.processmgt.service.DossierStep2RoleService.class)
	protected org.oep.core.processmgt.service.DossierStep2RoleService dossierStep2RoleService;
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
	@BeanReference(type = org.oep.core.processmgt.service.ProcessOrder2UserService.class)
	protected org.oep.core.processmgt.service.ProcessOrder2UserService processOrder2UserService;
	@BeanReference(type = ProcessOrder2UserPersistence.class)
	protected ProcessOrder2UserPersistence processOrder2UserPersistence;
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
	private DossierStepServiceClpInvoker _clpInvoker = new DossierStepServiceClpInvoker();
}