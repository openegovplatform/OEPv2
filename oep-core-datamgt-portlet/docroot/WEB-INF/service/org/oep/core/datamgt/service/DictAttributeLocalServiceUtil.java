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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for DictAttribute. This utility wraps
 * {@link org.oep.core.datamgt.service.impl.DictAttributeLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author NQMINH
 * @see DictAttributeLocalService
 * @see org.oep.core.datamgt.service.base.DictAttributeLocalServiceBaseImpl
 * @see org.oep.core.datamgt.service.impl.DictAttributeLocalServiceImpl
 * @generated
 */
public class DictAttributeLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.core.datamgt.service.impl.DictAttributeLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dictionary attribute to the database. Also notifies the appropriate model listeners.
	*
	* @param dictAttribute the dictionary attribute
	* @return the dictionary attribute that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictAttribute addDictAttribute(
		org.oep.core.datamgt.model.DictAttribute dictAttribute)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDictAttribute(dictAttribute);
	}

	/**
	* Creates a new dictionary attribute with the primary key. Does not add the dictionary attribute to the database.
	*
	* @param dictAttributeId the primary key for the new dictionary attribute
	* @return the new dictionary attribute
	*/
	public static org.oep.core.datamgt.model.DictAttribute createDictAttribute(
		long dictAttributeId) {
		return getService().createDictAttribute(dictAttributeId);
	}

	/**
	* Deletes the dictionary attribute with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dictAttributeId the primary key of the dictionary attribute
	* @return the dictionary attribute that was removed
	* @throws PortalException if a dictionary attribute with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictAttribute deleteDictAttribute(
		long dictAttributeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDictAttribute(dictAttributeId);
	}

	/**
	* Deletes the dictionary attribute from the database. Also notifies the appropriate model listeners.
	*
	* @param dictAttribute the dictionary attribute
	* @return the dictionary attribute that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictAttribute deleteDictAttribute(
		org.oep.core.datamgt.model.DictAttribute dictAttribute)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDictAttribute(dictAttribute);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.oep.core.datamgt.model.DictAttribute fetchDictAttribute(
		long dictAttributeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDictAttribute(dictAttributeId);
	}

	/**
	* Returns the dictionary attribute with the primary key.
	*
	* @param dictAttributeId the primary key of the dictionary attribute
	* @return the dictionary attribute
	* @throws PortalException if a dictionary attribute with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictAttribute getDictAttribute(
		long dictAttributeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDictAttribute(dictAttributeId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<org.oep.core.datamgt.model.DictAttribute> getDictAttributes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDictAttributes(start, end);
	}

	/**
	* Returns the number of dictionary attributes.
	*
	* @return the number of dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static int getDictAttributesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDictAttributesCount();
	}

	/**
	* Updates the dictionary attribute in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dictAttribute the dictionary attribute
	* @return the dictionary attribute that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictAttribute updateDictAttribute(
		org.oep.core.datamgt.model.DictAttribute dictAttribute)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDictAttribute(dictAttribute);
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

	public static org.oep.core.datamgt.model.DictAttribute addDictAttribute(
		java.lang.String collectionName, java.lang.String name,
		java.lang.String title, java.lang.String dataType,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addDictAttribute(collectionName, name, title, dataType,
			serviceContext);
	}

	public static org.oep.core.datamgt.model.DictAttribute updateDictAttribute(
		long id, java.lang.String collectionName, java.lang.String name,
		java.lang.String title, java.lang.String dataType,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateDictAttribute(id, collectionName, name, title,
			dataType, serviceContext);
	}

	public static org.oep.core.datamgt.model.DictAttribute saveDictAttribute(
		org.oep.core.datamgt.model.DictAttribute dictAttribute,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().saveDictAttribute(dictAttribute, serviceContext);
	}

	public static void updateDictAttributeResources(
		org.oep.core.datamgt.model.DictAttribute dictAttribute,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.updateDictAttributeResources(dictAttribute, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void removeDictAttribute(
		org.oep.core.datamgt.model.DictAttribute dictAttribute)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeDictAttribute(dictAttribute);
	}

	public static void removeDictAttribute(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeDictAttribute(id);
	}

	public static void addDictAttributeResources(
		org.oep.core.datamgt.model.DictAttribute dictAttribute,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDictAttributeResources(dictAttribute, addGroupPermission,
			addGuestPermission, serviceContext);
	}

	public static void addDictAttributeResources(
		org.oep.core.datamgt.model.DictAttribute dictAttribute,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDictAttributeResources(dictAttribute, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void addDictAttributeResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDictAttributeResources(id, groupPermissions, guestPermissions,
			serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static DictAttributeLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DictAttributeLocalService.class.getName());

			if (invokableLocalService instanceof DictAttributeLocalService) {
				_service = (DictAttributeLocalService)invokableLocalService;
			}
			else {
				_service = new DictAttributeLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(DictAttributeLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DictAttributeLocalService service) {
	}

	private static DictAttributeLocalService _service;
}