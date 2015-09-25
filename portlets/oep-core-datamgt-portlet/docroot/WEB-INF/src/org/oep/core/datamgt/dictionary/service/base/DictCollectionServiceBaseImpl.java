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

package org.oep.core.datamgt.dictionary.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import org.oep.core.datamgt.dictionary.model.DictCollection;
import org.oep.core.datamgt.dictionary.service.DictCollectionService;
import org.oep.core.datamgt.dictionary.service.persistence.DictAttributePersistence;
import org.oep.core.datamgt.dictionary.service.persistence.DictCollectionFinder;
import org.oep.core.datamgt.dictionary.service.persistence.DictCollectionPersistence;
import org.oep.core.datamgt.dictionary.service.persistence.DictDataPersistence;
import org.oep.core.datamgt.dictionary.service.persistence.DictMetaDataPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the dictionary collection remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.oep.core.datamgt.dictionary.service.impl.DictCollectionServiceImpl}.
 * </p>
 *
 * @author TrungDK
 * @see org.oep.core.datamgt.dictionary.service.impl.DictCollectionServiceImpl
 * @see org.oep.core.datamgt.dictionary.service.DictCollectionServiceUtil
 * @generated
 */
public abstract class DictCollectionServiceBaseImpl extends BaseServiceImpl
	implements DictCollectionService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link org.oep.core.datamgt.dictionary.service.DictCollectionServiceUtil} to access the dictionary collection remote service.
	 */

	/**
	 * Returns the dictionary attribute local service.
	 *
	 * @return the dictionary attribute local service
	 */
	public org.oep.core.datamgt.dictionary.service.DictAttributeLocalService getDictAttributeLocalService() {
		return dictAttributeLocalService;
	}

	/**
	 * Sets the dictionary attribute local service.
	 *
	 * @param dictAttributeLocalService the dictionary attribute local service
	 */
	public void setDictAttributeLocalService(
		org.oep.core.datamgt.dictionary.service.DictAttributeLocalService dictAttributeLocalService) {
		this.dictAttributeLocalService = dictAttributeLocalService;
	}

	/**
	 * Returns the dictionary attribute remote service.
	 *
	 * @return the dictionary attribute remote service
	 */
	public org.oep.core.datamgt.dictionary.service.DictAttributeService getDictAttributeService() {
		return dictAttributeService;
	}

	/**
	 * Sets the dictionary attribute remote service.
	 *
	 * @param dictAttributeService the dictionary attribute remote service
	 */
	public void setDictAttributeService(
		org.oep.core.datamgt.dictionary.service.DictAttributeService dictAttributeService) {
		this.dictAttributeService = dictAttributeService;
	}

	/**
	 * Returns the dictionary attribute persistence.
	 *
	 * @return the dictionary attribute persistence
	 */
	public DictAttributePersistence getDictAttributePersistence() {
		return dictAttributePersistence;
	}

	/**
	 * Sets the dictionary attribute persistence.
	 *
	 * @param dictAttributePersistence the dictionary attribute persistence
	 */
	public void setDictAttributePersistence(
		DictAttributePersistence dictAttributePersistence) {
		this.dictAttributePersistence = dictAttributePersistence;
	}

	/**
	 * Returns the dictionary collection local service.
	 *
	 * @return the dictionary collection local service
	 */
	public org.oep.core.datamgt.dictionary.service.DictCollectionLocalService getDictCollectionLocalService() {
		return dictCollectionLocalService;
	}

	/**
	 * Sets the dictionary collection local service.
	 *
	 * @param dictCollectionLocalService the dictionary collection local service
	 */
	public void setDictCollectionLocalService(
		org.oep.core.datamgt.dictionary.service.DictCollectionLocalService dictCollectionLocalService) {
		this.dictCollectionLocalService = dictCollectionLocalService;
	}

	/**
	 * Returns the dictionary collection remote service.
	 *
	 * @return the dictionary collection remote service
	 */
	public org.oep.core.datamgt.dictionary.service.DictCollectionService getDictCollectionService() {
		return dictCollectionService;
	}

	/**
	 * Sets the dictionary collection remote service.
	 *
	 * @param dictCollectionService the dictionary collection remote service
	 */
	public void setDictCollectionService(
		org.oep.core.datamgt.dictionary.service.DictCollectionService dictCollectionService) {
		this.dictCollectionService = dictCollectionService;
	}

	/**
	 * Returns the dictionary collection persistence.
	 *
	 * @return the dictionary collection persistence
	 */
	public DictCollectionPersistence getDictCollectionPersistence() {
		return dictCollectionPersistence;
	}

	/**
	 * Sets the dictionary collection persistence.
	 *
	 * @param dictCollectionPersistence the dictionary collection persistence
	 */
	public void setDictCollectionPersistence(
		DictCollectionPersistence dictCollectionPersistence) {
		this.dictCollectionPersistence = dictCollectionPersistence;
	}

	/**
	 * Returns the dictionary collection finder.
	 *
	 * @return the dictionary collection finder
	 */
	public DictCollectionFinder getDictCollectionFinder() {
		return dictCollectionFinder;
	}

	/**
	 * Sets the dictionary collection finder.
	 *
	 * @param dictCollectionFinder the dictionary collection finder
	 */
	public void setDictCollectionFinder(
		DictCollectionFinder dictCollectionFinder) {
		this.dictCollectionFinder = dictCollectionFinder;
	}

	/**
	 * Returns the dictionary data local service.
	 *
	 * @return the dictionary data local service
	 */
	public org.oep.core.datamgt.dictionary.service.DictDataLocalService getDictDataLocalService() {
		return dictDataLocalService;
	}

	/**
	 * Sets the dictionary data local service.
	 *
	 * @param dictDataLocalService the dictionary data local service
	 */
	public void setDictDataLocalService(
		org.oep.core.datamgt.dictionary.service.DictDataLocalService dictDataLocalService) {
		this.dictDataLocalService = dictDataLocalService;
	}

	/**
	 * Returns the dictionary data remote service.
	 *
	 * @return the dictionary data remote service
	 */
	public org.oep.core.datamgt.dictionary.service.DictDataService getDictDataService() {
		return dictDataService;
	}

	/**
	 * Sets the dictionary data remote service.
	 *
	 * @param dictDataService the dictionary data remote service
	 */
	public void setDictDataService(
		org.oep.core.datamgt.dictionary.service.DictDataService dictDataService) {
		this.dictDataService = dictDataService;
	}

	/**
	 * Returns the dictionary data persistence.
	 *
	 * @return the dictionary data persistence
	 */
	public DictDataPersistence getDictDataPersistence() {
		return dictDataPersistence;
	}

	/**
	 * Sets the dictionary data persistence.
	 *
	 * @param dictDataPersistence the dictionary data persistence
	 */
	public void setDictDataPersistence(DictDataPersistence dictDataPersistence) {
		this.dictDataPersistence = dictDataPersistence;
	}

	/**
	 * Returns the dictionary meta data local service.
	 *
	 * @return the dictionary meta data local service
	 */
	public org.oep.core.datamgt.dictionary.service.DictMetaDataLocalService getDictMetaDataLocalService() {
		return dictMetaDataLocalService;
	}

	/**
	 * Sets the dictionary meta data local service.
	 *
	 * @param dictMetaDataLocalService the dictionary meta data local service
	 */
	public void setDictMetaDataLocalService(
		org.oep.core.datamgt.dictionary.service.DictMetaDataLocalService dictMetaDataLocalService) {
		this.dictMetaDataLocalService = dictMetaDataLocalService;
	}

	/**
	 * Returns the dictionary meta data remote service.
	 *
	 * @return the dictionary meta data remote service
	 */
	public org.oep.core.datamgt.dictionary.service.DictMetaDataService getDictMetaDataService() {
		return dictMetaDataService;
	}

	/**
	 * Sets the dictionary meta data remote service.
	 *
	 * @param dictMetaDataService the dictionary meta data remote service
	 */
	public void setDictMetaDataService(
		org.oep.core.datamgt.dictionary.service.DictMetaDataService dictMetaDataService) {
		this.dictMetaDataService = dictMetaDataService;
	}

	/**
	 * Returns the dictionary meta data persistence.
	 *
	 * @return the dictionary meta data persistence
	 */
	public DictMetaDataPersistence getDictMetaDataPersistence() {
		return dictMetaDataPersistence;
	}

	/**
	 * Sets the dictionary meta data persistence.
	 *
	 * @param dictMetaDataPersistence the dictionary meta data persistence
	 */
	public void setDictMetaDataPersistence(
		DictMetaDataPersistence dictMetaDataPersistence) {
		this.dictMetaDataPersistence = dictMetaDataPersistence;
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
		return DictCollection.class;
	}

	protected String getModelClassName() {
		return DictCollection.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = dictCollectionPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = org.oep.core.datamgt.dictionary.service.DictAttributeLocalService.class)
	protected org.oep.core.datamgt.dictionary.service.DictAttributeLocalService dictAttributeLocalService;
	@BeanReference(type = org.oep.core.datamgt.dictionary.service.DictAttributeService.class)
	protected org.oep.core.datamgt.dictionary.service.DictAttributeService dictAttributeService;
	@BeanReference(type = DictAttributePersistence.class)
	protected DictAttributePersistence dictAttributePersistence;
	@BeanReference(type = org.oep.core.datamgt.dictionary.service.DictCollectionLocalService.class)
	protected org.oep.core.datamgt.dictionary.service.DictCollectionLocalService dictCollectionLocalService;
	@BeanReference(type = org.oep.core.datamgt.dictionary.service.DictCollectionService.class)
	protected org.oep.core.datamgt.dictionary.service.DictCollectionService dictCollectionService;
	@BeanReference(type = DictCollectionPersistence.class)
	protected DictCollectionPersistence dictCollectionPersistence;
	@BeanReference(type = DictCollectionFinder.class)
	protected DictCollectionFinder dictCollectionFinder;
	@BeanReference(type = org.oep.core.datamgt.dictionary.service.DictDataLocalService.class)
	protected org.oep.core.datamgt.dictionary.service.DictDataLocalService dictDataLocalService;
	@BeanReference(type = org.oep.core.datamgt.dictionary.service.DictDataService.class)
	protected org.oep.core.datamgt.dictionary.service.DictDataService dictDataService;
	@BeanReference(type = DictDataPersistence.class)
	protected DictDataPersistence dictDataPersistence;
	@BeanReference(type = org.oep.core.datamgt.dictionary.service.DictMetaDataLocalService.class)
	protected org.oep.core.datamgt.dictionary.service.DictMetaDataLocalService dictMetaDataLocalService;
	@BeanReference(type = org.oep.core.datamgt.dictionary.service.DictMetaDataService.class)
	protected org.oep.core.datamgt.dictionary.service.DictMetaDataService dictMetaDataService;
	@BeanReference(type = DictMetaDataPersistence.class)
	protected DictMetaDataPersistence dictMetaDataPersistence;
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
	private DictCollectionServiceClpInvoker _clpInvoker = new DictCollectionServiceClpInvoker();
}