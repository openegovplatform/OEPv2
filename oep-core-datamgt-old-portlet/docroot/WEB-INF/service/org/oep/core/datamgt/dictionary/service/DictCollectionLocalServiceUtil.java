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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for DictCollection. This utility wraps
 * {@link org.oep.core.datamgt.dictionary.service.impl.DictCollectionLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author TrungDK
 * @see DictCollectionLocalService
 * @see org.oep.core.datamgt.dictionary.service.base.DictCollectionLocalServiceBaseImpl
 * @see org.oep.core.datamgt.dictionary.service.impl.DictCollectionLocalServiceImpl
 * @generated
 */
public class DictCollectionLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.core.datamgt.dictionary.service.impl.DictCollectionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dictionary collection to the database. Also notifies the appropriate model listeners.
	*
	* @param dictCollection the dictionary collection
	* @return the dictionary collection that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.dictionary.model.DictCollection addDictCollection(
		org.oep.core.datamgt.dictionary.model.DictCollection dictCollection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDictCollection(dictCollection);
	}

	/**
	* Creates a new dictionary collection with the primary key. Does not add the dictionary collection to the database.
	*
	* @param dictCollectionId the primary key for the new dictionary collection
	* @return the new dictionary collection
	*/
	public static org.oep.core.datamgt.dictionary.model.DictCollection createDictCollection(
		long dictCollectionId) {
		return getService().createDictCollection(dictCollectionId);
	}

	/**
	* Deletes the dictionary collection with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dictCollectionId the primary key of the dictionary collection
	* @return the dictionary collection that was removed
	* @throws PortalException if a dictionary collection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.dictionary.model.DictCollection deleteDictCollection(
		long dictCollectionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDictCollection(dictCollectionId);
	}

	/**
	* Deletes the dictionary collection from the database. Also notifies the appropriate model listeners.
	*
	* @param dictCollection the dictionary collection
	* @return the dictionary collection that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.dictionary.model.DictCollection deleteDictCollection(
		org.oep.core.datamgt.dictionary.model.DictCollection dictCollection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDictCollection(dictCollection);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.oep.core.datamgt.dictionary.model.DictCollection fetchDictCollection(
		long dictCollectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDictCollection(dictCollectionId);
	}

	/**
	* Returns the dictionary collection with the primary key.
	*
	* @param dictCollectionId the primary key of the dictionary collection
	* @return the dictionary collection
	* @throws PortalException if a dictionary collection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.dictionary.model.DictCollection getDictCollection(
		long dictCollectionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDictCollection(dictCollectionId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<org.oep.core.datamgt.dictionary.model.DictCollection> getDictCollections(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDictCollections(start, end);
	}

	/**
	* Returns the number of dictionary collections.
	*
	* @return the number of dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static int getDictCollectionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDictCollectionsCount();
	}

	/**
	* Updates the dictionary collection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dictCollection the dictionary collection
	* @return the dictionary collection that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.dictionary.model.DictCollection updateDictCollection(
		org.oep.core.datamgt.dictionary.model.DictCollection dictCollection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDictCollection(dictCollection);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addDictDataDictCollection(long dictDataId,
		long dictCollectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addDictDataDictCollection(dictDataId, dictCollectionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addDictDataDictCollection(long dictDataId,
		org.oep.core.datamgt.dictionary.model.DictCollection dictCollection)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addDictDataDictCollection(dictDataId, dictCollection);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addDictDataDictCollections(long dictDataId,
		long[] dictCollectionIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addDictDataDictCollections(dictDataId, dictCollectionIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addDictDataDictCollections(long dictDataId,
		java.util.List<org.oep.core.datamgt.dictionary.model.DictCollection> DictCollections)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addDictDataDictCollections(dictDataId, DictCollections);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearDictDataDictCollections(long dictDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearDictDataDictCollections(dictDataId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDictDataDictCollection(long dictDataId,
		long dictCollectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDictDataDictCollection(dictDataId, dictCollectionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDictDataDictCollection(long dictDataId,
		org.oep.core.datamgt.dictionary.model.DictCollection dictCollection)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDictDataDictCollection(dictDataId, dictCollection);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDictDataDictCollections(long dictDataId,
		long[] dictCollectionIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDictDataDictCollections(dictDataId, dictCollectionIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDictDataDictCollections(long dictDataId,
		java.util.List<org.oep.core.datamgt.dictionary.model.DictCollection> DictCollections)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDictDataDictCollections(dictDataId, DictCollections);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.dictionary.model.DictCollection> getDictDataDictCollections(
		long dictDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDictDataDictCollections(dictDataId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.dictionary.model.DictCollection> getDictDataDictCollections(
		long dictDataId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDictDataDictCollections(dictDataId, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.dictionary.model.DictCollection> getDictDataDictCollections(
		long dictDataId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getDictDataDictCollections(dictDataId, start, end,
			orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getDictDataDictCollectionsCount(long dictDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDictDataDictCollectionsCount(dictDataId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasDictDataDictCollection(long dictDataId,
		long dictCollectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .hasDictDataDictCollection(dictDataId, dictCollectionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasDictDataDictCollections(long dictDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasDictDataDictCollections(dictDataId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setDictDataDictCollections(long dictDataId,
		long[] dictCollectionIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().setDictDataDictCollections(dictDataId, dictCollectionIds);
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
	public static org.oep.core.datamgt.dictionary.model.DictCollection addDictCollection(
		java.lang.String name, java.lang.String version,
		java.lang.String title, java.util.Date validatedFrom,
		java.util.Date validatedTo, int status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addDictCollection(name, version, title, validatedFrom,
			validatedTo, status, serviceContext);
	}

	public static org.oep.core.datamgt.dictionary.model.DictCollection updateDictCollection(
		long id, java.lang.String name, java.lang.String version,
		java.lang.String title, java.util.Date validatedFrom,
		java.util.Date validatedTo, int status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateDictCollection(id, name, version, title,
			validatedFrom, validatedTo, status, serviceContext);
	}

	public static void updateDictCollectionResources(
		org.oep.core.datamgt.dictionary.model.DictCollection dictCollection,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.updateDictCollectionResources(dictCollection, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void removeDictCollection(
		org.oep.core.datamgt.dictionary.model.DictCollection dictCollection)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeDictCollection(dictCollection);
	}

	public static void removeDictCollection(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeDictCollection(id);
	}

	public static void addDictCollectionResources(
		org.oep.core.datamgt.dictionary.model.DictCollection dictCollection,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDictCollectionResources(dictCollection, addGroupPermission,
			addGuestPermission, serviceContext);
	}

	public static void addDictCollectionResources(
		org.oep.core.datamgt.dictionary.model.DictCollection dictCollection,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDictCollectionResources(dictCollection, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void addDictCollectionResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDictCollectionResources(id, groupPermissions, guestPermissions,
			serviceContext);
	}

	public static org.oep.core.datamgt.dictionary.model.DictCollection getDictCollectionByName(
		java.lang.String collectionName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getDictCollectionByName(collectionName, serviceContext);
	}

	public static java.util.Collection<org.oep.core.datamgt.dictionary.model.DictCollection> getAllDictCollectionsByName(
		java.lang.String collectionName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getAllDictCollectionsByName(collectionName, serviceContext);
	}

	public static java.util.List<java.lang.String> getAllDictCollectionNames(
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAllDictCollectionNames(serviceContext);
	}

	public static java.util.List<java.lang.String> getAllDictCollectionNames(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAllDictCollectionNames(companyId);
	}

	public static int countDictCollectionByC_LikeN(java.lang.String name,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countDictCollectionByC_LikeN(name, serviceContext);
	}

	public static java.util.Collection<org.oep.core.datamgt.dictionary.model.DictCollection> getByLikeName(
		java.lang.String name,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getByLikeName(name, serviceContext);
	}

	public static java.util.Collection<org.oep.core.datamgt.dictionary.model.DictCollection> getByLikeName(
		java.lang.String name, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getByLikeName(name, startIndex, endIndex, serviceContext);
	}

	public static java.util.List<org.oep.core.datamgt.dictionary.model.DictCollection> findByLikeName(
		java.lang.String name, int start, int end,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByLikeName(name, start, end, serviceContext);
	}

	public static int countLikeByName(java.lang.String name,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countLikeByName(name, serviceContext);
	}

	public static java.util.List<org.oep.core.datamgt.dictionary.model.DictCollection> findByCustomCondition(
		java.lang.String name, java.lang.String version,
		java.util.Date validatedFrom, java.util.Date validatedTo, int status,
		int start, int end,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByCustomCondition(name, version, validatedFrom,
			validatedTo, status, start, end, serviceContext);
	}

	public static int countByCustomCondition(java.lang.String name,
		java.lang.String version, java.util.Date validatedFrom,
		java.util.Date validatedTo, int status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countByCustomCondition(name, version, validatedFrom,
			validatedTo, status, serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static DictCollectionLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DictCollectionLocalService.class.getName());

			if (invokableLocalService instanceof DictCollectionLocalService) {
				_service = (DictCollectionLocalService)invokableLocalService;
			}
			else {
				_service = new DictCollectionLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(DictCollectionLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DictCollectionLocalService service) {
	}

	private static DictCollectionLocalService _service;
}