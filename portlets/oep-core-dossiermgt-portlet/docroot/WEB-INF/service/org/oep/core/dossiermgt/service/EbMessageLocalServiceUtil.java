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

package org.oep.core.dossiermgt.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for EbMessage. This utility wraps
 * {@link org.oep.core.dossiermgt.service.impl.EbMessageLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author trungdk
 * @see EbMessageLocalService
 * @see org.oep.core.dossiermgt.service.base.EbMessageLocalServiceBaseImpl
 * @see org.oep.core.dossiermgt.service.impl.EbMessageLocalServiceImpl
 * @generated
 */
public class EbMessageLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.core.dossiermgt.service.impl.EbMessageLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the eb message to the database. Also notifies the appropriate model listeners.
	*
	* @param ebMessage the eb message
	* @return the eb message that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.EbMessage addEbMessage(
		org.oep.core.dossiermgt.model.EbMessage ebMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addEbMessage(ebMessage);
	}

	/**
	* Creates a new eb message with the primary key. Does not add the eb message to the database.
	*
	* @param ebMessageId the primary key for the new eb message
	* @return the new eb message
	*/
	public static org.oep.core.dossiermgt.model.EbMessage createEbMessage(
		long ebMessageId) {
		return getService().createEbMessage(ebMessageId);
	}

	/**
	* Deletes the eb message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ebMessageId the primary key of the eb message
	* @return the eb message that was removed
	* @throws PortalException if a eb message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.EbMessage deleteEbMessage(
		long ebMessageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteEbMessage(ebMessageId);
	}

	/**
	* Deletes the eb message from the database. Also notifies the appropriate model listeners.
	*
	* @param ebMessage the eb message
	* @return the eb message that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.EbMessage deleteEbMessage(
		org.oep.core.dossiermgt.model.EbMessage ebMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteEbMessage(ebMessage);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.EbMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.EbMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.oep.core.dossiermgt.model.EbMessage fetchEbMessage(
		long ebMessageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchEbMessage(ebMessageId);
	}

	/**
	* Returns the eb message with the primary key.
	*
	* @param ebMessageId the primary key of the eb message
	* @return the eb message
	* @throws PortalException if a eb message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.EbMessage getEbMessage(
		long ebMessageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getEbMessage(ebMessageId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the eb messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.EbMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of eb messages
	* @param end the upper bound of the range of eb messages (not inclusive)
	* @return the range of eb messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.EbMessage> getEbMessages(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEbMessages(start, end);
	}

	/**
	* Returns the number of eb messages.
	*
	* @return the number of eb messages
	* @throws SystemException if a system exception occurred
	*/
	public static int getEbMessagesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEbMessagesCount();
	}

	/**
	* Updates the eb message in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ebMessage the eb message
	* @return the eb message that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.EbMessage updateEbMessage(
		org.oep.core.dossiermgt.model.EbMessage ebMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateEbMessage(ebMessage);
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
	* Add eb message
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Create new
	*
	* @param
	* @return: new eb message
	*/
	public static org.oep.core.dossiermgt.model.EbMessage addEbMessage(
		java.lang.String messageId, java.lang.String cpaId,
		java.lang.String service, java.lang.String action,
		java.lang.String conversationId, java.lang.String fromPartyId,
		java.lang.String fromPartyType, java.lang.String toPartyId,
		java.lang.String toPartyType, java.lang.String refToMessageId,
		java.lang.String status, java.lang.String statusDescription,
		java.lang.String ackMessageId, java.lang.String ackStatus,
		java.lang.String ackStatusDescription,
		java.lang.String messageDescription, int inbound,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addEbMessage(messageId, cpaId, service, action,
			conversationId, fromPartyId, fromPartyType, toPartyId, toPartyType,
			refToMessageId, status, statusDescription, ackMessageId, ackStatus,
			ackStatusDescription, messageDescription, inbound, serviceContext);
	}

	public static org.oep.core.dossiermgt.model.EbMessage updateEbMessage(
		long id, java.lang.String messageId, java.lang.String cpaId,
		java.lang.String service, java.lang.String action,
		java.lang.String conversationId, java.lang.String fromPartyId,
		java.lang.String fromPartyType, java.lang.String toPartyId,
		java.lang.String toPartyType, java.lang.String refToMessageId,
		java.lang.String status, java.lang.String statusDescription,
		java.lang.String ackMessageId, java.lang.String ackStatus,
		java.lang.String ackStatusDescription,
		java.lang.String messageDescription, int inbound,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateEbMessage(id, messageId, cpaId, service, action,
			conversationId, fromPartyId, fromPartyType, toPartyId, toPartyType,
			refToMessageId, status, statusDescription, ackMessageId, ackStatus,
			ackStatusDescription, messageDescription, inbound, serviceContext);
	}

	public static void updateEbMessageResources(
		org.oep.core.dossiermgt.model.EbMessage ebMessage,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.updateEbMessageResources(ebMessage, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void removeEbMessage(
		org.oep.core.dossiermgt.model.EbMessage ebMessage)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeEbMessage(ebMessage);
	}

	public static void removeEbMessage(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeEbMessage(id);
	}

	public static void addEbMessageResources(
		org.oep.core.dossiermgt.model.EbMessage ebMessage,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addEbMessageResources(ebMessage, addGroupPermission,
			addGuestPermission, serviceContext);
	}

	public static void addEbMessageResources(
		org.oep.core.dossiermgt.model.EbMessage ebMessage,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addEbMessageResources(ebMessage, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void addEbMessageResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addEbMessageResources(id, groupPermissions, guestPermissions,
			serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static EbMessageLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					EbMessageLocalService.class.getName());

			if (invokableLocalService instanceof EbMessageLocalService) {
				_service = (EbMessageLocalService)invokableLocalService;
			}
			else {
				_service = new EbMessageLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(EbMessageLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(EbMessageLocalService service) {
	}

	private static EbMessageLocalService _service;
}