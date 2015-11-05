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
 * Provides the local service utility for DictMetaData. This utility wraps
 * {@link org.oep.datamgt.service.impl.DictMetaDataLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author NQMINH
 * @see DictMetaDataLocalService
 * @see org.oep.datamgt.service.base.DictMetaDataLocalServiceBaseImpl
 * @see org.oep.datamgt.service.impl.DictMetaDataLocalServiceImpl
 * @generated
 */
public class DictMetaDataLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.datamgt.service.impl.DictMetaDataLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dictionary meta data to the database. Also notifies the appropriate model listeners.
	*
	* @param dictMetaData the dictionary meta data
	* @return the dictionary meta data that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictMetaData addDictMetaData(
		org.oep.datamgt.model.DictMetaData dictMetaData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDictMetaData(dictMetaData);
	}

	/**
	* Creates a new dictionary meta data with the primary key. Does not add the dictionary meta data to the database.
	*
	* @param dictMetaDataId the primary key for the new dictionary meta data
	* @return the new dictionary meta data
	*/
	public static org.oep.datamgt.model.DictMetaData createDictMetaData(
		long dictMetaDataId) {
		return getService().createDictMetaData(dictMetaDataId);
	}

	/**
	* Deletes the dictionary meta data with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dictMetaDataId the primary key of the dictionary meta data
	* @return the dictionary meta data that was removed
	* @throws PortalException if a dictionary meta data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictMetaData deleteDictMetaData(
		long dictMetaDataId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDictMetaData(dictMetaDataId);
	}

	/**
	* Deletes the dictionary meta data from the database. Also notifies the appropriate model listeners.
	*
	* @param dictMetaData the dictionary meta data
	* @return the dictionary meta data that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictMetaData deleteDictMetaData(
		org.oep.datamgt.model.DictMetaData dictMetaData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDictMetaData(dictMetaData);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictMetaDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictMetaDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.oep.datamgt.model.DictMetaData fetchDictMetaData(
		long dictMetaDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDictMetaData(dictMetaDataId);
	}

	/**
	* Returns the dictionary meta data with the primary key.
	*
	* @param dictMetaDataId the primary key of the dictionary meta data
	* @return the dictionary meta data
	* @throws PortalException if a dictionary meta data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictMetaData getDictMetaData(
		long dictMetaDataId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDictMetaData(dictMetaDataId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dictionary meta datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictMetaDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dictionary meta datas
	* @param end the upper bound of the range of dictionary meta datas (not inclusive)
	* @return the range of dictionary meta datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictMetaData> getDictMetaDatas(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDictMetaDatas(start, end);
	}

	/**
	* Returns the number of dictionary meta datas.
	*
	* @return the number of dictionary meta datas
	* @throws SystemException if a system exception occurred
	*/
	public static int getDictMetaDatasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDictMetaDatasCount();
	}

	/**
	* Updates the dictionary meta data in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dictMetaData the dictionary meta data
	* @return the dictionary meta data that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictMetaData updateDictMetaData(
		org.oep.datamgt.model.DictMetaData dictMetaData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDictMetaData(dictMetaData);
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

	public static org.oep.datamgt.model.DictMetaData addDictMetaData(
		long dictDataId, java.lang.String attributeName,
		java.lang.String attributeValue,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addDictMetaData(dictDataId, attributeName, attributeValue,
			serviceContext);
	}

	public static org.oep.datamgt.model.DictMetaData updateDictMetaData(
		long id, long dictDataId, java.lang.String attributeName,
		java.lang.String attributeValue,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateDictMetaData(id, dictDataId, attributeName,
			attributeValue, serviceContext);
	}

	public static org.oep.datamgt.model.DictMetaData saveDictMetaData(
		org.oep.datamgt.model.DictMetaData dictMetaData,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().saveDictMetaData(dictMetaData, serviceContext);
	}

	public static void updateDictMetaDataResources(
		org.oep.datamgt.model.DictMetaData dictMetaData,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.updateDictMetaDataResources(dictMetaData, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void removeDictMetaData(
		org.oep.datamgt.model.DictMetaData dictMetaData)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeDictMetaData(dictMetaData);
	}

	public static void removeDictMetaData(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeDictMetaData(id);
	}

	public static void addDictMetaDataResources(
		org.oep.datamgt.model.DictMetaData dictMetaData,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDictMetaDataResources(dictMetaData, addGroupPermission,
			addGuestPermission, serviceContext);
	}

	public static void addDictMetaDataResources(
		org.oep.datamgt.model.DictMetaData dictMetaData,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDictMetaDataResources(dictMetaData, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void addDictMetaDataResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDictMetaDataResources(id, groupPermissions, guestPermissions,
			serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static DictMetaDataLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DictMetaDataLocalService.class.getName());

			if (invokableLocalService instanceof DictMetaDataLocalService) {
				_service = (DictMetaDataLocalService)invokableLocalService;
			}
			else {
				_service = new DictMetaDataLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(DictMetaDataLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DictMetaDataLocalService service) {
	}

	private static DictMetaDataLocalService _service;
}