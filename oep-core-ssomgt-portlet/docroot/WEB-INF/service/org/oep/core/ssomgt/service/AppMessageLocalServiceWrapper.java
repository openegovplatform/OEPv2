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

package org.oep.core.ssomgt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AppMessageLocalService}.
 *
 * @author trungdk
 * @see AppMessageLocalService
 * @generated
 */
public class AppMessageLocalServiceWrapper implements AppMessageLocalService,
	ServiceWrapper<AppMessageLocalService> {
	public AppMessageLocalServiceWrapper(
		AppMessageLocalService appMessageLocalService) {
		_appMessageLocalService = appMessageLocalService;
	}

	/**
	* Adds the app message to the database. Also notifies the appropriate model listeners.
	*
	* @param appMessage the app message
	* @return the app message that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.ssomgt.model.AppMessage addAppMessage(
		org.oep.core.ssomgt.model.AppMessage appMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appMessageLocalService.addAppMessage(appMessage);
	}

	/**
	* Creates a new app message with the primary key. Does not add the app message to the database.
	*
	* @param appMessageId the primary key for the new app message
	* @return the new app message
	*/
	@Override
	public org.oep.core.ssomgt.model.AppMessage createAppMessage(
		long appMessageId) {
		return _appMessageLocalService.createAppMessage(appMessageId);
	}

	/**
	* Deletes the app message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param appMessageId the primary key of the app message
	* @return the app message that was removed
	* @throws PortalException if a app message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.ssomgt.model.AppMessage deleteAppMessage(
		long appMessageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _appMessageLocalService.deleteAppMessage(appMessageId);
	}

	/**
	* Deletes the app message from the database. Also notifies the appropriate model listeners.
	*
	* @param appMessage the app message
	* @return the app message that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.ssomgt.model.AppMessage deleteAppMessage(
		org.oep.core.ssomgt.model.AppMessage appMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appMessageLocalService.deleteAppMessage(appMessage);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _appMessageLocalService.dynamicQuery();
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
		return _appMessageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _appMessageLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _appMessageLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _appMessageLocalService.dynamicQueryCount(dynamicQuery);
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
		return _appMessageLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.core.ssomgt.model.AppMessage fetchAppMessage(
		long appMessageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appMessageLocalService.fetchAppMessage(appMessageId);
	}

	/**
	* Returns the app message with the primary key.
	*
	* @param appMessageId the primary key of the app message
	* @return the app message
	* @throws PortalException if a app message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.ssomgt.model.AppMessage getAppMessage(long appMessageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _appMessageLocalService.getAppMessage(appMessageId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _appMessageLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the app messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of app messages
	* @param end the upper bound of the range of app messages (not inclusive)
	* @return the range of app messages
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.ssomgt.model.AppMessage> getAppMessages(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appMessageLocalService.getAppMessages(start, end);
	}

	/**
	* Returns the number of app messages.
	*
	* @return the number of app messages
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getAppMessagesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appMessageLocalService.getAppMessagesCount();
	}

	/**
	* Updates the app message in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param appMessage the app message
	* @return the app message that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.ssomgt.model.AppMessage updateAppMessage(
		org.oep.core.ssomgt.model.AppMessage appMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appMessageLocalService.updateAppMessage(appMessage);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _appMessageLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_appMessageLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _appMessageLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* ThÃƒÂªm mÃ¡Â»â€ºi mÃ¡Â»â„¢t thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p gÃ¡Â»Â­i tÃ¡Â»â€ºi ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param fromApplication mÃƒÂ£ cÃ¡Â»Â§a Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param toUser ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng nhÃ¡ÂºÂ­n thÃƒÂ´ng bÃƒÂ¡o
	* @param messageType kiÃ¡Â»Æ’u thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param messageCode mÃƒÂ£ thÃƒÂ´ng bÃƒÂ¡o
	* @param messageText thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param messageValue giÃƒÂ¡ trÃ¡Â»â€¹ thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param messageUrl Ã„â€˜Ã¡Â»â€¹a chÃ¡Â»â€° URL gÃ¡Â»Â­i thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param visitDate ngÃƒÂ y ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng xem thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p chung
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p tÃ¡Â»â€ºi ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c thÃƒÂªm vÃƒÂ o
	*/
	@Override
	public org.oep.core.ssomgt.model.AppMessage addAppMessage(
		java.lang.String fromApplication, java.lang.String toUser,
		java.lang.String messageType, java.lang.String messageCode,
		java.lang.String messageText, java.lang.String messageValue,
		java.lang.String messageUrl, java.util.Date visitDate,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _appMessageLocalService.addAppMessage(fromApplication, toUser,
			messageType, messageCode, messageText, messageValue, messageUrl,
			visitDate, serviceContext);
	}

	/**
	* ThÃƒÂªm mÃ¡Â»â€ºi mÃ¡Â»â„¢t thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p gÃ¡Â»Â­i tÃ¡Â»â€ºi ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param fromApplication mÃƒÂ£ cÃ¡Â»Â§a Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param toUser ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng nhÃ¡ÂºÂ­n thÃƒÂ´ng bÃƒÂ¡o
	* @param messageType kiÃ¡Â»Æ’u thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param messageCode mÃƒÂ£ thÃƒÂ´ng bÃƒÂ¡o
	* @param messageText thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param messageValue giÃƒÂ¡ trÃ¡Â»â€¹ thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param messageUrl Ã„â€˜Ã¡Â»â€¹a chÃ¡Â»â€° URL gÃ¡Â»Â­i thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param visitDate ngÃƒÂ y ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng xem thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p chung
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p tÃ¡Â»â€ºi ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c thÃƒÂªm vÃƒÂ o
	*/
	@Override
	public org.oep.core.ssomgt.model.AppMessage addAppMessage(
		java.lang.String fromApplication, java.util.Date createDate,
		java.lang.String toUser, java.lang.String messageType,
		java.lang.String messageCode, java.lang.String messageText,
		java.lang.String messageValue, java.lang.String messageUrl,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _appMessageLocalService.addAppMessage(fromApplication,
			createDate, toUser, messageType, messageCode, messageText,
			messageValue, messageUrl, serviceContext);
	}

	/**
	* ThÃƒÂªm mÃ¡Â»â€ºi mÃ¡Â»â„¢t thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p gÃ¡Â»Â­i tÃ¡Â»â€ºi ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param fromApplication mÃƒÂ£ cÃ¡Â»Â§a Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param toUser ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng nhÃ¡ÂºÂ­n thÃƒÂ´ng bÃƒÂ¡o
	* @param messageType kiÃ¡Â»Æ’u thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param messageCode mÃƒÂ£ thÃƒÂ´ng bÃƒÂ¡o
	* @param messageText thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param messageValue giÃƒÂ¡ trÃ¡Â»â€¹ thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param messageUrl Ã„â€˜Ã¡Â»â€¹a chÃ¡Â»â€° URL gÃ¡Â»Â­i thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param visitDate ngÃƒÂ y ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng xem thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p chung
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p tÃ¡Â»â€ºi ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c thÃƒÂªm vÃƒÂ o
	*/
	@Override
	public org.oep.core.ssomgt.model.AppMessage addAppMessage(long userId,
		java.lang.String fromApplication, java.util.Date createDate,
		java.lang.String toUser, java.lang.String messageType,
		java.lang.String messageCode, java.lang.String messageText,
		java.lang.String messageValue, java.lang.String messageUrl)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _appMessageLocalService.addAppMessage(userId, fromApplication,
			createDate, toUser, messageType, messageCode, messageText,
			messageValue, messageUrl);
	}

	/**
	* CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin mÃ¡Â»â„¢t thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p gÃ¡Â»Â­i tÃ¡Â»â€ºi ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param id mÃƒÂ£ phÃƒÂ¢n biÃ¡Â»â€¡t cÃ¡Â»Â§a thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param fromApplication mÃƒÂ£ cÃ¡Â»Â§a Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param toUser ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng nhÃ¡ÂºÂ­n thÃƒÂ´ng bÃƒÂ¡o
	* @param messageType kiÃ¡Â»Æ’u thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param messageCode mÃƒÂ£ thÃƒÂ´ng bÃƒÂ¡o
	* @param messageText thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param messageValue giÃƒÂ¡ trÃ¡Â»â€¹ thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param messageUrl Ã„â€˜Ã¡Â»â€¹a chÃ¡Â»â€° URL gÃ¡Â»Â­i thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param visitDate ngÃƒÂ y ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng xem thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p chung
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t
	*/
	@Override
	public org.oep.core.ssomgt.model.AppMessage updateAppMessage(long id,
		java.lang.String fromApplication, java.lang.String toUser,
		java.lang.String messageType, java.lang.String messageCode,
		java.lang.String messageText, java.lang.String messageValue,
		java.lang.String messageUrl, java.util.Date visitDate,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _appMessageLocalService.updateAppMessage(id, fromApplication,
			toUser, messageType, messageCode, messageText, messageValue,
			messageUrl, visitDate, serviceContext);
	}

	/**
	* CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin mÃ¡Â»â„¢t thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p gÃ¡Â»Â­i tÃ¡Â»â€ºi ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param appMessage thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p cÃ¡ÂºÂ§n cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin
	*/
	@Override
	public org.oep.core.ssomgt.model.AppMessage updateAppMessage(
		org.oep.core.ssomgt.model.AppMessage appMessage,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _appMessageLocalService.updateAppMessage(appMessage,
			serviceContext);
	}

	/**
	* XÃƒÂ³a bÃ¡Â»ï¿½ thÃƒÂ´ng tin mÃ¡Â»â„¢t thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p gÃ¡Â»Â­i tÃ¡Â»â€ºi ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param appMessage thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p sÃ¡ÂºÂ½ bÃ¡Â»â€¹ xÃƒÂ³a
	* @return
	*/
	@Override
	public void removeAppMessage(
		org.oep.core.ssomgt.model.AppMessage appMessage)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_appMessageLocalService.removeAppMessage(appMessage);
	}

	/**
	* XÃƒÂ³a bÃ¡Â»ï¿½ thÃƒÂ´ng tin mÃ¡Â»â„¢t thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p gÃ¡Â»Â­i tÃ¡Â»â€ºi ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param id mÃƒÂ£ phÃƒÂ¢n biÃ¡Â»â€¡t thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @return
	*/
	@Override
	public void removeAppMessage(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_appMessageLocalService.removeAppMessage(id);
	}

	@Override
	public int countByCustomCondition(java.lang.String fromApplication,
		java.lang.String toUser, java.util.Date fromDate,
		java.util.Date toDate, java.lang.String messageType,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appMessageLocalService.countByCustomCondition(fromApplication,
			toUser, fromDate, toDate, messageType, serviceContext);
	}

	@Override
	public java.util.List<org.oep.core.ssomgt.model.AppMessage> findByCustomCondition(
		java.lang.String fromApplication, java.lang.String toUser,
		java.util.Date fromDate, java.util.Date toDate,
		java.lang.String messageType, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appMessageLocalService.findByCustomCondition(fromApplication,
			toUser, fromDate, toDate, messageType, startIndex, endIndex,
			serviceContext);
	}

	@Override
	public java.util.List<org.oep.core.ssomgt.model.AppMessage> findByFromApplicationToUser(
		java.lang.String fromApplication, java.lang.String toUser)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appMessageLocalService.findByFromApplicationToUser(fromApplication,
			toUser);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AppMessageLocalService getWrappedAppMessageLocalService() {
		return _appMessageLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAppMessageLocalService(
		AppMessageLocalService appMessageLocalService) {
		_appMessageLocalService = appMessageLocalService;
	}

	@Override
	public AppMessageLocalService getWrappedService() {
		return _appMessageLocalService;
	}

	@Override
	public void setWrappedService(AppMessageLocalService appMessageLocalService) {
		_appMessageLocalService = appMessageLocalService;
	}

	private AppMessageLocalService _appMessageLocalService;
}