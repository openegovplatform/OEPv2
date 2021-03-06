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

package org.oep.ssomgt.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import org.oep.ssomgt.model.Application;
import org.oep.ssomgt.service.ApplicationService;
import org.oep.ssomgt.service.persistence.AppMessageFinder;
import org.oep.ssomgt.service.persistence.AppMessagePersistence;
import org.oep.ssomgt.service.persistence.AppRole2EmployeeFinder;
import org.oep.ssomgt.service.persistence.AppRole2EmployeePersistence;
import org.oep.ssomgt.service.persistence.AppRole2JobPosFinder;
import org.oep.ssomgt.service.persistence.AppRole2JobPosPersistence;
import org.oep.ssomgt.service.persistence.AppRolePersistence;
import org.oep.ssomgt.service.persistence.ApplicationFinder;
import org.oep.ssomgt.service.persistence.ApplicationPersistence;
import org.oep.ssomgt.service.persistence.UserSyncFinder;
import org.oep.ssomgt.service.persistence.UserSyncPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the application remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.oep.ssomgt.service.impl.ApplicationServiceImpl}.
 * </p>
 *
 * @author trungdk
 * @see org.oep.ssomgt.service.impl.ApplicationServiceImpl
 * @see org.oep.ssomgt.service.ApplicationServiceUtil
 * @generated
 */
public abstract class ApplicationServiceBaseImpl extends BaseServiceImpl
	implements ApplicationService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link org.oep.ssomgt.service.ApplicationServiceUtil} to access the application remote service.
	 */

	/**
	 * Returns the application local service.
	 *
	 * @return the application local service
	 */
	public org.oep.ssomgt.service.ApplicationLocalService getApplicationLocalService() {
		return applicationLocalService;
	}

	/**
	 * Sets the application local service.
	 *
	 * @param applicationLocalService the application local service
	 */
	public void setApplicationLocalService(
		org.oep.ssomgt.service.ApplicationLocalService applicationLocalService) {
		this.applicationLocalService = applicationLocalService;
	}

	/**
	 * Returns the application remote service.
	 *
	 * @return the application remote service
	 */
	public org.oep.ssomgt.service.ApplicationService getApplicationService() {
		return applicationService;
	}

	/**
	 * Sets the application remote service.
	 *
	 * @param applicationService the application remote service
	 */
	public void setApplicationService(
		org.oep.ssomgt.service.ApplicationService applicationService) {
		this.applicationService = applicationService;
	}

	/**
	 * Returns the application persistence.
	 *
	 * @return the application persistence
	 */
	public ApplicationPersistence getApplicationPersistence() {
		return applicationPersistence;
	}

	/**
	 * Sets the application persistence.
	 *
	 * @param applicationPersistence the application persistence
	 */
	public void setApplicationPersistence(
		ApplicationPersistence applicationPersistence) {
		this.applicationPersistence = applicationPersistence;
	}

	/**
	 * Returns the application finder.
	 *
	 * @return the application finder
	 */
	public ApplicationFinder getApplicationFinder() {
		return applicationFinder;
	}

	/**
	 * Sets the application finder.
	 *
	 * @param applicationFinder the application finder
	 */
	public void setApplicationFinder(ApplicationFinder applicationFinder) {
		this.applicationFinder = applicationFinder;
	}

	/**
	 * Returns the app message local service.
	 *
	 * @return the app message local service
	 */
	public org.oep.ssomgt.service.AppMessageLocalService getAppMessageLocalService() {
		return appMessageLocalService;
	}

	/**
	 * Sets the app message local service.
	 *
	 * @param appMessageLocalService the app message local service
	 */
	public void setAppMessageLocalService(
		org.oep.ssomgt.service.AppMessageLocalService appMessageLocalService) {
		this.appMessageLocalService = appMessageLocalService;
	}

	/**
	 * Returns the app message remote service.
	 *
	 * @return the app message remote service
	 */
	public org.oep.ssomgt.service.AppMessageService getAppMessageService() {
		return appMessageService;
	}

	/**
	 * Sets the app message remote service.
	 *
	 * @param appMessageService the app message remote service
	 */
	public void setAppMessageService(
		org.oep.ssomgt.service.AppMessageService appMessageService) {
		this.appMessageService = appMessageService;
	}

	/**
	 * Returns the app message persistence.
	 *
	 * @return the app message persistence
	 */
	public AppMessagePersistence getAppMessagePersistence() {
		return appMessagePersistence;
	}

	/**
	 * Sets the app message persistence.
	 *
	 * @param appMessagePersistence the app message persistence
	 */
	public void setAppMessagePersistence(
		AppMessagePersistence appMessagePersistence) {
		this.appMessagePersistence = appMessagePersistence;
	}

	/**
	 * Returns the app message finder.
	 *
	 * @return the app message finder
	 */
	public AppMessageFinder getAppMessageFinder() {
		return appMessageFinder;
	}

	/**
	 * Sets the app message finder.
	 *
	 * @param appMessageFinder the app message finder
	 */
	public void setAppMessageFinder(AppMessageFinder appMessageFinder) {
		this.appMessageFinder = appMessageFinder;
	}

	/**
	 * Returns the app role local service.
	 *
	 * @return the app role local service
	 */
	public org.oep.ssomgt.service.AppRoleLocalService getAppRoleLocalService() {
		return appRoleLocalService;
	}

	/**
	 * Sets the app role local service.
	 *
	 * @param appRoleLocalService the app role local service
	 */
	public void setAppRoleLocalService(
		org.oep.ssomgt.service.AppRoleLocalService appRoleLocalService) {
		this.appRoleLocalService = appRoleLocalService;
	}

	/**
	 * Returns the app role remote service.
	 *
	 * @return the app role remote service
	 */
	public org.oep.ssomgt.service.AppRoleService getAppRoleService() {
		return appRoleService;
	}

	/**
	 * Sets the app role remote service.
	 *
	 * @param appRoleService the app role remote service
	 */
	public void setAppRoleService(
		org.oep.ssomgt.service.AppRoleService appRoleService) {
		this.appRoleService = appRoleService;
	}

	/**
	 * Returns the app role persistence.
	 *
	 * @return the app role persistence
	 */
	public AppRolePersistence getAppRolePersistence() {
		return appRolePersistence;
	}

	/**
	 * Sets the app role persistence.
	 *
	 * @param appRolePersistence the app role persistence
	 */
	public void setAppRolePersistence(AppRolePersistence appRolePersistence) {
		this.appRolePersistence = appRolePersistence;
	}

	/**
	 * Returns the app role2 employee local service.
	 *
	 * @return the app role2 employee local service
	 */
	public org.oep.ssomgt.service.AppRole2EmployeeLocalService getAppRole2EmployeeLocalService() {
		return appRole2EmployeeLocalService;
	}

	/**
	 * Sets the app role2 employee local service.
	 *
	 * @param appRole2EmployeeLocalService the app role2 employee local service
	 */
	public void setAppRole2EmployeeLocalService(
		org.oep.ssomgt.service.AppRole2EmployeeLocalService appRole2EmployeeLocalService) {
		this.appRole2EmployeeLocalService = appRole2EmployeeLocalService;
	}

	/**
	 * Returns the app role2 employee remote service.
	 *
	 * @return the app role2 employee remote service
	 */
	public org.oep.ssomgt.service.AppRole2EmployeeService getAppRole2EmployeeService() {
		return appRole2EmployeeService;
	}

	/**
	 * Sets the app role2 employee remote service.
	 *
	 * @param appRole2EmployeeService the app role2 employee remote service
	 */
	public void setAppRole2EmployeeService(
		org.oep.ssomgt.service.AppRole2EmployeeService appRole2EmployeeService) {
		this.appRole2EmployeeService = appRole2EmployeeService;
	}

	/**
	 * Returns the app role2 employee persistence.
	 *
	 * @return the app role2 employee persistence
	 */
	public AppRole2EmployeePersistence getAppRole2EmployeePersistence() {
		return appRole2EmployeePersistence;
	}

	/**
	 * Sets the app role2 employee persistence.
	 *
	 * @param appRole2EmployeePersistence the app role2 employee persistence
	 */
	public void setAppRole2EmployeePersistence(
		AppRole2EmployeePersistence appRole2EmployeePersistence) {
		this.appRole2EmployeePersistence = appRole2EmployeePersistence;
	}

	/**
	 * Returns the app role2 employee finder.
	 *
	 * @return the app role2 employee finder
	 */
	public AppRole2EmployeeFinder getAppRole2EmployeeFinder() {
		return appRole2EmployeeFinder;
	}

	/**
	 * Sets the app role2 employee finder.
	 *
	 * @param appRole2EmployeeFinder the app role2 employee finder
	 */
	public void setAppRole2EmployeeFinder(
		AppRole2EmployeeFinder appRole2EmployeeFinder) {
		this.appRole2EmployeeFinder = appRole2EmployeeFinder;
	}

	/**
	 * Returns the app role2 job pos local service.
	 *
	 * @return the app role2 job pos local service
	 */
	public org.oep.ssomgt.service.AppRole2JobPosLocalService getAppRole2JobPosLocalService() {
		return appRole2JobPosLocalService;
	}

	/**
	 * Sets the app role2 job pos local service.
	 *
	 * @param appRole2JobPosLocalService the app role2 job pos local service
	 */
	public void setAppRole2JobPosLocalService(
		org.oep.ssomgt.service.AppRole2JobPosLocalService appRole2JobPosLocalService) {
		this.appRole2JobPosLocalService = appRole2JobPosLocalService;
	}

	/**
	 * Returns the app role2 job pos remote service.
	 *
	 * @return the app role2 job pos remote service
	 */
	public org.oep.ssomgt.service.AppRole2JobPosService getAppRole2JobPosService() {
		return appRole2JobPosService;
	}

	/**
	 * Sets the app role2 job pos remote service.
	 *
	 * @param appRole2JobPosService the app role2 job pos remote service
	 */
	public void setAppRole2JobPosService(
		org.oep.ssomgt.service.AppRole2JobPosService appRole2JobPosService) {
		this.appRole2JobPosService = appRole2JobPosService;
	}

	/**
	 * Returns the app role2 job pos persistence.
	 *
	 * @return the app role2 job pos persistence
	 */
	public AppRole2JobPosPersistence getAppRole2JobPosPersistence() {
		return appRole2JobPosPersistence;
	}

	/**
	 * Sets the app role2 job pos persistence.
	 *
	 * @param appRole2JobPosPersistence the app role2 job pos persistence
	 */
	public void setAppRole2JobPosPersistence(
		AppRole2JobPosPersistence appRole2JobPosPersistence) {
		this.appRole2JobPosPersistence = appRole2JobPosPersistence;
	}

	/**
	 * Returns the app role2 job pos finder.
	 *
	 * @return the app role2 job pos finder
	 */
	public AppRole2JobPosFinder getAppRole2JobPosFinder() {
		return appRole2JobPosFinder;
	}

	/**
	 * Sets the app role2 job pos finder.
	 *
	 * @param appRole2JobPosFinder the app role2 job pos finder
	 */
	public void setAppRole2JobPosFinder(
		AppRole2JobPosFinder appRole2JobPosFinder) {
		this.appRole2JobPosFinder = appRole2JobPosFinder;
	}

	/**
	 * Returns the user sync local service.
	 *
	 * @return the user sync local service
	 */
	public org.oep.ssomgt.service.UserSyncLocalService getUserSyncLocalService() {
		return userSyncLocalService;
	}

	/**
	 * Sets the user sync local service.
	 *
	 * @param userSyncLocalService the user sync local service
	 */
	public void setUserSyncLocalService(
		org.oep.ssomgt.service.UserSyncLocalService userSyncLocalService) {
		this.userSyncLocalService = userSyncLocalService;
	}

	/**
	 * Returns the user sync remote service.
	 *
	 * @return the user sync remote service
	 */
	public org.oep.ssomgt.service.UserSyncService getUserSyncService() {
		return userSyncService;
	}

	/**
	 * Sets the user sync remote service.
	 *
	 * @param userSyncService the user sync remote service
	 */
	public void setUserSyncService(
		org.oep.ssomgt.service.UserSyncService userSyncService) {
		this.userSyncService = userSyncService;
	}

	/**
	 * Returns the user sync persistence.
	 *
	 * @return the user sync persistence
	 */
	public UserSyncPersistence getUserSyncPersistence() {
		return userSyncPersistence;
	}

	/**
	 * Sets the user sync persistence.
	 *
	 * @param userSyncPersistence the user sync persistence
	 */
	public void setUserSyncPersistence(UserSyncPersistence userSyncPersistence) {
		this.userSyncPersistence = userSyncPersistence;
	}

	/**
	 * Returns the user sync finder.
	 *
	 * @return the user sync finder
	 */
	public UserSyncFinder getUserSyncFinder() {
		return userSyncFinder;
	}

	/**
	 * Sets the user sync finder.
	 *
	 * @param userSyncFinder the user sync finder
	 */
	public void setUserSyncFinder(UserSyncFinder userSyncFinder) {
		this.userSyncFinder = userSyncFinder;
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
		return Application.class;
	}

	protected String getModelClassName() {
		return Application.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = applicationPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = org.oep.ssomgt.service.ApplicationLocalService.class)
	protected org.oep.ssomgt.service.ApplicationLocalService applicationLocalService;
	@BeanReference(type = org.oep.ssomgt.service.ApplicationService.class)
	protected org.oep.ssomgt.service.ApplicationService applicationService;
	@BeanReference(type = ApplicationPersistence.class)
	protected ApplicationPersistence applicationPersistence;
	@BeanReference(type = ApplicationFinder.class)
	protected ApplicationFinder applicationFinder;
	@BeanReference(type = org.oep.ssomgt.service.AppMessageLocalService.class)
	protected org.oep.ssomgt.service.AppMessageLocalService appMessageLocalService;
	@BeanReference(type = org.oep.ssomgt.service.AppMessageService.class)
	protected org.oep.ssomgt.service.AppMessageService appMessageService;
	@BeanReference(type = AppMessagePersistence.class)
	protected AppMessagePersistence appMessagePersistence;
	@BeanReference(type = AppMessageFinder.class)
	protected AppMessageFinder appMessageFinder;
	@BeanReference(type = org.oep.ssomgt.service.AppRoleLocalService.class)
	protected org.oep.ssomgt.service.AppRoleLocalService appRoleLocalService;
	@BeanReference(type = org.oep.ssomgt.service.AppRoleService.class)
	protected org.oep.ssomgt.service.AppRoleService appRoleService;
	@BeanReference(type = AppRolePersistence.class)
	protected AppRolePersistence appRolePersistence;
	@BeanReference(type = org.oep.ssomgt.service.AppRole2EmployeeLocalService.class)
	protected org.oep.ssomgt.service.AppRole2EmployeeLocalService appRole2EmployeeLocalService;
	@BeanReference(type = org.oep.ssomgt.service.AppRole2EmployeeService.class)
	protected org.oep.ssomgt.service.AppRole2EmployeeService appRole2EmployeeService;
	@BeanReference(type = AppRole2EmployeePersistence.class)
	protected AppRole2EmployeePersistence appRole2EmployeePersistence;
	@BeanReference(type = AppRole2EmployeeFinder.class)
	protected AppRole2EmployeeFinder appRole2EmployeeFinder;
	@BeanReference(type = org.oep.ssomgt.service.AppRole2JobPosLocalService.class)
	protected org.oep.ssomgt.service.AppRole2JobPosLocalService appRole2JobPosLocalService;
	@BeanReference(type = org.oep.ssomgt.service.AppRole2JobPosService.class)
	protected org.oep.ssomgt.service.AppRole2JobPosService appRole2JobPosService;
	@BeanReference(type = AppRole2JobPosPersistence.class)
	protected AppRole2JobPosPersistence appRole2JobPosPersistence;
	@BeanReference(type = AppRole2JobPosFinder.class)
	protected AppRole2JobPosFinder appRole2JobPosFinder;
	@BeanReference(type = org.oep.ssomgt.service.UserSyncLocalService.class)
	protected org.oep.ssomgt.service.UserSyncLocalService userSyncLocalService;
	@BeanReference(type = org.oep.ssomgt.service.UserSyncService.class)
	protected org.oep.ssomgt.service.UserSyncService userSyncService;
	@BeanReference(type = UserSyncPersistence.class)
	protected UserSyncPersistence userSyncPersistence;
	@BeanReference(type = UserSyncFinder.class)
	protected UserSyncFinder userSyncFinder;
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
	private ApplicationServiceClpInvoker _clpInvoker = new ApplicationServiceClpInvoker();
}