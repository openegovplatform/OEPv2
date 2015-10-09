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

package org.oep.core.datamgt.dictionary.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DictCollectionLocalService}.
 *
 * @author TrungDK
 * @see DictCollectionLocalService
 * @generated
 */
public class DictCollectionLocalServiceWrapper
	implements DictCollectionLocalService,
		ServiceWrapper<DictCollectionLocalService> {
	public DictCollectionLocalServiceWrapper(
		DictCollectionLocalService dictCollectionLocalService) {
		_dictCollectionLocalService = dictCollectionLocalService;
	}

	/**
	* Adds the dictionary collection to the database. Also notifies the appropriate model listeners.
	*
	* @param dictCollection the dictionary collection
	* @return the dictionary collection that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.datamgt.dictionary.model.DictCollection addDictCollection(
		org.oep.core.datamgt.dictionary.model.DictCollection dictCollection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.addDictCollection(dictCollection);
	}

	/**
	* Creates a new dictionary collection with the primary key. Does not add the dictionary collection to the database.
	*
	* @param dictCollectionId the primary key for the new dictionary collection
	* @return the new dictionary collection
	*/
	@Override
	public org.oep.core.datamgt.dictionary.model.DictCollection createDictCollection(
		long dictCollectionId) {
		return _dictCollectionLocalService.createDictCollection(dictCollectionId);
	}

	/**
	* Deletes the dictionary collection with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dictCollectionId the primary key of the dictionary collection
	* @return the dictionary collection that was removed
	* @throws PortalException if a dictionary collection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.datamgt.dictionary.model.DictCollection deleteDictCollection(
		long dictCollectionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.deleteDictCollection(dictCollectionId);
	}

	/**
	* Deletes the dictionary collection from the database. Also notifies the appropriate model listeners.
	*
	* @param dictCollection the dictionary collection
	* @return the dictionary collection that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.datamgt.dictionary.model.DictCollection deleteDictCollection(
		org.oep.core.datamgt.dictionary.model.DictCollection dictCollection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.deleteDictCollection(dictCollection);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dictCollectionLocalService.dynamicQuery();
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
		return _dictCollectionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dictCollectionLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dictCollectionLocalService.dynamicQuery(dynamicQuery, start,
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
		return _dictCollectionLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dictCollectionLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.core.datamgt.dictionary.model.DictCollection fetchDictCollection(
		long dictCollectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.fetchDictCollection(dictCollectionId);
	}

	/**
	* Returns the dictionary collection with the primary key.
	*
	* @param dictCollectionId the primary key of the dictionary collection
	* @return the dictionary collection
	* @throws PortalException if a dictionary collection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.datamgt.dictionary.model.DictCollection getDictCollection(
		long dictCollectionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.getDictCollection(dictCollectionId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dictionary collections.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dictionary collections
	* @param end the upper bound of the range of dictionary collections (not inclusive)
	* @return the range of dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.datamgt.dictionary.model.DictCollection> getDictCollections(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.getDictCollections(start, end);
	}

	/**
	* Returns the number of dictionary collections.
	*
	* @return the number of dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDictCollectionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.getDictCollectionsCount();
	}

	/**
	* Updates the dictionary collection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dictCollection the dictionary collection
	* @return the dictionary collection that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.datamgt.dictionary.model.DictCollection updateDictCollection(
		org.oep.core.datamgt.dictionary.model.DictCollection dictCollection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.updateDictCollection(dictCollection);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addDictDataDictCollection(long dictDataId, long dictCollectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dictCollectionLocalService.addDictDataDictCollection(dictDataId,
			dictCollectionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addDictDataDictCollection(long dictDataId,
		org.oep.core.datamgt.dictionary.model.DictCollection dictCollection)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dictCollectionLocalService.addDictDataDictCollection(dictDataId,
			dictCollection);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addDictDataDictCollections(long dictDataId,
		long[] dictCollectionIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dictCollectionLocalService.addDictDataDictCollections(dictDataId,
			dictCollectionIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addDictDataDictCollections(long dictDataId,
		java.util.List<org.oep.core.datamgt.dictionary.model.DictCollection> DictCollections)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dictCollectionLocalService.addDictDataDictCollections(dictDataId,
			DictCollections);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearDictDataDictCollections(long dictDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dictCollectionLocalService.clearDictDataDictCollections(dictDataId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteDictDataDictCollection(long dictDataId,
		long dictCollectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dictCollectionLocalService.deleteDictDataDictCollection(dictDataId,
			dictCollectionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteDictDataDictCollection(long dictDataId,
		org.oep.core.datamgt.dictionary.model.DictCollection dictCollection)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dictCollectionLocalService.deleteDictDataDictCollection(dictDataId,
			dictCollection);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteDictDataDictCollections(long dictDataId,
		long[] dictCollectionIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dictCollectionLocalService.deleteDictDataDictCollections(dictDataId,
			dictCollectionIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteDictDataDictCollections(long dictDataId,
		java.util.List<org.oep.core.datamgt.dictionary.model.DictCollection> DictCollections)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dictCollectionLocalService.deleteDictDataDictCollections(dictDataId,
			DictCollections);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.datamgt.dictionary.model.DictCollection> getDictDataDictCollections(
		long dictDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.getDictDataDictCollections(dictDataId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.datamgt.dictionary.model.DictCollection> getDictDataDictCollections(
		long dictDataId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.getDictDataDictCollections(dictDataId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.datamgt.dictionary.model.DictCollection> getDictDataDictCollections(
		long dictDataId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.getDictDataDictCollections(dictDataId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDictDataDictCollectionsCount(long dictDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.getDictDataDictCollectionsCount(dictDataId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasDictDataDictCollection(long dictDataId,
		long dictCollectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.hasDictDataDictCollection(dictDataId,
			dictCollectionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasDictDataDictCollections(long dictDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.hasDictDataDictCollections(dictDataId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setDictDataDictCollections(long dictDataId,
		long[] dictCollectionIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dictCollectionLocalService.setDictDataDictCollections(dictDataId,
			dictCollectionIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dictCollectionLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dictCollectionLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dictCollectionLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Add dictionary collection
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Create new
	*
	* @param name name of the dictionary collection
	* @param version dictionary version
	* @param title title of the dictionary collection
	* @param validatedFrom the date from which dictionary collection is validated
	* @return: new dictionary collection
	*/
	@Override
	public org.oep.core.datamgt.dictionary.model.DictCollection addDictCollection(
		java.lang.String name, java.lang.String version,
		java.lang.String title, java.util.Date validatedFrom,
		java.util.Date validatedTo, int status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.addDictCollection(name, version,
			title, validatedFrom, validatedTo, status, serviceContext);
	}

	@Override
	public org.oep.core.datamgt.dictionary.model.DictCollection updateDictCollection(
		long id, java.lang.String name, java.lang.String version,
		java.lang.String title, java.util.Date validatedFrom,
		java.util.Date validatedTo, int status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.updateDictCollection(id, name,
			version, title, validatedFrom, validatedTo, status, serviceContext);
	}

	@Override
	public void updateDictCollectionResources(
		org.oep.core.datamgt.dictionary.model.DictCollection dictCollection,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dictCollectionLocalService.updateDictCollectionResources(dictCollection,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void removeDictCollection(
		org.oep.core.datamgt.dictionary.model.DictCollection dictCollection)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dictCollectionLocalService.removeDictCollection(dictCollection);
	}

	@Override
	public void removeDictCollection(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dictCollectionLocalService.removeDictCollection(id);
	}

	@Override
	public void addDictCollectionResources(
		org.oep.core.datamgt.dictionary.model.DictCollection dictCollection,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dictCollectionLocalService.addDictCollectionResources(dictCollection,
			addGroupPermission, addGuestPermission, serviceContext);
	}

	@Override
	public void addDictCollectionResources(
		org.oep.core.datamgt.dictionary.model.DictCollection dictCollection,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dictCollectionLocalService.addDictCollectionResources(dictCollection,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void addDictCollectionResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dictCollectionLocalService.addDictCollectionResources(id,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public org.oep.core.datamgt.dictionary.model.DictCollection getDictCollectionByName(
		java.lang.String collectionName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.getDictCollectionByName(collectionName,
			serviceContext);
	}

	@Override
	public java.util.Collection<org.oep.core.datamgt.dictionary.model.DictCollection> getAllDictCollectionsByName(
		java.lang.String collectionName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.getAllDictCollectionsByName(collectionName,
			serviceContext);
	}

	@Override
	public java.util.List<java.lang.String> getAllDictCollectionNames(
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.getAllDictCollectionNames(serviceContext);
	}

	@Override
	public java.util.List<java.lang.String> getAllDictCollectionNames(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.getAllDictCollectionNames(companyId);
	}

	@Override
	public int countDictCollectionByC_LikeN(java.lang.String name,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.countDictCollectionByC_LikeN(name,
			serviceContext);
	}

	@Override
	public java.util.Collection<org.oep.core.datamgt.dictionary.model.DictCollection> getByLikeName(
		java.lang.String name,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.getByLikeName(name, serviceContext);
	}

	@Override
	public java.util.Collection<org.oep.core.datamgt.dictionary.model.DictCollection> getByLikeName(
		java.lang.String name, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.getByLikeName(name, startIndex,
			endIndex, serviceContext);
	}

	@Override
	public java.util.List<org.oep.core.datamgt.dictionary.model.DictCollection> findByLikeName(
		java.lang.String name, int start, int end,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.findByLikeName(name, start, end,
			serviceContext);
	}

	@Override
	public int countLikeByName(java.lang.String name,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.countLikeByName(name, serviceContext);
	}

	@Override
	public java.util.List<org.oep.core.datamgt.dictionary.model.DictCollection> findByCustomCondition(
		java.lang.String name, java.lang.String version,
		java.util.Date validatedFrom, java.util.Date validatedTo, int status,
		int start, int end,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.findByCustomCondition(name, version,
			validatedFrom, validatedTo, status, start, end, serviceContext);
	}

	@Override
	public int countByCustomCondition(java.lang.String name,
		java.lang.String version, java.util.Date validatedFrom,
		java.util.Date validatedTo, int status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.countByCustomCondition(name,
			version, validatedFrom, validatedTo, status, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DictCollectionLocalService getWrappedDictCollectionLocalService() {
		return _dictCollectionLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDictCollectionLocalService(
		DictCollectionLocalService dictCollectionLocalService) {
		_dictCollectionLocalService = dictCollectionLocalService;
	}

	@Override
	public DictCollectionLocalService getWrappedService() {
		return _dictCollectionLocalService;
	}

	@Override
	public void setWrappedService(
		DictCollectionLocalService dictCollectionLocalService) {
		_dictCollectionLocalService = dictCollectionLocalService;
	}

	private DictCollectionLocalService _dictCollectionLocalService;
}