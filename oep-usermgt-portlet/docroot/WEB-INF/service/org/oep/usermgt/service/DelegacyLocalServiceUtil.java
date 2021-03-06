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

package org.oep.usermgt.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Delegacy. This utility wraps
 * {@link org.oep.usermgt.service.impl.DelegacyLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author NQMINH
 * @see DelegacyLocalService
 * @see org.oep.usermgt.service.base.DelegacyLocalServiceBaseImpl
 * @see org.oep.usermgt.service.impl.DelegacyLocalServiceImpl
 * @generated
 */
public class DelegacyLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.usermgt.service.impl.DelegacyLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the delegacy to the database. Also notifies the appropriate model listeners.
	*
	* @param delegacy the delegacy
	* @return the delegacy that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Delegacy addDelegacy(
		org.oep.usermgt.model.Delegacy delegacy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDelegacy(delegacy);
	}

	/**
	* Creates a new delegacy with the primary key. Does not add the delegacy to the database.
	*
	* @param delegacyId the primary key for the new delegacy
	* @return the new delegacy
	*/
	public static org.oep.usermgt.model.Delegacy createDelegacy(long delegacyId) {
		return getService().createDelegacy(delegacyId);
	}

	/**
	* Deletes the delegacy with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param delegacyId the primary key of the delegacy
	* @return the delegacy that was removed
	* @throws PortalException if a delegacy with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Delegacy deleteDelegacy(long delegacyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDelegacy(delegacyId);
	}

	/**
	* Deletes the delegacy from the database. Also notifies the appropriate model listeners.
	*
	* @param delegacy the delegacy
	* @return the delegacy that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Delegacy deleteDelegacy(
		org.oep.usermgt.model.Delegacy delegacy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDelegacy(delegacy);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.DelegacyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.DelegacyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.oep.usermgt.model.Delegacy fetchDelegacy(long delegacyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDelegacy(delegacyId);
	}

	/**
	* Returns the delegacy with the primary key.
	*
	* @param delegacyId the primary key of the delegacy
	* @return the delegacy
	* @throws PortalException if a delegacy with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Delegacy getDelegacy(long delegacyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDelegacy(delegacyId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the delegacies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.DelegacyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of delegacies
	* @param end the upper bound of the range of delegacies (not inclusive)
	* @return the range of delegacies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.Delegacy> getDelegacies(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDelegacies(start, end);
	}

	/**
	* Returns the number of delegacies.
	*
	* @return the number of delegacies
	* @throws SystemException if a system exception occurred
	*/
	public static int getDelegaciesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDelegaciesCount();
	}

	/**
	* Updates the delegacy in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param delegacy the delegacy
	* @return the delegacy that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.Delegacy updateDelegacy(
		org.oep.usermgt.model.Delegacy delegacy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDelegacy(delegacy);
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

	public static org.oep.usermgt.model.Delegacy addDelegacy(
		long fromEmployeeId, long toEmployeeId, long roleId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addDelegacy(fromEmployeeId, toEmployeeId, roleId,
			serviceContext);
	}

	public static org.oep.usermgt.model.Delegacy updateDelegacy(
		long delegacyId, long fromEmployeeId, long toEmployeeId, long roleId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateDelegacy(delegacyId, fromEmployeeId, toEmployeeId,
			roleId, serviceContext);
	}

	public static org.oep.usermgt.model.Delegacy saveDelegacy(
		org.oep.usermgt.model.Delegacy delegacy,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().saveDelegacy(delegacy, serviceContext);
	}

	public static void updateDelegacyResources(
		org.oep.usermgt.model.Delegacy delegacy,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.updateDelegacyResources(delegacy, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void removeDelegacy(org.oep.usermgt.model.Delegacy delegacy)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeDelegacy(delegacy);
	}

	public static void removeDelegacy(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeDelegacy(id);
	}

	public static void addDelegacyResources(
		org.oep.usermgt.model.Delegacy delegacy, boolean addGroupPermission,
		boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDelegacyResources(delegacy, addGroupPermission,
			addGuestPermission, serviceContext);
	}

	public static void addDelegacyResources(
		org.oep.usermgt.model.Delegacy delegacy,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDelegacyResources(delegacy, groupPermissions, guestPermissions,
			serviceContext);
	}

	public static void addDelegacyResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDelegacyResources(id, groupPermissions, guestPermissions,
			serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static DelegacyLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DelegacyLocalService.class.getName());

			if (invokableLocalService instanceof DelegacyLocalService) {
				_service = (DelegacyLocalService)invokableLocalService;
			}
			else {
				_service = new DelegacyLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(DelegacyLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DelegacyLocalService service) {
	}

	private static DelegacyLocalService _service;
}