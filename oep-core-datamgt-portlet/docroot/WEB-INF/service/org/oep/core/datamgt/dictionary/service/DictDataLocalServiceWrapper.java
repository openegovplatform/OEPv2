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
 * Provides a wrapper for {@link DictDataLocalService}.
 *
 * @author TrungDK
 * @see DictDataLocalService
 * @generated
 */
public class DictDataLocalServiceWrapper implements DictDataLocalService,
	ServiceWrapper<DictDataLocalService> {
	public DictDataLocalServiceWrapper(
		DictDataLocalService dictDataLocalService) {
		_dictDataLocalService = dictDataLocalService;
	}

	/**
	* Adds the dictionary data to the database. Also notifies the appropriate model listeners.
	*
	* @param dictData the dictionary data
	* @return the dictionary data that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.datamgt.dictionary.model.DictData addDictData(
		org.oep.core.datamgt.dictionary.model.DictData dictData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictDataLocalService.addDictData(dictData);
	}

	/**
	* Creates a new dictionary data with the primary key. Does not add the dictionary data to the database.
	*
	* @param dictDataId the primary key for the new dictionary data
	* @return the new dictionary data
	*/
	@Override
	public org.oep.core.datamgt.dictionary.model.DictData createDictData(
		long dictDataId) {
		return _dictDataLocalService.createDictData(dictDataId);
	}

	/**
	* Deletes the dictionary data with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dictDataId the primary key of the dictionary data
	* @return the dictionary data that was removed
	* @throws PortalException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.datamgt.dictionary.model.DictData deleteDictData(
		long dictDataId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dictDataLocalService.deleteDictData(dictDataId);
	}

	/**
	* Deletes the dictionary data from the database. Also notifies the appropriate model listeners.
	*
	* @param dictData the dictionary data
	* @return the dictionary data that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.datamgt.dictionary.model.DictData deleteDictData(
		org.oep.core.datamgt.dictionary.model.DictData dictData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictDataLocalService.deleteDictData(dictData);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dictDataLocalService.dynamicQuery();
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
		return _dictDataLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dictDataLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dictDataLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _dictDataLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dictDataLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public org.oep.core.datamgt.dictionary.model.DictData fetchDictData(
		long dictDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictDataLocalService.fetchDictData(dictDataId);
	}

	/**
	* Returns the dictionary data with the primary key.
	*
	* @param dictDataId the primary key of the dictionary data
	* @return the dictionary data
	* @throws PortalException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.datamgt.dictionary.model.DictData getDictData(
		long dictDataId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dictDataLocalService.getDictData(dictDataId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dictDataLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dictionary datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @return the range of dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.datamgt.dictionary.model.DictData> getDictDatas(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictDataLocalService.getDictDatas(start, end);
	}

	/**
	* Returns the number of dictionary datas.
	*
	* @return the number of dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDictDatasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictDataLocalService.getDictDatasCount();
	}

	/**
	* Updates the dictionary data in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dictData the dictionary data
	* @return the dictionary data that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.datamgt.dictionary.model.DictData updateDictData(
		org.oep.core.datamgt.dictionary.model.DictData dictData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictDataLocalService.updateDictData(dictData);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addDictCollectionDictData(long dictCollectionId, long dictDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dictDataLocalService.addDictCollectionDictData(dictCollectionId,
			dictDataId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addDictCollectionDictData(long dictCollectionId,
		org.oep.core.datamgt.dictionary.model.DictData dictData)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dictDataLocalService.addDictCollectionDictData(dictCollectionId,
			dictData);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addDictCollectionDictDatas(long dictCollectionId,
		long[] dictDataIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dictDataLocalService.addDictCollectionDictDatas(dictCollectionId,
			dictDataIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addDictCollectionDictDatas(long dictCollectionId,
		java.util.List<org.oep.core.datamgt.dictionary.model.DictData> DictDatas)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dictDataLocalService.addDictCollectionDictDatas(dictCollectionId,
			DictDatas);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearDictCollectionDictDatas(long dictCollectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dictDataLocalService.clearDictCollectionDictDatas(dictCollectionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteDictCollectionDictData(long dictCollectionId,
		long dictDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dictDataLocalService.deleteDictCollectionDictData(dictCollectionId,
			dictDataId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteDictCollectionDictData(long dictCollectionId,
		org.oep.core.datamgt.dictionary.model.DictData dictData)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dictDataLocalService.deleteDictCollectionDictData(dictCollectionId,
			dictData);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteDictCollectionDictDatas(long dictCollectionId,
		long[] dictDataIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dictDataLocalService.deleteDictCollectionDictDatas(dictCollectionId,
			dictDataIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteDictCollectionDictDatas(long dictCollectionId,
		java.util.List<org.oep.core.datamgt.dictionary.model.DictData> DictDatas)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dictDataLocalService.deleteDictCollectionDictDatas(dictCollectionId,
			DictDatas);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.datamgt.dictionary.model.DictData> getDictCollectionDictDatas(
		long dictCollectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictDataLocalService.getDictCollectionDictDatas(dictCollectionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.datamgt.dictionary.model.DictData> getDictCollectionDictDatas(
		long dictCollectionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictDataLocalService.getDictCollectionDictDatas(dictCollectionId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.datamgt.dictionary.model.DictData> getDictCollectionDictDatas(
		long dictCollectionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictDataLocalService.getDictCollectionDictDatas(dictCollectionId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDictCollectionDictDatasCount(long dictCollectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictDataLocalService.getDictCollectionDictDatasCount(dictCollectionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasDictCollectionDictData(long dictCollectionId,
		long dictDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictDataLocalService.hasDictCollectionDictData(dictCollectionId,
			dictDataId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasDictCollectionDictDatas(long dictCollectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictDataLocalService.hasDictCollectionDictDatas(dictCollectionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setDictCollectionDictDatas(long dictCollectionId,
		long[] dictDataIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dictDataLocalService.setDictCollectionDictDatas(dictCollectionId,
			dictDataIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dictDataLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dictDataLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dictDataLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* comment for function
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  18-September-2015  trungdk    Create new
	*
	* @param
	* @return:
	*/
	@Override
	public org.oep.core.datamgt.dictionary.model.DictData addDictData(
		java.lang.String collectionName, java.lang.String dataCode,
		java.lang.String node_1, java.lang.String node_2,
		java.lang.String node_3, java.lang.String node_4,
		java.lang.String node_5, int dataLevel, java.lang.String title,
		java.lang.String description, java.util.Date validatedFrom,
		java.util.Date validatedTo, int status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dictDataLocalService.addDictData(collectionName, dataCode,
			node_1, node_2, node_3, node_4, node_5, dataLevel, title,
			description, validatedFrom, validatedTo, status, serviceContext);
	}

	@Override
	public org.oep.core.datamgt.dictionary.model.DictData updateDictData(
		long id, java.lang.String collectionName, java.lang.String dataCode,
		java.lang.String node_1, java.lang.String node_2,
		java.lang.String node_3, java.lang.String node_4,
		java.lang.String node_5, int dataLevel, java.lang.String title,
		java.lang.String description, java.util.Date validatedFrom,
		java.util.Date validatedTo, int status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dictDataLocalService.updateDictData(id, collectionName,
			dataCode, node_1, node_2, node_3, node_4, node_5, dataLevel, title,
			description, validatedFrom, validatedTo, status, serviceContext);
	}

	@Override
	public org.oep.core.datamgt.dictionary.model.DictData saveDictData(
		org.oep.core.datamgt.dictionary.model.DictData dictData,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dictDataLocalService.saveDictData(dictData, serviceContext);
	}

	@Override
	public void updateDictDataResources(
		org.oep.core.datamgt.dictionary.model.DictData dictData,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dictDataLocalService.updateDictDataResources(dictData,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void removeDictData(
		org.oep.core.datamgt.dictionary.model.DictData dictData)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dictDataLocalService.removeDictData(dictData);
	}

	@Override
	public void removeDictData(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dictDataLocalService.removeDictData(id);
	}

	@Override
	public void addDictDataResources(
		org.oep.core.datamgt.dictionary.model.DictData dictData,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dictDataLocalService.addDictDataResources(dictData,
			addGroupPermission, addGuestPermission, serviceContext);
	}

	@Override
	public void addDictDataResources(
		org.oep.core.datamgt.dictionary.model.DictData dictData,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dictDataLocalService.addDictDataResources(dictData, groupPermissions,
			guestPermissions, serviceContext);
	}

	@Override
	public void addDictDataResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dictDataLocalService.addDictDataResources(id, groupPermissions,
			guestPermissions, serviceContext);
	}

	@Override
	public int countDictDataByCollectionName(java.lang.String collectionName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dictDataLocalService.countDictDataByCollectionName(collectionName,
			serviceContext);
	}

	@Override
	public java.util.Collection<org.oep.core.datamgt.dictionary.model.DictData> getByCollectionName(
		java.lang.String collectionName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dictDataLocalService.getByCollectionName(collectionName,
			serviceContext);
	}

	@Override
	public java.util.Collection<org.oep.core.datamgt.dictionary.model.DictData> getByCollectionName(
		java.lang.String collectionName, int start, int end,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dictDataLocalService.getByCollectionName(collectionName, start,
			end, serviceContext);
	}

	@Override
	public java.util.Collection<org.oep.core.datamgt.dictionary.model.DictData> getByC_CN_DL(
		java.lang.String collectionName, int dataLevel,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dictDataLocalService.getByC_CN_DL(collectionName, dataLevel,
			serviceContext);
	}

	@Override
	public java.util.Collection<org.oep.core.datamgt.dictionary.model.DictData> getByC_DL(
		int dataLevel, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dictDataLocalService.getByC_DL(dataLevel, serviceContext);
	}

	@Override
	public java.util.List<org.oep.core.datamgt.dictionary.model.DictData> getDictDatasByCollection(
		java.lang.String collectionName, int dataLevel,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictDataLocalService.getDictDatasByCollection(collectionName,
			dataLevel, serviceContext);
	}

	@Override
	public org.oep.core.datamgt.dictionary.model.DictData getDictDataByCode(
		java.lang.String collectionName, java.lang.String dataCode,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictDataLocalService.getDictDataByCode(collectionName,
			dataCode, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DictDataLocalService getWrappedDictDataLocalService() {
		return _dictDataLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDictDataLocalService(
		DictDataLocalService dictDataLocalService) {
		_dictDataLocalService = dictDataLocalService;
	}

	@Override
	public DictDataLocalService getWrappedService() {
		return _dictDataLocalService;
	}

	@Override
	public void setWrappedService(DictDataLocalService dictDataLocalService) {
		_dictDataLocalService = dictDataLocalService;
	}

	private DictDataLocalService _dictDataLocalService;
}