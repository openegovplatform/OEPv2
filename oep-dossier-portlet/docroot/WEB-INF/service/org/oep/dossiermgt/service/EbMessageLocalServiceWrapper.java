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

package org.oep.dossiermgt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EbMessageLocalService}.
 *
 * @author trungdk
 * @see EbMessageLocalService
 * @generated
 */
public class EbMessageLocalServiceWrapper implements EbMessageLocalService,
	ServiceWrapper<EbMessageLocalService> {
	public EbMessageLocalServiceWrapper(
		EbMessageLocalService ebMessageLocalService) {
		_ebMessageLocalService = ebMessageLocalService;
	}

	/**
	* Adds the eb message to the database. Also notifies the appropriate model listeners.
	*
	* @param ebMessage the eb message
	* @return the eb message that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.dossiermgt.model.EbMessage addEbMessage(
		org.oep.dossiermgt.model.EbMessage ebMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ebMessageLocalService.addEbMessage(ebMessage);
	}

	/**
	* Creates a new eb message with the primary key. Does not add the eb message to the database.
	*
	* @param ebMessageId the primary key for the new eb message
	* @return the new eb message
	*/
	@Override
	public org.oep.dossiermgt.model.EbMessage createEbMessage(long ebMessageId) {
		return _ebMessageLocalService.createEbMessage(ebMessageId);
	}

	/**
	* Deletes the eb message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ebMessageId the primary key of the eb message
	* @return the eb message that was removed
	* @throws PortalException if a eb message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.dossiermgt.model.EbMessage deleteEbMessage(long ebMessageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _ebMessageLocalService.deleteEbMessage(ebMessageId);
	}

	/**
	* Deletes the eb message from the database. Also notifies the appropriate model listeners.
	*
	* @param ebMessage the eb message
	* @return the eb message that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.dossiermgt.model.EbMessage deleteEbMessage(
		org.oep.dossiermgt.model.EbMessage ebMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ebMessageLocalService.deleteEbMessage(ebMessage);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ebMessageLocalService.dynamicQuery();
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
		return _ebMessageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.EbMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _ebMessageLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.EbMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _ebMessageLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _ebMessageLocalService.dynamicQueryCount(dynamicQuery);
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
		return _ebMessageLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public org.oep.dossiermgt.model.EbMessage fetchEbMessage(long ebMessageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ebMessageLocalService.fetchEbMessage(ebMessageId);
	}

	/**
	* Returns the eb message with the primary key.
	*
	* @param ebMessageId the primary key of the eb message
	* @return the eb message
	* @throws PortalException if a eb message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.dossiermgt.model.EbMessage getEbMessage(long ebMessageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _ebMessageLocalService.getEbMessage(ebMessageId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _ebMessageLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the eb messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.EbMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of eb messages
	* @param end the upper bound of the range of eb messages (not inclusive)
	* @return the range of eb messages
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.dossiermgt.model.EbMessage> getEbMessages(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ebMessageLocalService.getEbMessages(start, end);
	}

	/**
	* Returns the number of eb messages.
	*
	* @return the number of eb messages
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getEbMessagesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ebMessageLocalService.getEbMessagesCount();
	}

	/**
	* Updates the eb message in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ebMessage the eb message
	* @return the eb message that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.dossiermgt.model.EbMessage updateEbMessage(
		org.oep.dossiermgt.model.EbMessage ebMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ebMessageLocalService.updateEbMessage(ebMessage);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _ebMessageLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_ebMessageLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _ebMessageLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* ThÃƒÂªm thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p ebXML
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param messageId mÃƒÂ£ Ã„â€˜Ã¡Â»â€¹nh danh thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param cpaId
	* @param service
	* @param action
	* @param conversationId
	* @param fromPartyId
	* @param fromPartyType
	* @param toPartyId
	* @param toPartyType
	* @param refToMessageId
	* @param status
	* @param statusDescription
	* @param ackMessageId
	* @param ackStatusDescription
	* @param messageDescription
	* @param inbound
	* @return: thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c tÃ¡ÂºÂ¡o
	*/
	@Override
	public org.oep.dossiermgt.model.EbMessage addEbMessage(
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
		return _ebMessageLocalService.addEbMessage(messageId, cpaId, service,
			action, conversationId, fromPartyId, fromPartyType, toPartyId,
			toPartyType, refToMessageId, status, statusDescription,
			ackMessageId, ackStatus, ackStatusDescription, messageDescription,
			inbound, serviceContext);
	}

	/**
	* CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p ebXML
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param id mÃƒÂ£ thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param messageId mÃƒÂ£ Ã„â€˜Ã¡Â»â€¹nh danh thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param cpaId
	* @param service
	* @param action
	* @param conversationId
	* @param fromPartyId
	* @param fromPartyType
	* @param toPartyId
	* @param toPartyType
	* @param refToMessageId
	* @param status
	* @param statusDescription
	* @param ackMessageId
	* @param ackStatusDescription
	* @param messageDescription
	* @param inbound
	* @return: thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t
	*/
	@Override
	public org.oep.dossiermgt.model.EbMessage updateEbMessage(long id,
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
		return _ebMessageLocalService.updateEbMessage(id, messageId, cpaId,
			service, action, conversationId, fromPartyId, fromPartyType,
			toPartyId, toPartyType, refToMessageId, status, statusDescription,
			ackMessageId, ackStatus, ackStatusDescription, messageDescription,
			inbound, serviceContext);
	}

	@Override
	public void updateEbMessageResources(
		org.oep.dossiermgt.model.EbMessage ebMessage,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_ebMessageLocalService.updateEbMessageResources(ebMessage,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void removeEbMessage(org.oep.dossiermgt.model.EbMessage ebMessage)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_ebMessageLocalService.removeEbMessage(ebMessage);
	}

	@Override
	public void removeEbMessage(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_ebMessageLocalService.removeEbMessage(id);
	}

	@Override
	public void addEbMessageResources(
		org.oep.dossiermgt.model.EbMessage ebMessage,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_ebMessageLocalService.addEbMessageResources(ebMessage,
			addGroupPermission, addGuestPermission, serviceContext);
	}

	@Override
	public void addEbMessageResources(
		org.oep.dossiermgt.model.EbMessage ebMessage,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_ebMessageLocalService.addEbMessageResources(ebMessage,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void addEbMessageResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_ebMessageLocalService.addEbMessageResources(id, groupPermissions,
			guestPermissions, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public EbMessageLocalService getWrappedEbMessageLocalService() {
		return _ebMessageLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedEbMessageLocalService(
		EbMessageLocalService ebMessageLocalService) {
		_ebMessageLocalService = ebMessageLocalService;
	}

	@Override
	public EbMessageLocalService getWrappedService() {
		return _ebMessageLocalService;
	}

	@Override
	public void setWrappedService(EbMessageLocalService ebMessageLocalService) {
		_ebMessageLocalService = ebMessageLocalService;
	}

	private EbMessageLocalService _ebMessageLocalService;
}