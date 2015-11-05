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

package org.oep.datamgt.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for DictData. This utility wraps
 * {@link org.oep.datamgt.service.impl.DictDataLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author NQMINH
 * @see DictDataLocalService
 * @see org.oep.datamgt.service.base.DictDataLocalServiceBaseImpl
 * @see org.oep.datamgt.service.impl.DictDataLocalServiceImpl
 * @generated
 */
public class DictDataLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.datamgt.service.impl.DictDataLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dictionary data to the database. Also notifies the appropriate model listeners.
	*
	* @param dictData the dictionary data
	* @return the dictionary data that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictData addDictData(
		org.oep.datamgt.model.DictData dictData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDictData(dictData);
	}

	/**
	* Creates a new dictionary data with the primary key. Does not add the dictionary data to the database.
	*
	* @param dictDataId the primary key for the new dictionary data
	* @return the new dictionary data
	*/
	public static org.oep.datamgt.model.DictData createDictData(long dictDataId) {
		return getService().createDictData(dictDataId);
	}

	/**
	* Deletes the dictionary data with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dictDataId the primary key of the dictionary data
	* @return the dictionary data that was removed
	* @throws PortalException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictData deleteDictData(long dictDataId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDictData(dictDataId);
	}

	/**
	* Deletes the dictionary data from the database. Also notifies the appropriate model listeners.
	*
	* @param dictData the dictionary data
	* @return the dictionary data that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictData deleteDictData(
		org.oep.datamgt.model.DictData dictData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDictData(dictData);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static org.oep.datamgt.model.DictData fetchDictData(long dictDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDictData(dictDataId);
	}

	/**
	* Returns the dictionary data with the primary key.
	*
	* @param dictDataId the primary key of the dictionary data
	* @return the dictionary data
	* @throws PortalException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictData getDictData(long dictDataId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDictData(dictDataId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dictionary datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @return the range of dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictData> getDictDatas(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDictDatas(start, end);
	}

	/**
	* Returns the number of dictionary datas.
	*
	* @return the number of dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static int getDictDatasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDictDatasCount();
	}

	/**
	* Updates the dictionary data in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dictData the dictionary data
	* @return the dictionary data that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictData updateDictData(
		org.oep.datamgt.model.DictData dictData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDictData(dictData);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addDictCollectionDictData(long dictCollectionId,
		long dictDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addDictCollectionDictData(dictCollectionId, dictDataId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addDictCollectionDictData(long dictCollectionId,
		org.oep.datamgt.model.DictData dictData)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addDictCollectionDictData(dictCollectionId, dictData);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addDictCollectionDictDatas(long dictCollectionId,
		long[] dictDataIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addDictCollectionDictDatas(dictCollectionId, dictDataIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addDictCollectionDictDatas(long dictCollectionId,
		java.util.List<org.oep.datamgt.model.DictData> DictDatas)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addDictCollectionDictDatas(dictCollectionId, DictDatas);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearDictCollectionDictDatas(long dictCollectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearDictCollectionDictDatas(dictCollectionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDictCollectionDictData(long dictCollectionId,
		long dictDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDictCollectionDictData(dictCollectionId, dictDataId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDictCollectionDictData(long dictCollectionId,
		org.oep.datamgt.model.DictData dictData)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDictCollectionDictData(dictCollectionId, dictData);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDictCollectionDictDatas(long dictCollectionId,
		long[] dictDataIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDictCollectionDictDatas(dictCollectionId, dictDataIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDictCollectionDictDatas(long dictCollectionId,
		java.util.List<org.oep.datamgt.model.DictData> DictDatas)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDictCollectionDictDatas(dictCollectionId, DictDatas);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictData> getDictCollectionDictDatas(
		long dictCollectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDictCollectionDictDatas(dictCollectionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictData> getDictCollectionDictDatas(
		long dictCollectionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getDictCollectionDictDatas(dictCollectionId, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictData> getDictCollectionDictDatas(
		long dictCollectionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getDictCollectionDictDatas(dictCollectionId, start, end,
			orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getDictCollectionDictDatasCount(long dictCollectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDictCollectionDictDatasCount(dictCollectionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasDictCollectionDictData(long dictCollectionId,
		long dictDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .hasDictCollectionDictData(dictCollectionId, dictDataId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasDictCollectionDictDatas(long dictCollectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasDictCollectionDictDatas(dictCollectionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setDictCollectionDictDatas(long dictCollectionId,
		long[] dictDataIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().setDictCollectionDictDatas(dictCollectionId, dictDataIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
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
	public static org.oep.datamgt.model.DictData addDictData(
		java.lang.String collectionName, java.lang.String dataCode,
		java.lang.String node_1, java.lang.String node_2,
		java.lang.String node_3, java.lang.String node_4,
		java.lang.String node_5, int dataLevel, java.lang.String title,
		java.lang.String description, java.util.Date validatedFrom,
		java.util.Date validatedTo, int status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addDictData(collectionName, dataCode, node_1, node_2,
			node_3, node_4, node_5, dataLevel, title, description,
			validatedFrom, validatedTo, status, serviceContext);
	}

	public static org.oep.datamgt.model.DictData updateDictData(long id,
		java.lang.String collectionName, java.lang.String dataCode,
		java.lang.String node_1, java.lang.String node_2,
		java.lang.String node_3, java.lang.String node_4,
		java.lang.String node_5, int dataLevel, java.lang.String title,
		java.lang.String description, java.util.Date validatedFrom,
		java.util.Date validatedTo, int status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateDictData(id, collectionName, dataCode, node_1,
			node_2, node_3, node_4, node_5, dataLevel, title, description,
			validatedFrom, validatedTo, status, serviceContext);
	}

	public static org.oep.datamgt.model.DictData saveDictData(
		org.oep.datamgt.model.DictData dictData,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().saveDictData(dictData, serviceContext);
	}

	public static void updateDictDataResources(
		org.oep.datamgt.model.DictData dictData,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.updateDictDataResources(dictData, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void removeDictData(org.oep.datamgt.model.DictData dictData)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeDictData(dictData);
	}

	public static void removeDictData(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeDictData(id);
	}

	public static void addDictDataResources(
		org.oep.datamgt.model.DictData dictData, boolean addGroupPermission,
		boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDictDataResources(dictData, addGroupPermission,
			addGuestPermission, serviceContext);
	}

	public static void addDictDataResources(
		org.oep.datamgt.model.DictData dictData,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDictDataResources(dictData, groupPermissions, guestPermissions,
			serviceContext);
	}

	public static void addDictDataResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDictDataResources(id, groupPermissions, guestPermissions,
			serviceContext);
	}

	public static int countDictDataByCollectionName(
		java.lang.String collectionName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countDictDataByCollectionName(collectionName, serviceContext);
	}

	public static java.util.List<org.oep.datamgt.model.DictData> getByCollectionName(
		java.lang.String collectionName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByCollectionName(collectionName, serviceContext);
	}

	public static java.util.List<org.oep.datamgt.model.DictData> getByCollectionName(
		java.lang.String collectionName, int start, int end,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getByCollectionName(collectionName, start, end,
			serviceContext);
	}

	public static int countDictDataByGroupCollectionName(
		java.lang.String collectionName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countDictDataByGroupCollectionName(collectionName,
			serviceContext);
	}

	public static java.util.List<org.oep.datamgt.model.DictData> getByGroupCollectionName(
		java.lang.String collectionName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getByGroupCollectionName(collectionName, serviceContext);
	}

	public static java.util.List<org.oep.datamgt.model.DictData> getByGroupCollectionName(
		java.lang.String collectionName, int start, int end,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getByGroupCollectionName(collectionName, start, end,
			serviceContext);
	}

	public static int countDictDataByCollectionNameDataLevel(
		java.lang.String collectionName, int dataLevel,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countDictDataByCollectionNameDataLevel(collectionName,
			dataLevel, serviceContext);
	}

	public static java.util.List<org.oep.datamgt.model.DictData> getByCollectionNameDataLevel(
		java.lang.String collectionName, int dataLevel,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getByCollectionNameDataLevel(collectionName, dataLevel,
			serviceContext);
	}

	public static java.util.List<org.oep.datamgt.model.DictData> getByCollectionNameDataLevel(
		java.lang.String collectionName, int dataLevel, int start, int end,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getByCollectionNameDataLevel(collectionName, dataLevel,
			start, end, serviceContext);
	}

	public static int countDictDataByGroupCollectionNameDataLevel(
		java.lang.String collectionName, int dataLevel,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countDictDataByGroupCollectionNameDataLevel(collectionName,
			dataLevel, serviceContext);
	}

	public static java.util.List<org.oep.datamgt.model.DictData> getByGroupCollectionNameDataLevel(
		java.lang.String collectionName, int dataLevel,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getByGroupCollectionNameDataLevel(collectionName,
			dataLevel, serviceContext);
	}

	public static java.util.List<org.oep.datamgt.model.DictData> getByGroupCollectionNameDataLevel(
		java.lang.String collectionName, int dataLevel, int start, int end,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getByGroupCollectionNameDataLevel(collectionName,
			dataLevel, start, end, serviceContext);
	}

	public static int countDictDataByByDataLevel(int dataLevel,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countDictDataByByDataLevel(dataLevel, serviceContext);
	}

	public static java.util.List<org.oep.datamgt.model.DictData> getByDataLevel(
		int dataLevel, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByDataLevel(dataLevel, serviceContext);
	}

	public static java.util.List<org.oep.datamgt.model.DictData> getByDataLevel(
		int dataLevel, int start, int end,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByDataLevel(dataLevel, start, end, serviceContext);
	}

	public static int countDictDataByByGroupDataLevel(int dataLevel,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countDictDataByByGroupDataLevel(dataLevel, serviceContext);
	}

	public static java.util.List<org.oep.datamgt.model.DictData> getByGroupDataLevel(
		int dataLevel, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByGroupDataLevel(dataLevel, serviceContext);
	}

	public static java.util.List<org.oep.datamgt.model.DictData> getByGroupDataLevel(
		int dataLevel, int start, int end,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getByGroupDataLevel(dataLevel, start, end, serviceContext);
	}

	public static java.util.List<org.oep.datamgt.model.DictData> findByDataCodeParent(
		java.lang.String dataCode, java.lang.String collectionName,
		java.lang.String dataCodeParent, int datalevel, int status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByDataCodeParent(dataCode, collectionName,
			dataCodeParent, datalevel, status, serviceContext);
	}

	public static java.util.List<org.oep.datamgt.model.DictData> findByGroupDataCodeParent(
		java.lang.String dataCode, java.lang.String collectionName,
		java.lang.String dataCodeParent, int datalevel, int status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByGroupDataCodeParent(dataCode, collectionName,
			dataCodeParent, datalevel, status, serviceContext);
	}

	public static java.util.List<org.oep.datamgt.model.DictData> findByCustomCondition(
		java.lang.String dataCode, java.lang.String collectionName,
		java.lang.String dataCodeParent, int datalevel,
		java.util.Date validatedFrom, java.util.Date validatedTo, int status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByCustomCondition(dataCode, collectionName,
			dataCodeParent, datalevel, validatedFrom, validatedTo, status,
			serviceContext);
	}

	public static java.util.List<org.oep.datamgt.model.DictData> findByGroupCustomCondition(
		java.lang.String dataCode, java.lang.String collectionName,
		java.lang.String dataCodeParent, int datalevel,
		java.util.Date validatedFrom, java.util.Date validatedTo, int status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByGroupCustomCondition(dataCode, collectionName,
			dataCodeParent, datalevel, validatedFrom, validatedTo, status,
			serviceContext);
	}

	public static int countDictDataByDataLevelDataCode(
		java.lang.String dataCode, java.lang.String collectionName,
		java.lang.String dataCodeParent, int datalevel,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countDictDataByDataLevelDataCode(dataCode, collectionName,
			dataCodeParent, datalevel, serviceContext);
	}

	public static java.util.List<org.oep.datamgt.model.DictData> findByDataLevelDataCode(
		java.lang.String dataCode, java.lang.String collectionName,
		java.lang.String dataCodeParent, int datalevel,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByDataLevelDataCode(dataCode, collectionName,
			dataCodeParent, datalevel, serviceContext);
	}

	public static java.util.List<org.oep.datamgt.model.DictData> findByDataLevelDataCode(
		java.lang.String dataCode, java.lang.String collectionName,
		java.lang.String dataCodeParent, int datalevel, int startIndex,
		int endIndex, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByDataLevelDataCode(dataCode, collectionName,
			dataCodeParent, datalevel, startIndex, endIndex, serviceContext);
	}

	public static java.util.List<org.oep.datamgt.model.DictData> getByCollectionNameTree(
		java.lang.String collectionName, int dataLevel,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getByCollectionNameTree(collectionName, dataLevel,
			serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static DictDataLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DictDataLocalService.class.getName());

			if (invokableLocalService instanceof DictDataLocalService) {
				_service = (DictDataLocalService)invokableLocalService;
			}
			else {
				_service = new DictDataLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(DictDataLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DictDataLocalService service) {
	}

	private static DictDataLocalService _service;
}