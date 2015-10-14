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

package org.oep.core.processmgt.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for ProcessOrder. This utility wraps
 * {@link org.oep.core.processmgt.service.impl.ProcessOrderLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author trungdk
 * @see ProcessOrderLocalService
 * @see org.oep.core.processmgt.service.base.ProcessOrderLocalServiceBaseImpl
 * @see org.oep.core.processmgt.service.impl.ProcessOrderLocalServiceImpl
 * @generated
 */
public class ProcessOrderLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.core.processmgt.service.impl.ProcessOrderLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the process order to the database. Also notifies the appropriate model listeners.
	*
	* @param processOrder the process order
	* @return the process order that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.ProcessOrder addProcessOrder(
		org.oep.core.processmgt.model.ProcessOrder processOrder)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addProcessOrder(processOrder);
	}

	/**
	* Creates a new process order with the primary key. Does not add the process order to the database.
	*
	* @param processOrderId the primary key for the new process order
	* @return the new process order
	*/
	public static org.oep.core.processmgt.model.ProcessOrder createProcessOrder(
		long processOrderId) {
		return getService().createProcessOrder(processOrderId);
	}

	/**
	* Deletes the process order with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param processOrderId the primary key of the process order
	* @return the process order that was removed
	* @throws PortalException if a process order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.ProcessOrder deleteProcessOrder(
		long processOrderId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteProcessOrder(processOrderId);
	}

	/**
	* Deletes the process order from the database. Also notifies the appropriate model listeners.
	*
	* @param processOrder the process order
	* @return the process order that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.ProcessOrder deleteProcessOrder(
		org.oep.core.processmgt.model.ProcessOrder processOrder)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteProcessOrder(processOrder);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.oep.core.processmgt.model.ProcessOrder fetchProcessOrder(
		long processOrderId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchProcessOrder(processOrderId);
	}

	/**
	* Returns the process order with the matching UUID and company.
	*
	* @param uuid the process order's UUID
	* @param companyId the primary key of the company
	* @return the matching process order, or <code>null</code> if a matching process order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.ProcessOrder fetchProcessOrderByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchProcessOrderByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the process order matching the UUID and group.
	*
	* @param uuid the process order's UUID
	* @param groupId the primary key of the group
	* @return the matching process order, or <code>null</code> if a matching process order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.ProcessOrder fetchProcessOrderByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchProcessOrderByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the process order with the primary key.
	*
	* @param processOrderId the primary key of the process order
	* @return the process order
	* @throws PortalException if a process order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.ProcessOrder getProcessOrder(
		long processOrderId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getProcessOrder(processOrderId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the process order with the matching UUID and company.
	*
	* @param uuid the process order's UUID
	* @param companyId the primary key of the company
	* @return the matching process order
	* @throws PortalException if a matching process order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.ProcessOrder getProcessOrderByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getProcessOrderByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the process order matching the UUID and group.
	*
	* @param uuid the process order's UUID
	* @param groupId the primary key of the group
	* @return the matching process order
	* @throws PortalException if a matching process order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.ProcessOrder getProcessOrderByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getProcessOrderByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the process orders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of process orders
	* @param end the upper bound of the range of process orders (not inclusive)
	* @return the range of process orders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.processmgt.model.ProcessOrder> getProcessOrders(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getProcessOrders(start, end);
	}

	/**
	* Returns the number of process orders.
	*
	* @return the number of process orders
	* @throws SystemException if a system exception occurred
	*/
	public static int getProcessOrdersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getProcessOrdersCount();
	}

	/**
	* Updates the process order in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param processOrder the process order
	* @return the process order that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.ProcessOrder updateProcessOrder(
		org.oep.core.processmgt.model.ProcessOrder processOrder)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateProcessOrder(processOrder);
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
	* Add process order
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Create new
	*
	* @param
	* @return: new process order
	*/
	public static org.oep.core.processmgt.model.ProcessOrder addProcessOrder(
		long organizationId, long parentProcessOrderId, long dossierId,
		long dossierProcessId, long dossierStepId,
		java.lang.String orderStatus, java.lang.String orderResume,
		java.util.Date stepDate, java.lang.String stepNote,
		long assignToUserId, java.lang.String currentCondition,
		long lastStepTransitionId, int stopRollback,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addProcessOrder(organizationId, parentProcessOrderId,
			dossierId, dossierProcessId, dossierStepId, orderStatus,
			orderResume, stepDate, stepNote, assignToUserId, currentCondition,
			lastStepTransitionId, stopRollback, serviceContext);
	}

	public static org.oep.core.processmgt.model.ProcessOrder updateProcessOrder(
		long id, long organizationId, long parentProcessOrderId,
		long dossierId, long dossierProcessId, long dossierStepId,
		java.lang.String orderStatus, java.lang.String orderResume,
		java.util.Date stepDate, java.lang.String stepNote,
		long assignToUserId, java.lang.String currentCondition,
		long lastStepTransitionId, int stopRollback,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateProcessOrder(id, organizationId,
			parentProcessOrderId, dossierId, dossierProcessId, dossierStepId,
			orderStatus, orderResume, stepDate, stepNote, assignToUserId,
			currentCondition, lastStepTransitionId, stopRollback, serviceContext);
	}

	public static void updateProcessOrderResources(
		org.oep.core.processmgt.model.ProcessOrder processOrder,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.updateProcessOrderResources(processOrder, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void removeProcessOrder(
		org.oep.core.processmgt.model.ProcessOrder processOrder)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeProcessOrder(processOrder);
	}

	public static void removeProcessOrder(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeProcessOrder(id);
	}

	public static void addProcessOrderResources(
		org.oep.core.processmgt.model.ProcessOrder processOrder,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addProcessOrderResources(processOrder, addGroupPermission,
			addGuestPermission, serviceContext);
	}

	public static void addProcessOrderResources(
		org.oep.core.processmgt.model.ProcessOrder processOrder,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addProcessOrderResources(processOrder, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void addProcessOrderResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addProcessOrderResources(id, groupPermissions, guestPermissions,
			serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static ProcessOrderLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ProcessOrderLocalService.class.getName());

			if (invokableLocalService instanceof ProcessOrderLocalService) {
				_service = (ProcessOrderLocalService)invokableLocalService;
			}
			else {
				_service = new ProcessOrderLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(ProcessOrderLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(ProcessOrderLocalService service) {
	}

	private static ProcessOrderLocalService _service;
}