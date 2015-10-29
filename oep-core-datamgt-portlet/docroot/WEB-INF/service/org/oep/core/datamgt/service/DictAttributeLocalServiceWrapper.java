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

package org.oep.core.datamgt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DictAttributeLocalService}.
 *
 * @author NQMINH
 * @see DictAttributeLocalService
 * @generated
 */
public class DictAttributeLocalServiceWrapper
	implements DictAttributeLocalService,
		ServiceWrapper<DictAttributeLocalService> {
	public DictAttributeLocalServiceWrapper(
		DictAttributeLocalService dictAttributeLocalService) {
		_dictAttributeLocalService = dictAttributeLocalService;
	}

	/**
	* Adds the dictionary attribute to the database. Also notifies the appropriate model listeners.
	*
	* @param dictAttribute the dictionary attribute
	* @return the dictionary attribute that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.datamgt.model.DictAttribute addDictAttribute(
		org.oep.core.datamgt.model.DictAttribute dictAttribute)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictAttributeLocalService.addDictAttribute(dictAttribute);
	}

	/**
	* Creates a new dictionary attribute with the primary key. Does not add the dictionary attribute to the database.
	*
	* @param dictAttributeId the primary key for the new dictionary attribute
	* @return the new dictionary attribute
	*/
	@Override
	public org.oep.core.datamgt.model.DictAttribute createDictAttribute(
		long dictAttributeId) {
		return _dictAttributeLocalService.createDictAttribute(dictAttributeId);
	}

	/**
	* Deletes the dictionary attribute with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dictAttributeId the primary key of the dictionary attribute
	* @return the dictionary attribute that was removed
	* @throws PortalException if a dictionary attribute with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.datamgt.model.DictAttribute deleteDictAttribute(
		long dictAttributeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dictAttributeLocalService.deleteDictAttribute(dictAttributeId);
	}

	/**
	* Deletes the dictionary attribute from the database. Also notifies the appropriate model listeners.
	*
	* @param dictAttribute the dictionary attribute
	* @return the dictionary attribute that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.datamgt.model.DictAttribute deleteDictAttribute(
		org.oep.core.datamgt.model.DictAttribute dictAttribute)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictAttributeLocalService.deleteDictAttribute(dictAttribute);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dictAttributeLocalService.dynamicQuery();
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
		return _dictAttributeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dictAttributeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dictAttributeLocalService.dynamicQuery(dynamicQuery, start,
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
		return _dictAttributeLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dictAttributeLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.core.datamgt.model.DictAttribute fetchDictAttribute(
		long dictAttributeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictAttributeLocalService.fetchDictAttribute(dictAttributeId);
	}

	/**
	* Returns the dictionary attribute with the primary key.
	*
	* @param dictAttributeId the primary key of the dictionary attribute
	* @return the dictionary attribute
	* @throws PortalException if a dictionary attribute with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.datamgt.model.DictAttribute getDictAttribute(
		long dictAttributeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dictAttributeLocalService.getDictAttribute(dictAttributeId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dictAttributeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dictionary attributes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dictionary attributes
	* @param end the upper bound of the range of dictionary attributes (not inclusive)
	* @return the range of dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.datamgt.model.DictAttribute> getDictAttributes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictAttributeLocalService.getDictAttributes(start, end);
	}

	/**
	* Returns the number of dictionary attributes.
	*
	* @return the number of dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDictAttributesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictAttributeLocalService.getDictAttributesCount();
	}

	/**
	* Updates the dictionary attribute in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dictAttribute the dictionary attribute
	* @return the dictionary attribute that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.datamgt.model.DictAttribute updateDictAttribute(
		org.oep.core.datamgt.model.DictAttribute dictAttribute)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictAttributeLocalService.updateDictAttribute(dictAttribute);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dictAttributeLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dictAttributeLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dictAttributeLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public org.oep.core.datamgt.model.DictAttribute addDictAttribute(
		java.lang.String collectionName, java.lang.String name,
		java.lang.String title, java.lang.String dataType,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dictAttributeLocalService.addDictAttribute(collectionName,
			name, title, dataType, serviceContext);
	}

	@Override
	public org.oep.core.datamgt.model.DictAttribute updateDictAttribute(
		long id, java.lang.String collectionName, java.lang.String name,
		java.lang.String title, java.lang.String dataType,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dictAttributeLocalService.updateDictAttribute(id,
			collectionName, name, title, dataType, serviceContext);
	}

	@Override
	public org.oep.core.datamgt.model.DictAttribute saveDictAttribute(
		org.oep.core.datamgt.model.DictAttribute dictAttribute,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dictAttributeLocalService.saveDictAttribute(dictAttribute,
			serviceContext);
	}

	@Override
	public void updateDictAttributeResources(
		org.oep.core.datamgt.model.DictAttribute dictAttribute,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dictAttributeLocalService.updateDictAttributeResources(dictAttribute,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void removeDictAttribute(
		org.oep.core.datamgt.model.DictAttribute dictAttribute)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dictAttributeLocalService.removeDictAttribute(dictAttribute);
	}

	@Override
	public void removeDictAttribute(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dictAttributeLocalService.removeDictAttribute(id);
	}

	@Override
	public void addDictAttributeResources(
		org.oep.core.datamgt.model.DictAttribute dictAttribute,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dictAttributeLocalService.addDictAttributeResources(dictAttribute,
			addGroupPermission, addGuestPermission, serviceContext);
	}

	@Override
	public void addDictAttributeResources(
		org.oep.core.datamgt.model.DictAttribute dictAttribute,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dictAttributeLocalService.addDictAttributeResources(dictAttribute,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void addDictAttributeResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dictAttributeLocalService.addDictAttributeResources(id,
			groupPermissions, guestPermissions, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DictAttributeLocalService getWrappedDictAttributeLocalService() {
		return _dictAttributeLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDictAttributeLocalService(
		DictAttributeLocalService dictAttributeLocalService) {
		_dictAttributeLocalService = dictAttributeLocalService;
	}

	@Override
	public DictAttributeLocalService getWrappedService() {
		return _dictAttributeLocalService;
	}

	@Override
	public void setWrappedService(
		DictAttributeLocalService dictAttributeLocalService) {
		_dictAttributeLocalService = dictAttributeLocalService;
	}

	private DictAttributeLocalService _dictAttributeLocalService;
}